package OooooOo;

import android.graphics.Canvas;
import android.net.Uri;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.inappmessaging.internal.TestDeviceHelper;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.FetchEligibleCampaignsResponse;
import com.orion.notein.p607ui.image.ImportImagesFragment;
import o0OoO0oo.C28918o00o0O;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: renamed from: OooooOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21387OooOOo implements InterfaceC21371OooO, CanvasCompat.CanvasOperation, InterfaceC32330OooO0O0, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f61873OooOo0o;

    public /* synthetic */ C21387OooOOo(Object obj) {
        this.f61873OooOo0o = obj;
    }

    @Override // OooooOo.InterfaceC21371OooO
    public double OooO00o(double d) {
        C21393OooOo0O c21393OooOo0O = (C21393OooOo0O) this.f61873OooOo0o;
        double d2 = c21393OooOo0O.f61895OooO0o0;
        double d3 = c21393OooOo0O.f61894OooO0Oo;
        return d >= d2 * d3 ? (Math.pow(d, 1.0d / c21393OooOo0O.f61891OooO00o) - c21393OooOo0O.f61893OooO0OO) / c21393OooOo0O.f61892OooO0O0 : d / d3;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        C28918o00o0O c28918o00o0O;
        Boolean success = (Boolean) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(success, "success");
        ImportImagesFragment importImagesFragment = (ImportImagesFragment) this.f61873OooOo0o;
        Uri uri = importImagesFragment.f71857OooOoo;
        importImagesFragment.f71857OooOoo = uri;
        if (uri == null || !success.booleanValue() || (c28918o00o0O = importImagesFragment.f71860OooOooo) == null) {
            return;
        }
        c28918o00o0O.invoke(uri);
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) {
        ((TestDeviceHelper) this.f61873OooOo0o).processCampaignFetch((FetchEligibleCampaignsResponse) obj);
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public void run(Canvas canvas) {
        ((NavigationView) this.f61873OooOo0o).lambda$dispatchDraw$0(canvas);
    }
}
