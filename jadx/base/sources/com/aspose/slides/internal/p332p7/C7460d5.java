package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.d5 */
/* JADX INFO: loaded from: classes4.dex */
public class C7460d5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21477kk = new C7017h4("x", "y");

    /* JADX INFO: renamed from: k4 */
    private double f21478k4;

    /* JADX INFO: renamed from: x1 */
    private double f21479x1;

    public C7460d5() {
        m30089to();
    }

    /* JADX INFO: renamed from: to */
    private void m30089to() {
        this.f21478k4 = Double.NaN;
        this.f21479x1 = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m30091k4() {
        return this.f21478k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m30093x1() {
        return this.f21479x1;
    }

    public C7460d5(final AbstractC13912i5 abstractC13912i5) {
        m30089to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.d5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7460d5.f21477kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    abstractC13912i5.mo65026h4();
                    C7460d5.this.f21478k4 = AbstractC7361bz.m29300yj(abstractC13912i5.mo65042rv());
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    abstractC13912i5.mo65026h4();
                    C7460d5.this.f21479x1 = AbstractC7361bz.m29300yj(abstractC13912i5.mo65042rv());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30092k4(double d) {
        this.f21478k4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m30094x1(double d) {
        this.f21479x1 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        m29301k4("cdr", c3059ii, "x", C13850af.m65101k4(this.f21478k4), false);
        m29301k4("cdr", c3059ii, "y", C13850af.m65101k4(this.f21479x1), false);
        c3059ii.mo21898jd();
    }
}
