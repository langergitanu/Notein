package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.d6 */
/* JADX INFO: loaded from: classes4.dex */
public class C7462d6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f21516h4 = new C7017h4("sd", "custGeom", "prstGeom", C18437z2.f56754h, "seed", "extLst");

    /* JADX INFO: renamed from: du */
    private C8397nz f21517du;

    /* JADX INFO: renamed from: k4 */
    private long f21518k4;

    /* JADX INFO: renamed from: kk */
    private C8026jo f21519kk;

    /* JADX INFO: renamed from: to */
    private long f21520to;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f21521x1;

    public C7462d6() {
        m30142h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m30142h4() {
        this.f21518k4 = 4294967295L;
        this.f21520to = 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m30151kk() {
        return this.f21521x1;
    }

    /* JADX INFO: renamed from: to */
    public final C8026jo m30152to() {
        return this.f21519kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m30153x1() {
        return this.f21518k4;
    }

    public C7462d6(final AbstractC13912i5 abstractC13912i5) {
        m30142h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.d6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7462d6.f21516h4.m27428k4(str) != 0) {
                    return false;
                }
                C7462d6.this.f21518k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.d6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7462d6 c7462d6;
                C7394ca c7394ca;
                int iM27428k4 = C7462d6.f21516h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    c7462d6 = C7462d6.this;
                    c7394ca = new C7394ca("custGeom", new C7707fw(abstractC13912i5));
                } else {
                    if (iM27428k4 != 2) {
                        if (iM27428k4 == 3) {
                            C7462d6.this.f21519kk = new C8026jo(abstractC13912i5);
                        } else if (iM27428k4 == 4) {
                            abstractC13912i5.mo65026h4();
                            C7462d6.this.f21520to = AbstractC7361bz.m29295ne(abstractC13912i5.mo65042rv());
                        } else {
                            if (iM27428k4 != 5) {
                                return false;
                            }
                            C7462d6.this.f21517du = new C8397nz(abstractC13912i5);
                        }
                        return true;
                    }
                    c7462d6 = C7462d6.this;
                    c7394ca = new C7394ca("prstGeom", new C9365zg(abstractC13912i5));
                }
                c7462d6.f21521x1 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m30148k4(String str) {
        C7394ca c7394ca;
        if (this.f21521x1 != null) {
            throw new Exception("Geometry already is initialized.");
        }
        int iM27428k4 = f21516h4.m27428k4(str);
        if (iM27428k4 == 1) {
            c7394ca = new C7394ca("custGeom", new C7707fw());
        } else {
            if (iM27428k4 != 2) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("prstGeom", new C9365zg());
        }
        this.f21521x1 = c7394ca;
        return this.f21521x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8026jo m30149k4() {
        if (this.f21519kk != null) {
            throw new Exception("Only one <type> element can be added.");
        }
        C8026jo c8026jo = new C8026jo();
        this.f21519kk = c8026jo;
        return c8026jo;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30150k4(long j) {
        this.f21518k4 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C7462d6 c7462d6;
        C3059ii c3059ii2;
        c3059ii.mo12953k4("ask", str2, "http://schemas.microsoft.com/office/drawing/2018/sketchyshapes");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        long j = this.f21518k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("sd", C13850af.m65147x1(j));
        }
        C7394ca c7394ca = this.f21521x1;
        if (c7394ca != null) {
            int iM27428k4 = f21516h4.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 1) {
                ((C7707fw) this.f21521x1.m29541kk()).mo6846k4("a", c3059ii, this.f21521x1.m29539k4());
            } else if (iM27428k4 == 2) {
                ((C9365zg) this.f21521x1.m29541kk()).mo6846k4("a", c3059ii, this.f21521x1.m29539k4());
            }
        }
        C8026jo c8026jo = this.f21519kk;
        if (c8026jo != null) {
            c8026jo.mo6846k4("ask", c3059ii, C18437z2.f56754h);
        }
        long j2 = this.f21520to;
        if ((j2 & 4294967295L) != 4294967295L) {
            c7462d6 = this;
            c3059ii2 = c3059ii;
            c7462d6.m29301k4("ask", c3059ii2, "seed", C13850af.m65147x1(j2), false);
        } else {
            c7462d6 = this;
            c3059ii2 = c3059ii;
        }
        C8397nz c8397nz = c7462d6.f21517du;
        if (c8397nz != null) {
            c8397nz.mo6846k4("ask", c3059ii2, "extLst");
        }
        c3059ii2.mo21898jd();
    }
}
