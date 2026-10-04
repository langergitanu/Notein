package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jp */
/* JADX INFO: loaded from: classes4.dex */
public final class C8028jp extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25281du = new C7017h4("intervalClosed", "underflow", "overflow", "binSize", "binCount");

    /* JADX INFO: renamed from: k4 */
    private int f25282k4;

    /* JADX INFO: renamed from: kk */
    private String f25283kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f25284to;

    /* JADX INFO: renamed from: x1 */
    private String f25285x1;

    public C8028jp() {
        this.f25282k4 = 0;
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m34862kk() {
        return this.f25284to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m34864x1() {
        return this.f25283kk;
    }

    public C8028jp(final AbstractC13912i5 abstractC13912i5) {
        this();
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj())) {
                int iM27428k4 = f25281du.m27428k4(AbstractC7361bz.m29293kk(abstractC13912i5));
                if (iM27428k4 == 0) {
                    this.f25282k4 = C7706fv.m32089k4(abstractC13912i5.mo65042rv());
                } else if (iM27428k4 == 1) {
                    this.f25285x1 = abstractC13912i5.mo65042rv();
                } else if (iM27428k4 == 2) {
                    this.f25283kk = abstractC13912i5.mo65042rv();
                }
            }
        }
        abstractC13912i5.mo65020du();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8028jp c8028jp;
                C7394ca c7394ca;
                int iM27428k42 = C8028jp.f25281du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k42 == 3) {
                    String strMo65046to = abstractC13912i5.mo65046to("val");
                    c8028jp = C8028jp.this;
                    c7394ca = new C7394ca("binSize", Double.valueOf(AbstractC7361bz.m29300yj(strMo65046to)));
                } else {
                    if (iM27428k42 != 4) {
                        return false;
                    }
                    String strMo65046to2 = abstractC13912i5.mo65046to("val");
                    c8028jp = C8028jp.this;
                    c7394ca = new C7394ca("binCount", Long.valueOf(C13850af.m65122ks(strMo65046to2) & 4294967295L));
                }
                c8028jp.f25284to = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m34859k4(String str) {
        C7394ca c7394ca;
        if (this.f25284to != null) {
            throw new Exception("Value already is initialized.");
        }
        int iM27428k4 = f25281du.m27428k4(str);
        if (iM27428k4 == 3) {
            c7394ca = new C7394ca("binSize", (Double) C7019kk.m27467x1(Double.TYPE));
        } else {
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("binCount", (Long) C7019kk.m27467x1(Long.TYPE));
        }
        this.f25284to = c7394ca;
        return this.f25284to;
    }

    /* JADX INFO: renamed from: kk */
    public final void m34863kk(String str) {
        this.f25283kk = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m34865x1(String str) {
        this.f25285x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m34860k4() {
        return this.f25285x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34861k4(int i) {
        this.f25282k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        String strM65101k4;
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f25282k4;
        if (i != 0) {
            c3059ii.m12955x1("intervalClosed", C7706fv.m32090k4(i));
        }
        String str3 = this.f25285x1;
        if (str3 != null) {
            c3059ii.m12955x1("underflow", str3);
        }
        String str4 = this.f25283kk;
        if (str4 != null) {
            c3059ii.m12955x1("overflow", str4);
        }
        C7394ca c7394ca = this.f25284to;
        if (c7394ca != null) {
            int iM27428k4 = f25281du.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 3) {
                c3059ii.mo12953k4("cx", "binSize", (String) null);
                strM65101k4 = C13850af.m65101k4(((Double) C7019kk.m27464to(this.f25284to.m29541kk(), Double.TYPE)).doubleValue());
            } else if (iM27428k4 == 4) {
                c3059ii.mo12953k4("cx", "binCount", (String) null);
                strM65101k4 = C13850af.m65147x1(((Long) C7019kk.m27464to(this.f25284to.m29541kk(), Long.TYPE)).longValue());
            }
            c3059ii.m12955x1("val", strM65101k4);
            c3059ii.mo21898jd();
        }
        c3059ii.mo21898jd();
    }
}
