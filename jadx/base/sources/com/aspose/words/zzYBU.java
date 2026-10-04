package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBU {
    private static zzYEF zzXeL = new zzYEF();
    private zzZZ3 zzXeM;
    private zzZTI zzYUv;

    public zzYBU(zzZZ3 zzzz3) {
        this.zzXeM = zzzz3;
        this.zzYUv = new zzZTI(zzzz3.getDocument(), null);
    }

    private void zz4(ShapeBase shapeBase) throws Exception {
        if (shapeBase.isInline()) {
            zzYm(shapeBase);
        } else {
            zzYj(shapeBase);
        }
    }

    public static int zzY8u() {
        return 0;
    }

    private void zzYi(ShapeBase shapeBase) throws Exception {
        shapeBase.isTopLevel();
        this.zzYUv.zzY(shapeBase, zzZZ5.zzGc(this.zzXeM.zzZqT()));
        this.zzXeM.zzZ(new zzZLQ(shapeBase));
        this.zzXeM.zzZ(zzZZP.zzYWP, shapeBase.zzZYh(), zzZZ3.zzYTv);
    }

    private void zzYj(ShapeBase shapeBase) throws Exception {
        shapeBase.isInline();
        if (shapeBase.isTopLevel()) {
            zzYi(shapeBase);
        }
        if (shapeBase.zzZid()) {
            Shape shape = (Shape) shapeBase;
            zzYn(shape);
            Paragraph paragraph = new Paragraph(shapeBase.getDocument());
            this.zzXeM.visitParagraphStart(paragraph);
            int wrapType = shape.getWrapType();
            shape.setWrapType(0);
            zzZm(shape);
            shape.setWrapType(wrapType);
            this.zzXeM.visitParagraphEnd(paragraph);
            zzZo(shape);
        }
    }

    private void zzYk(ShapeBase shapeBase) throws Exception {
        shapeBase.isInline();
        com.aspose.words.internal.zzZOP zzzopZzq = this.zzXeM.zzZqU().zzq();
        com.aspose.words.internal.zzZOW zzzowZzZqU = this.zzXeM.zzZqU();
        int position = (int) zzzopZzq.getPosition();
        zzYE5 zzye5 = new zzYE5();
        zzye5.zzXpL = true;
        zzye5.zzdZ = position;
        this.zzXeM.zzZ(ControlChar.zzZsd, shapeBase.zzY9F() ? zzXeL : shapeBase.zzZYh(), zzye5);
        zzYLS zzyls = new zzYLS(shapeBase);
        zzyls.zzZ(zzzowZzZqU);
        if (shapeBase.canHaveImage()) {
            Shape shape = (Shape) shapeBase;
            if (shape.getImageData().isLinkOnly()) {
                zzZZQ.zzZ(shape.getImageData().getSourceFullName(), Integer.MAX_VALUE, zzzowZzZqU, false, false);
            }
        }
        zzZT1.zzZ(shapeBase, new zzZSP(zzzowZzZqU, (DocSaveOptions) this.zzXeM.zzZqS().zzXpa));
        int position2 = (int) zzzopZzq.getPosition();
        zzyls.zzXEK = position2 - position;
        zzzopZzq.zzH(position);
        zzyls.zzZ(zzzowZzZqU);
        zzzopZzq.zzH(position2);
    }

    private void zzYl(ShapeBase shapeBase) throws Exception {
        shapeBase.isInline();
        shapeBase.isImage();
        zzYEF zzyef = zzXeL;
        if (shapeBase.zzZYh().hasRevisions()) {
            zzyef = (zzYEF) zzXeL.zzbn();
            shapeBase.zzZYh().zzX(zzyef, 14);
            shapeBase.zzZYh().zzX(zzyef, 12);
        }
        this.zzXeM.zzZ(95, zzyef);
        this.zzXeM.zzZ(" SHAPE  \\* MERGEFORMAT ", zzyef);
        this.zzXeM.zzW(zzyef);
        zzYi(shapeBase);
        zzYk(shapeBase);
        this.zzXeM.zzY(95, zzyef);
    }

    private void zzYm(ShapeBase shapeBase) throws Exception {
        shapeBase.isInline();
        int shapeType = shapeBase.getShapeType();
        if (shapeType == -2 || shapeType == 75) {
            zzZN((Shape) shapeBase);
            return;
        }
        if (shapeType == 201) {
            zzZm((Shape) shapeBase);
        } else if (shapeBase.zzY9F()) {
            zzYl(shapeBase);
        } else {
            zzYk(shapeBase);
        }
    }

    private void zzYn(ShapeBase shapeBase) {
        zzZZ3 zzzz3 = this.zzXeM;
        zzzz3.zzG4(zzZZ5.zzGd(zzzz3.zzZqT()));
        zzY4U zzy4u = new zzY4U();
        zzy4u.zzYuX = 1;
        zzy4u.zzX21 = -1;
        zzy4u.zzX20 = shapeBase.getId();
        int iZzZ = this.zzXeM.zzZ(zzy4u);
        zzYK zzyk = new zzYK();
        zzyk.zzZD7 = iZzZ;
        this.zzXeM.zzZ(zzyk);
        if (iZzZ > 32767) {
            this.zzXeM.zzTG("Too many textboxes, document can have problem while opened in MS Word.");
        }
        int i = (iZzZ + 1) << 16;
        if (shapeBase.zzZid()) {
            ((Shape) shapeBase).getOleFormat().zzqY(i);
            return;
        }
        while (shapeBase != null) {
            int i2 = i + 1;
            shapeBase.zzEk(i);
            int iZzY9A = shapeBase.zzY9A();
            shapeBase = iZzY9A != 0 ? this.zzXeM.zzZqS().zzXoZ.get(iZzY9A) : null;
            i = i2;
        }
    }

    private void zzZM(Shape shape) throws Exception {
        shape.isInline();
        shape.isImage();
        shape.getImageData().isLink();
        if (!this.zzXeM.zzZqP()) {
            this.zzXeM.zzZ(67, zzXeL);
            String strZzZI = com.aspose.words.internal.zzZKN.format(" INCLUDEPICTURE {0} \\* MERGEFORMAT ", zzY0C.zzyw(shape.getImageData().getSourceFullName()));
            if (shape.getImageData().isLinkOnly()) {
                strZzZI = com.aspose.words.internal.zzZKN.zzZI(strZzZI, "\\d ");
            }
            this.zzXeM.zzZ(strZzZI, zzXeL);
            this.zzXeM.zzW(zzXeL);
        }
        zzYk(shape);
        if (this.zzXeM.zzZqP()) {
            return;
        }
        this.zzXeM.zzY(67, zzXeL);
    }

    private void zzZN(Shape shape) throws Exception {
        shape.isInline();
        if (!shape.isImage()) {
            shape.zzY9I();
        }
        if (com.aspose.words.internal.zzZYD.zzXk(shape.getHRef())) {
            this.zzXeM.zzZ(88, zzXeL);
            this.zzXeM.zzZ(new zzZQX(com.aspose.words.internal.zzZVR.zzWH(shape.getHRef()), com.aspose.words.internal.zzZVR.zzWG(shape.getHRef()), shape.getScreenTip(), shape.getTarget(), "", false).zzZfj(), zzXeL);
            this.zzXeM.zzW(zzXeL);
        }
        if (shape.getShapeType() == 75) {
            zzZn(shape);
        } else {
            zzZm(shape);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(shape.getHRef())) {
            this.zzXeM.zzY(88, zzXeL);
        }
    }

    private void zzZm(Shape shape) throws Exception {
        String strZzM8;
        int i;
        shape.isInline();
        shape.zzZid();
        int shapeType = shape.getShapeType();
        if (shapeType != -2) {
            if (shapeType != 201) {
                throw new IllegalStateException("Unexpected shape type.");
            }
            strZzM8 = zzZQZ.zzM8(shape.getOleFormat().getProgId());
            i = 87;
        } else if (shape.getOleFormat().isLink()) {
            strZzM8 = zzZQU.zzW(shape.getOleFormat());
            i = 56;
        } else {
            strZzM8 = zzZQY.zzM8(shape.getOleFormat().getProgId());
            i = 58;
        }
        this.zzXeM.zzZ(i, zzXeL);
        this.zzXeM.zzZ(strZzM8, zzXeL);
        zzZBL zzzblZzYrB = shape.zzYrB();
        this.zzXeM.zzZ(zzXeL, zzzblZzYrB != null ? zzzblZzYrB.getId() : 0);
        zzYk(shape);
        this.zzXeM.zzY(i, zzXeL);
    }

    private void zzZn(Shape shape) throws Exception {
        shape.isInline();
        shape.isImage();
        if (shape.getImageData().isLink()) {
            zzZM(shape);
        } else {
            zzYk(shape);
        }
    }

    private void zzZo(Shape shape) throws Exception {
        new Paragraph(shape.getDocument()).accept(this.zzXeM);
        this.zzXeM.zzZqV();
    }

    public final int visitGroupShapeStart(GroupShape groupShape) throws Exception {
        zz4(groupShape);
        return 0;
    }

    public final int visitShapeEnd(Shape shape) throws Exception {
        if (!shape.hasChildNodes()) {
            return 0;
        }
        zzZo(shape);
        return 0;
    }

    public final int visitShapeStart(Shape shape) throws Exception {
        zz4(shape);
        if (!shape.hasChildNodes()) {
            return 0;
        }
        zzYn(shape);
        return 0;
    }

    public final zzZTI zzY8t() {
        return this.zzYUv;
    }
}
