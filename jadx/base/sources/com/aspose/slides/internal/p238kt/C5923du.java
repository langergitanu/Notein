package com.aspose.slides.internal.p238kt;

import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.du */
/* JADX INFO: loaded from: classes.dex */
public class C5923du extends C13940my implements InterfaceC5919c6 {

    /* JADX INFO: renamed from: k4 */
    private boolean f16749k4;

    public C5923du(String str, String str2, String str3, XmlDocument xmlDocument, boolean z) {
        super(str, str2, str3, xmlDocument);
        mo23907k4(z);
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23905k4(AbstractC4705c6 abstractC4705c6, int i, AbstractC5941k4 abstractC5941k4) {
        C6783wp c6783wp = new C6783wp(false);
        byte[] bArrMo26677to = c6783wp.mo26677to(C14113y2.m67408k4(" ", getName(), "=\""));
        abstractC4705c6.mo19562k4(bArrMo26677to, 0, bArrMo26677to.length, bArrMo26677to, 0);
        byte[] bArrMo26677to2 = c6783wp.mo26677to(C5934he.m23996m9(getValue()));
        abstractC4705c6.mo19562k4(bArrMo26677to2, 0, bArrMo26677to2.length, bArrMo26677to2, 0);
        byte[] bArrMo26677to3 = c6783wp.mo26677to("\"");
        abstractC4705c6.mo19562k4(bArrMo26677to3, 0, bArrMo26677to3.length, bArrMo26677to3, 0);
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23906k4(C6765kp c6765kp, int i, AbstractC5941k4 abstractC5941k4) {
        c6765kp.m26792k4(C14113y2.m67408k4(" ", getName(), "=\""));
        c6765kp.m26792k4(C5934he.m23996m9(getValue()));
        c6765kp.m26792k4("\"");
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23907k4(boolean z) {
        this.f16749k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m23939k4() {
        return this.f16749k4;
    }
}
