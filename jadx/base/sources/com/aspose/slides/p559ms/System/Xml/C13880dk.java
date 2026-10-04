package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.AbstractC13018hl;
import com.aspose.slides.internal.p532yu.AbstractC13074kt;
import com.aspose.slides.internal.p532yu.AbstractC13319z7;
import com.aspose.slides.internal.p532yu.C12915bu;
import com.aspose.slides.internal.p532yu.C12943dd;
import com.aspose.slides.internal.p532yu.C12962eb;
import com.aspose.slides.internal.p532yu.C13021hu;
import com.aspose.slides.internal.p532yu.C13146p4;
import com.aspose.slides.internal.p532yu.C13164q9;
import com.aspose.slides.internal.p532yu.C13329zn;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.dk */
/* JADX INFO: loaded from: classes5.dex */
public class C13880dk extends AbstractC13912i5 implements InterfaceC13298y4, InterfaceC13896f9, InterfaceC13980t6 {

    /* JADX INFO: renamed from: qm */
    private static volatile AbstractC14068j5 f46405qm;

    /* JADX INFO: renamed from: ak */
    private String f46406ak;

    /* JADX INFO: renamed from: ar */
    private AbstractC13883dt f46407ar;

    /* JADX INFO: renamed from: b3 */
    private String f46408b3;

    /* JADX INFO: renamed from: bv */
    private C14028yn f46409bv;

    /* JADX INFO: renamed from: bz */
    private int f46410bz;

    /* JADX INFO: renamed from: c5 */
    private C13950o3 f46411c5;

    /* JADX INFO: renamed from: c6 */
    private C14022y4 f46412c6;

    /* JADX INFO: renamed from: ck */
    private boolean f46413ck;

    /* JADX INFO: renamed from: dq */
    private String f46414dq;

    /* JADX INFO: renamed from: du */
    private AbstractC13943n5 f46415du;

    /* JADX INFO: renamed from: dy */
    private AbstractC13074kt f46416dy;

    /* JADX INFO: renamed from: e0 */
    private C13892em f46417e0;

    /* JADX INFO: renamed from: fa */
    private boolean f46418fa;

    /* JADX INFO: renamed from: h4 */
    private AbstractC13319z7 f46419h4;

    /* JADX INFO: renamed from: ix */
    private ArrayList f46420ix;

    /* JADX INFO: renamed from: jd */
    private boolean f46421jd;

    /* JADX INFO: renamed from: k4 */
    private AbstractC13912i5 f46422k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC13980t6 f46423kk;

    /* JADX INFO: renamed from: ks */
    private int f46424ks;

    /* JADX INFO: renamed from: lr */
    private String f46425lr;

    /* JADX INFO: renamed from: m9 */
    private int f46426m9;

    /* JADX INFO: renamed from: ne */
    private C13924k4[] f46427ne;

    /* JADX INFO: renamed from: qq */
    private String f46428qq;

    /* JADX INFO: renamed from: rv */
    private int f46429rv;

    /* JADX INFO: renamed from: to */
    private C12962eb f46430to;

    /* JADX INFO: renamed from: ts */
    private InterfaceC13896f9 f46431ts;

    /* JADX INFO: renamed from: u4 */
    private C12915bu f46432u4;

    /* JADX INFO: renamed from: um */
    private C13876cz f46433um;

    /* JADX INFO: renamed from: up */
    private C14028yn f46434up;

    /* JADX INFO: renamed from: uz */
    private Object f46435uz;

    /* JADX INFO: renamed from: v4 */
    private String f46436v4;

    /* JADX INFO: renamed from: wl */
    private C13329zn f46437wl;

    /* JADX INFO: renamed from: wy */
    private String f46438wy;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC13980t6 f46439x1;

    /* JADX INFO: renamed from: x6 */
    private int f46440x6;

    /* JADX INFO: renamed from: xk */
    private String f46441xk;

    /* JADX INFO: renamed from: yd */
    private String f46442yd;

    /* JADX INFO: renamed from: yj */
    private C13924k4 f46443yj;

    public C13880dk(AbstractC13912i5 abstractC13912i5, AbstractC13943n5 abstractC13943n5, C13906gx c13906gx) {
        this(abstractC13912i5, abstractC13943n5, c13906gx, null);
    }

