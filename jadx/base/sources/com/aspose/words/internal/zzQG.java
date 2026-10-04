package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQG extends zzQJ<zzQD> {
    private int zzL3;
    private int zzL4;
    private zzQ6 zzL5;
    private zzPY zzYr;
    private zzOU zzYs;

    public zzQG(zzQ6 zzq6, int i, int i2, zzOU zzou, zzPY zzpy) {
        this.zzL3 = i2;
        this.zzL5 = zzq6;
        this.zzL4 = i;
        this.zzYs = zzou;
        this.zzYr = zzpy;
    }

    public final int getOrder() {
        return this.zzL3;
    }

    public final int getType() {
        return this.zzL4;
    }

    public final zzQ6 zzQv() {
        return this.zzL5;
    }

    public final void zzY(zzPY zzpy) {
        this.zzYr = zzpy;
    }

    @Override // com.aspose.words.internal.zzQJ, com.aspose.words.internal.zzQI
    public final void zzZ(zzQA zzqa) throws Exception {
        zzqa.zzY(this);
        super.zzZ(zzqa);
        zzqa.zzX(this);
    }

    public final zzPY zzZ1() {
        return this.zzYr;
    }

    public final zzOU zzZ2() {
        return this.zzYs;
    }

    public final void zzZ(zzQB zzqb) {
        this.zzL5.zzX(zzqb);
        this.zzL5.normalize();
    }

    public zzQG(int i, zzOU zzou, zzPY zzpy) {
        this(new zzQ6(0.0d, 0.0d, 1.0d), 1, i, zzou, zzpy);
    }

    public zzQG(zzQ6 zzq6, int i, zzOU zzou, zzPY zzpy, int i2) {
        this(zzq6, 2, i, zzou, zzpy);
        zzYj(i2);
    }
}
