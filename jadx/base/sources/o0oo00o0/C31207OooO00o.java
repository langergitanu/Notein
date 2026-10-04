package o0oo00o0;

import com.miui.penengine.colorpick.MiuiColorPick;
import com.miui.penengine.posture.MiuiStylusPosture;
import com.miui.penengine.touchfilm.MiuiTouchFilmUtils;
import java.util.Set;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0oo00o.C31201OooO0O0;
import o0oo00o.C31202OooO0OO;
import o0oo00o.C31203OooO0Oo;
import o0oo00o.C31204OooO0o;
import o0oo00o.C31205OooO0o0;
import o0oo00oO.InterfaceC31211OooO0Oo;
import o0oo00oO.InterfaceC31213OooO0oO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOOO;

/* JADX INFO: renamed from: o0oo00o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31207OooO00o implements InterfaceC31211OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f111277OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC31213OooO0oO f111278OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C31204OooO0o f111279OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C31205OooO0o0 f111280OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C31203OooO0Oo f111281OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C31202OooO0OO f111282OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C31201OooO0O0 f111283OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Set<InterfaceC31211OooO0Oo.OooO00o> f111284OooO0oo;

    public C31207OooO00o(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, InterfaceC31213OooO0oO interfaceC31213OooO0oO) {
        this.f111277OooO00o = abstractApplicationC26277OooOoOO;
        this.f111278OooO0O0 = interfaceC31213OooO0oO;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("XiaomiPenCapabilityProvider");
        c20358OooO00o.OooO00o("XiaomiPenCapabilityProvider initialized", new Object[0]);
        this.f111284OooO0oo = OooOOO.OoooOo0(new InterfaceC31211OooO0Oo.OooO00o[]{InterfaceC31211OooO0Oo.OooO00o.f111300OooOo, InterfaceC31211OooO0Oo.OooO00o.f111301OooOo0o, InterfaceC31211OooO0Oo.OooO00o.f111303OooOoO0, InterfaceC31211OooO0Oo.OooO00o.f111304OooOoOO, InterfaceC31211OooO0Oo.OooO00o.f111302OooOoO});
    }

    @Override // o0oo00oO.InterfaceC31211OooO0Oo
    public final <T> T OooO00o(InterfaceC31211OooO0Oo.OooO00o oooO00o) {
        T t;
        int iOrdinal = oooO00o.ordinal();
        if (iOrdinal == 0) {
            T t2 = (T) this.f111279OooO0OO;
            if (t2 != null) {
                return t2;
            }
        } else if (iOrdinal == 1) {
            T t3 = (T) this.f111280OooO0Oo;
            if (t3 != null) {
                return t3;
            }
        } else if (iOrdinal == 2) {
            T t4 = (T) this.f111282OooO0o0;
            if (t4 != null) {
                return t4;
            }
        } else if (iOrdinal == 3) {
            T t5 = (T) this.f111283OooO0oO;
            if (t5 != null) {
                return t5;
            }
        } else if (iOrdinal == 4 && (t = (T) this.f111281OooO0o) != null) {
            return t;
        }
        return null;
    }

    public final Set<InterfaceC31211OooO0Oo.OooO00o> OooO0O0() {
        return o0O0o000.OooO00o.OooO0OO() ? this.f111284OooO0oo : C34438OooOoo0.f123458OooOo0o;
    }

    @Override // o0oo00oO.InterfaceC31211OooO0Oo
    public final boolean initialize() {
        if (!o0O0o000.OooO00o.OooO0OO()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("XiaomiPenCapabilityProvider");
            c20358OooO00o.OooOO0O("Device not supported, initialization failed", new Object[0]);
            return false;
        }
        boolean zContains = OooO0O0().contains(InterfaceC31211OooO0Oo.OooO00o.f111301OooOo0o);
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f111277OooO00o;
        if (zContains) {
            C31204OooO0o c31204OooO0o = new C31204OooO0o(abstractApplicationC26277OooOoOO, this.f111278OooO0O0);
            try {
                boolean zInit = MiuiTouchFilmUtils.init(c31204OooO0o.f111270OooO0o0, c31204OooO0o.f111271OooO0oO);
                c31204OooO0o.f111269OooO0o = zInit;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooO00o("MiuiTouchFilmUtils.init returned: " + zInit, new Object[0]);
                if (c31204OooO0o.f111269OooO0o) {
                    c31204OooO0o.OooO0Oo();
                    c20358OooO00o2.OooOOO0("XiaomiStylusEvent");
                    c20358OooO00o2.OooO00o("Xiaomi PenEngine SDK initialized with TouchFilm support", new Object[0]);
                }
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("XiaomiStylusEvent");
                c20358OooO00o3.OooO0Oo(e, "Failed to initialize Xiaomi PenEngine SDK", new Object[0]);
            }
            this.f111279OooO0OO = c31204OooO0o;
        }
        if (OooO0O0().contains(InterfaceC31211OooO0Oo.OooO00o.f111300OooOo)) {
            this.f111280OooO0Oo = new C31205OooO0o0(abstractApplicationC26277OooOoOO);
        }
        if (OooO0O0().contains(InterfaceC31211OooO0Oo.OooO00o.f111303OooOoO0)) {
            C31202OooO0OO c31202OooO0OO = new C31202OooO0OO();
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("XiaomiHoverPreview");
            c20358OooO00o4.OooO00o("XiaomiHoverPreviewCapability initialized (empty implementation)", new Object[0]);
            this.f111282OooO0o0 = c31202OooO0OO;
        }
        if (OooO0O0().contains(InterfaceC31211OooO0Oo.OooO00o.f111304OooOoOO)) {
            C31203OooO0Oo c31203OooO0Oo = new C31203OooO0Oo(abstractApplicationC26277OooOoOO);
            c31203OooO0Oo.initialize();
            this.f111281OooO0o = c31203OooO0Oo;
        }
        if (OooO0O0().contains(InterfaceC31211OooO0Oo.OooO00o.f111302OooOoO)) {
            C31201OooO0O0 c31201OooO0O0 = new C31201OooO0O0(abstractApplicationC26277OooOoOO);
            try {
                if (MiuiColorPick.init(abstractApplicationC26277OooOoOO)) {
                    c31201OooO0O0.f111259OooO0O0 = true;
                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5.OooOOO0("XiaomiColorPickCapability");
                    c20358OooO00o5.OooO0o0("XiaomiColorPickCapability initialized successfully", new Object[0]);
                } else {
                    C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o6.OooOOO0("XiaomiColorPickCapability");
                    c20358OooO00o6.OooO00o("Not support device.", new Object[0]);
                }
            } catch (Exception e2) {
                C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o7.OooOOO0("XiaomiColorPickCapability");
                c20358OooO00o7.OooO0Oo(e2, "Failed to initialize XiaomiColorPickCapability", new Object[0]);
            }
            this.f111283OooO0oO = c31201OooO0O0;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o8.OooOOO0("XiaomiPenCapabilityProvider");
        c20358OooO00o8.OooO0o0("Xiaomi pen capabilities initialized successfully", new Object[0]);
        return true;
    }

    @Override // o0oo00oO.InterfaceC31211OooO0Oo
    public final void release() {
        C31204OooO0o c31204OooO0o = this.f111279OooO0OO;
        if (c31204OooO0o != null) {
            c31204OooO0o.f111288OooO0Oo.OooO0Oo(null);
        }
        if (this.f111282OooO0o0 != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("XiaomiHoverPreview");
            c20358OooO00o.OooO00o("XiaomiHoverPreviewCapability released", new Object[0]);
        }
        C31203OooO0Oo c31203OooO0Oo = this.f111281OooO0o;
        if (c31203OooO0Oo != null && c31203OooO0Oo.f111262OooO0O0) {
            try {
                MiuiStylusPosture.destroy();
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("XiaomiPosture");
                c20358OooO00o2.OooO00o("XiaomiPostureCapability released", new Object[0]);
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("XiaomiPosture");
                c20358OooO00o3.OooO0Oo(e, "Error releasing XiaomiPostureCapability", new Object[0]);
            }
            c31203OooO0Oo.f111262OooO0O0 = false;
        }
        C31201OooO0O0 c31201OooO0O0 = this.f111283OooO0oO;
        if (c31201OooO0O0 != null && c31201OooO0O0.f111259OooO0O0) {
            try {
                MiuiColorPick.destroy();
                c31201OooO0O0.f111258OooO00o = null;
                c31201OooO0O0.f111259OooO0O0 = false;
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("XiaomiColorPickCapability");
                c20358OooO00o4.OooO0o0("XiaomiColorPickCapability released", new Object[0]);
            } catch (Exception e2) {
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("XiaomiColorPickCapability");
                c20358OooO00o5.OooO0Oo(e2, "Failed to release XiaomiColorPickCapability", new Object[0]);
            }
        }
        this.f111279OooO0OO = null;
        this.f111280OooO0Oo = null;
        this.f111282OooO0o0 = null;
        this.f111281OooO0o = null;
        this.f111283OooO0oO = null;
    }
}
