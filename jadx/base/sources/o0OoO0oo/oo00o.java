package o0OoO0oo;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class oo00o implements PDFView.InterfaceC22833OooO0o0, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Fragment f102694OooOo0o;

    public /* synthetic */ oo00o(Fragment fragment) {
        this.f102694OooOo0o = fragment;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        String string = bundle.getString("id");
        int i = bundle.getInt(C18437z2.f56754h);
        TrashBinContainerFragment trashBinContainerFragment = (TrashBinContainerFragment) this.f102694OooOo0o;
        InterfaceC21987OooOoo viewLifecycleOwner = trashBinContainerFragment.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new TrashBinContainerFragment.OooO0OO(string, trashBinContainerFragment, i, bundle, null), 2);
    }
}
