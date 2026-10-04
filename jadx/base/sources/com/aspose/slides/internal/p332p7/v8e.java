package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class v8e extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f31576du = new C7017h4("text:note-class", "text:id", "note-citation", "note-body");

    /* JADX INFO: renamed from: k4 */
    private int f31577k4;

    /* JADX INFO: renamed from: kk */
    private o6a f31578kk;

    /* JADX INFO: renamed from: to */
    private rri f31579to;

    /* JADX INFO: renamed from: x1 */
    private String f31580x1;

    public v8e() {
        m42756x1();
        this.f31578kk = new o6a();
        this.f31579to = new rri();
    }

    /* JADX INFO: renamed from: x1 */
    private void m42756x1() {
        this.f31577k4 = 0;
    }

    public v8e(final AbstractC13912i5 abstractC13912i5) {
        m42756x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.v8e.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = v8e.f31576du.m27428k4(str);
                if (iM27428k4 == 0) {
                    v8e.this.f31577k4 = olk.m38334k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                v8e.this.f31580x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.v8e.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = v8e.f31576du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    v8e.this.f31578kk = new o6a(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                v8e.this.f31579to = new rri(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:note-class", olk.m38335k4(this.f31577k4));
        String str3 = this.f31580x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:id", str3);
        }
        this.f31578kk.mo6846k4("text", c3059ii, "note-citation");
        this.f31579to.mo6846k4("text", c3059ii, "note-body");
        c3059ii.mo21898jd();
    }
}
