package com.aspose.slides.internal.p519y5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p135fp.C4095jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.y5.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12797k4 {

    /* JADX INFO: renamed from: k4 */
    private final int f42555k4;

    /* JADX INFO: renamed from: kk */
    private final int f42556kk;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<Integer, InterfaceC12794du> f42557x1 = new Dictionary<>();

    public C12797k4(C4095jd[] c4095jdArr, int i, int i2) {
        Dictionary<Integer, InterfaceC12794du> dictionary;
        Integer numValueOf;
        InterfaceC12794du c12793c5;
        this.f42555k4 = i;
        this.f42556kk = i2;
        for (C4095jd c4095jd : c4095jdArr) {
            if ((c4095jd.m16329to() & 255) == this.f42555k4 && (c4095jd.m16316fa() & 255) == this.f42556kk) {
                dictionary = this.f42557x1;
                numValueOf = Integer.valueOf(c4095jd.m16317h4() & 255);
                c12793c5 = new C12795dy();
            } else if ((c4095jd.m16329to() & 255) * 2 == this.f42555k4 && (c4095jd.m16316fa() & 255) == this.f42556kk) {
                dictionary = this.f42557x1;
                numValueOf = Integer.valueOf(c4095jd.m16317h4() & 255);
                c12793c5 = new C12798kk();
            } else {
                if ((c4095jd.m16329to() & 255) * 2 != this.f42555k4 || (c4095jd.m16316fa() & 255) * 2 != this.f42556kk) {
                    throw new InvalidOperationException("JpegException: Component configuration", new NotSupportedException("Jpeg component configuration not supported."));
                }
                dictionary = this.f42557x1;
                numValueOf = Integer.valueOf(c4095jd.m16317h4() & 255);
                c12793c5 = new C12793c5();
            }
            dictionary.set_Item(numValueOf, c12793c5);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC12794du m59487k4(int i) {
        return this.f42557x1.get_Item(Integer.valueOf(i));
    }
}
