package o0O00Oo;

import java.util.concurrent.Executor;
import o0O00OOO.InterfaceC25832OooO0Oo;

/* JADX INFO: renamed from: o0O00Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C25838OooO0o0<TResult> implements o0O00OOO.OooO0O0<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25832OooO0Oo f88169OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f88170OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f88171OooO0OO = new Object();

    public C25838OooO0o0(Executor executor, InterfaceC25832OooO0Oo interfaceC25832OooO0Oo) {
        this.f88169OooO00o = interfaceC25832OooO0Oo;
        this.f88170OooO0O0 = executor;
    }

    @Override // o0O00OOO.OooO0O0
    public final void OooO00o(C25840OooO0oo c25840OooO0oo) {
        if (c25840OooO0oo.OooO()) {
            return;
        }
        this.f88170OooO0O0.execute(new RunnableC25837OooO0Oo(this, c25840OooO0oo));
    }
}
