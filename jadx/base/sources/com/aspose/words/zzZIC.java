package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIC {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("us-ascii", "iso-8859-1", "iso-8859-9", "iso-2022-jp");

    private static com.aspose.words.internal.zzZO0 zzS(com.aspose.words.internal.zzZO0 zzzo0) {
        int iZzTP = zzUR.zzTP(zzzo0.zzi1());
        return (iZzTP == 0 || iZzTP == 1) ? com.aspose.words.internal.zzZO0.zzV3("windows-1252") : iZzTP != 2 ? iZzTP != 3 ? zzzo0 : zzZ(zzzo0, "x-windows-iso2022jp") : com.aspose.words.internal.zzZO0.zzV3("windows-1254");
    }

    public static com.aspose.words.internal.zzZO0 zzZ(com.aspose.words.internal.zzZO0 zzzo0, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzo0 == null) {
            com.aspose.words.internal.zzRK zzrk = new com.aspose.words.internal.zzRK(zzzop, null);
            try {
                FileFormatInfo fileFormatInfoZzZ = zzZHK.zzZ(zzrk);
                zzrk.zzR9();
                zzzo0 = fileFormatInfoZzZ.zzZ9Y();
            } catch (Throwable th) {
                zzrk.zzR9();
                throw th;
            }
        }
        return zzS(zzzo0);
    }

    private static com.aspose.words.internal.zzZO0 zzZ(com.aspose.words.internal.zzZO0 zzzo0, String str) {
        com.aspose.words.internal.zzZO0 zzzo0ZzV3;
        try {
            zzzo0ZzV3 = com.aspose.words.internal.zzZO0.zzV3(str);
        } catch (Exception unused) {
        }
        return zzzo0ZzV3 == com.aspose.words.internal.zzZO0.zzhV() ? zzzo0 : zzzo0ZzV3;
    }
}
