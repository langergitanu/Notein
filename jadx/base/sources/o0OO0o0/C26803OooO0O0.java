package o0OO0o0;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO0o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0004\u0010\f¨\u0006\u000f"}, m80612d2 = {"Lo0OO0o0/OooO0O0;", "", "", "Lo0OO0o0/OooO0OO;", "OooO00o", "Ljava/util/List;", "OooO0OO", "()Ljava/util/List;", "value", "", "OooO0O0", "Ljava/lang/String;", "()Ljava/lang/String;", "odataNextLink", "odataDeltaLink", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26803OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final List<C26804OooO0OO> value;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("@odata.nextLink")
    private final String odataNextLink;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("@odata.deltaLink")
    private final String odataDeltaLink;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final String getOdataDeltaLink() {
        return this.odataDeltaLink;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final String getOdataNextLink() {
        return this.odataNextLink;
    }

    public final List<C26804OooO0OO> OooO0OO() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26803OooO0O0)) {
            return false;
        }
        C26803OooO0O0 c26803OooO0O0 = (C26803OooO0O0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.value, c26803OooO0O0.value) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.odataNextLink, c26803OooO0O0.odataNextLink) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.odataDeltaLink, c26803OooO0O0.odataDeltaLink);
    }

    public final int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        String str = this.odataNextLink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.odataDeltaLink;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        List<C26804OooO0OO> list = this.value;
        String str = this.odataNextLink;
        String str2 = this.odataDeltaLink;
        StringBuilder sb = new StringBuilder("DeltaResponse(value=");
        sb.append(list);
        sb.append(", odataNextLink=");
        sb.append(str);
        sb.append(", odataDeltaLink=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str2, ")");
    }
}
