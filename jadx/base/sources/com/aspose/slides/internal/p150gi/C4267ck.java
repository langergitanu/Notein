package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p393s7.AbstractC10164x6;
import com.aspose.slides.internal.p393s7.C10161to;
import com.aspose.slides.internal.p393s7.InterfaceC10158ks;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.ck */
/* JADX INFO: loaded from: classes.dex */
public class C4267ck {

    /* JADX INFO: renamed from: du */
    public C4295to f11634du;

    /* JADX INFO: renamed from: dy */
    private int f11635dy = 0;

    /* JADX INFO: renamed from: h4 */
    public C4293sv f11636h4;

    /* JADX INFO: renamed from: k4 */
    public C4304vj f11637k4;

    /* JADX INFO: renamed from: kk */
    public C4304vj f11638kk;

    /* JADX INFO: renamed from: m9 */
    public C4293sv f11639m9;

    /* JADX INFO: renamed from: to */
    public C4288qq f11640to;

    /* JADX INFO: renamed from: x1 */
    public C4304vj f11641x1;

    private C4267ck(C4304vj c4304vj, C4304vj c4304vj2, C4304vj c4304vj3, C4288qq c4288qq, C4295to c4295to, C4293sv c4293sv, C4293sv c4293sv2) {
        this.f11637k4 = c4304vj;
        this.f11641x1 = c4304vj2;
        this.f11638kk = c4304vj3;
        this.f11640to = c4288qq;
        this.f11634du = c4295to;
        this.f11636h4 = c4293sv;
        this.f11639m9 = c4293sv2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        C4267ck c4267ck = (C4267ck) C7019kk.m27452k4(obj, C4267ck.class);
        return c4267ck != null && c4267ck.f11637k4 == this.f11637k4 && c4267ck.f11641x1 == this.f11641x1 && c4267ck.f11638kk == this.f11638kk && c4267ck.f11640to == this.f11640to && c4267ck.f11634du == this.f11634du && c4267ck.f11636h4 == this.f11636h4 && c4267ck.f11639m9 == this.f11639m9;
    }

    public int hashCode() {
        if (this.f11635dy == 0) {
            C4304vj c4304vj = this.f11637k4;
            int iHashCode = (629 + (c4304vj == null ? 0 : c4304vj.hashCode())) * 37;
            C4304vj c4304vj2 = this.f11638kk;
            int iHashCode2 = (iHashCode + (c4304vj2 == null ? 0 : c4304vj2.hashCode())) * 37;
            C4304vj c4304vj3 = this.f11641x1;
            int iHashCode3 = (iHashCode2 + (c4304vj3 == null ? 0 : c4304vj3.hashCode())) * 37;
            C4288qq c4288qq = this.f11640to;
            int iHashCode4 = (iHashCode3 + (c4288qq == null ? 0 : c4288qq.hashCode())) * 37;
            C4295to c4295to = this.f11634du;
            int iHashCode5 = (iHashCode4 + (c4295to == null ? 0 : c4295to.hashCode())) * 37;
            C4293sv c4293sv = this.f11636h4;
            int iHashCode6 = (iHashCode5 + (c4293sv == null ? 0 : c4293sv.hashCode())) * 37;
            C4293sv c4293sv2 = this.f11639m9;
            this.f11635dy = iHashCode6 + (c4293sv2 != null ? c4293sv2.hashCode() : 0);
        }
        return this.f11635dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final char m17193k4(C10161to c10161to) {
        char cMo17252h_ = this.f11634du.mo17252h_();
        if (c10161to.m49978k4(cMo17252h_)) {
            return cMo17252h_;
        }
        if (c10161to.m49978k4('-')) {
            return '-';
        }
        boolean zM49978k4 = c10161to.m49978k4((char) 8722);
        InterfaceC10158ks interfaceC10158ksM49982to = c10161to.m49982to();
        if (!zM49978k4) {
            if (C7019kk.m27469x1(interfaceC10158ksM49982to, AbstractC10164x6.class)) {
                C14113y2.m67363du(((AbstractC10164x6) interfaceC10158ksM49982to).mo15568k4(), "ZapfDingbatsEncoding");
            }
            return ControlChar.SPACE_CHAR;
        }
        AbstractC10164x6 abstractC10164x6 = (AbstractC10164x6) C7019kk.m27452k4((Object) interfaceC10158ksM49982to, AbstractC10164x6.class);
        if (interfaceC10158ksM49982to != null) {
            C14113y2.m67363du(abstractC10164x6.mo15568k4(), "SymbolEncoding");
        }
        return (char) 8722;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m17194x1(C10161to c10161to) {
        return c10161to.m49984x1(m17193k4(c10161to));
    }

    /* JADX INFO: renamed from: k4 */
    public static C4267ck m17192k4(AbstractC3533um abstractC3533um) {
        return new C4267ck((C4304vj) abstractC3533um.m14402to(134), (C4304vj) abstractC3533um.m14402to(81), (C4304vj) abstractC3533um.m14402to(218), (C4288qq) abstractC3533um.m14402to(116), (C4295to) abstractC3533um.m14402to(117), (C4293sv) abstractC3533um.m14402to(120), (C4293sv) abstractC3533um.m14402to(121));
    }
}
