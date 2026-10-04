package com.alibaba.sdk.android.oss.model;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public class GetBucketInfoResult extends OSSResult {
    private OSSBucketSummary bucket;

    public OSSBucketSummary getBucket() {
        return this.bucket;
    }

    public void setBucket(OSSBucketSummary oSSBucketSummary) {
        this.bucket = oSSBucketSummary;
    }

    @Override // com.alibaba.sdk.android.oss.model.OSSResult
    public String toString() {
        return C22237OooO0o0.OooO00o("GetBucketInfoResult<", super.toString(), ">:\n bucket:", this.bucket.toString());
    }
}
