package com.aspose.words.internal;

import androidx.datastore.preferences.protobuf.C21791OooO0o0;

/* JADX INFO: loaded from: classes5.dex */
public final class zz0Z {
    private zz0Y zzeV;

    public zz0Z(zzH3 zzh3) {
        this.zzeV = new zz0Y(zzh3);
    }

    private zz13 zz2(zzZOP zzzop) throws Exception {
        return zzP(new zzY0(zzzop));
    }

    private static zz15 zzA(zzY0 zzy0) throws Exception {
        zz15 zz15Var = new zz15();
        zz15Var.zzZ(zzY(zzy0, true));
        zz15Var.zzj(zzL(zzy0));
        zz15Var.zzi(zzL(zzy0));
        zz15Var.setMode(zzy0.zzX9() & 65535);
        zz15Var.zzZ(zzZ(zzy0, zz15Var.zzsS(), null));
        return zz15Var;
    }

    private static zz17 zzB(zzY0 zzy0) throws Exception {
        zz17 zz17Var = new zz17();
        zz17Var.zzZ(zzY(zzy0, false));
        zz17Var.zzZ(zzE(zzy0));
        zz17Var.zzj(zzL(zzy0));
        zz17Var.zzi(zzL(zzy0));
        zz17Var.setMode(zzy0.zzX9() & 65535);
        zz17Var.zzk(zzJ(zzy0));
        zz17Var.zzZ(zzZ(zzy0, zz17Var.zzsS(), zz17Var.zzsU()));
        return zz17Var;
    }

    private static zz18 zzC(zzY0 zzy0) throws Exception {
        zz18 zz18Var = new zz18();
        zz18Var.zzZ(zzY(zzy0, false));
        zz18Var.zzZ(zzE(zzy0));
        zz18Var.zzj(zzL(zzy0));
        zz18Var.zzi(zzL(zzy0));
        zz18Var.setMode(zzy0.zzX9() & 65535);
        zz18Var.zzZ(zzZ(zzy0, zz18Var.zzsS(), zz18Var.zzsU()));
        return zz18Var;
    }

    private static zz10 zzD(zzY0 zzy0) throws Exception {
        zz10 zz10Var = new zz10(zzy0.zzX9() & 65535);
        zz10Var.zzZg(zzy0.zzn(8));
        if (!zz10Var.zzsG()) {
            zz10Var.zzY(zzH(zzy0));
            return zz10Var;
        }
        zz10Var.zzZ(zzY(zzy0, true));
        zz10Var.zzZ(zzE(zzy0));
        zz10Var.zzZ(zzZ(zzy0, zz10Var.zzsS(), zz10Var.zzsU()));
        return zz10Var;
    }

    private static zz16 zzE(zzY0 zzy0) throws Exception {
        zz16 zz16Var = new zz16(zzy0.zzXc(), zzy0.zzX9() & 65535);
        int iZzX9 = zzy0.zzX9() & 65535;
        for (int i = 0; i <= iZzX9; i++) {
            zz16Var.zzsT().set(zzy0.zzX9() & 65535, zzH(zzy0));
        }
        return zz16Var;
    }

    private static int zzF(zzY0 zzy0) throws Exception {
        int i = zzy0.readByte() & 255;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    private static String zzG(zzY0 zzy0) throws Exception {
        return new String(zzy0.zzm(zzy0.readByte() & 255));
    }

    private static zzPV zzH(zzY0 zzy0) throws Exception {
        return new zzPV(((byte) ((((double) (zzy0.zzX9() & 65535)) / 65535.0d) * 255.0d)) & 255, ((byte) ((((double) (zzy0.zzX9() & 65535)) / 65535.0d) * 255.0d)) & 255, ((byte) ((((double) (zzy0.zzX9() & 65535)) / 65535.0d) * 255.0d)) & 255);
    }

    private static long[] zzI(zzY0 zzy0) throws Exception {
        int iZzX9 = zzy0.zzX9() & 65535;
        zzM(zzy0);
        int i = (iZzX9 - 10) / 4;
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = zzN(zzy0);
        }
        return jArr;
    }

    private static zzZQ4 zzJ(zzY0 zzy0) throws Exception {
        int iZzX9 = zzy0.zzX9() & 65535;
        zzZQ4 zzzq4ZzL = zzL(zzy0);
        zzy0.zzn(iZzX9 - 10);
        return zzzq4ZzL;
    }

    private static void zzK(zzY0 zzy0) throws Exception {
        int iZzX9 = zzy0.zzX9() & 65535;
        zzM(zzy0);
        zzy0.zzn(iZzX9 - 10);
    }

    private static zzZQ4 zzL(zzY0 zzy0) throws Exception {
        return zzZQ4.zzX(zzy0.zzXa(), zzy0.zzXa(), zzy0.zzXa(), zzy0.zzXa());
    }

