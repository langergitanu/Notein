package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class kjz extends AbstractC14480sz {

    /* JADX INFO: renamed from: du */
    private int f45754du;

    /* JADX INFO: renamed from: k4 */
    float f45755k4;

    /* JADX INFO: renamed from: kk */
    float f45756kk;

    /* JADX INFO: renamed from: to */
    public final pv7 f45757to;

    /* JADX INFO: renamed from: x1 */
    wsf f45758x1;

    public kjz(pv7 pv7Var) {
        this.f45758x1 = new wsf();
        this.f45757to = pv7Var;
        this.f45754du = 1;
        q1h q1hVar = pv7Var.f48169x1;
        nn2 nn2VarM69387k4 = q1hVar.m69387k4(q1hVar.f48223k4);
        float f = pv7Var.f48169x1.f48223k4 / 96.0f;
        this.f45758x1 = new wsf(nn2VarM69387k4.m63560k4() + nn2VarM69387k4.m63563to(), (nn2VarM69387k4.m63563to() * 0.2f) + nn2VarM69387k4.m63564x1());
        this.f45755k4 = nn2VarM69387k4.m63563to() * 0.846f;
        if ((pv7Var.f48169x1.m69390x1() || !pv7Var.f48166kk.m1999k4()) && m63951k4(new ReadOnlyCollection<>(new List(AbstractC14092to.m67204k4((Object[]) pv7Var.f48165k4))))) {
            this.f45755k4 = f * 16.0f;
        }
        m70912x1(pv7Var.f48166kk.m1999k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63952k4(int i) {
        this.f45754du = i;
    }

    /* JADX INFO: renamed from: to */
    public final int m63955to() {
        return this.f45754du;
    }

    public kjz(pv7 pv7Var, int i) {
        this.f45758x1 = new wsf();
        this.f45757to = pv7Var;
        this.f45754du = i;
        q1h q1hVar = pv7Var.f48169x1;
        nn2 nn2VarM69387k4 = q1hVar.m69387k4(q1hVar.f48223k4);
        this.f45756kk = nn2.m68100k4(pv7Var.f48169x1.f48223k4);
        float f = pv7Var.f48169x1.f48223k4 / 96.0f;
        this.f45758x1 = new wsf(nn2VarM69387k4.m63560k4() + nn2VarM69387k4.m63563to(), (nn2VarM69387k4.m63563to() * 0.2f) + nn2VarM69387k4.m63564x1());
        this.f45755k4 = nn2VarM69387k4.m63563to() * 0.846f;
        if ((pv7Var.f48169x1.m69390x1() || !pv7Var.f48166kk.m1999k4()) && m63951k4(new ReadOnlyCollection<>(new List(AbstractC14092to.m67204k4((Object[]) pv7Var.f48165k4))))) {
            this.f45755k4 = f * 16.0f;
        }
        m70912x1(pv7Var.f48166kk.m1999k4());
    }

    /* JADX INFO: renamed from: k4 */
    public void m63953k4(oju ojuVar, boolean z, float f) {
        this.f45757to.m69270k4(ojuVar.Clone(), this.f45754du, this.f45758x1.Clone(), this.f45755k4);
        h2y h2yVarM6972k4 = this.f45757to.m69272x1().Clone();
        wsf wsfVar = h2yVarM6972k4.f5390x1;
        C1149gk c1149gk = new C1149gk(wsfVar.f49849k4, wsfVar.f49850x1);
        C0904dk c0904dk = new C0904dk();
        c0904dk.f4602x1 = h2yVarM6972k4.f5389k4;
        c0904dk.f4600kk = c1149gk.f5266k4;
        c0904dk.f4601to = c1149gk.f5267x1;
        m70908k4(c0904dk);
    }

    /* JADX INFO: renamed from: k4 */
    public void m63954k4(AbstractC14897zn abstractC14897zn) {
        AbstractC12024x1 abstractC12024x1Invoke = this.f45757to.f48169x1.f48227x1.invoke(null);
        yvz yvzVar = new yvz();
        yvzVar.f50412x1 = abstractC12024x1Invoke;
        yvzVar.f50411k4 = abstractC14897zn;
        this.f45757to.m69271k4(yvzVar.Clone(), m70906k4().Clone().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m63951k4(ReadOnlyCollection<el1> readOnlyCollection) {
        IGenericEnumerator<el1> it = readOnlyCollection.iterator();
        while (it.hasNext()) {
            try {
                el1 next = it.next();
                if (m63951k4(next.f4826m9)) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
                if (C7019kk.m27469x1(next, b0t.class)) {
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return false;
        }
        it.dispose();
        return false;
    }
}
