package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.OooOOO;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22028OooO0Oo<T> {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO0OO f65806OooO0oo = new OooO0OO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final androidx.recyclerview.widget.OooO0O0 f65807OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final androidx.recyclerview.widget.OooO0OO<T> f65808OooO0O0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<T> f65812OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f65813OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CopyOnWriteArrayList f65810OooO0Oo = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<T> f65811OooO0o = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO f65809OooO0OO = f65806OooO0oo;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0Oo$OooO00o */
    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ List f65814OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ List f65815OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ Runnable f65816OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f65817OooOoO0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C19034OooO00o extends OooOOO.OooO0O0 {
            public C19034OooO00o() {
            }

            @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
            public final boolean OooO00o(int i, int i2) {
                OooO00o oooO00o = OooO00o.this;
                Object obj = oooO00o.f65815OooOo0o.get(i);
                Object obj2 = oooO00o.f65814OooOo.get(i2);
                if (obj != null && obj2 != null) {
                    return C22028OooO0Oo.this.f65808OooO0O0.f65803OooO0O0.OooO00o((T) obj, (T) obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
            public final boolean OooO0O0(int i, int i2) {
                OooO00o oooO00o = OooO00o.this;
                Object obj = oooO00o.f65815OooOo0o.get(i);
                Object obj2 = oooO00o.f65814OooOo.get(i2);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : C22028OooO0Oo.this.f65808OooO0O0.f65803OooO0O0.OooO0O0((T) obj, (T) obj2);
            }

            @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
            public final Object OooO0OO(int i, int i2) {
                OooO00o oooO00o = OooO00o.this;
                Object obj = oooO00o.f65815OooOo0o.get(i);
                Object obj2 = oooO00o.f65814OooOo.get(i2);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return C22028OooO0Oo.this.f65808OooO0O0.f65803OooO0O0.OooO0OO((T) obj, (T) obj2);
            }

            @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
            public final int OooO0Oo() {
                return OooO00o.this.f65814OooOo.size();
            }

            @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
            public final int OooO0o0() {
                return OooO00o.this.f65815OooOo0o.size();
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0Oo$OooO00o$OooO0O0 */
        public class OooO0O0 implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooOOO.C22035OooO0Oo f65821OooOo0o;

            public OooO0O0(OooOOO.C22035OooO0Oo c22035OooO0Oo) {
                this.f65821OooOo0o = c22035OooO0Oo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o = OooO00o.this;
                C22028OooO0Oo c22028OooO0Oo = C22028OooO0Oo.this;
                if (c22028OooO0Oo.f65813OooO0oO == oooO00o.f65817OooOoO0) {
                    List<T> list = c22028OooO0Oo.f65811OooO0o;
                    List<T> list2 = oooO00o.f65814OooOo;
                    c22028OooO0Oo.f65812OooO0o0 = list2;
                    c22028OooO0Oo.f65811OooO0o = Collections.unmodifiableList(list2);
                    this.f65821OooOo0o.OooO00o(c22028OooO0Oo.f65807OooO00o);
                    c22028OooO0Oo.OooO00o(list, oooO00o.f65816OooOoO);
                }
            }
        }

        public OooO00o(List list, List list2, int i, Runnable runnable) {
            this.f65815OooOo0o = list;
            this.f65814OooOo = list2;
            this.f65817OooOoO0 = i;
            this.f65816OooOoO = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C22028OooO0Oo.this.f65809OooO0OO.execute(new OooO0O0(OooOOO.OooO00o(new C19034OooO00o())));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0Oo$OooO0O0 */
    public interface OooO0O0<T> {
        void OooO00o();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0Oo$OooO0OO */
    public static class OooO0OO implements Executor {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Handler f65822OooOo0o = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f65822OooOo0o.post(runnable);
        }
    }

    public C22028OooO0Oo(androidx.recyclerview.widget.OooO0O0 oooO0O0, androidx.recyclerview.widget.OooO0OO oooO0OO) {
        this.f65807OooO00o = oooO0O0;
        this.f65808OooO0O0 = oooO0OO;
    }

    public final void OooO00o(List<T> list, Runnable runnable) {
        Iterator it = this.f65810OooO0Oo.iterator();
        while (it.hasNext()) {
            ((OooO0O0) it.next()).OooO00o();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void OooO0O0(List<T> list, Runnable runnable) {
        int i = this.f65813OooO0oO + 1;
        this.f65813OooO0oO = i;
        List<T> list2 = this.f65812OooO0o0;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f65811OooO0o;
        androidx.recyclerview.widget.OooO0O0 oooO0O0 = this.f65807OooO00o;
        if (list == null) {
            int size = list2.size();
            this.f65812OooO0o0 = null;
            this.f65811OooO0o = Collections.EMPTY_LIST;
            oooO0O0.OooO0OO(0, size);
            OooO00o(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f65808OooO0O0.f65802OooO00o.execute(new OooO00o(list2, list, i, runnable));
            return;
        }
        this.f65812OooO0o0 = list;
        this.f65811OooO0o = Collections.unmodifiableList(list);
        oooO0O0.OooO0O0(0, list.size());
        OooO00o(list3, runnable);
    }
}
