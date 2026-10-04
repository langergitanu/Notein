package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY61 {
    private int zzX3J;
    private com.aspose.words.internal.zzZQ4 zzX3K;
    private com.aspose.words.internal.zzZQ4 zzX3L;
    private zzY62 zzX3M;

    public zzY61(Shape shape, zzYBX zzybx, zzYC8 zzyc8) {
        com.aspose.words.internal.zzZQ4 zzzq4 = com.aspose.words.internal.zzZQ4.zz2T;
        this.zzX3L = zzzq4;
        this.zzX3K = zzzq4;
        this.zzX3J = 0;
        this.zzX3J = zzX(shape);
        zzZ(shape, zzybx, zzyc8);
    }

    private long zzN(long j, boolean z) {
        return (z && zzXWa()) ? com.aspose.words.internal.zzZPW.zzG(com.aspose.words.internal.zzZPW.zzYz(j), Float.intBitsToFloat((int) j)) : j;
    }

    private static com.aspose.words.internal.zzZQ4 zzV(com.aspose.words.internal.zzZQ4 zzzq4, float f, float f2) {
        return new com.aspose.words.internal.zzZQ4(zzzq4.getX() / f, zzzq4.getY() / f2, zzzq4.getWidth() / f, zzzq4.getHeight() / f2);
    }

    public static int zzX(zzZ92 zzz92) {
        int textboxLayoutFlow_ITextBox = zzz92.getTextboxLayoutFlow_ITextBox();
        if (textboxLayoutFlow_ITextBox == 1) {
            return 90;
        }
        if (textboxLayoutFlow_ITextBox != 2) {
            return (textboxLayoutFlow_ITextBox == 3 || textboxLayoutFlow_ITextBox == 5) ? 90 : 0;
        }
        return 270;
    }

    private boolean zzXWa() {
        return this.zzX3J != 0;
    }

    private void zzZ(Shape shape, zzYBX zzybx, zzYC8 zzyc8) {
        float fZzOf;
        float fZzOc;
        float fZzY9c = shape.zzY9c();
        float fZzY9b = shape.zzY9b();
        com.aspose.words.internal.zzZQ4 zzzq4ZzY8Z = zzyc8.zzY8Z();
        float strokeWeight = (float) shape.getStrokeWeight();
        if (!shape.getStroked()) {
            strokeWeight = 0.0f;
        }
        float f = strokeWeight * 0.5f;
        com.aspose.words.internal.zzZQ4 zzzq4ZzV = zzV(zzzq4ZzY8Z, fZzY9c, fZzY9b);
        if (zzybx.zzY8z() != null) {
            fZzOf = zzybx.zzY8z().zzOf();
            fZzOc = zzybx.zzY8z().zzOc();
        } else {
            fZzOf = 1.0f;
            fZzOc = 1.0f;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) zzyc8.zzY8Y()) * fZzOf;
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(zzyc8.zzY8Y()) * fZzOc;
        float internalMarginLeft = ((float) shape.getTextBox().getInternalMarginLeft()) + f;
        float internalMarginTop = ((float) shape.getTextBox().getInternalMarginTop()) + f;
        float internalMarginRight = ((float) shape.getTextBox().getInternalMarginRight()) + f;
        float internalMarginBottom = ((float) shape.getTextBox().getInternalMarginBottom()) + f;
        float f2 = (fIntBitsToFloat - internalMarginLeft) - internalMarginRight;
        float f3 = (fZzYz - internalMarginTop) - internalMarginBottom;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        float fZzZm = (zzzq4ZzV.zzZm() * f2) + internalMarginLeft;
        float fZzkw = (zzzq4ZzV.zzkw() * f2) + internalMarginLeft;
        float fZzZo = (zzzq4ZzV.zzZo() * f3) + internalMarginTop;
        float fZzZn = (zzzq4ZzV.zzZn() * f3) + internalMarginTop;
        zzZ(shape, fZzZm, fZzZo, fZzkw, fZzZn, zzyc8);
        float f4 = fIntBitsToFloat == 0.0f ? 1.0f : fZzY9c / fIntBitsToFloat;
        float f5 = fZzYz != 0.0f ? fZzY9b / fZzYz : 1.0f;
        long jZzG = com.aspose.words.internal.zzZPY.zzG(fZzZm * f4, fZzZo * f5);
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(fZzkw * f4, fZzZn * f5);
        int iZzYbm = shape.zzYbm();
        int iZzYbl = shape.zzYbl();
        this.zzX3L = zzZ(com.aspose.words.internal.zzJ6.zzU(new long[]{zzybx.zzZ(jZzG, zzZ5I.zzW(jZzG, iZzYbm, iZzYbl), true), zzybx.zzZ(jZzG2, zzZ5I.zzW(jZzG2, iZzYbm, iZzYbl), true)}), shape);
        if (zzybx.zzY8z() != null) {
            this.zzX3L = zzybx.zzY8z().zzO(this.zzX3L);
        }
    }

    public final long zzPE(boolean z) {
        return zzN(this.zzX3K.getSize(), z);
    }

    public final com.aspose.words.internal.zzZQ4 zzXW5() {
        return this.zzX3K;
    }

    public final int zzXW6() {
        return this.zzX3J;
    }

    public final com.aspose.words.internal.zzZQ4 zzXW7() {
        return this.zzX3L;
    }

    public final long zzXW8() {
        return zzN(this.zzX3L.getSize(), true);
    }

    public final zzY62 zzXW9() {
        return this.zzX3M;
    }

    public final void zzs(long j, long j2) {
        this.zzX3K = new com.aspose.words.internal.zzZQ4(j, zzN(j2, true));
    }

    private void zzZ(Shape shape, float f, float f2, float f3, float f4, zzYC8 zzyc8) {
        this.zzX3M = new zzY62(f, f2, Float.intBitsToFloat((int) zzyc8.zzY8Y()) - f3, com.aspose.words.internal.zzZPW.zzYz(zzyc8.zzY8Y()) - f4);
        int iZzY6 = (int) zzYBX.zzY6((float) shape.zzY9E());
        if (iZzY6 != 0) {
            if (iZzY6 == 90) {
                zzY62 zzy62 = this.zzX3M;
                this.zzX3M = new zzY62(zzy62.zzX3N, zzy62.zzX3Q, zzy62.zzX3P, zzy62.zzX3O);
            } else if (iZzY6 == 180) {
                zzY62 zzy622 = this.zzX3M;
                this.zzX3M = new zzY62(zzy622.zzX3O, zzy622.zzX3N, zzy622.zzX3Q, zzy622.zzX3P);
            } else if (iZzY6 != 270) {
                if (iZzY6 != 360) {
                    throw new IllegalArgumentException();
                }
            } else {
                zzY62 zzy623 = this.zzX3M;
                this.zzX3M = new zzY62(zzy623.zzX3P, zzy623.zzX3O, zzy623.zzX3N, zzy623.zzX3Q);
            }
        }
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, Shape shape) {
        int iZzmi;
        if (shape.getShapeType() != 2 || (iZzmi = shape.zzmi(1)) <= 0) {
            return zzzq4;
        }
        float fZzY9c = (iZzmi / shape.zzY9c()) * (zzzq4.getWidth() < zzzq4.getHeight() ? zzzq4.getWidth() : zzzq4.getHeight()) * 0.29299998f;
        float x = zzzq4.getX() + fZzY9c;
        float y = zzzq4.getY() + fZzY9c;
        float f = fZzY9c * 2.0f;
        return new com.aspose.words.internal.zzZQ4(x, y, zzzq4.getWidth() - f, zzzq4.getHeight() - f);
    }
}
