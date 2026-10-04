package com.aspose.slides.internal.p099e3;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.UriFormatException;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.InterfaceC3186k4;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3795x1;
import com.aspose.slides.internal.p115eq.InterfaceC3793to;
import com.aspose.slides.internal.p231kk.C5801ss;
import com.aspose.slides.internal.p231kk.C5811wp;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10312kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.e3.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3553kk extends C3182du implements InterfaceC3186k4 {

    /* JADX INFO: renamed from: dy */
    public byte[] f9884dy = null;

    public C3553kk() {
        this.f9456h4 = "image";
    }

    /* JADX INFO: renamed from: ak */
    public final C10307du m14443ak() {
        return C10307du.m50262k4(this.f9461x1.get_Item("width"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: b3 */
    public final C10307du m14444b3() {
        return C10307du.m50262k4(this.f9461x1.get_Item("x"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: c6 */
    public final boolean m14445c6() {
        try {
            if (C14113y2.m67411k4(m14456xk())) {
                return false;
            }
            return ".svg".equals(C3141rv.m13397du(C14113y2.m67368h4(m14456xk())));
        } catch (ArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: dq */
    public final C10307du m14446dq() {
        return C10307du.m50262k4(this.f9461x1.get_Item("height"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: du */
    public final void m14447du(C10307du c10307du) {
        this.f9461x1.set_Item("height", c10307du.toString());
    }

    /* JADX INFO: renamed from: jd */
    public final void m14448jd(String str) {
        this.f9461x1.set_Item("xlink:href", str);
    }

    @Override // com.aspose.slides.internal.p087dm.InterfaceC3186k4
    /* JADX INFO: renamed from: k4 */
    public final C12007ix mo13679k4(C3786fa c3786fa, C12015qq c12015qq) {
        return new C12007ix(c3786fa.m15125k4(m14444b3(), "x", this, c12015qq.Clone()), c3786fa.m15125k4(m14454wy(), "y", this, c12015qq.Clone()), c3786fa.m15125k4(m14443ak(), "width", this, c12015qq.Clone()), c3786fa.m15125k4(m14446dq(), "height", this, c12015qq.Clone()));
    }

    /* JADX INFO: renamed from: kk */
    public final void m14451kk(C10307du c10307du) {
        this.f9461x1.set_Item("y", c10307du.toString());
    }

    /* JADX INFO: renamed from: to */
    public final void m14452to(C10307du c10307du) {
        this.f9461x1.set_Item("width", c10307du.toString());
    }

    /* JADX INFO: renamed from: ts */
    public final C10312kk m14453ts() {
        return C10312kk.m50279k4(this.f9461x1.get_Item("preserveAspectRatio"));
    }

    /* JADX INFO: renamed from: wy */
    public final C10307du m14454wy() {
        return C10307du.m50262k4(this.f9461x1.get_Item("y"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14455x1(C10307du c10307du) {
        this.f9461x1.set_Item("x", c10307du.toString());
    }

    /* JADX INFO: renamed from: xk */
    public final String m14456xk() {
        return this.f9461x1.m13692to("xlink:href");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14449k4(C10312kk c10312kk) {
        this.f9461x1.set_Item("preserveAspectRatio", c10312kk.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m14450k4(InterfaceC3793to interfaceC3793to) {
        C14062gk c14062gk;
        C5811wp c5811wp;
        C5801ss c5801ssMo14413k4;
        byte[] bArr = this.f9884dy;
        if (bArr != null) {
            return bArr;
        }
        String strM14456xk = m14456xk();
        if (strM14456xk == null) {
            strM14456xk = this.f9461x1.m13692to("href");
        }
        int iM67364dy = strM14456xk != null ? C14113y2.m67364dy(strM14456xk, "base64,") : 0;
        if (iM67364dy > 0 && C14113y2.m67448x1(strM14456xk, "data:")) {
            byte[] bArrM66934jd = C14080ne.m66934jd(C14113y2.m67422kk(strM14456xk, iM67364dy + 7));
            this.f9884dy = bArrM66934jd;
            return bArrM66934jd;
        }
        try {
            c14062gk = new C14062gk(strM14456xk);
        } catch (UriFormatException unused) {
            c14062gk = null;
        }
        if (c14062gk == null || !Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(c14062gk.m66689ks())) {
            if (c14062gk != null && c14062gk.m66683ix()) {
                c5811wp = new C5811wp(strM14456xk);
            } else {
                if (c14062gk == null && iM67364dy > 0) {
                    byte[] bArrM66934jd2 = C14080ne.m66934jd(C14113y2.m67422kk(strM14456xk, iM67364dy + 7));
                    this.f9884dy = bArrM66934jd2;
                    return bArrM66934jd2;
                }
                c5811wp = new C5811wp(C14113y2.m67408k4(m13654k4(), strM14456xk));
            }
            c5801ssMo14413k4 = interfaceC3793to.mo14413k4(this, c5811wp);
        } else {
            c5801ssMo14413k4 = new C3795x1().mo14413k4(this, new C5811wp(strM14456xk));
        }
        byte[] bArrM23692k4 = c5801ssMo14413k4 != null ? c5801ssMo14413k4.m23692k4() : null;
        this.f9884dy = bArrM23692k4;
        return bArrM23692k4;
    }
}
