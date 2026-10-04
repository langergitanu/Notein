package o0OO000;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m80612d2 = {"Lo0OO000/OooO0o;", "", "", "Lo0OO000/OooOOOo;", "OooO00o", "Ljava/util/List;", "getMigrates", "()Ljava/util/List;", "migrates", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("migrates")
    private final List<C26443OooOOOo> migrates;

    public OooO0o(List<C26443OooOOOo> migrates) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(migrates, "migrates");
        this.migrates = migrates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.migrates, ((OooO0o) obj).migrates);
    }

    public final int hashCode() {
        return this.migrates.hashCode();
    }

    public final String toString() {
        return "BatchMigrateMetaRequest(migrates=" + this.migrates + ")";
    }
}
