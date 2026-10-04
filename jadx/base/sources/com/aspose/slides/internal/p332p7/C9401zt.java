package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zt */
/* JADX INFO: loaded from: classes4.dex */
public class C9401zt extends AbstractC8986uz implements InterfaceC7582em, InterfaceC9128wp {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f34159h4 = new C7017h4("wireframe", "ser", "bandFmts", "axId", "extLst");

    /* JADX INFO: renamed from: du */
    private C7683fo f34160du;

    /* JADX INFO: renamed from: k4 */
    private C8828t1 f34161k4;

    /* JADX INFO: renamed from: kk */
    private C7307b9 f34162kk;

    /* JADX INFO: renamed from: to */
    private List<C8827t0> f34163to;

    /* JADX INFO: renamed from: x1 */
    private List<C9057vp> f34164x1;

    public C9401zt() {
        m45948qm();
    }

    /* JADX INFO: renamed from: qm */
    private void m45948qm() {
        this.f34164x1 = new List<>();
        this.f34163to = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8828t1 aA_() {
        if (this.f34161k4 != null) {
            throw new Exception("Only one <wireframe> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f34161k4 = c8828t1;
        return c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8827t0[] aE_() {
        return this.f34163to.toArray(new C8827t0[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8828t1 az_() {
        return this.f34161k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: dq */
    public C7307b9 mo39967dq() {
        return this.f34162kk;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC9128wp
    /* JADX INFO: renamed from: du */
    public final C8827t0 mo31606du() {
        C8827t0 c8827t0 = new C8827t0();
        this.f34163to.addItem(c8827t0);
        return c8827t0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: dy */
    public AbstractC7414ck mo28510dy() {
        return this.f34160du;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7582em
    /* JADX INFO: renamed from: k4 */
    public final void mo31124k4(C7259am c7259am) {
        this.f34162kk = (C7307b9) c7259am;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: kk */
    public AbstractC9120wl mo28513kk() {
        C9057vp c9057vp = new C9057vp();
        this.f34164x1.addItem(c9057vp);
        return c9057vp;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x1 */
    public AbstractC9120wl[] mo28526x1() {
        return this.f34164x1.toArray(new C9057vp[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2.addItem(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9401zt(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz c9057vp;
        IGenericCollection iGenericCollection;
        m45948qm();
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        int iM27428k4 = f34159h4.m27428k4(abstractC13912i5.mo65023fa());
                        if (iM27428k4 == 0) {
                            this.f34161k4 = new C8828t1(abstractC13912i5);
                            break;
                        }
                        if (iM27428k4 == 1) {
                            c9057vp = new C9057vp(abstractC13912i5);
                            iGenericCollection = this.f34164x1;
                            break;
                        }
                        if (iM27428k4 == 2) {
                            this.f34162kk = new C7307b9(abstractC13912i5);
                        } else if (iM27428k4 == 3) {
                            c9057vp = new C8827t0(abstractC13912i5);
                            iGenericCollection = this.f34163to;
                            break;
                        } else {
                            if (iM27428k4 == 4) {
                                this.f34160du = new C7683fo(abstractC13912i5);
                                break;
                            }
                            abstractC13912i5.mo65208bv();
                        }
                        if (abstractC13912i5.mo65015ar()) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: k4 */
    public void mo28512k4(AbstractC7414ck abstractC7414ck) {
        this.f34160du = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8828t1 c8828t1 = this.f34161k4;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "wireframe");
        }
        List.Enumerator<C8827t0> it = this.f34164x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "ser");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C7307b9 c7307b9 = this.f34162kk;
        if (c7307b9 != null) {
            c7307b9.mo6846k4("c", c3059ii, "bandFmts");
        }
        it = this.f34163to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "axId");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7683fo c7683fo = this.f34160du;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
