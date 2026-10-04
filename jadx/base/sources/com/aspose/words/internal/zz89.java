package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz89 implements zzG6 {
    private long zzor;
    protected zz8T zzos;
    protected zzZYV<zz8E> zzot;
    private zzP9 zzox;

    public zz89(zz8T zz8t, long j) {
        this.zzor = 0L;
        this.zzos = zz8t;
        this.zzor = zzZx(j);
        this.zzox = zzP9.zzZ(zzZQ4.zzN(this.zzos.zzyQ()), new zzZQ4(0L, zzZPX.zzYA(this.zzor)));
    }

    private static zz8E zzV(zzZQ4 zzzq4, int i) {
        zz8E zz8e = new zz8E();
        zz8e.setAction(0);
        zz8e.zzo(zzzq4);
        zz8e.zzUH(i);
        zz8e.zzZP(true);
        return zz8e;
    }

    private zz8E zzW(zzZQ4 zzzq4, int i) {
        zzZYV<zz8E> zzzyv = this.zzot;
        return zzzyv == null ? zzV(zzzq4, i) : zzzyv.zzW(i, zzV(zzzq4, i));
    }

    private zzZP zzY(zz8E zz8e) throws Exception {
        if (zz8e.getAction() != 0) {
            return null;
        }
        zzZQ5 zzzq5ZzZ = zz8I.zzZ(zz8e.zzye(), this.zzox, this.zzor);
        if (zzzq5ZzZ.isEmpty()) {
            return null;
        }
        byte[] bArrZzUD = zzUD(zz8e.zzJp());
        zzXN zzxn = new zzXN(zzzq5ZzZ.getWidth(), zzzq5ZzZ.getHeight(), 72.0f, 72.0f);
        zzIY zziy = new zzIY(zzxn);
        zzXN zzxn2 = new zzXN(zzXN.zzT(new zzZOR(bArrZzUD)));
        float width = zzxn2.getWidth() / ((int) this.zzor);
        float height = zzxn2.getHeight() / ((int) (this.zzor >>> 32));
        zziy.zzZ(zzxn2, new zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight()), new zzZQ5((int) (zzzq5ZzZ.getLeft() * width), (int) (zzzq5ZzZ.getTop() * height), (int) (zzzq5ZzZ.getRight() * width), (int) (zzzq5ZzZ.getBottom() * height)));
        zzZOR zzzor = new zzZOR();
        try {
            zzXN.zzZ(zzxn.zzDW(), zzzor);
            return new zzZP(zz8e.zzye().zzZE(), zz8e.zzye().getSize(), zzzor.zzWy());
        } finally {
            zzzor.close();
        }
    }

    private static long zzZx(long j) {
        int iMax = Math.max((int) j, 50);
        int iMax2 = Math.max((int) (j >>> 32), 50);
        while (zzEF.zz6(iMax, iMax2)) {
            iMax /= 2;
            iMax2 /= 2;
        }
        return zzZPX.zzZm(iMax, iMax2);
    }

    @Override // com.aspose.words.internal.zzZOY
    public void dispose() {
    }

    @Override // com.aspose.words.internal.zzG6
    public final boolean zzFj() {
        return true;
    }

    @Override // com.aspose.words.internal.zzG6
    public final boolean zzL(int i, boolean z) {
        return true;
    }

    @Override // com.aspose.words.internal.zzGF
    public final void zzM(zzZL zzzl) {
    }

    @Override // com.aspose.words.internal.zzGF
    public final void zzMM() {
    }

    @Override // com.aspose.words.internal.zzGF
    public final void zzN(zzZL zzzl) {
    }

    @Override // com.aspose.words.internal.zzG6
    public final void zzT(zzZYV<zz8E> zzzyv) {
        this.zzot = zzzyv;
    }

    public abstract byte[] zzUD(int i) throws Exception;

    @Override // com.aspose.words.internal.zzG6
    public final void zzZ(zzGE zzge, zzG4 zzg4) {
    }

    @Override // com.aspose.words.internal.zzG6
    public final zzZP zzZ(zzZG zzzg, int i, int i2) throws Exception {
        return zzY(zzW(new zzH().zzZ((zzZL) zzzg), i2));
    }

    @Override // com.aspose.words.internal.zzG6
    public final zzZP zzZ(zz85 zz85Var, zzZQ4 zzzq4, int i) throws Exception {
        return zzY(zzW(zzzq4, i));
    }
}