    /* JADX INFO: renamed from: c5 */
    private void m65242c5() {
        this.f46426m9 = 1;
        this.f46420ix = new ArrayList();
        this.f46440x6 = -1;
        this.f46427ne = new C13924k4[8];
        this.f46416dy = new C14033z6(this);
        f46405qm = C7019kk.m27443k4((Class<?>) String.class);
        this.f46437wl = new C13329zn();
        this.f46436v4 = this.f46407ar.mo65266k4("http://www.w3.org/2000/xmlns/");
        this.f46425lr = this.f46407ar.mo65266k4("http://www.w3.org/2001/XMLSchema");
        this.f46442yd = this.f46407ar.mo65266k4("http://www.w3.org/2001/XMLSchema-instance");
        this.f46408b3 = this.f46407ar.mo65266k4(C18437z2.f56754h);
        this.f46438wy = this.f46407ar.mo65266k4("nil");
        this.f46414dq = this.f46407ar.mo65266k4("schemaLocation");
        this.f46441xk = this.f46407ar.mo65266k4("noNamespaceSchemaLocation");
        this.f46406ak = this.f46407ar.mo65266k4("Schema");
    }

    /* JADX INFO: renamed from: f9 */
    private void m65243f9() {
        if (this.f46422k4.mo65026h4()) {
            if (this.f46422k4.mo65028jd() == 1) {
                int iMo65041qq = this.f46422k4.mo65041qq();
                this.f46429rv = iMo65041qq;
                this.f46424ks = iMo65041qq;
            } else {
                m65254s7();
            }
            if (this.f46432u4.m60116to()) {
                return;
            }
            this.f46432u4.m60112k4();
            this.f46430to.m60362k4(this.f46432u4.m60117x1());
            this.f46432u4 = null;
            this.f46426m9 = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g8 */
    public Object m65244g8() {
        return this.f46422k4.mo65042rv();
    }

    /* JADX INFO: renamed from: gi */
    private void m65245gi() {
        int iMo65041qq = this.f46422k4.mo65041qq();
        this.f46429rv = iMo65041qq;
        this.f46424ks = iMo65041qq;
        boolean z = false;
        if (this.f46422k4.mo65035kk()) {
            int i = 0;
            boolean z2 = false;
            do {
                String strMo65023fa = this.f46422k4.mo65023fa();
                String strMo65050up = this.f46422k4.mo65050up();
                C13924k4 c13924k4M65246h4 = m65246h4(i);
                c13924k4M65246h4.f46592k4 = strMo65023fa;
                c13924k4M65246h4.f46595x1 = strMo65050up;
                if (strMo65050up != this.f46436v4) {
                    c13924k4M65246h4.f46593kk = this.f46430to.m60356k4(strMo65023fa, strMo65050up, this.f46416dy, c13924k4M65246h4.f46594to);
                    if (!z2) {
                        z2 = c13924k4M65246h4.f46594to.ak_() == 2;
                    }
                }
                i++;
            } while (this.f46422k4.mo65047to());
            z = z2;
        }
        this.f46422k4.mo65020du();
        if (z) {
            this.f46437wl.m61903k4(2);
        }
        this.f46430to.m60359k4(this.f46420ix, true);
        this.f46424ks = this.f46420ix.size() + this.f46424ks;
    }

    /* JADX INFO: renamed from: h4 */
    private C13924k4 m65246h4(int i) {
        C13924k4[] c13924k4Arr = this.f46427ne;
        C13924k4 c13924k4 = c13924k4Arr[i];
        if (c13924k4 != null) {
            c13924k4.m65500k4();
            return c13924k4;
        }
        if (i >= c13924k4Arr.length - 1) {
            C13924k4[] c13924k4Arr2 = new C13924k4[c13924k4Arr.length * 2];
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c13924k4Arr), 0, AbstractC14092to.m67208k4((Object) c13924k4Arr2), 0, this.f46427ne.length);
            this.f46427ne = c13924k4Arr2;
        }
        C13924k4 c13924k42 = this.f46427ne[i];
        if (c13924k42 != null) {
            return c13924k42;
        }
        C13924k4 c13924k43 = new C13924k4();
        this.f46427ne[i] = c13924k43;
        return c13924k43;
    }

