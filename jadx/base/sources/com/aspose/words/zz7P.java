package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz7P implements Cloneable {
    private int zzZ3K;
    private String zzZ3M = "";
    private int zzZ3L = 1;
    private String zzZ3J = "";

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzI9(int i) {
        this.zzZ3L = i;
    }

    public final void zzIa(int i) {
        this.zzZ3K = i;
    }

    public final void zzOG(String str) {
        this.zzZ3M = str;
    }

    public final void zzOH(String str) {
        this.zzZ3J = str;
    }

    public final int zzZAV() {
        return this.zzZ3L;
    }

    public final String zzZAW() {
        if (this.zzZ3M == null) {
            this.zzZ3M = "";
        }
        return this.zzZ3M;
    }

    public final int zzZAX() {
        return this.zzZ3K;
    }

    public final String zzZAY() {
        if (this.zzZ3J == null) {
            this.zzZ3J = "";
        }
        return this.zzZ3J;
    }

    public final zz7P zzZAZ() {
        return (zz7P) memberwiseClone();
    }
}
