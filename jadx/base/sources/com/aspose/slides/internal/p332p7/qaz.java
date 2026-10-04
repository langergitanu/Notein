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
public class qaz extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private long f28830kk;

    /* JADX INFO: renamed from: to */
    private List<xhm> f28831to;

    /* JADX INFO: renamed from: x1 */
    private int f28832x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f28829k4 = ugr.m42377k4("f");

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28828du = new C7017h4("recolorstate", "numcolors", "recolorinfoentry");

    public qaz() {
        m39426du();
    }

    /* JADX INFO: renamed from: du */
    private void m39426du() {
        this.f28832x1 = f28829k4;
        this.f28831to = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final xhm[] m39434kk() {
        return this.f28831to.toArray(new xhm[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m39435x1() {
        return this.f28832x1;
    }

    public qaz(final AbstractC13912i5 abstractC13912i5) {
        m39426du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qaz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = qaz.f28828du.m27428k4(str);
                if (iM27428k4 == 0) {
                    qaz.this.f28832x1 = ugr.m42377k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                qaz.this.f28830kk = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qaz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (qaz.f28828du.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                qaz.this.f28831to.addItem(new xhm(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final xhm m39431k4() {
        xhm xhmVar = new xhm();
        this.f28831to.addItem(xhmVar);
        return xhmVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39432k4(int i) {
        this.f28832x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39433k4(long j) {
        this.f28830kk = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f28832x1;
        if (i != f28829k4) {
            c3059ii.m12955x1("recolorstate", ugr.m42378k4(i));
        }
        c3059ii.m12955x1("numcolors", C13850af.m65147x1(this.f28830kk));
        List.Enumerator<xhm> it = this.f28831to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ppt", c3059ii, "recolorinfoentry");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
