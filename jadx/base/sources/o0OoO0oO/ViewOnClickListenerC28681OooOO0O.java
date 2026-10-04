package o0OoO0oO;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.dialog.TemplateRenameDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentDeleteAlertDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00.C25206OooO0Oo;
import o0OoOO0o.C29038OooO0o0;
import o0OoooOo.C29636OooO0O0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoO0oO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28681OooOO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101638OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101639OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28681OooOO0O(Object obj, int i) {
        this.f101639OooOo0o = i;
        this.f101638OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101638OooOo;
        switch (this.f101639OooOo0o) {
            case 0:
                View.OnClickListener onClickListener = ((C28680OooOO0) obj).f101627OooO0O0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 1:
                TemplateRenameDialogFragment templateRenameDialogFragment = (TemplateRenameDialogFragment) obj;
                EditText editText = templateRenameDialogFragment.f73960Oooo0OO;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                Editable text = editText.getText();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(text);
                if (text.length() != 0) {
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o((C29038OooO0o0) templateRenameDialogFragment.f73957Oooo00O.getValue()), null, null, new TemplateRenameDialogFragment.OooO0OO(templateRenameDialogFragment, text, null), 3);
                    return;
                }
                Context contextRequireContext = templateRenameDialogFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                String string = templateRenameDialogFragment.getString(R.string.toast_enter_a_filename);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                return;
            case 2:
                CommentDeleteAlertDialogFragment commentDeleteAlertDialogFragment = (CommentDeleteAlertDialogFragment) obj;
                C29636OooO0O0 c29636OooO0O0 = (C29636OooO0O0) commentDeleteAlertDialogFragment.f75705OooOoOO.getValue();
                Bundle bundle = new Bundle();
                bundle.putString("comment_id", c29636OooO0O0.f105093OooO00o);
                commentDeleteAlertDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(bundle, "delete_comment");
                Dialog dialog = commentDeleteAlertDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 3:
                ActivityC21897OooOo0 activity = ((BaseToolbarChildFragment) obj).getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.openMembershipPlans();
                    return;
                }
                return;
            default:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("text/xml");
                intent.putExtra("android.intent.extra.TITLE", "report-" + new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.getDefault()).format(new Date(System.currentTimeMillis())) + ".xml");
                ((DebugFragment) obj).f79029Oooo00o.OooO00o(intent);
                return;
        }
    }
}
