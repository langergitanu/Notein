package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzGS extends zzXQ {
    private com.aspose.words.internal.zzZQ4 zzZgg;

    private zzGS(com.aspose.words.internal.zzG zzg, ShapeBase shapeBase) {
        super(zzg, shapeBase);
    }

    private static boolean zzV(ShapeBase shapeBase) {
        if (shapeBase.zzY9a() == null || shapeBase.zzY9a().zzZAk() == null) {
            return false;
        }
        return shapeBase.zzY9a().zzZvv() || shapeBase.zzY9a().zzZvu();
    }

    private static boolean zzW(ShapeBase shapeBase) {
        boolean zZzV = false;
        if (!shapeBase.zzYac()) {
            return false;
        }
        if (shapeBase.zzY9o()) {
            return zzV(shapeBase);
        }
        Iterator<T> it = shapeBase.getChildNodes(18, true).iterator();
        while (it.hasNext()) {
            zZzV |= zzV((ShapeBase) it.next());
        }
        return zZzV;
    }

    private static boolean zzX(ShapeBase shapeBase) {
        if (shapeBase.zzY9a() == null) {
            return false;
        }
        return (shapeBase.zzY9a().getOutline().getEndArrowType() == 0 && shapeBase.zzY9a().getOutline().getStartArrowType() == 0) ? false : true;
    }

    private static com.aspose.words.internal.zzZQ4 zzY(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzP9 zzp9) {
        long[] jArr = {com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn())};
        zzp9.zzZ(jArr);
        return new com.aspose.words.internal.zzZQ4(jArr[0], com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat((int) jArr[1]) - Float.intBitsToFloat((int) jArr[0]), com.aspose.words.internal.zzZPY.zzYC(jArr[1]) - com.aspose.words.internal.zzZPY.zzYC(jArr[0])));
    }

    private static boolean zzY5(long j) {
        return com.aspose.words.internal.zzZPW.zzYF(j) || com.aspose.words.internal.zzAN.zzf(Float.intBitsToFloat((int) j)) || com.aspose.words.internal.zzAN.zzf(com.aspose.words.internal.zzZPW.zzYz(j));
    }

    public static zzX0 zzZ(com.aspose.words.internal.zzG zzg, ShapeBase shapeBase) throws Exception {
        zzGS zzgs = new zzGS(zzg, shapeBase);
        zzgs.zz7y();
        zzX0 zzx0 = new zzX0(zzg);
        zzx0.zz1(zzgs.zz7s());
        zzx0.zz2(zzgs.zz7t());
        return zzx0;
    }

    private com.aspose.words.internal.zzZQ4 zzZL(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        new com.aspose.words.internal.zzZE().zzZ(zz7v(), 12700, 1);
        return com.aspose.words.internal.zzZE.zzZ(zzzq4, 12700, 1);
    }

    private com.aspose.words.internal.zzZQ4 zzZM(com.aspose.words.internal.zzZQ4 zzzq4) {
        if (zz7u().isTopLevel()) {
            return zzzq4;
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(-zzzq4.getX(), -zzzq4.getY(), 1);
        if (zz7v().zzZO() == null) {
            zz7v().zzW(zzp9);
        } else {
            zz7v().zzZO().zzZ(zzp9, 0);
        }
        return zzp9.zzO(zzzq4);
    }

    private com.aspose.words.internal.zzZQ4 zzZN(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        if (zzZPO()) {
            zzzq4 = zzW(zzzq4, zz7u().getSize());
        } else if (zzZ(zz7u(), zzZPN())) {
            zz07 zz07VarZzZTh = zz7u().zzY9i().zzZTh();
            zzzq4 = zzZ(zzzq4, (float) (zz07VarZzZTh.getWidth() / 12700.0d), (float) (zz07VarZzZTh.getHeight() / 12700.0d), zz7u().getSize());
        }
        return zzZL(zzzq4);
    }

    private boolean zzZPN() {
        return zz7u().zzY9i().zzZHY() == 10 || zz7u().zzY9i().zzZHY() == 9;
    }

    private boolean zzZPO() {
        return zz7u().zzY9i().zzZHY() == 5;
    }

    private com.aspose.words.internal.zzZQ4 zzZPP() throws Exception {
        return zzZN(new com.aspose.words.internal.zzH(!zzZPO()).zzZ((com.aspose.words.internal.zzZL) zz7v()));
    }

    private static double zzy(long j, long j2) {
        if (zzY5(j) || zzY5(j2)) {
            return 1.0d;
        }
        double dIntBitsToFloat = Float.intBitsToFloat((int) j2) / Float.intBitsToFloat((int) j);
        return ((double) com.aspose.words.internal.zzZPW.zzYz(j)) * dIntBitsToFloat < ((double) com.aspose.words.internal.zzZPW.zzYz(j2)) ? dIntBitsToFloat : com.aspose.words.internal.zzZPW.zzYz(j2) / com.aspose.words.internal.zzZPW.zzYz(j);
    }

    @Override // com.aspose.words.zzXQ
    public final com.aspose.words.internal.zzZQ4 zz7w() {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(zz7u(), Shape.class);
        com.aspose.words.internal.zzZQ4 zzzq4Zz7s = zz7s();
        if (shape != null && !this.zzZgg.isEmpty()) {
            if (!zzV(shape)) {
                boolean z = shape.zzY9a() == null || shape.zzY9a().zzZTe() == null || shape.zzY9a().zzZTe().getCount() <= 0;
                boolean z2 = shape.getRotation() == 0.0d;
                if (shape.isImage() && z && z2 && !shape.getExtrusionEnabled() && !shape.getShadowEnabled()) {
                    zzzq4Zz7s = this.zzZgg;
                }
            } else if (shape.zzY9M() && shape.getStroked() && shape.getStrokeWeight() < 2.25d) {
                zzzq4Zz7s = this.zzZgg;
            }
        }
        return zzXQ.zz3(zzZM(zzzq4Zz7s));
    }

    @Override // com.aspose.words.zzXQ
    public final com.aspose.words.internal.zzZQ4 zz7x() {
        boolean z = false;
        boolean z2 = zz7u().zzY9i().zzZHY() == 10;
        boolean z3 = zz7u().zzY9a() != null;
        if (!z2 && zzW(zz7u())) {
            return zzZ(zz7u(), this.zzZgg, z3);
        }
        if (zzZPO()) {
            return zz7u().zzZ0(this.zzZgg);
        }
        boolean z4 = z3 && (zz7u().zzY9a().zzZTe() == null || zz7u().zzY9a().zzZTe().getCount() <= 0);
        if (z3 && zz7u().zzY9a().zzZTd() == null && zz7u().zzY9a().zzZTc() == null) {
            z = true;
        }
        boolean zZzX = zzX(zz7u());
        if (z3 && z4 && z && !zZzX && zz7u().zzY9a().zzZyb().zzY9M()) {
            return zzZ(zz7u(), this.zzZgg);
        }
        if ((z3 || zz7u().isGroup()) && !com.aspose.words.internal.zzAN.zzZH(zz7u().zzY9i().getRotation())) {
            return zzXQ.zzZ(this.zzZgg, new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), zz7u().zzYzG().getSize()), zz7u());
        }
        return !zz7u().isTopLevel() ? this.zzZgg : zz7u().zzY9N();
    }

    @Override // com.aspose.words.zzXQ
    public final void zz7y() throws Exception {
        this.zzZgg = zzZPP();
        zz1(zz7x());
        zz2(zz7w());
        zz7r();
    }

    private static boolean zzV(Shape shape) {
        int iZzZHY = shape.zzY9i().zzZHY();
        return iZzZHY == 6 || iZzZHY == 7 || iZzZHY == 13;
    }

    private static com.aspose.words.internal.zzP9 zzV(com.aspose.words.internal.zzZQ4 zzzq4, long j) {
        return new com.aspose.words.internal.zzP9(com.aspose.words.internal.zzSA.zzp(Float.intBitsToFloat((int) j)) / zzzq4.getWidth(), 0.0f, 0.0f, com.aspose.words.internal.zzSA.zzp(com.aspose.words.internal.zzZPW.zzYz(j)) / zzzq4.getHeight(), 0.0f, 0.0f);
    }

    private com.aspose.words.internal.zzZQ4 zzW(com.aspose.words.internal.zzZQ4 zzzq4, long j) {
        com.aspose.words.internal.zzP9 zzp9ZzV = zzV(zzzq4, j);
        zz7v().zzZO().zzZ(zzp9ZzV, 1);
        return zzY(zzzq4, zzp9ZzV);
    }

    private static boolean zzZ(ShapeBase shapeBase, boolean z) {
        return (z || !shapeBase.isTopLevel() || shapeBase.zzY9s() || shapeBase.zzY9i().zzZHY() == 11) ? false : true;
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(ShapeBase shapeBase, com.aspose.words.internal.zzZQ4 zzzq4) {
        return shapeBase.getHeight() < 0.05d ? new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY(), zzzq4.getWidth(), 0.0f) : zzzq4;
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(ShapeBase shapeBase, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) {
        return (!z || shapeBase.zzY9M() || shapeBase.zzY9a().zzZAk().zzZj().isEmpty()) ? zzzq4 : shapeBase.zzZ0(shapeBase.zzY9a().zzZAk().zzZj());
    }

    private com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, float f, float f2, long j) throws Exception {
        return zzZ(zzzq4, zzy(com.aspose.words.internal.zzZPW.zzG(f, f2), j));
    }

    private com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, double d) throws Exception {
        new com.aspose.words.internal.zzZE().zzZ(zz7v(), d);
        return com.aspose.words.internal.zzZE.zzZ(zzzq4, (float) d);
    }
}
