package com.orion.notein.p607ui.datasync;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24564OooO00o;
import o000o0O0.C24587OooOoo;
import o0Oo00o.C28026OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/datasync/CloudSyncDetailsDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "Lcom/orion/notein/ui/datasync/CloudSyncDetailsFragment$OooO00o;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CloudSyncDetailsDialogFragment extends Hilt_CloudSyncDetailsDialogFragment implements CloudSyncDetailsFragment.OooO00o {
    @Override // com.orion.notein.ui.datasync.CloudSyncDetailsFragment.OooO00o
    public final void OooOOo0() {
        C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(this), new C24564OooO00o(R.id.f57923x79eb4329), new C24587OooOoo(false, false, R.id.cloudSyncDetailsDialogFragment, true, false, -1, -1, -1, -1));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.cloud_sync_details_fragment_container);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_cloud_sync_details_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        if (getChildFragmentManager().OooOooO(R.id.cloud_sync_details_fragment_container) == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
            OooO00o oooO00o = new OooO00o(childFragmentManager);
            oooO00o.OooO0o0(new CloudSyncDetailsFragment(), R.id.cloud_sync_details_fragment_container);
            oooO00o.OooO0oo();
        }
    }
}
