package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0X extends zzZ18 {
    private zzZ13 zzY1x;
    private zzZ1A zzY1y;
    private zzZ09 zzY1z;
    private zzZ13 zzY2r;

    public zzZ0X(zzZ14 zzz14, OfficeMath officeMath) {
        super(zzz14, officeMath);
        this.zzY1z = (zzZ09) officeMath.zzZsL();
        this.zzY2r = new zzZ13(zzz14, officeMath);
        this.zzY1x = new zzZ13(zzz14, officeMath);
        if (this.zzY1z.getPosition() == 1) {
            super.zzZ(this.zzY2r);
            super.zzZ(this.zzY1x);
        } else {
            super.zzZ(this.zzY1x);
            super.zzZ(this.zzY2r);
        }
        zzZ1A zzz1a = new zzZ1A(zzz14, this.zzY1z.getCharacter(), officeMath.zzZYh());
        this.zzY1y = zzz1a;
        this.zzY1x.zzZ(zzz1a);
    }

    @Override // com.aspose.words.zzZ0M, com.aspose.words.zzZ13
    public final void layoutChildren() throws Exception {
        if ((this.zzY1z.getPosition() == 1 && this.zzY1z.zzYEM() == 1) || (this.zzY1z.getPosition() == 0 && this.zzY1z.zzYEM() == 0)) {
            for (zzZ13 zzz13 : this.zzY2r.zzQw()) {
                zzz13.zzZE4();
                zzz13.zzR(zzYq(0.72f));
            }
        }
        this.zzY2r.zzZE4();
        this.zzY1y.setWidth(this.zzY2r.zzZj().getWidth());
        this.zzY1x.zzZE4();
        if (this.zzY1z.getPosition() == 0 && this.zzY1z.zzYEM() == 0) {
            zzYp(this.zzY1x.zzYGq());
        } else if (this.zzY1z.getPosition() == 0 && this.zzY1z.zzYEM() == 1) {
            zzYp(this.zzY1x.zzZj().getHeight() + this.zzY2r.zzYGq());
        } else if (this.zzY1z.getPosition() == 1 && this.zzY1z.zzYEM() == 0) {
            zzYp(this.zzY2r.zzYGq());
        } else if (this.zzY1z.getPosition() == 1 && this.zzY1z.zzYEM() == 1) {
            zzYp(this.zzY2r.zzZj().getHeight() + this.zzY1x.zzYGq());
        }
        super.layoutChildren();
    }

    @Override // com.aspose.words.zzZ18, com.aspose.words.zzZ13
    public final void zzZ(zzZ13 zzz13) {
        this.zzY2r.zzZ(zzz13);
    }
}
