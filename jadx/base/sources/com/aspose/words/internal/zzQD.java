package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQD extends zzQJ<zzQ9> {
    private boolean zzKZ;

    public zzQD() {
        this.zzKZ = true;
    }

    private void zzg(boolean z) {
        zzQ9[] zzq9Arr = new zzQ9[zzQw().size()];
        for (int i = 0; i < zzQw().size(); i++) {
            zzq9Arr[i] = zzQw().get(i);
        }
        if (zzJ6.zzZ(zzq9Arr) != z) {
            zzQx();
        }
    }

    public final boolean isClosed() {
        return this.zzKZ;
    }

    public final void zzQp() {
        this.zzKZ = true;
    }

    public final void zzQq() {
        zzg(false);
    }

    public final void zzQr() {
        zzg(true);
    }

    @Override // com.aspose.words.internal.zzQJ, com.aspose.words.internal.zzQI
    public final void zzZ(zzQA zzqa) throws Exception {
        zzqa.zzZ(this);
        super.zzZ(zzqa);
        zzqa.zzY(this);
    }

    public zzQD(boolean z) {
        this.zzKZ = z;
    }

    public zzQD(int i, boolean z) {
        zzYj(i);
        this.zzKZ = z;
    }
}
