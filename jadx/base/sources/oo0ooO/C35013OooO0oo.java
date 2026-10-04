package oo0ooO;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalEntity;
import com.orion.notein.data.p602db.entity.cloudsync.CloudProviderConverters;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0ooO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C35013OooO0oo extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C35014OooOO0 f125724OooOo0o;

    public C35013OooO0oo(C35014OooOO0 c35014OooOO0) {
        this.f125724OooOo0o = c35014OooOO0;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        CloudMetaLocalEntity cloudMetaLocalEntity = (CloudMetaLocalEntity) obj;
        if (cloudMetaLocalEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, cloudMetaLocalEntity.getId());
        }
        if (cloudMetaLocalEntity.getDriveId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, cloudMetaLocalEntity.getDriveId());
        }
        if (cloudMetaLocalEntity.getMimeType() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, cloudMetaLocalEntity.getMimeType());
        }
        interfaceC24749OooO0Oo.OooO0o(4, cloudMetaLocalEntity.getMetaVersion());
        C35014OooOO0 c35014OooOO0 = this.f125724OooOo0o;
        String strFromCloudSyncState = c35014OooOO0.f125727OooO0OO.fromCloudSyncState(cloudMetaLocalEntity.getSyncState());
        if (strFromCloudSyncState == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, strFromCloudSyncState);
        }
        interfaceC24749OooO0Oo.OooO0o(6, cloudMetaLocalEntity.getLastModificationTime());
        if (cloudMetaLocalEntity.getMetaHash() == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, cloudMetaLocalEntity.getMetaHash());
        }
        CloudContentTag contentTag = cloudMetaLocalEntity.getContentTag();
        CloudProviderConverters cloudProviderConverters = c35014OooOO0.f125727OooO0OO;
        String strFromCloudContentTag = cloudProviderConverters.fromCloudContentTag(contentTag);
        if (strFromCloudContentTag == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, strFromCloudContentTag);
        }
        String strFromCloudContentTag2 = cloudProviderConverters.fromCloudContentTag(cloudMetaLocalEntity.getStagedContentTag());
        if (strFromCloudContentTag2 == null) {
            interfaceC24749OooO0Oo.OooO0oO(9);
        } else {
            interfaceC24749OooO0Oo.o000000O(9, strFromCloudContentTag2);
        }
        interfaceC24749OooO0Oo.OooO0o(10, cloudMetaLocalEntity.getDeleted() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(11, cloudMetaLocalEntity.getDeletedRemote() ? 1L : 0L);
        if (cloudMetaLocalEntity.getLastErrorCode() == null) {
            interfaceC24749OooO0Oo.OooO0oO(12);
        } else {
            interfaceC24749OooO0Oo.o000000O(12, cloudMetaLocalEntity.getLastErrorCode());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `cloud_metas_local` (`id`,`drive_id`,`mime_type`,`meta_version`,`sync_state`,`last_modification_time`,`meta_hash`,`content_tag`,`staged_content_tag`,`deleted`,`deleted_remote`,`last_error_code`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
