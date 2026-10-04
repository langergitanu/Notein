package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOS {
    private IFieldUpdatingProgressCallback zzYAH;
    private boolean zzYAI;
    private int zzYAJ;
    private int zzYAK;
    private Object zzYAL;

    public zzZOS(IFieldUpdatingProgressCallback iFieldUpdatingProgressCallback, Object obj) {
        this.zzYAL = obj;
        this.zzYAH = iFieldUpdatingProgressCallback;
    }

    private void zzVO(boolean z) {
        IFieldUpdatingProgressCallback iFieldUpdatingProgressCallback = this.zzYAH;
        if (iFieldUpdatingProgressCallback == null) {
            return;
        }
        iFieldUpdatingProgressCallback.notify(new FieldUpdatingProgressArgs(this.zzYAK, this.zzYAJ, z));
    }

    public final void zzZaQ() {
        zzVO(true);
    }

    public final void zzZaR() {
        this.zzYAJ++;
        this.zzYAI = true;
    }

    public final void zzZaS() {
        this.zzYAK++;
        this.zzYAI = true;
    }

    public final void zzZaT() {
        if (this.zzYAI) {
            this.zzYAI = false;
            zzVO(false);
        }
    }

    public final Object zzZaU() {
        return this.zzYAL;
    }
}
