package o0Ooo0oo;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OutlineEditDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OutlineVO;
import com.orion.penkit.tools.DrawToolFactory;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0Ooo0oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29444OooO0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f104498OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104499OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f104500OooOoO0;

    public /* synthetic */ ViewOnClickListenerC29444OooO0o0(Fragment fragment, Object obj, int i) {
        this.f104499OooOo0o = i;
        this.f104498OooOo = fragment;
        this.f104500OooOoO0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f104499OooOo0o) {
            case 0:
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) this.f104498OooOo;
                if (!penBarChildFragment.f75311o0OO00O) {
                    ImageView imageView = penBarChildFragment.f75273OooooOO;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoRect");
                        throw null;
                    }
                    if (imageView.isSelected()) {
                        ((C29441OooO0OO) this.f104500OooOoO0).invoke(DrawToolFactory.LASSO_TYPE_RECT);
                        return;
                    }
                }
                penBarChildFragment.Oooo0oO().OooOOO0(DrawToolFactory.LASSO_TYPE_RECT);
                return;
            default:
                OutlineEditDialogFragment outlineEditDialogFragment = (OutlineEditDialogFragment) this.f104498OooOo;
                EditText editText = outlineEditDialogFragment.f75894OooOooo;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                Editable text = editText.getText();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(text);
                if (text.length() == 0) {
                    Context contextRequireContext = outlineEditDialogFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = outlineEditDialogFragment.getString(R.string.toast_enter_outline);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    return;
                }
                outlineEditDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("outline_id", ((OutlineVO) this.f104500OooOoO0).getId()), new C32443OooOOO("outline_title", text.toString())), "update_outline");
                Dialog dialog = outlineEditDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }
}
