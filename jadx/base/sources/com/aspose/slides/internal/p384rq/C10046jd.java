package com.aspose.slides.internal.p384rq;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13958qb;

/* JADX INFO: renamed from: com.aspose.slides.internal.rq.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10046jd implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13958qb f36219k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC10045h4 f36220x1;

    public C10046jd(AbstractC3150x6 abstractC3150x6) {
        this(abstractC3150x6, C10044fa.m49636du());
    }

    /* JADX INFO: renamed from: x1 */
    private String m49648x1(String str) {
        if (str == null) {
            return null;
        }
        return new C12380dy("[^\\u0009\\u000A\\u000D\\u0020-\\uD7FF\\uE000-\\uFFFD\\u10000-\\u10FFFF]", 0).m57987kk(str, C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m49655k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC10045h4 m49649k4() {
        return this.f36220x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m49656kk() {
        this.f36219k4.mo21898jd();
        if (m49649k4() != null) {
            m49649k4().mo49647x1();
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m49657to() {
        this.f36219k4.mo21892ck();
        if (m49649k4() != null) {
            m49649k4().mo49647x1();
        }
    }

    public C10046jd(AbstractC3150x6 abstractC3150x6, C10044fa c10044fa) {
        this.f36219k4 = AbstractC13958qb.m65799k4(abstractC3150x6, c10044fa.m49637h4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49650k4(InterfaceC10045h4 interfaceC10045h4) {
        this.f36220x1 = interfaceC10045h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m49658x1() {
        this.f36219k4.mo21896h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49651k4(String str) {
        if (str.length() == 0) {
            return;
        }
        String strM49648x1 = m49648x1(str);
        if (strM49648x1.length() != 0) {
            this.f36219k4.mo21891a_(C14113y2.m67365dy(strM49648x1), 0, strM49648x1.length());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m49659x1(String str, String str2) {
        this.f36219k4.m65806to(str, m49648x1(str2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49652k4(String str, String str2) {
        if (m49649k4() != null) {
            m49649k4().mo49646k4(str);
        }
        this.f36219k4.m65804kk(str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49653k4(String str, String str2, String str3) {
        if (m49649k4() != null) {
            m49649k4().mo49646k4(str2);
        }
        this.f36219k4.mo12953k4(str, str2, str3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49654k4(String str, String str2, String str3, String str4) {
        this.f36219k4.mo21908k4(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m49655k4(boolean z) {
        AbstractC13958qb abstractC13958qb;
        if (!z || (abstractC13958qb = this.f36219k4) == null) {
            return;
        }
        abstractC13958qb.dispose();
        this.f36219k4 = null;
    }
}
