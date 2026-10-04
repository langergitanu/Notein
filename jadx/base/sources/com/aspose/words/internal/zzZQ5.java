package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQ5 {
    public static final zzZQ5 zz2U = new zzZQ5();
    private int height;
    private int width;

    /* JADX INFO: renamed from: x */
    private int f51317x;

    /* JADX INFO: renamed from: y */
    private int f51318y;

    public zzZQ5() {
        this.f51317x = 0;
        this.f51318y = 0;
        this.width = 0;
        this.height = 0;
    }

    public static Rect zzO(zzZQ5 zzzq5) {
        if (zzzq5 == null) {
            return null;
        }
        return zzzq5.zzkx();
    }

    public static zzZQ5 zzT(int i, int i2, int i3, int i4) {
        return new zzZQ5(i, i2, i3 - i, i4 - i2);
    }

    public static zzZQ5 zzY(zzZQ5 zzzq5, zzZQ5 zzzq52) {
        int iMax = Math.max(zzzq5.f51317x, zzzq52.f51317x);
        int iMax2 = Math.max(zzzq5.f51318y, zzzq52.f51318y);
        int iMin = Math.min(zzzq5.getRight(), zzzq52.getRight());
        int iMin2 = Math.min(zzzq5.getBottom(), zzzq52.getBottom());
        return (iMin < iMax || iMin2 < iMax2) ? zz2U : zzT(iMax, iMax2, iMin, iMin2);
    }

    private static boolean zzZ(zzZQ5 zzzq5, zzZQ5 zzzq52) {
        if (zzzq5 == zzzq52) {
            return true;
        }
        return zzzq5 != null && zzzq52 != null && zzzq5.f51317x == zzzq52.f51317x && zzzq5.f51318y == zzzq52.f51318y && zzzq5.width == zzzq52.width && zzzq5.height == zzzq52.height;
    }

    public static zzZQ5 zzb(zzZQ4 zzzq4) {
        return new zzZQ5(Math.round(zzzq4.getX()), Math.round(zzzq4.getY()), Math.round(zzzq4.getWidth()), Math.round(zzzq4.getHeight()));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzZQ5) && zzZ(this, (zzZQ5) obj);
    }

    public final int getBottom() {
        return this.f51318y + this.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.f51317x;
    }

    public final int getRight() {
        return this.f51317x + this.width;
    }

    public final long getSize() {
        return zzZPX.zzZm(this.width, this.height);
    }

    public final int getTop() {
        return this.f51318y;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.f51317x;
    }

    public final int getY() {
        return this.f51318y;
    }

    public final int hashCode() {
        long j = this.f51317x;
        int i = this.f51318y;
        long j2 = j ^ ((((long) i) << 13) | (((long) i) >> 19));
        int i2 = this.width;
        long j3 = j2 ^ ((((long) i2) << 26) | (((long) i2) >> 6));
        int i3 = this.height;
        return (int) (j3 ^ ((((long) i3) << 7) | (((long) i3) >> 25)));
    }

    public final boolean isEmpty() {
        return this.height == 0 && this.width == 0 && this.f51317x == 0 && this.f51318y == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{X=");
        sb.append(this.f51317x);
        sb.append(",Y=");
        sb.append(this.f51318y);
        sb.append(",Width=");
        sb.append(this.width);
        sb.append(",Height=");
        return C21023OooO0Oo.OooO0OO("}", this.height, sb);
    }

    public final boolean zzP(zzZQ5 zzzq5) {
        int i = zzzq5.f51317x;
        int i2 = this.f51317x;
        if (i >= this.width + i2 || i2 >= i + zzzq5.width) {
            return false;
        }
        int i3 = zzzq5.f51318y;
        int i4 = this.f51318y;
        return i3 < this.height + i4 && i4 < i3 + zzzq5.height;
    }

    public final boolean zzQ(zzZQ5 zzzq5) {
        int i;
        int i2;
        int i3 = this.f51317x;
        int i4 = zzzq5.f51317x;
        return i3 <= i4 && i4 + zzzq5.width <= i3 + this.width && (i = this.f51318y) <= (i2 = zzzq5.f51318y) && i2 + zzzq5.height <= i + this.height;
    }

    public final long zzZE() {
        return zzZPZ.zzZm(this.f51317x, this.f51318y);
    }

    public final Rect zzkx() {
        int i = this.f51317x;
        int i2 = this.f51318y;
        return new Rect(i, i2, this.width + i, this.height + i2);
    }

    public zzZQ5(int i, int i2, int i3, int i4) {
        this.f51317x = i;
        this.f51318y = i2;
        this.width = i3;
        this.height = i4;
    }

    public zzZQ5(long j, long j2) {
        this.f51317x = (int) j;
        this.f51318y = (int) (j >> 32);
        this.width = (int) j2;
        this.height = (int) (j2 >>> 32);
    }
}
