package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY38 extends zzXQ {
    private zzYC5 zzYfa;

    private zzY38(com.aspose.words.internal.zzG zzg, zzYC5 zzyc5) {
        super(zzg, zzyc5.zz7u());
        this.zzYfa = zzyc5;
    }

    private static com.aspose.words.internal.zzZQ4 zzW(zzYC5 zzyc5) throws Exception {
        float fZzZ;
        float fZzv;
        float fZzv2;
        float fZzv3;
        com.aspose.words.internal.zzZQ4 zzzq4ZzX = zzX(zzyc5, true);
        Shape shape = (Shape) zzyc5.zz7u();
        boolean zZzZy = zzYCC.zzZy(shape);
        if (shape.getStroked() || !zZzZy) {
            fZzZ = (zZzZy ? 1.0f : 0.5f) * zzZ(shape, zzzq4ZzX);
            fZzv = fZzZ;
            fZzv2 = fZzv;
            fZzv3 = fZzv2;
        } else {
            BorderCollection borders = shape.getImageData().getBorders();
            Border byBorderType = borders.getByBorderType(3);
            Border byBorderType2 = borders.getByBorderType(1);
            Border byBorderType3 = borders.getByBorderType(2);
            Border byBorderType4 = borders.getByBorderType(0);
            fZzZ = zzv(byBorderType);
            fZzv = zzv(byBorderType4);
            fZzv2 = zzv(byBorderType2);
            fZzv3 = zzv(byBorderType3);
        }
        float fZzZm = zzzq4ZzX.zzZm() - fZzv2;
        float fZzZo = zzzq4ZzX.zzZo() - fZzZ;
        float fZzkw = zzzq4ZzX.zzkw() + fZzv3;
        float fZzZn = zzzq4ZzX.zzZn() + fZzv;
        if (com.aspose.words.internal.zzAN.zzZJ(zzyc5.zz7u().zzY9E()) != 0.0d) {
            long[] jArr = {com.aspose.words.internal.zzZPY.zzG(fZzZm, fZzZo), com.aspose.words.internal.zzZPY.zzG(fZzkw, fZzZo), com.aspose.words.internal.zzZPY.zzG(fZzkw, fZzZn), com.aspose.words.internal.zzZPY.zzG(fZzZm, fZzZn)};
            zzZ(zzyc5, jArr);
            long[] jArrZzu = zzu(jArr);
            return new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) jArrZzu[0]), com.aspose.words.internal.zzZPY.zzYC(jArrZzu[0]), Float.intBitsToFloat((int) jArrZzu[1]) - Float.intBitsToFloat((int) jArrZzu[0]), com.aspose.words.internal.zzZPY.zzYC(jArrZzu[1]) - com.aspose.words.internal.zzZPY.zzYC(jArrZzu[0]));
        }
        float f = fZzkw - fZzZm;
        float f2 = fZzZn - fZzZo;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        return new com.aspose.words.internal.zzZQ4(fZzZm, fZzZo, f, f2);
    }

    private static com.aspose.words.internal.zzZQ4 zzX(zzYC5 zzyc5, boolean z) {
        long size = (!z || com.aspose.words.internal.zzZPW.zzYF(zzyc5.zzY8U())) ? zzyc5.zz7u().zzYzG().getSize() : zzyc5.zzY8T();
        return new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, Float.intBitsToFloat((int) size), com.aspose.words.internal.zzZPW.zzYz(size));
    }

    private com.aspose.words.internal.zzZQ4 zzXTK() throws Exception {
        return zzYb(zz7u()) ? zzZ(this.zzYfa, zz7v()) : zzW(this.zzYfa);
    }

    private static boolean zzYa(ShapeBase shapeBase) {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        if (shape == null) {
            return false;
        }
        if (shape.getExtrusionEnabled() || shape.getShadowEnabled()) {
            return true;
        }
        return shape.getStroked() && com.aspose.words.internal.zzBW.zzZ(shape.getStroke().zzNO());
    }

    private static boolean zzYb(ShapeBase shapeBase) {
        if (shapeBase.getShapeType() == -1 || shapeBase.zzY9w() || shapeBase.zzY9v() || zzYa(shapeBase) || shapeBase.isWordArt()) {
            return true;
        }
        return shapeBase.isTopLevel() && shapeBase.getRotation() != 0.0d;
    }

    public static zzX0 zzZ(com.aspose.words.internal.zzG zzg, zzYC5 zzyc5) throws Exception {
        zzY38 zzy38 = new zzY38(zzg, zzyc5);
        zzy38.zz7y();
        zzX0 zzx0 = new zzX0(zzg);
        zzx0.zz1(zzy38.zz7s());
        zzx0.zz2(zzy38.zz7t());
        return zzx0;
    }

    private static com.aspose.words.internal.zzZQ4 zzZX(com.aspose.words.internal.zzG zzg) throws Exception {
        return zzXQ.zz3(new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzg));
    }

    private static float zzd(float f, float f2) {
        if (f <= 1.5f) {
            return ((f > 0.75f ? 2.25f : 1.5f) - f) / 2.0f;
        }
        return f2;
    }

    private static long[] zzu(long[] jArr) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) jArr[0]);
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(jArr[0]);
        float fZzYC2 = fZzYC;
        float fIntBitsToFloat2 = fIntBitsToFloat;
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            int i2 = (int) j;
            if (Float.intBitsToFloat(i2) < fIntBitsToFloat) {
                fIntBitsToFloat = Float.intBitsToFloat(i2);
            } else if (Float.intBitsToFloat(i2) > fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            }
            if (com.aspose.words.internal.zzZPY.zzYC(j) < fZzYC) {
                fZzYC = com.aspose.words.internal.zzZPY.zzYC(j);
            } else if (com.aspose.words.internal.zzZPY.zzYC(j) > fZzYC2) {
                fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(j);
            }
        }
        return new long[]{com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC), com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat2, fZzYC2)};
    }

    private static float zzv(Border border) {
        if (border.isVisible()) {
            return border.zz8S();
        }
        return 0.0f;
    }

    @Override // com.aspose.words.zzXQ
    public final com.aspose.words.internal.zzZQ4 zz7w() {
        com.aspose.words.internal.zzZQ4 zzzq4Zz7s = zz7s();
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(zz7u(), Shape.class);
        if (shape == null || !shape.getStroked() || this.zzYfa.zzY8P() >= 0.14d) {
            return zzzq4Zz7s;
        }
        float fZzY8P = ((float) (0.14d - this.zzYfa.zzY8P())) * 2.0f;
        return new com.aspose.words.internal.zzZQ4(zzzq4Zz7s.getX(), zzzq4Zz7s.getY(), zzzq4Zz7s.getWidth() + fZzY8P, zzzq4Zz7s.getHeight() + fZzY8P);
    }

    @Override // com.aspose.words.zzXQ
    public final com.aspose.words.internal.zzZQ4 zz7x() throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzXTK = zzXTK();
        if (zz7u().isTopLevel() && !zz7u().zzY9s() && !zz7u().isWordArt() && this.zzYfa.zzY8R() && (zz7u().isInline() || zz7u().zzYbr() != 3)) {
            zzzq4ZzXTK = zzZ(zzzq4ZzXTK, this.zzYfa.zzY8O(), this.zzYfa.zzY8Q());
        }
        return (zz7u().getDocument().zzZpV().zzYVg.getShapeLayoutLikeWW8() && zz7u().getShapeType() == 20 && zz7u().getWrapType() == 1) ? zzZ(zzzq4ZzXTK, this.zzYfa) : zzzq4ZzXTK;
    }

    @Override // com.aspose.words.zzXQ
    public final void zz7y() throws Exception {
        zz1(zz7x());
        zz2(zz7w());
        zz7r();
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzYC5 zzyc5) {
        ShapeBase shapeBaseZz7u = zzyc5.zz7u();
        float fZzY8O = zzyc5.zzY8O() / 2.0f;
        com.aspose.words.internal.zzZQ4 zzzq42 = new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY() + fZzY8O, zzzq4.getWidth(), zzzq4.getHeight() - fZzY8O);
        if (shapeBaseZz7u.getHeight() != 0.0d && shapeBaseZz7u.getWidth() != 0.0d) {
            return zzzq42;
        }
        if (zzYBX.zzY7((float) shapeBaseZz7u.getRotation())) {
            if (shapeBaseZz7u.getWidth() != 0.0d) {
                return zzzq42;
            }
        } else if (shapeBaseZz7u.getHeight() != 0.0d) {
            return zzzq42;
        }
        return new com.aspose.words.internal.zzZQ4(zzzq42.getX(), zzzq42.getY() - fZzY8O, zzzq42.getWidth(), 0.0f);
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, float f, boolean z) {
        float f2 = ((((int) (r1 / 1.5f)) + (!com.aspose.words.internal.zzAN.zzf((f < 0.75f ? 0.75f : f) % 1.5f) ? 1 : 0)) * 0.75f) - (z ? 0.0f : f / 2.0f);
        float fZzd = zzd(zzzq4.getWidth(), f2);
        float fZzd2 = zzd(zzzq4.getHeight(), f2);
        return new com.aspose.words.internal.zzZQ4(zzzq4.getX() - fZzd, zzzq4.getY() - fZzd2, (fZzd * 2.0f) + zzzq4.getWidth(), (fZzd2 * 2.0f) + zzzq4.getHeight());
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zzYC5 zzyc5, com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZX = zzZX(zzg);
        if (zzg.zzZO() != null) {
            zzzq4ZzZX = new com.aspose.words.internal.zzP9(1.0f, 0.0f, 0.0f, 1.0f, -zzg.zzZO().zzOb(), -zzg.zzZO().zzOa()).zzO(zzzq4ZzZX);
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzX = zzX(zzyc5, (zzyc5.zz7u().getDirectShapeAttr(1984) == null && zzyc5.zz7u().getDirectShapeAttr(1985) == null) ? false : true);
        return !com.aspose.words.internal.zzZQ4.zzV(zzzq4ZzX, com.aspose.words.internal.zzZQ4.zz2T) ? zzXQ.zzZ(zzzq4ZzZX, zzzq4ZzX, zzyc5.zz7u()) : zzzq4ZzZX;
    }

    private static float zzZ(Shape shape, com.aspose.words.internal.zzZQ4 zzzq4) {
        if (!shape.getStroked()) {
            return com.aspose.words.internal.zzAN.zzf(zzzq4.getWidth()) ^ com.aspose.words.internal.zzAN.zzf(zzzq4.getHeight()) ? 0.75f : 0.0f;
        }
        boolean shapeLayoutLikeWW8 = shape.getDocument().zzZpV().zzYVg.getShapeLayoutLikeWW8();
        if (shape.getWrapType() == 2 && shapeLayoutLikeWW8) {
            return 0.0f;
        }
        return (float) shape.getStroke().getWeight();
    }

    private static void zzZ(zzYC5 zzyc5, long[] jArr) {
        double dZzY9E = zzyc5.zz7u().zzY9E();
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        long j = jArr[0];
        long j2 = jArr[2];
        if (zzyc5.zz7u().isImage()) {
            zzp9 = zzYBX.zzZ(zzyc5.zz7u(), new zzZL4(new com.aspose.words.internal.zzP9(1.0f, 0.0f, 0.0f, 1.0f, Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPY.zzYC(j)), 1.0f, 1.0f, (float) (dZzY9E - zzyc5.zz7u().getRotation())));
        } else if (dZzY9E != 0.0d) {
            float f = (float) dZzY9E;
            int i = (int) j;
            zzp9.zzZ(f, com.aspose.words.internal.zzZPY.zzG(((Float.intBitsToFloat((int) j2) - Float.intBitsToFloat(i)) * 0.5f) + Float.intBitsToFloat(i), ((com.aspose.words.internal.zzZPY.zzYC(j2) - com.aspose.words.internal.zzZPY.zzYC(j)) * 0.5f) + com.aspose.words.internal.zzZPY.zzYC(j)), 0);
        }
        zzp9.zzZ(jArr);
    }
}
