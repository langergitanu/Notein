package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class udt extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31234kk = new C7017h4("highlighted-range", "operation");

    /* JADX INFO: renamed from: k4 */
    private List<ssy> f31235k4;

    /* JADX INFO: renamed from: x1 */
    private List<vbm> f31236x1;

    public udt() {
        m42338x1();
    }

    public udt(final AbstractC13912i5 abstractC13912i5) {
        m42338x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.udt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz ssyVar;
                List list;
                int iM27428k4 = udt.f31234kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    ssyVar = new ssy(abstractC13912i5);
                    list = udt.this.f31235k4;
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    ssyVar = new vbm(abstractC13912i5);
                    list = udt.this.f31236x1;
                }
                list.addItem(ssyVar);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m42338x1() {
        this.f31235k4 = new List<>();
        this.f31236x1 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<vbm> it = this.f31235k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("table", c3059ii, "highlighted-range");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f31236x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("table", c3059ii, "operation");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
