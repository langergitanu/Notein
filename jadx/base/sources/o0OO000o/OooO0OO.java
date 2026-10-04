package o0OO000o;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.C22215OooOoo0;
import com.orion.notein.data.p602db.NoteCacheDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import o000oo0.AbstractC24678OooOoO0;
import o000ooOO.C24734OooO0O0;
import o000ooOO.OooOOOO;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0OO extends AbstractC24678OooOoO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NoteCacheDatabase_Impl f90894OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(NoteCacheDatabase_Impl noteCacheDatabase_Impl) {
        super(1, "ddc3aad2a8fd822f0bfa449ed9eeb511", "1a461ce5d09bd59f821ab11728782475");
        this.f90894OooO0Oo = noteCacheDatabase_Impl;
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO00o(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `HandWritingTextCacheEntity` (`page_id` TEXT NOT NULL, `page_grid_x` INTEGER NOT NULL, `page_grid_y` INTEGER NOT NULL, `trajectory_hash` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `text` TEXT NOT NULL, `elements_json` TEXT NOT NULL, PRIMARY KEY(`page_id`, `page_grid_x`, `page_grid_y`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `PageGridModificationRecordEntity` (`page_id` TEXT NOT NULL, `page_grid_x` INTEGER NOT NULL, `page_grid_y` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, PRIMARY KEY(`page_id`, `page_grid_x`, `page_grid_y`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `PdfTextCacheEntity` (`pdf_file_path` TEXT NOT NULL, `pdf_file_md5` TEXT NOT NULL, `pdf_page_index` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `text` TEXT NOT NULL, `elements_json` TEXT NOT NULL, PRIMARY KEY(`pdf_file_path`, `pdf_page_index`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ddc3aad2a8fd822f0bfa449ed9eeb511')");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0O0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `HandWritingTextCacheEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `PageGridModificationRecordEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `PdfTextCacheEntity`");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0OO(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0Oo(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        this.f90894OooO0Oo.OooOOo0(interfaceC24747OooO0O0);
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
        HashMap map = new HashMap(7);
        map.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 1, null, 1));
        map.put("page_grid_x", new OooOOOO.OooO00o("page_grid_x", "INTEGER", true, 2, null, 1));
        map.put("page_grid_y", new OooOOOO.OooO00o("page_grid_y", "INTEGER", true, 3, null, 1));
        map.put("trajectory_hash", new OooOOOO.OooO00o("trajectory_hash", "INTEGER", true, 0, null, 1));
        map.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map.put("text", new OooOOOO.OooO00o("text", "TEXT", true, 0, null, 1));
        OooOOOO oooOOOO = new OooOOOO("HandWritingTextCacheEntity", map, C22215OooOoo0.OooO0O0(map, "elements_json", new OooOOOO.OooO00o("elements_json", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "HandWritingTextCacheEntity");
        if (!oooOOOO.equals(oooOOOOOooO00o)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("HandWritingTextCacheEntity(com.orion.notein.data.db.entity.cache.HandWritingTextCacheEntity).\n Expected:\n", oooOOOO, "\n Found:\n", oooOOOOOooO00o));
        }
        HashMap map2 = new HashMap(4);
        map2.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 1, null, 1));
        map2.put("page_grid_x", new OooOOOO.OooO00o("page_grid_x", "INTEGER", true, 2, null, 1));
        map2.put("page_grid_y", new OooOOOO.OooO00o("page_grid_y", "INTEGER", true, 3, null, 1));
        OooOOOO oooOOOO2 = new OooOOOO("PageGridModificationRecordEntity", map2, C22215OooOoo0.OooO0O0(map2, "last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o2 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "PageGridModificationRecordEntity");
        if (!oooOOOO2.equals(oooOOOOOooO00o2)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("PageGridModificationRecordEntity(com.orion.notein.data.db.entity.cache.PageGridModificationRecordEntity).\n Expected:\n", oooOOOO2, "\n Found:\n", oooOOOOOooO00o2));
        }
        HashMap map3 = new HashMap(6);
        map3.put("pdf_file_path", new OooOOOO.OooO00o("pdf_file_path", "TEXT", true, 1, null, 1));
        map3.put("pdf_file_md5", new OooOOOO.OooO00o("pdf_file_md5", "TEXT", true, 0, null, 1));
        map3.put("pdf_page_index", new OooOOOO.OooO00o("pdf_page_index", "INTEGER", true, 2, null, 1));
        map3.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map3.put("text", new OooOOOO.OooO00o("text", "TEXT", true, 0, null, 1));
        OooOOOO oooOOOO3 = new OooOOOO("PdfTextCacheEntity", map3, C22215OooOoo0.OooO0O0(map3, "elements_json", new OooOOOO.OooO00o("elements_json", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o3 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "PdfTextCacheEntity");
        return !oooOOOO3.equals(oooOOOOOooO00o3) ? new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("PdfTextCacheEntity(com.orion.notein.data.db.entity.cache.PdfTextCacheEntity).\n Expected:\n", oooOOOO3, "\n Found:\n", oooOOOOOooO00o3)) : new AbstractC24678OooOoO0.OooO00o(true, null);
    }
}
