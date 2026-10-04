package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKO {
    private static byte[] zzYtE = {-48, -55, -22, 121, -7, -70, -50, 17, -116, -126, 0, -86, 0, 75, -87, 11};

    public static boolean zzAd(int i) {
        return i == 3 || i == 37 || i == 72 || i == 88;
    }

    public static void zzZ(com.aspose.words.internal.zzZOW zzzow, Field field) throws Exception {
        String bookmarkName;
        String target;
        field.getType();
        zzc(field);
        int type = field.getType();
        String address = null;
        if (type == 3) {
            bookmarkName = ((FieldRef) field).getBookmarkName();
        } else if (type == 37) {
            bookmarkName = ((FieldPageRef) field).getBookmarkName();
        } else {
            if (type != 72) {
                if (type != 88) {
                    address = "";
                    bookmarkName = "";
                    target = bookmarkName;
                } else {
                    FieldHyperlink fieldHyperlink = (FieldHyperlink) field;
                    address = fieldHyperlink.getAddress();
                    String subAddress = fieldHyperlink.getSubAddress();
                    target = fieldHyperlink.getTarget();
                    bookmarkName = subAddress;
                }
                zzzow.writeByte((byte) 8);
                zzzow.writeBytes(zzYtE);
                new zzZDF(address, bookmarkName, target).zzZ(zzzow);
            }
            bookmarkName = ((FieldNoteRef) field).getBookmarkName();
        }
        target = null;
        zzzow.writeByte((byte) 8);
        zzzow.writeBytes(zzYtE);
        new zzZDF(address, bookmarkName, target).zzZ(zzzow);
    }

    public static boolean zzc(Field field) {
        if (field == null) {
            return false;
        }
        int type = field.getType();
        return type != 3 ? type != 37 ? type != 72 ? type == 88 : ((FieldNoteRef) field).getInsertHyperlink() : ((FieldPageRef) field).getInsertHyperlink() : ((FieldRef) field).getInsertHyperlink();
    }
}
