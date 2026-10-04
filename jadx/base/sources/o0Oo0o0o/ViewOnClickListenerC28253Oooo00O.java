package o0Oo0o0o;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.View;
import com.android.billingclient.api.C22172OooOoO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.ocr.dialog.SelectNoteDialogFragment;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import o0O0o0oO.ViewOnClickListenerC26054OoooOoo;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0o000oo.C29825OooOoO0;
import o0o00OOo.C29891OooO0o0;
import o0o0OOO0.C30544OooO0O0;
import o0ooo.C31700OooOOoo;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0Oo0o0o.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28253Oooo00O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100115OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100116OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28253Oooo00O(Object obj, int i) {
        this.f100116OooOo0o = i;
        this.f100115OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Object obj = this.f100115OooOo;
        switch (this.f100116OooOo0o) {
            case 0:
                ExportDialogFragment exportDialogFragment = (ExportDialogFragment) obj;
                View view2 = exportDialogFragment.f71593Oooo0o0;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("pdfTypeView");
                    throw null;
                }
                if (view2.isActivated()) {
                    exportDialogFragment.Oooo0OO().OooOO0(0);
                    return;
                }
                if (exportDialogFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") != null) {
                    return;
                }
                ViewOnClickListenerC26311Ooooooo viewOnClickListenerC26311Ooooooo = new ViewOnClickListenerC26311Ooooooo();
                ViewOnClickListenerC26054OoooOoo viewOnClickListenerC26054OoooOoo = new ViewOnClickListenerC26054OoooOoo(exportDialogFragment, 1);
                String string = exportDialogFragment.getString(R.string.upgrade_now);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = exportDialogFragment.getString(R.string.title_upgrade_to_vip_export_pdf);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                String string3 = exportDialogFragment.getString(R.string.content_upgrade_to_vip_export_pdf);
                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                new TipsDialogFragment(string2, string3, viewOnClickListenerC26311Ooooooo, viewOnClickListenerC26054OoooOoo, null, string, 0, null, 384).show(exportDialogFragment.getChildFragmentManager(), "TipsDialogFragment");
                return;
            case 1:
                TextStyleBox.OooO00o((TextStyleBox) obj, view);
                return;
            case 2:
                C29825OooOoO0 c29825OooOoO0 = ((C29891OooO0o0) obj).f106037OooO0O0;
                if (c29825OooOoO0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29825OooOoO0.OooO00o(view);
                    return;
                }
                return;
            case 3:
                ((UserSettingFragment) obj).OooOoo0();
                return;
            default:
                SelectNoteDialogFragment selectNoteDialogFragment = (SelectNoteDialogFragment) obj;
                C30544OooO0O0 c30544OooO0O0 = (C30544OooO0O0) selectNoteDialogFragment.OooOoo0().f108317OooO.f121747OooOo0o.getValue();
                if (c30544OooO0O0 == null || (str = c30544OooO0O0.f109255OooO00o) == null) {
                    return;
                }
                Bundle bundleOooO00o = C22172OooOoO.OooO00o("note_id", str);
                bundleOooO00o.putBoolean("create_new_session", ((C31700OooOOoo) selectNoteDialogFragment.f78377OooOooO.getValue()).f113238OooO00o);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                selectNoteDialogFragment.getParentFragmentManager().OooooOo(bundleOooO00o, "import_note");
                C21030OooOO0o.OooO0OO(selectNoteDialogFragment).OooOOo0();
                return;
        }
    }
}
