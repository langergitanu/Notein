package com.orion.notein.p607ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26054OoooOoo;
import o0O0o0oO.ViewOnClickListenerC26055Ooooo00;
import o0O0o0oO.ViewOnClickListenerC26056Ooooo0o;
import o0O0o0oO.ViewOnClickListenerC26057OooooO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/TipsDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TipsDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f70452OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final String f70453OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final String f70454OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final String f70455OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Integer f70456OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f70457Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public ImageView f70458Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final View.OnClickListener f70459Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final View.OnClickListener f70460Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final View.OnClickListener f70461Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f70462Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f70463Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean f70464Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<? super Boolean, C32460OooOooO> f70465Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f70466Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f70467Oooo0oo;

    public TipsDialogFragment(String title, String content, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, String str, int i, Integer num, int i2) {
        num = (i2 & 128) != 0 ? null : num;
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(content, "content");
        this.f70454OooOoo0 = title;
        this.f70453OooOoo = content;
        this.f70455OooOooO = str;
        this.f70456OooOooo = num;
        this.f70459Oooo000 = onClickListener;
        this.f70460Oooo00O = onClickListener2;
        this.f70461Oooo00o = onClickListener3;
        this.f70452OooOoOO = i;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_tips_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Dialog dialog;
        super.onResume();
        if (this.f70452OooOoOO != -1 || (dialog = getDialog()) == null) {
            return;
        }
        dialog.dismiss();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        TextView textView = (TextView) view.findViewById(R.id.dialog_title);
        if (textView == null) {
            OooOOO0.OooOOOO("titleView");
            throw null;
        }
        textView.setText(this.f70454OooOoo0);
        TextView textView2 = (TextView) view.findViewById(R.id.btn_cancel);
        this.f70466Oooo0oO = textView2;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        View.OnClickListener onClickListener = this.f70459Oooo000;
        textView2.setVisibility(onClickListener != null ? 0 : 8);
        TextView textView3 = this.f70466Oooo0oO;
        if (textView3 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        textView3.setOnClickListener(new ViewOnClickListenerC26054OoooOoo(this, 6));
        TextView textView4 = (TextView) view.findViewById(R.id.btn_confirm);
        this.f70467Oooo0oo = textView4;
        if (textView4 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        View.OnClickListener onClickListener2 = this.f70460Oooo00O;
        textView4.setVisibility(onClickListener2 != null ? 0 : 8);
        this.f70458Oooo0 = (ImageView) view.findViewById(R.id.checkbox_icon);
        this.f70462Oooo0O0 = (TextView) view.findViewById(R.id.checkbox_text);
        ImageView imageView = this.f70458Oooo0;
        if (imageView == null) {
            OooOOO0.OooOOOO("checkboxIcon");
            throw null;
        }
        boolean z = this.f70464Oooo0o;
        imageView.setVisibility(z ? 0 : 8);
        TextView textView5 = this.f70462Oooo0O0;
        if (textView5 == null) {
            OooOOO0.OooOOOO("checkboxText");
            throw null;
        }
        textView5.setVisibility(z ? 0 : 8);
        ImageView imageView2 = this.f70458Oooo0;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("checkboxIcon");
            throw null;
        }
        imageView2.setImageResource(R.drawable.ic_tri_state_checkbox_unchecked);
        ViewOnClickListenerC26055Ooooo00 viewOnClickListenerC26055Ooooo00 = new ViewOnClickListenerC26055Ooooo00(this, 5);
        ImageView imageView3 = this.f70458Oooo0;
        if (imageView3 == null) {
            OooOOO0.OooOOOO("checkboxIcon");
            throw null;
        }
        imageView3.setOnClickListener(viewOnClickListenerC26055Ooooo00);
        TextView textView6 = this.f70462Oooo0O0;
        if (textView6 == null) {
            OooOOO0.OooOOOO("checkboxText");
            throw null;
        }
        textView6.setOnClickListener(viewOnClickListenerC26055Ooooo00);
        TextView textView7 = this.f70467Oooo0oo;
        if (textView7 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        textView7.setOnClickListener(new ViewOnClickListenerC26056Ooooo0o(this, 4));
        TextView textView8 = (TextView) view.findViewById(R.id.btn_i_known);
        this.f70457Oooo = textView8;
        if (textView8 == null) {
            OooOOO0.OooOOOO("btnIKnown");
            throw null;
        }
        textView8.setVisibility((onClickListener == null && onClickListener2 == null) ? 0 : 8);
        TextView textView9 = this.f70457Oooo;
        if (textView9 == null) {
            OooOOO0.OooOOOO("btnIKnown");
            throw null;
        }
        textView9.setOnClickListener(new ViewOnClickListenerC26057OooooO0(this, 7));
        TextView textView10 = (TextView) view.findViewById(R.id.dialog_info);
        if (textView10 == null) {
            OooOOO0.OooOOOO("contentView");
            throw null;
        }
        textView10.setText(this.f70453OooOoo);
        int i = this.f70452OooOoOO;
        if (i == 0) {
            TextView textView11 = this.f70467Oooo0oo;
            if (textView11 == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            textView11.setText(getString(R.string.confirm));
        } else if (i == 1) {
            TextView textView12 = this.f70467Oooo0oo;
            if (textView12 == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            textView12.setText(getString(R.string.delete));
        }
        String str = this.f70455OooOooO;
        if (str != null && str.length() != 0) {
            TextView textView13 = this.f70467Oooo0oo;
            if (textView13 == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            textView13.setText(str);
        }
        Integer num = this.f70456OooOooo;
        if (num != null) {
            TextView textView14 = this.f70467Oooo0oo;
            if (textView14 != null) {
                textView14.setTextColor(ContextCompat.getColor(requireContext(), num.intValue()));
            } else {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
        }
    }

    public TipsDialogFragment() {
        this.f70454OooOoo0 = "";
        this.f70453OooOoo = "";
        this.f70455OooOooO = null;
        this.f70452OooOoOO = -1;
        this.f70456OooOooo = null;
    }

    public TipsDialogFragment(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this(str, str2, onClickListener, onClickListener2, null, null, 0, null, 384);
    }

    public TipsDialogFragment(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, int i) {
        this(str, str2, onClickListener, onClickListener2, onClickListener3, null, i, null, 384);
    }

    public TipsDialogFragment(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, InterfaceC32507OooOO0o interfaceC32507OooOO0o, boolean z) {
        this.f70454OooOoo0 = str;
        this.f70453OooOoo = str2;
        this.f70455OooOooO = null;
        this.f70456OooOooo = null;
        this.f70459Oooo000 = onClickListener;
        this.f70460Oooo00O = onClickListener2;
        this.f70461Oooo00o = onClickListener3;
        this.f70452OooOoOO = 0;
        this.f70465Oooo0o0 = interfaceC32507OooOO0o;
        this.f70464Oooo0o = z;
    }
}
