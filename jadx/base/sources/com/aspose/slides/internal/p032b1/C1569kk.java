package com.aspose.slides.internal.p032b1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.OooOo00;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5532ak;
import com.aspose.slides.internal.p213jw.C5545k4;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p231kk.C5791k4;
import com.aspose.slides.internal.p231kk.InterfaceC5790jd;
import com.aspose.slides.internal.p231kk.InterfaceC5805u4;
import com.aspose.slides.internal.p231kk.InterfaceC5807up;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.internal.p237ks.C5909to;
import com.aspose.slides.internal.p270m9.InterfaceC6346qq;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p447up.C11539rv;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.b1.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1569kk extends C12804k4 implements InterfaceC5808uz {

    /* JADX INFO: renamed from: c5 */
    private String f6073c5;

    /* JADX INFO: renamed from: ck */
    private C5909to f6074ck;

    /* JADX INFO: renamed from: du */
    private InterfaceC5807up f6075du;

    /* JADX INFO: renamed from: dy */
    private Dictionary<String, C11539rv> f6076dy;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC5810wl f6077h4;

    /* JADX INFO: renamed from: jd */
    private C5791k4 f6078jd;

    /* JADX INFO: renamed from: kk */
    private InterfaceC6346qq f6079kk;

    /* JADX INFO: renamed from: m9 */
    private InterfaceC5810wl f6080m9;

    /* JADX INFO: renamed from: to */
    private boolean f6081to;

    /* JADX INFO: renamed from: x1 */
    public String f6082x1;

    public C1569kk(C5565yj c5565yj, C5552rv c5552rv) {
        this(c5565yj, c5552rv, true);
        this.f6081to = true;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5808uz
    /* JADX INFO: renamed from: B_ */
    public final InterfaceC5810wl mo8438B_() {
        if (this.f6077h4 == null) {
            this.f6077h4 = m8447vj().mo25994k4((InterfaceC5808uz) this);
        }
        return this.f6077h4;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5808uz
    /* JADX INFO: renamed from: k4 */
    public final C11539rv mo8439k4(String str) {
        String strM67371jd = C14113y2.m67411k4(str) ? this.f6073c5 : C14113y2.m67371jd(str);
        if (this.f6076dy.containsKey(strM67371jd)) {
            return this.f6076dy.get_Item(strM67371jd);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5812wy
    /* JADX INFO: renamed from: kk */
    public final InterfaceC5810wl mo8443kk() {
        InterfaceC5810wl interfaceC5810wlMo26008x1;
        if (this.f6080m9 == null) {
            if (mo22698c5("style")) {
                String strMo22721to = mo22721to("style");
                if (strMo22721to == null) {
                    strMo22721to = C14113y2.f47374k4;
                }
                if (C14113y2.m67429to(strMo22721to, '&') != -1) {
                    strMo22721to = C14113y2.m67401k4(strMo22721to, "&quot;", "\"");
                }
                interfaceC5810wlMo26008x1 = m8447vj().mo26008x1(strMo22721to, this);
            } else {
                interfaceC5810wlMo26008x1 = m8447vj().mo26008x1(C14113y2.f47374k4, this);
            }
            this.f6080m9 = interfaceC5810wlMo26008x1;
        }
        return this.f6080m9;
    }

    /* JADX INFO: renamed from: t6 */
    public final C5909to m8445t6() {
        C5909to c5909to = this.f6074ck;
        if (c5909to != null) {
            return c5909to;
        }
        C5909to c5909toM23803k4 = C5909to.m23803k4(this);
        this.f6074ck = c5909toM23803k4;
        return c5909toM23803k4;
    }

    /* JADX INFO: renamed from: vh */
    public final InterfaceC5790jd m8446vh() {
        if (this.f6078jd == null) {
            this.f6078jd = new C5791k4(mo8438B_());
        }
        return this.f6078jd;
    }

    /* JADX INFO: renamed from: vj */
    public final InterfaceC6346qq m8447vj() {
        if (this.f6079kk == null) {
            this.f6079kk = ((InterfaceC5805u4) mo22660v4()).mo20431k4();
        }
        return this.f6079kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m8448x1(IGenericEnumerable<InterfaceC12777qq> iGenericEnumerable) {
        IGenericEnumerator<InterfaceC12777qq> it = iGenericEnumerable.iterator();
        int i = -1;
        while (it.hasNext() && it.next() != null) {
            i++;
            if (it.next().equals(this)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: xw */
    public final C1569kk m8452xw() {
        return (C1569kk) C7019kk.m27452k4((Object) mo22646kp(), C1569kk.class);
    }

    public C1569kk(C5565yj c5565yj, C5552rv c5552rv, boolean z) {
        super(c5565yj, c5552rv);
        this.f6082x1 = null;
        this.f6076dy = new Dictionary<>();
        this.f6073c5 = "DEFAULT_STYLE";
        this.f6074ck = null;
        this.f6081to = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final <T> T m8440k4(Class<T> cls) {
        for (C1569kk c1569kkM8452xw = m8452xw(); c1569kkM8452xw != null; c1569kkM8452xw = c1569kkM8452xw.m8452xw()) {
            T t = (T) C7019kk.m27452k4((Object) c1569kkM8452xw, (Class) cls);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final void m8444kk(String str, boolean z) {
        if (z && !m22704h4().mo22857k4(str)) {
            m22704h4().m22854k4((C5545k4) C7019kk.m27452k4((Object) mo22660v4().mo22772c5(str), C5545k4.class));
        } else {
            if (z || !m22704h4().mo22857k4(str)) {
                return;
            }
            m22704h4().m22859kk(str);
        }
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5808uz
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC5807up mo8449x1() {
        if (this.f6075du == null) {
            this.f6075du = m8447vj().mo26007x1(this);
        }
        return this.f6075du;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        if (m8445t6() == null || OooOo00.OooO0O0(this) == 21) {
            return;
        }
        if (this.f6081to) {
            interfaceC1566du.mo4659m9(this);
        } else {
            interfaceC1566du.mo8373k4(this);
        }
        m8451x1(interfaceC1566du);
        if (this.f6081to) {
            interfaceC1566du.mo4647dy(this);
        } else {
            interfaceC1566du.mo8414x1(this);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final <T> T m8450x1(Class<T> cls) {
        for (InterfaceC12769ix interfaceC12769ixM22725x6 = m22725x6(); interfaceC12769ixM22725x6 != null; interfaceC12769ixM22725x6 = interfaceC12769ixM22725x6.mo22195u4()) {
            T t = (T) C7019kk.m27452k4((Object) interfaceC12769ixM22725x6, (Class) cls);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8451x1(InterfaceC1566du interfaceC1566du) {
        if ((OooOo00.OooO0O0(this) == 6 || OooOo00.OooO0O0(this) == 7) && m22725x6() != null) {
            switch (OooOo00.OooO0O0((C1569kk) m22725x6())) {
            }
            return;
        }
        for (AbstractC5535bv abstractC5535bvMo22653ss = mo22653ss(); abstractC5535bvMo22653ss != null; abstractC5535bvMo22653ss = abstractC5535bvMo22653ss.mo22631g8()) {
            C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) abstractC5535bvMo22653ss, C1569kk.class);
            if (c1569kk != null) {
                c1569kk.mo8441k4(interfaceC1566du);
            } else {
                C5532ak c5532ak = (C5532ak) C7019kk.m27452k4((Object) abstractC5535bvMo22653ss, C5532ak.class);
                if (c5532ak != null) {
                    interfaceC1566du.mo4656k4(c5532ak);
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5808uz
    /* JADX INFO: renamed from: k4 */
    public final void mo8442k4(String str, C11539rv c11539rv) {
        String strM67371jd = C14113y2.m67411k4(str) ? this.f6073c5 : C14113y2.m67371jd(str);
        if (this.f6076dy.containsKey(strM67371jd)) {
            this.f6076dy.set_Item(strM67371jd, c11539rv);
        } else {
            this.f6076dy.addItem(strM67371jd, c11539rv);
        }
    }
}
