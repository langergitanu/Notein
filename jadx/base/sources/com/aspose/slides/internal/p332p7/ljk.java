package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class ljk extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f26347k4 = jfy.m34675k4("allAtOnce");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f26348m9 = new C7017h4("spid", "grpId", "uiExpand", "bld", "animBg");

    /* JADX INFO: renamed from: du */
    private int f26349du;

    /* JADX INFO: renamed from: h4 */
    private boolean f26350h4;

    /* JADX INFO: renamed from: kk */
    private long f26351kk;

    /* JADX INFO: renamed from: to */
    private boolean f26352to;

    /* JADX INFO: renamed from: x1 */
    private String f26353x1;

    public ljk() {
        m36182to();
    }

    /* JADX INFO: renamed from: to */
    private void m36182to() {
        this.f26352to = false;
        this.f26349du = f26347k4;
        this.f26350h4 = true;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m36187x1() {
        return this.f26349du;
    }

    public ljk(AbstractC13912i5 abstractC13912i5) {
        m36182to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ljk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ljk.f26348m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    ljk.this.f26353x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    ljk.this.f26351kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    ljk.this.f26352to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    ljk.this.f26349du = jfy.m34675k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                ljk.this.f26350h4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m36184k4() {
        return this.f26353x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36185k4(int i) {
        this.f26349du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36186k4(String str) {
        this.f26353x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("spid", this.f26353x1);
        c3059ii.m12955x1("grpId", C13850af.m65147x1(this.f26351kk));
        boolean z = this.f26352to;
        if (z) {
            c3059ii.m12955x1("uiExpand", z ? "1" : "0");
        }
        int i = this.f26349du;
        if (i != f26347k4) {
            c3059ii.m12955x1("bld", jfy.m34676k4(i));
        }
        boolean z2 = this.f26350h4;
        if (!z2) {
            c3059ii.m12955x1("animBg", z2 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
