package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class x7y extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f32736k4 = dv3.m30678k4("all");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f32737to = new C7017h4("embed", "show");

    /* JADX INFO: renamed from: kk */
    private int f32738kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f32739x1;

    public x7y() {
        m44236x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m44236x1() {
        this.f32739x1 = false;
        this.f32738kk = f32736k4;
    }

    public x7y(AbstractC13912i5 abstractC13912i5) {
        m44236x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.x7y.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = x7y.f32737to.m27428k4(str);
                if (iM27428k4 == 0) {
                    x7y.this.f32739x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                x7y.this.f32738kk = dv3.m30678k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f32739x1;
        if (z) {
            c3059ii.m12955x1("embed", z ? "1" : "0");
        }
        int i = this.f32738kk;
        if (i != f32736k4) {
            c3059ii.m12955x1("show", dv3.m30679k4(i));
        }
        c3059ii.mo21898jd();
    }
}
