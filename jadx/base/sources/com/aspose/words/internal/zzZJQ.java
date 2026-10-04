package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJQ extends zzZJP {
    private static final float zzZLQ = (float) Math.pow(0.008856d, 0.3333333333333333d);

    private static float zzZK(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 100.0f) {
            return 255.0f;
        }
        return f * 2.55f;
    }

    @Override // com.aspose.words.internal.zzZJP
    public final void zzZ(float f, float f2, float f3, float[] fArr) {
        float f4;
        float fPow;
        float f5 = (f * 100.0f) / 255.0f;
        if (f2 > 128.0f) {
            f2 -= 256.0f;
        }
        if (f3 > 128.0f) {
            f3 -= 256.0f;
        }
        if (f5 < 8.0f) {
            f4 = f5 / 903.3f;
            fPow = (f4 * 7.787f) + 0.13793103f;
        } else {
            float f6 = (f5 + 16.0f) / 116.0f;
            f4 = f6 * f6 * f6;
            fPow = (float) Math.pow(f4, 0.3333333333333333d);
        }
        float f7 = f4 * 100.0f;
        float f8 = (f2 / 500.0f) + fPow;
        float f9 = zzZLQ;
        float f10 = f8 <= f9 ? ((f8 - 0.13793103f) * 95.047f) / 7.787f : f8 * 95.047f * f8 * f8;
        float f11 = fPow - (f3 / 200.0f);
        float f12 = f11 <= f9 ? ((f11 - 0.13793103f) * 108.883f) / 7.787f : f11 * 108.883f * f11 * f11;
        fArr[0] = zzZK(((3.240479f * f10) - (1.53715f * f7)) - (0.498535f * f12));
        fArr[1] = zzZK((0.041556f * f12) + (1.875992f * f7) + ((-0.969256f) * f10));
        fArr[2] = zzZK((f12 * 1.057311f) + ((f10 * 0.055648f) - (f7 * 0.204043f)));
    }
}
