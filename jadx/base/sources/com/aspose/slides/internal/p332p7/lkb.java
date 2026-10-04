package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class lkb extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private int f26378du;

    /* JADX INFO: renamed from: kk */
    private long f26379kk;

    /* JADX INFO: renamed from: to */
    private boolean f26380to;

    /* JADX INFO: renamed from: x1 */
    private String f26381x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f26377k4 = u0i.m42060k4("whole");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f26376h4 = new C7017h4("spid", "grpId", "uiExpand", "bld");

    public lkb() {
        m36212to();
    }

    /* JADX INFO: renamed from: to */
    private void m36212to() {
        this.f26380to = false;
        this.f26378du = f26377k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m36216x1() {
        return this.f26378du;
    }

    public lkb(AbstractC13912i5 abstractC13912i5) {
        m36212to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lkb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = lkb.f26376h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    lkb.this.f26381x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    lkb.this.f26379kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    lkb.this.f26380to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                lkb.this.f26378du = u0i.m42060k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m36213k4() {
        return this.f26381x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36214k4(int i) {
        this.f26378du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36215k4(String str) {
        this.f26381x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("spid", this.f26381x1);
        c3059ii.m12955x1("grpId", C13850af.m65147x1(this.f26379kk));
        boolean z = this.f26380to;
        if (z) {
            c3059ii.m12955x1("uiExpand", z ? "1" : "0");
        }
        int i = this.f26378du;
        if (i != f26377k4) {
            c3059ii.m12955x1("bld", u0i.m42061k4(i));
        }
        c3059ii.mo21898jd();
    }
}
