package o0Oo0o0o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import com.orion.notein.p607ui.user.message.UserMessagesDialogFragment;
import o0OooooO.C29718OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Oo0o0o.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28239OooOOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f100080OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100081OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28239OooOOo(Fragment fragment, int i) {
        this.f100081OooOo0o = i;
        this.f100080OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.f100080OooOo;
        switch (this.f100081OooOo0o) {
            case 0:
                ((ExportBottomSheetFragment) fragment).OooOooo().OooO0oo(16);
                return;
            case 1:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.preview.PagePreviewVO");
                PagePreviewVO pagePreviewVO = (PagePreviewVO) tag;
                EditorPreviewFragment editorPreviewFragment = (EditorPreviewFragment) fragment;
                switch (view.getId()) {
                    case R.id.item_add_comment /* 2131297846 */:
                        InterfaceC21987OooOoo viewLifecycleOwner = editorPreviewFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new EditorPreviewFragment.C23547OooOO0o(editorPreviewFragment, pagePreviewVO, null), 3);
                        return;
                    case R.id.item_add_label /* 2131297847 */:
                        C29718OooO0O0 c29718OooO0O0 = editorPreviewFragment.f75916OoooO0O;
                        if (c29718OooO0O0 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                            throw null;
                        }
                        c29718OooO0O0.OooO00o();
                        InterfaceC21987OooOoo viewLifecycleOwner2 = editorPreviewFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new EditorPreviewFragment.C23545OooO0oO(editorPreviewFragment, pagePreviewVO, null), 3);
                        return;
                    case R.id.item_add_outline /* 2131297848 */:
                        InterfaceC21987OooOoo viewLifecycleOwner3 = editorPreviewFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new EditorPreviewFragment.OooOO0(editorPreviewFragment, pagePreviewVO, null), 3);
                        return;
                    case R.id.item_copy /* 2131297861 */:
                        InterfaceC21987OooOoo viewLifecycleOwner4 = editorPreviewFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner4), null, null, new EditorPreviewFragment.OooO(editorPreviewFragment, pagePreviewVO, null), 3);
                        return;
                    case R.id.item_delete /* 2131297865 */:
                        InterfaceC21987OooOoo viewLifecycleOwner5 = editorPreviewFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner5), null, null, new EditorPreviewFragment.C23546OooO0oo(editorPreviewFragment, pagePreviewVO, null), 3);
                        return;
                    case R.id.item_export /* 2131297871 */:
                        InterfaceC21987OooOoo viewLifecycleOwner6 = editorPreviewFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner6), null, null, new EditorPreviewFragment.OooOO0O(editorPreviewFragment, pagePreviewVO, null), 3);
                        return;
                    default:
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        return;
                }
            default:
                int i = UserMessagesDialogFragment.f79810Oooo0O0;
                ((UserMessagesDialogFragment) fragment).dismiss();
                return;
        }
    }
}
