package oO0O0O0;

import OooOoOO.C20519OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O0O0.AbstractC32570Oooo0O0;
import oO0O0Oo0.C32697OoooO00;
import oOoo0.InterfaceC34599OooO0oo;

/* JADX INFO: renamed from: oO0O0O0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32558OooOoO<D, E, V> extends Oooo0<D, E, V> implements InterfaceC34599OooO0oo {

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final Object f117000Oooo0OO;

    /* JADX INFO: renamed from: oO0O0O0.OooOoO$OooO00o */
    public static final class OooO00o<D, E, V> extends AbstractC32570Oooo0O0.OooO0OO<V> implements InterfaceC32510OooOOo0 {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final C32558OooOoO<D, E, V> f117001OooOooo;

        public OooO00o(C32558OooOoO<D, E, V> property) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(property, "property");
            this.f117001OooOooo = property;
        }

        @Override // oO0O0O0.AbstractC32570Oooo0O0.OooO00o
        public final AbstractC32570Oooo0O0 OooOOo() {
            return this.f117001OooOooo;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(Object obj, Object obj2, Object obj3) throws oO0O0.OooO00o {
            ((OooO00o) this.f117001OooOooo.f117000Oooo0OO.getValue()).call(obj, obj2, obj3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32558OooOoO(AbstractC32552OooOOo container, C32697OoooO00 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        this.f117000Oooo0OO = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new C32560OooOoOO(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34599OooO0oo, oOoo0.InterfaceC34591OooO
    public final InterfaceC34599OooO0oo.OooO00o OooO0o0() {
        return (OooO00o) this.f117000Oooo0OO.getValue();
    }
}
