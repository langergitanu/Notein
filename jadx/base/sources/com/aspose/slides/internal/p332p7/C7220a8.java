package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.a8 */
/* JADX INFO: loaded from: classes4.dex */
public class C7220a8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f19870x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private float f19871k4;

    public C7220a8() {
        m27982kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m27982kk() {
        this.f19871k4 = Float.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m27984k4() {
        return this.f19871k4;
    }

    public C7220a8(AbstractC13912i5 abstractC13912i5) {
        m27982kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.a8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7220a8.f19870x1.m27428k4(str) != 0) {
                    return false;
                }
                C7220a8.this.f19871k4 = C13850af.m65151yj(str2) / 100.0f;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27985k4(float f) {
        this.f19871k4 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C13850af.m65103k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(this.f19871k4 * 100.0f)), 14)));
        c3059ii.mo21898jd();
    }
}
