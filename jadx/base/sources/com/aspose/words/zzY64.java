package com.aspose.words;

import com.aspose.words.internal.C22243OooO0Oo;

/* JADX INFO: loaded from: classes6.dex */
final class zzY64 {
    private zzZ91 zzXnk;
    private zzYCD zzYuE;
    private com.aspose.words.internal.zzG zzp2;

    private zzY64(zzZ91 zzz91, zzYCD zzycd) throws Exception {
        this.zzXnk = zzz91;
        this.zzYuE = zzycd;
        zzZNw();
    }

    private com.aspose.words.internal.zzZQ4 zzW(int i, com.aspose.words.internal.zzZQ4 zzzq4) {
        return new com.aspose.words.internal.zzZQ4(zzZ(zzzq4, com.aspose.words.internal.zzZPW.zzG(this.zzXnk.getWidth(), this.zzXnk.getHeight()), i, this.zzYuE.getShape().getTextBox().getLayoutFlow()), zzzq4.getSize());
    }

    private Object zzX(zzYCD zzycd) {
        zzZ91 zzz91 = this.zzXnk;
        if (zzz91 == null || !zzz91.zzY(zzycd.getShape())) {
            return null;
        }
        Shape shape = zzycd.getShape();
        shape.getNodeType();
        long jZzXW8 = zzycd.zzYad().zzXW8();
        int i = (int) jZzXW8;
        float fMax = Math.max(1.0f, Float.intBitsToFloat(i));
        float fMax2 = Math.max(0.0f, com.aspose.words.internal.zzZPW.zzYz(jZzXW8));
        boolean zZzZj = zzZj(shape);
        boolean zZzZk = zzZk(shape);
        this.zzXnk.setWidth(fMax);
        this.zzXnk.zzk(fMax2);
        this.zzXnk.zzV9(zZzZj);
        Object objZzZ = this.zzXnk.zzZ(shape);
        long jZzZE = zzycd.zzYad().zzXW7().zzZE();
        if (!zzycd.getShape().getDocument().zzZpV().zzYVg.getDoNotVertAlignInTxbx()) {
            jZzZE = zzW(zzycd.getShape().getTextBox().zzZyk(), new com.aspose.words.internal.zzZQ4(zzycd.zzYad().zzXW7().zzZE(), jZzXW8)).zzZE();
        }
        zzycd.zzYad().zzs(jZzZE, com.aspose.words.internal.zzZPW.zzG(zZzZj ? this.zzXnk.getWidth() : Float.intBitsToFloat(i), zZzZk ? this.zzXnk.getHeight() : com.aspose.words.internal.zzZPW.zzYz(jZzXW8)));
        return objZzZ;
    }

    private long zzXWb() {
        long jZzPE = this.zzYuE.zzYad().zzPE(false);
        zzY62 zzy62ZzXW9 = this.zzYuE.zzYad().zzXW9();
        float fIntBitsToFloat = Float.intBitsToFloat((int) jZzPE) + zzy62ZzXW9.zzX3Q + zzy62ZzXW9.zzX3O;
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(jZzPE) + zzy62ZzXW9.zzX3P + zzy62ZzXW9.zzX3N;
        Shape shape = this.zzYuE.getShape();
        if (!shape.isTopLevel()) {
            fIntBitsToFloat = (float) ((shape.getWidth() / ((double) Float.intBitsToFloat((int) shape.zzYzG().getSize()))) * ((double) fIntBitsToFloat));
            fZzYz = (float) ((shape.getHeight() / ((double) com.aspose.words.internal.zzZPW.zzYz(shape.zzYzG().getSize()))) * ((double) fZzYz));
        }
        return com.aspose.words.internal.zzZPW.zzG(fIntBitsToFloat, fZzYz);
    }

    public static long zzY(zzZ91 zzz91, zzYCD zzycd) throws Exception {
        return new zzY64(zzz91, zzycd).zzXWb();
    }

    public static com.aspose.words.internal.zzG zzZ(zzZ91 zzz91, zzYCD zzycd) throws Exception {
        return new zzY64(zzz91, zzycd).zzp2;
    }

    private void zzZNw() throws Exception {
        com.aspose.words.internal.zzG zzgZzZ;
        zzYCD zzycd = this.zzYuE;
        zzZ91 zzz91 = this.zzXnk;
        if (zzz91 == null || !zzz91.zzY(zzycd.getShape()) || (zzgZzZ = zzZ(zzycd, zzX(zzycd))) == null) {
            return;
        }
        zzgZzZ.zzW(zzZ(zzycd.zzYad()));
        zzgZzZ.zzZ(com.aspose.words.internal.zzP8.zzM(zzY(zzycd)));
        this.zzp2 = zzgZzZ;
    }

    private static Shading zzZi(Shape shape) throws Exception {
        if (shape.getFilled()) {
            return (shape.zzY9s() || !shape.zzY9J().zz8Q().isEmpty()) ? shape.zzY9J().zzX(null) : zzYCL.zzZI(com.aspose.words.internal.zzPV.zzKa);
        }
        return null;
    }

    private boolean zzZj(Shape shape) {
        return zzY(shape, this.zzXnk);
    }

    private boolean zzZk(Shape shape) {
        return zzZ(shape, this.zzXnk);
    }

    public static boolean zzY(Shape shape, zzZ91 zzz91) {
        return shape.getTextBox().getTextBoxWrapMode() == 2 && !zzY(zzz91);
    }

