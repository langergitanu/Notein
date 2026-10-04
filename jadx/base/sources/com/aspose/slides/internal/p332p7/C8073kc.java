package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.kc */
/* JADX INFO: loaded from: classes4.dex */
public class C8073kc extends AbstractC8333ne {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f25574dy = new C7017h4("modelId", "nvSpPr", "spPr", "style", "txBody", "txXfrm", "extLst");

    /* JADX INFO: renamed from: du */
    private C8952ug f25575du;

    /* JADX INFO: renamed from: h4 */
    private C9030ve f25576h4;

    /* JADX INFO: renamed from: k4 */
    private String f25577k4;

    /* JADX INFO: renamed from: kk */
    private C8087kh f25578kk;

    /* JADX INFO: renamed from: m9 */
    private C8397nz f25579m9;

    /* JADX INFO: renamed from: to */
    private C8601qh f25580to;

    /* JADX INFO: renamed from: x1 */
    private C7974j3 f25581x1;

    public C8073kc() {
        this.f25581x1 = new C7974j3();
        this.f25578kk = new C8087kh();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: du */
    public C8952ug mo30432du() {
        return this.f25575du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: h4 */
    public C8952ug mo30434h4() {
        if (this.f25575du != null) {
            throw new Exception("Only one <txBody> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f25575du = c8952ug;
        return c8952ug;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: k4 */
    public AbstractC7966ix mo30435k4() {
        return this.f25581x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: kk */
    public C8601qh mo30438kk() {
        return this.f25580to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: m9 */
    public AbstractC7414ck mo30439m9() {
        return this.f25579m9;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: to */
    public C8601qh mo30440to() {
        if (this.f25580to != null) {
            throw new Exception("Only one <style> element can be added.");
        }
        C8601qh c8601qh = new C8601qh();
        this.f25580to = c8601qh;
        return c8601qh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: up */
    public String mo35277up() {
        return this.f25577k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: x1 */
    public C8087kh mo30441x1() {
        return this.f25578kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: yj */
    public C9030ve mo35278yj() {
        return this.f25576h4;
    }

    public C8073kc(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8073kc.f25574dy.m27428k4(str) != 0) {
                    return false;
                }
                C8073kc.this.f25577k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kc.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8073kc.f25574dy.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        C8073kc.this.f25581x1 = new C7974j3(abstractC13912i5);
                        return true;
                    case 2:
                        C8073kc.this.f25578kk = new C8087kh(abstractC13912i5);
                        return true;
                    case 3:
                        C8073kc.this.f25580to = new C8601qh(abstractC13912i5);
                        return true;
                    case 4:
                        C8073kc.this.f25575du = new C8952ug(abstractC13912i5);
                        return true;
                    case 5:
                        C8073kc.this.f25576h4 = new C9030ve(abstractC13912i5);
                        return true;
                    case 6:
                        C8073kc.this.f25579m9 = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: kk */
    public void mo35276kk(String str) {
        this.f25577k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: k4 */
    public void mo30436k4(AbstractC7414ck abstractC7414ck) {
        this.f25579m9 = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: k4 */
    public void mo35275k4(C9030ve c9030ve) {
        this.f25576h4 = c9030ve;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("modelId", this.f25577k4);
        this.f25581x1.mo6846k4("dsp", c3059ii, "nvSpPr");
        this.f25578kk.mo6846k4("dsp", c3059ii, "spPr");
        C8601qh c8601qh = this.f25580to;
        if (c8601qh != null) {
            c8601qh.mo6846k4("dsp", c3059ii, "style");
        }
        C8952ug c8952ug = this.f25575du;
        if (c8952ug != null) {
            c8952ug.mo6846k4("dsp", c3059ii, "txBody");
        }
        C9030ve c9030ve = this.f25576h4;
        if (c9030ve != null) {
            c9030ve.mo6846k4("dsp", c3059ii, "txXfrm");
        }
        C8397nz c8397nz = this.f25579m9;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dsp", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
