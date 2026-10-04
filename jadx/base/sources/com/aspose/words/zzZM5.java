package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZM5 extends zzZMB {
    private zzZ4L zzYvL;

    public zzZM5(DocumentBase documentBase, zzZ4L zzz4l) {
        super(documentBase, zzz4l);
        this.zzYvL = zzz4l;
    }

    private void zzZ5S() {
        this.zzYvS.zzX(zzZMC.zzZ(new com.aspose.words.internal.zzZQ4(zzZ67().zzZm() + 3.0f, zzZ67().zzZo() + 3.0f, 9.0f, 9.0f), false, (byte) 1));
    }

    private void zzZ5T() {
        this.zzYvS.zzX(zzZMC.zzY(new com.aspose.words.internal.zzZQ4(zzZ67().zzZm() + 3.0f, zzZ67().zzZo() + 3.0f, 9.0f, 9.0f), false, (byte) 1));
    }

    private void zzZ5U() {
        if (this.zzYvL.zzYP6() == 0) {
            return;
        }
        if (this.zzYvL.zzYP5() == 0) {
            zzZ5S();
        } else {
            zzZ5T();
        }
    }

    private void zzZ5X() throws Exception {
        this.zzYvS.zzX(zzZLV.zzZ(this.zzYvL, this.zzYKc).zzZc(com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm() + (this.zzYvL.zzYP6() == 1 ? 18.0f : 9.0f), zzZ67().zzZo(), zzZ67().zzkw(), zzZ67().zzZn())));
    }

    @Override // com.aspose.words.zzZMB
    public final void zzZ68() throws Exception {
        zzZ66();
        zzZ64();
        zzZ5U();
        zzZ5X();
    }
}
