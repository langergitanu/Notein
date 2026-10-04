package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p085dk.C3175k4;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C6249rv {

    /* JADX INFO: renamed from: k4 */
    private C6259x6 f17714k4;

    /* JADX INFO: renamed from: kk */
    private int f17715kk;

    /* JADX INFO: renamed from: x1 */
    private C6259x6 f17716x1;

    public C6249rv(int i) {
        C6259x6 c6259x6 = new C6259x6(-1, "root", C14113y2.f47374k4);
        this.f17714k4 = c6259x6;
        this.f17716x1 = c6259x6;
        this.f17715kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25361k4(int i, String str, String str2) {
        C6259x6 c6259x6M25411x1;
        if (i >= 0 && C12565ks.m58630x1(str) && C12565ks.m58630x1(str2)) {
            C6259x6 c6259x6 = new C6259x6(i, str, str2);
            if (c6259x6.m25408k4() > this.f17716x1.m25408k4()) {
                c6259x6M25411x1 = this.f17716x1;
            } else if (c6259x6.m25408k4() < this.f17716x1.m25408k4()) {
                while (this.f17716x1.m25408k4() >= c6259x6.m25408k4()) {
                    this.f17716x1 = this.f17716x1.m25411x1();
                }
                c6259x6M25411x1 = this.f17716x1;
            } else {
                c6259x6M25411x1 = this.f17716x1.m25411x1();
            }
            c6259x6M25411x1.m25410k4(c6259x6);
            this.f17716x1 = c6259x6;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25362k4(C3175k4 c3175k4) {
        c3175k4.m13593x1("outlines");
        c3175k4.m13590kk("expandedOutlineLevels", C13850af.m65103k4(this.f17715kk));
        this.f17714k4.m25409k4(c3175k4);
        c3175k4.m13588kk();
    }
}
