package o0OO000;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0004\u0010\u0011¨\u0006\u0019"}, m80612d2 = {"Lo0OO000/OooOOOO;", "", "", "Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "OooO00o", "Ljava/util/List;", "OooO0OO", "()Ljava/util/List;", FirebaseAnalytics.Param.ITEMS, "", "OooO0O0", "Ljava/lang/Long;", "OooO0Oo", "()Ljava/lang/Long;", "nextCursor", "", "Z", "()Z", "hasMore", "J", "getServerTime", "()J", "serverTime", "OooO0o0", "cursorInvalid", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<CloudMetaRemoteEntity> items;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nextCursor")
    private final Long nextCursor;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasMore")
    private final boolean hasMore;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("serverTime")
    private final long serverTime;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cursorInvalid")
    private final boolean cursorInvalid;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final boolean getCursorInvalid() {
        return this.cursorInvalid;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<CloudMetaRemoteEntity> OooO0OO() {
        return this.items;
    }

    /* JADX INFO: renamed from: OooO0Oo, reason: from getter */
    public final Long getNextCursor() {
        return this.nextCursor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.items, oooOOOO.items) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.nextCursor, oooOOOO.nextCursor) && this.hasMore == oooOOOO.hasMore && this.serverTime == oooOOOO.serverTime && this.cursorInvalid == oooOOOO.cursorInvalid;
    }

    public final int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        Long l = this.nextCursor;
        return Boolean.hashCode(this.cursorInvalid) + C20703o000000o.OooO0O0(o00000.OooO0O0((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.hasMore), 31, this.serverTime);
    }

    public final String toString() {
        return "IncrementalSyncData(items=" + this.items + ", nextCursor=" + this.nextCursor + ", hasMore=" + this.hasMore + ", serverTime=" + this.serverTime + ", cursorInvalid=" + this.cursorInvalid + ")";
    }
}
