package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C19048OooO00o f66698OooO00o = new C19048OooO00o(1, 2);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0O0 f66699OooO0O0 = new OooO0O0(3, 4);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0OO f66700OooO0OO = new OooO0OO(4, 5);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C22135OooO0Oo f66701OooO0Oo = new C22135OooO0Oo(6, 7);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C22136OooO0o0 f66703OooO0o0 = new C22136OooO0o0(7, 8);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO0o f66702OooO0o = new OooO0o(8, 9);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C22137OooO0oO f66704OooO0oO = new C22137OooO0oO(11, 12);

    public static class OooO extends AbstractC24732OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Context f66705OooO0OO;

        public OooO(Context context) {
            super(9, 10);
            this.f66705OooO0OO = context;
        }

        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
            interfaceC24756OooO0O0.oo0o0Oo("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Context context = this.f66705OooO0OO;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                interfaceC24756OooO0O0.OooOOo();
                try {
                    interfaceC24756OooO0O0.o0000oOO(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                    interfaceC24756OooO0O0.o0000oOO(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                    sharedPreferences.edit().clear().apply();
                    interfaceC24756OooO0O0.o00000O0();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                interfaceC24756OooO0O0.OooOOo();
                try {
                    interfaceC24756OooO0O0.o0000oOO(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    interfaceC24756OooO0O0.o0000oOO(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    interfaceC24756OooO0O0.o00000O0();
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19048OooO00o extends AbstractC24732OooO00o {
        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
            interfaceC24756OooO0O0.oo0o0Oo("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC24756OooO0O0.oo0o0Oo("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            interfaceC24756OooO0O0.oo0o0Oo("DROP TABLE IF EXISTS alarmInfo");
            interfaceC24756OooO0O0.oo0o0Oo("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    public class OooO0O0 extends AbstractC24732OooO00o {
        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
            interfaceC24756OooO0O0.oo0o0Oo("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    public class OooO0OO extends AbstractC24732OooO00o {
        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
            interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public class C22135OooO0Oo extends AbstractC24732OooO00o {
        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
            interfaceC24756OooO0O0.oo0o0Oo("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    public class OooO0o extends AbstractC24732OooO00o {
        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
            interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public class C22136OooO0o0 extends AbstractC24732OooO00o {
        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
            interfaceC24756OooO0O0.oo0o0Oo("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.OooO00o$OooO0oO, reason: case insensitive filesystem */
    public class C22137OooO0oO extends AbstractC24732OooO00o {
        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
            interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.OooO00o$OooO0oo, reason: case insensitive filesystem */
    public static class C22138OooO0oo extends AbstractC24732OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Context f66706OooO0OO;

        public C22138OooO0oo(Context context, int i, int i2) {
            super(i, i2);
            this.f66706OooO0OO = context;
        }

        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
            if (this.f83865OooO0O0 >= 10) {
                interfaceC24756OooO0O0.o0000oOO(new Object[]{"reschedule_needed", 1});
            } else {
                this.f66706OooO0OO.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }
}
