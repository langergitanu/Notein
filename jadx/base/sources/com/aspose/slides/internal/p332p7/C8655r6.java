package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.r6 */
/* JADX INFO: loaded from: classes4.dex */
public class C8655r6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f29189kk = new C7017h4("v:ext", "rel");

    /* JADX INFO: renamed from: k4 */
    private int f29190k4;

    /* JADX INFO: renamed from: x1 */
    private List<C8151l1> f29191x1;

    public C8655r6() {
        m39894to();
    }

    /* JADX INFO: renamed from: to */
    private void m39894to() {
        this.f29190k4 = 0;
        this.f29191x1 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C8151l1[] m39897x1() {
        return this.f29191x1.toArray(new C8151l1[0]);
    }

    public C8655r6(final AbstractC13912i5 abstractC13912i5) {
        m39894to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.r6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8655r6.f29189kk.m27428k4(str) != 0) {
                    return false;
                }
                C8655r6.this.f29190k4 = dmv.m30455k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.r6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8655r6.f29189kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C8655r6.this.f29191x1.addItem(new C8151l1(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8151l1 m39895k4() {
        C8151l1 c8151l1 = new C8151l1();
        this.f29191x1.addItem(c8151l1);
        return c8151l1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39896k4(int i) {
        this.f29190k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f29190k4;
        if (i != 0) {
            c3059ii.m12955x1("v:ext", dmv.m30456k4(i));
        }
        List.Enumerator<C8151l1> it = this.f29191x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("o", c3059ii, "rel");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
