package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.dd */
/* JADX INFO: loaded from: classes5.dex */
public class C12943dd extends C13126nm {

    /* JADX INFO: renamed from: c5 */
    private C12943dd f43516c5;

    /* JADX INFO: renamed from: du */
    private AbstractC12892ae f43517du;

    /* JADX INFO: renamed from: h4 */
    private int f43519h4;

    /* JADX INFO: renamed from: jd */
    private int f43520jd;

    /* JADX INFO: renamed from: k4 */
    private String f43521k4;

    /* JADX INFO: renamed from: kk */
    private int f43522kk;

    /* JADX INFO: renamed from: m9 */
    private volatile C13125nk f43523m9;

    /* JADX INFO: renamed from: to */
    private C12943dd f43524to;

    /* JADX INFO: renamed from: x1 */
    private int f43525x1 = 256;

    /* JADX INFO: renamed from: dy */
    private volatile C13890ei f43518dy = C13890ei.f46456k4;

    /* JADX INFO: renamed from: k4 */
    public static C12969en m60204k4(C13890ei c13890ei) {
        if (c13890ei == null) {
            throw new ArgumentNullException("qualifiedName");
        }
        if (c13890ei.equals(C12969en.m60399k4().m60210bv())) {
            return C12969en.m60399k4();
        }
        if (c13890ei.equals(C12969en.m60404x1().m60210bv())) {
            return C12969en.m60404x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public static C13164q9 m60207kk(int i) {
        return AbstractC13279x6.m61676kk(i);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    public String ae_() {
        return m60208ar();
    }

    /* JADX INFO: renamed from: ar */
    public final String m60208ar() {
        return this.f43521k4;
    }

    /* JADX INFO: renamed from: b3 */
    public final int m60209b3() {
        return this.f43522kk;
    }

    /* JADX INFO: renamed from: bv */
    public final C13890ei m60210bv() {
        return this.f43518dy;
    }

    /* JADX INFO: renamed from: bz */
    public final AbstractC12892ae m60211bz() {
        return this.f43517du;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m60212c5(int i) {
        this.f43520jd = i;
    }

    /* JADX INFO: renamed from: du */
    public final void m60213du(int i) {
        this.f43519h4 = i;
    }

    /* JADX INFO: renamed from: dy */
    public final void m60214dy(int i) {
        this.f43522kk = i;
    }

    /* JADX INFO: renamed from: g8 */
    public final AbstractC12974ex m60215g8() {
        AbstractC12892ae abstractC12892ae = this.f43517du;
        return abstractC12892ae == null ? C13023hz.f43742k4 : abstractC12892ae.mo60019dy();
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: h4 */
    public void mo59981h4(String str) {
        m60229x1(str);
    }

    /* JADX INFO: renamed from: jd */
    public boolean mo60216jd() {
        return false;
    }

    /* JADX INFO: renamed from: qm */
    public final int m60220qm() {
        if (this == C12969en.m60399k4()) {
            return 1;
        }
        AbstractC12892ae abstractC12892ae = this.f43517du;
        if (abstractC12892ae == null) {
            return 0;
        }
        return abstractC12892ae.mo60020fa();
    }

    /* JADX INFO: renamed from: ss */
    public final C12943dd m60221ss() {
        return this.f43516c5;
    }

    /* JADX INFO: renamed from: sv */
    public final int m60222sv() {
        return this.f43520jd;
    }

    /* JADX INFO: renamed from: to */
    public final void m60223to(int i) {
        this.f43525x1 = i;
    }

    /* JADX INFO: renamed from: um */
    public final int m60224um() {
        return this.f43525x1;
    }

    /* JADX INFO: renamed from: v4 */
    public final int m60225v4() {
        return this.f43519h4;
    }

    /* JADX INFO: renamed from: wp */
    public final C13125nk m60226wp() {
        return this.f43523m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60227x1(C12943dd c12943dd) {
        this.f43516c5 = c12943dd;
    }

    /* JADX INFO: renamed from: yd */
    public final C12943dd m60231yd() {
        return this.f43524to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60217k4(AbstractC12892ae abstractC12892ae) {
        this.f43517du = abstractC12892ae;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60228x1(C13890ei c13890ei) {
        this.f43518dy = c13890ei;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60218k4(C12943dd c12943dd) {
        this.f43524to = c12943dd;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60229x1(String str) {
        this.f43521k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60219k4(C13125nk c13125nk) {
        this.f43523m9 = c13125nk;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo60230x1(boolean z) {
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m60205k4(AbstractC12892ae abstractC12892ae, AbstractC12892ae abstractC12892ae2, int i) {
        if (AbstractC13279x6.m61669k4().m60211bz() == abstractC12892ae2) {
            return true;
        }
        return abstractC12892ae.mo60030k4(abstractC12892ae2);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m60206k4(C12943dd c12943dd, C12943dd c12943dd2, int i) {
        if (c12943dd != null && c12943dd2 != null) {
            if (c12943dd == c12943dd2 || c12943dd2 == C12969en.m60399k4()) {
                return true;
            }
            do {
                C13164q9 c13164q9 = (C13164q9) C7019kk.m27452k4((Object) c12943dd, C13164q9.class);
                C13164q9 c13164q92 = (C13164q9) C7019kk.m27452k4((Object) c12943dd2, C13164q9.class);
                if (c13164q92 != null && c13164q9 != null) {
                    if (c13164q92 == AbstractC13279x6.m61669k4()) {
                        return true;
                    }
                    return (c12943dd.m60209b3() & i) == 0 && c13164q9.m60211bz().mo60030k4(c13164q92.m60211bz());
                }
                if ((c12943dd.m60209b3() & i) != 0) {
                    return false;
                }
                c12943dd = c12943dd.m60231yd();
                if (c12943dd == c12943dd2) {
                    return true;
                }
            } while (c12943dd != null);
        }
        return false;
    }
}
