package androidx.work.impl.workers;

import OoooooO.C21445Oooo;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.OooO0O0;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import o000oo0.C24681OooOoo0;
import o000ooOO.C24733OooO00o;
import o000ooOO.C24734OooO0O0;
import o00O0O0o.OooO0OO;
import o00O0O0o.OooOO0O;
import o00O0OoO.C24874OooO0oO;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24890OooOooo;
import o00O0OoO.C24892Oooo00o;
import o00O0OoO.OooOO0;
import o00O0OoO.OooOOO0;
import o00O0OoO.OooOo00;
import o00O0OoO.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final String f66748OooOoo = OooOO0O.OooO0o0("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String OooO(OooOOO0 oooOOO0, C24892Oooo00o c24892Oooo00o, OooOO0 oooOO02, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24880OooOOoo c24880OooOOoo = (C24880OooOOoo) it.next();
            C24874OooO0oO c24874OooO0oOOooO00o = oooOO02.OooO00o(c24880OooOOoo.f84457OooO00o);
            Integer numValueOf = c24874OooO0oOOooO00o != null ? Integer.valueOf(c24874OooO0oOOooO00o.f84443OooO0O0) : null;
            String str = c24880OooOOoo.f84457OooO00o;
            oooOOO0.getClass();
            C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                c24681OooOoo0OooOOO0.OooO0oO(1);
            } else {
                c24681OooOoo0OooOOO0.OoooOO0(1, str);
            }
            WorkDatabase_Impl workDatabase_Impl = oooOOO0.f84449OooO00o;
            workDatabase_Impl.OooO0O0();
            Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
            try {
                ArrayList arrayList2 = new ArrayList(cursorOooO.getCount());
                while (cursorOooO.moveToNext()) {
                    arrayList2.add(cursorOooO.getString(0));
                }
                cursorOooO.close();
                c24681OooOoo0OooOOO0.release();
                ArrayList arrayListOooO00o = c24892Oooo00o.OooO00o(c24880OooOOoo.f84457OooO00o);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListOooO00o);
                String str2 = c24880OooOOoo.f84457OooO00o;
                String str3 = c24880OooOOoo.f84459OooO0OO;
                String strName = c24880OooOOoo.f84458OooO0O0.name();
                StringBuilder sbOooO0O0 = OooO0o.OooO0O0(IOUtils.LINE_SEPARATOR_UNIX, str2, "\t ", str3, "\t ");
                sbOooO0O0.append(numValueOf);
                sbOooO0O0.append("\t ");
                sbOooO0O0.append(strName);
                sbOooO0O0.append("\t ");
                sb.append(C21445Oooo.OooO0O0(sbOooO0O0, strJoin, "\t ", strJoin2, "\t"));
            } catch (Throwable th) {
                cursorOooO.close();
                c24681OooOoo0OooOOO0.release();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.OooO00o.OooO0OO OooO0oo() throws Throwable {
        C24681OooOoo0 c24681OooOoo0;
        OooOO0 oooOO02;
        OooOOO0 oooOOO0;
        C24892Oooo00o c24892Oooo00o;
        int i;
        WorkDatabase workDatabase = o00O0OO0.OooOO0O.OoooooO(this.f66669OooOo0o).f84362OooO0OO;
        OooOo00 oooOo00OooOoO = workDatabase.OooOoO();
        OooOOO0 oooOOO0OooOo = workDatabase.OooOo();
        C24892Oooo00o c24892Oooo00oOooOoOO = workDatabase.OooOoOO();
        OooOO0 oooOO0OooOo0o = workDatabase.OooOo0o();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        C24890OooOooo c24890OooOooo = (C24890OooOooo) oooOo00OooOoO;
        c24890OooOooo.getClass();
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        c24681OooOoo0OooOOO0.OooO0o(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = c24890OooOooo.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            int iOooO0O0 = C24733OooO00o.OooO0O0("required_network_type", cursorOooO);
            int iOooO0O02 = C24733OooO00o.OooO0O0("requires_charging", cursorOooO);
            int iOooO0O03 = C24733OooO00o.OooO0O0("requires_device_idle", cursorOooO);
            int iOooO0O04 = C24733OooO00o.OooO0O0("requires_battery_not_low", cursorOooO);
            int iOooO0O05 = C24733OooO00o.OooO0O0("requires_storage_not_low", cursorOooO);
            int iOooO0O06 = C24733OooO00o.OooO0O0("trigger_content_update_delay", cursorOooO);
            int iOooO0O07 = C24733OooO00o.OooO0O0("trigger_max_content_delay", cursorOooO);
            int iOooO0O08 = C24733OooO00o.OooO0O0("content_uri_triggers", cursorOooO);
            int iOooO0O09 = C24733OooO00o.OooO0O0("id", cursorOooO);
            int iOooO0O010 = C24733OooO00o.OooO0O0("state", cursorOooO);
            int iOooO0O011 = C24733OooO00o.OooO0O0("worker_class_name", cursorOooO);
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
            try {
                int iOooO0O012 = C24733OooO00o.OooO0O0("input_merger_class_name", cursorOooO);
                int iOooO0O013 = C24733OooO00o.OooO0O0("input", cursorOooO);
                int iOooO0O014 = C24733OooO00o.OooO0O0("output", cursorOooO);
                int iOooO0O015 = C24733OooO00o.OooO0O0("initial_delay", cursorOooO);
                int iOooO0O016 = C24733OooO00o.OooO0O0("interval_duration", cursorOooO);
                int iOooO0O017 = C24733OooO00o.OooO0O0("flex_duration", cursorOooO);
                int iOooO0O018 = C24733OooO00o.OooO0O0("run_attempt_count", cursorOooO);
                int iOooO0O019 = C24733OooO00o.OooO0O0("backoff_policy", cursorOooO);
                int iOooO0O020 = C24733OooO00o.OooO0O0("backoff_delay_duration", cursorOooO);
                int iOooO0O021 = C24733OooO00o.OooO0O0("period_start_time", cursorOooO);
                int iOooO0O022 = C24733OooO00o.OooO0O0("minimum_retention_duration", cursorOooO);
                int iOooO0O023 = C24733OooO00o.OooO0O0("schedule_requested_at", cursorOooO);
                int iOooO0O024 = C24733OooO00o.OooO0O0("run_in_foreground", cursorOooO);
                int iOooO0O025 = C24733OooO00o.OooO0O0("out_of_quota_policy", cursorOooO);
                int i2 = iOooO0O014;
                ArrayList arrayList = new ArrayList(cursorOooO.getCount());
                while (cursorOooO.moveToNext()) {
                    String string = cursorOooO.getString(iOooO0O09);
                    int i3 = iOooO0O09;
                    String string2 = cursorOooO.getString(iOooO0O011);
                    int i4 = iOooO0O011;
                    OooO0OO oooO0OO = new OooO0OO();
                    int i5 = iOooO0O0;
                    oooO0OO.f84232OooO00o = Oooo0.OooO0OO(cursorOooO.getInt(iOooO0O0));
                    oooO0OO.f84233OooO0O0 = cursorOooO.getInt(iOooO0O02) != 0;
                    oooO0OO.f84234OooO0OO = cursorOooO.getInt(iOooO0O03) != 0;
                    oooO0OO.f84235OooO0Oo = cursorOooO.getInt(iOooO0O04) != 0;
                    oooO0OO.f84237OooO0o0 = cursorOooO.getInt(iOooO0O05) != 0;
                    int i6 = iOooO0O02;
                    oooO0OO.f84236OooO0o = cursorOooO.getLong(iOooO0O06);
                    oooO0OO.f84238OooO0oO = cursorOooO.getLong(iOooO0O07);
                    oooO0OO.f84239OooO0oo = Oooo0.OooO00o(cursorOooO.getBlob(iOooO0O08));
                    C24880OooOOoo c24880OooOOoo = new C24880OooOOoo(string, string2);
                    c24880OooOOoo.f84458OooO0O0 = Oooo0.OooO0o0(cursorOooO.getInt(iOooO0O010));
                    c24880OooOOoo.f84460OooO0Oo = cursorOooO.getString(iOooO0O012);
                    c24880OooOOoo.f84462OooO0o0 = OooO0O0.OooO00o(cursorOooO.getBlob(iOooO0O013));
                    int i7 = i2;
                    c24880OooOOoo.f84461OooO0o = OooO0O0.OooO00o(cursorOooO.getBlob(i7));
                    int i8 = iOooO0O010;
                    int i9 = iOooO0O015;
                    int i10 = iOooO0O013;
                    c24880OooOOoo.f84463OooO0oO = cursorOooO.getLong(i9);
                    int i11 = iOooO0O012;
                    int i12 = iOooO0O016;
                    c24880OooOOoo.f84464OooO0oo = cursorOooO.getLong(i12);
                    int i13 = iOooO0O017;
                    c24880OooOOoo.f84456OooO = cursorOooO.getLong(i13);
                    int i14 = iOooO0O018;
                    c24880OooOOoo.f84466OooOO0O = cursorOooO.getInt(i14);
                    int i15 = iOooO0O019;
                    c24880OooOOoo.f84467OooOO0o = Oooo0.OooO0O0(cursorOooO.getInt(i15));
                    int i16 = iOooO0O020;
                    c24880OooOOoo.f84469OooOOO0 = cursorOooO.getLong(i16);
                    int i17 = iOooO0O021;
                    c24880OooOOoo.f84468OooOOO = cursorOooO.getLong(i17);
                    int i18 = iOooO0O022;
                    c24880OooOOoo.f84470OooOOOO = cursorOooO.getLong(i18);
                    int i19 = iOooO0O023;
                    c24880OooOOoo.f84471OooOOOo = cursorOooO.getLong(i19);
                    int i20 = iOooO0O024;
                    c24880OooOOoo.f84473OooOOo0 = cursorOooO.getInt(i20) != 0;
                    int i21 = iOooO0O025;
                    c24880OooOOoo.f84472OooOOo = Oooo0.OooO0Oo(cursorOooO.getInt(i21));
                    c24880OooOOoo.f84465OooOO0 = oooO0OO;
                    arrayList.add(c24880OooOOoo);
                    iOooO0O022 = i18;
                    iOooO0O012 = i11;
                    iOooO0O017 = i13;
                    iOooO0O018 = i14;
                    iOooO0O019 = i15;
                    i2 = i7;
                    iOooO0O013 = i10;
                    iOooO0O015 = i9;
                    iOooO0O016 = i12;
                    iOooO0O020 = i16;
                    iOooO0O021 = i17;
                    iOooO0O024 = i20;
                    iOooO0O011 = i4;
                    iOooO0O0 = i5;
                    iOooO0O025 = i21;
                    iOooO0O023 = i19;
                    iOooO0O010 = i8;
                    iOooO0O09 = i3;
                    iOooO0O02 = i6;
                }
                cursorOooO.close();
                c24681OooOoo0.release();
                ArrayList arrayListOooO0o = c24890OooOooo.OooO0o();
                ArrayList arrayListOooO0Oo = c24890OooOooo.OooO0Oo();
                boolean zIsEmpty = arrayList.isEmpty();
                String str = f66748OooOoo;
                if (zIsEmpty) {
                    oooOO02 = oooOO0OooOo0o;
                    oooOOO0 = oooOOO0OooOo;
                    c24892Oooo00o = c24892Oooo00oOooOoOO;
                    i = 0;
                } else {
                    i = 0;
                    OooOO0O.OooO0OO().OooO0Oo(str, "Recently completed work:\n\n", new Throwable[0]);
                    oooOO02 = oooOO0OooOo0o;
                    oooOOO0 = oooOOO0OooOo;
                    c24892Oooo00o = c24892Oooo00oOooOoOO;
                    OooOO0O.OooO0OO().OooO0Oo(str, OooO(oooOOO0, c24892Oooo00o, oooOO02, arrayList), new Throwable[0]);
                }
                if (!arrayListOooO0o.isEmpty()) {
                    OooOO0O.OooO0OO().OooO0Oo(str, "Running work:\n\n", new Throwable[i]);
                    OooOO0O.OooO0OO().OooO0Oo(str, OooO(oooOOO0, c24892Oooo00o, oooOO02, arrayListOooO0o), new Throwable[i]);
                }
                if (!arrayListOooO0Oo.isEmpty()) {
                    OooOO0O.OooO0OO().OooO0Oo(str, "Enqueued work:\n\n", new Throwable[i]);
                    OooOO0O.OooO0OO().OooO0Oo(str, OooO(oooOOO0, c24892Oooo00o, oooOO02, arrayListOooO0Oo), new Throwable[i]);
                }
                return new ListenableWorker.OooO00o.OooO0OO();
            } catch (Throwable th) {
                th = th;
                cursorOooO.close();
                c24681OooOoo0.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
        }
    }
}
