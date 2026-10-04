package o0O00Oo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import o0O00OOO.C25835OooO0oo;
import o0O00OOO.InterfaceC25832OooO0Oo;
import o0O00OOO.InterfaceC25833OooO0o0;

/* JADX INFO: renamed from: o0O00Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C25840OooO0oo<TResult> extends o0O00OOO.OooO0o<TResult> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f88176OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TResult f88177OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Exception f88178OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f88175OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f88179OooO0o0 = new ArrayList();

    @Override // o0O00OOO.OooO0o
    public final boolean OooO() {
        boolean z;
        synchronized (this.f88175OooO00o) {
            try {
                z = this.f88176OooO0O0 && this.f88178OooO0Oo == null;
            } finally {
            }
        }
        return z;
    }

    @Override // o0O00OOO.OooO0o
    public final o0O00OOO.OooO0o<TResult> OooO00o(o0O00OOO.OooO0OO<TResult> oooO0OO) {
        OooO0O0(C25835OooO0oo.f88151OooO0Oo.f88154OooO0OO, oooO0OO);
        return this;
    }

    @Override // o0O00OOO.OooO0o
    public final void OooO0O0(Executor executor, o0O00OOO.OooO0OO oooO0OO) {
        OooOO0(new OooO0OO(executor, oooO0OO));
    }

    @Override // o0O00OOO.OooO0o
    public final C25840OooO0oo OooO0OO(InterfaceC25832OooO0Oo interfaceC25832OooO0Oo) {
        OooOO0O(C25835OooO0oo.f88151OooO0Oo.f88154OooO0OO, interfaceC25832OooO0Oo);
        return this;
    }

    @Override // o0O00OOO.OooO0o
    public final C25840OooO0oo OooO0Oo(Executor executor, InterfaceC25833OooO0o0 interfaceC25833OooO0o0) {
        OooOO0(new C25839OooO0oO(executor, interfaceC25833OooO0o0));
        return this;
    }

    @Override // o0O00OOO.OooO0o
    public final Exception OooO0o() {
        Exception exc;
        synchronized (this.f88175OooO00o) {
            exc = this.f88178OooO0Oo;
        }
        return exc;
    }

    @Override // o0O00OOO.OooO0o
    public final C25840OooO0oo OooO0o0(InterfaceC25833OooO0o0 interfaceC25833OooO0o0) {
        OooO0Oo(C25835OooO0oo.f88151OooO0Oo.f88154OooO0OO, interfaceC25833OooO0o0);
        return this;
    }

    @Override // o0O00OOO.OooO0o
    public final TResult OooO0oO() {
        TResult tresult;
        synchronized (this.f88175OooO00o) {
            try {
                if (this.f88178OooO0Oo != null) {
                    throw new RuntimeException(this.f88178OooO0Oo);
                }
                tresult = this.f88177OooO0OO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // o0O00OOO.OooO0o
    public final boolean OooO0oo() {
        boolean z;
        synchronized (this.f88175OooO00o) {
            z = this.f88176OooO0O0;
        }
        return z;
    }

    public final void OooOO0(o0O00OOO.OooO0O0 oooO0O0) {
        boolean zOooO0oo;
        synchronized (this.f88175OooO00o) {
            try {
                zOooO0oo = OooO0oo();
                if (!zOooO0oo) {
                    this.f88179OooO0o0.add(oooO0O0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zOooO0oo) {
            oooO0O0.OooO00o(this);
        }
    }

    public final C25840OooO0oo OooOO0O(Executor executor, InterfaceC25832OooO0Oo interfaceC25832OooO0Oo) {
        OooOO0(new C25838OooO0o0(executor, interfaceC25832OooO0Oo));
        return this;
    }

    public final void OooOO0o() {
        synchronized (this.f88175OooO00o) {
            try {
                Iterator it = this.f88179OooO0o0.iterator();
                while (it.hasNext()) {
                    try {
                        try {
                            ((o0O00OOO.OooO0O0) it.next()).OooO00o(this);
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                }
                this.f88179OooO0o0 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
