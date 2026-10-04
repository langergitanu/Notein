package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.tz */
/* JADX INFO: loaded from: classes4.dex */
public class C8910tz extends AbstractC7650fa {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30965h4 = new C7017h4("macro", "fPublished", "nvGraphicFramePr", "xfrm", "graphic");

    /* JADX INFO: renamed from: du */
    private C7902i2 f30966du;

    /* JADX INFO: renamed from: k4 */
    private String f30967k4;

    /* JADX INFO: renamed from: kk */
    private C9291yk f30968kk;

    /* JADX INFO: renamed from: to */
    private C9030ve f30969to;

    /* JADX INFO: renamed from: x1 */
    private boolean f30970x1;

    public C8910tz() {
        m42007h4();
        this.f30968kk = new C9291yk();
        this.f30969to = new C9030ve();
        this.f30966du = new C7902i2();
    }

    /* JADX INFO: renamed from: h4 */
    private void m42007h4() {
        this.f30970x1 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7650fa
    /* JADX INFO: renamed from: kk */
    public C7902i2 mo31678kk() {
        return this.f30966du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7650fa
    /* JADX INFO: renamed from: x1 */
    public C9030ve mo31680x1() {
        return this.f30969to;
    }

    public C8910tz(final AbstractC13912i5 abstractC13912i5) {
        m42007h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8910tz.f30965h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8910tz.this.f30967k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8910tz.this.f30970x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8910tz.f30965h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C8910tz.this.f30968kk = new C9291yk(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C8910tz.this.f30969to = new C9030ve(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C8910tz.this.f30966du = new C7902i2(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7650fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC8968up mo31676k4() {
        return this.f30968kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30967k4;
        if (str3 != null) {
            c3059ii.m12955x1("macro", str3);
        }
        boolean z = this.f30970x1;
        if (z) {
            c3059ii.m12955x1("fPublished", z ? "1" : "0");
        }
        this.f30968kk.mo6846k4("cdr", c3059ii, "nvGraphicFramePr");
        this.f30969to.mo6846k4("cdr", c3059ii, "xfrm");
        this.f30966du.mo6846k4("a", c3059ii, "graphic");
        c3059ii.mo21898jd();
    }
}
