package com.aspose.slides;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;

/* JADX INFO: loaded from: classes3.dex */
class t5p {

    /* JADX INFO: renamed from: k4 */
    private static final C14084qq f49031k4 = new C14084qq(1900, 1, 1);

    /* JADX INFO: renamed from: x1 */
    private static final C14084qq f49032x1 = new C14084qq(1904, 1, 2);

    /* JADX INFO: renamed from: k4 */
    public static Double m70969k4(int i, int i2, int i3, int i4) {
        boolean z = i == 1900 && i2 == 2 && i3 == 29;
        if (z) {
            i3--;
        }
        Double dM70970k4 = m70970k4(new C14084qq(i, i2, i3).Clone(), i4);
        return (dM70970k4 == null || !z) ? dM70970k4 : Double.valueOf(dM70970k4.doubleValue() + 1.0d);
    }

    /* JADX INFO: renamed from: x1 */
    public static Integer m70973x1(String str) {
        int[] iArr = {0};
        boolean zM66589k4 = C14057f9.m66589k4(str, 7, C11697x1.m55250kk(), iArr);
        int i = iArr[0];
        if (!zM66589k4) {
            return null;
        }
        if (i == 0 || i == 1) {
            return new Integer(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static Double m70970k4(C14084qq c14084qq, int i) {
        C14084qq c14084qq2;
        C14077m4 c14077m4 = new C14077m4();
        if (i == 0) {
            c14084qq2 = f49031k4;
            if (C14084qq.m67110kk(c14084qq, c14084qq2)) {
                return null;
            }
        } else {
            c14084qq2 = f49032x1;
            if (C14084qq.m67110kk(c14084qq, c14084qq2)) {
                return null;
            }
        }
        C14084qq.m67073c5(c14084qq, c14084qq2).CloneTo(c14077m4);
        double dM66816h4 = c14077m4.m66816h4() + 1.0d;
        if (i == 0 && dM66816h4 >= 60.0d) {
            dM66816h4 += 1.0d;
        }
        return Double.valueOf(dM66816h4);
    }

    /* JADX INFO: renamed from: k4 */
    public static Double m70971k4(String str) {
        double[] dArr = {0.0d};
        boolean zM66435k4 = C14044b3.m66435k4(str, FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), dArr);
        double d = dArr[0];
        if (zM66435k4) {
            return new Double(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static Double m70972k4(String str, int i) {
        C14077m4 c14077m4 = new C14077m4();
        C14077m4[] c14077m4Arr = {c14077m4};
        boolean zM66803k4 = C14077m4.m66803k4(str, c14077m4Arr);
        c14077m4Arr[0].CloneTo(c14077m4);
        if (zM66803k4) {
            return new Double(c14077m4.m66816h4());
        }
        C14084qq c14084qq = new C14084qq();
        C14084qq[] c14084qqArr = {c14084qq};
        boolean zM67099k4 = C14084qq.m67099k4(str, C11697x1.m55250kk(), 128, c14084qqArr);
        c14084qqArr[0].CloneTo(c14084qq);
        if (zM67099k4) {
            return m70970k4(c14084qq.Clone(), i);
        }
        return null;
    }
}
