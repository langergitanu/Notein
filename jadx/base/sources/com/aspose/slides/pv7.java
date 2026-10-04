package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class pv7 {

    /* JADX INFO: renamed from: h4 */
    private fqc f48164h4;

    /* JADX INFO: renamed from: k4 */
    final el1[] f48165k4;

    /* JADX INFO: renamed from: kk */
    public final MathParagraph f48166kk;

    /* JADX INFO: renamed from: x1 */
    public final q1h f48169x1;

    /* JADX INFO: renamed from: du */
    private oju f48163du = new oju();

    /* JADX INFO: renamed from: to */
    C14327q4 f48168to = new C14327q4();

    /* JADX INFO: renamed from: m9 */
    private h2y f48167m9 = new h2y();

    public pv7(MathParagraph mathParagraph, fqc fqcVar, q1h q1hVar, C14327q4 c14327q4) {
        this.f48166kk = mathParagraph;
        m69269k4(fqcVar);
        this.f48169x1 = q1hVar;
        c14327q4.CloneTo(this.f48168to);
        oju.f47834kk.CloneTo(this.f48163du);
        this.f48165k4 = new el1[mathParagraph.getCount()];
        IGenericEnumerator<IMathBlock> it = mathParagraph.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                this.f48165k4[i] = q1hVar.m69384k4((MathBlock) it.next(), q1hVar, c14327q4.Clone());
                i++;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static float m69263k4(int i, float f, float f2) {
        if (i == 2) {
            return f;
        }
        if (i == 3 || i == 4) {
            return f2;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: x1 */
    public final h2y m69272x1() {
        return this.f48167m9.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final fqc m69268k4() {
        return this.f48164h4;
    }

    /* JADX INFO: renamed from: k4 */
    private h2y m69264k4(el1 el1Var, wsf wsfVar, float f) {
        h2y h2yVarClone = el1Var.m5578h4().Clone();
        IGenericEnumerator<el1> it = el1Var.f4826m9.iterator();
        while (it.hasNext()) {
            try {
                el1 next = it.next();
                if (C7019kk.m27469x1(next, dxs.class)) {
                    next = ((dxs) next).f4826m9.get_Item(0);
                }
                if (C7019kk.m27469x1(next, C1138gb.class) && !C7019kk.m27469x1(next.f4826m9.get_Item(0), b0t.class)) {
                    wsf wsfVar2 = h2yVarClone.f5390x1;
                    float f2 = wsfVar2.f49850x1;
                    if (f2 <= wsfVar.f49850x1 || wsfVar2.f49849k4 >= wsfVar.f49849k4 || f <= 1.0f) {
                        wsfVar2.f49850x1 = ((C1138gb) next).f4826m9.get_Item(0).m5578h4().f5390x1.f49850x1;
                    } else {
                        wsfVar2.f49850x1 = f2 * 2.0f;
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return h2yVarClone;
    }

    /* JADX INFO: renamed from: k4 */
    private h2y m69265k4(oju ojuVar, oju[] ojuVarArr, int i, wsf wsfVar, float f) {
        float f2;
        float f3;
        int i2;
        float fM67481k4;
        pv7 pv7Var = this;
        oju ojuVar2 = ojuVar;
        el1[] el1VarArr = pv7Var.f48165k4;
        int i3 = 0;
        for (el1 el1Var : el1VarArr) {
            el1Var.m5585x1(oju.f47834kk.Clone());
            el1Var.m5582kk(ojuVar2.Clone());
        }
        float f4 = 0.0f;
        if (el1VarArr.length == 0) {
            oju.f47834kk.CloneTo(ojuVarArr[0]);
            h2y h2yVar = new h2y();
            h2yVar.f5389k4 = 0.0f;
            h2yVar.f5390x1 = new wsf(0.0f, 0.0f);
            return h2yVar;
        }
        float[] fArr = new float[el1VarArr.length];
        float f5 = 0.0f;
        for (int i4 = 0; i4 < el1VarArr.length; i4++) {
            int i5 = 0;
            while (true) {
                if (i5 >= el1VarArr[i4].f4826m9.size()) {
                    break;
                }
                b3e b3eVar = (b3e) C7019kk.m27452k4((Object) el1VarArr[i4].f4826m9.get_Item(i5), b3e.class);
                if (b3eVar == null || !b3eVar.m3979x1().m2007x1().m64372h4()) {
                    i5++;
                } else {
                    float f6 = ((b3e) el1VarArr[i4].f4826m9.get_Item(i5)).m5583m9().f47836k4;
                    fArr[i4] = f6;
                    if (f5 < f6) {
                        f5 = f6;
                    }
                }
            }
        }
        float fM67481k42 = 0.0f;
        for (int i6 = 0; i6 < el1VarArr.length; i6++) {
            fM67481k42 = C14116yg.m67481k4(fM67481k42, el1VarArr[i6].m5578h4().f5389k4);
            el1 el1Var2 = el1VarArr[i6];
            el1Var2.m5584x1((f5 - fArr[i6]) + el1Var2.m5583m9().f47836k4, el1VarArr[i6].m5583m9().f47837x1);
        }
        float f7 = ojuVar2.f47836k4 - fM67481k42;
        float fM69263k4 = m69263k4(i, f7, f7 / 2.0f);
        nn2 nn2VarM69387k4 = pv7Var.f48169x1.m69387k4(pv7Var.f48168to.f48231du);
        float f8 = 1.0f;
        if (pv7Var.m69268k4().m6277m9() <= 0.0f || !pv7Var.f48166kk.m1999k4()) {
            f2 = f;
            f3 = 1.0f;
        } else {
            float fM6277m9 = pv7Var.m69268k4().m6277m9() * 0.01f;
            if (fM6277m9 > 1.0f) {
                f3 = fM6277m9;
                f2 = 0.0f;
            } else {
                f3 = fM6277m9;
                f2 = f;
            }
        }
        oju ojuVar3 = new oju(Float.MAX_VALUE, Float.MAX_VALUE);
        float fM67481k43 = -3.4028235E38f;
        float fM72912k4 = 0.0f;
        while (i3 < el1VarArr.length) {
            el1 el1Var3 = el1VarArr[i3];
            h2y h2yVarClone = pv7Var.m69264k4(el1Var3, wsfVar.Clone(), f3).Clone();
            float f9 = f8;
            el1[] el1VarArr2 = el1VarArr;
            wsf wsfVarClone = pv7Var.m69266k4(h2yVarClone.f5390x1.Clone(), wsfVar.Clone(), f2).Clone();
            float f10 = wsfVarClone.f49849k4;
            float f11 = ojuVar2.f47836k4 - fM67481k42;
            float f12 = fM69263k4;
            float fM69263k42 = f12 + m69263k4(1, f11, f11 / 2.0f) + el1Var3.m5583m9().f47836k4;
            float fM72912k42 = wsfVarClone.f49849k4 - h2yVarClone.f5390x1.f49849k4;
            if (f3 > f9) {
                IGenericEnumerator<el1> it = el1Var3.f4826m9.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    try {
                        float f13 = fM72912k42;
                        el1 next = it.next();
                        int i7 = i3;
                        if (C7019kk.m27469x1(next, C14431s3.class)) {
                            C14431s3 c14431s3 = (C14431s3) next;
                            if (c14431s3.m70435x1().m5578h4().f5390x1.f49850x1 <= f9 || c14431s3.m70433k4().m5578h4().f5390x1.f49849k4 >= nn2VarM69387k4.m63560k4() - nn2VarM69387k4.m63563to() || f3 > 1.5f) {
                                if (c14431s3.m70433k4().m5578h4().f5390x1.f49849k4 > nn2VarM69387k4.m63560k4() * 0.9f) {
                                    float f14 = wsfVarClone.f49849k4;
                                    fM67481k4 = C14116yg.m67481k4(f14, c14431s3.m70435x1().m5578h4().f5390x1.f49850x1 + f14);
                                }
                                z = true;
                            } else {
                                float f15 = wsfVarClone.f49849k4;
                                fM67481k4 = C14116yg.m67481k4(f15, ((nn2VarM69387k4.m63560k4() * 0.87f) + f15) - c14431s3.m70433k4().m5578h4().f5390x1.f49849k4);
                            }
                            wsfVarClone.f49849k4 = fM67481k4;
                            z = true;
                        }
                        i3 = i7;
                        fM72912k42 = f13;
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                float f16 = fM72912k42;
                i2 = i3;
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                fM72912k42 = (z ? ((wsfVarClone.f49849k4 - h2yVarClone.f5390x1.f49849k4) + f16) - ((wsfVarClone.m72912k4() * 0.025146f) * f3) : f16 - ((nn2VarM69387k4.m63563to() * 0.846f) * f3)) + ((wsfVarClone.m72912k4() * f3) - wsfVarClone.m72912k4());
            } else {
                i2 = i3;
            }
            el1Var3.m5584x1(fM69263k42, fM72912k42 + fM72912k4);
            fM72912k4 += wsfVarClone.m72912k4() * f3;
            ojuVar3.f47836k4 = C14116yg.m67504x1(ojuVar3.f47836k4, fM69263k42);
            ojuVar3.f47837x1 = C14116yg.m67504x1(ojuVar3.f47837x1, fM72912k42);
            fM67481k43 = C14116yg.m67481k4(fM67481k43, fM69263k42 + h2yVarClone.f5389k4);
            i3 = i2 + 1;
            pv7Var = this;
            ojuVar2 = ojuVar;
            f4 = f10;
            el1VarArr = el1VarArr2;
            fM69263k4 = f12;
            f8 = f9;
        }
        ojuVar3.CloneTo(ojuVarArr[0]);
        h2y h2yVar2 = new h2y();
        h2yVar2.f5389k4 = fM67481k42;
        h2yVar2.f5390x1 = new wsf(f4, fM72912k4 - f4);
        return h2yVar2;
    }

    /* JADX INFO: renamed from: k4 */
    private wsf m69266k4(wsf wsfVar, wsf wsfVar2, float f) {
        if (wsfVar.m72912k4() + f > this.f48169x1.f48223k4) {
            wsfVar.f49849k4 += f;
        }
        return wsf.m72910k4(wsfVar2.Clone(), wsfVar.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69269k4(fqc fqcVar) {
        this.f48164h4 = fqcVar;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69267k4(h2y h2yVar) {
        this.f48167m9 = h2yVar.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69270k4(oju ojuVar, int i, wsf wsfVar, float f) {
        oju[] ojuVarArr = {this.f48163du};
        h2y h2yVarClone = m69265k4(ojuVar.Clone(), ojuVarArr, i, wsfVar.Clone(), f).Clone();
        ojuVarArr[0].CloneTo(this.f48163du);
        m69267k4(h2yVarClone.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69271k4(yvz yvzVar, oju ojuVar) {
        pzd pzdVar = new pzd(yvzVar.f50411k4);
        try {
            yvzVar.f50411k4.m74612k4(ojuVar.f47836k4, ojuVar.f47837x1);
            el1.m5575k4(yvzVar.Clone(), (IGenericList<el1>) AbstractC14092to.m67204k4((Object[]) this.f48165k4));
        } finally {
            pzdVar.dispose();
        }
    }
}
