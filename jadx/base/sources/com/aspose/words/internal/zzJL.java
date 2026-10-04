package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJL extends zzJO {
    private boolean zzA1;

    public zzJL(zzZXH zzzxh, boolean z) {
        super(zzzxh);
        this.zzA1 = z;
        zzHp();
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzF(zzZOP zzzop) throws Exception {
        new zzZXF().zzZ(zzPl(), zzTt(), zzHn(), zzzop);
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzG(zzZOP zzzop) throws Exception {
        new zzZXF().zzZ(zzPl(), zzTt(), zzHn(), zzzop, new zzZT2(), this.zzA1);
    }

    @Override // com.aspose.words.internal.zzJO
    public final boolean zzHo() {
        return false;
    }

    @Override // com.aspose.words.internal.zzJO
    public final int zzWO(int i) {
        return zzHn().getCount();
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzY(zzZOP zzzop) throws Exception {
        new zzZXF().zzZ(zzPl(), zzTt(), zzHn(), zzzop, new zzZZ2(), this.zzA1);
    }
}
