package com.aspose.slides;

import OooOoO.C20503OooO00o;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class w7g extends el1 {

    /* JADX INFO: renamed from: du */
    private oju f49767du;

    /* JADX INFO: renamed from: h4 */
    private IPortionFormat f49768h4;

    /* JADX INFO: renamed from: k4 */
    private final C14327q4 f49769k4;

    /* JADX INFO: renamed from: kk */
    private el1 f49770kk;

    /* JADX INFO: renamed from: to */
    private InterfaceC1182h2<z5t> f49771to;

    /* JADX INFO: renamed from: x1 */
    private final el1 f49772x1;

    public w7g(MathRadical mathRadical, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathRadical, interfaceC0851ce);
        C14327q4 c14327q42 = new C14327q4();
        this.f49769k4 = c14327q42;
        this.f49767du = new oju();
        c14327q4.f48237kk++;
        c14327q4.CloneTo(c14327q42);
        this.f49772x1 = m5579k4(mathRadical.getBase(), c14327q4.Clone());
        if (!mathRadical.getHideDegree()) {
            C14327q4 c14327q4Clone = c14327q4.Clone();
            c14327q4Clone.f48231du = (c14327q4.f48238m9 ? 0.9f : 0.64f) * c14327q4.f48231du;
            c14327q4Clone.f48234h4 = true;
            this.f49770kk = m5579k4(mathRadical.getDegree(), c14327q4Clone.Clone());
        }
        this.f49768h4 = mathRadical.f2796k4.m68977x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final MathRadical m72647k4() {
        return (MathRadical) this.f4820c5;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        float f = this.f49769k4.f48231du / 96.0f;
        nn2 nn2VarM69387k4 = mo4555du().m69387k4(mo4555du().f48223k4);
        h2y h2yVarClone = this.f49772x1.m5578h4().Clone();
        wsf wsfVarClone = h2yVarClone.f5390x1.Clone();
        float fM72912k4 = wsfVarClone.m72912k4() + nn2VarM69387k4.m68116wl();
        if (!mo4555du().m69390x1() && (nn2VarM69387k4.m68116wl() / 2.0f) + wsfVarClone.m72912k4() > nn2VarM69387k4.m63560k4()) {
            fM72912k4 += nn2VarM69387k4.m68116wl() * 1.7f;
        }
        if (this.f49769k4.f48239to > 0) {
            fM72912k4 = wsfVarClone.m72912k4() + nn2VarM69387k4.m68116wl();
        }
        if (!mo4555du().f48222h4.m1999k4() && this.f49769k4.f48239to > 0 && m72645k4(this.f4826m9)) {
            fM72912k4 = wsfVarClone.m72912k4() + (nn2VarM69387k4.m68116wl() * 2.1f);
        }
        if (mo4555du().m69390x1() && this.f49769k4.f48239to == 0) {
            fM72912k4 = wsfVarClone.m72912k4() + (nn2VarM69387k4.m68116wl() * 0.98f);
        }
        this.f49771to = mo4555du().m69386k4().mo64921k4(this.f49769k4.f48231du, fM72912k4, h2yVarClone.f5389k4);
        new oju();
        new h2y();
        z5t z5tVarClone = this.f49771to.mo6969k4().Clone();
        float fM68116wl = z5tVarClone.f50492kk + nn2VarM69387k4.m68116wl();
        float fOooO0O0 = C20503OooO00o.OooO0O0(z5tVarClone.f50493x1 - fM68116wl, wsfVarClone.m72912k4(), 2.0f, fM68116wl);
        oju ojuVar2 = new oju(z5tVarClone.f50491k4 - h2yVarClone.f5389k4, fOooO0O0);
        oju.f47834kk.CloneTo(this.f49767du);
        float f2 = wsfVarClone.f49849k4 + fOooO0O0;
        h2y h2yVar = new h2y();
        h2yVar.f5390x1 = new wsf(f2, C14116yg.m67481k4(z5tVarClone.f50493x1, fOooO0O0 + wsfVarClone.m72912k4()) - f2);
        h2yVar.f5389k4 = ojuVar2.f47836k4 + h2yVarClone.f5389k4;
        if (!m72646k4(this.f4821ck) && !C7019kk.m27469x1(this.f4821ck, C14431s3.class)) {
            ojuVar2.f47837x1 += nn2VarM69387k4.m68115uz();
            this.f49767du.f47837x1 += nn2VarM69387k4.m68115uz();
            h2yVar.f5390x1.f49849k4 += nn2VarM69387k4.m68115uz();
            h2yVar.f5390x1.f49850x1 -= nn2VarM69387k4.m68115uz();
        }
        if (m72647k4().getHideDegree()) {
            this.f49772x1.m5584x1(ojuVar2.f47836k4, ojuVar2.f47837x1);
            return h2yVar;
        }
        h2y h2yVarClone2 = this.f49770kk.m5578h4().Clone();
        oju ojuVar3 = new oju((26.0f * f) - h2yVarClone2.f5389k4, (this.f49771to.mo6969k4().f50493x1 * 0.4f) - h2yVarClone2.f5390x1.m72912k4());
        float[] fArr = {0.0f};
        wsf wsfVarClone2 = wsf.m72909k4(h2yVar.f5390x1.Clone(), h2yVarClone2.f5390x1.m72912k4(), ojuVar3.f47837x1, fArr).Clone();
        float f3 = fArr[0];
        float f4 = ojuVar3.f47836k4;
        float f5 = (f * 7.0f) + (f4 < 0.0f ? -f4 : 0.0f);
        if (!m72646k4(this.f4821ck)) {
            ojuVar3.f47837x1 += nn2VarM69387k4.m68115uz();
        }
        this.f49770kk.m5584x1(ojuVar3.f47836k4 + f5, ojuVar3.f47837x1 + f3);
        this.f49772x1.m5584x1(ojuVar2.f47836k4 + f5, ojuVar2.f47837x1 + f3);
        oju ojuVar4 = this.f49767du;
        ojuVar4.f47837x1 += f3;
        ojuVar4.f47836k4 += f5;
        h2y h2yVar2 = new h2y();
        wsfVarClone2.CloneTo(h2yVar2.f5390x1);
        h2yVar2.f5389k4 = h2yVar.f5389k4 + f5;
        return h2yVar2;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public void mo3976k4(yvz yvzVar) {
        pzd pzdVar = new pzd(yvzVar.f50411k4);
        try {
            AbstractC14897zn abstractC14897zn = yvzVar.f50411k4;
            oju ojuVar = this.f49767du;
            abstractC14897zn.m74612k4(ojuVar.f47836k4, ojuVar.f47837x1);
            this.f49771to.mo7635k4(yvzVar.f50411k4, mo4555du().f48227x1.invoke((PortionFormat) this.f49768h4));
            pzdVar.dispose();
            super.mo3976k4(yvzVar.Clone());
        } catch (Throwable th) {
            pzdVar.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m72645k4(ReadOnlyCollection<el1> readOnlyCollection) {
        el1 next;
        IGenericEnumerator<el1> it = readOnlyCollection.iterator();
        do {
            try {
                if (!it.hasNext()) {
                    if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        return false;
                    }
                    it.dispose();
                    return false;
                }
                next = it.next();
                if (C7019kk.m27469x1(next, t8a.class) && m72645k4(next.f4826m9)) {
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        } while (!C7019kk.m27469x1(next, w7g.class));
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m72646k4(el1 el1Var) {
        while (el1Var != null) {
            if (C7019kk.m27469x1(el1Var, w7g.class)) {
                return true;
            }
            el1Var = el1Var.f4821ck;
        }
        return false;
    }
}
