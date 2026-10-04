package com.orion.notein.p607ui.datasync;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.ViewOnClickListenerC26292Oooo0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/datasync/CloudSyncLoginDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CloudSyncLoginDialogFragment extends BaseDialogFragment {
    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.container);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_cloud_sync_login_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_close);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC26292Oooo0oo(this, 1));
        }
        if (getChildFragmentManager().OooOooO(R.id.cloud_sync_host) == null) {
            CloudSyncFragment cloudSyncFragment = new CloudSyncFragment();
            FragmentManager childFragmentManager = getChildFragmentManager();
            OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
            OooO00o oooO00o = new OooO00o(childFragmentManager);
            oooO00o.OooO0o0(cloudSyncFragment, R.id.cloud_sync_host);
            oooO00o.OooO0oo();
        }
    }
}
