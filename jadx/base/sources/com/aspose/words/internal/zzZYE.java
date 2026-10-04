package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZYE implements Iterable<Integer>, Iterator<Integer> {
    private String zzZi;
    private int zzbQ;
    private int zzbR = 0;
    private int zzbP = 0;

    public zzZYE(String str) {
        this.zzZi = str == null ? "" : str;
        this.zzbQ = 0;
    }

    private void reset() {
        this.zzbR = 0;
        this.zzbP = 0;
    }

    public final int getOffset() {
        return this.zzbP;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzbR >= this.zzZi.length()) {
            return false;
        }
        char cCharAt = this.zzZi.charAt(this.zzbR);
        int i = this.zzbR;
        this.zzbP = i;
        this.zzbR = i + 1;
        if (zzZVS.zz4(cCharAt) && this.zzbR < this.zzZi.length() && zzZVS.zz3(this.zzZi.charAt(this.zzbR))) {
            this.zzbQ = zzZVS.zzW(cCharAt, this.zzZi.charAt(this.zzbR));
            this.zzbR++;
        } else {
            this.zzbQ = cCharAt;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final void setText(String str) {
        if (str == null) {
            str = "";
        }
        this.zzZi = str;
        reset();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final Integer next() {
        if (this.zzbR != 0) {
            return Integer.valueOf(this.zzbQ);
        }
        throw new IllegalStateException("Enumerator has not been started.");
    }
}
