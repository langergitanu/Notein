package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ28 {
    private int zzZF;

    public final int getCount() {
        return this.zzZF;
    }

    public abstract int getType();

    public final int getWeight() {
        return this.zzZF * zzZjs();
    }

    public final void setCount(int i) {
        this.zzZF = i;
    }

    public final boolean zzY(zzZ27 zzz27) throws Exception {
        this.zzZF = 0;
        if (!zzZ(zzz27)) {
            return false;
        }
        zzz27.zzYIQ().add(Integer.valueOf(getType()));
        return true;
    }

    public abstract boolean zzZ(zzZ27 zzz27) throws Exception;

    public abstract int zzZjs();
}
