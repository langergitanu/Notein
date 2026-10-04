package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

/* JADX INFO: loaded from: classes6.dex */
public class AutoLifecycleFragment extends Fragment {
    private static final String TAG = "HmsAutoLifecycleFrag";
    private final SparseArray<ClientInfo> mAutoClientInfoMap = new SparseArray<>();
    private boolean mStarted;

    public static class ClientInfo {
        public final HuaweiApiClient apiClient;
        protected final int clientId;

        public ClientInfo(int i, HuaweiApiClient huaweiApiClient) {
            this.apiClient = huaweiApiClient;
            this.clientId = i;
        }

        public void stopAutoManage() {
            this.apiClient.disconnect();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.app.FragmentManager, void] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.app.FragmentManager, void] */
    public static AutoLifecycleFragment getInstance(Activity activity) {
        Preconditions.checkMainThread("Must be called on the main thread");
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.unserialize(TAG).findFragmentByTag(TAG);
            ?? Unserialize = activity.unserialize(TAG);
            if (autoLifecycleFragment != null) {
                return autoLifecycleFragment;
            }
            AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
            Unserialize.beginTransaction().add(autoLifecycleFragment2, TAG).commitAllowingStateLoss();
            Unserialize.executePendingTransactions();
            return autoLifecycleFragment2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag HmsAutoLifecycleFrag is not a AutoLifecycleFragment", e);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.mStarted = true;
        for (int i = 0; i < this.mAutoClientInfoMap.size(); i++) {
            this.mAutoClientInfoMap.valueAt(i).apiClient.connect((Activity) null);
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.mStarted = false;
        for (int i = 0; i < this.mAutoClientInfoMap.size(); i++) {
            this.mAutoClientInfoMap.valueAt(i).apiClient.disconnect();
        }
    }

    public void startAutoMange(int i, HuaweiApiClient huaweiApiClient) {
        Preconditions.checkNotNull(huaweiApiClient, "HuaweiApiClient instance cannot be null");
        Preconditions.checkState(this.mAutoClientInfoMap.indexOfKey(i) < 0, "Already managing a HuaweiApiClient with this clientId: " + i);
        this.mAutoClientInfoMap.put(i, new ClientInfo(i, huaweiApiClient));
        if (this.mStarted) {
            huaweiApiClient.connect((Activity) null);
        }
    }

    public void stopAutoManage(int i) {
        ClientInfo clientInfo = this.mAutoClientInfoMap.get(i);
        this.mAutoClientInfoMap.remove(i);
        if (clientInfo != null) {
            clientInfo.stopAutoManage();
        }
    }
}
