package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
public final class MailMergeMainDocumentType {
    public static final int CATALOG = 8;
    public static final int DEFAULT = 0;
    public static final int EMAIL = 16;
    public static final int ENVELOPES = 4;
    public static final int FAX = 32;
    public static final int FORM_LETTERS = 1;
    public static final int MAILING_LABELS = 2;
    public static final int NOT_A_MERGE_DOCUMENT = 0;
    public static final int length = 8;

    private MailMergeMainDocumentType() {
    }

    public static int fromName(String str) {
        if ("NOT_A_MERGE_DOCUMENT".equals(str)) {
            return 0;
        }
        if ("FORM_LETTERS".equals(str)) {
            return 1;
        }
        if ("MAILING_LABELS".equals(str)) {
            return 2;
        }
        if ("ENVELOPES".equals(str)) {
            return 4;
        }
        if ("CATALOG".equals(str)) {
            return 8;
        }
        if (CommonConstant.RETKEY.EMAIL.equals(str)) {
            return 16;
        }
        if ("FAX".equals(str)) {
            return 32;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown MailMergeMainDocumentType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? "Unknown MailMergeMainDocumentType value." : "FAX" : CommonConstant.RETKEY.EMAIL : "CATALOG" : "ENVELOPES" : "MAILING_LABELS" : "FORM_LETTERS" : "NOT_A_MERGE_DOCUMENT | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 4, 8, 16, 32, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? "Unknown MailMergeMainDocumentType value." : "Fax" : "Email" : "Catalog" : "Envelopes" : "MailingLabels" : "FormLetters" : "NotAMergeDocument | Default";
    }
}
