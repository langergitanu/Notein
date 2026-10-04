package com.orion.notein.p607ui.notelist;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0O0o0oO.ViewOnClickListenerC26049OoooOO0;
import o0O0oooO.o0Oo0oo;
import o0OoOOOo.ViewOnClickListenerC29104OooOOO;
import o0o00oOo.o000OO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/SimpleEditTextDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SimpleEditTextDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24568OooO0oO f77312OooOoOO = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(o000OO.class), new OooO00o());

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            SimpleEditTextDialogFragment simpleEditTextDialogFragment = SimpleEditTextDialogFragment.this;
            Bundle arguments = simpleEditTextDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + simpleEditTextDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_simple_edittext_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.simple_dialog_title);
        C24568OooO0oO c24568OooO0oO = this.f77312OooOoOO;
        if (textView != null) {
            textView.setText(((o000OO) c24568OooO0oO.getValue()).f107081OooO00o);
        }
        EditText editText = (EditText) view.findViewById(R.id.simple_input_name);
        String str = ((o000OO) c24568OooO0oO.getValue()).f107083OooO0OO;
        if (str == null || str.length() == 0) {
            if (editText != null) {
                editText.setHint(((o000OO) c24568OooO0oO.getValue()).f107082OooO0O0);
            }
        } else if (editText != null) {
            editText.setText(Editable.Factory.getInstance().newEditable(((o000OO) c24568OooO0oO.getValue()).f107083OooO0OO));
        }
        View viewFindViewById = view.findViewById(R.id.simple_btn_clear);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new o0Oo0oo(editText, 6));
        }
        View viewFindViewById2 = view.findViewById(R.id.simple_btn_cancel);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC26049OoooOO0(this, 5));
        }
        View viewFindViewById3 = view.findViewById(R.id.simple_btn_confirm);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC29104OooOOO(1, editText, this));
        }
    }
}
