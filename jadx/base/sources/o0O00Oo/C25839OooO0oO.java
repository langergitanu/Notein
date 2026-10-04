package o0O00Oo;

import java.util.concurrent.Executor;
import o0O00OOO.InterfaceC25833OooO0o0;

/* JADX INFO: renamed from: o0O00Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C25839OooO0oO<TResult> implements o0O00OOO.OooO0O0<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25833OooO0o0<TResult> f88172OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f88173OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f88174OooO0OO = new Object();

    public C25839OooO0oO(Executor executor, InterfaceC25833OooO0o0<TResult> interfaceC25833OooO0o0) {
        this.f88172OooO00o = interfaceC25833OooO0o0;
        this.f88173OooO0O0 = executor;
    }

    @Override // o0O00OOO.OooO0O0
    public final void OooO00o(C25840OooO0oo c25840OooO0oo) {
        if (c25840OooO0oo.OooO()) {
            this.f88173OooO0O0.execute(new OooO0o(this, c25840OooO0oo));
        }
    }
}
