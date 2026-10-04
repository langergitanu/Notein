package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.m2 */
/* JADX INFO: loaded from: classes3.dex */
final class C13818m2 extends el1 {

    /* JADX INFO: renamed from: k4 */
    private final C14327q4 f46127k4;

    /* JADX INFO: renamed from: x1 */
    private final float f46128x1;

    public C13818m2(MathArray mathArray, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathArray, interfaceC0851ce);
        C14327q4 c14327q42 = new C14327q4();
        this.f46127k4 = c14327q42;
        c14327q4.f48242yj = true;
        c14327q4.CloneTo(c14327q42);
        IGenericEnumerator<IMathElement> it = mathArray.getArguments().iterator();
        while (it.hasNext()) {
            try {
                IMathElement next = it.next();
                if (C7019kk.m27469x1(next, MathematicalText.class)) {
                    ((MathematicalText) next).m1987to();
                    m5579k4(new MathBlock(next), c14327q4.Clone());
                } else {
                    m5579k4(next, c14327q4.Clone());
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
        this.f46128x1 = ((this.f46127k4.f48232dy > 0 ? 43.0f : 68.0f) * c14327q4.f48231du) / 96.0f;
    }

    /* JADX INFO: renamed from: k4 */
    private List<Float> m64688k4(ReadOnlyCollection<el1> readOnlyCollection) {
        List<Float> list = new List<>();
        for (int i = 0; i < readOnlyCollection.size(); i++) {
            el1 el1Var = readOnlyCollection.get_Item(i);
            if (C7019kk.m27469x1(el1Var, t8a.class)) {
                int i2 = 0;
                for (int i3 = 0; i3 < el1Var.f4826m9.size(); i3++) {
                    if (C7019kk.m27469x1(el1Var.f4826m9.get_Item(i3), b3e.class) && ((b3e) el1Var.f4826m9.get_Item(i3)).m3977k4()) {
                        if (list.size() == i2) {
                            list.addItem(Float.valueOf(el1Var.f4826m9.get_Item(i3).m5583m9().f47836k4));
                        } else {
                            list.set_Item(i2, Float.valueOf(C14116yg.m67481k4(el1Var.f4826m9.get_Item(i3).m5583m9().f47836k4, list.get_Item(i2).floatValue())));
                        }
                        i2++;
                    }
                }
            }
        }
        return list;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        ReadOnlyCollection<el1> readOnlyCollection = this.f4826m9;
        IGenericEnumerator<el1> it = readOnlyCollection.iterator();
        float fM67481k4 = 0.0f;
        while (it.hasNext()) {
            try {
                fM67481k4 = C14116yg.m67481k4(fM67481k4, it.next().m5578h4().Clone().f5389k4);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        List<Float> listM64688k4 = m64688k4(readOnlyCollection);
        int i = 0;
        for (int i2 = 0; i2 < readOnlyCollection.size(); i2++) {
            el1 el1Var = readOnlyCollection.get_Item(i2);
            if (C7019kk.m27469x1(el1Var, t8a.class)) {
                int i3 = 0;
                for (int i4 = 0; i4 < el1Var.f4826m9.size(); i4++) {
                    if (C7019kk.m27469x1(el1Var.f4826m9.get_Item(i4), b3e.class) && ((b3e) el1Var.f4826m9.get_Item(i4)).m3977k4()) {
                        float fFloatValue = listM64688k4.get_Item(i3).floatValue() - el1Var.f4826m9.get_Item(i4).m5583m9().f47836k4;
                        if (i3 == 0) {
                            for (int i5 = 0; i5 < i4; i5++) {
                                oju ojuVarClone = el1Var.f4826m9.get_Item(i5).m5583m9().Clone();
                                ojuVarClone.f47836k4 += fFloatValue;
                                el1Var.f4826m9.get_Item(i5).m5585x1(ojuVarClone.Clone());
                            }
                        }
                        for (int i6 = i4; i6 < el1Var.f4826m9.size(); i6++) {
                            oju ojuVarClone2 = el1Var.f4826m9.get_Item(i6).m5583m9().Clone();
                            ojuVarClone2.f47836k4 += fFloatValue;
                            el1Var.f4826m9.get_Item(i6).m5585x1(ojuVarClone2.Clone());
                        }
                        listM64688k4 = m64688k4(readOnlyCollection);
                        i3++;
                    }
                }
            }
        }
        float fM72912k4 = 0.0f;
        while (i < readOnlyCollection.size()) {
            el1 el1Var2 = readOnlyCollection.get_Item(i);
            h2y h2yVarClone = el1Var2.m5578h4().Clone();
            float f = (fM67481k4 - h2yVarClone.f5389k4) / 2.0f;
            if (listM64688k4.size() > 0) {
                f = 0.0f;
            }
            el1Var2.m5584x1(f, fM72912k4);
            fM72912k4 += h2yVarClone.f5390x1.m72912k4();
            i++;
            if (i < readOnlyCollection.size()) {
                fM72912k4 = (this.f46128x1 - h2yVarClone.f5390x1.f49850x1) + fM72912k4;
            }
        }
        nn2 nn2VarM69387k4 = mo4555du().m69387k4(this.f46127k4.f48231du);
        h2y h2yVar = new h2y();
        m64689k4(fM72912k4, nn2VarM69387k4.m68101c5()).CloneTo(h2yVar.f5390x1);
        h2yVar.f5389k4 = fM67481k4;
        return h2yVar;
    }

    /* JADX INFO: renamed from: k4 */
    public static wsf m64689k4(float f, float f2) {
        float f3 = (f / 2.0f) + f2;
        return new wsf(f3, f - f3);
    }
}
