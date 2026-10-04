package o0ooOoOO;

import o0O0000o.C25830OooO00o;
import o0O000o.InterfaceC25831OooO00o;
import o0OOOO0o.OooOO0;
import o0ooOoOO.C31666OooO0OO;

/* JADX INFO: renamed from: o0ooOoOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31664OooO00o<TResult> implements InterfaceC25831OooO00o<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f113183OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C31666OooO0OO.OooO00o f113184OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f113185OooO0OO = new Object();

    /* JADX INFO: renamed from: o0ooOoOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public class RunnableC20177OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C31667OooO0Oo f113187OooOo0o;

        public RunnableC20177OooO00o(C31667OooO0Oo c31667OooO0Oo) {
            this.f113187OooOo0o = c31667OooO0Oo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C25830OooO00o c25830OooO00o;
            synchronized (C31664OooO00o.this.f113185OooO0OO) {
                OooOO0 oooOO02 = C31664OooO00o.this.f113183OooO00o;
                C31667OooO0Oo c31667OooO0Oo = this.f113187OooOo0o;
                synchronized (c31667OooO0Oo.f113197OooO00o) {
                    c25830OooO00o = c31667OooO0Oo.f113200OooO0Oo;
                }
                oooOO02.OooO00o(c25830OooO00o);
            }
        }
    }

    public C31664OooO00o(C31666OooO0OO.OooO00o oooO00o, OooOO0 oooOO02) {
        this.f113184OooO0O0 = oooO00o;
        this.f113183OooO00o = oooOO02;
    }

    @Override // o0O000o.InterfaceC25831OooO00o
    public final void OooO00o(C31667OooO0Oo c31667OooO0Oo) {
        if (c31667OooO0Oo.OooO0Oo()) {
            return;
        }
        this.f113184OooO0O0.execute(new RunnableC20177OooO00o(c31667OooO0Oo));
    }
}
