package com.orion.notein.p607ui.noteeditor.pagelayereditor;

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
import o0O0O0o.C25871OooO00o;
import o0O0o0oO.ViewOnClickListenerC26049OoooOO0;
import o0O0o0oO.ViewOnClickListenerC26050OoooOOO;
import o0O0oooO.o0Oo0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/pagelayereditor/LayerRenameDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LayerRenameDialogFragment extends Hilt_LayerRenameDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public EditText f74741Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f74742Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f74743Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f74744Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public String f74745Oooo0O0 = "";

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public C25871OooO00o f74746Oooo0OO;

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
            LayerRenameDialogFragment layerRenameDialogFragment = LayerRenameDialogFragment.this;
            View view = layerRenameDialogFragment.f74743Oooo00O;
            if (view == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view.setEnabled(charSequence.length() > 0);
            View view2 = layerRenameDialogFragment.f74744Oooo00o;
            if (view2 != null) {
                view2.setVisibility(charSequence.length() > 0 ? 0 : 8);
            } else {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_page_layer_rename_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f74741Oooo0 = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f74741Oooo0;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f74741Oooo0;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.addTextChangedListener(new OooO00o());
        EditText editText4 = this.f74741Oooo0;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText4.addTextChangedListener(new OooO0O0());
        EditText editText5 = this.f74741Oooo0;
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
        this.f74744Oooo00o = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById.setOnClickListener(new o0Oo0oo(this, 4));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f74742Oooo000 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC26049OoooOO0(this, 3));
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        this.f74743Oooo00O = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC26050OoooOOO(this, 2));
        EditText editText6 = this.f74741Oooo0;
        if (editText6 != null) {
            editText6.setHint(this.f74745Oooo0O0);
        } else {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
    }
}
