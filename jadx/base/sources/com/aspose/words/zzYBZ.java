package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBZ {
    public static zzYB5 zzX(ShapeBase shapeBase, Paragraph paragraph) {
        zzYB5 zzyb5 = new zzYB5();
        Shape shape = (Shape) paragraph.getAncestor(18);
        Cell cell = (Cell) paragraph.getAncestor(7);
        if (shape != null) {
            zzyb5.setWidth(shape.getWidth());
            zzyb5.setHeight(shape.getHeight());
            return zzyb5;
        }
        if (cell == null) {
            zzYB5 zzyb5ZzY = zzY(shapeBase, paragraph);
            return !zzyb5ZzY.isEmpty() ? zzyb5ZzY : zzyb5;
        }
        CellFormat cellFormat = cell.getCellFormat();
        if (cellFormat.getPreferredWidth().isFixed()) {
            zzyb5.setWidth((cellFormat.getPreferredWidth().getValue() - cellFormat.getLeftPadding()) - cellFormat.getRightPadding());
        } else {
            zzyb5.setWidth(cell.getCellFormat().getWidth());
        }
        zzyb5.setHeight(1584.0d);
        return zzyb5;
    }

    private static zzYB5 zzY(ShapeBase shapeBase, Paragraph paragraph) {
        Section section = (Section) paragraph.getAncestor(2);
        if (section == null) {
            return new zzYB5();
        }
        PageSetup pageSetup = section.getPageSetup();
        double dZzZ = zzZ(shapeBase, pageSetup);
        double dZzY = zzY(shapeBase, pageSetup);
        boolean z = ((double) pageSetup.zzYpY()) - dZzZ > 2.834645669291339d || ((double) pageSetup.zzYpW()) - dZzY > 2.834645669291339d;
        double pageWidth = (z ? pageSetup.getPageWidth() : pageSetup.zzYpX()) - dZzZ;
        double pageHeight = (z ? pageSetup.getPageHeight() : pageSetup.zzYpV()) - dZzY;
        zzY5Y zzy5y = (zzY5Y) section.zzYvR().get(2380);
        if (zzy5y != null) {
            for (int i = 0; i < zzy5y.getCount(); i++) {
                double width = zzy5y.get(i).getWidth();
                if (!com.aspose.words.internal.zzAN.zzZD(width)) {
                    pageWidth = Math.min(pageWidth, width);
                }
            }
        }
        return new zzYB5(pageWidth, pageHeight);
    }

    public static double zzZ(ShapeBase shapeBase, double d, boolean z, String str) {
        if (d < 0.0d) {
            if (!z) {
                return 0.0d;
            }
            throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Shape {0} cannot be less than 0.", str) + "\r\nParameter name: value");
        }
        if (d <= 1584.0d || !shapeBase.isTopLevel() || shapeBase.getParentNode() == null) {
            return d;
        }
        if (!z) {
            return 0.75d;
        }
        throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Shape {0} cannot be greater than {1} points.", str, com.aspose.words.internal.zzJB.zzZZ(1584.0d)) + "\r\nParameter name: value");
    }

    public static zzYB5 zzZ(ShapeBase shapeBase, double d, double d2, zzYB5 zzyb5, double d3) throws Exception {
        zzYB5 zzyb52;
        zzYB5 zzyb5ZzY = zzY(shapeBase, d, d2, zzyb5);
        if (zzZ(shapeBase, d, d2, zzyb5ZzY)) {
            zzyb52 = zzX(shapeBase, (Paragraph) shapeBase.getAncestor(8));
        } else {
            zzyb52 = new zzYB5(1584.0d, 1584.0d);
        }
        return zzZ(zzyb5ZzY, zzyb52, d3);
    }

    private static boolean zzZ(zzYB5 zzyb5) {
        return zzyb5.getWidth() >= 1584.0d || zzyb5.getHeight() >= 1584.0d;
    }

    private static double zzZ(ShapeBase shapeBase, PageSetup pageSetup) {
        double left;
        float fZzYpY;
        switch (shapeBase.getRelativeHorizontalPosition()) {
            case 0:
                left = shapeBase.getLeft();
                fZzYpY = pageSetup.zzYpY();
                break;
            case 1:
            case 4:
            case 6:
                return shapeBase.getLeft();
            case 2:
            case 3:
                left = shapeBase.getLeft();
                fZzYpY = pageSetup.zzYpY();
                break;
            case 5:
            case 7:
                left = shapeBase.getLeft();
                fZzYpY = pageSetup.zzYpX();
                break;
            default:
                left = shapeBase.getLeft();
                fZzYpY = pageSetup.zzYpY();
                break;
        }
        return left + ((double) fZzYpY);
    }

    private static double zzY(ShapeBase shapeBase, PageSetup pageSetup) {
        double top;
        float fZzYpW;
        switch (shapeBase.getRelativeVerticalPosition()) {
            case 0:
                top = shapeBase.getTop();
                fZzYpW = pageSetup.zzYpW();
                break;
            case 1:
            case 4:
            case 6:
                return shapeBase.getTop();
            case 2:
            case 3:
                top = shapeBase.getTop();
                fZzYpW = pageSetup.zzYpW();
                break;
            case 5:
            case 7:
                top = shapeBase.getTop();
                fZzYpW = pageSetup.zzYpV();
                break;
            default:
                top = shapeBase.getTop();
                fZzYpW = pageSetup.zzYpW();
                break;
        }
        return top + ((double) fZzYpW);
    }

    private static boolean zzZ(ShapeBase shapeBase, double d, double d2, zzYB5 zzyb5) {
        if (d > 0.0d && d2 > 0.0d) {
            return false;
        }
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getAncestor(18), Shape.class);
        if (shape != null && shape.zzY9P()) {
            return true;
        }
        if (shapeBase.getParentNode() != null) {
            Cell cell = (Cell) shapeBase.getAncestor(7);
            if (zzZ(zzyb5)) {
                if (cell == null || !cell.getParentRow().getParentTable().getAllowAutoFit()) {
                    return true;
                }
            } else if (cell != null) {
                if (!cell.getParentRow().getParentTable().getAllowAutoFit()) {
                    PreferredWidth preferredWidth = cell.getCellFormat().getPreferredWidth();
                    if (preferredWidth.isFixed() && zzyb5.getWidth() > preferredWidth.getValue()) {
                        return true;
                    }
                }
            } else {
                zzYB5 zzyb5ZzY = zzY(shapeBase, (Paragraph) shapeBase.getAncestor(8));
                if (zzyb5.zzY(zzyb5ZzY) && !zzyb5ZzY.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzYB5 zzY(ShapeBase shapeBase, double d, double d2, zzYB5 zzyb5) throws Exception {
        if (d > 0.0d && d2 > 0.0d) {
            return new zzYB5(d, d2);
        }
        if (zzyb5 != null) {
            return zzyb5;
        }
        com.aspose.words.internal.zzEG zzegZzY9Y = shapeBase.zzY9Y();
        if (d <= 0.0d) {
            d = zzegZzY9Y.getWidthPoints();
        }
        if (d2 <= 0.0d) {
            d2 = zzegZzY9Y.getHeightPoints();
        }
        return new zzYB5(d, d2);
    }

    public static zzYB5 zzZ(zzYB5 zzyb5, zzYB5 zzyb52, double d) {
        if (zzyb52.isEmpty()) {
            return zzyb5;
        }
        if (zzyb5.isEmpty()) {
            zzyb5 = new zzYB5(432.0d, 252.0d);
        } else if (zzyb5.getWidth() <= zzyb52.getWidth() && zzyb5.getHeight() <= zzyb52.getHeight()) {
            return zzyb5;
        }
        zzYB5 zzyb53 = new zzYB5();
        int iZzZG = com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzAN.zzZJ(d));
        double height = zzyb52.getHeight();
        double width = zzyb52.getWidth();
        if (iZzZG == 90 || iZzZG == 270) {
            height = zzyb52.getWidth();
            width = zzyb52.getHeight();
        }
        double width2 = zzyb5.getWidth() / width;
        double height2 = zzyb5.getHeight() / height;
        if (width2 > height2) {
            zzyb53.setHeight((height2 / width2) * height);
            zzyb53.setWidth(width);
            return zzyb53;
        }
        zzyb53.setWidth((width2 / height2) * width);
        zzyb53.setHeight(height);
        return zzyb53;
    }
}
