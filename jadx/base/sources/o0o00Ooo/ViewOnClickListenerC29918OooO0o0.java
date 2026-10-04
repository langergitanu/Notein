package o0o00Ooo;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.colorpicker.ColorSetRenameDialogFragment;
import com.orion.notein.p607ui.notelist.about.AboutFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.vip.VipFeaturesComparisonFragment;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import o0o0O0oO.C30320OooOO0;
import o0oOoOoO.C31099OooO0o0;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0o00Ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29918OooO0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f106155OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f106156OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29918OooO0o0(Fragment fragment, int i) {
        this.f106156OooOo0o = i;
        this.f106155OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f106156OooOo0o) {
            case 0:
                ColorSetRenameDialogFragment colorSetRenameDialogFragment = (ColorSetRenameDialogFragment) this.f106155OooOo;
                EditText editText = colorSetRenameDialogFragment.f76850Oooo0O0;
                if (editText == null) {
                    OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                Editable text = editText.getText();
                OooOOO0.OooO0Oo(text);
                if (text.length() == 0) {
                    Context contextRequireContext = colorSetRenameDialogFragment.requireContext();
                    OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = colorSetRenameDialogFragment.getString(R.string.toast_enter_a_filename);
                    OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    return;
                }
                Log.d("RenameDialogFragment", "rename to " + ((Object) text));
                colorSetRenameDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("id", ((C29917OooO0o) colorSetRenameDialogFragment.f76847Oooo000.getValue()).f106154OooO0O0), new C32443OooOOO("new_name", text.toString())), "color_set_rename");
                Dialog dialog = colorSetRenameDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
                Context contextRequireContext2 = ((AboutFragment) this.f106155OooOo).requireContext();
                OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext2, null), 3);
                return;
            case 2:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((TrashBinContainerFragment) this.f106155OooOo), new C30320OooOO0(null));
                return;
            default:
                C21030OooOO0o.OooO0OO((VipFeaturesComparisonFragment) this.f106155OooOo).OooOOo0();
                return;
        }
    }
}
