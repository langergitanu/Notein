package o0Oo0o00;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.p607ui.datasync.CloudSyncFragment;
import com.orion.notein.p607ui.noteeditor.addtext.ImportFontDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import java.util.Set;
import o0OOo0Oo.EnumC27285OooO;
import o0oOoOo.C31039OooOO0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo0o00.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28184Oooo0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f99875OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99876OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28184Oooo0OO(Fragment fragment, int i) {
        this.f99876OooOo0o = i;
        this.f99875OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f99876OooOo0o) {
            case 0:
                CloudSyncFragment cloudSyncFragment = (CloudSyncFragment) this.f99875OooOo;
                cloudSyncFragment.OooOooO("googleDriveSwitch");
                SwitchMaterial switchMaterial = cloudSyncFragment.f71441OooOooo;
                if (switchMaterial != null) {
                    cloudSyncFragment.OooOooo(switchMaterial, EnumC27285OooO.f95079OooOoOO);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("googleDriveSwitch");
                    throw null;
                }
            case 1:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.FileTreeNodeVO");
                C31039OooOO0O c31039OooOO0O = (C31039OooOO0O) tag;
                com.orion.notein.p607ui.noteeditor.addtext.OooO0OO oooO0OOOooOoo = ((ImportFontDialogFragment) this.f99875OooOo).OooOoo();
                String str = c31039OooOO0O.f110816OooO00o;
                if (c31039OooOO0O.f110818OooO0OO) {
                    oooO0OOOooOoo.OooO0o0(str);
                    return;
                }
                boolean zBooleanValue = ((Boolean) oooO0OOOooOoo.f74017OooO0o0.getValue()).booleanValue();
                C33781o00o0O c33781o00o0O = oooO0OOOooOoo.f74014OooO;
                Set setO0Oo0oo = oOo000Oo.OooOo.o0Oo0oo((Iterable) c33781o00o0O.getValue());
                if (!zBooleanValue) {
                    setO0Oo0oo.clear();
                    setO0Oo0oo.add(str);
                } else if (setO0Oo0oo.contains(str)) {
                    setO0Oo0oo.remove(str);
                } else {
                    setO0Oo0oo.add(str);
                }
                c33781o00o0O.OooOO0(null, setO0Oo0oo);
                return;
            default:
                EditorCommentFragment editorCommentFragment = (EditorCommentFragment) this.f99875OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = editorCommentFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new EditorCommentFragment.C23524OooO0o0(editorCommentFragment, null), 3);
                return;
        }
    }
}
