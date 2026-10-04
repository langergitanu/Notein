package oO0o0o0;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.AbstractC33602OooO00o;
import oO0o0OO.C33634Oooo000;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0o0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33855OooO0oO<T> extends AbstractC33602OooO00o<C32460OooOooO> implements oOO00OOO.OooO0OO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC33721OooO0o<T> f121979OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final oOO00OOO.OooO0O0<? super T> f121980OooOoOO;
    private volatile boolean cancellationRequested;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f121978OooOoo0 = AtomicLongFieldUpdater.newUpdater(C33855OooO0oO.class, "requested$volatile");

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121977OooOoo = AtomicReferenceFieldUpdater.newUpdater(C33855OooO0oO.class, Object.class, "producer$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public C33855OooO0oO(InterfaceC33721OooO0o<? extends T> interfaceC33721OooO0o, oOO00OOO.OooO0O0<? super T> oooO0O0, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        super(interfaceC34415OooO0oo, false, true);
        this.f121979OooOoO = interfaceC33721OooO0o;
        this.f121980OooOoOO = oooO0O0;
        this.producer$volatile = new C33852OooO0Oo(this.f121272OooOoO0, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o0OoOo0(C33855OooO0oO c33855OooO0oO, Continuation continuation) {
        C33853OooO0o c33853OooO0o;
        c33855OooO0oO.getClass();
        if (continuation instanceof C33853OooO0o) {
            c33853OooO0o = (C33853OooO0o) continuation;
            int i = c33853OooO0o.f121975OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33853OooO0o.f121975OooOoO = i - Integer.MIN_VALUE;
            } else {
                c33853OooO0o = new C33853OooO0o(c33855OooO0oO, continuation);
            }
        }
        Object obj = c33853OooO0o.f121973OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33853OooO0o.f121975OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c33853OooO0o.f121974OooOo0o = c33855OooO0oO;
                c33853OooO0o.f121975OooOoO = 1;
                Object objCollect = c33855OooO0oO.f121979OooOoO.collect(new C33851OooO0OO(c33855OooO0oO), c33853OooO0o);
                if (objCollect != obj2) {
                    objCollect = C32460OooOooO.f116667OooO00o;
                }
                if (objCollect == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c33855OooO0oO = c33853OooO0o.f121974OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            try {
                c33855OooO0oO.f121980OooOoOO.onComplete();
            } catch (Throwable th) {
                C33634Oooo000.OooO00o(th, c33855OooO0oO.f121272OooOoO0);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th2) {
            if (!c33855OooO0oO.cancellationRequested || c33855OooO0oO.isActive() || th2 != c33855OooO0oO.getCancellationException()) {
                try {
                    c33855OooO0oO.f121980OooOoOO.onError(th2);
                } catch (Throwable th3) {
                    C32435OooO0Oo.OooO00o(th2, th3);
                    C33634Oooo000.OooO00o(th2, c33855OooO0oO.f121272OooOoO0);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // oO0o0OO.o0ooOOo, oO0o0OO.InterfaceC33672o00ooo
    public final void cancel() {
        this.cancellationRequested = true;
        cancel((CancellationException) null);
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        Continuation continuation;
        if (j <= 0) {
            return;
        }
        do {
            atomicLongFieldUpdater = f121978OooOoo0;
            j2 = atomicLongFieldUpdater.get(this);
            j3 = j2 + j;
            if (j3 <= 0) {
                j3 = LocationRequestCompat.PASSIVE_INTERVAL;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        if (j2 <= 0) {
            do {
                continuation = (Continuation) f121977OooOoo.getAndSet(this, null);
            } while (continuation == null);
            continuation.resumeWith(C32460OooOooO.f116667OooO00o);
        }
    }
}
