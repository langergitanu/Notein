package o0OO000o;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.C22215OooOoo0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hihonor.honorid.core.data.ChildrenInfo;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.penkit.models.LayerInfo;
import java.util.HashMap;
import java.util.HashSet;
import o000oo0.AbstractC24678OooOoO0;
import o000ooOO.C24734OooO0O0;
import o000ooOO.OooOOOO;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;

/* JADX INFO: renamed from: o0OO000o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26468OooO0oo extends AbstractC24678OooOoO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NoteDatabase_Impl f90934OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26468OooO0oo(NoteDatabase_Impl noteDatabase_Impl) {
        super(52, "35d3b50cd9c0d3b8254c82f2455c1d89", "d68a1d7a66837599babbec622b67cc4c");
        this.f90934OooO0Oo = noteDatabase_Impl;
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO00o(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteMetaEntity` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `title` TEXT NOT NULL, `parent_id` TEXT, `recover_parent_id` TEXT, `is_favorite` INTEGER NOT NULL, `tn_path` TEXT NOT NULL, `tn_width` INTEGER NOT NULL, `tn_height` INTEGER NOT NULL, `is_in_trash_bin` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `sort_key` INTEGER, `pdf_info_id` TEXT, `total_pages_count` INTEGER NOT NULL, `unbounded_note` INTEGER NOT NULL, `using_own_pdf` INTEGER NOT NULL, `lock_added` INTEGER NOT NULL, `last_opened_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `FolderEntity` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `title` TEXT NOT NULL, `parent_id` TEXT, `recover_parent_id` TEXT, `is_favorite` INTEGER NOT NULL, `is_in_trash_bin` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `tn_path` TEXT NOT NULL, `sort_key` INTEGER, `cover_color` INTEGER, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `PenInfoEntity` (`id` TEXT NOT NULL, `type` INTEGER NOT NULL, `color_index` INTEGER NOT NULL, `width_index` INTEGER NOT NULL, `color_list` TEXT NOT NULL, `width_list` TEXT NOT NULL, `note_id` TEXT NOT NULL, `selected` INTEGER NOT NULL, `extra` TEXT NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `ToolBoxInfoEntity` (`id` TEXT NOT NULL, `note_id` TEXT NOT NULL, `pos` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `UserEntity` (`id` TEXT NOT NULL, `nickname` TEXT, `region` TEXT, `mobile` TEXT NOT NULL, `gender` TEXT, `hw_open_id` TEXT, `wx_open_id` TEXT, `xiaomi_union_id` TEXT, `honor_open_id` TEXT, `password` TEXT, `avatar` TEXT, `creation_time` TEXT, `membership` INTEGER, `offer_free_trial` INTEGER, `on_free_trial` INTEGER, `free_trial_start_time` TEXT, `free_trial_end_time` TEXT, `membership_start_time` TEXT, `membership_end_time` TEXT, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NotePlaceholderEntity` (`id` TEXT NOT NULL, `parent_id` TEXT, `title` TEXT NOT NULL, `creation_time` INTEGER NOT NULL, `file_path` TEXT, `uri` TEXT, `state` INTEGER NOT NULL, `extras` TEXT NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `ColorSetEntity` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `colors` TEXT NOT NULL, `bg_color` INTEGER NOT NULL, `fg_color` INTEGER NOT NULL, `type` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `category` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `MyTemplateEntity` (`id` TEXT NOT NULL, `paper_theme` TEXT, `paper_spec` TEXT, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `name` TEXT, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `CouponEntity` (`id` TEXT NOT NULL, `uid` TEXT NOT NULL, `product_code` TEXT NOT NULL, `type` INTEGER NOT NULL, `value` INTEGER NOT NULL, `status` INTEGER NOT NULL, `effect_at` TEXT, `expire_at` TEXT NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteinMessageEntity` (`id` TEXT NOT NULL, `uid` TEXT, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `creation_time` TEXT NOT NULL, `type` INTEGER NOT NULL, `unread` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteFileEntity` (`id` TEXT NOT NULL, `note_id` TEXT, `template_id` TEXT, `folder_id` TEXT, `lastModification_time` INTEGER NOT NULL, `parent_id` TEXT, `favorite` INTEGER NOT NULL, `title` TEXT, `in_trash_bin` INTEGER NOT NULL, `file_name` TEXT NOT NULL, `mime_type` TEXT NOT NULL, `recycled_time` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, `edited_time` INTEGER NOT NULL, `last_history_version_id` TEXT, `size` INTEGER NOT NULL, `db_version` INTEGER NOT NULL, `sort_key` INTEGER, `using_own_pdf` INTEGER NOT NULL, `lock_added` INTEGER NOT NULL, `extra` TEXT, `sync_type` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `LocalNoteFileVersionEntity` (`id` TEXT NOT NULL, `edited_time` INTEGER NOT NULL, `last_history_version_id` TEXT, `sync_type` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `ads` (`id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `image_url_en_US` TEXT NOT NULL, `image_url_zh_CN` TEXT NOT NULL, `image_url_zh_TW` TEXT NOT NULL, `target` TEXT NOT NULL, `visible` INTEGER NOT NULL, `ad_start_time` INTEGER NOT NULL, `ad_end_time` INTEGER NOT NULL, `ad_period` INTEGER NOT NULL, `create_time` INTEGER NOT NULL, `toast_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `StickerCollectionEntity` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `name` TEXT NOT NULL, `children` TEXT NOT NULL, `built_in` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `sort_key` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `StickerEntity` (`id` TEXT NOT NULL, `parent_id` TEXT NOT NULL, `path` TEXT NOT NULL, `last_used_time` INTEGER NOT NULL, `built_in` INTEGER NOT NULL, `svg_aspect_ratio` REAL NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `labels` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `color` INTEGER NOT NULL, `createdTime` INTEGER NOT NULL, `modifiedTime` INTEGER NOT NULL, `index` REAL NOT NULL)");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `item_label_cross_ref` (`labelId` INTEGER NOT NULL, `itemType` INTEGER NOT NULL, `itemId` TEXT NOT NULL, `extraInfo` TEXT NOT NULL, `createdTime` INTEGER NOT NULL, `modifiedTime` INTEGER NOT NULL, PRIMARY KEY(`labelId`, `itemId`, `itemType`, `extraInfo`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NotePdfLostInfoEntity` (`id` TEXT NOT NULL, `src_note_id` TEXT NOT NULL, `creation_time` INTEGER NOT NULL, `pdf_file_name` TEXT NOT NULL, `db_version` INTEGER NOT NULL, `content_db_version` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `LatestOpenedNoteEntity` (`note_id` TEXT NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`note_id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteConflictEntity` (`note_id` TEXT NOT NULL, `title` TEXT NOT NULL, `user_id` TEXT NOT NULL, PRIMARY KEY(`note_id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `material_download_state` (`material_id` TEXT NOT NULL, `material_type` TEXT NOT NULL, `title` TEXT NOT NULL, `download_url` TEXT NOT NULL, `local_path` TEXT NOT NULL, `file_size` INTEGER NOT NULL, `downloaded_at` INTEGER NOT NULL, `is_available_on_server` INTEGER NOT NULL, PRIMARY KEY(`material_id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `downloaded_material` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `type` TEXT NOT NULL, `subtype` TEXT, `cover_url` TEXT NOT NULL, `preview_url` TEXT, `description` TEXT, `entitlement` TEXT NOT NULL, `download_url` TEXT, `file_size` INTEGER, `author_id` TEXT, `author_name` TEXT NOT NULL, `author_description` TEXT, `author_avatar_url` TEXT, `spec_json` TEXT, `version` INTEGER, `saved_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '35d3b50cd9c0d3b8254c82f2455c1d89')");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0O0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteMetaEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `FolderEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `PenInfoEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `ToolBoxInfoEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `UserEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NotePlaceholderEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `ColorSetEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `MyTemplateEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `CouponEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteinMessageEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteFileEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `LocalNoteFileVersionEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `ads`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `StickerCollectionEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `StickerEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `labels`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `item_label_cross_ref`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NotePdfLostInfoEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `LatestOpenedNoteEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteConflictEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `material_download_state`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `downloaded_material`");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0OO(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0Oo(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        this.f90934OooO0Oo.OooOOo0(interfaceC24747OooO0O0);
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0o(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24734OooO0O0.OooO0O0(interfaceC24747OooO0O0);
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0o0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final AbstractC24678OooOoO0.OooO00o OooO0oO(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
        HashMap map = new HashMap(19);
        map.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map.put("user_id", new OooOOOO.OooO00o("user_id", "TEXT", true, 0, null, 1));
        map.put(NoteMeta.PROPERTY_TITLE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_TITLE, "TEXT", true, 0, null, 1));
        map.put("parent_id", new OooOOOO.OooO00o("parent_id", "TEXT", false, 0, null, 1));
        map.put("recover_parent_id", new OooOOOO.OooO00o("recover_parent_id", "TEXT", false, 0, null, 1));
        map.put("is_favorite", new OooOOOO.OooO00o("is_favorite", "INTEGER", true, 0, null, 1));
        map.put("tn_path", new OooOOOO.OooO00o("tn_path", "TEXT", true, 0, null, 1));
        map.put("tn_width", new OooOOOO.OooO00o("tn_width", "INTEGER", true, 0, null, 1));
        map.put("tn_height", new OooOOOO.OooO00o("tn_height", "INTEGER", true, 0, null, 1));
        map.put("is_in_trash_bin", new OooOOOO.OooO00o("is_in_trash_bin", "INTEGER", true, 0, null, 1));
        map.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        map.put("sort_key", new OooOOOO.OooO00o("sort_key", "INTEGER", false, 0, null, 1));
        map.put("pdf_info_id", new OooOOOO.OooO00o("pdf_info_id", "TEXT", false, 0, null, 1));
        map.put("total_pages_count", new OooOOOO.OooO00o("total_pages_count", "INTEGER", true, 0, null, 1));
        map.put("unbounded_note", new OooOOOO.OooO00o("unbounded_note", "INTEGER", true, 0, null, 1));
        map.put("using_own_pdf", new OooOOOO.OooO00o("using_own_pdf", "INTEGER", true, 0, null, 1));
        map.put("lock_added", new OooOOOO.OooO00o("lock_added", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO = new OooOOOO("NoteMetaEntity", map, C22215OooOoo0.OooO0O0(map, "last_opened_time", new OooOOOO.OooO00o("last_opened_time", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o = OooOOOO.OooO00o(interfaceC24747OooO0O0, "NoteMetaEntity");
        if (!oooOOOO.equals(oooOOOOOooO00o)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteMetaEntity(com.orion.notein.data.db.entity.NoteMetaEntity).\n Expected:\n", oooOOOO, "\n Found:\n", oooOOOOOooO00o));
        }
        HashMap map2 = new HashMap(12);
        map2.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map2.put("user_id", new OooOOOO.OooO00o("user_id", "TEXT", true, 0, null, 1));
        map2.put(NoteMeta.PROPERTY_TITLE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_TITLE, "TEXT", true, 0, null, 1));
        map2.put("parent_id", new OooOOOO.OooO00o("parent_id", "TEXT", false, 0, null, 1));
        map2.put("recover_parent_id", new OooOOOO.OooO00o("recover_parent_id", "TEXT", false, 0, null, 1));
        map2.put("is_favorite", new OooOOOO.OooO00o("is_favorite", "INTEGER", true, 0, null, 1));
        map2.put("is_in_trash_bin", new OooOOOO.OooO00o("is_in_trash_bin", "INTEGER", true, 0, null, 1));
        map2.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map2.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        map2.put("tn_path", new OooOOOO.OooO00o("tn_path", "TEXT", true, 0, null, 1));
        map2.put("sort_key", new OooOOOO.OooO00o("sort_key", "INTEGER", false, 0, null, 1));
        OooOOOO oooOOOO2 = new OooOOOO("FolderEntity", map2, C22215OooOoo0.OooO0O0(map2, "cover_color", new OooOOOO.OooO00o("cover_color", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o2 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "FolderEntity");
        if (!oooOOOO2.equals(oooOOOOOooO00o2)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("FolderEntity(com.orion.notein.data.db.entity.FolderEntity).\n Expected:\n", oooOOOO2, "\n Found:\n", oooOOOOOooO00o2));
        }
        HashMap map3 = new HashMap(9);
        map3.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map3.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "INTEGER", true, 0, null, 1));
        map3.put("color_index", new OooOOOO.OooO00o("color_index", "INTEGER", true, 0, null, 1));
        map3.put("width_index", new OooOOOO.OooO00o("width_index", "INTEGER", true, 0, null, 1));
        map3.put("color_list", new OooOOOO.OooO00o("color_list", "TEXT", true, 0, null, 1));
        map3.put("width_list", new OooOOOO.OooO00o("width_list", "TEXT", true, 0, null, 1));
        map3.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", true, 0, null, 1));
        map3.put("selected", new OooOOOO.OooO00o("selected", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO3 = new OooOOOO("PenInfoEntity", map3, C22215OooOoo0.OooO0O0(map3, "extra", new OooOOOO.OooO00o("extra", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o3 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "PenInfoEntity");
        if (!oooOOOO3.equals(oooOOOOOooO00o3)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("PenInfoEntity(com.orion.notein.data.db.entity.PenInfoEntity).\n Expected:\n", oooOOOO3, "\n Found:\n", oooOOOOOooO00o3));
        }
        HashMap map4 = new HashMap(3);
        map4.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map4.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", true, 0, null, 1));
        OooOOOO oooOOOO4 = new OooOOOO("ToolBoxInfoEntity", map4, C22215OooOoo0.OooO0O0(map4, "pos", new OooOOOO.OooO00o("pos", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o4 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "ToolBoxInfoEntity");
        if (!oooOOOO4.equals(oooOOOOOooO00o4)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("ToolBoxInfoEntity(com.orion.notein.data.db.entity.ToolBoxInfoEntity).\n Expected:\n", oooOOOO4, "\n Found:\n", oooOOOOOooO00o4));
        }
        HashMap map5 = new HashMap(19);
        map5.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map5.put(IDToken.NICKNAME, new OooOOOO.OooO00o(IDToken.NICKNAME, "TEXT", false, 0, null, 1));
        map5.put("region", new OooOOOO.OooO00o("region", "TEXT", false, 0, null, 1));
        map5.put("mobile", new OooOOOO.OooO00o("mobile", "TEXT", true, 0, null, 1));
        map5.put("gender", new OooOOOO.OooO00o("gender", "TEXT", false, 0, null, 1));
        map5.put("hw_open_id", new OooOOOO.OooO00o("hw_open_id", "TEXT", false, 0, null, 1));
        map5.put("wx_open_id", new OooOOOO.OooO00o("wx_open_id", "TEXT", false, 0, null, 1));
        map5.put("xiaomi_union_id", new OooOOOO.OooO00o("xiaomi_union_id", "TEXT", false, 0, null, 1));
        map5.put("honor_open_id", new OooOOOO.OooO00o("honor_open_id", "TEXT", false, 0, null, 1));
        map5.put("password", new OooOOOO.OooO00o("password", "TEXT", false, 0, null, 1));
        map5.put("avatar", new OooOOOO.OooO00o("avatar", "TEXT", false, 0, null, 1));
        map5.put("creation_time", new OooOOOO.OooO00o("creation_time", "TEXT", false, 0, null, 1));
        map5.put("membership", new OooOOOO.OooO00o("membership", "INTEGER", false, 0, null, 1));
        map5.put("offer_free_trial", new OooOOOO.OooO00o("offer_free_trial", "INTEGER", false, 0, null, 1));
        map5.put("on_free_trial", new OooOOOO.OooO00o("on_free_trial", "INTEGER", false, 0, null, 1));
        map5.put("free_trial_start_time", new OooOOOO.OooO00o("free_trial_start_time", "TEXT", false, 0, null, 1));
        map5.put("free_trial_end_time", new OooOOOO.OooO00o("free_trial_end_time", "TEXT", false, 0, null, 1));
        map5.put("membership_start_time", new OooOOOO.OooO00o("membership_start_time", "TEXT", false, 0, null, 1));
        OooOOOO oooOOOO5 = new OooOOOO("UserEntity", map5, C22215OooOoo0.OooO0O0(map5, "membership_end_time", new OooOOOO.OooO00o("membership_end_time", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o5 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "UserEntity");
        if (!oooOOOO5.equals(oooOOOOOooO00o5)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("UserEntity(com.orion.notein.data.db.entity.UserEntity).\n Expected:\n", oooOOOO5, "\n Found:\n", oooOOOOOooO00o5));
        }
        HashMap map6 = new HashMap(8);
        map6.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map6.put("parent_id", new OooOOOO.OooO00o("parent_id", "TEXT", false, 0, null, 1));
        map6.put(NoteMeta.PROPERTY_TITLE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_TITLE, "TEXT", true, 0, null, 1));
        map6.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map6.put("file_path", new OooOOOO.OooO00o("file_path", "TEXT", false, 0, null, 1));
        map6.put("uri", new OooOOOO.OooO00o("uri", "TEXT", false, 0, null, 1));
        map6.put("state", new OooOOOO.OooO00o("state", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO6 = new OooOOOO("NotePlaceholderEntity", map6, C22215OooOoo0.OooO0O0(map6, "extras", new OooOOOO.OooO00o("extras", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o6 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "NotePlaceholderEntity");
        if (!oooOOOO6.equals(oooOOOOOooO00o6)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NotePlaceholderEntity(com.orion.notein.data.db.entity.NotePlaceholderEntity).\n Expected:\n", oooOOOO6, "\n Found:\n", oooOOOOOooO00o6));
        }
        HashMap map7 = new HashMap(8);
        map7.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map7.put("name", new OooOOOO.OooO00o("name", "TEXT", true, 0, null, 1));
        map7.put("colors", new OooOOOO.OooO00o("colors", "TEXT", true, 0, null, 1));
        map7.put("bg_color", new OooOOOO.OooO00o("bg_color", "INTEGER", true, 0, null, 1));
        map7.put("fg_color", new OooOOOO.OooO00o("fg_color", "INTEGER", true, 0, null, 1));
        map7.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "INTEGER", true, 0, null, 1));
        map7.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO7 = new OooOOOO("ColorSetEntity", map7, C22215OooOoo0.OooO0O0(map7, "category", new OooOOOO.OooO00o("category", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o7 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "ColorSetEntity");
        if (!oooOOOO7.equals(oooOOOOOooO00o7)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("ColorSetEntity(com.orion.notein.data.db.entity.ColorSetEntity).\n Expected:\n", oooOOOO7, "\n Found:\n", oooOOOOOooO00o7));
        }
        HashMap map8 = new HashMap(6);
        map8.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map8.put(LayerInfo.PAPER_THEME_LAYER_ID, new OooOOOO.OooO00o(LayerInfo.PAPER_THEME_LAYER_ID, "TEXT", false, 0, null, 1));
        map8.put("paper_spec", new OooOOOO.OooO00o("paper_spec", "TEXT", false, 0, null, 1));
        map8.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map8.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO8 = new OooOOOO("MyTemplateEntity", map8, C22215OooOoo0.OooO0O0(map8, "name", new OooOOOO.OooO00o("name", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o8 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "MyTemplateEntity");
        if (!oooOOOO8.equals(oooOOOOOooO00o8)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("MyTemplateEntity(com.orion.notein.data.db.entity.MyTemplateEntity).\n Expected:\n", oooOOOO8, "\n Found:\n", oooOOOOOooO00o8));
        }
        HashMap map9 = new HashMap(8);
        map9.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map9.put(CommonConstant.KEY_UID, new OooOOOO.OooO00o(CommonConstant.KEY_UID, "TEXT", true, 0, null, 1));
        map9.put("product_code", new OooOOOO.OooO00o("product_code", "TEXT", true, 0, null, 1));
        map9.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "INTEGER", true, 0, null, 1));
        map9.put("value", new OooOOOO.OooO00o("value", "INTEGER", true, 0, null, 1));
        map9.put("status", new OooOOOO.OooO00o("status", "INTEGER", true, 0, null, 1));
        map9.put("effect_at", new OooOOOO.OooO00o("effect_at", "TEXT", false, 0, null, 1));
        OooOOOO oooOOOO9 = new OooOOOO("CouponEntity", map9, C22215OooOoo0.OooO0O0(map9, "expire_at", new OooOOOO.OooO00o("expire_at", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o9 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "CouponEntity");
        if (!oooOOOO9.equals(oooOOOOOooO00o9)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("CouponEntity(com.orion.notein.data.db.entity.CouponEntity).\n Expected:\n", oooOOOO9, "\n Found:\n", oooOOOOOooO00o9));
        }
        HashMap map10 = new HashMap(7);
        map10.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map10.put(CommonConstant.KEY_UID, new OooOOOO.OooO00o(CommonConstant.KEY_UID, "TEXT", false, 0, null, 1));
        map10.put(NoteMeta.PROPERTY_TITLE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_TITLE, "TEXT", true, 0, null, 1));
        map10.put(FirebaseAnalytics.Param.CONTENT, new OooOOOO.OooO00o(FirebaseAnalytics.Param.CONTENT, "TEXT", true, 0, null, 1));
        map10.put("creation_time", new OooOOOO.OooO00o("creation_time", "TEXT", true, 0, null, 1));
        map10.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO10 = new OooOOOO("NoteinMessageEntity", map10, C22215OooOoo0.OooO0O0(map10, "unread", new OooOOOO.OooO00o("unread", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o10 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "NoteinMessageEntity");
        if (!oooOOOO10.equals(oooOOOOOooO00o10)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteinMessageEntity(com.orion.notein.data.db.entity.NoteinMessageEntity).\n Expected:\n", oooOOOO10, "\n Found:\n", oooOOOOOooO00o10));
        }
        HashMap map11 = new HashMap(22);
        map11.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map11.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", false, 0, null, 1));
        map11.put("template_id", new OooOOOO.OooO00o("template_id", "TEXT", false, 0, null, 1));
        map11.put("folder_id", new OooOOOO.OooO00o("folder_id", "TEXT", false, 0, null, 1));
        map11.put("lastModification_time", new OooOOOO.OooO00o("lastModification_time", "INTEGER", true, 0, null, 1));
        map11.put("parent_id", new OooOOOO.OooO00o("parent_id", "TEXT", false, 0, null, 1));
        map11.put(NoteMeta.PROPERTY_FAVORITE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_FAVORITE, "INTEGER", true, 0, null, 1));
        map11.put(NoteMeta.PROPERTY_TITLE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_TITLE, "TEXT", false, 0, null, 1));
        map11.put("in_trash_bin", new OooOOOO.OooO00o("in_trash_bin", "INTEGER", true, 0, null, 1));
        map11.put("file_name", new OooOOOO.OooO00o("file_name", "TEXT", true, 0, null, 1));
        map11.put("mime_type", new OooOOOO.OooO00o("mime_type", "TEXT", true, 0, null, 1));
        map11.put("recycled_time", new OooOOOO.OooO00o("recycled_time", "INTEGER", true, 0, null, 1));
        map11.put("created_time", new OooOOOO.OooO00o("created_time", "INTEGER", true, 0, null, 1));
        map11.put("edited_time", new OooOOOO.OooO00o("edited_time", "INTEGER", true, 0, null, 1));
        map11.put("last_history_version_id", new OooOOOO.OooO00o("last_history_version_id", "TEXT", false, 0, null, 1));
        map11.put("size", new OooOOOO.OooO00o("size", "INTEGER", true, 0, null, 1));
        map11.put("db_version", new OooOOOO.OooO00o("db_version", "INTEGER", true, 0, null, 1));
        map11.put("sort_key", new OooOOOO.OooO00o("sort_key", "INTEGER", false, 0, null, 1));
        map11.put("using_own_pdf", new OooOOOO.OooO00o("using_own_pdf", "INTEGER", true, 0, null, 1));
        map11.put("lock_added", new OooOOOO.OooO00o("lock_added", "INTEGER", true, 0, null, 1));
        map11.put("extra", new OooOOOO.OooO00o("extra", "TEXT", false, 0, null, 1));
        OooOOOO oooOOOO11 = new OooOOOO("NoteFileEntity", map11, C22215OooOoo0.OooO0O0(map11, "sync_type", new OooOOOO.OooO00o("sync_type", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o11 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "NoteFileEntity");
        if (!oooOOOO11.equals(oooOOOOOooO00o11)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteFileEntity(com.orion.notein.data.db.entity.NoteFileEntity).\n Expected:\n", oooOOOO11, "\n Found:\n", oooOOOOOooO00o11));
        }
        HashMap map12 = new HashMap(4);
        map12.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map12.put("edited_time", new OooOOOO.OooO00o("edited_time", "INTEGER", true, 0, null, 1));
        map12.put("last_history_version_id", new OooOOOO.OooO00o("last_history_version_id", "TEXT", false, 0, null, 1));
        OooOOOO oooOOOO12 = new OooOOOO("LocalNoteFileVersionEntity", map12, C22215OooOoo0.OooO0O0(map12, "sync_type", new OooOOOO.OooO00o("sync_type", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o12 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "LocalNoteFileVersionEntity");
        if (!oooOOOO12.equals(oooOOOOOooO00o12)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("LocalNoteFileVersionEntity(com.orion.notein.data.db.entity.LocalNoteFileVersionEntity).\n Expected:\n", oooOOOO12, "\n Found:\n", oooOOOOOooO00o12));
        }
        HashMap map13 = new HashMap(12);
        map13.put("id", new OooOOOO.OooO00o("id", "INTEGER", true, 1, null, 1));
        map13.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "INTEGER", true, 0, null, 1));
        map13.put("image_url_en_US", new OooOOOO.OooO00o("image_url_en_US", "TEXT", true, 0, null, 1));
        map13.put("image_url_zh_CN", new OooOOOO.OooO00o("image_url_zh_CN", "TEXT", true, 0, null, 1));
        map13.put("image_url_zh_TW", new OooOOOO.OooO00o("image_url_zh_TW", "TEXT", true, 0, null, 1));
        map13.put("target", new OooOOOO.OooO00o("target", "TEXT", true, 0, null, 1));
        map13.put("visible", new OooOOOO.OooO00o("visible", "INTEGER", true, 0, null, 1));
        map13.put("ad_start_time", new OooOOOO.OooO00o("ad_start_time", "INTEGER", true, 0, null, 1));
        map13.put("ad_end_time", new OooOOOO.OooO00o("ad_end_time", "INTEGER", true, 0, null, 1));
        map13.put("ad_period", new OooOOOO.OooO00o("ad_period", "INTEGER", true, 0, null, 1));
        map13.put("create_time", new OooOOOO.OooO00o("create_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO13 = new OooOOOO("ads", map13, C22215OooOoo0.OooO0O0(map13, "toast_time", new OooOOOO.OooO00o("toast_time", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o13 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "ads");
        if (!oooOOOO13.equals(oooOOOOOooO00o13)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("ads(com.orion.notein.data.db.entity.AdEntity).\n Expected:\n", oooOOOO13, "\n Found:\n", oooOOOOOooO00o13));
        }
        HashMap map14 = new HashMap(8);
        map14.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map14.put("user_id", new OooOOOO.OooO00o("user_id", "TEXT", true, 0, null, 1));
        map14.put("name", new OooOOOO.OooO00o("name", "TEXT", true, 0, null, 1));
        map14.put(ChildrenInfo.TAG_CHILDREN_INFO, new OooOOOO.OooO00o(ChildrenInfo.TAG_CHILDREN_INFO, "TEXT", true, 0, null, 1));
        map14.put("built_in", new OooOOOO.OooO00o("built_in", "INTEGER", true, 0, null, 1));
        map14.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map14.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO14 = new OooOOOO("StickerCollectionEntity", map14, C22215OooOoo0.OooO0O0(map14, "sort_key", new OooOOOO.OooO00o("sort_key", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o14 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "StickerCollectionEntity");
        if (!oooOOOO14.equals(oooOOOOOooO00o14)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("StickerCollectionEntity(com.orion.notein.data.db.entity.StickerCollectionEntity).\n Expected:\n", oooOOOO14, "\n Found:\n", oooOOOOOooO00o14));
        }
        HashMap map15 = new HashMap(6);
        map15.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map15.put("parent_id", new OooOOOO.OooO00o("parent_id", "TEXT", true, 0, null, 1));
        map15.put("path", new OooOOOO.OooO00o("path", "TEXT", true, 0, null, 1));
        map15.put("last_used_time", new OooOOOO.OooO00o("last_used_time", "INTEGER", true, 0, null, 1));
        map15.put("built_in", new OooOOOO.OooO00o("built_in", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO15 = new OooOOOO("StickerEntity", map15, C22215OooOoo0.OooO0O0(map15, "svg_aspect_ratio", new OooOOOO.OooO00o("svg_aspect_ratio", "REAL", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o15 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "StickerEntity");
        if (!oooOOOO15.equals(oooOOOOOooO00o15)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("StickerEntity(com.orion.notein.data.db.entity.StickerEntity).\n Expected:\n", oooOOOO15, "\n Found:\n", oooOOOOOooO00o15));
        }
        HashMap map16 = new HashMap(6);
        map16.put("id", new OooOOOO.OooO00o("id", "INTEGER", true, 1, null, 1));
        map16.put("name", new OooOOOO.OooO00o("name", "TEXT", true, 0, null, 1));
        map16.put("color", new OooOOOO.OooO00o("color", "INTEGER", true, 0, null, 1));
        map16.put("createdTime", new OooOOOO.OooO00o("createdTime", "INTEGER", true, 0, null, 1));
        map16.put("modifiedTime", new OooOOOO.OooO00o("modifiedTime", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO16 = new OooOOOO("labels", map16, C22215OooOoo0.OooO0O0(map16, FirebaseAnalytics.Param.INDEX, new OooOOOO.OooO00o(FirebaseAnalytics.Param.INDEX, "REAL", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o16 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "labels");
        if (!oooOOOO16.equals(oooOOOOOooO00o16)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("labels(com.orion.notein.data.db.entity.LabelEntity).\n Expected:\n", oooOOOO16, "\n Found:\n", oooOOOOOooO00o16));
        }
        HashMap map17 = new HashMap(6);
        map17.put("labelId", new OooOOOO.OooO00o("labelId", "INTEGER", true, 1, null, 1));
        map17.put("itemType", new OooOOOO.OooO00o("itemType", "INTEGER", true, 3, null, 1));
        map17.put("itemId", new OooOOOO.OooO00o("itemId", "TEXT", true, 2, null, 1));
        map17.put("extraInfo", new OooOOOO.OooO00o("extraInfo", "TEXT", true, 4, null, 1));
        map17.put("createdTime", new OooOOOO.OooO00o("createdTime", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO17 = new OooOOOO("item_label_cross_ref", map17, C22215OooOoo0.OooO0O0(map17, "modifiedTime", new OooOOOO.OooO00o("modifiedTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o17 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "item_label_cross_ref");
        if (!oooOOOO17.equals(oooOOOOOooO00o17)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("item_label_cross_ref(com.orion.notein.data.db.entity.ItemLabelCrossRef).\n Expected:\n", oooOOOO17, "\n Found:\n", oooOOOOOooO00o17));
        }
        HashMap map18 = new HashMap(6);
        map18.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map18.put("src_note_id", new OooOOOO.OooO00o("src_note_id", "TEXT", true, 0, null, 1));
        map18.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map18.put("pdf_file_name", new OooOOOO.OooO00o("pdf_file_name", "TEXT", true, 0, null, 1));
        map18.put("db_version", new OooOOOO.OooO00o("db_version", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO18 = new OooOOOO("NotePdfLostInfoEntity", map18, C22215OooOoo0.OooO0O0(map18, "content_db_version", new OooOOOO.OooO00o("content_db_version", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o18 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "NotePdfLostInfoEntity");
        if (!oooOOOO18.equals(oooOOOOOooO00o18)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NotePdfLostInfoEntity(com.orion.notein.data.db.entity.NotePdfLostInfoEntity).\n Expected:\n", oooOOOO18, "\n Found:\n", oooOOOOOooO00o18));
        }
        HashMap map19 = new HashMap(2);
        map19.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", true, 1, null, 1));
        OooOOOO oooOOOO19 = new OooOOOO("LatestOpenedNoteEntity", map19, C22215OooOoo0.OooO0O0(map19, FirebaseAnalytics.Param.INDEX, new OooOOOO.OooO00o(FirebaseAnalytics.Param.INDEX, "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o19 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "LatestOpenedNoteEntity");
        if (!oooOOOO19.equals(oooOOOOOooO00o19)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("LatestOpenedNoteEntity(com.orion.notein.data.db.entity.LatestOpenedNoteEntity).\n Expected:\n", oooOOOO19, "\n Found:\n", oooOOOOOooO00o19));
        }
        HashMap map20 = new HashMap(3);
        map20.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", true, 1, null, 1));
        map20.put(NoteMeta.PROPERTY_TITLE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_TITLE, "TEXT", true, 0, null, 1));
        OooOOOO oooOOOO20 = new OooOOOO("NoteConflictEntity", map20, C22215OooOoo0.OooO0O0(map20, "user_id", new OooOOOO.OooO00o("user_id", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o20 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "NoteConflictEntity");
        if (!oooOOOO20.equals(oooOOOOOooO00o20)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteConflictEntity(com.orion.notein.data.db.entity.NoteConflictEntity).\n Expected:\n", oooOOOO20, "\n Found:\n", oooOOOOOooO00o20));
        }
        HashMap map21 = new HashMap(8);
        map21.put("material_id", new OooOOOO.OooO00o("material_id", "TEXT", true, 1, null, 1));
        map21.put("material_type", new OooOOOO.OooO00o("material_type", "TEXT", true, 0, null, 1));
        map21.put(NoteMeta.PROPERTY_TITLE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_TITLE, "TEXT", true, 0, null, 1));
        map21.put("download_url", new OooOOOO.OooO00o("download_url", "TEXT", true, 0, null, 1));
        map21.put("local_path", new OooOOOO.OooO00o("local_path", "TEXT", true, 0, null, 1));
        map21.put("file_size", new OooOOOO.OooO00o("file_size", "INTEGER", true, 0, null, 1));
        map21.put("downloaded_at", new OooOOOO.OooO00o("downloaded_at", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO21 = new OooOOOO("material_download_state", map21, C22215OooOoo0.OooO0O0(map21, "is_available_on_server", new OooOOOO.OooO00o("is_available_on_server", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o21 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "material_download_state");
        if (!oooOOOO21.equals(oooOOOOOooO00o21)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("material_download_state(com.orion.notein.data.db.entity.MaterialDownloadStateEntity).\n Expected:\n", oooOOOO21, "\n Found:\n", oooOOOOOooO00o21));
        }
        HashMap map22 = new HashMap(17);
        map22.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map22.put(NoteMeta.PROPERTY_TITLE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_TITLE, "TEXT", true, 0, null, 1));
        map22.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "TEXT", true, 0, null, 1));
        map22.put("subtype", new OooOOOO.OooO00o("subtype", "TEXT", false, 0, null, 1));
        map22.put("cover_url", new OooOOOO.OooO00o("cover_url", "TEXT", true, 0, null, 1));
        map22.put("preview_url", new OooOOOO.OooO00o("preview_url", "TEXT", false, 0, null, 1));
        map22.put("description", new OooOOOO.OooO00o("description", "TEXT", false, 0, null, 1));
        map22.put("entitlement", new OooOOOO.OooO00o("entitlement", "TEXT", true, 0, null, 1));
        map22.put("download_url", new OooOOOO.OooO00o("download_url", "TEXT", false, 0, null, 1));
        map22.put("file_size", new OooOOOO.OooO00o("file_size", "INTEGER", false, 0, null, 1));
        map22.put("author_id", new OooOOOO.OooO00o("author_id", "TEXT", false, 0, null, 1));
        map22.put("author_name", new OooOOOO.OooO00o("author_name", "TEXT", true, 0, null, 1));
        map22.put("author_description", new OooOOOO.OooO00o("author_description", "TEXT", false, 0, null, 1));
        map22.put("author_avatar_url", new OooOOOO.OooO00o("author_avatar_url", "TEXT", false, 0, null, 1));
        map22.put("spec_json", new OooOOOO.OooO00o("spec_json", "TEXT", false, 0, null, 1));
        map22.put("version", new OooOOOO.OooO00o("version", "INTEGER", false, 0, null, 1));
        OooOOOO oooOOOO22 = new OooOOOO("downloaded_material", map22, C22215OooOoo0.OooO0O0(map22, "saved_at", new OooOOOO.OooO00o("saved_at", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o22 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "downloaded_material");
        return !oooOOOO22.equals(oooOOOOOooO00o22) ? new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("downloaded_material(com.orion.notein.data.db.entity.DownloadedMaterialEntity).\n Expected:\n", oooOOOO22, "\n Found:\n", oooOOOOOooO00o22)) : new AbstractC24678OooOoO0.OooO00o(true, null);
    }
}
