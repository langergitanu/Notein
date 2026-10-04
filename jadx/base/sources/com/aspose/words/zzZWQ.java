package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWQ extends zzYUN {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("altChunk", "del", "ins");
    private zzZYI zzYNI;

    public zzZWQ(zzYUE zzyue, zzZWS zzzws, zzZX0 zzzx0, zzZXK zzzxk, zzYV7 zzyv7, zzZXB zzzxb, zzZYI zzzyi, zzZ9X zzz9x) {
        super(zzyue, zzzws, zzzx0, zzzxk, zzyv7, zzzxb, zzz9x);
        this.zzYNI = zzzyi;
    }

    @Override // com.aspose.words.zzYUN
    public final void zzI(zzYVB zzyvb) throws Exception {
        zzZWD.zzY(zzyvb);
    }

    @Override // com.aspose.words.zzYUN
    public final Comment zzU(zzYVB zzyvb, zzYEF zzyef) {
        return zzyvb.zzFw(zzyvb.zzZsD().zzX("id", 0));
    }

    @Override // com.aspose.words.zzYUN
    public final boolean zzZ(String str, zzYVB zzyvb, zzYEF zzyef) throws Exception {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            zzZYJ.zzY(zzyvb);
            return true;
        }
        if (iZzTP == 1) {
            this.zzYNI.zzZ(zzyvb, zzyef, true);
            return true;
        }
        if (iZzTP != 2) {
            return false;
        }
        this.zzYNI.zzZ(zzyvb, zzyef, false);
        return true;
    }

    @Override // com.aspose.words.zzYUN
    public final Footnote zzZ(zzYVB zzyvb, int i, int i2, zzYEF zzyef) {
        return zzyvb.zzXR(i2, i);
    }
}
