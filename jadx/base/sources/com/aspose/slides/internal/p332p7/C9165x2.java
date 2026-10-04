package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.x2 */
/* JADX INFO: loaded from: classes4.dex */
public class C9165x2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f32687to = new C7017h4("x", "y", "z");

    /* JADX INFO: renamed from: k4 */
    private double f32688k4;

    /* JADX INFO: renamed from: kk */
    private double f32689kk;

    /* JADX INFO: renamed from: x1 */
    private double f32690x1;

    public C9165x2() {
        m44165du();
    }

    /* JADX INFO: renamed from: du */
    private void m44165du() {
        this.f32688k4 = Double.NaN;
        this.f32690x1 = Double.NaN;
        this.f32689kk = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m44170k4() {
        return this.f32688k4;
    }

    /* JADX INFO: renamed from: kk */
    public final double m44172kk() {
        return this.f32689kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m44174x1() {
        return this.f32690x1;
    }

    public C9165x2(AbstractC13912i5 abstractC13912i5) {
        m44165du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.x2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9165x2.f32687to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9165x2.this.f32688k4 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C9165x2.this.f32690x1 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C9165x2.this.f32689kk = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44171k4(double d) {
        this.f32688k4 = d;
    }

    /* JADX INFO: renamed from: kk */
    public final void m44173kk(double d) {
        this.f32689kk = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m44175x1(double d) {
        this.f32690x1 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("x", C22238OooO0oO.OooO00o(this.f32688k4, 12700.0d, 14));
        c3059ii.m12955x1("y", C22238OooO0oO.OooO00o(this.f32690x1, 12700.0d, 14));
        c3059ii.m12955x1("z", C22238OooO0oO.OooO00o(this.f32689kk, 12700.0d, 14));
        c3059ii.mo21898jd();
    }
}
