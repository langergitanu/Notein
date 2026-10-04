package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.oa */
/* JADX INFO: loaded from: classes4.dex */
public class C8416oa extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f27777h4 = new C7017h4("id", C18437z2.f56754h, "rPr", "pPr", "t");

    /* JADX INFO: renamed from: du */
    private String f27778du;

    /* JADX INFO: renamed from: k4 */
    private C14047bz f27779k4 = new C14047bz();

    /* JADX INFO: renamed from: kk */
    private C9135ws f27780kk;

    /* JADX INFO: renamed from: to */
    private C8181lg f27781to;

    /* JADX INFO: renamed from: x1 */
    private String f27782x1;

    public C8416oa() {
        m38078c5();
    }

    /* JADX INFO: renamed from: c5 */
    private void m38078c5() {
        C14047bz.f47172k4.CloneTo(this.f27779k4);
    }

    /* JADX INFO: renamed from: du */
    public final C9135ws m38086du() {
        return this.f27780kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8181lg m38087h4() {
        return this.f27781to;
    }

    /* JADX INFO: renamed from: kk */
    public final C14047bz m38091kk() {
        return this.f27779k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m38092m9() {
        return this.f27778du;
    }

    /* JADX INFO: renamed from: to */
    public final String m38093to() {
        return this.f27782x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8181lg m38094x1() {
        if (this.f27781to != null) {
            throw new Exception("Only one <pPr> element can be added.");
        }
        C8181lg c8181lg = new C8181lg();
        this.f27781to = c8181lg;
        return c8181lg;
    }

    public C8416oa(final AbstractC13912i5 abstractC13912i5) {
        m38078c5();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.oa.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8416oa.f27777h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8416oa.this.f27779k4 = new C14047bz(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8416oa.this.f27782x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oa.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8416oa.f27777h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C8416oa.this.f27780kk = new C9135ws(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C8416oa.this.f27781to = new C8181lg(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C8416oa.this.f27778du = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    C8416oa c8416oa = C8416oa.this;
                    c8416oa.f27778du = C14113y2.m67400k4(c8416oa.f27778du, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9135ws m38088k4() {
        if (this.f27780kk != null) {
            throw new Exception("Only one <rPr> element can be added.");
        }
        C9135ws c9135ws = new C9135ws();
        this.f27780kk = c9135ws;
        return c9135ws;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38095x1(String str) {
        this.f27778du = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38089k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f27779k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38090k4(String str) {
        this.f27782x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f27779k4), "}"));
        String str3 = this.f27782x1;
        if (str3 != null) {
            c3059ii.m12955x1(C18437z2.f56754h, str3);
        }
        C9135ws c9135ws = this.f27780kk;
        if (c9135ws != null) {
            c9135ws.mo6846k4("a", c3059ii, "rPr");
        }
        C8181lg c8181lg = this.f27781to;
        if (c8181lg != null) {
            c8181lg.mo6846k4("a", c3059ii, "pPr");
        }
        String str4 = this.f27778du;
        if (str4 != null) {
            c3059ii2 = c3059ii;
            m29301k4("a", c3059ii2, "t", str4, false);
        } else {
            c3059ii2 = c3059ii;
        }
        c3059ii2.mo21898jd();
    }
}
