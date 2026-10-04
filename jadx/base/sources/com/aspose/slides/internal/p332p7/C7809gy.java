package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.gy */
/* JADX INFO: loaded from: classes4.dex */
public class C7809gy extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f23786du = new C7017h4("plotAreaRegion", "axis", "spPr", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C7999jg f23787k4;

    /* JADX INFO: renamed from: kk */
    private C8087kh f23788kk;

    /* JADX INFO: renamed from: to */
    private C7249ah f23789to;

    /* JADX INFO: renamed from: x1 */
    private List<C7913i8> f23790x1;

    public C7809gy() {
        m32986m9();
        this.f23787k4 = new C7999jg();
    }

    /* JADX INFO: renamed from: m9 */
    private void m32986m9() {
        this.f23790x1 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C7249ah m32987du() {
        return this.f23789to;
    }

    /* JADX INFO: renamed from: kk */
    public final C7913i8[] m32991kk() {
        return this.f23790x1.toArray(new C7913i8[0]);
    }

    /* JADX INFO: renamed from: to */
    public final C8087kh m32992to() {
        return this.f23788kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7999jg m32993x1() {
        return this.f23787k4;
    }

    public C7809gy(final AbstractC13912i5 abstractC13912i5) {
        m32986m9();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7809gy.f23786du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7809gy.this.f23787k4 = new C7999jg(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7809gy.this.f23790x1.addItem(new C7913i8(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    C7809gy.this.f23788kk = new C8087kh(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C7809gy.this.f23789to = new C7249ah(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7913i8 m32988k4() {
        C7913i8 c7913i8 = new C7913i8();
        this.f23790x1.addItem(c7913i8);
        return c7913i8;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32989k4(C7249ah c7249ah) {
        this.f23789to = c7249ah;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32990k4(C8087kh c8087kh) {
        this.f23788kk = c8087kh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f23787k4.mo6846k4("cx", c3059ii, "plotAreaRegion");
        List.Enumerator<C7913i8> it = this.f23790x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("cx", c3059ii, "axis");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C8087kh c8087kh = this.f23788kk;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C7249ah c7249ah = this.f23789to;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
