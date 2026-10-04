package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBV {
    private zzZVH zzXeO;
    private zzYC7 zzXeQ;
    private zzZ9U zzXeR;
    private boolean zzXeS;
    private zzY4 zzYPT;
    private zzZBZ zzYPX;
    private DocumentVisitor zzYYi;
    private int zzYYj;
    private zzYDZ zzZFZ;
    private com.aspose.words.internal.zzIM<com.aspose.words.internal.zzZOZ> zzXeN = new com.aspose.words.internal.zzIM<>();
    private zzYC6 zzXeP = new zzYC6();

    public zzYBV(zzYDZ zzydz, int i, zzZBZ zzzbz, zzZ9U zzz9u, DocumentVisitor documentVisitor) {
        this.zzZFZ = zzydz;
        this.zzYYj = i;
        this.zzYPX = zzzbz;
        this.zzXeR = zzz9u;
        this.zzYYi = documentVisitor;
        this.zzXeQ = new zzYC7(zzydz);
    }

    private IWarningCallback getWarningCallback() {
        return this.zzZFZ.zzYfy.getWarningCallback();
    }

    private static CompositeNode zzI(CompositeNode compositeNode) {
        Node node = null;
        for (Node node2 : compositeNode.getChildNodes(0, false)) {
            if (node2.isComposite()) {
                node = node2;
            }
        }
        return (CompositeNode) node;
    }

    private static void zzJ(CompositeNode compositeNode) {
        Node nodeZzZYq = compositeNode.zzZYq();
        if (nodeZzZYq == null || nodeZzZYq.getNodeType() == 8 || nodeZzZYq.getNodeType() == 28) {
            return;
        }
        compositeNode.appendChild(new Paragraph(compositeNode.getDocument()));
    }

    private void zzS(ShapeBase shapeBase, int i) {
        if (shapeBase.getWrapType() == 0) {
            return;
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            zzZ(WarningType.HINT, 17, "Floating shape in unexpected story");
            boolean z = shapeBase.getRelativeHorizontalPosition() == 1 || shapeBase.getRelativeVerticalPosition() == 1;
            if (shapeBase.getMarkupLanguage() != 1 || !z) {
                shapeBase.setWrapType(0);
                return;
            }
            Paragraph lastParagraph = ((Document) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getDocument(), Document.class)).getLastSection().getBody().getLastParagraph();
            if (lastParagraph != null) {
                lastParagraph.appendChild(shapeBase);
            }
        }
    }

    private static double[] zzW(ShapeBase shapeBase, double d, double d2) {
        zzYM5[] zzym5Arr = (zzYM5[]) shapeBase.fetchShapeAttr(StyleIdentifier.LIST_TABLE_4);
        if (zzym5Arr == null || zzym5Arr.length < 2) {
            return new double[0];
        }
        return new double[]{zzym5Arr[0].zzYnG().getValue() > 0 ? d + 0.0d : 0.0d, zzym5Arr[0].zzYnF().getValue() > 0 ? d2 + 0.0d : 0.0d, zzym5Arr[1].zzYnG().getValue() > 0 ? d + 0.0d : 0.0d, zzym5Arr[1].zzYnF().getValue() > 0 ? 0.0d + d2 : 0.0d};
    }

    private static void zzY(zzYC3 zzyc3, int i) {
        com.aspose.words.internal.zzPV zzpvZzX = com.aspose.words.internal.zzPV.zzX(239, 17, 0, 0);
        if (zzyc3.contains(i) && com.aspose.words.internal.zzPV.zzZ((com.aspose.words.internal.zzPV) zzyc3.get(i), zzpvZzX)) {
            zzyc3.zzQ(i, com.aspose.words.internal.zzPV.zzI5);
        }
    }

    private boolean zzY8v() {
        return this.zzZFZ.zzYda() || this.zzZFZ.zzXpa.getSaveFormat() == 31;
    }

    private void zzY8w() {
        HashMap map = new HashMap();
        Iterator<Integer> it = this.zzZFZ.zzXoY.iterator();
        while (it.hasNext()) {
            ShapeBase shapeBaseZzm1 = zzm1(it.next().intValue());
            if (com.aspose.words.internal.zzZYD.zzXk(shapeBaseZzm1.getName())) {
                if (map.containsKey(shapeBaseZzm1.getName())) {
                    this.zzZFZ.zzXoW = true;
                } else {
                    map.put(shapeBaseZzm1.getName(), shapeBaseZzm1);
                }
            }
            if (zzYo(shapeBaseZzm1)) {
                if (shapeBaseZzm1.getChildNodes(0, false).getCount() == 0) {
                    shapeBaseZzm1.zzA(new Paragraph(this.zzZFZ.zzYfy));
                }
                ShapeBase shapeBaseZzYp = zzYp(shapeBaseZzm1);
                while (shapeBaseZzYp != null) {
                    if (shapeBaseZzYp.getChildNodes(0, false).getCount() > 0) {
                        zzS(shapeBaseZzYp, zzI(shapeBaseZzm1));
                    }
                    shapeBaseZzYp = zzYp(shapeBaseZzYp);
                }
            }
        }
        if (this.zzXeS) {
            int saveFormat = this.zzZFZ.zzXpa.getSaveFormat();
            if (saveFormat == 10 || saveFormat == 11) {
                zzZ(1, 4, "Textbox vertical alignment is compatible only with Word 2007.");
            } else {
                if (saveFormat != 31) {
                    return;
                }
                zzZ(1, 4, com.aspose.words.internal.zzZKN.format("Textbox vertical alignment is not supported in save format.", new Object[0]));
            }
        }
    }

    private boolean zzYo(ShapeBase shapeBase) {
        Iterator<Integer> it = this.zzZFZ.zzXoY.iterator();
        while (it.hasNext()) {
            if (zzm1(it.next().intValue()).zzY9A() == shapeBase.getId()) {
                return false;
            }
        }
        return true;
    }

    private ShapeBase zzYp(ShapeBase shapeBase) {
        return zzm1(shapeBase.zzY9A());
    }

    private static void zzYq(ShapeBase shapeBase) {
        if (shapeBase.zzY9o()) {
            double dZzp = shapeBase.isTopLevel() ? com.aspose.words.internal.zzSA.zzp(shapeBase.getWidth()) : shapeBase.getWidth();
            double dZzp2 = shapeBase.isTopLevel() ? com.aspose.words.internal.zzSA.zzp(shapeBase.getHeight()) : shapeBase.getHeight();
            zz07 zz07VarZzZTh = shapeBase.zzY9i().zzZTh();
            if (!com.aspose.words.internal.zzAN.zzZD(dZzp)) {
                zz07VarZzZTh.setWidth(dZzp);
            }
            if (com.aspose.words.internal.zzAN.zzZD(dZzp2)) {
                return;
            }
            zz07VarZzZTh.setHeight(dZzp2);
        }
    }

    private void zzYr(ShapeBase shapeBase) {
        if (shapeBase.getShapeType() == 136 && shapeBase.getMarkupLanguage() == 1 && shapeBase.zzYvW().get(StyleIdentifier.MEDIUM_LIST_2_ACCENT_6) != null) {
            zzZ(256, 4, "Text underline property for VML WordArt shapes is not supported by MS Word.");
        }
    }

    private void zzYs(ShapeBase shapeBase) {
        zzKR zzkrZzRZ;
        Section section = (Section) shapeBase.getAncestor(2);
        if (section != null && (zzkrZzRZ = this.zzZFZ.zzYfy.getCompatibilityOptions().zzZYT().zzRZ("compatibilityMode")) != null && "11".equals(zzkrZzRZ.getValue()) && shapeBase.getRelativeHorizontalPosition() == 7) {
            shapeBase.setRelativeHorizontalPosition(1);
            shapeBase.setLeft((((double) (section.zzYvR().getPageWidth() - section.zzYvR().zzZRh())) / 20.0d) + shapeBase.getLeft());
        }
    }

    private void zzYt(ShapeBase shapeBase) throws Exception {
        if (shapeBase.getNodeType() == 18) {
            Shape shape = (Shape) shapeBase;
            int[] iArr = {4110, 4111};
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                byte[] bArr = (byte[]) shapeBase.getDirectShapeAttr(i2);
                if (bArr != null) {
                    shapeBase.setShapeAttr(i2, zzZ8K.zzZW(bArr));
                }
            }
            if (shape.zzZjT()) {
                shape.getImageData().setImageBytes(zzZ8K.zzZW(shape.getImageData().getImageBytes()));
                if (zzZtW() && shape.zzY99() && shape.getShapeType() != 1) {
                    shape.zzYbw();
                }
            }
        }
    }

    private void zzYu(ShapeBase shapeBase) {
        if (!shapeBase.zzY9o() || this.zzXeS) {
            return;
        }
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        this.zzXeS = ((shape == null || shape.getTextBox().getVerticalAnchor() == 0) ? false : true) | this.zzXeS;
    }

    private void zzYv(ShapeBase shapeBase) {
        if (shapeBase.getMarkupLanguage() == 0 || !shapeBase.isTopLevel()) {
            return;
        }
        if ((zzY8v() || zzZtW()) && 1 == ((Integer) shapeBase.fetchShapeAttr(913)).intValue() && !com.aspose.words.internal.zzAN.zzZD(shapeBase.getTop())) {
            shapeBase.setShapeAttr(4130, Double.valueOf(0.0d));
        }
    }

    private static void zzYw(ShapeBase shapeBase) {
        if (shapeBase.getShapeType() != 20) {
            return;
        }
        double[] dArrZzW = zzW(shapeBase, shapeBase.zzZyj(), shapeBase.zzZyi());
        if (dArrZzW.length == 0) {
            return;
        }
        shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_4, new zzYM5[]{new zzYM5(com.aspose.words.internal.zzAN.zzZG(dArrZzW[0]), com.aspose.words.internal.zzAN.zzZG(dArrZzW[1])), new zzYM5(com.aspose.words.internal.zzAN.zzZG(dArrZzW[2]), com.aspose.words.internal.zzAN.zzZG(dArrZzW[3]))});
    }

    private void zzYx(ShapeBase shapeBase) {
        if (shapeBase.getShapeType() != 100) {
            return;
        }
        zzYM4[] zzym4Arr = (zzYM4[]) shapeBase.fetchShapeAttr(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3);
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getDocument(), Document.class);
        if (zzym4Arr != null || document == null || !FileFormatUtil.zzC6(document.getOriginalLoadFormat()) || zzY8v()) {
            return;
        }
        shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3, ((Shape) shapeBase).zzYaD());
    }

    private static boolean zzYy(ShapeBase shapeBase) {
        Paragraph paragraph;
        return (shapeBase.getParentNode() == null || (paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzYBd(), Paragraph.class)) == null || !paragraph.isInCell()) ? false : true;
    }

    private void zzYz(ShapeBase shapeBase) {
        if (this.zzZFZ.zzYd9() && this.zzZFZ.zzYfy.getCompatibilityOptions().getMswVersion() > 14 && shapeBase.getMarkupLanguage() == 0 && zzYy(shapeBase) && !shapeBase.isLayoutInCell()) {
            zzZ(WarningType.HINT, 17, "Value of the IsLayoutInCell property has no effect for DML shapes if a document is optimized for the version 2013 or higher.");
        }
    }

    private static void zzZp(Shape shape) throws Exception {
        com.aspose.words.internal.zzAA zzaaZzYrr;
        zzYTO zzytoZzP;
        if (!shape.zzY9H() || shape.getOleFormat().getOleObject() == null || (zzytoZzP = zzYTO.zzP((zzaaZzYrr = shape.getOleFormat().getOleObject().zzYrr()))) == null) {
            return;
        }
        new zzYTO(zzytoZzP.getValue()).zzW(zzaaZzYrr);
    }

    private static boolean zzZq(Shape shape) {
        return shape.zzZid() && "opendocument.ChartDocument.1".equals(shape.getOleFormat().getProgId());
    }

    private void zzZr(Shape shape) throws Exception {
        zzZBL zzzblZzYrB;
        com.aspose.words.internal.zzAA zzaaZzYrr;
        if (zzZq(shape) && !shape.getImageData().hasImage() && this.zzZFZ.zzXpa.getSaveFormat() != 60 && this.zzZFZ.zzXpa.getSaveFormat() != 61) {
            this.zzXeR.zzs(shape);
        }
        if (this.zzZFZ.zzXpa.zzrR()) {
            zzZp(shape);
        }
        if (this.zzZFZ.zzYdh() && (zzzblZzYrB = shape.zzYrB()) != null) {
            String progId = shape.getOleFormat().getProgId();
            com.aspose.words.internal.zzZOZ zzzoz = new com.aspose.words.internal.zzZOZ(zzYOA.zzD7(progId));
            com.aspose.words.internal.zzZOZ zzzoz2 = com.aspose.words.internal.zzZOZ.zzZXP;
            if (com.aspose.words.internal.zzZOZ.zzZ(zzzoz, zzzoz2)) {
                zzZ(16777216, 4, com.aspose.words.internal.zzZKN.format("Unknown ProgId value '{0}'. This might cause inaccessible OLE embedding.", progId));
            }
            zzYO2 zzyo2 = (zzYO2) com.aspose.words.internal.zzZKW.zzZ(zzzblZzYrB, zzYO2.class);
            if (zzyo2 == null) {
                zzYOC oleObject = zzzblZzYrB.getOleObject();
                if (oleObject != null) {
                    zzaaZzYrr = oleObject.zzYrr();
                    if (com.aspose.words.internal.zzZOZ.zzZ(zzaaZzYrr.zzAC(), zzzoz2)) {
                        zzaaZzYrr.zzW(zzzoz);
                    }
                } else {
                    zzaaZzYrr = null;
                }
            } else if (shape.zzYbs()) {
                zzZ(1, 10, "OOXML control is not supported in DOC and will be converted to image.");
                zzaaZzYrr = null;
            } else {
                zzaaZzYrr = zzYO6.zzZ(shape.getOleFormat().getProgId(), zzyo2, shape.getOleFormat().getOleIcon());
            }
            if (zzaaZzYrr != null) {
                this.zzZFZ.zzXp9.set(zzYO6.zzX(zzzblZzYrB), zzaaZzYrr);
                int iZzYyi = shape.zzYyi();
                if (iZzYyi == 1) {
                    this.zzZFZ.zzXp8.set(zzYO6.zzX(zzzblZzYrB), zzaaZzYrr);
                } else if (iZzYyi != 2) {
                    if (iZzYyi != 3) {
                        throw new IllegalStateException("Unexpected OLE object type.");
                    }
                    this.zzZFZ.zzXp5 = true;
                }
            }
        }
    }

    private void zzZs(Shape shape) throws Exception {
        if ((this.zzZFZ.zzYd9() && this.zzZFZ.zzZtY() > 0) || this.zzZFZ.zzXpa.getSaveFormat() == 60 || this.zzZFZ.zzXpa.getSaveFormat() == 61) {
            zzYOL.zzZ(shape, getWarningCallback());
            return;
        }
        byte[] bArrZzZT = zzYOL.zzZT(shape);
        if (!this.zzZFZ.zzYd7() || bArrZzZT == null || bArrZzZT.length == 0 || bArrZzZT[bArrZzZT.length - 1] == 0) {
            return;
        }
        shape.zzYvW().set(780, com.aspose.words.internal.zzZ1.zzY(bArrZzZT, bArrZzZT.length + 1));
    }

    private static void zzZt(Shape shape) throws Exception {
        if (shape.getShapeType() == 202 && shape.getImageData().zzZjT() && shape.getFill().getImageBytes() == null) {
            shape.zzYbw();
        }
    }

    private boolean zzZtW() {
        return (this.zzYYj & 1024) == 1024;
    }

    private static void zzZu(Shape shape) throws Exception {
        zzYOC zzyoc;
        zzZBL zzzblZzYrB = shape.zzYrB();
        if (zzzblZzYrB == null || !"5512d118-5cc6-11cf-8d67-00aa00bdce1d".equals(zzzblZzYrB.getClsidInternal())) {
            return;
        }
        zzZFV zzzfv = (zzZFV) com.aspose.words.internal.zzZKW.zzZ(zzzblZzYrB, zzZFV.class);
        if (zzzfv == null && (zzyoc = (zzYOC) com.aspose.words.internal.zzZKW.zzZ(zzzblZzYrB, zzYOC.class)) != null && zzyoc.zzYrr() != null) {
            zzzfv = (zzZFV) OleControl.zzM(zzyoc.zzYrr());
        }
        if (zzzfv == null) {
            return;
        }
        shape.getImageData().setImageBytes(zzYO6.zzYrj().get(zzzfv.getChecked() ? "RadioChecked" : "RadioUnchecked"));
        shape.setWidth(20.25d);
        shape.setHeight(18.0d);
    }

    private boolean zzZv(Shape shape) {
        if (!shape.isTopLevel()) {
            return false;
        }
        zzYDZ zzydz = this.zzZFZ;
        return (zzydz.zzXpa instanceof OoxmlSaveOptions) && zzydz.zzZtY() != 0;
    }

    private void zzZw(Shape shape) throws Exception {
        Shape shapeZzr = this.zzXeR.zzr(shape);
        zzYVU.zzj(shapeZzr, shape);
        shape.remove();
        zzZ(65536, 4, "Open Document Format chart will be converted to DrawingML.");
        shapeZzr.accept(this.zzYYi);
    }

    private ShapeBase zzm1(int i) {
        return this.zzZFZ.zzXoZ.get(i);
    }

    private void zzq(DocumentBase documentBase) throws Exception {
        Shape backgroundShape = documentBase.getBackgroundShape();
        if (backgroundShape == null) {
            return;
        }
        Shape shapeZzZ = this.zzYPX.zzZ(documentBase, backgroundShape);
        shapeZzZ.setId(1025);
        if (shapeZzZ.getMarkupLanguage() == 0 && ((zzZCL) shapeZzZ.zzY9i()).getFill() != null) {
            ((zzZCL) shapeZzZ.zzY9i()).getFill().zzZ(shapeZzZ);
        }
        shapeZzZ.setFilled(true);
        shapeZzZ.setStrokeWeight(0.0d);
        shapeZzZ.setStroked(false);
        shapeZzZ.setFlipOrientation(0);
    }

    public final void finish() {
        this.zzXeQ.endDocument();
        zzY8w();
    }

    public final int visitGroupShapeEnd(GroupShape groupShape) {
        if (groupShape.getMarkupLanguage() == 0) {
            return zzq(groupShape);
        }
        if (groupShape.zzZYy()) {
            return 0;
        }
        groupShape.remove();
        return 1;
    }

    public final int visitShapeEnd(Shape shape) {
        if (shape.getMarkupLanguage() == 0) {
            return zzq(shape);
        }
        return 0;
    }

    public final void zzZ(DocumentBase documentBase, zzY4 zzy4) throws Exception {
        this.zzYPT = zzy4;
        this.zzXeO = new zzZVH();
        zzq(documentBase);
    }

    public final void zzp(DocumentBase documentBase) throws Exception {
        this.zzYPX.zzZ(documentBase.getLists());
        this.zzXeO.zztF();
        this.zzYPX.zzZtZ();
    }

    private int zzY(ShapeBase shapeBase, zzY97 zzy97) throws Exception {
        this.zzYPT.zzZ(shapeBase);
        zzS(shapeBase, zzy97.zzY45());
        zzYs(shapeBase);
        shapeBase.zzYa2();
        zzYq(shapeBase);
        this.zzXeO.zzj(shapeBase);
        if (!shapeBase.isTopLevel()) {
            return 0;
        }
        this.zzYPX.zzH(shapeBase);
        if (shapeBase.getParentNode() == null) {
            return 1;
        }
        this.zzZFZ.zzZ(shapeBase, zzy97);
        zzYz(shapeBase);
        return 0;
    }

    public final int zzZ(Shape shape, zzY97 zzy97) throws Exception {
        if (shape.zzY9H()) {
            zzZu(shape);
        }
        zzZt(shape);
        SignatureLine signatureLine = shape.getSignatureLine();
        if (signatureLine != null) {
            if (this.zzXeN.contains(signatureLine.zzY80())) {
                com.aspose.words.internal.zzZOZ zzzozZzY80 = signatureLine.zzY80();
                signatureLine.zzJ(com.aspose.words.internal.zzZOZ.zziD());
                zzY1Z.zzZ(getWarningCallback(), WarningType.HINT, 4, "The value {0} of SignatureLine.Id is not unique and was replaced with {1}.", zzzozZzY80.toString("B").toUpperCase(), signatureLine.zzY80().toString("B").toUpperCase());
            } else {
                this.zzXeN.add(signatureLine.zzY80());
            }
            if (!signatureLine.isSigned()) {
                signatureLine.zzY83();
            }
        }
        zzYC7.zzYE(shape);
        if (shape.getMarkupLanguage() == 0) {
            return zzY(shape, zzy97);
        }
        zzZs(shape);
        if (shape.getParentNode() == null) {
            return 1;
        }
        if (this.zzYPX.zzI(shape) && shape.getParentNode() == null) {
            return 1;
        }
        if (zzZq(shape) && zzZv(shape)) {
            zzZw(shape);
            return 1;
        }
        zzJ(shape);
        zzZ((ShapeBase) shape, zzy97);
        zzYu(shape);
        return 0;
    }

    private static void zzS(CompositeNode compositeNode, CompositeNode compositeNode2) {
        for (Node node : compositeNode.getChildNodes(0, false).toArray()) {
            if (node.isComposite() && !compositeNode2.zzT(node)) {
                zzS((CompositeNode) node, compositeNode2);
                node.remove();
            } else if (compositeNode2.zzT(node)) {
                compositeNode2.appendChild(node);
            }
        }
    }

    private int zzq(ShapeBase shapeBase) {
        this.zzYPT.zzY(shapeBase);
        return 0;
    }

    public final int zzZ(GroupShape groupShape, zzY97 zzy97) throws Exception {
        if (groupShape.getMarkupLanguage() == 0) {
            return zzY(groupShape, zzy97);
        }
        if (this.zzYPX.zzI(groupShape) && groupShape.getParentNode() == null) {
            return 1;
        }
        if (groupShape.zzZYy()) {
            zzZ((ShapeBase) groupShape, zzy97);
            return 0;
        }
        groupShape.remove();
        return 1;
    }

    private void zzZ(ShapeBase shapeBase, zzY97 zzy97) throws Exception {
        shapeBase.zzYa2();
        if (shapeBase.getShapeType() != 100 && shapeBase.getNodeType() != 17) {
            shapeBase.zzY9U();
        }
        this.zzXeQ.zzT(shapeBase, zzy97.zzY44());
        this.zzZFZ.zzZ(shapeBase, zzy97);
        this.zzXeP.zzYC(shapeBase);
        if (shapeBase.zzZid()) {
            zzZr((Shape) shapeBase);
        }
        if (shapeBase.getShapeType() == 100 && shapeBase.zzYvW().zzPk(StyleIdentifier.LIST_TABLE_5_DARK) == null) {
            shapeBase.zzYvW().zzQ(StyleIdentifier.LIST_TABLE_5_DARK, new zzYM6[0]);
        }
        if (zzZtW()) {
            zzY(shapeBase.zzYvW(), 385);
            zzY(shapeBase.zzYvW(), 448);
        }
        zzYt(shapeBase);
        zzYx(shapeBase);
        zzYw(shapeBase);
        zzYv(shapeBase);
        zzS(shapeBase, zzy97.zzY45());
        zzYr(shapeBase);
    }

    private void zzZ(int i, int i2, String str) {
        if (getWarningCallback() != null) {
            OooO00o.OooO0O0(getWarningCallback(), i, i2, str);
        }
    }
}
