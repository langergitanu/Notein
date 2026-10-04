package oo0ooO;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0ooO.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C35028OooOo0o extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C35024OooOo f125767OooOo0o;

    public C35028OooOo0o(C35024OooOo c35024OooOo) {
        this.f125767OooOo0o = c35024OooOo;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        DriveSnapshotCacheEntity driveSnapshotCacheEntity = (DriveSnapshotCacheEntity) obj;
        if (driveSnapshotCacheEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, driveSnapshotCacheEntity.getId());
        }
        if (driveSnapshotCacheEntity.getDriveId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, driveSnapshotCacheEntity.getDriveId());
        }
        if (driveSnapshotCacheEntity.getCloudMetaId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, driveSnapshotCacheEntity.getCloudMetaId());
        }
        if (driveSnapshotCacheEntity.getMimeType() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, driveSnapshotCacheEntity.getMimeType());
        }
        String strFromCloudContentTag = this.f125767OooOo0o.f125753OooO0OO.fromCloudContentTag(driveSnapshotCacheEntity.getCTag());
        if (strFromCloudContentTag == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, strFromCloudContentTag);
        }
        interfaceC24749OooO0Oo.OooO0o(6, driveSnapshotCacheEntity.getSizeBytes());
        interfaceC24749OooO0Oo.OooO0o(7, driveSnapshotCacheEntity.getCreatedTimeMillis());
        interfaceC24749OooO0Oo.OooO0o(8, driveSnapshotCacheEntity.getEditedTimeMillis());
        interfaceC24749OooO0Oo.OooO0o(9, driveSnapshotCacheEntity.getRecycled() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(10, driveSnapshotCacheEntity.getRecycledTimeMillis());
        CloudMetaExtra extra = driveSnapshotCacheEntity.getExtra();
        if (extra.getNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(11);
        } else {
            interfaceC24749OooO0Oo.o000000O(11, extra.getNoteId());
        }
        if (extra.getTemplateId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(12);
        } else {
            interfaceC24749OooO0Oo.o000000O(12, extra.getTemplateId());
        }
        if (extra.getFolderId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(13);
        } else {
            interfaceC24749OooO0Oo.o000000O(13, extra.getFolderId());
        }
        if (extra.getLastModificationTime() == null) {
            interfaceC24749OooO0Oo.OooO0oO(14);
        } else {
            interfaceC24749OooO0Oo.OooO0o(14, extra.getLastModificationTime().longValue());
        }
        if (extra.getParentId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(15);
        } else {
            interfaceC24749OooO0Oo.o000000O(15, extra.getParentId());
        }
        if ((extra.getFavorite() == null ? null : Integer.valueOf(extra.getFavorite().booleanValue() ? 1 : 0)) == null) {
            interfaceC24749OooO0Oo.OooO0oO(16);
        } else {
            interfaceC24749OooO0Oo.OooO0o(16, r0.intValue());
        }
        if (extra.getTitle() == null) {
            interfaceC24749OooO0Oo.OooO0oO(17);
        } else {
            interfaceC24749OooO0Oo.o000000O(17, extra.getTitle());
        }
        if ((extra.getInTrashBin() == null ? null : Integer.valueOf(extra.getInTrashBin().booleanValue() ? 1 : 0)) == null) {
            interfaceC24749OooO0Oo.OooO0oO(18);
        } else {
            interfaceC24749OooO0Oo.OooO0o(18, r0.intValue());
        }
        if (extra.getMimeType() == null) {
            interfaceC24749OooO0Oo.OooO0oO(19);
        } else {
            interfaceC24749OooO0Oo.o000000O(19, extra.getMimeType());
        }
        if (extra.getRecycledTime() == null) {
            interfaceC24749OooO0Oo.OooO0oO(20);
        } else {
            interfaceC24749OooO0Oo.OooO0o(20, extra.getRecycledTime().longValue());
        }
        if (extra.getCreatedTime() == null) {
            interfaceC24749OooO0Oo.OooO0oO(21);
        } else {
            interfaceC24749OooO0Oo.OooO0o(21, extra.getCreatedTime().longValue());
        }
        if (extra.getEditedTime() == null) {
            interfaceC24749OooO0Oo.OooO0oO(22);
        } else {
            interfaceC24749OooO0Oo.OooO0o(22, extra.getEditedTime().longValue());
        }
        if (extra.getNoteContentVersion() == null) {
            interfaceC24749OooO0Oo.OooO0oO(23);
        } else {
            interfaceC24749OooO0Oo.OooO0o(23, extra.getNoteContentVersion().intValue());
        }
        if (extra.getSortKey() == null) {
            interfaceC24749OooO0Oo.OooO0oO(24);
        } else {
            interfaceC24749OooO0Oo.OooO0o(24, extra.getSortKey().intValue());
        }
        if ((extra.getUsingOwnPdf() == null ? null : Integer.valueOf(extra.getUsingOwnPdf().booleanValue() ? 1 : 0)) == null) {
            interfaceC24749OooO0Oo.OooO0oO(25);
        } else {
            interfaceC24749OooO0Oo.OooO0o(25, r0.intValue());
        }
        if ((extra.getLockAdded() != null ? Integer.valueOf(extra.getLockAdded().booleanValue() ? 1 : 0) : null) == null) {
            interfaceC24749OooO0Oo.OooO0oO(26);
        } else {
            interfaceC24749OooO0Oo.OooO0o(26, r1.intValue());
        }
        if (extra.getExtra() == null) {
            interfaceC24749OooO0Oo.OooO0oO(27);
        } else {
            interfaceC24749OooO0Oo.o000000O(27, extra.getExtra());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `drive_snapshot_cache` (`id`,`drive_id`,`cloud_meta_id`,`mime_type`,`c_tag`,`size_bytes`,`created_time`,`edited_time`,`recycled`,`recycled_time`,`extra_noteId`,`extra_templateId`,`extra_folderId`,`extra_lastModificationTime`,`extra_parentId`,`extra_favorite`,`extra_title`,`extra_inTrashBin`,`extra_mimeType`,`extra_recycledTime`,`extra_createdTime`,`extra_editedTime`,`extra_noteContentVersion`,`extra_sortKey`,`extra_usingOwnPdf`,`extra_lockAdded`,`extra_extra`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
