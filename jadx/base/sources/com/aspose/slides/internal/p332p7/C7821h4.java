package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3034ar;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p077d8.C3083s7;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7821h4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    private eyk f23860k4;

    /* JADX INFO: renamed from: kk */
    private eyk f23861kk;

    /* JADX INFO: renamed from: to */
    private eyk f23862to;

    /* JADX INFO: renamed from: x1 */
    private eyk f23863x1;

    public C7821h4() {
    }

    /* JADX INFO: renamed from: du */
    public final eyk m33061du() {
        return this.f23860k4;
    }

    /* JADX INFO: renamed from: dy */
    public final eyk m33062dy() {
        return this.f23862to;
    }

    /* JADX INFO: renamed from: h4 */
    public final eyk m33063h4() {
        return this.f23863x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final eyk m33064k4() {
        if (this.f23860k4 != null) {
            throw new Exception("Only one <transition> element can be added.");
        }
        eyk eykVar = new eyk();
        this.f23860k4 = eykVar;
        return eykVar;
    }

    /* JADX INFO: renamed from: kk */
    public final eyk m33065kk() {
        if (this.f23861kk != null) {
            throw new Exception("Only one <transition> element can be added.");
        }
        eyk eykVar = new eyk();
        this.f23861kk = eykVar;
        return eykVar;
    }

    /* JADX INFO: renamed from: m9 */
    public final eyk m33066m9() {
        return this.f23861kk;
    }

    /* JADX INFO: renamed from: to */
    public final eyk m33067to() {
        if (this.f23862to != null) {
            throw new Exception("Only one <transition> element can be added.");
        }
        eyk eykVar = new eyk();
        this.f23862to = eykVar;
        return eykVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final eyk m33068x1() {
        if (this.f23863x1 != null) {
            throw new Exception("Only one <transition> element can be added.");
        }
        eyk eykVar = new eyk();
        this.f23863x1 = eykVar;
        return eykVar;
    }

    public C7821h4(AbstractC13912i5 abstractC13912i5) {
        C3034ar c3034ar = C3083s7.f9152k4;
        if (c3034ar.m12773k4("http://schemas.microsoft.com/office/powerpoint/2015/09/main") && "p159".equals(abstractC13912i5.mo65060yj())) {
            this.f23863x1 = new eyk(abstractC13912i5);
            return;
        }
        if (c3034ar.m12773k4("http://schemas.microsoft.com/office/powerpoint/2012/main") && "p15".equals(abstractC13912i5.mo65060yj())) {
            this.f23861kk = new eyk(abstractC13912i5);
        } else if (c3034ar.m12773k4("http://schemas.microsoft.com/office/powerpoint/2010/main") && "p14".equals(abstractC13912i5.mo65060yj())) {
            this.f23862to = new eyk(abstractC13912i5);
        } else {
            this.f23860k4 = new eyk(abstractC13912i5);
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        if (this.f23863x1 == null && this.f23861kk == null && this.f23862to == null) {
            eyk eykVar = this.f23860k4;
            if (eykVar != null) {
                eykVar.mo6846k4(str, c3059ii, "transition");
                return;
            }
            return;
        }
        c3059ii.mo12953k4("mc", "AlternateContent", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        if (this.f23863x1 != null) {
            c3059ii.mo12953k4("mc", "Choice", (String) null);
            c3059ii.m12954to("xmlns", "p159", null, "http://schemas.microsoft.com/office/powerpoint/2015/09/main");
            c3059ii.m12955x1("Requires", "p159");
            this.f23863x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "transition");
            c3059ii.mo21898jd();
        }
        if (this.f23861kk != null) {
            c3059ii.mo12953k4("mc", "Choice", (String) null);
            c3059ii.m12954to("xmlns", "p15", null, "http://schemas.microsoft.com/office/powerpoint/2012/main");
            c3059ii.m12955x1("Requires", "p15");
            this.f23861kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "transition");
            c3059ii.mo21898jd();
        }
        if (this.f23862to != null) {
            c3059ii.mo12953k4("mc", "Choice", (String) null);
            c3059ii.m12954to("xmlns", "p14", null, "http://schemas.microsoft.com/office/powerpoint/2010/main");
            c3059ii.m12955x1("Requires", "p14");
            this.f23862to.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "transition");
            c3059ii.mo21898jd();
        }
        if (this.f23860k4 != null) {
            c3059ii.mo12953k4("mc", "Fallback", (String) null);
            this.f23860k4.mo6846k4(str, c3059ii, "transition");
            c3059ii.mo21898jd();
        }
        c3059ii.mo21898jd();
    }
}
