package com.orion.notein.p607ui.noteeditor.propertypanel.outline;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0Oo0oO0.ViewOnClickListenerC28296OooO0oo;
import o0OoO000.ViewOnClickListenerC28534OooOOoo;
import o0Ooooo0.C29714OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/outline/OutlineDeleteAlertDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OutlineDeleteAlertDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24568OooO0oO f75886OooOoOO = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C29714OooOOo.class), new OooO00o());

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f75887OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f75888OooOoo0;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            OutlineDeleteAlertDialogFragment outlineDeleteAlertDialogFragment = OutlineDeleteAlertDialogFragment.this;
            Bundle arguments = outlineDeleteAlertDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + outlineDeleteAlertDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_outline_delete_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_cancel);
        this.f75888OooOoo0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28296OooO0oo(this, 2));
        View viewFindViewById2 = view.findViewById(R.id.btn_confirm);
        this.f75887OooOoo = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28534OooOOoo(this, 2));
        TextView textView = (TextView) view.findViewById(R.id.alert_info);
        if (textView != null) {
            textView.setText(((C29714OooOOo) this.f75886OooOoOO.getValue()).f105359OooO0O0 ? getString(R.string.alert_delete_outline_with_children) : getString(R.string.alert_delete_outline));
        } else {
            OooOOO0.OooOOOO("alertInfo");
            throw null;
        }
    }
}
