package o0OOOoO0;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOoO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\r"}, m80612d2 = {"Lo0OOOoO0/OooO0o0;", "", "", "OooO00o", "I", "getCode", "()I", "code", "Lo0OOOoO0/OooO0Oo;", "OooO0O0", "Lo0OOOoO0/OooO0Oo;", "()Lo0OOOoO0/OooO0Oo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27197OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("code")
    private final int code;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final C27195OooO0Oo data;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final C27195OooO0Oo getData() {
        return this.data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27197OooO0o0)) {
            return false;
        }
        C27197OooO0o0 c27197OooO0o0 = (C27197OooO0o0) obj;
        return this.code == c27197OooO0o0.code && OooOOO0.OooO0O0(this.data, c27197OooO0o0.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    public final String toString() {
        return "TaskQueryResponse(code=" + this.code + ", data=" + this.data + ")";
    }
}
