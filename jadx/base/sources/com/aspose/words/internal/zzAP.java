package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzAP implements zzZOY {
    private zzXV zzsb;
    private boolean zzsc;

    public zzAP(zzZOR zzzor) throws Exception {
        this.zzsb = new zzXV(zzzor, false);
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() throws Exception {
        if (this.zzsc) {
            return;
        }
        this.zzsb.dispose();
        this.zzsc = true;
    }

    public final void flush() throws Exception {
        this.zzsb.flush();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    public final int zzQ(short s) throws Exception {
        if (s == 0) {
            this.zzsb.zzD(false);
            return 1;
        }
        boolean z = s < 0;
        if (z) {
            s = -s;
        }
        for (int i = 0; i < s; i++) {
            this.zzsb.zzD(true);
        }
        this.zzsb.zzD(false);
        this.zzsb.zzD(z);
        return s + 2;
    }
}
