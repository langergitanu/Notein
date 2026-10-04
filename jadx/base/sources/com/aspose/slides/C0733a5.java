package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.a5 */
/* JADX INFO: loaded from: classes3.dex */
class C0733a5 {
    /* JADX INFO: renamed from: k4 */
    private static void m3232k4(AutoShape autoShape) {
        autoShape.m1591yj().m3317k4(0);
        autoShape.m1591yj().m3322k4(new C13791lr[0]);
        autoShape.m1591yj().m3321k4((C1253ij[]) null);
        autoShape.m1591yj().m3323k4(C0735a7.f3828k4);
        autoShape.m1591yj().m3319k4(new C0899df[0]);
        autoShape.m1591yj().m3320k4((f7k[]) null);
        autoShape.m1591yj().m3324k4((C14843yd[]) null);
        autoShape.m1591yj().m3332x1((C14843yd[]) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3233k4(AutoShape autoShape, com.aspose.slides.internal.p332p7.tzu tzuVar, wxb wxbVar) {
        if (autoShape == null) {
            throw new ArgumentNullException("autoShape");
        }
        if (tzuVar == null) {
            throw new ArgumentNullException("pathElementData");
        }
        m3232k4(autoShape);
        String strM42051k4 = tzuVar.m42051k4();
        int[] iArr = {0};
        int[] iArr2 = {0};
        int[] iArr3 = {0};
        int[] iArr4 = {0};
        wgi.m72726k4(tzuVar.m42049h4(), iArr, iArr2, iArr3, iArr4);
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr3[0];
        int i4 = iArr4[0];
        List list = new List();
        if (strM42051k4.length() > 0) {
            list.addItem(new f7k(C14113y2.m67440x1(strM42051k4), C14116yg.m67482k4(i3 - i), C14116yg.m67482k4(i2 - i4)));
        }
        autoShape.m1591yj().m3320k4((f7k[]) list.toArray(new f7k[0]));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3234k4(AutoShape autoShape, com.aspose.slides.internal.p332p7.z4k z4kVar) {
        if (autoShape == null) {
            throw new ArgumentNullException("autoShape");
        }
        if (z4kVar == null) {
            throw new ArgumentNullException("polygonElementData");
        }
        m3232k4(autoShape);
        List list = new List();
        int[] iArr = {0};
        int[] iArr2 = {0};
        wgi.m72726k4(z4kVar.m45475h4(), iArr, iArr2, new int[]{0}, new int[]{0});
        int i = iArr[0];
        int i2 = iArr2[0];
        list.addItem(new f7k(wgi.m72711k4(z4kVar.m45477k4()), C14116yg.m67482k4(C14116yg.m67482k4(r4[0] - i)), C14116yg.m67482k4(i2 - r5[0])));
        autoShape.m1591yj().m3320k4((f7k[]) list.toArray(new f7k[0]));
    }
}
