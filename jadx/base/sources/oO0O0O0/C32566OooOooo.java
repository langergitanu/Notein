package oO0O0O0;

import OooOoOO.C20519OooO0Oo;
import oO00ooO.EnumC32441OooOO0O;
import oO0O0O0.AbstractC32570Oooo0O0;
import oO0O0Oo0.C32697OoooO00;
import oOoo0.InterfaceC34602OooOO0o;
import oOoo0.InterfaceC34604OooOOO0;

/* JADX INFO: renamed from: oO0O0O0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32566OooOooo<V> extends AbstractC32570Oooo0O0<V> implements InterfaceC34604OooOOO0<V> {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Object f117029Oooo0;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Object f117030Oooo0O0;

    /* JADX INFO: renamed from: oO0O0O0.OooOooo$OooO00o */
    public static final class OooO00o<R> extends AbstractC32570Oooo0O0.OooO0O0<R> implements InterfaceC34604OooOOO0.OooO00o<R> {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final C32566OooOooo<R> f117031OooOooo;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(C32566OooOooo<? extends R> property) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(property, "property");
            this.f117031OooOooo = property;
        }

        @Override // oO0O0O0.AbstractC32570Oooo0O0.OooO00o
        public final AbstractC32570Oooo0O0 OooOOo() {
            return this.f117031OooOooo;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final R invoke() {
            return ((OooO00o) this.f117031OooOooo.f117029Oooo0.getValue()).call(new Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32566OooOooo(AbstractC32552OooOOo container, C32697OoooO00 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116633OooOo;
        this.f117029Oooo0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new Oooo000(this));
        this.f117030Oooo0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C32568Oooo00O(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0O0O0.AbstractC32570Oooo0O0
    public final AbstractC32570Oooo0O0.OooO0O0 OooOo00() {
        return (OooO00o) this.f117029Oooo0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34602OooOO0o
    public final InterfaceC34602OooOO0o.OooO00o getGetter() {
        return (OooO00o) this.f117029Oooo0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0O000o.OooO00o
    public final V invoke() {
        return (V) ((OooO00o) this.f117029Oooo0.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34602OooOO0o
    public final InterfaceC34604OooOOO0.OooO00o getGetter() {
        return (OooO00o) this.f117029Oooo0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32566OooOooo(AbstractC32552OooOOo container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(signature, "signature");
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116633OooOo;
        this.f117029Oooo0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new Oooo000(this));
        this.f117030Oooo0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C32568Oooo00O(this));
    }
}
