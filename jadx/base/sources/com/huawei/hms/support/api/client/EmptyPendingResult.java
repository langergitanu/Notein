package com.huawei.hms.support.api.client;

import android.os.Looper;
import com.huawei.hms.support.api.client.Result;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class EmptyPendingResult<R extends Result> extends PendingResult<R> {

    /* JADX INFO: renamed from: a */
    private R f56907a;

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await() {
        return this.f56907a;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void cancel() {
    }

    public R getResult() {
        return this.f56907a;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public boolean isCanceled() {
        return false;
    }

    public void setResult(R r) {
        this.f56907a = r;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j, TimeUnit timeUnit) {
        return this.f56907a;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback, long j, TimeUnit timeUnit) {
    }
}
