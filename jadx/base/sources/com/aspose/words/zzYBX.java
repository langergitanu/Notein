package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBX {
    private com.aspose.words.internal.zzP9 zzFW;
    private long zzXeZ;
    private com.aspose.words.internal.zzP9 zzXf0;
    private float zzXf1;
    private int zzXf2;
    private int zzXf3;
    private int zzXf4;
    private float zzXf5;
    private float zzXf6;
    private float zzXf7;
    private com.aspose.words.internal.zzP9 zzXf8;
    private com.aspose.words.internal.zzP9 zzXf9;
    private long zzYV;
    private Shape zzZ2R;
    private long zzXeY = 0;
    private long zzXeX = 0;
    private long zzEp = 0;

    public zzYBX(Shape shape, long j, zzZL4 zzzl4) {
        this.zzYV = 0L;
        this.zzXeZ = 0L;
        this.zzZ2R = shape;
        this.zzYV = com.aspose.words.internal.zzZPW.zzYF(j) ? this.zzZ2R.getSize() : j;
        this.zzXf8 = zzzl4.zzZ54();
        long jZzZ = zzZ(shape, zzzl4.getScaleX(), zzzl4.getScaleY());
        this.zzXf7 = Float.intBitsToFloat((int) jZzZ);
        this.zzXf6 = com.aspose.words.internal.zzZPW.zzYz(jZzZ);
        this.zzXf5 = zzzl4.getRotation();
        this.zzXf2 = 0;
        this.zzXf1 = 0.0f;
        this.zzFW = null;
        this.zzXf4 = shape.zzYbm();
        this.zzXf3 = shape.zzYbl();
        this.zzXeZ = shape.zzYb0() ? zzW(shape, this.zzYV) : this.zzYV;
        zzY8D();
        zzY8G();
        zzY8F();
    }

    private com.aspose.words.internal.zzP9 zzQQ(boolean z) {
        return z ? this.zzXf0 : this.zzFW;
    }

    public static long zzW(ShapeBase shapeBase, long j) {
        return zzY7((float) shapeBase.getRotation()) ? com.aspose.words.internal.zzZPW.zzG(com.aspose.words.internal.zzZPW.zzYz(j), Float.intBitsToFloat((int) j)) : j;
    }

    private static void zzY(int i, com.aspose.words.internal.zzP9 zzp9) {
        if (i != 0) {
            if (i == 1) {
                zzp9.zzZ(-1.0f, 1.0f, 1);
            } else if (i == 2) {
                zzp9.zzZ(1.0f, -1.0f, 1);
            } else {
                if (i != 3) {
                    throw new IllegalStateException("Unknown flip orientation.");
                }
                zzp9.zzZ(-1.0f, -1.0f, 1);
            }
        }
    }

    public static float zzY6(float f) {
        return (float) com.aspose.words.internal.zzAN.zzZJ((((int) (com.aspose.words.internal.zzAN.zzZJ(f) + 45.0d)) / 90) * 90.0f);
    }

    public static boolean zzY7(float f) {
        return (((int) zzY6(f)) / 90) % 2 != 0;
    }

    private boolean zzY8A() {
        return this.zzXf2 != 0;
    }

    private void zzY8C() {
        if (!this.zzZ2R.getStroked() || this.zzZ2R.getStroke() == null) {
            return;
        }
        double weight = this.zzZ2R.getStroke().getWeight();
        float fZzS = (this.zzZ2R.getDirectShapeAttr(1984) == null || ((Integer) this.zzZ2R.getDirectShapeAttr(1984)).intValue() == 0) ? 0.0f : (float) com.aspose.words.internal.zzZKQ.zzS(weight / ((double) Float.intBitsToFloat((int) this.zzYV)), 2);
        float fZzS2 = (this.zzZ2R.getDirectShapeAttr(1985) == null || ((Integer) this.zzZ2R.getDirectShapeAttr(1985)).intValue() == 0) ? 0.0f : (float) com.aspose.words.internal.zzZKQ.zzS(weight / ((double) com.aspose.words.internal.zzZPW.zzYz(this.zzYV)), 2);
        if (fZzS == 0.0f && fZzS2 == 0.0f) {
            return;
        }
        this.zzFW.zzZ(1.0f - fZzS, 1.0f - fZzS2, 1);
    }

    private void zzY8D() {
        int iZzZyh = this.zzZ2R.zzZyh();
        int iZzZyg = this.zzZ2R.zzZyg();
        float fZzY9c = this.zzZ2R.zzY9c();
        float f = fZzY9c * 0.5f;
        float fZzY9b = this.zzZ2R.zzY9b();
        float f2 = fZzY9b * 0.5f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzYV) / fZzY9c;
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(this.zzYV) / fZzY9b;
        float rotation = (float) this.zzZ2R.getRotation();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) this.zzXeZ) / fZzY9c;
        float fZzYz2 = com.aspose.words.internal.zzZPW.zzYz(this.zzXeZ) / fZzY9b;
        if (this.zzXf4 != 0 || this.zzXf3 != 0) {
            if (fIntBitsToFloat > fZzYz) {
                this.zzXf2 = 1;
                float f3 = ((fIntBitsToFloat / fZzYz) - 1.0f) * fZzY9c;
                this.zzXf1 = f3;
                f += f3 * 0.5f;
            } else {
                this.zzXf2 = 2;
                float f4 = ((fZzYz / fIntBitsToFloat) - 1.0f) * fZzY9b;
                this.zzXf1 = f4;
                f2 += f4 * 0.5f;
            }
            fIntBitsToFloat = Math.min(fIntBitsToFloat, fZzYz);
            fZzYz = fIntBitsToFloat;
            fIntBitsToFloat2 = fZzYz;
            fZzYz2 = fIntBitsToFloat2;
        }
        float f5 = f;
        float f6 = f2;
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        this.zzFW = zzp9;
        zzp9.zzY(-iZzZyh, -iZzZyg, 1);
        this.zzFW.zzY(-f5, -f6, 1);
        zzY8C();
        float f7 = this.zzXf7;
        float f8 = fIntBitsToFloat * f7;
        float f9 = this.zzXf6;
        float f10 = fZzYz * f9;
        float f11 = fIntBitsToFloat2 * f7;
        float f12 = fZzYz2 * f9;
        this.zzXf0 = this.zzFW.zzOh();
        this.zzFW.zzZ(f8, f10, 1);
        this.zzXf0.zzZ(f11, f12, 1);
        this.zzFW.zzX(rotation, 1);
        this.zzXf0.zzX(zzY6(rotation + this.zzXf5), 1);
        zzY(this.zzZ2R.getFlipOrientation(), this.zzFW);
        zzY(this.zzZ2R.getFlipOrientation(), this.zzXf0);
        this.zzFW.zzX(this.zzXf5, 1);
        zzZ((ShapeBase) com.aspose.words.internal.zzZKW.zzZ(this.zzZ2R.getParentNode(), ShapeBase.class), this.zzFW);
        this.zzFW.zzY(f8 * f5, f10 * f6, 1);
        this.zzXf0.zzY(f11 * f5, f12 * f6, 1);
        com.aspose.words.internal.zzZQ4 zzzq4ZzF = zzZS9.zzF(this.zzZ2R);
        float f13 = 0.0f;
        float f14 = (this.zzZ2R.getDirectShapeAttr(1984) == null || ((Integer) this.zzZ2R.getDirectShapeAttr(1984)).intValue() == 0 || zzzq4ZzF.getX() >= 0.0f) ? 0.0f : -zzzq4ZzF.getX();
        if (this.zzZ2R.getDirectShapeAttr(1985) != null && ((Integer) this.zzZ2R.getDirectShapeAttr(1985)).intValue() != 0 && zzzq4ZzF.getY() < 0.0f) {
            f13 = -zzzq4ZzF.getY();
        }
        this.zzXf0.zzY(f14, f13, 1);
        zzZ(fIntBitsToFloat, fZzYz, f5, f6, iZzZyh, iZzZyg);
    }

    private void zzY8F() {
        float fZzY9c = this.zzZ2R.zzY9c();
        float fZzY9b = this.zzZ2R.zzY9b();
        if (this.zzXf4 != 0 || this.zzXf3 != 0) {
            long jZzY8E = zzY8E();
            long j = this.zzEp;
            float fIntBitsToFloat = Float.intBitsToFloat((int) j) / Float.intBitsToFloat((int) jZzY8E);
            fZzY9b = com.aspose.words.internal.zzZPW.zzYz(j) / com.aspose.words.internal.zzZPY.zzYC(jZzY8E);
            fZzY9c = fIntBitsToFloat;
        }
        this.zzXeX = com.aspose.words.internal.zzZPW.zzG(fZzY9c, fZzY9b);
    }

    private void zzY8G() {
        this.zzEp = com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat((int) this.zzYV) * this.zzXf7, com.aspose.words.internal.zzZPW.zzYz(this.zzYV) * this.zzXf6);
    }

    private static int zzYA(ShapeBase shapeBase) {
        int flipOrientation = 0;
        while (shapeBase != null) {
            flipOrientation ^= shapeBase.getFlipOrientation();
            shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getParentNode(), ShapeBase.class);
        }
        return flipOrientation;
    }

    public static long zzZ(ShapeBase shapeBase, float f, float f2) {
        return zzY7((float) shapeBase.getRotation()) ? com.aspose.words.internal.zzZPW.zzG(f2, f) : com.aspose.words.internal.zzZPW.zzG(f, f2);
    }

    public final Shape getShape() {
        return this.zzZ2R;
    }

    public final com.aspose.words.internal.zzP9 zzO(long j, boolean z) {
        long[] jArr = {0, com.aspose.words.internal.zzZPY.zzG(this.zzZ2R.zzY9c(), 0.0f), com.aspose.words.internal.zzZPY.zzG(this.zzZ2R.zzY9c(), this.zzZ2R.zzY9b()), com.aspose.words.internal.zzZPY.zzG(0.0f, this.zzZ2R.zzY9b())};
        zzZ(jArr, zzZ5J.zzX(jArr, this.zzZ2R.zzYbm(), this.zzZ2R.zzYbl()));
        com.aspose.words.internal.zzZQ4 zzzq4ZzU = com.aspose.words.internal.zzJ6.zzU(jArr);
        float x = zzzq4ZzU.getX();
        float y = zzzq4ZzU.getY();
        float width = zzzq4ZzU.getWidth();
        float height = zzzq4ZzU.getHeight();
        if (this.zzZ2R.zzYaC()) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ2 = this.zzZ2R.zzZ2(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, Float.intBitsToFloat((int) this.zzYV), com.aspose.words.internal.zzZPW.zzYz(this.zzYV)));
            width = zzzq4ZzZ2.getWidth();
            height = zzzq4ZzZ2.getHeight();
        }
        float f = width / ((int) j);
        float f2 = height / ((int) (j >>> 32));
        if (z) {
            if (f > f2) {
                f2 = f;
            } else {
                f = f2;
            }
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzZ(f, f2, 0);
        double rotation = this.zzZ2R.getRotation() + ((double) this.zzXf5);
        if (this.zzZ2R.zzYaC() && rotation != 0.0d) {
            x = Float.intBitsToFloat((int) jArr[0]);
            y = com.aspose.words.internal.zzZPY.zzYC(jArr[0]);
            zzp9.zzX((float) rotation, 1);
        }
        zzp9.zzY(x, y, 1);
        return zzp9;
    }

    public final long zzX(long j, zzZ5I zzz5i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(j);
        long j2 = this.zzXeX;
        if (this.zzXf4 != 0 || this.zzXf3 != 0) {
            if (zzz5i.zzYRc()) {
                fIntBitsToFloat += Float.intBitsToFloat((int) j2) - this.zzZ2R.zzY9c();
            }
            if (zzz5i.zzYRb()) {
                fZzYC += com.aspose.words.internal.zzZPW.zzYz(j2) - this.zzZ2R.zzY9b();
            }
        }
        return com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC);
    }

    public final long zzY8B() {
        return this.zzXeY;
    }

    public final long zzY8E() {
        return zzZ(this.zzZ2R, this.zzYV, this.zzXf7, this.zzXf6);
    }

    public final long zzY8H() {
        return this.zzXeX;
    }

    public final long zzY8I() {
        return this.zzEp;
    }

    public final com.aspose.words.internal.zzP9 zzY8z() {
        return this.zzXf9;
    }

    public final void zzo(com.aspose.words.internal.zzP9 zzp9) {
        this.zzXf9 = zzp9;
    }

    private static long zzZ(ShapeBase shapeBase, long j, float f, float f2) {
        int iZzY9c = shapeBase.zzY9c();
        int iZzY9b = shapeBase.zzY9b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) j) / iZzY9c;
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(j) / iZzY9b;
        if (shapeBase instanceof Shape) {
            Shape shape = (Shape) shapeBase;
            if (shape.zzYbm() != 0 || shape.zzYbl() != 0) {
                fIntBitsToFloat = Math.min(fIntBitsToFloat, fZzYz);
                fZzYz = fIntBitsToFloat;
            }
        }
        float f3 = fIntBitsToFloat * f;
        float f4 = fZzYz * f2;
        if (f3 == 0.0f) {
            f3 = 1.0f;
        }
        if (f4 == 0.0f) {
            f4 = 1.0f;
        }
        return com.aspose.words.internal.zzZPY.zzG(f3, f4);
    }

    private static long zzW(Shape shape, long j) {
        com.aspose.words.internal.zzZQ4 zzzq4ZzF = zzZS9.zzF(shape);
        float width = (shape.getDirectShapeAttr(1984) == null || ((Integer) shape.getDirectShapeAttr(1984)).intValue() == 0) ? 0.0f : zzzq4ZzF.getWidth();
        float height = (shape.getDirectShapeAttr(1985) == null || ((Integer) shape.getDirectShapeAttr(1985)).intValue() == 0) ? 0.0f : zzzq4ZzF.getHeight();
        return (width == 0.0f && height == 0.0f) ? j : com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat((int) j) - width, com.aspose.words.internal.zzZPW.zzYz(j) - height);
    }

    public final void zzZ(long[] jArr, zzZ5I[] zzz5iArr) {
        if (zzY8A()) {
            for (int i = 0; i < jArr.length; i++) {
                jArr[i] = zzW(jArr[i], zzz5iArr[i]);
            }
        }
        zzQQ(false).zzZ(jArr);
    }

    private long zzW(long j, zzZ5I zzz5i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(j);
        if (this.zzXf2 == 1) {
            if (zzz5i.zzYRc()) {
                fIntBitsToFloat += this.zzXf1;
            }
        } else if (zzz5i.zzYRb()) {
            fZzYC += this.zzXf1;
        }
        return com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC);
    }

    public final long zzZ(long j, zzZ5I zzz5i, boolean z) {
        if (zzY8A()) {
            j = zzW(j, zzz5i);
        }
        return zzQQ(z).zzR(j);
    }

    private void zzZ(float f, float f2, float f3, float f4, float f5, float f6) {
        long[] jArr = {com.aspose.words.internal.zzZPY.zzG(f3, f4)};
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(-f5, -f6, 1);
        zzp9.zzZ(f, f2, 1);
        if (!this.zzZ2R.isTopLevel()) {
            zzp9.zzY((float) this.zzZ2R.getLeft(), (float) this.zzZ2R.getTop(), 1);
        }
        zzp9.zzZ(this.zzXf8, 1);
        zzp9.zzZ(jArr);
        long[] jArr2 = {com.aspose.words.internal.zzZPY.zzG(f3, f4)};
        this.zzFW.zzZ(jArr2);
        this.zzXeY = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jArr[0]) - Float.intBitsToFloat((int) jArr2[0]), com.aspose.words.internal.zzZPY.zzYC(jArr[0]) - com.aspose.words.internal.zzZPY.zzYC(jArr2[0]));
    }

    private static void zzZ(ShapeBase shapeBase, com.aspose.words.internal.zzP9 zzp9) {
        zzY(zzYA(shapeBase), zzp9);
    }

    public static com.aspose.words.internal.zzP9 zzZ(ShapeBase shapeBase, zzZL4 zzzl4) {
        int iZzZyh = shapeBase.zzZyh();
        int iZzZyg = shapeBase.zzZyg();
        float width = ((float) shapeBase.getWidth()) * 0.5f;
        float height = ((float) shapeBase.getHeight()) * 0.5f;
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(-iZzZyh, -iZzZyg, 1);
        zzp9.zzY(-width, -height, 1);
        float rotation = ((float) shapeBase.getRotation()) + zzzl4.getRotation();
        long jZzZ = zzZ(shapeBase, zzzl4.getScaleX(), zzzl4.getScaleY());
        float fIntBitsToFloat = Float.intBitsToFloat((int) jZzZ);
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(jZzZ);
        zzp9.zzZ(fIntBitsToFloat, fZzYz, 1);
        zzp9.zzX(rotation, 1);
        zzZ(shapeBase, zzp9);
        if (Math.abs(rotation % 180.0f) == 90.0f && !shapeBase.isInline() && !(shapeBase.getParentNode() instanceof GroupShape) && shapeBase.getWrapType() != 3) {
            height = width;
            width = height;
        }
        zzp9.zzY(width * fIntBitsToFloat, height * fZzYz, 1);
        return zzp9;
    }

    public static com.aspose.words.internal.zzP9 zzZ(ShapeBase shapeBase, long j, boolean z) {
        int iZzZyh = shapeBase.zzZyh();
        int iZzZyg = shapeBase.zzZyg();
        float fZzY9c = shapeBase.zzY9c();
        float f = fZzY9c * 0.5f;
        float fZzY9b = shapeBase.zzY9b();
        float f2 = 0.5f * fZzY9b;
        if (com.aspose.words.internal.zzZPW.zzYF(j)) {
            j = shapeBase.getSize();
        }
        int i = (int) j;
        float fIntBitsToFloat = Float.intBitsToFloat(i) / fZzY9c;
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(j) / fZzY9b;
        if (z) {
            fIntBitsToFloat = com.aspose.words.internal.zzZPW.zzYz(j) / fZzY9b;
            fZzYz = Float.intBitsToFloat(i) / fZzY9c;
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(-iZzZyh, -iZzZyg, 1);
        zzp9.zzY(-f, -f2, 1);
        zzp9.zzZ(fIntBitsToFloat, fZzYz, 1);
        zzp9.zzX((float) shapeBase.getRotation(), 1);
        zzY(shapeBase.getFlipOrientation(), zzp9);
        zzp9.zzY(f * fIntBitsToFloat, f2 * fZzYz, 1);
        if (!shapeBase.isTopLevel()) {
            zzp9.zzY((float) shapeBase.getLeft(), (float) shapeBase.getTop(), 1);
        }
        return zzp9;
    }
}
