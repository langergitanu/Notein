package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.m1 */
/* JADX INFO: loaded from: classes4.dex */
public class C8236m1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f26632x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private float f26633k4;

    public C8236m1() {
        m36561kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m36561kk() {
        this.f26633k4 = Float.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m36563k4() {
        return this.f26633k4;
    }

    public C8236m1(AbstractC13912i5 abstractC13912i5) {
        m36561kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.m1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8236m1.f26632x1.m27428k4(str) != 0) {
                    return false;
                }
                C8236m1.this.f26633k4 = C13850af.m65151yj(str2) / 100.0f;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36564k4(float f) {
        this.f26633k4 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!C14064he.m66715kk(this.f26633k4)) {
            OooO00o.OooO00o(this.f26633k4 * 100.0f, 14, c3059ii, "val");
        }
        c3059ii.mo21898jd();
    }
}