    public static boolean zzZ(Shape shape, zzZ91 zzz91) {
        return shape.zzYbk() && !zzY(zzz91);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzZKJ zzZ(zzYCD zzycd) {
        float internalMarginTop;
        double internalMarginBottom;
        Shape shape = zzycd.getShape();
        TextBox textBox = shape.getTextBox();
        int layoutFlow = textBox.getLayoutFlow();
        if (layoutFlow == 1) {
            internalMarginTop = (float) textBox.getInternalMarginTop();
            internalMarginBottom = textBox.getInternalMarginBottom();
        } else if (layoutFlow == 2) {
            internalMarginTop = (float) textBox.getInternalMarginBottom();
            internalMarginBottom = textBox.getInternalMarginTop();
        } else if (layoutFlow != 3) {
            internalMarginTop = (float) textBox.getInternalMarginLeft();
            internalMarginBottom = textBox.getInternalMarginRight();
        }
        float f = (float) internalMarginBottom;
        for (Paragraph paragraph : shape.getChildNodes(8, false)) {
            float fZz8S = paragraph.zzZYj().zz5y().zz8S() + ((float) paragraph.zzZYj().zz5y().getDistanceFromText());
            if (fZz8S > internalMarginTop) {
                internalMarginTop = fZz8S;
            }
            float fZz8S2 = paragraph.zzZYj().zz5x().zz8S() + ((float) paragraph.zzZYj().zz5x().getDistanceFromText());
            if (fZz8S2 > f) {
                f = fZz8S2;
            }
        }
        float strokeWeight = (float) (shape.getStrokeWeight() + 5.0d);
        return new zzZKJ(internalMarginTop + strokeWeight, f + strokeWeight);
    }

    private static com.aspose.words.internal.zzZQ4 zzY(zzYCD zzycd) {
        zzZKJ zzzkjZzZ = zzZ(zzycd);
        Shape shape = zzycd.getShape();
        float strokeWeight = shape.getStrokeWeight() <= 1.0d ? ((float) shape.getStrokeWeight()) / 2.0f : 0.0f;
        long jZzPE = zzycd.zzYad().zzPE(true);
        float f = (-zzzkjZzZ.zzZm()) - strokeWeight;
        float f2 = 0.0f - strokeWeight;
        float f3 = strokeWeight * 2.0f;
        return new com.aspose.words.internal.zzZQ4(f, f2, Float.intBitsToFloat((int) jZzPE) + zzzkjZzZ.zzZm() + zzzkjZzZ.zzkw() + f3, com.aspose.words.internal.zzZPW.zzYz(jZzPE) + f3);
    }

    private static boolean zzY(zzZ91 zzz91) {
        return zzz91 != null && zzz91.zzYW9();
    }

    private com.aspose.words.internal.zzG zzZ(zzYCD zzycd, Object obj) throws Exception {
        Shading shadingZzZi = zzZi(zzycd.getShape());
        long jZzZE = zzycd.zzYad().zzXW7().zzZE();
        long jZzZE2 = zzycd.zzYad().zzXW5().zzZE();
        long jZzPE = zzycd.zzYad().zzPE(true);
        zzZ91 zzz91 = this.zzXnk;
        return zzz91.zzZ(obj, com.aspose.words.internal.zzZPW.zzG(zzz91.getWidth(), this.zzXnk.getHeight()), com.aspose.words.internal.zzZPY.zzYC(jZzZE) + (com.aspose.words.internal.zzZPW.zzYz(jZzPE) - com.aspose.words.internal.zzZPY.zzYC(jZzZE2)), shadingZzZi, false);
    }

    private static long zzZ(com.aspose.words.internal.zzZQ4 zzzq4, long j, int i, int i2) {
        float fZzYz;
        long size = zzzq4.getSize();
        long jZzZE = zzzq4.zzZE();
        if (com.aspose.words.internal.zzZPW.zzYz(size) <= com.aspose.words.internal.zzZPW.zzYz(j)) {
            return jZzZE;
        }
        switch (i) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                fZzYz = 0.0f;
                break;
            case 1:
                fZzYz = (com.aspose.words.internal.zzZPW.zzYz(size) - com.aspose.words.internal.zzZPW.zzYz(j)) * 0.5f;
                break;
            case 2:
                fZzYz = com.aspose.words.internal.zzZPW.zzYz(size) - com.aspose.words.internal.zzZPW.zzYz(j);
                break;
            default:
                throw new IllegalArgumentException();
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzZE) + fZzYz, com.aspose.words.internal.zzZPY.zzYC(jZzZE));
            }
            if (i2 != 3 && i2 != 5) {
                return C22243OooO0Oo.OooO00o(fZzYz, Float.intBitsToFloat((int) jZzZE), jZzZE);
            }
        }
        return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzZE) - fZzYz, com.aspose.words.internal.zzZPY.zzYC(jZzZE));
    }

    private static com.aspose.words.internal.zzP9 zzZ(zzY61 zzy61) {
        int iZzXW6 = zzy61.zzXW6();
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzX(iZzXW6, 1);
        long jZzZE = zzy61.zzXW5().zzZE();
        long jZzPE = zzy61.zzPE(true);
        if (iZzXW6 == 90) {
            zzp9.zzY(com.aspose.words.internal.zzZPW.zzYz(jZzPE), 0.0f, 1);
        } else if (iZzXW6 == 270) {
            zzp9.zzY(0.0f, Float.intBitsToFloat((int) jZzPE), 1);
        }
        zzp9.zzY(Float.intBitsToFloat((int) jZzZE), com.aspose.words.internal.zzZPY.zzYC(jZzZE), 1);
        return zzp9;
    }
}
