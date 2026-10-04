package com.aspose.slides.internal.p270m9;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p065ck.AbstractC2566ca;
import com.aspose.slides.internal.p065ck.InterfaceC2563bz;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C6342ks implements IGenericEnumerable<InterfaceC2563bz> {

    /* JADX INFO: renamed from: k4 */
    private List<InterfaceC2563bz> f18030k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private AbstractC6340k4 f18031x1;

    public C6342ks(AbstractC6340k4 abstractC6340k4) {
        this.f18031x1 = abstractC6340k4;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<InterfaceC2563bz> iterator() {
        return this.f18030k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m25954k4() {
        return this.f18030k4.size();
    }

    public String toString() {
        if (m25954k4() == 0) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(m25955k4(0).mo11884h4());
        for (int i = 1; i < m25954k4(); i++) {
            c6765kp.m26792k4(", ");
            c6765kp.m26792k4(m25955k4(i).mo11884h4());
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC2563bz m25955k4(int i) {
        if (i < 0 || i > this.f18030k4.size() - 1) {
            return null;
        }
        return this.f18030k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25956k4(AbstractC2566ca abstractC2566ca) {
        abstractC2566ca.mo11892k4(this.f18031x1);
        this.f18030k4.addItem(abstractC2566ca);
    }
}
