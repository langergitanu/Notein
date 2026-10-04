package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p278mq.InterfaceC6407to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7191up;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.C9476to;
import com.aspose.slides.internal.p341po.InterfaceC9473k4;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p506xo.AbstractC12588to;
import com.aspose.slides.internal.p506xo.C12587m9;
import com.aspose.slides.internal.p506xo.C12591yj;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.ai */
/* JADX INFO: loaded from: classes.dex */
public class C3915ai implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    protected final InterfaceC9477x1 f10644k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC9473k4 f10645kk;

    /* JADX INFO: renamed from: x1 */
    protected final InterfaceC6407to f10646x1;

    public C3915ai(InterfaceC9477x1 interfaceC9477x1, InterfaceC9473k4 interfaceC9473k4, InterfaceC6407to interfaceC6407to) {
        this.f10644k4 = interfaceC9477x1;
        this.f10645kk = interfaceC9473k4;
        this.f10646x1 = interfaceC6407to;
    }

    /* JADX INFO: renamed from: k4 */
    private float m15625k4(C11913yj c11913yj, float f) {
        return f * C9476to.m46652k4(this.f10646x1.mo26289x1()) * C9476to.m46652k4(c11913yj);
    }

    /* JADX INFO: renamed from: k4 */
    private float m15626k4(C11913yj c11913yj, float f, float f2) {
        return f * f2 * C9476to.m46657x1(c11913yj);
    }

    /* JADX INFO: renamed from: k4 */
    private float m15627k4(C11913yj c11913yj, C11913yj c11913yj2) {
        return C14116yg.m67480k4(c11913yj2.m55783to() - c11913yj.m55783to());
    }

    /* JADX INFO: renamed from: k4 */
    private List<C3924ck> m15628k4(C9470du c9470du, AbstractC12588to abstractC12588to, byte[] bArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        int i;
        int i2;
        C11913yj c11913yj;
        int i3;
        List<C3924ck> list;
        AbstractC12588to abstractC12588to2 = abstractC12588to;
        List<C3924ck> list2 = new List<>();
        C11913yj c11913yjM46565k4 = c9470du.m46565k4();
        int i4 = 0;
        float f9 = 0.0f;
        while (i4 < bArr.length) {
            String strMo58718kk = abstractC12588to2.mo58718kk(bArr, i4, 1);
            if ((strMo58718kk == null || "".equals(strMo58718kk)) && i4 + 1 < bArr.length) {
                i = 2;
                strMo58718kk = abstractC12588to2.mo58718kk(bArr, i4, 2);
            } else {
                i = 1;
            }
            if ("\u0000".equals(strMo58718kk)) {
                list = list2;
                c11913yj = c11913yjM46565k4;
                i2 = i4;
                i3 = i;
            } else {
                float fM46652k4 = C9476to.m46652k4(c11913yjM46565k4) * f8 * f4 * f5 * C9476to.m46652k4(this.f10646x1.mo26289x1());
                float fMo58717k4 = abstractC12588to2.mo58717k4(bArr, i4, i);
                if (fMo58717k4 == 0.0f) {
                    fMo58717k4 = abstractC12588to2.mo58725x1();
                }
                float f10 = fMo58717k4 * f;
                float fM67481k4 = C14116yg.m67481k4(f9, abstractC12588to2.mo58722x1(bArr, i4, i) * f2);
                float f11 = ((bArr[i4] & 255) == 32 && i == 1) ? f3 + 0.0f : 0.0f;
                C11913yj c11913yjM55760h4 = this.f10646x1.mo26289x1().m55760h4();
                c11913yjM55760h4.m55769k4(c11913yjM46565k4, 1);
                C11913yj c11913yj2 = new C11913yj(f4 * f5, 0.0f, 0.0f, f4, 0.0f, f6);
                C11913yj c11913yjM55760h42 = c11913yj2.m55760h4();
                c11913yjM55760h42.m55769k4(c11913yjM55760h4, 1);
                float f12 = f10 * f4;
                C11913yj c11913yj3 = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, f12 * f5, 0.0f);
                i2 = i4;
                C11913yj c11913yjM55760h43 = c11913yj2.m55760h4();
                c11913yjM55760h43.m55769k4(c11913yj3, 1);
                c11913yjM55760h43.m55769k4(c11913yjM55760h4, 1);
                m15629k4((f12 + f7 + f11) * f5, 0.0f);
                c11913yj = c11913yjM46565k4;
                i3 = i;
                list = list2;
                list.addItem(new C3924ck(c11913yjM55760h42.m55783to(), this.f10645kk.mo46644k4() - c11913yjM55760h42.m55757du(), m15627k4(c11913yjM55760h42, c11913yjM55760h43), m15626k4(c11913yjM55760h4, fM67481k4, f4), strMo58718kk, abstractC12588to2, m15625k4(c11913yjM46565k4, f4), c9470du.m46552b3().Clone(), fM46652k4));
                f9 = fM67481k4;
            }
            i4 = i2 + i3;
            abstractC12588to2 = abstractC12588to;
            list2 = list;
            c11913yjM46565k4 = c11913yj;
        }
        return list2;
    }

    /* JADX INFO: renamed from: k4 */
    private void m15629k4(float f, float f2) {
        C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, f, f2);
        c11913yj.m55769k4(this.f10646x1.mo26289x1(), 1);
        this.f10646x1.mo26285k4(c11913yj);
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list.size() >= 1 && C7019kk.m27469x1(list.get_Item(0), C7191up.class)) {
            m15631k4(((C7191up) C7019kk.m27452k4((Object) list.get_Item(0), C7191up.class)).m27846k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15631k4(byte[] bArr) {
        float fM46653k4;
        float f;
        float f2;
        float fMo58725x1;
        C9470du c9470duMo46638k4 = this.f10644k4.mo46638k4();
        float fM46624k4 = c9470duMo46638k4.m46554c5().m46624k4();
        float fM46634x1 = c9470duMo46638k4.m46554c5().m46634x1();
        float fM46629kk = c9470duMo46638k4.m46554c5().m46629kk();
        float fM46632to = c9470duMo46638k4.m46554c5().m46632to();
        float fM46619du = c9470duMo46638k4.m46554c5().m46619du();
        AbstractC12588to abstractC12588toM46622h4 = c9470duMo46638k4.m46554c5().m46622h4();
        if (abstractC12588toM46622h4 == null) {
            abstractC12588toM46622h4 = C12587m9.m58746k4();
        }
        AbstractC12588to abstractC12588to = abstractC12588toM46622h4;
        if (C7019kk.m27469x1(abstractC12588to, C12591yj.class)) {
            C11913yj c11913yjM58771rv = abstractC12588to.m58771rv();
            float fM46653k42 = C9476to.m46653k4(c11913yjM58771rv, 0, 0);
            float fM46653k43 = C9476to.m46653k4(c11913yjM58771rv, 1, 1);
            fM46653k4 = C9476to.m46653k4(c11913yjM58771rv, 0, 0);
            f2 = fM46653k43;
            f = fM46653k42;
        } else {
            fM46653k4 = 0.001f;
            f = 0.001f;
            f2 = 0.001f;
        }
        try {
            fMo58725x1 = abstractC12588to.mo58719ne() * fM46653k4;
        } catch (RuntimeException unused) {
            fMo58725x1 = 0.0f;
        }
        if (fMo58725x1 == 0.0f) {
            fMo58725x1 = abstractC12588to.mo58725x1() * fM46653k4 * 0.8f;
        }
        if (fMo58725x1 == 0.0f) {
            fMo58725x1 = 1.0f;
        }
        List.Enumerator<C3924ck> it = m15628k4(c9470duMo46638k4, abstractC12588to, bArr, f, f2, fM46632to, fM46624k4, fM46634x1, fM46629kk, fM46619du, fMo58725x1).iterator();
        while (it.hasNext()) {
            try {
                this.f10646x1.mo26284k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
