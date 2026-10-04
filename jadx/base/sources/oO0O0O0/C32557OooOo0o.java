package oO0O0O0;

import OooOoOO.C20519OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO0O0O0.AbstractC32570Oooo0O0;
import oO0O0Oo0.C32697OoooO00;
import oOoo0.InterfaceC34591OooO;
import oOoo0.InterfaceC34599OooO0oo;

/* JADX INFO: renamed from: oO0O0O0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32557OooOo0o<V> extends C32566OooOooo<V> implements InterfaceC34591OooO<V> {

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final Object f116998Oooo0OO;

    /* JADX INFO: renamed from: oO0O0O0.OooOo0o$OooO00o */
    public static final class OooO00o<R> extends AbstractC32570Oooo0O0.OooO0OO<R> implements InterfaceC34591OooO.OooO00o<R> {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final C32557OooOo0o<R> f116999OooOooo;

        public OooO00o(C32557OooOo0o<R> property) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(property, "property");
            this.f116999OooOooo = property;
        }

        @Override // oO0O0O0.AbstractC32570Oooo0O0.OooO00o
        public final AbstractC32570Oooo0O0 OooOOo() {
            return this.f116999OooOooo;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Object obj) throws oO0O0.OooO00o {
            this.f116999OooOooo.set(obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32557OooOo0o(AbstractC32552OooOOo container, C32697OoooO00 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        this.f116998Oooo0OO = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new OooOo(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34599OooO0oo, oOoo0.InterfaceC34591OooO
    public final InterfaceC34599OooO0oo.OooO00o OooO0o0() {
        return (OooO00o) this.f116998Oooo0OO.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34591OooO
    public final void set(V v) throws oO0O0.OooO00o {
        ((OooO00o) this.f116998Oooo0OO.getValue()).call(v);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34591OooO
    public final InterfaceC34591OooO.OooO00o OooO0o0() {
        return (OooO00o) this.f116998Oooo0OO.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32557OooOo0o(AbstractC32552OooOOo container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(signature, "signature");
        this.f116998Oooo0OO = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new OooOo(this));
    }
}
