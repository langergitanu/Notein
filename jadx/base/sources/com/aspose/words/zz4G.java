package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz4G extends zz80 implements zzZ94 {
    private zzZCB zzZf9;
    private static float[] zzZ0R = {0.0f, 0.33333334f, 0.6666667f, 1.0f};
    private static float[] zzZ0Q = {0.0f, 1.0f};
    private static float[] zzZ0P = {0.0f, 0.6f, 0.8f, 1.0f};
    private static float[] zzZ0O = {0.0f, 0.2f, 0.4f, 1.0f};
    private static float[] zzZ0N = {0.0f, 0.16666667f, 0.33333334f, 0.6666667f, 0.8333333f, 1.0f};
    private static double zzZ0M = com.aspose.words.internal.zzSA.zzp(0.14d);
    private static zzZCA zzZ9l = new zz6Q(zz4E.zzZxw());

    public zz4G() {
        zz6R zz6r = new zz6R();
        this.zzZf9 = zz6r;
        zz6r.zzZ(zzZ9l);
    }

    private void zzC(com.aspose.words.internal.zzOU zzou) {
        int iZzZxF = zzZxF();
        if (iZzZxF == 0) {
            zzou.zzV(zzZ0Q);
            return;
        }
        if (iZzZxF == 1) {
            zzou.zzV(zzZ0R);
            return;
        }
        if (iZzZxF == 2) {
            zzou.zzV(zzZ0P);
        } else if (iZzZxF == 3) {
            zzou.zzV(zzZ0O);
        } else {
            if (iZzZxF != 4) {
                throw new IllegalArgumentException();
            }
            zzou.zzV(zzZ0N);
        }
    }

    private void zzD(com.aspose.words.internal.zzOU zzou) {
        int iZzOz = zzOz();
        if (iZzOz == 0) {
            zzou.zzXX(2);
            zzou.setEndCap(2);
            zzou.zzXV(2);
        } else if (iZzOz == 1) {
            zzou.zzXX(1);
            zzou.setEndCap(1);
            zzou.zzXV(0);
        } else {
            if (iZzOz != 2) {
                throw new IllegalArgumentException();
            }
            zzou.zzXX(0);
            zzou.setEndCap(0);
            zzou.zzXV(0);
        }
        zzou.zzNO().zzY2(zzHq(zzOz()));
    }

    private void zzE(com.aspose.words.internal.zzOU zzou) {
        zzou.zzXW(zzYCC.zzmh(zzZxC()));
        if (zzLh(1)) {
            zzou.zzA((float) zzZxG());
        }
    }

    private void zzF(com.aspose.words.internal.zzOU zzou) {
        zzou.setAlignment(zzZxE() ? 1 : 0);
    }

    private void zzHp(int i) {
        if (zzLh(i)) {
            return;
        }
        if (i == 7) {
            zzL(7, (zz6T) zzZxB().zzZA0());
        } else {
            if (i != 8) {
                return;
            }
            zzL(8, (zz12) zzZxA().zzZA0());
        }
    }

    private static int zzHq(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: type");
    }

    private void zzL(int i, Object obj) {
        this.zzZf9.zzL(i, obj);
    }

    private Object zzLv(int i) {
        return this.zzZf9.zzLv(i);
    }

    private void zzZxI() {
        if (zzLu(9) == null) {
            int iZzZQ4 = getFill().zzZQ4();
            zzZAW zz1c = iZzZQ4 != 0 ? iZzZQ4 != 1 ? iZzZQ4 != 4 ? iZzZQ4 != 5 ? new zz1C() : new zz1C() : new zz41() : new zz7C() : new zzH0();
            zzo(0.0d, zzZxH() / 12700.0d);
            zz1c.zzZ(getFill().zzZBt());
            zzL(9, zz1c);
        }
    }

    public boolean equals(Object obj) {
        boolean zEquals = true;
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zz4G zz4g = (zz4G) obj;
        int[] values = zz4D.getValues();
        for (int i = 0; i < 11; i++) {
            int i2 = values[i];
            zEquals &= com.aspose.words.internal.zzZKO.equals(zzLu(i2), zz4g.zzLu(i2));
            if (!zEquals) {
                break;
            }
        }
        return zEquals;
    }

    @Override // com.aspose.words.zzZ94
    public final int getDashStyle() {
        if (zzZxD().zzZEW() == 1) {
            return ((zz3G) zzZxD()).zzZwm();
        }
        return 0;
    }

    @Override // com.aspose.words.zzZ94
    public final int getEndArrowLength() {
        return zzZxA().getLength();
    }

    @Override // com.aspose.words.zzZ94
    public final int getEndArrowType() {
        return zzZxA().getType();
    }

    @Override // com.aspose.words.zzZ94
    public final int getEndArrowWidth() {
        return zzZxA().getWidth();
    }

    @Override // com.aspose.words.zzZ94
    public final int getEndCap() {
        return zzOz();
    }

    @Override // com.aspose.words.zz80, com.aspose.words.zzZCH
    public com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return (com.aspose.words.internal.zzZYG) zzLv(10);
    }

    public final zz7X getFill() {
        return (zz7X) zzLv(9);
    }

    @Override // com.aspose.words.zzZ94
    public final byte[] getImageBytes() throws Exception {
        return getFill().getImageBytes();
    }

    @Override // com.aspose.words.zzZ94
    public final int getJoinStyle() {
        return zzZxC();
    }

    @Override // com.aspose.words.zzZ94
    public final int getLineFillType() {
        int iZzZQ4 = getFill().zzZQ4();
        return iZzZQ4 != 0 ? iZzZQ4 != 4 ? 0 : 1 : ((zzH0) getFill()).zzZPY() instanceof zzGY ? 2 : 3;
    }

    @Override // com.aspose.words.zzZ94
    public final int getLineStyle() {
        return zzZxF();
    }

    @Override // com.aspose.words.zzZ94
    public final boolean getOn() {
        return getFill() == null || getFill().zzZQ4() != 3;
    }

    @Override // com.aspose.words.zzZ94
    public final double getOpacity() {
        return getFill().getOpacity();
    }

    @Override // com.aspose.words.zzZ94
    public final int getStartArrowLength() {
        return zzZxB().getLength();
    }

    @Override // com.aspose.words.zzZ94
    public final int getStartArrowType() {
        return zzZxB().getType();
    }

    @Override // com.aspose.words.zzZ94
    public final int getStartArrowWidth() {
        return zzZxB().getWidth();
    }

    @Override // com.aspose.words.zzZ94
    public final zz7X getStrokeFill() {
        return getFill();
    }

    @Override // com.aspose.words.zzZ94
    public final double getWeight() {
        return zzZxH() / 12700.0d;
    }

    public int hashCode() {
        int[] values = zz4D.getValues();
        int iHashCode = 0;
        for (int i = 0; i < 11; i++) {
            Object objZzLu = zzLu(values[i]);
            if (objZzLu != null) {
                iHashCode ^= objZzLu.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // com.aspose.words.zzZ94
    public final void setDashStyle(int i) {
        if (zzLh(5) && zzZxD().zzZEW() == 1) {
            ((zz3G) zzZxD()).zzHa(i);
        }
        zz3G zz3g = new zz3G();
        zz3g.zzHa(i);
        zzL(5, zz3g);
    }

    @Override // com.aspose.words.zzZ94
    public final void setEndArrowLength(int i) {
        zzHp(8);
        zzZxA().setLength(i);
    }

    @Override // com.aspose.words.zzZ94
    public final void setEndArrowType(int i) {
        zzHp(8);
        zzZxA().setType(i);
    }

    @Override // com.aspose.words.zzZ94
    public final void setEndArrowWidth(int i) {
        zzHp(8);
        zzZxA().setWidth(i);
    }

    @Override // com.aspose.words.zzZ94
    public final void setEndCap(int i) {
        zzY2(i);
    }

    @Override // com.aspose.words.zz80, com.aspose.words.zzZCH
    public void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        zzL(10, zzzyg);
    }

    public final void setFill(zz7X zz7x) {
        zzL(9, zz7x);
    }

    @Override // com.aspose.words.zzZ94
    public final void setJoinStyle(int i) {
        zzHn(i);
    }

    @Override // com.aspose.words.zzZ94
    public final void setLineFillType(int i) {
        Object zz1c;
        if (i == 0) {
            zz1c = new zz1C();
        } else if (i == 1) {
            zz1c = new zz41();
        } else if (i == 2) {
            zzH0 zzh0 = new zzH0();
            zzh0.zzZ(new zzGY());
            zz1c = zzh0;
        } else if (i != 3) {
            zz1c = new zz1C();
        } else {
            zzH0 zzh02 = new zzH0();
            zzh02.zzZ(new zzGZ());
            zz1c = zzh02;
        }
        zzL(9, zz1c);
    }

    @Override // com.aspose.words.zzZ94
    public final void setLineStyle(int i) {
        zzHo(i);
    }

    @Override // com.aspose.words.zzZ94
    public final void setOn(boolean z) {
        zzZAV zzzavZzZBt = getFill() != null ? getFill().zzZBt() : null;
        if (!z) {
            if (getFill() != null && getFill().zzZQ4() != 3) {
                zzo(zzZxH() / 12700.0d, 0.0d);
            }
            zzL(9, new zz54());
            getFill().zzZ(zzzavZzZBt);
            return;
        }
        if (getFill() == null || getFill().zzZQ4() != 3) {
            return;
        }
        this.zzZf9.remove(9);
        if (getFill() != null) {
            getFill().zzZ(zzzavZzZBt);
        }
    }

    @Override // com.aspose.words.zzZ94
    public final void setOpacity(double d) {
        Shape shape;
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        zzZxI();
        if (com.aspose.words.internal.zzPV.zzZ(getFill().zz8Q(), com.aspose.words.internal.zzPV.zzHZ) && (shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(getFill().zzZBt(), Shape.class)) != null) {
            zz2J zz2j = (zz2J) shape.zzY9i();
            if (zz2j.zzZTj() != null) {
                getFill().zzP(zz2j.zzZTj().zzZu4().zzZQX());
            }
        }
        getFill().setOpacity(d);
    }

    @Override // com.aspose.words.zzZ94
    public final void setStartArrowLength(int i) {
        zzHp(7);
        zzZxB().setLength(i);
    }

    @Override // com.aspose.words.zzZ94
    public final void setStartArrowType(int i) {
        zzHp(7);
        zzZxB().setType(i);
    }

    @Override // com.aspose.words.zzZ94
    public final void setStartArrowWidth(int i) {
        zzHp(7);
        zzZxB().setWidth(i);
    }

    @Override // com.aspose.words.zzZ94
    public final void setStrokeFill(zz7X zz7x) {
        zzL(9, zz7x);
    }

    @Override // com.aspose.words.zzZ94
    public final void setWeight(double d) {
        if (d < 0.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        if (getOn()) {
            zzo(zzZxH() / 12700.0d, d);
        }
        zzXK(com.aspose.words.internal.zzSA.zzp(d));
    }

    @Override // com.aspose.words.zzZ94
    public final com.aspose.words.internal.zzPV zz8Q() {
        return getFill().zz8Q();
    }

    public final void zzHn(int i) {
        zzL(6, Integer.valueOf(i));
    }

    public final void zzHo(int i) {
        zzL(2, Integer.valueOf(i));
    }

    public final boolean zzLh(int i) {
        return this.zzZf9.zzLh(i);
    }

    public final Object zzLu(int i) {
        return this.zzZf9.zzLu(i);
    }

    public final int zzOz() {
        return ((Integer) zzLv(3)).intValue();
    }

    public final void zzV(zzBW zzbw) {
        if (getFill() != null) {
            getFill().zzV(zzbw);
        }
    }

    public final void zzWX(boolean z) {
        zzL(4, Boolean.valueOf(z));
    }

    public final void zzX(zz4G zz4g) {
        zz7X zz7x;
        zzZCB zzzcbZzZOm = this.zzZf9.zzZzX().zzZOm();
        if (zzzcbZzZOm != null && (zz7x = (zz7X) com.aspose.words.internal.zzZKW.zzZ(zzzcbZzZOm.zzLv(9), zz7X.class)) != null) {
            zz7x.zzZ((zzZAV) null);
        }
        this.zzZf9.zzZ(new zz6Q(zz4g.zzZf9));
    }

    public final void zzXJ(double d) {
        zzL(1, Double.valueOf(d));
    }

    public final void zzXK(double d) {
        zzL(0, Double.valueOf(d));
    }

    public final void zzY2(int i) {
        zzL(3, Integer.valueOf(i));
    }

    public final com.aspose.words.internal.zzOU zzZ(zzGR zzgr, boolean z) throws Exception {
        zz4G zz4gZzR = zzgr.zzZTj().zzR(zzgr);
        zz4gZzR.getFill().zzZ(getFill().zzZBt());
        zzX(zz4gZzR);
        com.aspose.words.internal.zzPY zzpyZzZ = zzZ(zzgr, zz4gZzR);
        if (zzpyZzZ.isEmpty()) {
            return null;
        }
        double dZzZ = zzZ(zz4gZzR, z);
        com.aspose.words.internal.zzOU zzou = new com.aspose.words.internal.zzOU(zzpyZzZ, (float) dZzZ);
        zzC(zzou);
        zzD(zzou);
        zzF(zzou);
        zzE(zzou);
        zzZxD().zzG(zzou);
        zzou.zzNO().setWidth((float) (dZzZ / 12700.0d));
        if (zzZxB() != null) {
            zzZxB().zzG(zzou);
        }
        if (zzZxA() != null) {
            zzZxA().zzG(zzou);
        }
        return zzou;
    }

    @Override // com.aspose.words.zzZ94
    public final com.aspose.words.internal.zzPV zzZBx() {
        return getFill().zzZBx();
    }

    @Override // com.aspose.words.zzZ94
    public final com.aspose.words.internal.zzPV zzZBy() {
        return getFill().zzZBy();
    }

    public final zz12 zzZxA() {
        return (zz12) zzLv(8);
    }

    public final zz6T zzZxB() {
        return (zz6T) zzLv(7);
    }

    public final int zzZxC() {
        return ((Integer) zzLv(6)).intValue();
    }

    public final zzAX zzZxD() {
        return (zzAX) zzLv(5);
    }

    public final boolean zzZxE() {
        return ((Boolean) zzLv(4)).booleanValue();
    }

    public final int zzZxF() {
        return ((Integer) zzLv(2)).intValue();
    }

    public final double zzZxG() {
        return ((Double) zzLv(1)).doubleValue();
    }

    public final double zzZxH() {
        return ((Double) zzLv(0)).doubleValue();
    }

    public final void zzZxJ() {
        this.zzZf9.remove(3);
    }

    public final zz4G zzZxK() {
        zz4G zz4g = new zz4G();
        zzZCB zzzcb = this.zzZf9;
        if (zzzcb != null) {
            zz4g.zzZf9 = zzzcb.zzZzY();
        }
        if (zzLh(9)) {
            zz4g.zzL(9, getFill().zzZQ6());
        }
        if (zzLh(5)) {
            zz4g.zzL(5, zzZxD().zzZEY());
        }
        if (zzLh(7)) {
            zz4g.zzL(7, (zz6T) zzZxB().zzZA0());
        }
        if (zzLh(8)) {
            zz4g.zzL(8, (zz12) zzZxA().zzZA0());
        }
        if (zzLh(10)) {
            zz4g.setExtensions(zzZBz());
        }
        return zz4g;
    }

    public final boolean zzZxx() {
        return zzLh(6);
    }

    public final boolean zzZxy() {
        return zzLh(0);
    }

    public final int zzZxz() {
        return this.zzZf9.getCount();
    }

    @Override // com.aspose.words.zzZ94
    public final void zzi(com.aspose.words.internal.zzPV zzpv) {
        zzZxI();
        if (getFill().zzZQ4() == 4 || getFill().zzZQ4() == 1) {
            getFill().zzi(zzpv);
        }
    }

    @Override // com.aspose.words.zzZ94
    public final void zzm(com.aspose.words.internal.zzPV zzpv) {
        zzZxI();
        getFill().zzm(zzpv);
    }

    public final void zzo(double d, double d2) {
        Shape shape;
        if (getFill() == null || (shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(getFill().zzZBt(), Shape.class)) == null) {
            return;
        }
        zz54 zz54Var = (zz54) zz4E.zzZxw().zzLu(9);
        if (zzLu(9) == null && !com.aspose.words.internal.zzZKO.zzA(getFill(), zz54Var) && shape.isImage()) {
            return;
        }
        zz4F.zzZ(shape, d, d2);
    }

    private com.aspose.words.internal.zzPY zzZ(zzGR zzgr, zz4G zz4g) throws Exception {
        zz7X fill = getFill();
        if (fill == null && zz4g != null) {
            fill = zz4g.getFill();
        }
        if (fill == null) {
            fill = new zz54();
        }
        return fill.zzZ(zzgr);
    }

    public final void zzZ(zzAX zzax) {
        zzL(5, zzax);
    }

    public final void zzZ(zz6T zz6t) {
        zzL(7, zz6t);
    }

    public final void zzZ(zz12 zz12Var) {
        zzL(8, zz12Var);
    }

    private double zzZ(zz4G zz4g, boolean z) {
        double dZzZxH = zz4g.zzLh(0) ? zz4g.zzZxH() : 9525.0d;
        if (zzLh(0)) {
            dZzZxH = zzZxH();
        }
        if (!z) {
            double d = zzZ0M;
            if (dZzZxH < d) {
                return d;
            }
        }
        return dZzZxH;
    }
}
