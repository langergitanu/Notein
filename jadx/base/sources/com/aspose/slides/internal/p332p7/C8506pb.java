package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pb */
/* JADX INFO: loaded from: classes4.dex */
public final class C8506pb extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28328x1 = new C7017h4("idx");

    /* JADX INFO: renamed from: k4 */
    private List<Long> f28329k4;

    public C8506pb() {
        this.f28329k4 = new List<>();
    }

    public C8506pb(final AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8506pb.f28328x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8506pb.this.f28329k4.addItem(Long.valueOf(C13850af.m65122ks(abstractC13912i5.mo65046to("val")) & 4294967295L));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38767k4(long j) {
        this.f28329k4.addItem(Long.valueOf(j));
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<Long> it = this.f28329k4.iterator();
        while (it.hasNext()) {
            try {
                long jLongValue = ((Long) C7019kk.m27464to(it.next(), Long.TYPE)).longValue();
                c3059ii.mo12953k4("cx", "idx", (String) null);
                c3059ii.m12955x1("val", C13850af.m65147x1(jLongValue));
                c3059ii.mo21898jd();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final long[] m38768k4() {
        return C3085sv.m13068h4(this.f28329k4);
    }
}
