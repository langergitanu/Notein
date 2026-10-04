package com.aspose.slides.internal.p237ks;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p270m9.C6337h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p423to.C11071kk;
import com.aspose.slides.internal.p478wl.C12180v4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ks.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5907kk implements InterfaceC5903dy {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, C5906k4> f16707k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private C5910x1 f16708x1;

    public C5907kk(C5910x1 c5910x1) {
        this.f16708x1 = c5910x1;
    }

    @Override // com.aspose.slides.internal.p237ks.InterfaceC5903dy
    /* JADX INFO: renamed from: k4 */
    public final C5906k4 mo23772k4(String str) {
        if (C14113y2.m67411k4(str)) {
            str = "decimal";
        }
        String strM67368h4 = C14113y2.m67368h4(str);
        if (this.f16707k4.containsKey(strM67368h4)) {
            return this.f16707k4.get_Item(strM67368h4);
        }
        C5906k4 c5906k4M23878k4 = this.f16708x1.m23878k4(strM67368h4);
        if (this.f16707k4.containsKey(c5906k4M23878k4.m23780k4())) {
            return this.f16707k4.get_Item(c5906k4M23878k4.m23780k4());
        }
        c5906k4M23878k4.m23783k4(this);
        this.f16707k4.addItem(c5906k4M23878k4.m23780k4(), c5906k4M23878k4);
        return c5906k4M23878k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23796k4(C6337h4 c6337h4) {
        String strM67368h4 = C14113y2.m67368h4(c6337h4.m25944h4());
        if (this.f16707k4.containsKey(strM67368h4)) {
            C5906k4 c5906k4 = this.f16707k4.get_Item(strM67368h4);
            c5906k4.m23782k4(C11071kk.m53502k4(C7019kk.m27443k4((Class<?>) C12180v4.class), c6337h4.m25949m9()));
            c5906k4.m23793x1(c6337h4.m25939c5());
            c5906k4.m23784k4(c6337h4.m25946jd());
            c5906k4.m23788kk(c6337h4.m25940ck());
            c5906k4.m23790to().clear();
            c5906k4.m23790to().addRange(c6337h4.m25943fa());
            return;
        }
        C5906k4 c5906k42 = new C5906k4(c6337h4.m25944h4());
        c5906k42.m23782k4(C11071kk.m53502k4(C7019kk.m27443k4((Class<?>) C12180v4.class), c6337h4.m25949m9()));
        c5906k42.m23793x1(c6337h4.m25939c5());
        c5906k42.m23784k4(c6337h4.m25946jd());
        c5906k42.m23788kk(c6337h4.m25940ck());
        c5906k42.m23790to().addRange(c6337h4.m25943fa());
        c5906k42.m23783k4(this);
        this.f16707k4.addItem(strM67368h4, c5906k42);
    }
}
