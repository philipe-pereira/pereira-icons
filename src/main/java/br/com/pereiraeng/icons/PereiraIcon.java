package br.com.pereiraeng.icons;

import javax.swing.ImageIcon;

public enum PereiraIcon implements IconFactory {

	ABOUT("About24.gif"), ADD("Add.gif"), ADD2("add.png"), EXPORT("Export24.gif"), IMPORT("Import24.gif"),
	NEW("New.gif"), SAVE("Save.gif"), SAVE_AS("SaveAs.gif"), REFRESH("Refresh.gif"), ZOOM("Zoom24.gif"),
	ZOOM_IN("ZoomIn24.gif"), ZOOM_OUT("ZoomOut24.gif"), RETURN("Return.gif"), COPY("Copy.gif"), DELETE("Delete.gif"),
	EDIT("Edit.gif"), OPEN("Open.gif"), CHART("chart24.png"), PREVIOUS("Previous.gif"), PREVIEW("preview.png"),
	TREE("tree.png"), MAP("map.png"), HISTORY("History24.gif"), ALIGN_LEFT2("AlignLeft.png"),
	VARIATION("variation.png"), AXIS("axis24.png"), AXIS2("axis.png"), ORDERED_LIST("ol.png"), UNORDERED_LIST("ul.png"),
	NEXT("Next.gif"), UP("Up.gif"), DOWN("Down.gif"), RED_STOP("stop.gif"), FIND("Find.gif"),
	FIND_AGAIN("FindAgain24.gif"), CLEAR("clear.png"), CUT("Cut.gif"), HELP("Help24.gif"), SETTINGS("settings.png"),
	TAB("tab.png"), WARNING("warning.png"), PREFERENCES("Preferences.gif"), POWER("power.png"), PDF("pdf24.png"),
	SELECT("select.png"), EXCEL("excel.png"), EXCEL2("excel2.png"), REPAIR("repair.png"), EQUATION("equation.png"), WATCHDOG("watchdog.png"),
	FILTER("filter2.png"), FILTER_SELECT("filterSelect.png"), FILTER_EDIT("filterEdit.png"),
	FILTER_REFRESH("filterRefresh.png"), STATS("stats.png"), CLOSE("close.png"), OK("OK.gif"), CANCEL("Cancel.gif"),
	PASTE("Paste.gif"), EXPAND("expand.png"), ALIGN_TOP("AlignTop24.gif"), ALIGN_BOTTOM("AlignBottom24.gif"),
	ALIGN_LEFT("AlignLeft24.gif"), ALIGN_RIGHT("AlignRight24.gif"), ALIGN_NE("AlignNE.gif"), ALIGN_NW("AlignNW.gif"),
	ALIGN_SE("AlignSE.gif"), ALIGN_SW("AlignSW.gif"), COLUMN_INSERT_BEFORE("ColumnInsertBefore24.gif"),
	COLUMN_INSERT_AFTER("ColumnInsertAfter24.gif"), COLUMN_DELETE("ColumnDelete24.gif"),
	ROW_INSERT_BEFORE("RowInsertBefore24.gif"), ROW_INSERT_AFTER("RowInsertAfter24.gif"), ROW_DELETE("RowDelete24.gif"),
	REWIND("Rewind24.gif"), STEP_BACK("StepBack24.gif"), STOP("Stop24.gif"), PAUSE("Pause24.gif"), PLAY("Play24.gif"),
	STEP_FORWARD("StepForward24.gif"), FAST_FORWARD("FastForward24.gif"), COMMUNICATION("conn48.png"),
	PENCIL("pencil.png"), PEN("pen.png"), MERGE("merge.png"), FILE_TREE("file-tree.png"),
	PROPERTIES("Properties24.gif"), LINK("link.png"), TAG("tag.png"), KINDLE("kindle.png"), BIBTEX("bibtex.png"),
	SQUARE("square.png"), DESCRIPTION_LIST("dl.png"), DISC("disc.png"), CIRCLE("circle.png"), COLOR("Color.gif"),
	STROKE("stroke.png"), FONT("Font.gif"), INVERT("inv.gif"), TEL("tel_geral.png"), HOME("tel_home.png"),
	EMAIL("email.png"), CELL("tel_cell.png"), WORK("tel_work.png"), FAX("tel_fax.png"), HIGHLIGHT("highlight.png"),
	DIAPASON("diap.gif"), ALIGN_CENTER("AlignCenter.gif"), ALIGN_CENTER2("AlignCenter24.gif"),
	ALIGN_JUSTIFY("AlignJustify.gif"), ALIGN_JUSTIFY_HORIZONTAL("AlignJustifyHorizontal24.gif"),
	ALIGN_JUSTIFY_VERTICAL("AlignJustifyVertical24.gif"), ALIGN_RIGHT2("AlignRight.png"), BOLD("Bold.gif"),
	BOOKMARKS("Bookmarks24.gif"), BRUSH("brush.png"), COMPOSE_MAIL("ComposeMail24.gif"), CONFIG("config.png"),
	CONTEXTUAL_HELP("ContextualHelp24.gif"), CSS("css.png"), DBM("dbm.png"), DBT("dbt.png"), DIAC("diac.png"),
	ELLIPSE("ellipse.png"), FORMAT("format.png"), GAUSS("gauss.png"), GRADIENT("gradient.png"), GROUP("group.png"),
	HOME2("Home24.gif"), IMG("img.png"), INFORMATION("Information24.gif"), ITALIC("Italic.gif"), LINE("line.png"),
	LIST("list.png"), MOVIE("Movie24.gif"), NEW_FOLDER("newFolder.png"), NEWSPAPER("newspaper.png"),
	NORMAL("Normal24.gif"), PAGE_SETUP("PageSetup24.gif"), PATH("path.png"), PERM_EDIT("permEdit.png"),
	POLYGON("polygon.png"), POLYLINE("polyline.png"), POWER_PLANT("power-plant.png"), PRINT("Print.gif"),
	PRINT_PREVIEW("PrintPreview24.gif"), READTABLE("readTable.png"), REDO("Redo24.gif"), REMOVE("Remove.gif"),
	REPLACE("Replace24.gif"), ROTATE("rotate.png"), ROUND_RECT("roundRect.png"), SAVE_ALL("SaveAll24.gif"),
	SCALE("scale.png"), SEARCH("Search24.gif"), SEND_MAIL("SendMail24.gif"), SKEWX("skewX.png"), SKEWY("skewY.png"),
	SQL("sql.png"), SUB("sub.png"), SUP("sup.png"), SYMBOL("symbol.png"), TEXT("text.png"),
	TIP_OF_THE_DAY("TipOfTheDay24.gif"), TRANSLATE("translate.png"), UNDERLINE("Underline.gif"), UNDO("Undo24.gif"),
	VOLUME24("Volume24.gif"), WIFI_SYMBOL("wifi-symbol.png"), CONN("conn.png"), FS("fs.jpg"), IMPORT2("import.png"),
	MPC("mpc.png"), SERVER("server.png"), ATTACH("attach.png"), CAPS("caps.png"), DEL("del.png"), LOWER("lower.png"),
	NOREPEAT("norepeat.png"), OVER("over.png"), REPEAT("repeat.png"), REPEATX("repeatx.png"), REPEATY("repeaty.png"),
	UNDER("under.png"), UPPER("upper.png"), VERTBOTTOM("vertBottom.png"), VERTCENTER("vertCenter.png"),
	VERTTOP("vertTop.png"), ENEMY("enemy.png");

	private static final String PEREIRA_ICON_PATH = "images/";

	private String filename;

	private PereiraIcon(String filename) {
		this.filename = filename;
	}

	public String getFileName() {
		return filename;
	}

	@Override
	public ImageIcon create() {
		return Icons.loadIcon(PEREIRA_ICON_PATH + this.getFileName());
	}

	public String getPath() {
		return getClass().getCanonicalName() + ":" + toString();
	}
}
