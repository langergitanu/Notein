package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzA2 {
    private float zzr7;
    private boolean zzr8;
    private zzA6 zzr9;
    private zzXA<ArrayList<zzZ>> zzra;

    public static class zzZ {
        private zzG zzr5;
        private long zzr6;

        public zzZ(long j, zzG zzg) {
            this.zzr6 = j;
            this.zzr5 = zzg;
        }

        public final zzG zzAd() {
            return this.zzr5;
        }

        public final long zzAe() {
            return this.zzr6;
        }
    }

    public zzA2(zzA6 zza6) {
        this(zza6, false, 0.0f);
    }

    private float zzG(zzG zzg) throws Exception {
        zzZD zzzd = new zzZD();
        zzzd.zzQ(zzg);
        float fZzYV = zzzd.zzYV();
        float f = this.zzr7;
        return Math.min(fZzYV >= f ? (f - 1.0f) / zzzd.zzYV() : 1.0f, zzzd.zzYU() >= 1296.0f ? 1296.0f / zzzd.zzYU() : 1.0f);
    }

    private boolean zzH(zzG zzg) throws Exception {
        return !this.zzr8 || zzG(zzg) >= 1.0f;
    }

    private static long zzZM(long j) {
        int i = (int) j;
        if (i >= 50 && ((int) (j >>> 32)) >= 50) {
            return j;
        }
        int i2 = (int) (j >>> 32);
        int iCeil = (int) Math.ceil(50.0f / Math.min(i, i2));
        return zzZPX.zzZm(i * iCeil, i2 * iCeil);
    }

    public final zzG zzZ(zzZP zzzp, zzP9 zzp9) throws Exception {
        zz8T zz8t = new zz8T(zzzp.getImageBytes());
        long jZzZM = zzZM(zzZ(zzzp.getSize(), zzzp.zzZd(), zzp9, zz8t));
        zzXC zzxc = new zzXC(zzzp.getImageBytes());
        zzZ zzZ2 = zzZ(zzxc, jZzZM);
        if (zzZ2 == null) {
            zzZ zzz = new zzZ(jZzZM, zzA3.zzZ(zz8t, this.zzr9, jZzZM).zzAj());
            zzZ(zzxc, zzz);
            zzZ2 = zzz;
        }
        zzG zzgZzAd = zzZ2.zzAd();
        if (zzgZzAd == null) {
            return null;
        }
        zzG zzg = (zzG) zzgZzAd.zz1();
        zzG zzg2 = new zzG();
        zzZQ4 zzzq4ZzN = zzZQ4.zzN(zz8t.zzyQ());
        if (!zzEP.zzZ(zzzp.zzZd())) {
            zzzq4ZzN = zzzp.zzZd().zzx(zzzq4ZzN);
        }
        if (!zzAN.zzf(zzzq4ZzN.getWidth()) && !zzAN.zzf(zzzq4ZzN.getHeight())) {
            zzg2.zzX((zzZL) zzg);
            zzg2.zzZ(zzP8.zzM(zzzq4ZzN));
            zzg2.zzW(new zzP9());
            zzg2.zzZO().zzY(Float.intBitsToFloat((int) zzzp.zzZT()), zzZPY.zzYC(zzzp.zzZT()), 0);
            zzg2.zzZO().zzZ(Float.intBitsToFloat((int) zzzp.getSize()) / zzzq4ZzN.getWidth(), zzZPW.zzYz(zzzp.getSize()) / zzzq4ZzN.getHeight(), 0);
            zzg2.zzZO().zzY(-zzzq4ZzN.getX(), -zzzq4ZzN.getY(), 0);
            if (this.zzr9.getOptimizeOutput() || !zzH(zzg2)) {
                return zzA7.zzK(zzg2);
            }
        }
        return zzg2;
    }

    public zzA2(zzA6 zza6, boolean z, float f) {
        this.zzra = new zzXA<>();
        this.zzr9 = zza6;
        this.zzr8 = z;
        this.zzr7 = f;
    }

    private long zzZ(long j, zzEP zzep, zzP9 zzp9, zz8T zz8t) {
        if (!this.zzr9.getEmulateRenderingToSizeOnPage() || !zz8t.zzyM()) {
            return zz8t.zzyQ().getSize();
        }
        if (zzp9 == null) {
            return zz8t.zzyQ().getSize();
        }
        float[] fArrZzOs = zzp9.zzOs();
        float fAbs = Math.abs(fArrZzOs[0]) * Float.intBitsToFloat((int) j);
        float fAbs2 = Math.abs(fArrZzOs[1]) * zzZPW.zzYz(j);
        double emulateRenderingToSizeOnPageResolution = (((double) fAbs) / 72.0d) * ((double) this.zzr9.getEmulateRenderingToSizeOnPageResolution());
        double emulateRenderingToSizeOnPageResolution2 = (((double) fAbs2) / 72.0d) * ((double) this.zzr9.getEmulateRenderingToSizeOnPageResolution());
        if (!zzEP.zzZ(zzep)) {
            emulateRenderingToSizeOnPageResolution /= (1.0d - zzep.getCropLeft()) - zzep.getCropRight();
            emulateRenderingToSizeOnPageResolution2 /= (1.0d - zzep.getCropTop()) - zzep.getCropBottom();
        }
        return zzZPX.zzZm(zzAN.zzZG(emulateRenderingToSizeOnPageResolution), zzAN.zzZG(emulateRenderingToSizeOnPageResolution2));
    }

    private zzZ zzZ(zzXC zzxc, long j) {
        ArrayList<zzZ> arrayListZzX = this.zzra.zzX(zzxc);
        if (arrayListZzX == null) {
            arrayListZzX = new ArrayList<>();
            this.zzra.zzY(zzxc, arrayListZzX);
        }
        for (zzZ zzz : arrayListZzX) {
            if (zzZPX.zzD(zzz.zzAe(), j)) {
                return zzz;
            }
        }
        return null;
    }

    private void zzZ(zzXC zzxc, zzZ zzz) {
        zzZQG.zzZ(this.zzra.zzX(zzxc), zzz);
    }
}
