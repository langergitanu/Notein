package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZXX extends zzZOX {
    private zzPM zzYX;
    private zzPY zzYr;
    private zzOU zzYs;
    private byte[] zzbj;
    private zzZQC<zzPV> zzbk;
    private zzPV zzbl;
    private zzZXY zzbm;
    private short zzbn;
    private zzOU zzbo;
    private zzG zzbp;
    private zzZXZ zzbq;
    private zzF4 zzv;
    private zzH3 zzwm;

    public zzZXX(zzZOP zzzop, zzF4 zzf4, zzH3 zzh3) {
        super(zzzop);
        this.zzbk = new zzZQC<>();
        this.zzbj = new byte[]{83, 68, 0, 1};
        this.zzv = zzf4;
        this.zzwm = zzh3;
    }

    private static byte[] zzE(byte[] bArr, int i) {
        int length = bArr.length - 66;
        byte[] bArr2 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = bArr[i2 + 66];
        }
        return bArr2;
    }

    private zzPV zzMW() throws Exception {
        int iZzX6 = zzX6() & 255;
        int iZzX62 = zzX6() & 255;
        int iZzX63 = zzX6() & 255;
        zzX6();
        return zzPV.zzS(iZzX63, iZzX62, iZzX6);
    }

    private long zzN0() throws Exception {
        return zzZPY.zzG(zzXc(), zzXc());
    }

    private static byte[] zzR(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length + 54];
        for (int i = 0; i < 54; i++) {
            bArr3[i] = bArr[i];
        }
        zzZ7(bArr3);
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr3[i2 + 54] = bArr2[i2];
        }
        return bArr3;
    }

    private static byte[] zzS(byte[] bArr, byte[] bArr2) throws Exception {
        return zzR(bArr2, zzZRV.zzT(zzE(bArr, 66), 0, 1));
    }

    private boolean zzZ5(byte[] bArr) {
        for (int i = 0; i < 4; i++) {
            if (bArr[i + 30] != this.zzbj[i]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] zzZ6(byte[] bArr) {
        byte[] bArr2 = new byte[66];
        for (int i = 0; i < 66; i++) {
            bArr2[i] = bArr[i];
        }
        return bArr2;
    }

    private static void zzZ7(byte[] bArr) {
        bArr[30] = 0;
        bArr[31] = 0;
        bArr[32] = 0;
        bArr[33] = 0;
    }

    private String zzqI() throws Exception {
        zzZO0 zzzo0ZzQz = zzZO0.zzQz(zzT8.zzt(this.zzbn & 65535, 1252));
        return new String(new zzZOX(zzq(), zzzo0ZzQz).zzQG(zzzo0ZzQz.zzi0() ? zzXa() : zzXc()));
    }

    private int zzqJ() throws Exception {
        short sZzXa = zzXa();
        short sZzXa2 = zzXa();
        short sZzXa3 = zzXa();
        short sZzXa4 = zzXa();
        int i = sZzXa3 == 2 ? 8 : 0;
        if (sZzXa4 == 2) {
            i |= 2;
        }
        if (sZzXa2 == 2) {
            i |= 4;
        }
        return sZzXa == 8 ? i | 1 : i;
    }

    private void zzqi() throws Exception {
        zzXc();
        zzXc();
    }

    private zzZQ4 zzqr() throws Exception {
        return new zzZQ4(zzXc(), zzXc(), zzXc(), zzXc());
    }

    private long[] zzqs() throws Exception {
        int iZzXa = zzXa() & 65535;
        long[] jArr = new long[iZzXa];
        for (int i = 0; i < iZzXa; i++) {
            jArr[i] = zzN0();
        }
        return jArr;
    }

    private void zzqt() throws Exception {
        zzZXW zzzxw = new zzZXW();
        zzzxw.zzZ(this);
        int position = (int) zzq().getPosition();
        zzXa();
        this.zzYs.setWidth(zzXc());
        if ((zzzxw.zzqh() & 65535) > 1) {
            zzXa();
            zzXc();
            zzXa();
            zzXc();
            zzXc();
        }
        if ((zzzxw.zzqh() & 65535) > 2) {
            zzXa();
        }
        zzZA((int) (((long) zzzxw.getLength()) & 4294967295L), position);
    }

    private String zzqv() throws Exception {
        int iZzXa = zzXa() & 65535;
        String str = "";
        for (int i = 0; i < iZzXa; i++) {
            str = zzZKN.format("{0}{1}", str, Character.valueOf((char) (zzXa() & 65535)));
        }
        return str;
    }

    public final int getHeight() {
        return this.zzbm.getHeight();
    }

    public final int getWidth() {
        return this.zzbm.getWidth();
    }

    public final zzF4 zzI() {
        return this.zzv;
    }

    public final void zzZA(int i, int i2) throws Exception {
        int position = ((int) zzq().getPosition()) - i2;
        if (i > position) {
            zzn(i - position);
        }
    }

    public final void zzZw(boolean z) throws Exception {
        int width;
        int height;
        byte[] bArrZzn = zzn((int) (((long) this.zzbq.zzqN().getLength()) & 4294967295L));
        if (((int) (((long) this.zzbq.zzqN().getLength()) & 4294967295L)) < 66) {
            return;
        }
        byte[] bArrZzZ6 = zzZ6(bArrZzn);
        if (zzZ5(bArrZzZ6)) {
            bArrZzn = zzS(bArrZzn, bArrZzZ6);
        }
        byte[] bArr = bArrZzn;
        zzq().zzH(zzq().getPosition() - ((long) (z ? 16 : 8)));
        int iZzXc = zzXc();
        int iZzXc2 = zzXc();
        if (z) {
            width = zzXc();
            height = zzXc();
        } else {
            width = (int) (((long) this.zzbm.getWidth()) & 4294967295L);
            height = (int) (4294967295L & ((long) this.zzbm.getHeight()));
        }
        this.zzbp.zzX(new zzZP(zzZPY.zzG(iZzXc, iZzXc2), zzZPW.zzG(width, height), bArr));
    }

    public final void zzqA() throws Exception {
        long jZzN0 = zzN0();
        String strZzqI = zzqI();
        short sZzXa = zzXa();
        short sZzXa2 = zzXa();
        if ((sZzXa2 & 65535) <= strZzqI.length() - (65535 & sZzXa)) {
            strZzqI = strZzqI.substring(sZzXa, sZzXa2 + sZzXa);
        }
        this.zzbp.zzX(new zzZU(this.zzYX, this.zzbo.zzZ1(), jZzN0, strZzqI));
    }

    public final void zzqB() throws Exception {
        int iZzXa = zzXa() & 65535;
        long[][] jArr = new long[iZzXa][];
        for (int i = 0; i < iZzXa; i++) {
            jArr[i] = zzqs();
        }
        zzZG zzzg = new zzZG(zz9K.zzZ(jArr, false));
        zzzg.zzX(this.zzYs);
        zzzg.zzY(this.zzYr);
        this.zzbp.zzX(zzzg);
    }

    public final void zzqC() throws Exception {
        zzZG zzzg = new zzZG(zz9K.zzY(zzqs(), false));
        zzzg.zzX(this.zzYs);
        zzzg.zzY(this.zzYr);
        this.zzbp.zzX(zzzg);
    }

    public final void zzqD() throws Exception {
        zzZG zzzg = new zzZG(zz9K.zzY(zzqs(), false));
        zzzg.zzX(this.zzYs);
        zzzg.zzY(this.zzYr);
        if ((this.zzbq.zzqN().zzqh() & 65535) > 1) {
            zzqt();
        }
        if ((this.zzbq.zzqN().zzqh() & 65535) > 2 && readBoolean()) {
            zzZXW zzzxw = new zzZXW();
            zzzxw.zzZ(this);
            zzZA((int) (((long) zzzxw.getLength()) & 4294967295L), (int) zzq().getPosition());
        }
        this.zzbp.zzX(zzzg);
    }

    public final void zzqE() throws Exception {
        long jZzN0 = zzN0();
        long jZzN02 = zzN0();
        int i = (int) jZzN0;
        zzZG zzzg = new zzZG(zz9K.zzs(new zzZQ4(Float.intBitsToFloat(i), zzZPY.zzYC(jZzN0), Float.intBitsToFloat((int) jZzN02) - Float.intBitsToFloat(i), zzZPY.zzYC(jZzN02) - zzZPY.zzYC(jZzN0))));
        zzzg.zzX(this.zzYs);
        zzzg.zzY(this.zzYr);
        this.zzbp.zzX(zzzg);
    }

    public final void zzqF() throws Exception {
        long jZzN0 = zzN0();
        long jZzN02 = zzN0();
        int i = (int) jZzN0;
        zzZG zzzgZzW = zzZG.zzW(new zzZQ4(Float.intBitsToFloat(i), zzZPY.zzYC(jZzN0), Float.intBitsToFloat((int) jZzN02) - Float.intBitsToFloat(i), zzZPY.zzYC(jZzN02) - zzZPY.zzYC(jZzN0)));
        zzzgZzW.zzX(this.zzYs);
        zzzgZzW.zzY(this.zzYr);
        this.zzbp.zzX(zzzgZzW);
    }

    public final void zzqG() throws Exception {
        zzZG zzzgZzZ = zzZG.zzZ(zzN0(), zzN0());
        zzzgZzZ.zzX(this.zzYs);
        zzzgZzZ.zzY(this.zzYr);
        this.zzbp.zzX(zzzgZzZ);
    }

    public final void zzqH() throws Exception {
        this.zzbp.zzX(zzZG.zzZ(zzN0(), this.zzYs));
    }

    public final boolean zzqK() throws Exception {
        zzq().zzH(0L);
        String strZzZn = zzZO0.zzhX().zzZn(zzn(6));
        zzq().zzH(0L);
        return "VCLMTF".equals(strZzZn);
    }

    public final zzG zzqL() throws Exception {
        zzq().zzH(0L);
        zzZXY zzzxy = new zzZXY();
        this.zzbm = zzzxy;
        zzzxy.zzZ(this);
        this.zzbp = new zzG();
        for (int i = 0; i < (((long) this.zzbm.zzqM()) & 4294967295L); i++) {
            zzZXZ zzzxz = new zzZXZ();
            this.zzbq = zzzxz;
            zzzxz.zzZ(this);
        }
        return this.zzbp;
    }

    public final void zzqj() throws Exception {
        new zzZXW().zzZ(this);
        zzXa();
        zzXc();
        zzXc();
        zzqi();
        zzqi();
        readBoolean();
    }

    public final void zzqk() throws Exception {
        zzZXW zzzxw = new zzZXW();
        zzzxw.zzZ(this);
        this.zzbn = (short) 0;
        String strZzqI = zzqI();
        zzqI();
        zzXc();
        int iZzXc = zzXc();
        this.zzbn = zzXa();
        zzXa();
        zzXa();
        int iZzqJ = zzqJ();
        zzXa();
        zzXa();
        zzXa();
        readBoolean();
        readBoolean();
        readBoolean();
        zzX6();
        if ((zzzxw.zzqh() & 65535) > 1) {
            zzX6();
            zzXa();
            readBoolean();
            zzXa();
        }
        if ((zzzxw.zzqh() & 65535) > 2) {
            zzXa();
        }
        this.zzYX = this.zzwm.zzY(strZzqI, iZzXc, iZzqJ);
    }

    public final void zzql() throws Exception {
        zzZG zzzg = new zzZG(zz9K.zzX(zzqr(), zzN0(), zzN0()));
        zzzg.zzX(this.zzYs);
        zzzg.zzY(this.zzYr);
        this.zzbp.zzX(zzzg);
    }

    public final void zzqm() throws Exception {
        zzZG zzzg = new zzZG(zz9K.zzY(zzqr(), zzZPW.zzG(zzXc(), zzXc())));
        zzzg.zzX(this.zzYs);
        zzzg.zzY(this.zzYr);
        this.zzbp.zzX(zzzg);
    }

    public final void zzqn() throws Exception {
        zzZG zzzg = new zzZG(zz9K.zzY(zzqr(), zzN0(), zzN0()));
        zzzg.zzX(this.zzYs);
        zzzg.zzY(this.zzYr);
        this.zzbp.zzX(zzzg);
    }

    public final void zzqo() throws Exception {
        zzZG zzzg = new zzZG(zz9K.zzY(zzqr(), zzN0(), zzN0(), 1));
        zzzg.zzX(this.zzYs);
        zzzg.zzY(this.zzYr);
        this.zzbp.zzX(zzzg);
    }

    public final void zzqp() {
        if (this.zzbk.size() == 0) {
            return;
        }
        this.zzYs = new zzOU(this.zzbk.pop());
    }

    public final void zzqq() throws Exception {
        zzXa();
        zzPV zzpv = this.zzbl;
        if (zzpv != null) {
            this.zzbk.push(zzpv);
            this.zzbl = null;
        }
    }

    public final void zzqu() throws Exception {
        this.zzbo = new zzOU(zzMW());
    }

    public final void zzqw() throws Exception {
        zzOI zzoi = new zzOI(zzMW());
        if (!readBoolean()) {
            zzoi = new zzOI(zzPV.zzHZ);
        }
        this.zzYr = zzoi;
    }

    public final void zzqx() throws Exception {
        zzPV zzpvZzMW = zzMW();
        zzOU zzou = new zzOU(zzpvZzMW);
        if (!readBoolean()) {
            zzou = new zzOU(zzPV.zzHZ);
        }
        this.zzYs = zzou;
        this.zzbl = zzpvZzMW;
    }

    public final void zzqy() throws Exception {
        long jZzN0 = zzN0();
        if (this.zzYX != null) {
            jZzN0 = zzZPY.zzG(Float.intBitsToFloat((int) jZzN0), this.zzYX.zzPg() + zzZPY.zzYC(jZzN0));
        }
        zzqI();
        zzXc();
        this.zzbp.zzX(new zzZU(this.zzYX, this.zzbo.zzZ1(), jZzN0, zzqv()));
    }

    public final void zzqz() throws Exception {
        long jZzN0 = zzN0();
        zzqI();
        zzXc();
        zzXc();
        this.zzbp.zzX(new zzZU(this.zzYX, this.zzbo.zzZ1(), jZzN0, zzqv()));
    }
}
