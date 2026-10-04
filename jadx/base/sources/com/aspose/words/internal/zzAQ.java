package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzAQ implements zzZOY {
    private boolean zzsc;
    private zzXW zzsd;

    public zzAQ(zzZOR zzzor) throws Exception {
        this.zzsd = new zzXW(zzzor, false);
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() throws Exception {
        if (this.zzsc) {
            return;
        }
        this.zzsd.dispose();
        this.zzsc = true;
    }

    public final short zzAM() throws Exception {
        short s = 0;
        while (this.zzsd.zzX0()) {
            s = (short) (s + 1);
        }
        return (s <= 0 || !this.zzsd.zzX0()) ? s : (short) (s * (-1));
    }
}
