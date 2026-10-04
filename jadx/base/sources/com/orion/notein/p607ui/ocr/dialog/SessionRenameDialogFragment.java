package com.orion.notein.p607ui.ocr.dialog;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o000o0O0.OooOO0;
import o0o00oo.ViewOnClickListenerC30096OooO0OO;
import o0o00oo.ViewOnClickListenerC30097OooO0Oo;
import o0o0OO0.C30394OooOOOO;
import o0ooo.C31701OooOo0;
import oO00ooO.C32447OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/ocr/dialog/SessionRenameDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SessionRenameDialogFragment extends Hilt_SessionRenameDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f78399Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f78400Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f78401Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f78402Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f78403Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public EditText f78404Oooo0OO;

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
            SessionRenameDialogFragment sessionRenameDialogFragment = SessionRenameDialogFragment.this;
            View view = sessionRenameDialogFragment.f78399Oooo0;
            if (view == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view.setEnabled(charSequence.length() > 0);
            View view2 = sessionRenameDialogFragment.f78403Oooo0O0;
            if (view2 == null) {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
            view2.setVisibility(charSequence.length() <= 0 ? 8 : 0);
            if (charSequence.length() == 0) {
                EditText editText = sessionRenameDialogFragment.f78404Oooo0OO;
                if (editText != null) {
                    editText.setHint(((C31701OooOo0) sessionRenameDialogFragment.f78400Oooo000.getValue()).f113240OooO0O0);
                } else {
                    OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            }
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(SessionRenameDialogFragment.this).OooO0o(R.id.textRecognizeFragment);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.SessionRenameDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23740OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78407OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23740OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78407OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f78407OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78408OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78408OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = SessionRenameDialogFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f78408OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.SessionRenameDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23741OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78410OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23741OooO0o0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78410OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f78410OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.SessionRenameDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23742OooO0oO extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23742OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            SessionRenameDialogFragment sessionRenameDialogFragment = SessionRenameDialogFragment.this;
            Bundle arguments = sessionRenameDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + sessionRenameDialogFragment + " has null arguments");
        }
    }

    public SessionRenameDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78400Oooo000 = new C24568OooO0oO(oooo0.OooO0O0(C31701OooOo0.class), new C23742OooO0oO());
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO0OO());
        C23740OooO0Oo c23740OooO0Oo = new C23740OooO0Oo(c32447OooOOoOooO0OO);
        this.f78401Oooo00O = new C22026ooOO(oooo0.OooO0O0(C30394OooOOOO.class), c23740OooO0Oo, new OooO0o(c32447OooOOoOooO0OO), new C23741OooO0o0(c32447OooOOoOooO0OO));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_text_recognize_session_rename_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f78404Oooo0OO = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f78404Oooo0OO;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f78404Oooo0OO;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.setText(((C31701OooOo0) this.f78400Oooo000.getValue()).f113240OooO0O0);
        EditText editText4 = this.f78404Oooo0OO;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText4.addTextChangedListener(new OooO00o());
        EditText editText5 = this.f78404Oooo0OO;
        if (editText5 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText5.addTextChangedListener(new OooO0O0());
        EditText editText6 = this.f78404Oooo0OO;
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
        this.f78403Oooo0O0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC30096OooO0OO(this, 2));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f78402Oooo00o = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new o0OoO000.OooO0OO(this, 6));
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        this.f78399Oooo0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC30097OooO0Oo(this, 3));
        } else {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
    }
}
