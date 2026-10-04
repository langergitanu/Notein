package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.v5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9001v5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f31543x1 = new C7017h4("strRef", "v");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f31544k4;

    public C9001v5() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m42725k4() {
        return this.f31544k4;
    }

    public C9001v5(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.v5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C9001v5 c9001v5;
                C7394ca c7394ca;
                int iM27428k4 = C9001v5.f31543x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9001v5.this.f31544k4 = new C7394ca("strRef", new C7626f0(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    if (abstractC13912i5.mo65048u4()) {
                        c9001v5 = C9001v5.this;
                        c7394ca = new C7394ca("v", "");
                    } else {
                        abstractC13912i5.mo65026h4();
                        c9001v5 = C9001v5.this;
                        c7394ca = new C7394ca("v", abstractC13912i5.mo65042rv());
                    }
                    c9001v5.f31544k4 = c7394ca;
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m42726k4(String str) {
        C7394ca c7394ca;
        if (this.f31544k4 != null) {
            throw new Exception("Text already is initialized.");
        }
        int iM27428k4 = f31543x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("strRef", new C7626f0());
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("v", C14113y2.f47374k4);
        }
        this.f31544k4 = c7394ca;
        return this.f31544k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42727k4(C7394ca c7394ca) {
        this.f31544k4 = c7394ca;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f31544k4;
        if (c7394ca == null) {
            c3059ii2 = c3059ii;
        } else {
            int iM27428k4 = f31543x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                c3059ii2 = c3059ii;
                ((C7626f0) this.f31544k4.m29541kk()).mo6846k4("c", c3059ii2, this.f31544k4.m29539k4());
            } else if (iM27428k4 == 1) {
                c3059ii2 = c3059ii;
                m29301k4("c", c3059ii2, "v", (String) this.f31544k4.m29541kk(), false);
            }
        }
        c3059ii2.mo21898jd();
    }
}
