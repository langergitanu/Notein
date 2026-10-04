package oo0ooO;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0ooO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C35020OooOOOo extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C35022OooOOo0 f125743OooOo0o;

    public C35020OooOOOo(C35022OooOOo0 c35022OooOOo0) {
        this.f125743OooOo0o = c35022OooOOo0;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) obj;
        if (cloudMetaRemoteEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, cloudMetaRemoteEntity.getId());
        }
        if (cloudMetaRemoteEntity.getDriveId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, cloudMetaRemoteEntity.getDriveId());
        }
        if (cloudMetaRemoteEntity.getMimeType() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, cloudMetaRemoteEntity.getMimeType());
        }
        interfaceC24749OooO0Oo.OooO0o(4, cloudMetaRemoteEntity.getMetaVersion());
        if (cloudMetaRemoteEntity.getMetaHash() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, cloudMetaRemoteEntity.getMetaHash());
        }
        if (cloudMetaRemoteEntity.getDriveObjectKey() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, cloudMetaRemoteEntity.getDriveObjectKey());
        }
        interfaceC24749OooO0Oo.OooO0o(7, cloudMetaRemoteEntity.getLastSyncTime());
        C35022OooOOo0 c35022OooOOo0 = this.f125743OooOo0o;
        String strFromCloudContentTag = c35022OooOOo0.f125746OooO0OO.fromCloudContentTag(cloudMetaRemoteEntity.getContentTag());
        if (strFromCloudContentTag == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, strFromCloudContentTag);
        }
        interfaceC24749OooO0Oo.OooO0o(9, cloudMetaRemoteEntity.getDeleted());
        String strFromCloudMetaExtra = c35022OooOOo0.f125746OooO0OO.fromCloudMetaExtra(cloudMetaRemoteEntity.getExtra());
        if (strFromCloudMetaExtra == null) {
            interfaceC24749OooO0Oo.OooO0oO(10);
        } else {
            interfaceC24749OooO0Oo.o000000O(10, strFromCloudMetaExtra);
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `cloud_metas` (`id`,`drive_id`,`mime_type`,`meta_version`,`meta_hash`,`drive_object_key`,`last_sync_time`,`content_tag`,`deleted`,`extra`) VALUES (?,?,?,?,?,?,?,?,?,?)";
    }
}
