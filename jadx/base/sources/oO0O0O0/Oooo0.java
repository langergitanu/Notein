package oO0O0O0;

import OooOoOO.C20519OooO0Oo;
import java.lang.reflect.Member;
import kotlin.jvm.internal.AbstractC24015OooO0Oo;
import oO00ooO.EnumC32441OooOO0O;
import oO0O0O0.AbstractC32570Oooo0O0;
import oO0O0Oo0.C32697OoooO00;
import oOoo0.InterfaceC34602OooOO0o;
import oOoo0.InterfaceC34605OooOOOO;

/* JADX INFO: loaded from: classes10.dex */
public class Oooo0<D, E, V> extends AbstractC32570Oooo0O0<V> implements InterfaceC34605OooOOOO<D, E, V> {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Object f117040Oooo0;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Object f117041Oooo0O0;

    public static final class OooO00o<D, E, V> extends AbstractC32570Oooo0O0.OooO0O0<V> implements InterfaceC34605OooOOOO.OooO00o<D, E, V> {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final Oooo0<D, E, V> f117042OooOooo;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Oooo0<D, E, ? extends V> property) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(property, "property");
            this.f117042OooOooo = property;
        }

        @Override // oO0O0O0.AbstractC32570Oooo0O0.OooO00o
        public final AbstractC32570Oooo0O0 OooOOo() {
            return this.f117042OooOooo;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final V invoke(D d, E e) {
            return ((OooO00o) this.f117042OooOooo.f117040Oooo0.getValue()).call(d, e);
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OooO00o<D, E, ? extends V>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<D, E, V> f117043OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Oooo0<D, E, ? extends V> oooo0) {
            super(0);
            this.f117043OooOo0o = oooo0;
        }

        @Override // oO0O000o.OooO00o
        public final Object invoke() {
            return new OooO00o(this.f117043OooOo0o);
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Member> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<D, E, V> f117044OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Oooo0<D, E, ? extends V> oooo0) {
            super(0);
            this.f117044OooOo0o = oooo0;
        }

        @Override // oO0O000o.OooO00o
        public final Member invoke() {
            return this.f117044OooOo0o.OooOOo0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(AbstractC32552OooOOo container, String name, String signature) {
        super(container, name, signature, AbstractC24015OooO0Oo.NO_RECEIVER);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(signature, "signature");
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116633OooOo;
        this.f117040Oooo0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0O0(this));
        this.f117041Oooo0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0OO(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0O0O0.AbstractC32570Oooo0O0
    public final AbstractC32570Oooo0O0.OooO0O0 OooOo00() {
        return (OooO00o) this.f117040Oooo0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34602OooOO0o
    public final InterfaceC34602OooOO0o.OooO00o getGetter() {
        return (OooO00o) this.f117040Oooo0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final V invoke(D d, E e) {
        return ((OooO00o) this.f117040Oooo0.getValue()).call(d, e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOoo0.InterfaceC34602OooOO0o
    public final InterfaceC34605OooOOOO.OooO00o getGetter() {
        return (OooO00o) this.f117040Oooo0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(AbstractC32552OooOOo container, C32697OoooO00 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116633OooOo;
        this.f117040Oooo0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0O0(this));
        this.f117041Oooo0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0OO(this));
    }
}
