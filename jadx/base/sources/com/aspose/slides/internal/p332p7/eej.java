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
public class eej extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f22121du = new C7017h4("style:ruby-position", "style:ruby-align");

    /* JADX INFO: renamed from: k4 */
    private int f22122k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f22123kk;

    /* JADX INFO: renamed from: to */
    private List<C8249m9> f22124to;

    /* JADX INFO: renamed from: x1 */
    private int f22125x1;

    public eej() {
        m30940x1();
    }

    public eej(AbstractC13912i5 abstractC13912i5) {
        m30940x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.eej.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = eej.f22121du.m27428k4(str);
                if (iM27428k4 == 0) {
                    eej.this.f22122k4 = per.m38884k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                eej.this.f22125x1 = diq.m30370k4(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            do {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    f22121du.m27428k4(abstractC13912i5.mo65023fa());
                    this.f22124to.addItem(new C8249m9(abstractC13912i5));
                }
            } while (!abstractC13912i5.mo65015ar());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m30940x1() {
        this.f22122k4 = 0;
        this.f22125x1 = 0;
        this.f22123kk = new List<>();
        this.f22124to = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f22122k4;
        if (i != 0) {
            c3059ii.m12955x1("style:ruby-position", per.m38885k4(i));
        }
        int i2 = this.f22125x1;
        if (i2 != 0) {
            c3059ii.m12955x1("style:ruby-align", diq.m30371k4(i2));
        }
        List.Enumerator<C8249m9> it = this.f22123kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                c3059ii.m12955x1(next.m29539k4(), (String) next.m29541kk());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f22124to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