    private static void zzM(zzY0 zzy0) throws Exception {
        zzy0.zzXa();
        zzy0.zzXa();
        zzy0.zzXa();
        zzy0.zzXa();
    }

    private static long zzN(zzY0 zzy0) throws Exception {
        return zzZPY.zzG(zzy0.zzXa(), zzy0.zzXa());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05cc  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzO(com.aspose.words.internal.zzY0 r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.internal.zz0Z.zzO(com.aspose.words.internal.zzY0):void");
    }

    private zz13 zzP(zzY0 zzy0) throws Exception {
        this.zzeV.start();
        zzy0.zzX9();
        this.zzeV.zzg(zzL(zzy0));
        int iZzX9 = zzy0.zzX9() & 65535;
        if (iZzX9 == 273) {
            this.zzeV.zzT(0, "PICT V1.0 is not supported.");
            return new zz13(this.zzeV.zzsD(), zzZQ4.zz2T);
        }
        if (iZzX9 == 17 && (zzy0.zzX9() & 65535) != 767) {
            this.zzeV.zzT(0, "Unexpected version of V2.0 pict image.");
            return new zz13(this.zzeV.zzsD(), zzZQ4.zz2T);
        }
        try {
            zzO(zzy0);
        } catch (Exception e) {
            this.zzeV.zzT(0, zzZKN.format("Exception occurred while reading PICT opcodes, some data or formatting might be lose. {0}", e.getMessage()));
        }
        this.zzeV.end();
        return new zz13(this.zzeV.zzsD(), this.zzeV.zzsF());
    }

    private void zzT(zzY0 zzy0, int i) throws Exception {
        this.zzeV.zzZ(zzZQ4.zz2T, zzy0.zzXa(), zzy0.zzXa(), i);
    }

    private void zzU(zzY0 zzy0, int i) throws Exception {
        this.zzeV.zzZ(zzL(zzy0), zzy0.zzXa(), zzy0.zzXa(), i);
    }

    private static zz11 zzY(zzY0 zzy0, boolean z) throws Exception {
        if (z) {
            zzy0.zzXc();
        }
        zz11 zz11Var = new zz11();
        zz11Var.zzTv(zzy0.zzX9() & 65535);
        zz11Var.zzI(zzL(zzy0));
        zz11Var.zzTu(zzy0.zzX9() & 65535);
        zz11Var.zzTt(zzy0.zzX9() & 65535);
        zz11Var.zzTs(zzy0.zzXc());
        zz11Var.zzZv(((double) zzy0.zzXc()) / 65536.0d);
        zz11Var.zzZu(((double) zzy0.zzXc()) / 65536.0d);
        zz11Var.zzTr(zzy0.zzX9() & 65535);
        zz11Var.zzTq(zzy0.zzX9() & 65535);
        zz11Var.zzTp(zzy0.zzX9() & 65535);
        zz11Var.zzTo(zzy0.zzX9() & 65535);
        zz11Var.zzTn(zzy0.zzXc());
        zz11Var.zzTm(zzy0.zzXc());
        zzy0.zzXc();
        return zz11Var;
    }

    private static void zzZ(zzY0 zzy0, zz0Y zz0y) throws Exception {
        int iZzX9 = zzy0.zzX9() & 65535;
        int iZzX92 = 65535 & zzy0.zzX9();
        String str = new String(zzy0.zzm(zzy0.readByte() & 255));
        zzy0.zzn((iZzX9 - r2) - 3);
        zz0y.zzR(iZzX92, str);
    }

    private static void zzx(zzY0 zzy0) throws Exception {
        zzy0.zzn((int) (((long) zzy0.zzXb()) & 4294967295L));
    }

    private static void zzy(zzY0 zzy0) throws Exception {
        zzy0.zzn(zzy0.zzX9() & 65535);
    }

    private static zz14 zzz(zzY0 zzy0) throws Exception {
        zz14 zz14Var = new zz14();
        zz14Var.zzZ(zzY(zzy0, true));
        zz14Var.zzj(zzL(zzy0));
        zz14Var.zzi(zzL(zzy0));
        zz14Var.setMode(zzy0.zzX9() & 65535);
        zz14Var.zzk(zzJ(zzy0));
        zz14Var.zzZ(zzZ(zzy0, zz14Var.zzsS(), null));
        return zz14Var;
    }

    public final zz13 zzZf(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zz2(zzzor);
        } finally {
            zzzor.close();
        }
    }

    private static byte[] zzJ(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        zzZKV.zzZ(bArr, 0, bArr2, 0, Math.min(i, bArr.length));
        return bArr2;
    }

