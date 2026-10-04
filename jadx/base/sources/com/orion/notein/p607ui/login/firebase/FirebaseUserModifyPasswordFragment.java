package com.orion.notein.p607ui.login.firebase;

import Oooo0.C20860Ooooooo;
import Oooo0.o000000O;
import OooooOO.C21335Oooo0oO;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.C21989OooOooO;
import com.google.android.material.datepicker.OooO0OO;
import com.google.android.material.datepicker.ViewOnClickListenerC22469OooO0o0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.orion.notein.global.R;
import io.ktor.utils.p616io.Oooo000;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oOo.o00oO0O;
import o0OoO000.ViewOnClickListenerC28589o0000oO;
import o0OoO000.o0000O0;
import o0OoO000.o0000OOO;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/firebase/FirebaseUserModifyPasswordFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirebaseUserModifyPasswordFragment extends Hilt_FirebaseUserModifyPasswordFragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f72387Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public ImageView f72388Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f72389Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ViewGroup f72390Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public EditText f72391Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ViewGroup f72392Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public EditText f72393Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f72394Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public ImageView f72395Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public CircularProgressIndicator f72396Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ViewGroup f72397Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Drawable f72398OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TextView f72399OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f72400OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Drawable f72401OoooO0O;

    public static final class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (editable == null) {
                return;
            }
            FirebaseUserModifyPasswordFragment.this.Oooo00o(C33599OooOo0O.Oooooo0(editable.toString()).toString());
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_firebase_user_modify_password;
    }

    public final void Oooo0() {
        TextView textView = this.f72394Oooo0o;
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView.setEnabled(true);
        TextView textView2 = this.f72394Oooo0o;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView2.setText(getString(R.string.modify));
        CircularProgressIndicator circularProgressIndicator = this.f72396Oooo0oO;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("cpiBtnContinue");
            throw null;
        }
    }

    public final boolean Oooo00o(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = str.length() >= 8;
        if (z5) {
            TextView textView = this.f72387Oooo;
            if (textView == null) {
                OooOOO0.OooOOOO("passwordRequirement1");
                throw null;
            }
            textView.setCompoundDrawables(this.f72401OoooO0O, null, null, null);
        } else {
            TextView textView2 = this.f72387Oooo;
            if (textView2 == null) {
                OooOOO0.OooOOOO("passwordRequirement1");
                throw null;
            }
            textView2.setCompoundDrawables(this.f72398OoooO, null, null, null);
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = false;
                break;
            }
            if (Character.isLetter(str.charAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                z2 = false;
                break;
            }
            if (Character.isDigit(str.charAt(i2))) {
                z2 = true;
                break;
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= str.length()) {
                z3 = false;
                break;
            }
            if (!Character.isLetterOrDigit(str.charAt(i3))) {
                z3 = true;
                break;
            }
            i3++;
        }
        boolean z6 = z && (z2 || z3);
        if (z6) {
            TextView textView3 = this.f72400OoooO00;
            if (textView3 == null) {
                OooOOO0.OooOOOO("passwordRequirement2");
                throw null;
            }
            textView3.setCompoundDrawables(this.f72401OoooO0O, null, null, null);
        } else {
            TextView textView4 = this.f72400OoooO00;
            if (textView4 == null) {
                OooOOO0.OooOOOO("passwordRequirement2");
                throw null;
            }
            textView4.setCompoundDrawables(this.f72398OoooO, null, null, null);
        }
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (Oooo000.OooO0o0(cCharAt) || (19968 <= cCharAt && cCharAt < 40960)) {
                z4 = true;
                break;
            }
        }
        z4 = false;
        if (z4) {
            TextView textView5 = this.f72399OoooO0;
            if (textView5 == null) {
                OooOOO0.OooOOOO("passwordRequirement3");
                throw null;
            }
            textView5.setCompoundDrawables(this.f72398OoooO, null, null, null);
        } else {
            TextView textView6 = this.f72399OoooO0;
            if (textView6 == null) {
                OooOOO0.OooOOOO("passwordRequirement3");
                throw null;
            }
            textView6.setCompoundDrawables(this.f72401OoooO0O, null, null, null);
        }
        return z5 && z6 && !z4;
    }

    public final void Oooo0O0(int i) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "FirebasePasswordFragment", "handleLoginResult: ", i), new Object[0]);
        if (i == 1000) {
            return;
        }
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        Oooo0OO(1000L, C21335Oooo0oO.OooO0OO(contextRequireContext, i));
    }

    public final void Oooo0OO(long j, String str) {
        if (j > 0) {
            C21989OooOooO.OooO00o(this).OooO0O0(new o0000OOO(j, this, str, null));
            return;
        }
        Context context = getContext();
        if (context != null) {
            C25206OooO0Oo.OooO0OO((ContextWrapper) context, str);
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.ic_ni_checkbox_radio_large_selected);
        this.f72401OoooO0O = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, o000000O.OooO0o(24), o000000O.OooO0o(24));
        }
        Drawable drawable2 = ContextCompat.getDrawable(requireContext(), R.drawable.ic_error_round);
        this.f72398OoooO = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, o000000O.OooO0o(24), o000000O.OooO0o(24));
        }
        View viewFindViewById = view.findViewById(R.id.btn_close);
        this.f72389Oooo000 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new o00oO0O(this, 1));
        this.f72390Oooo00O = (ViewGroup) view.findViewById(R.id.cl_password_wrapper);
        EditText editText = (EditText) view.findViewById(R.id.et_password);
        this.f72391Oooo00o = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("etPassword");
            throw null;
        }
        editText.setInputType(129);
        EditText editText2 = this.f72391Oooo00o;
        if (editText2 == null) {
            OooOOO0.OooOOOO("etPassword");
            throw null;
        }
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0OoO000.o0000oo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ViewGroup viewGroup = this.f101336OooO00o.f72390Oooo00O;
                if (viewGroup != null) {
                    viewGroup.setActivated(z);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("passwordWrapper");
                    throw null;
                }
            }
        });
        ImageView imageView = (ImageView) view.findViewById(R.id.btn_visibility);
        this.f72388Oooo0 = imageView;
        if (imageView == null) {
            OooOOO0.OooOOOO("btnPasswordVisibility");
            throw null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC28589o0000oO(this, 0));
        this.f72392Oooo0O0 = (ViewGroup) view.findViewById(R.id.cl_new_password_wrapper);
        EditText editText3 = (EditText) view.findViewById(R.id.et_new_password);
        this.f72393Oooo0OO = editText3;
        if (editText3 == null) {
            OooOOO0.OooOOOO("etNewPassword");
            throw null;
        }
        editText3.setInputType(129);
        EditText editText4 = this.f72393Oooo0OO;
        if (editText4 == null) {
            OooOOO0.OooOOOO("etNewPassword");
            throw null;
        }
        editText4.setOnFocusChangeListener(new OooO0OO(this, 1));
        EditText editText5 = this.f72393Oooo0OO;
        if (editText5 == null) {
            OooOOO0.OooOOOO("etNewPassword");
            throw null;
        }
        editText5.addTextChangedListener(new OooO00o());
        ImageView imageView2 = (ImageView) view.findViewById(R.id.btn_new_visibility);
        this.f72395Oooo0o0 = imageView2;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("btnNewPasswordVisibility");
            throw null;
        }
        imageView2.setOnClickListener(new o0000O0(this, 0));
        TextView textView = (TextView) view.findViewById(R.id.btn_continue);
        this.f72394Oooo0o = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView, 500L, new ViewOnClickListenerC22469OooO0o0(this, 1));
        this.f72396Oooo0oO = (CircularProgressIndicator) view.findViewById(R.id.cpi_btn_continue);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cl_password_requirements);
        this.f72397Oooo0oo = viewGroup;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("passwordRequirements");
            throw null;
        }
        viewGroup.setVisibility(8);
        this.f72387Oooo = (TextView) view.findViewById(R.id.tv_password_requirement_1);
        this.f72400OoooO00 = (TextView) view.findViewById(R.id.tv_password_requirement_2);
        this.f72399OoooO0 = (TextView) view.findViewById(R.id.tv_password_requirement_3);
    }
}
