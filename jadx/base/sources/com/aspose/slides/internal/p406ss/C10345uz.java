package com.aspose.slides.internal.p406ss;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p034b3.C1603v4;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3516dy;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p097e0.C3534up;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p145g8.C4226k4;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;
import com.aspose.slides.internal.p235kp.C5896kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C10345uz extends AbstractC3524ks implements InterfaceC4260ak {

    /* JADX INFO: renamed from: c5 */
    private C5896kk f36825c5;

    /* JADX INFO: renamed from: ck */
    private List<C1603v4> f36826ck;

    /* JADX INFO: renamed from: dy */
    private C10341to f36827dy;

    /* JADX INFO: renamed from: fa */
    private C11697x1 f36828fa;

    /* JADX INFO: renamed from: h4 */
    private C4270dy f36829h4;

    /* JADX INFO: renamed from: jd */
    private List<C4226k4> f36830jd;

    /* JADX INFO: renamed from: ks */
    private int f36831ks;

    /* JADX INFO: renamed from: m9 */
    private C10337m9 f36832m9;

    /* JADX INFO: renamed from: rv */
    private C3534up f36833rv;

    /* JADX INFO: renamed from: up */
    private boolean f36834up;

    /* JADX INFO: renamed from: x6 */
    private AbstractC3516dy f36835x6;

    /* JADX INFO: renamed from: yj */
    private int f36836yj;

    public C10345uz(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f36825c5 = null;
        this.f36834up = false;
        this.f36836yj = 0;
        this.f36831ks = 0;
        this.f36835x6 = null;
        this.f36826ck = new List<>();
    }

    /* JADX INFO: renamed from: du */
    private boolean m50395du(String str) {
        return (str == null || C14113y2.m67363du(str, "none")) ? false : true;
    }

    /* JADX INFO: renamed from: bz */
    public final C10337m9 m50396bz() {
        return this.f36832m9;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (!this.f36834up || this.f36832m9 == null) {
            m14123x1(C14113y2.m67408k4("(layout-master-set, declarations?, ", "bookmark-tree?, (page-sequence|fox:external-document)+)"));
        }
        this.f36835x6.mo14199x1(this);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m50397e0() {
        return this.f36836yj;
    }

    /* JADX INFO: renamed from: g8 */
    public final List<C4226k4> m50398g8() {
        return this.f36830jd;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        this.f36835x6.mo8555k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 66;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50399k4(int i, int i2) {
        if (i2 < 0) {
            throw new ArgumentException("Number of additional pages must be zero or greater.");
        }
        this.f36831ks += i2;
        this.f36836yj = i;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: n_ */
    public AbstractC3516dy mo14107n_() {
        return this.f36835x6;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: o_ */
    public C3534up mo14109o_() {
        return this.f36833rv;
    }

    /* JADX INFO: renamed from: qm */
    public final C10341to m50406qm() {
        return this.f36827dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "root";
    }

    /* JADX INFO: renamed from: sv */
    public final C5896kk m50407sv() {
        return this.f36825c5;
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f36829h4;
    }

    /* JADX INFO: renamed from: wp */
    public final C11697x1 m50408wp() {
        return this.f36828fa;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: yj */
    public C10345uz mo14126yj() {
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50400k4(AbstractC3516dy abstractC3516dy) {
        this.f36835x6 = abstractC3516dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f36829h4 = C4270dy.m17199k4(abstractC3533um);
        String strMo9926j_ = abstractC3533um.m14402to(134).mo9926j_();
        String strMo9926j_2 = abstractC3533um.m14402to(81).mo9926j_();
        if (m50395du(strMo9926j_)) {
            if (m50395du(strMo9926j_2)) {
                this.f36828fa = new C11697x1(C14113y2.m67408k4(strMo9926j_, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, strMo9926j_2));
            } else {
                this.f36828fa = new C11697x1(strMo9926j_);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50401k4(C3534up c3534up) {
        this.f36833rv = c3534up;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du("http://xmlgraphics.apache.org/fop/extensions", str) && C14113y2.m67363du(str2, "external-document")) {
                this.f36834up = true;
                return;
            }
            return;
        }
        if (C14113y2.m67363du(str2, "layout-master-set")) {
            if (this.f36832m9 != null) {
                m14093k4(interfaceC3757h4, "fo:layout-master-set");
                return;
            }
            return;
        }
        if (C14113y2.m67363du(str2, "declarations")) {
            if (this.f36832m9 == null) {
                m14122x1(interfaceC3757h4, "fo:layout-master-set", "fo:declarations");
                return;
            }
            if (this.f36827dy != null) {
                m14093k4(interfaceC3757h4, "fo:declarations");
                return;
            } else if (this.f36825c5 != null) {
                m14122x1(interfaceC3757h4, "fo:declarations", "fo:bookmark-tree");
                return;
            } else {
                if (this.f36834up) {
                    m14122x1(interfaceC3757h4, "fo:declarations", "fo:page-sequence");
                    return;
                }
                return;
            }
        }
        if (!C14113y2.m67363du(str2, "bookmark-tree")) {
            if (!C14113y2.m67363du(str2, "page-sequence")) {
                m14103kk(interfaceC3757h4, str, str2);
                return;
            } else if (this.f36832m9 == null) {
                m14122x1(interfaceC3757h4, "fo:layout-master-set", "fo:page-sequence");
                return;
            } else {
                this.f36834up = true;
                return;
            }
        }
        if (this.f36832m9 == null) {
            m14122x1(interfaceC3757h4, "fo:layout-master-set", "fo:bookmark-tree");
        } else if (this.f36825c5 != null) {
            m14093k4(interfaceC3757h4, "fo:bookmark-tree");
        } else if (this.f36834up) {
            m14122x1(interfaceC3757h4, "fo:bookmark-tree", "fo:page-sequence");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50402k4(C4226k4 c4226k4) {
        if (this.f36830jd == null) {
            this.f36830jd = new List<>();
        }
        this.f36830jd.addItem(c4226k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50403k4(C5896kk c5896kk) {
        this.f36825c5 = c5896kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50404k4(C10337m9 c10337m9) {
        this.f36832m9 = c10337m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50405k4(C10341to c10341to) {
        this.f36827dy = c10341to;
    }
}
