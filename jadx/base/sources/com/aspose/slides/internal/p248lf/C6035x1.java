package com.aspose.slides.internal.p248lf;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p535yz.AbstractC13340dy;
import com.aspose.slides.internal.p535yz.C13338c5;
import com.aspose.slides.internal.p535yz.C13339du;
import com.aspose.slides.internal.p535yz.C13341h4;
import com.aspose.slides.internal.p535yz.C13343k4;
import com.aspose.slides.internal.p535yz.C13347x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lf.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C6035x1 {

    /* JADX INFO: renamed from: du */
    private C13347x1 f17117du;

    /* JADX INFO: renamed from: h4 */
    private C13338c5 f17118h4;

    /* JADX INFO: renamed from: to */
    private C13343k4 f17121to;

    /* JADX INFO: renamed from: k4 */
    public List<C13341h4> f17119k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    public List<AbstractC13340dy> f17122x1 = new List<>();

    /* JADX INFO: renamed from: kk */
    public List<AbstractC13340dy> f17120kk = new List<>();

    /* JADX INFO: renamed from: k4 */
    public static List<C6035x1> m24362k4(List<C6035x1> list, int i) {
        List<C6035x1> list2 = new List<>();
        int iM61996x1 = C13339du.m61996x1(i);
        List.Enumerator<C6035x1> it = list.iterator();
        int i2 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            try {
                C6035x1 next = it.next();
                int iM61996x12 = iM61996x1 - ("all".equals(next.m24367k4().m62011c6()) ? iM61996x1 - 50 : C13339du.m61996x1(C13339du.m61993k4(next.m24367k4().m62011c6())));
                int iM67482k4 = C14116yg.m67482k4(iM61996x12);
                if (i2 > iM67482k4) {
                    list2 = new List<>();
                    list2.addItem(next);
                    i2 = iM67482k4;
                } else if (i2 == iM67482k4) {
                    if (iM61996x12 <= 50) {
                        list2.addItem(next);
                    } else {
                        list2.insertItem(0, next);
                    }
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
        return list2;
    }

    /* JADX INFO: renamed from: x1 */
    public static List<C6035x1> m24364x1(List<C6035x1> list, boolean z) {
        boolean zM27456k4;
        List<C6035x1> list2 = new List<>();
        List.Enumerator<C6035x1> it = list.iterator();
        if (z) {
            while (it.hasNext()) {
                try {
                    C6035x1 next = it.next();
                    if (next.m24367k4().m62015xk()) {
                        list2.addItem(next);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return list2;
            }
        } else {
            while (it.hasNext()) {
                try {
                    C6035x1 next2 = it.next();
                    if (!next2.m24367k4().m62015xk()) {
                        list2.addItem(next2);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: k4 */
    public static List<C6035x1> m24363k4(List<C6035x1> list, boolean z) {
        List.Enumerator<C6035x1> it;
        List<C6035x1> list2 = new List<>();
        if (z) {
            it = list.iterator();
            while (it.hasNext()) {
                try {
                    C6035x1 next = it.next();
                    if (next.m24367k4().m62009ak()) {
                        list2.addItem(next);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (list2.size() == 0) {
                list2.addRange(list);
                return list2;
            }
        } else {
            it = list.iterator();
            while (it.hasNext()) {
                try {
                    C6035x1 next2 = it.next();
                    if (!next2.m24367k4().m62009ak()) {
                        list2.addItem(next2);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13338c5 m24371x1() {
        return this.f17118h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13340dy m24365k4(C13341h4 c13341h4, C13341h4 c13341h42) {
        if (c13341h4 == null || c13341h42 == null) {
            return null;
        }
        List.Enumerator<AbstractC13340dy> it = this.f17122x1.iterator();
        while (it.hasNext()) {
            try {
                AbstractC13340dy next = it.next();
                if (C14113y2.m67363du(next.m61998b3(), c13341h4.mo61992wy()) && C14113y2.m67363du(next.m61999wy(), c13341h42.mo61992wy())) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13341h4 m24366k4(String str) {
        List.Enumerator<C13341h4> it = this.f17119k4.iterator();
        while (it.hasNext()) {
            try {
                C13341h4 next = it.next();
                if (C14113y2.m67363du(next.mo61991b3(), str)) {
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

    /* JADX INFO: renamed from: k4 */
    public final C13347x1 m24367k4() {
        return this.f17117du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24368k4(C13338c5 c13338c5) {
        this.f17118h4 = c13338c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24369k4(C13343k4 c13343k4) {
        this.f17121to = c13343k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24370k4(C13347x1 c13347x1) {
        this.f17117du = c13347x1;
    }
}
