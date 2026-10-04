package o0OoO000;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import com.orion.notein.p607ui.noteeditor.translate.TranslateDialogFragment;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabNoteTypeFragment;
import o000o0O0.C24586OooOoOO;
import o00o00.C25206OooO0Oo;
import o0o00oO.C29970OooOOo;
import o0o0O00.C30207OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o00Ooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101348OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101349OooOo0o;

    public /* synthetic */ o00Ooo(Object obj, int i) {
        this.f101349OooOo0o = i;
        this.f101348OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101349OooOo0o) {
            case 0:
                FirebaseUserLoginFragment firebaseUserLoginFragment = (FirebaseUserLoginFragment) this.f101348OooOo;
                EditText editText = firebaseUserLoginFragment.f72366OoooO;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
                if (editText.getInputType() == 144) {
                    ImageView imageView = firebaseUserLoginFragment.f72370OoooOO0;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnPasswordVisibility");
                        throw null;
                    }
                    imageView.setImageResource(R.drawable.ic_close_eye);
                    EditText editText2 = firebaseUserLoginFragment.f72366OoooO;
                    if (editText2 != null) {
                        editText2.setInputType(129);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                        throw null;
                    }
                }
                ImageView imageView2 = firebaseUserLoginFragment.f72370OoooOO0;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPasswordVisibility");
                    throw null;
                }
                imageView2.setImageResource(R.drawable.ic_open_eye);
                EditText editText3 = firebaseUserLoginFragment.f72366OoooO;
                if (editText3 != null) {
                    editText3.setInputType(144);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
            case 1:
                TranslateDialogFragment translateDialogFragment = (TranslateDialogFragment) this.f101348OooOo;
                TextView textView = translateDialogFragment.f76922Oooo0O0;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("contentDst");
                    throw null;
                }
                String string = textView.getText().toString();
                C29970OooOOo c29970OooOOoOooOoo0 = translateDialogFragment.OooOoo0();
                Context contextRequireContext = translateDialogFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                c29970OooOOoOooOoo0.OooO0o0(contextRequireContext, string);
                Context contextRequireContext2 = translateDialogFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                String string2 = translateDialogFragment.getString(R.string.translation_has_been_copied_to_clipboard);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                C25206OooO0Oo.OooO0Oo(contextRequireContext2, string2);
                return;
            case 2:
                C30207OooOo.OooO00o oooO00o = ((FabNoteTypeFragment) this.f101348OooOo).f77468OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                    return;
                }
                return;
            default:
                C24586OooOoOO c24586OooOoOO = (C24586OooOoOO) this.f101348OooOo;
                if (c24586OooOoOO != null) {
                    c24586OooOoOO.OooOOo0();
                    return;
                }
                return;
        }
    }
}
