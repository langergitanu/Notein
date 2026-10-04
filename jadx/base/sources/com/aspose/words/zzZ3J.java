package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3J {
    private static boolean zzV(zzZ68 zzz68) throws Exception {
        Shape shape;
        return (zzz68.zzZua() == null || zzz68.getNode().getNodeType() != 18 || (shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(zzz68.zzZua().zz7u(), Shape.class)) == null || !shape.zzY9o() || zzn(shape)) ? false : true;
    }

    public static com.aspose.words.internal.zzJ zzYNa() {
        return new com.aspose.words.internal.zzJ(1, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzZD9 zzZ(zzZ68 zzz68, com.aspose.words.internal.zzBG zzbg, zzZ3T zzz3t) throws Exception {
        com.aspose.words.internal.zzBI zzbiZzZ = zzZ(zzz68, zzz3t);
        int nodeType = zzz68.getNode().getNodeType();
        int i = 1;
        if (nodeType == 17 || nodeType == 18) {
            if (zzV(zzz68)) {
                com.aspose.words.internal.zzB0 zzb0 = new com.aspose.words.internal.zzB0();
                zzbg.zzX(zzb0);
                return new zzD(zzz3t, zzb0, com.aspose.words.internal.zzBM.zzVn(zzz68.zz14().zzZo2()));
            }
            ShapeBase shapeBase = (ShapeBase) zzz68.getNode();
            if (shapeBase.isDecorative()) {
                return new zzE(1, zzbiZzZ, 0);
            }
            i = shapeBase.getMarkupLanguage() == 0 ? 2 : 0;
        } else if (nodeType != 35) {
        }
        com.aspose.words.internal.zzBD zzbd = new com.aspose.words.internal.zzBD(i, zzbiZzZ, zzz68.zzBC());
        zzbg.zzX(zzbd);
        return new zzD(zzz3t, zzbd, "");
    }

    private static boolean zzn(Shape shape) throws Exception {
        if (shape.hasImage() || shape.getFilled() || shape.getStroked()) {
            return true;
        }
        for (Shape shape2 : shape.getChildNodes(18, true)) {
            if (shape2.hasImage() || shape2.getFilled() || shape2.getStroked()) {
                return true;
            }
        }
        return false;
    }

    public static com.aspose.words.internal.zzBI zzZ(zzZ6H zzz6h, zzZ3T zzz3t) throws Exception {
        return zzZ(zzz6h.zz14(), zzz3t);
    }

    private static com.aspose.words.internal.zzBI zzZ(zzYMD zzymd, zzZ3T zzz3t) throws Exception {
        long jZzYqr = zzymd.zzYqr();
        return new com.aspose.words.internal.zzBI(new com.aspose.words.internal.zzZQ4(((int) jZzYqr) / 1000.0f, ((int) (jZzYqr >> 32)) / 1000.0f, zzymd.getWidth() / 1000.0f, zzymd.getHeight() / 1000.0f), zzz3t.zzYNy());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzZ(com.aspose.words.internal.zzBG zzbg, int i) {
        while (true) {
            if (zzbg == null || (zzbg instanceof com.aspose.words.internal.zzBF)) {
                break;
            }
            for (int i2 = 0; i2 < zzbg.getCount(); i2++) {
                com.aspose.words.internal.zzBB zzbb = (com.aspose.words.internal.zzBB) com.aspose.words.internal.zzZKW.zzZ(zzbg.zzVl(i2), com.aspose.words.internal.zzBB.class);
                if (zzbb != null && zzbb.zzZY() == i) {
                    return true;
                }
            }
            zzbg = (com.aspose.words.internal.zzBG) com.aspose.words.internal.zzZKW.zzZ(zzbg.zzBF(), com.aspose.words.internal.zzBG.class);
        }
    }

    public static com.aspose.words.internal.zzBI zzZ(zzZ70 zzz70, zzZ3T zzz3t) throws Exception {
        return zzZ((zzWT) zzz70.zzYgm, zzz3t);
    }
}
