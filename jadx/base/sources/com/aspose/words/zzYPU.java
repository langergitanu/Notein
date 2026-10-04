package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPU {
    private zzYQQ zzXMh;
    private zzYRE zzXMi;
    private zzYPT zzXQV;
    private zzYTN zzXQW;
    private zzYPM zzXRS;
    private zzYOR zzXRT;

    public zzYPU(zzYOR zzyor, zzYPT zzypt, zzYTN zzytn, zzYPM zzypm, zzYRE zzyre) {
        this.zzXRT = zzyor;
        this.zzXQV = zzypt;
        this.zzXQW = zzytn;
        this.zzXRS = zzypm;
        this.zzXMi = zzyre;
        this.zzXMh = new zzYQQ(this.zzXRT);
    }

    private void zzW(Shape shape, String str) throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzGB(str);
        if (com.aspose.words.internal.zzAN.zzZD(shape.getRotation())) {
            long jZzXk = shape.zzXk(com.aspose.words.internal.zzZPY.zzG((float) shape.getLeft(), (float) shape.getTop()));
            zzytgZzYsG.zzYu("svg:x", this.zzXRT.zzWu(Float.intBitsToFloat((int) jZzXk)));
            zzytgZzYsG.zzYu("svg:y", this.zzXRT.zzWu(com.aspose.words.internal.zzZPY.zzYC(jZzXk)));
        } else {
            zzytgZzYsG.zzYu("svg:x", this.zzXRT.zzYrY());
            zzytgZzYsG.zzYu("svg:y", this.zzXRT.zzYrY());
        }
        double dZzY = zzY(shape, Float.intBitsToFloat((int) shape.zzYzG().getSize()));
        double dZzY2 = zzY(shape, com.aspose.words.internal.zzZPW.zzYz(shape.zzYzG().getSize()));
        zzytgZzYsG.zzYu("svg:width", this.zzXRT.zzWu(dZzY));
        zzytgZzYsG.zzYu("svg:height", this.zzXRT.zzWu(dZzY2));
        zzY((ShapeBase) shape, com.aspose.words.internal.zzZPW.zzG((float) dZzY, (float) dZzY2));
    }

    private void zzX(ShapeBase shapeBase, long j) {
        if (com.aspose.words.internal.zzAN.zzZD(shapeBase.getRotation())) {
            return;
        }
        long jZzXk = shapeBase.zzXk(com.aspose.words.internal.zzZPY.zzG((float) shapeBase.getLeft(), (float) shapeBase.getTop()));
        float fIntBitsToFloat = Float.intBitsToFloat((int) j) / 2.0f;
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(j) / 2.0f;
        this.zzXRT.zzYsG().zzYu("draw:transform", com.aspose.words.internal.zzZKN.format("translate({0} {1}) rotate ({2}) translate({3} {4})", this.zzXRT.zzWu(-fIntBitsToFloat), this.zzXRT.zzWu(-fZzYz), com.aspose.words.internal.zzJB.zzZT(((-shapeBase.getRotation()) * 3.141592653589793d) / 180.0d), this.zzXRT.zzWu(Float.intBitsToFloat((int) jZzXk) + fIntBitsToFloat), this.zzXRT.zzWu(com.aspose.words.internal.zzZPY.zzYC(jZzXk) + fZzYz)));
    }

    private void zzY(ShapeBase shapeBase, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zzYPR zzyprZzV = zzYS3.zzV(shapeBase, this.zzXRT.zzYsd().zzYu3());
        if (iIntValue == 0 || iIntValue == 0 || this.zzXRT.zzYsd().zzY(zzyprZzV.getName(), null, false, false) != null) {
            return;
        }
        this.zzXRT.zzYsd().zzZ((zzYPP) zzyprZzV, false, false);
    }

    private static boolean zzYE(Paragraph paragraph) {
        return paragraph.getParentNode().getChildNodes(0, false).getCount() <= 1 && (paragraph.getParentNode().getParentNode() instanceof GroupShape);
    }

    private static boolean zzZ(ShapeBase shapeBase, Paragraph paragraph) {
        return shapeBase.isImage() && paragraph != null && paragraph.getChildNodes(0, false).getCount() == 1;
    }

    private static double zzZA(ShapeBase shapeBase) {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        boolean zZzZD = com.aspose.words.internal.zzAN.zzZD(shapeBase.getRotation());
        if (shape != null && shape.getStroked() && zZzZD) {
            return shape.getStrokeWeight();
        }
        return 0.0d;
    }

    private void zzZB(ShapeBase shapeBase) throws Exception {
        if (zzZf(shapeBase)) {
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            zzytgZzYsG.zzY("draw:text-box");
            if (zzZz(shapeBase)) {
                zzytgZzYsG.zz0("fo:min-height", this.zzXRT.zzWu(com.aspose.words.internal.zzZPW.zzYz(shapeBase.zzYzG().getSize())));
            }
            if (com.aspose.words.internal.zzZPW.zzYz(shapeBase.zzYzG().getSize()) <= 0.0f) {
                zzytgZzYsG.zz0("fo:min-height", this.zzXRT.zzYrY());
            }
            if (Float.intBitsToFloat((int) shapeBase.zzYzG().getSize()) <= 0.0f) {
                zzytgZzYsG.zz0("fo:min-width", this.zzXRT.zzYrY());
            }
        }
    }

    private void zzZC(ShapeBase shapeBase) throws Exception {
        if (zzZg(shapeBase)) {
            this.zzXQW.zzX(shapeBase, true);
        }
        if (zzZe(shapeBase)) {
            this.zzXQW.zzX(shapeBase, false);
        }
    }

    private void zzZD(ShapeBase shapeBase) throws Exception {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        if (shape == null) {
            return;
        }
        if (shape.zzZid()) {
            this.zzXMh.zz3(shape);
        } else if (shape.isImage() || shape.zzZjT() || shape.zzYaA()) {
            this.zzXMi.zzZ("draw:image", shape);
        }
    }

    private void zzZE(ShapeBase shapeBase) throws Exception {
        if (zzZg(shapeBase)) {
            this.zzXQV.zzYud();
        }
        if (shapeBase instanceof GroupShape) {
            zzZj(shapeBase);
        } else if (shapeBase.getShapeType() == 20) {
            zzX((Shape) shapeBase, "draw:line");
        } else if (zzrH(shapeBase.getShapeType())) {
            zzX((Shape) shapeBase, "draw:connector");
        } else if (zzZd(shapeBase)) {
            zzW((Shape) shapeBase, "draw:rect");
        } else if (shapeBase.getShapeType() == 3) {
            zzW((Shape) shapeBase, "draw:ellipse");
        } else if (zzZp(shapeBase)) {
            zzZZ((Shape) shapeBase);
        } else if (!zzZh(shapeBase)) {
            zzZy(shapeBase);
        }
        zzZB(shapeBase);
        zzZD(shapeBase);
    }

    private static boolean zzZU(Shape shape) throws Exception {
        if (shape.hasImage() || shape.zzYaA()) {
            return false;
        }
        if (shape.getShapeType() != 202) {
            return (shape.getTextBox() == null || zzZV(shape) || !shape.hasChildNodes()) ? false : true;
        }
        return true;
    }

    public static boolean zzZV(Shape shape) throws Exception {
        return shape.isImage() || shape.zz5K() || shape.getShapeType() == 20 || shape.getShapeType() == 3 || zzZp(shape);
    }

    private static boolean zzZW(Shape shape) throws Exception {
        int shapeType = shape.getShapeType();
        return shapeType == 20 || shapeType == 1 || shapeType == 3 || zzZU(shape) || zzZY(shape) || shape.zzZjT() || shape.zzZid() || zzrH(shapeType) || zzZp(shape);
    }

    private static boolean zzZX(Shape shape) throws Exception {
        return !zzZW(shape);
    }

    private static boolean zzZY(Shape shape) throws Exception {
        ImageData imageData = shape.getImageData();
        return !(shape.isImage() || shape.zzY9H()) || imageData.zzZjT() || imageData.isLink();
    }

    private void zzZZ(Shape shape) throws Exception {
        this.zzXRT.zzRX(true);
        zzYS4 zzys4 = new zzYS4(this.zzXRT);
        zzX((ShapeBase) shape, "draw:custom-shape");
        zzys4.zzf(shape);
    }

    private static boolean zzZd(ShapeBase shapeBase) {
        if (shapeBase.getShapeType() == 1) {
            return ((Shape) shapeBase).getTextBox() == null || !shapeBase.hasChildNodes();
        }
        return false;
    }

    private static boolean zzZe(ShapeBase shapeBase) throws Exception {
        int shapeType = shapeBase.getShapeType();
        return (shapeBase instanceof GroupShape) || shapeType == 20 || shapeType == 3 || (shapeType == 1 && (((Shape) shapeBase).getTextBox() == null || !shapeBase.hasChildNodes())) || !zzZh(shapeBase);
    }

    private static boolean zzZf(ShapeBase shapeBase) throws Exception {
        return (((Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class)) == null || !zzZU((Shape) shapeBase) || zzZi(shapeBase)) ? false : true;
    }

    private static boolean zzZg(ShapeBase shapeBase) throws Exception {
        Paragraph parentParagraph = shapeBase.getParentParagraph();
        return (shapeBase.isInline() && shapeBase.isTopLevel()) && ((!shapeBase.isImage() && !shapeBase.zzZid() && (!(shapeBase instanceof Shape) || !((Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class)).zzZjT())) || ((parentParagraph != null && parentParagraph.getParentNode() != null) && parentParagraph.getParentNode().getChildNodes(0, false).getCount() > 1 && (parentParagraph.getParentNode().getParentNode() instanceof GroupShape)));
    }

    private static boolean zzZh(ShapeBase shapeBase) throws Exception {
        Paragraph parentParagraph = shapeBase.getParentParagraph();
        return zzZ(shapeBase, parentParagraph) && (parentParagraph.getParentNode() instanceof Shape) && zzZU((Shape) parentParagraph.getParentNode()) && zzYE(parentParagraph);
    }

    private static boolean zzZi(ShapeBase shapeBase) {
        Paragraph paragraph;
        Shape shape;
        return shapeBase.getChildNodes(0, false).getCount() == 1 && (paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getChildNodes(0, false).get(0), Paragraph.class)) != null && paragraph.getChildNodes(0, false).getCount() == 1 && (shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(paragraph.getChildNodes(0, false).get(0), Shape.class)) != null && shape.isImage() && (shapeBase.getParentNode() instanceof GroupShape);
    }

    private void zzZj(ShapeBase shapeBase) throws Exception {
        this.zzXRT.zzYsG().zzGB("draw:g");
        zzY(shapeBase, shapeBase.zzYzG().getSize());
    }

    private static long zzZk(ShapeBase shapeBase) {
        ShapeBase shapeBaseZzYa6;
        double rotation = shapeBase.getRotation();
        return (((rotation < 45.0d || rotation >= 135.0d) && (rotation < 225.0d || rotation >= 315.0d)) || shapeBase == (shapeBaseZzYa6 = shapeBase.zzYa6()) || !shapeBaseZzYa6.isGroup()) ? shapeBase.zzYzG().getSize() : com.aspose.words.internal.zzZPW.zzG((float) ((shapeBaseZzYa6.getHeight() * shapeBase.getWidth()) / ((double) shapeBaseZzYa6.zzY9h().zzZyi())), (float) ((shapeBaseZzYa6.getWidth() * shapeBase.getHeight()) / ((double) shapeBaseZzYa6.zzY9h().zzZyj())));
    }

    private static boolean zzZm(ShapeBase shapeBase) throws Exception {
        if (shapeBase.isImage() || shapeBase.zzZid()) {
            return true;
        }
        return (shapeBase instanceof Shape) && zzZU((Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class));
    }

    private static boolean zzZn(ShapeBase shapeBase) {
        return shapeBase.getRelativeVerticalPosition() == 1 && shapeBase.getRelativeHorizontalPosition() == 1;
    }

    private void zzZo(ShapeBase shapeBase) throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        if (shapeBase.isInline()) {
            zzytgZzYsG.zzYu("text:anchor-type", "as-char");
        } else if (zzZn(shapeBase)) {
            zzytgZzYsG.zzYu("text:anchor-type", "page");
        } else if (zzZm(shapeBase)) {
            zzytgZzYsG.zzYu("text:anchor-type", "char");
        }
    }

    private static boolean zzZp(ShapeBase shapeBase) throws Exception {
        int shapeType = shapeBase.getShapeType();
        if (shapeType != -2 && shapeType != -1 && shapeType != 1 && shapeType != 3 && shapeType != 20 && shapeType != 37 && shapeType != 75) {
            switch (shapeType) {
                default:
                    switch (shapeType) {
                        case 189:
                        case 190:
                        case 191:
                        case 192:
                        case 193:
                        case 194:
                        case 195:
                        case 196:
                        case 197:
                        case 198:
                        case 199:
                        case 200:
                        case 201:
                        case 202:
                            break;
                        default:
                            return ((shapeBase instanceof Shape) && ((Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class)).zzZjT()) ? false : true;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    return false;
            }
        }
        return false;
    }

    private void zzZq(ShapeBase shapeBase) {
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        for (int i = 0; i < zzyc3ZzYvW.getCount(); i++) {
            int iZzT3 = zzyc3ZzYvW.zzT3(i);
            Object objZzVY = zzyc3ZzYvW.zzVY(i);
            if (objZzVY != null) {
                if (iZzT3 == 462) {
                    zzY(shapeBase, objZzVY);
                } else if (iZzT3 == 464) {
                    this.zzXRT.zzX(zzyc3ZzYvW, ((Integer) objZzVY).intValue(), true);
                } else if (iZzT3 == 465) {
                    this.zzXRT.zzX(zzyc3ZzYvW, ((Integer) objZzVY).intValue(), false);
                }
            }
        }
    }

    private boolean zzZr(ShapeBase shapeBase) throws Exception {
        if (!(shapeBase instanceof GroupShape)) {
            return false;
        }
        for (Node node : shapeBase.getChildNodes(0, false)) {
            if ((node instanceof ShapeBase) && !zzZs((ShapeBase) com.aspose.words.internal.zzZKW.zzZ(node, ShapeBase.class))) {
                return false;
            }
        }
        return true;
    }

    private boolean zzZs(ShapeBase shapeBase) throws Exception {
        if (this.zzXRT.zzYsC() == 6 || zzZr(shapeBase)) {
            return true;
        }
        if ((!zzYOR.zzXk(shapeBase) && this.zzXRT.zzYsF()) || shapeBase.getAncestor(19) != null) {
            return true;
        }
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        if (shape != null) {
            return zzZX(shape) || !zzZY(shape) || this.zzXRT.zzYsk();
        }
        return false;
    }

    private static boolean zzZt(ShapeBase shapeBase) throws Exception {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        return shape != null && zzZp(shapeBase) && shape.getTextPath().getOn() && com.aspose.words.internal.zzZYD.zzXk(shape.getTextPath().getText());
    }

    private void zzZu(ShapeBase shapeBase) throws Exception {
        if (zzZt(shapeBase)) {
            for (String str : com.aspose.words.internal.zzZKN.zzR(((Shape) shapeBase).getTextPath().getText(), '\n')) {
                Paragraph paragraph = new Paragraph(this.zzXRT.getDocument());
                paragraph.zzYG(shapeBase);
                paragraph.getRuns().add(new Run(this.zzXRT.getDocument(), str));
                paragraph.accept(this.zzXRT);
            }
        }
    }

    private boolean zzZv(ShapeBase shapeBase) {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        Object objZzPk = shapeBase.zzYvW().zzPk(952);
        return (shape == null || this.zzXRT.zzYsE() || this.zzXRT.zzYsC() == 5 || objZzPk == null || !((Boolean) objZzPk).booleanValue() || !"text/javascript".equals(shape.zzYbt())) ? false : true;
    }

    private boolean zzZw(ShapeBase shapeBase) {
        if (!zzZv(shapeBase)) {
            return false;
        }
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzGB("text:script");
        zzytgZzYsG.zzYt("script:language", "JavaScript");
        zzytgZzYsG.writeString(((Shape) shapeBase).zzYbu());
        zzytgZzYsG.zzGA("text:script");
        return true;
    }

    private static boolean zzZx(ShapeBase shapeBase) {
        return com.aspose.words.internal.zzZYD.zzXk(shapeBase.getHRef()) && !(shapeBase.getParentNode() instanceof GroupShape);
    }

    private void zzZy(ShapeBase shapeBase) throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        if (zzZx(shapeBase)) {
            zzytgZzYsG.zzGB("draw:a");
            zzytgZzYsG.zzYu("xlink:type", "simple");
            zzytgZzYsG.zzYu("xlink:href", shapeBase.getHRef());
            zzytgZzYsG.zzYt("office:target-frame-name", shapeBase.getTarget());
        }
        zzX(shapeBase, "draw:frame");
    }

    private static boolean zzZz(ShapeBase shapeBase) {
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        Object objZzPk = zzyc3ZzYvW.zzPk(190);
        return objZzPk != null && ((Boolean) objZzPk).booleanValue() && zzyc3ZzYvW.zzPk(4132) != null && com.aspose.words.internal.zzZPW.zzYz(shapeBase.zzYzG().getSize()) > 0.0f;
    }

    private long zzg(float f, float f2) {
        int i;
        int measureUnit = this.zzXRT.zzYsI().getMeasureUnit();
        if (measureUnit == 0) {
            i = 3;
        } else {
            if (measureUnit != 1) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: Unknown measure unit");
            }
            i = 5;
        }
        return com.aspose.words.internal.zzZPW.zzG((float) com.aspose.words.internal.zzZKQ.zzS(f, i), (float) com.aspose.words.internal.zzZKQ.zzS(f2, i));
    }

    private String zzi(double d, double d2) {
        return com.aspose.words.internal.zzAN.zzZD(d2) ? this.zzXRT.zzYrY() : this.zzXRT.zzWu((d * 2.0d) + d2);
    }

    private static boolean zzrH(int i) {
        return i == 32;
    }

    public final int zzZF(ShapeBase shapeBase) throws Exception {
        if (zzZw(shapeBase)) {
            return 1;
        }
        if (zzZs(shapeBase)) {
            return 0;
        }
        if (this.zzXRT.zzYsE()) {
            zzZC(shapeBase);
        } else if (this.zzXRT.zzYsC() == 5) {
            zzZq(shapeBase);
        } else {
            zzZE(shapeBase);
        }
        zzZu(shapeBase);
        return 0;
    }

    public final int zzZl(ShapeBase shapeBase) throws Exception {
        if (!zzZs(shapeBase) && !this.zzXRT.zzYsE() && this.zzXRT.zzYsC() != 5) {
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            if (zzZf(shapeBase)) {
                zzytgZzYsG.zzo();
            }
            if (com.aspose.words.internal.zzZYD.zzXk(shapeBase.getTitle())) {
                zzytgZzYsG.zzZ("svg:title", shapeBase.getTitle());
            }
            if (com.aspose.words.internal.zzZYD.zzXk(shapeBase.getAlternativeText())) {
                zzytgZzYsG.zzZ("svg:desc", shapeBase.getAlternativeText());
            }
            if (shapeBase instanceof GroupShape) {
                zzytgZzYsG.zzGA("draw:g");
            } else if (shapeBase.getShapeType() == 20) {
                zzytgZzYsG.zzGA("draw:line");
            } else if (zzrH(shapeBase.getShapeType())) {
                zzytgZzYsG.zzGA("draw:connector");
            } else if (zzZd(shapeBase)) {
                zzytgZzYsG.zzGA("draw:rect");
            } else if (shapeBase.getShapeType() == 3) {
                zzytgZzYsG.zzGA("draw:ellipse");
            } else if (zzZp(shapeBase)) {
                zzytgZzYsG.zzGA("draw:custom-shape");
                this.zzXRT.zzRX(false);
            } else if (!zzZh(shapeBase)) {
                zzytgZzYsG.zzGA("draw:frame");
                if (zzZx(shapeBase)) {
                    zzytgZzYsG.zzGA("draw:a");
                }
            }
            if (zzZg(shapeBase)) {
                this.zzXQV.zzYuc();
            }
        }
        return 0;
    }

    private static float zzZ(ShapeBase shapeBase, float f) {
        return (shapeBase.getDirectShapeAttr(1985) == null || ((Integer) shapeBase.getDirectShapeAttr(1985)).intValue() == 0 || shapeBase.getRelativeVerticalSize() != 0 || !((Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class)).zzYbk()) ? f : f * 0.01f;
    }

    private void zzY(ShapeBase shapeBase, long j) throws Exception {
        this.zzXRT.zzYsG().zzYu("draw:style-name", this.zzXRS.zzYtT());
        zzZo(shapeBase);
        zzX(shapeBase, j);
        this.zzXRT.zzYsG().zzYt("draw:z-index", Integer.toString(shapeBase.getZOrder() < 0 ? 0 : shapeBase.getZOrder()));
    }

    private static double zzY(Shape shape, double d) {
        if (d <= 1584.0d || shape.getParentNode() == null) {
            return d;
        }
        return 1584.0d;
    }

    private void zzX(Shape shape, String str) throws Exception {
        long jZzXk = shape.zzXk(com.aspose.words.internal.zzZPY.zzG((float) shape.getLeft(), (float) shape.getTop()));
        int i = (int) jZzXk;
        double dIntBitsToFloat = Float.intBitsToFloat(i);
        double dIntBitsToFloat2 = Float.intBitsToFloat(i);
        double dZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzXk);
        double dZzYC2 = com.aspose.words.internal.zzZPY.zzYC(jZzXk);
        double dZzY = zzY(shape, Float.intBitsToFloat((int) shape.zzYzG().getSize()));
        double dZzY2 = zzY(shape, com.aspose.words.internal.zzZPW.zzYz(shape.zzYzG().getSize()));
        int flipOrientation = shape.getFlipOrientation();
        if (flipOrientation != 1) {
            if (flipOrientation == 2) {
                dIntBitsToFloat2 += dZzY;
            } else if (flipOrientation != 3) {
                dIntBitsToFloat2 += dZzY;
            } else {
                dIntBitsToFloat += dZzY;
            }
            dZzYC += dZzY2;
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            zzytgZzYsG.zzGB(str);
            zzytgZzYsG.zzYu("draw:type", zzYS3.zzsv(shape.zzYbr()));
            zzytgZzYsG.zzYu("svg:x1", this.zzXRT.zzWu(dIntBitsToFloat));
            zzytgZzYsG.zzYu("svg:y1", this.zzXRT.zzWu(dZzYC));
            zzytgZzYsG.zzYu("svg:x2", this.zzXRT.zzWu(dIntBitsToFloat2));
            zzytgZzYsG.zzYu("svg:y2", this.zzXRT.zzWu(dZzYC2));
            zzY((ShapeBase) shape, com.aspose.words.internal.zzZPW.zzG((float) dZzY, (float) dZzY2));
        }
        dIntBitsToFloat += dZzY;
        dZzYC2 += dZzY2;
        zzYTG zzytgZzYsG2 = this.zzXRT.zzYsG();
        zzytgZzYsG2.zzGB(str);
        zzytgZzYsG2.zzYu("draw:type", zzYS3.zzsv(shape.zzYbr()));
        zzytgZzYsG2.zzYu("svg:x1", this.zzXRT.zzWu(dIntBitsToFloat));
        zzytgZzYsG2.zzYu("svg:y1", this.zzXRT.zzWu(dZzYC));
        zzytgZzYsG2.zzYu("svg:x2", this.zzXRT.zzWu(dIntBitsToFloat2));
        zzytgZzYsG2.zzYu("svg:y2", this.zzXRT.zzWu(dZzYC2));
        zzY((ShapeBase) shape, com.aspose.words.internal.zzZPW.zzG((float) dZzY, (float) dZzY2));
    }

    private void zzX(ShapeBase shapeBase, String str) throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        boolean zZzZD = com.aspose.words.internal.zzAN.zzZD(shapeBase.getRotation());
        double dZzZA = zzZA(shapeBase);
        zzytgZzYsG.zzGB(str);
        if (zZzZD) {
            long jZzXk = shapeBase.zzXk(com.aspose.words.internal.zzZPY.zzG((float) shapeBase.getLeft(), (float) shapeBase.getTop()));
            zzytgZzYsG.zzYu("svg:x", this.zzXRT.zzWu(((double) Float.intBitsToFloat((int) jZzXk)) - dZzZA));
            double dZzYC = ((double) com.aspose.words.internal.zzZPY.zzYC(jZzXk)) - dZzZA;
            if (shapeBase.zzYvW().zzVE(914) && ((Integer) shapeBase.zzYvW().zzPk(914)).intValue() == 3) {
                dZzYC = -dZzYC;
            }
            zzytgZzYsG.zzYu("svg:y", this.zzXRT.zzWu(dZzYC));
        } else {
            zzytgZzYsG.zzYu("svg:x", this.zzXRT.zzYrY());
            zzytgZzYsG.zzYu("svg:y", this.zzXRT.zzYrY());
        }
        long jZzZk = zzZk(shapeBase);
        int i = (int) jZzZk;
        if (Float.intBitsToFloat(i) > 0.0f) {
            zzytgZzYsG.zzYu("svg:width", zzi(dZzZA, Float.intBitsToFloat(i)));
        }
        float fZzZ = zzZ(shapeBase, com.aspose.words.internal.zzZPW.zzYz(jZzZk));
        if (fZzZ > 0.0f) {
            zzytgZzYsG.zzYu("svg:height", zzi(dZzZA, fZzZ));
        }
        zzY(shapeBase, zzg(Float.intBitsToFloat(i), fZzZ));
    }
}
