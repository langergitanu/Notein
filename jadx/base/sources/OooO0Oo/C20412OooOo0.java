package OooO0Oo;

import OooO0Oo.OooOO0O;
import java.util.ArrayList;
import java.util.Iterator;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: OooO0Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20412OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f58219OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f58220OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f58221OooO0OO;

    public C20412OooOo0(OooOO0O.InterfaceExecutorC20404OooO0o0 executor, OooOOOO oooOOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        this.f58219OooO00o = new Object();
        this.f58221OooO0OO = new ArrayList();
    }

    public final void OooO00o() {
        synchronized (this.f58219OooO00o) {
            try {
                this.f58220OooO0O0 = true;
                Iterator it = this.f58221OooO0OO.iterator();
                while (it.hasNext()) {
                    ((oO0O000o.OooO00o) it.next()).invoke();
                }
                this.f58221OooO0OO.clear();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
