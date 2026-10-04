package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class hc1 extends AbstractC9290yj {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f24029du = new C7017h4("nvGrpSpPr", "grpSpPr", "sp", "AlternateContent", "grpSp", "graphicFrame", "cxnSp", "pic", "contentPart", "extLst");

    /* JADX INFO: renamed from: k4 */
    private ipq f24030k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f24031kk;

    /* JADX INFO: renamed from: to */
    private dnu f24032to;

    /* JADX INFO: renamed from: x1 */
    private C7664fe f24033x1;

    public hc1() {
        m33279h4();
        this.f24030k4 = new ipq();
        this.f24033x1 = new C7664fe();
    }

    /* JADX INFO: renamed from: h4 */
    private void m33279h4() {
        this.f24031kk = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: kk */
    public List<C7394ca> mo28601kk() {
        return this.f24031kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: to */
    public AbstractC7414ck mo28602to() {
        return this.f24032to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: x1 */
    public C7664fe mo28603x1() {
        return this.f24033x1;
    }

    public hc1(final AbstractC13912i5 abstractC13912i5) {
        m33279h4();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hc1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (hc1.f24029du.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        hc1.this.f24030k4 = new ipq(abstractC13912i5);
                        return true;
                    case 1:
                        hc1.this.f24033x1 = new C7664fe(abstractC13912i5);
                        return true;
                    case 2:
                        dm6 dm6Var = new dm6(abstractC13912i5);
                        list = hc1.this.f24031kk;
                        c7394ca = new C7394ca("sp", dm6Var);
                        break;
                    case 3:
                        C7639f6 c7639f6 = new C7639f6(abstractC13912i5);
                        list = hc1.this.f24031kk;
                        c7394ca = new C7394ca("AlternateContent", c7639f6);
                        break;
                    case 4:
                        hc1 hc1Var = new hc1(abstractC13912i5);
                        list = hc1.this.f24031kk;
                        c7394ca = new C7394ca("grpSp", hc1Var);
                        break;
                    case 5:
                        pij pijVar = new pij(abstractC13912i5);
                        list = hc1.this.f24031kk;
                        c7394ca = new C7394ca("graphicFrame", pijVar);
                        break;
                    case 6:
                        ez4 ez4Var = new ez4(abstractC13912i5);
                        list = hc1.this.f24031kk;
                        c7394ca = new C7394ca("cxnSp", ez4Var);
                        break;
                    case 7:
                        C7513du c7513du = new C7513du(abstractC13912i5);
                        list = hc1.this.f24031kk;
                        c7394ca = new C7394ca("pic", c7513du);
                        break;
                    case 8:
                        jbq jbqVar = new jbq(abstractC13912i5);
                        list = hc1.this.f24031kk;
                        c7394ca = new C7394ca("contentPart", jbqVar);
                        break;
                    case 9:
                        hc1.this.f24032to = new dnu(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: k4 */
    public C7394ca mo28598k4(String str) {
        C7394ca c7394ca;
        switch (f24029du.m27428k4(str)) {
            case 2:
                c7394ca = new C7394ca("sp", new dm6());
                break;
            case 3:
                c7394ca = new C7394ca("AlternateContent", new C7639f6());
                break;
            case 4:
                c7394ca = new C7394ca("grpSp", new hc1());
                break;
            case 5:
                c7394ca = new C7394ca("graphicFrame", new pij());
                break;
            case 6:
                c7394ca = new C7394ca("cxnSp", new ez4());
                break;
            case 7:
                c7394ca = new C7394ca("pic", new C7513du());
                break;
            case 8:
                c7394ca = new C7394ca("contentPart", new jbq());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f24031kk.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: k4 */
    public AbstractC8125ks mo28599k4() {
        return this.f24030k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: k4 */
    public void mo28600k4(AbstractC7414ck abstractC7414ck) {
        this.f24032to = (dnu) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f24030k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "nvGrpSpPr");
        this.f24033x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "grpSpPr");
        List.Enumerator<C7394ca> it = this.f24031kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f24029du.m27428k4(next.m29539k4())) {
                    case 2:
                        ((dm6) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((C7639f6) next.m29541kk()).mo6846k4("mc", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((hc1) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((pij) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((ez4) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C7513du) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((jbq) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        dnu dnuVar = this.f24032to;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
