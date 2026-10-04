package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.dq */
/* JADX INFO: loaded from: classes4.dex */
public final class C7504dq extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    static final C14084qq f21775k4;

    /* JADX INFO: renamed from: kk */
    static final C14084qq f21776kk;

    /* JADX INFO: renamed from: x1 */
    static final C14084qq f21777x1;

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f21778x6;

    /* JADX INFO: renamed from: c5 */
    private String f21779c5;

    /* JADX INFO: renamed from: ck */
    private String f21780ck;

    /* JADX INFO: renamed from: du */
    private String f21781du;

    /* JADX INFO: renamed from: dy */
    private String f21782dy;

    /* JADX INFO: renamed from: fa */
    private C14084qq f21783fa;

    /* JADX INFO: renamed from: h4 */
    private String f21784h4;

    /* JADX INFO: renamed from: jd */
    private String f21785jd;

    /* JADX INFO: renamed from: ks */
    private String f21786ks;

    /* JADX INFO: renamed from: m9 */
    private C14084qq f21787m9;

    /* JADX INFO: renamed from: rv */
    private String f21788rv;

    /* JADX INFO: renamed from: to */
    private String f21789to;

    /* JADX INFO: renamed from: up */
    private C14084qq f21790up;

    /* JADX INFO: renamed from: yj */
    private String f21791yj;

    static {
        C14084qq c14084qq = C14084qq.f47299x1;
        f21775k4 = c14084qq.Clone();
        f21777x1 = c14084qq.Clone();
        f21776kk = c14084qq.Clone();
        f21778x6 = new C7017h4("category", "contentStatus", "contentType", "created", "creator", "description", "identifier", "keywords", "language", "lastModifiedBy", "lastPrinted", "modified", "revision", "subject", NoteMeta.PROPERTY_TITLE, "version");
    }

    public C7504dq() {
        this.f21787m9 = new C14084qq();
        this.f21783fa = new C14084qq();
        this.f21790up = new C14084qq();
        this.f21789to = "";
        this.f21781du = "";
        this.f21784h4 = "";
        f21775k4.CloneTo(this.f21787m9);
        this.f21782dy = "";
        this.f21779c5 = "";
        this.f21785jd = "";
        this.f21780ck = "";
        f21777x1.CloneTo(this.f21783fa);
        f21776kk.CloneTo(this.f21790up);
        this.f21791yj = "";
        this.f21786ks = "";
        this.f21788rv = "";
    }

    /* JADX INFO: renamed from: c5 */
    public final C14084qq m30514c5() {
        return this.f21783fa;
    }

    /* JADX INFO: renamed from: ck */
    public final String m30516ck() {
        return this.f21791yj;
    }

    /* JADX INFO: renamed from: du */
    public final String m30517du() {
        return this.f21782dy;
    }

    /* JADX INFO: renamed from: dy */
    public final String m30519dy() {
        return this.f21780ck;
    }

    /* JADX INFO: renamed from: fa */
    public final String m30521fa() {
        return this.f21786ks;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m30522h4() {
        return this.f21779c5;
    }

    /* JADX INFO: renamed from: jd */
    public final C14084qq m30524jd() {
        return this.f21790up;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m30526k4() {
        return this.f21789to;
    }

    /* JADX INFO: renamed from: kk */
    public final String m30529kk() {
        return this.f21784h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m30532m9() {
        return this.f21785jd;
    }

    /* JADX INFO: renamed from: to */
    public final C14084qq m30534to() {
        return this.f21787m9;
    }

    /* JADX INFO: renamed from: up */
    public final String m30536up() {
        return this.f21788rv;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m30537x1() {
        return this.f21781du;
    }

    public C7504dq(final AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.dq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C14084qq c14084qqM67089k4;
                C14084qq c14084qq;
                switch (C7504dq.f21778x6.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C7504dq.this.f21789to = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7504dq c7504dq = C7504dq.this;
                            c7504dq.f21789to = C14113y2.m67400k4(c7504dq.f21789to, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 1:
                        C7504dq.this.f21781du = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7504dq c7504dq2 = C7504dq.this;
                            c7504dq2.f21781du = C14113y2.m67400k4(c7504dq2.f21781du, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 2:
                        C7504dq.this.f21784h4 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7504dq c7504dq3 = C7504dq.this;
                            c7504dq3.f21784h4 = C14113y2.m67400k4(c7504dq3.f21784h4, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 3:
                        abstractC13912i5.mo65026h4();
                        c14084qqM67089k4 = C14084qq.m67089k4(abstractC13912i5.mo65042rv(), C11697x1.m55252to(), 16);
                        c14084qq = C7504dq.this.f21787m9;
                        break;
                    case 4:
                        C7504dq.this.f21782dy = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7504dq c7504dq4 = C7504dq.this;
                            c7504dq4.f21782dy = C14113y2.m67400k4(c7504dq4.f21782dy, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 5:
                        C7504dq.this.f21779c5 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7504dq c7504dq5 = C7504dq.this;
                            c7504dq5.f21779c5 = C14113y2.m67400k4(c7504dq5.f21779c5, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 6:
                    case 8:
                    case 15:
                        abstractC13912i5.mo65208bv();
                        return false;
                    case 7:
                        C7504dq.this.f21785jd = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7504dq c7504dq6 = C7504dq.this;
                            c7504dq6.f21785jd = C14113y2.m67400k4(c7504dq6.f21785jd, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 9:
                        C7504dq.this.f21780ck = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7504dq c7504dq7 = C7504dq.this;
                            c7504dq7.f21780ck = C14113y2.m67400k4(c7504dq7.f21780ck, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 10:
                        abstractC13912i5.mo65026h4();
                        c14084qqM67089k4 = C14084qq.m67089k4(abstractC13912i5.mo65042rv(), C11697x1.m55252to(), 16);
                        c14084qq = C7504dq.this.f21783fa;
                        break;
                    case 11:
                        abstractC13912i5.mo65026h4();
                        c14084qqM67089k4 = C14084qq.m67089k4(abstractC13912i5.mo65042rv(), C11697x1.m55252to(), 16);
                        c14084qq = C7504dq.this.f21790up;
                        break;
                    case 12:
                        C7504dq.this.f21791yj = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7504dq c7504dq8 = C7504dq.this;
                            c7504dq8.f21791yj = C14113y2.m67400k4(c7504dq8.f21791yj, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 13:
                        C7504dq.this.f21786ks = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7504dq c7504dq9 = C7504dq.this;
                            c7504dq9.f21786ks = C14113y2.m67400k4(c7504dq9.f21786ks, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 14:
                        C7504dq.this.f21788rv = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7504dq c7504dq10 = C7504dq.this;
                            c7504dq10.f21788rv = C14113y2.m67400k4(c7504dq10.f21788rv, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    default:
                        return false;
                }
                c14084qqM67089k4.CloneTo(c14084qq);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: c5 */
    public final void m30515c5(String str) {
        this.f21786ks = str;
    }

    /* JADX INFO: renamed from: du */
    public final void m30518du(String str) {
        this.f21779c5 = str;
    }

    /* JADX INFO: renamed from: dy */
    public final void m30520dy(String str) {
        this.f21791yj = str;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m30523h4(String str) {
        this.f21785jd = str;
    }

    /* JADX INFO: renamed from: jd */
    public final void m30525jd(String str) {
        this.f21788rv = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30527k4(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f21787m9);
    }

    /* JADX INFO: renamed from: kk */
    public final void m30530kk(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f21790up);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m30533m9(String str) {
        this.f21780ck = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m30535to(String str) {
        this.f21782dy = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m30538x1(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f21783fa);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30528k4(String str) {
        this.f21789to = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m30531kk(String str) {
        this.f21784h4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m30539x1(String str) {
        this.f21781du = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("cp", str2, "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
        c3059ii.m12954to("xmlns", AzureActiveDirectorySlice.DC_PARAMETER, null, "http://purl.org/dc/elements/1.1/");
        c3059ii.m12954to("xmlns", "dcterms", null, "http://purl.org/dc/terms/");
        c3059ii.m12954to("xmlns", "dcmitype", null, "http://purl.org/dc/dcmitype/");
        c3059ii.m12954to("xmlns", "xsi", null, "http://www.w3.org/2001/XMLSchema-instance");
        if (!"".equals(this.f21788rv)) {
            c3059ii.m65800du(C14113y2.m67408k4("dc:", NoteMeta.PROPERTY_TITLE), this.f21788rv);
        }
        if (!"".equals(this.f21789to)) {
            c3059ii.m65800du(C14113y2.m67408k4("cp:", "category"), this.f21789to);
        }
        if (!"".equals(this.f21781du)) {
            c3059ii.m65800du(C14113y2.m67408k4("cp:", "contentStatus"), this.f21781du);
        }
        if (!"".equals(this.f21784h4)) {
            c3059ii.m65800du(C14113y2.m67408k4("cp:", "contentType"), this.f21784h4);
        }
        if (!"".equals(this.f21782dy)) {
            c3059ii.m65800du(C14113y2.m67408k4("dc:", "creator"), this.f21782dy);
        }
        if (!"".equals(this.f21779c5)) {
            c3059ii.m65800du(C14113y2.m67408k4("dc:", "description"), this.f21779c5);
        }
        if (!"".equals(this.f21785jd)) {
            c3059ii.m65800du(C14113y2.m67408k4("cp:", "keywords"), this.f21785jd);
        }
        if (!"".equals(this.f21780ck)) {
            c3059ii.m65800du(C14113y2.m67408k4("cp:", "lastModifiedBy"), this.f21780ck);
        }
        if (!"".equals(this.f21791yj)) {
            c3059ii.m65800du(C14113y2.m67408k4("cp:", "revision"), this.f21791yj);
        }
        C14084qq c14084qq = this.f21783fa;
        C14084qq c14084qq2 = C14084qq.f47299x1;
        if (C14084qq.m67078dy(c14084qq, c14084qq2)) {
            c3059ii.m65800du(C14113y2.m67408k4("cp:", "lastPrinted"), C13850af.m65108k4(this.f21783fa.Clone(), "yyyy-MM-ddTHH:mm:ss.fff"));
        }
        if (C14084qq.m67078dy(this.f21787m9, c14084qq2)) {
            c3059ii.mo12953k4("dcterms", "created", (String) null);
            c3059ii.m12954to("xsi", C18437z2.f56754h, null, "dcterms:W3CDTF");
            c3059ii.mo21918x1(C13850af.m65108k4(this.f21787m9.Clone(), "yyyy-MM-ddTHH:mm:ssZ"));
            c3059ii.mo21898jd();
        }
        if (C14084qq.m67078dy(this.f21790up, c14084qq2)) {
            c3059ii.mo12953k4("dcterms", "modified", (String) null);
            c3059ii.m12954to("xsi", C18437z2.f56754h, null, "dcterms:W3CDTF");
            c3059ii.mo21918x1(C13850af.m65108k4(this.f21790up.Clone(), "yyyy-MM-ddTHH:mm:ssZ"));
            c3059ii.mo21898jd();
        }
        if (!"".equals(this.f21786ks)) {
            c3059ii.m65800du(C14113y2.m67408k4("dc:", "subject"), this.f21786ks);
        }
        c3059ii.mo21898jd();
    }
}
