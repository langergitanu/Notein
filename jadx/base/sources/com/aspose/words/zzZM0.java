package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZM0 extends zzZMB {
    private zzY50 zzYvD;

    public zzZM0(DocumentBase documentBase, zzY50 zzy50) {
        super(documentBase, zzy50);
        this.zzYvD = zzy50;
    }

    private void zzZ5L() {
        this.zzYvS.zzX(zzYO6.zzD4(this.zzYvD.getValue()) == 1 ? zzZMC.zzZk(zzZ67()) : zzZMC.zzZj(zzZ67()));
    }

    private void zzZ5M() {
        if (zzYO6.zzD4(this.zzYvD.getValue()) != 0) {
            zzZ65();
        } else {
            zzZ66();
        }
    }

    private void zzZ61() throws Exception {
        this.zzYvS.zzX(zzZLV.zzZ(this.zzYvD, this.zzYKc).zzZc(com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm() + 4.0f, zzZ67().zzZo(), zzZ67().zzkw() - 4.0f, zzZ67().zzZn())));
    }

    @Override // com.aspose.words.zzZMB
    public final void zzZ68() throws Exception {
        zzZ5M();
        zzZ5L();
        zzZ61();
    }
}
