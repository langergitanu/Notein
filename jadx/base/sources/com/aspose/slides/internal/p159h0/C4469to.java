package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.to */
/* JADX INFO: loaded from: classes.dex */
class C4469to {

    /* JADX INFO: renamed from: kk */
    private boolean f12275kk;

    /* JADX INFO: renamed from: k4 */
    private C4459os f12274k4 = new C4459os();

    /* JADX INFO: renamed from: x1 */
    private C4459os f12277x1 = new C4459os();

    /* JADX INFO: renamed from: to */
    private C4489zj f12276to = new C4489zj();

    /* JADX INFO: renamed from: du */
    private SortedList<Long, C4483x1> f12273du = new SortedList<>();

    /* JADX INFO: renamed from: du */
    public final C4459os m18330du() {
        return this.f12277x1.Clone();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m18331h4() {
        return this.f12275kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18332k4() {
        if (this.f12273du.size() < 2) {
            return;
        }
        C4459os c4459os = new C4459os();
        IGenericEnumerator<KeyValuePair<Long, C4483x1>> it = this.f12273du.iterator();
        while (it.hasNext()) {
            try {
                C4459os.m18279k4(c4459os, it.next().getValue().m18449kk()).CloneTo(c4459os);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C4459os.m18281x1(c4459os, this.f12273du.size()).CloneTo(c4459os);
        IGenericEnumerator<KeyValuePair<Long, C4483x1>> it2 = this.f12273du.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            try {
                KeyValuePair<Long, C4483x1> next = it2.next();
                IGenericEnumerator<KeyValuePair<Long, C4483x1>> it3 = this.f12273du.iterator();
                while (true) {
                    try {
                        if (!it3.hasNext()) {
                            break;
                        }
                        KeyValuePair<Long, C4483x1> next2 = it3.next();
                        if (next.getValue() != next2.getValue() && C4459os.m18280kk(next.getValue().m18450m9().Clone(), next2.getValue().m18450m9().Clone()) < 0.0f) {
                            z = false;
                            break;
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                if (!z) {
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (z) {
            it = this.f12273du.iterator();
            float fM18440du = 0.0f;
            while (it.hasNext()) {
                try {
                    KeyValuePair<Long, C4483x1> next3 = it.next();
                    fM18440du += next3.getValue().m18440du() - C4459os.m18282x1(c4459os, next3.getValue().m18452x1()).m18288kk();
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            float size = fM18440du / this.f12273du.size();
            if (size > 0.0f) {
                C4459os c4459os2 = new C4459os();
                it = this.f12273du.iterator();
                while (it.hasNext()) {
                    try {
                        C4459os.m18279k4(c4459os2, it.next().getValue().m18450m9()).CloneTo(c4459os2);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                c4459os2.m18289to().CloneTo(c4459os2);
                C4459os.m18279k4(c4459os, C4459os.m18278k4(c4459os2, size)).CloneTo(c4459os);
            }
        }
        IGenericEnumerator<KeyValuePair<Long, C4483x1>> it4 = this.f12273du.iterator();
        while (it4.hasNext()) {
            try {
                it4.next().getValue().m18453x1(c4459os.Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
            it4.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m18338kk(C4459os c4459os) {
        this.f12277x1 = c4459os.Clone();
    }

    /* JADX INFO: renamed from: m9 */
    public final C4489zj m18340m9() {
        return this.f12276to.Clone();
    }

    /* JADX INFO: renamed from: to */
    public final C4459os m18341to() {
        return this.f12274k4.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public final C4483x1 m18342x1() {
        if (this.f12273du.size() == 0) {
            return null;
        }
        return this.f12273du.getValues().get_Item(this.f12273du.size() / 2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18333k4(C4459os c4459os) {
        IGenericEnumerator<KeyValuePair<Long, C4483x1>> it = this.f12273du.iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().m18453x1(c4459os.Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m18339kk() {
        return this.f12273du.size() > 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18343x1(C4459os c4459os) {
        this.f12274k4 = c4459os.Clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m18334k4(C4469to c4469to) {
        IGenericEnumerator it = new SortedList(c4469to.f12273du).iterator();
        while (it.hasNext()) {
            try {
                ((C4483x1) ((KeyValuePair) it.next()).getValue()).m18447k4(this);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18344x1(C4483x1 c4483x1) {
        this.f12273du.removeItemByKey(Long.valueOf(c4483x1.m18443k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18335k4(C4483x1 c4483x1) {
        this.f12273du.set_Item(Long.valueOf(c4483x1.m18443k4()), c4483x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18336k4(C4489zj c4489zj) {
        this.f12276to = c4489zj.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18337k4(boolean z) {
        this.f12275kk = z;
    }
}
