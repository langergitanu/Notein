package o0Oo0oOo;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import com.orion.notein.p607ui.creative_library.DownloadedMaterialListFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.widget.EdgeFragment;
import oO0o0OO.C33609OooO0oo;
import oO0oO0O.InterfaceC34008OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0ooOOo implements InterfaceC21912Oooo0o, InterfaceC34008OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ EdgeFragment f100609OooOo0o;

    public /* synthetic */ o0ooOOo(EdgeFragment edgeFragment) {
        this.f100609OooOo0o = edgeFragment;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        String string = bundle.getString("material_id");
        if (string != null) {
            com.orion.notein.p607ui.creative_library.Oooo0 oooo0 = (com.orion.notein.p607ui.creative_library.Oooo0) ((DownloadedMaterialListFragment) this.f100609OooOo0o).f70920OooOoo.getValue();
            C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooo0), null, null, new o0O0O00(oooo0, string, null), 3);
        }
    }

    @Override // oO0oO0O.InterfaceC34008OooO0O0
    public void onVisibilityChanged(boolean z) {
        ViewGroup viewGroup = ((TextRecognizeFragment) this.f100609OooOo0o).f78197o000oOoO;
        if (viewGroup != null) {
            viewGroup.setVisibility(!z ? 0 : 8);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("opBarWrapper");
            throw null;
        }
    }
}
