package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class SourceType {
    public static final int ART = 8;
    public static final int ARTICLE_IN_A_PERIODICAL = 0;
    public static final int BOOK = 1;
    public static final int BOOK_SECTION = 2;
    public static final int CASE = 15;
    public static final int CONFERENCE_PROCEEDINGS = 4;
    public static final int DOCUMENT_FROM_INTERNET_SITE = 9;
    public static final int ELECTRONIC = 14;
    public static final int FILM = 11;
    public static final int INTERNET_SITE = 10;
    public static final int INTERVIEW = 12;
    public static final int JOURNAL_ARTICLE = 3;
    public static final int MISC = 16;
    public static final int PATENT = 13;
    public static final int PERFORMANCE = 7;
    public static final int REPORT = 5;
    public static final int SOUND_RECORDING = 6;
    public static final int length = 17;

    private SourceType() {
    }

    public static int fromName(String str) {
        if ("ARTICLE_IN_A_PERIODICAL".equals(str)) {
            return 0;
        }
        if ("BOOK".equals(str)) {
            return 1;
        }
        if ("BOOK_SECTION".equals(str)) {
            return 2;
        }
        if ("JOURNAL_ARTICLE".equals(str)) {
            return 3;
        }
        if ("CONFERENCE_PROCEEDINGS".equals(str)) {
            return 4;
        }
        if ("REPORT".equals(str)) {
            return 5;
        }
        if ("SOUND_RECORDING".equals(str)) {
            return 6;
        }
        if ("PERFORMANCE".equals(str)) {
            return 7;
        }
        if ("ART".equals(str)) {
            return 8;
        }
        if ("DOCUMENT_FROM_INTERNET_SITE".equals(str)) {
            return 9;
        }
        if ("INTERNET_SITE".equals(str)) {
            return 10;
        }
        if ("FILM".equals(str)) {
            return 11;
        }
        if ("INTERVIEW".equals(str)) {
            return 12;
        }
        if ("PATENT".equals(str)) {
            return 13;
        }
        if ("ELECTRONIC".equals(str)) {
            return 14;
        }
        if ("CASE".equals(str)) {
            return 15;
        }
        if ("MISC".equals(str)) {
            return 16;
        }
        throw new IllegalArgumentException("Unknown SourceType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "ARTICLE_IN_A_PERIODICAL";
            case 1:
                return "BOOK";
            case 2:
                return "BOOK_SECTION";
            case 3:
                return "JOURNAL_ARTICLE";
            case 4:
                return "CONFERENCE_PROCEEDINGS";
            case 5:
                return "REPORT";
            case 6:
                return "SOUND_RECORDING";
            case 7:
                return "PERFORMANCE";
            case 8:
                return "ART";
            case 9:
                return "DOCUMENT_FROM_INTERNET_SITE";
            case 10:
                return "INTERNET_SITE";
            case 11:
                return "FILM";
            case 12:
                return "INTERVIEW";
            case 13:
                return "PATENT";
            case 14:
                return "ELECTRONIC";
            case 15:
                return "CASE";
            case 16:
                return "MISC";
            default:
                return "Unknown SourceType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "ArticleInAPeriodical";
            case 1:
                return "Book";
            case 2:
                return "BookSection";
            case 3:
                return "JournalArticle";
            case 4:
                return "ConferenceProceedings";
            case 5:
                return "Report";
            case 6:
                return "SoundRecording";
            case 7:
                return "Performance";
            case 8:
                return "Art";
            case 9:
                return "DocumentFromInternetSite";
            case 10:
                return "InternetSite";
            case 11:
                return "Film";
            case 12:
                return "Interview";
            case 13:
                return "Patent";
            case 14:
                return "Electronic";
            case 15:
                return "Case";
            case 16:
                return "Misc";
            default:
                return "Unknown SourceType value.";
        }
    }
}
