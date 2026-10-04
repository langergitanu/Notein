package o0OO000;

import com.google.gson.annotations.SerializedName;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO000.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, m80612d2 = {"Lo0OO000/OooOO0o;", "", "Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "OooO00o", "Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "()Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "meta", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26442OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("meta")
    private final CloudMetaRemoteEntity meta;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final CloudMetaRemoteEntity getMeta() {
        return this.meta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26442OooOO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.meta, ((C26442OooOO0o) obj).meta);
    }

    public final int hashCode() {
        return this.meta.hashCode();
    }

    public final String toString() {
        return "CommitPreuploadResponse(meta=" + this.meta + ")";
    }
}
