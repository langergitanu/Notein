package com.aspose.slides.internal.p270m9;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p231kk.InterfaceC5789ix;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C6358yj implements InterfaceC5789ix {

    /* JADX INFO: renamed from: k4 */
    private List<InterfaceC5797ne> f18086k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private C6345ne f18087x1;

    public C6358yj(C6345ne c6345ne) {
        this.f18087x1 = c6345ne;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<InterfaceC5797ne> iterator() {
        return this.f18086k4.iterator();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5789ix
    /* JADX INFO: renamed from: k4 */
    public final long mo23418k4() {
        return this.f18086k4.size();
    }

    public String toString() {
        if (mo23418k4() == 0) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(mo23419k4(0).mo23406x1());
        for (int i = 1; i < mo23418k4(); i++) {
            c6765kp.m26792k4(", ");
            c6765kp.m26792k4(mo23419k4(i).mo23406x1());
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m26050x1(int i) {
        this.f18086k4.removeAt(i);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5789ix
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC5797ne mo23419k4(int i) {
        if (i < 0 || i > this.f18086k4.size() - 1) {
            return null;
        }
        return this.f18086k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26049k4(InterfaceC5797ne interfaceC5797ne) {
        this.f18086k4.addItem(interfaceC5797ne);
    }
}
