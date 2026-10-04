package oO0o0oOo;

import androidx.fragment.app.C21904OooOoo0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import o00OooO.C25139OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33640Oooo0o0;
import oO0o0OO.InterfaceC33611OooOO0O;
import oO0o0OO.o000OO;
import oO0o0Ooo.AbstractC33837OooOOoo;
import oO0o0Ooo.C33839OooOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0oOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33898OooO0Oo extends C33902OooO0oo implements InterfaceC33895OooO00o {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122101OooOooO = AtomicReferenceFieldUpdater.newUpdater(C33898OooO0Oo.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: renamed from: oO0o0oOo.OooO0Oo$OooO00o */
    public final class OooO00o implements InterfaceC33611OooOO0O<C32460OooOooO>, o000OO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C33614OooOOO0<C32460OooOooO> f122103OooOo0o;

        public OooO00o(C33614OooOOO0 c33614OooOOO0) {
            this.f122103OooOo0o = c33614OooOOO0;
        }

        @Override // oO0o0OO.InterfaceC33611OooOO0O
        public final C33839OooOo0 OooO0O0(Object obj, InterfaceC32510OooOOo0 interfaceC32510OooOOo0) {
            final C33898OooO0Oo c33898OooO0Oo = C33898OooO0Oo.this;
            InterfaceC32510OooOOo0 interfaceC32510OooOOo02 = new InterfaceC32510OooOOo0() { // from class: oO0o0oOo.OooO0O0
                @Override // oO0O000o.InterfaceC32510OooOOo0
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C33898OooO0Oo.f122101OooOooO;
                    this.getClass();
                    C33898OooO0Oo c33898OooO0Oo2 = c33898OooO0Oo;
                    atomicReferenceFieldUpdater.set(c33898OooO0Oo2, null);
                    c33898OooO0Oo2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                }
            };
            C33839OooOo0 c33839OooOo0Oooo000 = this.f122103OooOo0o.Oooo000((C32460OooOooO) obj, interfaceC32510OooOOo02);
            if (c33839OooOo0Oooo000 != null) {
                C33898OooO0Oo.f122101OooOooO.set(c33898OooO0Oo, null);
            }
            return c33839OooOo0Oooo000;
        }

        @Override // oO0o0OO.o000OO
        public final void OooO0OO(AbstractC33837OooOOoo<?> abstractC33837OooOOoo, int i) {
            this.f122103OooOo0o.OooO0OO(abstractC33837OooOOoo, i);
        }

        @Override // oO0o0OO.InterfaceC33611OooOO0O
        public final void OooOOOO(Object obj) {
            this.f122103OooOo0o.OooOOOO(obj);
        }

        @Override // oO0o0OO.InterfaceC33611OooOO0O
        public final void OooOOOo(Object obj, InterfaceC32510OooOOo0 interfaceC32510OooOOo0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C33898OooO0Oo.f122101OooOooO;
            C33898OooO0Oo c33898OooO0Oo = C33898OooO0Oo.this;
            atomicReferenceFieldUpdater.set(c33898OooO0Oo, null);
            final C33897OooO0OO c33897OooO0OO = new C33897OooO0OO(0, c33898OooO0Oo, this);
            C33614OooOOO0<C32460OooOooO> c33614OooOOO0 = this.f122103OooOo0o;
            c33614OooOOO0.OooOoo((C32460OooOooO) obj, c33614OooOOO0.f121326OooOoO0, new InterfaceC32510OooOOo0() { // from class: oO0o0OO.OooOO0o
                @Override // oO0O000o.InterfaceC32510OooOOo0
                public final Object invoke(Object obj2, Object obj3, Object obj4) throws Exception {
                    c33897OooO0OO.invoke((Throwable) obj2);
                    return C32460OooOooO.f116667OooO00o;
                }
            });
        }

        @Override // oO0o0OO.InterfaceC33611OooOO0O
        public final boolean cancel(Throwable th) {
            return this.f122103OooOo0o.cancel(th);
        }

        @Override // kotlin.coroutines.Continuation
        public final InterfaceC34415OooO0oo getContext() {
            return this.f122103OooOo0o.f121299OooOoOO;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            this.f122103OooOo0o.resumeWith(obj);
        }
    }

    public C33898OooO0Oo(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : C33900OooO0o0.f122104OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r0.OooOOOo(oO00ooO.C32460OooOooO.f116667OooO00o, r3.f122111OooOo);
     */
    @Override // oO0o0oOo.InterfaceC33895OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Continuation continuation) throws Throwable {
        if (OooO0o0()) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33614OooOOO0 c33614OooOOO0OooO0Oo = C25139OooOOOo.OooO0Oo(C21904OooOoo0.OooO0o0(continuation));
        try {
            OooO00o oooO00o = new OooO00o(c33614OooOOO0OooO0Oo);
            while (true) {
                int andDecrement = C33902OooO0oo.f122109OooOoo.getAndDecrement(this);
                if (andDecrement <= this.f122112OooOo0o) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (OooO0Oo(oooO00o)) {
                        break;
                    }
                }
            }
            Object objOooOOo = c33614OooOOO0OooO0Oo.OooOOo();
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            if (objOooOOo != enumC32485OooO00o) {
                objOooOOo = C32460OooOooO.f116667OooO00o;
            }
            return objOooOOo == enumC32485OooO00o ? objOooOOo : C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            c33614OooOOO0OooO0Oo.OooOoo0();
            throw th;
        }
    }

    @Override // oO0o0oOo.InterfaceC33895OooO00o
    public final boolean OooO0OO() {
        return Math.max(C33902OooO0oo.f122109OooOoo.get(this), 0) == 0;
    }

    public final boolean OooO0o0() {
        int i;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C33902OooO0oo.f122109OooOoo;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f122112OooOo0o;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    f122101OooOooO.set(this, null);
                    c = 0;
                    break;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return false;
        }
        if (c != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    @Override // oO0o0oOo.InterfaceC33895OooO00o
    public final void OooOOO0(Object obj) {
        while (OooO0OO()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122101OooOooO;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C33839OooOo0 c33839OooOo0 = C33900OooO0o0.f122104OooO00o;
            if (obj2 != c33839OooOo0) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c33839OooOo0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    release();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + C33640Oooo0o0.OooO00o(this) + "[isLocked=" + OooO0OO() + ",owner=" + f122101OooOooO.get(this) + ']';
    }
}
