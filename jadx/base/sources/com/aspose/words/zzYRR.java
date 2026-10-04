package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRR {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("copy-of", "class", "placeholder", "user-transformed", "rel-height", "rel-width", "text-box", "image", "object-ole", "object", "applet", "contour-path", "contour-polygon", "floating-frame", "glue-point", "image-map", "plugin", "event-listeners", "table");

    private static boolean zz4(Shape shape) {
        return com.aspose.words.internal.zzAN.zzZD(shape.getHeight()) || com.aspose.words.internal.zzAN.zzZD(shape.getWidth());
    }

    private static boolean zz5(Shape shape) {
        return (com.aspose.words.internal.zzAN.zzZD(shape.getHeight()) && com.aspose.words.internal.zzAN.zzZD(shape.getWidth())) ? false : true;
    }

    private static boolean zz6(Shape shape) {
        return (com.aspose.words.internal.zzAN.zzZD(shape.getHeight()) || com.aspose.words.internal.zzAN.zzZD(shape.getWidth())) && shape.zzYvW().zzPk(190) == null;
    }

    public static void zzX(zzYQ7 zzyq7, zzYC3 zzyc3) {
        zzYRL zzyrl = (zzYRL) zzyq7.zzYuS().zzY(zzyq7.zzYuP(), "graphic", zzyq7.zzYuO(), true);
        if (zzyrl == null || zzyrl.zzYvW() == null) {
            return;
        }
        zzyrl.zzYvW().zzY(zzyc3);
    }

    private static void zzY(Shape shape, zzYRL zzyrl) throws Exception {
        ImageSize imageSize = shape.getImageData().getImageSize();
        if (zzX(shape, zzyrl)) {
            return;
        }
        shape.zzYvW().zzQ(StyleIdentifier.COLORFUL_GRID_ACCENT_6, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zzyrl.zzYvV() / imageSize.getWidthPoints())));
        shape.zzYvW().zzQ(256, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zzyrl.zzYvU() / imageSize.getHeightPoints())));
        shape.zzYvW().zzQ(StyleIdentifier.COLORFUL_LIST_ACCENT_6, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zzyrl.zzYvT() / imageSize.getWidthPoints())));
        shape.zzYvW().zzQ(257, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zzyrl.zzYvS() / imageSize.getHeightPoints())));
    }

    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYEF zzyef) throws Exception {
        Shape shape = new Shape(zzyq7.getDocument());
        zzYC3 zzyc3ZzYvW = shape.zzYvW();
        zzyc3ZzYvW.zzQ(508, Boolean.FALSE);
        zzyc3ZzYvW.remove(459);
        if (com.aspose.words.internal.zzZYD.zzXk(zzyq7.getHRef())) {
            shape.setHRef(zzyq7.getHRef());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzyq7.getTarget())) {
            shape.setTarget(zzyq7.getTarget());
        }
        zzyq7.zzE5(null);
        zzYC3 zzyc3Zzr = zzr(zzyq7);
        zzYRL zzyrl = (zzYRL) zzyq7.zzYuS().zzY(zzyq7.zzYuP(), "graphic", zzyq7.zzYuO(), true);
        zzX(zzyq7, zzyc3ZzYvW);
        if (zzyef != null) {
            zzyef.zzY(shape.zzZYh());
        }
        zzZ(zzyq7, compositeNode, shape, zzyc3Zzr);
        zzyc3Zzr.zzY(zzyc3ZzYvW);
        if (zzyrl != null && !shape.getStroked() && shape.zzY9o() && zzyrl.zzYvh().zzYy4() && !zzyc3ZzYvW.contains(462)) {
            zzZ(zzyrl.zzYvh(), zzyc3ZzYvW);
        }
        zzZ(shape, zzyrl);
        if (((Double) zzyc3ZzYvW.zzPj(4131)).doubleValue() == 0.0d) {
            shape.getTextBox().setTextBoxWrapMode(2);
        }
        if (!shape.isImage() || (shape.getParentNode() instanceof GroupShape) || shape.isInline() || shape.zzYvW().zzPk(EditingLanguage.ARABIC_LIBYA) != null) {
            return;
        }
        shape.setWrapType(2);
    }

    private static zzYC3 zzr(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzYC3 zzyc3 = new zzYC3();
        zzyq7.zzZ(zzyq9ZzYuT, zzyc3, "frame");
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq7, zzyc3, "frame")) {
                int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
                if (iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3 || iZzTP == 4 || iZzTP == 5) {
                    zzyq7.zzZ(256, false, "frame");
                } else {
                    zzyq7.zzYi("frame", zzyq9ZzYuT.getLocalName());
                }
            }
        }
        return zzyc3;
    }

    private static int zzrX(int i) {
        if (i == 3) {
            return 1;
        }
        if (i == 10) {
            return 4;
        }
        if (i == 21) {
            return 1;
        }
        switch (i) {
            case 14:
                return 3;
            case 15:
                return 2;
            case 16:
                return 4;
            default:
                return 0;
        }
    }

    private static boolean zzX(Shape shape, zzYRL zzyrl) throws Exception {
        return zzX(zzyrl) || zz4(shape) || !shape.zzZjT() || !zz5(shape);
    }

    private static boolean zzX(zzYRL zzyrl) {
        if (zzyrl != null) {
            return com.aspose.words.internal.zzAN.zzZD(zzyrl.zzYvV()) && com.aspose.words.internal.zzAN.zzZD(zzyrl.zzYvU()) && com.aspose.words.internal.zzAN.zzZD(zzyrl.zzYvS()) && com.aspose.words.internal.zzAN.zzZD(zzyrl.zzYvT());
        }
        return true;
    }

    private static void zzY(zzYQ7 zzyq7, CompositeNode compositeNode, Shape shape) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        if (zzyq7.zzYuz()) {
            zzyq9ZzYuT.zzk();
            return;
        }
        zzyq7.zzS8(true);
        shape.setShapeType(202);
        zzYP6.zzZ(zzyq7, compositeNode, shape);
        zzyq7.zzS8(false);
    }

    private static void zzZ(zzYTH zzyth, zzYC3 zzyc3) {
        zzYTJ zzytjZzYy8 = zzyth.zzYy8();
        zzyc3.zzQ(508, Boolean.TRUE);
        zzyc3.zzQ(448, zzytjZzYy8.zzZy());
        zzyc3.zzQ(461, Integer.valueOf(zzrX(zzytjZzYy8.getLineStyle())));
        zzyc3.zzQ(459, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(zzytjZzYy8.zzYyc() * 28.34645669291339d)));
    }

    public static void zzZ(Shape shape, zzYRL zzyrl) throws Exception {
        if (shape.zzYvW().zzPk(4) != null) {
            return;
        }
        if (shape.getRelativeVerticalPosition() == 3) {
            shape.setTop(-shape.getTop());
        }
        if (shape.getStroked()) {
            double strokeWeight = shape.getStrokeWeight();
            shape.setLeft(shape.getLeft() + strokeWeight);
            shape.setTop(shape.getTop() + strokeWeight);
            double d = strokeWeight * 2.0d;
            double width = shape.getWidth() < d ? 0.0d : shape.getWidth() - d;
            double height = shape.getHeight() >= d ? shape.getHeight() - d : 0.0d;
            shape.zzWf(width);
            shape.zzWe(height);
        }
        if (zz6(shape)) {
            shape.zzYvW().zzQ(190, Boolean.TRUE);
        }
        zzY(shape, zzyrl);
    }

    private static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, Shape shape, zzYC3 zzyc3) throws Exception {
        if ((compositeNode instanceof Shape) || (compositeNode instanceof Cell)) {
            return;
        }
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("frame")) {
            if (!zzyq7.zzR(zzyc3)) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 6:
                        zzY(zzyq7, compositeNode, shape);
                        break;
                    case 7:
                        if (shape.getShapeType() != -2) {
                            shape.setShapeType(75);
                        }
                        zzYTL.zzZ(zzyq7, compositeNode, shape);
                        break;
                    case 8:
                        shape.setShapeType(-2);
                        zzYTL.zzZ(zzyq7, compositeNode, shape);
                        break;
                    case 9:
                        new zzYQS(zzyq7).zzZ(zzyq7, compositeNode, shape);
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        zzyq7.zzZ(1, true, "frame");
                        break;
                    default:
                        zzyq9ZzYuT.zzk();
                        break;
                }
            }
        }
    }
}
