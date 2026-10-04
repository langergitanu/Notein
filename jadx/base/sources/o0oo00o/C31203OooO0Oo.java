package o0oo00o;

import android.view.MotionEvent;
import com.miui.penengine.posture.MiuiStylusPosture;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0oo00oO.InterfaceC31212OooO0o0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo00o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31203OooO0Oo implements InterfaceC31212OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f111261OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f111262OooO0O0;

    public C31203OooO0Oo(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f111261OooO00o = abstractApplicationC26277OooOoOO;
    }

    @Override // o0oo00oO.InterfaceC31212OooO0o0
    public final int OooO00o() {
        return MiuiStylusPosture.getDegree();
    }

    @Override // o0oo00oO.InterfaceC31212OooO0o0
    public final boolean OooO0O0(MotionEvent motionEvent) {
        if (this.f111262OooO0O0) {
            try {
                return MiuiStylusPosture.genericMotionEvent(motionEvent);
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("XiaomiPosture");
                c20358OooO00o.OooO0Oo(e, "Error processing generic motion event", new Object[0]);
            }
        }
        return false;
    }

    @Override // o0oo00oO.InterfaceC31212OooO0o0
    public final boolean initialize() {
        try {
            boolean zInit = MiuiStylusPosture.init(this.f111261OooO00o);
            if (!zInit) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("XiaomiPosture");
                c20358OooO00o.OooOO0O("XiaomiPostureCapability not supported on this device", new Object[0]);
                return zInit;
            }
            this.f111262OooO0O0 = true;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("XiaomiPosture");
            c20358OooO00o2.OooO00o("XiaomiPostureCapability initialized successfully", new Object[0]);
            return zInit;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("XiaomiPosture");
            c20358OooO00o3.OooO0Oo(e, "Failed to initialize XiaomiPostureCapability", new Object[0]);
            return false;
        }
    }

    @Override // o0oo00oO.InterfaceC31212OooO0o0
    public final boolean isSupported() {
        return this.f111262OooO0O0;
    }
}
