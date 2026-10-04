package com.orion.notein.p607ui.notelist.trashbin;

import android.os.Bundle;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oO.OooO0O0;
import o0O0oO.ViewOnClickListenerC26091OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/trashbin/TrashBinClearAlertDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TrashBinClearAlertDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f78065OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f78066OooOoo0;

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_trash_bin_clear_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_cancel);
        this.f78065OooOoOO = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC26091OooO00o(this, 4));
        View viewFindViewById2 = view.findViewById(R.id.btn_confirm);
        this.f78066OooOoo0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new OooO0O0(this, 4));
        } else {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
    }
}
