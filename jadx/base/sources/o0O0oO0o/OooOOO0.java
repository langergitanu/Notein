package o0O0oO0o;

import androidx.core.location.LocationRequestCompat;
import com.orion.editor.p600ui.zoom.DefaultZoomHandle;
import java.util.ArrayList;
import java.util.List;
import o0O0oOO0.C26113OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOO0 implements oOO00OOO.OooO0O0<List<C26113OooO00o>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO f89114OooOo0o;

    public OooOOO0(OooOOO oooOOO) {
        this.f89114OooOo0o = oooOOO;
    }

    @Override // oOO00OOO.OooO0O0
    public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
        this.f89114OooOo0o.f89109OooO00o = oooO0OO;
        oooO0OO.request(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // oOO00OOO.OooO0O0
    public final void onComplete() {
    }

    @Override // oOO00OOO.OooO0O0
    public final void onError(Throwable th) {
    }

    @Override // oOO00OOO.OooO0O0
    public final void onNext(List<C26113OooO00o> list) {
        List<C26113OooO00o> list2 = list;
        synchronized (this.f89114OooOo0o.f89110OooO0O0) {
            this.f89114OooOo0o.f89110OooO0O0.clear();
            this.f89114OooOo0o.f89110OooO0O0.addAll(list2);
            OooOOO oooOOO = this.f89114OooOo0o;
            o00O00o0.OooO0O0 oooO0O0 = oooOOO.f89111OooO0OO;
            ArrayList arrayListOooO0O0 = oooOOO.OooO0O0();
            DefaultZoomHandle defaultZoomHandle = (DefaultZoomHandle) oooO0O0.f84154OooO0O0;
            defaultZoomHandle.f69434Oooo000.OooO00o(defaultZoomHandle.OooO0o0(arrayListOooO0O0));
            Object tag = defaultZoomHandle.f69428OooOoOO.getTag();
            if (tag instanceof C26113OooO00o) {
                defaultZoomHandle.f69429OooOoo.setActivated(defaultZoomHandle.f69436Oooo00o.OooO0OO(((C26113OooO00o) tag).f89152OooO0O0));
            }
        }
    }
}
