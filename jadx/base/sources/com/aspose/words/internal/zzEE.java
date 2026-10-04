package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzEE implements zzGM {
    private float zzw1;
    private int zzw0 = 12700;
    private float zzw4 = Float.NaN;
    private float zzw2 = Float.NaN;
    private float zzw3 = Float.NaN;
    private boolean zzw5 = false;

    private zzEE(int i) {
    }

    private void zzY(zzDL zzdl) {
        zzDZ zzdz = new zzDZ(zzdl, this.zzw0);
        while (zzdz.moveNext()) {
            long jZzDs = zzdz.zzDs();
            if (!this.zzw5) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) jZzDs);
                this.zzw3 = fIntBitsToFloat;
                this.zzw4 = fIntBitsToFloat;
                float fZzYC = zzZPY.zzYC(jZzDs);
                this.zzw1 = fZzYC;
                this.zzw2 = fZzYC;
                this.zzw5 = true;
            }
            int i = (int) jZzDs;
            if (Float.intBitsToFloat(i) < this.zzw3) {
                this.zzw3 = Float.intBitsToFloat(i);
            } else if (Float.intBitsToFloat(i) > this.zzw4) {
                this.zzw4 = Float.intBitsToFloat(i);
            }
            if (zzZPY.zzYC(jZzDs) < this.zzw1) {
                this.zzw1 = zzZPY.zzYC(jZzDs);
            } else if (zzZPY.zzYC(jZzDs) > this.zzw2) {
                this.zzw2 = zzZPY.zzYC(jZzDs);
            }
        }
    }

    public static zzZQ4 zzZ(zzDW zzdw) {
        zzEE zzee = new zzEE(12700);
        zzdw.zzZ(zzee);
        float f = zzee.zzw3;
        float f2 = zzee.zzw1;
        return new zzZQ4(f, f2, zzee.zzw4 - f, zzee.zzw2 - f2);
    }

    @Override // com.aspose.words.internal.zzGM
    public final void zzZ(zzDL zzdl) {
        zzY(zzdl);
    }
}
