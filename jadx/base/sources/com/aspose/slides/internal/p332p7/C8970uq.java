package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.uq */
/* JADX INFO: loaded from: classes4.dex */
public class C8970uq extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f31383x1 = new C7017h4("strRef", "rich");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f31384k4;

    public C8970uq() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m42523k4() {
        return this.f31384k4;
    }

    public C8970uq(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8970uq c8970uq;
                C7394ca c7394ca;
                int iM27428k4 = C8970uq.f31383x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c8970uq = C8970uq.this;
                    c7394ca = new C7394ca("strRef", new C7626f0(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    c8970uq = C8970uq.this;
                    c7394ca = new C7394ca("rich", new C8952ug(abstractC13912i5));
                }
                c8970uq.f31384k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m42524k4(String str) {
        C7394ca c7394ca;
        if (this.f31384k4 != null) {
            throw new Exception("Text already is initialized.");
        }
        int iM27428k4 = f31383x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("strRef", new C7626f0());
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("rich", new C8952ug());
        }
        this.f31384k4 = c7394ca;
        return this.f31384k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f31384k4;
        if (c7394ca != null) {
            int iM27428k4 = f31383x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((C7626f0) this.f31384k4.m29541kk()).mo6846k4("c", c3059ii, this.f31384k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C8952ug) this.f31384k4.m29541kk()).mo6846k4("c", c3059ii, this.f31384k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
