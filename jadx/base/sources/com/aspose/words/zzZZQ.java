package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZQ {
    public static void zzX(String str, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(zzZZ7.zzOe(str));
        zzZ(str, zzzow);
    }

    public static void zzY(String str, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(zzZZ7.zzOd(str));
        zzZ(str, zzzow);
    }

    public static int zzZ(String str, int i, com.aspose.words.internal.zzZOW zzzow, boolean z, boolean z2) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        if (str == null) {
            str = "";
        }
        if (str.length() > i) {
            str = str.substring(0, i);
        }
        if (z) {
            zzzow.zzJ((short) str.length());
            zzzow.writeBytes(zzZZ7.zzWB(true).getBytes(str));
            if (z2) {
                zzzow.zzJ((short) 0);
            }
        } else {
            int iMin = ((byte) Math.min(str.length(), 255)) & 255;
            zzzow.writeByte((byte) iMin);
            zzzow.zzV(zzZZ7.zzWB(false).getBytes(str), 0, iMin);
            if (z2) {
                zzzow.writeByte((byte) 0);
            }
        }
        return ((int) zzzow.zzq().getPosition()) - position;
    }

    public static void zzZ(String str, com.aspose.words.internal.zzZOW zzzow, int i) throws Exception {
        int iMin = Math.min(str.length(), (i / 2) - 1);
        zzzow.zzJ((short) iMin);
        zzzow.zzV(zzZZ7.zzWB(true).getBytes(str), 0, iMin * 2);
        zzzow.writeBytes(new byte[(i - r0) - 2]);
    }

    public static int zzZ(String str, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int iZzOe = zzZZ7.zzOe(str);
        byte[] bArr = new byte[iZzOe];
        zzZZ7.zzWB(true).zzZ(str, str.length(), bArr, 0);
        zzzow.writeBytes(bArr);
        return iZzOe;
    }

    public static void zzZ(com.aspose.words.internal.zzZOW zzzow, String str, int i, boolean z) throws Exception {
        if (z) {
            zzzow.zzK((short) (str.length() + 1));
        }
        zzzow.writeBytes(com.aspose.words.internal.zzZO0.zzQz(i).getBytes(str));
        zzzow.writeByte((byte) 0);
    }
}
