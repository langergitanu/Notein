package com.aspose.slides.internal.p332p7;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ok */
/* JADX INFO: loaded from: classes4.dex */
public class C8450ok extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27992to = new C7017h4("idx", RequestParameters.SUBRESOURCE_DELETE, "txPr", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8452ol f27993k4;

    /* JADX INFO: renamed from: kk */
    private C7683fo f27994kk;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f27995x1;

    public C8450ok() {
        this.f27993k4 = new C8452ol();
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC7414ck m38317kk() {
        return this.f27994kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m38318x1() {
        return this.f27995x1;
    }

    public C8450ok(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ok.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8450ok c8450ok;
                C7394ca c7394ca;
                int iM27428k4 = C8450ok.f27992to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 != 0) {
                    if (iM27428k4 == 1) {
                        c8450ok = C8450ok.this;
                        c7394ca = new C7394ca(RequestParameters.SUBRESOURCE_DELETE, new C8828t1(abstractC13912i5));
                    } else if (iM27428k4 == 2) {
                        c8450ok = C8450ok.this;
                        c7394ca = new C7394ca("txPr", new C8952ug(abstractC13912i5));
                    } else {
                        if (iM27428k4 != 3) {
                            return false;
                        }
                        C8450ok.this.f27994kk = new C7683fo(abstractC13912i5);
                    }
                    c8450ok.f27995x1 = c7394ca;
                } else {
                    C8450ok.this.f27993k4 = new C8452ol(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m38314k4(String str) {
        C7394ca c7394ca;
        if (this.f27995x1 != null) {
            throw new Exception("DeleteOrContent already is initialized.");
        }
        int iM27428k4 = f27992to.m27428k4(str);
        if (iM27428k4 == 1) {
            c7394ca = new C7394ca(RequestParameters.SUBRESOURCE_DELETE, new C8828t1());
        } else {
            if (iM27428k4 != 2) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("txPr", new C8952ug());
        }
        this.f27995x1 = c7394ca;
        return this.f27995x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8452ol m38315k4() {
        return this.f27993k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38316k4(AbstractC7414ck abstractC7414ck) {
        this.f27994kk = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f27993k4.mo6846k4("c", c3059ii, "idx");
        C7394ca c7394ca = this.f27995x1;
        if (c7394ca != null) {
            int iM27428k4 = f27992to.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 1) {
                ((C8828t1) this.f27995x1.m29541kk()).mo6846k4("c", c3059ii, this.f27995x1.m29539k4());
            } else if (iM27428k4 == 2) {
                ((C8952ug) this.f27995x1.m29541kk()).mo6846k4("c", c3059ii, this.f27995x1.m29539k4());
            }
        }
        C7683fo c7683fo = this.f27994kk;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
