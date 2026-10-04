package o0oo00o;

import com.miui.penengine.colorpick.MiuiColorPick;
import o00oOOO0.C25582OooO0O0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0oo00oO.InterfaceC31209OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo00o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31201OooO0O0 implements InterfaceC31209OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C25582OooO0O0 f111258OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f111259OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C31200OooO00o f111260OooO0OO = new C31200OooO00o(this);

    public C31201OooO0O0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
    }

    @Override // o0oo00oO.InterfaceC31209OooO0O0
    public final void OooO00o() {
        if (!this.f111259OooO0O0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("XiaomiColorPickCapability");
            c20358OooO00o.OooOO0O("ColorPickCapability not initialized", new Object[0]);
            return;
        }
        try {
            MiuiColorPick.triggerColorPicking();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("XiaomiColorPickCapability");
            c20358OooO00o2.OooO00o("Color picking triggered", new Object[0]);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("XiaomiColorPickCapability");
            c20358OooO00o3.OooO0Oo(e, "Failed to trigger color picking", new Object[0]);
        }
    }

    @Override // o0oo00oO.InterfaceC31209OooO0O0
    public final void OooO0O0(C25582OooO0O0 c25582OooO0O0) {
        this.f111258OooO00o = c25582OooO0O0;
        if (c25582OooO0O0 == null || !this.f111259OooO0O0) {
            return;
        }
        MiuiColorPick.registerColorListener(this.f111260OooO0OO);
    }

    @Override // o0oo00oO.InterfaceC31209OooO0O0
    public final boolean isSupported() {
        return this.f111259OooO0O0;
    }
}
