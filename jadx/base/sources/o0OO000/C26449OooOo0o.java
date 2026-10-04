package o0OO000;

import com.google.gson.annotations.SerializedName;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO000.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m80612d2 = {"Lo0OO000/OooOo0o;", "", "Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "OooO00o", "Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "()Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "meta", "", "OooO0O0", "Z", "getResolved", "()Z", "resolved", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26449OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("meta")
    private final CloudMetaRemoteEntity meta;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resolved")
    private final boolean resolved;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final CloudMetaRemoteEntity getMeta() {
        return this.meta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26449OooOo0o)) {
            return false;
        }
        C26449OooOo0o c26449OooOo0o = (C26449OooOo0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.meta, c26449OooOo0o.meta) && this.resolved == c26449OooOo0o.resolved;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.resolved) + (this.meta.hashCode() * 31);
    }

    public final String toString() {
        return "ReconcileContentResponse(meta=" + this.meta + ", resolved=" + this.resolved + ")";
    }
}
