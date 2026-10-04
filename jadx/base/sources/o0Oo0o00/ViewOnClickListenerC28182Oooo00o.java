package o0Oo0o00;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.datasync.CloudSyncFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import com.orion.notein.p607ui.p609vo.FolderVO;
import com.orion.notein.p607ui.settings.debug.SelectNoteDialogFragment;
import com.orion.notein.p607ui.user.coupon.UserCouponsDialogFragment;
import o0OOo0Oo.EnumC27285OooO;
import o0OoO0oO.C28680OooOO0;
import o0o0O000.C30228OooOo0O;
import o0o0OOO0.C30544OooO0O0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Oo0o00.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28182Oooo00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99871OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99872OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28182Oooo00o(Object obj, int i) {
        this.f99872OooOo0o = i;
        this.f99871OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f99872OooOo0o) {
            case 0:
                CloudSyncFragment cloudSyncFragment = (CloudSyncFragment) this.f99871OooOo;
                cloudSyncFragment.OooOooO("hwSwitch");
                SwitchMaterial switchMaterial = cloudSyncFragment.f71439OooOoo0;
                if (switchMaterial != null) {
                    cloudSyncFragment.OooOooo(switchMaterial, EnumC27285OooO.f95075OooOo);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("hwSwitch");
                    throw null;
                }
            case 1:
                View.OnClickListener onClickListener = ((C28680OooOO0) this.f99871OooOo).f101627OooO0O0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                ActivityC21897OooOo0 activity = ((EditorCommentFragment) this.f99871OooOo).getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.showGuideVideo(2);
                    return;
                }
                return;
            case 3:
                MoveToFolderFragment moveToFolderFragment = (MoveToFolderFragment) this.f99871OooOo;
                FolderVO folderVO = (FolderVO) moveToFolderFragment.OooOooo().f107610OooO.getValue();
                InterfaceC21987OooOoo viewLifecycleOwner = moveToFolderFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30228OooOo0O(moveToFolderFragment, folderVO, null), 3);
                return;
            case 4:
                SelectNoteDialogFragment selectNoteDialogFragment = (SelectNoteDialogFragment) this.f99871OooOo;
                C30544OooO0O0 c30544OooO0O0 = (C30544OooO0O0) selectNoteDialogFragment.OooOoo0().f109993OooO.f121747OooOo0o.getValue();
                if (c30544OooO0O0 == null) {
                    C21030OooOO0o.OooO0OO(selectNoteDialogFragment).OooOOo0();
                    return;
                } else {
                    selectNoteDialogFragment.OooOoo0().OooO0o0(c30544OooO0O0.f109255OooO00o);
                    return;
                }
            default:
                ((UserCouponsDialogFragment) this.f99871OooOo).dismiss();
                return;
        }
    }
}
