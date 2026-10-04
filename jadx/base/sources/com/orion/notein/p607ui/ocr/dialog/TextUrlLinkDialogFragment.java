package com.orion.notein.p607ui.ocr.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0o0o.oo000o;
import o0OoO000.OooO0o;
import o0OoO000.ViewOnClickListenerC28526OooO0o0;
import o0o0OoO0.C30679OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/ocr/dialog/TextUrlLinkDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TextUrlLinkDialogFragment extends Hilt_TextUrlLinkDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public EditText f78412Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f78413Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f78414Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f78415Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public String f78416Oooo0O0 = "";

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public C30679OooO0oo f78417Oooo0OO;

    public static final class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            CharSequence charSequence = editable;
            if (editable == null) {
                charSequence = "";
            }
            TextUrlLinkDialogFragment textUrlLinkDialogFragment = TextUrlLinkDialogFragment.this;
            View view = textUrlLinkDialogFragment.f78415Oooo00o;
            if (view == null) {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
            view.setVisibility(charSequence.length() > 0 ? 0 : 8);
            if (charSequence.length() == 0) {
                EditText editText = textUrlLinkDialogFragment.f78412Oooo0;
                if (editText != null) {
                    editText.setHint(textUrlLinkDialogFragment.f78416Oooo0O0);
                } else {
                    OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class OooO0O0 implements TextWatcher {
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

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_set_uri_link_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f78412Oooo0 = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f78412Oooo0;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f78412Oooo0;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.addTextChangedListener(new OooO00o());
        EditText editText4 = this.f78412Oooo0;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText4.addTextChangedListener(new OooO0O0());
        EditText editText5 = this.f78412Oooo0;
        if (editText5 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText5.requestFocus();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(4);
        }
        View viewFindViewById = view.findViewById(R.id.btn_clear);
        this.f78415Oooo00o = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28526OooO0o0(this, 6));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f78413Oooo000 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new OooO0o(this, 6));
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        this.f78414Oooo00O = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        viewFindViewById3.setOnClickListener(new oo000o(this, 9));
        EditText editText6 = this.f78412Oooo0;
        if (editText6 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText6.setHint(this.f78416Oooo0O0);
        if (this.f78416Oooo0O0.length() == 0) {
            EditText editText7 = this.f78412Oooo0;
            if (editText7 == null) {
                OooOOO0.OooOOOO("inputName");
                throw null;
            }
            editText7.setText("https://");
            EditText editText8 = this.f78412Oooo0;
            if (editText8 != null) {
                editText8.setSelection(editText8.getText().length());
            } else {
                OooOOO0.OooOOOO("inputName");
                throw null;
            }
        }
    }
}
