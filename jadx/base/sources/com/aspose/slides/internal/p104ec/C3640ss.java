package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.ss */
/* JADX INFO: loaded from: classes3.dex */
class C3640ss {

    /* JADX INFO: renamed from: k4 */
    private final int f10099k4;

    /* JADX INFO: renamed from: x1 */
    private final List<C3599bv> f10100x1 = new List<>();

    public C3640ss(int i) {
        this.f10099k4 = i;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public final void m14795k4(C9820h4 c9820h4) {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                List.Enumerator<C3599bv> it = this.f10100x1.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().mo14697k4(c3149x1);
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
                c3149x1.m13446k4(0);
                c9820h4.m48409k4(c3152yj.toArray());
                c3149x1.dispose();
            } catch (Throwable th2) {
                c3149x1.dispose();
                throw th2;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14797x1(final String str) {
        C3599bv c3599bvFind = this.f10100x1.find(new AbstractC14041ai<C3599bv>() { // from class: com.aspose.slides.internal.ec.ss.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(C3599bv c3599bv) {
                return C14113y2.m67363du(c3599bv.m14696k4(), str);
            }
        });
        if (c3599bvFind == null) {
            throw new ArgumentException(C14113y2.m67402k4("NAMEMAP entry for module with name {0} is not exists", str));
        }
        this.f10100x1.removeItem(c3599bvFind);
    }

    public C3640ss(C9820h4 c9820h4, int i) {
        if (c9820h4 == null) {
            throw new ArgumentNullException();
        }
        this.f10099k4 = i;
        C3152yj c3152yj = new C3152yj(c9820h4.m48413x1());
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            while (c3152yj.getPosition() < r6.length - 2) {
                try {
                    C3599bv c3599bv = new C3599bv(this.f10099k4);
                    c3599bv.mo14692k4(c3134k4);
                    this.f10100x1.addItem(c3599bv);
                } catch (Throwable th) {
                    c3134k4.dispose();
                    throw th;
                }
            }
            if ((c3134k4.m13382u4() & 65535) != 0) {
                throw new C3620j5();
            }
            c3134k4.dispose();
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14796k4(String str) {
        this.f10100x1.addItem(new C3599bv(this.f10099k4, str));
    }
}
