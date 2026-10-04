package o0OO000;

import OoooooO.C21445Oooo;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u0010"}, m80612d2 = {"Lo0OO000/OooOo;", "", "", "OooO00o", "Ljava/lang/String;", "OooO0Oo", "()Ljava/lang/String;", "metaId", "Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "OooO0O0", "Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "OooO0OO", "()Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "meta", "errorCode", "errorMsg", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metaId")
    private final String metaId = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("meta")
    private final CloudMetaRemoteEntity meta = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorCode")
    private final String errorCode = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
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

    /* JADX INFO: renamed from: OooO0Oo, reason: from getter */
    public final String getMetaId() {
        return this.metaId;
    }

    public final boolean OooO0o0() {
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.errorCode, "0") || this.errorCode == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.metaId, oooOo.metaId) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.meta, oooOo.meta) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.errorCode, oooOo.errorCode) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.errorMsg, oooOo.errorMsg);
    }

    public final int hashCode() {
        String str = this.metaId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CloudMetaRemoteEntity cloudMetaRemoteEntity = this.meta;
        int iHashCode2 = (iHashCode + (cloudMetaRemoteEntity == null ? 0 : cloudMetaRemoteEntity.hashCode())) * 31;
        String str2 = this.errorCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMsg;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.metaId;
        CloudMetaRemoteEntity cloudMetaRemoteEntity = this.meta;
        String str2 = this.errorCode;
        String str3 = this.errorMsg;
        StringBuilder sb = new StringBuilder("ReconcileContentResponseItem(metaId=");
        sb.append(str);
        sb.append(", meta=");
        sb.append(cloudMetaRemoteEntity);
        sb.append(", errorCode=");
        return C21445Oooo.OooO0O0(sb, str2, ", errorMsg=", str3, ")");
    }
}
