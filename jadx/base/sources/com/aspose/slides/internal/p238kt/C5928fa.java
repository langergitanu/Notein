package com.aspose.slides.internal.p238kt;

import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13954ph;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.fa */
/* JADX INFO: loaded from: classes.dex */
public class C5928fa extends C13954ph implements InterfaceC5919c6 {

    /* JADX INFO: renamed from: k4 */
    private boolean f16763k4;

    public C5928fa(String str, String str2, XmlDocument xmlDocument, boolean z) {
        super(str, str2, xmlDocument);
        this.f16763k4 = z;
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23905k4(AbstractC4705c6 abstractC4705c6, int i, AbstractC5941k4 abstractC5941k4) {
        if (m23957k4()) {
            C6783wp c6783wp = new C6783wp(false);
            if (i == 2) {
                byte[] bArrMo26677to = c6783wp.mo26677to("(char) 10");
                abstractC4705c6.mo19562k4(bArrMo26677to, 0, bArrMo26677to.length, bArrMo26677to, 0);
            }
            byte[] bArrMo26677to2 = c6783wp.mo26677to("<?");
            abstractC4705c6.mo19562k4(bArrMo26677to2, 0, bArrMo26677to2.length, bArrMo26677to2, 0);
            byte[] bArrMo26677to3 = c6783wp.mo26677to(getName());
            abstractC4705c6.mo19562k4(bArrMo26677to3, 0, bArrMo26677to3.length, bArrMo26677to3, 0);
            if (getValue() != null && getValue().length() > 0) {
                byte[] bArrMo26677to4 = c6783wp.mo26677to(C14113y2.m67408k4(" ", getValue()));
                abstractC4705c6.mo19562k4(bArrMo26677to4, 0, bArrMo26677to4.length, bArrMo26677to4, 0);
            }
            byte[] bArrMo26677to5 = c6783wp.mo26677to("?>");
            abstractC4705c6.mo19562k4(bArrMo26677to5, 0, bArrMo26677to5.length, bArrMo26677to5, 0);
            if (i == 0) {
                byte[] bArrMo26677to6 = c6783wp.mo26677to("(char) 10");
                abstractC4705c6.mo19562k4(bArrMo26677to6, 0, bArrMo26677to6.length, bArrMo26677to6, 0);
            }
        }
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23906k4(C6765kp c6765kp, int i, AbstractC5941k4 abstractC5941k4) {
        if (m23957k4()) {
            if (i == 2) {
                c6765kp.m26780k4('\n');
            }
            c6765kp.m26792k4("<?");
            c6765kp.m26792k4(getName());
            if (getValue() != null && getValue().length() > 0) {
                c6765kp.m26792k4(C14113y2.m67408k4(" ", getValue()));
            }
            c6765kp.m26792k4("?>");
            if (i == 0) {
                c6765kp.m26780k4('\n');
            }
        }
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23907k4(boolean z) {
        this.f16763k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m23957k4() {
        return this.f16763k4;
    }
}
