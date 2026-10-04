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
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.k4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8055k4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f25461h4 = new C7017h4("classid", "license", "r:id", "persistence", "ocxPr");

    /* JADX INFO: renamed from: du */
    private List<C8315n7> f25462du;

    /* JADX INFO: renamed from: k4 */
    private String f25463k4;

    /* JADX INFO: renamed from: kk */
    private String f25464kk;

    /* JADX INFO: renamed from: to */
    private int f25465to;

    /* JADX INFO: renamed from: x1 */
    private String f25466x1;

    public C8055k4() {
        this.f25465to = -1;
        this.f25462du = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final int m35118du() {
        return this.f25465to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8315n7[] m35119h4() {
        return this.f25462du.toArray(new C8315n7[0]);
    }

    /* JADX INFO: renamed from: kk */
    public final String m35123kk() {
        return this.f25466x1;
    }

    /* JADX INFO: renamed from: to */
    public final String m35125to() {
        return this.f25464kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m35126x1() {
        return this.f25463k4;
    }

    public C8055k4(final AbstractC13912i5 abstractC13912i5) {
        this();
        String strMo65050up = abstractC13912i5.mo65050up();
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj())) {
                int iM27428k4 = f25461h4.m27428k4(C14113y2.m67363du(abstractC13912i5.mo13292k4(abstractC13912i5.mo65060yj()), strMo65050up) ? abstractC13912i5.mo65023fa() : abstractC13912i5.mo65019ck());
                if (iM27428k4 == 0) {
                    this.f25463k4 = abstractC13912i5.mo65042rv();
                } else if (iM27428k4 == 1) {
                    this.f25466x1 = abstractC13912i5.mo65042rv();
                } else if (iM27428k4 == 2) {
                    this.f25464kk = abstractC13912i5.mo65042rv();
                } else {
                    if (iM27428k4 != 3) {
                        throw new Exception(C14113y2.m67408k4("Unknown attribute \"", abstractC13912i5.mo65019ck(), "\""));
                    }
                    this.f25465to = C7997jf.m34671k4(abstractC13912i5.mo65042rv());
                }
            }
        }
        abstractC13912i5.mo65020du();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.k4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8055k4.f25461h4.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                C8055k4.this.f25462du.addItem(new C8315n7(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8315n7 m35120k4() {
        C8315n7 c8315n7 = new C8315n7();
        this.f25462du.addItem(c8315n7);
        return c8315n7;
    }

    /* JADX INFO: renamed from: kk */
    public final void m35124kk(String str) {
        this.f25464kk = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35127x1(String str) {
        this.f25466x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35121k4(int i) {
        this.f25465to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35122k4(String str) {
        this.f25463k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("ax", str2, "http://schemas.microsoft.com/office/2006/activeX");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("ax:classid", this.f25463k4);
        String str3 = this.f25466x1;
        if (str3 != null) {
            c3059ii.m12955x1("license", str3);
        }
        String str4 = this.f25464kk;
        if (str4 != null) {
            c3059ii.m12955x1("r:id", str4);
        }
        c3059ii.m12955x1("ax:persistence", C7997jf.m34672k4(this.f25465to));
        List.Enumerator<C8315n7> it = this.f25462du.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ax", c3059ii, "ocxPr");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
