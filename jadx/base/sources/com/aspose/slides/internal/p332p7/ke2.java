package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ke2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25619du = new C7017h4("w_FldCharType", "w_FldLock", "w_Dirty", "fldData", "ffData", "numberingChange");

    /* JADX INFO: renamed from: k4 */
    private int f25620k4;

    /* JADX INFO: renamed from: kk */
    private int f25621kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f25622to;

    /* JADX INFO: renamed from: x1 */
    private int f25623x1;

    public ke2() {
        m35319x1();
    }

    public ke2(final AbstractC13912i5 abstractC13912i5) {
        m35319x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ke2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ke2.f25619du.m27428k4(str);
                if (iM27428k4 == 0) {
                    ke2.this.f25620k4 = x5x.m44219k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    ke2.this.f25623x1 = vn6.m43185k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                ke2.this.f25621kk = vn6.m43185k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ke2.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                ke2 ke2Var;
                C7394ca c7394ca;
                int iM27428k4 = ke2.f25619du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    ke2Var = ke2.this;
                    c7394ca = new C7394ca("fldData", new q4n(abstractC13912i5));
                } else if (iM27428k4 == 4) {
                    ke2Var = ke2.this;
                    c7394ca = new C7394ca("ffData", new jp0(abstractC13912i5));
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    ke2Var = ke2.this;
                    c7394ca = new C7394ca("numberingChange", new bu2(abstractC13912i5));
                }
                ke2Var.f25622to = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m35319x1() {
        this.f25620k4 = 0;
        this.f25623x1 = 0;
        this.f25621kk = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w:fldCharType", x5x.m44220k4(this.f25620k4));
        int i = this.f25623x1;
        if (i != 0) {
            c3059ii.m12955x1("w:fldLock", vn6.m43186k4(i));
        }
        int i2 = this.f25621kk;
        if (i2 != 0) {
            c3059ii.m12955x1("w:dirty", vn6.m43186k4(i2));
        }
        C7394ca c7394ca = this.f25622to;
        if (c7394ca != null) {
            int iM27428k4 = f25619du.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 3) {
                ((q4n) this.f25622to.m29541kk()).mo6846k4("w", c3059ii, this.f25622to.m29539k4());
            } else if (iM27428k4 == 4) {
                ((jp0) this.f25622to.m29541kk()).mo6846k4("w", c3059ii, this.f25622to.m29539k4());
            } else if (iM27428k4 == 5) {
                ((bu2) this.f25622to.m29541kk()).mo6846k4("w", c3059ii, this.f25622to.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
