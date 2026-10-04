package com.aspose.slides.internal.p333p8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.C7188ks;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p8.up */
/* JADX INFO: loaded from: classes4.dex */
public class C9432up {

    /* JADX INFO: renamed from: k4 */
    private C9425fa f34315k4;

    /* JADX INFO: renamed from: kk */
    private final Dictionary<Long, C9425fa> f34316kk = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private C9425fa f34317x1;

    /* JADX INFO: renamed from: k4 */
    private List<Long> m46188k4(long j, C9425fa c9425fa) {
        List<Long> list = new List<>();
        list.addItem(Long.valueOf(j));
        while (c9425fa.m46144k4() != null) {
            C7185jd c7185jdM27809kk = c9425fa.m46144k4().m27809kk(C7182dy.f19671vm);
            long jM27752kk = (c7185jdM27809kk == null || !C7019kk.m27469x1(c7185jdM27809kk, C7179c5.class)) ? -1L : ((C7179c5) C7019kk.m27452k4((Object) c7185jdM27809kk, C7179c5.class)).m27752kk();
            if (jM27752kk == -1 || !this.f34316kk.containsKey(Long.valueOf(jM27752kk))) {
                break;
            }
            c9425fa = this.f34316kk.get_Item(Long.valueOf(jM27752kk));
            list.addItem(Long.valueOf(jM27752kk));
            if (list.size() >= this.f34316kk.size()) {
                break;
            }
        }
        list.reverse();
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<C7188ks, Long> m46193x1() {
        C9425fa c9425fa = this.f34315k4;
        return c9425fa != null ? c9425fa.m46147x1() : new Dictionary<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7187kk m46189k4() {
        C9425fa c9425fa = this.f34317x1;
        if (c9425fa != null) {
            return c9425fa.m46144k4();
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46194x1(long j) {
        this.f34315k4 = new C9425fa();
        this.f34316kk.addItem(Long.valueOf(j), this.f34315k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46190k4(long j) {
        if (this.f34317x1 != null) {
            return;
        }
        C9425fa c9425fa = new C9425fa();
        this.f34317x1 = c9425fa;
        c9425fa.m46145k4(new C7187kk());
        C9425fa c9425fa2 = this.f34316kk.containsKey(Long.valueOf(j)) ? this.f34316kk.get_Item(Long.valueOf(j)) : null;
        List<Long> list = new List<>();
        if (c9425fa2 == null) {
            list.addRange(this.f34316kk.getKeys());
            list.sort();
        } else {
            list = m46188k4(j, c9425fa2);
        }
        List.Enumerator<Long> it = list.iterator();
        while (it.hasNext()) {
            try {
                Long l = (Long) C7019kk.m27464to(it.next(), Long.TYPE);
                l.longValue();
                if (this.f34316kk.containsKey(l)) {
                    C9425fa c9425fa3 = this.f34316kk.get_Item(l);
                    if (c9425fa3.m46144k4() != null) {
                        this.f34317x1.m46144k4().m27803k4(c9425fa3.m46144k4());
                    }
                    this.f34317x1.m46146k4(c9425fa3);
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
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46191k4(C7187kk c7187kk) {
        C9425fa c9425fa = this.f34315k4;
        if (c9425fa != null) {
            c9425fa.m46145k4(c7187kk);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46192k4(C7188ks c7188ks, long j) {
        C9425fa c9425fa = this.f34315k4;
        if (c9425fa != null) {
            c9425fa.m46147x1().addItem(c7188ks, Long.valueOf(j));
        }
    }
}
