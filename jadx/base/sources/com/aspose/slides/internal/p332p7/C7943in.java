package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.in */
/* JADX INFO: loaded from: classes4.dex */
public class C7943in extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24822kk = new C7017h4("manualLayout", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C7445cv f24823k4;

    /* JADX INFO: renamed from: x1 */
    private C7683fo f24824x1;

    public C7943in() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7445cv m34313k4() {
        if (this.f24823k4 != null) {
            throw new Exception("Only one <manualLayout> element can be added.");
        }
        C7445cv c7445cv = new C7445cv();
        this.f24823k4 = c7445cv;
        return c7445cv;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC7414ck m34315kk() {
        return this.f24824x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7445cv m34316x1() {
        return this.f24823k4;
    }

    public C7943in(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.in.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7943in.f24822kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7943in.this.f24823k4 = new C7445cv(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C7943in.this.f24824x1 = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34314k4(AbstractC7414ck abstractC7414ck) {
        this.f24824x1 = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7445cv c7445cv = this.f24823k4;
        if (c7445cv != null) {
            c7445cv.mo6846k4("c", c3059ii, "manualLayout");
        }
        C7683fo c7683fo = this.f24824x1;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
