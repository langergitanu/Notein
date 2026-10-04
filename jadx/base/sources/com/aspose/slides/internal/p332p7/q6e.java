package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class q6e extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private List<fpw> f28766du;

    /* JADX INFO: renamed from: kk */
    private int f28767kk;

    /* JADX INFO: renamed from: to */
    private List<l1y> f28768to;

    /* JADX INFO: renamed from: x1 */
    private boolean f28769x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f28765k4 = a7o.m27979k4("none");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f28764h4 = new C7017h4("blank", "calendarType", "filter", "dateGroupItem");

    public q6e() {
        m39364x1();
    }

    public q6e(final AbstractC13912i5 abstractC13912i5) {
        m39364x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.q6e.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = q6e.f28764h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    q6e.this.f28769x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                q6e.this.f28767kk = a7o.m27979k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.q6e.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz l1yVar;
                List list;
                int iM27428k4 = q6e.f28764h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    l1yVar = new l1y(abstractC13912i5);
                    list = q6e.this.f28768to;
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    l1yVar = new fpw(abstractC13912i5);
                    list = q6e.this.f28766du;
                }
                list.addItem(l1yVar);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m39364x1() {
        this.f28769x1 = false;
        this.f28767kk = f28765k4;
        this.f28768to = new List<>();
        this.f28766du = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f28769x1;
        if (z) {
            c3059ii.m12955x1("blank", z ? "1" : "0");
        }
        int i = this.f28767kk;
        if (i != f28765k4) {
            c3059ii.m12955x1("calendarType", a7o.m27980k4(i));
        }
        List.Enumerator<fpw> it = this.f28768to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "filter");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f28766du.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "dateGroupItem");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
