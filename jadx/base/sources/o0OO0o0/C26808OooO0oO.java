package o0OO0o0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO0o0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013¨\u0006\u0015"}, m80612d2 = {"Lo0OO0o0/OooO0oO;", "", "", "OooO00o", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "OooO0O0", "getDriveType", "driveType", "Lo0OO0o0/o00000Oo;", "OooO0OO", "Lo0OO0o0/o00000Oo;", "getOwner", "()Lo0OO0o0/o00000Oo;", "owner", "Lo0OO0o0/o0000Ooo;", "OooO0Oo", "Lo0OO0o0/o0000Ooo;", "()Lo0OO0o0/o0000Ooo;", "quota", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26808OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("id")
    private final String id;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("driveType")
    private final String driveType;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("owner")
    private final C26862o00000Oo owner;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("quota")
    private final o0000Ooo quota;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final o0000Ooo getQuota() {
        return this.quota;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26808OooO0oO)) {
            return false;
        }
        C26808OooO0oO c26808OooO0oO = (C26808OooO0oO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.id, c26808OooO0oO.id) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.driveType, c26808OooO0oO.driveType) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.owner, c26808OooO0oO.owner) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.quota, c26808OooO0oO.quota);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.driveType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C26862o00000Oo c26862o00000Oo = this.owner;
        int iHashCode3 = (iHashCode2 + (c26862o00000Oo == null ? 0 : c26862o00000Oo.hashCode())) * 31;
        o0000Ooo o0000ooo = this.quota;
        return iHashCode3 + (o0000ooo != null ? o0000ooo.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.driveType;
        C26862o00000Oo c26862o00000Oo = this.owner;
        o0000Ooo o0000ooo = this.quota;
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("DriveResponse(id=", str, ", driveType=", str2, ", owner=");
        sbOooO0O0.append(c26862o00000Oo);
        sbOooO0O0.append(", quota=");
        sbOooO0O0.append(o0000ooo);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
