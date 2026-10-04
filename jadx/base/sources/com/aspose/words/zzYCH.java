package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCH {
    public static double zzYI(ShapeBase shapeBase) {
        double top = shapeBase.getTop();
        if (shapeBase.getRelativeVerticalPosition() != 1) {
            return top;
        }
        Section section = (Section) shapeBase.getAncestor(2);
        if (top > section.getPageSetup().getTopMargin()) {
            return top - section.getPageSetup().getTopMargin();
        }
        return 0.0d;
    }

    public static double zzYJ(ShapeBase shapeBase) {
        int horizontalAlignment = shapeBase.getHorizontalAlignment();
        if (horizontalAlignment != 1) {
            if (horizontalAlignment == 2) {
                return (((double) ((Section) shapeBase.getAncestor(2)).getPageSetup().zzYRX()) - shapeBase.getWidth()) / 2.0d;
            }
            if (horizontalAlignment != 3) {
                if (horizontalAlignment != 4) {
                    if (horizontalAlignment != 5) {
                        double left = shapeBase.getLeft();
                        if (shapeBase.getRelativeHorizontalPosition() != 1) {
                            return left;
                        }
                        Section section = (Section) shapeBase.getAncestor(2);
                        if (left > section.getPageSetup().getLeftMargin()) {
                            return left - section.getPageSetup().getLeftMargin();
                        }
                        return 0.0d;
                    }
                }
            }
            return ((double) ((Section) shapeBase.getAncestor(2)).getPageSetup().zzYRX()) - shapeBase.getWidth();
        }
        return 0.0d;
    }
}
