package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzLR {
    private static double zzF(Border border) {
        if (border == null || !border.isVisible()) {
            return 0.0d;
        }
        return zzQS.zzH(border) / 2.0f;
    }

    public static boolean zzU(zzWP zzwp) {
        return (zzwp.getOrientation() == 0 || zzwp.getOrientation() == 4) ? false : true;
    }

    public static double zzX(Table table) {
        return table.getCellSpacing() * 2.0d;
    }

    public static zzLU zzY(zzWG zzwg) {
        zzLU zzlu = new zzLU();
        RowFormat rowFormat = zzwg.zz4Z().getRowFormat();
        double dZz4V = zzwg.zz4V() > 0.0d ? zzwg.zz4V() : rowFormat.getHeightRule() != 2 ? rowFormat.getHeight() : -1.7976931348623157E308d;
        if (dZz4V > 0.0d) {
            zzlu.zzZ("height", dZz4V, 4);
        }
        return zzlu;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8 A[PHI: r0 r1 r3
      0x00e8: PHI (r0v13 com.aspose.words.Border) = (r0v12 com.aspose.words.Border), (r0v12 com.aspose.words.Border), (r0v26 com.aspose.words.Border) binds: [B:20:0x00a7, B:22:0x00ad, B:33:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r1v2 com.aspose.words.Border) = (r1v1 com.aspose.words.Border), (r1v1 com.aspose.words.Border), (r1v5 com.aspose.words.Border) binds: [B:20:0x00a7, B:22:0x00ad, B:33:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r3v10 com.aspose.words.Border) = (r3v9 com.aspose.words.Border), (r3v9 com.aspose.words.Border), (r3v13 com.aspose.words.Border) binds: [B:20:0x00a7, B:22:0x00ad, B:33:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzLU zzZ(zzWH zzwh, int i, boolean z, boolean z2, boolean z3) {
        Border border;
        Border border2;
        Border border3;
        Border border4;
        zzLU zzlu = new zzLU();
        zzWP zzwpZz5r = zzwh.zz6G().zz5r();
        if (zzwh.zzBx() <= 1 || zzwpZz5r.getPreferredWidth().getType() != 2) {
            int type = zzwpZz5r.getPreferredWidth().getType();
            if (type != 2) {
                if (type == 3 && i == 0) {
                    double dZzZ = zzZ(zzwpZz5r, z3);
                    if (dZzZ > 0.0d) {
                        zzlu.zzZ("width", dZzZ, 4);
                    }
                }
            } else if (i != 2) {
                zzlu.zzU("width", zzwpZz5r.getPreferredWidth().getValue());
            }
        }
        zzlu.zzZs("vertical-align", zzZDY.zzyI(zzwpZz5r.getVerticalAlignment()));
        zzZ(((double) zzwpZz5r.getTopPadding()) / 20.0d, zzZ(zzwpZz5r.getRightPadding(), zzwpZz5r.zz5x(), z3), ((double) zzwpZz5r.getBottomPadding()) / 20.0d, zzZ(zzwpZz5r.getLeftPadding(), zzwpZz5r.zz5y(), z3), zzlu);
        if (z2) {
            zzZ(zzwpZz5r, zzlu);
        }
        zzM9.zzZ(zzwpZz5r.getShading(), zzlu);
        Border borderZz5A = zzwpZz5r.zz5A();
        Border borderZz5z = zzwpZz5r.zz5z();
        Border borderZz5y = zzwpZz5r.zz5y();
        Border borderZz5x = zzwpZz5r.zz5x();
        if (!z || zzwh.zz52() == null) {
            border = borderZz5z;
            border2 = borderZz5y;
            border3 = borderZz5x;
            border4 = borderZz5A;
        } else {
            if (zzwh.zz52().getParentRow().isFirstRow()) {
                borderZz5A = null;
            }
            if (zzwh.zz52().getParentRow().isLastRow()) {
                borderZz5z = null;
            }
            if (zzwh.zz52().isFirstCell()) {
                borderZz5y = null;
            }
            if (zzwh.zz52().isLastCell()) {
                border4 = borderZz5A;
                border2 = borderZz5y;
                border3 = null;
                border = borderZz5z;
            }
        }
        zzQS.zzZ(zzlu, border4, border2, border, border3, false, zzwh.zz52() != null && zzwh.zz52().getParentRow().getParentTable().getBidi(), z2, true);
        if (zzU(zzwpZz5r) && zzwh.zz52() != null) {
            zzZ(zzlu, zzwh.zz52());
            if (zzwpZz5r.getOrientation() == 3) {
                zzL2 zzl2 = new zzL2(new zzPP(180.0d));
                zzlu.zzZ("-moz-transform", "rotate", zzl2);
                zzlu.zzZ("transform", "rotate", zzl2);
                zzlu.zzZ("-webkit-transform", "rotate", zzl2);
                zzlu.zzZ("-ms-transform", "rotate", zzl2);
            }
        }
        return zzlu;
    }

    public static void zzZ(zzLU zzlu, Cell cell) {
        int orientation = cell.zz6G().zz5r().getOrientation();
        zzlu.zzZs("writing-mode", zzL5.zzM7(orientation));
        if (orientation == 1 || orientation == 3 || orientation == 5) {
            zzlu.zzZs("overflow", "hidden");
            int verticalAlignment = cell.zz6G().zz5r().getVerticalAlignment();
            if (verticalAlignment == 0) {
                zzlu.zzZs("margin-left", "auto");
            } else if (verticalAlignment == 1) {
                zzlu.zzZs("margin-left", "auto");
                zzlu.zzZs("margin-right", "auto");
            }
        }
        zzlu.zzZ("height", cell.getParentRow().getRowFormat().getHeight(), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzLU zzZ(Table table, double d, int i, boolean z, boolean z2) throws Exception {
        zzLU zzlu;
        zzL4 zzoi;
        zzL4 zzl4;
        zzLU zzlu2 = new zzLU();
        PreferredWidth preferredWidth = table.getPreferredWidth();
        if (!preferredWidth.isAuto()) {
            if (preferredWidth.isFixed() && i == 0) {
                double value = preferredWidth.getValue();
                if (preferredWidth.zzYmC()) {
                    value = value + zzF(table.getFirstRow().getFirstCell().getCellFormat().getBorders().getLeft()) + zzF(table.getFirstRow().getLastCell().getCellFormat().getBorders().getRight());
                }
                zzlu2.zzZ("width", value, 4);
            } else if (preferredWidth.zzYmB() && i != 2) {
                zzlu2.zzU("width", preferredWidth.getValue());
            }
        }
        zzY6G zzy6gZzXXa = table.getFirstRow().zzZYf().zzXXa();
        if (!zzy6gZzXXa.zzXXk() && !zzy6gZzXXa.zzXXj()) {
            zzOI zzoi2 = new zzOI(0.0d, 4);
            int alignment = zzy6gZzXXa.getAlignment();
            if (alignment == 0) {
                zzoi = new zzOI(d, 4);
            } else if (alignment == 1) {
                zzoi = zzL4.zzZng;
                zzl4 = zzoi;
                if (!zzy6gZzXXa.getBidi()) {
                    zzL4 zzl42 = zzl4;
                    zzl4 = zzoi;
                    zzoi = zzl42;
                }
                zzlu2.zzZ(zzoi2, zzoi, zzoi2, zzl4);
                zzlu = zzlu2;
            } else if (alignment == 2) {
                zzoi = zzL4.zzZng;
            } else {
                throw new IllegalStateException("Unknown table alignment.");
            }
            zzl4 = zzoi2;
            if (!zzy6gZzXXa.getBidi()) {
            }
            zzlu2.zzZ(zzoi2, zzoi, zzoi2, zzl4);
            zzlu = zzlu2;
        } else {
            int horizontalAlignment = zzy6gZzXXa.getHorizontalAlignment();
            String str = "right";
            if (horizontalAlignment == 2 ? !zzy6gZzXXa.getBidi() : horizontalAlignment != 3) {
                str = "left";
            }
            zzlu2.zzZs("float", str);
            double dZzXXl = ((double) zzy6gZzXXa.zzXXl()) / 20.0d;
            double dZzXXm = ((double) zzy6gZzXXa.zzXXm()) / 20.0d;
            double dZzXXo = ((double) zzy6gZzXXa.zzXXo()) / 20.0d;
            double dZzXXn = ((double) zzy6gZzXXa.zzXXn()) / 20.0d;
            zzlu = zzlu2;
            zzlu.zzU(dZzXXo, dZzXXm, dZzXXn, dZzXXl);
        }
        if (table.getAllowCellSpacing()) {
            zzlu.zzZs("border-collapse", "separate");
            zzlu.zzZ("border-spacing", zzX(table), 4);
            if (table.getFirstRow() != null) {
                BorderCollection borders = table.getFirstRow().getRowFormat().getBorders();
                zzQS.zzZ(zzlu, borders.getTop(), borders.getLeft(), borders.getBottom(), borders.getRight(), false, table.getBidi(), z2, false);
            }
        } else {
            zzlu.zzZs("border-collapse", "collapse");
            if (z && table.getFirstRow() != null && table.getFirstRow().getFirstCell() != null) {
                Border top = table.getFirstRow().getFirstCell().getCellFormat().getBorders().getTop();
                zzQS.zzZ(zzlu, top, top, top, top, false, table.getBidi(), z2, false);
            }
        }
        if (z2 && !table.getAllowCellSpacing()) {
            Border borderZz5u = table.getFirstRow().zzZYf().zz5u();
            if (borderZz5u != null && borderZz5u.isVisible()) {
                zzQS.zzZ(zzlu, borderZz5u, 4);
            }
            Border borderZz5t = table.getFirstRow().zzZYf().zz5t();
            if (borderZz5t != null && borderZz5t.isVisible()) {
                zzQS.zzZ(zzlu, borderZz5t, 5);
            }
        }
        return zzlu;
    }

    private static void zzZ(double d, double d2, double d3, double d4, zzLU zzlu) {
        boolean zZzZD = com.aspose.words.internal.zzAN.zzZD(d);
        boolean zZzZD2 = com.aspose.words.internal.zzAN.zzZD(d2);
        boolean zZzZD3 = com.aspose.words.internal.zzAN.zzZD(d3);
        boolean zZzZD4 = com.aspose.words.internal.zzAN.zzZD(d4);
        if (!zZzZD && !zZzZD2 && !zZzZD3 && !zZzZD4) {
            zzlu.zzT(d, d2, d3, d4);
            return;
        }
        if (!zZzZD) {
            zzlu.zzZ("padding-top", d, 4);
        }
        if (!zZzZD2) {
            zzlu.zzZ("padding-right", d2, 4);
        }
        if (!zZzZD3) {
            zzlu.zzZ("padding-bottom", d3, 4);
        }
        if (zZzZD4) {
            return;
        }
        zzlu.zzZ("padding-left", d4, 4);
    }

    private static double zzZ(int i, Border border, boolean z) {
        double d = ((double) i) / 20.0d;
        return z ? Math.max(d - zzF(border), 0.0d) : d;
    }

    private static double zzZ(zzWP zzwp, boolean z) {
        return Math.max((zzwp.getPreferredWidth().isFixed() && zzwp.getPreferredWidth().zzYmC()) ? (((zzwp.getPreferredWidth().getValue() - zzZ(zzwp.getLeftPadding(), zzwp.zz5y(), z)) - zzZ(zzwp.getRightPadding(), zzwp.zz5x(), z)) - zzF(zzwp.zz5y())) - zzF(zzwp.zz5x()) : 0.0d, 0.0d);
    }

    private static void zzZ(zzWP zzwp, zzLU zzlu) {
        zzZ(zzwp.getTopPadding(), zzwp.zz5A(), "-aw-padding-top", zzlu);
        zzZ(zzwp.getRightPadding(), zzwp.zz5x(), "-aw-padding-right", zzlu);
        zzZ(zzwp.getBottomPadding(), zzwp.zz5z(), "-aw-padding-bottom", zzlu);
        zzZ(zzwp.getLeftPadding(), zzwp.zz5y(), "-aw-padding-left", zzlu);
    }

    private static void zzZ(int i, Border border, String str, zzLU zzlu) {
        if (i == 0) {
            return;
        }
        double d = ((double) i) / 20.0d;
        if (zzF(border) >= d) {
            zzlu.zzZ(str, d, 4);
        }
    }
}
