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
public class vbz extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31718kk = new C7017h4(C18293o1.f55803f, "xf");

    /* JADX INFO: renamed from: k4 */
    private long f31719k4;

    /* JADX INFO: renamed from: x1 */
    private List<zoh> f31720x1;

    public vbz() {
        m42914to();
    }

    /* JADX INFO: renamed from: to */
    private void m42914to() {
        this.f31719k4 = 4294967295L;
        this.f31720x1 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final zoh[] m42917x1() {
        return this.f31720x1.toArray(new zoh[0]);
    }

    public vbz(final AbstractC13912i5 abstractC13912i5) {
        m42914to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vbz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (vbz.f31718kk.m27428k4(str) != 0) {
                    return false;
                }
                vbz.this.f31719k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vbz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (vbz.f31718kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                vbz.this.f31720x1.addItem(new zoh(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final zoh m42915k4() {
        zoh zohVar = new zoh();
        this.f31720x1.addItem(zohVar);
        return zohVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42916k4(long j) {
        this.f31719k4 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f31719k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j));
        }
        List.Enumerator<zoh> it = this.f31720x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "xf");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
