package o0o000;

import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.screenshot.ScreenshotPanel;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO implements InterfaceC32510OooOOo0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.screenshot.OooO00o f105383OooOo0o;

    public /* synthetic */ OooO(com.orion.notein.p607ui.noteeditor.screenshot.OooO00o oooO00o) {
        this.f105383OooOo0o = oooO00o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        View view = (View) obj3;
        if (view != null) {
            com.orion.notein.p607ui.noteeditor.screenshot.OooO00o oooO00o = this.f105383OooOo0o;
            oooO00o.getClass();
            ((ScreenshotPanel) view.findViewById(R.id.screenshot_panel)).setEventListener(oooO00o);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
