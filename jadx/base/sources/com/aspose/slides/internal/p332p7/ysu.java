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
public class ysu extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33493kk = new C7017h4(C18293o1.f55803f, "dxf");

    /* JADX INFO: renamed from: k4 */
    private long f33494k4;

    /* JADX INFO: renamed from: x1 */
    private List<spu> f33495x1;

    public ysu() {
        m45118x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m45118x1() {
        this.f33494k4 = 4294967295L;
        this.f33495x1 = new List<>();
    }

    public ysu(final AbstractC13912i5 abstractC13912i5) {
        m45118x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ysu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (ysu.f33493kk.m27428k4(str) != 0) {
                    return false;
                }
                ysu.this.f33494k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ysu.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (ysu.f33493kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                ysu.this.f33495x1.addItem(new spu(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f33494k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j));
        }
        List.Enumerator<spu> it = this.f33495x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "dxf");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
