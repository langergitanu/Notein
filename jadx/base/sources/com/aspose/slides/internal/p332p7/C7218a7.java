package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.a7 */
/* JADX INFO: loaded from: classes4.dex */
public class C7218a7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f19854h4 = new C7017h4("xml:id", "brushRef", "brushProperty", "annotation", "annotationXML");

    /* JADX INFO: renamed from: du */
    private List<C8210lt> f19855du;

    /* JADX INFO: renamed from: k4 */
    private String f19856k4;

    /* JADX INFO: renamed from: kk */
    private List<C7345bt> f19857kk;

    /* JADX INFO: renamed from: to */
    private List<C9063vs> f19858to;

    /* JADX INFO: renamed from: x1 */
    private String f19859x1;

    public C7218a7() {
        m27960m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m27960m9() {
        this.f19857kk = new List<>();
        this.f19858to = new List<>();
        this.f19855du = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C8210lt[] m27963du() {
        return this.f19855du.toArray(new C8210lt[0]);
    }

    /* JADX INFO: renamed from: to */
    public final C9063vs[] m27970to() {
        return this.f19858to.toArray(new C9063vs[0]);
    }

    public C7218a7(final AbstractC13912i5 abstractC13912i5) {
        m27960m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.a7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7218a7.f19854h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7218a7.this.f19856k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7218a7.this.f19859x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.a7.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c7345bt;
                List list;
                int iM27428k4 = C7218a7.f19854h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    c7345bt = new C7345bt(abstractC13912i5);
                    list = C7218a7.this.f19857kk;
                } else if (iM27428k4 == 3) {
                    c7345bt = new C9063vs(abstractC13912i5);
                    list = C7218a7.this.f19858to;
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    c7345bt = new C8210lt(abstractC13912i5);
                    list = C7218a7.this.f19855du;
                }
                list.addItem(c7345bt);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m27964k4() {
        return this.f19856k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C7345bt[] m27969kk() {
        return this.f19857kk.toArray(new C7345bt[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m27971x1() {
        return this.f19859x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27965k4(C7345bt c7345bt) {
        this.f19857kk.addItem(c7345bt);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m27972x1(String str) {
        this.f19859x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27966k4(C8210lt c8210lt) {
        this.f19855du.addItem(c8210lt);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27967k4(C9063vs c9063vs) {
        this.f19858to.addItem(c9063vs);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27968k4(String str) {
        this.f19856k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f19856k4;
        if (str3 != null) {
            c3059ii.m12955x1("xml:id", str3);
        }
        String str4 = this.f19859x1;
        if (str4 != null) {
            c3059ii.m12955x1("brushRef", str4);
        }
        List.Enumerator<C7345bt> it = this.f19857kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("inkml", c3059ii, "brushProperty");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<C8210lt> it2 = this.f19858to.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("inkml", c3059ii, "annotation");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it2 = this.f19855du.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("inkml", c3059ii, "annotationXML");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
