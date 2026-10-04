package oO0o0OOo;

import Oooo0oO.o0Oo0oo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import oO00ooO.C32460OooOooO;
import oO0o0OO.o000OO;
import oO0o0OOo.C33702OooOOO;

/* JADX INFO: renamed from: oO0o0OOo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33708OooOOoo<E> extends C33695OooO0o0<E> {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final EnumC33692OooO0OO f121492Oooo00O;

    public C33708OooOOoo(int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        super(i);
        this.f121492Oooo00O = enumC33692OooO0OO;
        if (enumC33692OooO0OO != EnumC33692OooO0OO.f121452OooOo0o) {
            if (i < 1) {
                throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + C24035Oooo00o.f80943OooO00o.OooO0O0(C33695OooO0o0.class).OooOO0() + " instead").toString());
        }
    }

    @Override // oO0o0OOo.C33695OooO0o0, oO0o0OOo.InterfaceC33715OooOoO0
    public final Object OooO0o0(E e) {
        return Oooo0oO(e, false);
    }

    @Override // oO0o0OOo.C33695OooO0o0, oO0o0OOo.InterfaceC33715OooOoO0
    public final Object OooOOO(E e, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        Object objOooo0oO = Oooo0oO(e, true);
        if (!(objOooo0oO instanceof C33702OooOOO.OooO00o)) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33702OooOOO.OooO00o(objOooo0oO);
        throw OooOo0o();
    }

    @Override // oO0o0OOo.C33695OooO0o0
    public final boolean OooOoo0() {
        return this.f121492Oooo00O == EnumC33692OooO0OO.f121451OooOo;
    }

    public final Object Oooo0oO(E e, boolean z) {
        C33704OooOOOO c33704OooOOOO;
        C33708OooOOoo<E> c33708OooOOoo;
        E e2;
        if (this.f121492Oooo00O == EnumC33692OooO0OO.f121454OooOoO0) {
            Object objOooO0o0 = super.OooO0o0(e);
            return (!(objOooO0o0 instanceof C33702OooOOO.OooO0O0) || (objOooO0o0 instanceof C33702OooOOO.OooO00o)) ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
        }
        Object obj = C33689OooO.f121436OooO0Oo;
        C33704OooOOOO c33704OooOOOO2 = (C33704OooOOOO) C33695OooO0o0.f121463OooOoo0.get(this);
        while (true) {
            long andIncrement = C33695OooO0o0.f121458OooOo.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zOooOoO = OooOoO(andIncrement, false);
            int i = C33689OooO.f121434OooO0O0;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c33704OooOOOO2.f121950OooOoO0 != j3) {
                C33704OooOOOO c33704OooOOOOOooO00o = C33695OooO0o0.OooO00o(this, j3, c33704OooOOOO2);
                if (c33704OooOOOOOooO00o != null) {
                    c33704OooOOOO = c33704OooOOOOOooO00o;
                    e2 = e;
                    c33708OooOOoo = this;
                } else if (zOooOoO) {
                    return new C33702OooOOO.OooO00o(OooOo0o());
                }
            } else {
                c33704OooOOOO = c33704OooOOOO2;
                c33708OooOOoo = this;
                e2 = e;
            }
            int iOooOOO0 = C33695OooO0o0.OooOOO0(c33708OooOOoo, c33704OooOOOO, i2, e2, j, obj, zOooOoO);
            c33704OooOOOO2 = c33704OooOOOO;
            if (iOooOOO0 == 0) {
                c33704OooOOOO2.OooO0O0();
                return C32460OooOooO.f116667OooO00o;
            }
            if (iOooOOO0 == 1) {
                return C32460OooOooO.f116667OooO00o;
            }
            if (iOooOOO0 == 2) {
                if (zOooOoO) {
                    c33704OooOOOO2.OooO();
                    return new C33702OooOOO.OooO00o(OooOo0o());
                }
                o000OO o000oo2 = obj instanceof o000OO ? (o000OO) obj : null;
                if (o000oo2 != null) {
                    o000oo2.OooO0OO(c33704OooOOOO2, i2 + i);
                }
                OooOOo((c33704OooOOOO2.f121950OooOoO0 * j2) + ((long) i2));
                return C32460OooOooO.f116667OooO00o;
            }
            if (iOooOOO0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iOooOOO0 == 4) {
                if (j < C33695OooO0o0.f121460OooOoO0.get(this)) {
                    c33704OooOOOO2.OooO0O0();
                }
                return new C33702OooOOO.OooO00o(OooOo0o());
            }
            if (iOooOOO0 == 5) {
                c33704OooOOOO2.OooO0O0();
            }
            e = e2;
        }
    }
}
