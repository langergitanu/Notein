package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class yxj extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33570x1 = new C7017h4("text", "drawing", "presentation", "spreadsheet", "chart", "image");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f33571k4;

    public yxj() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m45214k4() {
        return this.f33571k4;
    }

    public yxj(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yxj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                yxj yxjVar;
                C7394ca c7394ca;
                int iM27428k4 = yxj.f33570x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    yxjVar = yxj.this;
                    c7394ca = new C7394ca("text", new lv5(abstractC13912i5));
                } else if (iM27428k4 == 1) {
                    yxjVar = yxj.this;
                    c7394ca = new C7394ca("drawing", new bz7(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    yxjVar = yxj.this;
                    c7394ca = new C7394ca("presentation", new oax(abstractC13912i5));
                } else if (iM27428k4 == 3) {
                    yxjVar = yxj.this;
                    c7394ca = new C7394ca("spreadsheet", new q1h(abstractC13912i5));
                } else if (iM27428k4 == 4) {
                    yxjVar = yxj.this;
                    c7394ca = new C7394ca("chart", new n4n(abstractC13912i5));
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    yxjVar = yxj.this;
                    c7394ca = new C7394ca("image", new pzd(abstractC13912i5));
                }
                yxjVar.f33571k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m45215k4(String str) {
        C7394ca c7394ca;
        if (this.f33571k4 != null) {
            throw new Exception("Body already is initialized.");
        }
        int iM27428k4 = f33570x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("text", new lv5());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("drawing", new bz7());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("presentation", new oax());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("spreadsheet", new q1h());
        } else if (iM27428k4 == 4) {
            c7394ca = new C7394ca("chart", new n4n());
        } else {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("image", new pzd());
        }
        this.f33571k4 = c7394ca;
        return this.f33571k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f33571k4;
        if (c7394ca != null) {
            int iM27428k4 = f33570x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((lv5) this.f33571k4.m29541kk()).mo6846k4("office", c3059ii, this.f33571k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((bz7) this.f33571k4.m29541kk()).mo6846k4("office", c3059ii, this.f33571k4.m29539k4());
            } else if (iM27428k4 == 2) {
                ((oax) this.f33571k4.m29541kk()).mo6846k4("office", c3059ii, this.f33571k4.m29539k4());
            } else if (iM27428k4 == 3) {
                ((q1h) this.f33571k4.m29541kk()).mo6846k4("office", c3059ii, this.f33571k4.m29539k4());
            } else if (iM27428k4 == 4) {
                ((n4n) this.f33571k4.m29541kk()).mo6846k4("office", c3059ii, this.f33571k4.m29539k4());
            } else if (iM27428k4 == 5) {
                ((pzd) this.f33571k4.m29541kk()).mo6846k4("office", c3059ii, this.f33571k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
