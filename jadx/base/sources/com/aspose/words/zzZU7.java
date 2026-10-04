package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZU7 {
    public static FileFormatInfo zzZ(com.aspose.words.internal.zzRK zzrk) throws Exception {
        zzrk.zzR8();
        if (!zzrk.zzq(com.aspose.words.internal.zzZRW.zzlS())) {
            return null;
        }
        com.aspose.words.internal.zzZRW zzzrw = new com.aspose.words.internal.zzZRW(zzrk.zzR1());
        while (zzzrw.zzm0()) {
            try {
                if (com.aspose.words.internal.zzZKN.zzX(zzzrw.zzlZ(), "mimetype", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8) && "application/epub+zip".equals(com.aspose.words.internal.zzZKN.zzTX(com.aspose.words.internal.zzZKN.zzU2(com.aspose.words.internal.zzZO0.zzhV().zzZn(zzzrw.zzlU()))))) {
                    FileFormatInfo fileFormatInfo = new FileFormatInfo();
                    fileFormatInfo.setLoadFormat(55);
                    fileFormatInfo.zzZ(com.aspose.words.internal.zzZO0.zzhV());
                    return fileFormatInfo;
                }
            } finally {
                zzzrw.dispose();
            }
        }
        return null;
    }
}
