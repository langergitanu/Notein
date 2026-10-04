package com.aspose.slides.internal.p523yd;

import com.aspose.slides.OooOo;
import com.aspose.slides.internal.p048bv.C1865ks;
import com.aspose.slides.internal.p048bv.C1873yj;
import com.aspose.slides.internal.p048bv.InterfaceC1859dy;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C14010x0;

/* JADX INFO: renamed from: com.aspose.slides.internal.yd.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12812kk implements InterfaceC12808dy {

    /* JADX INFO: renamed from: k4 */
    private C14010x0 f42598k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC1859dy f42599kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f42600x1;

    public C12812kk() {
        this(false);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC1859dy m59550k4() {
        return this.f42599kk;
    }

    public C12812kk(boolean z) {
        this.f42598k4 = new C14010x0();
        this.f42600x1 = z;
    }

    @Override // com.aspose.slides.internal.p523yd.InterfaceC12808dy
    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 mo59523k4(String str, String str2, String str3) {
        C12385to c12385toM57971k4 = C12380dy.m57971k4(str, "data:([\\w/]+);(\\w+),(.*)", 66);
        if (c12385toM57971k4.mo58006to()) {
            String strOooO00o = OooOo.OooO00o(c12385toM57971k4, 1);
            String strOooO00o2 = OooOo.OooO00o(c12385toM57971k4, 2);
            String strOooO00o3 = OooOo.OooO00o(c12385toM57971k4, 3);
            if (C14113y2.m67364dy(strOooO00o, "image") != -1 && "base64".equals(strOooO00o2)) {
                return new C3152yj(C14080ne.m66934jd(strOooO00o3));
            }
        }
        InterfaceC1859dy interfaceC1859dy = this.f42599kk;
        if (interfaceC1859dy == null) {
            return (AbstractC3150x6) this.f42598k4.mo5312k4((str2 == null || str2.length() <= 0) ? (C14113y2.m67411k4(str) || !C14113y2.m67448x1(str, "http")) ? m59549k4(str3, str) : new C14062gk(str) : this.f42598k4.mo65674k4(new C14062gk(str2), str), null, C7019kk.m27443k4((Class<?>) AbstractC3150x6.class));
        }
        C1865ks c1865ksMo9717k4 = interfaceC1859dy.mo9717k4(this, new C1873yj(str));
        if (c1865ksMo9717k4.m9754k4() == null) {
            return null;
        }
        return new C3152yj(c1865ksMo9717k4.m9754k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static C14062gk m59549k4(String str, String str2) {
        return (str == null || str.length() <= 0) ? new C14062gk(str2) : new C14062gk(C3141rv.m13412x1(str, str2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59551k4(InterfaceC1859dy interfaceC1859dy) {
        this.f42599kk = interfaceC1859dy;
    }
}
