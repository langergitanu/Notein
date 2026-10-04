package com.orion.notein.data.p602db.entity.cloudsync;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaLocalStagedContentEntity;", "", "id", "", "driveId", "stagedContentTag", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;)V", "getId", "()Ljava/lang/String;", "getDriveId", "getStagedContentTag", "()Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CloudMetaLocalStagedContentEntity {
    private final String driveId;
    private final String id;
    private final CloudContentTag stagedContentTag;

    public CloudMetaLocalStagedContentEntity(String id, String driveId, CloudContentTag cloudContentTag) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        this.id = id;
        this.driveId = driveId;
        this.stagedContentTag = cloudContentTag;
    }

    public static /* synthetic */ CloudMetaLocalStagedContentEntity copy$default(CloudMetaLocalStagedContentEntity cloudMetaLocalStagedContentEntity, String str, String str2, CloudContentTag cloudContentTag, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudMetaLocalStagedContentEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = cloudMetaLocalStagedContentEntity.driveId;
        }
        if ((i & 4) != 0) {
            cloudContentTag = cloudMetaLocalStagedContentEntity.stagedContentTag;
        }
        return cloudMetaLocalStagedContentEntity.copy(str, str2, cloudContentTag);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDriveId() {
        return this.driveId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CloudContentTag getStagedContentTag() {
        return this.stagedContentTag;
    }

    public final CloudMetaLocalStagedContentEntity copy(String id, String driveId, CloudContentTag stagedContentTag) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        return new CloudMetaLocalStagedContentEntity(id, driveId, stagedContentTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudMetaLocalStagedContentEntity)) {
            return false;
        }
        CloudMetaLocalStagedContentEntity cloudMetaLocalStagedContentEntity = (CloudMetaLocalStagedContentEntity) other;
        return OooOOO0.OooO0O0(this.id, cloudMetaLocalStagedContentEntity.id) && OooOOO0.OooO0O0(this.driveId, cloudMetaLocalStagedContentEntity.driveId) && OooOOO0.OooO0O0(this.stagedContentTag, cloudMetaLocalStagedContentEntity.stagedContentTag);
    }

    public final String getDriveId() {
        return this.driveId;
    }

    public final String getId() {
        return this.id;
    }

    public final CloudContentTag getStagedContentTag() {
        return this.stagedContentTag;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.driveId);
        CloudContentTag cloudContentTag = this.stagedContentTag;
        return iOooO0O0 + (cloudContentTag == null ? 0 : cloudContentTag.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.driveId;
        CloudContentTag cloudContentTag = this.stagedContentTag;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("CloudMetaLocalStagedContentEntity(id=", str, ", driveId=", str2, ", stagedContentTag=");
        sbOooO0O0.append(cloudContentTag);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
