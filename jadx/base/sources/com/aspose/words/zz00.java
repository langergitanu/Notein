package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz00 {
    public static int zzGA(int i) {
        if (i != 0) {
            if (i == 1) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4 && i != 5) {
                return 0;
            }
        }
        return 3;
    }

    public static int zzL(zzHK zzhk) {
        return (int) ((zzhk.getValue() / 60000.0d) * 65536.0d);
    }

    private static void zzP(Shape shape) {
        if (shape.getStroked()) {
            shape.setStroked(false);
        }
        shape.zzYvW().remove(508);
        shape.zzYvW().remove(459);
        shape.zzYvW().remove(462);
        shape.zzYvW().remove(461);
        shape.zzYvW().remove(505);
        shape.zzYvW().remove(471);
        shape.zzYvW().remove(470);
        shape.zzYvW().remove(464);
        shape.zzYvW().remove(467);
        shape.zzYvW().remove(466);
        shape.zzYvW().remove(465);
        shape.zzYvW().remove(469);
        shape.zzYvW().remove(468);
        shape.zzYvW().remove(460);
        shape.zzYvW().remove(452);
        shape.zzYvW().remove(448);
        shape.zzYvW().remove(449);
        shape.zzYvW().remove(4107);
        shape.zzYvW().remove(4109);
        shape.zzYvW().remove(EditingLanguage.SPANISH_GUATEMALA);
        shape.zzYvW().remove(EditingLanguage.FRENCH_SWITZERLAND);
        shape.zzYvW().remove(257);
        shape.zzYvW().remove(StyleIdentifier.COLORFUL_LIST_ACCENT_6);
        shape.zzYvW().remove(StyleIdentifier.COLORFUL_GRID_ACCENT_6);
        shape.zzYvW().remove(256);
        shape.zzYvW().remove(4);
        shape.zzYvW().remove(StyleIdentifier.BIBLIOGRAPHY);
        shape.zzYvW().remove(StyleIdentifier.BOOK_TITLE);
        if (shape.getMarkupLanguage() == 0) {
            shape.zzYvW().remove(4160);
            shape.zzYvW().remove(4161);
            shape.zzYvW().remove(4156);
        }
    }

    private static boolean zzV(zz53 zz53Var) {
        if (zz53Var == null) {
            return false;
        }
        return zz53Var.getRotation() != 0.0d || zz53Var.getExtrusionEnabled() || zz53Var.getShadowEnabled();
    }

    private static ShapeBase zzX(ShapeBase shapeBase, zzYDZ zzydz, boolean z) throws Exception {
        int iZzp;
        double d;
        int iZzp2;
        if (!shapeBase.hasChildNodes()) {
            return null;
        }
        GroupShape groupShape = new GroupShape(shapeBase.getDocument());
        shapeBase.zzYvW().zzZ((zzZS) groupShape.zzYvW(), false);
        boolean z2 = shapeBase.zzY9i().zzZHY() == 10;
        if (z2) {
            zzX(groupShape);
        }
        groupShape.setFlipOrientation(shapeBase.getFlipOrientation());
        groupShape.setShapeAttr(4127, 21600);
        groupShape.setShapeAttr(4128, 21600);
        groupShape.zzHw(shapeBase.zzY9h().zzZyh());
        groupShape.zzHv(shapeBase.zzY9h().zzZyg());
        zzt(groupShape);
        int iZzZa = (int) com.aspose.words.internal.zzZKQ.zzZa(((double) Math.abs(groupShape.zzY9h().zzZyh())) * 1.0058283810530921E-5d);
        int iZzZa2 = (int) com.aspose.words.internal.zzZKQ.zzZa(((double) Math.abs(groupShape.zzY9h().zzZyg())) * 1.0058283810530921E-5d);
        double d2 = 1.0d;
        if (shapeBase.zzY9h().zzZyj() <= 0) {
            if (!com.aspose.words.internal.zzAN.zzZD(shapeBase.getWidth())) {
                iZzp = com.aspose.words.internal.zzSA.zzp(Float.intBitsToFloat((int) shapeBase.zzYzG().getSize()));
                d = 21600.0d / ((double) iZzp);
            }
            d = 1.0d;
        } else if (shapeBase.zzY9h().zzZyj() > iZzZa) {
            iZzp = shapeBase.zzY9h().zzZyj();
            d = 21600.0d / ((double) iZzp);
        } else {
            groupShape.setShapeAttr(4127, Integer.valueOf(shapeBase.zzY9h().zzZyj()));
            d = 1.0d;
        }
        if (shapeBase.zzY9h().zzZyi() > 0) {
            if (shapeBase.zzY9h().zzZyi() > iZzZa2) {
                iZzp2 = shapeBase.zzY9h().zzZyi();
                d2 = 21600.0d / ((double) iZzp2);
            } else {
                groupShape.setShapeAttr(4128, Integer.valueOf(shapeBase.zzY9h().zzZyi()));
            }
        } else if (!com.aspose.words.internal.zzAN.zzL(shapeBase.getHeight(), 0.0d)) {
            iZzp2 = com.aspose.words.internal.zzSA.zzp(com.aspose.words.internal.zzZPW.zzYz(shapeBase.zzYzG().getSize()));
            d2 = 21600.0d / ((double) iZzp2);
        }
        groupShape.zzHw((int) (((double) groupShape.zzY9h().zzZyh()) * d));
        groupShape.zzHv((int) (((double) groupShape.zzY9h().zzZyg()) * d2));
        for (ShapeBase shapeBase2 : shapeBase.getChildNodes(0, false)) {
            if (shapeBase2.zz9I() && z2) {
                zzY(groupShape);
            }
            ShapeBase shapeBaseZzY = zzY(shapeBase2, zzydz, z);
            if (shapeBaseZzY != null) {
                shapeBaseZzY.setLeft(shapeBaseZzY.getLeft() * d);
                shapeBaseZzY.setTop(shapeBaseZzY.getTop() * d2);
                shapeBaseZzY.zzWf(shapeBaseZzY.getWidth() * d);
                shapeBaseZzY.zzWe(shapeBaseZzY.getHeight() * d2);
                zzX(shapeBaseZzY, d, d2);
                groupShape.appendChild(shapeBaseZzY);
            }
        }
        return groupShape;
    }

    public static int zzXQ(long j) {
        if (com.aspose.words.internal.zzZPY.zzD(j, com.aspose.words.internal.zzZPY.zzG(-0.5f, -0.5f))) {
            return 0;
        }
        if (com.aspose.words.internal.zzZPY.zzD(j, com.aspose.words.internal.zzZPY.zzG(0.0f, -0.5f))) {
            return 1;
        }
        if (com.aspose.words.internal.zzZPY.zzD(j, com.aspose.words.internal.zzZPY.zzG(0.5f, -0.5f))) {
            return 2;
        }
        if (com.aspose.words.internal.zzZPY.zzD(j, com.aspose.words.internal.zzZPY.zzG(-0.5f, 0.0f))) {
            return 3;
        }
        if (com.aspose.words.internal.zzZPY.zzD(j, com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f))) {
            return 4;
        }
        if (com.aspose.words.internal.zzZPY.zzD(j, com.aspose.words.internal.zzZPY.zzG(0.5f, 0.0f))) {
            return 5;
        }
        if (com.aspose.words.internal.zzZPY.zzD(j, com.aspose.words.internal.zzZPY.zzG(-0.5f, 0.5f))) {
            return 6;
        }
        if (com.aspose.words.internal.zzZPY.zzD(j, com.aspose.words.internal.zzZPY.zzG(0.0f, 0.5f))) {
            return 7;
        }
        return com.aspose.words.internal.zzZPY.zzD(j, com.aspose.words.internal.zzZPY.zzG(0.5f, 0.5f)) ? 8 : 9;
    }

    private static ShapeBase zzY(ShapeBase shapeBase, ShapeBase shapeBase2) {
        if (shapeBase2 != null) {
            zzYVU.zzj(shapeBase2, shapeBase);
            shapeBase.remove();
            Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(shapeBase2.getDocument(), Document.class);
            if (document != null) {
                document.zzZqk();
            }
        }
        return shapeBase2;
    }

    public static boolean zzZ(ShapeBase shapeBase, int i) {
        if (!shapeBase.isTopLevel()) {
            return false;
        }
        int iZzZHY = shapeBase.zzY9i().zzZHY();
        if (iZzZHY == 13) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return iZzZHY == 8 || iZzZHY == 9 || iZzZHY == 10 || iZzZHY == 11;
    }

    private static void zzt(ShapeBase shapeBase) {
        double dIntValue = ((double) ((Integer) shapeBase.fetchShapeAttr(4146)).intValue()) / 12700.0d;
        double dIntValue2 = ((double) ((Integer) shapeBase.fetchShapeAttr(4144)).intValue()) / 12700.0d;
        double dIntValue3 = ((double) ((Integer) shapeBase.fetchShapeAttr(4143)).intValue()) / 12700.0d;
        double dIntValue4 = ((double) ((Integer) shapeBase.fetchShapeAttr(4145)).intValue()) / 12700.0d;
        if (shapeBase.getWidth() > 0.0d) {
            shapeBase.zzWf(shapeBase.getWidth() + dIntValue3 + dIntValue4);
        } else {
            shapeBase.zzWf(shapeBase.getWidth());
        }
        if (shapeBase.getHeight() > 0.0d) {
            shapeBase.zzWe(shapeBase.getHeight() + dIntValue + dIntValue2);
        } else {
            shapeBase.zzWe(shapeBase.getHeight());
        }
    }

    private static boolean zzu(ShapeBase shapeBase) {
        zzZC0 zzzc0 = (zzZC0) shapeBase.zzY9i();
        return (zzzc0.zzZTd() == null && zzzc0.zzZTc() == null) ? false : true;
    }

    public static boolean zzv(ShapeBase shapeBase) {
        return shapeBase.isTopLevel() && shapeBase.zzY9i().zzZHY() == 13;
    }

    public static ShapeBase zzZ(ShapeBase shapeBase, zzYDZ zzydz, boolean z) throws Exception {
        return zzY(shapeBase, zzY(shapeBase, zzydz, z));
    }

    public static ShapeBase zzY(ShapeBase shapeBase, zzYDZ zzydz, boolean z) throws Exception {
        shapeBase.getMarkupLanguage();
        zz1X.zzM(shapeBase);
        if (zzY(shapeBase.zzYvW())) {
            shapeBase.zzYvW().zzQ(508, Boolean.TRUE);
        }
        switch (shapeBase.zzY9i().zzZHY()) {
            case 0:
            case 1:
            case 8:
                return new zz1H().zzS((Shape) shapeBase);
            case 2:
                OoxmlSaveOptions ooxmlSaveOptions = (OoxmlSaveOptions) com.aspose.words.internal.zzZKW.zzZ(zzydz.zzXpa, OoxmlSaveOptions.class);
                if (((ooxmlSaveOptions != null && ooxmlSaveOptions.zzYr2()) || z) && !zzu(shapeBase)) {
                    return new zz3S().zzZ((Shape) shapeBase, zzydz);
                }
                return zzZ(shapeBase, zzydz);
            case 3:
            case 9:
            case 10:
                return zzX(shapeBase, zzydz, z);
            case 4:
            default:
                return null;
            case 5:
            case 6:
            case 7:
            case 12:
                return zzZ(shapeBase, zzydz);
            case 11:
                return shapeBase.zzY9n();
            case 13:
                if (zzY3X.zzS(shapeBase, zzydz.zzXpa.getImlRenderingMode() == 1) && shapeBase.zzY9n() != null && shapeBase.zzY9n().getMarkupLanguage() == 0) {
                    return zzZ(shapeBase.zzY9n(), zzydz);
                }
                return zzZ(shapeBase, zzydz);
        }
    }

    private static ShapeBase zzZ(ShapeBase shapeBase, zzYDZ zzydz) throws Exception {
        Shape shape = new Shape(shapeBase.getDocument());
        shape.zzS((zzYC3) shapeBase.zzYvW().zzbn());
        zzt(shape);
        shape.zzZ((zzYEF) shapeBase.zzZYh().zzbn());
        shape.setShapeType(75);
        if (shapeBase.zzY9i().zzZHY() == 12) {
            shape.setName(com.aspose.words.internal.zzZYD.zzXk(shapeBase.getName()) ? shapeBase.getName() : shape.getName());
            shape.setAlternativeText(shapeBase.getAlternativeText());
            shape.setAspectRatioLocked(shapeBase.getAspectRatioLocked());
        }
        zzP(shape);
        ShapeRenderer shapeRenderer = shapeBase.getShapeRenderer();
        shape.getImageData().setImageBytes(zzZ(shapeRenderer, zzydz));
        if (zzV(shapeBase.zzY9i())) {
            shape.zzZ1(shapeRenderer.zzYzG());
        }
        return shape;
    }

    public static byte[] zzZ(ShapeRenderer shapeRenderer, zzYDZ zzydz) throws Exception {
        ImageSaveOptions imageSaveOptions = new ImageSaveOptions(101);
        imageSaveOptions.zzV8(false);
        imageSaveOptions.setUseAntiAliasing(zzydz.zzXpa.getUseAntiAliasing());
        if (((HtmlSaveOptions) com.aspose.words.internal.zzZKW.zzZ(zzydz.zzXpa, HtmlSaveOptions.class)) != null) {
            imageSaveOptions.setResolution(r3.getImageResolution());
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            shapeRenderer.zzZ(zzzor, imageSaveOptions);
            zzzor.zzH(0L);
            return com.aspose.words.internal.zzZYQ.zzZX(zzzor);
        } finally {
            zzzor.close();
        }
    }

    private static void zzY(GroupShape groupShape) {
        Shape shape = new Shape(groupShape.getDocument(), 75);
        Double dValueOf = Double.valueOf(21600.0d);
        shape.setShapeAttr(4131, dValueOf);
        shape.setShapeAttr(4132, dValueOf);
        shape.setShapeAttr(447, Boolean.TRUE);
        groupShape.appendChild(shape);
    }

    private static boolean zzY(zzYC3 zzyc3) {
        return zzyc3.contains(EditingLanguage.SPANISH_GUATEMALA) || zzyc3.contains(EditingLanguage.FRENCH_SWITZERLAND) || zzyc3.contains(4109) || zzyc3.contains(4107);
    }

    public static boolean zzZ(ShapeBase shapeBase, DocumentVisitor documentVisitor) throws Exception {
        ShapeBase shapeBaseZzY9n = shapeBase.zzY9n();
        if (shapeBaseZzY9n == null) {
            return false;
        }
        shapeBaseZzY9n.zzZ(shapeBase.zzZYh());
        shapeBaseZzY9n.setZOrder(shapeBase.getZOrder());
        if (com.aspose.words.internal.zzZYD.zzXk(shapeBase.getHRef()) && !com.aspose.words.internal.zzZYD.zzXk(shapeBaseZzY9n.getHRef())) {
            shapeBaseZzY9n.setHRef(shapeBase.getHRef());
        }
        zzYVU.zzj(shapeBaseZzY9n, shapeBase);
        shapeBaseZzY9n.accept(documentVisitor);
        shapeBase.remove();
        return true;
    }

    private static void zzX(GroupShape groupShape) {
        groupShape.zzZ56();
        groupShape.removeShapeAttr(896);
    }

    private static void zzX(ShapeBase shapeBase, double d, double d2) {
        double rotation = shapeBase.getRotation();
        if ((rotation < 45.0d || rotation >= 135.0d) && (rotation < 225.0d || rotation >= 315.0d)) {
            return;
        }
        long jZzB = com.aspose.words.internal.zzJ6.zzB(new com.aspose.words.internal.zzZQ4((float) shapeBase.getLeft(), (float) shapeBase.getTop(), (float) shapeBase.getWidth(), (float) shapeBase.getHeight()));
        shapeBase.zzWf((shapeBase.getWidth() / d) * d2);
        shapeBase.zzWe((shapeBase.getHeight() / d2) * d);
        long jZzB2 = com.aspose.words.internal.zzJ6.zzB(new com.aspose.words.internal.zzZQ4((float) shapeBase.getLeft(), (float) shapeBase.getTop(), (float) shapeBase.getWidth(), (float) shapeBase.getHeight()));
        double dIntBitsToFloat = Float.intBitsToFloat((int) jZzB) - Float.intBitsToFloat((int) jZzB2);
        double dZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzB) - com.aspose.words.internal.zzZPY.zzYC(jZzB2);
        shapeBase.setLeft(shapeBase.getLeft() + dIntBitsToFloat);
        shapeBase.setTop(shapeBase.getTop() + dZzYC);
    }
}
