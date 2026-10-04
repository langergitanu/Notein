package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.z3 */
/* JADX INFO: loaded from: classes4.dex */
public class C9340z3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33672to = new C7017h4("xml:id", "channel", "intermittentChannels");

    /* JADX INFO: renamed from: k4 */
    private String f33673k4;

    /* JADX INFO: renamed from: kk */
    private C9299yp f33674kk;

    /* JADX INFO: renamed from: x1 */
    private List<C7772gl> f33675x1;

    public C9340z3() {
        m45342du();
    }

    /* JADX INFO: renamed from: du */
    private void m45342du() {
        this.f33675x1 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C9299yp m45351kk() {
        return this.f33674kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7772gl[] m45352x1() {
        return this.f33675x1.toArray(new C7772gl[0]);
    }

    public C9340z3(final AbstractC13912i5 abstractC13912i5) {
        m45342du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.z3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9340z3.f33672to.m27428k4(str) != 0) {
                    return false;
                }
                C9340z3.this.f33673k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.z3.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9340z3.f33672to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C9340z3.this.f33675x1.addItem(new C7772gl(abstractC13912i5));
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C9340z3.this.f33674kk = new C9299yp(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m45347k4() {
        return this.f33673k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45348k4(C7772gl c7772gl) {
        this.f33675x1.addItem(c7772gl);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45349k4(C9299yp c9299yp) {
        this.f33674kk = c9299yp;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45350k4(String str) {
        this.f33673k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f33673k4;
        if (str3 != null) {
            c3059ii.m12955x1("xml:id", str3);
        }
        List.Enumerator<C7772gl> it = this.f33675x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("inkml", c3059ii, "channel");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C9299yp c9299yp = this.f33674kk;
        if (c9299yp != null) {
            c9299yp.mo6846k4("inkml", c3059ii, "intermittentChannels");
        }
        c3059ii.mo21898jd();
    }
}
