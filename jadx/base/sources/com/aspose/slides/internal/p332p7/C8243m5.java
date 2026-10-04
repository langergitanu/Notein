package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.m5 */
/* JADX INFO: loaded from: classes4.dex */
public class C8243m5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f26650to = new C7017h4("lat", "lon", "rev");

    /* JADX INFO: renamed from: k4 */
    private float f26651k4;

    /* JADX INFO: renamed from: kk */
    private float f26652kk;

    /* JADX INFO: renamed from: x1 */
    private float f26653x1;

    public C8243m5() {
        m36582du();
    }

    /* JADX INFO: renamed from: du */
    private void m36582du() {
        this.f26651k4 = Float.NaN;
        this.f26653x1 = Float.NaN;
        this.f26652kk = Float.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m36587k4() {
        return this.f26651k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m36589kk() {
        return this.f26652kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m36591x1() {
        return this.f26653x1;
    }

    public C8243m5(AbstractC13912i5 abstractC13912i5) {
        m36582du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.m5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8243m5.f26650to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8243m5.this.f26651k4 = C13850af.m65151yj(str2) / 60000.0f;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8243m5.this.f26653x1 = C13850af.m65151yj(str2) / 60000.0f;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8243m5.this.f26652kk = C13850af.m65151yj(str2) / 60000.0f;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36588k4(float f) {
        this.f26651k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m36590kk(float f) {
        this.f26652kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m36592x1(float f) {
        this.f26653x1 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        OooO00o.OooO00o(this.f26651k4 * 60000.0f, 14, c3059ii, "lat");
        OooO00o.OooO00o(this.f26653x1 * 60000.0f, 14, c3059ii, "lon");
        c3059ii.m12955x1("rev", C13850af.m65103k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(this.f26652kk * 60000.0f)), 14)));
        c3059ii.mo21898jd();
    }
}
