package com.orion.notein.p607ui.login.password.reset;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.niui.components.button.TextButtonView;
import com.orion.niui.components.textinput.LabeledTextFieldView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0O0ooo0.EnumC26248OooOo0;
import o0O0ooo0.OooOo00;
import o0Oo0O0.C28048OooO00o;
import o0oO0O00.C30774OooO0Oo;
import o0oO0O00.C30780OooOO0O;
import o0oO0O00.C30781OooOO0o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Fragment f72513OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C30781OooOO0o f72514OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LabeledTextFieldView f72515OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TextButtonView f72516OooO0Oo;

    /* JADX INFO: renamed from: com.orion.notein.ui.login.password.reset.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19226OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oO0O000o.OooO00o<C32460OooOooO> f72517OooO00o;

        public C19226OooO00o() {
            throw null;
        }

        public C19226OooO00o(oO0O000o.OooO00o oooO00o) {
            this.f72517OooO00o = oooO00o;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19226OooO00o)) {
                return false;
            }
            C19226OooO00o c19226OooO00o = (C19226OooO00o) obj;
            c19226OooO00o.getClass();
            return OooOOO0.OooO0O0(this.f72517OooO00o, c19226OooO00o.f72517OooO00o);
        }

        public final int hashCode() {
            return this.f72517OooO00o.hashCode();
        }

        public final String toString() {
            return "Config(labelRes=null, supportingTextRes=null, confirmButtonTextRes=null, onConfirm=" + this.f72517OooO00o + ")";
        }
    }

    public OooO00o(Fragment fragment, C30781OooOO0o viewModel) {
        OooOOO0.OooO0oO(viewModel, "viewModel");
        this.f72513OooO00o = fragment;
        this.f72514OooO0O0 = viewModel;
    }

    public final void OooO00o(View view, final C19226OooO00o c19226OooO00o) {
        this.f72515OooO0OO = (LabeledTextFieldView) view.findViewById(R.id.password_field);
        this.f72516OooO0Oo = (TextButtonView) view.findViewById(R.id.btn_confirm);
        LabeledTextFieldView labeledTextFieldView = this.f72515OooO0OO;
        if (labeledTextFieldView == null) {
            OooOOO0.OooOOOO("passwordField");
            throw null;
        }
        labeledTextFieldView.setOnValueChangeListener(new C30774OooO0Oo(this, 0));
        TextButtonView textButtonView = this.f72516OooO0Oo;
        if (textButtonView == null) {
            OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
        textButtonView.setEnabled(false);
        TextButtonView textButtonView2 = this.f72516OooO0Oo;
        if (textButtonView2 == null) {
            OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
        textButtonView2.setClickable(false);
        TextButtonView textButtonView3 = this.f72516OooO0Oo;
        if (textButtonView3 == null) {
            OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
        textButtonView3.setOnClickListener(new View.OnClickListener() { // from class: o0oO0O00.OooO0o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabeledTextFieldView labeledTextFieldView2 = this.f110048OooOo0o.f72515OooO0OO;
                if (labeledTextFieldView2 == null) {
                    OooOOO0.OooOOOO("passwordField");
                    throw null;
                }
                C28048OooO00o.OooO00o(labeledTextFieldView2);
                c19226OooO00o.f72517OooO00o.invoke();
            }
        });
        LabeledTextFieldView labeledTextFieldView2 = this.f72515OooO0OO;
        if (labeledTextFieldView2 != null) {
            labeledTextFieldView2.setMode(OooOo00.f89698OooOo);
        } else {
            OooOOO0.OooOOOO("passwordField");
            throw null;
        }
    }

    public final void OooO0O0(C30780OooOO0O state) {
        OooOOO0.OooO0oO(state, "state");
        LabeledTextFieldView labeledTextFieldView = this.f72515OooO0OO;
        if (labeledTextFieldView == null) {
            OooOOO0.OooOOOO("passwordField");
            throw null;
        }
        String text = labeledTextFieldView.getText();
        String str = state.f110051OooO00o;
        if (!OooOOO0.OooO0O0(text, str)) {
            LabeledTextFieldView labeledTextFieldView2 = this.f72515OooO0OO;
            if (labeledTextFieldView2 == null) {
                OooOOO0.OooOOOO("passwordField");
                throw null;
            }
            labeledTextFieldView2.setText(str);
        }
        LabeledTextFieldView labeledTextFieldView3 = this.f72515OooO0OO;
        if (labeledTextFieldView3 == null) {
            OooOOO0.OooOOOO("passwordField");
            throw null;
        }
        EnumC26248OooOo0 state2 = labeledTextFieldView3.getState();
        EnumC26248OooOo0 enumC26248OooOo0 = state.f110054OooO0Oo;
        if (state2 != enumC26248OooOo0) {
            LabeledTextFieldView labeledTextFieldView4 = this.f72515OooO0OO;
            if (labeledTextFieldView4 == null) {
                OooOOO0.OooOOOO("passwordField");
                throw null;
            }
            labeledTextFieldView4.setState(enumC26248OooOo0);
        }
        Integer num = state.f110056OooO0o0;
        String string = num != null ? this.f72513OooO00o.getString(num.intValue()) : null;
        LabeledTextFieldView labeledTextFieldView5 = this.f72515OooO0OO;
        if (labeledTextFieldView5 == null) {
            OooOOO0.OooOOOO("passwordField");
            throw null;
        }
        labeledTextFieldView5.setSupportingText(string);
        boolean z = state.f110052OooO0O0 && !state.f110053OooO0OO;
        TextButtonView textButtonView = this.f72516OooO0Oo;
        if (textButtonView == null) {
            OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
        textButtonView.setEnabled(z);
        TextButtonView textButtonView2 = this.f72516OooO0Oo;
        if (textButtonView2 != null) {
            textButtonView2.setClickable(z);
        } else {
            OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
    }
}
