package oO0O0O0;

import OooOoOO.C20519OooO0Oo;
import java.lang.reflect.Member;
import oO00ooO.EnumC32441OooOO0O;
import oO0O0O0.AbstractC32570Oooo0O0;
import oO0O0Oo0.C32697OoooO00;
import oOoo0.InterfaceC34602OooOO0o;
import oOoo0.InterfaceC34603OooOOO;

/* JADX INFO: renamed from: oO0O0O0.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32569Oooo00o<T, V> extends AbstractC32570Oooo0O0<V> implements InterfaceC34603OooOOO<T, V> {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Object f117047Oooo0;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Object f117048Oooo0O0;

    /* JADX INFO: renamed from: oO0O0O0.Oooo00o$OooO00o */
    public static final class OooO00o<T, V> extends AbstractC32570Oooo0O0.OooO0O0<V> implements InterfaceC34603OooOOO.OooO00o<T, V> {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final C32569Oooo00o<T, V> f117049OooOooo;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(C32569Oooo00o<T, ? extends V> property) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(property, "property");
            this.f117049OooOooo = property;
        }

        @Override // oO0O0O0.AbstractC32570Oooo0O0.OooO00o
        public final AbstractC32570Oooo0O0 OooOOo() {
            return this.f117049OooOooo;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final V invoke(T t) {
            return this.f117049OooOooo.get(t);
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.Oooo00o$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OooO00o<T, ? extends V>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32569Oooo00o<T, V> f117050OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(C32569Oooo00o<T, ? extends V> c32569Oooo00o) {
            super(0);
            this.f117050OooOo0o = c32569Oooo00o;
        }

        @Override // oO0O000o.OooO00o
        public final Object invoke() {
            return new OooO00o(this.f117050OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.Oooo00o$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Member> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32569Oooo00o<T, V> f117051OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(C32569Oooo00o<T, ? extends V> c32569Oooo00o) {
            super(0);
            this.f117051OooOo0o = c32569Oooo00o;
        }

        @Override // oO0O000o.OooO00o
        public final Member invoke() {
            return this.f117051OooOo0o.OooOOo0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32569Oooo00o(AbstractC32552OooOOo container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(signature, "signature");
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116633OooOo;
        this.f117047Oooo0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0O0(this));
        this.f117048Oooo0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0OO(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0O0O0.AbstractC32570Oooo0O0
    public final AbstractC32570Oooo0O0.OooO0O0 OooOo00() {
        return (OooO00o) this.f117047Oooo0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34603OooOOO
    public final V get(T t) {
        return ((OooO00o) this.f117047Oooo0.getValue()).call(t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34603OooOOO
    public final Object getDelegate(T t) {
        return OooOOo((Member) this.f117048Oooo0O0.getValue(), t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34602OooOO0o
    public final InterfaceC34602OooOO0o.OooO00o getGetter() {
        return (OooO00o) this.f117047Oooo0.getValue();
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final V invoke(T t) {
        return get(t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34602OooOO0o
    public final InterfaceC34603OooOOO.OooO00o getGetter() {
        return (OooO00o) this.f117047Oooo0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32569Oooo00o(AbstractC32552OooOOo container, C32697OoooO00 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116633OooOo;
        this.f117047Oooo0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0O0(this));
        this.f117048Oooo0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0OO(this));
    }
}
