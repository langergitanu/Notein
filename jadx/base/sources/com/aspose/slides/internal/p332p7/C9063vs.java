package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.vs */
/* JADX INFO: loaded from: classes4.dex */
public class C9063vs extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f31985du = new C7017h4(C18437z2.f56754h, "encoding");

    /* JADX INFO: renamed from: k4 */
    private String f31986k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f31987kk;

    /* JADX INFO: renamed from: to */
    private String f31988to;

    /* JADX INFO: renamed from: x1 */
    private String f31989x1;

    public C9063vs() {
        m43228du();
    }

    /* JADX INFO: renamed from: du */
    private void m43228du() {
        this.f31987kk = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m43232k4() {
        return this.f31986k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m43234kk() {
        return this.f31988to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m43236x1() {
        return this.f31989x1;
    }

    public C9063vs(AbstractC13912i5 abstractC13912i5) {
        m43228du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vs.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9063vs.f31985du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9063vs.this.f31986k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9063vs.this.f31989x1 = str2;
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        abstractC13912i5.mo65026h4();
        this.f31988to = abstractC13912i5.mo65042rv();
    }

    /* JADX INFO: renamed from: kk */
    public final void m43235kk(String str) {
        this.f31988to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43233k4(String str) {
        this.f31986k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43237x1(String str) {
        this.f31989x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f31986k4;
        if (str3 != null) {
            c3059ii.m12955x1(C18437z2.f56754h, str3);
        }
        String str4 = this.f31989x1;
        if (str4 != null) {
            c3059ii.m12955x1("encoding", str4);
        }
        List.Enumerator<C7394ca> it = this.f31987kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                c3059ii.m12955x1(next.m29539k4(), (String) next.m29541kk());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21918x1(this.f31988to);
        c3059ii.mo21898jd();
    }
}
