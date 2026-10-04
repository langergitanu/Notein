package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.a2 */
/* JADX INFO: loaded from: classes4.dex */
public class C7208a2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f19804to = new C7017h4("unit", "unitsLabel", "extLst");

    /* JADX INFO: renamed from: k4 */
    private int f19805k4;

    /* JADX INFO: renamed from: kk */
    private C7249ah f19806kk;

    /* JADX INFO: renamed from: x1 */
    private C8534pn f19807x1;

    public C7208a2() {
        m27900du();
    }

    /* JADX INFO: renamed from: du */
    private void m27900du() {
        this.f19805k4 = 0;
    }

    /* JADX INFO: renamed from: kk */
    public final C8534pn m27907kk() {
        return this.f19807x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m27908x1() {
        return this.f19805k4;
    }

    public C7208a2(final AbstractC13912i5 abstractC13912i5) {
        m27900du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.a2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7208a2.f19804to.m27428k4(str) != 0) {
                    return false;
                }
                C7208a2.this.f19805k4 = C8431oe.m38204k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.a2.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7208a2.f19804to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7208a2.this.f19807x1 = new C8534pn(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7208a2.this.f19806kk = new C7249ah(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8534pn m27905k4() {
        if (this.f19807x1 != null) {
            throw new Exception("Only one <unitsLabel> element can be added.");
        }
        C8534pn c8534pn = new C8534pn();
        this.f19807x1 = c8534pn;
        return c8534pn;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27906k4(int i) {
        this.f19805k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f19805k4;
        if (i != 0) {
            c3059ii.m12955x1("unit", C8431oe.m38205k4(i));
        }
        C8534pn c8534pn = this.f19807x1;
        if (c8534pn != null) {
            c8534pn.mo6846k4("cx", c3059ii, "unitsLabel");
        }
        C7249ah c7249ah = this.f19806kk;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
