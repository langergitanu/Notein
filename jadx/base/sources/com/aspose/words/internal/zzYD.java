package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYD extends zz6 implements zzH2 {
    private boolean zzX0;
    private boolean zzX1;
    private ArrayList<zzZG> zzX2;
    private zzP9 zzX3;
    private zzP9 zzX4;
    private zzP9 zzX5;
    private zzP9 zzX6;
    private ArrayList<zzP5> zzX7;
    private ArrayList<zzP8> zzX8;
    private zzZQC<zzP9> zzX9 = new zzZQC<>();
    private zzYC zzXa;

    public zzYD(zzYC zzyc) {
        this.zzXa = zzyc;
    }

    private zzZG zzD(int i) {
        zzZG zzzg = new zzZG(this.zzX8.get(i).zzO8().zzO8());
        zzzg.zzX(null);
        zzzg.zzY(new zzOI(this.zzXa.zzA(i)));
        return zzzg;
    }

    private static zzZQ4 zzP(zzG zzg) throws Exception {
        zzZQ4 zzzq4ZzZ = new zzH().zzZ((zzZL) zzg);
        zzZG zzzg = zzg.getCount() > 0 ? (zzZG) zzZKW.zzZ(zzg.zzN(0), zzZG.class) : null;
        float width = (zzzg == null || zzzg.zzZ2() == null) ? 0.0f : zzzg.zzZ2().getWidth();
        float f = width / 2.0f;
        return new zzZQ4(zzzq4ZzZ.getX() + f, zzzq4ZzZ.getY() + f, zzzq4ZzZ.getWidth() - width, zzzq4ZzZ.getHeight() - width);
    }

    private void zzQ(zzG zzg) throws Exception {
        zzZQ4 zzzq4ZzP = zzP(zzg);
        this.zzX6 = new zzP9();
        float fZzXX = (((float) this.zzXa.zzXX()) + 0.5f) * zzzq4ZzP.getWidth();
        float fZzXW = (((float) this.zzXa.zzXW()) + 0.5f) * zzzq4ZzP.getHeight();
        this.zzX6.zzY((-fZzXX) - zzzq4ZzP.getX(), (-fZzXW) - zzzq4ZzP.getY(), 1);
        zzP9 zzp9 = new zzP9((float) this.zzXa.zzY1(), (float) this.zzXa.zzY0(), (float) this.zzXa.zzXZ(), (float) this.zzXa.zzXY(), 0.0f, 0.0f);
        this.zzX5 = zzp9;
        zzp9.zzY(zzzq4ZzP.getX() + fZzXX, zzzq4ZzP.getY() + fZzXW, 1);
    }

    private void zzR(zzG zzg) {
        this.zzX1 = false;
        if (zzg.getCount() <= 1) {
            return;
        }
        for (int i = 0; i < zzg.getCount(); i++) {
            zzZG zzzg = (zzZG) zzZKW.zzZ(zzg.zzN(i), zzZG.class);
            if (zzzg != null && zzzg.zzZ1() != null) {
                this.zzX1 = true;
                return;
            }
        }
    }

    private zzZQ4 zzT(zzZG zzzg) throws Exception {
        return zzY2().zzO(new zzH().zzZ((zzZL) zzzg));
    }

    private void zzU(zzZG zzzg) throws Exception {
        if (zzzg != null && zzzg.zzZ2() != null && zzzg.zzZ1() != null) {
            if (zzzg.zzZ2().getWidth() > 1.0f) {
                float width = zzzg.zzZ2().getWidth();
                zzZQ4 zzzq4ZzT = zzT(zzzg);
                long jZzG = zzZPY.zzG(C22244OooO0o0.OooO00o(zzzq4ZzT, 2.0f, zzzq4ZzT.zzZm()), (zzzq4ZzT.getHeight() / 2.0f) + zzzq4ZzT.zzZo());
                float width2 = zzzq4ZzT.getWidth() <= width ? 1.0f : (width / (zzzq4ZzT.getWidth() - width)) + 1.0f;
                float height = zzzq4ZzT.getHeight() > width ? 1.0f + (width / (zzzq4ZzT.getHeight() - width)) : 1.0f;
                zzP9 zzp9 = new zzP9();
                this.zzX4 = zzp9;
                int i = (int) jZzG;
                zzp9.zzY(-Float.intBitsToFloat(i), -zzZPY.zzYC(jZzG), 1);
                this.zzX4.zzZ(width2, height, 1);
                this.zzX4.zzY(Float.intBitsToFloat(i), zzZPY.zzYC(jZzG), 1);
                this.zzX4.zzZ(this.zzX5, 0);
                return;
            }
        }
        zzP9 zzp92 = this.zzX5;
        this.zzX4 = zzp92;
        zzP9 zzp93 = this.zzX3;
        if (zzp93 != null) {
            zzp92.zzZ(zzp93, 1);
        }
    }

    private void zzV(zzP9 zzp9) {
        zzP9 zzp9ZzOh = zzY2().zzOh();
        if (zzp9 == null) {
            zzp9 = new zzP9();
        }
        zzp9ZzOh.zzZ(zzp9, 0);
        this.zzX9.push(zzp9ZzOh);
    }

    private zzP9 zzY2() {
        if (this.zzX9.size() == 0) {
            this.zzX9.push(new zzP9());
        }
        return this.zzX9.peek();
    }

    private void zzZR() {
        this.zzX9.pop();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) throws Exception {
        zzZR();
        super.zzY(zzg);
    }

    public final Collection<zzZG> zzZ(zzG zzg, boolean z) throws Exception {
        if (zzg.zzZO() != null) {
            this.zzX3 = new zzP9(zzg.zzZO().zzOf(), zzg.zzZO().zzOe(), zzg.zzZO().zzOd(), zzg.zzZO().zzOc(), 0.0f, 0.0f);
        }
        this.zzX0 = z;
        this.zzX2 = new ArrayList<>();
        zzQ(zzg);
        zzg.zzZ(this);
        return this.zzX2;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        if (this.zzX7.size() == 0) {
            return true;
        }
        for (int i = 0; i < this.zzX7.size(); i++) {
            zzZQG.zzZ(this.zzX8.get(i).zzO7(), this.zzX7.get(i));
        }
        return true;
    }

    private long zzR(long j) {
        long jZzR = this.zzX6.zzR(zzY2().zzR(j));
        int i = (int) jZzR;
        float fZzXU = (float) ((this.zzXa.zzXU() * ((double) (zzZPY.zzYC(jZzR) * 10.0f))) + (this.zzXa.zzXV() * ((double) (Float.intBitsToFloat(i) * 10.0f))) + 1.0d);
        return this.zzX4.zzR(zzZPY.zzG(Float.intBitsToFloat(i) / fZzXU, zzZPY.zzYC(jZzR) / fZzXU));
    }

    @Override // com.aspose.words.internal.zz6
    public final boolean zzZ(zzZS zzzs) throws Exception {
        if (zzzs.zzZg() == 32768) {
            return false;
        }
        return super.zzZ(zzzs);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        zzV(zzg.zzZO());
        zzR(zzg);
        super.zzZ(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        zzZG zzzgZzZ;
        zzV(zzzg.zzZO());
        ArrayList<zzP8> arrayList = new ArrayList<>();
        this.zzX8 = arrayList;
        zzZQG.zzZ(arrayList, new zzP8());
        if (this.zzXa.zzXT() == 1) {
            zzZQG.zzZ(this.zzX8, new zzP8());
        }
        zzU(zzzg);
        zzzg.zzZ0().zzY(this);
        zzZR();
        if (this.zzX8.size() == 0) {
            return;
        }
        if (this.zzXa.zzXS() && ((zzzg.zzZ1() == null || zzzg.zzZ1().isEmpty()) && (zzzg.zzZ2() == null || zzzg.zzZ2().zzZ1() == null || zzzg.zzZ2().zzZ1().isEmpty()))) {
            return;
        }
        for (int size = this.zzX8.size() - 1; size >= 0; size--) {
            if (this.zzX8.get(size).zzO7().size() != 0) {
                ArrayList<zzZG> arrayList2 = this.zzX2;
                if (zzzg.zzZ1() != null && (this.zzX0 || !zzzg.zzZ1().isEmpty())) {
                    zzzgZzZ = zzD(size);
                } else {
                    zzzgZzZ = zzZ(size, zzzg.zzZ2());
                }
                zzZQG.zzZ(arrayList2, zzzgZzZ);
            }
        }
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        this.zzX7 = new ArrayList<>();
        if (!this.zzX1 || zzp5.isClosed()) {
            zzP5 zzp52 = new zzP5();
            zzp52.zze(zzp5.isClosed());
            zzZQG.zzZ(this.zzX7, zzp52);
        }
        if (this.zzXa.zzXT() == 1 && this.zzX7.size() > 0) {
            zzZQG.zzZ(this.zzX7, this.zzX7.get(0).zzNZ());
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        if (this.zzX7.size() == 0) {
            return true;
        }
        long jZzR = zzR(zzpz.zzPX());
        long jZzR2 = zzR(zzpz.zzPW());
        long jZzR3 = zzR(zzpz.zzPL());
        long jZzR4 = zzR(zzpz.zzPK());
        for (int i = 0; i < this.zzX7.size(); i++) {
            zzZQG.zzZ((ArrayList<zzPZ>) this.zzX7.get(i).zzNY(), new zzPZ(zzZ(jZzR, i), zzZ(jZzR3, i), zzZ(jZzR4, i), zzZ(jZzR2, i)));
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        if (this.zzX7.size() == 0) {
            return true;
        }
        zzOS[] zzosArr = new zzOS[this.zzX7.size()];
        for (int i = 0; i < this.zzX7.size(); i++) {
            zzosArr[i] = new zzOS();
        }
        for (int i2 = 0; i2 < zzos.zzNu().getCount(); i2++) {
            long jZzR = zzR(zzos.zzNu().get(i2));
            for (int i3 = 0; i3 < this.zzX7.size(); i3++) {
                zzosArr[i3].zzNu().add(zzZ(jZzR, i3));
            }
        }
        for (int i4 = 0; i4 < this.zzX7.size(); i4++) {
            zzZQG.zzZ((ArrayList<zzOS>) this.zzX7.get(i4).zzNY(), zzosArr[i4]);
        }
        return true;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        zzU(null);
        int i = this.zzXa.zzXT() == 1 ? 2 : 1;
        zzZQ4 zzzq4ZzZj = zzzp.zzZj();
        if (zzzp.zzZd() != null) {
            zzzq4ZzZj = zzzp.zzZd().zzw(zzzq4ZzZj);
        }
        long[] jArr = {zzR(zzZPY.zzG(zzzq4ZzZj.zzZm(), zzzq4ZzZj.zzZo())), zzR(zzZPY.zzG(zzzq4ZzZj.zzkw(), zzzq4ZzZj.zzZo())), zzR(zzZPY.zzG(zzzq4ZzZj.zzkw(), zzzq4ZzZj.zzZn())), zzR(zzZPY.zzG(zzzq4ZzZj.zzZm(), zzzq4ZzZj.zzZn()))};
        this.zzX8 = new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            zzOS zzos = new zzOS();
            for (int i3 = 0; i3 < 4; i3++) {
                zzos.zzNu().add(zzZ(jArr[i3], i2));
            }
            zzP5 zzp5 = new zzP5();
            zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), zzos);
            zzp5.zze(true);
            zzP8 zzp8 = new zzP8();
            zzZQG.zzZ(zzp8.zzO7(), zzp5);
            zzZQG.zzZ(this.zzX8, zzp8);
        }
        for (int size = this.zzX8.size() - 1; size >= 0; size--) {
            if (this.zzX8.get(size).zzO7().size() != 0) {
                zzZQG.zzZ(this.zzX2, zzD(size));
            }
        }
        super.zzZ(zzzp);
    }

    private zzZG zzZ(int i, zzOU zzou) {
        zzP8 zzp8 = this.zzX8.get(i);
        if (zzou == null) {
            return new zzZG();
        }
        zzZG zzzg = new zzZG(zzp8.zzO8());
        zzzg.zzY((zzPY) null);
        zzzg.zzX(zzou.zzNP());
        zzzg.zzZ2().zzY(new zzOI(this.zzXa.zzA(i)));
        return zzzg;
    }

    private long zzZ(long j, int i) {
        return zzZPY.zzG(Float.intBitsToFloat((int) j) + ((float) this.zzXa.zzC(i)), zzZPY.zzYC(j) + ((float) this.zzXa.zzB(i)));
    }
}
