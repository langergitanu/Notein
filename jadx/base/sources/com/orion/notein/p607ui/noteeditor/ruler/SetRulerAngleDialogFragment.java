package com.orion.notein.p607ui.noteeditor.ruler;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0Oo0oOo.ViewOnClickListenerC28305OooO;
import o0Oo0oOo.ViewOnClickListenerC28314OooOO0;
import o0OoOOoO.ViewOnClickListenerC29187OooO00o;
import o0o0000o.C29731OooO0oo;
import o0o0000o.OooO;
import oO00ooO.C32443OooOOO;
import oO0O00oo.OooOO0;
import oO0o0O0o.C33596OooOOo0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/ruler/SetRulerAngleDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SetRulerAngleDialogFragment extends Hilt_SetRulerAngleDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public EditText f76225Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f76226Oooo000 = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(OooO.class), new OooO00o());

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f76227Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f76228Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ImageView f76229Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f76230Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f76231Oooo0o0;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            SetRulerAngleDialogFragment setRulerAngleDialogFragment = SetRulerAngleDialogFragment.this;
            Bundle arguments = setRulerAngleDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + setRulerAngleDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_jump_to_page_dialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooO Oooo0() {
        return (OooO) this.f76226Oooo000.getValue();
    }

    public final void Oooo00o() {
        EditText editText = this.f76225Oooo0;
        if (editText == null) {
            OooOOO0.OooOOOO("inputField");
            throw null;
        }
        Editable text = editText.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        Integer numOooo0O0 = Oooo0O0(string);
        if (numOooo0O0 != null) {
            requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("angle_deg", numOooo0O0)), "set_ruler_angle");
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final Integer Oooo0O0(String str) {
        Integer numOooOOO0;
        String string = C33599OooOo0O.Oooooo0(str).toString();
        if (string.length() == 0 || (numOooOOO0 = C33596OooOOo0.OooOOO0(string)) == null) {
            return null;
        }
        int iIntValue = numOooOOO0.intValue();
        int iMin = Math.min(Oooo0().f105412OooO0O0, Oooo0().f105413OooO0OO);
        int iMax = Math.max(Oooo0().f105412OooO0O0, Oooo0().f105413OooO0OO);
        if (iIntValue < iMin || iIntValue > iMax) {
            return null;
        }
        return numOooOOO0;
    }

    public final void Oooo0OO(String str) {
        ImageView imageView = this.f76229Oooo0O0;
        if (imageView == null) {
            OooOOO0.OooOOOO("clearButton");
            throw null;
        }
        imageView.setVisibility(str.length() > 0 ? 0 : 8);
        View view = this.f76231Oooo0o0;
        if (view != null) {
            view.setEnabled(Oooo0O0(str) != null);
        } else {
            OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f76227Oooo00O = (TextView) view.findViewById(R.id.dialog_title);
        this.f76228Oooo00o = (TextView) view.findViewById(R.id.dialog_hint);
        this.f76225Oooo0 = (EditText) view.findViewById(R.id.input_name);
        this.f76229Oooo0O0 = (ImageView) view.findViewById(R.id.btn_clear);
        this.f76230Oooo0OO = view.findViewById(R.id.btn_cancel);
        this.f76231Oooo0o0 = view.findViewById(R.id.btn_confirm);
        TextView textView = this.f76227Oooo00O;
        if (textView == null) {
            OooOOO0.OooOOOO("titleView");
            throw null;
        }
        textView.setText(getString(R.string.set_ruler_angle_title));
        EditText editText = this.f76225Oooo0;
        if (editText == null) {
            OooOOO0.OooOOOO("inputField");
            throw null;
        }
        editText.setHint(getString(R.string.ruler_angle_input_hint));
        TextView textView2 = this.f76228Oooo00o;
        if (textView2 == null) {
            OooOOO0.OooOOOO("hintView");
            throw null;
        }
        int i = Oooo0().f105412OooO0O0;
        if (i < 0) {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        int i2 = Oooo0().f105413OooO0OO;
        int i3 = Oooo0().f105412OooO0O0;
        if (i2 < i3) {
            i2 = i3;
        }
        textView2.setText(getString(R.string.ruler_angle_range_hint, numValueOf, Integer.valueOf(i2)));
        String strValueOf = String.valueOf(OooOO0.OooO0o(Oooo0().f105411OooO00o, Oooo0().f105412OooO0O0, Oooo0().f105413OooO0OO));
        EditText editText2 = this.f76225Oooo0;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputField");
            throw null;
        }
        editText2.setText(strValueOf);
        EditText editText3 = this.f76225Oooo0;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputField");
            throw null;
        }
        editText3.setSelection(strValueOf.length());
        EditText editText4 = this.f76225Oooo0;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputField");
            throw null;
        }
        editText4.setHorizontallyScrolling(false);
        EditText editText5 = this.f76225Oooo0;
        if (editText5 == null) {
            OooOOO0.OooOOOO("inputField");
            throw null;
        }
        editText5.setMaxLines(Integer.MAX_VALUE);
        EditText editText6 = this.f76225Oooo0;
        if (editText6 == null) {
            OooOOO0.OooOOOO("inputField");
            throw null;
        }
        editText6.setImeOptions(2);
        EditText editText7 = this.f76225Oooo0;
        if (editText7 == null) {
            OooOOO0.OooOOOO("inputField");
            throw null;
        }
        editText7.requestFocus();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(4);
        }
        EditText editText8 = this.f76225Oooo0;
        if (editText8 == null) {
            OooOOO0.OooOOOO("inputField");
            throw null;
        }
        editText8.addTextChangedListener(new C29731OooO0oo(this));
        EditText editText9 = this.f76225Oooo0;
        if (editText9 == null) {
            OooOOO0.OooOOOO("inputField");
            throw null;
        }
        editText9.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o0000o.OooO0oO
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i4, KeyEvent keyEvent) {
                if (i4 != 2) {
                    return false;
                }
                this.f105442OooOo0o.Oooo00o();
                return true;
            }
        });
        ImageView imageView = this.f76229Oooo0O0;
        if (imageView == null) {
            OooOOO0.OooOOOO("clearButton");
            throw null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC28305OooO(this, 2));
        View view2 = this.f76230Oooo0OO;
        if (view2 == null) {
            OooOOO0.OooOOOO("cancelButton");
            throw null;
        }
        view2.setOnClickListener(new ViewOnClickListenerC28314OooOO0(this, 2));
        View view3 = this.f76231Oooo0o0;
        if (view3 == null) {
            OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
        view3.setOnClickListener(new ViewOnClickListenerC29187OooO00o(this, 1));
        EditText editText10 = this.f76225Oooo0;
        if (editText10 == null) {
            OooOOO0.OooOOOO("inputField");
            throw null;
        }
        Editable text = editText10.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        Oooo0OO(string);
    }
}
