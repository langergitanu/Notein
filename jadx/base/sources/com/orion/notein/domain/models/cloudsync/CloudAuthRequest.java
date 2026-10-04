package com.orion.notein.domain.models.cloudsync;

import OooOo.C20485OooOoO;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudAuthRequest;", "", "payload", "<init>", "(Ljava/lang/Object;)V", "getPayload", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CloudAuthRequest {
    private final Object payload;

    /* JADX WARN: Illegal instructions before constructor call */
    public CloudAuthRequest() {
        C24018OooO0oo c24018OooO0oo = null;
        this(c24018OooO0oo, 1, c24018OooO0oo);
    }

    public static /* synthetic */ CloudAuthRequest copy$default(CloudAuthRequest cloudAuthRequest, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = cloudAuthRequest.payload;
        }
        return cloudAuthRequest.copy(obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getPayload() {
        return this.payload;
    }

    public final CloudAuthRequest copy(Object payload) {
        return new CloudAuthRequest(payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CloudAuthRequest) && OooOOO0.OooO0O0(this.payload, ((CloudAuthRequest) other).payload);
    }

    public final Object getPayload() {
        return this.payload;
    }

    public int hashCode() {
        Object obj = this.payload;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return C20485OooOoO.OooO0O0("CloudAuthRequest(payload=", this.payload, ")");
    }

    public CloudAuthRequest(Object obj) {
        this.payload = obj;
    }

    public /* synthetic */ CloudAuthRequest(Object obj, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : obj);
    }
}
