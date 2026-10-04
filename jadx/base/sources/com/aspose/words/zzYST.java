package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzYST {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("angle-offset", "auto-position", "auto-size", "axis-label-position", "axis-position", "connect-bars", "data-label-number", "data-label-symbol", "data-label-text", "deep", "display-label", "error-category", "error-lower-indicator", "error-lower-limit", "error-lower-range", "error-margin", "error-percentage", "error-upper-indicator", "error-upper-limit", "error-upper-range", "gap-width", "group-bars-per-axis", "hole-size", "include-hidden-cells", "interpolation", "interval-major", "interval-minor-divisor", "japanese-candle-stick", "label-arrangement", "label-position", "label-position-negative", "lines", "link-data-style-to-source", "logarithmic", "maximum", "mean-value", "minimum", "origin", "overlap", "percentage", "pie-offset", "regression-type", "reverse-direction", "right-angled-axes", "scale-text", "series-source", "solid-type", "sort-by-x-values", "spline-order", "spline-resolution", "stacked", "symbol-height", "symbol-name", "symbol-type", "symbol-width", "text-overlap", "three-dimensional", "tick-mark-position", "tick-marks-major-inner", "tick-marks-major-outer", "tick-marks-minor-inner", "tick-marks-minor-outer", "treat-empty-cells", "vertical", "visible", "rotation-angle", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "line-break", "label-separator", "symbol-image", ContextChain.TAG_PRODUCT);

    private static String zzK(zzYQ7 zzyq7) {
        String string = " ";
        while (zzyq7.zzYuT().zzQ("label-separator")) {
            if (zzUR.zzTP(zzyq7.zzYuT().getLocalName()) != 70) {
                zzyq7.zzYuT().zzk();
            } else {
                string = zzyq7.zzYuT().readString();
            }
        }
        return string;
    }

    public static void zzZ(zzYQ7 zzyq7, zzYSR zzysr) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 0:
                    zzysr.zzYx1().zzQ(0, Double.valueOf(((double) zzYOU.zzDH(zzyq9ZzYuT.getValue())) / 65536.0d));
                    break;
                case 1:
                    zzysr.zzYx1().zzQ(1, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 2:
                    zzysr.zzYx1().zzQ(2, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 3:
                    zzysr.zzYx1().zzQ(3, Integer.valueOf(zzYSN.zzGd(zzyq9ZzYuT.getValue())));
                    break;
                case 4:
                    zzysr.zzYx1().zzQ(4, Double.valueOf(zzYSN.zzGc(zzyq9ZzYuT.getValue())));
                    break;
                case 5:
                    zzysr.zzYx1().zzQ(5, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 6:
                    zzysr.zzYx1().zzQ(6, Integer.valueOf(zzYSN.zzGb(zzyq9ZzYuT.getValue())));
                    break;
                case 7:
                    zzysr.zzYx1().zzQ(7, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 8:
                    zzysr.zzYx1().zzQ(8, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 9:
                    zzysr.zzYx1().zzQ(10, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 10:
                    zzysr.zzYx1().zzQ(11, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 11:
                    zzysr.zzYx1().zzQ(12, Integer.valueOf(zzYSN.zzGa(zzyq9ZzYuT.getValue())));
                    break;
                case 12:
                    zzysr.zzYx1().zzQ(13, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 13:
                    zzysr.zzYx1().zzQ(14, Double.valueOf(zzyq9ZzYuT.zz9()));
                    break;
                case 14:
                    zzysr.zzYx1().zzQ(15, zzyq9ZzYuT.getValue());
                    break;
                case 15:
                    zzysr.zzYx1().zzQ(16, Double.valueOf(zzyq9ZzYuT.zz9()));
                    break;
                case 16:
                    zzysr.zzYx1().zzQ(14, Double.valueOf(((double) zzYOU.zzDy(zzyq9ZzYuT.getValue())) / 65536.0d));
                    break;
                case 17:
                    zzysr.zzYx1().zzQ(18, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 18:
                    zzysr.zzYx1().zzQ(19, Double.valueOf(zzyq9ZzYuT.zz9()));
                    break;
                case 19:
                    zzysr.zzYx1().zzQ(20, zzyq9ZzYuT.getValue());
                    break;
                case 20:
                    zzysr.zzYx1().zzQ(21, Integer.valueOf(zzyq9ZzYuT.zzb()));
                    break;
                case 21:
                    zzysr.zzYx1().zzQ(22, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 22:
                    zzysr.zzYx1().zzQ(23, Double.valueOf(((double) zzYOU.zzDy(zzyq9ZzYuT.getValue())) / 65536.0d));
                    break;
                case 23:
                    zzysr.zzYx1().zzQ(24, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 24:
                    zzysr.zzYx1().zzQ(25, Integer.valueOf(zzYSN.zzG9(zzyq9ZzYuT.getValue())));
                    break;
                case 25:
                    zzysr.zzYx1().zzQ(26, Double.valueOf(zzyq9ZzYuT.zz9()));
                    break;
                case 26:
                    zzysr.zzYx1().zzQ(27, Integer.valueOf(zzyq9ZzYuT.zzb()));
                    break;
                case 27:
                    zzysr.zzYx1().zzQ(28, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 28:
                    zzysr.zzYx1().zzQ(29, Integer.valueOf(zzYSN.zzG8(zzyq9ZzYuT.getValue())));
                    break;
                case 29:
                    zzysr.zzYx1().zzQ(30, Integer.valueOf(zzYSN.zzG7(zzyq9ZzYuT.getValue())));
                    break;
                case 30:
                    zzysr.zzYx1().zzQ(31, Integer.valueOf(zzYSN.zzG7(zzyq9ZzYuT.getValue())));
                    break;
                case 31:
                    zzysr.zzYx1().zzQ(32, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 32:
                    zzysr.zzYx1().zzQ(33, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 33:
                    zzysr.zzYx1().zzQ(34, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 34:
                    zzysr.zzYx1().zzQ(35, Double.valueOf(zzyq9ZzYuT.zz9()));
                    break;
                case 35:
                    zzysr.zzYx1().zzQ(36, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 36:
                    zzysr.zzYx1().zzQ(37, Double.valueOf(zzyq9ZzYuT.zz9()));
                    break;
                case 37:
                    zzysr.zzYx1().zzQ(38, Double.valueOf(zzyq9ZzYuT.zz9()));
                    break;
                case 38:
                    zzysr.zzYx1().zzQ(39, Integer.valueOf(zzyq9ZzYuT.zzb()));
                    break;
                case 39:
                    zzysr.zzYx1().zzQ(41, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 40:
                    zzysr.zzYx1().zzQ(40, Integer.valueOf(zzyq9ZzYuT.zzb()));
                    break;
                case 41:
                    zzysr.zzYx1().zzQ(42, Integer.valueOf(zzYSN.zzG6(zzyq9ZzYuT.getValue())));
                    break;
                case 42:
                    zzysr.zzYx1().zzQ(43, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 43:
                    zzysr.zzYx1().zzQ(44, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 44:
                    zzysr.zzYx1().zzQ(45, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 45:
                    zzysr.zzYx1().zzQ(46, Integer.valueOf(zzYSN.zzG5(zzyq9ZzYuT.getValue())));
                    break;
                case 46:
                    zzysr.zzYx1().zzQ(48, Integer.valueOf(zzYSN.zzG4(zzyq9ZzYuT.getValue())));
                    break;
                case 47:
                    zzysr.zzYx1().zzQ(47, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 48:
                    zzysr.zzYx1().zzQ(49, Integer.valueOf(zzyq9ZzYuT.zzb()));
                    break;
                case 49:
                    zzysr.zzYx1().zzQ(50, Integer.valueOf(zzyq9ZzYuT.zzb()));
                    break;
                case 50:
                    zzysr.zzYx1().zzQ(51, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 51:
                    zzysr.zzYx1().zzQ(52, Double.valueOf(zzYSF.zzFV(zzyq9ZzYuT.getValue())));
                    break;
                case 52:
                    zzysr.zzYx1().zzQ(53, Integer.valueOf(zzYSN.zzG3(zzyq9ZzYuT.getValue())));
                    break;
                case 53:
                    zzysr.zzYx1().zzQ(54, Integer.valueOf(zzYSN.zzG2(zzyq9ZzYuT.getValue())));
                    break;
                case 54:
                    zzysr.zzYx1().zzQ(55, Double.valueOf(zzYSF.zzFV(zzyq9ZzYuT.getValue())));
                    break;
                case 55:
                    zzysr.zzYx1().zzQ(56, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 56:
                    zzysr.zzYx1().zzQ(57, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 57:
                    zzysr.zzYx1().zzQ(62, Integer.valueOf(zzYSN.zzG1(zzyq9ZzYuT.getValue())));
                    break;
                case 58:
                    zzysr.zzYx1().zzQ(58, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 59:
                    zzysr.zzYx1().zzQ(59, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 60:
                    zzysr.zzYx1().zzQ(60, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 61:
                    zzysr.zzYx1().zzQ(61, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 62:
                    zzysr.zzYx1().zzQ(63, Integer.valueOf(zzYSN.zzG0(zzyq9ZzYuT.getValue())));
                    break;
                case 63:
                    zzysr.zzYx1().zzQ(64, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 64:
                    zzysr.zzYx1().zzQ(65, Boolean.valueOf(zzyq9ZzYuT.zz8()));
                    break;
                case 65:
                    zzysr.zzYx1().zzQ(66, Double.valueOf(((double) zzYOU.zzDH(zzyq9ZzYuT.getValue())) / 65536.0d));
                    break;
                case 66:
                case 67:
                    zzyq7.zzZ(256, false, "style:chart-properties");
                    break;
                default:
                    zzyq7.zzYi("style:chart-properties", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
        zzyq9ZzYuT.zzj();
        while (zzyq9ZzYuT.zzQ("chart-properties")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 68) {
                zzysr.zzYx1().zzQ(9, zzK(zzyq7));
            } else if (iZzTP != 69) {
                zzyq9ZzYuT.zzk();
            } else {
                zzyq7.zzZ(1, true, "chart:chart-properties");
            }
        }
    }
}
