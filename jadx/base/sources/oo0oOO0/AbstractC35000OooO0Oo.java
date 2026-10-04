package oo0oOO0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o00O0O0o.OooOO0O;
import o00O0OOo.InterfaceC24852OooO00o;
import o00O0Oo0.AbstractC24863OooO0OO;
import o00oOOo.C25591OooO0O0;
import o00oOOo.InterfaceC25590OooO00o;

/* JADX INFO: renamed from: oo0oOO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC35000OooO0Oo<T> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f125688OooO0o = OooOO0O.OooO0o0("ConstraintTracker");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25590OooO00o f125689OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f125690OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f125691OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashSet f125692OooO0Oo = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public T f125693OooO0o0;

    /* JADX INFO: renamed from: oo0oOO0.OooO0Oo$OooO00o */
    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f125695OooOo0o;

        public OooO00o(ArrayList arrayList) {
            this.f125695OooOo0o = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.f125695OooOo0o.iterator();
            while (it.hasNext()) {
                ((InterfaceC24852OooO00o) it.next()).OooO00o(AbstractC35000OooO0Oo.this.f125693OooO0o0);
            }
        }
    }

    public AbstractC35000OooO0Oo(Context context, InterfaceC25590OooO00o interfaceC25590OooO00o) {
        this.f125690OooO0O0 = context.getApplicationContext();
        this.f125689OooO00o = interfaceC25590OooO00o;
    }

    public abstract T OooO00o();

    public final void OooO0O0(AbstractC24863OooO0OO abstractC24863OooO0OO) {
        synchronized (this.f125691OooO0OO) {
            try {
                if (this.f125692OooO0Oo.remove(abstractC24863OooO0OO) && this.f125692OooO0Oo.isEmpty()) {
                    OooO0o0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(T t) {
        synchronized (this.f125691OooO0OO) {
            try {
                T t2 = this.f125693OooO0o0;
                if (t2 != t && (t2 == null || !t2.equals(t))) {
                    this.f125693OooO0o0 = t;
                    ((C25591OooO0O0) this.f125689OooO00o).f87295OooO0OO.execute(new OooO00o(new ArrayList(this.f125692OooO0Oo)));
                }
            } finally {
            }
        }
    }

    public abstract void OooO0Oo();

    public abstract void OooO0o0();
}
