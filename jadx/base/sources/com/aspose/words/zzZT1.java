package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZT1 {
    static boolean zzZD5 = false;
    private zzZSX zzYJA;
    private zzZSW zzYJB;
    private zzZTN zzYJC;

    public zzZT1(zzZTN zzztn) {
        this.zzYJC = zzztn;
        this.zzYJB = new zzZSW(zzztn);
        this.zzYJA = new zzZSX(zzztn);
    }

    private static void zzY(ShapeBase shapeBase, zzZSP zzzsp) throws Exception {
        zzZTA zzzta = new zzZTA();
        zzZT2 zzzt2ZzW = new zzZT1(new zzZTN(shapeBase.getDocument(), zzzta, null, new com.aspose.words.internal.zzXB(), null)).zzW(shapeBase, 3);
        int position = (int) zzzsp.zzq().getPosition();
        zzzt2ZzW.zzS(zzzsp);
        zzzta.zzZ(zzzsp, position);
    }

    private GroupShape zzZ(zzZSZ zzzsz) throws Exception {
        GroupShape groupShape = new GroupShape(this.zzYJC.zzYKc);
        zzZ((zzZT2) zzzsz.zzEi(0), groupShape);
        for (int i = 1; i < zzzsz.getCount(); i++) {
            groupShape.zzA(zzX(zzzsz.zzEi(i)));
        }
        return groupShape;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzZT2 zzW(ShapeBase shapeBase, int i) throws Exception {
        zzZT2 zzzt2 = new zzZT2();
        if (shapeBase.isGroup()) {
            zzZT0 zzzt0 = new zzZT0();
            zzzt0.zzXP(shapeBase.zzY9L());
            zzzt0.zzXO(shapeBase.zzY9K());
            zzzt2.zzZiD().zzZ(zzzt0);
        }
        zzZT4 zzzt4 = new zzZT4();
        zzzt4.zzE4(shapeBase.getId());
        int shapeType = shapeBase.getShapeType();
        if (shapeType == -2) {
            zzzt4.setShapeType(75);
        } else if (shapeType == -1) {
            zzzt4.setShapeType(0);
        } else if (shapeType != 201) {
            zzzt4.setShapeType(shapeBase.getShapeType());
        }
        zzzt4.zzWn(shapeBase.isGroup());
        zzzt4.zzWh(i == 0);
        zzzt4.zzWm(i == 2);
        zzzt4.zzWi(shapeBase.zz5K());
        zzzt4.zzWl(shapeBase.zzZid() && !shapeBase.isInline());
        zzzt4.zzWg(!shapeBase.isGroup());
        zzzt4.zzZib();
        zzzt4.zzE3(shapeBase.getFlipOrientation());
        zzzt2.zzZiD().zzZ(zzzt4);
        zzZSY zzzsy = new zzZSY(false);
        zzZSY zzzsy2 = new zzZSY(true);
        this.zzYJB.zzZ(shapeBase, zzzsy.zzZi4(), zzzsy2.zzZi4(), zzzt4.zzZic());
        if (zzzsy.zzZi4().getCount() > 0) {
            zzzt2.zzZiD().zzZ(zzzsy);
        }
        if (zzzsy2.zzZi4().getCount() > 0) {
            zzzt2.zzZiD().zzZ(zzzsy2);
        }
        if (i == 3) {
            zzZTT zzztt = new zzZTT();
            zzztt.zzZiI();
            zzzt2.zzZiD().zzZ(zzztt);
        } else {
            if (!zzzt4.zzZic()) {
                if (zzzt4.isChild()) {
                    zzZTU zzztu = new zzZTU();
                    zzZT3 zzzt3Zzg = zzZT3.zzg(shapeBase);
                    zzztu.setLeft((int) zzzt3Zzg.zzYJG);
                    zzztu.setTop((int) zzzt3Zzg.zzYJF);
                    zzztu.setWidth((int) zzzt3Zzg.zzYJE);
                    zzztu.setHeight((int) zzzt3Zzg.zzYJD);
                    zzzt2.zzZiD().zzZ(zzztu);
                } else {
                    zzzt2.zzZiD().zzZ(new zzZTT());
                }
            }
            zzZTS zzzts = new zzZTS();
            zzzts.zzZiH();
            zzzt2.zzZiD().zzZ(zzzts);
            if (shapeBase.zzY9B() != 0) {
                zzZTR zzztr = new zzZTR();
                zzztr.zzEk(shapeBase.zzY9B());
                zzzt2.zzZiD().zzZ(zzztr);
            }
        }
        zzTM zztm = (zzTM) shapeBase.zzYvW().get(4156);
        if (zztm != null) {
            this.zzYJC.zzYKa.zzZ(shapeBase.getId(), zztm);
        }
        return zzzt2;
    }

    public final ShapeBase zzX(zzZT7 zzzt7) throws Exception {
        switch (zzzt7.zzZii().getType()) {
            case 61443:
                return zzZ((zzZSZ) zzzt7);
            case 61444:
                return zzZ((zzZT2) zzzt7);
            default:
                throw new IllegalStateException("Unknown escher record type in a group container.");
        }
    }

    public final zzZTO zzX(ShapeBase shapeBase, int i) throws Exception {
        if (shapeBase.isGroup()) {
            return zzZ((GroupShape) shapeBase, i);
        }
        return zzW(shapeBase, i);
    }

    private zzZSZ zzZ(GroupShape groupShape, int i) throws Exception {
        zzZSZ zzzsz = new zzZSZ();
        zzzsz.zzZiD().zzZ(zzW(groupShape, i));
        for (Node firstChild = groupShape.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            zzzsz.zzZiD().zzZ(zzX((ShapeBase) firstChild, 2));
        }
        return zzzsz;
    }

    private static void zzX(ShapeBase shapeBase, zzZSP zzzsp) throws Exception {
        zzZT2 zzzt2 = new zzZT2();
        zzZT4 zzzt4 = new zzZT4();
        zzzt4.zzE4(shapeBase.getId());
        zzzt4.setShapeType(75);
        zzzt4.zzWg(true);
        zzzt4.zzZib();
        zzzt2.zzZiD().zzZ(zzzt4);
        zzZSY zzzsy = new zzZSY(false);
        zzzsy.zzZi4().zzXM(127, 20971840);
        zzzt2.zzZiD().zzZ(zzzsy);
        zzZSY zzzsy2 = new zzZSY(true);
        zzzsy2.zzZi4().zzXM(1343, 65537);
        zzzt2.zzZiD().zzZ(zzzsy2);
        zzZTT zzztt = new zzZTT();
        zzztt.zzZiI();
        zzzt2.zzZiD().zzZ(zzztt);
        zzzt2.zzS(zzzsp);
    }

    public final Shape zzZ(zzZT2 zzzt2) throws Exception {
        zzTM zztmZzDZ;
        Shape shape = new Shape(this.zzYJC.zzYKc);
        zzZ(zzzt2, shape);
        int iIntValue = ((Integer) shape.zzYvW().get(4124)).intValue();
        zzZ9I zzz9i = this.zzYJC.zzYKa;
        if (zzz9i != null && (zztmZzDZ = zzz9i.zzDZ(iIntValue)) != null) {
            shape.zzYvW().zzQ(4156, zztmZzDZ);
        }
        return shape;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzZT2 zzzt2, ShapeBase shapeBase) throws Exception {
        zzZTU zzztu = null;
        for (int i = 0; i < zzzt2.getCount(); i++) {
            zzZT7 zzzt7ZzEi = zzzt2.zzEi(i);
            if (zzzt7ZzEi == null) {
                this.zzYJC.zzTG("Invalid OfficeArt record found, ignored.");
            } else {
                int type = zzzt7ZzEi.zzZii().getType();
                if (type == 61455) {
                    zzztu = (zzZTU) zzzt7ZzEi;
                } else if (type != 61730) {
                    switch (type) {
                        case 61449:
                            zzZT0 zzzt0 = (zzZT0) zzzt7ZzEi;
                            shapeBase.zzXj(zzzt0.zzZi6());
                            shapeBase.zzXI(zzzt0.zzZi5());
                            break;
                        case 61450:
                            zzZT4 zzzt4 = (zzZT4) zzzt7ZzEi;
                            shapeBase.setId(zzzt4.zzZih());
                            if (zzzt4.isGroup()) {
                                shapeBase.setShapeType(-1);
                            } else if (zzzt4.zzZid()) {
                                shapeBase.setShapeType(-2);
                            } else {
                                shapeBase.setShapeType(zzzt4.zzZii().zzZim());
                            }
                            shapeBase.setFlipOrientation(zzzt4.zzZi9());
                            break;
                        case 61451:
                            this.zzYJA.zzZ(((zzZSY) zzzt7ZzEi).zzZi4(), shapeBase, zzzt2.zzZi7());
                            break;
                    }
                }
            }
        }
        if (zzztu != null) {
            zzZT3.zzY(shapeBase, zzztu.getLeft(), zzztu.getTop(), zzztu.getWidth(), zzztu.getHeight());
        }
    }

    public static Shape zzZ(zzZTI zzzti, com.aspose.words.internal.zzZOX zzzox, int i, IWarningCallback iWarningCallback) throws Exception {
        if (i == 0) {
            return null;
        }
        zzzox.zzq().getPosition();
        zzZT6 zzzt6 = new zzZT6();
        zzzt6.zzZ(zzzox, i, iWarningCallback);
        if (zzZD5) {
            com.aspose.words.internal.zzZKN.format("\nRead inline Escher, length:{0}", Integer.valueOf(i));
            Iterator<zzZT7> it = zzzt6.iterator();
            while (it.hasNext()) {
                it.next();
            }
            zzzox.zzq().getPosition();
        }
        if (zzzt6.getCount() == 0 || zzzt6.zzEi(0).zzZii().getType() != 61444) {
            return null;
        }
        zzZT2 zzzt2 = (zzZT2) zzzt6.zzEi(0);
        if (zzzt2.zzZi7().zzZii().zzZim() > 202) {
            zzY1Z.zzZ(iWarningCallback, 10, "Shape is ignored due to: {0}", "unsupported shape type.");
            return null;
        }
        zzZTA zzzta = new zzZTA();
        for (int i2 = 1; i2 < zzzt6.getCount(); i2++) {
            if (zzzt6.zzEi(i2) != null && zzzt6.zzEi(i2).zzZii().getType() == 61447) {
                zzZTW zzztw = (zzZTW) zzzt6.zzEi(i2);
                if (zzztw.zzZiJ() == null && i2 < zzzt6.getCount() - 1) {
                    int i3 = i2 + 1;
                    if (zzzt6.zzEi(i3) instanceof zzZU0) {
                        zzztw.zzZ((zzZU0) zzzt6.zzEi(i3));
                    }
                }
                zzzta.zzZ(zzztw);
            }
        }
        Shape shapeZzZ = new zzZT1(new zzZTN(zzzti.getDocument(), zzzta, null, iWarningCallback)).zzZ(zzzt2);
        shapeZzZ.setWrapType(0);
        return shapeZzZ;
    }

    public static void zzZ(ShapeBase shapeBase, zzZSP zzzsp) throws Exception {
        shapeBase.isInline();
        if (shapeBase.zzY9F()) {
            zzX(shapeBase, zzzsp);
        } else {
            zzY(shapeBase, zzzsp);
        }
    }
}
