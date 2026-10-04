package com.aspose.slides.internal.p270m9;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p096dy.InterfaceC3506x1;
import com.aspose.slides.internal.p231kk.InterfaceC5774ak;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p423to.C11074x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.um */
/* JADX INFO: loaded from: classes4.dex */
public class C6350um implements IGenericEnumerable<InterfaceC3506x1>, InterfaceC5774ak {

    /* JADX INFO: renamed from: k4 */
    private List<String> f18073k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private List<InterfaceC3506x1> f18074x1 = new List<>();

    @Override // java.lang.Iterable
    public IGenericEnumerator<InterfaceC3506x1> iterator() {
        return this.f18074x1.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m26028k4() {
        if (m26031x1() == 0) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(this.f18074x1.get_Item(0).mo14058k4());
        for (int i = 1; i < m26031x1(); i++) {
            c6765kp.m26792k4(", ");
            c6765kp.m26792k4(this.f18074x1.get_Item(i).mo14058k4());
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final long m26031x1() {
        return this.f18073k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26029k4(InterfaceC3506x1 interfaceC3506x1) {
        this.f18074x1.addItem(interfaceC3506x1);
        this.f18073k4.addItem(interfaceC3506x1.mo14058k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m26030k4(C11074x1 c11074x1) {
        List.Enumerator<InterfaceC3506x1> it = this.f18074x1.iterator();
        while (it.hasNext()) {
            try {
                if (it.next().mo10096k4(c11074x1)) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
