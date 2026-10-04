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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.v7 */
/* JADX INFO: loaded from: classes4.dex */
public class C9004v7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31553kk = new C7017h4("provider", "binary", "clear");

    /* JADX INFO: renamed from: k4 */
    private String f31554k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f31555x1;

    public C9004v7() {
        m42737x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m42737x1() {
        this.f31555x1 = new List<>();
    }

    public C9004v7(AbstractC13912i5 abstractC13912i5) {
        m42737x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.v7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9004v7.f31553kk.m27428k4(str) != 0) {
                    return false;
                }
                C9004v7.this.f31554k4 = str2;
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
                if (abstractC13912i5.mo65028jd() != 1) {
                    break;
                }
                int iM27428k4 = f31553kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    this.f31555x1.addItem(new C7394ca("binary", new evh(abstractC13912i5)));
                } else {
                    if (iM27428k4 == 2) {
                        this.f31555x1.addItem(new C7394ca("clear", new C8035jr(abstractC13912i5)));
                        break;
                    }
                    abstractC13912i5.mo65208bv();
                }
                if (abstractC13912i5.mo65015ar()) {
                    break;
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("provider", this.f31554k4);
        List.Enumerator<C7394ca> it = this.f31555x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f31553kk.m27428k4(next.m29539k4());
                if (iM27428k4 == 1) {
                    ((evh) next.m29541kk()).mo6846k4("cx", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((C8035jr) next.m29541kk()).mo6846k4("cx", c3059ii, next.m29539k4());
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
