package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.lv */
/* JADX INFO: loaded from: classes3.dex */
public class C2182lv implements InterfaceC2001am {

    /* JADX INFO: renamed from: k4 */
    private AbstractC2011be f7591k4;

    public C2182lv(AbstractC2011be abstractC2011be) {
        this.f7591k4 = abstractC2011be;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2001am
    /* JADX INFO: renamed from: k4 */
    public final C2033cj[] mo10154k4() {
        try {
            List list = new List();
            C2212n9 c2212n9 = new C2212n9(this.f7591k4);
            try {
                if (C14113y2.m67382k4(c2212n9.m11156k4(4, "us-ascii"), "ttcf", true) != 0) {
                    c2212n9.m11159k4(0L);
                    C2258qc c2258qc = new C2258qc(0, C2145ji.m10842k4(), (AbstractC2011be) this.f7591k4.mo10243kk(), 0L);
                    C2132iq c2132iq = (C2132iq) new C2284s2().mo11021k4(new C2033cj(0, c2258qc));
                    list.addItem(new C2033cj(c2132iq.mo10754rv(), c2132iq.m10761x6(), 0, c2258qc));
                } else {
                    c2212n9.m11163to();
                    int iM11164up = (int) c2212n9.m11164up();
                    long[] jArr = new long[iM11164up];
                    for (int i = 0; i < iM11164up; i++) {
                        jArr[i] = c2212n9.m11164up();
                        AbstractC2011be abstractC2011be = (AbstractC2011be) this.f7591k4.mo10243kk();
                        abstractC2011be.m10242k4(jArr[i] & 4294967295L);
                        C2258qc c2258qc2 = new C2258qc(i, C2145ji.m10843kk(), abstractC2011be, jArr[i] & 4294967295L);
                        C2132iq c2132iq2 = (C2132iq) new C2284s2().mo11021k4(new C2033cj(0, c2258qc2));
                        list.addItem(new C2033cj(c2132iq2.mo10754rv(), c2132iq2.m10761x6(), 0, c2258qc2));
                    }
                }
                c2212n9.dispose();
                return (C2033cj[]) list.toArray(new C2033cj[0]);
            } catch (Throwable th) {
                c2212n9.dispose();
                throw th;
            }
        } catch (C2096ga e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new C2093g6("Unexpected font parsing exception", e2);
        }
    }

    public C2182lv(String str) {
        this.f7591k4 = new C2405zd(str);
    }
}
