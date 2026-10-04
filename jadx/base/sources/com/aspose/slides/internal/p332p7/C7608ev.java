package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ev */
/* JADX INFO: loaded from: classes4.dex */
public class C7608ev extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f22501x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private float f22502k4;

    public C7608ev() {
        m31395kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m31395kk() {
        this.f22502k4 = Float.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m31397k4() {
        return this.f22502k4;
    }

    public C7608ev(AbstractC13912i5 abstractC13912i5) {
        m31395kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ev.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7608ev.f22501x1.m27428k4(str) != 0) {
                    return false;
                }
                C7608ev.this.f22502k4 = C13850af.m65151yj(str2) / 60000.0f;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31398k4(float f) {
        this.f22502k4 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C13850af.m65103k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(this.f22502k4 * 60000.0f)), 14)));
        c3059ii.mo21898jd();
    }
}
