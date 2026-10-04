package oO0o0o0O;

import Oooo0oO.C21081o00000o0;
import Oooo0oO.C21111o0ooOoO;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.Continuation;
import o0ooOOO0.C31633OooOOO0;
import oO00o.AbstractC32318OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33664o00000Oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0o0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33859OooO0O0 extends AbstractC32318OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f121987OooO00o = AtomicLongFieldUpdater.newUpdater(C33859OooO0O0.class, "workerCounter$volatile");
    private volatile /* synthetic */ long workerCounter$volatile;

    /* JADX INFO: renamed from: oO0o0o0O.OooO0O0$OooO00o */
    public static final class OooO00o extends AbstractC32318OooO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C33664o00000Oo f121988OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long f121989OooOo0o;

        /* JADX INFO: renamed from: oO0o0o0O.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class RunnableC20337OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ InterfaceC32507OooOO0o f121990OooOo;

            public RunnableC20337OooO00o(InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
                this.f121990OooOo = interfaceC32507OooOO0o;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO00o.this.getClass();
                throw null;
            }
        }

        public OooO00o(long j) {
            this.f121989OooOo0o = j;
            C33664o00000Oo c33664o00000Oo = new C33664o00000Oo(null);
            this.f121988OooOo = c33664o00000Oo;
            InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(c33664o00000Oo, null);
            throw null;
        }

        @Override // oO00o.AbstractC32318OooO0o.OooO0O0
        public final InterfaceC32925OooO0O0 OooO00o(Runnable runnable, long j, TimeUnit timeUnit) {
            return C21081o00000o0.OooO00o(null, runnable, timeUnit.toMillis(j), new C33858OooO00o(this, 0));
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("null (worker ");
            sb.append(this.f121989OooOo0o);
            sb.append(", ");
            return C21111o0ooOoO.OooO0OO(!C33633Oooo0.OooO0o(null) ? "disposed" : AppMeasurementSdk.ConditionalUserProperty.ACTIVE, ')', sb);
        }
    }

    /* JADX INFO: renamed from: oO0o0o0O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.rx3.DispatcherScheduler$scheduleDirect$1$1$1", m80623f = "RxScheduler.kt", m80624l = {56}, m80625m = "invokeSuspend")
    public static final class C20338OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> f121992OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121993OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20338OooO0O0(InterfaceC32507OooOO0o<? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32507OooOO0o, Continuation<? super C20338OooO0O0> continuation) {
            super(2, continuation);
            this.f121992OooOo = interfaceC32507OooOO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C20338OooO0O0(this.f121992OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C20338OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121993OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f121993OooOo0o = 1;
                if (this.f121992OooOo.invoke(this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0o0o0O.OooO0O0$OooO0OO */
    public static final class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32507OooOO0o f121994OooOo;

        public OooO0OO(InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
            this.f121994OooOo = interfaceC32507OooOO0o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C33859OooO0O0.this.getClass();
            C33609OooO0oo.OooO0OO(null, null, null, new C20338OooO0O0(this.f121994OooOo, null), 3);
        }
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final AbstractC32318OooO0o.OooO0O0 OooO00o() {
        new OooO00o(f121987OooO00o.getAndIncrement(this));
        throw null;
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final InterfaceC32925OooO0O0 OooO0OO(Runnable runnable, long j, TimeUnit timeUnit) {
        return C21081o00000o0.OooO00o(null, runnable, timeUnit.toMillis(j), new C31633OooOOO0(this, 1));
    }

    public final String toString() {
        throw null;
    }
}
