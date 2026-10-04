package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.z1 */
/* JADX INFO: loaded from: classes3.dex */
public class C2398z1 {

    /* JADX INFO: renamed from: to */
    private List<AbstractC2220nx> f8327to = new List<>();

    /* JADX INFO: renamed from: k4 */
    public C2407zf f8325k4 = new C2407zf();

    /* JADX INFO: renamed from: x1 */
    public C2200ms f8328x1 = new C2200ms();

    /* JADX INFO: renamed from: kk */
    public C2210n5 f8326kk = new C2210n5();

    /* JADX INFO: renamed from: to */
    private void m11780to() {
        if (this.f8326kk != null) {
            for (int i = 0; i < this.f8326kk.m11139k4(); i++) {
                this.f8326kk.m11140k4(i).mo10801k4(this);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11781k4() {
        this.f8327to.clear();
        m11780to();
    }

    /* JADX INFO: renamed from: kk */
    public final IGenericEnumerator<AbstractC2220nx> m11783kk() {
        return this.f8327to.iterator();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11784x1() {
        return this.f8327to.size();
    }

    /* JADX INFO: renamed from: kk */
    private void m11779kk(AbstractC2220nx abstractC2220nx) {
        if (this.f8325k4 != null) {
            for (int i = 0; i < this.f8325k4.m11820k4(); i++) {
                this.f8325k4.m11821k4(i).mo10282k4(this, new C2125i5(abstractC2220nx));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11782k4(AbstractC2220nx abstractC2220nx) {
        this.f8327to.addItem(abstractC2220nx);
        m11779kk(abstractC2220nx);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m11785x1(AbstractC2220nx abstractC2220nx) {
        List.Enumerator<AbstractC2220nx> it = this.f8327to.iterator();
        while (it.hasNext()) {
            try {
                if (it.next().equals(abstractC2220nx)) {
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
