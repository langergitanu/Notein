package o0OO000o;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.C22215OooOoo0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.NoteAiDatabase_Impl;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import o000oo0.AbstractC24678OooOoO0;
import o000ooOO.C24734OooO0O0;
import o000ooOO.OooOOOO;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0O0 extends AbstractC24678OooOoO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NoteAiDatabase_Impl f90893OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(NoteAiDatabase_Impl noteAiDatabase_Impl) {
        super(4, "84da5acab70cc6672693327ace809ff8", "c067b50b667839a901cd65091717d253");
        this.f90893OooO0Oo = noteAiDatabase_Impl;
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO00o(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `UploadRecordEntity` (`md5` TEXT NOT NULL, `type` TEXT NOT NULL, `uploaded` INTEGER NOT NULL, `indexed` INTEGER NOT NULL, PRIMARY KEY(`md5`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteSummaryEntity` (`md5` TEXT NOT NULL, `summary` TEXT NOT NULL, PRIMARY KEY(`md5`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteAiContentEntity` (`id` TEXT NOT NULL, `summary_list` TEXT, `saved_summary_index` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `AiOcrSessionEntity` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `user_id` TEXT NOT NULL, `page_ids` TEXT NOT NULL, `input_source_json` TEXT, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `AiOcrTextPageEntity` (`id` TEXT NOT NULL, `source_type` INTEGER NOT NULL, `source_uri` TEXT NOT NULL, `content` TEXT NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `extras` TEXT NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteinAiQuotaRecordEntity` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `amount` INTEGER NOT NULL, `source_type` TEXT NOT NULL, `link_purchase_token` TEXT NOT NULL, `usage_metadata_json` TEXT, `created_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE INDEX IF NOT EXISTS `index_NoteinAiQuotaRecordEntity_user_id` ON `NoteinAiQuotaRecordEntity` (`user_id`)");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteinAiQuotaRecordEntityV2` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `amount` INTEGER NOT NULL, `source_type` TEXT NOT NULL, `link_purchase_token` TEXT NOT NULL, `usage_metadata_json` TEXT, `created_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '84da5acab70cc6672693327ace809ff8')");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0O0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `UploadRecordEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteSummaryEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteAiContentEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `AiOcrSessionEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `AiOcrTextPageEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteinAiQuotaRecordEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteinAiQuotaRecordEntityV2`");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0OO(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0Oo(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        this.f90893OooO0Oo.OooOOo0(interfaceC24747OooO0O0);
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
        HashMap map = new HashMap(4);
        map.put("md5", new OooOOOO.OooO00o("md5", "TEXT", true, 1, null, 1));
        map.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "TEXT", true, 0, null, 1));
        map.put("uploaded", new OooOOOO.OooO00o("uploaded", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO = new OooOOOO("UploadRecordEntity", map, C22215OooOoo0.OooO0O0(map, "indexed", new OooOOOO.OooO00o("indexed", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "UploadRecordEntity");
        if (!oooOOOO.equals(oooOOOOOooO00o)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("UploadRecordEntity(com.orion.notein.data.db.entity.UploadRecordEntity).\n Expected:\n", oooOOOO, "\n Found:\n", oooOOOOOooO00o));
        }
        HashMap map2 = new HashMap(2);
        map2.put("md5", new OooOOOO.OooO00o("md5", "TEXT", true, 1, null, 1));
        OooOOOO oooOOOO2 = new OooOOOO("NoteSummaryEntity", map2, C22215OooOoo0.OooO0O0(map2, "summary", new OooOOOO.OooO00o("summary", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o2 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "NoteSummaryEntity");
        if (!oooOOOO2.equals(oooOOOOOooO00o2)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteSummaryEntity(com.orion.notein.data.db.entity.ai.NoteSummaryEntity).\n Expected:\n", oooOOOO2, "\n Found:\n", oooOOOOOooO00o2));
        }
        HashMap map3 = new HashMap(5);
        map3.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map3.put("summary_list", new OooOOOO.OooO00o("summary_list", "TEXT", false, 0, null, 1));
        map3.put("saved_summary_index", new OooOOOO.OooO00o("saved_summary_index", "INTEGER", true, 0, null, 1));
        map3.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO3 = new OooOOOO("NoteAiContentEntity", map3, C22215OooOoo0.OooO0O0(map3, "last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o3 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "NoteAiContentEntity");
        if (!oooOOOO3.equals(oooOOOOOooO00o3)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteAiContentEntity(com.orion.notein.data.db.entity.ai.NoteAiContentEntity).\n Expected:\n", oooOOOO3, "\n Found:\n", oooOOOOOooO00o3));
        }
        HashMap map4 = new HashMap(7);
        map4.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map4.put(NoteMeta.PROPERTY_TITLE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_TITLE, "TEXT", true, 0, null, 1));
        map4.put("user_id", new OooOOOO.OooO00o("user_id", "TEXT", true, 0, null, 1));
        map4.put("page_ids", new OooOOOO.OooO00o("page_ids", "TEXT", true, 0, null, 1));
        map4.put("input_source_json", new OooOOOO.OooO00o("input_source_json", "TEXT", false, 0, null, 1));
        map4.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO4 = new OooOOOO("AiOcrSessionEntity", map4, C22215OooOoo0.OooO0O0(map4, "last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o4 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "AiOcrSessionEntity");
        if (!oooOOOO4.equals(oooOOOOOooO00o4)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("AiOcrSessionEntity(com.orion.notein.data.db.entity.AiOcrSessionEntity).\n Expected:\n", oooOOOO4, "\n Found:\n", oooOOOOOooO00o4));
        }
        HashMap map5 = new HashMap(7);
        map5.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map5.put("source_type", new OooOOOO.OooO00o("source_type", "INTEGER", true, 0, null, 1));
        map5.put("source_uri", new OooOOOO.OooO00o("source_uri", "TEXT", true, 0, null, 1));
        map5.put(FirebaseAnalytics.Param.CONTENT, new OooOOOO.OooO00o(FirebaseAnalytics.Param.CONTENT, "TEXT", true, 0, null, 1));
        map5.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map5.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO5 = new OooOOOO("AiOcrTextPageEntity", map5, C22215OooOoo0.OooO0O0(map5, "extras", new OooOOOO.OooO00o("extras", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o5 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "AiOcrTextPageEntity");
        if (!oooOOOO5.equals(oooOOOOOooO00o5)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("AiOcrTextPageEntity(com.orion.notein.data.db.entity.AiOcrTextPageEntity).\n Expected:\n", oooOOOO5, "\n Found:\n", oooOOOOOooO00o5));
        }
        HashMap map6 = new HashMap(7);
        map6.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map6.put("user_id", new OooOOOO.OooO00o("user_id", "TEXT", true, 0, null, 1));
        map6.put("amount", new OooOOOO.OooO00o("amount", "INTEGER", true, 0, null, 1));
        map6.put("source_type", new OooOOOO.OooO00o("source_type", "TEXT", true, 0, null, 1));
        map6.put("link_purchase_token", new OooOOOO.OooO00o("link_purchase_token", "TEXT", true, 0, null, 1));
        map6.put("usage_metadata_json", new OooOOOO.OooO00o("usage_metadata_json", "TEXT", false, 0, null, 1));
        HashSet hashSetOooO0O0 = C22215OooOoo0.OooO0O0(map6, "created_at", new OooOOOO.OooO00o("created_at", "INTEGER", true, 0, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new OooOOOO.C24742OooO0Oo("index_NoteinAiQuotaRecordEntity_user_id", false, Arrays.asList("user_id"), Arrays.asList("ASC")));
        OooOOOO oooOOOO6 = new OooOOOO("NoteinAiQuotaRecordEntity", map6, hashSetOooO0O0, hashSet);
        OooOOOO oooOOOOOooO00o6 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "NoteinAiQuotaRecordEntity");
        if (!oooOOOO6.equals(oooOOOOOooO00o6)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteinAiQuotaRecordEntity(com.orion.notein.data.db.entity.NoteinAiQuotaRecordEntity).\n Expected:\n", oooOOOO6, "\n Found:\n", oooOOOOOooO00o6));
        }
        HashMap map7 = new HashMap(7);
        map7.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map7.put("user_id", new OooOOOO.OooO00o("user_id", "TEXT", true, 0, null, 1));
        map7.put("amount", new OooOOOO.OooO00o("amount", "INTEGER", true, 0, null, 1));
        map7.put("source_type", new OooOOOO.OooO00o("source_type", "TEXT", true, 0, null, 1));
        map7.put("link_purchase_token", new OooOOOO.OooO00o("link_purchase_token", "TEXT", true, 0, null, 1));
        map7.put("usage_metadata_json", new OooOOOO.OooO00o("usage_metadata_json", "TEXT", false, 0, null, 1));
        OooOOOO oooOOOO7 = new OooOOOO("NoteinAiQuotaRecordEntityV2", map7, C22215OooOoo0.OooO0O0(map7, "created_at", new OooOOOO.OooO00o("created_at", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o7 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "NoteinAiQuotaRecordEntityV2");
        return !oooOOOO7.equals(oooOOOOOooO00o7) ? new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteinAiQuotaRecordEntityV2(com.orion.notein.data.db.entity.NoteinAiQuotaRecordEntityV2).\n Expected:\n", oooOOOO7, "\n Found:\n", oooOOOOOooO00o7)) : new AbstractC24678OooOoO0.OooO00o(true, null);
    }
}
