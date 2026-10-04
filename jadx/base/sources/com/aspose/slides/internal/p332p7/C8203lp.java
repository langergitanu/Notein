package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.lp */
/* JADX INFO: loaded from: classes4.dex */
public class C8203lp extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26457kk = new C7017h4("r:id", "autoUpdate");

    /* JADX INFO: renamed from: k4 */
    private String f26458k4;

    /* JADX INFO: renamed from: x1 */
    private C8828t1 f26459x1;

    public C8203lp() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C8828t1 m36347k4() {
        if (this.f26459x1 != null) {
            throw new Exception("Only one <autoUpdate> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f26459x1 = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: kk */
    public final C8828t1 m36349kk() {
        return this.f26459x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m36350x1() {
        return this.f26458k4;
    }

    public C8203lp(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8203lp.f26457kk.m27428k4(str) != 0) {
                    return false;
                }
                C8203lp.this.f26458k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lp.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8203lp.f26457kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C8203lp.this.f26459x1 = new C8828t1(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36348k4(String str) {
        this.f26458k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f26458k4);
        C8828t1 c8828t1 = this.f26459x1;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "autoUpdate");
        }
        c3059ii.mo21898jd();
    }
}
