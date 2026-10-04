package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYG {
    private static void zzO(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (shapeBase.getMarkupLanguage() == 1) {
            zzY27.zzZ(shapeBase, true, zzzydZzZlV, zzzxr);
            zzzydZzZlV.zzp();
        } else {
            zz8H.zzZ(shapeBase, zzzxr);
            zz8H.zzS(shapeBase, zzzxr);
        }
    }

    public static void zzU(zzZXR zzzxr) throws Exception {
        Shape backgroundShape = zzzxr.zzZqS().zzYfy.getBackgroundShape();
        if (Shape.zzZG(backgroundShape)) {
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            zzzydZzZlV.zzY("w:background");
            com.aspose.words.internal.zzPV zzpvZz8Q = (com.aspose.words.internal.zzPV) backgroundShape.getDirectShapeAttr(385);
            if (zzpvZz8Q == null) {
                zzpvZz8Q = backgroundShape.zzY9J().zz8Q();
            }
            zzzydZzZlV.zzX("w:color", zzZYD.zzg(zzpvZz8Q));
            if (backgroundShape.zzY9n() == null || zzzxr.getCompliance() != 2) {
                zzO(backgroundShape, zzzxr);
            } else {
                zzZ(backgroundShape, zzzxr);
            }
            zzzydZzZlV.zzp();
        }
    }

    private static void zzZ(Shape shape, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("mc:AlternateContent");
        zzzydZzZlV.zzY("mc:Choice");
        zzzydZzZlV.zz0("Requires", zzZXR.zzk(shape));
        zzO(shape, zzzxr);
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzY("mc:Fallback");
        zzO(shape.zzY9n(), zzzxr);
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzo();
    }
}
