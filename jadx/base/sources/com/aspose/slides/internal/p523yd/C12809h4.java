package com.aspose.slides.internal.p523yd;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p048bv.C1862jd;
import com.aspose.slides.internal.p048bv.InterfaceC1859dy;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p097e0.AbstractC3515du;
import com.aspose.slides.internal.p097e0.C3519h4;
import com.aspose.slides.internal.p393s7.C10152dy;
import com.aspose.slides.internal.p425tq.C11077ar;
import com.aspose.slides.internal.p425tq.C11091qq;
import com.aspose.slides.internal.p425tq.C11099x6;
import com.aspose.slides.internal.p425tq.InterfaceC11078c5;
import com.aspose.slides.internal.p513xw.InterfaceC12746yd;
import com.aspose.slides.p559ms.System.C14087rv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.yd.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12809h4 implements InterfaceC12806c5, IDisposable {

    /* JADX INFO: renamed from: m9 */
    private String f42584m9 = null;

    /* JADX INFO: renamed from: dy */
    private boolean f42576dy = false;

    /* JADX INFO: renamed from: c5 */
    private String f42573c5 = null;

    /* JADX INFO: renamed from: jd */
    private Dictionary<String, String> f42580jd = null;

    /* JADX INFO: renamed from: ck */
    private boolean f42574ck = true;

    /* JADX INFO: renamed from: fa */
    private boolean f42577fa = true;

    /* JADX INFO: renamed from: up */
    private float f42589up = 96.0f;

    /* JADX INFO: renamed from: yj */
    private float f42592yj = 96.0f;

    /* JADX INFO: renamed from: ks */
    private String f42583ks = "11in";

    /* JADX INFO: renamed from: rv */
    private String f42586rv = "8.26in";

    /* JADX INFO: renamed from: x6 */
    private boolean f42591x6 = true;

    /* JADX INFO: renamed from: ne */
    private boolean f42585ne = false;

    /* JADX INFO: renamed from: ix */
    private InterfaceC12746yd f42579ix = null;

    /* JADX INFO: renamed from: to */
    private C3519h4 f42587to = new C3519h4(this);

    /* JADX INFO: renamed from: u4 */
    private C12812kk f42588u4 = new C12812kk(m59542ne());

    /* JADX INFO: renamed from: h4 */
    private C10152dy f42578h4 = new k4();

    /* JADX INFO: renamed from: du */
    private C1862jd f42575du = new C1862jd(this);

    /* JADX INFO: renamed from: k4 */
    private C11091qq f42581k4 = new C11091qq();

    /* JADX INFO: renamed from: x1 */
    private C11077ar f42590x1 = new C11077ar();

    /* JADX INFO: renamed from: kk */
    private C11099x6 f42582kk = new C11099x6();

    /* JADX INFO: renamed from: com.aspose.slides.internal.yd.h4$k4 */
    public static class k4 extends C10152dy {
        private k4() {
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final String m59525c5() {
        return this.f42584m9;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m59526ck() {
        return this.f42574ck;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        C1862jd c1862jd = this.f42575du;
        if (c1862jd != null) {
            c1862jd.dispose();
            this.f42575du = null;
        }
    }

    /* JADX INFO: renamed from: du */
    public final C11091qq m59527du() {
        return this.f42581k4;
    }

    /* JADX INFO: renamed from: dy */
    public final InterfaceC12746yd m59528dy() {
        return this.f42579ix;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m59529fa() {
        return this.f42585ne;
    }

    /* JADX INFO: renamed from: h4 */
    public final C3519h4 m59530h4() {
        return this.f42587to;
    }

    /* JADX INFO: renamed from: ix */
    public final C10152dy m59531ix() {
        return this.f42578h4;
    }

    /* JADX INFO: renamed from: jd */
    public final C12812kk m59532jd() {
        return this.f42588u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m59533k4(String str, String str2, String str3) {
        try {
            return this.f42588u4.mo59523k4(str, str2, str3);
        } catch (RuntimeException unused) {
            C14087rv.m67159k4().mo13326x1(C14113y2.m67408k4("Attempt to resolve URI '", str, "' failed: "));
            return null;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m59539kk() {
        return this.f42576dy;
    }

    /* JADX INFO: renamed from: ks */
    public final String m59540ks() {
        return this.f42583ks;
    }

    /* JADX INFO: renamed from: m9 */
    public final C1862jd m59541m9() {
        return this.f42575du;
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m59542ne() {
        return this.f42577fa;
    }

    /* JADX INFO: renamed from: rv */
    public final String m59543rv() {
        return this.f42586rv;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m59544to() {
        return this.f42591x6;
    }

    /* JADX INFO: renamed from: up */
    public final float m59545up() {
        return this.f42589up;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12814to m59546x1() {
        return new C12814to(this);
    }

    /* JADX INFO: renamed from: x6 */
    public final InterfaceC11078c5 m59547x6() {
        return null;
    }

    /* JADX INFO: renamed from: yj */
    public final float m59548yj() {
        return this.f42592yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12807du m59534k4(String str, C12814to c12814to, AbstractC3150x6 abstractC3150x6) {
        if (c12814to != null) {
            return new C12807du(str, c12814to, abstractC3150x6);
        }
        throw new NullReferenceException("The userAgent parameter must not be null!");
    }

    /* JADX INFO: renamed from: k4 */
    public static C12809h4 m59524k4() {
        return new C12809h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59535k4(float f) {
        this.f42589up = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59536k4(InterfaceC1859dy interfaceC1859dy) {
        this.f42588u4.m59551k4(interfaceC1859dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59537k4(AbstractC3515du abstractC3515du) {
        this.f42587to.m14254k4(abstractC3515du);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m59538k4(String str) {
        return false;
    }
}
