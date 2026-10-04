package o0OoOOOo;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.C21904OooOoo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.SimpleEditTextDialogFragment;
import o0o00Ooo.C29920OooO0oo;

/* JADX INFO: renamed from: o0OoOOOo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29104OooOOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103128OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103129OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f103130OooOoO0;

    public /* synthetic */ ViewOnClickListenerC29104OooOOO(int i, Object obj, Object obj2) {
        this.f103129OooOo0o = i;
        this.f103128OooOo = obj;
        this.f103130OooOoO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text;
        switch (this.f103129OooOo0o) {
            case 0:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorSetVO");
                C29920OooO0oo c29920OooO0oo = (C29920OooO0oo) tag;
                int id = view.getId();
                InterfaceC29094OooO0O0 interfaceC29094OooO0O0 = (InterfaceC29094OooO0O0) this.f103128OooOo;
                String str = c29920OooO0oo.f106158OooO00o;
                if (id == R.id.btn_delete) {
                    interfaceC29094OooO0O0.OooO0Oo(str);
                } else {
                    C29108OooOOo c29108OooOOo = (C29108OooOOo) this.f103130OooOoO0;
                    if (id == R.id.btn_edit_name) {
                        c29108OooOOo.OooO0O0().dismiss();
                        interfaceC29094OooO0O0.OooO0OO(str, c29920OooO0oo.f106159OooO0O0);
                    } else {
                        c29108OooOOo.OooO0O0().dismiss();
                        interfaceC29094OooO0O0.OooO0O0(c29920OooO0oo);
                    }
                }
                break;
            default:
                Bundle bundle = new Bundle();
                EditText editText = (EditText) this.f103128OooOo;
                bundle.putString("key_bundle_for_text", (editText == null || (text = editText.getText()) == null) ? null : text.toString());
                SimpleEditTextDialogFragment simpleEditTextDialogFragment = (SimpleEditTextDialogFragment) this.f103130OooOoO0;
                C21904OooOoo0.OooO0o(bundle, simpleEditTextDialogFragment, "key_result_for_text");
                simpleEditTextDialogFragment.dismiss();
                break;
        }
    }
}
