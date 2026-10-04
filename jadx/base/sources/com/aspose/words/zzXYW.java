package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYW {
    public static FileFormatInfo zzZ(com.aspose.words.internal.zzRK zzrk) throws Exception {
        zzrk.zzR8();
        FileFormatInfo fileFormatInfo = null;
        try {
            com.aspose.words.internal.zzZL1 zzzl1ZzZS = com.aspose.words.internal.zzZSN.zzZS(zzrk.zzR1());
            if (!zzzl1ZzZS.read()) {
                return null;
            }
            String strZzi2 = zzzl1ZzZS.zzQZ().zzi2();
            fileFormatInfo = new FileFormatInfo();
            fileFormatInfo.setLoadFormat(65);
            fileFormatInfo.zzZ(com.aspose.words.internal.zzZYD.zzXk(strZzi2) ? com.aspose.words.internal.zzZO0.zzV3(strZzi2) : com.aspose.words.internal.zzZO0.zzhV());
        } catch (IllegalStateException unused) {
        }
        return fileFormatInfo;
    }
}
