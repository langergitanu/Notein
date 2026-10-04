package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class ecy extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private idr f22083c5;

    /* JADX INFO: renamed from: du */
    private int f22084du;

    /* JADX INFO: renamed from: dy */
    private idr f22085dy;

    /* JADX INFO: renamed from: h4 */
    private int f22086h4;

    /* JADX INFO: renamed from: jd */
    private ltr f22087jd;

    /* JADX INFO: renamed from: kk */
    private boolean f22088kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f22089m9;

    /* JADX INFO: renamed from: to */
    private boolean f22090to;

    /* JADX INFO: renamed from: k4 */
    public static final int f22081k4 = ub2.m42240k4("restored");

    /* JADX INFO: renamed from: x1 */
    public static final int f22082x1 = ub2.m42240k4("restored");

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f22080ck = new C7017h4("showOutlineIcons", "snapVertSplitter", "vertBarState", "horzBarState", "preferSingleView", "restoredLeft", "restoredTop", "extLst");

    public ecy() {
        m30885c5();
        this.f22085dy = new idr();
        this.f22083c5 = new idr();
    }

    /* JADX INFO: renamed from: c5 */
    private void m30885c5() {
        this.f22088kk = true;
        this.f22090to = false;
        this.f22084du = f22081k4;
        this.f22086h4 = f22082x1;
        this.f22089m9 = false;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m30895du() {
        return this.f22089m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final idr m30896h4() {
        return this.f22085dy;
    }

    /* JADX INFO: renamed from: kk */
    public final int m30900kk() {
        return this.f22084du;
    }

    /* JADX INFO: renamed from: m9 */
    public final idr m30902m9() {
        return this.f22083c5;
    }

    /* JADX INFO: renamed from: to */
    public final int m30903to() {
        return this.f22086h4;
    }

    public ecy(final AbstractC13912i5 abstractC13912i5) {
        m30885c5();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ecy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ecy.f22080ck.m27428k4(str);
                if (iM27428k4 == 0) {
                    ecy.this.f22088kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    ecy.this.f22090to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    ecy.this.f22084du = ub2.m42240k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    ecy.this.f22086h4 = ub2.m42240k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                ecy.this.f22089m9 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ecy.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ecy.f22080ck.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 5) {
                    ecy.this.f22085dy = new idr(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 6) {
                    ecy.this.f22083c5 = new idr(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                ecy.this.f22087jd = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final void m30901kk(boolean z) {
        this.f22089m9 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m30904x1(int i) {
        this.f22086h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30897k4(int i) {
        this.f22084du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m30905x1(boolean z) {
        this.f22090to = z;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f22088kk;
        if (!z) {
            c3059ii.m12955x1("showOutlineIcons", z ? "1" : "0");
        }
        boolean z2 = this.f22090to;
        if (z2) {
            c3059ii.m12955x1("snapVertSplitter", z2 ? "1" : "0");
        }
        int i = this.f22084du;
        if (i != f22081k4) {
            c3059ii.m12955x1("vertBarState", ub2.m42241k4(i));
        }
        int i2 = this.f22086h4;
        if (i2 != f22082x1) {
            c3059ii.m12955x1("horzBarState", ub2.m42241k4(i2));
        }
        boolean z3 = this.f22089m9;
        if (z3) {
            c3059ii.m12955x1("preferSingleView", z3 ? "1" : "0");
        }
        this.f22085dy.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "restoredLeft");
        this.f22083c5.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "restoredTop");
        ltr ltrVar = this.f22087jd;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m30906x1() {
        return this.f22090to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30898k4(boolean z) {
        this.f22088kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m30899k4() {
        return this.f22088kk;
    }
}
