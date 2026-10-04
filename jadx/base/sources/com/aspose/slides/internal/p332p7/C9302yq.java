package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yq */
/* JADX INFO: loaded from: classes4.dex */
public class C9302yq extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33465kk = new C7017h4("path", "fillToRect");

    /* JADX INFO: renamed from: k4 */
    private int f33466k4;

    /* JADX INFO: renamed from: x1 */
    private C8629qv f33467x1;

    public C9302yq() {
        m45083du();
    }

    /* JADX INFO: renamed from: du */
    private void m45083du() {
        this.f33466k4 = 0;
    }

    /* JADX INFO: renamed from: kk */
    public final C8629qv m45089kk() {
        return this.f33467x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m45090x1() {
        return this.f33466k4;
    }

    public C9302yq(final AbstractC13912i5 abstractC13912i5) {
        m45083du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9302yq.f33465kk.m27428k4(str) != 0) {
                    return false;
                }
                C9302yq.this.f33466k4 = C9080vz.m43435k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yq.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9302yq.f33465kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C9302yq.this.f33467x1 = new C8629qv(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8629qv m45087k4() {
        if (this.f33467x1 != null) {
            throw new Exception("Only one <fillToRect> element can be added.");
        }
        C8629qv c8629qv = new C8629qv();
        this.f33467x1 = c8629qv;
        return c8629qv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45088k4(int i) {
        this.f33466k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f33466k4;
        if (i != 0) {
            c3059ii.m12955x1("path", C9080vz.m43436k4(i));
        }
        C8629qv c8629qv = this.f33467x1;
        if (c8629qv != null) {
            c8629qv.mo6846k4("a", c3059ii, "fillToRect");
        }
        c3059ii.mo21898jd();
    }
}
