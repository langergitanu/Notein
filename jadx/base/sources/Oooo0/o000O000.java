package Oooo0;

import OooOoo.InterfaceC20643OoooooO;
import Oooo0oO.C21059Oooo0oo;
import Oooo0oO.C21105o000OoO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 implements InterfaceC20643OoooooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20643OoooooO f60124OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C21059Oooo0oo f60125OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C21059Oooo0oo f60126OooO0OO;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C20888o000Ooo f60127OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C20888o000Ooo c20888o000Ooo) {
            super(0);
            this.f60127OooOo0o = c20888o000Ooo;
        }

        @Override // oO0O000o.OooO00o
        public final Boolean invoke() {
            return Boolean.valueOf(this.f60127OooOo0o.OooO00o() > 0.0f);
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C20888o000Ooo f60128OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C20888o000Ooo c20888o000Ooo) {
            super(0);
            this.f60128OooOo0o = c20888o000Ooo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0O000o.OooO00o
        public final Boolean invoke() {
            C20888o000Ooo c20888o000Ooo = this.f60128OooOo0o;
            return Boolean.valueOf(c20888o000Ooo.OooO00o() < ((Number) c20888o000Ooo.f60201OooO0O0.getValue()).floatValue());
        }
    }

    public o000O000(InterfaceC20643OoooooO interfaceC20643OoooooO, C20888o000Ooo c20888o000Ooo) {
        this.f60124OooO00o = interfaceC20643OoooooO;
        this.f60125OooO0O0 = C21105o000OoO.OooO0O0(new OooO0O0(c20888o000Ooo));
        this.f60126OooO0OO = C21105o000OoO.OooO0O0(new OooO00o(c20888o000Ooo));
    }

    @Override // OooOoo.InterfaceC20643OoooooO
    public final Object OooO00o(OooOoo0.o00000O o00000o, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return this.f60124OooO00o.OooO00o(o00000o, interfaceC32508OooOOOo, abstractC32479OooO0OO);
    }

    @Override // OooOoo.InterfaceC20643OoooooO
    public final boolean OooO0O0() {
        return this.f60124OooO00o.OooO0O0();
    }

    @Override // OooOoo.InterfaceC20643OoooooO
    public final boolean OooO0OO() {
        return ((Boolean) this.f60125OooO0O0.getValue()).booleanValue();
    }

    @Override // OooOoo.InterfaceC20643OoooooO
    public final float OooO0Oo(float f) {
        return this.f60124OooO00o.OooO0Oo(f);
    }

    @Override // OooOoo.InterfaceC20643OoooooO
    public final boolean OooO0o0() {
        return ((Boolean) this.f60126OooO0OO.getValue()).booleanValue();
    }
}
