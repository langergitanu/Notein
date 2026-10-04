package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQ5 {
    private zzZB7 zzYDL;
    private Field zzZz7;

    public static class zzZ {
        private double zzXA;
        private double zzXy;

        public zzZ(double d, double d2) {
            this.zzXy = d;
            this.zzXA = d2;
        }

        public final double getHeight() {
            return this.zzXA;
        }

        public final double getWidth() {
            return this.zzXy;
        }

        public final zzZ zzX9(double d) {
            return new zzZ(this.zzXy * d, this.zzXA * d);
        }
    }

    private zzZQ5(Field field, zzZB7 zzzb7) {
        this.zzZz7 = field;
        this.zzYDL = zzzb7;
    }

    private static void zzC(Shape shape) {
        shape.zzWf(216.0d);
        shape.zzWe(216.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzZP6 zzU(Field field) throws Exception {
        return new zzZQ5(field, (zzZB7) field).zzZg8();
    }

    private static zzZ zzV(ParagraphFormat paragraphFormat, zzZ zzz) {
        return zzZ(zzz, paragraphFormat.zzZrZ());
    }

    private static zzZ zzW(ParagraphFormat paragraphFormat, zzZ zzz) {
        return zzY(zzz, paragraphFormat.zzZs0());
    }

    private zzZ zzX(zzZ zzz) {
        Paragraph parentParagraph = this.zzZz7.getStart().getParentParagraph();
        zzYMX zzymxZzZYj = parentParagraph.zzZYj();
        return !zzymxZzZYj.zzYpF() ? zzz : zzymxZzZYj.zzVE(1310) ? zzZ(parentParagraph.getParagraphFormat(), zzz) : zzY(parentParagraph.getParagraphFormat(), zzz);
    }

    private zzZ zzY(zzZ zzz) {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(this.zzZz7.getStart().getParentParagraph().getParentNode(), Shape.class);
        return shape == null ? zzz : zzZ(zzz, shape.getWidth(), shape.getHeight());
    }

    private zzZ zzYh(byte[] bArr) throws Exception {
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(bArr);
        return zzZ(new zzZ(zzegZzZT.getWidthPoints(), zzegZzZT.getHeightPoints()));
    }

    private zzZ zzZ(zzZ zzz) {
        return zzV(zzW(zzX(zzY(zzz))));
    }

    private zzZP6 zzZg8() throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzYDL.getSourceFullName())) {
            return new zzZP2(this.zzZz7, "Error! Filename not specified.");
        }
        Shape shape = new Shape(this.zzZz7.getStart().getDocument(), 75);
        zzC(shape);
        shape.setWrapType(0);
        shape.getImageData().setSourceFullName(this.zzYDL.getSourceFullName());
        byte[] bArrZzYW2 = shape.getImageData().zzYW2();
        if (bArrZzYW2 != null) {
            zzZ zzzZzYh = zzYh(bArrZzYW2);
            shape.zzWf(zzzZzYh.getWidth());
            shape.zzWe(zzzZzYh.getHeight());
            if (!this.zzYDL.isLinked()) {
                try {
                    shape.getImageData().setImageBytes(bArrZzYW2);
                } catch (com.aspose.words.internal.zzX8 unused) {
                    if (this.zzZz7.zzZgs()) {
                        return new zzZP4(this.zzZz7);
                    }
                    zzC(shape);
                }
            }
        } else if (!this.zzYDL.isLinked()) {
            return new zzZP2(this.zzZz7, "Error! Filename not specified.");
        }
        return new zzZP5(this.zzZz7, new zzYW7(new zzYWB(shape, shape)));
    }

    private zzZ zzV(zzZ zzz) {
        Section section = (Section) this.zzZz7.getStart().getAncestor(2);
        return zzZ(zzz, section.getPageSetup().zzYRX(), section.getPageSetup().zzYRW());
    }

    private zzZ zzW(zzZ zzz) {
        Cell cellZzZex = this.zzZz7.getStart().getParentParagraph().zzZex();
        if (cellZzZex == null || cellZzZex.getParentRow().getParentTable().getAllowAutoFit()) {
            return zzz;
        }
        CellFormat cellFormat = cellZzZex.getCellFormat();
        return zzY(zzz, (cellFormat.getWidth() - cellFormat.getLeftPadding()) - cellFormat.getRightPadding());
    }

    private static zzZ zzY(ParagraphFormat paragraphFormat, zzZ zzz) {
        int iZzYpA = paragraphFormat.zzYpA();
        if (iZzYpA != 0) {
            if (iZzYpA == 1) {
                return zzV(paragraphFormat, zzz);
            }
            if (iZzYpA != 2) {
                throw new IllegalArgumentException();
            }
        }
        return zzz;
    }

    private static zzZ zzZ(ParagraphFormat paragraphFormat, zzZ zzz) {
        int iZzYpA = paragraphFormat.zzYpA();
        if (iZzYpA != 0) {
            if (iZzYpA == 1) {
                return zzX(paragraphFormat, zzz);
            }
            if (iZzYpA != 2) {
                throw new IllegalArgumentException();
            }
        }
        return zzW(paragraphFormat, zzz);
    }

    private static zzZ zzY(zzZ zzz, double d) {
        return zzz.getWidth() < d ? zzz : zzz.zzX9(d / zzz.getWidth());
    }

    private static zzZ zzX(ParagraphFormat paragraphFormat, zzZ zzz) {
        return zzZ(zzz, paragraphFormat.zzZs0(), paragraphFormat.zzZrZ());
    }

    private static zzZ zzZ(zzZ zzz, double d) {
        return zzz.getHeight() < d ? zzz : zzz.zzX9(d / zzz.getHeight());
    }

    private static zzZ zzZ(zzZ zzz, double d, double d2) {
        return (zzz.getWidth() >= d || zzz.getHeight() >= d2) ? zzz.zzX9(Math.min(d / zzz.getWidth(), d2 / zzz.getHeight())) : zzz;
    }
}
