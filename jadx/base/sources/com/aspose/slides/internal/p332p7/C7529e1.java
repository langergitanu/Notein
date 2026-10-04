package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.e1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7529e1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21965kk = new C7017h4("pos", "ctrlPr");

    /* JADX INFO: renamed from: k4 */
    private C8195ll f21966k4;

    /* JADX INFO: renamed from: x1 */
    private C7782go f21967x1;

    public C7529e1() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7782go m30734k4() {
        if (this.f21967x1 != null) {
            throw new Exception("Only one <ctrlPr> element can be added.");
        }
        C7782go c7782go = new C7782go();
        this.f21967x1 = c7782go;
        return c7782go;
    }

    /* JADX INFO: renamed from: kk */
    public final C7782go m30736kk() {
        return this.f21967x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8195ll m30737x1() {
        return this.f21966k4;
    }

    public C7529e1(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.e1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7529e1.f21965kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7529e1.this.f21966k4 = new C8195ll(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C7529e1.this.f21967x1 = new C7782go(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30735k4(C8195ll c8195ll) {
        this.f21966k4 = c8195ll;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8195ll c8195ll = this.f21966k4;
        if (c8195ll != null) {
            c8195ll.mo6846k4("m", c3059ii, "pos");
        }
        C7782go c7782go = this.f21967x1;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}
