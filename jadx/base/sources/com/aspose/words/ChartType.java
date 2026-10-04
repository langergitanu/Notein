package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartType {
    public static final int AREA = 0;
    public static final int AREA_3_D = 3;
    public static final int AREA_3_D_PERCENT_STACKED = 5;
    public static final int AREA_3_D_STACKED = 4;
    public static final int AREA_PERCENT_STACKED = 2;
    public static final int AREA_STACKED = 1;
    public static final int BAR = 6;
    public static final int BAR_3_D = 9;
    public static final int BAR_3_D_PERCENT_STACKED = 11;
    public static final int BAR_3_D_STACKED = 10;
    public static final int BAR_PERCENT_STACKED = 8;
    public static final int BAR_STACKED = 7;
    public static final int BUBBLE = 12;
    public static final int BUBBLE_3_D = 13;
    public static final int COLUMN = 14;
    public static final int COLUMN_3_D = 17;
    public static final int COLUMN_3_D_CLUSTERED = 20;
    public static final int COLUMN_3_D_PERCENT_STACKED = 19;
    public static final int COLUMN_3_D_STACKED = 18;
    public static final int COLUMN_PERCENT_STACKED = 16;
    public static final int COLUMN_STACKED = 15;
    public static final int DOUGHNUT = 21;
    public static final int LINE = 22;
    public static final int LINE_3_D = 25;
    public static final int LINE_PERCENT_STACKED = 24;
    public static final int LINE_STACKED = 23;
    public static final int PIE = 26;
    public static final int PIE_3_D = 27;
    public static final int PIE_OF_BAR = 28;
    public static final int PIE_OF_PIE = 29;
    public static final int RADAR = 30;
    public static final int SCATTER = 31;
    public static final int STOCK = 32;
    public static final int SURFACE = 33;
    public static final int SURFACE_3_D = 34;
    public static final int length = 35;

    private ChartType() {
    }

    public static int fromName(String str) {
        if ("AREA".equals(str)) {
            return 0;
        }
        if ("AREA_STACKED".equals(str)) {
            return 1;
        }
        if ("AREA_PERCENT_STACKED".equals(str)) {
            return 2;
        }
        if ("AREA_3_D".equals(str)) {
            return 3;
        }
        if ("AREA_3_D_STACKED".equals(str)) {
            return 4;
        }
        if ("AREA_3_D_PERCENT_STACKED".equals(str)) {
            return 5;
        }
        if ("BAR".equals(str)) {
            return 6;
        }
        if ("BAR_STACKED".equals(str)) {
            return 7;
        }
        if ("BAR_PERCENT_STACKED".equals(str)) {
            return 8;
        }
        if ("BAR_3_D".equals(str)) {
            return 9;
        }
        if ("BAR_3_D_STACKED".equals(str)) {
            return 10;
        }
        if ("BAR_3_D_PERCENT_STACKED".equals(str)) {
            return 11;
        }
        if ("BUBBLE".equals(str)) {
            return 12;
        }
        if ("BUBBLE_3_D".equals(str)) {
            return 13;
        }
        if ("COLUMN".equals(str)) {
            return 14;
        }
        if ("COLUMN_STACKED".equals(str)) {
            return 15;
        }
        if ("COLUMN_PERCENT_STACKED".equals(str)) {
            return 16;
        }
        if ("COLUMN_3_D".equals(str)) {
            return 17;
        }
        if ("COLUMN_3_D_STACKED".equals(str)) {
            return 18;
        }
        if ("COLUMN_3_D_PERCENT_STACKED".equals(str)) {
            return 19;
        }
        if ("COLUMN_3_D_CLUSTERED".equals(str)) {
            return 20;
        }
        if ("DOUGHNUT".equals(str)) {
            return 21;
        }
        if ("LINE".equals(str)) {
            return 22;
        }
        if ("LINE_STACKED".equals(str)) {
            return 23;
        }
        if ("LINE_PERCENT_STACKED".equals(str)) {
            return 24;
        }
        if ("LINE_3_D".equals(str)) {
            return 25;
        }
        if ("PIE".equals(str)) {
            return 26;
        }
        if ("PIE_3_D".equals(str)) {
            return 27;
        }
        if ("PIE_OF_BAR".equals(str)) {
            return 28;
        }
        if ("PIE_OF_PIE".equals(str)) {
            return 29;
        }
        if ("RADAR".equals(str)) {
            return 30;
        }
        if ("SCATTER".equals(str)) {
            return 31;
        }
        if ("STOCK".equals(str)) {
            return 32;
        }
        if ("SURFACE".equals(str)) {
            return 33;
        }
        if ("SURFACE_3_D".equals(str)) {
            return 34;
        }
        throw new IllegalArgumentException("Unknown ChartType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "AREA";
            case 1:
                return "AREA_STACKED";
            case 2:
                return "AREA_PERCENT_STACKED";
            case 3:
                return "AREA_3_D";
            case 4:
                return "AREA_3_D_STACKED";
            case 5:
                return "AREA_3_D_PERCENT_STACKED";
            case 6:
                return "BAR";
            case 7:
                return "BAR_STACKED";
            case 8:
                return "BAR_PERCENT_STACKED";
            case 9:
                return "BAR_3_D";
            case 10:
                return "BAR_3_D_STACKED";
            case 11:
                return "BAR_3_D_PERCENT_STACKED";
            case 12:
                return "BUBBLE";
            case 13:
                return "BUBBLE_3_D";
            case 14:
                return "COLUMN";
            case 15:
                return "COLUMN_STACKED";
            case 16:
                return "COLUMN_PERCENT_STACKED";
            case 17:
                return "COLUMN_3_D";
            case 18:
                return "COLUMN_3_D_STACKED";
            case 19:
                return "COLUMN_3_D_PERCENT_STACKED";
            case 20:
                return "COLUMN_3_D_CLUSTERED";
            case 21:
                return "DOUGHNUT";
            case 22:
                return "LINE";
            case 23:
                return "LINE_STACKED";
            case 24:
                return "LINE_PERCENT_STACKED";
            case 25:
                return "LINE_3_D";
            case 26:
                return "PIE";
            case 27:
                return "PIE_3_D";
            case 28:
                return "PIE_OF_BAR";
            case 29:
                return "PIE_OF_PIE";
            case 30:
                return "RADAR";
            case 31:
                return "SCATTER";
            case 32:
                return "STOCK";
            case 33:
                return "SURFACE";
            case 34:
                return "SURFACE_3_D";
            default:
                return "Unknown ChartType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Area";
            case 1:
                return "AreaStacked";
            case 2:
                return "AreaPercentStacked";
            case 3:
                return "Area3D";
            case 4:
                return "Area3DStacked";
            case 5:
                return "Area3DPercentStacked";
            case 6:
                return "Bar";
            case 7:
                return "BarStacked";
            case 8:
                return "BarPercentStacked";
            case 9:
                return "Bar3D";
            case 10:
                return "Bar3DStacked";
            case 11:
                return "Bar3DPercentStacked";
            case 12:
                return "Bubble";
            case 13:
                return "Bubble3D";
            case 14:
                return "Column";
            case 15:
                return "ColumnStacked";
            case 16:
                return "ColumnPercentStacked";
            case 17:
                return "Column3D";
            case 18:
                return "Column3DStacked";
            case 19:
                return "Column3DPercentStacked";
            case 20:
                return "Column3DClustered";
            case 21:
                return "Doughnut";
            case 22:
                return "Line";
            case 23:
                return "LineStacked";
            case 24:
                return "LinePercentStacked";
            case 25:
                return "Line3D";
            case 26:
                return "Pie";
            case 27:
                return "Pie3D";
            case 28:
                return "PieOfBar";
            case 29:
                return "PieOfPie";
            case 30:
                return "Radar";
            case 31:
                return "Scatter";
            case 32:
                return "Stock";
            case 33:
                return "Surface";
            case 34:
                return "Surface3D";
            default:
                return "Unknown ChartType value.";
        }
    }
}
