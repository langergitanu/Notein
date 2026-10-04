package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzIQ {
    private float zzHn;
    private int zzyo;
    private float zzyp;
    private float zzyq;

    public zzIQ() {
    }

    public static zzPV zzZ(zzPV zzpv, float f) {
        zzIQ zziq = new zzIQ(zzpv);
        float f2 = zziq.zzHn + f;
        zziq.zzHn = f2;
        zziq.zzHn = zzAN.zzZ(f2, 0.0f, 255.0f);
        return zziq.zzGx();
    }

    public final float zzGA() {
        return this.zzyq;
    }

    public final zzPV zzGx() {
        double d;
        double d2;
        double d3;
        float f = this.zzHn;
        double d4 = f;
        double d5 = f;
        double d6 = f;
        float f2 = this.zzyp;
        if (f2 != 0.0f) {
            d2 = f;
            double d7 = (f2 * f) / 255.0f;
            double d8 = ((double) f) - d7;
            double d9 = (this.zzyq * 360.0f) / 255.0f;
            if (d9 < 60.0d) {
                d = d2;
                d2 = ((d9 * d7) / 60.0d) + d8;
            } else if (d9 < 120.0d) {
                d = (((-(d9 - 120.0d)) * d7) / 60.0d) + d8;
            } else {
                if (d9 < 180.0d) {
                    d3 = (((d9 - 120.0d) * d7) / 60.0d) + d8;
                } else if (d9 < 240.0d) {
                    d3 = d2;
                    d2 = (((-(d9 - 240.0d)) * d7) / 60.0d) + d8;
                } else {
                    if (d9 < 300.0d) {
                        d = (((d9 - 240.0d) * d7) / 60.0d) + d8;
                        d3 = d2;
                    } else if (d9 <= 360.0d) {
                        d3 = (((-(d9 - 360.0d)) * d7) / 60.0d) + d8;
                        d = d2;
                    } else {
                        d2 = 0.0d;
                        d = 0.0d;
                        d3 = 0.0d;
                    }
                    d2 = d8;
                }
                d = d8;
            }
            d3 = d8;
        } else {
            d = d4;
            d2 = d5;
            d3 = d6;
        }
        return new zzPV(this.zzyo, zzAN.zzZG(zzAN.zzR(d, 0.0d, 255.0d)), zzAN.zzZG(zzAN.zzR(d2, 0.0d, 255.0d)), zzAN.zzZG(zzAN.zzR(d3, 0.0d, 255.0d)));
    }

    public final float zzGy() {
        return this.zzHn;
    }

    public final float zzGz() {
        return this.zzyp;
    }

    public final int zzPD() {
        return this.zzyo;
    }

    public final void zzo(float f) {
        this.zzHn = f;
    }

    public zzIQ(int i, float f, float f2, float f3) {
        this.zzyo = i;
        this.zzyq = zzAN.zzZ(f, 0.0f, 255.0f);
        this.zzyp = zzAN.zzZ(f2, 0.0f, 255.0f);
        this.zzHn = zzAN.zzZ(f3, 0.0f, 255.0f);
    }

    public zzIQ(zzPV zzpv) {
        this.zzyo = zzpv.zzPD();
        this.zzyq = 0.0f;
        this.zzyp = 0.0f;
        this.zzHn = 0.0f;
        float fZzPC = zzpv.zzPC();
        float fZzPB = zzpv.zzPB();
        float fZzPA = zzpv.zzPA();
        float fMax = Math.max(fZzPC, Math.max(fZzPB, fZzPA));
        if (fMax <= 0.0f) {
            return;
        }
        float fMin = Math.min(fZzPC, Math.min(fZzPB, fZzPA));
        float f = fMax - fMin;
        if (fMax > fMin) {
            if (fZzPB == fMax) {
                this.zzyq = (((fZzPA - fZzPC) / f) * 60.0f) + 120.0f;
            } else if (fZzPA == fMax) {
                this.zzyq = (((fZzPC - fZzPB) / f) * 60.0f) + 240.0f;
            } else if (fZzPA > fZzPB) {
                this.zzyq = (((fZzPB - fZzPA) / f) * 60.0f) + 360.0f;
            } else {
                this.zzyq = ((fZzPB - fZzPA) / f) * 60.0f;
            }
            float f2 = this.zzyq;
            if (f2 < 0.0f) {
                this.zzyq = f2 + 360.0f;
            }
        } else {
            this.zzyq = 0.0f;
        }
        this.zzyq *= 0.7083333f;
        this.zzyp = (f / fMax) * 255.0f;
        this.zzHn = fMax;
    }
}
