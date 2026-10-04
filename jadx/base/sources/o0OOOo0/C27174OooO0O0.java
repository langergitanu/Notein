package o0OOOo0;

import OoooooO.C21445Oooo;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.domain.models.login.LoginInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, m80612d2 = {"Lo0OOOo0/OooO0O0;", "T", "", "OooO0O0", "Ljava/lang/Object;", "()Ljava/lang/Object;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "OooO0OO", "Ljava/lang/String;", "()Ljava/lang/String;", "errorCode", "OooO0Oo", "errorMsg", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27174OooO0O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f94862OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final T data;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("error_code")
    private final String errorCode;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("error_msg")
    private final String errorMsg;

    public C27174OooO0O0() {
        this(false, null, null, null, 15);
    }

    public static C27174OooO0O0 OooO00o(C27174OooO0O0 c27174OooO0O0, LoginInfo loginInfo, int i) {
        boolean z = (i & 1) != 0 ? c27174OooO0O0.f94862OooO00o : false;
        if ((i & 2) != 0) {
            loginInfo = c27174OooO0O0.data;
        }
        String str = c27174OooO0O0.errorCode;
        String str2 = c27174OooO0O0.errorMsg;
        c27174OooO0O0.getClass();
        return new C27174OooO0O0(str, str2, loginInfo, z);
    }

    public final T OooO0O0() {
        return this.data;
    }

    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: OooO0Oo, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27174OooO0O0)) {
            return false;
        }
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) obj;
        return this.f94862OooO00o == c27174OooO0O0.f94862OooO00o && OooOOO0.OooO0O0(this.data, c27174OooO0O0.data) && OooOOO0.OooO0O0(this.errorCode, c27174OooO0O0.errorCode) && OooOOO0.OooO0O0(this.errorMsg, c27174OooO0O0.errorMsg);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f94862OooO00o) * 31;
        T t = this.data;
        int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
        String str = this.errorCode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMsg;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        T t = this.data;
        String str = this.errorCode;
        String str2 = this.errorMsg;
        StringBuilder sb = new StringBuilder("NoteInResponse(success=");
        sb.append(this.f94862OooO00o);
        sb.append(", data=");
        sb.append(t);
        sb.append(", errorCode=");
        return C21445Oooo.OooO0O0(sb, str, ", errorMsg=", str2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C27174OooO0O0(String str, String str2, Object obj, boolean z) {
        this.f94862OooO00o = z;
        this.data = obj;
        this.errorCode = str;
        this.errorMsg = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C27174OooO0O0(boolean z, Object obj, String str, String str2, int i) {
        z = (i & 1) != 0 ? true : z;
        this((i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 2) != 0 ? null : obj, z);
    }
}
