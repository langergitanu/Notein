package com.orion.notein.p607ui.login.firebase;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oOo.o00000O0;
import o0OoO000.ViewOnClickListenerC28583o0000OoO;
import o0OoO000.ViewOnClickListenerC28586o0000o0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/firebase/FirebaseUserReAuthPasswordFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirebaseUserReAuthPasswordFragment extends Hilt_FirebaseUserReAuthPasswordFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public ViewGroup f72403Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f72404Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ViewGroup f72405Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public EditText f72406Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public EditText f72407Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ImageView f72408Oooo0OO;

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_firebase_user_reauth_password;
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
        View viewFindViewById = view.findViewById(R.id.btn_close);
        this.f72404Oooo000 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new o00000O0(this, 1));
        this.f72405Oooo00O = (ViewGroup) view.findViewById(R.id.cl_email_wrapper);
        EditText editText = (EditText) view.findViewById(R.id.et_email);
        this.f72406Oooo00o = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("etEmail");
            throw null;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0OoO000.o0000Oo0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ViewGroup viewGroup = this.f101316OooO00o.f72405Oooo00O;
                if (viewGroup != null) {
                    viewGroup.setActivated(z);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("emailWrapper");
                    throw null;
                }
            }
        });
        this.f72403Oooo0 = (ViewGroup) view.findViewById(R.id.cl_password_wrapper);
        EditText editText2 = (EditText) view.findViewById(R.id.et_password);
        this.f72407Oooo0O0 = editText2;
        if (editText2 == null) {
            OooOOO0.OooOOOO("etPassword");
            throw null;
        }
        editText2.setInputType(129);
        EditText editText3 = this.f72407Oooo0O0;
        if (editText3 == null) {
            OooOOO0.OooOOOO("etPassword");
            throw null;
        }
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0OoO000.o0000Oo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ViewGroup viewGroup = this.f101315OooO00o.f72403Oooo0;
                if (viewGroup != null) {
                    viewGroup.setActivated(z);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("passwordWrapper");
                    throw null;
                }
            }
        });
        ImageView imageView = (ImageView) view.findViewById(R.id.btn_visibility);
        this.f72408Oooo0OO = imageView;
        if (imageView == null) {
            OooOOO0.OooOOOO("btnPasswordVisibility");
            throw null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC28583o0000OoO(this, 0));
        TextView textView = (TextView) view.findViewById(R.id.btn_continue);
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView, 500L, new ViewOnClickListenerC28586o0000o0(this, 0));
    }
}
