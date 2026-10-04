package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZH {
    public static zzZP6 zzR(Field field, String str) throws Exception {
        if (field.getType() != 41 && field.getType() != 42) {
            field.getType();
        }
        zzTL zztlZzz = field.zzZgo().zzZav().zzz(field);
        if (zztlZzz == null) {
            return zzS(field, str);
        }
        if (zztlZzz.isError()) {
            return new zzZP2(field, zztlZzz.zz8W());
        }
        zzZ(field, null, true);
        return null;
    }

    public static zzZP6 zzS(Field field, String str) {
        MailMerge mailMerge = field.getStart().zzYBb().getMailMerge();
        if (mailMerge.zzYKg()) {
            return new zzZP5(field, str);
        }
        zzZ(field, mailMerge, true);
        return null;
    }

    public static void zzY(Field field, MailMerge mailMerge) {
        zzZ(field, mailMerge, false);
    }

    public static void zzZ(Field field, MailMerge mailMerge) {
        zzZ(field, mailMerge, true);
    }

    private static void zzZ(Field field, MailMerge mailMerge, boolean z) {
        if (mailMerge == null) {
            mailMerge = field.getStart().zzYBb().getMailMerge();
        }
        int i = !com.aspose.words.internal.zzZKN.zzX(field.zzZgq().zzZfB(), "MERGEBARCODE", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) ? 1 : 0;
        if (z) {
            i |= 2;
        }
        if (mailMerge.zzYK9()) {
            i |= 4;
        }
        if (mailMerge.zzYKc()) {
            i = mailMerge.getCleanupParagraphsWithPunctuationMarks() ? i | 24 : i | 8;
        }
        field.zzZgn().zzCV(i);
    }
}
