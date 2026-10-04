package androidx.concurrent.futures;

import androidx.fragment.app.C21904OooOoo0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33628OooOoo;
import oO0o0OO.C33632Oooo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33642Oooo0oo;
import oO0o0OO.o0000oO;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f63608OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0000oO f63609OooO0O0 = C33649OoooOOo.f121329OooO0O0;

    public static final class OooO00o<T> implements ListenableFuture<T>, Continuation<T> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO<T> f63610OooOo = new OooO<>();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C33632Oooo f63611OooOo0o;

        public OooO00o(C33632Oooo c33632Oooo) {
            this.f63611OooOo0o = c33632Oooo;
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            this.f63610OooOo.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            boolean zCancel = this.f63610OooOo.cancel(z);
            if (zCancel) {
                this.f63611OooOo0o.cancel((CancellationException) null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() {
            return this.f63610OooOo.get();
        }

        @Override // kotlin.coroutines.Continuation
        public final InterfaceC34415OooO0oo getContext() {
            return OooOO0.f63609OooO0O0;
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f63610OooOo.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f63610OooOo.isDone();
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
            OooO<T> oooO = this.f63610OooOo;
            if (thOooO00o == null) {
                oooO.set(obj);
            } else if (thOooO00o instanceof CancellationException) {
                oooO.cancel(false);
            } else {
                oooO.setException(thOooO00o);
            }
        }

        @Override // java.util.concurrent.Future
        public final T get(long j, TimeUnit timeUnit) {
            return this.f63610OooOo.get(j, timeUnit);
        }
    }

    public static final class OooO0O0 implements InterfaceC33636Oooo00o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final AbstractC33687OooO0oO f63612OooOo0o;

        public OooO0O0() {
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            this.f63612OooOo0o = C33833OooOOOO.f121946OooO00o;
        }

        @Override // oO0o0OO.InterfaceC33636Oooo00o
        public final InterfaceC34415OooO0oo OooOOO0() {
            return this.f63612OooOo0o;
        }
    }

    public static OooO00o OooO00o(InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        oOo0000O.OooO oooO = oOo0000O.OooO.f123416OooOo0o;
        EnumC33637Oooo0O0 enumC33637Oooo0O0 = EnumC33637Oooo0O0.f121318OooOoO;
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO0O0 = C33628OooOoo.OooO0O0(f63608OooO00o, oooO);
        EnumC33637Oooo0O0 enumC33637Oooo0O02 = EnumC33637Oooo0O0.f121317OooOo0o;
        C33632Oooo c33632Oooo = new C33632Oooo(interfaceC34415OooO0ooOooO0O0, true, true);
        c33632Oooo.Ooooooo(enumC33637Oooo0O0, c33632Oooo, interfaceC32508OooOOOo);
        OooO00o oooO00o = new OooO00o(c33632Oooo);
        new oOo0000O.OooOO0(C21904OooOoo0.OooO0o0(C21904OooOoo0.OooO0OO(new OooOO0O(1, c33632Oooo, InterfaceC33642Oooo0oo.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), oooO00o)), EnumC32485OooO00o.f116726OooOo0o).resumeWith(C32460OooOooO.f116667OooO00o);
        return oooO00o;
    }
}
