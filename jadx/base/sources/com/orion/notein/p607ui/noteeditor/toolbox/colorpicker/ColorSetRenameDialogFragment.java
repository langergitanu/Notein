package com.orion.notein.p607ui.noteeditor.toolbox.colorpicker;

import Oooo0.o000000O;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0OoO000.ViewOnClickListenerC28541OooOoo;
import o0OoO000.ViewOnClickListenerC28542OooOoo0;
import o0o00Ooo.C29917OooO0o;
import o0o00Ooo.ViewOnClickListenerC29918OooO0o0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/colorpicker/ColorSetRenameDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ColorSetRenameDialogFragment extends Hilt_ColorSetRenameDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f76846Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f76847Oooo000 = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C29917OooO0o.class), new OooO0OO());

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f76848Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f76849Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public EditText f76850Oooo0O0;

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
            ColorSetRenameDialogFragment colorSetRenameDialogFragment = ColorSetRenameDialogFragment.this;
            View view = colorSetRenameDialogFragment.f76849Oooo00o;
            if (view == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view.setEnabled(charSequence.length() > 0);
            View view2 = colorSetRenameDialogFragment.f76846Oooo0;
            if (view2 == null) {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
            view2.setVisibility(charSequence.length() <= 0 ? 8 : 0);
            if (charSequence.length() == 0) {
                EditText editText = colorSetRenameDialogFragment.f76850Oooo0O0;
                if (editText != null) {
                    editText.setHint(((C29917OooO0o) colorSetRenameDialogFragment.f76847Oooo000.getValue()).f106153OooO00o);
                } else {
                    OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            }
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            ColorSetRenameDialogFragment colorSetRenameDialogFragment = ColorSetRenameDialogFragment.this;
            Bundle arguments = colorSetRenameDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + colorSetRenameDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_color_set_rename_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.divider);
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        if (C33599OooOo0O.OooOoOO(BRAND, "HUAWEI", true) || C33599OooOo0O.OooOoOO(BRAND, "HONOR", true)) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ActivityC21897OooOo0 activity = getActivity();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (activity == null || !activity.isInMultiWindowMode()) ? o000000O.OooO0o(11) : o000000O.OooO0o(22), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            viewFindViewById.setLayoutParams(marginLayoutParams);
        }
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f76850Oooo0O0 = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f76850Oooo0O0;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f76850Oooo0O0;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.setText(((C29917OooO0o) this.f76847Oooo000.getValue()).f106153OooO00o);
        EditText editText4 = this.f76850Oooo0O0;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText4.addTextChangedListener(new OooO00o());
        EditText editText5 = this.f76850Oooo0O0;
        if (editText5 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText5.addTextChangedListener(new OooO0O0());
        EditText editText6 = this.f76850Oooo0O0;
        if (editText6 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText6.requestFocus();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(4);
        }
        View viewFindViewById2 = view.findViewById(R.id.btn_clear);
        this.f76846Oooo0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28542OooOoo0(this, 2));
        View viewFindViewById3 = view.findViewById(R.id.btn_cancel);
        this.f76848Oooo00O = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC28541OooOoo(this, 1));
        View viewFindViewById4 = view.findViewById(R.id.btn_confirm);
        this.f76849Oooo00o = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(new ViewOnClickListenerC29918OooO0o0(this, 0));
        } else {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
    }
}
