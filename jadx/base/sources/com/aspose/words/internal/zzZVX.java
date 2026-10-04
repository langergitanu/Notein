package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZVX {
    private float[] zz7R;
    private float[] zz7S;
    private float zz7T;
    private float zz7U;
    private float zz7V;
    private float zz7W;
    private float zz7X;
    private float zz7Y;
    private float zz7Z;
    private float zz80;

    public zzZVX(float f, float f2, float f3) {
        this.zz80 = f3;
        this.zz7Y = f3;
        this.zz7Z = f3 * 2.0f;
        this.zz7X = f3;
        this.zz7W = f3 / 2.0f;
        float f4 = (f2 / 4.0f) + (f / 2.0f);
        float f5 = f4 - (f3 / 2.0f);
        this.zz7V = f5;
        this.zz7U = f4;
        this.zz7T = f5;
        this.zz7S = new float[]{f4 - (f3 / 2.0f), (1.5f * f3) + f4};
        this.zz7R = new float[]{f4 - f3, f4};
    }

    public final float[] zznF() {
        return this.zz7R;
    }

    public final float[] zznG() {
        return this.zz7S;
    }

    public final float zznH() {
        return this.zz7T;
    }

    public final float zznI() {
        return this.zz7U;
    }

    public final float zznJ() {
        return this.zz7V;
    }

    public final float zznK() {
        return this.zz7W;
    }

    public final float zznL() {
        return this.zz7X;
    }

    public final float zznM() {
        return this.zz7Y;
    }

    public final float zznN() {
        return this.zz7Z;
    }

    public final float zznO() {
        return this.zz80;
    }

    public zzZVX(float f, float f2) {
        this.zz80 = f2;
        float f3 = f + f2;
        float f4 = f / 2.0f;
        float f5 = f2 / 2.0f;
        this.zz7Y = f5;
        float f6 = f5 / 2.0f;
        this.zz7W = f6;
        float f7 = (f3 - f4) - f5;
        this.zz7Z = f7;
        float f8 = f7 / 2.0f;
        this.zz7X = f8;
        this.zz7V = f3 - (f2 / 2.0f);
        this.zz7U = (f7 / 2.0f) + f4;
        this.zz7T = (f8 / 2.0f) + f4;
        float[] fArr = {(f5 / 2.0f) + f4, f3 - (f5 / 2.0f)};
        this.zz7S = fArr;
        if (f5 < 0.75f) {
            float f9 = (0.75f - f5) / 2.0f;
            fArr[0] = fArr[0] - f9;
            fArr[1] = fArr[1] + f9;
        }
        this.zz7R = new float[]{(f6 / 2.0f) + f4, (f6 * 2.0f) + f4};
    }
}
