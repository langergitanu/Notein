package com.orion.notein.p607ui.notelist;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0O0oooO.o0OoOo0;
import o0Oo0o0o.OooOo00;
import o0OoOOOo.ViewOnClickListenerC29099OooO0oO;
import o0o00oOo.C30084o00000oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/PdfPasswordDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PdfPasswordDialogFragment extends Hilt_PdfPasswordDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f77287Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f77288Oooo000 = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30084o00000oO.class), new OooO0OO());

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f77289Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f77290Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public EditText f77291Oooo0O0;

    public static final class OooO00o implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class OooO0O0 implements TextWatcher {
        public OooO0O0() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null) {
                charSequence = "";
            }
            PdfPasswordDialogFragment pdfPasswordDialogFragment = PdfPasswordDialogFragment.this;
            View view = pdfPasswordDialogFragment.f77290Oooo00o;
            if (view == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view.setEnabled(charSequence.length() > 0);
            View view2 = pdfPasswordDialogFragment.f77287Oooo0;
            if (view2 != null) {
                view2.setVisibility(charSequence.length() > 0 ? 0 : 8);
            } else {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            PdfPasswordDialogFragment pdfPasswordDialogFragment = PdfPasswordDialogFragment.this;
            Bundle arguments = pdfPasswordDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + pdfPasswordDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_password_input_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.findViewById(R.id.input_password);
        this.f77291Oooo0O0 = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputPassword");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f77291Oooo0O0;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputPassword");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f77291Oooo0O0;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputPassword");
            throw null;
        }
        editText3.addTextChangedListener(new OooO00o());
        EditText editText4 = this.f77291Oooo0O0;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputPassword");
            throw null;
        }
        editText4.addTextChangedListener(new OooO0O0());
        EditText editText5 = this.f77291Oooo0O0;
        if (editText5 == null) {
            OooOOO0.OooOOOO("inputPassword");
            throw null;
        }
        editText5.requestFocus();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(4);
        }
        View viewFindViewById = view.findViewById(R.id.btn_clear);
        this.f77287Oooo0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById.setOnClickListener(new o0OoOo0(this, 5));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f77289Oooo00O = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new OooOo00(this, 3));
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        this.f77290Oooo00o = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC29099OooO0oO(this, 2));
        } else {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
    }
}
