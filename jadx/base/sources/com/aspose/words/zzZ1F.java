package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1F {
    private com.aspose.words.internal.zzZO0 zzMW;
    private zzY7E zzY2F;
    private Paragraph zzY2G;
    private zzYE0 zzY2H;
    private zzZ1H zzY2O;
    private zzZ1K zzY2S;
    private zzZ89 zzY3S;
    private boolean zzYjb;
    private zzZ8D zzYjc;
    private zzYE0 zzYmr;
    private zzYXT zzYrL;
    private zzY86 zzYs0;

    public zzZ1F(zzZ1K zzz1k, zzZ1H zzz1h, zzYE0 zzye0, zzZ8D zzz8d, zzY86 zzy86, com.aspose.words.internal.zzH6 zzh6, com.aspose.words.internal.zzFL zzfl, boolean z, boolean z2, com.aspose.words.internal.zzZO0 zzzo0, zzYXT zzyxt) {
        this.zzY2S = zzz1k;
        this.zzY2O = zzz1h;
        this.zzYmr = zzye0;
        this.zzYjc = zzz8d;
        this.zzYs0 = zzy86;
        this.zzYjb = z;
        this.zzY3S = new zzZ89(zzz8d, z, zzyxt);
        this.zzY2F = new zzY7E(z2, zzh6, zzfl);
        this.zzMW = zzzo0;
        this.zzYrL = zzyxt;
    }

    private boolean zz3(ShapeBase shapeBase) throws Exception {
        zzYXT zzyxt = this.zzYrL;
        if (zzyxt != null && zzyxt.getSaveFormat() == 54) {
            return false;
        }
        if (shapeBase.zzY9W()) {
            return true;
        }
        int shapeType = shapeBase.getShapeType();
        return (shapeType == -2 || shapeType == 75 || shapeType == 201) ? this.zzYmr.zzXpj == 1 && (shapeBase instanceof Shape) && com.aspose.words.internal.zzEF.zzVW(((Shape) shapeBase).getImageData().zzYW0()) : this.zzYmr.zzXpc;
    }

    public final void zz4(ShapeBase shapeBase) throws Exception {
        Paragraph paragraph;
        shapeBase.isTopLevel();
        if (shapeBase.getNodeType() != 18) {
            shapeBase.getNodeType();
        }
        boolean zZzZ = com.aspose.words.internal.zzZYD.zzXk(shapeBase.getHRef()) ? this.zzY2O.zzZ(shapeBase.getHRef(), shapeBase.getTarget(), shapeBase.getScreenTip(), false, false) : false;
        if (zzZ1E.zz2(shapeBase) && shapeBase.getRelativeHorizontalPosition() == 3) {
            Paragraph paragraph2 = (Paragraph) shapeBase.zzYBd();
            if (paragraph2.getRuns().getCount() == 0 && ((paragraph = this.zzY2G) == null || paragraph != paragraph2)) {
                this.zzY2S.zzR(paragraph2.getParagraphFormat().getStyle().getFont());
                this.zzY2G = paragraph2;
            }
        }
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        if (!this.zzYjb && shape != null && shape.getImageData().isLinkOnly() && com.aspose.words.internal.zzZVR.zzWF(shape.getImageData().getSourceFullName())) {
            ShapeRenderer shapeRenderer = shapeBase.getShapeRenderer();
            this.zzY2S.zzZ(shapeBase, true, zZzZ, this.zzYjc.zzCL(shape.getImageData().getSourceFullName()), shape.getImageData().zzYW0(), shapeRenderer.zzYzG(), shapeRenderer.zzyv());
        } else if (zz3(shapeBase)) {
            zzY7F zzy7fZzYh = this.zzY2F.zzYh(shapeBase);
            zzYXT zzyxt = this.zzYrL;
            if (zzyxt == null || zzyxt.getSaveFormat() != 53) {
                this.zzY2S.zzZ(shapeBase, zzy7fZzYh.zzY0K(), zzy7fZzYh.zzZj(), zzy7fZzYh.zzY0J());
            } else {
                String strZzWY = com.aspose.words.internal.zzKE.zzWY(39);
                zzY86 zzy86 = this.zzYs0;
                com.aspose.words.internal.zzZO0 zzzo0 = this.zzMW;
                zzy86.zzX(new zzY5X(zzzo0, strZzWY, null, zzzo0.zzZn(zzy7fZzYh.zzY0K())));
                this.zzY2S.zzZ(shapeBase, false, zZzZ, "", 39, shapeBase.zzY9O(), null);
            }
        } else {
            zzZ8B zzz8bZzZ = this.zzY3S.zzZ(shapeBase, this.zzYmr);
            if (zzz8bZzZ != null) {
                this.zzY2S.zzZ(shapeBase, false, zZzZ, zzz8bZzZ.zzYVM(), zzz8bZzZ.zzYW0(), zzz8bZzZ.zzZj(), zzz8bZzZ.zzyv());
            }
        }
        if (zZzZ) {
            this.zzY2O.zzZlN();
        }
    }

    public final String zzZ(Shape shape, double d) throws Exception {
        if (this.zzY2H == null) {
            zzYE0 zzye0ZzYdi = this.zzYmr.zzYdi();
            this.zzY2H = zzye0ZzYdi;
            zzye0ZzYdi.zzXpi = true;
        }
        long size = shape.zzYzG().getSize();
        this.zzY2H.zzXpe = ((float) d) / com.aspose.words.internal.zzZPW.zzYz(size);
        zzZ8B zzz8bZzZ = this.zzY3S.zzZ((ShapeBase) shape, this.zzY2H);
        if (zzz8bZzZ != null) {
            return zzz8bZzZ.zzYVM();
        }
        return null;
    }

    public final String zzk(Shape shape) throws Exception {
        int iZzZU;
        if (shape.getFill().getImageBytes() == null) {
            return null;
        }
        int fillType = shape.zzY9J().getFillType();
        if (fillType != 1) {
            if ((fillType == 2 || fillType == 3) && (iZzZU = com.aspose.words.internal.zzEF.zzZU(shape.getFill().getImageBytes())) != 0) {
                return this.zzY3S.zzZ(shape.getFill().getImageBytes(), shape, iZzZU, this.zzYmr.zzXpg);
            }
            return null;
        }
        Shape shape2 = (Shape) shape.deepClone(false);
        shape2.zzWe(24.0d);
        shape2.zzWf(24.0d);
        zzZ8B zzz8bZzZ = this.zzY3S.zzZ((ShapeBase) shape2, this.zzYmr);
        if (zzz8bZzZ != null) {
            return zzz8bZzZ.zzYVM();
        }
        return null;
    }
}
