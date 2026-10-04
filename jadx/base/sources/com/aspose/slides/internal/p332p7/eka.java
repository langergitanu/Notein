package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18293o1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class eka extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f22259kk = new C7017h4(C18293o1.f55803f, "numFmt");

    /* JADX INFO: renamed from: k4 */
    private long f22260k4;

    /* JADX INFO: renamed from: x1 */
    private List<ilt> f22261x1;

    public eka() {
        m31116to();
    }

    /* JADX INFO: renamed from: to */
    private void m31116to() {
        this.f22260k4 = 4294967295L;
        this.f22261x1 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final ilt[] m31119x1() {
        return this.f22261x1.toArray(new ilt[0]);
    }

    public eka(final AbstractC13912i5 abstractC13912i5) {
        m31116to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.eka.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (eka.f22259kk.m27428k4(str) != 0) {
                    return false;
                }
                eka.this.f22260k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.eka.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (eka.f22259kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                eka.this.f22261x1.addItem(new ilt(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final ilt m31117k4() {
        ilt iltVar = new ilt();
        this.f22261x1.addItem(iltVar);
        return iltVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31118k4(long j) {
        this.f22260k4 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f22260k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j));
        }
        List.Enumerator<ilt> enumeratorM80682iterator = this.f22261x1.iterator();
        while (enumeratorM80682iterator.hasNext()) {
            try {
                enumeratorM80682iterator.next().mo6846k4("ssml", c3059ii, "numFmt");
            } finally {
                if (C7019kk.m27456k4((Iterator) enumeratorM80682iterator, (Class<IDisposable>) IDisposable.class)) {
                    enumeratorM80682iterator.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
