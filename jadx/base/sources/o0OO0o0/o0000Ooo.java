package o0OO0o0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0005R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0005R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m80612d2 = {"Lo0OO0o0/o0000Ooo;", "", "", "OooO00o", "Ljava/lang/Long;", "()Ljava/lang/Long;", "total", "OooO0O0", "used", "OooO0OO", "getRemaining", "remaining", "OooO0Oo", "getDeleted", "deleted", "", "OooO0o0", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "state", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("total")
    private final Long total = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("used")
    private final Long used = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("remaining")
    private final Long remaining = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deleted")
    private final Long deleted = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("state")
    private final String state = null;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final Long getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final Long getUsed() {
        return this.used;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000Ooo)) {
            return false;
        }
        o0000Ooo o0000ooo = (o0000Ooo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.total, o0000ooo.total) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.used, o0000ooo.used) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.remaining, o0000ooo.remaining) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.deleted, o0000ooo.deleted) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.state, o0000ooo.state);
    }

    public final int hashCode() {
        Long l = this.total;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.used;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.remaining;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.deleted;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.state;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Long l = this.total;
        Long l2 = this.used;
        Long l3 = this.remaining;
        Long l4 = this.deleted;
        String str = this.state;
        StringBuilder sb = new StringBuilder("Quota(total=");
        sb.append(l);
        sb.append(", used=");
        sb.append(l2);
        sb.append(", remaining=");
        sb.append(l3);
        sb.append(", deleted=");
        sb.append(l4);
        sb.append(", state=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, ")");
    }
}
