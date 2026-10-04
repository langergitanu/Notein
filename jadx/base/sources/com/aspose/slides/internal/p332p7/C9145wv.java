package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wv */
/* JADX INFO: loaded from: classes4.dex */
public final class C9145wv extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f32606k4 = C7605eu.m31361k4("percentage");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32607kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f32608x1;

    public C9145wv() {
        this.f32608x1 = f32606k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m44084k4() {
        return this.f32608x1;
    }

    public C9145wv(AbstractC13912i5 abstractC13912i5) {
        this();
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj()) && f32607kk.m27428k4(AbstractC7361bz.m29293kk(abstractC13912i5)) == 0) {
                this.f32608x1 = C7605eu.m31361k4(abstractC13912i5.mo65042rv());
            }
        }
        abstractC13912i5.mo65020du();
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44085k4(int i) {
        this.f32608x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C7605eu.m31362k4(this.f32608x1));
        c3059ii.mo21898jd();
    }
}
