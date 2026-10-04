package com.orion.notein.data.service.p604ai.response;

import androidx.core.database.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/notein/data/service/ai/response/CreateIndexResponse;", "", "error", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CreateIndexResponse {
    private final String error;
    private final String message;

    public CreateIndexResponse(String str, String str2) {
        this.error = str;
        this.message = str2;
    }

    public static /* synthetic */ CreateIndexResponse copy$default(CreateIndexResponse createIndexResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createIndexResponse.error;
        }
        if ((i & 2) != 0) {
            str2 = createIndexResponse.message;
        }
        return createIndexResponse.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final CreateIndexResponse copy(String error, String message) {
        return new CreateIndexResponse(error, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateIndexResponse)) {
            return false;
        }
        CreateIndexResponse createIndexResponse = (CreateIndexResponse) other;
        return OooOOO0.OooO0O0(this.error, createIndexResponse.error) && OooOOO0.OooO0O0(this.message, createIndexResponse.message);
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.error;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return OooO00o.OooO00o("CreateIndexResponse(error=", this.error, ", message=", this.message, ")");
    }
}
