package com.huawei.hms.support.api.client;

import android.app.Activity;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {

    /* JADX INFO: renamed from: a */
    private final Activity f56908a;

    /* JADX INFO: renamed from: b */
    private final int f56909b;

    public ResolvingResultCallbacks(Activity activity, int i) {
        this.f56908a = (Activity) Preconditions.checkNotNull(activity, "Activity must not be null");
        this.f56909b = i;
    }

    @Override // com.huawei.hms.support.api.client.ResultCallbacks
    public final void onFailure(Status status) {
        try {
            if (status.hasResolution()) {
                status.startResolutionForResult(this.f56908a, this.f56909b);
            } else {
                onUnresolvableFailure(status);
            }
        } catch (Exception e) {
            HMSLog.m80172e("ResolvingResultCallbacks", "Failed to start resolution: " + e);
            onUnresolvableFailure(Status.RESULT_INTERNAL_ERROR);
        }
    }

    @Override // com.huawei.hms.support.api.client.ResultCallbacks
    public abstract void onSuccess(R r);

    public abstract void onUnresolvableFailure(Status status);
}
