package com.alibaba.sdk.android.oss.model;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public class HeadObjectResult extends OSSResult {
    private ObjectMetadata metadata = new ObjectMetadata();

    public ObjectMetadata getMetadata() {
        return this.metadata;
    }

    public void setMetadata(ObjectMetadata objectMetadata) {
        this.metadata = objectMetadata;
    }

    @Override // com.alibaba.sdk.android.oss.model.OSSResult
    public String toString() {
        return C22237OooO0o0.OooO00o("HeadObjectResult<", super.toString(), ">:\n metadata:", this.metadata.toString());
    }
}
