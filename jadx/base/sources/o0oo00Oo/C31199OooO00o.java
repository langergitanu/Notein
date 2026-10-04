package o0oo00Oo;

import OooO0O0.OooO0o;
import android.view.KeyEvent;
import kotlin.jvm.internal.OooOOO0;
import o0oo00oO.AbstractC31208OooO00o;
import o0oo00oO.InterfaceC31214OooO0oo;
import oO00ooO.C32443OooOOO;
import oO0o0OOo.C33702OooOOO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0oo00Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31199OooO00o extends AbstractC31208OooO00o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final InterfaceC31214OooO0oo.OooO0o f111255OooO0o0 = new InterfaceC31214OooO0oo.OooO0o(InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111324OooOo, System.currentTimeMillis(), Oooo0.OooO0o0(new C32443OooOOO("vendor", "lenovo")));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final InterfaceC31214OooO0oo.OooO0o f111254OooO0o = new InterfaceC31214OooO0oo.OooO0o(InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111327OooOoO0, System.currentTimeMillis(), Oooo0.OooO0o0(new C32443OooOOO("vendor", "lenovo")));

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final InterfaceC31214OooO0oo.OooO0o f111256OooO0oO = new InterfaceC31214OooO0oo.OooO0o(InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111326OooOoO, System.currentTimeMillis(), Oooo0.OooO0o0(new C32443OooOOO("vendor", "lenovo")));

    @Override // o0oo00oO.InterfaceC31214OooO0oo
    public final boolean OooO00o(KeyEvent event) {
        OooOOO0.OooO0oO(event, "event");
        if (event.getAction() == 1) {
            int keyCode = event.getKeyCode();
            InterfaceC31214OooO0oo.OooO0o oooO0o = keyCode != 601 ? keyCode != 612 ? keyCode != 613 ? null : f111254OooO0o : f111256OooO0oO : f111255OooO0o0;
            if (oooO0o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("LenovoStylusEvent");
                StringBuilder sbOooO0OO = OooO0o.OooO0OO(event.getKeyCode(), "Lenovo stylus key mapped: ", " -> ");
                sbOooO0OO.append(oooO0o.f111330OooO00o);
                c20358OooO00o.OooO00o(sbOooO0OO.toString(), new Object[0]);
                boolean z = !(this.f111288OooO0Oo.OooO0o0(oooO0o) instanceof C33702OooOOO.OooO0O0);
                c20358OooO00o.OooOOO0("LenovoStylusEvent");
                c20358OooO00o.OooO0o0("Submitted Lenovo stylus event: " + oooO0o + ", success: " + z, new Object[0]);
                return z;
            }
        }
        return false;
    }
}
