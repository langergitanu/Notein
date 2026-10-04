package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY6B {
    private com.aspose.words.internal.zz0R zzX4x;
    private zzZZC zzXFY;

    public final int getPosition() {
        return this.zzX4x.getPosition();
    }

    public abstract void zzZ(zzZZC zzzzc, int i) throws Exception;

    public final void zzZ(zzZZC zzzzc, com.aspose.words.internal.zz0S zz0s, int i) {
        this.zzXFY = zzzzc;
        this.zzX4x = zz0s.zzTf(i);
    }

    public final void zzjO(int i) throws Exception {
        while (this.zzX4x.getPosition() == i) {
            zzZ(this.zzXFY, this.zzX4x.getIndex());
            if (this.zzX4x.zzYC()) {
                return;
            } else {
                this.zzX4x.zzsj();
            }
        }
    }
}
