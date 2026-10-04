package o0OO000o;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.C22215OooOoo0;
import com.orion.notein.data.p602db.CloudSyncDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import o000oo0.AbstractC24678OooOoO0;
import o000ooOO.C24734OooO0O0;
import o000ooOO.OooOOOO;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o extends AbstractC24678OooOoO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CloudSyncDatabase_Impl f90892OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(CloudSyncDatabase_Impl cloudSyncDatabase_Impl) {
        super(1, "c2eb0709a839ce1267e11c33996cceb5", "d34560fa85e8c55d9dcad2882448712b");
        this.f90892OooO0Oo = cloudSyncDatabase_Impl;
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO00o(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `cloud_metas` (`id` TEXT NOT NULL, `drive_id` TEXT NOT NULL, `mime_type` TEXT NOT NULL, `meta_version` INTEGER NOT NULL, `meta_hash` TEXT NOT NULL, `drive_object_key` TEXT NOT NULL, `last_sync_time` INTEGER NOT NULL, `content_tag` TEXT NOT NULL, `deleted` INTEGER NOT NULL, `extra` TEXT NOT NULL, PRIMARY KEY(`id`, `drive_id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `cloud_metas_local` (`id` TEXT NOT NULL, `drive_id` TEXT NOT NULL, `mime_type` TEXT NOT NULL, `meta_version` INTEGER NOT NULL, `sync_state` TEXT NOT NULL, `last_modification_time` INTEGER NOT NULL, `meta_hash` TEXT NOT NULL, `content_tag` TEXT NOT NULL, `staged_content_tag` TEXT, `deleted` INTEGER NOT NULL, `deleted_remote` INTEGER NOT NULL, `last_error_code` TEXT, PRIMARY KEY(`id`, `drive_id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `drive_snapshot_cache` (`id` TEXT NOT NULL, `drive_id` TEXT NOT NULL, `cloud_meta_id` TEXT, `mime_type` TEXT, `c_tag` TEXT NOT NULL, `size_bytes` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, `edited_time` INTEGER NOT NULL, `recycled` INTEGER NOT NULL, `recycled_time` INTEGER NOT NULL, `extra_noteId` TEXT, `extra_templateId` TEXT, `extra_folderId` TEXT, `extra_lastModificationTime` INTEGER, `extra_parentId` TEXT, `extra_favorite` INTEGER, `extra_title` TEXT, `extra_inTrashBin` INTEGER, `extra_mimeType` TEXT, `extra_recycledTime` INTEGER, `extra_createdTime` INTEGER, `extra_editedTime` INTEGER, `extra_noteContentVersion` INTEGER, `extra_sortKey` INTEGER, `extra_usingOwnPdf` INTEGER, `extra_lockAdded` INTEGER, `extra_extra` TEXT, PRIMARY KEY(`id`, `drive_id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c2eb0709a839ce1267e11c33996cceb5')");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0O0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `cloud_metas`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `cloud_metas_local`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `drive_snapshot_cache`");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0OO(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0Oo(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        this.f90892OooO0Oo.OooOOo0(interfaceC24747OooO0O0);
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0o(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24734OooO0O0.OooO0O0(interfaceC24747OooO0O0);
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0o0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final AbstractC24678OooOoO0.OooO00o OooO0oO(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        HashMap map = new HashMap(10);
        map.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map.put("drive_id", new OooOOOO.OooO00o("drive_id", "TEXT", true, 2, null, 1));
        map.put("mime_type", new OooOOOO.OooO00o("mime_type", "TEXT", true, 0, null, 1));
        map.put("meta_version", new OooOOOO.OooO00o("meta_version", "INTEGER", true, 0, null, 1));
        map.put("meta_hash", new OooOOOO.OooO00o("meta_hash", "TEXT", true, 0, null, 1));
        map.put("drive_object_key", new OooOOOO.OooO00o("drive_object_key", "TEXT", true, 0, null, 1));
        map.put("last_sync_time", new OooOOOO.OooO00o("last_sync_time", "INTEGER", true, 0, null, 1));
        map.put("content_tag", new OooOOOO.OooO00o("content_tag", "TEXT", true, 0, null, 1));
        map.put("deleted", new OooOOOO.OooO00o("deleted", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO = new OooOOOO("cloud_metas", map, C22215OooOoo0.OooO0O0(map, "extra", new OooOOOO.OooO00o("extra", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "cloud_metas");
        if (!oooOOOO.equals(oooOOOOOooO00o)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("cloud_metas(com.orion.notein.data.db.entity.cloudsync.CloudMetaRemoteEntity).\n Expected:\n", oooOOOO, "\n Found:\n", oooOOOOOooO00o));
        }
        HashMap map2 = new HashMap(12);
        map2.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map2.put("drive_id", new OooOOOO.OooO00o("drive_id", "TEXT", true, 2, null, 1));
        map2.put("mime_type", new OooOOOO.OooO00o("mime_type", "TEXT", true, 0, null, 1));
        map2.put("meta_version", new OooOOOO.OooO00o("meta_version", "INTEGER", true, 0, null, 1));
        map2.put("sync_state", new OooOOOO.OooO00o("sync_state", "TEXT", true, 0, null, 1));
        map2.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        map2.put("meta_hash", new OooOOOO.OooO00o("meta_hash", "TEXT", true, 0, null, 1));
        map2.put("content_tag", new OooOOOO.OooO00o("content_tag", "TEXT", true, 0, null, 1));
        map2.put("staged_content_tag", new OooOOOO.OooO00o("staged_content_tag", "TEXT", false, 0, null, 1));
        map2.put("deleted", new OooOOOO.OooO00o("deleted", "INTEGER", true, 0, null, 1));
        map2.put("deleted_remote", new OooOOOO.OooO00o("deleted_remote", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO2 = new OooOOOO("cloud_metas_local", map2, C22215OooOoo0.OooO0O0(map2, "last_error_code", new OooOOOO.OooO00o("last_error_code", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o2 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "cloud_metas_local");
        if (!oooOOOO2.equals(oooOOOOOooO00o2)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("cloud_metas_local(com.orion.notein.data.db.entity.cloudsync.CloudMetaLocalEntity).\n Expected:\n", oooOOOO2, "\n Found:\n", oooOOOOOooO00o2));
        }
        HashMap map3 = new HashMap(27);
        map3.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map3.put("drive_id", new OooOOOO.OooO00o("drive_id", "TEXT", true, 2, null, 1));
        map3.put("cloud_meta_id", new OooOOOO.OooO00o("cloud_meta_id", "TEXT", false, 0, null, 1));
        map3.put("mime_type", new OooOOOO.OooO00o("mime_type", "TEXT", false, 0, null, 1));
        map3.put("c_tag", new OooOOOO.OooO00o("c_tag", "TEXT", true, 0, null, 1));
        map3.put("size_bytes", new OooOOOO.OooO00o("size_bytes", "INTEGER", true, 0, null, 1));
        map3.put("created_time", new OooOOOO.OooO00o("created_time", "INTEGER", true, 0, null, 1));
        map3.put("edited_time", new OooOOOO.OooO00o("edited_time", "INTEGER", true, 0, null, 1));
        map3.put("recycled", new OooOOOO.OooO00o("recycled", "INTEGER", true, 0, null, 1));
        map3.put("recycled_time", new OooOOOO.OooO00o("recycled_time", "INTEGER", true, 0, null, 1));
        map3.put("extra_noteId", new OooOOOO.OooO00o("extra_noteId", "TEXT", false, 0, null, 1));
        map3.put("extra_templateId", new OooOOOO.OooO00o("extra_templateId", "TEXT", false, 0, null, 1));
        map3.put("extra_folderId", new OooOOOO.OooO00o("extra_folderId", "TEXT", false, 0, null, 1));
        map3.put("extra_lastModificationTime", new OooOOOO.OooO00o("extra_lastModificationTime", "INTEGER", false, 0, null, 1));
        map3.put("extra_parentId", new OooOOOO.OooO00o("extra_parentId", "TEXT", false, 0, null, 1));
        map3.put("extra_favorite", new OooOOOO.OooO00o("extra_favorite", "INTEGER", false, 0, null, 1));
        map3.put("extra_title", new OooOOOO.OooO00o("extra_title", "TEXT", false, 0, null, 1));
        map3.put("extra_inTrashBin", new OooOOOO.OooO00o("extra_inTrashBin", "INTEGER", false, 0, null, 1));
        map3.put("extra_mimeType", new OooOOOO.OooO00o("extra_mimeType", "TEXT", false, 0, null, 1));
        map3.put("extra_recycledTime", new OooOOOO.OooO00o("extra_recycledTime", "INTEGER", false, 0, null, 1));
        map3.put("extra_createdTime", new OooOOOO.OooO00o("extra_createdTime", "INTEGER", false, 0, null, 1));
        map3.put("extra_editedTime", new OooOOOO.OooO00o("extra_editedTime", "INTEGER", false, 0, null, 1));
        map3.put("extra_noteContentVersion", new OooOOOO.OooO00o("extra_noteContentVersion", "INTEGER", false, 0, null, 1));
        map3.put("extra_sortKey", new OooOOOO.OooO00o("extra_sortKey", "INTEGER", false, 0, null, 1));
        map3.put("extra_usingOwnPdf", new OooOOOO.OooO00o("extra_usingOwnPdf", "INTEGER", false, 0, null, 1));
        map3.put("extra_lockAdded", new OooOOOO.OooO00o("extra_lockAdded", "INTEGER", false, 0, null, 1));
        OooOOOO oooOOOO3 = new OooOOOO("drive_snapshot_cache", map3, C22215OooOoo0.OooO0O0(map3, "extra_extra", new OooOOOO.OooO00o("extra_extra", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o3 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "drive_snapshot_cache");
        return !oooOOOO3.equals(oooOOOOOooO00o3) ? new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("drive_snapshot_cache(com.orion.notein.data.db.entity.cloudsync.DriveSnapshotCacheEntity).\n Expected:\n", oooOOOO3, "\n Found:\n", oooOOOOOooO00o3)) : new AbstractC24678OooOoO0.OooO00o(true, null);
    }
}
