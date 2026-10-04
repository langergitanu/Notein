package com.aspose.slides.internal.p249lg;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p135fp.C4095jd;
import com.aspose.slides.internal.p135fp.C4098ks;
import com.aspose.slides.internal.p519y5.C12799m9;
import com.aspose.slides.internal.p519y5.C12800to;
import com.aspose.slides.internal.p519y5.C12801x1;
import com.aspose.slides.internal.p519y5.InterfaceC12796h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.lg.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C6036k4 {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, InterfaceC12796h4> f17123k4 = new Dictionary<>();

    public C6036k4(C4098ks c4098ks, C4095jd[] c4095jdArr, int i, int i2) {
        Dictionary<Integer, InterfaceC12796h4> dictionary;
        Integer numValueOf;
        InterfaceC12796h4 c12799m9;
        for (int i3 = 0; i3 < c4095jdArr.length; i3++) {
            C4095jd c4095jd = c4095jdArr[i3];
            if ((c4095jd.m16329to() & 255) == i && (c4095jd.m16316fa() & 255) == i2) {
                this.f17123k4.addItem(Integer.valueOf(c4095jd.m16317h4() & 255), new C12801x1());
            } else {
                if ((c4095jd.m16329to() & 255) * 2 == i && (c4095jd.m16316fa() & 255) == i2) {
                    dictionary = this.f17123k4;
                    numValueOf = Integer.valueOf(c4095jd.m16317h4() & 255);
                    c12799m9 = new C12800to(c4095jd, i3);
                } else if ((c4095jd.m16329to() & 255) * 2 == i && (c4095jd.m16316fa() & 255) * 2 == i2) {
                    dictionary = this.f17123k4;
                    numValueOf = Integer.valueOf(c4095jd.m16317h4() & 255);
                    c12799m9 = new C6037x1(c4095jd, i3);
                } else if (i % (c4095jd.m16329to() & 255) == 0 && i2 % (c4095jd.m16316fa() & 255) == 0) {
                    dictionary = this.f17123k4;
                    numValueOf = Integer.valueOf(c4095jd.m16317h4() & 255);
                    c12799m9 = new C12799m9(c4095jd, i3, i, i2);
                }
                dictionary.addItem(numValueOf, c12799m9);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC12796h4 m24372k4(C4095jd c4095jd) {
        return this.f17123k4.get_Item(Integer.valueOf(c4095jd.m16317h4() & 255));
    }
}
