package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz91 implements zzZC7 {
    private zzAV zzZ6Z;

    public zz91(zzAV zzav) {
        this.zzZ6Z = zzav;
    }

    private ShapeBase zzV(zz50 zz50Var) throws Exception {
        if (this.zzZ6Z.zzZER() != null && this.zzZ6Z.zzZES() != null && this.zzZ6Z.zzZEQ() != null && this.zzZ6Z.zzZEP() != null) {
            zz8Z zz8z = new zz8Z(zz50Var, this.zzZ6Z);
            if (zz8V.zzPt(zz8z.zzZCP().zzZES().getUniqueId())) {
                zz8z.zzZCT().zzZIB().zzI().zzZ(1, 2, "SmartArt layout is not supported by cold rendering engine.");
                return null;
            }
            if (zz8V.zzPu(zz8z.zzZCP().zzZES().getUniqueId())) {
                zz8z.zzZCT().zzZIB().zzI().zzZ(2, 2, "SmartArt layout is partially supported by cold rendering engine. There may be issues with SmartArt rendering.");
            }
            zz8z.zzZCI().zzXn(!this.zzZ6Z.zzZEO());
            try {
                zz9K zz9kZzZyZ = new zz62(zz8z).zzZyZ();
                zz8z.zzZCH().zzZ(zz8z.zzZCR(), zz9kZzZyZ);
                zz9kZzZyZ.zzZDR().zzZzb();
                long jZzG = com.aspose.words.internal.zzZPW.zzG(zz9kZzZyZ.zzJ2(61).zzZze(), zz9kZzZyZ.zzJ2(16).zzZze());
                zz9kZzZyZ.zzZE4();
                zz9kZzZyZ.zzXZ(jZzG);
                zz8Y zz8y = new zz8Y();
                zz9kZzZyZ.zzZ(zz8y);
                return zzZ(zz8y, zz8z);
            } catch (Exception unused) {
                zz8z.zzZCT().zzZIB().zzI().zzZ(1, 2, "SmartArt definition is incorrect and it will not be rendered.");
            }
        }
        return null;
    }

    public final void zzW(zz50 zz50Var) throws Exception {
        ShapeBase shapeBaseZzV = zzV(zz50Var);
        if (shapeBaseZzV != null) {
            this.zzZ6Z.zzZER().zzR(shapeBaseZzV);
            this.zzZ6Z.zzZER().zzZEq();
        }
    }

    @Override // com.aspose.words.zzZC7
    public final com.aspose.words.internal.zzZL zzZ(zz50 zz50Var) throws Exception {
        if (this.zzZ6Z.zzZER() == null) {
            return new com.aspose.words.internal.zzG();
        }
        ShapeBase shapeBaseZzZEs = this.zzZ6Z.zzZER().zzZEs();
        boolean z = !this.zzZ6Z.zzZER().zzZEr();
        if (shapeBaseZzZEs == null) {
            shapeBaseZzZEs = zzV(zz50Var);
            z = false;
        }
        return shapeBaseZzZEs == null ? new com.aspose.words.internal.zzG() : new zzA1(this.zzZ6Z).zzZ(zz50Var, shapeBaseZzZEs, z);
    }

    private static ShapeBase zzZ(zz8Y zz8y, zz8Z zz8z) {
        GroupShape groupShape = new GroupShape(zz8z.getDocument(), (byte) 0);
        groupShape.zzU(new zz6Z(4));
        for (zz2O zz2o : zz8y.zzZCD()) {
            Shape shape = new Shape(zz8z.getDocument(), (byte) 0);
            shape.zzU(zz2o);
            groupShape.getChildNodes(0, false).add(shape);
        }
        return groupShape;
    }
}
