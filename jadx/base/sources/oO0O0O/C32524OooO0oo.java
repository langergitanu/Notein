package oO0O0O;

import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o00oO0O.C25515Oooo0O0;
import oO0O0Oo0.C32692Oooo0o0;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33370OooOO0;
import oOoo0.InterfaceC34602OooOO0o;
import ooOOOoOo.InterfaceC35101OooO00o;
import ooOOOoOo.InterfaceC35102OooO0O0;
import ooOOOoOo.InterfaceC35103OooO0OO;

/* JADX INFO: renamed from: oO0O0O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32524OooO0oo extends oO0O0O0o.OooOO0 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f116849OooO0oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOO0O f116850OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f116851OooO0oO;

    /* JADX INFO: renamed from: oO0O0O.OooO0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C32692Oooo0o0 f116852OooO00o;

        public OooO00o(C32692Oooo0o0 c32692Oooo0o0) {
            this.f116852OooO00o = c32692Oooo0o0;
        }
    }

    static {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f116849OooO0oo = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32524OooO0oo.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    public C32524OooO0oo(C33361OooO0Oo c33361OooO0Oo) {
        super(c33361OooO0Oo);
        this.f116851OooO0oO = c33361OooO0Oo.OooO00o(new OooOO0(this, c33361OooO0Oo));
    }

    @Override // oO0O0O0o.OooOO0
    public final InterfaceC35101OooO00o OooO0Oo() {
        return Oooo0O0();
    }

    @Override // oO0O0O0o.OooOO0
    public final Iterable OooOO0o() {
        Iterable<InterfaceC35102OooO0O0> iterableOooOO0o = super.OooOO0o();
        C33361OooO0Oo c33361OooO0Oo = this.f117109OooO0Oo;
        C32692Oooo0o0 builtInsModule = OooOO0O();
        kotlin.jvm.internal.OooOOO0.OooO0o(builtInsModule, "builtInsModule");
        return oOo000Oo.OooOo.OooooO0(iterableOooOO0o, new OooO0o(c33361OooO0Oo, builtInsModule));
    }

    @Override // oO0O0O0o.OooOO0
    public final InterfaceC35103OooO0OO OooOOOO() {
        return Oooo0O0();
    }

    public final OooOOO Oooo0O0() {
        return (OooOOO) C25515Oooo0O0.OooO00o(this.f116851OooO0oO, f116849OooO0oo[0]);
    }
}
