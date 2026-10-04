package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.s0 */
/* JADX INFO: loaded from: classes4.dex */
public class C8727s0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f29814du = new C7017h4("l", "t", "r", "b");

    /* JADX INFO: renamed from: k4 */
    private String f29815k4;

    /* JADX INFO: renamed from: kk */
    private String f29816kk;

    /* JADX INFO: renamed from: to */
    private String f29817to;

    /* JADX INFO: renamed from: x1 */
    private String f29818x1;

    public C8727s0() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m40653k4() {
        return this.f29815k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m40655kk() {
        return this.f29816kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m40657to() {
        return this.f29817to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m40659x1() {
        return this.f29818x1;
    }

    public C8727s0(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.s0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8727s0.f29814du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8727s0.this.f29815k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8727s0.this.f29818x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C8727s0.this.f29816kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C8727s0.this.f29817to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40654k4(String str) {
        this.f29815k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m40656kk(String str) {
        this.f29816kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m40658to(String str) {
        this.f29817to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40660x1(String str) {
        this.f29818x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("l", this.f29815k4);
        c3059ii.m12955x1("t", this.f29818x1);
        c3059ii.m12955x1("r", this.f29816kk);
        c3059ii.m12955x1("b", this.f29817to);
        c3059ii.mo21898jd();
    }
}
