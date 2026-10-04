package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zz2L extends zzYCE {
    private int zzZ0S;
    private zzZ91 zzZ0U;
    private int zzZ3s;
    private com.aspose.words.internal.zzH zzZdO;

    public zz2L(IWarningCallback iWarningCallback, int i, int i2, zzZ91 zzz91, Map<ShapeBase, zzX0> map) {
        super(iWarningCallback, map);
        this.zzZ3s = i;
        this.zzZ0S = i2;
        this.zzZ0U = zzz91;
    }

    private static long[] zzY(zzYC5 zzyc5, ShapeBase shapeBase, zzX0 zzx0) throws Exception {
        if (shapeBase.zzY9x() == null) {
            return null;
        }
        long[] jArrZzY9x = shapeBase.zzY9x();
        if (com.aspose.words.internal.zzJ6.zzU(jArrZzY9x).isEmpty()) {
            return com.aspose.words.internal.zzJ6.zzz(zzx0.zz7s());
        }
        if (shapeBase.zzY9o() && shapeBase.getRotation() == 0.0d) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH(false, true).zzZ((com.aspose.words.internal.zzZL) zzx0.zz7v());
            if (zzyc5.zzYMg()) {
                zzzq4ZzZ = zzY(shapeBase, zzzq4ZzZ);
            }
            if (!zzzq4ZzZ.isEmpty()) {
                return com.aspose.words.internal.zzJ6.zzz(zzzq4ZzZ);
            }
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        float fIntBitsToFloat = Float.intBitsToFloat((int) shapeBase.getSize()) / 21600.0f;
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(shapeBase.getSize()) / 21600.0f;
        zzp9.zzY(-10800.0f, -10800.0f, 1);
        zzp9.zzZ(fIntBitsToFloat, fZzYz, 1);
        zzp9.zzX((float) shapeBase.getRotation(), 1);
        zzp9.zzY(fIntBitsToFloat * 10800.0f, fZzYz * 10800.0f, 1);
        zzp9.zzZ(jArrZzY9x);
        return jArrZzY9x;
    }

    public static com.aspose.words.internal.zzG zzZ(zzYC5 zzyc5) throws Exception {
        int iZzYSO;
        ShapeBase shapeBaseZz7u = zzyc5.zz7u();
        Map<ShapeBase, zzX0> map = new HashMap<>();
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(shapeBaseZz7u.getDocument(), Document.class);
        if (document != null) {
            zzYNA zzynaZzWA = document.zzWA(shapeBaseZz7u.zzYac());
            if (zzynaZzWA != null) {
                ShapeBase shapeBaseZzYa6 = shapeBaseZz7u.zzYa6();
                boolean zZzYT1 = document.zzZqg().zzYT1();
                document.zzZqg().zzUY(true);
                zzynaZzWA.zzZc(shapeBaseZzYa6);
                document.zzZqg().zzUY(zZzYT1);
            }
            map = document.zzZqf();
            iZzYSO = document.zzZqg().zzYSO();
        } else {
            iZzYSO = 0;
        }
        return new zz2L(shapeBaseZz7u.getDocument().getWarningCallback(), 0, iZzYSO, null, map).zzZ(zzyc5, true);
    }

    private com.aspose.words.internal.zzH zzZMR() {
        if (this.zzZdO == null) {
            this.zzZdO = new com.aspose.words.internal.zzH();
        }
        return this.zzZdO;
    }

    private zzZC5 zzZvk() {
        zz4I zz4i = new zz4I();
        zz4i.zzZ(new zzY21(this.zzYUo));
        zz4i.setDmlEffectsRenderingMode(this.zzZ3s);
        zz4i.setDml3DEffectsRenderingMode(this.zzZ0S);
        zz4i.zzZ(this.zzZ0U);
        return zz4i;
    }

    public final com.aspose.words.internal.zzG zzZ(zzYC5 zzyc5, boolean z) throws Exception {
        ShapeBase shapeBaseZz7u = zzyc5.zz7u();
        if (shapeBaseZz7u != null) {
            com.aspose.words.internal.zzG zzgZzY = zzY(zzyc5, true);
            if (zzgZzY != null) {
                return zzgZzY;
            }
            zzZ(shapeBaseZz7u, zzyc5);
            com.aspose.words.internal.zzG zzgZzY2 = zzY(zzyc5, true);
            if (!z) {
                zzYG(shapeBaseZz7u);
            }
            return zzgZzY2;
        }
        throw new IllegalArgumentException("DmlShape");
    }

    private static com.aspose.words.internal.zzZQ4 zzY(ShapeBase shapeBase, com.aspose.words.internal.zzZQ4 zzzq4) {
        boolean z = shapeBase.getShapeType() == 202 || shapeBase.getShapeType() == 1;
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        if (shape == null || !shape.zzY9o() || shape.getFilled() || shape.getStroked()) {
            return z ? zzzq4 : com.aspose.words.internal.zzZQ4.zz2T;
        }
        float internalMarginLeft = (float) shape.getTextBox().getInternalMarginLeft();
        float internalMarginTop = (float) shape.getTextBox().getInternalMarginTop();
        float internalMarginRight = (float) shape.getTextBox().getInternalMarginRight();
        float internalMarginBottom = (float) shape.getTextBox().getInternalMarginBottom();
        boolean z2 = ((double) (internalMarginTop + internalMarginBottom)) < shape.getHeight() && ((double) ((internalMarginLeft * 2.0f) + internalMarginRight)) < shape.getWidth();
        if (z && z2) {
            float spaceBefore = shape.getFirstParagraph() == null ? 0.0f : (float) shape.getFirstParagraph().getParagraphFormat().getSpaceBefore();
            return new com.aspose.words.internal.zzZQ4(shape.zzY9h().zzZyh() + internalMarginLeft, (zzzq4.getY() - internalMarginTop) - spaceBefore, (float) ((shape.getWidth() - ((double) internalMarginRight)) - ((double) (internalMarginLeft * 2.0f))), com.aspose.words.internal.zzAN.zzR(zzzq4.getHeight() + spaceBefore + (shape.getLastParagraph() != null ? (float) shape.getLastParagraph().getParagraphFormat().getSpaceAfter() : 0.0f), (float) ((shape.getHeight() - ((double) internalMarginTop)) - ((double) internalMarginBottom))));
        }
        return new com.aspose.words.internal.zzZQ4(shape.zzY9h().zzZyh(), shape.zzY9h().zzZyg(), (float) shape.getWidth(), (float) shape.getHeight());
    }

    private void zzZ(ShapeBase shapeBase, zzYC5 zzyc5) throws Exception {
        zzZC5 zzzc5ZzZvk = zzZvk();
        zzX0 zzx0ZzZ = zz09.zzZ(shapeBase, zzzc5ZzZvk);
        if (zzx0ZzZ == null) {
            zzx0ZzZ = new zzX0(new com.aspose.words.internal.zzG());
        } else {
            zzGM.zzD(zzx0ZzZ.zz7v());
            zzx0ZzZ.zzX(zzZ(zzyc5, shapeBase, zzx0ZzZ));
        }
        for (Map.Entry<ShapeBase, com.aspose.words.internal.zzZL> entry : zzzc5ZzZvk.zzZxM().entrySet()) {
            zzZ(entry.getKey(), entry.getValue());
        }
        zzZ(shapeBase, zzx0ZzZ);
    }

    private void zzZ(ShapeBase shapeBase, com.aspose.words.internal.zzZL zzzl) throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzzl);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZMR().zzZ((com.aspose.words.internal.zzZL) zzg);
        zzX0 zzx0 = new zzX0(zzg);
        zzx0.zz1(zzzq4ZzZ);
        zzx0.zz2(zzzq4ZzZ);
        zzx0.zzX(new zzYLC(zzzq4ZzZ));
        zzZ(shapeBase, zzx0);
    }

    private zzYLC zzZ(zzYC5 zzyc5, ShapeBase shapeBase, zzX0 zzx0) throws Exception {
        long[] jArrZzY = zzY(zzyc5, shapeBase, zzx0);
        zzY5C zzy5c = (jArrZzY == null && zzyc5.zzYMg()) ? new zzY5C(this.zzYUo) : null;
        if (zzy5c != null) {
            zzy5c.zzS(zzx0.zz7v(), zzx0.zz7s());
            return zzy5c.zz6L();
        }
        if (jArrZzY != null) {
            return new zzYLC(jArrZzY);
        }
        return null;
    }
}
