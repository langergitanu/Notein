package OooOoo0;

import OoooOoO.InterfaceC21233OooO0o;
import Ooooo00.C21246OooO0OO;
import OooooO0.C21291OooO0oO;
import OooooO0.C21293OooOO0;
import OooooOO.AbstractC21365o0OoOo0;
import OooooOO.InterfaceC21361o00oO0O;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f59344OooO00o = 30;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final InterfaceC21233OooO0o f59345OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final InterfaceC21233OooO0o f59346OooO0OO;

    public static final class OooO00o implements InterfaceC21361o00oO0O {
        @Override // OooooOO.InterfaceC21361o00oO0O
        public final AbstractC21365o0OoOo0 OooO00o(long j, EnumC24238OooOOO layoutDirection, InterfaceC24229OooO0OO density) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.OooOOO0.OooO0oO(density, "density");
            float fO0OoOo0 = density.o0OoOo0(Oooo0.f59344OooO00o);
            return new AbstractC21365o0OoOo0.OooO0O0(new C21291OooO0oO(0.0f, -fO0OoOo0, C21293OooOO0.OooO0Oo(j), C21293OooOO0.OooO0O0(j) + fO0OoOo0));
        }
    }

    public static final class OooO0O0 implements InterfaceC21361o00oO0O {
        @Override // OooooOO.InterfaceC21361o00oO0O
        public final AbstractC21365o0OoOo0 OooO00o(long j, EnumC24238OooOOO layoutDirection, InterfaceC24229OooO0OO density) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.OooOOO0.OooO0oO(density, "density");
            float fO0OoOo0 = density.o0OoOo0(Oooo0.f59344OooO00o);
            return new AbstractC21365o0OoOo0.OooO0O0(new C21291OooO0oO(-fO0OoOo0, 0.0f, C21293OooOO0.OooO0Oo(j) + fO0OoOo0, C21293OooOO0.OooO0O0(j)));
        }
    }

    static {
        InterfaceC21233OooO0o.OooO00o oooO00o = InterfaceC21233OooO0o.OooO00o.f61602OooOo0o;
        f59345OooO0O0 = C21246OooO0OO.OooO0Oo(oooO00o, new OooO00o());
        f59346OooO0OO = C21246OooO0OO.OooO0Oo(oooO00o, new OooO0O0());
    }
}
