package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class yyn extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private C9391zp f33615du;

    /* JADX INFO: renamed from: h4 */
    private String f33616h4;

    /* JADX INFO: renamed from: kk */
    private C14084qq f33617kk = new C14084qq();

    /* JADX INFO: renamed from: m9 */
    private dnu f33618m9;

    /* JADX INFO: renamed from: to */
    private long f33619to;

    /* JADX INFO: renamed from: x1 */
    private long f33620x1;

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f33614k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f33613dy = new C7017h4("authorId", "dt", "idx", "pos", "text", "extLst");

    public yyn() {
        m45277dy();
        this.f33615du = new C9391zp();
    }

    /* JADX INFO: renamed from: dy */
    private void m45277dy() {
        f33614k4.CloneTo(this.f33617kk);
    }

    /* JADX INFO: renamed from: du */
    public final String m45286du() {
        return this.f33616h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC7414ck m45287h4() {
        return this.f33618m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m45288k4() {
        return this.f33620x1;
    }

    /* JADX INFO: renamed from: kk */
    public final long m45293kk() {
        return this.f33619to;
    }

    /* JADX INFO: renamed from: to */
    public final C9391zp m45294to() {
        return this.f33615du;
    }

    public yyn(final AbstractC13912i5 abstractC13912i5) {
        m45277dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yyn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = yyn.f33613dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    yyn.this.f33620x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(yyn.this.f33617kk);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                yyn.this.f33619to = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yyn.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = yyn.f33613dy.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    yyn.this.f33615du = new C9391zp(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    yyn.this.f33618m9 = new dnu(abstractC13912i5);
                    return true;
                }
                yyn.this.f33616h4 = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    yyn yynVar = yyn.this;
                    yynVar.f33616h4 = C14113y2.m67400k4(yynVar.f33616h4, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final C14084qq m45295x1() {
        return this.f33617kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m45296x1(long j) {
        this.f33619to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45289k4(long j) {
        this.f33620x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45290k4(AbstractC7414ck abstractC7414ck) {
        this.f33618m9 = (dnu) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45291k4(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f33617kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45292k4(String str) {
        this.f33616h4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("authorId", C13850af.m65147x1(this.f33620x1));
        if (C14084qq.m67078dy(this.f33617kk, f33614k4)) {
            C20986OooO0o0.OooO0O0(this.f33617kk, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "dt");
        }
        c3059ii.m12955x1("idx", C13850af.m65147x1(this.f33619to));
        this.f33615du.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "pos");
        m29301k4(ContextChain.TAG_PRODUCT, c3059ii, "text", this.f33616h4, false);
        dnu dnuVar = this.f33618m9;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
