package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZR {
    public static String zzF(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        return zzQ(zzzox, zzzox.zzXc());
    }

    public static String zzG(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        return zzR(zzzox, zzzox.zzXc() * 2);
    }

    public static String zzH(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        return zzR(zzzox, zzzox.zzXc());
    }

    public static String zzP(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        return zzW(zzzox, zzzox.zzXa(), i);
    }

    private static String zzQ(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        if (i == 0) {
            return "";
        }
        return zzZZ7.zzWB(false).zzR(zzzox.zzn(i), 0, i - 1);
    }

    public static String zzR(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        if (i == 0) {
            return "";
        }
        return zzZZ7.zzWB(true).zzR(zzzox.zzn(i), 0, i - 2);
    }

    public static String zzS(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        int position = (int) zzzox.zzq().getPosition();
        String strZzZn = zzZZ7.zzWB(true).zzZn(zzzox.zzn(Math.min((zzzox.zzX9() & 65535) * 2, i - 2)));
        zzzox.zzq().zzH(position + i);
        return strZzZn;
    }

    public static String zzW(com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
        byte[] bArrZzn = zzzox.zzn(i - 1);
        zzzox.readByte();
        return com.aspose.words.internal.zzZO0.zzQz(i2).zzZn(bArrZzn);
    }

    public static String zzX(com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
        if (i == 0) {
            return "";
        }
        return com.aspose.words.internal.zzZO0.zzQz(i2).zzR(zzzox.zzn(i), 0, i - 1);
    }

    public static String zzZ(com.aspose.words.internal.zzZOX zzzox, boolean z, boolean z2) throws Exception {
        if (!z) {
            String strZzZn = zzZZ7.zzWB(z).zzZn(zzzox.zzn(zzzox.readByte() & 255));
            if (z2) {
                zzzox.readByte();
            }
            return strZzZn;
        }
        int iZzX9 = (zzzox.zzX9() & 65535) * 2;
        if (!com.aspose.words.internal.zzZYQ.zzT(zzzox, iZzX9)) {
            iZzX9 = 0;
        }
        String strZzZn2 = zzZZ7.zzWB(z).zzZn(zzzox.zzn(iZzX9));
        if (z2) {
            zzzox.zzX9();
        }
        return strZzZn2;
    }

    public static char[] zzZ(com.aspose.words.internal.zzZOX zzzox, boolean z, int i) throws Exception {
        if (z) {
            i *= 2;
        }
        return zzZZ7.zzWB(z).zzYO(zzzox.zzn(i));
    }
}
