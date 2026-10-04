package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWM extends zzYUK {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("headerReference", "footerReference", "footnotePr", "endnotePr", "sectPrChange");
    private zzZYI zzYNI;

    public final void zzZ(zzZYI zzzyi) {
        this.zzYNI = zzzyi;
    }

    @Override // com.aspose.words.zzYUK
    public final void zzZ(String str, zzYVB zzyvb, zzYCZ zzycz, boolean z, boolean z2) throws Exception {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0 || iZzTP == 1) {
            if (z || z2) {
                return;
            }
            zzZXC.zzY(zzyvb);
            return;
        }
        if (iZzTP == 2 || iZzTP == 3) {
            zzZWL.zzZ((zzZXT) zzyvb, str, zzycz);
        } else {
            if (iZzTP != 4) {
                return;
            }
            this.zzYNI.zzZ(zzyvb, zzycz);
        }
    }
}
