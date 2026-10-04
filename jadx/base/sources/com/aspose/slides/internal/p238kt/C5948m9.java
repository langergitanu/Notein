package com.aspose.slides.internal.p238kt;

import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.p559ms.System.Xml.C13959qk;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C5948m9 extends C13959qk implements InterfaceC5919c6 {

    /* JADX INFO: renamed from: k4 */
    private boolean f16816k4;

    /* JADX INFO: renamed from: kk */
    private boolean f16817kk;

    public C5948m9(String str, XmlDocument xmlDocument, boolean z, boolean z2) {
        super(str, xmlDocument);
        this.f16816k4 = z;
        this.f16817kk = z2;
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23905k4(AbstractC4705c6 abstractC4705c6, int i, AbstractC5941k4 abstractC5941k4) {
        if (m24068k4() && m24069x1()) {
            C6783wp c6783wp = new C6783wp(false);
            byte[] bArrMo26677to = c6783wp.mo26677to("(char) 10");
            if (i == 2) {
                abstractC4705c6.mo19562k4(bArrMo26677to, 0, bArrMo26677to.length, bArrMo26677to, 0);
            }
            byte[] bArrMo26677to2 = c6783wp.mo26677to("<!--");
            abstractC4705c6.mo19562k4(bArrMo26677to2, 0, bArrMo26677to2.length, bArrMo26677to2, 0);
            byte[] bArrMo26677to3 = c6783wp.mo26677to(getValue());
            abstractC4705c6.mo19562k4(bArrMo26677to3, 0, bArrMo26677to3.length, bArrMo26677to3, 0);
            byte[] bArrMo26677to4 = c6783wp.mo26677to("-->");
            abstractC4705c6.mo19562k4(bArrMo26677to4, 0, bArrMo26677to4.length, bArrMo26677to4, 0);
            if (i == 0) {
                byte[] bArrMo26677to5 = c6783wp.mo26677to("(char) 10");
                abstractC4705c6.mo19562k4(bArrMo26677to5, 0, bArrMo26677to5.length, bArrMo26677to5, 0);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m24069x1() {
        return this.f16817kk;
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23906k4(C6765kp c6765kp, int i, AbstractC5941k4 abstractC5941k4) {
        if (m24068k4() && m24069x1()) {
            if (i == 2) {
                c6765kp.m26780k4('\n');
            }
            c6765kp.m26792k4("<!--");
            c6765kp.m26792k4(getValue());
            c6765kp.m26792k4("-->");
            if (i == 0) {
                c6765kp.m26780k4('\n');
            }
        }
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23907k4(boolean z) {
        this.f16816k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24068k4() {
        return this.f16816k4;
    }
}
