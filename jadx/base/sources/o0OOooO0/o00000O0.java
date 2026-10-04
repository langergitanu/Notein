package o0OOooO0;

import OoooooO.C21445Oooo;
import com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<DriveSnapshotCacheEntity> f98987OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<String> f98988OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f98989OooO0OO;

    public o00000O0(List<DriveSnapshotCacheEntity> list, List<String> deletedFileIds, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(deletedFileIds, "deletedFileIds");
        this.f98987OooO00o = list;
        this.f98988OooO0O0 = deletedFileIds;
        this.f98989OooO0OO = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000O0)) {
            return false;
        }
        o00000O0 o00000o02 = (o00000O0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98987OooO00o, o00000o02.f98987OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98988OooO0O0, o00000o02.f98988OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98989OooO0OO, o00000o02.f98989OooO0OO);
    }

    public final int hashCode() {
        int iOooO00o = C21445Oooo.OooO00o(this.f98988OooO0O0, this.f98987OooO00o.hashCode() * 31, 31);
        String str = this.f98989OooO0OO;
        return iOooO00o + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DriveSyncBatch(updatedEntries=");
        sb.append(this.f98987OooO00o);
        sb.append(", deletedFileIds=");
        sb.append(this.f98988OooO0O0);
        sb.append(", cursor=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f98989OooO0OO, ")");
    }
}
