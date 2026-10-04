package com.orion.notein.p607ui.notelist.trashbin;

import android.os.Bundle;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0OoOOoO.ViewOnClickListenerC29188OooO0O0;
import o0OoOOoO.ViewOnClickListenerC29189OooO0OO;
import o0o0O0oO.C30322OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/trashbin/TrashBinDeleteAlertDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TrashBinDeleteAlertDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24568OooO0oO f78113OooOoOO = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30322OooOO0o.class), new OooO00o());

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f78114OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f78115OooOoo0;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            TrashBinDeleteAlertDialogFragment trashBinDeleteAlertDialogFragment = TrashBinDeleteAlertDialogFragment.this;
            Bundle arguments = trashBinDeleteAlertDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + trashBinDeleteAlertDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_trash_bin_delete_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_cancel);
        this.f78115OooOoo0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC29188OooO0O0(this, 2));
        View viewFindViewById2 = view.findViewById(R.id.btn_confirm);
        this.f78114OooOoo = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC29189OooO0OO(this, 2));
        } else {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
    }
}
