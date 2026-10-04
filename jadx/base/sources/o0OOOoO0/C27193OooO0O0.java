package o0OOOoO0;

import OooOoo.C20593OooO0Oo;
import Oooo0o0.C21009OooOooO;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOoO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\b\u0010\u0015¨\u0006\u0017"}, m80612d2 = {"Lo0OOOoO0/OooO0O0;", "", "", "OooO00o", "I", "()I", "code", "", "OooO0O0", "Ljava/lang/String;", "OooO0OO", "()Ljava/lang/String;", "message", "getHint", "hint", "OooO0Oo", "getExtra", "extra", "Lo0OOOoO0/OooO0O0$OooO00o;", "OooO0o0", "Lo0OOOoO0/OooO0O0$OooO00o;", "()Lo0OOOoO0/OooO0O0$OooO00o;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27193OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("code")
    private final int code;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private final String message;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hint")
    private final String hint;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("extra")
    private final String extra;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final OooO00o data;

    /* JADX INFO: renamed from: o0OOOoO0.OooO0O0$OooO00o */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, m80612d2 = {"Lo0OOOoO0/OooO0O0$OooO00o;", "", "", "OooO00o", "Ljava/lang/String;", "()Ljava/lang/String;", "taskId", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
        @SerializedName("task_id")
        private final String taskId;

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO00o) && OooOOO0.OooO0O0(this.taskId, ((OooO00o) obj).taskId);
        }

        public final int hashCode() {
            return this.taskId.hashCode();
        }

        public final String toString() {
            return C20593OooO0Oo.OooO0O0("Data(taskId=", this.taskId, ")");
        }
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final OooO00o getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27193OooO0O0)) {
            return false;
        }
        C27193OooO0O0 c27193OooO0O0 = (C27193OooO0O0) obj;
        return this.code == c27193OooO0O0.code && OooOOO0.OooO0O0(this.message, c27193OooO0O0.message) && OooOOO0.OooO0O0(this.hint, c27193OooO0O0.hint) && OooOOO0.OooO0O0(this.extra, c27193OooO0O0.extra) && OooOOO0.OooO0O0(this.data, c27193OooO0O0.data);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hint;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extra;
        return this.data.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int i = this.code;
        String str = this.message;
        String str2 = this.hint;
        String str3 = this.extra;
        OooO00o oooO00o = this.data;
        StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(i, "ConvertResponse(code=", ", message=", str, ", hint=");
        OooOO0.OooO0OO.OooO0o0(sbOooO0OO, str2, ", extra=", str3, ", data=");
        sbOooO0OO.append(oooO00o);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
