package o0OOooO0;

import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;

/* JADX INFO: loaded from: classes9.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CloudMetaRemoteEntity f98985OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f98986OooO0O0;

    public o00000O(CloudMetaRemoteEntity cloudMetaRemoteEntity, String str) {
        this.f98985OooO00o = cloudMetaRemoteEntity;
        this.f98986OooO0O0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000O)) {
            return false;
        }
        o00000O o00000o = (o00000O) obj;
        return this.f98985OooO00o.equals(o00000o.f98985OooO00o) && this.f98986OooO0O0.equals(o00000o.f98986OooO0O0);
    }

    public final int hashCode() {
        return com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f98985OooO00o.hashCode() * 31, 31, this.f98986OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DriveUploadRequest(meta=");
        sb.append(this.f98985OooO00o);
        sb.append(", stagedPath=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f98986OooO0O0, ", mimeOverride=null)");
    }
}
