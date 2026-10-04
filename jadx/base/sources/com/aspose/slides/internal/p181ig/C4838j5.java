package com.aspose.slides.internal.p181ig;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p165he.C4521k4;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p213jw.C5560wy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ig.j5 */
/* JADX INFO: loaded from: classes.dex */
public class C4838j5 implements IGenericEnumerable<C5543ix> {

    /* JADX INFO: renamed from: k4 */
    private List<C5543ix> f13459k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private C5543ix f13460x1;

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C5543ix> iterator() {
        return new C4521k4(this.f13459k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C5543ix m20075k4() {
        C5543ix c5543ix = this.f13460x1;
        if (this.f13459k4.size() > 0) {
            List<C5543ix> list = this.f13459k4;
            list.removeAt(list.size() - 1);
            this.f13460x1 = this.f13459k4.size() != 0 ? (C5543ix) OooO0O0.OooO00o(this.f13459k4, 1) : null;
        }
        return c5543ix;
    }

    /* JADX INFO: renamed from: kk */
    public final int m20080kk() {
        return this.f13459k4.size();
    }

    /* JADX INFO: renamed from: to */
    public final C5543ix m20082to() {
        if (this.f13459k4.size() != 0) {
            return this.f13459k4.get_Item(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C5543ix m20084x1() {
        return this.f13460x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m20081kk(C5543ix c5543ix) {
        return this.f13459k4.indexOf(c5543ix);
    }

    /* JADX INFO: renamed from: to */
    public final C5543ix m20083to(C5543ix c5543ix) {
        int iM20081kk = m20081kk(c5543ix);
        if (iM20081kk < 1) {
            return null;
        }
        return m20076k4(iM20081kk - 1);
    }

    /* JADX INFO: renamed from: x1 */
    public final C5543ix m20085x1(C5560wy c5560wy) {
        IGenericEnumerator<C5543ix> it = iterator();
        while (it.hasNext()) {
            try {
                C5543ix next = it.next();
                if (next.m22719to().m22850k4(c5560wy)) {
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

    /* JADX INFO: renamed from: x1 */
    public final void m20086x1(int i, C5543ix c5543ix) {
        this.f13459k4.insertItem(i, c5543ix);
        if (i == this.f13459k4.size() - 1) {
            this.f13460x1 = c5543ix;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m20087x1(C5543ix c5543ix) {
        if (!this.f13459k4.removeItem(c5543ix)) {
            return false;
        }
        if (this.f13459k4.size() != 0) {
            this.f13460x1 = this.f13459k4.size() != 0 ? (C5543ix) OooO0O0.OooO00o(this.f13459k4, 1) : null;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final C5543ix m20076k4(int i) {
        return this.f13459k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20077k4(int i, C5543ix c5543ix) {
        this.f13459k4.set_Item(i, c5543ix);
        if (i == this.f13459k4.size() - 1) {
            this.f13460x1 = c5543ix;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20078k4(C5543ix c5543ix) {
        this.f13460x1 = c5543ix;
        this.f13459k4.addItem(c5543ix);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20079k4(C5560wy c5560wy) {
        IGenericEnumerator<C5543ix> it = iterator();
        while (it.hasNext()) {
            if (it.next().m22719to().m22850k4(c5560wy)) {
                return true;
            }
        }
        return false;
    }
}
