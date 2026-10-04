package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0W extends zzZ18 {
    private boolean zzY1v;
    private zzZ13 zzY1w;
    private zzZ13 zzY2k;

    public zzZ0W(zzZ14 zzz14, OfficeMath officeMath, boolean z) {
        super(zzz14, officeMath);
        this.zzY1v = z;
        this.zzY2k = new zzZ13(zzz14, officeMath);
        zzZ13 zzz13 = new zzZ13(zzz14, officeMath);
        this.zzY1w = zzz13;
        if (z) {
            super.zzZ(this.zzY2k);
            super.zzZ(this.zzY1w);
        } else {
            super.zzZ(zzz13);
            super.zzZ(this.zzY2k);
        }
    }

    private void zzw(zzZ13 zzz13) {
        this.zzY1w.zzZ(zzz13);
    }

    private void zzx(zzZ13 zzz13) {
        this.zzY2k.zzZ(zzz13);
    }

    @Override // com.aspose.words.zzZ0M, com.aspose.words.zzZ13
    public final void layoutChildren() throws Exception {
        for (zzZ13 zzz13 : this.zzY1w.zzQw()) {
            zzz13.zzZE4();
            zzz13.zzR(zzYq(0.72f));
        }
        super.layoutChildren();
        zzYp(this.zzY1v ? this.zzY2k.zzYGq() : this.zzY1w.zzZj().getHeight() + this.zzY2k.zzYGq());
    }

    @Override // com.aspose.words.zzZ18, com.aspose.words.zzZ13
    public final void zzZ(zzZ13 zzz13) {
        int mathObjectType = zzz13.zzYGk().zzZsL().getMathObjectType();
        if (mathObjectType == 8) {
            zzx(zzz13);
        } else {
            if (mathObjectType != 16) {
                throw new IllegalArgumentException("Cannot add child of this type to the UpperLimit/LowerLimit element. Only Argument and Limit parts are allowed.");
            }
            zzw(zzz13);
        }
    }
}
