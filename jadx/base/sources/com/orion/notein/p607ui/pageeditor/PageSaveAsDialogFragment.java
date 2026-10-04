package com.orion.notein.p607ui.pageeditor;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0Oo0oOo.o000000O;
import o0Oo0oOo.o00000O0;
import o0OooOoo.ViewOnClickListenerC29578OooO00o;
import o0o0OO0O.C30432OooOO0O;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/pageeditor/PageSaveAsDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PageSaveAsDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24568OooO0oO f78511OooOoOO = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30432OooOO0O.class), new OooO0O0());

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f78512OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f78513OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f78514OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public EditText f78515OooOooo;

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
            PageSaveAsDialogFragment pageSaveAsDialogFragment = PageSaveAsDialogFragment.this;
            View view = pageSaveAsDialogFragment.f78512OooOoo;
            if (view == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            boolean z = true;
            view.setEnabled(!(charSequence == null || charSequence.length() == 0));
            View view2 = pageSaveAsDialogFragment.f78514OooOooO;
            if (view2 == null) {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
            if (charSequence != null && charSequence.length() != 0) {
                z = false;
            }
            view2.setVisibility(z ? 8 : 0);
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            PageSaveAsDialogFragment pageSaveAsDialogFragment = PageSaveAsDialogFragment.this;
            Bundle arguments = pageSaveAsDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + pageSaveAsDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_page_save_as_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f78515OooOooo = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f78515OooOooo;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setText(((C30432OooOO0O) this.f78511OooOoOO.getValue()).f108692OooO00o);
        EditText editText3 = this.f78515OooOooo;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.setMaxLines(Integer.MAX_VALUE);
        EditText editText4 = this.f78515OooOooo;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText4.addTextChangedListener(new OooO00o());
        EditText editText5 = this.f78515OooOooo;
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
        this.f78514OooOooO = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById.setOnClickListener(new o000000O(this, 3));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f78513OooOoo0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new o00000O0(this, 3));
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        this.f78512OooOoo = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC29578OooO00o(this, 3));
    }
}
