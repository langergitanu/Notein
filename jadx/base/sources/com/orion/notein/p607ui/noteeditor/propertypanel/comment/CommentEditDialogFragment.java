package com.orion.notein.p607ui.noteeditor.propertypanel.comment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentEditDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o00o00.C25206OooO0Oo;
import o0Oo0o00.ViewOnClickListenerC28177OooOooo;
import o0Oo0o00.ViewOnClickListenerC28180Oooo000;
import o0OoooOo.C29638OooO0Oo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/comment/CommentEditDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CommentEditDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24568OooO0oO f75709OooOoOO = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C29638OooO0Oo.class), new OooO0O0());

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f75710OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f75711OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f75712OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public EditText f75713OooOooo;

    public static final class OooO00o implements TextWatcher {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CommentVO f75714OooOo;

        public OooO00o(CommentVO commentVO) {
            this.f75714OooOo = commentVO;
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
            CommentEditDialogFragment commentEditDialogFragment = CommentEditDialogFragment.this;
            View view = commentEditDialogFragment.f75710OooOoo;
            if (view == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view.setEnabled(charSequence.length() > 0);
            View view2 = commentEditDialogFragment.f75712OooOooO;
            if (view2 == null) {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
            view2.setVisibility(charSequence.length() > 0 ? 0 : 8);
            if (charSequence.length() == 0) {
                EditText editText = commentEditDialogFragment.f75713OooOooo;
                if (editText != null) {
                    editText.setHint(this.f75714OooOo.getTitle());
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
            CommentEditDialogFragment commentEditDialogFragment = CommentEditDialogFragment.this;
            Bundle arguments = commentEditDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + commentEditDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_comment_edit_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C29638OooO0Oo c29638OooO0Oo = (C29638OooO0Oo) this.f75709OooOoOO.getValue();
        TextView textView = (TextView) view.findViewById(R.id.page_number);
        if (textView == null) {
            OooOOO0.OooOOOO("pageNumber");
            throw null;
        }
        final CommentVO commentVO = c29638OooO0Oo.f105096OooO00o;
        textView.setText(String.valueOf(commentVO.getPageIndex() + 1));
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f75713OooOooo = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f75713OooOooo;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f75713OooOooo;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.setText(commentVO.getTitle());
        EditText editText4 = this.f75713OooOooo;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText4.addTextChangedListener(new OooO00o(commentVO));
        EditText editText5 = this.f75713OooOooo;
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
        this.f75712OooOooO = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28177OooOooo(this, 1));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f75711OooOoo0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28180Oooo000(this, 1));
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        this.f75710OooOoo = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: o0OoooOo.OooO0OO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CommentEditDialogFragment commentEditDialogFragment = this.f105095OooOo0o;
                    EditText editText6 = commentEditDialogFragment.f75713OooOooo;
                    if (editText6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                        throw null;
                    }
                    Editable text = editText6.getText();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(text);
                    if (text.length() == 0) {
                        Context contextRequireContext = commentEditDialogFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        String string = commentEditDialogFragment.getString(R.string.toast_enter_comment);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                        return;
                    }
                    commentEditDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("comment_id", commentVO.getId()), new C32443OooOOO("comment_title", text.toString())), "update_comment");
                    Dialog dialog2 = commentEditDialogFragment.getDialog();
                    if (dialog2 != null) {
                        dialog2.dismiss();
                    }
                }
            });
        } else {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
    }
}
