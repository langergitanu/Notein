package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p523yd.C12815x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.qq */
/* JADX INFO: loaded from: classes3.dex */
public class C1921qq extends C12815x1 {

    /* JADX INFO: renamed from: k4 */
    private String f6851k4;

    public C1921qq(String str) {
        super(str);
    }

    @Override // com.aspose.slides.internal.p523yd.C12815x1, java.lang.Throwable
    public String getMessage() {
        return this.f6851k4 != null ? C14113y2.m67408k4(super.getMessage(), "; property:'", this.f6851k4, "'") : super.getMessage();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9887k4(C1904ar c1904ar) {
        m59590k4(c1904ar.m9854to().m14393k4().m14106m_());
        this.f6851k4 = c1904ar.m9848du().m17229to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9888k4(String str) {
        this.f6851k4 = str;
    }
}
