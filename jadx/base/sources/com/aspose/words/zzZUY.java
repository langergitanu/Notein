package com.aspose.words;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZUY {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("top", "middle", "bottom", "baseline", "ltr", "rtl");

    private static void zzU(zzZBM zzzbm, zzPR zzpr) {
        if (zzzbm.zzKM("hidden") != null) {
            zzpr.zzV(new zzM3("display", zzL4.zzZno, (byte) 0));
        }
    }

    private static void zzV(zzZBM zzzbm, zzPR zzpr) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzbm.getAttributeValue("dir", "")));
        if (iZzTP == 4) {
            zzpr.zzV(new zzM3(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, zzL4.zzZni, (byte) 0));
            zzpr.zzV(new zzM3("unicode-bidi", zzL4.zzZmJ, (byte) 0));
        } else {
            if (iZzTP != 5) {
                return;
            }
            zzpr.zzV(new zzM3(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, zzL4.zzZnh, (byte) 0));
            zzpr.zzV(new zzM3("unicode-bidi", zzL4.zzZmJ, (byte) 0));
        }
    }

    public static void zzW(zzZBM zzzbm, zzPR zzpr) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzbm.getAttributeValue("valign", "")));
        if (iZzTP == 0) {
            zzpr.zzV(new zzM3("vertical-align", zzL4.zzZmY, (byte) 0));
            return;
        }
        if (iZzTP == 1) {
            zzpr.zzV(new zzM3("vertical-align", zzL4.zzZmW, (byte) 0));
        } else if (iZzTP == 2) {
            zzpr.zzV(new zzM3("vertical-align", zzL4.zzZmX, (byte) 0));
        } else {
            if (iZzTP != 3) {
                return;
            }
            zzpr.zzV(new zzM3("vertical-align", zzL4.zzZmT, (byte) 0));
        }
    }

    public static void zzX(zzZBM zzzbm, zzPR zzpr) {
        zzL4 zzl4ZzS1 = zzL4.zzS1(zzzbm.zzKM("bgcolor"));
        if (zzl4ZzS1 != null) {
            zzpr.zzV(new zzM3("background-color", zzl4ZzS1, (byte) 0));
        }
    }

    public void zzY(zzZBM zzzbm, zzPR zzpr) {
    }

    public abstract void zzZ(zzZBM zzzbm, zzPR zzpr);

    public final void zzZ(zzZBM zzzbm, zzPR zzpr, int i) {
        zzV(zzzbm, zzpr);
        zzZ(zzzbm, zzpr);
        if ((i & 1) == 0) {
            zzY(zzzbm, zzpr);
        }
        if (zzZjA()) {
            zzU(zzzbm, zzpr);
        }
    }

    public boolean zzZjA() {
        return true;
    }
}
