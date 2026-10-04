package o0Oo0ooO;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.ImportCloudDataDialogFragment;
import com.orion.notein.p607ui.label.DeleteLabelDialogFragment;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorList;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.ocr.view.AiOcrRichEditor;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import com.orion.notein.p607ui.user.UserInfoFragment;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.concurrent.CancellationException;
import o0OoO0OO.C28613OooOO0o;
import o0o000oO.C29787OooOO0o;
import o0o00o0.C29936OooO0oO;
import o0o0OO0O.C30439OooOOo0;
import o0oOo0.C30923OooOOO0;
import o0oOoOo.C31045OooOOo;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.o00000OO;

/* JADX INFO: renamed from: o0Oo0ooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28408OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100705OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100706OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28408OooO0O0(Object obj, int i) {
        this.f100706OooOo0o = i;
        this.f100705OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        PenBox.InterfaceC23605OooO0Oo interfaceC23605OooO0Oo;
        Object obj = this.f100705OooOo;
        switch (this.f100706OooOo0o) {
            case 0:
                DeleteLabelDialogFragment deleteLabelDialogFragment = (DeleteLabelDialogFragment) obj;
                deleteLabelDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("labelId", Long.valueOf(((C28409OooO0OO) deleteLabelDialogFragment.f71863OooOoOO.getValue()).f100707OooO00o))), "delete_label");
                Dialog dialog = deleteLabelDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
                LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = (LoginByThirdPartyChildFragment) obj;
                if (loginByThirdPartyChildFragment.f72578OooOo0o.OooO0OO()) {
                    o00000OO o00000oo2 = loginByThirdPartyChildFragment.f72581OooOoOO;
                    if (o00000oo2 != null) {
                        o00000oo2.cancel((CancellationException) null);
                    }
                    loginByThirdPartyChildFragment.f72581OooOoOO = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(loginByThirdPartyChildFragment), null, null, new C28613OooOO0o(loginByThirdPartyChildFragment, null), 3);
                    return;
                }
                return;
            case 2:
                AddPageDialogFragment addPageDialogFragment = (AddPageDialogFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner = addPageDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new AddPageDialogFragment.OooO00o(addPageDialogFragment, null), 3);
                return;
            case 3:
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                ((PenBoxChildFragment) obj).Oooo0o().OooOO0O(DrawToolFactory.ERASER_TYPE_PIXEL);
                return;
            case 4:
                try {
                    kotlin.jvm.internal.OooOOO0.OooO0o0(view, "null cannot be cast to non-null type android.widget.TextView");
                    i = Integer.parseInt(((TextView) view).getText().toString());
                    break;
                } catch (Exception unused) {
                    i = 20;
                }
                TextStyleBarChildFragment textStyleBarChildFragment = (TextStyleBarChildFragment) obj;
                if (textStyleBarChildFragment.f76453OoooOoo == null) {
                    Context contextRequireContext = textStyleBarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    C23383OooO0Oo c23383OooO0Oo = new C23383OooO0Oo(contextRequireContext);
                    c23383OooO0Oo.f74122OooO0oo = new C29787OooOO0o(textStyleBarChildFragment);
                    textStyleBarChildFragment.f76453OoooOoo = c23383OooO0Oo;
                }
                C23383OooO0Oo c23383OooO0Oo2 = textStyleBarChildFragment.f76453OoooOoo;
                if (c23383OooO0Oo2 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    PopupWindow popupWindow = c23383OooO0Oo2.f74115OooO00o;
                    c23383OooO0Oo2.f74117OooO0OO.setText(popupWindow.getContentView().getContext().getString(R.string.font_size_desc, Integer.valueOf(i)));
                    SeekBar seekBar = c23383OooO0Oo2.f74119OooO0o;
                    seekBar.setProgress(i - 5);
                    popupWindow.showAsDropDown(view);
                    C23383OooO0Oo.OooO00o oooO00o = c23383OooO0Oo2.f74122OooO0oo;
                    if (oooO00o != null) {
                        oooO00o.OooO00o(0);
                    }
                    seekBar.setOnSeekBarChangeListener(c23383OooO0Oo2.f74121OooO0oO);
                    return;
                }
                return;
            case 5:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.LaserDisappearVO");
                C31045OooOOo c31045OooOOo = (C31045OooOOo) tag;
                C29936OooO0oO c29936OooO0oO = ((o0o00oO0.Oooo0) obj).f106644Oooo00O;
                if (c29936OooO0oO == null || (interfaceC23605OooO0Oo = c29936OooO0oO.f106281OooO) == null) {
                    return;
                }
                interfaceC23605OooO0Oo.OooO0OO(c31045OooOOo.f110844OooO00o);
                return;
            case 6:
                TiledPageListContainerFragment tiledPageListContainerFragment = (TiledPageListContainerFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner2 = tiledPageListContainerFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30439OooOOo0(tiledPageListContainerFragment, null), 3);
                return;
            case 7:
                UserInfoFragment userInfoFragment = (UserInfoFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner3 = userInfoFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C30923OooOOO0(userInfoFragment, null), 3);
                return;
            case 8:
                ActivityC21897OooOo0 activity = ((ImportCloudDataDialogFragment) obj).getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.openMembershipPlans();
                    return;
                }
                return;
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) obj;
                View view2 = textRecognizeFragment.f78185OoooOo0;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnEdit");
                    throw null;
                }
                if (view2.isActivated()) {
                    textRecognizeFragment.Oooo000();
                    return;
                }
                textRecognizeFragment.Oooo0oo(false);
                View view3 = textRecognizeFragment.f78185OoooOo0;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnEdit");
                    throw null;
                }
                view3.setActivated(true);
                AiOcrEditorListContainer aiOcrEditorListContainer = textRecognizeFragment.f78179OoooO0;
                if (aiOcrEditorListContainer == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editorListContainer");
                    throw null;
                }
                AiOcrEditorList aiOcrEditorList = aiOcrEditorListContainer.f78421OooOo;
                if (aiOcrEditorList == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editorList");
                    throw null;
                }
                aiOcrEditorList.setInterceptTouchEvents(false);
                ViewGroup viewGroup = aiOcrEditorListContainer.f78425OooOoOO;
                if (viewGroup == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBarContainer");
                    throw null;
                }
                viewGroup.setVisibility(0);
                AiOcrRichEditor aiOcrRichEditor = aiOcrEditorListContainer.f78424OooOoO0;
                if (aiOcrRichEditor != null) {
                    aiOcrRichEditor.requestFocus();
                    return;
                }
                return;
        }
    }
}
