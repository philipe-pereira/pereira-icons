package br.com.pereiraeng.icons;

import java.net.URL;

import javax.swing.ImageIcon;

public class Icons {

	public static final String UTILS_ICON_PATH = "images/";

	/**
	 * Função que, a partir de um vetor de nomes de arquivos, retorna o vetor dos
	 * respectivos ícones
	 * 
	 * @param files vetor com o nome dos arquivos
	 * @return vetor dos ícones correspondentes
	 */
	public static ImageIcon[] getIcons(String folder, String[] files) {
		ImageIcon[] icons = new ImageIcon[files.length];
		for (int i = 0; i < files.length; i++)
			icons[i] = loadIcon((folder + "/" + files[i]));
		return icons;
	}

	/**
	 * Função que carrega uma {@link ImageIcon imagem} de um dos ícones desta
	 * biblioteca
	 * 
	 * @param img nome do arquivo
	 * @return imagem, tipicamente utilizada para decorar componentes
	 */
	public static ImageIcon loadUtilsIcon(String img) {
		if (img == null)
			return null;
		return loadIcon(UTILS_ICON_PATH + img);
	}

	/**
	 * Função que carrega uma {@link ImageIcon imagem} a partir do seu caminho
	 * 
	 * @param img endereço da imagem (sendo ela um recurso ou um arquivo no disco)
	 * @return imagem, tipicamente utilizada para decorar componentes
	 */
	public static ImageIcon loadIcon(String img) {
		if (img == null)
			return null;
		URL url = ClassLoader.getSystemResource(img);
		if (url == null)
			url = Thread.currentThread().getContextClassLoader().getResource(img);
		if (url != null)
			return new ImageIcon(url);
		else {
			System.err.println("Imagem " + img + " não encontrada");
			return null;
		}
	}
}