    private static byte[] zzU(byte[] bArr, int i, int i2) {
        int i3;
        int length = (bArr.length * 4) + 300;
        byte[] bArrZzJ = new byte[length];
        int i4 = 0;
        int i5 = 0;
        do {
            int i6 = bArr[i4] & 255;
            if (i6 < 128) {
                int i7 = 0;
                while (true) {
                    i3 = (i6 + 1) * i2;
                    if (i7 >= i3) {
                        break;
                    }
                    int i8 = i5 + 1;
                    int i9 = i4 + i7;
                    bArrZzJ[i5] = bArr[i9 + 1];
                    if (i2 == 2) {
                        i5 += 2;
                        bArrZzJ[i8] = bArr[i9 + 2];
                    } else {
                        i5 = i8;
                    }
                    i7 += i2;
                }
                i4 = i3 + 1 + i4;
            } else {
                for (int i10 = 0; i10 < 257 - i6; i10++) {
                    int i11 = i5 + 1;
                    bArrZzJ[i5] = bArr[i4 + 1];
                    if (i2 == 2) {
                        i5 += 2;
                        bArrZzJ[i11] = bArr[i4 + 2];
                    } else {
                        i5 = i11;
                    }
                }
                i4 = i2 + 1 + i4;
            }
            if (i5 + 300 > length) {
                length += 1024;
                bArrZzJ = zzJ(bArrZzJ, length);
            }
        } while (i4 < bArr.length - 1);
        if (length != i5) {
            bArrZzJ = zzJ(bArrZzJ, i5);
        }
        if (i < 3) {
            return bArrZzJ;
        }
        byte[] bArr2 = new byte[(i5 * 4) / i];
        int i12 = 0;
        while (true) {
            int i13 = i5 / i;
            if (i12 >= i13) {
                return bArr2;
            }
            int i14 = i12 * 4;
            bArr2[i14] = 0;
            bArr2[i14 + 1] = bArrZzJ[i12];
            bArr2[i14 + 2] = bArrZzJ[i13 + i12];
            bArr2[i14 + 3] = bArrZzJ[C21791OooO0o0.OooO00o(i5, 2, i, i12)];
            i12++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zz12 zzZ(zzY0 zzy0, zz11 zz11Var, zz16 zz16Var) throws Exception {
        int iZzsL;
        int iZzsI;
        int i;
        zz12 zz12Var = new zz12(zz11Var, zz16Var);
        int rowBytes = zz11Var.getRowBytes() & 16383;
        if ((zz11Var.getRowBytes() & 32768) > 0) {
            iZzsL = 5;
        } else {
            iZzsL = zz11Var.zzsL();
            if (iZzsL == 0) {
                iZzsL = zz11Var.zzsJ() == 16 ? 3 : 4;
            }
            if (rowBytes < 8) {
                iZzsL = 1;
            }
        }
        long position = zzy0.zzq().getPosition();
        int height = (int) zz11Var.zzZj().getHeight();
        if (iZzsL != 1) {
            int i2 = 2;
            if (iZzsL != 2) {
                if (iZzsL == 3 || iZzsL == 4 || iZzsL == 5) {
                    if (iZzsL != 5) {
                        if (iZzsL != 3) {
                            iZzsI = zz11Var.zzsI();
                            i2 = 1;
                        }
                        byte[] bArr = null;
                        for (i = 0; i < height; i++) {
                            byte[] bArrZzU = zzU(zzy0.zzn(rowBytes > 250 ? zzy0.zzX9() & 65535 : zzy0.readByte() & 255), iZzsI, i2 & 255);
                            if (bArr == null) {
                                bArr = bArrZzU;
                            } else {
                                byte[] bArr2 = new byte[bArr.length + bArrZzU.length];
                                zzZKV.zzZ(bArr, 0, bArr2, 0, bArr.length);
                                zzZKV.zzZ(bArrZzU, 0, bArr2, bArr.length, bArrZzU.length);
                                bArr = bArr2;
                            }
                            zz12Var.setData(bArr);
                        }
                    } else if (zz11Var.zzsJ() != 16) {
                        i2 = 1;
                    }
                    iZzsI = 1;
                    byte[] bArr3 = null;
                    while (i < height) {
                    }
                } else {
                    for (int i3 = 0; i3 < height; i3++) {
                        zzy0.zzn(rowBytes > 250 ? zzy0.zzX9() & 65535 : zzy0.readByte() & 255);
                    }
                }
            } else {
                zz12Var.setData(zzy0.zzn(((rowBytes * height) * 3) / 4));
            }
        } else {
            zz12Var.setData(zzy0.zzn(rowBytes * height));
        }
        if ((zzy0.zzq().getPosition() - position) % 2 > 0) {
            zzy0.readByte();
        }
        return zz12Var;
    }
}
