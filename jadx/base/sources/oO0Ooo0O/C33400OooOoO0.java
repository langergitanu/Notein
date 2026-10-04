package oO0Ooo0O;

import oO0Ooo0O.C33416Oooo0oo;
import oOo00Oo0.C34502OooO00o;
import oOo00Oo0.InterfaceC34503OooO0O0;

/* JADX INFO: renamed from: oO0Ooo0O.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33400OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34502OooO00o<InterfaceC34503OooO0O0> f120757OooO00o = new C34502OooO00o<>("ApplicationPluginRegistry");

    public static final Object OooO00o(oO000o0.OooO0o oooO0o) {
        C33416Oooo0oo.C33417OooO0Oo c33417OooO0Oo = C33416Oooo0oo.f120800OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0o, "<this>");
        Object objOooO0O0 = OooO0O0(oooO0o, c33417OooO0Oo);
        if (objOooO0O0 != null) {
            return objOooO0O0;
        }
        throw new IllegalStateException("Plugin " + c33417OooO0Oo + " is not installed. Consider using `install(" + C33416Oooo0oo.f120801OooO0OO + ")` in client config first.");
    }

    public static final <B, F> F OooO0O0(oO000o0.OooO0o oooO0o, InterfaceC33394OooOo<? extends B, F> plugin) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0o, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(plugin, "plugin");
        InterfaceC34503OooO0O0 interfaceC34503OooO0O0 = (InterfaceC34503OooO0O0) oooO0o.f114958OooOooo.OooO0OO(f120757OooO00o);
        if (interfaceC34503OooO0O0 != null) {
            return (F) interfaceC34503OooO0O0.OooO0OO(plugin.getKey());
        }
        return null;
    }
}
