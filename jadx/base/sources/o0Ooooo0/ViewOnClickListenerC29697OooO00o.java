package o0Ooooo0;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment.C23531OooO0o0;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OutlineVO;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment.OooO0o;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0OoooOo.C29661OooOoo0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Ooooo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29697OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f105278OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105279OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29697OooO00o(Fragment fragment, int i) {
        this.f105279OooOo0o = i;
        this.f105278OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f105279OooOo0o) {
            case 0:
                EditorOutlineFragment editorOutlineFragment = (EditorOutlineFragment) this.f105278OooOo;
                EditText editText = editorOutlineFragment.f75799Oooo000;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
                editText.clearFocus();
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.outline.OutlineVO");
                OutlineVO outlineVO = (OutlineVO) tag;
                int id = view.getId();
                if (id == R.id.item_delete) {
                    InterfaceC21987OooOoo viewLifecycleOwner = editorOutlineFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, editorOutlineFragment.new C23531OooO0o0(outlineVO, null), 3);
                } else if (id == R.id.item_edit) {
                    InterfaceC21987OooOoo viewLifecycleOwner2 = editorOutlineFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, editorOutlineFragment.new OooO0o(outlineVO, null), 3);
                }
                C29661OooOoo0 c29661OooOoo0 = editorOutlineFragment.f75806Oooo0oO;
                if (c29661OooOoo0 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                    throw null;
                }
                synchronized (c29661OooOoo0) {
                    c29661OooOoo0.f105174OooO00o.dismiss();
                }
                return;
            case 1:
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = ((NoteListContainerFragment) this.f105278OooOo).requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
                ((MainActivity) activityC21897OooOo0RequireActivity).openDrawer();
                return;
            default:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((UserSettingFragment) this.f105278OooOo), new C24564OooO00o(R.id.action_userSettingFragment_toUserBindPhoneFragment));
                return;
        }
    }
}
