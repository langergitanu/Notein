package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xl */
/* JADX INFO: loaded from: classes4.dex */
public class C9212xl extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f32918to = new C7017h4("clrScheme", "fontScheme", "fmtScheme");

    /* JADX INFO: renamed from: k4 */
    private C7238ae f32919k4;

    /* JADX INFO: renamed from: kk */
    private C8285mr f32920kk;

    /* JADX INFO: renamed from: x1 */
    private C7503dp f32921x1;

    public C9212xl() {
    }

    /* JADX INFO: renamed from: du */
    public final C7503dp m44473du() {
        return this.f32921x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8285mr m44474h4() {
        return this.f32920kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7238ae m44475k4() {
        if (this.f32919k4 != null) {
            throw new Exception("Only one <clrScheme> element can be added.");
        }
        C7238ae c7238ae = new C7238ae();
        this.f32919k4 = c7238ae;
        return c7238ae;
    }

    /* JADX INFO: renamed from: kk */
    public final C8285mr m44476kk() {
        if (this.f32920kk != null) {
            throw new Exception("Only one <fmtScheme> element can be added.");
        }
        C8285mr c8285mr = new C8285mr();
        this.f32920kk = c8285mr;
        return c8285mr;
    }

    /* JADX INFO: renamed from: to */
    public final C7238ae m44477to() {
        return this.f32919k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7503dp m44478x1() {
        if (this.f32921x1 != null) {
            throw new Exception("Only one <fontScheme> element can be added.");
        }
        C7503dp c7503dp = new C7503dp();
        this.f32921x1 = c7503dp;
        return c7503dp;
    }

    public C9212xl(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9212xl.f32918to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9212xl.this.f32919k4 = new C7238ae(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C9212xl.this.f32921x1 = new C7503dp(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C9212xl.this.f32920kk = new C8285mr(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("a", str2, "http://schemas.openxmlformats.org/drawingml/2006/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        C7238ae c7238ae = this.f32919k4;
        if (c7238ae != null) {
            c7238ae.mo6846k4("a", c3059ii, "clrScheme");
        }
        C7503dp c7503dp = this.f32921x1;
        if (c7503dp != null) {
            c7503dp.mo6846k4("a", c3059ii, "fontScheme");
        }
        C8285mr c8285mr = this.f32920kk;
        if (c8285mr != null) {
            c8285mr.mo6846k4("a", c3059ii, "fmtScheme");
        }
        c3059ii.mo21898jd();
    }
}
