package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.p607ui.backup.CloudBackupFragment;
import com.orion.notein.p607ui.creative_library.MaterialActionsBottomSheetDialog;
import com.orion.notein.p607ui.login.firebase.FirebaseUserReAuthPasswordFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.pageeditor.PageSaveAsDialogFragment;
import com.orion.notein.ui.backup.CloudBackupFragment.OooO00o;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C29997OooOo0;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o00000O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100553OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100554OooOo0o;

    public /* synthetic */ o00000O0(Object obj, int i) {
        this.f100554OooOo0o = i;
        this.f100553OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100554OooOo0o) {
            case 0:
                MaterialActionsBottomSheetDialog materialActionsBottomSheetDialog = (MaterialActionsBottomSheetDialog) this.f100553OooOo;
                Bundle arguments = materialActionsBottomSheetDialog.getArguments();
                String string = arguments != null ? arguments.getString("arg_material_id") : null;
                Bundle arguments2 = materialActionsBottomSheetDialog.getArguments();
                String string2 = arguments2 != null ? arguments2.getString("arg_material_title") : null;
                materialActionsBottomSheetDialog.dismissAllowingStateLoss();
                if (string == null || string2 == null) {
                    return;
                }
                materialActionsBottomSheetDialog.getParentFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("material_id", string), new C32443OooOOO("material_title", string2)), "show_delete_confirm");
                return;
            case 1:
                C21030OooOO0o.OooO0OO((FirebaseUserReAuthPasswordFragment) this.f100553OooOo).OooOOo0();
                return;
            case 2:
                boolean zIsActivated = view.isActivated();
                C29997OooOo0 c29997OooOo0 = (C29997OooOo0) this.f100553OooOo;
                if (zIsActivated) {
                    C29936OooO0oO c29936OooO0oO = c29997OooOo0.f106584Oooo0OO;
                    if (c29936OooO0oO != null) {
                        c29936OooO0oO.OooO0oo(c29997OooOo0.f106587Oooo0oO);
                        return;
                    }
                    return;
                }
                C29936OooO0oO c29936OooO0oO2 = c29997OooOo0.f106584Oooo0OO;
                if (c29936OooO0oO2 != null) {
                    c29936OooO0oO2.OooO0OO(c29997OooOo0.f106587Oooo0oO);
                    return;
                }
                return;
            case 3:
                Dialog dialog = ((PageSaveAsDialogFragment) this.f100553OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 4:
                CloudBackupFragment cloudBackupFragment = (CloudBackupFragment) this.f100553OooOo;
                SwitchMaterial switchMaterial = cloudBackupFragment.f70536Oooo0;
                if (switchMaterial == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("switch");
                    throw null;
                }
                if (!switchMaterial.isChecked()) {
                    SwitchMaterial switchMaterial2 = cloudBackupFragment.f70536Oooo0;
                    if (switchMaterial2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("switch");
                        throw null;
                    }
                    switchMaterial2.setChecked(true);
                    cloudBackupFragment.OooOoOO().OooOO0o(BackupFile.DiskVendor.None);
                    return;
                }
                SwitchMaterial switchMaterial3 = cloudBackupFragment.f70536Oooo0;
                if (switchMaterial3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("switch");
                    throw null;
                }
                switchMaterial3.setChecked(false);
                InterfaceC21987OooOoo viewLifecycleOwner = cloudBackupFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, cloudBackupFragment.new OooO00o(null), 3);
                return;
            default:
                ((TextRecognizeFragment) this.f100553OooOo).Oooo0o();
                return;
        }
    }
}
