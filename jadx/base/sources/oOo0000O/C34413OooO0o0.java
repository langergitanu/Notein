package oOo0000O;

import Oooo0oO.C21111o0ooOoO;
import java.io.Serializable;
import kotlin.jvm.internal.C24033OooOooo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oOo0000O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34413OooO0o0 implements InterfaceC34415OooO0oo, Serializable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo.OooO0O0 f123423OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f123424OooOo0o;

    /* JADX INFO: renamed from: oOo0000O.OooO0o0$OooO00o */
    public static final class OooO00o implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC34415OooO0oo[] f123425OooOo0o;

        public OooO00o(InterfaceC34415OooO0oo[] interfaceC34415OooO0ooArr) {
            this.f123425OooOo0o = interfaceC34415OooO0ooArr;
        }

        private final Object readResolve() {
            InterfaceC34415OooO0oo interfaceC34415OooO0ooPlus = OooO.f123416OooOo0o;
            for (InterfaceC34415OooO0oo interfaceC34415OooO0oo : this.f123425OooOo0o) {
                interfaceC34415OooO0ooPlus = interfaceC34415OooO0ooPlus.plus(interfaceC34415OooO0oo);
            }
            return interfaceC34415OooO0ooPlus;
        }
    }

    public C34413OooO0o0(InterfaceC34415OooO0oo.OooO0O0 element, InterfaceC34415OooO0oo left) {
        OooOOO0.OooO0oO(left, "left");
        OooOOO0.OooO0oO(element, "element");
        this.f123424OooOo0o = left;
        this.f123423OooOo = element;
    }

    private final Object writeReplace() {
        int iOooO0O0 = OooO0O0();
        final InterfaceC34415OooO0oo[] interfaceC34415OooO0ooArr = new InterfaceC34415OooO0oo[iOooO0O0];
        final C24033OooOooo c24033OooOooo = new C24033OooOooo();
        fold(C32460OooOooO.f116667OooO00o, new InterfaceC32508OooOOOo() { // from class: oOo0000O.OooO0OO
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                InterfaceC34415OooO0oo.OooO0O0 element = (InterfaceC34415OooO0oo.OooO0O0) obj2;
                OooOOO0.OooO0oO((C32460OooOooO) obj, "<unused var>");
                OooOOO0.OooO0oO(element, "element");
                C24033OooOooo c24033OooOooo2 = c24033OooOooo;
                int i = c24033OooOooo2.f80940OooOo0o;
                c24033OooOooo2.f80940OooOo0o = i + 1;
                interfaceC34415OooO0ooArr[i] = element;
                return C32460OooOooO.f116667OooO00o;
            }
        });
        if (c24033OooOooo.f80940OooOo0o == iOooO0O0) {
            return new OooO00o(interfaceC34415OooO0ooArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int OooO0O0() {
        int i = 2;
        C34413OooO0o0 c34413OooO0o0 = this;
        while (true) {
            InterfaceC34415OooO0oo interfaceC34415OooO0oo = c34413OooO0o0.f123424OooOo0o;
            c34413OooO0o0 = interfaceC34415OooO0oo instanceof C34413OooO0o0 ? (C34413OooO0o0) interfaceC34415OooO0oo : null;
            if (c34413OooO0o0 == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zOooO0O0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34413OooO0o0) {
            C34413OooO0o0 c34413OooO0o0 = (C34413OooO0o0) obj;
            if (c34413OooO0o0.OooO0O0() == OooO0O0()) {
                C34413OooO0o0 c34413OooO0o02 = this;
                while (true) {
                    InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = c34413OooO0o02.f123423OooOo;
                    if (!OooOOO0.OooO0O0(c34413OooO0o0.get(oooO0O0.getKey()), oooO0O0)) {
                        zOooO0O0 = false;
                        break;
                    }
                    InterfaceC34415OooO0oo interfaceC34415OooO0oo = c34413OooO0o02.f123424OooOo0o;
                    if (!(interfaceC34415OooO0oo instanceof C34413OooO0o0)) {
                        OooOOO0.OooO0o0(interfaceC34415OooO0oo, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC34415OooO0oo.OooO0O0 oooO0O02 = (InterfaceC34415OooO0oo.OooO0O0) interfaceC34415OooO0oo;
                        zOooO0O0 = OooOOO0.OooO0O0(c34413OooO0o0.get(oooO0O02.getKey()), oooO0O02);
                        break;
                    }
                    c34413OooO0o02 = (C34413OooO0o0) interfaceC34415OooO0oo;
                }
                if (zOooO0O0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return interfaceC32508OooOOOo.invoke((Object) this.f123424OooOo0o.fold(r, interfaceC32508OooOOOo), this.f123423OooOo);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> key) {
        OooOOO0.OooO0oO(key, "key");
        C34413OooO0o0 c34413OooO0o0 = this;
        while (true) {
            E e = (E) c34413OooO0o0.f123423OooOo.get(key);
            if (e != null) {
                return e;
            }
            InterfaceC34415OooO0oo interfaceC34415OooO0oo = c34413OooO0o0.f123424OooOo0o;
            if (!(interfaceC34415OooO0oo instanceof C34413OooO0o0)) {
                return (E) interfaceC34415OooO0oo.get(key);
            }
            c34413OooO0o0 = (C34413OooO0o0) interfaceC34415OooO0oo;
        }
    }

    public final int hashCode() {
        return this.f123423OooOo.hashCode() + this.f123424OooOo0o.hashCode();
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> key) {
        OooOOO0.OooO0oO(key, "key");
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = this.f123423OooOo;
        InterfaceC34415OooO0oo.OooO0O0 oooO0O02 = oooO0O0.get(key);
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f123424OooOo0o;
        if (oooO0O02 != null) {
            return interfaceC34415OooO0oo;
        }
        InterfaceC34415OooO0oo interfaceC34415OooO0ooMinusKey = interfaceC34415OooO0oo.minusKey(key);
        return interfaceC34415OooO0ooMinusKey == interfaceC34415OooO0oo ? this : interfaceC34415OooO0ooMinusKey == OooO.f123416OooOo0o ? oooO0O0 : new C34413OooO0o0(oooO0O0, interfaceC34415OooO0ooMinusKey);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return InterfaceC34415OooO0oo.OooO00o.OooO00o(this, interfaceC34415OooO0oo);
    }

    public final String toString() {
        return C21111o0ooOoO.OooO0OO((String) fold("", new C34411OooO0Oo()), ']', new StringBuilder("["));
    }
}
