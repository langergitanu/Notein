package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZX1 extends zzYUV {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("pPrChange", "ins", "numberingChange");
    private zzZYI zzYNI;

    public zzZX1(zzZWS zzzws, zzZWM zzzwm) {
        super(zzzws, zzzwm);
    }

    @Override // com.aspose.words.zzYUV
    public final boolean zzZ(String str, zzYVB zzyvb, zzYMX zzymx, zzYEF zzyef) throws Exception {
        if (zzUR.zzTP(str) != 0) {
            return false;
        }
        this.zzYNI.zzZ(zzyvb, zzymx, zzyef);
        return true;
    }

    @Override // com.aspose.words.zzYUV
    public final boolean zzZ(String str, zzYU4 zzyu4, zzYMX zzymx) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 1) {
            zzZYI.zzZ(zzyu4, zzymx);
            return true;
        }
        if (iZzTP != 2) {
            return false;
        }
        zzZYI.zzY(zzyu4, zzymx);
        return true;
    }

    public final void zzZ(zzZYI zzzyi) {
        this.zzYNI = zzzyi;
    }
}
