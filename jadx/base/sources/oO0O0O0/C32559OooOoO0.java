package oO0O0O0;

import OooOoOO.C20519OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO0O0O0.AbstractC32570Oooo0O0;
import oO0O0Oo0.C32697OoooO00;
import oOoo0.InterfaceC34599OooO0oo;
import oOoo0.InterfaceC34600OooOO0;

/* JADX INFO: renamed from: oO0O0O0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32559OooOoO0<T, V> extends C32569Oooo00o<T, V> implements InterfaceC34600OooOO0<T, V> {

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final Object f117002Oooo0OO;

    /* JADX INFO: renamed from: oO0O0O0.OooOoO0$OooO00o */
    public static final class OooO00o<T, V> extends AbstractC32570Oooo0O0.OooO0OO<V> implements InterfaceC34600OooOO0.OooO00o<T, V> {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final C32559OooOoO0<T, V> f117003OooOooo;

        public OooO00o(C32559OooOoO0<T, V> property) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(property, "property");
            this.f117003OooOooo = property;
        }

        @Override // oO0O0O0.AbstractC32570Oooo0O0.OooO00o
        public final AbstractC32570Oooo0O0 OooOOo() {
            return this.f117003OooOooo;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(Object obj, Object obj2) throws oO0O0.OooO00o {
            ((OooO00o) this.f117003OooOooo.f117002Oooo0OO.getValue()).call(obj, obj2);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OooOoO0$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OooO00o<T, V>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32559OooOoO0<T, V> f117004OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C32559OooOoO0<T, V> c32559OooOoO0) {
            super(0);
            this.f117004OooOo0o = c32559OooOoO0;
        }

        @Override // oO0O000o.OooO00o
        public final Object invoke() {
            return new OooO00o(this.f117004OooOo0o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32559OooOoO0(AbstractC32552OooOOo container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(signature, "signature");
        this.f117002Oooo0OO = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new OooO0O0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34599OooO0oo, oOoo0.InterfaceC34591OooO
    public final InterfaceC34599OooO0oo.OooO00o OooO0o0() {
        return (OooO00o) this.f117002Oooo0OO.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34600OooOO0, oOoo0.InterfaceC34599OooO0oo, oOoo0.InterfaceC34591OooO
    public final InterfaceC34600OooOO0.OooO00o OooO0o0() {
        return (OooO00o) this.f117002Oooo0OO.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32559OooOoO0(AbstractC32552OooOOo container, C32697OoooO00 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        this.f117002Oooo0OO = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new OooO0O0(this));
    }
}
