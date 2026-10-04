package o0OO0o0;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO0o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0004\u0010\u000b¨\u0006\r"}, m80612d2 = {"Lo0OO0o0/OooO0Oo;", "", "", "Lo0OO0o0/OooO0OO;", "OooO00o", "Ljava/util/List;", "OooO0O0", "()Ljava/util/List;", "value", "", "Ljava/lang/String;", "()Ljava/lang/String;", "odataNextLink", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26805OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final List<C26804OooO0OO> value = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("@odata.nextLink")
    private final String odataNextLink = null;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final String getOdataNextLink() {
        return this.odataNextLink;
    }

    public final List<C26804OooO0OO> OooO0O0() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26805OooO0Oo)) {
            return false;
        }
        C26805OooO0Oo c26805OooO0Oo = (C26805OooO0Oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.value, c26805OooO0Oo.value) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.odataNextLink, c26805OooO0Oo.odataNextLink);
    }

    public final int hashCode() {
        List<C26804OooO0OO> list = this.value;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.odataNextLink;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "DriveItemCollectionResponse(value=" + this.value + ", odataNextLink=" + this.odataNextLink + ")";
    }
}
