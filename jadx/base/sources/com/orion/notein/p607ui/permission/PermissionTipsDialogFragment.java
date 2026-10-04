package com.orion.notein.p607ui.permission;

import android.app.Dialog;
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
import o0OoOOoO.ViewOnClickListenerC29189OooO0OO;
import o0o00ooO.ViewOnClickListenerC30139OooO0O0;
import o0o0Oo0.C30601OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/permission/PermissionTipsDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PermissionTipsDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24568OooO0oO f78833OooOoOO = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30601OooO00o.class), new OooO00o());

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            PermissionTipsDialogFragment permissionTipsDialogFragment = PermissionTipsDialogFragment.this;
            Bundle arguments = permissionTipsDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + permissionTipsDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_permission_tips_dialog;
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
        C24568OooO0oO c24568OooO0oO = this.f78833OooOoOO;
        textView.setText(((C30601OooO00o) c24568OooO0oO.getValue()).f109486OooO00o);
        view.findViewById(R.id.btn_cancel).setOnClickListener(new ViewOnClickListenerC29189OooO0OO(this, 3));
        TextView textView2 = (TextView) view.findViewById(R.id.dialog_info);
        if (textView2 == null) {
            OooOOO0.OooOOOO("contentView");
            throw null;
        }
        textView2.setText(((C30601OooO00o) c24568OooO0oO.getValue()).f109487OooO0O0);
        view.findViewById(R.id.btn_go).setOnClickListener(new ViewOnClickListenerC30139OooO0O0(this, 1));
    }
}
