package o0O00Oo;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0OO<TResult> implements o0O00OOO.OooO0O0<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O00OOO.OooO0OO<TResult> f88162OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f88163OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f88164OooO0OO = new Object();

    public OooO0OO(Executor executor, o0O00OOO.OooO0OO<TResult> oooO0OO) {
        this.f88162OooO00o = oooO0OO;
        this.f88163OooO0O0 = executor;
    }

    @Override // o0O00OOO.OooO0O0
    public final void OooO00o(C25840OooO0oo c25840OooO0oo) {
        this.f88163OooO0O0.execute(new OooO0O0(this, c25840OooO0oo));
    }
}
