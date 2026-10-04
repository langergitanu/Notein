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
public class iuf extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24946kk = new C7017h4(C18293o1.f55803f, "tablePart");

    /* JADX INFO: renamed from: k4 */
    private long f24947k4;

    /* JADX INFO: renamed from: x1 */
    private List<f2h> f24948x1;

    public iuf() {
        m34470to();
    }

    /* JADX INFO: renamed from: to */
    private void m34470to() {
        this.f24947k4 = 4294967295L;
        this.f24948x1 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final f2h[] m34472x1() {
        return this.f24948x1.toArray(new f2h[0]);
    }

    public iuf(final AbstractC13912i5 abstractC13912i5) {
        m34470to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.iuf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (iuf.f24946kk.m27428k4(str) != 0) {
                    return false;
                }
                iuf.this.f24947k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.iuf.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (iuf.f24946kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                iuf.this.f24948x1.addItem(new f2h(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final f2h m34471k4() {
        f2h f2hVar = new f2h();
        this.f24948x1.addItem(f2hVar);
        return f2hVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f24947k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j));
        }
        List.Enumerator<f2h> it = this.f24948x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "tablePart");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
