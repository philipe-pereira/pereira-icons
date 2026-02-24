package br.com.pereiraeng.icons;

import java.awt.Dimension;
import java.io.File;
import java.net.URL;

import javax.swing.ImageIcon;

public class Icons {

	public static final Dimension DIM_BUTTON_ICON = new Dimension(34, 34);

	public static final Dimension DIM_BUTTON_SMALL_ICON = new Dimension(27, 27);

	public static final Dimension DIM_BUTTON_VERT_SMALL_ICON = new Dimension(20, 20);

	/**
	 * Função que carrega uma {@link ImageIcon imagem} a partir do seu caminho
	 * 
	 * @param path endereço da imagem (sendo ela um recurso ou um arquivo no disco)
	 * @return imagem pronta para ser utilizada por componentes Swing
	 */
	public static ImageIcon loadIcon(String path) {
		if (path == null)
			return null;
		URL url = ClassLoader.getSystemResource(path);
		if (url == null)
			url = Thread.currentThread().getContextClassLoader().getResource(path);
		if (url != null)
			return new ImageIcon(url);
		else {
			System.err.println("Imagem " + path + " não encontrada");
			return null;
		}
	}

	/**
	 * Função que, a partir de um vetor de nomes de arquivos, retorna o vetor dos
	 * respectivos ícones
	 * 
	 * @param folder diretório com os arquivos de imagens
	 * @param files  vetor com o nome dos arquivos
	 * @return vetor dos ícones correspondentes
	 */
	public static ImageIcon[] getIcons(String folder, String[] files) {
		ImageIcon[] icons = new ImageIcon[files.length];
		for (int i = 0; i < files.length; i++)
			icons[i] = loadIcon(folder + "/" + files[i]);
		return icons;
	}

	private static final String COLLECTION_SEPARATOR = ":";

	/**
	 * Função que carrega uma {@link ImageIcon imagem} a partir do seu caminho ou do
	 * seu nome em sua coleção
	 * 
	 * @param iconPath caminho para o arquivo ou o seu nome em sua coleção
	 * @return imagem pronta para ser utilizada por componentes Swing
	 */
	public static ImageIcon getIcon(String iconPath) {
		ImageIcon imageIcon = null;
		if (iconPath != null) {
			if (iconPath.contains(COLLECTION_SEPARATOR)) {
				String[] parts = iconPath.split(COLLECTION_SEPARATOR, 2);
				IconFactory iconFactory = getIconFactory(parts[0], parts[1]);
				if (iconFactory != null)
					imageIcon = iconFactory.create();
			} else {
				imageIcon = Icons.loadIcon(iconPath);
				if (imageIcon == null) {
					File file = new File(iconPath);
					if (file.exists())
						imageIcon = new ImageIcon(file.getAbsolutePath());
				}
			}
		}
		return imageIcon;
	}

	@SuppressWarnings("unchecked")
	private static IconFactory getIconFactory(String collection, String iconName) {

		Class<?> clazz = null;
		try {
			clazz = Class.forName(collection);
		} catch (ClassNotFoundException e) {
			System.err.println("Icon collection " + collection + " doesn't exist.");
		}
		if (clazz == null)
			return null;

		if (!clazz.isEnum()) {
			System.err.println(collection + " is not a valid collection. It must be a enumeration.");
			return null;
		}
		@SuppressWarnings("rawtypes")
		Class<? extends Enum> enumClass = (Class<? extends Enum>) clazz;

		Object enumValue = null;
		try {
			enumValue = Enum.valueOf(enumClass, iconName);
		} catch (IllegalArgumentException e) {
			System.err.println("Icon " + iconName + " doesn't exist in collection " + collection + ".");
		}
		if (enumValue == null)
			return null;

		if (enumValue instanceof IconFactory)
			return (IconFactory) enumValue;
		else {
			System.err.println(collection + " is not a valid collection. It must implements IconFactory.");
			return null;
		}
	}
}