package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzNG {
    private boolean zzEH;
    private zzN7 zzEI;
    private int zzEX = 1;

    public zzNG(zzN7 zzn7) {
        this.zzEI = zzn7;
    }

    private void zzLA() throws Exception {
        zzm(7, 0);
        zzLz();
        zzLC();
    }

    private void zzLC() throws Exception {
        this.zzEI.zzKs().zzKD();
    }

    private int zzLD() {
        int i = this.zzEX;
        int i2 = i + 1;
        this.zzEX = i2;
        if (i2 > 63) {
            this.zzEX = 1;
        }
        return i;
    }

    private void zzLz() throws Exception {
        this.zzEI.zzKt().zzMF();
        this.zzEI.zzKt().writeInt(26628);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().zzXC(-89522176);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeFloat(0.0f);
        this.zzEI.zzKt().writeFloat(0.0f);
        this.zzEI.zzKt().writeFloat(1.0f);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(0);
    }

    private void zzM(zzP8 zzp8) throws Exception {
        zzNE zzne = new zzNE();
        zzp8.zzY(zzne);
        this.zzEI.zzKt().zzMF();
        this.zzEI.zzKt().writeInt(zzne.zzLy().size());
        this.zzEI.zzKt().writeInt(zzp8.zzO6() == 1 ? 8192 : 0);
        Iterator<Long> it = zzne.zzLy().iterator();
        while (it.hasNext()) {
            this.zzEI.zzKt().zzj(it.next().longValue());
        }
        for (int i = 0; i < zzne.zzLy().size(); i++) {
            this.zzEI.zzKt().writeByte((byte) (zzne.zzLx().get(i).intValue() + (zzne.zzLw().get(i).intValue() << 4)));
        }
        this.zzEI.zzKt().zzXB(zzne.zzLy().size());
    }

    private void zzO(zzP8 zzp8) throws Exception {
        long position = this.zzEI.zzq().getPosition();
        this.zzEI.zzKt().writeInt(0);
        zzM(zzp8);
        long position2 = (this.zzEI.zzq().getPosition() - position) - 4;
        long position3 = this.zzEI.zzq().getPosition();
        this.zzEI.zzq().zzH(position);
        this.zzEI.zzKt().writeInt((int) position2);
        this.zzEI.zzq().zzH(position3);
    }

    private void zzT(zzOU zzou) throws Exception {
        this.zzEI.zzKt().zzMF();
        int i = 0;
        this.zzEI.zzKt().writeInt(0);
        long position = this.zzEI.zzq().getPosition();
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeFloat(zzou.getWidth());
        if (zzou.zzNN() != 0) {
            this.zzEI.zzKt().writeInt(zzou.zzNN());
            i = 2;
        }
        if (zzou.getEndCap() != 0) {
            i |= 4;
            this.zzEI.zzKt().writeInt(zzou.getEndCap());
        }
        if (zzou.zzNM() != 0) {
            i |= 8;
            this.zzEI.zzKt().writeInt(zzou.zzNM());
        }
        if (!zzAN.zzS(zzou.zzNL(), 10.0f)) {
            i |= 16;
            this.zzEI.zzKt().writeFloat(zzou.zzNL());
        }
        if (zzou.getDashStyle() != 0) {
            i |= 32;
            this.zzEI.zzKt().writeInt(zzou.getDashStyle());
        }
        if (zzou.zzNJ() != 0) {
            i |= 64;
            this.zzEI.zzKt().writeInt(zzou.zzNJ());
        }
        if (!zzAN.zzf(zzou.zzNK())) {
            i |= 128;
            this.zzEI.zzKt().writeFloat(zzou.zzNK());
        }
        if (zzou.getDashStyle() == 5 && zzou.zzNH() != null) {
            i |= 256;
            this.zzEI.zzKt().writeFloatArray(zzou.zzNH());
        }
        if (zzou.getAlignment() != 0) {
            i |= 512;
            this.zzEI.zzKt().writeInt(zzou.getAlignment());
        }
        if (zzou.zzNG().length > 0) {
            i |= 1024;
            this.zzEI.zzKt().writeFloatArray(zzou.zzNG());
        }
        zzU(i, position);
    }

    private void zzU(int i, long j) throws Exception {
        long position = this.zzEI.zzq().getPosition();
        this.zzEI.zzq().zzH(j);
        this.zzEI.zzKt().writeInt(i);
        this.zzEI.zzq().zzH(position);
    }

    private void zzW(zzPY zzpy, zzZQ4 zzzq4) throws Exception {
        this.zzEI.zzKt().zzMF();
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 0) {
            this.zzEI.zzKt().writeInt(0);
            zzY((zzOI) zzpy);
            return;
        }
        if (iZzPH == 1) {
            this.zzEI.zzKt().writeInt(1);
            zzX((zzPK) zzpy);
            return;
        }
        if (iZzPH == 2) {
            this.zzEI.zzKt().writeInt(2);
            zzY((zzOH) zzpy);
            return;
        }
        if (iZzPH == 3) {
            this.zzEI.zzKt().writeInt(4);
            zzU((zzPA) zzpy);
        } else if (iZzPH == 4) {
            this.zzEI.zzKt().writeInt(3);
            zzX(zzOO.zzX((zzOP) zzpy, zzzq4));
        } else {
            if (iZzPH != 5) {
                throw new IllegalStateException("Unexpected brush type");
            }
            this.zzEI.zzKt().writeInt(3);
            zzX((zzP0) zzpy);
        }
    }

    private static int zzXk(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return 5;
                        }
                        throw new IllegalStateException("Unexpected metafile type");
                    }
                }
            }
        }
        return i2;
    }

    private void zzY(zzOH zzoh) throws Exception {
        if (zzoh.zzNf() > 0.0f) {
            this.zzEI.zz2("Texture brush opacity is not supported.");
        }
        if (zzoh.zzNe() != null) {
            this.zzEI.zz2("Texture brush color map is not supported.");
        }
        if (!zzoh.zzNd().isEmpty()) {
            this.zzEI.zz2("Texture brush image area is not supported.");
        }
        long position = this.zzEI.zzq().getPosition();
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(zzoh.zzNa());
        zzU(zzZ(zzoh), position);
        zzg(zzoh.getImageBytes());
    }

    private static int zzd(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzXk(zzEF.zzr(zzzor));
        } finally {
            zzzor.close();
        }
    }

    private void zze(byte[] bArr) throws Exception {
        this.zzEI.zzKt().writeInt(2);
        this.zzEI.zzKt().writeInt(bArr.length - 22);
        this.zzEI.zzKt().zzV(bArr, 0, 22);
        this.zzEI.zzKt().writeShort((short) 0);
        this.zzEI.zzKt().zzV(bArr, 22, bArr.length - 22);
    }

    private void zzf(byte[] bArr) throws Exception {
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(1);
        this.zzEI.zzKt().writeBytes(bArr);
        this.zzEI.zzKt().zzXB(bArr.length);
    }

    private zzZQ5 zzg(byte[] bArr) throws Exception {
        this.zzEI.zzKt().zzMF();
        int iZzd = zzd(bArr);
        zzEG zzegZzZT = zzEF.zzZT(bArr);
        zzZQ5 zzzq5 = new zzZQ5(zzegZzZT.getLeft(), zzegZzZT.getTop(), zzegZzZT.getWidth(), zzegZzZT.getHeight());
        long position = this.zzEI.zzq().getPosition();
        if (iZzd != 0) {
            this.zzEI.zzKt().writeInt(2);
            zzZ(bArr, iZzd, zzzq5);
        } else {
            this.zzEI.zzKt().writeInt(1);
            zzf(bArr);
        }
        this.zzEI.zzKt().zzXB((int) (this.zzEI.zzq().getPosition() - position));
        return zzzq5;
    }

    private void zzm(int i, int i2) throws Exception {
        this.zzEI.zzKs().zzZ(16392, (short) (i2 + (i << 8)));
    }

    public final int zzLB() throws Exception {
        if (this.zzEH) {
            return 0;
        }
        zzLA();
        this.zzEH = true;
        return 0;
    }

    public final int zzN(zzP8 zzp8) throws Exception {
        int iZzLD = zzLD();
        zzm(3, iZzLD);
        zzM(zzp8);
        this.zzEI.zzKs().zzKD();
        return iZzLD;
    }

    public final int zzX(zzPY zzpy, zzZQ4 zzzq4) throws Exception {
        int iZzLD = zzLD();
        zzm(1, iZzLD);
        zzW(zzpy, zzzq4);
        this.zzEI.zzKs().zzKD();
        return iZzLD;
    }

    public final int zzZ(zzPM zzpm, int i) throws Exception {
        int iZzLD = zzLD();
        zzm(6, iZzLD);
        zzY(zzpm, i);
        this.zzEI.zzKs().zzKD();
        return iZzLD;
    }

    public final zzEL zzh(byte[] bArr) throws Exception {
        int iZzLD = zzLD();
        zzm(5, iZzLD);
        zzZQ5 zzzq5Zzg = zzg(bArr);
        this.zzEI.zzKs().zzKD();
        return new zzEL(iZzLD, zzzq5Zzg);
    }

    private void zzX(zzZQ5 zzzq5) throws Exception {
        this.zzEI.zzKt().writeShort((short) zzX((short) 0, zzX((short) 0, zzX((short) this.zzEI.getHorizontalResolution(), zzY((short) zzzq5.getBottom(), zzY((short) zzzq5.getRight(), zzY((short) zzzq5.getTop(), zzY((short) zzzq5.getLeft(), zzX((short) 0, zzX((short) -25914, zzX((short) -12841, 0)))))))))));
        this.zzEI.zzKt().writeShort((short) 0);
    }

    private int zzZ(zzPL zzpl) throws Exception {
        int iZzZ = zzZ((zzOG) zzpl);
        if (zzpl.zzOP() != null) {
            int i = iZzZ | 4;
            zzX(zzpl.zzOP());
            return i;
        }
        if (zzpl.zzOO() == null || zzpl.zzON() == null) {
            return iZzZ;
        }
        int i2 = iZzZ | 8;
        zzY(zzpl.zzOO(), zzpl.zzON());
        return i2;
    }

    private void zzU(zzPA zzpa) throws Exception {
        long position = this.zzEI.zzq().getPosition();
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(zzpa.zzNa());
        this.zzEI.zzKt().zzD(zzpa.zzOw());
        this.zzEI.zzKt().zzI(zzpa.zzOv());
        this.zzEI.zzKt().zzI(zzpa.zzOu());
        this.zzEI.zzKt().zzI(zzpa.zzOv());
        this.zzEI.zzKt().zzI(zzpa.zzOu());
        zzU(zzZ((zzPL) zzpa), position);
    }

    private int zzZ(zzOG zzog) throws Exception {
        if (zzog.zzNb() == null || zzog.zzNb().isIdentity()) {
            return 0;
        }
        this.zzEI.zzKt().zzK(zzog.zzNb());
        return 2;
    }

    public final int zzZ(zzOU zzou, zzZQ4 zzzq4) throws Exception {
        int iZzLD = zzLD();
        zzm(2, iZzLD);
        zzT(zzou);
        zzW(zzou.zzZ1(), zzzq4);
        this.zzEI.zzKs().zzKD();
        return iZzLD;
    }

    private void zzY(zzPM zzpm, int i) throws Exception {
        this.zzEI.zzKt().zzMF();
        this.zzEI.zzKt().writeFloat(zzpm.zzPg());
        this.zzEI.zzKt().writeInt(3);
        this.zzEI.zzKt().writeInt(i);
        this.zzEI.zzKt().writeInt(0);
        byte[] bytes = zzZO0.zzhU().getBytes(zzpm.zzPh());
        this.zzEI.zzKt().writeInt(bytes.length / 2);
        this.zzEI.zzKt().writeBytes(bytes);
        this.zzEI.zzKt().zzXB(bytes.length);
    }

    private void zzX(zzP0 zzp0) throws Exception {
        long position = this.zzEI.zzq().getPosition();
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(zzp0.zzNa());
        this.zzEI.zzKt().zzI(zzp0.zzNT() != null ? zzp0.zzNT() : zzPV.zzI5);
        this.zzEI.zzKt().zzj(zzp0.zzNV());
        if (zzp0.zzNU() != null) {
            this.zzEI.zzKt().writeInt(zzp0.zzNU().length);
            for (int i = 0; i < zzp0.zzNU().length; i++) {
                this.zzEI.zzKt().zzI(zzp0.zzNU()[i]);
            }
        } else {
            this.zzEI.zzKt().writeInt(1);
            this.zzEI.zzKt().zzI(zzPV.zzI5);
        }
        zzO(zzp0.zzUu());
        zzU(zzZ((zzPL) zzp0) | 1, position);
    }

    private void zzZ(byte[] bArr, int i, zzZQ5 zzzq5) throws Exception {
        if (i == 1) {
            zzZ(bArr, zzzq5);
        } else {
            if (i != 2) {
                this.zzEI.zzKt().writeInt(i);
                this.zzEI.zzKt().writeInt(bArr.length);
                this.zzEI.zzKt().writeBytes(bArr);
                return;
            }
            zze(bArr);
        }
    }

    private void zzZ(byte[] bArr, zzZQ5 zzzq5) throws Exception {
        this.zzEI.zzKt().writeInt(2);
        this.zzEI.zzKt().writeInt(bArr.length);
        zzX(zzzq5);
        this.zzEI.zzKt().writeBytes(bArr);
    }

    private void zzY(float[] fArr, float[] fArr2) throws Exception {
        this.zzEI.zzKt().writeInt(fArr.length);
        for (float f : fArr) {
            this.zzEI.zzKt().writeFloat(f);
        }
        for (int i = 0; i < fArr.length; i++) {
            this.zzEI.zzKt().writeFloat(fArr2[i]);
        }
    }

    private void zzY(zzOI zzoi) throws Exception {
        this.zzEI.zzKt().zzI(zzoi.zzZy());
    }

    private void zzX(zzPI[] zzpiArr) throws Exception {
        this.zzEI.zzKt().writeInt(zzpiArr.length);
        for (zzPI zzpi : zzpiArr) {
            this.zzEI.zzKt().writeFloat(zzpi.zzOG());
        }
        for (zzPI zzpi2 : zzpiArr) {
            this.zzEI.zzKt().zzI(zzpi2.zzZy());
        }
    }

    private int zzY(short s, int i) throws Exception {
        this.zzEI.zzKt().writeShort(s);
        return s ^ i;
    }

    private void zzX(zzPK zzpk) throws Exception {
        this.zzEI.zzKt().writeInt(zzpk.zzOM());
        this.zzEI.zzKt().zzI(zzpk.zzOL());
        this.zzEI.zzKt().zzI(zzpk.zzOK());
    }

    private int zzX(short s, int i) throws Exception {
        this.zzEI.zzKt().zzR(s);
        return (s & 65535) ^ i;
    }
}
