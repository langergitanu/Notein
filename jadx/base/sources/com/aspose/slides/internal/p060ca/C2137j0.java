package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.j0 */
/* JADX INFO: loaded from: classes3.dex */
public class C2137j0 extends AbstractC2282s0 {

    /* JADX INFO: renamed from: x1 */
    private List<C2078f3> f7392x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.j0$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public String f7393k4;

        /* JADX INFO: renamed from: x1 */
        public int f7394x1;

        private k4() {
            this.f7393k4 = C14113y2.f47374k4;
            this.f7394x1 = 0;
        }
    }

    public C2137j0(long j) {
        super(j);
        this.f7392x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C2078f3 m10797k4(int i) {
        return this.f7392x1.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2078f3 m10798k4(String str) {
        if (str.length() != 4) {
            throw new ArgumentException("parameter string Name have length 4 characters");
        }
        List.Enumerator<C2078f3> it = this.f7392x1.iterator();
        while (it.hasNext()) {
            try {
                C2078f3 next = it.next();
                if (C14113y2.m67363du(next.m11181x1(), str)) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        int iM11151fa = c2212n9.m11151fa() & 65535;
        List list = new List(iM11151fa);
        for (int i = 0; i < iM11151fa; i++) {
            k4 k4Var = new k4();
            k4Var.f7393k4 = c2212n9.m11166x1(4);
            k4Var.f7394x1 = c2212n9.m11151fa();
            list.addItem(k4Var);
        }
        this.f7392x1.setCapacity(iM11151fa);
        for (int i2 = 0; i2 < iM11151fa; i2++) {
            this.f7392x1.addItem((C2078f3) AbstractC2282s0.m11353k4(new C2078f3(((this.f7845k4 & 4294967295L) + ((long) (((k4) list.get_Item(i2)).f7394x1 & 65535))) & 4294967295L, ((k4) list.get_Item(i2)).f7393k4), c2212n9));
        }
    }
}
