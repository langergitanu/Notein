package com.orion.notein.p607ui.noteeditor.propertypanel.comment;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0Oo0o0o.ViewOnClickListenerC28223OooO;
import o0Oo0o0o.ViewOnClickListenerC28232OooOO0;
import o0Oo0o0o.ViewOnClickListenerC28233OooOO0O;
import o0OoooOo.C29660OooOoOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/comment/NewCommentDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NewCommentDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24568OooO0oO f75785OooOoOO = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C29660OooOoOO.class), new OooO0O0());

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f75786OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f75787OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f75788OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public EditText f75789OooOooo;

    public static final class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            NewCommentDialogFragment newCommentDialogFragment = NewCommentDialogFragment.this;
            View view = newCommentDialogFragment.f75786OooOoo;
            if (view == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view.setEnabled(String.valueOf(charSequence).length() > 0);
            View view2 = newCommentDialogFragment.f75788OooOooO;
            if (view2 == null) {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
            View view3 = newCommentDialogFragment.f75786OooOoo;
            if (view3 != null) {
                view2.setVisibility(view3.isEnabled() ? 0 : 8);
            } else {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            NewCommentDialogFragment newCommentDialogFragment = NewCommentDialogFragment.this;
            Bundle arguments = newCommentDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + newCommentDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_new_comment_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.page_number);
        if (textView == null) {
            OooOOO0.OooOOOO("pageNumber");
            throw null;
        }
        textView.setText(String.valueOf(((C29660OooOoOO) this.f75785OooOoOO.getValue()).f105172OooO00o + 1));
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f75789OooOooo = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f75789OooOooo;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f75789OooOooo;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.requestFocus();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(4);
        }
        View viewFindViewById = view.findViewById(R.id.btn_cancel);
        this.f75787OooOoo0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28223OooO(this, 2));
        View viewFindViewById2 = view.findViewById(R.id.btn_confirm);
        this.f75786OooOoo = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28232OooOO0(this, 2));
        View viewFindViewById3 = view.findViewById(R.id.btn_clear);
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC28233OooOO0O(this, 2));
        this.f75788OooOooO = viewFindViewById3;
        EditText editText4 = this.f75789OooOooo;
        if (editText4 != null) {
            editText4.addTextChangedListener(new OooO00o());
        } else {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
    }
}
