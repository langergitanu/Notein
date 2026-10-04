package o0OoOOOo;

import Oooo0oO.C21030OooOO0o;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.notelist.pdf.ImportBatchPdfDialogFragment;
import com.orion.notein.p607ui.ocr.dialog.SelectNoteDialogFragment;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import o00o00.C25206OooO0Oo;
import o0o000oo.C29825OooOoO0;
import o0o00OOo.C29891OooO0o0;
import o0o0OOO.o0000O;
import o0o0OOO0.C30544OooO0O0;

/* JADX INFO: renamed from: o0OoOOOo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29113OooOo0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103178OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103179OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29113OooOo0O(Object obj, int i) {
        this.f103179OooOo0o = i;
        this.f103178OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103179OooOo0o) {
            case 0:
                TextStyleBox textStyleBox = (TextStyleBox) this.f103178OooOo;
                boolean zIsShowing = textStyleBox.f74149Oooo0o.f103141OooO.isShowing();
                C29108OooOOo c29108OooOOo = textStyleBox.f74149Oooo0o;
                if (zIsShowing) {
                    c29108OooOOo.dismiss();
                    return;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                c29108OooOOo.getClass();
                c29108OooOOo.f103141OooO.showAsDropDown(view, 0, -(C29108OooOOo.f103136OooOOO + C29108OooOOo.f103138OooOOOO));
                InterfaceC29095OooO0OO interfaceC29095OooO0OO = c29108OooOOo.f103143OooO0O0;
                if (interfaceC29095OooO0OO != null) {
                    interfaceC29095OooO0OO.OooO0Oo(true);
                    return;
                }
                return;
            case 1:
                EditorOutlineFragment editorOutlineFragment = (EditorOutlineFragment) this.f103178OooOo;
                EditText editText = editorOutlineFragment.f75799Oooo000;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
                editText.clearFocus();
                ActivityC21897OooOo0 activity = editorOutlineFragment.getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.showGuideVideo(1);
                    return;
                }
                return;
            case 2:
                C29825OooOoO0 c29825OooOoO0 = ((C29891OooO0o0) this.f103178OooOo).f106037OooO0O0;
                if (c29825OooOoO0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29825OooOoO0.OooO00o(view);
                    return;
                }
                return;
            case 3:
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                ImportBatchPdfDialogFragment importBatchPdfDialogFragment = (ImportBatchPdfDialogFragment) this.f103178OooOo;
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) ImportBatchPdfDialogFragment.OooOooO(importBatchPdfDialogFragment.OooOoo().f107875OooO0Oo).toArray(new String[0]));
                importBatchPdfDialogFragment.f77841Oooo0o0.OooO00o(intent);
                return;
            case 4:
                StandardTemplateFragment standardTemplateFragment = (StandardTemplateFragment) this.f103178OooOo;
                standardTemplateFragment.OooOoO0(12, new o0000O(standardTemplateFragment, 0));
                return;
            case 5:
                UserSettingFragment userSettingFragment = (UserSettingFragment) this.f103178OooOo;
                TextView textView = userSettingFragment.f79853Oooo0o;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("txtUid");
                    throw null;
                }
                String string = textView.getText().toString();
                if (string.length() <= 0 || string.equals(userSettingFragment.getString(R.string.loading))) {
                    return;
                }
                Context context = userSettingFragment.getContext();
                Object systemService = context != null ? context.getSystemService("clipboard") : null;
                kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("User ID", string));
                Context context2 = userSettingFragment.getContext();
                if (context2 != null) {
                    String string2 = userSettingFragment.getString(R.string.user_id_copied);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context2, string2);
                    return;
                }
                return;
            default:
                SelectNoteDialogFragment selectNoteDialogFragment = (SelectNoteDialogFragment) this.f103178OooOo;
                C30544OooO0O0 c30544OooO0O0 = (C30544OooO0O0) selectNoteDialogFragment.OooOoo0().f108317OooO.f121747OooOo0o.getValue();
                if (c30544OooO0O0 == null) {
                    C21030OooOO0o.OooO0OO(selectNoteDialogFragment).OooOOo0();
                    return;
                } else {
                    selectNoteDialogFragment.OooOoo0().OooO0o(c30544OooO0O0.f109255OooO00o);
                    return;
                }
        }
    }
}
