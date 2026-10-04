package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFB {
    private int zzXrW = 0;
    private zzYFD zzXrX;
    private zzYEM zzXwl;

    public zzYFB(zzYEM zzyem) {
        this.zzXwl = zzyem;
        this.zzXrX = new zzYFD(zzyem);
    }

    private void zzU(ShapeBase shapeBase, boolean z) throws Exception {
        zzYHZ zzyhzZzYfW = this.zzXwl.zzYfW();
        zzyhzZzYfW.zzCC(shapeBase.isGroup() ? "\\shpgrp" : "\\shp");
        zzyhzZzYfW.zzCC("\\*\\shpinst");
        if (z) {
            this.zzXrX.zzZ3(shapeBase);
        } else {
            this.zzXrX.zzW(shapeBase, this.zzXwl.zzZgt());
        }
        if (zzYM(shapeBase)) {
            zzyhzZzYfW.zzCC("\\shptxt");
        }
    }

    private static void zzY(Shape shape, com.aspose.words.internal.zzPV zzpv) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(shape.getImageData().getImageBytes());
            try {
                zzxn.zzV(zzpv);
                zzxn.zzZ(zzzor, 7);
                shape.getImageData().zzZ1(new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzEF.zzZv(zzzor.zzWy())));
            } finally {
                zzxn.dispose();
            }
        } finally {
            zzzor.close();
        }
    }

    private static boolean zzYM(ShapeBase shapeBase) {
        if (shapeBase.isGroup()) {
            return false;
        }
        return shapeBase.hasChildNodes() || shapeBase.zzZid();
    }

    private void zzYN(ShapeBase shapeBase) throws Exception {
        if (shapeBase.isTopLevel()) {
            this.zzXwl.zzYfW().zzYj4();
        }
    }

    private void zzYO(ShapeBase shapeBase) throws Exception {
        if (shapeBase.isTopLevel()) {
            this.zzXwl.zzYfW().zzYj5();
            this.zzXwl.zzYel().zzW(zzZ7R.zzZ(shapeBase, 0), true);
        }
    }

    private void zzYP(ShapeBase shapeBase) throws Exception {
        zzYHZ zzyhzZzYfW = this.zzXwl.zzYfW();
        if (zzYM(shapeBase)) {
            zzyhzZzYfW.zzYj3();
        }
        zzyhzZzYfW.zzYj3();
        if (this.zzXwl.zzYen().getExportImagesForOldReaders() && shapeBase.canHaveImage()) {
            zzyhzZzYfW.zzCC("\\shprslt");
            zzyhzZzYfW.zzCD("\\par");
            zzyhzZzYfW.zzCD("\\pard");
            new zzYFX(this.zzXwl, shapeBase).zzX(false, true, 255);
            zzyhzZzYfW.zzCD("\\par");
            zzyhzZzYfW.zzYj3();
        }
        zzyhzZzYfW.zzYj3();
    }

    private void zzYQ(ShapeBase shapeBase) {
        int i = (this.zzXrW + 1) << 16;
        while (shapeBase != null) {
            int i2 = i + 1;
            shapeBase.zzEk(i);
            int iZzY9A = shapeBase.zzY9A();
            shapeBase = iZzY9A != 0 ? (Shape) this.zzXwl.zzZqS().zzXoZ.get(iZzY9A) : null;
            i = i2;
        }
        this.zzXrW++;
    }

    private void zzYR(ShapeBase shapeBase) throws Exception {
        zzYN(shapeBase);
        zzYP(shapeBase);
        zzYO(shapeBase);
        zzYFX.zzZ(this.zzXwl, shapeBase).zzX(true, false, 255);
        zzYN(shapeBase);
        this.zzXwl.zzYeh().zzRp(true);
    }

    private void zzYS(ShapeBase shapeBase) throws Exception {
        this.zzXwl.zzYeh().zzZ(" SHAPE  \\* MERGEFORMAT ", zzZ7R.zzZ(shapeBase, 0), true);
        this.zzXwl.zzYeh().zzYiH();
        zzYO(shapeBase);
        zzU(shapeBase, false);
    }

    private void zzYT(ShapeBase shapeBase) throws Exception {
        if (shapeBase.zzZid()) {
            return;
        }
        zzYP(shapeBase);
        zzYN(shapeBase);
    }

    private void zzYU(ShapeBase shapeBase) throws Exception {
        if (shapeBase.zzZid()) {
            zzZI((Shape) shapeBase);
        } else {
            zzYO(shapeBase);
            zzU(shapeBase, false);
        }
    }

    private void zzYV(ShapeBase shapeBase) throws Exception {
        int shapeType = shapeBase.getShapeType();
        if (shapeType == -2 || shapeType == 75 || shapeType == 201 || !shapeBase.zzY9F()) {
            return;
        }
        zzYR(shapeBase);
    }

    private void zzYW(ShapeBase shapeBase) throws Exception {
        int shapeType = shapeBase.getShapeType();
        if (shapeType == -2 || shapeType == 75) {
            zzZN((Shape) shapeBase);
            return;
        }
        if (shapeType == 201) {
            zzYG6.zzZ(this.zzXwl, (Shape) shapeBase);
        } else if (shapeBase.zzY9F()) {
            zzYS(shapeBase);
        } else {
            new zzYFX(this.zzXwl, shapeBase).zzX(true, false, 255);
        }
    }

    private void zzZI(Shape shape) throws Exception {
        shape.isInline();
        shape.zzZid();
        zzYO(shape);
        zzU(shape, false);
        zzYG6.zzZ(this.zzXwl, shape);
        zzYP(shape);
        zzYN(shape);
    }

    private static com.aspose.words.internal.zzPV zzZJ(Shape shape) throws Exception {
        Shading shadingZzX = zzZ7R.zzX((zzZ9G) shape);
        if (shadingZzX != null) {
            return shadingZzX.zzYbK();
        }
        return null;
    }

    private void zzZL(Shape shape) throws Exception {
        zzYO(shape);
        zzZK(shape);
        zzYN(shape);
    }

    private void zzZM(Shape shape) throws Exception {
        shape.isInline();
        shape.isImage();
        shape.getImageData().isLink();
        if (!this.zzXwl.zzZqP()) {
            String strZzZI = com.aspose.words.internal.zzZKN.format(" INCLUDEPICTURE {0} \\* MERGEFORMAT ", zzY0C.zzyw(shape.getImageData().getSourceFullName()));
            if (shape.getImageData().isLinkOnly()) {
                strZzZI = com.aspose.words.internal.zzZKN.zzZI(strZzZI, "\\d ");
            }
            this.zzXwl.zzYeh().zzZ(strZzZI, zzZ7R.zzZ(shape, 0), false);
            this.zzXwl.zzYeh().zzYiH();
        }
        zzYO(shape);
        zzZK(shape);
        zzYN(shape);
        if (this.zzXwl.zzZqP()) {
            return;
        }
        this.zzXwl.zzYeh().zzRp(true);
    }

    private void zzZN(Shape shape) throws Exception {
        shape.isInline();
        if (!shape.isImage()) {
            shape.zzY9I();
        }
        if (com.aspose.words.internal.zzZYD.zzXk(shape.getHRef())) {
            this.zzXwl.zzYeh().zzZ(new zzZQX(com.aspose.words.internal.zzZVR.zzWH(shape.getHRef()), com.aspose.words.internal.zzZVR.zzWG(shape.getHRef()), shape.getScreenTip(), shape.getTarget(), "", false).zzZfj(), zzZ7R.zzZ(shape, 0), false);
            this.zzXwl.zzYeh().zzYiH();
        }
        if (shape.getShapeType() != 75) {
            zzYG6.zzZ(this.zzXwl, shape);
        } else if (shape.getImageData().isLink()) {
            zzZM(shape);
        } else {
            zzZL(shape);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(shape.getHRef())) {
            this.zzXwl.zzYeh().zzRp(true);
        }
    }

    public final void zzP(zzYEM zzyem) {
        com.aspose.words.internal.zzZYV zzzyv = new com.aspose.words.internal.zzZYV();
        com.aspose.words.internal.zzD3<ShapeBase>.zzZ zzzZzCK = zzyem.zzZqS().zzXoZ.zzCK();
        while (zzzZzCK.moveNext()) {
            zzzyv.add(zzzZzCK.zzCM(), zzzZzCK.zzCI());
        }
        for (int i = 0; i < zzzyv.getCount(); i++) {
            ShapeBase shapeBase = (ShapeBase) zzzyv.zzVY(i);
            if (zzYM(shapeBase)) {
                zzYQ(shapeBase);
            }
        }
    }

    public final void zzYX(ShapeBase shapeBase) throws Exception {
        if (shapeBase.isInline()) {
            zzYV(shapeBase);
        } else {
            zzYT(shapeBase);
        }
    }

    public final void zzYY(ShapeBase shapeBase) throws Exception {
        if (!shapeBase.isInline()) {
            zzYU(shapeBase);
            return;
        }
        long size = shapeBase.getSize();
        if (shapeBase.isTopLevel()) {
            size = zzYLS.zzZ(size, shapeBase.getRotation());
        }
        shapeBase.zzWe(com.aspose.words.internal.zzZPW.zzYz(size));
        shapeBase.zzWf(Float.intBitsToFloat((int) size));
        zzYW(shapeBase);
    }

    public final void zzZ3(ShapeBase shapeBase) throws Exception {
        zzU(shapeBase, true);
        zzYP(shapeBase);
    }

    public final void zzZK(Shape shape) throws Exception {
        if (shape.getImageData().isLinkOnly()) {
            return;
        }
        if (this.zzXwl.zzYen().getSaveImagesAsWmf()) {
            Shape shape2 = (Shape) shape.deepClone(false);
            zzY(shape2, zzZJ(shape));
            shape = shape2;
        }
        zzYFX zzyfx = new zzYFX(this.zzXwl, shape);
        int imageType = shape.getImageData().getImageType();
        if (imageType == 2 || imageType == 3 || imageType == 7) {
            zzyfx.zzX(true, false, 255);
            return;
        }
        zzYHZ zzyhzZzYfW = this.zzXwl.zzYfW();
        zzyhzZzYfW.zzCC("\\*\\shppict");
        zzyfx.zzX(true, false, 255);
        zzyhzZzYfW.zzYj3();
        if (this.zzXwl.zzYen().getExportImagesForOldReaders()) {
            zzyhzZzYfW.zzCC("\\nonshppict");
            zzyfx.zzX(false, true, 255);
            zzyhzZzYfW.zzYj3();
        }
    }
}
