package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY14 extends zzYUV {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("annotation", "defaultFonts");
    private zzY1U zzWV6;

    public zzY14(zzY0Y zzy0y, zzY0U zzy0u) {
        super(zzy0y, zzy0u);
    }

    @Override // com.aspose.words.zzYUV
    public final boolean zzZ(String str, zzYVB zzyvb, zzYMX zzymx, zzYEF zzyef) throws Exception {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            this.zzWV6.zzZ(zzyvb, zzymx, zzyef);
            return true;
        }
        if (iZzTP != 1) {
            return false;
        }
        zzY1F.zzZ(zzyvb.zzZsD(), zzyvb.getDocument());
        return true;
    }

    @Override // com.aspose.words.zzYUV
    public final boolean zzZ(String str, zzYU4 zzyu4, zzYMX zzymx) {
        if (zzUR.zzTP(str) != 0) {
            return false;
        }
        zzY1U.zzZ(zzymx, zzyu4);
        return true;
    }

    public final void zzZ(zzY1U zzy1u) {
        this.zzWV6 = zzy1u;
    }
}
