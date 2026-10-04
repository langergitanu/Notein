package o0Oo0o00;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentEditDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOooO0.EnumC27953o00000Oo;
import o0o000oo.C29842OoooO;
import o0oOoo0.C31113OooO0O0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0o00.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28177OooOooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f99863OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99864OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28177OooOooo(Fragment fragment, int i) {
        this.f99864OooOo0o = i;
        this.f99863OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C31113OooO0O0 c31113OooO0O0;
        Fragment fragment = this.f99863OooOo;
        switch (this.f99864OooOo0o) {
            case 0:
                C28194OoooOOO c28194OoooOOOOooOoo = ((CloudSyncFragment) fragment).OooOoo();
                EnumC27953o00000Oo enumC27953o00000Oo = EnumC27953o00000Oo.f98991OooOo0o;
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c28194OoooOOOOooOoo);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28208o000oOoO(c28194OoooOOOOooOoo, enumC27953o00000Oo, null), 2);
                return;
            case 1:
                EditText editText = ((CommentEditDialogFragment) fragment).f75713OooOooo;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            case 2:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) fragment;
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment), null, null, new C29842OoooO(baseToolbarChildFragment, null), 3);
                return;
            default:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                DebugFragment debugFragment = (DebugFragment) fragment;
                androidx.appcompat.app.OooOO0 oooOO02 = new androidx.appcompat.app.OooOO0(debugFragment, 1);
                if (ContextCompat.checkSelfPermission(debugFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    oooOO02.run();
                    return;
                }
                debugFragment.f79027Oooo000 = oooOO02;
                String string = debugFragment.getString(R.string.request_write_external_permission_title);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = debugFragment.getString(R.string.request_write_external_permission_to_export_file);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                Context context = debugFragment.getContext();
                if (context != null) {
                    if (debugFragment.f79025OooOooo == null) {
                        debugFragment.f79025OooOooo = new C31113OooO0O0(context);
                    }
                    View view2 = debugFragment.getView();
                    if (view2 != null && (c31113OooO0O0 = debugFragment.f79025OooOooo) != null) {
                        c31113OooO0O0.OooO00o(view2, string, string2);
                    }
                }
                debugFragment.f79028Oooo00O.OooO00o("android.permission.WRITE_EXTERNAL_STORAGE");
                return;
        }
    }
}
