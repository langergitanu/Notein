package com.aspose.slides.internal.p238kt;

import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.p559ms.System.Xml.C13862bp;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.up */
/* JADX INFO: loaded from: classes.dex */
public class C5966up extends C13862bp implements InterfaceC5919c6 {

    /* JADX INFO: renamed from: k4 */
    private boolean f16853k4;

    public C5966up(String str, XmlDocument xmlDocument, boolean z) {
        super(str, xmlDocument);
        this.f16853k4 = z;
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23905k4(AbstractC4705c6 abstractC4705c6, int i, AbstractC5941k4 abstractC5941k4) {
        if (m24122k4() && i == 1) {
            byte[] bArrMo26677to = new C6783wp(false).mo26677to(C5934he.m23997to(getValue()));
            abstractC4705c6.mo19562k4(bArrMo26677to, 0, bArrMo26677to.length, bArrMo26677to, 0);
        }
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23906k4(C6765kp c6765kp, int i, AbstractC5941k4 abstractC5941k4) {
        if (m24122k4() && i == 1) {
            c6765kp.m26792k4(C5934he.m23997to(getValue()));
        }
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23907k4(boolean z) {
        this.f16853k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24122k4() {
        return this.f16853k4;
    }
}
