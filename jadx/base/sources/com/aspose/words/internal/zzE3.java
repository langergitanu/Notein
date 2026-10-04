package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzE3 extends zzDR {
    public zzE3(zzDZ zzdz, zzED zzed, zzHS zzhs, int i) {
        super(zzdz, zzed, zzhs, i);
    }

    private zzP5 zzZ(long j, float f, long j2, float f2) {
        float fZzO = zzJ6.zzO(j, j2);
        float f3 = f - f2;
        if (fZzO <= Math.abs(f3)) {
            return f > f2 ? zzZ(j, f) : zzZ(j2, f2);
        }
        float f4 = f2 / f;
        int i = (int) j2;
        int i2 = (int) j;
        float fIntBitsToFloat = Float.intBitsToFloat(i) - Float.intBitsToFloat(i2);
        float fZzYC = zzZPY.zzYC(j2) - zzZPY.zzYC(j);
        float f5 = fZzO * fZzO;
        float fSqrt = (float) Math.sqrt(f5 - (f3 * f3));
        float f6 = f3 * fIntBitsToFloat;
        float f7 = f3 * fZzYC;
        float f8 = fIntBitsToFloat * fSqrt;
        float f9 = fSqrt * fZzYC;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) + (((f6 - f9) * f) / f5);
        float fZzYC2 = zzZPY.zzYC(j) + (((f7 + f8) * f) / f5);
        float fIntBitsToFloat3 = ((((f6 + f9) * f) / f5) * f4) + Float.intBitsToFloat(i);
        float fZzYC3 = ((((f7 - f8) * f) / f5) * f4) + zzZPY.zzYC(j2);
        zzP5 zzp5 = new zzP5();
        float fZzZ = zzZ(fIntBitsToFloat2, fZzYC2, Float.intBitsToFloat(i2), zzZPY.zzYC(j));
        float fZzZ2 = zzZ(fIntBitsToFloat3, fZzYC3, Float.intBitsToFloat(i), zzZPY.zzYC(j2));
        float f10 = fZzZ2 - fZzZ;
        if (f10 < 0.0f) {
            f10 += 6.2831855f;
        }
        float f11 = f10;
        zzZ(zzp5, fZzZ, f11, Float.intBitsToFloat(i2), zzZPY.zzYC(j), f);
        zzZ(zzp5, fZzZ2, (float) (6.283185307179586d - ((double) f11)), Float.intBitsToFloat(i), zzZPY.zzYC(j2), f2);
        zzp5.zze(true);
        return zzp5;
    }

    private int zzj(float f) {
        return (int) Math.ceil(6.283185307179586d / Math.acos((zzAN.zzg(1.0f - (0.2f / (f / zzDA()))) * 2.0f) - 1.0f));
    }

    @Override // com.aspose.words.internal.zzDR
    public final zzZG zzDw() {
        this.zzvq.moveNext();
        zzZQG.zzZ(zzDb().zzZ0().zzO7(), zzZ(this.zzvq.zzDs(), Float.intBitsToFloat((int) zzDc()) / 2.0f));
        return zzDb();
    }

    @Override // com.aspose.words.internal.zzDR
    public final zzZG zzDx() {
        this.zzvq.moveNext();
        long jZzDs = this.zzvq.zzDs();
        float fIntBitsToFloat = Float.intBitsToFloat((int) zzDc()) / 2.0f;
        while (this.zzvq.moveNext()) {
            long jZzDs2 = this.zzvq.zzDs();
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) zzDc()) / 2.0f;
            OooO00o.OooO00o(zzDb(), zzZ(jZzDs, fIntBitsToFloat, jZzDs2, fIntBitsToFloat2));
            jZzDs = jZzDs2;
            fIntBitsToFloat = fIntBitsToFloat2;
        }
        return this.zzvq.getCount() == 2 ? zzDb() : zzDa();
    }

    private static float zzZ(float f, float f2, float f3, float f4) {
        float fAtan2 = (float) Math.atan2(f2 - f4, f - f3);
        return fAtan2 < 0.0f ? fAtan2 + 6.2831855f : fAtan2;
    }

    private void zzZ(zzP5 zzp5, float f, float f2, float f3, float f4, float f5) {
        int iCeil = (int) Math.ceil((((double) Math.abs(f2)) / 6.283185307179586d) * ((double) zzj(f5)));
        if (iCeil < 3) {
            iCeil = 3;
        }
        float f6 = f2 / iCeil;
        zz0Q zz0q = new zz0Q(iCeil + 1);
        if (zzAN.zzS(6.2831855f, f2)) {
            iCeil--;
        }
        for (int i = 0; i <= iCeil; i++) {
            double d = (i * f6) + f;
            double d2 = f5;
            zz0q.add(zzZPY.zzG((float) ((Math.cos(d) * d2) + ((double) f3)), (float) ((d2 * Math.sin(d)) + ((double) f4))));
        }
        zzp5.zzZ(zz0q, false);
    }

    private zzP5 zzZ(long j, float f) {
        zzP5 zzp5 = new zzP5();
        zzp5.zze(true);
        zzZ(zzp5, 0.0f, 6.2831855f, Float.intBitsToFloat((int) j), zzZPY.zzYC(j), f);
        return zzp5;
    }
}
