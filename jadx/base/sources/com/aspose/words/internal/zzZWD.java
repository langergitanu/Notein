package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZWD {
    private int[] zz8i;
    private int zz8j;
    private zzY0 zzTA;

    public zzZWD(zzY0 zzy0) {
        this.zzTA = zzy0;
    }

    public final void zzSb(int i) throws Exception {
        this.zzTA.zzq().zzH(((long) this.zz8i[i]) & 4294967295L);
    }

    public final int[] zzo0() {
        return this.zz8i;
    }

    public final int zzo1() {
        return this.zz8j;
    }

    public final boolean zzri() throws Exception {
        this.zzTA.zzq().zzH(0L);
        if (!"ttcf".equals(new String(this.zzTA.zzm(4)))) {
            return false;
        }
        int iZzXc = this.zzTA.zzXc();
        if (iZzXc != 65536 && iZzXc != 131072) {
            return false;
        }
        int iZzXc2 = this.zzTA.zzXc();
        this.zz8j = iZzXc2;
        if (iZzXc2 <= 0) {
            return false;
        }
        this.zz8i = new int[iZzXc2];
        for (int i = 0; i < this.zz8j; i++) {
            this.zz8i[i] = this.zzTA.zzXb();
        }
        if (131072 != iZzXc) {
            return true;
        }
        this.zzTA.zzXb();
        this.zzTA.zzXb();
        this.zzTA.zzXb();
        return true;
    }
}
