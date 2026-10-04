package o0O00Oo;

import androidx.lifecycle.o0ooOOo;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.InterfaceC25832OooO0Oo;
import o0O00OOO.InterfaceC25833OooO0o0;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO {

    public static class OooO00o<TResult> implements InterfaceC25832OooO0Oo, InterfaceC25833OooO0o0<TResult> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CountDownLatch f88155OooO00o = new CountDownLatch(1);

        @Override // o0O00OOO.InterfaceC25832OooO0Oo
        public final void onFailure(Exception exc) {
            this.f88155OooO00o.countDown();
        }

        @Override // o0O00OOO.InterfaceC25833OooO0o0
        public final void onSuccess(TResult tresult) {
            this.f88155OooO00o.countDown();
        }
    }

    public static C25840OooO0oo OooO00o(Callable callable, Executor executor) {
        C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        try {
            executor.execute(new o0ooOOo(1, c25834OooO0oO, callable));
        } catch (Exception e) {
            c25834OooO0oO.OooO00o(e);
        }
        return c25834OooO0oO.f88150OooO00o;
    }
}
