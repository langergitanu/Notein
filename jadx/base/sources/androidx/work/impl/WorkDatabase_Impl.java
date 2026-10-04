package androidx.work.impl;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.room.OooO0OO;
import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.C22215OooOoo0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import o000oo0.C24656OooO0O0;
import o000oo0.C24679OooOoOO;
import o000ooOO.OooOOOO;
import o000oooO.InterfaceC24757OooO0OO;
import o000oooo.C24767OooO0o0;
import o00O0OoO.C24871OooO0OO;
import o00O0OoO.C24878OooOOo;
import o00O0OoO.C24890OooOooo;
import o00O0OoO.C24892Oooo00o;
import o00O0OoO.OooO0o;
import o00O0OoO.OooOO0;
import o00O0OoO.OooOOO0;
import o00O0OoO.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f66709OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile C24890OooOooo f66710OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public volatile C24871OooO0OO f66711OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public volatile C24892Oooo00o f66712OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public volatile OooOOO0 f66713OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public volatile OooOO0 f66714OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public volatile C24878OooOOo f66715OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public volatile OooO0o f66716OooOo00;

    public class OooO00o extends C24679OooOoOO.OooO00o {
        public OooO00o() {
        }

        public final void OooO00o(C24767OooO0o0 c24767OooO0o0) {
            c24767OooO0o0.oo0o0Oo("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c24767OooO0o0.oo0o0Oo("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            c24767OooO0o0.oo0o0Oo("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            c24767OooO0o0.oo0o0Oo("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            c24767OooO0o0.oo0o0Oo("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            c24767OooO0o0.oo0o0Oo("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            c24767OooO0o0.oo0o0Oo("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c24767OooO0o0.oo0o0Oo("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            c24767OooO0o0.oo0o0Oo("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c24767OooO0o0.oo0o0Oo("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c24767OooO0o0.oo0o0Oo("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            c24767OooO0o0.oo0o0Oo("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c24767OooO0o0.oo0o0Oo("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            c24767OooO0o0.oo0o0Oo("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c24767OooO0o0.oo0o0Oo("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        public final C24679OooOoOO.OooO0O0 OooO0O0(C24767OooO0o0 c24767OooO0o0) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new OooOOOO.OooO00o("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet hashSetOooO0O0 = C22215OooOoo0.OooO0O0(map, "prerequisite_id", new OooOOOO.OooO00o("prerequisite_id", "TEXT", true, 2, null, 1), 2);
            hashSetOooO0O0.add(new OooOOOO.OooO0OO("WorkSpec", "CASCADE", Arrays.asList("work_spec_id"), "CASCADE", Arrays.asList("id")));
            hashSetOooO0O0.add(new OooOOOO.OooO0OO("WorkSpec", "CASCADE", Arrays.asList("prerequisite_id"), "CASCADE", Arrays.asList("id")));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new OooOOOO.C24742OooO0Oo("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
            hashSet.add(new OooOOOO.C24742OooO0Oo("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
            OooOOOO oooOOOO = new OooOOOO("Dependency", map, hashSetOooO0O0, hashSet);
            OooOOOO oooOOOOOooO0O0 = OooOOOO.OooO0O0(c24767OooO0o0, "Dependency");
            if (!oooOOOO.equals(oooOOOOOooO0O0)) {
                return new C24679OooOoOO.OooO0O0(false, C22213OooOoOO.OooO0OO("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", oooOOOO, "\n Found:\n", oooOOOOOooO0O0));
            }
            HashMap map2 = new HashMap(25);
            map2.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
            map2.put("state", new OooOOOO.OooO00o("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new OooOOOO.OooO00o("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new OooOOOO.OooO00o("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new OooOOOO.OooO00o("input", "BLOB", true, 0, null, 1));
            map2.put("output", new OooOOOO.OooO00o("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new OooOOOO.OooO00o("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new OooOOOO.OooO00o("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new OooOOOO.OooO00o("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new OooOOOO.OooO00o("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new OooOOOO.OooO00o("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new OooOOOO.OooO00o("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new OooOOOO.OooO00o("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new OooOOOO.OooO00o("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new OooOOOO.OooO00o("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new OooOOOO.OooO00o("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new OooOOOO.OooO00o("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new OooOOOO.OooO00o("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new OooOOOO.OooO00o("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new OooOOOO.OooO00o("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new OooOOOO.OooO00o("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new OooOOOO.OooO00o("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new OooOOOO.OooO00o("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new OooOOOO.OooO00o("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO0O02 = C22215OooOoo0.OooO0O0(map2, "content_uri_triggers", new OooOOOO.OooO00o("content_uri_triggers", "BLOB", false, 0, null, 1), 0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new OooOOOO.C24742OooO0Oo("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
            hashSet2.add(new OooOOOO.C24742OooO0Oo("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
            OooOOOO oooOOOO2 = new OooOOOO("WorkSpec", map2, hashSetOooO0O02, hashSet2);
            OooOOOO oooOOOOOooO0O02 = OooOOOO.OooO0O0(c24767OooO0o0, "WorkSpec");
            if (!oooOOOO2.equals(oooOOOOOooO0O02)) {
                return new C24679OooOoOO.OooO0O0(false, C22213OooOoOO.OooO0OO("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", oooOOOO2, "\n Found:\n", oooOOOOOooO0O02));
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new OooOOOO.OooO00o("tag", "TEXT", true, 1, null, 1));
            HashSet hashSetOooO0O03 = C22215OooOoo0.OooO0O0(map3, "work_spec_id", new OooOOOO.OooO00o("work_spec_id", "TEXT", true, 2, null, 1), 1);
            hashSetOooO0O03.add(new OooOOOO.OooO0OO("WorkSpec", "CASCADE", Arrays.asList("work_spec_id"), "CASCADE", Arrays.asList("id")));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new OooOOOO.C24742OooO0Oo("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
            OooOOOO oooOOOO3 = new OooOOOO("WorkTag", map3, hashSetOooO0O03, hashSet3);
            OooOOOO oooOOOOOooO0O03 = OooOOOO.OooO0O0(c24767OooO0o0, "WorkTag");
            if (!oooOOOO3.equals(oooOOOOOooO0O03)) {
                return new C24679OooOoOO.OooO0O0(false, C22213OooOoOO.OooO0OO("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", oooOOOO3, "\n Found:\n", oooOOOOOooO0O03));
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new OooOOOO.OooO00o("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet hashSetOooO0O04 = C22215OooOoo0.OooO0O0(map4, "system_id", new OooOOOO.OooO00o("system_id", "INTEGER", true, 0, null, 1), 1);
            hashSetOooO0O04.add(new OooOOOO.OooO0OO("WorkSpec", "CASCADE", Arrays.asList("work_spec_id"), "CASCADE", Arrays.asList("id")));
            OooOOOO oooOOOO4 = new OooOOOO("SystemIdInfo", map4, hashSetOooO0O04, new HashSet(0));
            OooOOOO oooOOOOOooO0O04 = OooOOOO.OooO0O0(c24767OooO0o0, "SystemIdInfo");
            if (!oooOOOO4.equals(oooOOOOOooO0O04)) {
                return new C24679OooOoOO.OooO0O0(false, C22213OooOoOO.OooO0OO("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", oooOOOO4, "\n Found:\n", oooOOOOOooO0O04));
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new OooOOOO.OooO00o("name", "TEXT", true, 1, null, 1));
            HashSet hashSetOooO0O05 = C22215OooOoo0.OooO0O0(map5, "work_spec_id", new OooOOOO.OooO00o("work_spec_id", "TEXT", true, 2, null, 1), 1);
            hashSetOooO0O05.add(new OooOOOO.OooO0OO("WorkSpec", "CASCADE", Arrays.asList("work_spec_id"), "CASCADE", Arrays.asList("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new OooOOOO.C24742OooO0Oo("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
            OooOOOO oooOOOO5 = new OooOOOO("WorkName", map5, hashSetOooO0O05, hashSet4);
            OooOOOO oooOOOOOooO0O05 = OooOOOO.OooO0O0(c24767OooO0o0, "WorkName");
            if (!oooOOOO5.equals(oooOOOOOooO0O05)) {
                return new C24679OooOoOO.OooO0O0(false, C22213OooOoOO.OooO0OO("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", oooOOOO5, "\n Found:\n", oooOOOOOooO0O05));
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new OooOOOO.OooO00o("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet hashSetOooO0O06 = C22215OooOoo0.OooO0O0(map6, NotificationCompat.CATEGORY_PROGRESS, new OooOOOO.OooO00o(NotificationCompat.CATEGORY_PROGRESS, "BLOB", true, 0, null, 1), 1);
            hashSetOooO0O06.add(new OooOOOO.OooO0OO("WorkSpec", "CASCADE", Arrays.asList("work_spec_id"), "CASCADE", Arrays.asList("id")));
            OooOOOO oooOOOO6 = new OooOOOO("WorkProgress", map6, hashSetOooO0O06, new HashSet(0));
            OooOOOO oooOOOOOooO0O06 = OooOOOO.OooO0O0(c24767OooO0o0, "WorkProgress");
            if (!oooOOOO6.equals(oooOOOOOooO0O06)) {
                return new C24679OooOoOO.OooO0O0(false, C22213OooOoOO.OooO0OO("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", oooOOOO6, "\n Found:\n", oooOOOOOooO0O06));
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new OooOOOO.OooO00o("key", "TEXT", true, 1, null, 1));
            OooOOOO oooOOOO7 = new OooOOOO("Preference", map7, C22215OooOoo0.OooO0O0(map7, "long_value", new OooOOOO.OooO00o("long_value", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
            OooOOOO oooOOOOOooO0O07 = OooOOOO.OooO0O0(c24767OooO0o0, "Preference");
            return !oooOOOO7.equals(oooOOOOOooO0O07) ? new C24679OooOoOO.OooO0O0(false, C22213OooOoOO.OooO0OO("Preference(androidx.work.impl.model.Preference).\n Expected:\n", oooOOOO7, "\n Found:\n", oooOOOOOooO0O07)) : new C24679OooOoOO.OooO0O0(true, null);
        }
    }

    @Override // o000oo0.AbstractC24673OooOo0O
    public final OooO0OO OooO0o0() {
        return new OooO0OO(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // o000oo0.AbstractC24673OooOo0O
    public final InterfaceC24757OooO0OO OooO0oO(C24656OooO0O0 c24656OooO0O0) {
        C24679OooOoOO c24679OooOoOO = new C24679OooOoOO(c24656OooO0O0, new OooO00o());
        Context context = c24656OooO0O0.f83517OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        return c24656OooO0O0.f83519OooO0OO.OooO00o(new InterfaceC24757OooO0OO.OooO0O0(context, c24656OooO0O0.f83518OooO0O0, c24679OooOoOO, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final OooOOO0 OooOo() {
        OooOOO0 oooOOO0;
        if (this.f66713OooOOo != null) {
            return this.f66713OooOOo;
        }
        synchronized (this) {
            try {
                if (this.f66713OooOOo == null) {
                    this.f66713OooOOo = new OooOOO0(this);
                }
                oooOOO0 = this.f66713OooOOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oooOOO0;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C24871OooO0OO OooOo0() {
        C24871OooO0OO c24871OooO0OO;
        if (this.f66711OooOOOO != null) {
            return this.f66711OooOOOO;
        }
        synchronized (this) {
            try {
                if (this.f66711OooOOOO == null) {
                    this.f66711OooOOOO = new C24871OooO0OO(this);
                }
                c24871OooO0OO = this.f66711OooOOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c24871OooO0OO;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final OooO0o OooOo0O() {
        OooO0o oooO0o;
        if (this.f66716OooOo00 != null) {
            return this.f66716OooOo00;
        }
        synchronized (this) {
            try {
                if (this.f66716OooOo00 == null) {
                    this.f66716OooOo00 = new OooO0o(this);
                }
                oooO0o = this.f66716OooOo00;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oooO0o;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final OooOO0 OooOo0o() {
        OooOO0 oooOO02;
        if (this.f66714OooOOo0 != null) {
            return this.f66714OooOOo0;
        }
        synchronized (this) {
            try {
                if (this.f66714OooOOo0 == null) {
                    this.f66714OooOOo0 = new OooOO0(this);
                }
                oooOO02 = this.f66714OooOOo0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oooOO02;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final OooOo00 OooOoO() {
        C24890OooOooo c24890OooOooo;
        if (this.f66710OooOOO != null) {
            return this.f66710OooOOO;
        }
        synchronized (this) {
            try {
                if (this.f66710OooOOO == null) {
                    this.f66710OooOOO = new C24890OooOooo(this);
                }
                c24890OooOooo = this.f66710OooOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c24890OooOooo;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C24878OooOOo OooOoO0() {
        C24878OooOOo c24878OooOOo;
        if (this.f66715OooOOoo != null) {
            return this.f66715OooOOoo;
        }
        synchronized (this) {
            try {
                if (this.f66715OooOOoo == null) {
                    this.f66715OooOOoo = new C24878OooOOo(this);
                }
                c24878OooOOo = this.f66715OooOOoo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c24878OooOOo;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C24892Oooo00o OooOoOO() {
        C24892Oooo00o c24892Oooo00o;
        if (this.f66712OooOOOo != null) {
            return this.f66712OooOOOo;
        }
        synchronized (this) {
            try {
                if (this.f66712OooOOOo == null) {
                    this.f66712OooOOOo = new C24892Oooo00o(this);
                }
                c24892Oooo00o = this.f66712OooOOOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c24892Oooo00o;
    }
}
