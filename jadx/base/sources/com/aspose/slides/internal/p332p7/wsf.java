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
public class wsf extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32536kk = new C7017h4(C18293o1.f55803f, "tableColumn");

    /* JADX INFO: renamed from: k4 */
    private long f32537k4;

    /* JADX INFO: renamed from: x1 */
    private List<erz> f32538x1;

    public wsf() {
        m44016kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m44016kk() {
        this.f32537k4 = 4294967295L;
        this.f32538x1 = new List<>();
    }

    public wsf(final AbstractC13912i5 abstractC13912i5) {
        m44016kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wsf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (wsf.f32536kk.m27428k4(str) != 0) {
                    return false;
                }
                wsf.this.f32537k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wsf.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (wsf.f32536kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                wsf.this.f32538x1.addItem(new erz(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final erz m44018k4() {
        erz erzVar = new erz();
        this.f32538x1.addItem(erzVar);
        return erzVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44019k4(long j) {
        this.f32537k4 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f32537k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j));
        }
        List.Enumerator<erz> it = this.f32538x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "tableColumn");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
