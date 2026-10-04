package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6O {
    private boolean zzYfu;
    private com.aspose.words.internal.zzZQ4 zzYfv = com.aspose.words.internal.zzZQ4.zz2T;
    private BorderCollection zzZCb;

    public zzZ6O(BorderCollection borderCollection) {
        this.zzZCb = borderCollection;
    }

    public final boolean isVisible() {
        return this.zzZCb.isVisible();
    }

    public final Border zz8m() throws Exception {
        return this.zzZCb.getBottom();
    }

    public final Border zz8n() throws Exception {
        return this.zzZCb.getTop();
    }

    public final Border zz8o() throws Exception {
        return this.zzZCb.getRight();
    }

    public final Border zz8p() throws Exception {
        return this.zzZCb.getLeft();
    }

    public final void zzUV(boolean z) {
        this.zzYfu = z;
    }

    public final boolean zzYSw() {
        return this.zzYfu;
    }

    public final com.aspose.words.internal.zzZQ4 zzYSx() {
        return this.zzYfv;
    }

    public final void zzZ8(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzYfv = zzzq4;
    }
}
