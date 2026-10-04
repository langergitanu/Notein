package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zzZZ5 {
    private zzAW zzct = new zzAW();

    public zzZZ5() {
    }

    private void zzW(zzZOP zzzop, int i) throws Exception {
        zzZOX zzzox = new zzZOX(zzzop, zzZO0.zzhU());
        int count = this.zzct.getCount() + i;
        if (this.zzct.zzB2() < count) {
            this.zzct.zzH(count);
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.zzct.add(((long) zzzox.zzXc()) & 4294967295L);
        }
    }

    public final void add(int i) {
        this.zzct.add(((long) i) & 4294967295L);
    }

    public final int get(int i) {
        return (int) this.zzct.get((int) (((long) i) & 4294967295L));
    }

    public final int getCount() {
        return this.zzct.getCount();
    }

    public final zzZOR zzQH() throws Exception {
        zzZOR zzzor = new zzZOR();
        zzZOW zzzow = new zzZOW(zzzor, zzZO0.zzhU());
        for (int i = 0; (((long) i) & 4294967295L) < this.zzct.getCount(); i++) {
            zzzow.zzl(get(i));
        }
        return zzzor;
    }

    public zzZZ5(zzZOP zzzop) throws Exception {
        zzzop.zzH(0L);
        zzW(zzzop, ((int) zzzop.getLength()) / 4);
    }
}
