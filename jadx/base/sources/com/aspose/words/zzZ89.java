package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ89 {
    private boolean zzYja;
    private boolean zzYjb;
    private zzZ8D zzYjc;
    private com.aspose.words.internal.zzXA<String> zzYjd = new com.aspose.words.internal.zzXA<>();
    private zzYXT zzYrL;

    public zzZ89(zzZ8D zzz8d, boolean z, zzYXT zzyxt) {
        this.zzYjc = zzz8d;
        this.zzYjb = z;
        this.zzYrL = zzyxt;
        this.zzYja = zzyxt != null && zzyxt.getSaveFormat() == 54;
    }

    private static boolean zz9(ShapeBase shapeBase) {
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        for (int i = 0; i < zzyc3ZzYvW.getCount(); i++) {
            int iZzT3 = zzyc3ZzYvW.zzT3(i);
            if (!zzyl(iZzT3)) {
                Object objZzVY = zzyc3ZzYvW.zzVY(i);
                if (iZzT3 != 257 && iZzT3 != 258 && iZzT3 != 256 && iZzT3 != 257) {
                    if (iZzT3 == 4106 || iZzT3 == 4107 || iZzT3 == 4108 || iZzT3 == 4109) {
                        if (((Border) objZzVY).isVisible()) {
                        }
                    } else if (iZzT3 == 508 || iZzT3 == 443 || iZzT3 == 441 || iZzT3 == 442 || iZzT3 == 317 || iZzT3 == 318) {
                        if (((Boolean) objZzVY).booleanValue()) {
                            return true;
                        }
                    } else if (iZzT3 == 4096) {
                        if (((Integer) objZzVY).intValue() != 0) {
                            return true;
                        }
                    } else if (iZzT3 >= 128 && iZzT3 <= 191) {
                        if (shapeBase.zzY9P()) {
                            return true;
                        }
                    } else if (iZzT3 >= 512 && iZzT3 <= 575) {
                        Object obj = zzyc3ZzYvW.get(574);
                        if (obj != null && ((Boolean) obj).booleanValue()) {
                            return true;
                        }
                    } else if (zzym(iZzT3)) {
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private String zzX(ShapeBase shapeBase, byte[] bArr, int i, int i2, int i3, boolean z) throws Exception {
        com.aspose.words.internal.zzXC zzxc = new com.aspose.words.internal.zzXC(bArr, 0, i2);
        String strZzX = this.zzYjd.zzX(zzxc);
        if (strZzX != null) {
            return strZzX;
        }
        String strZzZ = this.zzYjc.zzZ(shapeBase, bArr, 0, i2, i3, z);
        if (this.zzYrL != null) {
            strZzZ = this.zzYrL.zzHJ(com.aspose.words.internal.zzKE.zzWY(i3));
        }
        this.zzYjd.zzZ(zzxc, strZzZ);
        return strZzZ;
    }

    private static int zzY(GroupShape groupShape, int i) throws Exception {
        int iMax;
        byte[] imageBytes;
        for (Node node : groupShape.getChildNodes(0, false)) {
            if (node instanceof Shape) {
                Shape shape = (Shape) node;
                if (shape.getShapeType() != 75 || (imageBytes = shape.getImageData().getImageBytes()) == null || com.aspose.words.internal.zzEF.zzZH(imageBytes)) {
                    iMax = Integer.MAX_VALUE;
                } else {
                    com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(imageBytes);
                    iMax = !zzegZzZT.zzDR() ? Math.max(com.aspose.words.internal.zzAN.zzZG(zzegZzZT.getHorizontalResolution()), com.aspose.words.internal.zzAN.zzZG(zzegZzZT.getVerticalResolution())) : i;
                }
                i = Math.max(i, iMax);
            } else if (node instanceof GroupShape) {
                i = zzY((GroupShape) node, i);
            } else if (!zzYVU.zztq(node.getNodeType())) {
                i = Integer.MAX_VALUE;
            }
            if (i == Integer.MAX_VALUE) {
                break;
            }
        }
        return i;
    }

    private static boolean zzq(Shape shape) {
        return shape.getImageData() != null && shape.getImageData().zzYW1();
    }

    private static boolean zzyl(int i) {
        if ((i >= 64 && i <= 127) || i == 128 || i == 267 || i == 319 || i == 509 || i == 827 || i == 828 || i == 829 || i == 830 || i == 772) {
            return true;
        }
        if (i >= 896 && i <= 914) {
            return true;
        }
        if (i >= 919 && i <= 922) {
            return true;
        }
        if (i >= 937 && i <= 945) {
            return true;
        }
        if ((i >= 949 && i <= 959) || i == 4157 || i == 897 || i == 4097 || i == 4098 || i == 4099 || i == 4103 || i == 4112 || i == 4113 || i == 4114 || i == 4115 || i == 4116 || i == 4117 || i == 4118 || i == 4119 || i == 4120 || i == 4124 || i == 4129 || i == 4130 || i == 4131 || i == 4132 || i == 4154 || i == 4155) {
            return true;
        }
        return i >= 4140 && i <= 4146;
    }

    private static boolean zzym(int i) {
        return (i == 4155 || i == 4102 || i == 4104 || i == 260 || i == 261 || i == 446 || i == 447 || i == 1988 || i == 1989 || i == 4122 || i == 1984 || i == 1985 || i == 1343 || i == 378 || i == 379 || i == 380) ? false : true;
    }

    private static boolean zzyn(int i) {
        return i == 2 || i == 3 || i == 5 || i == 6 || i == 7;
    }

    public final zzZ8B zzZ(ShapeBase shapeBase, zzYE0 zzye0) throws Exception {
        try {
            return shapeBase.getShapeType() == -1 ? zzZ((GroupShape) shapeBase, zzye0) : zzZ((Shape) shapeBase, zzye0);
        } catch (com.aspose.words.internal.zzX8 unused) {
            zzZ(shapeBase, 1, "Shape has invalid size or other parameters and cannot be rendered.");
            return null;
        }
    }

    public final String zzZ(byte[] bArr, Shape shape, int i, boolean z) throws Exception {
        return zzZ(shape, bArr, bArr.length, i, true, z);
    }

    private zzZ8B zzZ(Shape shape, zzYE0 zzye0) throws Exception {
        Shape shape2;
        if (zzZGY.zzx(shape)) {
            shape2 = (Shape) shape.deepClone(false);
            shape2.getStroke().setOn(false);
            if (shape2.getImageData() != null) {
                shape2.getImageData().getBorders().clearFormatting();
            }
        } else {
            shape2 = shape;
        }
        ShapeRenderer shapeRenderer = shape2.getShapeRenderer();
        com.aspose.words.internal.zzG zzgZzyv = shapeRenderer.zzyv();
        com.aspose.words.internal.zzZQ4 zzzq4ZzYzG = shapeRenderer.zzYzG();
        if (zzzq4ZzYzG.isEmpty() && shapeRenderer.zzYzF().isEmpty()) {
            return null;
        }
        if ((shape2.getShapeType() == 75 || shape2.getShapeType() == -2 || shape2.getShapeType() == 201) && !this.zzYjb && !shape2.hasChildNodes() && shape2.getImageData().isLinkOnly() && com.aspose.words.internal.zzZVR.zzWF(shape2.getImageData().getSourceFullName())) {
            return new zzZ8B(shape2.getImageData().getSourceFullName(), shape2.getImageData().zzYW0(), zzzq4ZzYzG, zzgZzyv);
        }
        zzZ8A zzz8aZzZ = zzZ(shape, shapeRenderer, zzye0);
        return new zzZ8B(zzz8aZzZ.zzYVM(), zzz8aZzZ.zzYW0(), zzzq4ZzYzG, zzgZzyv);
    }

    private String zzY(ShapeBase shapeBase, byte[] bArr, int i, int i2, int i3, boolean z) throws Exception {
        this.zzYjc.zzZ(shapeBase, i3, z);
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, "data:");
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzKE.zzWY(i3));
        com.aspose.words.internal.zzZNH.zzU(sb, ";base64,");
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZQB.zzS(bArr, 0, i2));
        return sb.toString();
    }

    private zzZ8B zzZ(GroupShape groupShape, zzYE0 zzye0) throws Exception {
        ShapeRenderer shapeRenderer = groupShape.getShapeRenderer();
        return new zzZ8B(zzZ(groupShape, shapeRenderer, 6, true, zzye0), 6, shapeRenderer.zzYzG(), shapeRenderer.zzyv());
    }

    private zzZ8A zzZ(Shape shape, ShapeRenderer shapeRenderer, zzYE0 zzye0) throws Exception {
        Shape shape2;
        zzZ88 zzz88 = new zzZ88();
        if (shape.hasChildNodes() || zz9(shape)) {
            zzz88.zzYj9 = true;
        }
        if (shape.getShapeType() != 75 && shape.getShapeType() != -2 && shape.getShapeType() != 201) {
            zzz88.zzYj9 = true;
        } else {
            zzZ(shape, shapeRenderer, zzz88, zzye0);
        }
        if (!zzyn(zzz88.zzYj8)) {
            zzz88.zzYVL();
        }
        if (this.zzYja && zzz88.zzYj8 != 5) {
            zzz88.zzYj9 = true;
        }
        if (!zzz88.zzYj9) {
            byte[] imageBytes = zzz88.zzYj7;
            if (imageBytes == null && shape.getImageData() != null) {
                imageBytes = shape.getImageData().getImageBytes();
            }
            byte[] bArr = imageBytes;
            return new zzZ8A(zzZ(shape, bArr, bArr.length, zzz88.zzYj8, zzz88.isImageAvailable(), zzye0.zzXpg), zzz88.zzYj8);
        }
        if (zzz88.zzYj7 != null) {
            shape2 = (Shape) shape.deepClone(false);
            shape2.setShapeAttr(4102, zzz88.zzYj7);
            shapeRenderer = shape2.getShapeRenderer();
        } else {
            shape2 = shape;
        }
        if (com.aspose.words.internal.zzEF.zzVW(zzz88.zzYj8)) {
            zzz88.zzYj8 = 6;
        }
        if (!this.zzYja && zzz88.zzYj8 == 5 && zzq(shape2)) {
            zzZ(shape, 65536, "JPEG images with transparent areas are not supported. The image is converted to PNG.");
            zzz88.zzYj8 = 6;
        }
        if (this.zzYja) {
            zzz88.zzYj8 = 5;
        }
        return new zzZ8A(zzZ(shape, shapeRenderer, zzz88.zzYj8, zzz88.isImageAvailable(), zzye0), zzz88.zzYj8);
    }

    private String zzZ(ShapeBase shapeBase, ShapeRenderer shapeRenderer, int i, boolean z, zzYE0 zzye0) throws Exception {
        int iZzY;
        if (zzye0 != null) {
            int i2 = zzye0.zzXph;
            if (!zzye0.zzXpi && (shapeBase instanceof GroupShape) && (iZzY = zzY((GroupShape) shapeBase, i2)) != Integer.MAX_VALUE) {
                i2 = iZzY;
            }
            ImageSaveOptions imageSaveOptions = new ImageSaveOptions(FileFormatUtil.zzC8(i));
            imageSaveOptions.zzV8(i == 5);
            imageSaveOptions.setResolution(i2);
            imageSaveOptions.setScale(zzye0.zzXpe);
            imageSaveOptions.setUseAntiAliasing(zzye0.zzXpd);
            imageSaveOptions.getMetafileRenderingOptions().setRenderingMode(0);
            if (i == 5) {
                imageSaveOptions.setJpegQuality(Math.min(Float.intBitsToFloat((int) shapeRenderer.zzYzG().getSize()), com.aspose.words.internal.zzZPW.zzYz(shapeRenderer.zzYzG().getSize())) < 256.0f ? 100 : 85);
            }
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            try {
                shapeRenderer.zzZ(zzzor, imageSaveOptions);
                zzzor.getLength();
                return zzZ(shapeBase, zzzor.zziA(), (int) zzzor.getLength(), FileFormatUtil.zzC4(imageSaveOptions.getSaveFormat()), z, zzye0.zzXpg);
            } finally {
                zzzor.close();
            }
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: options");
    }

    private static void zzZ(ShapeBase shapeBase, int i, String str) {
        IWarningCallback warningCallback = shapeBase.getDocument().getWarningCallback();
        if (warningCallback != null) {
            OooO00o.OooO0O0(warningCallback, i, 8, str);
        }
    }

    private static void zzZ(Shape shape, ShapeRenderer shapeRenderer, zzZ88 zzz88, zzYE0 zzye0) throws Exception {
        if (com.aspose.words.internal.zzZ1.zzX(shape.getImageData().getImageBytes())) {
            zzz88.zzYj8 = com.aspose.words.internal.zzEF.zzZU(shape.getImageData().getImageBytes());
        } else if (!com.aspose.words.internal.zzZYD.zzXk(shape.getImageData().getSourceFullName())) {
            zzz88.zzYj9 = true;
        } else {
            byte[] bArrZzYW2 = shape.getImageData().zzYW2();
            zzz88.zzYj7 = bArrZzYW2;
            if (com.aspose.words.internal.zzZ1.zzX(bArrZzYW2)) {
                zzz88.zzYj8 = com.aspose.words.internal.zzEF.zzZU(zzz88.zzYj7);
            } else {
                zzz88.zzYVL();
            }
        }
        if (!zzz88.zzYj9) {
            if (com.aspose.words.internal.zzEF.zzVW(zzz88.zzYj8)) {
                if (zzye0.zzXpj != 2) {
                    zzz88.zzYj9 = true;
                    zzz88.zzYj8 = 6;
                }
            } else if (zzye0.zzXpi) {
                byte[] imageBytes = zzz88.zzYj7;
                if (imageBytes == null) {
                    imageBytes = shape.getImageData().getImageBytes();
                }
                com.aspose.words.internal.zzEG zzegZzO = com.aspose.words.internal.zzEF.zzO(imageBytes, zzz88.zzYj8);
                long size = shapeRenderer.zzYzG().getSize();
                float f = zzye0.zzXpe;
                int i = zzye0.zzXph;
                if (!com.aspose.words.internal.zzZPX.zzD(zzegZzO.getSize(), com.aspose.words.internal.zzSA.zzY(size, f, i, i))) {
                    zzz88.zzYj9 = true;
                }
            }
        }
        if (zzz88.zzYj9 || zzz88.zzYj7 != null) {
            return;
        }
        shape.getImageData().getImageBytes();
    }

    private String zzZ(ShapeBase shapeBase, byte[] bArr, int i, int i2, boolean z, boolean z2) throws Exception {
        if (z2) {
            return zzY(shapeBase, bArr, 0, i, i2, z);
        }
        return zzX(shapeBase, bArr, 0, i, i2, z);
    }
}
