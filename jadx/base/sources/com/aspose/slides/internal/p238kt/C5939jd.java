package com.aspose.slides.internal.p238kt;

import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.Xml.C13947nk;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.jd */
/* JADX INFO: loaded from: classes.dex */
public class C5939jd extends C13947nk implements InterfaceC5919c6 {

    /* JADX INFO: renamed from: k4 */
    private boolean f16794k4;

    public C5939jd(String str, XmlDocument xmlDocument, boolean z) {
        super(str, xmlDocument);
        this.f16794k4 = z;
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23905k4(AbstractC4705c6 abstractC4705c6, int i, AbstractC5941k4 abstractC5941k4) {
        if (m24030k4()) {
            C5956rv.m24099x1(this, abstractC4705c6, i, abstractC5941k4);
        }
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23906k4(C6765kp c6765kp, int i, AbstractC5941k4 abstractC5941k4) {
        if (m24030k4()) {
            C5956rv.m24100x1(this, c6765kp, i, abstractC5941k4);
        }
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23907k4(boolean z) {
        this.f16794k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24030k4() {
        return this.f16794k4;
    }
}
