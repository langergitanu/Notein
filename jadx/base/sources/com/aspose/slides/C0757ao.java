package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ao */
/* JADX INFO: loaded from: classes3.dex */
class C0757ao implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private C14744wn f3932k4;

    /* JADX INFO: renamed from: x1 */
    private List<C14744wn> f3933x1;

    public C0757ao(C14744wn c14744wn, C14744wn c14744wn2) {
        this.f3933x1 = null;
        this.f3932k4 = c14744wn;
        this.f3933x1 = new List<>();
        m3683k4(c14744wn2);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f3933x1.clear();
        this.f3933x1 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m3681k4() {
        return this.f3932k4.m72835k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C14744wn> m3685x1() {
        return this.f3933x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3682k4(C0757ao c0757ao, boolean z) {
        if (c0757ao == null) {
            return;
        }
        List.Enumerator<C14744wn> it = c0757ao.f3933x1.iterator();
        while (it.hasNext()) {
            try {
                m3684k4(it.next(), z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3683k4(C14744wn c14744wn) {
        m3684k4(c14744wn, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3684k4(C14744wn c14744wn, boolean z) {
        if (c14744wn == null) {
            return;
        }
        if (z) {
            int size = this.f3933x1.size();
            while (true) {
                if (size <= 0) {
                    break;
                }
                size--;
                if (c14744wn == this.f3933x1.get_Item(size)) {
                    this.f3933x1.removeAt(size);
                    break;
                }
            }
        }
        this.f3933x1.addItem(c14744wn);
    }
}
