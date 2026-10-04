package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class chj extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f21073m9 = new C7017h4("text:table-name", "text:table-type", "text:database-name", "style:data-style-name", "text:column-name", "connection-resource", "_TEXT");

    /* JADX INFO: renamed from: du */
    private String f21074du;

    /* JADX INFO: renamed from: h4 */
    private List<C7394ca> f21075h4;

    /* JADX INFO: renamed from: k4 */
    private String f21076k4;

    /* JADX INFO: renamed from: kk */
    private String f21077kk;

    /* JADX INFO: renamed from: to */
    private String f21078to;

    /* JADX INFO: renamed from: x1 */
    private int f21079x1;

    public chj() {
        m29611x1();
    }

    public chj(AbstractC13912i5 abstractC13912i5) {
        m29611x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.chj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = chj.f21073m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    chj.this.f21076k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    chj.this.f21079x1 = tgm.m41711k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    chj.this.f21077kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    chj.this.f21078to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                chj.this.f21074du = str2;
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    if (f21073m9.m27428k4(abstractC13912i5.mo65023fa()) == 5) {
                        this.f21075h4.addItem(new C7394ca("connection-resource", new r1l(abstractC13912i5)));
                        break;
                    } else {
                        abstractC13912i5.mo65208bv();
                        if (abstractC13912i5.mo65015ar()) {
                            break;
                        }
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    OooOO0O.OooO0O0("_TEXT", abstractC13912i5.mo65042rv(), this.f21075h4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m29611x1() {
        this.f21079x1 = 0;
        this.f21075h4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:table-name", this.f21076k4);
        int i = this.f21079x1;
        if (i != 0) {
            c3059ii.m12955x1("text:table-type", tgm.m41712k4(i));
        }
        String str3 = this.f21077kk;
        if (str3 != null) {
            c3059ii.m12955x1("text:database-name", str3);
        }
        String str4 = this.f21078to;
        if (str4 != null) {
            c3059ii.m12955x1("style:data-style-name", str4);
        }
        c3059ii.m12955x1("text:column-name", this.f21074du);
        List.Enumerator<C7394ca> it = this.f21075h4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f21073m9.m27428k4(next.m29539k4());
                if (iM27428k4 == 5) {
                    ((r1l) next.m29541kk()).mo6846k4("form", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 6) {
                    c3059ii.mo21918x1((String) next.m29541kk());
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
        c3059ii.mo21898jd();
    }
}
