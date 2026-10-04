package com.aspose.words;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2L {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYJ zzY5D;

    static {
        com.aspose.words.internal.zzZYJ zzzyj = new com.aspose.words.internal.zzZYJ();
        zzY5D = zzzyj;
        zzzyj.zzH("Unique Identifier", 0);
        zzY5D.zzH("Courtesy Title", 1);
        zzY5D.zzH("First Name", 2);
        zzY5D.zzH("Middle Name", 3);
        zzY5D.zzH("Last Name", 4);
        zzY5D.zzH("Suffix", 5);
        zzY5D.zzH("Nickname", 6);
        zzY5D.zzH("Job Title", 7);
        zzY5D.zzH("Company", 8);
        zzY5D.zzH("Address 1", 9);
        zzY5D.zzH("Address 2", 10);
        zzY5D.zzH("City", 11);
        zzY5D.zzH("State", 12);
        zzY5D.zzH("Postal Code", 13);
        zzY5D.zzH("Country or Region", 14);
        zzY5D.zzH("Business Phone", 15);
        zzY5D.zzH("Business Fax", 16);
        zzY5D.zzH("Home Phone", 17);
        zzY5D.zzH("Home Fax", 18);
        zzY5D.zzH("E-mail Address", 19);
        zzY5D.zzH("Web Page", 20);
        zzY5D.zzH("Spouse Courtesy Title", 21);
        zzY5D.zzH("Spouse First Name", 22);
        zzY5D.zzH("Spouse Middle Name", 23);
        zzY5D.zzH("Spouse Last Name", 24);
        zzY5D.zzH("Spouse Nickname", 25);
        zzY5D.zzH("Phonetic Guide for First Name", 26);
        zzY5D.zzH("Phonetic Guide for Last Name", 27);
        zzY5D.zzH("Address 3", 28);
        zzY5D.zzH("Department", 29);
        zzUR = new com.aspose.words.internal.zzZHW("catalog", "email", "envelopes", "fax", "formLetters", "form-letters", "mailingLabels", "mailing-labels", "newDocument", "new-document", "printer", "database", "Access", "native", "ODSO", "odbc", "ODBC", "query", "QT", "spreadsheet", "Excel", "textFile", "file", "addressBook", "document1", "document2", "legacy", "master", "text", "dbColumn", "db-column", CloudMetaExtra.DEFINE_NON_PARENT_ID, "address-block", "salutation", "mapped", OptionalModuleUtils.BARCODE);
    }

    public static int zzIH(String str) {
        return zzY5D.zzG(str, -1);
    }

    public static int zzII(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 29 || iZzTP == 30) ? 0 : 1;
    }

    public static int zzIJ(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 1) {
            return 6;
        }
        if (iZzTP == 11) {
            return 1;
        }
        if (iZzTP == 13) {
            return 5;
        }
        switch (iZzTP) {
            case 23:
                return 2;
            case 24:
                return 3;
            case 25:
                return 4;
            case 26:
                return 8;
            case 27:
                return 9;
            case 28:
                return 0;
            default:
                int iZzZo = com.aspose.words.internal.zzJB.zzZo(str);
                if (iZzZo != Integer.MIN_VALUE) {
                    return iZzZo;
                }
                return 7;
        }
    }

    public static int zzIK(String str) {
        switch (zzUR.zzTP(str)) {
            case 11:
            case 12:
                return 1;
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 4;
            case 17:
            case 18:
                return 3;
            case 19:
            case 20:
                return 2;
            case 21:
            case 22:
                return 0;
            default:
                return -1;
        }
    }

    public static int zzIL(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 1) {
            return 2;
        }
        if (iZzTP != 3) {
            return iZzTP != 10 ? 0 : 1;
        }
        return 4;
    }

    public static int zzIM(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return 8;
        }
        if (iZzTP == 1) {
            return 16;
        }
        if (iZzTP == 2) {
            return 4;
        }
        if (iZzTP != 3) {
            return (iZzTP == 6 || iZzTP == 7) ? 2 : 1;
        }
        return 32;
    }

    public static String zzZO(int i, boolean z) {
        return i == 1 ? "" : i != 0 ? i != 1 ? "" : CloudMetaExtra.DEFINE_NON_PARENT_ID : z ? "dbColumn" : "db-column";
    }

    public static String zzZP(int i, boolean z) {
        if (i == 7) {
            return "";
        }
        if (!z) {
            return Integer.toString(i);
        }
        switch (i) {
        }
        return "";
    }

    public static String zzZQ(int i, boolean z) {
        if (i == 0) {
            return z ? "textFile" : "file";
        }
        if (i == 1) {
            return z ? "database" : "Access";
        }
        if (i == 2) {
            return z ? "spreadsheet" : "Excel";
        }
        if (i == 3) {
            return z ? "query" : "QT";
        }
        if (i == 4) {
            return z ? "odbc" : "ODBC";
        }
        if (i == 5) {
            return z ? "native" : "ODSO";
        }
        throw new IllegalStateException("Unknown mail merge data source type.");
    }

    public static String zzZR(int i, boolean z) {
        return i == 0 ? "" : i != 0 ? i != 1 ? i != 2 ? i != 4 ? "" : "fax" : "email" : "printer" : z ? "newDocument" : "new-document";
    }

    public static String zzZS(int i, boolean z) {
        if (i == 1) {
            return z ? "formLetters" : "form-letters";
        }
        if (i == 2) {
            return z ? "mailingLabels" : "mailing-labels";
        }
        if (i == 4) {
            return "envelopes";
        }
        if (i == 8) {
            return "catalog";
        }
        if (i == 16) {
            return "email";
        }
        if (i == 32) {
            return "fax";
        }
        throw new IllegalStateException("Unknown mail merge main document type.");
    }

    public static String zzvj(int i) {
        return zzY5D.zzO(i, "");
    }
}
