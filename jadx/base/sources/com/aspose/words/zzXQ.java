package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzXQ {
    private boolean zzZBf;
    private com.aspose.words.internal.zzZQ4 zzZBg;
    private com.aspose.words.internal.zzZQ4 zzZBh;
    private ShapeBase zzZBi;
    private com.aspose.words.internal.zzG zzbp;

    public zzXQ(com.aspose.words.internal.zzG zzg, ShapeBase shapeBase) {
        this.zzbp = zzg;
        this.zzZBi = shapeBase;
    }

    public static com.aspose.words.internal.zzZQ4 zz3(com.aspose.words.internal.zzZQ4 zzzq4) {
        float width = zzzq4.getWidth();
        float height = zzzq4.getHeight();
        if (width > 1584.0f) {
            width = 1584.0f;
        }
        if (height > 1584.0f) {
            height = 1584.0f;
        }
        return new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY(), width, height);
    }

    public static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, ShapeBase shapeBase) {
        boolean zZzY7 = zzYBX.zzY7((float) shapeBase.getRotation());
        if (zZzY7) {
            zzzq42 = com.aspose.words.internal.zzJ6.zzY(zzzq42, 90.0f);
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzT = com.aspose.words.internal.zzZQ4.zzT(zzzq4, zzzq42);
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getDocument(), Document.class);
        if (zZzY7 && shapeBase.getVerticalAlignment() == 0 && shapeBase.getHorizontalAlignment() != 0 && document != null && !document.getCompatibilityOptions().zzZYM()) {
            zzzq4ZzT = new com.aspose.words.internal.zzZQ4(zzzq4ZzT.getX(), zzzq4ZzT.getY() - ((zzzq42.getWidth() - zzzq42.getHeight()) / 2.0f), zzzq4ZzT.getWidth(), zzzq4ZzT.getHeight());
        }
        if (com.aspose.words.internal.zzZPW.zzYF(shapeBase.zzY95()) || !shapeBase.zzY9s() || shapeBase.zzY9o()) {
            return zzzq4ZzT;
        }
        float x = zzzq4ZzT.getX();
        float y = zzzq4ZzT.getY();
        float width = zzzq4ZzT.getWidth();
        float height = zzzq4ZzT.getHeight();
        if (Float.intBitsToFloat((int) shapeBase.zzY95()) > 0.0f) {
            width = Float.intBitsToFloat((int) shapeBase.zzY95());
            x = 0.0f;
        }
        if (com.aspose.words.internal.zzZPW.zzYz(shapeBase.zzY95()) > 0.0f) {
            height = com.aspose.words.internal.zzZPW.zzYz(shapeBase.zzY95());
            y = 0.0f;
        }
        return new com.aspose.words.internal.zzZQ4(x, y, width, height);
    }

    public final void zz1(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzZBg = zzzq4;
    }

    public final void zz2(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzZBh = zzzq4;
    }

    public final void zz7r() {
        this.zzZBf = true;
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

    public final com.aspose.words.internal.zzG zz7v() {
        return this.zzbp;
    }

    public abstract com.aspose.words.internal.zzZQ4 zz7w();

    public abstract com.aspose.words.internal.zzZQ4 zz7x() throws Exception;

    public abstract void zz7y() throws Exception;
}
