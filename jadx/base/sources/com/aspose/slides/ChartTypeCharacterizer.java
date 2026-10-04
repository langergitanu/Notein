package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class ChartTypeCharacterizer {
    /* JADX INFO: renamed from: c5 */
    public static boolean m755c5(int i) {
        return i == 48 || i == 51;
    }

    /* JADX INFO: renamed from: ck */
    public static int m756ck(int i) {
        switch (i) {
            case 0:
                return 10;
            case 1:
                return 11;
            case 2:
                return 12;
            case 3:
            case 7:
            case 11:
            case 15:
                return 30;
            case 4:
                return 35;
            case 5:
                return 31;
            case 6:
            case 10:
            case 14:
            case 18:
                return 29;
            case 8:
                return 37;
            case 9:
                return 33;
            case 12:
                return 36;
            case 13:
                return 32;
            case 16:
                return 38;
            case 17:
                return 34;
            case 19:
            case 22:
                return 13;
            case 20:
            case 23:
                return 14;
            case 21:
            case 24:
                return 15;
            case 25:
                return 27;
            case 26:
            case 29:
                return 3;
            case 27:
            case 30:
                return 28;
            case 28:
                return 1;
            case 31:
                return 0;
            case 32:
                return 9;
            case 33:
            case 38:
            case 41:
            case 44:
                return 39;
            case 34:
                return 7;
            case 35:
                return 8;
            case 36:
                return 40;
            case 37:
                return 44;
            case 39:
                return 42;
            case 40:
                return 46;
            case 42:
                return 41;
            case 43:
                return 45;
            case 45:
                return 43;
            case 46:
                return 47;
            case 47:
                return 4;
            case 48:
                return 6;
            case 49:
                return 5;
            case 50:
                return 24;
            case 51:
                return 25;
            case 52:
                return 26;
            case 53:
            case 56:
            case 57:
                return 22;
            case 54:
            case 55:
                return 23;
            case 58:
                return 18;
            case 59:
                return 19;
            case 60:
                return 20;
            case 61:
                return 21;
            case 62:
                return 50;
            case 63:
                return 51;
            case 64:
                return 48;
            case 65:
                return 49;
            case 66:
            case 67:
                return 2;
            case 68:
            case 69:
                return 52;
            case 70:
            case 71:
                return 16;
            case 72:
                return 17;
            case 73:
            default:
                throw new IndexOutOfRangeException();
            case 74:
                return 58;
            case 75:
                return 60;
            case 76:
                return 53;
            case 77:
                return 54;
            case 78:
                return 55;
            case 79:
                return 56;
            case 80:
                return 57;
            case 81:
                return 59;
        }
    }

    /* JADX INFO: renamed from: du */
    public static boolean m757du(int i) {
        if (i == 70 || i == 71) {
            return true;
        }
        switch (i) {
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return true;
            default:
                switch (i) {
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m758dy(int i) {
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 12:
            case 16:
            case 20:
            case 23:
            case 35:
            case 36:
            case 39:
            case 42:
            case 45:
            case 48:
            case 51:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: fa */
    public static boolean m759fa(int i) {
        int iM756ck = m756ck(i);
        return iM756ck == 58 || iM756ck == 60;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m760h4(int i) {
        return i == 49 || i == 52;
    }

    public static boolean hasSeriesTrendLines(int i) {
        if (i == 0 || i == 34 || i == 47 || i == 19 || i == 20 || i == 22 || i == 23 || i == 68 || i == 69) {
            return true;
        }
        switch (i) {
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                return true;
            default:
                return false;
        }
    }

    public static boolean is2DChart(int i) {
        int iM756ck = m756ck(i);
        if (iM756ck == 52 || iM756ck == 53 || iM756ck == 60) {
            return true;
        }
        switch (iM756ck) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return true;
            default:
                switch (iM756ck) {
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static boolean is3DChart(int i) {
        if (i == 73) {
            return false;
        }
        switch (m756ck(i)) {
        }
        return false;
    }

    public static boolean isBar3DChart(int i) {
        if (i == 33) {
            return true;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return true;
            default:
                switch (i) {
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static boolean isChartTypeArea(int i) {
        switch (i) {
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                return true;
            default:
                return false;
        }
    }

    public static boolean isChartTypeBar(int i) {
        switch (i) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                return true;
            default:
                return false;
        }
    }

    public static boolean isChartTypeBubble(int i) {
        return i == 68 || i == 69;
    }

    public static boolean isChartTypeColumn(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return true;
            default:
                return false;
        }
    }

    public static boolean isChartTypeDoughnut(int i) {
        return i == 66 || i == 67;
    }

    public static boolean isChartTypeLine(int i) {
        switch (i) {
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return true;
            default:
                return false;
        }
    }

    public static boolean isChartTypePie(int i) {
        switch (i) {
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    public static boolean isChartTypeRadar(int i) {
        switch (i) {
            case 70:
            case 71:
            case 72:
                return true;
            default:
                return false;
        }
    }

    public static boolean isChartTypeScatter(int i) {
        switch (i) {
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return true;
            default:
                return false;
        }
    }

    public static boolean isChartTypeStock(int i) {
        switch (i) {
            case 58:
            case 59:
            case 60:
            case 61:
                return true;
            default:
                return false;
        }
    }

    public static boolean isChartTypeSurface(int i) {
        switch (i) {
            case 62:
            case 63:
            case 64:
            case 65:
                return true;
            default:
                return false;
        }
    }

    public static boolean isErrorBarsXAllowed(int i) {
        int iM756ck = m756ck(i);
        if (iM756ck == 22 || iM756ck == 23 || iM756ck == 52) {
            return true;
        }
        switch (iM756ck) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean isErrorBarsYAllowed(int i) {
        int iM756ck = m756ck(i);
        if (iM756ck == 4 || iM756ck == 5 || iM756ck == 6 || iM756ck == 27 || iM756ck == 52) {
            return true;
        }
        switch (iM756ck) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                switch (iM756ck) {
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static boolean isSeriesUsesBubbleSizeCoordinate(int i) {
        return m756ck(i) == 52;
    }

    public static boolean isSeriesUsesValueCoordinate(int i) {
        switch (m756ck(i)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            case 25:
            case 26:
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
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 55:
            case 56:
            case 57:
                return true;
            case 22:
            case 23:
            case 52:
            case 54:
            default:
                return false;
        }
    }

    public static boolean isSeriesUsesXValueCoordinate(int i) {
        int iM756ck = m756ck(i);
        return iM756ck == 22 || iM756ck == 23 || iM756ck == 52;
    }

    public static boolean isSeriesUsesYValueCoordinate(int i) {
        int iM756ck = m756ck(i);
        return iM756ck == 22 || iM756ck == 23 || iM756ck == 52;
    }

    /* JADX INFO: renamed from: jd */
    public static boolean m761jd(int i) {
        switch (i) {
            case 2:
            case 5:
            case 9:
            case 13:
            case 17:
            case 21:
            case 24:
            case 32:
            case 37:
            case 40:
            case 43:
            case 46:
            case 49:
            case 52:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m762k4(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 47:
            case 48:
            case 49:
            case 51:
            case 52:
            case 58:
            case 59:
            case 60:
            case 61:
                return 2;
            case 6:
            case 10:
            case 14:
            case 18:
            case 25:
            case 50:
            case 62:
            case 63:
            case 64:
            case 65:
                return 6;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 66:
            case 67:
            case 74:
            case 75:
            case 81:
                return 0;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                return 4;
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 68:
            case 69:
                return 5;
            case 70:
            case 71:
            case 72:
                return 3;
            case 73:
            default:
                throw new IndexOutOfRangeException();
            case 76:
            case 78:
            case 79:
                return 7;
            case 77:
                return 8;
            case 80:
                return 1;
        }
    }

    /* JADX INFO: renamed from: kk */
    public static String m765kk(int i) {
        if (i == 0) {
            return "both Horizontal and Vertical axes are not needed (Series axis also not needed)";
        }
        if (i == 2) {
            return "Horizontal axis - Category, Vertical axis - Value, Series axis - not needed";
        }
        if (i == 3) {
            return "Horizontal axis - Radar Category, Vertical axis - Radar Value, Series axis - not needed";
        }
        if (i == 4) {
            return "Horizontal axis - Value, Vertical axis - Category, Series axis - not needed";
        }
        if (i == 5) {
            return C14113y2.m67408k4("Horizontal axis - Value or Category, Vertical axis - Value or Category, ", "Series axis - not needed");
        }
        if (i == 6) {
            return "Horizontal axis - Value, Vertical axis - Category, Series axis - is needed";
        }
        throw new ArgumentOutOfRangeException("compositionType");
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m766m9(int i) {
        if (i == 70 || i == 71) {
            return true;
        }
        switch (i) {
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return true;
            default:
                switch (i) {
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX INFO: renamed from: to */
    public static boolean m767to(int i) {
        switch (i) {
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: up */
    public static boolean m768up(int i) {
        switch (i) {
            case 76:
            case 77:
            case 78:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static int m769x1(int i) {
        if (i == 76) {
            return 0;
        }
        if (i != 79) {
            return i != 80 ? 150 : 6;
        }
        return 50;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m763k4(Chart chart) {
        return is3DChart(chart.getType()) || chart.getType() == 70 || chart.getType() == 72 || chart.getType() == 71;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m764k4(IChartSeries iChartSeries, IChartSeriesGroup iChartSeriesGroup) {
        return m756ck(iChartSeries.getType()) == iChartSeriesGroup.getType() && iChartSeries.getPlotOnSecondAxis() == iChartSeriesGroup.getPlotOnSecondAxis();
    }
}
