package o0OOOoo0;

import com.aspose.slides.C22208OooOo0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27263OooooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f95060OooO00o = new OooO00o(1, 2);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0O0 f95061OooO0O0 = new OooO0O0(2, 3);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0OO f95062OooO0OO = new OooO0OO(3, 4);

    /* JADX INFO: renamed from: o0OOOoo0.OooooOo$OooO00o */
    public static final class OooO00o extends AbstractC24732OooO00o {
        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 database) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
            database.oo0o0Oo("CREATE TABLE IF NOT EXISTS `NoteAiContentEntity` (`id` TEXT NOT NULL, `summary_list` TEXT, `saved_summary_index` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL,`last_modification_time` INTEGER NOT NULL,PRIMARY KEY(`id`))");
        }
    }

    /* JADX INFO: renamed from: o0OOOoo0.OooooOo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC24732OooO00o {
        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
            C22208OooOo0.OooO0O0(interfaceC24756OooO0O0, "database", "CREATE TABLE IF NOT EXISTS `AiOcrSessionEntity` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `title` TEXT NOT NULL, `page_ids` TEXT NOT NULL, `input_source_json` TEXT, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `AiOcrTextPageEntity` (`id` TEXT NOT NULL, `source_type` INTEGER NOT NULL, `source_uri` TEXT NOT NULL, `content` TEXT NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `extras` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `NoteinAiQuotaRecordEntity` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `amount` INTEGER NOT NULL, `source_type` TEXT NOT NULL, `link_purchase_token` TEXT NOT NULL, `usage_metadata_json` TEXT, `created_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            interfaceC24756OooO0O0.oo0o0Oo("CREATE INDEX IF NOT EXISTS `index_NoteinAiQuotaRecordEntity_user_id` ON `NoteinAiQuotaRecordEntity` (`user_id`)");
        }
    }

    /* JADX INFO: renamed from: o0OOOoo0.OooooOo$OooO0OO */
    public static final class OooO0OO extends AbstractC24732OooO00o {
        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 database) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
            database.oo0o0Oo("CREATE TABLE IF NOT EXISTS `NoteinAiQuotaRecordEntityV2` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `amount` INTEGER NOT NULL, `source_type` TEXT NOT NULL, `link_purchase_token` TEXT NOT NULL, `usage_metadata_json` TEXT, `created_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    }
}
