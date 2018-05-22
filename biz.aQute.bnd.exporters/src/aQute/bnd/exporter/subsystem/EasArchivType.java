package aQute.bnd.exporter.subsystem;

public enum EasArchivType {
	NONE,
	CONTENT,
	ALL;

	public static EasArchivType byParameter(String archiveContent) {

		if (archiveContent == null) {
			return CONTENT;/// default
		}
		return valueOf(archiveContent.toUpperCase());
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 612e7fb370c93b3c72db8593ecdf086a8e5753a1
