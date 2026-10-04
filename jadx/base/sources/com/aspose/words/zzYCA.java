package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCA extends zzYL4 {
    private static int[] zzXmP = {4102, 4111, 4110};
    private static int[] zzYwe = {128, 138, StyleIdentifier.SUBTLE_EMPHASIS, StyleIdentifier.INTENSE_EMPHASIS, StyleIdentifier.LIST_TABLE_4, StyleIdentifier.LIST_TABLE_5_DARK, StyleIdentifier.LIST_TABLE_2_ACCENT_2, StyleIdentifier.LIST_TABLE_3_ACCENT_2, 781, 896, 898, 899, 4102, 4110, 4111, 4112, 4124, 4131, 4132, 4154, EditingLanguage.LULE_SAMI_NORWAY};
    private zzU8 zzZGE;

    public zzYCA(zzU8 zzu8) {
        this.zzZGE = zzu8;
    }

    private static boolean zzT(ShapeBase shapeBase, ShapeBase shapeBase2) throws Exception {
        if (!shapeBase.zzZid() && !shapeBase2.zzZid()) {
            return true;
        }
        if (shapeBase.zzZid() != shapeBase2.zzZid()) {
            return false;
        }
        Shape shape = (Shape) shapeBase;
        zzYOC oleObject = shape.getOleFormat().getOleObject();
        Shape shape2 = (Shape) shapeBase2;
        zzYOC oleObject2 = shape2.getOleFormat().getOleObject();
        if (!com.aspose.words.internal.zzZ4.zzY(oleObject, oleObject2)) {
            return zzZ(shape.getOleFormat().zzYrA(), shape2.getOleFormat().zzYrA());
        }
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(oleObject.zzYrr());
        com.aspose.words.internal.zzKD zzkd2 = new com.aspose.words.internal.zzKD(oleObject2.zzYrr());
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
        zzkd.zzL(zzzor);
        zzkd2.zzL(zzzor2);
        byte[] bArrZzWy = zzzor.zzWy();
        return com.aspose.words.internal.zzZ1.zzZ(bArrZzWy, zzzor2.zzWy(), bArrZzWy.length);
    }

    private boolean zzU(ShapeBase shapeBase, ShapeBase shapeBase2) throws Exception {
        zz53 zz53VarZzY9i = shapeBase.zzY9i();
        zz53 zz53VarZzY9i2 = shapeBase2.zzY9i();
        if (!com.aspose.words.internal.zzZ4.zzY(zz53VarZzY9i, zz53VarZzY9i2) || zz53VarZzY9i.zzZHY() != zz53VarZzY9i2.zzZHY() || !zzZ(zz53VarZzY9i, zz53VarZzY9i2)) {
            return false;
        }
        zz07 zz07VarZzZTh = zz53VarZzY9i.zzZTh();
        zz07 zz07VarZzZTh2 = zz53VarZzY9i2.zzZTh();
        if (!com.aspose.words.internal.zzAN.zzL(zz07VarZzZTh.zzQb(), zz07VarZzZTh2.zzQb()) || !com.aspose.words.internal.zzAN.zzL(zz07VarZzZTh.zzYm(), zz07VarZzZTh2.zzYm()) || !com.aspose.words.internal.zzAN.zzL(zz07VarZzZTh.getWidth(), zz07VarZzZTh2.getWidth()) || !com.aspose.words.internal.zzAN.zzL(zz07VarZzZTh.getHeight(), zz07VarZzZTh2.getHeight())) {
            return false;
        }
        if (!this.zzZGE.zzZup.getIgnoreDmlUniqueId() && zz53VarZzY9i.zzZHY() == 2 && ((zz3V) zz53VarZzY9i).zzZyc().zzZxV().getId() != ((zz3V) zz53VarZzY9i2).zzZyc().zzZxV().getId()) {
            return false;
        }
        if (zz53VarZzY9i.zzZHY() == 6) {
            return com.aspose.words.internal.zzZKN.zzX((String) zz53VarZzY9i.zzZyb().zzYvW().get(896), (String) zz53VarZzY9i2.zzZyb().zzYvW().get(896), com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) && zzW7.zzZ((Shape) shapeBase, (Shape) shapeBase2);
        }
        return true;
    }

    private boolean zzV(ShapeBase shapeBase, ShapeBase shapeBase2) throws Exception {
        if (shapeBase.getMarkupLanguage() != shapeBase2.getMarkupLanguage()) {
            zzU6.zzSU("MarkupLanguage difference.");
            return false;
        }
        if (shapeBase.getMarkupLanguage() == 0 && !zzU(shapeBase, shapeBase2)) {
            return false;
        }
        if (shapeBase.getNodeType() != shapeBase2.getNodeType()) {
            zzU6.zzSU("NodeType difference.");
            return false;
        }
        if (shapeBase.getNodeType() == 17 && ((GroupShape) shapeBase).getChildNodes(0, false).getCount() != ((GroupShape) shapeBase2).getChildNodes(0, false).getCount()) {
            return false;
        }
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        zzYC3 zzyc3ZzYvW2 = shapeBase2.zzYvW();
        for (int i : zzXmP) {
            if (!zzZ(zzyc3ZzYvW, zzyc3ZzYvW2, i)) {
                zzU6.zzSU("ImageByte difference.");
                return false;
            }
        }
        if (!com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZVR.zzWt((String) zzyc3ZzYvW.get(898)), com.aspose.words.internal.zzZVR.zzWt((String) zzyc3ZzYvW2.get(898)))) {
            zzU6.zzSU("HyperlinkAddress difference.");
            return false;
        }
        Double d = (Double) shapeBase.zzYvW().zzPj(4131);
        double dDoubleValue = d.doubleValue();
        Double d2 = (Double) shapeBase.zzYvW().zzPj(4132);
        double dDoubleValue2 = d2.doubleValue();
        Double d3 = (Double) shapeBase2.zzYvW().zzPj(4131);
        double dDoubleValue3 = d3.doubleValue();
        Double d4 = (Double) shapeBase2.zzYvW().zzPj(4132);
        double dDoubleValue4 = d4.doubleValue();
        if (Math.abs(dDoubleValue - dDoubleValue3) > 1.0d) {
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("Width difference {0}:{1}.", d, d3));
            return false;
        }
        if (Math.abs(dDoubleValue2 - dDoubleValue4) > 1.0d) {
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("Height difference {0}:{1}.", d2, d4));
            return false;
        }
        zzYC3 zzyc3 = (zzYC3) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzYvW().zzbn(), zzYC3.class);
        zzYC3 zzyc32 = (zzYC3) com.aspose.words.internal.zzZKW.zzZ(shapeBase2.zzYvW().zzbn(), zzYC3.class);
        zzyc3.zzbl();
        zzyc32.zzbl();
        if (!zzyc3.zzW(zzyc32, zzYwe)) {
            zzU6.zzSU("ShapePr difference.");
            return false;
        }
        if (!zzT(shapeBase, shapeBase2)) {
            return false;
        }
        if (this.zzZGE.zzZup.getIgnoreTextboxes()) {
            return true;
        }
        if (shapeBase.zzY9o() != shapeBase2.zzY9o()) {
            return false;
        }
        if (!shapeBase.zzY9o()) {
            return true;
        }
        zzY9D.zzU(shapeBase, shapeBase2, this.zzZGE);
        return true;
    }

    @Override // com.aspose.words.zzYL4
    public final void zzZ(Node node, Node node2) throws Exception {
        ShapeBase shapeBase = (ShapeBase) node;
        ShapeBase shapeBase2 = (ShapeBase) node2;
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("\n{{Shape}} '{0}' -> '{1}'", shapeBase, shapeBase2));
        if (zzV(shapeBase, shapeBase2)) {
            if (shapeBase.isGroup()) {
                zzY9D.zzU(shapeBase, shapeBase2, this.zzZGE);
                return;
            }
            return;
        }
        ShapeBase shapeBase3 = this.zzZGE.zzZup.getTarget() == 0 ? (ShapeBase) zzU4.zzX(shapeBase, shapeBase2, this.zzZGE) : (ShapeBase) zzU4.zzY(shapeBase, shapeBase2, this.zzZGE);
        if (shapeBase3.getMarkupLanguage() == 0 && shapeBase3.zzY9n() != null) {
            zzU4.zzZ((Node) shapeBase3.zzY9n(), this.zzZGE);
        }
        if (shapeBase.getMarkupLanguage() != 0 || shapeBase.zzY9n() == null) {
            return;
        }
        zzU4.zzY((Node) shapeBase.zzY9n(), this.zzZGE);
    }

    private static boolean zzZ(zz53 zz53Var, zz53 zz53Var2) {
        int iZzZHY = zz53Var.zzZHY();
        if (iZzZHY == 2) {
            byte[] bArrZzZQa = ((zz3V) zz53Var).zzZwy().zzZQ1().zzZQa();
            byte[] bArrZzZQa2 = ((zz3V) zz53Var2).zzZwy().zzZQ1().zzZQa();
            return !com.aspose.words.internal.zzZ4.zzY(bArrZzZQa, bArrZzZQa2) || com.aspose.words.internal.zzZ1.zzZ(bArrZzZQa, bArrZzZQa2, bArrZzZQa.length);
        }
        if (iZzZHY != 8) {
            return true;
        }
        zz2O zz2o = (zz2O) zz53Var;
        zz2O zz2o2 = (zz2O) zz53Var2;
        if (zz2o.getFill().zzZQ4() != zz2o2.getFill().zzZQ4()) {
            return false;
        }
        if (zz2o.getFill().zzZQ4() != 0) {
            return true;
        }
        zzH0 zzh0 = (zzH0) zz2o.getFill();
        zzH0 zzh02 = (zzH0) zz2o2.getFill();
        byte[] bArrZzZQa3 = zzh0.zzZQ1().zzZQa();
        byte[] bArrZzZQa4 = zzh02.zzZQ1().zzZQa();
        return !com.aspose.words.internal.zzZ4.zzY(bArrZzZQa3, bArrZzZQa4) || com.aspose.words.internal.zzZ1.zzZ(bArrZzZQa3, bArrZzZQa4, bArrZzZQa3.length);
    }

    private static boolean zzZ(zzYO2 zzyo2, zzYO2 zzyo22) throws Exception {
        return com.aspose.words.internal.zzZ4.zzY(zzyo2, zzyo22) && com.aspose.words.internal.zzZKN.equals(zzyo2.getClsidInternal(), zzyo22.getClsidInternal()) && com.aspose.words.internal.zzZKN.equals(zzyo2.getName(), zzyo22.getName()) && com.aspose.words.internal.zzZKN.equals(zzyo2.getContentType(), zzyo22.getContentType()) && zzyo2.zzR1().getLength() == zzyo22.zzR1().getLength();
    }

    private static boolean zzZ(zzYC3 zzyc3, zzYC3 zzyc32, int i) {
        byte[] bArr = (byte[]) zzyc3.get(i);
        byte[] bArr2 = (byte[]) zzyc32.get(i);
        if (com.aspose.words.internal.zzZ4.zzX(bArr, bArr2)) {
            return true;
        }
        if (com.aspose.words.internal.zzZ4.zzY(bArr, bArr2)) {
            return com.aspose.words.internal.zzZ1.zzZ(bArr, bArr2, bArr.length);
        }
        return false;
    }
}
