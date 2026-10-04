package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYL1 {
    static boolean zzZD5 = true;
    private int zzXDu;
    private com.aspose.words.internal.zzZYV<Object> zzXDv;
    private boolean zzXDw;
    private boolean zzXDx;
    protected zzYJD zzYTI;
    protected WordAttrCollection zzZF0;
    private IWarningCallback zzZG0;
    protected zzY9I zzZzR = new zzY9I(new com.aspose.words.internal.zzZOR());

    public zzYL1(zzZZ2 zzzz2) throws Exception {
        this.zzZG0 = zzzz2.zzYUo;
        this.zzYTI = zzzz2.zzYUs;
    }

    private void zz5(int i, Object obj) throws Exception {
        if (obj != null) {
            this.zzZzR.zzVz(i, com.aspose.words.internal.zzZQB.zz2(obj));
        }
    }

    private static int zzpM(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
                return 8;
            case 5:
                return 64;
            case 6:
                return 16;
            case 7:
                return 128;
            case 8:
                return 32;
            case 9:
                return 512;
            case 10:
                return 256;
            case 11:
                return 2048;
            case 12:
                return 1024;
            default:
                return 0;
        }
    }

    public final void zz0(int i, Object obj) throws Exception {
        Border border = (Border) obj;
        if (border == null || border.isInherited()) {
            return;
        }
        this.zzZzR.zzJ((short) i);
        zzXY.zzZ(border, this.zzZzR, true);
    }

    public final void zz1(int i, Object obj) throws Exception {
        if (obj != null) {
            this.zzZzR.zzVy(i, zzY0E.zzZD((com.aspose.words.internal.zzPV) obj));
        }
    }

    public final void zz2(int i, Object obj) throws Exception {
        if (obj != null) {
            this.zzZzR.zzVB(i, zzY0E.zzZE((com.aspose.words.internal.zzPV) obj));
        }
    }

    public final void zz3(int i, Object obj) throws Exception {
        if (obj != null) {
            this.zzZzR.zzVy(i, com.aspose.words.internal.zzZQB.zz2(obj));
        }
    }

    public final void zz4(int i, Object obj) throws Exception {
        if (obj != null) {
            this.zzZzR.zzVA(i, com.aspose.words.internal.zzZQB.zz2(obj));
        }
    }

    public final void zz6(int i, Object obj) throws Exception {
        if (obj == null) {
            return;
        }
        this.zzZzR.zzVB(i, obj instanceof Integer ? ((Integer) obj).intValue() : obj instanceof zzZU ? ((zzZU) obj).getValue() : com.aspose.words.internal.zzZQB.zz2(obj));
    }

    public final void zz7(int i, Object obj) throws Exception {
        if (obj != null) {
            this.zzZzR.zzZe(i, ((Boolean) obj).booleanValue());
        }
    }

    public final byte[] zzT(WordAttrCollection wordAttrCollection) throws Exception {
        this.zzZF0 = wordAttrCollection;
        this.zzZzR.zzq().zzH(0L);
        zzYpe();
        return zzYmM();
    }

    public final void zzV(int i, int i2, int i3, boolean z) throws Exception {
        int iZzGm;
        if (this.zzZF0.zzVE(i2) || this.zzZF0.zzVE(i3)) {
            int iIntValue = ((Integer) this.zzZF0.zzPj(i3)).intValue();
            if (iIntValue == 0) {
                iZzGm = ((Integer) this.zzZF0.zzPj(i2)).intValue();
                if (z) {
                    iZzGm++;
                }
            } else {
                iZzGm = zzZZK.zzGm(iIntValue);
            }
            this.zzZzR.zzVA(i, iZzGm);
        }
    }

    public final void zzW(int i, int i2, int i3, boolean z) throws Exception {
        int iZzGo;
        if (this.zzZF0.zzVE(i2) || this.zzZF0.zzVE(i3)) {
            int iIntValue = ((Integer) this.zzZF0.zzPj(i3)).intValue();
            if (iIntValue == 0) {
                iZzGo = ((Integer) this.zzZF0.zzPj(i2)).intValue();
                if (z) {
                    iZzGo++;
                }
            } else {
                iZzGo = zzZZK.zzGo(iIntValue);
            }
            this.zzZzR.zzVA(i, iZzGo);
        }
    }

    public final void zzW7(int i, int i2) throws Exception {
        if (this.zzZF0.zz6D()) {
            zzZMK zzzmkZzYsN = this.zzZF0.zzYsN();
            this.zzZzR.zzJ((short) i);
            this.zzZzR.writeByte((byte) 7);
            this.zzZzR.writeByte((byte) 1);
            this.zzZzR.zzK((short) this.zzYTI.zzCK(zzzmkZzYsN.getAuthor()));
            zzKE.zzZ(zzzmkZzYsN.zzZx(), this.zzZzR);
            this.zzZzR.zzZe(i2, true);
            this.zzXDw = true;
            WordAttrCollection wordAttrCollection = this.zzZF0;
            this.zzZF0 = zzzmkZzYsN.zzZ6C();
            zzYpe();
            this.zzZF0 = wordAttrCollection;
            this.zzXDw = false;
        }
    }

    public final long zzW8(int i, int i2) throws Exception {
        this.zzXDx = true;
        this.zzZzR.zzJ((short) i);
        long position = (int) this.zzZzR.zzq().getPosition();
        this.zzZzR.writeByte((byte) 0);
        this.zzZzR.zzJ((short) zzpM(i2));
        return position;
    }

    public final void zzW9(int i, int i2) throws Exception {
        zzZX(i, this.zzZF0.zzPk(i2));
    }

    public final void zzWa(int i, int i2) throws Exception {
        zzZZ(i, this.zzZF0.zzPk(i2));
    }

    public final void zzWb(int i, int i2) throws Exception {
        zz0(i, this.zzZF0.zzPk(i2));
    }

    public final void zzWc(int i, int i2) throws Exception {
        zz3(i, this.zzZF0.zzPk(i2));
    }

    public final void zzWd(int i, int i2) throws Exception {
        zz5(i, this.zzZF0.zzPk(i2));
    }

    public final void zzWe(int i, int i2) throws Exception {
        zz4(i, this.zzZF0.zzPk(i2));
    }

    public final void zzWf(int i, int i2) throws Exception {
        zz6(i, this.zzZF0.zzPk(i2));
    }

    public final void zzWg(int i, int i2) throws Exception {
        if (this.zzZF0.zzPk(i2) != null) {
            this.zzZzR.zzZe(i, !((Boolean) r3).booleanValue());
        }
    }

    public final void zzWh(int i, int i2) throws Exception {
        zz7(i, this.zzZF0.zzPk(i2));
    }

    public final void zzXq(long j) throws Exception {
        long position = this.zzZzR.zzq().getPosition();
        this.zzZzR.zzq().zzH(j);
        this.zzZzR.writeByte((byte) ((position - j) - 1));
        this.zzZzR.zzq().zzH(position);
        this.zzXDx = false;
    }

    public final void zzYmH() throws Exception {
        zzpL(Integer.MAX_VALUE);
    }

    public final boolean zzYmI() {
        return this.zzXDw;
    }

    public final void zzYmJ() throws Exception {
        zzV(33817, 1302, 1300, false);
    }

    public final void zzYmK() throws Exception {
        zzW(33816, 1292, 1290, false);
    }

    public final void zzYmL() throws Exception {
        zz1(26736, this.zzZF0.zzPk(160));
    }

    public final byte[] zzYmM() throws Exception {
        int position = (int) this.zzZzR.zzq().getPosition();
        byte[] bArr = new byte[position];
        this.zzZzR.zzq().zzH(0L);
        this.zzZzR.zzq().read(bArr, 0, position);
        return bArr;
    }

    public final boolean zzYmO() {
        return this.zzXDx;
    }

    public abstract void zzYpe() throws Exception;

    public final void zzZX(int i, Object obj) throws Exception {
        Shading shading = (Shading) obj;
        if (shading == null || shading.isInherited()) {
            return;
        }
        this.zzZzR.zzJ((short) i);
        this.zzZzR.writeByte((byte) 10);
        zzYCK.zzY(shading, this.zzZzR);
    }

    public final void zzZY(int i, Object obj) throws Exception {
        Shading shading = (Shading) obj;
        if (shading == null || shading.isInherited()) {
            return;
        }
        this.zzZzR.zzJ((short) i);
        zzYCK.zzZ(shading, this.zzZzR);
    }

    public final void zzZZ(int i, Object obj) throws Exception {
        Border border = (Border) obj;
        if (border == null || border.isInherited()) {
            return;
        }
        this.zzZzR.zzJ((short) i);
        this.zzZzR.writeByte((byte) 8);
        zzXY.zzY(border, this.zzZzR, true);
    }

    public final void zzpL(int i) throws Exception {
        while (this.zzXDu < this.zzXDv.getCount() && this.zzXDv.zzT3(this.zzXDu) < i) {
            zzqA(this.zzXDv.zzT3(this.zzXDu));
            this.zzXDu++;
        }
    }

    public abstract void zzqA(int i) throws Exception;

    public final void zz3(int[] iArr) {
        com.aspose.words.internal.zzZYV<Object> zzzyv = this.zzXDv;
        if (zzzyv == null) {
            this.zzXDv = new com.aspose.words.internal.zzZYV<>();
        } else {
            zzzyv.clear();
        }
        for (int i : iArr) {
            this.zzXDv.add(i, 0);
        }
        this.zzXDu = 0;
    }

    public final void zz0(int i, int i2, int i3) throws Exception {
        if (this.zzZF0.zzVE(i2) || this.zzZF0.zzVE(i3)) {
            int iZzGq = zzZZK.zzGq(((Integer) this.zzZF0.zzPj(i3)).intValue());
            this.zzZzR.zzVB(i, (zzZZK.zzGs(((Integer) this.zzZF0.zzPj(i2)).intValue()) << 6) | (iZzGq << 4));
        }
    }
}
