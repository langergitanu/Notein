package com.aspose.words.internal;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQ4 {
    public static final zzZQ4 zz2T = new zzZQ4();
    private float height;
    private float width;

    /* JADX INFO: renamed from: x */
    private float f51315x;

    /* JADX INFO: renamed from: y */
    private float f51316y;

    public zzZQ4() {
        this.f51315x = 0.0f;
        this.f51316y = 0.0f;
        this.width = 0.0f;
        this.height = 0.0f;
    }

    private boolean contains(float f, float f2) {
        float f3 = this.f51315x;
        if (f3 > f || f >= f3 + this.width) {
            return false;
        }
        float f4 = this.f51316y;
        return f4 <= f2 && f2 < f4 + this.height;
    }

    public static RectF zz8(zzZQ4 zzzq4) {
        if (zzzq4 == null) {
            return null;
        }
        return zzzq4.zzku();
    }

    public static zzZQ4 zzN(zzZQ5 zzzq5) {
        return new zzZQ4(zzzq5.getX(), zzzq5.getY(), zzzq5.getWidth(), zzzq5.getHeight());
    }

    public static zzZQ4 zzT(zzZQ4 zzzq4, zzZQ4 zzzq42) {
        return zzX(Math.min(zzzq4.f51315x, zzzq42.f51315x), Math.min(zzzq4.f51316y, zzzq42.f51316y), Math.max(zzzq4.zzkw(), zzzq42.zzkw()), Math.max(zzzq4.zzZn(), zzzq42.zzZn()));
    }

    public static zzZQ4 zzU(zzZQ4 zzzq4, zzZQ4 zzzq42) {
        float fMax = Math.max(zzzq4.f51315x, zzzq42.f51315x);
        float fMax2 = Math.max(zzzq4.f51316y, zzzq42.f51316y);
        float fMin = Math.min(zzzq4.zzkw(), zzzq42.zzkw());
        float fMin2 = Math.min(zzzq4.zzZn(), zzzq42.zzZn());
        return (fMin < fMax || fMin2 < fMax2) ? zz2T : zzX(fMax, fMax2, fMin, fMin2);
    }

    public static boolean zzV(zzZQ4 zzzq4, zzZQ4 zzzq42) {
        if (zzzq4 == zzzq42) {
            return true;
        }
        return zzzq4 != null && zzzq42 != null && zzzq4.f51315x == zzzq42.f51315x && zzzq4.f51316y == zzzq42.f51316y && zzzq4.width == zzzq42.width && zzzq4.height == zzzq42.height;
    }

    public static zzZQ4 zzX(float f, float f2, float f3, float f4) {
        return new zzZQ4(f, f2, f3 - f, f4 - f2);
    }

    public static zzZQ4 zzZ(RectF rectF) {
        return new zzZQ4(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private RectF zzku() {
        float f = this.f51315x;
        float f2 = this.f51316y;
        return new RectF(f, f2, this.width + f, this.height + f2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzZQ4) && zzV(this, (zzZQ4) obj);
    }

    public final float getHeight() {
        return this.height;
    }

    public final long getSize() {
        return zzZPW.zzG(this.width, this.height);
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.f51315x;
    }

    public final float getY() {
        return this.f51316y;
    }

    public final int hashCode() {
        long j = (long) this.f51315x;
        float f = this.f51316y;
        long j2 = j ^ ((((long) f) << 13) | (((long) f) >> 19));
        float f2 = this.width;
        long j3 = j2 ^ ((((long) f2) << 26) | (((long) f2) >> 6));
        float f3 = this.height;
        return (int) (j3 ^ ((((long) f3) << 7) | (((long) f3) >> 25)));
    }

    public final boolean isEmpty() {
        return this.width <= 0.0f || this.height <= 0.0f;
    }

    public final void offset(float f, float f2) {
        this.f51315x += f;
        this.f51316y += f2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{X=");
        sb.append(this.f51315x);
        sb.append(",Y=");
        sb.append(this.f51316y);
        sb.append(",Width=");
        sb.append(this.width);
        sb.append(",Height=");
        return Oooo00o.OooO0OO.OooO0OO(sb, this.height, "}");
    }

    public final boolean zz9(zzZQ4 zzzq4) {
        float f = zzzq4.f51315x;
        float f2 = this.f51315x;
        if (f >= this.width + f2 || f2 >= f + zzzq4.width) {
            return false;
        }
        float f3 = zzzq4.f51316y;
        float f4 = this.f51316y;
        return f3 < this.height + f4 && f4 < f3 + zzzq4.height;
    }

    public final void zzH(float f, float f2) {
        this.f51315x -= f;
        this.f51316y -= f2;
        this.width = (f * 2.0f) + this.width;
        this.height = (f2 * 2.0f) + this.height;
    }

    public final boolean zzYG(long j) {
        return contains(Float.intBitsToFloat((int) j), zzZPY.zzYC(j));
    }

    public final long zzZE() {
        return zzZPY.zzG(this.f51315x, this.f51316y);
    }

    public final float zzZm() {
        return this.f51315x;
    }

    public final float zzZn() {
        return this.f51316y + this.height;
    }

    public final float zzZo() {
        return this.f51316y;
    }

    public final boolean zza(zzZQ4 zzzq4) {
        float f = this.f51315x;
        float f2 = zzzq4.f51315x;
        if (f > f2 || f2 + zzzq4.width > f + this.width) {
            return false;
        }
        float f3 = this.f51316y;
        float f4 = zzzq4.f51316y;
        return f3 <= f4 && f4 + zzzq4.height <= f3 + this.height;
    }

    public final zzZQ5 zzkv() {
        return new zzZQ5((int) this.f51315x, (int) this.f51316y, (int) this.width, (int) this.height);
    }

    public final float zzkw() {
        return this.f51315x + this.width;
    }

    public static zzZQ4 zzX(zzZQ4 zzzq4, float f, float f2) {
        return new zzZQ4(zzzq4.f51315x - f, zzzq4.f51316y - f2, (f * 2.0f) + zzzq4.width, (f2 * 2.0f) + zzzq4.height);
    }

    public zzZQ4(float f, float f2, float f3, float f4) {
        this.f51315x = f;
        this.f51316y = f2;
        this.width = f3;
        this.height = f4;
    }

    public zzZQ4(long j, long j2) {
        this.f51315x = Float.intBitsToFloat((int) j);
        this.f51316y = zzZPY.zzYC(j);
        this.width = Float.intBitsToFloat((int) j2);
        this.height = zzZPW.zzYz(j2);
    }
}
