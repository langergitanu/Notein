package com.orion.notein.p607ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26058OooooOO;
import o0O0o0oO.ViewOnClickListenerC26059OooooOo;
import o0Oo0o0o.ViewOnClickListenerC28251OooOooo;
import o0o00oo.C30103OooOO0O;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/TipsDialogFragment2;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TipsDialogFragment2 extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final String f70468OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C30103OooOO0O.OooO00o.ViewOnClickListenerC20041OooO00o f70469OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final String f70470OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C30103OooOO0O.OooO00o.OooO0O0 f70471OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C30103OooOO0O.OooO00o.OooO0OO f70472OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f70473Oooo000;

    public TipsDialogFragment2() {
        this.f70468OooOoOO = "";
        this.f70470OooOoo0 = "";
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_permission_tips_dialog_2;
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
        textView.setText(this.f70468OooOoOO);
        TextView textView2 = (TextView) view.findViewById(R.id.btn_cancel);
        this.f70473Oooo000 = textView2;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        textView2.setVisibility(this.f70469OooOoo == null ? 8 : 0);
        TextView textView3 = this.f70473Oooo000;
        if (textView3 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        textView3.setOnClickListener(new ViewOnClickListenerC26058OooooOO(this, 6));
        TextView textView4 = (TextView) view.findViewById(R.id.btn_go);
        if (textView4 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        textView4.setOnClickListener(new ViewOnClickListenerC26059OooooOo(this, 6));
        TextView textView5 = (TextView) view.findViewById(R.id.btn_dt);
        if (textView5 == null) {
            OooOOO0.OooOOOO("btnDtShow");
            throw null;
        }
        textView5.setOnClickListener(new ViewOnClickListenerC28251OooOooo(this, 7));
        TextView textView6 = (TextView) view.findViewById(R.id.dialog_info);
        if (textView6 != null) {
            textView6.setText(this.f70470OooOoo0);
        } else {
            OooOOO0.OooOOOO("contentView");
            throw null;
        }
    }

    public TipsDialogFragment2(String str, String str2, C30103OooOO0O.OooO00o.ViewOnClickListenerC20041OooO00o viewOnClickListenerC20041OooO00o, C30103OooOO0O.OooO00o.OooO0O0 oooO0O0, C30103OooOO0O.OooO00o.OooO0OO oooO0OO) {
        this.f70468OooOoOO = str;
        this.f70470OooOoo0 = str2;
        this.f70469OooOoo = viewOnClickListenerC20041OooO00o;
        this.f70471OooOooO = oooO0O0;
        this.f70472OooOooo = oooO0OO;
    }
}
