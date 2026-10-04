package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class c9d extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private boolean f20967c5;

    /* JADX INFO: renamed from: ck */
    private va3 f20968ck;

    /* JADX INFO: renamed from: du */
    private int f20969du;

    /* JADX INFO: renamed from: dy */
    private boolean f20970dy;

    /* JADX INFO: renamed from: h4 */
    private long f20971h4;

    /* JADX INFO: renamed from: jd */
    private String f20972jd;

    /* JADX INFO: renamed from: kk */
    private long f20973kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f20974m9;

    /* JADX INFO: renamed from: to */
    private boolean f20975to;

    /* JADX INFO: renamed from: x1 */
    private String f20976x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f20966k4 = zk0.m45638k4("whole");

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f20965fa = new C7017h4("spid", "grpId", "uiExpand", "build", "bldLvl", "animBg", "autoUpdateAnimBg", "rev", "advAuto", "tmplLst");

    public c9d() {
        m29476ck();
    }

    /* JADX INFO: renamed from: ck */
    private void m29476ck() {
        this.f20975to = false;
        this.f20969du = f20966k4;
        this.f20971h4 = 1L;
        this.f20974m9 = false;
        this.f20970dy = true;
        this.f20967c5 = false;
        this.f20972jd = "indefinite";
    }

    /* JADX INFO: renamed from: c5 */
    public final String m29488c5() {
        return this.f20972jd;
    }

    /* JADX INFO: renamed from: du */
    public final long m29489du() {
        return this.f20971h4;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m29490dy() {
        return this.f20967c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m29491h4() {
        return this.f20974m9;
    }

    /* JADX INFO: renamed from: kk */
    public final void m29497kk(boolean z) {
        this.f20967c5 = z;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m29499m9() {
        return this.f20970dy;
    }

    /* JADX INFO: renamed from: to */
    public final int m29500to() {
        return this.f20969du;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m29501x1() {
        return this.f20973kk;
    }

    public c9d(final AbstractC13912i5 abstractC13912i5) {
        m29476ck();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.c9d.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (c9d.f20965fa.m27428k4(str)) {
                    case 0:
                        c9d.this.f20976x1 = str2;
                        break;
                    case 1:
                        c9d.this.f20973kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 2:
                        c9d.this.f20975to = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        c9d.this.f20969du = zk0.m45638k4(str2);
                        break;
                    case 4:
                        c9d.this.f20971h4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 5:
                        c9d.this.f20974m9 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        c9d.this.f20970dy = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        c9d.this.f20967c5 = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        c9d.this.f20972jd = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.c9d.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (c9d.f20965fa.m27428k4(abstractC13912i5.mo65023fa()) != 9) {
                    return false;
                }
                c9d.this.f20968ck = new va3(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m29498kk() {
        return this.f20975to;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m29492k4() {
        return this.f20976x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29502x1(long j) {
        this.f20971h4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29503x1(String str) {
        this.f20972jd = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29493k4(int i) {
        this.f20969du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29504x1(boolean z) {
        this.f20974m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29494k4(long j) {
        this.f20973kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29495k4(String str) {
        this.f20976x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("spid", this.f20976x1);
        c3059ii.m12955x1("grpId", C13850af.m65147x1(this.f20973kk));
        boolean z = this.f20975to;
        if (z) {
            c3059ii.m12955x1("uiExpand", z ? "1" : "0");
        }
        int i = this.f20969du;
        if (i != f20966k4) {
            c3059ii.m12955x1("build", zk0.m45639k4(i));
        }
        long j = this.f20971h4;
        if ((4294967295L & j) != 1) {
            c3059ii.m12955x1("bldLvl", C13850af.m65147x1(j));
        }
        boolean z2 = this.f20974m9;
        if (z2) {
            c3059ii.m12955x1("animBg", z2 ? "1" : "0");
        }
        boolean z3 = this.f20970dy;
        if (!z3) {
            c3059ii.m12955x1("autoUpdateAnimBg", z3 ? "1" : "0");
        }
        boolean z4 = this.f20967c5;
        if (z4) {
            c3059ii.m12955x1("rev", z4 ? "1" : "0");
        }
        if (!"indefinite".equals(this.f20972jd)) {
            c3059ii.m12955x1("advAuto", this.f20972jd);
        }
        va3 va3Var = this.f20968ck;
        if (va3Var != null) {
            va3Var.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "tmplLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29496k4(boolean z) {
        this.f20975to = z;
    }
}
