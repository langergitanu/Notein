package com.aspose.slides.internal.p409sv;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3529rv;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p097e0.C3534up;
import com.aspose.slides.internal.p097e0.InterfaceC3532u4;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C10765ar extends AbstractC3529rv {

    /* JADX INFO: renamed from: c5 */
    private InterfaceC3532u4 f37589c5;

    /* JADX INFO: renamed from: dy */
    private String f37590dy;

    /* JADX INFO: renamed from: jd */
    private Dictionary<AbstractC3511c5, AbstractC3533um> f37591jd;

    /* JADX INFO: renamed from: com.aspose.slides.internal.sv.ar$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public final String f37592k4;

        /* JADX INFO: renamed from: kk */
        public final String f37593kk;

        /* JADX INFO: renamed from: to */
        public final String f37594to;

        /* JADX INFO: renamed from: x1 */
        public final String f37595x1;

        private k4(String str, String str2, String str3, String str4) {
            this.f37592k4 = str;
            this.f37595x1 = str2;
            this.f37593kk = str3 != null ? str3 : str2;
            this.f37594to = str4;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m52184k4(String str, String str2, String str3, String str4) {
            return new k4(str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            if (this == obj) {
                return true;
            }
            if (!C7019kk.m27469x1(obj, k4.class)) {
                return false;
            }
            k4 k4Var = (k4) obj;
            return (C14113y2.m67363du(k4Var.f37592k4, this.f37592k4) || ((str4 = k4Var.f37592k4) != null && C14113y2.m67363du(str4, this.f37592k4))) && (C14113y2.m67363du(k4Var.f37595x1, this.f37595x1) || ((str3 = k4Var.f37595x1) != null && C14113y2.m67363du(str3, this.f37595x1))) && ((C14113y2.m67363du(k4Var.f37593kk, this.f37593kk) || ((str2 = k4Var.f37593kk) != null && C14113y2.m67363du(str2, this.f37593kk))) && (C14113y2.m67363du(k4Var.f37594to, this.f37594to) || ((str = k4Var.f37594to) != null && C14113y2.m67363du(str, this.f37594to))));
        }

        public int hashCode() {
            String str = this.f37592k4;
            int iHashCode = (629 + (str == null ? 0 : str.hashCode())) * 37;
            String str2 = this.f37595x1;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 37;
            String str3 = this.f37593kk;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 37;
            String str4 = this.f37594to;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.sv.ar$kk */
    public static class kk implements InterfaceC3532u4 {

        /* JADX INFO: renamed from: k4 */
        private C10765ar f37596k4;

        public kk(C10765ar c10765ar) {
            this.f37596k4 = c10765ar;
        }

        @Override // com.aspose.slides.internal.p097e0.InterfaceC3532u4
        /* JADX INFO: renamed from: k4 */
        public final AbstractC3533um mo14250k4(AbstractC3524ks abstractC3524ks, AbstractC3533um abstractC3533um) {
            x1 x1Var = new x1(abstractC3524ks, abstractC3533um);
            this.f37596k4.f37591jd.addItem(abstractC3524ks, x1Var);
            return x1Var;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.sv.ar$x1 */
    public static class x1 extends AbstractC3533um implements InterfaceC3760kk {

        /* JADX INFO: renamed from: x1 */
        private k4[] f37597x1;

        public x1(AbstractC3524ks abstractC3524ks, AbstractC3533um abstractC3533um) {
            super(abstractC3524ks, null);
        }

        @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
        /* JADX INFO: renamed from: c5 */
        public final String mo15076c5(int i) {
            k4 k4Var;
            k4[] k4VarArr = this.f37597x1;
            if (k4VarArr == null || i >= k4VarArr.length || i < 0 || (k4Var = k4VarArr[i]) == null) {
                return null;
            }
            return k4Var.f37593kk;
        }

        @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
        /* JADX INFO: renamed from: ck */
        public final String mo15077ck(int i) {
            k4 k4Var;
            k4[] k4VarArr = this.f37597x1;
            if (k4VarArr == null || i >= k4VarArr.length || i < 0 || (k4Var = k4VarArr[i]) == null) {
                return null;
            }
            return k4Var.f37594to;
        }

        @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
        /* JADX INFO: renamed from: dy */
        public final String mo15078dy(int i) {
            k4 k4Var;
            k4[] k4VarArr = this.f37597x1;
            if (k4VarArr == null || i >= k4VarArr.length || i < 0 || (k4Var = k4VarArr[i]) == null) {
                return null;
            }
            return k4Var.f37592k4;
        }

        @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
        /* JADX INFO: renamed from: jd */
        public final String mo15079jd(int i) {
            k4 k4Var;
            k4[] k4VarArr = this.f37597x1;
            if (k4VarArr == null || i >= k4VarArr.length || i < 0 || (k4Var = k4VarArr[i]) == null) {
                return null;
            }
            return k4Var.f37595x1;
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3533um
        /* JADX INFO: renamed from: k4 */
        public void mo14064k4(int i, AbstractC4282kp abstractC4282kp) {
        }

        /* JADX INFO: renamed from: kk */
        public final int m52185kk(String str) {
            k4 k4Var;
            k4[] k4VarArr = this.f37597x1;
            if (k4VarArr != null && str != null) {
                int length = k4VarArr.length;
                while (true) {
                    length--;
                    if (length < 0 || ((k4Var = this.f37597x1[length]) != null && C14113y2.m67363du(str, k4Var.f37595x1))) {
                        break;
                    }
                }
            }
            return -1;
        }

        @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
        /* JADX INFO: renamed from: to */
        public final String mo15082to(String str) {
            int iM52185kk = m52185kk(str);
            if (iM52185kk > 0) {
                return mo15077ck(iM52185kk);
            }
            return null;
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3533um
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo14065x1(int i) {
            return null;
        }

        @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
        /* JADX INFO: renamed from: yj */
        public final int mo15083yj() {
            k4[] k4VarArr = this.f37597x1;
            if (k4VarArr == null) {
                return 0;
            }
            return k4VarArr.length;
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3533um
        /* JADX INFO: renamed from: k4 */
        public void mo14395k4(InterfaceC3760kk interfaceC3760kk) {
            this.f37597x1 = new k4[interfaceC3760kk.mo15083yj()];
            int iMo15083yj = interfaceC3760kk.mo15083yj();
            while (true) {
                iMo15083yj--;
                if (iMo15083yj < 0) {
                    return;
                }
                this.f37597x1[iMo15083yj] = k4.m52184k4(interfaceC3760kk.mo15078dy(iMo15083yj), interfaceC3760kk.mo15079jd(iMo15083yj), interfaceC3760kk.mo15076c5(iMo15083yj), interfaceC3760kk.mo15077ck(iMo15083yj));
            }
        }
    }

    public C10765ar(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f37591jd = new Dictionary<>();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3529rv, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        super.mo14081dy();
        mo14109o_().m14406k4(this.f37589c5);
        this.f37589c5 = null;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        C3534up c3534upMo14109o_ = mo14109o_();
        this.f37589c5 = c3534upMo14109o_.m14410x1();
        c3534upMo14109o_.m14406k4(new kk(this));
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 44;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        C10765ar c10765ar;
        if (m14323kk(16) < 0) {
            c10765ar = this;
            c10765ar.m14095k4(this.f9753kk, m14115s_().m14105ks(), "http://www.w3.org/1999/XSL/Format", mo14114rv(), "rule.markerDescendantOfFlow");
        } else {
            c10765ar = this;
        }
        String strMo9926j_ = abstractC3533um.m14385du(152).mo9926j_();
        c10765ar.f37590dy = strMo9926j_;
        if (C14113y2.m67411k4(strMo9926j_)) {
            m14104kk("marker-class-name");
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: p_ */
    public boolean mo14110p_() {
        return true;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return RequestParameters.MARKER;
    }

    /* JADX INFO: renamed from: to */
    public final x1 m52182to(AbstractC3511c5 abstractC3511c5) {
        AbstractC3533um[] abstractC3533umArr = {null};
        this.f37591jd.tryGetValue(abstractC3511c5, abstractC3533umArr);
        return (x1) abstractC3533umArr[0];
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks
    public String toString() {
        C6765kp c6765kp = new C6765kp(super.toString());
        c6765kp.m26792k4(" {").m26792k4(m52183ts()).m26792k4("}");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: ts */
    public final String m52183ts() {
        return this.f37590dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str) || m14328to(str, str2)) {
            return;
        }
        m14103kk(interfaceC3757h4, str, str2);
    }
}
