package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzT7 {
    private int[] zzQi;
    private float[] zzQj;

    public zzT7(float[] fArr, int[] iArr) {
        int i;
        boolean z;
        if (fArr.length != iArr.length) {
            throw new IllegalArgumentException("Colors and positions must have equal size");
        }
        if (iArr.length < 2) {
            throw new IllegalArgumentException("User must specify at least 2 colors");
        }
        for (float f : fArr) {
            if (f < 0.0f || f > 1.0f) {
                throw new IllegalArgumentException("Fraction values must be in the range 0 to 1: " + f);
            }
        }
        int length = fArr.length;
        if (fArr[0] != 0.0f) {
            length++;
            i = 1;
        } else {
            i = 0;
        }
        int i2 = i;
        if (fArr[fArr.length - 1] != 1.0f) {
            length++;
            z = true;
        } else {
            z = false;
        }
        float[] fArr2 = new float[length];
        this.zzQj = fArr2;
        System.arraycopy(fArr, 0, fArr2, i2, fArr.length);
        int[] iArr2 = new int[length];
        this.zzQi = iArr2;
        System.arraycopy(iArr, 0, iArr2, i2, iArr.length);
        if (i != 0) {
            this.zzQj[0] = 0.0f;
            this.zzQi[0] = iArr[0];
        }
        if (z) {
            int i3 = length - 1;
            this.zzQj[i3] = 1.0f;
            this.zzQi[i3] = iArr[iArr.length - 1];
        }
    }

    public final int[] getColors() {
        return this.zzQi;
    }

    public final float[] zzTs() {
        return this.zzQj;
    }
}
