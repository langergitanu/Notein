package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJK extends zzJO {
    private boolean zzA1;

    public zzJK(zzZXH zzzxh, boolean z) {
        super(zzzxh);
        this.zzA1 = false;
        zzHp();
    }

    private void zzZ(zzZOP zzzop, zzGS zzgs) throws Exception {
        zzZYV<Integer> zzzyv = new zzZYV<>();
        for (int i = 0; i < zzHn().getCount(); i++) {
            int iZzT3 = zzHn().zzT3(i);
            zzzyv.set(iZzT3, Integer.valueOf(iZzT3));
        }
        new zzZXF().zzZ(zzPl(), zzzyv, zzzop, zzgs, this.zzA1);
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzF(zzZOP zzzop) {
        throw new UnsupportedOperationException("True Type simple subset is not supported in PostScript use True Type Compact subset instead.");
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzG(zzZOP zzzop) throws Exception {
        zzZ(zzzop, new zzZT2());
    }

    @Override // com.aspose.words.internal.zzJO
    public final boolean zzHo() {
        return false;
    }

    @Override // com.aspose.words.internal.zzJO
    public final int zzWO(int i) {
        return i;
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzY(zzZOP zzzop) throws Exception {
        zzZ(zzzop, new zzZZ2());
    }
}
