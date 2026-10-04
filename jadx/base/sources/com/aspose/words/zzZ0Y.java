package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0Y extends zzZ13 {
    private zzZ13 zzY1A;
    private zzZ13 zzY1B;

    public zzZ0Y(zzZ14 zzz14, OfficeMath officeMath) {
        super(zzz14, officeMath);
        this.zzY1B = new zzZ13(zzz14, officeMath);
        this.zzY1A = new zzZ13(zzz14, officeMath);
        super.zzZ(this.zzY1B);
        super.zzZ(this.zzY1A);
    }

    private void zzYFP() throws Exception {
        this.zzY1A.zzZE4();
        if (zzYG7()) {
            float lineSpacingPoints = zzZr().getLineSpacingPoints();
            boolean z = this.zzY1A.zzYGq() > zzYG5();
            float descentPoints = 0.0f;
            float descentPoints2 = z ? zzZr().getDescentPoints() + zzYG5() : getIndex() == 0 ? lineSpacingPoints : 0.0f;
            if (!z && getIndex() == 0) {
                descentPoints = (lineSpacingPoints - zzZr().getDescentPoints()) / 2.0f;
            }
            zzZ11.zzW(this.zzY1B, descentPoints2, descentPoints);
        }
    }

    @Override // com.aspose.words.zzZ13
    public final void layoutChildren() throws Exception {
        super.layoutChildren();
        float width = this.zzY1B.getWidth() + (zzZYh().getSize() * (zzZ15.zzX(this.zzY1A) ? 0.0f : 0.085f));
        com.aspose.words.internal.zzZQ4 zzzq4ZzZj = this.zzY1B.zzZj();
        this.zzY1B.zzI(new com.aspose.words.internal.zzZQ4(zzzq4ZzZj.getX(), zzzq4ZzZj.getY(), width, zzzq4ZzZj.getHeight()));
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYGC() {
        zzZ11.zzQ(this);
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYGD() {
        zzZ11.zzR(this);
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYHg() throws Exception {
        zzYFP();
        super.zzYHg();
        if (!zzYG7() || this.zzY1A.zzYGq() <= zzYG5()) {
            return;
        }
        zzZ11.zzT(this);
    }

    @Override // com.aspose.words.zzZ13
    public final void zzZ(zzZ13 zzz13) {
        int mathObjectType = zzz13.zzYGk().zzZsL().getMathObjectType();
        if (mathObjectType == 8) {
            this.zzY1A.zzZ(zzz13);
        } else {
            if (mathObjectType != 14) {
                throw new IllegalArgumentException("Function element can have only function name and argument parts.");
            }
            this.zzY1B.zzZ(zzz13);
        }
    }
}
