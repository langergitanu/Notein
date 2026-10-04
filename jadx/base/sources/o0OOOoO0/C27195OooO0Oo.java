package o0OOOoO0;

import OooOo.C20485OooOoO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOoO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, m80612d2 = {"Lo0OOOoO0/OooO0Oo;", "", "", "OooO00o", "Ljava/lang/String;", "OooO0OO", "()Ljava/lang/String;", "status", "", "OooO0O0", "I", "getProgress", "()I", NotificationCompat.CATEGORY_PROGRESS, "message", "Lo0OOOoO0/OooO0o;", "OooO0Oo", "Lo0OOOoO0/OooO0o;", "()Lo0OOOoO0/OooO0o;", "result", "", "OooO0o0", "J", "getElapsed", "()J", "elapsed", "OooO0o", "getResourceSize", "resourceSize", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27195OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final String status;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationCompat.CATEGORY_PROGRESS)
    private final int progress;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private final String message;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("result")
    private final C27196OooO0o result;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resource_size")
    private final long resourceSize;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elapsed")
    private final long elapsed;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final C27196OooO0o getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27195OooO0Oo)) {
            return false;
        }
        C27195OooO0Oo c27195OooO0Oo = (C27195OooO0Oo) obj;
        return OooOOO0.OooO0O0(this.status, c27195OooO0Oo.status) && this.progress == c27195OooO0Oo.progress && OooOOO0.OooO0O0(this.message, c27195OooO0Oo.message) && OooOOO0.OooO0O0(this.result, c27195OooO0Oo.result) && this.elapsed == c27195OooO0Oo.elapsed && this.resourceSize == c27195OooO0Oo.resourceSize;
    }

    public final int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.progress, this.status.hashCode() * 31, 31);
        String str = this.message;
        int iHashCode = (iOooO00o + (str == null ? 0 : str.hashCode())) * 31;
        C27196OooO0o c27196OooO0o = this.result;
        return Long.hashCode(this.resourceSize) + C20703o000000o.OooO0O0((iHashCode + (c27196OooO0o != null ? c27196OooO0o.hashCode() : 0)) * 31, 31, this.elapsed);
    }

    public final String toString() {
        String str = this.status;
        int i = this.progress;
        String str2 = this.message;
        C27196OooO0o c27196OooO0o = this.result;
        long j = this.elapsed;
        long j2 = this.resourceSize;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "TaskData(status=", str, ", progress=", ", message=");
        sbOooO0OO.append(str2);
        sbOooO0OO.append(", result=");
        sbOooO0OO.append(c27196OooO0o);
        sbOooO0OO.append(", elapsed=");
        sbOooO0OO.append(j);
        return com.facebook.soloader.OooO0OO.OooO00o(j2, ", resourceSize=", ")", sbOooO0OO);
    }
}
