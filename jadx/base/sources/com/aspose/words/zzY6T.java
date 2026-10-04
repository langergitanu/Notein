package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6T {
    private int zzVL;
    private int zzX6b;
    private int zzX6c;
    private boolean zzX6e;
    private zzY6P zzZzB = new zzY6P();
    private zzZL8 zzX6d = new zzZL8();

    public final int getWidth() {
        return this.zzVL;
    }

    public final boolean isAuto() {
        return (zzXZn() || this.zzX6e) ? false : true;
    }

    public final void setWidth(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzVL = i;
    }

    public final zzY6P zz55() {
        return this.zzZzB;
    }

    public final int zz56() {
        return this.zzZzB.zz56();
    }

    public final int zz6e() {
        return this.zzZzB.zz6e();
    }

    public final int zz6f() {
        return this.zzZzB.zz6f();
    }

    public final boolean zzW(boolean z, boolean z2, int i) {
        int i2 = z2 ? this.zzVL : this.zzX6b;
        if ((i2 <= 0 || !z) && (i * 2) + i2 <= 5 && this.zzZzB.zz56() <= 5) {
            return (z2 || (this.zzX6c <= 0 && this.zzZzB.zz6e() <= 5)) && !this.zzX6d.isSet(4);
        }
        return false;
    }

    public final int zzXZg() {
        return Math.max(zzXZi(), this.zzZzB.zz6e());
    }

    public final int zzXZh() {
        return Math.max(zzXZi(), this.zzZzB.zz6f());
    }

    public final int zzXZi() {
        return Math.max(this.zzX6b, this.zzZzB.zz56());
    }

    public final boolean zzXZj() {
        return !this.zzX6e && this.zzX6d.zzZXi();
    }

    public final zzZL8 zzXZk() {
        return this.zzX6d;
    }

    public final boolean zzXZl() {
        return this.zzX6e;
    }

    public final int zzXZm() {
        return this.zzX6c;
    }

    public final boolean zzXZn() {
        return this.zzX6b > 0;
    }

    public final int zzXZo() {
        return this.zzX6b;
    }

    public final void zzk9(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzX6c = i;
        this.zzX6e = true;
    }

    public final void zzka(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzX6b = i;
    }
}
