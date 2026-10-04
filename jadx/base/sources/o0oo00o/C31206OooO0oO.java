package o0oo00o;

import Oooo0.C20860Ooooooo;
import com.miui.penengine.touchfilm.MiuiTouchFilmUtils;
import o0oo00oO.InterfaceC31214OooO0oo;
import oO0o0OOo.C33702OooOOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo00o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31206OooO0oO implements MiuiTouchFilmUtils.TouchFilmListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C31204OooO0o f111276OooO00o;

    public C31206OooO0oO(C31204OooO0o c31204OooO0o) {
        this.f111276OooO00o = c31204OooO0o;
    }

    @Override // com.miui.penengine.touchfilm.MiuiTouchFilmUtils.TouchFilmListener
    public final void onBrushPreviewChanged(boolean z) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("XiaomiStylusEvent");
        c20358OooO00o.OooO00o("Brush preview changed: " + z, new Object[0]);
    }

    @Override // com.miui.penengine.touchfilm.MiuiTouchFilmUtils.TouchFilmListener
    public final void onTouchFilmTriggered(int i) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "XiaomiStylusEvent", "Xiaomi TouchFilm function triggered: ", i), new Object[0]);
        InterfaceC31214OooO0oo.OooO0o oooO0o = null;
        switch (i) {
            case 0:
                break;
            case 1:
                oooO0o = C31204OooO0o.f111264OooO0oo;
                break;
            case 2:
                oooO0o = C31204OooO0o.f111263OooO;
                break;
            case 3:
                oooO0o = C31204OooO0o.f111265OooOO0;
                break;
            case 4:
                oooO0o = C31204OooO0o.f111266OooOO0O;
                break;
            case 5:
                oooO0o = C31204OooO0o.f111267OooOO0o;
                break;
            case 6:
                oooO0o = C31204OooO0o.f111268OooOOO0;
                break;
            default:
                c20358OooO00o.OooOO0O(C20860Ooooooo.OooO0OO(c20358OooO00o, "XiaomiStylusEvent", "Unhandled Xiaomi TouchFilm function: ", i), new Object[0]);
                break;
        }
        if (oooO0o != null) {
            boolean z = !(this.f111276OooO00o.f111288OooO0Oo.OooO0o0(oooO0o) instanceof C33702OooOOO.OooO0O0);
            c20358OooO00o.OooOOO0("XiaomiStylusEvent");
            c20358OooO00o.OooO0o0("Submitted stylus from TouchFilm, event: " + oooO0o + ", success: " + z, new Object[0]);
        }
    }
}
