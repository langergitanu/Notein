package o0Oo0o00;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.p607ui.datasync.CloudSyncFragment;
import com.orion.notein.p607ui.noteeditor.addtext.ImportFontDialogFragment;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment;
import com.orion.notein.p607ui.settings.debug.SelectNoteDialogFragment;
import o0OOo0Oo.EnumC27285OooO;
import o0o0OOO0.C30544OooO0O0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Oo0o00.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28183Oooo0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f99873OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99874OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28183Oooo0O0(Fragment fragment, int i) {
        this.f99874OooOo0o = i;
        this.f99873OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f99874OooOo0o) {
            case 0:
                CloudSyncFragment cloudSyncFragment = (CloudSyncFragment) this.f99873OooOo;
                cloudSyncFragment.OooOooO("xiaomiSwitch");
                SwitchMaterial switchMaterial = cloudSyncFragment.f71440OooOooO;
                if (switchMaterial != null) {
                    cloudSyncFragment.OooOooo(switchMaterial, EnumC27285OooO.f95077OooOoO);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("xiaomiSwitch");
                    throw null;
                }
            case 1:
                ImportFontDialogFragment importFontDialogFragment = (ImportFontDialogFragment) this.f99873OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = importFontDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.noteeditor.addtext.OooO0O0(importFontDialogFragment, null), 3);
                return;
            case 2:
                C21030OooOO0o.OooO0OO((HyperlinkTiledPagesFragment) this.f99873OooOo).OooOOo0();
                return;
            default:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.pageeditor.vo.TargetNoteVO");
                ((SelectNoteDialogFragment) this.f99873OooOo).OooOoo0().OooO0o0(((C30544OooO0O0) tag).f109255OooO00o);
                return;
        }
    }
}
