package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3X {
    private IWarningCallback zzZG0;

    private zzY3X(IWarningCallback iWarningCallback) {
        this.zzZG0 = iWarningCallback;
    }

    private void zzLz(String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 65536, 2, str);
        }
    }

    private boolean zzQ(ShapeBase shapeBase, boolean z) {
        if (shapeBase.getMarkupLanguage() != 0) {
            return false;
        }
        zz53 zz53VarZzY9i = shapeBase.zzY9i();
        if (zz53VarZzY9i.zzZHY() == 8) {
            return zzYf(shapeBase);
        }
        if (zz53VarZzY9i.zzZHY() != 11) {
            if (zz53VarZzY9i.zzZHY() != 13) {
                return false;
            }
            zzLz("New chart types of MS Word 2016 are not supported: the chart will be rendered with using its fallback shape.");
            return true;
        }
        if (z && "application/inkml+xml".equals(((zzB4) zz53VarZzY9i).zzZF0().getContentType())) {
            return false;
        }
        zzLz("Content part is not supported and will be replaced with its fallback shape.");
        return true;
    }

    private boolean zzR(ShapeBase shapeBase, boolean z) {
        if (zzQ(shapeBase, z)) {
            return true;
        }
        if (shapeBase.zzY9i().zzZHY() != 9) {
            return false;
        }
        for (Node node : shapeBase.getChildNodes(18, true).toArray()) {
            Shape shape = (Shape) node;
            if (shape.zzY9i() != null && zzQ(shape, z)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzS(ShapeBase shapeBase, boolean z) {
        return new zzY3X(shapeBase.getDocument().getWarningCallback()).zzR(shapeBase, z);
    }

    private static boolean zzYc(ShapeBase shapeBase) {
        if (shapeBase.getDirectShapeAttr(1985) == null || ((Integer) shapeBase.getDirectShapeAttr(1985)).intValue() == 0) {
            return (shapeBase.getDirectShapeAttr(1984) == null || ((Integer) shapeBase.getDirectShapeAttr(1984)).intValue() == 0) ? false : true;
        }
        return true;
    }

    private boolean zzYd(ShapeBase shapeBase) {
        int iZzZPy = ((zz2O) shapeBase.zzY9i()).zzZTd().zzZvF().zzZPy();
        switch (iZzZPy) {
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                zzLz("Some of DrawingML shape features are not supported upon rendering.DrawingML shape will be replaced with its fallback VML shape.");
                return true;
            default:
                if ((iZzZPy != 0 && iZzZPy != 2 && iZzZPy != 6 && iZzZPy != 8 && iZzZPy != 10 && iZzZPy != 11 && iZzZPy != 15 && iZzZPy != 16) || !zzYc(shapeBase)) {
                    return false;
                }
                zzLz("Some of DrawingML shape features are not supported upon rendering.DrawingML shape will be replaced with its fallback VML shape.");
                return true;
        }
    }

    private static boolean zzYe(ShapeBase shapeBase) {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getDocument(), Document.class);
        return (document == null || document.getCompatibilityOptions().zzZYT().zzRZ("doNotFlipMirrorIndents") == null) ? false : true;
    }

    private boolean zzYf(ShapeBase shapeBase) {
        int relativeHorizontalPosition;
        zz53 zz53VarZzY9i = shapeBase.zzY9i();
        if (shapeBase.zzYac() && (((relativeHorizontalPosition = shapeBase.getRelativeHorizontalPosition()) == 6 || relativeHorizontalPosition == 7) && com.aspose.words.internal.zzAN.zzZH(zz53VarZzY9i.getRotation()) && zzYe(shapeBase))) {
            zzLz("Some of DrawingML shape features are not supported upon rendering.DrawingML shape will be replaced with its fallback VML shape.");
            return true;
        }
        zz2O zz2o = (zz2O) zz53VarZzY9i;
        if (zz2o.zzZTd() == null) {
            return false;
        }
        if (zzYd(shapeBase)) {
            return true;
        }
        if (!shapeBase.zzYac() || zz2o.getFill().zzZQ4() != 5 || zz2o.zzZTg() == 255) {
            return false;
        }
        zzLz("Some of DrawingML shape features are not supported upon rendering.DrawingML shape will be replaced with its fallback VML shape.");
        return true;
    }
}
