package com.aspose.words;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2X implements zzZAW {
    private zzZAV zzZ3V;
    private static double[] zzWYk = {0.0d, 0.0d, 0.0d, 0.0d};
    private static double[] zzWYj = {1.0d, 0.0d, 1.0d, 0.0d};
    private static double[] zzWYi = {0.0d, 1.0d, 0.0d, 1.0d};
    private static double[] zzWYh = {1.0d, 1.0d, 1.0d, 1.0d};
    private static double[] zzWYg = {0.5d, 0.5d, 0.5d, 0.5d};

    private ShapeBase zz7u() {
        return (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(this.zzZ3V, ShapeBase.class);
    }

    private Object zzPj(int i) {
        return zz7u().fetchShapeAttr(i);
    }

    private void zzQ(int i, Object obj) {
        zz7u().setShapeAttr(i, obj);
    }

    private static double[] zzV1(int i, int i2) {
        if (i != 5) {
            if (i == 6) {
                return zzWYg;
            }
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "The specified value is out of range.\r\nParameter name: style\r\nParameter value: "));
        }
        if (i2 == 1) {
            return zzWYk;
        }
        if (i2 == 2) {
            return zzWYj;
        }
        if (i2 == 3) {
            return zzWYi;
        }
        if (i2 == 4) {
            return zzWYh;
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "The specified value is out of range.\r\nParameter name: variant\r\nParameter value: "));
    }

    private static int zzV2(int i, int i2) {
        if (i2 == 1) {
            return i == 4 ? 0 : 100;
        }
        if (i2 == 2) {
            return i == 4 ? 100 : 0;
        }
        if (i2 == 3) {
            return i == 1 ? 50 : -50;
        }
        if (i2 == 4) {
            return i == 1 ? -50 : 50;
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "The specified value is out of range.\r\nParameter name: variant\r\nParameter value: "));
    }

    public static int zzV3(int i, int i2) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return zzV2(i, i2);
            case 5:
                return zziz(i2);
            case 6:
                return zziA(i2);
            default:
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "The specified value is out of range.\r\nParameter name: style\r\nParameter value: "));
        }
    }

    private void zzVY(double d) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        zzQ(386, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(d)));
    }

    private static int zzVZ(double d) {
        if (Math.abs(d) > 360.0d) {
            d %= 360.0d;
        }
        if (com.aspose.words.internal.zzAN.zzZD(d)) {
            return 1;
        }
        if (com.aspose.words.internal.zzAN.zzL(d, -90.0d)) {
            return 2;
        }
        if (com.aspose.words.internal.zzAN.zzL(d, -135.0d)) {
            return 3;
        }
        return com.aspose.words.internal.zzAN.zzL(d, -45.0d) ? 4 : -1;
    }

    private double zzXTE() {
        return ((double) ((Integer) zzPj(400)).intValue()) / 65536.0d;
    }

    private double zzXTF() {
        return ((double) ((Integer) zzPj(399)).intValue()) / 65536.0d;
    }

    private void zzXTG() {
        zz7u().removeShapeAttr(EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA);
    }

    private int zzXTH() {
        int iZzZBo = zzZBo();
        if (iZzZBo != 0) {
            return iZzZBo != 100 ? 0 : 1;
        }
        return 2;
    }

    public static void zzZ(zzYC3 zzyc3, int i, int i2) {
        double[] dArrZzV1 = zzV1(i, i2);
        zzyc3.zzO(397, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(dArrZzV1[0])));
        zzyc3.zzO(398, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(dArrZzV1[1])));
        zzyc3.zzO(399, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(dArrZzV1[2])));
        zzyc3.zzO(400, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(dArrZzV1[3])));
    }

    private int zzZwX() {
        double[] dArr = {zzZBq(), zzZBp(), zzXTF(), zzXTE()};
        if (com.aspose.words.internal.zzZ1.zzZ(dArr, zzWYk)) {
            return 1;
        }
        if (com.aspose.words.internal.zzZ1.zzZ(dArr, zzWYj)) {
            return 2;
        }
        if (com.aspose.words.internal.zzZ1.zzZ(dArr, zzWYi)) {
            return 3;
        }
        return com.aspose.words.internal.zzZ1.zzZ(dArr, zzWYh) ? 4 : 0;
    }

    private static int zziA(int i) {
        if (i == 1) {
            return 100;
        }
        if (i == 2) {
            return 0;
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "The specified value is out of range.\r\nParameter name: variant\r\nParameter value: "));
    }

    private int zziB(int i) {
        int iZzZBo = zzZBo();
        if (iZzZBo == -50) {
            return i == 1 ? 4 : 3;
        }
        if (iZzZBo == 0) {
            return i == 4 ? 1 : 2;
        }
        if (iZzZBo == 50) {
            return i == 1 ? 3 : 4;
        }
        if (iZzZBo != 100) {
            return 0;
        }
        return i == 4 ? 2 : 1;
    }

    public static double zziC(int i) {
        if (i == 2) {
            return -90.0d;
        }
        if (i != 3) {
            return i != 4 ? 0.0d : -45.0d;
        }
        return -135.0d;
    }

    private static int zziz(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return 100;
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "The specified value is out of range.\r\nParameter name: variant\r\nParameter value: "));
    }

    @Override // com.aspose.words.zzZAW
    public final int getFillType() {
        return ((Integer) zzPj(384)).intValue();
    }

    @Override // com.aspose.words.zzZAW
    public final int getGradientStyle() {
        if (zz7u() == null) {
            return -1;
        }
        switch (((Integer) zzPj(384)).intValue()) {
        }
        return -1;
    }

    @Override // com.aspose.words.zzZAW
    public final int getGradientVariant() {
        int gradientStyle = getGradientStyle();
        switch (gradientStyle) {
            case 1:
            case 2:
            case 3:
            case 4:
                return zziB(gradientStyle);
            case 5:
                return zzZwX();
            case 6:
                return zzXTH();
            default:
                return 0;
        }
    }

    @Override // com.aspose.words.zzZAW
    public final byte[] getImageBytes() {
        return (byte[]) zzPj(4110);
    }

    @Override // com.aspose.words.zzZAW
    public final boolean getOn() {
        return ((Boolean) zzPj(443)).booleanValue();
    }

    @Override // com.aspose.words.zzZAW
    public final double getOpacity() {
        return ((double) ((Integer) zzPj(386)).intValue()) / 65536.0d;
    }

    @Override // com.aspose.words.zzZAW
    public final void setImageBytes(byte[] bArr) {
        zzIc(3);
        zzQ(4110, bArr);
        zzQ(443, Boolean.TRUE);
        zzXTG();
    }

    @Override // com.aspose.words.zzZAW
    public final void setOn(boolean z) {
        zzQ(443, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZAW
    public final void setOpacity(double d) {
        zzVY(d);
    }

    @Override // com.aspose.words.zzZAW
    public final com.aspose.words.internal.zzPV zz8Q() {
        return (com.aspose.words.internal.zzPV) zzPj(385);
    }

    @Override // com.aspose.words.zzZAW
    public final void zzIc(int i) {
        zzQ(384, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZAW
    public final Shading zzX(zzGR zzgr) throws Exception {
        switch (getFillType()) {
            case 0:
                return zzYCL.zzZI(zz8Q());
            case 1:
                int iZzYf = zzY30.zzYf(getImageBytes());
                if (iZzYf != -1) {
                    return zzYCL.zzZ(iZzYf, zz8Q(), zzZBx());
                }
                return null;
            case 2:
            case 3:
                return zzYCL.zzZI(zz8Q());
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
                return zzYCL.zzZ(zzZBw(), zz8Q(), zzZBx());
            case 9:
                return zz7u() == zz7u().getDocument().getBackgroundShape() ? zzYCL.zzZI(zz8Q()) : zz7u().getDocument().getBackgroundShape().zzY9J().zzX(zzgr);
            default:
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected shape fill type '{0}.'", Integer.valueOf(getFillType())));
        }
    }

    @Override // com.aspose.words.zzZAW
    public final void zzXV(double d) {
        zzQ(395, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(d)));
    }

    @Override // com.aspose.words.zzZAW
    public final void zzY6(boolean z) {
        zzQ(442, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZAW
    public final int zzZBo() {
        return ((Integer) zzPj(396)).intValue();
    }

    @Override // com.aspose.words.zzZAW
    public final double zzZBp() {
        return ((double) ((Integer) zzPj(398)).intValue()) / 65536.0d;
    }

    @Override // com.aspose.words.zzZAW
    public final double zzZBq() {
        return ((double) ((Integer) zzPj(397)).intValue()) / 65536.0d;
    }

    @Override // com.aspose.words.zzZAW
    public final void zzZBr() {
        zzQ(405, 4);
    }

    @Override // com.aspose.words.zzZAW
    public final boolean zzZBs() {
        return ((Integer) zzPj(405)).intValue() != 0;
    }

    @Override // com.aspose.words.zzZAW
    public final double zzZBu() {
        return ((double) ((Integer) zzPj(395)).intValue()) / 65536.0d;
    }

    @Override // com.aspose.words.zzZAW
    public final double zzZBv() {
        return ((double) ((Integer) zzPj(388)).intValue()) / 65536.0d;
    }

    @Override // com.aspose.words.zzZAW
    public final zzZLE[] zzZBw() {
        return (zzZLE[]) zzPj(407);
    }

    @Override // com.aspose.words.zzZAW
    public final com.aspose.words.internal.zzPV zzZBx() {
        return (com.aspose.words.internal.zzPV) zzPj(387);
    }

    @Override // com.aspose.words.zzZAW
    public final com.aspose.words.internal.zzPV zzZBy() {
        return zz8Q();
    }

    @Override // com.aspose.words.zzZAW
    public final boolean zzZQ5() {
        return ((Boolean) zzPj(442)).booleanValue();
    }

    @Override // com.aspose.words.zzZAW
    public final void zzi(com.aspose.words.internal.zzPV zzpv) {
        zzQ(387, zzpv);
    }

    @Override // com.aspose.words.zzZAW
    public final void zzm(com.aspose.words.internal.zzPV zzpv) {
        zzQ(385, zzpv);
    }

    @Override // com.aspose.words.zzZAW
    public final void zzZ(zzZAV zzzav) {
        this.zzZ3V = zzzav;
    }
}
