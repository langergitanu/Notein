package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCF extends zzYCE {
    private zzZ91 zzXnk;
    private boolean zzXnl;
    private zzYC5 zzXnm;
    private zzYCD zzYuE;
    private com.aspose.words.internal.zzH zzZdO;

    public zzYCF(zzZ91 zzz91, IWarningCallback iWarningCallback, Map<ShapeBase, zzX0> map) {
        super(iWarningCallback, map);
        this.zzXnk = zzz91;
    }

    private Collection<com.aspose.words.internal.zzZG> zz2(com.aspose.words.internal.zzG zzg) throws Exception {
        return new zzYCJ(this.zzYuE.getShape()).zz4(zzg);
    }

    private com.aspose.words.internal.zzG zz3(com.aspose.words.internal.zzG zzg) throws Exception {
        this.zzYuE.zz1(zzY22.zzW(this.zzYuE));
        return zzg;
    }

    private static float zzP(float f, float f2, float f3, float f4) {
        float f5 = f2 / 2.0f;
        return com.aspose.words.internal.zzAN.zzf(f) ? f5 : f5 - (((f3 - f4) / f) * f5);
    }

    private com.aspose.words.internal.zzG zzX(zzYC5 zzyc5, zzZL4 zzzl4, boolean z) throws Exception {
        Shape shape = (Shape) zzyc5.zz7u();
        if (shape.getStroked()) {
            zzyc5.zzQS(shape.getStroked());
            zzyc5.zzQR(shape.getStroke().zzY40());
            zzyc5.zzY8((float) zzyc5.zzY8P());
        }
        zzZF(shape);
        zzZ(zzyc5, zzzl4);
        if (zzYCC.zzZy(shape)) {
            if (shape.getStroked()) {
                zzYaw();
            } else {
                zzYav();
            }
            zzZA(shape);
        } else {
            zzYM6[] zzym6ArrZzY91 = this.zzYuE.zzYae().zzY91();
            if (zzym6ArrZzY91 == null) {
                zzX0 zzx0ZzZ = zzY38.zzZ(new com.aspose.words.internal.zzG(), zzyc5);
                zzZ(zzyc5.zz7u(), zzx0ZzZ);
                return zzx0ZzZ.zz7v();
            }
            if (this.zzYuE.zzYae().zzY90() != null && this.zzYuE.zzYae().zzY90().length > 0) {
                zzZLH zzzlh = new zzZLH(this.zzYuE);
                int i = 0;
                for (zzYM6 zzym6 : zzym6ArrZzY91) {
                    RefInt refInt = new RefInt(i);
                    zzzlh.zzZ(zzym6, refInt);
                    i = refInt.get();
                }
            }
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzW(new com.aspose.words.internal.zzP9(1.0f, 0.0f, 0.0f, 1.0f, Float.intBitsToFloat((int) this.zzYuE.zzYal().zzY8B()), com.aspose.words.internal.zzZPY.zzYC(this.zzYuE.zzYal().zzY8B())));
        if (this.zzYuE.getShape().isWordArt()) {
            zzg = zz3(zzg);
        }
        if (shape.getFilled()) {
            zzYKB zzykb = new zzYKB(this.zzYuE.getWarningCallback());
            zzYCD zzycd = this.zzYuE;
            zzycd.zz1(zzykb.zzY(zzycd.zz7v(), shape.getShapeType()));
        }
        zzYLC zzylcZzZ = zzZ(zzyc5, zzzl4, zzg, z);
        zzX0 zzx0ZzZ2 = zzY38.zzZ(zzg, zzyc5);
        zzx0ZzZ2.zzX(zzylcZzZ);
        zzZ(zzyc5.zz7u(), zzx0ZzZ2);
        return zzg;
    }

    private long zzXK(long j) {
        return this.zzYuE.zzYal().zzZ(j, zzZ5I.zzW(j, this.zzYuE.getShape().zzYbm(), this.zzYuE.getShape().zzYbl()), false);
    }

    private com.aspose.words.internal.zzG zzY(zzYC5 zzyc5, zzZL4 zzzl4, boolean z) throws Exception {
        GroupShape groupShape = (GroupShape) zzyc5.zz7u();
        long size = com.aspose.words.internal.zzZPW.zzYF(zzyc5.zzY8U()) ? groupShape.getSize() : zzyc5.zzY8U();
        int i = (int) size;
        if (com.aspose.words.internal.zzAN.zzf(Float.intBitsToFloat(i)) || com.aspose.words.internal.zzAN.zzf(com.aspose.words.internal.zzZPW.zzYz(size))) {
            size = com.aspose.words.internal.zzZPW.zzG(Math.max(Float.intBitsToFloat(i), 1.0f), Math.max(com.aspose.words.internal.zzZPW.zzYz(size), 1.0f));
        }
        boolean z2 = false;
        com.aspose.words.internal.zzP9 zzp9ZzZ = zzYBX.zzZ((ShapeBase) groupShape, size, false);
        boolean z3 = true;
        zzp9ZzZ.zzZ(zzzl4.zzZ54(), 1);
        zzYBX.zzZ((ShapeBase) groupShape, size, true).zzZ(zzzl4.zzZ54(), 1);
        long jZzZ = zzYBX.zzZ(groupShape, zzzl4.getScaleX(), zzzl4.getScaleY());
        float fIntBitsToFloat = Float.intBitsToFloat((int) jZzZ);
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(jZzZ);
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) size) / ((int) groupShape.zzY9d())) * fIntBitsToFloat;
        float fZzYz2 = (com.aspose.words.internal.zzZPW.zzYz(size) / ((int) (groupShape.zzY9d() >>> 32))) * fZzYz;
        float rotation = (float) (groupShape.getRotation() + ((double) zzzl4.getRotation()));
        boolean zZzYMg = zzyc5.zzYMg();
        boolean z4 = z || zzyc5.zzYMg();
        zzYL9 zzyl9 = new zzYL9();
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        long[] jArrZzZ = zzZ(groupShape, size, zZzYMg, rotation);
        Iterator<T> it = groupShape.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            zzYC5 zzyc52 = new zzYC5((ShapeBase) it.next());
            zzZL4 zzzl42 = new zzZL4(zzp9ZzZ, fIntBitsToFloat2, fZzYz2, rotation);
            if (jArrZzZ == null && z4) {
                z2 = z3;
            }
            com.aspose.words.internal.zzG zzgZzZ = zzZ(zzyc52, zzzl42, z2);
            zzyc5.zzQS((zzyc52.zzY8R() && groupShape.getCount() == z3) ? z3 : false);
            if (zzyc5.zzY8R()) {
                zzyc5.zzY8(zzyc52.zzY8O());
                zzyc5.zzQR(zzyc52.zzY8Q());
            }
            com.aspose.words.internal.zzG zzgZzY = zzY(zzyc52, false);
            zzYLC zzylcZz6L = zzyc52.zz6L();
            if (zzylcZz6L != null && z4) {
                zzylcZz6L.zzq(zzgZzY.zzZO());
                zzyl9.zzV(zzylcZz6L);
            }
            zzg.zzX((com.aspose.words.internal.zzZL) zzgZzZ);
            z2 = false;
            z3 = true;
        }
        zzX0 zzx0ZzZ = zzY38.zzZ(zzg, zzyc5);
        zzx0ZzZ.zzX(jArrZzZ != null ? new zzYLC(jArrZzZ) : z4 ? zzYLA.zzX(zzyl9) : null);
        zzZ(zzyc5.zz7u(), zzx0ZzZ);
        return zzg;
    }

    private static boolean zzYH(ShapeBase shapeBase) {
        Shape shape;
        if (shapeBase.zzY9h().getHidden()) {
            return true;
        }
        if (com.aspose.words.internal.zzAN.zzZD(shapeBase.getWidth()) && com.aspose.words.internal.zzAN.zzZD(shapeBase.getHeight())) {
            if (shapeBase.isGroup()) {
                return true;
            }
            if (!shapeBase.zzY9o() || (shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class)) == null) {
                return false;
            }
            return (shape.getTextBox().getFitShapeToText() && shape.getTextBox().getTextBoxWrapMode() == 2) ? false : true;
        }
        return false;
    }

    private void zzYav() throws Exception {
        BorderCollection borders = this.zzYuE.getShape().getImageData().getBorders();
        Border byBorderType = borders.getByBorderType(3);
        Border byBorderType2 = borders.getByBorderType(1);
        Border byBorderType3 = borders.getByBorderType(2);
        Border byBorderType4 = borders.getByBorderType(0);
        long jZzY8E = this.zzYuE.zzYal().zzY8E();
        float fZz8S = byBorderType.zz8S() / com.aspose.words.internal.zzZPY.zzYC(jZzY8E);
        float fZz8S2 = byBorderType4.zz8S() / com.aspose.words.internal.zzZPY.zzYC(jZzY8E);
        int i = (int) jZzY8E;
        float fZz8S3 = byBorderType2.zz8S() / Float.intBitsToFloat(i);
        float fZz8S4 = byBorderType3.zz8S() / Float.intBitsToFloat(i);
        long jZzXK = zzXK(com.aspose.words.internal.zzZPY.zzG(-fZz8S3, -fZz8S));
        long jZzXK2 = zzXK(com.aspose.words.internal.zzZPY.zzG(((int) this.zzYuE.getShape().zzY9d()) + fZz8S4, ((int) (this.zzYuE.getShape().zzY9d() >>> 32)) + fZz8S2));
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(jZzXK, com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat((int) jZzXK2) - Float.intBitsToFloat((int) jZzXK), com.aspose.words.internal.zzZPY.zzYC(jZzXK2) - com.aspose.words.internal.zzZPY.zzYC(jZzXK)));
        zzXX zzxx = new zzXX(3);
        zzxx.zz8z();
        zzxx.zzZ(zzzq4, byBorderType2, byBorderType3, byBorderType, byBorderType4);
        zzxx.zzE(this.zzYuE.zz7v());
    }

    private void zzYaw() throws Exception {
        long jZzY8E = this.zzYuE.zzYal().zzY8E();
        float strokeWeight = ((float) this.zzYuE.getShape().getStrokeWeight()) / Float.intBitsToFloat((int) jZzY8E);
        float strokeWeight2 = ((float) this.zzYuE.getShape().getStrokeWeight()) / com.aspose.words.internal.zzZPY.zzYC(jZzY8E);
        long jZzY9d = this.zzYuE.getShape().zzY9d();
        float f = (-strokeWeight) * 0.5f;
        float f2 = (strokeWeight * 0.5f) + ((int) jZzY9d);
        float f3 = (-strokeWeight2) * 0.5f;
        float f4 = (strokeWeight2 * 0.5f) + ((int) (jZzY9d >>> 32));
        zzZ8N.zzZ(this.zzYuE, new long[]{zzXK(com.aspose.words.internal.zzZPY.zzG(f, f3)), zzXK(com.aspose.words.internal.zzZPY.zzG(f2, f3)), zzXK(com.aspose.words.internal.zzZPY.zzG(f2, f4)), zzXK(com.aspose.words.internal.zzZPY.zzG(f, f4))});
    }

    public static com.aspose.words.internal.zzG zzZ(zzYC5 zzyc5) throws Exception {
        ShapeBase shapeBaseZz7u = zzyc5.zz7u();
        Document documentZzYBb = shapeBaseZz7u.zzYBb();
        ShapeBase shapeBaseZzYa6 = shapeBaseZz7u.zzYa6();
        zzYNA zzynaZzWA = documentZzYBb.zzWA(shapeBaseZzYa6.zzYac());
        if (zzynaZzWA != null) {
            boolean zZzYT1 = documentZzYBb.zzZqg().zzYT1();
            documentZzYBb.zzZqg().zzUY(true);
            zzynaZzWA.zzZc(shapeBaseZzYa6);
            documentZzYBb.zzZqg().zzUY(zZzYT1);
        }
        return new zzYCF(null, documentZzYBb.getWarningCallback(), documentZzYBb.zzZqf()).zzZ(zzyc5, true);
    }

    private void zzZA(Shape shape) throws Exception {
        if (this.zzYuE.zzYak() == null) {
            return;
        }
        long[] jArr = {0, com.aspose.words.internal.zzZPY.zzG((int) shape.zzY9d(), 0.0f), com.aspose.words.internal.zzZPY.zzG((int) shape.zzY9d(), (int) (shape.zzY9d() >>> 32)), com.aspose.words.internal.zzZPY.zzG(0.0f, (int) (shape.zzY9d() >>> 32))};
        this.zzYuE.zzYal().zzZ(jArr, zzZ5J.zzX(jArr, shape.zzYbm(), shape.zzYbl()));
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(jArr, false, true);
        zzzgZzZ.zzY(this.zzYuE.zzYak());
        this.zzYuE.zz7v().zzX(zzzgZzZ);
    }

    private static byte[] zzZB(Shape shape) throws Exception {
        if (shape.getSignatureLine() != null) {
            return shape.getSignatureLine().getImageBytes();
        }
        return null;
    }

    private static boolean zzZC(Shape shape) {
        return shape.getSignatureLine() != null;
    }

    private long[] zzZD(Shape shape) {
        if (shape.zzY9x() == null) {
            return null;
        }
        long[] jArrZzY9x = shape.zzY9x();
        this.zzYuE.zzYal().zzZ(jArrZzY9x, zzZ5J.zzX(jArrZzY9x, shape.zzYbm(), shape.zzYbl()));
        if (jArrZzY9x.length == 1 && com.aspose.words.internal.zzZPY.zzYF(jArrZzY9x[0])) {
            return null;
        }
        return jArrZzY9x;
    }

    private Collection<com.aspose.words.internal.zzYR> zzZE(Shape shape) throws Exception {
        com.aspose.words.internal.zz6I zz6i = new com.aspose.words.internal.zz6I(this.zzYuE.getShape().getStroke().zzNO(), shape.getExtrusionEnabled(), shape.getShadowEnabled(), shape.getExtrusionEnabled() && shape.getRenderMode() == 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzYuE.zz7v().getCount(); i++) {
            com.aspose.words.internal.zzZG zzzg = (com.aspose.words.internal.zzZG) com.aspose.words.internal.zzZKW.zzZ(this.zzYuE.zz7v().zzN(i), com.aspose.words.internal.zzZG.class);
            if (zzzg != null && (zzzg.zzZ2() != null || zzzg.zzZ1() != null)) {
                com.aspose.words.internal.zzPA zzpa = (com.aspose.words.internal.zzPA) com.aspose.words.internal.zzZKW.zzZ(zzzg.zzZ1(), com.aspose.words.internal.zzPA.class);
                if (zzpa != null && !com.aspose.words.internal.zzAN.zzZD(this.zzYuE.getShape().getRotation()) && !this.zzYuE.getShape().zzYaC() && !this.zzYuE.getShape().isWordArt() && !this.zzYuE.getShape().isImage()) {
                    zzpa.zzP(zzZMR().zzZ((com.aspose.words.internal.zzZL) zzzg));
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzYR>) arrayList, com.aspose.words.internal.zz6J.zzZ(zzzg, zz6i));
            }
        }
        return arrayList;
    }

    private void zzZF(Shape shape) {
        if (this.zzYUo == null) {
            return;
        }
        if (shape.getShadowEnabled()) {
            OooO00o.OooO0O0(this.zzYUo, 65536, 4, "Shape shadow effects are not supported in full");
        }
        if (shape.getExtrusionEnabled() && shape.getRenderMode() == 2) {
            OooO00o.OooO0O0(this.zzYUo, 65536, 4, "Shape 3D effects are not supported in full");
        }
    }

    private com.aspose.words.internal.zzH zzZMR() {
        if (this.zzZdO == null) {
            this.zzZdO = new com.aspose.words.internal.zzH();
        }
        return this.zzZdO;
    }

    private static Shape zzZz(Shape shape) throws Exception {
        Shape shape2 = (Shape) shape.deepClone(false);
        shape2.zzYvW().zzQ(EditingLanguage.LULE_SAMI_NORWAY, 75);
        shape2.getImageData().setImageBytes(shape.getFill().getImageBytes());
        shape2.getFill().setVisible(false);
        shape2.getStroke().setOn(false);
        return shape2;
    }

    public final void zzYau() {
        this.zzXnl = true;
    }

    public final com.aspose.words.internal.zzG zzZ(zzYC5 zzyc5, boolean z) throws Exception {
        zzYC5 zzyc52;
        ShapeBase shapeBaseZz7u = zzyc5.zz7u();
        this.zzXnm = zzyc5;
        com.aspose.words.internal.zzG zzgZzY = zzY(zzyc5, false);
        if (zzgZzY != null) {
            return zzgZzY;
        }
        ShapeBase shapeBaseZzYa6 = shapeBaseZz7u.zzYa6();
        if (shapeBaseZzYa6 != shapeBaseZz7u) {
            try {
                zzyc52 = new zzYC5(shapeBaseZzYa6);
            } catch (Exception e) {
                IWarningCallback iWarningCallback = this.zzYUo;
                if (iWarningCallback != null) {
                    iWarningCallback.warning(new WarningInfo(16777216, 4, com.aspose.words.internal.zzZKN.format("Shape rendering failed with exception:'{0}'", e.getMessage())));
                }
                return new com.aspose.words.internal.zzG();
            }
        } else {
            zzyc52 = zzyc5;
        }
        zzZ(zzyc52, new zzZL4(), false);
        com.aspose.words.internal.zzG zzgZzY2 = zzY(zzyc5, false);
        if (!z) {
            zzYG(shapeBaseZzYa6);
        }
        return zzgZzY2;
    }

    private com.aspose.words.internal.zzG zzZ(zzYC5 zzyc5, zzZL4 zzzl4, boolean z) throws Exception {
        if (zzYH(zzyc5.zz7u())) {
            com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
            zzZ(zzyc5.zz7u(), new zzX0(zzg));
            return zzg;
        }
        if (zzyc5.zz7u() == this.zzXnm.zz7u()) {
            zzyc5 = this.zzXnm;
        }
        if (zzyc5.zz7u().getShapeType() == -1) {
            return zzY(zzyc5, zzzl4, z);
        }
        return zzX(zzyc5, zzzl4, z);
    }

    private static long[] zzZ(GroupShape groupShape, long j, boolean z, float f) {
        long[] jArrZzY9x = z ? groupShape.zzY9x() : null;
        if (jArrZzY9x != null) {
            com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
            int i = (int) j;
            zzp9.zzZ(Float.intBitsToFloat(i) / 21600.0f, com.aspose.words.internal.zzZPW.zzYz(j) / 21600.0f, 1);
            zzp9.zzZ(f, com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i) / 2.0f, com.aspose.words.internal.zzZPW.zzYz(j) / 2.0f), 1);
            zzp9.zzZ(jArrZzY9x);
        }
        return jArrZzY9x;
    }

    private void zzY(com.aspose.words.internal.zzG zzg, ArrayList<com.aspose.words.internal.zzZG> arrayList, zzY5C zzy5c) throws Exception {
        boolean on = this.zzYuE.getShape().getTextPath().getOn();
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4();
        for (com.aspose.words.internal.zzZG zzzg : arrayList) {
            if (zzzg.zzZ2() != null) {
                if (zzy5c != null) {
                    if (on) {
                        zzzq4 = com.aspose.words.internal.zzZQ4.zzT(zzzq4, zzZMR().zzZ((com.aspose.words.internal.zzZL) zzzg));
                    } else {
                        zzy5c.zzm(zzzg);
                    }
                }
                zzg.zzX(zzYM7.zzZ(zzzg, true, false));
            }
        }
        if (!on || zzy5c == null) {
            return;
        }
        zzy5c.zzYY(zzzq4);
    }

    private void zzZ(zzYC5 zzyc5, zzZL4 zzzl4) throws Exception {
        Shape shape = (Shape) zzyc5.zz7u();
        zzyc5.zzXf(zzZ(zzyc5, shape));
        this.zzYuE = new zzYCD(zzyc5, zzzl4, this.zzYUo);
        if ((com.aspose.words.internal.zzAN.zzZD(shape.getRotation()) || shape.isTopLevel()) && shape.zzYac() && !this.zzXnk.zzYW9()) {
            boolean zZzY = zzY64.zzY(shape, this.zzXnk);
            boolean zZzZ = zzY64.zzZ(shape, this.zzXnk);
            if (zZzZ || zZzY) {
                zzyc5.zzXf(zzZ(zzyc5, shape, zZzY, zZzZ));
                this.zzYuE = new zzYCD(zzyc5, zzzl4, this.zzYUo);
            }
        }
        this.zzYuE.zzQU(this.zzXnl);
    }

    private long zzZ(zzYC5 zzyc5, Shape shape, boolean z, boolean z2) throws Exception {
        float fIntBitsToFloat;
        long jZzW = zzYBX.zzW((ShapeBase) shape, zzY64.zzY(this.zzXnk, this.zzYuE));
        if (zzYBX.zzY7((float) shape.getRotation()) ^ (!zzZLG.zzB(shape))) {
            z2 = z;
            z = z2;
        }
        if (z) {
            fIntBitsToFloat = Float.intBitsToFloat((int) jZzW);
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) zzyc5.zz7u().getSize());
        }
        return com.aspose.words.internal.zzZPW.zzG(fIntBitsToFloat, z2 ? com.aspose.words.internal.zzZPW.zzYz(jZzW) : com.aspose.words.internal.zzZPW.zzYz(zzyc5.zz7u().getSize()));
    }

    private static void zzZ(Shape shape, com.aspose.words.internal.zzG zzg) throws Exception {
        if (shape.getRenderMode() != 2) {
            zzZS6 zzzs6ZzZ = zzZS5.zzZ(zzZS7.zzE(shape), shape.getRenderMode());
            com.aspose.words.internal.zzP9 zzp9ZzOh = zzg.zzZO().zzOh();
            zzg.zzW((com.aspose.words.internal.zzP9) null);
            com.aspose.words.internal.zzG zzgZzv = zzzs6ZzZ.zzv(zzg);
            zzg.clear();
            zzg.zzW(zzp9ZzOh);
            zzg.zzX((com.aspose.words.internal.zzZL) zzgZzv);
        }
    }

    private zzYLC zzZ(zzYC5 zzyc5, zzZL4 zzzl4, com.aspose.words.internal.zzG zzg, boolean z) throws Exception {
        Shape shape = (Shape) zzyc5.zz7u();
        long[] jArrZzZD = zzZD(shape);
        zzY5C zzy5c = null;
        if (jArrZzZD == null && (z || zzyc5.zzYMg())) {
            zzy5c = new zzY5C(this.zzYUo);
        }
        if (this.zzYuE.zz7v() != null) {
            if (shape.zzY9h().zzZyf() != null && shape.zzY9h().zzZyf().getOn()) {
                zzg = zzZ(zzyc5, shape, zzg);
            }
            zzZ(shape, zzy5c, zzzl4, zzg);
        }
        this.zzYuE.zzYat();
        com.aspose.words.internal.zzG zzgZzZ = zzY64.zzZ(this.zzXnk, this.zzYuE);
        if (zzgZzZ != null) {
            zzYCD zzycd = this.zzYuE;
            zzZ(zzycd, zzy5c, zzgZzZ, zzY64.zzZ(zzycd));
            zzg.zzX((com.aspose.words.internal.zzZL) zzgZzZ);
        }
        if (shape.getParentNode() != null && shape.getParentNode().getNodeType() == 17 && com.aspose.words.internal.zzZYD.zzXk(shape.getHRef())) {
            zzg.zzZ(new com.aspose.words.internal.zzZR(new com.aspose.words.internal.zzZQ4(0L, this.zzYuE.zzYae().zzY8Y()), shape.getHRef(), shape.getTarget(), shape.getScreenTip()));
        }
        return zzZ(zzyc5, jArrZzZD, zzy5c);
    }

    private void zzZ(zzYCD zzycd, zzY5C zzy5c, com.aspose.words.internal.zzG zzg, zzZKJ zzzkj) throws Exception {
        if (zzy5c == null || zzy5c.zzXVn()) {
            return;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZMR().zzZ((com.aspose.words.internal.zzZL) zzg);
        float fIntBitsToFloat = (Float.intBitsToFloat((int) zzycd.zzYae().zzY8X()) - zzzkj.zzkw()) - zzzkj.zzZm();
        if (zzzq4ZzZ.getWidth() < fIntBitsToFloat) {
            zzzq4ZzZ = new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX(), zzzq4ZzZ.getY(), fIntBitsToFloat, zzzq4ZzZ.getHeight());
        }
        zzy5c.zzYY(zzzq4ZzZ);
    }

    private static com.aspose.words.internal.zzG zzZ(zzYC5 zzyc5, Shape shape, com.aspose.words.internal.zzG zzg) {
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg.zzX((com.aspose.words.internal.zzZL) zzg2);
        zzZ(shape.zzY9h().zzZyf().zzZ4w(), Float.intBitsToFloat((int) zzyc5.zzY8U()), zzyc5.zzY8V(), zzg2);
        return zzg2;
    }

    private void zzZ(Shape shape, zzY5C zzy5c, zzZL4 zzzl4, com.aspose.words.internal.zzG zzg) throws Exception {
        Collection<com.aspose.words.internal.zzYR> collectionZzZE = zzZE(shape);
        ArrayList<com.aspose.words.internal.zzZG> arrayList = new ArrayList<>();
        Iterator<com.aspose.words.internal.zzYR> it = collectionZzZE.iterator();
        while (it.hasNext()) {
            ArrayList<com.aspose.words.internal.zzZG> arrayListZzYv = it.next().zzYv();
            if (arrayListZzYv != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Iterable) arrayListZzYv);
            }
        }
        com.aspose.words.internal.zzG zzgZzZ = zzZ(shape, zzzl4, zzy5c);
        if (shape.getExtrusionEnabled()) {
            zzZ(shape, zzg, arrayList);
        } else if (shape.getShadowEnabled()) {
            zzZ(shape, zzg, arrayList, zzgZzZ);
        } else {
            zzZ(zzy5c, zzg, arrayList, zzgZzZ);
        }
    }

    private static void zzZ(Shape shape, com.aspose.words.internal.zzG zzg, Collection<com.aspose.words.internal.zzZG> collection) throws Exception {
        zzg.zzZ(collection);
        zzZ(shape, zzg);
    }

    private void zzZ(Shape shape, com.aspose.words.internal.zzG zzg, ArrayList<com.aspose.words.internal.zzZG> arrayList, com.aspose.words.internal.zzG zzg2) throws Exception {
        if (arrayList.size() != 0) {
            com.aspose.words.internal.zzG zzg3 = new com.aspose.words.internal.zzG();
            zzg3.zzZ(arrayList);
            this.zzYuE.zzYal().zzo(zzZ(zzg3, shape));
        }
        for (com.aspose.words.internal.zzZG zzzg : arrayList) {
            if (this.zzYuE.zzYal().zzY8z() != null) {
                zzzg.zzY(this.zzYuE.zzYal().zzY8z());
            }
            zzg.zzX(zzzg);
        }
        com.aspose.words.internal.zzG zzg4 = new com.aspose.words.internal.zzG();
        Iterator<com.aspose.words.internal.zzZG> it = zz2(zzg).iterator();
        while (it.hasNext()) {
            zzg4.zzX(it.next());
        }
        if (zzg.zzZO() != null) {
            zzg4.zzW(zzg.zzZO().zzOo());
        }
        int i = 0;
        zzg.zzZ(0, zzg4);
        if (zzg2 != null) {
            zzg.zzX((com.aspose.words.internal.zzZL) zzg2);
            Iterator<com.aspose.words.internal.zzZG> it2 = zz2(zzg2).iterator();
            while (it2.hasNext()) {
                zzg.zzZ(i, (com.aspose.words.internal.zzZG) it2.next());
                i++;
            }
        }
    }

    private void zzZ(zzY5C zzy5c, com.aspose.words.internal.zzG zzg, ArrayList<com.aspose.words.internal.zzZG> arrayList, com.aspose.words.internal.zzG zzg2) throws Exception {
        zzZ(zzg, arrayList, zzy5c);
        if (zzg2 != null) {
            zzg.zzX((com.aspose.words.internal.zzZL) zzg2);
        }
        zzY(zzg, arrayList, zzy5c);
    }

    private com.aspose.words.internal.zzP9 zzZ(com.aspose.words.internal.zzG zzg, Shape shape) throws Exception {
        float f;
        float width;
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZMR().zzZ((com.aspose.words.internal.zzZL) zzg);
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzZQG.zzZ(arrayList, (Iterable) zz2(zzg));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, (Iterable) zz2(zzg));
        float fZzZm = zzzq4ZzZ.zzZm();
        float fZzZo = zzzq4ZzZ.zzZo();
        float fZzkw = zzzq4ZzZ.zzkw();
        float fZzZn = zzzq4ZzZ.zzZn();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ2 = zzZMR().zzZ((com.aspose.words.internal.zzZL) it.next());
            fZzZm = Math.min(zzzq4ZzZ2.zzZm(), fZzZm);
            fZzZo = Math.min(zzzq4ZzZ2.zzZo(), fZzZo);
            fZzkw = Math.max(zzzq4ZzZ2.zzkw(), fZzkw);
            fZzZn = Math.max(zzzq4ZzZ2.zzZn(), fZzZn);
        }
        float fZzZm2 = zzzq4ZzZ.zzZm() - fZzZm;
        float fZzZo2 = zzzq4ZzZ.zzZo() - fZzZo;
        float fZzkw2 = fZzkw - zzzq4ZzZ.zzkw();
        float fZzZn2 = fZzZn - zzzq4ZzZ.zzZn();
        float f2 = 0.0f;
        float height = 1.0f;
        if (shape.getDirectShapeAttr(1984) == null || ((Integer) shape.getDirectShapeAttr(1984)).intValue() == 0) {
            f = 0.0f;
            width = 1.0f;
        } else {
            f = fZzZm2 + fZzkw2;
            width = 1.0f - (f / zzzq4ZzZ.getWidth());
        }
        if (!shape.zzYbk() && shape.getDirectShapeAttr(1985) != null && ((Integer) shape.getDirectShapeAttr(1985)).intValue() != 0) {
            f2 = fZzZo2 + fZzZn2;
            height = 1.0f - (f2 / zzzq4ZzZ.getHeight());
        }
        float fZzP = zzP(f, zzzq4ZzZ.getWidth(), fZzkw2, fZzZm2);
        float fZzP2 = zzP(f2, zzzq4ZzZ.getHeight(), fZzZn2, fZzZo2);
        zzp9.zzY(-fZzP, -fZzP2, 1);
        zzp9.zzZ(width, height, 1);
        zzp9.zzY(fZzP, fZzP2, 1);
        return zzp9;
    }

    private static void zzZ(int i, float f, float f2, com.aspose.words.internal.zzG zzg) {
        if (zzg.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        }
        if (i == 1) {
            zzg.zzZO().zzY((f2 - f) * 0.5f, 0.0f, 1);
        } else {
            if (i != 2) {
                return;
            }
            zzg.zzZO().zzY(f2 - f, 0.0f, 1);
        }
    }

    private void zzZ(com.aspose.words.internal.zzG zzg, ArrayList<com.aspose.words.internal.zzZG> arrayList, zzY5C zzy5c) throws Exception {
        for (com.aspose.words.internal.zzZG zzzg : arrayList) {
            if (zzzg.zzZ1() != null) {
                com.aspose.words.internal.zzP0 zzp0 = (com.aspose.words.internal.zzP0) com.aspose.words.internal.zzZKW.zzZ(zzzg.zzZ1(), com.aspose.words.internal.zzP0.class);
                if (zzp0 != null && zzp0.zzUu() != zzzg.zzZ0()) {
                    com.aspose.words.internal.zzZQ4 zzzq4ZzS = com.aspose.words.internal.zzP6.zzS(zzp0.zzUu());
                    com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZMR().zzZ((com.aspose.words.internal.zzZL) zzzg);
                    float width = zzzq4ZzZ.getWidth() / zzzq4ZzS.getWidth();
                    float height = zzzq4ZzZ.getHeight() / zzzq4ZzS.getHeight();
                    if (width <= 1.0f) {
                        width = 1.0f;
                    }
                    if (height <= 1.0f) {
                        height = 1.0f;
                    }
                    zzp0.zzNb().zzZ(width, height, 0);
                }
                com.aspose.words.internal.zzZG zzzgZzZ = zzYM7.zzZ(zzzg, false, true);
                zzg.zzX(zzzgZzZ);
                if (zzy5c != null) {
                    zzy5c.zzn(zzzgZzZ);
                }
            }
        }
    }

    private com.aspose.words.internal.zzG zzZ(Shape shape, zzZL4 zzzl4, zzY5C zzy5c) throws Exception {
        if (!shape.hasImage() && shape.zzY9H() && ((Forms2OleControl) com.aspose.words.internal.zzZKW.zzZ(shape.getOleFormat().getOleControl(), Forms2OleControl.class)) != null) {
            if (zzy5c != null) {
                zzy5c.zzYY(shape.zzY9O());
            }
            return zzZMB.zzZ(shape.getDocument(), (Forms2OleControl) shape.getOleFormat().getOleControl());
        }
        if (zzYCC.zzZx(shape)) {
            shape = zzZz(shape);
        }
        if (!shape.hasImage()) {
            return null;
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzW(zzYBX.zzZ(shape, zzzl4));
        ImageData imageData = shape.getImageData();
        byte[] bArrZzZB = zzZC(shape) ? zzZB(shape) : imageData.toByteArray();
        com.aspose.words.internal.zzZP zzzp = new com.aspose.words.internal.zzZP(0L, this.zzYuE.zzYae().zzY8X(), bArrZzZB, imageData.zzZd());
        zzZ(shape, zzzp);
        zzZ(zzzp, this.zzYuE.getWarningCallback());
        zzg.zzX(zzzp);
        if (zzy5c != null) {
            zzy5c.zzY(bArrZzZB, zzg.zzZO().zzO(zzzp.zzZj()));
        }
        return zzg;
    }

    private static void zzZ(Shape shape, com.aspose.words.internal.zzZP zzzp) {
        Collection<com.aspose.words.internal.zz4> collectionZzZ8 = zzzp.zzZ8();
        ImageData imageData = shape.getImageData();
        com.aspose.words.internal.zzTM zztmZzZ = zzZ(imageData);
        if (zztmZzZ != null) {
            collectionZzZ8.add(new com.aspose.words.internal.zz1(zztmZzZ));
        }
        if (imageData.getBiLevel()) {
            collectionZzZ8.add(new com.aspose.words.internal.zz2());
        }
        if (!com.aspose.words.internal.zzEQ.zzl((float) imageData.getBrightness()) || !com.aspose.words.internal.zzEQ.zzm((float) imageData.getContrast())) {
            collectionZzZ8.add(new com.aspose.words.internal.zzZX((float) imageData.getContrast(), (float) imageData.getBrightness()));
        }
        if (!imageData.getBiLevel() && imageData.getGrayScale()) {
            collectionZzZ8.add(new com.aspose.words.internal.zzZY());
        }
        if (com.aspose.words.internal.zzPV.zzZ(shape.zzYbn(), com.aspose.words.internal.zzPV.zzHZ)) {
            return;
        }
        collectionZzZ8.add(new com.aspose.words.internal.zzZZ(shape.zzYbn()));
    }

    private static void zzZ(com.aspose.words.internal.zzZP zzzp, IWarningCallback iWarningCallback) throws Exception {
        if (com.aspose.words.internal.zzEF.zzVW(zzzp.getImageType()) || zzzp.zzZb() == null || zzzp.zzZb().size() == 0) {
            return;
        }
        com.aspose.words.internal.zz3.zzZ(zzzp, zzzp.zzZb(), new zzY21(iWarningCallback));
        zzzp.zzZ7();
    }

    private static com.aspose.words.internal.zzTM zzZ(ImageData imageData) {
        if (imageData.zzYW1()) {
            return new com.aspose.words.internal.zzTM(imageData.zzYW3(), 10);
        }
        return null;
    }

    private static zzYLC zzZ(zzYC5 zzyc5, long[] jArr, zzY5C zzy5c) throws Exception {
        long jZzY8T;
        if (jArr != null) {
            return new zzYLC(jArr, (byte) 0);
        }
        if (zzy5c == null) {
            return null;
        }
        if (com.aspose.words.internal.zzZPW.zzYF(zzyc5.zzY8U())) {
            jZzY8T = zzyc5.zz7u().zzYzG().getSize();
        } else {
            jZzY8T = zzyc5.zzY8T();
        }
        if (zzy5c.zz6L().zzYnj() != 0) {
            return zzy5c.zz6L();
        }
        return new zzYLC(Float.intBitsToFloat((int) jZzY8T), com.aspose.words.internal.zzZPW.zzYz(jZzY8T));
    }

    private static long zzZ(zzYC5 zzyc5, Shape shape) {
        if (shape.zzY9h().zzZyf() == null || !shape.zzY9h().zzZyf().getOn()) {
            return zzyc5.zzY8U();
        }
        if (shape.zzY9h().zzZyf().zzZ4v() > 0.0d) {
            return com.aspose.words.internal.zzZPW.zzG(((float) shape.zzY9h().zzZyf().zzZ4v()) * 0.01f * zzyc5.zzY8V(), (float) shape.getHeight());
        }
        return com.aspose.words.internal.zzZPW.zzG((float) shape.getWidth(), (float) shape.getHeight());
    }
}
