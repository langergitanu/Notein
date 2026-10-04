package o0OO000;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m80612d2 = {"Lo0OO000/OooO0Oo;", "", "", "Lo0OO000/OooO0OO;", "OooO00o", "Ljava/util/List;", "getDeletions", "()Ljava/util/List;", "deletions", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26438OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deletions")
    private final List<OooO0OO> deletions;

    public C26438OooO0Oo(List<OooO0OO> deletions) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(deletions, "deletions");
        this.deletions = deletions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26438OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.deletions, ((C26438OooO0Oo) obj).deletions);
    }

    public final int hashCode() {
        return this.deletions.hashCode();
    }

    public final String toString() {
        return "BatchDeleteMetaRequest(deletions=" + this.deletions + ")";
    }
}
