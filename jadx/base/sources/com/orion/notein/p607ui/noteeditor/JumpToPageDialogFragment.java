package com.orion.notein.p607ui.noteeditor;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.JumpToPageDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0OoO0oo.C28705OooOo00;
import o0OoO0oo.ViewOnClickListenerC28700OooOOo;
import o0OoO0oo.ViewOnClickListenerC28701OooOOo0;
import o0OoO0oo.ViewOnClickListenerC28702OooOOoo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/JumpToPageDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class JumpToPageDialogFragment extends Hilt_JumpToPageDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f72789Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f72790Oooo000 = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28705OooOo00.class), new OooO0OO());

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f72791Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f72792Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public EditText f72793Oooo0O0;

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
            String strValueOf = String.valueOf(charSequence);
            JumpToPageDialogFragment jumpToPageDialogFragment = JumpToPageDialogFragment.this;
            View view = jumpToPageDialogFragment.f72789Oooo0;
            if (view == null) {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
            view.setVisibility(strValueOf.length() > 0 ? 0 : 8);
            try {
                int i4 = Integer.parseInt(strValueOf);
                View view2 = jumpToPageDialogFragment.f72792Oooo00o;
                if (view2 == null) {
                    OooOOO0.OooOOOO("btnConfirm");
                    throw null;
                }
                boolean z = true;
                if (i4 < 1 || i4 > ((C28705OooOo00) jumpToPageDialogFragment.f72790Oooo000.getValue()).f101705OooO00o) {
                    z = false;
                }
                view2.setEnabled(z);
            } catch (Exception unused) {
                View view3 = jumpToPageDialogFragment.f72792Oooo00o;
                if (view3 != null) {
                    view3.setEnabled(false);
                } else {
                    OooOOO0.OooOOOO("btnConfirm");
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
            JumpToPageDialogFragment jumpToPageDialogFragment = JumpToPageDialogFragment.this;
            Bundle arguments = jumpToPageDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + jumpToPageDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_jump_to_page_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.dialog_hint);
        if (textView == null) {
            OooOOO0.OooOOOO("hint");
            throw null;
        }
        textView.setText(getString(R.string.enter_a_page_number) + "（1-" + ((C28705OooOo00) this.f72790Oooo000.getValue()).f101705OooO00o + "）");
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f72793Oooo0O0 = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f72793Oooo0O0;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f72793Oooo0O0;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.addTextChangedListener(new OooO00o());
        EditText editText4 = this.f72793Oooo0O0;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText4.addTextChangedListener(new OooO0O0());
        EditText editText5 = this.f72793Oooo0O0;
        if (editText5 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText5.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0OoO0oo.OooOOOo
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                if (i != 2) {
                    return true;
                }
                JumpToPageDialogFragment jumpToPageDialogFragment = this.f101697OooOo0o;
                EditText editText6 = jumpToPageDialogFragment.f72793Oooo0O0;
                if (editText6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                try {
                    jumpToPageDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("page_number", Integer.valueOf(Integer.parseInt(editText6.getText().toString())))), "jump_to_page");
                } catch (Exception unused) {
                    Log.d("JumpToPageDialogFragment", "page number is not valid");
                }
                Dialog dialog = jumpToPageDialogFragment.getDialog();
                if (dialog == null) {
                    return true;
                }
                dialog.dismiss();
                return true;
            }
        });
        EditText editText6 = this.f72793Oooo0O0;
        if (editText6 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText6.requestFocus();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(4);
        }
        View viewFindViewById = view.findViewById(R.id.btn_clear);
        this.f72789Oooo0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28701OooOOo0(this, 0));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f72791Oooo00O = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28700OooOOo(this, 0));
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        this.f72792Oooo00o = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC28702OooOOoo(this, 0));
        } else {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
    }
}
