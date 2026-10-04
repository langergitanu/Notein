package o0oo00o;

import android.view.KeyEvent;
import androidx.appcompat.widget.C21532OooOOo;
import com.miui.penengine.touchfilm.MiuiTouchFilmUtils;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0oo00oO.AbstractC31208OooO00o;
import o0oo00oO.InterfaceC31213OooO0oO;
import o0oo00oO.InterfaceC31214OooO0oo;
import oO00ooO.C32443OooOOO;
import oO0o0OOo.C33702OooOOO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0oo00o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31204OooO0o extends AbstractC31208OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final InterfaceC31214OooO0oo.OooO0o f111263OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final InterfaceC31214OooO0oo.OooO0o f111264OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final InterfaceC31214OooO0oo.OooO0o f111265OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final InterfaceC31214OooO0oo.OooO0o f111266OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final InterfaceC31214OooO0oo.OooO0o f111267OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final InterfaceC31214OooO0oo.OooO0o f111268OooOOO0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f111269OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f111270OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C31206OooO0oO f111271OooO0oO;

    /* JADX INFO: renamed from: o0oo00o.OooO0o$OooO00o */
    public static final class OooO00o {
        public static final InterfaceC31214OooO0oo.OooO0o OooO00o(OooO00o oooO00o, int i) {
            return new InterfaceC31214OooO0oo.OooO0o(InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111328OooOoOO, System.currentTimeMillis(), C34444Oooo0O0.OooO0oo(new C32443OooOOO("action", Integer.valueOf(i)), new C32443OooOOO("vendor", "xiaomi")));
        }
    }

    static {
        OooO00o oooO00o = new OooO00o();
        InterfaceC31214OooO0oo.EnumC31215OooO0Oo enumC31215OooO0Oo = InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111325OooOo0o;
        f111264OooO0oo = OooO00o.OooO00o(oooO00o, 1);
        f111263OooO = OooO00o.OooO00o(oooO00o, 2);
        f111265OooOO0 = OooO00o.OooO00o(oooO00o, 3);
        f111266OooOO0O = OooO00o.OooO00o(oooO00o, 4);
        f111267OooOO0o = new InterfaceC31214OooO0oo.OooO0o(InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111327OooOoO0, System.currentTimeMillis(), Oooo0.OooO0o0(new C32443OooOOO("vendor", "xiaomi")));
        f111268OooOOO0 = new InterfaceC31214OooO0oo.OooO0o(InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111326OooOoO, System.currentTimeMillis(), Oooo0.OooO0o0(new C32443OooOOO("vendor", "xiaomi")));
    }

    public C31204OooO0o(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, InterfaceC31213OooO0oO interfaceC31213OooO0oO) {
        super(interfaceC31213OooO0oO);
        this.f111270OooO0o0 = abstractApplicationC26277OooOoOO;
        this.f111271OooO0oO = new C31206OooO0oO(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @Override // o0oo00oO.InterfaceC31214OooO0oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO00o(KeyEvent event) {
        InterfaceC31214OooO0oo.OooO0o oooO0o;
        OooOOO0.OooO0oO(event, "event");
        boolean z = true;
        if (this.f111269OooO0o) {
            boolean zOnDispatchKeyEvent = MiuiTouchFilmUtils.onDispatchKeyEvent(event);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("XiaomiStylusEvent");
            c20358OooO00o.OooO00o("MiuiTouchFilmUtils.onDispatchKeyEvent returned: " + zOnDispatchKeyEvent + " for event: " + event, new Object[0]);
            if (zOnDispatchKeyEvent) {
                return true;
            }
        }
        if (event.getAction() == 1) {
            int keyCode = event.getKeyCode();
            if (keyCode == 92) {
                oooO0o = new InterfaceC31214OooO0oo.OooO0o(InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111325OooOo0o, System.currentTimeMillis(), C34444Oooo0O0.OooO0oo(new C32443OooOOO("button", InterfaceC31214OooO0oo.OooO0O0.f111321OooOo), new C32443OooOOO("vendor", "xiaomi")));
                if (oooO0o == null) {
                    boolean z2 = !(this.f111288OooO0Oo.OooO0o0(oooO0o) instanceof C33702OooOOO.OooO0O0);
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("XiaomiStylusEvent");
                    c20358OooO00o2.OooO0o0("Submitted stylus event: " + oooO0o + ", success: " + z2, new Object[0]);
                } else {
                    z = false;
                }
            } else {
                if (keyCode == 93 || keyCode == 308) {
                    oooO0o = new InterfaceC31214OooO0oo.OooO0o(InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111325OooOo0o, System.currentTimeMillis(), C34444Oooo0O0.OooO0oo(new C32443OooOOO("button", InterfaceC31214OooO0oo.OooO0O0.f111322OooOo0o), new C32443OooOOO("vendor", "xiaomi")));
                } else if (keyCode != 309) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("XiaomiStylusEvent");
                    c20358OooO00o3.OooOO0O(C21532OooOOo.OooO0OO(event.getKeyCode(), "Unhandled key event: "), new Object[0]);
                    oooO0o = null;
                }
                if (oooO0o == null) {
                }
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o4.OooOOO0("XiaomiStylusEvent");
        c20358OooO00o4.OooO0o0("processStandardStylusButtons returned: " + z + " for event: " + event, new Object[0]);
        return z;
    }

    public final void OooO0Oo() {
        OooO0OO(new InterfaceC31214OooO0oo.C31216OooO0o0(InterfaceC31214OooO0oo.OooO00o.f111312OooOoo0, System.currentTimeMillis()), f111264OooO0oo);
        OooO0OO(new InterfaceC31214OooO0oo.C31216OooO0o0(InterfaceC31214OooO0oo.OooO00o.f111310OooOoOO, System.currentTimeMillis()), f111263OooO);
        OooO0OO(new InterfaceC31214OooO0oo.C31216OooO0o0(InterfaceC31214OooO0oo.OooO00o.f111318Oooo00o, System.currentTimeMillis()), f111265OooOO0);
        OooO0OO(new InterfaceC31214OooO0oo.C31216OooO0o0(InterfaceC31214OooO0oo.OooO00o.f111317Oooo00O, System.currentTimeMillis()), f111266OooOO0O);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("XiaomiStylusEvent");
        c20358OooO00o.OooO00o("Default Xiaomi mappings set up", new Object[0]);
    }
}
