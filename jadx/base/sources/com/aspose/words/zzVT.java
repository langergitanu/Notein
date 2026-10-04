package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVT {
    private static byte[] zzZx1 = {16, -3, 1, 124, -86, 123, -48, 17, -98, 12, 0, -96, -55, 34, -26, -20};
    private static byte[] zzZx0 = {17, -3, 1, 124, -86, 123, -48, 17, -98, 12, 0, -96, -55, 34, -26, -20};

    public static FileFormatInfo zzZ(com.aspose.words.internal.zzRK zzrk) throws Exception {
        zzrk.zzR8();
        if (!zzrk.zzj("ITSF")) {
            return null;
        }
        zzrk.zzR1().zzH(zzrk.zzR1().getPosition() + 24);
        for (byte b : zzZx1) {
            if (!zzrk.zzR2() || b != ((byte) zzrk.zzR1().zzRI())) {
                return null;
            }
        }
        for (byte b2 : zzZx0) {
            if (!zzrk.zzR2() || b2 != ((byte) zzrk.zzR1().zzRI())) {
                return null;
            }
        }
        FileFormatInfo fileFormatInfo = new FileFormatInfo();
        fileFormatInfo.setLoadFormat(53);
        fileFormatInfo.zzZ(com.aspose.words.internal.zzZO0.zzhX());
        return fileFormatInfo;
    }
}
