package o0ooOoOO;

import com.hihonor.cloudservice.support.account.result.SignInAccountInfo;
import java.util.ArrayList;
import java.util.Iterator;
import o0O0000o.C25830OooO00o;
import o0O000o.InterfaceC25831OooO00o;

/* JADX INFO: renamed from: o0ooOoOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31667OooO0Oo<TResult> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f113198OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public SignInAccountInfo f113199OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C25830OooO00o f113200OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f113197OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f113201OooO0o0 = new ArrayList();

    public final void OooO00o(InterfaceC25831OooO00o interfaceC25831OooO00o) {
        boolean z;
        synchronized (this.f113197OooO00o) {
            try {
                synchronized (this.f113197OooO00o) {
                    z = this.f113198OooO0O0;
                }
                if (!z) {
                    this.f113201OooO0o0.add(interfaceC25831OooO00o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            interfaceC25831OooO00o.OooO00o(this);
        }
    }

    public final void OooO0O0() {
        synchronized (this.f113197OooO00o) {
            Iterator it = this.f113201OooO0o0.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC25831OooO00o) it.next()).OooO00o(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f113201OooO0o0 = null;
        }
    }

    public final TResult OooO0OO() {
        TResult tresult;
        synchronized (this.f113197OooO00o) {
            try {
                if (this.f113200OooO0Oo != null) {
                    throw new RuntimeException(this.f113200OooO0Oo);
                }
                tresult = (TResult) this.f113199OooO0OO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    public final boolean OooO0Oo() {
        boolean z;
        synchronized (this.f113197OooO00o) {
            try {
                z = this.f113198OooO0O0 && this.f113200OooO0Oo == null;
            } finally {
            }
        }
        return z;
    }
}
