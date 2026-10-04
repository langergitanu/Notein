package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY24 implements zzZ8T {
    private static com.aspose.words.internal.zzZYG<String> zzWWe;
    private GroupShape zzWVH;
    private boolean zzWWf;
    private boolean zzWWg;
    private zzYDZ zzZFZ;

    static {
        com.aspose.words.internal.zzZYG<String> zzzyg = new com.aspose.words.internal.zzZYG<>();
        zzWWe = zzzyg;
        zzzyg.set("{F59B8463-F414-42e2-B3A4-FFEF48DC7170}", "<a:ext uri=\"{F59B8463-F414-42e2-B3A4-FFEF48DC7170}\" xmlns:a=\"http://purl.oclc.org/ooxml/drawingml/main\"> <a15:nonVisualGroupProps isLegacyGroup=\"0\" xmlns:a15=\"http://schemas.microsoft.com/office/drawing/2012/main\" /> </a:ext>");
    }

    private zzY24(GroupShape groupShape, boolean z, boolean z2, zzYDZ zzydz) {
        this.zzWVH = groupShape;
        this.zzWWg = z;
        this.zzWWf = z2;
        this.zzZFZ = zzydz;
    }

    private GroupShape zzW(GroupShape groupShape) throws Exception {
        zz5H zz5h = new zz5H(10);
        groupShape.zzU(zz5h);
        zz5h.setRotation(0.0d);
        zz5h.setName(zzY2A.zzY1(this.zzWVH));
        zz5h.setFlipOrientation(0);
        groupShape.zzY9h().zzU(this.zzWVH.getWidth(), false);
        groupShape.zzY9h().zzT(this.zzWVH.getHeight(), false);
        ShapeBase shapeBase = (ShapeBase) this.zzWVH.getFirstChild();
        boolean z = (shapeBase == null || shapeBase.getShapeType() == -1) ? false : true;
        if (z) {
            zzZ8T zzz8tZzY = zzY2A.zzY((Shape) shapeBase, this.zzZFZ);
            zzY2I.zzZ(zzY2I.zzY(zzz8tZzY, groupShape), groupShape, this);
            zz7S zz7s = (zz7S) groupShape.zzY9i();
            zz7s.setFill(zzY2V.zzZ(zzz8tZzY, groupShape));
            if (zz7s.getFill().zzZQ4() == 0) {
                zzY2V.zzZ((zzH0) zz7s.getFill(), shapeBase);
            }
            if (zz5h.getOutline().getFill().zzZQ4() == 3) {
                zz5h.setOutline(null);
            }
        } else {
            zz5h.setFill(new zz1C(zzBW.zzj(new com.aspose.words.internal.zzPV(255, 255, 255))));
            zz5h.getFill().zzZ(groupShape);
            zz4G zz4g = new zz4G();
            zz4g.setFill(new zz1C(zzBW.zzj(new com.aspose.words.internal.zzPV(0, 0, 0))));
            zzY2I.zzZ(zz4g, groupShape);
        }
        for (ShapeBase shapeBase2 : this.zzWVH.getChildNodes(0, false)) {
            if (!shapeBase2.zz9I() || !z || zzY2V.zzY9(shapeBase2)) {
                ShapeBase shapeBaseZzZ = zzZ(shapeBase2, false, false, this.zzZFZ);
                zzZ(shapeBaseZzZ, shapeBase2, (zzBK) zz5h, false);
                groupShape.appendChild(shapeBaseZzZ);
            }
        }
        zzY2Q.zzY7(groupShape);
        return groupShape;
    }

    private GroupShape zzXSM() throws Exception {
        boolean z = this.zzWVH.zzZ57() == 0;
        GroupShape groupShape = new GroupShape(this.zzWVH.getDocument(), (byte) 0);
        groupShape.zzS((zzYC3) this.zzWVH.zzYvW().zzbn());
        groupShape.zzZ((zzYEF) this.zzWVH.zzZYh().zzbn());
        boolean z2 = this.zzWVH.hasChildNodes() && ((ShapeBase) this.zzWVH.getFirstChild()).zzY9w();
        if (z && this.zzWVH.isTopLevel() && !z2 && this.zzWVH.getFlipOrientation() == 0) {
            return zzW(groupShape);
        }
        int i = this.zzWVH.isTopLevel() ? 9 : 3;
        GroupShape groupShape2 = (GroupShape) com.aspose.words.internal.zzZKW.zzZ(this.zzWVH.getParentNode(), GroupShape.class);
        if (groupShape2 != null) {
            i = groupShape2.zzZ57() != 0 ? i : 9;
        }
        zz6Z zz6z = new zz6Z(i);
        String strZzY1 = zzY2A.zzY1(this.zzWVH);
        groupShape.zzU(zz6z);
        zz6z.setName(strZzY1);
        groupShape.zzY9h().zzU(this.zzWVH.getWidth(), false);
        groupShape.zzY9h().zzT(this.zzWVH.getHeight(), false);
        zz6z.setFlipOrientation(this.zzWVH.getFlipOrientation());
        zz6z.setRotation(zzY2A.zzY3(this.zzWVH));
        zz6z.zzLV(((Integer) this.zzWVH.fetchShapeAttr(772)).intValue());
        zz6z.zzZ(new zz4O());
        zz6z.zzZyc().zzZ(new zzBZ());
        zz6z.zzZyc().zzY(new zz4T());
        zzY2A.zzZ(this.zzWVH, zz6z.zzZyc().zzZxW().zzZFL());
        if (this.zzWVH.isTopLevel()) {
            zzBZ zzbz = (zzBZ) zz6z.zzZyc().zzZxW();
            zzbz.setExtensions(zzbz.hasExtensions() ? zzbz.getExtensions() : new com.aspose.words.internal.zzZYG<>());
            zzbz.getExtensions().zzW("{F59B8463-F414-42e2-B3A4-FFEF48DC7170}", new zz82("{F59B8463-F414-42e2-B3A4-FFEF48DC7170}", zzWWe.get("{F59B8463-F414-42e2-B3A4-FFEF48DC7170}")));
        }
        if (!this.zzWVH.isTopLevel()) {
            zz6z.zzZyc().zzZxV().setName(strZzY1);
        }
        zz6X zz6x = (zz6X) zz6z.zzZTh();
        zz6x.zzXR(this.zzWVH.zzZyh());
        zz6x.zzXQ(this.zzWVH.zzZyg());
        zz6x.zzXT(this.zzWVH.zzZyj());
        zz6x.zzXS(this.zzWVH.zzZyi());
        for (ShapeBase shapeBase : this.zzWVH.getChildNodes(0, false)) {
            ShapeBase shapeBaseZzZ = zzZ(shapeBase, false, z && shapeBase.zz9I() && !this.zzWVH.isTopLevel(), this.zzZFZ);
            zz2J zz2j = (zz2J) com.aspose.words.internal.zzZKW.zzZ(shapeBaseZzZ.zzY9i(), zz2J.class);
            if (zz2j != null && zz2j.getOutline().getFill().zzZQ4() == 3) {
                zz2j.setOutline(null);
            }
            if (zz2j != null && z && shapeBase.zz9I() && zz2j.getFill().zzZQ4() == 0) {
                zzY2V.zzZ((zzH0) zz2j.getFill(), shapeBase);
            }
            zzZ(shapeBaseZzZ, shapeBase, (zzBK) zz6z, true);
            groupShape.appendChild(shapeBaseZzZ);
        }
        zzY2Q.zzY7(groupShape);
        return groupShape;
    }

    private static double zzY(double d, double d2, double d3, boolean z) {
        if (z) {
            return d;
        }
        if (com.aspose.words.internal.zzAN.zzL(d2, 0.0d) || com.aspose.words.internal.zzAN.zzL(d, 0.0d)) {
            return 0.0d;
        }
        return (d * d3) / d2;
    }

    public static ShapeBase zzZ(ShapeBase shapeBase, boolean z, zzYDZ zzydz) throws Exception {
        return zzZ(shapeBase, z, false, zzydz);
    }

    @Override // com.aspose.words.zzZ8T
    public final boolean isWordArt() {
        return false;
    }

    @Override // com.aspose.words.zzZ8T
    public final boolean zzYW7() {
        return this.zzWWf;
    }

    @Override // com.aspose.words.zzZ8T
    public final ShapeBase zzYW8() {
        return this.zzWVH;
    }

    @Override // com.aspose.words.zzZ8T
    public final boolean zzZic() {
        return this.zzWWg;
    }

    private static ShapeBase zzZ(ShapeBase shapeBase, boolean z, boolean z2, zzYDZ zzydz) throws Exception {
        if (shapeBase != null) {
            shapeBase.getMarkupLanguage();
        }
        return shapeBase.getShapeType() == -1 ? new zzY24((GroupShape) shapeBase, z, z2, zzydz).zzXSM() : zzY2A.zzZ((Shape) shapeBase, z, z2, zzydz);
    }

    private void zzZ(ShapeBase shapeBase, ShapeBase shapeBase2, zzBK zzbk, boolean z) {
        zz07 zz07VarZzZTh = shapeBase.zzY9i().zzZTh();
        zz07VarZzZTh.zzW(zzY(shapeBase2.getLeft() - ((double) (z ? 0 : this.zzWVH.zzZyh())), this.zzWVH.zzZyj(), zzbk.zzZTh().getWidth(), z));
        zz07VarZzZTh.zzV(zzY(shapeBase2.getTop() - ((double) (z ? 0 : this.zzWVH.zzZyg())), this.zzWVH.zzZyi(), zzbk.zzZTh().getHeight(), z));
        zz07VarZzZTh.setWidth(zzY(shapeBase2.getWidth(), this.zzWVH.zzZyj(), zzbk.zzZTh().getWidth(), z));
        zz07VarZzZTh.setHeight(zzY(shapeBase2.getHeight(), this.zzWVH.zzZyi(), zzbk.zzZTh().getHeight(), z));
        shapeBase.setShapeAttr(4131, Double.valueOf(zz07VarZzZTh.getWidth()));
        shapeBase.setShapeAttr(4132, Double.valueOf(zz07VarZzZTh.getHeight()));
    }
}
