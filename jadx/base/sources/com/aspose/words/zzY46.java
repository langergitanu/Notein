package com.aspose.words;

import com.aspose.words.internal.C22243OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY46 {
    private static com.aspose.words.internal.zzD3<float[]> zzZCg;
    private float zzX0S;
    private com.aspose.words.internal.zzPV zzX0T;
    private com.aspose.words.internal.zzPV zzX0U;
    private zzZ62 zzX0V;
    private float zzXnF;
    private Font zzZEt;
    private com.aspose.words.internal.zzPV zzZf;

    static {
        com.aspose.words.internal.zzD3<float[]> zzd3 = new com.aspose.words.internal.zzD3<>();
        zzZCg = zzd3;
        zzd3.add(4, new float[]{1.5f, 1.5f});
        zzZCg.add(20, new float[]{1.5f, 1.5f});
        zzZCg.add(7, new float[]{6.0f, 3.0f});
        zzZCg.add(23, new float[]{6.0f, 3.0f});
        zzZCg.add(9, new float[]{6.0f, 1.5f, 1.5f, 1.5f});
        zzZCg.add(25, new float[]{6.0f, 1.5f, 1.5f, 1.5f});
        zzZCg.add(10, new float[]{4.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f});
        zzZCg.add(26, new float[]{4.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f});
        zzZCg.add(39, new float[]{12.0f, 6.0f});
        zzZCg.add(55, new float[]{12.0f, 6.0f});
    }

    public zzY46(zzZ62 zzz62, Font font, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2, com.aspose.words.internal.zzPV zzpv3, float f, float f2) {
        this.zzX0V = zzz62;
        this.zzZEt = font;
        this.zzZf = zzpv;
        this.zzX0U = zzpv2;
        this.zzX0T = zzpv3;
        this.zzXnF = f;
        this.zzX0S = f2;
    }

    private float[] zzXT(float f) {
        if (this.zzZEt.getHidden()) {
            return new float[]{1.0f, 2.0f};
        }
        float[] fArr = zzZCg.get(this.zzZEt.getUnderline());
        if (fArr == null) {
            return null;
        }
        int length = fArr.length;
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        if (f > 1.0f) {
            for (int i = 0; i < length; i++) {
                fArr2[i] = fArr2[i] / f;
            }
        }
        return fArr2;
    }

    private void zzY(long j, long j2, com.aspose.words.internal.zzPV zzpv, zzZ71 zzz71) throws Exception {
        float fZzXUg = this.zzZEt.getHidden() ? 1.0f : this.zzX0V.zzYRs().zzXUg();
        com.aspose.words.internal.zzOU zzou = new com.aspose.words.internal.zzOU(zzpv, fZzXUg);
        float[] fArrZzXT = zzXT(fZzXUg);
        if (fArrZzXT != null) {
            zzou.zzW(fArrZzXT);
            zzou.zzz(zze(Float.intBitsToFloat((int) j), fZzXUg));
        }
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(zzz71.zzXB(j), zzz71.zzXB(j2));
        zzzgZzZ.zzX(zzou);
        zzZ(zzz71, zzzgZzZ);
    }

    private void zzZ(float f, zzZ71 zzz71) throws Exception {
        long jZzG = com.aspose.words.internal.zzZPY.zzG(this.zzXnF, f);
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(this.zzX0S, f);
        if (this.zzZEt.getShadow()) {
            float fZzYu = zzZ5G.zzYu((float) this.zzZEt.getSize());
            zzZ(C22243OooO0Oo.OooO00o(fZzYu, Float.intBitsToFloat((int) jZzG) + fZzYu, jZzG), C22243OooO0Oo.OooO00o(fZzYu, Float.intBitsToFloat((int) jZzG2) + fZzYu, jZzG2), this.zzX0U, zzz71);
        } else if (this.zzZEt.getEngrave() || this.zzZEt.getEmboss()) {
            if (this.zzX0T.isEmpty()) {
                this.zzX0T = com.aspose.words.internal.zzPV.zzI5;
            }
            com.aspose.words.internal.zzPV zzpvZz0 = zzZ5G.zz0(this.zzX0T);
            com.aspose.words.internal.zzPV zzpvZzZZ = zzZ5G.zzZZ(this.zzX0T);
            float f2 = this.zzZEt.getEngrave() ? 0.8f : -0.8f;
            int i = (int) jZzG;
            int i2 = (int) jZzG2;
            zzZ(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i) - f2, com.aspose.words.internal.zzZPY.zzYC(jZzG) - f2), com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i2) - f2, com.aspose.words.internal.zzZPY.zzYC(jZzG2) - f2), zzpvZz0, zzz71);
            zzZ(C22243OooO0Oo.OooO00o(f2, Float.intBitsToFloat(i) + f2, jZzG), C22243OooO0Oo.OooO00o(f2, Float.intBitsToFloat(i2) + f2, jZzG2), zzpvZzZZ, zzz71);
        }
        zzZ(jZzG, jZzG2, this.zzZf, zzz71);
    }

    private float zze(float f, float f2) {
        if (this.zzZEt.getHidden()) {
            return 0.0f;
        }
        return (f % zzjp(this.zzZEt.getUnderline())) / f2;
    }

    private static float zzjp(int i) {
        if (i == 4) {
            return 3.0f;
        }
        if (i == 7) {
            return 9.0f;
        }
        if (i == 20) {
            return 3.0f;
        }
        if (i == 23) {
            return 9.0f;
        }
        float f = 18.0f;
        if (i != 39 && i != 55) {
            f = 10.5f;
            if (i != 9) {
                if (i == 10) {
                    return 12.0f;
                }
                if (i == 25) {
                    return 10.5f;
                }
                if (i == 26) {
                    return 12.0f;
                }
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: underline");
            }
        }
        return f;
    }

    public final void zzS(zzZ71 zzz71) throws Exception {
        if (this.zzZEt.getHidden() || !zzY4A.zzjr(this.zzZEt.getUnderline())) {
            zzZ(this.zzX0V.zzYRt() + this.zzX0V.zzYRs().zzXUf(), zzz71);
            return;
        }
        for (int i = 0; i < 2; i++) {
            zzZ(this.zzX0V.zzYRt() + this.zzX0V.zzYRs().zzXUe()[i], zzz71);
        }
    }

    private void zzZ(long j, long j2, com.aspose.words.internal.zzPV zzpv, zzZ71 zzz71) throws Exception {
        if (!this.zzZEt.getHidden() && zzY4A.zzjq(this.zzZEt.getUnderline())) {
            zzZ(j, j2, zzpv, zzz71, this.zzZEt.getUnderline());
        } else {
            zzY(j, j2, zzpv, zzz71);
        }
    }

    private void zzZ(long j, long j2, com.aspose.words.internal.zzPV zzpv, zzZ71 zzz71, int i) throws Exception {
        long jZzXB = zzz71.zzXB(j);
        long jZzXB2 = zzz71.zzXB(j2);
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(new com.aspose.words.internal.zzOU(zzpv, i == 27 ? 1.0f : 0.25f));
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        zzp5.zze(false);
        com.aspose.words.internal.OooO00o.OooO00o(zzzg, zzp5);
        int i2 = (int) jZzXB;
        int iIntBitsToFloat = (int) ((Float.intBitsToFloat((int) jZzXB2) - Float.intBitsToFloat(i2)) / 2.0f);
        float[] fArr = new float[(iIntBitsToFloat + 1) * 2];
        fArr[0] = Float.intBitsToFloat(i2);
        fArr[1] = com.aspose.words.internal.zzZPY.zzYC(jZzXB);
        float fZzXUg = this.zzX0V.zzYRs().zzXUg();
        for (int i3 = 0; i3 < iIntBitsToFloat; i3++) {
            int i4 = i3 * 2;
            fArr[i4 + 2] = (i3 * 2.0f) + Float.intBitsToFloat(i2);
            if (com.aspose.words.internal.zzAN.zzZP(i3)) {
                fArr[i4 + 3] = com.aspose.words.internal.zzZPY.zzYC(jZzXB) - (fZzXUg / 2.0f);
            } else {
                fArr[i4 + 3] = (fZzXUg / 2.0f) + com.aspose.words.internal.zzZPY.zzYC(jZzXB);
            }
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) zzp5.zzNY(), new com.aspose.words.internal.zzOS(fArr));
        zzZ(zzz71, zzzg);
    }

    private void zzZ(zzZ71 zzz71, com.aspose.words.internal.zzZG zzzg) throws Exception {
        if (this.zzX0V.zzYRr() != null) {
            zzz71.zzS(this.zzX0V.zzYRr().zzx(zzzg));
        } else {
            zzz71.zzS(zzzg);
        }
    }
}
