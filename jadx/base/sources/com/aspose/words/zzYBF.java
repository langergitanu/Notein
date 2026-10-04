package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBF {
    private static void zzH(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        if (i > 0) {
            zzzox.zzXc();
            zzzox.zzXc();
            while (zzzox.zzXc() != 0) {
                zzzox.zzXc();
                zzzox.zzn(zzzox.zzXc());
            }
            zzzox.zzn(8);
        }
    }

    private static void zzX(com.aspose.words.internal.zzKD zzkd, DigitalSignatureCollection digitalSignatureCollection, IWarningCallback iWarningCallback) throws Exception {
        com.aspose.words.internal.zzZOR zzzorZzYu = zzkd.zzIf().zzYu("_signatures");
        if (zzzorZzYu == null) {
            return;
        }
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzorZzYu, com.aspose.words.internal.zzZO0.zzhU());
        zzH(zzzox, zzzox.zzXc());
        zzzox.zzXc();
        zzZ(zzzox, digitalSignatureCollection, new zzZKZ(zzkd.zzIf()).zzZ50(), iWarningCallback);
    }

    private static void zzY(com.aspose.words.internal.zzKD zzkd, DigitalSignatureCollection digitalSignatureCollection, IWarningCallback iWarningCallback) throws Exception {
        com.aspose.words.internal.zzAA zzaaZzYr = zzkd.zzIf().zzYr("_xmlsignatures");
        if (zzaaZzYr == null) {
            return;
        }
        Iterator<String> it = zzaaZzYr.getKeys().iterator();
        while (it.hasNext()) {
            zzXZ3.zzZ(zzaaZzYr.zzYu(it.next()), new zzZZ9(zzkd), digitalSignatureCollection, iWarningCallback);
        }
    }

    public static void zzZ(com.aspose.words.internal.zzKD zzkd, DigitalSignatureCollection digitalSignatureCollection, IWarningCallback iWarningCallback) throws Exception {
        zzY(zzkd, digitalSignatureCollection, iWarningCallback);
        zzX(zzkd, digitalSignatureCollection, iWarningCallback);
    }

    private static void zzZ(com.aspose.words.internal.zzZOX zzzox, DigitalSignatureCollection digitalSignatureCollection, byte[] bArr, IWarningCallback iWarningCallback) throws Exception {
        int iZzXc = zzzox.zzXc();
        while (iZzXc != 0) {
            DigitalSignature digitalSignatureZzZ = zzWD.zzZ(zzzox, bArr);
            digitalSignatureCollection.zzZ(digitalSignatureZzZ);
            if (!digitalSignatureZzZ.isValid() && iWarningCallback != null) {
                OooO00o.OooO0O0(iWarningCallback, 16777216, 10, "Digital signature is invalid, document content was tampered.");
            }
            iZzXc = zzzox.zzXc();
        }
    }
}
