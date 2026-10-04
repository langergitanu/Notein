package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzSQ extends zzSO {
    private boolean zzP9;
    private zzP5 zzPa;
    private zzOU zzPb;
    private int zzPc;
    private float zzPd;

    private zzOU zzSd() {
        if (this.zzPb == null) {
            zzOU zzouZzNP = zzSe().zzNP();
            this.zzPb = zzouZzNP;
            zzouZzNP.zzW(zzZ(zzSf(), this.zzPb));
        }
        return this.zzPb;
    }

    private zzOU zzSe() {
        return zzS0().zzRV().zzZ2();
    }

    private zzOU zzSf() {
        return zzS0().zzRJ().zzZ2();
    }

    private void zzSg() {
        if (this.zzPa.zzNY().size() <= 0) {
            return;
        }
        zzZG zzzg = new zzZG(zzSd());
        zzZQG.zzZ(zzzg.zzZ0().zzO7(), this.zzPa);
        zzZQG.zzZ(zzRZ(), zzzg);
        this.zzPa = new zzP5();
    }

    private void zzW(zzOS zzos, zzOS zzos2) {
        zzP5 zzp5 = new zzP5();
        zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), zzos);
        zzZG zzzg = new zzZG(zzSe());
        zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
        zzZQG.zzZ(zzRZ(), zzzg);
        zzS0().zzV(zzos, zzos2);
    }

    private int zzm(boolean z) {
        if (z && zzS0().zzRS()) {
            return this.zzPc;
        }
        return 0;
    }

    @Override // com.aspose.words.internal.zzSO
    public final void zzX(zzOS zzos, zzOS zzos2) {
    }

    @Override // com.aspose.words.internal.zzSO, com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        zzSg();
        if (zzp5.isClosed() && zzS0().zzRR() && zzS0().zzRS() && this.zzP9) {
            zzX(zzS0().zzRQ());
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzSO, com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        zzS0().zzYH(zzS0().zzRL() + 1);
        for (zzPZ zzpz2 : zzZ(zzpz, zzS0().zzRW().zzn1())) {
            zzZQG.zzZ((ArrayList<zzPZ>) this.zzPa.zzNY(), zzpz2);
        }
        return true;
    }

    private void zzX(zzOS zzos) {
        zzOS zzos2 = (zzOS) zzZKW.zzZ(zzS0().zzRT(), zzOS.class);
        if (zzos2 == null) {
            return;
        }
        zzCY.zzU(zzos, zzos2);
        zzos2.zzNu().zzR(zzos.zzNu());
    }

    @Override // com.aspose.words.internal.zzSO
    public final void zzY(ArrayList<zzZG> arrayList, zzZG zzzg) {
        new zzSQ().zzX(arrayList, zzzg);
    }

    @Override // com.aspose.words.internal.zzSO, com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        zzS0().zzYH(zzS0().zzRL() + 1);
        zzY(zzos, zzS0().zzRW().zzn1());
        zzSg();
        return true;
    }

    @Override // com.aspose.words.internal.zzSO
    public final zzZG zzY(zzZG zzzg, zzZV4 zzzv4) {
        return new zzZG();
    }

    @Override // com.aspose.words.internal.zzSO
    public final zzOS zzY(zzOS zzos, float f) {
        int i = 0;
        while (i < zzos.zzNu().getCount()) {
            boolean z = i == zzos.zzNu().getCount() - 1;
            int i2 = z ? 0 : i + 1;
            if (!(zzS0().zzRN() && zzS0().zzRK() == 1) && z) {
                break;
            }
            zzZ(new zzOS(zzos.zzNu().get(i), zzos.zzNu().get(i2)), f);
            i++;
        }
        return zzos;
    }

    @Override // com.aspose.words.internal.zzSO
    public final ArrayList<zzZG> zzZ(zzZG zzzg, zzZV4 zzzv4) {
        try {
            zzZ(new zzSN(zzzg, zzzv4));
            this.zzPb = null;
            this.zzPa = new zzP5();
            zzX(new ArrayList<>());
            this.zzPd = 0.0f;
            this.zzPc = 0;
            if (zzSe().getWidth() < 1.0f) {
                zzSe().setWidth(1.0f);
            }
            zzzg.zzZ0().zzY(this);
            return zzRZ();
        } catch (Exception unused) {
            ArrayList<zzZG> arrayList = new ArrayList<>();
            arrayList.add(new zzZG());
            return arrayList;
        }
    }

    private void zzY(zzOS zzos) {
        float f;
        zzSQ zzsq = this;
        if (zzos.zzNu().getCount() < 2) {
            return;
        }
        int count = zzos.zzNu().getCount() - 1;
        long j = zzos.zzNu().get(0);
        long j2 = zzos.zzNu().get(count);
        float fZzO = zzJ6.zzO(j, j2);
        boolean z = true;
        for (float f2 = 0.0f; f2 < fZzO; f2 = f) {
            f = f2;
            boolean z2 = z;
            int iZzm = zzsq.zzm(z);
            long j3 = j;
            while (iZzm < zzsq.zzSf().zzNH().length && !zzAN.zzS(fZzO, f)) {
                float fZzZ = zzsq.zzZ(fZzO, iZzm, z2);
                float f3 = fZzO - f;
                if (f3 < fZzZ) {
                    zzsq.zzPd = fZzZ - f3;
                    zzsq.zzPc = iZzm;
                    fZzZ = f3;
                } else if (zzAN.zzS(f3, fZzZ)) {
                    zzsq.zzPc = iZzm == zzsq.zzSf().zzNH().length - 1 ? 0 : iZzm + 1;
                    zzsq.zzPd = 0.0f;
                }
                long jZzV = zzJ6.zzV(j3, j2, fZzZ);
                zzsq.zzZ(iZzm, fZzZ, j3, jZzV, zzos, z2);
                f += fZzZ;
                iZzm++;
                zzsq = this;
                j3 = jZzV;
                z2 = false;
            }
            zzsq = this;
            j = j3;
            z = z2;
        }
    }

    @Override // com.aspose.words.internal.zzSO
    public final zzOS zzZ(zzOS zzos, float f) {
        zzOS zzosZzZ = super.zzZ(zzos, f);
        zzY(zzosZzZ);
        return zzosZzZ;
    }

    private static float[] zzZ(zzOU zzou, zzOU zzou2) {
        int length = zzou.zzNH().length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (zzou.getWidth() * zzou.zzNH()[i]) / zzou2.getWidth();
        }
        return fArr;
    }

    private void zzZ(int i, float f, long j, long j2, zzOS zzos, boolean z) {
        if (i % 2 == 0 && f > zzSf().getWidth() / 2.0f) {
            zzZ(j, j2, zzos, z);
        } else {
            this.zzP9 = false;
        }
    }

    private float zzZ(float f, int i, boolean z) {
        if (zzSf().zzNH().length < 2) {
            return f;
        }
        if (!zzAN.zzf(this.zzPd) && z) {
            return this.zzPd;
        }
        return zzSf().getWidth() * zzSf().zzNH()[i];
    }

    private void zzZ(long j, long j2, zzOS zzos, boolean z) {
        zzOS zzos2 = new zzOS(j, j2);
        if (zzS0().zzRS() && this.zzP9 && z) {
            zzX(zzos2);
        } else {
            zzW(zzos2, zzos);
        }
        this.zzP9 = true;
    }
}
