package o0O0o0oO;

import Oooo0.C20857Oooooo;
import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.os.BundleKt;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.aspose.words.EditingLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.notelist.RenameDialogFragment;
import com.orion.notein.p607ui.ocr.dialog.ReplacePageSelectorDialogFragment;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import o000O00O.C24397OooOo0;
import o00o00.C25206OooO0Oo;
import o0Ooo0O.C29375OooO00o;
import o0o00OOO.DialogC29885OooO0O0;
import o0o0O00o.C30256OooO00o;
import o0o0OO0.C30394OooOOOO;
import o0o0OO0.C30418Oooo0o0;
import o0o0OOO.o0000OOO;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o0oO.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26036Oooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88899OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88900OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26036Oooo(Object obj, int i) {
        this.f88900OooOo0o = i;
        this.f88899OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88900OooOo0o) {
            case 0:
                NoteInContextMenu noteInContextMenu = (NoteInContextMenu) this.f88899OooOo;
                noteInContextMenu.f69376OooOo.smoothScrollTo(-C20857Oooooo.OooO0O0(noteInContextMenu.getContext(), EditingLanguage.FAEROESE), 0);
                return;
            case 1:
                ((ExportBottomSheetFragment) this.f88899OooOo).OooOooo().OooOO0(3);
                return;
            case 2:
                DrawerLayout drawerLayout = ((NoteEditorContainerFragment) this.f88899OooOo).f72813Oooo000;
                if (drawerLayout != null) {
                    drawerLayout.OooO0OO(view, false);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("drawer");
                    throw null;
                }
            case 3:
                C29375OooO00o.InterfaceC19985OooO00o interfaceC19985OooO00o = ((C29375OooO00o) this.f88899OooOo).f104160OooO0O0;
                if (interfaceC19985OooO00o != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    interfaceC19985OooO00o.OooO0o0(view);
                    return;
                }
                return;
            case 4:
                C24397OooOo0 c24397OooOo0 = ((DialogC29885OooO0O0) this.f88899OooOo).f106023OooOo;
                if (c24397OooOo0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c24397OooOo0.OooO00o(view);
                    return;
                }
                return;
            case 5:
                RenameDialogFragment renameDialogFragment = (RenameDialogFragment) this.f88899OooOo;
                EditText editText = renameDialogFragment.f77299Oooo0OO;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                Editable text = editText.getText();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(text);
                if (text.length() == 0) {
                    Context contextRequireContext = renameDialogFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = renameDialogFragment.getString(R.string.toast_enter_a_filename);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    return;
                }
                renameDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, Integer.valueOf(renameDialogFragment.Oooo00o().f107022OooO0OO)), new C32443OooOOO("id", renameDialogFragment.Oooo00o().f107020OooO00o), new C32443OooOOO("new_name", text.toString())), "rename");
                Dialog dialog = renameDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 6:
                ViewOnClickListenerC26047OoooO00 viewOnClickListenerC26047OoooO00 = ((C30256OooO00o) this.f88899OooOo).f107808OooO0O0;
                if (viewOnClickListenerC26047OoooO00 != null) {
                    viewOnClickListenerC26047OoooO00.onClick(view);
                    return;
                }
                return;
            case 7:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) tag).intValue();
                StandardTemplateFragment standardTemplateFragment = (StandardTemplateFragment) this.f88899OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = standardTemplateFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new o0000OOO(standardTemplateFragment, iIntValue, null), 3);
                return;
            default:
                ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = (ReplacePageSelectorDialogFragment) this.f88899OooOo;
                if (replacePageSelectorDialogFragment.Oooo00o().f113220OooO0OO < 0 || (((Number) replacePageSelectorDialogFragment.Oooo0().f108660OooOOo0.getValue()).intValue() >= 1 && ((Number) replacePageSelectorDialogFragment.Oooo0().f108660OooOOo0.getValue()).intValue() <= ((Number) replacePageSelectorDialogFragment.Oooo0().f108661OooOOoo.getValue()).intValue())) {
                    int iIntValue2 = ((Number) replacePageSelectorDialogFragment.Oooo0().f108654OooOO0o.getValue()).intValue();
                    int i = iIntValue2 - 1;
                    Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("input_source_id", replacePageSelectorDialogFragment.Oooo00o().f113218OooO00o.getId()), new C32443OooOOO("page_start_index", Integer.valueOf(i)), new C32443OooOOO("page_end_index", Integer.valueOf(iIntValue2)), new C32443OooOOO("dst_text_page_index", Integer.valueOf(((Number) replacePageSelectorDialogFragment.Oooo0().f108660OooOOo0.getValue()).intValue() - 1)));
                    ((C30394OooOOOO) replacePageSelectorDialogFragment.f78299Oooo00o.getValue()).f108500OooOO0o = i;
                    int sourceType = replacePageSelectorDialogFragment.Oooo00o().f113218OooO00o.getSourceType();
                    if (sourceType != 0) {
                        if (sourceType == 1) {
                            C30418Oooo0o0.OooO00o oooO00o = replacePageSelectorDialogFragment.Oooo0().f108646OooO;
                            if (oooO00o == null) {
                                return;
                            } else {
                                bundleBundleOf.putString("pdf_password", oooO00o.f108665OooO0O0);
                            }
                        } else if (sourceType != 3) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("ReplacePageSelectorDialogFragment");
                            c20358OooO00o.OooO0OO(C21532OooOOo.OooO0OO(replacePageSelectorDialogFragment.Oooo00o().f113218OooO00o.getSourceType(), "Unsupported input source type: "), new Object[0]);
                            return;
                        }
                    }
                    replacePageSelectorDialogFragment.getParentFragmentManager().OooooOo(bundleBundleOf, "replace_page_selection");
                    C21030OooOO0o.OooO0OO(replacePageSelectorDialogFragment).OooOOOo();
                    return;
                }
                return;
        }
    }
}
