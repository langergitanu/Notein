package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIT extends zzZIR {
    public zzZIT(int i) {
        super(getType(i), i);
    }

    private static int getType(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("numComponents < 1!");
        }
        if (i != 1) {
            return i + 10;
        }
        return 6;
    }

    @Override // com.aspose.words.internal.zzZIR
    public final float[] zzM(float[] fArr) {
        if (fArr.length < zzd4()) {
            throw new ArrayIndexOutOfBoundsException("colorvalue.length < getNumComponents()");
        }
        System.arraycopy(fArr, 0, new float[3], 0, Math.min(3, zzd4()));
        return fArr;
    }
}
