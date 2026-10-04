package com.orion.notein.p607ui.noteeditor.propertypanel.outline;

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
import o0Oo0oO0.ViewOnClickListenerC28288OooO;
import o0OoO000.OooOo00;
import o0Ooo0oo.ViewOnClickListenerC29444OooO0o0;
import o0Ooooo0.C29716OooOOoo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/outline/OutlineEditDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OutlineEditDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24568OooO0oO f75890OooOoOO = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C29716OooOOoo.class), new OooO0O0());

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f75891OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f75892OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f75893OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public EditText f75894OooOooo;

    public static final class OooO00o implements TextWatcher {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OutlineVO f75895OooOo;

        public OooO00o(OutlineVO outlineVO) {
            this.f75895OooOo = outlineVO;
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
            OutlineEditDialogFragment outlineEditDialogFragment = OutlineEditDialogFragment.this;
            View view = outlineEditDialogFragment.f75891OooOoo;
            if (view == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view.setEnabled(charSequence.length() > 0);
            View view2 = outlineEditDialogFragment.f75893OooOooO;
            if (view2 == null) {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
            view2.setVisibility(charSequence.length() > 0 ? 0 : 8);
            if (charSequence.length() == 0) {
                EditText editText = outlineEditDialogFragment.f75894OooOooo;
                if (editText != null) {
                    editText.setHint(this.f75895OooOo.getTitle());
                } else {
                    OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            }
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            OutlineEditDialogFragment outlineEditDialogFragment = OutlineEditDialogFragment.this;
            Bundle arguments = outlineEditDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + outlineEditDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_outline_edit_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C29716OooOOoo c29716OooOOoo = (C29716OooOOoo) this.f75890OooOoOO.getValue();
        TextView textView = (TextView) view.findViewById(R.id.page_number);
        if (textView == null) {
            OooOOO0.OooOOOO("pageNumber");
            throw null;
        }
        OutlineVO outlineVO = c29716OooOOoo.f105362OooO00o;
        textView.setText(String.valueOf(outlineVO.getPageIndex() + 1));
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f75894OooOooo = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f75894OooOooo;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f75894OooOooo;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.setText(outlineVO.getTitle());
        EditText editText4 = this.f75894OooOooo;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText4.addTextChangedListener(new OooO00o(outlineVO));
        EditText editText5 = this.f75894OooOooo;
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
        this.f75893OooOooO = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById.setOnClickListener(new OooOo00(this, 1));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f75892OooOoo0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28288OooO(this, 3));
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        this.f75891OooOoo = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC29444OooO0o0(this, outlineVO, 1));
        } else {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
    }
}
