package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZI9 extends zzZIR {
    private static zzZIR zzZI7;
    private zzZIR zzZI6;

    private zzZI9() {
        super(9, 4);
        this.zzZI6 = zzZIR.zzPE(1004);
    }

    public static final synchronized zzZIR zzcM() {
        try {
            if (zzZI7 == null) {
                zzZI7 = new zzZI9();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzZI7;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof zzZI9);
    }

    @Override // com.aspose.words.internal.zzZIR
    public final float[] zzM(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = 1.0f - fArr[3];
        float[] fArr2 = new float[3];
        fArr2[0] = (1.0f - f) * f4;
        fArr2[1] = (1.0f - f2) * f4;
        fArr2[2] = (1.0f - f3) * f4;
        for (int i = 0; i < 3; i++) {
            float f5 = fArr2[i];
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 < 0.0031308f) {
                fArr2[i] = f5 * 12.92f;
            } else {
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
                fArr2[i] = (float) ((Math.pow(f5, 0.4166666666666667d) * 1.055d) - 0.055d);
            }
        }
        return fArr2;
    }
}
