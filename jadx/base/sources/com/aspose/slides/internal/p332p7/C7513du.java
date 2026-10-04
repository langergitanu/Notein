package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3034ar;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p077d8.C3083s7;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.du */
/* JADX INFO: loaded from: classes4.dex */
public final class C7513du extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private jbq f21889du;

    /* JADX INFO: renamed from: k4 */
    private ks0 f21890k4;

    /* JADX INFO: renamed from: kk */
    private pij f21891kk;

    /* JADX INFO: renamed from: to */
    private pij f21892to;

    /* JADX INFO: renamed from: x1 */
    private pij f21893x1;

    public C7513du() {
    }

    /* JADX INFO: renamed from: k4 */
    public final ks0 m30642k4() {
        if (this.f21890k4 != null) {
            throw new Exception("Only one <pic> element can be added.");
        }
        ks0 ks0Var = new ks0();
        this.f21890k4 = ks0Var;
        return ks0Var;
    }

    /* JADX INFO: renamed from: x1 */
    public final ks0 m30643x1() {
        return this.f21890k4;
    }

    public C7513du(AbstractC13912i5 abstractC13912i5) {
        C3034ar c3034ar = C3083s7.f9152k4;
        if (c3034ar.m12773k4("http://schemas.microsoft.com/office/drawing/2015/9/8/chartex") && "cx1".equals(abstractC13912i5.mo65060yj())) {
            this.f21893x1 = new pij(abstractC13912i5);
            return;
        }
        if (c3034ar.m12773k4("http://schemas.microsoft.com/office/drawing/2015/10/21/chartex") && "cx2".equals(abstractC13912i5.mo65060yj())) {
            this.f21891kk = new pij(abstractC13912i5);
            return;
        }
        if (c3034ar.m12773k4("http://schemas.microsoft.com/office/drawing/2016/5/10/chartex") && "cx4".equals(abstractC13912i5.mo65060yj())) {
            this.f21892to = new pij(abstractC13912i5);
        } else if (c3034ar.m12773k4("http://schemas.microsoft.com/office/powerpoint/2010/main") && "p14".equals(abstractC13912i5.mo65060yj())) {
            this.f21889du = new jbq(abstractC13912i5);
        } else {
            this.f21890k4 = new ks0(abstractC13912i5);
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        if (this.f21893x1 == null && this.f21891kk == null && this.f21892to == null && this.f21889du == null) {
            ks0 ks0Var = this.f21890k4;
            if (ks0Var != null) {
                ks0Var.mo6846k4(str, c3059ii, "pic");
                return;
            }
            return;
        }
        c3059ii.mo12953k4("mc", "AlternateContent", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        if (this.f21893x1 != null) {
            c3059ii.mo12953k4("mc", "Choice", (String) null);
            c3059ii.m12954to("xmlns", "cx1", null, "http://schemas.microsoft.com/office/drawing/2015/9/8/chartex");
            c3059ii.m12955x1("Requires", "cx1");
            this.f21893x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "graphicFrame");
            c3059ii.mo21898jd();
        }
        if (this.f21891kk != null) {
            c3059ii.mo12953k4("mc", "Choice", (String) null);
            c3059ii.m12954to("xmlns", "cx2", null, "http://schemas.microsoft.com/office/drawing/2015/10/21/chartex");
            c3059ii.m12955x1("Requires", "cx2");
            this.f21891kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "graphicFrame");
            c3059ii.mo21898jd();
        }
        if (this.f21892to != null) {
            c3059ii.mo12953k4("mc", "Choice", (String) null);
            c3059ii.m12954to("xmlns", "cx4", null, "http://schemas.microsoft.com/office/drawing/2016/5/10/chartex");
            c3059ii.m12955x1("Requires", "cx4");
            this.f21892to.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "graphicFrame");
            c3059ii.mo21898jd();
        }
        if (this.f21889du != null) {
            c3059ii.mo12953k4("mc", "Choice", (String) null);
            c3059ii.m12954to("xmlns", "p14", null, "http://schemas.microsoft.com/office/powerpoint/2010/main");
            c3059ii.m12955x1("Requires", "p14");
            this.f21889du.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "contentPart");
            c3059ii.mo21898jd();
        }
        if (this.f21890k4 != null) {
            c3059ii.mo12953k4("mc", "Fallback", (String) null);
            this.f21890k4.mo6846k4(str, c3059ii, "pic");
            c3059ii.mo21898jd();
        }
        c3059ii.mo21898jd();
    }
}
