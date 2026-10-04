package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQ7 extends zzQA {
    private zzQB zzKw;
    private zzQ8 zzKx;

    public zzQ7(zzQB zzqb) {
        this.zzKw = zzqb;
    }

    public final zzQ8 zzPZ() {
        return this.zzKx;
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzX(zzQ9 zzq9) throws Exception {
        this.zzKx.zzYi(r0.getCount() - 1).zzYi(r0.getCount() - 1).zzZ(this.zzKw.zzY(zzq9));
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzY(zzQG zzqg) throws Exception {
        zzqg.zzZ(this.zzKw);
        this.zzKx.zzZ(new zzQG(zzqg.zzQv(), zzqg.getType(), zzqg.getOrder(), zzqg.zzZ2(), zzqg.zzZ1()));
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzZ(zzQ8 zzq8) throws Exception {
        this.zzKx = new zzQ8();
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzZ(zzQD zzqd) throws Exception {
        this.zzKx.zzYi(r0.getCount() - 1).zzZ(new zzQD(zzqd.isClosed()));
    }
}
