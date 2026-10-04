package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYC5 implements Cloneable {
    private boolean zzXmA;
    private boolean zzXmB;
    private long zzXmw;
    private float zzXmx;
    private float zzXmy;
    private double zzXmz;
    private zzYLC zzZAl;
    private com.aspose.words.internal.zzZQ4 zzZBg;
    private com.aspose.words.internal.zzZQ4 zzZBh;
    private ShapeBase zzZBi;

    public zzYC5(ShapeBase shapeBase) {
        this.zzXmw = 0L;
        com.aspose.words.internal.zzZQ4 zzzq4 = com.aspose.words.internal.zzZQ4.zz2T;
        this.zzZBg = zzzq4;
        this.zzZBh = zzzq4;
        if (shapeBase == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: shape");
        }
        this.zzZBi = shapeBase;
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        if (shape != null) {
            this.zzXmz = shape.getStrokeWeight();
        }
        if (shapeBase.getMarkupLanguage() == 1) {
            this.zzXmx = (float) shapeBase.getWidth();
            if (shape == null || !shape.getStroke().zzY40() || shape.getStrokeWeight() >= 1.0d) {
                return;
            }
            this.zzXmz = 1.0d;
        }
    }

    private boolean zzY8S() {
        return this.zzZBi.getMarkupLanguage() == 0;
    }

    public final void zz1(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzZBg = zzzq4;
    }

    public final void zz2(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzZBh = zzzq4;
    }

    public final zzYLC zz6L() {
        return this.zzZAl;
    }

    public final com.aspose.words.internal.zzZQ4 zz7s() {
        return this.zzZBg;
    }

    public final com.aspose.words.internal.zzZQ4 zz7t() {
        return this.zzZBh;
    }

    public final ShapeBase zz7u() {
        return this.zzZBi;
    }

    public final void zzQR(boolean z) {
        this.zzXmA = z;
    }

    public final void zzQS(boolean z) {
        this.zzXmB = z;
    }

    public final void zzX(zzYLC zzylc) {
        this.zzZAl = zzylc;
    }

    public final void zzXf(long j) {
        this.zzXmw = j;
    }

    public final void zzY8(float f) {
        this.zzXmy = f;
    }

    public final float zzY8O() {
        return this.zzXmy;
    }

    public final double zzY8P() {
        return this.zzXmz;
    }

    public final boolean zzY8Q() {
        return this.zzXmA;
    }

    public final boolean zzY8R() {
        return this.zzXmB;
    }

    public final long zzY8T() {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ2 = this.zzZBi.zzZ2(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, Float.intBitsToFloat((int) this.zzXmw), com.aspose.words.internal.zzZPW.zzYz(this.zzXmw)));
        return com.aspose.words.internal.zzZPW.zzG(zzzq4ZzZ2.getWidth(), zzzq4ZzZ2.getHeight());
    }

    public final long zzY8U() {
        return this.zzXmw;
    }

    public final float zzY8V() {
        return this.zzXmx;
    }

    public final boolean zzYMg() {
        if (zzY8S() && (this.zzZBi.zzYvW().getWrapType() == 4 || this.zzZBi.zzYvW().getWrapType() == 5)) {
            return true;
        }
        if (zzY8S()) {
            return false;
        }
        return this.zzZBi.zzYvW().getWrapType() == 4 || this.zzZBi.zzYvW().getWrapType() == 5;
    }

    public zzYC5(ShapeBase shapeBase, long j) {
        this(shapeBase);
        this.zzXmw = j;
    }

    public zzYC5(ShapeBase shapeBase, float f) {
        this(shapeBase, 0L);
        if (f > 0.0f) {
            this.zzXmx = f;
        }
    }
}
