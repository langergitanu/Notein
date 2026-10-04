package o0Oo0o00;

import Oooo0oO.C21030OooOO0o;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.View;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import com.orion.notein.p607ui.label.LabelManagementBottomSheet;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.audio.OooO0OO;
import com.orion.notein.p607ui.noteeditor.propertypanel.EditorPropertyFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.settings.GlobalSettingsContainerDialogFragment;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import java.util.LinkedHashMap;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28755o00000o0;
import o0OoO0oo.C28828o000ooo;
import o0o0000o.C29728OooO0Oo;
import o0o000oo.C29827OooOoo;
import o0o000oo.C29829OooOooO;
import o0o000oo.C29832Oooo0;
import o0o000oo.C29834Oooo00O;
import o0o000oo.C29836Oooo0O0;
import o0o00OOO.InterfaceC29884OooO00o;
import o0o00Oo0.C29908OooO00o;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30025OoooOoo;
import o0o00oOo.C30029OooO00o;
import o0o0O00.C30191OooO0oO;
import o0o0O00.C30207OooOo;
import o0oOo00.C30932OooO0Oo;
import o0oOo00.C30933OooO0o0;
import o0oOo00.C30935OooO0oo;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0Oo0o00.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28147OooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99766OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99767OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28147OooO(Object obj, int i) {
        this.f99767OooOo0o = i;
        this.f99766OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C29936OooO0oO c29936OooO0oO;
        Object obj = this.f99766OooOo;
        switch (this.f99767OooOo0o) {
            case 0:
                Fragment parentFragment = ((CloudSyncDetailsFragment) obj).getParentFragment();
                CloudSyncDetailsFragment.OooO00o oooO00o = parentFragment instanceof CloudSyncDetailsFragment.OooO00o ? (CloudSyncDetailsFragment.OooO00o) parentFragment : null;
                if (oooO00o != null) {
                    oooO00o.OooOOo0();
                    return;
                }
                return;
            case 1:
                ((LabelManagementBottomSheet) obj).dismiss();
                return;
            case 2:
                EditorPropertyFragment editorPropertyFragment = (EditorPropertyFragment) obj;
                o0o0O.OooO0O0 oooO0O0 = editorPropertyFragment.f75457Oooo00o;
                if (oooO0O0 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("quotaUsagePopupMenu");
                    throw null;
                }
                oooO0O0.OooO00o();
                if (view.getId() == R.id.btn_purchase_more) {
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorPropertyFragment), new C24564OooO00o(R.id.action_noteEditorContainerFragment_to_aiQuotaPayDialogFragment));
                    return;
                }
                return;
            case 3:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbar.vo.ToolbarItemVO");
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) obj;
                baseToolbarChildFragment.getClass();
                LinkedHashMap linkedHashMap = baseToolbarChildFragment.f76496OoooOO0;
                int i = ((C29908OooO00o) tag).f106114OooO00o;
                switch (i) {
                    case 2:
                        Boolean bool = (Boolean) baseToolbarChildFragment.Oooo0OO().f73373OooOoo.f121747OooOo0o.getValue();
                        if (bool != null) {
                            boolean zBooleanValue = bool.booleanValue();
                            com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(Oooo0OO2);
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28828o000ooo(Oooo0OO2, !zBooleanValue, null), 2);
                            return;
                        }
                        return;
                    case 3:
                        NoteContent noteContent = (NoteContent) baseToolbarChildFragment.Oooo0OO().f73396OoooOoO.f121747OooOo0o.getValue();
                        if (noteContent == null) {
                            return;
                        }
                        T value = baseToolbarChildFragment.Oooo0OO().f73422o00Ooo.f121747OooOo0o.getValue();
                        OooO0OO.OooO00o oooO00o2 = OooO0OO.OooO00o.f73440OooOo;
                        boolean z = value == oooO00o2;
                        if (z) {
                            oooO00o2 = OooO0OO.OooO00o.f73441OooOo0o;
                        }
                        baseToolbarChildFragment.Ooooo0o();
                        if (noteContent.getId().length() > 0) {
                            baseToolbarChildFragment.Oooo0OO().Oooo0oO(oooO00o2);
                        }
                        baseToolbarChildFragment.OooooOO(6, Boolean.valueOf(!z));
                        return;
                    case 4:
                        baseToolbarChildFragment.OoooO0O(view);
                        return;
                    case 5:
                        ActivityC21897OooOo0 activity = baseToolbarChildFragment.getActivity();
                        if (activity == null) {
                            return;
                        }
                        if (Settings.canDrawOverlays(activity)) {
                            baseToolbarChildFragment.Oooooo0();
                            return;
                        }
                        baseToolbarChildFragment.f76502Ooooo00.OooO00o(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        return;
                    case 6:
                        baseToolbarChildFragment.Ooooo0o();
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29827OooOoo(baseToolbarChildFragment, null), 3);
                        return;
                    case 7:
                        NoteContent noteContent2 = (NoteContent) baseToolbarChildFragment.Oooo0OO().f73396OoooOoO.f121747OooOo0o.getValue();
                        if (noteContent2 == null || noteContent2.getUnboundedNote()) {
                            return;
                        }
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29834Oooo00O(baseToolbarChildFragment, null), 3);
                        return;
                    case 8:
                        baseToolbarChildFragment.Oooo0OO().OooOooo(false);
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29829OooOooO(baseToolbarChildFragment, null), 3);
                        return;
                    case 9:
                        if (baseToolbarChildFragment.Oooo000().f74227OooOO0.getValue() instanceof OooO0OO.C23396OooO0oo) {
                            baseToolbarChildFragment.Oooo000().OooOOoo();
                        } else {
                            com.orion.notein.p607ui.noteeditor.audio.OooO0o.Oooo00O(baseToolbarChildFragment.Oooo000(), null, 3);
                        }
                        baseToolbarChildFragment.Oooo0OO().OooOooo(true);
                        return;
                    case 10:
                        if (((Boolean) baseToolbarChildFragment.Oooo0OO().f73376OooOooo.f121747OooOo0o.getValue()).booleanValue()) {
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29836Oooo0O0(baseToolbarChildFragment, null), 3);
                            return;
                        }
                        return;
                    case 11:
                        baseToolbarChildFragment.Ooooo0o();
                        baseToolbarChildFragment.Oooo0OO().Oooo0o0(!((Boolean) baseToolbarChildFragment.Oooo0OO().f73434o0ooOoO.getValue()).booleanValue());
                        return;
                    case 12:
                        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) linkedHashMap.get(7);
                        Object value2 = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                        InterfaceC29884OooO00o interfaceC29884OooO00o = value2 instanceof InterfaceC29884OooO00o ? (InterfaceC29884OooO00o) value2 : null;
                        if (interfaceC29884OooO00o != null) {
                            interfaceC29884OooO00o.OooO0O0(view);
                            return;
                        }
                        return;
                    case 13:
                        InterfaceC32440OooOO0 interfaceC32440OooOO02 = (InterfaceC32440OooOO0) linkedHashMap.get(21);
                        Object value3 = interfaceC32440OooOO02 != null ? interfaceC32440OooOO02.getValue() : null;
                        o0o00O0.OooO0o oooO0o = value3 instanceof o0o00O0.OooO0o ? (o0o00O0.OooO0o) value3 : null;
                        if (oooO0o != null) {
                            oooO0o.OooO0O0(view);
                            return;
                        }
                        return;
                    case 14:
                        C28755o00000o0 c28755o00000o0 = baseToolbarChildFragment.f76506o000oOoO;
                        if (c28755o00000o0 != null) {
                            NoteEditorContainerFragment noteEditorContainerFragment = c28755o00000o0.f101844OooO00o;
                            if (!noteEditorContainerFragment.getResources().getBoolean(R.bool.use_settings_bottom_sheet)) {
                                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteEditorContainerFragment), new C24564OooO00o(R.id.f57953x9d8972bd));
                                return;
                            } else {
                                if (noteEditorContainerFragment.getChildFragmentManager().OooOooo("globalSettingsContainerDialogFragment") == null) {
                                    new GlobalSettingsContainerDialogFragment().show(noteEditorContainerFragment.getChildFragmentManager(), "globalSettingsContainerDialogFragment");
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    case 15:
                        baseToolbarChildFragment.Oooo0OO().Oooo00O(true);
                        return;
                    case 16:
                        baseToolbarChildFragment.Oooo();
                        return;
                    case 17:
                        baseToolbarChildFragment.OoooO(view, false);
                        return;
                    case 18:
                        baseToolbarChildFragment.OoooOO0();
                        return;
                    case 19:
                        baseToolbarChildFragment.Ooooo0o();
                        if (((C29728OooO0Oo) baseToolbarChildFragment.Oooo0OO().f73431o0OoOo0.f121747OooOo0o.getValue()).f105431OooO00o) {
                            baseToolbarChildFragment.Oooo0oo().OooO0o(19, baseToolbarChildFragment.Oooo0OO().OoooO0());
                            return;
                        } else {
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29832Oooo0(baseToolbarChildFragment, null), 3);
                            return;
                        }
                    default:
                        switch (i) {
                            case 100:
                                baseToolbarChildFragment.OoooO00();
                                return;
                            case 101:
                                baseToolbarChildFragment.o000oOoO();
                                return;
                            case 102:
                                baseToolbarChildFragment.Ooooo0o();
                                baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
                                C28755o00000o0 c28755o00000o02 = baseToolbarChildFragment.f76506o000oOoO;
                                if (c28755o00000o02 != null) {
                                    c28755o00000o02.OooO0O0();
                                    return;
                                }
                                return;
                            case 103:
                                baseToolbarChildFragment.OoooO0();
                                return;
                            default:
                                return;
                        }
                }
            case 4:
                C30025OoooOoo c30025OoooOoo = (C30025OoooOoo) obj;
                boolean zIsChecked = c30025OoooOoo.f106725OooOoo0.isChecked();
                SwitchMaterial switchMaterial = c30025OoooOoo.f106725OooOoo0;
                if (zIsChecked && (c29936OooO0oO = c30025OoooOoo.f106730Oooo00O) != null) {
                    PenBox.OooOOOO oooOOOO = c29936OooO0oO.f106293OooOOO0;
                    if (oooOOOO != null ? oooOOOO.OooO0O0() : false) {
                        switchMaterial.setChecked(c30025OoooOoo.f106727OooOooo);
                        return;
                    }
                }
                C29936OooO0oO c29936OooO0oO2 = c30025OoooOoo.f106730Oooo00O;
                if (c29936OooO0oO2 != null) {
                    boolean zIsChecked2 = switchMaterial.isChecked();
                    PenBox.OooOOOO oooOOOO2 = c29936OooO0oO2.f106293OooOOO0;
                    if (oooOOOO2 != null) {
                        oooOOOO2.OooO00o(zIsChecked2);
                    }
                }
                c30025OoooOoo.f106727OooOooo = switchMaterial.isChecked();
                return;
            case 5:
                C30207OooOo c30207OooOo = (C30207OooOo) obj;
                C30029OooO00o c30029OooO00o = c30207OooOo.f107585OooO0OO;
                if (c30029OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("fabPopupWindow");
                    throw null;
                }
                c30029OooO00o.OooO00o();
                int id = view.getId();
                C30191OooO0oO c30191OooO0oO = c30207OooOo.f107584OooO0O0;
                switch (id) {
                    case R.id.create_folder /* 2131297345 */:
                        c30191OooO0oO.OooOO0();
                        return;
                    case R.id.create_note /* 2131297350 */:
                        c30191OooO0oO.OooO0o0();
                        return;
                    case R.id.create_unbounded_note /* 2131297352 */:
                        c30191OooO0oO.OooO0Oo();
                        return;
                    case R.id.import_doc /* 2131297790 */:
                        c30191OooO0oO.OooO();
                        return;
                    case R.id.import_epub /* 2131297793 */:
                        c30191OooO0oO.OooO0o();
                        return;
                    case R.id.import_from_camera /* 2131297796 */:
                        c30191OooO0oO.OooOO0O();
                        return;
                    case R.id.import_img /* 2131297798 */:
                        c30191OooO0oO.OooOO0o();
                        return;
                    case R.id.import_pdf /* 2131297800 */:
                        c30191OooO0oO.OooO0oO();
                        return;
                    case R.id.import_ppt /* 2131297802 */:
                        c30191OooO0oO.OooO0OO();
                        return;
                    case R.id.import_xls /* 2131297805 */:
                        c30191OooO0oO.OooO0O0();
                        return;
                    case R.id.open_ai_ocr /* 2131298368 */:
                        c30191OooO0oO.OooO00o();
                        return;
                    default:
                        return;
                }
            default:
                StickerCollectionEditFragment stickerCollectionEditFragment = (StickerCollectionEditFragment) obj;
                C30933OooO0o0 c30933OooO0o0 = (C30933OooO0o0) stickerCollectionEditFragment.f79503Oooo000.getValue();
                String str = ((C30935OooO0oo) stickerCollectionEditFragment.f79501OooOooO.getValue()).f110536OooO00o;
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = androidx.lifecycle.o0OoOo0.OooO00o(c30933OooO0o0);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                c30933OooO0o0.f110527OooOOO0 = C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30932OooO0Oo(c30933OooO0o0, str, null), 2);
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(stickerCollectionEditFragment), new C24564OooO00o(R.id.action_to_exportStickerCollectionDialogFragment));
                return;
        }
    }
}
