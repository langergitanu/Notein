package o0OO000;

import com.google.gson.annotations.SerializedName;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO000.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, m80612d2 = {"Lo0OO000/OooOOo;", "", "Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "OooO00o", "Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "OooO0OO", "()Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "meta", "", "OooO0O0", "Ljava/lang/String;", "()Ljava/lang/String;", "errorCode", "errorMsg", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26444OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("meta")
    private final CloudMetaRemoteEntity meta = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorCode")
    private final String errorCode = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorMsg")
    private final String errorMsg = null;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final CloudMetaRemoteEntity getMeta() {
        return this.meta;
    }

    public final boolean OooO0Oo() {
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.errorCode, "0") || this.errorCode == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26444OooOOo)) {
            return false;
        }
        C26444OooOOo c26444OooOOo = (C26444OooOOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.meta, c26444OooOOo.meta) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.errorCode, c26444OooOOo.errorCode) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.errorMsg, c26444OooOOo.errorMsg);
    }

    public final int hashCode() {
        CloudMetaRemoteEntity cloudMetaRemoteEntity = this.meta;
        int iHashCode = (cloudMetaRemoteEntity == null ? 0 : cloudMetaRemoteEntity.hashCode()) * 31;
        String str = this.errorCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMsg;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        CloudMetaRemoteEntity cloudMetaRemoteEntity = this.meta;
        String str = this.errorCode;
        String str2 = this.errorMsg;
        StringBuilder sb = new StringBuilder("MigrateMetaResponseItem(meta=");
        sb.append(cloudMetaRemoteEntity);
        sb.append(", errorCode=");
        sb.append(str);
        sb.append(", errorMsg=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str2, ")");
    }
}