    /* JADX INFO: renamed from: kp */
    private void m65252kp() {
        this.f46435uz = this.f46430to.m60377x1(this.f46437wl);
        this.f46428qq = m65258vh();
        if (!this.f46437wl.mo61763x1()) {
            if (this.f46421jd) {
                this.f46411c5.mo65709to();
            }
        } else {
            int iMo65058x6 = this.f46422k4.mo65058x6();
            this.f46422k4 = m65259vj();
            this.f46433um.m65230k4(this.f46437wl.m61901dy().m60215g8().mo60490c5(this.f46435uz), this.f46428qq, iMo65058x6 + 1, 0, 0);
            this.f46433um.m65228c5();
            this.f46433um.m65229g8();
            this.f46418fa = true;
        }
    }

    /* JADX INFO: renamed from: s7 */
    private void m65254s7() {
        this.f46424ks = 0;
        this.f46429rv = 0;
        this.f46440x6 = -1;
        this.f46420ix.clear();
        this.f46443yj = null;
    }

    /* JADX INFO: renamed from: ss */
    private void m65255ss() {
        String str;
        String str2;
        String str3;
        String str4;
        String strMo65042rv = null;
        if (this.f46413ck && m65251kk(this.f46422k4.mo65023fa(), this.f46422k4.mo65050up()) && this.f46422k4.mo65058x6() > 0) {
            this.f46437wl.m61902jd();
            int iMo65041qq = this.f46422k4.mo65041qq();
            this.f46429rv = iMo65041qq;
            this.f46424ks = iMo65041qq;
            if (this.f46422k4.mo65048u4()) {
                this.f46426m9 = 4;
                return;
            }
            C12915bu c12915bu = new C12915bu(3, this.f46407ar, this.f46430to.m60371kk().m61319k4(this.f46407ar), this.f46419h4);
            this.f46432u4 = c12915bu;
            c12915bu.m60118x1(this.f46422k4, null);
            this.f46432u4.m60116to();
            this.f46426m9 = 5;
            return;
        }
        this.f46435uz = null;
        this.f46428qq = null;
        this.f46437wl.m61902jd();
        if (this.f46421jd) {
            this.f46411c5.mo65708kk();
        }
        if (this.f46422k4.mo65035kk()) {
            String strMo65042rv2 = null;
            String strMo65042rv3 = null;
            String strMo65042rv4 = null;
            do {
                String strMo65050up = this.f46422k4.mo65050up();
                String strMo65023fa = this.f46422k4.mo65023fa();
                if (C13851ai.m65152k4(strMo65050up, this.f46442yd)) {
                    if (C13851ai.m65152k4(strMo65023fa, this.f46414dq)) {
                        strMo65042rv = this.f46422k4.mo65042rv();
                    } else if (C13851ai.m65152k4(strMo65023fa, this.f46441xk)) {
                        strMo65042rv2 = this.f46422k4.mo65042rv();
                    } else if (C13851ai.m65152k4(strMo65023fa, this.f46408b3)) {
                        strMo65042rv4 = this.f46422k4.mo65042rv();
                    } else if (C13851ai.m65152k4(strMo65023fa, this.f46438wy)) {
                        strMo65042rv3 = this.f46422k4.mo65042rv();
                    }
                }
                if (this.f46421jd && C13851ai.m65152k4(this.f46422k4.mo65050up(), this.f46436v4)) {
                    this.f46411c5.mo65707k4(this.f46422k4.mo65060yj().length() == 0 ? C14113y2.f47374k4 : this.f46422k4.mo65023fa(), this.f46422k4.mo65042rv());
                }
            } while (this.f46422k4.mo65047to());
            this.f46422k4.mo65020du();
            str4 = strMo65042rv2;
            str3 = strMo65042rv;
            str2 = strMo65042rv3;
            str = strMo65042rv4;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        this.f46430to.m60370k4(this.f46422k4.mo65023fa(), this.f46422k4.mo65050up(), this.f46437wl, str, str2, str3, str4);
        m65245gi();
        this.f46430to.m60363k4(this.f46437wl);
        if (this.f46422k4.mo65048u4()) {
            m65252kp();
        }
        this.f46426m9 = 4;
    }

    /* JADX INFO: renamed from: sv */
    private C13329zn m65256sv() {
        return this.f46443yj.f46594to;
    }

    /* JADX INFO: renamed from: t6 */
    private void m65257t6() {
        while (this.f46422k4.mo65026h4()) {
            int iMo65028jd = this.f46422k4.mo65028jd();
            if (iMo65028jd == 3 || iMo65028jd == 4) {
                this.f46430to.m60361k4((AbstractC13074kt) new C13964qx(this));
            } else {
                switch (iMo65028jd) {
                    case 13:
                    case 14:
                        this.f46430to.m60379x1((AbstractC13074kt) new C13934m3(this));
                        break;
                    case 15:
                        this.f46435uz = this.f46430to.m60377x1(this.f46437wl);
                        this.f46428qq = m65258vh();
                        if (this.f46435uz == null) {
                            this.f46435uz = this;
                            return;
                        } else {
                            if (this.f46437wl.mo61763x1()) {
                                this.f46433um.m65234x1(this.f46437wl.m61901dy().m60215g8().mo60490c5(this.f46435uz), this.f46428qq);
                                return;
                            }
                            return;
                        }
                }
            }
        }
    }

    /* JADX INFO: renamed from: vh */
    private String m65258vh() {
        if (!this.f46437wl.mo61763x1()) {
            return this.f46430to.m60374m9();
        }
        C13021hu c13021huAn_ = this.f46437wl.an_();
        return c13021huAn_ != null ? c13021huAn_.m60719m9() != null ? c13021huAn_.m60719m9() : c13021huAn_.m60706jd() : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: vj */
    private C13876cz m65259vj() {
        C13876cz c13876cz = this.f46433um;
        if (c13876cz == null) {
            this.f46433um = new C13876cz(this.f46422k4, this.f46431ts, new C13909hc(this));
        } else {
            c13876cz.m65233x1(this.f46422k4);
        }
        this.f46431ts = (InterfaceC13896f9) C7019kk.m27452k4((Object) this.f46433um, InterfaceC13896f9.class);
        return this.f46433um;
    }

    /* JADX INFO: renamed from: wp */
    private void m65260wp() {
        if (this.f46418fa) {
            return;
        }
        int iMo65028jd = this.f46422k4.mo65028jd();
        if (iMo65028jd == 1) {
            m65255ss();
            return;
        }
        if (iMo65028jd == 10) {
            this.f46430to.m60365k4(this.f46422k4.mo65054wy());
            return;
        }
        if (iMo65028jd == 3 || iMo65028jd == 4) {
            this.f46430to.m60361k4((AbstractC13074kt) new C13904gj(this));
            return;
        }
        if (iMo65028jd == 5) {
            throw new InvalidOperationException();
        }
        switch (iMo65028jd) {
            case 13:
            case 14:
                this.f46430to.m60379x1((AbstractC13074kt) new C14031z0(this));
                return;
            case 15:
                m65252kp();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private C13924k4 m65261x1(String str, String str2) {
        for (int i = 0; i < this.f46429rv; i++) {
            C13924k4 c13924k4 = this.f46427ne[i];
            if (c13924k4 != null && C13851ai.m65152k4(str, c13924k4.f46592k4) && C13851ai.m65152k4(str2, c13924k4.f46595x1)) {
                this.f46440x6 = i;
                return c13924k4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: xw */
    private void m65262xw() {
        if (this.f46437wl.al_() == null && this.f46435uz != this && ((C13876cz) C7019kk.m27452k4((Object) this.f46422k4, C13876cz.class)) == null && this.f46437wl.m61900c5() && !this.f46437wl.aj_()) {
            this.f46422k4 = m65259vj();
            m65257t6();
            this.f46433um.m65229g8();
            this.f46418fa = true;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final boolean ag_() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final int ah_() {
        InterfaceC13896f9 interfaceC13896f9 = this.f46431ts;
        if (interfaceC13896f9 != null) {
            return interfaceC13896f9.ah_();
        }
        return 0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final int ai_() {
        InterfaceC13896f9 interfaceC13896f9 = this.f46431ts;
        if (interfaceC13896f9 != null) {
            return interfaceC13896f9.ai_();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public final boolean aj_() {
        int iMo65028jd = mo65028jd();
        if (iMo65028jd == 1 || iMo65028jd == 15) {
            return this.f46437wl.aj_();
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ak */
    public char mo65014ak() {
        return this.f46422k4.mo65014ak();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if (r0 != 15) goto L15;
     */
    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int ak_() {
        C13329zn c13329znM65256sv;
        int iMo65028jd = mo65028jd();
        if (iMo65028jd != 1) {
            if (iMo65028jd == 2) {
                if (this.f46443yj != null) {
                    c13329znM65256sv = m65256sv();
                    return c13329znM65256sv.ak_();
                }
            }
            return 0;
        }
        if (!this.f46422k4.mo65048u4() && this.f46437wl.ak_() == 1) {
            return 0;
        }
        c13329znM65256sv = this.f46437wl;
        return c13329znM65256sv.ak_();
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public final C13164q9 al_() {
        C13329zn c13329znM65256sv;
        int iMo65028jd = mo65028jd();
        if (iMo65028jd != 1) {
            if (iMo65028jd == 2) {
                if (this.f46443yj == null) {
                    return null;
                }
                c13329znM65256sv = m65256sv();
                return c13329znM65256sv.al_();
            }
            if (iMo65028jd != 15) {
                return null;
            }
        } else if (!this.f46422k4.mo65048u4()) {
            m65262xw();
        }
        c13329znM65256sv = this.f46437wl;
        return c13329znM65256sv.al_();
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public final C12943dd am_() {
        C13329zn c13329znM65256sv;
        int iMo65028jd = mo65028jd();
        if (iMo65028jd == 1) {
            c13329znM65256sv = this.f46437wl;
        } else if (iMo65028jd != 2) {
            if (iMo65028jd != 15) {
                return null;
            }
            c13329znM65256sv = this.f46437wl;
        } else {
            if (this.f46443yj == null) {
                return null;
            }
            c13329znM65256sv = m65256sv();
        }
        return c13329znM65256sv.am_();
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public final C13021hu an_() {
        if (mo65028jd() == 1 || mo65028jd() == 15) {
            return this.f46437wl.an_();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public final C13146p4 ao_() {
        if (mo65028jd() != 2 || this.f46443yj == null) {
            return null;
        }
        return m65256sv().ao_();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ar */
    public boolean mo65015ar() {
        return this.f46422k4.mo65015ar();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: b3 */
    public void mo65016b3() {
        throw new InvalidOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: bv */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo65208bv() {
        boolean z;
        mo65058x6();
        int iMo65028jd = mo65028jd();
        if (iMo65028jd != 1) {
            if (iMo65028jd == 2) {
                mo65020du();
                if (!this.f46422k4.mo65048u4()) {
                    z = ((this.f46437wl.m61900c5() || this.f46437wl.mo61763x1()) && C7019kk.m27469x1(this.f46422k4, C13876cz.class)) ? false : true;
                    this.f46422k4.mo65208bv();
                    this.f46426m9 = 6;
                    if (z) {
                        this.f46430to.m60373kk(this.f46437wl);
                    }
                }
            }
        } else if (!this.f46422k4.mo65048u4()) {
            z = ((this.f46437wl.m61900c5() || this.f46437wl.mo61763x1()) && C7019kk.m27469x1(this.f46422k4, C13876cz.class)) ? false : true;
            this.f46422k4.mo65208bv();
            this.f46426m9 = 6;
            if (z) {
            }
        }
        mo65026h4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ck */
    public String mo65019ck() {
        if (this.f46426m9 != -1) {
            return this.f46422k4.mo65019ck();
        }
        String strM60376to = this.f46430to.m60376to(this.f46434up.m66396x1());
        return (strM60376to == null || strM60376to.length() == 0) ? this.f46434up.m66381k4() : C14113y2.m67408k4(C14113y2.m67408k4(strM60376to, C18241k5.f55433h, this.f46434up.m66381k4()));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: du */
    public boolean mo65020du() {
        if (!this.f46422k4.mo65020du() && this.f46426m9 >= 0) {
            return false;
        }
        this.f46440x6 = -1;
        this.f46426m9 = 4;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: dy */
    public boolean mo65021dy() {
        if (this.f46426m9 == 7) {
            this.f46417e0.m65321k4();
            this.f46426m9 = this.f46410bz;
        }
        if (mo65028jd() != 2) {
            return false;
        }
        if (this.f46426m9 != -1) {
            return this.f46422k4.mo65021dy();
        }
        this.f46434up = m65263k4(this.f46434up.m66376du(), this.f46434up.m66394to() + 1);
        this.f46426m9 = -2;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: fa */
    public String mo65023fa() {
        return this.f46426m9 < 0 ? this.f46434up.m66381k4() : this.f46422k4.mo65023fa();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: jd */
    public int mo65028jd() {
        if (this.f46426m9 < 0) {
            return this.f46434up.m66393m9();
        }
        int iMo65028jd = this.f46422k4.mo65028jd();
        if (iMo65028jd != 13) {
            return iMo65028jd;
        }
        if (this.f46430to.m60352du() == 0 || this.f46430to.m60352du() == 3) {
            return 14;
        }
        return iMo65028jd;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public final IGenericDictionary<String, String> mo52690k4(int i) {
        InterfaceC13980t6 interfaceC13980t6 = this.f46439x1;
        return interfaceC13980t6 != null ? interfaceC13980t6.mo52690k4(i) : this.f46411c5.mo52690k4(i);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public String mo65034kk(int i) {
        if (this.f46424ks == 0) {
            return null;
        }
        int i2 = this.f46429rv;
        if (i < i2) {
            return this.f46422k4.mo65034kk(i);
        }
        return ((C14028yn) this.f46420ix.get_Item(i - i2)).m66376du();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ks */
    public boolean mo65038ks() {
        if (this.f46426m9 < 0) {
            return true;
        }
        return this.f46422k4.mo65038ks();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: m9 */
    public int mo65039m9() {
        if (this.f46426m9 == 1) {
            return 0;
        }
        return this.f46422k4.mo65039m9();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ne */
    public String mo65040ne() {
        return this.f46422k4.mo65040ne();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: qq */
    public int mo65041qq() {
        return this.f46424ks;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: rv */
    public String mo65042rv() {
        return this.f46426m9 < 0 ? this.f46434up.m66376du() : this.f46422k4.mo65042rv();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: to */
    public String mo65046to(String str) {
        C14028yn c14028ynM65248k4;
        String strMo65046to = this.f46422k4.mo65046to(str);
        return (strMo65046to != null || this.f46424ks <= 0 || (c14028ynM65248k4 = m65248k4(str, false)) == null) ? strMo65046to : c14028ynM65248k4.m66376du();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: u4 */
    public boolean mo65048u4() {
        return this.f46422k4.mo65048u4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: um */
    public void mo65049um() {
        this.f46422k4.mo65049um();
        this.f46426m9 = 8;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: up */
    public String mo65050up() {
        return this.f46426m9 < 0 ? this.f46434up.m66396x1() : this.f46422k4.mo65050up();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: uz */
    public int mo65051uz() {
        return this.f46422k4.mo65051uz();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: wl */
    public InterfaceC13298y4 mo65210wl() {
        return (InterfaceC13298y4) C7019kk.m27452k4((Object) this, InterfaceC13298y4.class);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x6 */
    public int mo65058x6() {
        return this.f46426m9 < 0 ? this.f46434up.m66394to() : this.f46422k4.mo65058x6();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: yd */
    public AbstractC13883dt mo65059yd() {
        return this.f46407ar;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: yj */
    public String mo65060yj() {
        return this.f46426m9 < 0 ? this.f46434up.m66390kk() : this.f46422k4.mo65060yj();
    }

    public C13880dk(AbstractC13912i5 abstractC13912i5, AbstractC13943n5 abstractC13943n5, C13906gx c13906gx, AbstractC13018hl abstractC13018hl) {
        this.f46432u4 = null;
        this.f46412c6 = C14022y4.m66318k4().Clone();
        this.f46422k4 = abstractC13912i5;
        this.f46439x1 = (InterfaceC13980t6) C7019kk.m27452k4((Object) abstractC13912i5, InterfaceC13980t6.class);
        this.f46431ts = (InterfaceC13896f9) C7019kk.m27452k4((Object) abstractC13912i5, InterfaceC13896f9.class);
        this.f46407ar = this.f46422k4.mo65059yd();
        if (this.f46439x1 == null) {
            this.f46411c5 = new C13950o3(this.f46407ar);
            this.f46421jd = true;
        }
        this.f46423kk = (InterfaceC13980t6) C7019kk.m27452k4((Object) this, InterfaceC13980t6.class);
        this.f46415du = abstractC13943n5;
        this.f46413ck = (c13906gx.m65411x6() & 1) != 0;
        m65242c5();
        m65250k4(c13906gx, abstractC13912i5, abstractC13018hl);
        this.f46419h4 = c13906gx.m65403u4();
    }

    /* JADX INFO: renamed from: m9 */
    private C13924k4 m65253m9(String str) {
        if (this.f46432u4 != null) {
            return null;
        }
        String[] strArr = {null};
        String[] strArr2 = {null};
        C13988u1.m66234x1(str, strArr, strArr2);
        String str2 = strArr[0];
        String str3 = strArr2[0];
        String strMo65266k4 = this.f46407ar.mo65266k4(str2);
        return m65261x1(this.f46407ar.mo65266k4(str3), strMo65266k4.length() == 0 ? C14113y2.f47374k4 : this.f46423kk.mo13292k4(strMo65266k4));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: h4 */
    public boolean mo65026h4() {
        switch (this.f46426m9) {
            case -2:
            case -1:
            case 3:
            case 4:
                m65254s7();
                if (this.f46432u4 != null) {
                    this.f46426m9 = 5;
                    m65243f9();
                    return true;
                }
                this.f46426m9 = 2;
                if (this.f46422k4.mo65026h4()) {
                    m65260wp();
                    return true;
                }
                this.f46430to.m60378x1();
                if (this.f46422k4.mo65015ar()) {
                    this.f46426m9 = 9;
                }
                return false;
            case 0:
            default:
                return false;
            case 1:
                this.f46426m9 = 2;
                if (this.f46422k4.mo65039m9() == 1) {
                    m65260wp();
                    return true;
                }
                if (this.f46422k4.mo65026h4()) {
                    m65260wp();
                    return true;
                }
                this.f46430to.m60378x1();
                if (this.f46422k4.mo65015ar()) {
                    this.f46426m9 = 9;
                }
                return false;
            case 2:
                if (this.f46422k4.mo65026h4()) {
                    m65260wp();
                    return true;
                }
                this.f46430to.m60378x1();
                if (this.f46422k4.mo65015ar()) {
                    this.f46426m9 = 9;
                }
                return false;
            case 5:
                m65243f9();
                return true;
            case 6:
                m65254s7();
                m65260wp();
                this.f46426m9 = 2;
                return true;
            case 7:
                this.f46426m9 = this.f46410bz;
                this.f46417e0.m65321k4();
                return mo65026h4();
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: k4 */
    public C13906gx mo65029k4() {
        C13906gx c13906gxMo65029k4 = this.f46422k4.mo65029k4();
        if (c13906gxMo65029k4 != null) {
            c13906gxMo65029k4 = c13906gxMo65029k4.m65378ix();
        }
        if (c13906gxMo65029k4 == null) {
            c13906gxMo65029k4 = new C13906gx();
        }
        c13906gxMo65029k4.m65387k4(this.f46430to.m60371kk());
        c13906gxMo65029k4.m65371du(4);
        c13906gxMo65029k4.m65376h4(this.f46430to.m60375to());
        c13906gxMo65029k4.m65397m9(true);
        return c13906gxMo65029k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public boolean mo65035kk() {
        if (this.f46422k4.mo65035kk()) {
            this.f46440x6 = 0;
            this.f46443yj = this.f46432u4 == null ? this.f46427ne[0] : null;
            this.f46426m9 = 3;
            return true;
        }
        if (this.f46420ix.size() <= 0) {
            return false;
        }
        C14028yn c14028yn = (C14028yn) this.f46420ix.get_Item(0);
        this.f46434up = c14028yn;
        this.f46443yj = c14028yn.m66378dy();
        this.f46440x6 = 0;
        this.f46426m9 = -1;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: to */
    public boolean mo65047to() {
        int i = this.f46440x6;
        int i2 = i + 1;
        int i3 = this.f46429rv;
        if (i2 < i3) {
            this.f46422k4.mo65047to();
            int i4 = this.f46440x6 + 1;
            this.f46440x6 = i4;
            this.f46443yj = this.f46432u4 == null ? this.f46427ne[i4] : null;
            this.f46426m9 = 3;
            return true;
        }
        if (i + 1 >= this.f46424ks) {
            return false;
        }
        int i5 = i + 1;
        this.f46440x6 = i5;
        C14028yn c14028yn = (C14028yn) this.f46420ix.get_Item(i5 - i3);
        this.f46434up = c14028yn;
        this.f46443yj = c14028yn.m66378dy();
        this.f46426m9 = -1;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: x1 */
    public final String mo52700x1(String str) {
        InterfaceC13980t6 interfaceC13980t6 = this.f46439x1;
        return interfaceC13980t6 != null ? interfaceC13980t6.mo52700x1(str) : this.f46411c5.mo52700x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final C14028yn m65263k4(String str, int i) {
        if (this.f46409bv == null) {
            this.f46409bv = new C14028yn(3);
        }
        this.f46409bv.m66383k4(i);
        this.f46409bv.m66395to(str);
        return this.f46409bv;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public boolean mo65036kk(String str) {
        C14028yn c14028ynM65248k4;
        if (this.f46422k4.mo65036kk(str)) {
            this.f46426m9 = 3;
            this.f46443yj = m65253m9(str);
            if (this.f46426m9 == 7) {
                this.f46417e0.m65321k4();
                this.f46426m9 = this.f46410bz;
            }
            return true;
        }
        if (this.f46424ks <= 0 || (c14028ynM65248k4 = m65248k4(str, true)) == null) {
            return false;
        }
        this.f46426m9 = -1;
        this.f46443yj = c14028ynM65248k4.m66378dy();
        this.f46434up = c14028ynM65248k4;
        if (this.f46426m9 == 7) {
            this.f46417e0.m65321k4();
            this.f46426m9 = this.f46410bz;
        }
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x1 */
    public void mo65055x1(int i) {
        int i2;
        if (i < 0 || i >= this.f46424ks) {
            throw new ArgumentOutOfRangeException(ContextChain.TAG_INFRA);
        }
        this.f46440x6 = i;
        int i3 = this.f46429rv;
        if (i < i3) {
            this.f46422k4.mo65055x1(i);
            this.f46443yj = this.f46432u4 == null ? this.f46427ne[i] : null;
            i2 = 3;
        } else {
            C14028yn c14028yn = (C14028yn) this.f46420ix.get_Item(i - i3);
            this.f46434up = c14028yn;
            this.f46443yj = c14028yn.m66378dy();
            i2 = -1;
        }
        this.f46426m9 = i2;
        if (this.f46426m9 == 7) {
            this.f46417e0.m65321k4();
            this.f46426m9 = this.f46410bz;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C14028yn m65247k4(String str, String str2, boolean z) {
        for (int i = 0; i < this.f46420ix.size(); i++) {
            C14028yn c14028yn = (C14028yn) this.f46420ix.get_Item(i);
            if (C13851ai.m65152k4(c14028yn.m66381k4(), str) && C13851ai.m65152k4(c14028yn.m66396x1(), str2)) {
                if (z) {
                    this.f46440x6 = this.f46422k4.mo65041qq() + i;
                }
                return c14028yn;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    private boolean m65251kk(String str, String str2) {
        return C13851ai.m65152k4(str2, this.f46425lr) && C13851ai.m65152k4(str, this.f46406ak);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x1 */
    public boolean mo65057x1() {
        if (this.f46426m9 == -1) {
            return true;
        }
        return this.f46422k4.mo65057x1();
    }

    /* JADX INFO: renamed from: k4 */
    private C14028yn m65248k4(String str, boolean z) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        C13988u1.m66234x1(str, strArr, strArr2);
        String str2 = strArr[0];
        String str3 = strArr2[0];
        String strMo65266k4 = this.f46407ar.mo65266k4(str2);
        return m65247k4(this.f46407ar.mo65266k4(str3), strMo65266k4.length() == 0 ? C14113y2.f47374k4 : this.f46423kk.mo13292k4(strMo65266k4), z);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5, com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public String mo13292k4(String str) {
        return this.f46423kk.mo13292k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65264k4(C13876cz c13876cz) {
        this.f46422k4 = c13876cz.m65231sv();
        this.f46431ts = c13876cz.m65232wp();
        this.f46418fa = false;
    }

    /* JADX INFO: renamed from: k4 */
    private void m65250k4(C13906gx c13906gx, AbstractC13912i5 abstractC13912i5, AbstractC13018hl abstractC13018hl) {
        C12962eb c12962eb = new C12962eb(this.f46407ar, c13906gx.m65398ne(), this.f46423kk, c13906gx.m65411x6());
        this.f46430to = c12962eb;
        c12962eb.m60366k4(this.f46415du);
        this.f46430to.m60367k4(C13850af.m65125qq(abstractC13912i5.mo65040ne()));
        this.f46430to.m60368k4((Object) this);
        this.f46430to.f43605x1.mo27432x1(c13906gx.m65403u4());
        this.f46430to.m60364k4(this.f46431ts);
        if (this.f46430to.m60351ck()) {
            this.f46430to.m60371kk().m61338up().m65401to(c13906gx.m65412yj());
        }
        this.f46430to.m60365k4(abstractC13912i5.mo65054wy());
        C12962eb c12962eb2 = this.f46430to;
        if (abstractC13018hl != null) {
            c12962eb2.m60360k4(abstractC13018hl);
        } else {
            c12962eb2.m60357k4();
        }
    }
}
