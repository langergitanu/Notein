package o00O0OoO;

import OooOo.AbstractC20474OooO0o0;
import OooOo.OooO00o;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.aspose.slides.C22218Oooo;
import java.util.ArrayList;
import java.util.Iterator;
import o000oo0.C24681OooOoo0;
import o000ooOO.C24733OooO00o;
import o000ooOO.C24734OooO0O0;
import o000oooO.InterfaceC24759OooO0o;
import o00O0O0o.C24841OooOOo0;
import o00O0OoO.C24880OooOOoo;
import o00OOooo.C25022OooO0O0;

/* JADX INFO: renamed from: o00O0OoO.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24890OooOooo implements OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C24887OooOoo f84484OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WorkDatabase_Impl f84485OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24882OooOo0O f84486OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24883OooOo0o f84487OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo f84488OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C24884OooOoO f84489OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C24885OooOoO0 f84490OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C24886OooOoOO f84491OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C24888OooOoo0 f84492OooO0oo;

    public C24890OooOooo(WorkDatabase_Impl workDatabase_Impl) {
        this.f84485OooO00o = workDatabase_Impl;
        this.f84486OooO0O0 = new C24882OooOo0O(workDatabase_Impl);
        this.f84487OooO0OO = new C24883OooOo0o(workDatabase_Impl);
        this.f84488OooO0Oo = new OooOo(workDatabase_Impl);
        this.f84490OooO0o0 = new C24885OooOoO0(workDatabase_Impl);
        this.f84489OooO0o = new C24884OooOoO(workDatabase_Impl);
        this.f84491OooO0oO = new C24886OooOoOO(workDatabase_Impl);
        this.f84492OooO0oo = new C24888OooOoo0(workDatabase_Impl);
        this.f84484OooO = new C24887OooOoo(workDatabase_Impl);
        new C24889OooOooO(workDatabase_Impl);
    }

    public final ArrayList OooO(String str) {
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c24681OooOoo0OooOOO0.OooO0oO(1);
        } else {
            c24681OooOoo0OooOOO0.OoooOO0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO.getCount());
            while (cursorOooO.moveToNext()) {
                arrayList.add(cursorOooO.getString(0));
            }
            return arrayList;
        } finally {
            cursorOooO.close();
            c24681OooOoo0OooOOO0.release();
        }
    }

    public final void OooO00o(OooOo.OooO00o<String, ArrayList<androidx.work.OooO0O0>> oooO00o) {
        ArrayList<androidx.work.OooO0O0> arrayList;
        OooO00o.OooO0OO oooO0OO = (OooO00o.OooO0OO) oooO00o.keySet();
        OooOo.OooO00o oooO00o2 = OooOo.OooO00o.this;
        if (oooO00o2.isEmpty()) {
            return;
        }
        if (oooO00o.f58550OooOoO0 > 999) {
            OooOo.OooO00o<String, ArrayList<androidx.work.OooO0O0>> oooO00o3 = new OooOo.OooO00o<>(999);
            int i = oooO00o.f58550OooOoO0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                oooO00o3.put(oooO00o.OooO0oO(i2), oooO00o.OooOO0O(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    OooO00o(oooO00o3);
                    oooO00o3 = new OooOo.OooO00o<>(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                OooO00o(oooO00o3);
                return;
            }
            return;
        }
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i4 = oooO00o2.f58550OooOoO0;
        C25022OooO0O0.OooO0OO(i4, sbOooO0OO);
        sbOooO0OO.append(")");
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(i4, sbOooO0OO.toString());
        Iterator it = oooO0OO.iterator();
        int i5 = 1;
        while (true) {
            AbstractC20474OooO0o0 abstractC20474OooO0o0 = (AbstractC20474OooO0o0) it;
            if (!abstractC20474OooO0o0.hasNext()) {
                break;
            }
            String str = (String) abstractC20474OooO0o0.next();
            if (str == null) {
                c24681OooOoo0OooOOO0.OooO0oO(i5);
            } else {
                c24681OooOoo0OooOOO0.OoooOO0(i5, str);
            }
            i5++;
        }
        Cursor cursorOooO = C24734OooO0O0.OooO(this.f84485OooO00o, c24681OooOoo0OooOOO0, false);
        try {
            int iOooO00o = C24733OooO00o.OooO00o("work_spec_id", cursorOooO);
            if (iOooO00o == -1) {
                return;
            }
            while (cursorOooO.moveToNext()) {
                if (!cursorOooO.isNull(iOooO00o) && (arrayList = oooO00o.get(cursorOooO.getString(iOooO00o))) != null) {
                    arrayList.add(androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(0)));
                }
            }
        } finally {
            cursorOooO.close();
        }
    }

    public final void OooO0O0(OooOo.OooO00o<String, ArrayList<String>> oooO00o) {
        ArrayList<String> arrayList;
        OooO00o.OooO0OO oooO0OO = (OooO00o.OooO0OO) oooO00o.keySet();
        OooOo.OooO00o oooO00o2 = OooOo.OooO00o.this;
        if (oooO00o2.isEmpty()) {
            return;
        }
        if (oooO00o.f58550OooOoO0 > 999) {
            OooOo.OooO00o<String, ArrayList<String>> oooO00o3 = new OooOo.OooO00o<>(999);
            int i = oooO00o.f58550OooOoO0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                oooO00o3.put(oooO00o.OooO0oO(i2), oooO00o.OooOO0O(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    OooO0O0(oooO00o3);
                    oooO00o3 = new OooOo.OooO00o<>(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                OooO0O0(oooO00o3);
                return;
            }
            return;
        }
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i4 = oooO00o2.f58550OooOoO0;
        C25022OooO0O0.OooO0OO(i4, sbOooO0OO);
        sbOooO0OO.append(")");
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(i4, sbOooO0OO.toString());
        Iterator it = oooO0OO.iterator();
        int i5 = 1;
        while (true) {
            AbstractC20474OooO0o0 abstractC20474OooO0o0 = (AbstractC20474OooO0o0) it;
            if (!abstractC20474OooO0o0.hasNext()) {
                break;
            }
            String str = (String) abstractC20474OooO0o0.next();
            if (str == null) {
                c24681OooOoo0OooOOO0.OooO0oO(i5);
            } else {
                c24681OooOoo0OooOOO0.OoooOO0(i5, str);
            }
            i5++;
        }
        Cursor cursorOooO = C24734OooO0O0.OooO(this.f84485OooO00o, c24681OooOoo0OooOOO0, false);
        try {
            int iOooO00o = C24733OooO00o.OooO00o("work_spec_id", cursorOooO);
            if (iOooO00o == -1) {
                return;
            }
            while (cursorOooO.moveToNext()) {
                if (!cursorOooO.isNull(iOooO00o) && (arrayList = oooO00o.get(cursorOooO.getString(iOooO00o))) != null) {
                    arrayList.add(cursorOooO.getString(0));
                }
            }
        } finally {
            cursorOooO.close();
        }
    }

    public final void OooO0OO(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        C24883OooOo0o c24883OooOo0o = this.f84487OooO0OO;
        InterfaceC24759OooO0o interfaceC24759OooO0oOooO0oo = c24883OooOo0o.OooO0oo();
        if (str == null) {
            interfaceC24759OooO0oOooO0oo.OooO0oO(1);
        } else {
            interfaceC24759OooO0oOooO0oo.OoooOO0(1, str);
        }
        workDatabase_Impl.OooO0OO();
        try {
            interfaceC24759OooO0oOooO0oo.OooOo0();
            workDatabase_Impl.OooOOoo();
        } finally {
            workDatabase_Impl.OooOOOo();
            c24883OooOo0o.OooOO0o(interfaceC24759OooO0oOooO0oo);
        }
    }

    public final ArrayList OooO0Oo() throws Throwable {
        C24681OooOoo0 c24681OooOoo0;
        int iOooO0O0;
        int iOooO0O02;
        int iOooO0O03;
        int iOooO0O04;
        int iOooO0O05;
        int iOooO0O06;
        int iOooO0O07;
        int iOooO0O08;
        int iOooO0O09;
        int iOooO0O010;
        int iOooO0O011;
        int iOooO0O012;
        int iOooO0O013;
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        c24681OooOoo0OooOOO0.OooO0o(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            iOooO0O0 = C24733OooO00o.OooO0O0("required_network_type", cursorOooO);
            iOooO0O02 = C24733OooO00o.OooO0O0("requires_charging", cursorOooO);
            iOooO0O03 = C24733OooO00o.OooO0O0("requires_device_idle", cursorOooO);
            iOooO0O04 = C24733OooO00o.OooO0O0("requires_battery_not_low", cursorOooO);
            iOooO0O05 = C24733OooO00o.OooO0O0("requires_storage_not_low", cursorOooO);
            iOooO0O06 = C24733OooO00o.OooO0O0("trigger_content_update_delay", cursorOooO);
            iOooO0O07 = C24733OooO00o.OooO0O0("trigger_max_content_delay", cursorOooO);
            iOooO0O08 = C24733OooO00o.OooO0O0("content_uri_triggers", cursorOooO);
            iOooO0O09 = C24733OooO00o.OooO0O0("id", cursorOooO);
            iOooO0O010 = C24733OooO00o.OooO0O0("state", cursorOooO);
            iOooO0O011 = C24733OooO00o.OooO0O0("worker_class_name", cursorOooO);
            iOooO0O012 = C24733OooO00o.OooO0O0("input_merger_class_name", cursorOooO);
            iOooO0O013 = C24733OooO00o.OooO0O0("input", cursorOooO);
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
        } catch (Throwable th) {
            th = th;
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
        }
        try {
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
            int i = iOooO0O014;
            ArrayList arrayList = new ArrayList(cursorOooO.getCount());
            while (cursorOooO.moveToNext()) {
                String string = cursorOooO.getString(iOooO0O09);
                int i2 = iOooO0O09;
                String string2 = cursorOooO.getString(iOooO0O011);
                int i3 = iOooO0O011;
                o00O0O0o.OooO0OO oooO0OO = new o00O0O0o.OooO0OO();
                int i4 = iOooO0O0;
                oooO0OO.f84232OooO00o = Oooo0.OooO0OO(cursorOooO.getInt(iOooO0O0));
                oooO0OO.f84233OooO0O0 = cursorOooO.getInt(iOooO0O02) != 0;
                oooO0OO.f84234OooO0OO = cursorOooO.getInt(iOooO0O03) != 0;
                oooO0OO.f84235OooO0Oo = cursorOooO.getInt(iOooO0O04) != 0;
                oooO0OO.f84237OooO0o0 = cursorOooO.getInt(iOooO0O05) != 0;
                int i5 = iOooO0O02;
                int i6 = iOooO0O03;
                oooO0OO.f84236OooO0o = cursorOooO.getLong(iOooO0O06);
                oooO0OO.f84238OooO0oO = cursorOooO.getLong(iOooO0O07);
                oooO0OO.f84239OooO0oo = Oooo0.OooO00o(cursorOooO.getBlob(iOooO0O08));
                C24880OooOOoo c24880OooOOoo = new C24880OooOOoo(string, string2);
                c24880OooOOoo.f84458OooO0O0 = Oooo0.OooO0o0(cursorOooO.getInt(iOooO0O010));
                c24880OooOOoo.f84460OooO0Oo = cursorOooO.getString(iOooO0O012);
                c24880OooOOoo.f84462OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(iOooO0O013));
                int i7 = i;
                c24880OooOOoo.f84461OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(i7));
                int i8 = iOooO0O012;
                int i9 = iOooO0O015;
                c24880OooOOoo.f84463OooO0oO = cursorOooO.getLong(i9);
                i = i7;
                int i10 = iOooO0O016;
                c24880OooOOoo.f84464OooO0oo = cursorOooO.getLong(i10);
                int i11 = iOooO0O04;
                int i12 = iOooO0O017;
                c24880OooOOoo.f84456OooO = cursorOooO.getLong(i12);
                int i13 = iOooO0O018;
                c24880OooOOoo.f84466OooOO0O = cursorOooO.getInt(i13);
                int i14 = iOooO0O019;
                c24880OooOOoo.f84467OooOO0o = Oooo0.OooO0O0(cursorOooO.getInt(i14));
                iOooO0O017 = i12;
                int i15 = iOooO0O020;
                c24880OooOOoo.f84469OooOOO0 = cursorOooO.getLong(i15);
                int i16 = iOooO0O021;
                c24880OooOOoo.f84468OooOOO = cursorOooO.getLong(i16);
                iOooO0O021 = i16;
                int i17 = iOooO0O022;
                c24880OooOOoo.f84470OooOOOO = cursorOooO.getLong(i17);
                int i18 = iOooO0O023;
                c24880OooOOoo.f84471OooOOOo = cursorOooO.getLong(i18);
                int i19 = iOooO0O024;
                c24880OooOOoo.f84473OooOOo0 = cursorOooO.getInt(i19) != 0;
                int i20 = iOooO0O025;
                c24880OooOOoo.f84472OooOOo = Oooo0.OooO0Oo(cursorOooO.getInt(i20));
                c24880OooOOoo.f84465OooOO0 = oooO0OO;
                arrayList.add(c24880OooOOoo);
                iOooO0O020 = i15;
                iOooO0O04 = i11;
                iOooO0O019 = i14;
                iOooO0O025 = i20;
                iOooO0O02 = i5;
                iOooO0O015 = i9;
                iOooO0O016 = i10;
                iOooO0O018 = i13;
                iOooO0O023 = i18;
                iOooO0O011 = i3;
                iOooO0O0 = i4;
                iOooO0O024 = i19;
                iOooO0O022 = i17;
                iOooO0O012 = i8;
                iOooO0O09 = i2;
                iOooO0O03 = i6;
            }
            cursorOooO.close();
            c24681OooOoo0.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorOooO.close();
            c24681OooOoo0.release();
            throw th;
        }
    }

    public final ArrayList OooO0o() throws Throwable {
        C24681OooOoo0 c24681OooOoo0;
        int iOooO0O0;
        int iOooO0O02;
        int iOooO0O03;
        int iOooO0O04;
        int iOooO0O05;
        int iOooO0O06;
        int iOooO0O07;
        int iOooO0O08;
        int iOooO0O09;
        int iOooO0O010;
        int iOooO0O011;
        int iOooO0O012;
        int iOooO0O013;
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            iOooO0O0 = C24733OooO00o.OooO0O0("required_network_type", cursorOooO);
            iOooO0O02 = C24733OooO00o.OooO0O0("requires_charging", cursorOooO);
            iOooO0O03 = C24733OooO00o.OooO0O0("requires_device_idle", cursorOooO);
            iOooO0O04 = C24733OooO00o.OooO0O0("requires_battery_not_low", cursorOooO);
            iOooO0O05 = C24733OooO00o.OooO0O0("requires_storage_not_low", cursorOooO);
            iOooO0O06 = C24733OooO00o.OooO0O0("trigger_content_update_delay", cursorOooO);
            iOooO0O07 = C24733OooO00o.OooO0O0("trigger_max_content_delay", cursorOooO);
            iOooO0O08 = C24733OooO00o.OooO0O0("content_uri_triggers", cursorOooO);
            iOooO0O09 = C24733OooO00o.OooO0O0("id", cursorOooO);
            iOooO0O010 = C24733OooO00o.OooO0O0("state", cursorOooO);
            iOooO0O011 = C24733OooO00o.OooO0O0("worker_class_name", cursorOooO);
            iOooO0O012 = C24733OooO00o.OooO0O0("input_merger_class_name", cursorOooO);
            iOooO0O013 = C24733OooO00o.OooO0O0("input", cursorOooO);
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
        } catch (Throwable th) {
            th = th;
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
        }
        try {
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
            int i = iOooO0O014;
            ArrayList arrayList = new ArrayList(cursorOooO.getCount());
            while (cursorOooO.moveToNext()) {
                String string = cursorOooO.getString(iOooO0O09);
                int i2 = iOooO0O09;
                String string2 = cursorOooO.getString(iOooO0O011);
                int i3 = iOooO0O011;
                o00O0O0o.OooO0OO oooO0OO = new o00O0O0o.OooO0OO();
                int i4 = iOooO0O0;
                oooO0OO.f84232OooO00o = Oooo0.OooO0OO(cursorOooO.getInt(iOooO0O0));
                oooO0OO.f84233OooO0O0 = cursorOooO.getInt(iOooO0O02) != 0;
                oooO0OO.f84234OooO0OO = cursorOooO.getInt(iOooO0O03) != 0;
                oooO0OO.f84235OooO0Oo = cursorOooO.getInt(iOooO0O04) != 0;
                oooO0OO.f84237OooO0o0 = cursorOooO.getInt(iOooO0O05) != 0;
                int i5 = iOooO0O02;
                int i6 = iOooO0O03;
                oooO0OO.f84236OooO0o = cursorOooO.getLong(iOooO0O06);
                oooO0OO.f84238OooO0oO = cursorOooO.getLong(iOooO0O07);
                oooO0OO.f84239OooO0oo = Oooo0.OooO00o(cursorOooO.getBlob(iOooO0O08));
                C24880OooOOoo c24880OooOOoo = new C24880OooOOoo(string, string2);
                c24880OooOOoo.f84458OooO0O0 = Oooo0.OooO0o0(cursorOooO.getInt(iOooO0O010));
                c24880OooOOoo.f84460OooO0Oo = cursorOooO.getString(iOooO0O012);
                c24880OooOOoo.f84462OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(iOooO0O013));
                int i7 = i;
                c24880OooOOoo.f84461OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(i7));
                int i8 = iOooO0O013;
                int i9 = iOooO0O015;
                c24880OooOOoo.f84463OooO0oO = cursorOooO.getLong(i9);
                i = i7;
                int i10 = iOooO0O016;
                c24880OooOOoo.f84464OooO0oo = cursorOooO.getLong(i10);
                int i11 = iOooO0O04;
                int i12 = iOooO0O017;
                c24880OooOOoo.f84456OooO = cursorOooO.getLong(i12);
                int i13 = iOooO0O018;
                c24880OooOOoo.f84466OooOO0O = cursorOooO.getInt(i13);
                int i14 = iOooO0O019;
                c24880OooOOoo.f84467OooOO0o = Oooo0.OooO0O0(cursorOooO.getInt(i14));
                iOooO0O017 = i12;
                int i15 = iOooO0O020;
                c24880OooOOoo.f84469OooOOO0 = cursorOooO.getLong(i15);
                int i16 = iOooO0O021;
                c24880OooOOoo.f84468OooOOO = cursorOooO.getLong(i16);
                iOooO0O021 = i16;
                int i17 = iOooO0O022;
                c24880OooOOoo.f84470OooOOOO = cursorOooO.getLong(i17);
                int i18 = iOooO0O023;
                c24880OooOOoo.f84471OooOOOo = cursorOooO.getLong(i18);
                int i19 = iOooO0O024;
                c24880OooOOoo.f84473OooOOo0 = cursorOooO.getInt(i19) != 0;
                int i20 = iOooO0O025;
                c24880OooOOoo.f84472OooOOo = Oooo0.OooO0Oo(cursorOooO.getInt(i20));
                c24880OooOOoo.f84465OooOO0 = oooO0OO;
                arrayList.add(c24880OooOOoo);
                iOooO0O020 = i15;
                iOooO0O04 = i11;
                iOooO0O019 = i14;
                iOooO0O025 = i20;
                iOooO0O02 = i5;
                iOooO0O015 = i9;
                iOooO0O016 = i10;
                iOooO0O018 = i13;
                iOooO0O023 = i18;
                iOooO0O011 = i3;
                iOooO0O0 = i4;
                iOooO0O024 = i19;
                iOooO0O022 = i17;
                iOooO0O013 = i8;
                iOooO0O09 = i2;
                iOooO0O03 = i6;
            }
            cursorOooO.close();
            c24681OooOoo0.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorOooO.close();
            c24681OooOoo0.release();
            throw th;
        }
    }

    public final ArrayList OooO0o0(int i) throws Throwable {
        C24681OooOoo0 c24681OooOoo0;
        int iOooO0O0;
        int iOooO0O02;
        int iOooO0O03;
        int iOooO0O04;
        int iOooO0O05;
        int iOooO0O06;
        int iOooO0O07;
        int iOooO0O08;
        int iOooO0O09;
        int iOooO0O010;
        int iOooO0O011;
        int iOooO0O012;
        int iOooO0O013;
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        c24681OooOoo0OooOOO0.OooO0o(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            iOooO0O0 = C24733OooO00o.OooO0O0("required_network_type", cursorOooO);
            iOooO0O02 = C24733OooO00o.OooO0O0("requires_charging", cursorOooO);
            iOooO0O03 = C24733OooO00o.OooO0O0("requires_device_idle", cursorOooO);
            iOooO0O04 = C24733OooO00o.OooO0O0("requires_battery_not_low", cursorOooO);
            iOooO0O05 = C24733OooO00o.OooO0O0("requires_storage_not_low", cursorOooO);
            iOooO0O06 = C24733OooO00o.OooO0O0("trigger_content_update_delay", cursorOooO);
            iOooO0O07 = C24733OooO00o.OooO0O0("trigger_max_content_delay", cursorOooO);
            iOooO0O08 = C24733OooO00o.OooO0O0("content_uri_triggers", cursorOooO);
            iOooO0O09 = C24733OooO00o.OooO0O0("id", cursorOooO);
            iOooO0O010 = C24733OooO00o.OooO0O0("state", cursorOooO);
            iOooO0O011 = C24733OooO00o.OooO0O0("worker_class_name", cursorOooO);
            iOooO0O012 = C24733OooO00o.OooO0O0("input_merger_class_name", cursorOooO);
            iOooO0O013 = C24733OooO00o.OooO0O0("input", cursorOooO);
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
        } catch (Throwable th) {
            th = th;
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
        }
        try {
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
                o00O0O0o.OooO0OO oooO0OO = new o00O0O0o.OooO0OO();
                int i5 = iOooO0O0;
                oooO0OO.f84232OooO00o = Oooo0.OooO0OO(cursorOooO.getInt(iOooO0O0));
                oooO0OO.f84233OooO0O0 = cursorOooO.getInt(iOooO0O02) != 0;
                oooO0OO.f84234OooO0OO = cursorOooO.getInt(iOooO0O03) != 0;
                oooO0OO.f84235OooO0Oo = cursorOooO.getInt(iOooO0O04) != 0;
                oooO0OO.f84237OooO0o0 = cursorOooO.getInt(iOooO0O05) != 0;
                int i6 = iOooO0O02;
                int i7 = iOooO0O03;
                oooO0OO.f84236OooO0o = cursorOooO.getLong(iOooO0O06);
                oooO0OO.f84238OooO0oO = cursorOooO.getLong(iOooO0O07);
                oooO0OO.f84239OooO0oo = Oooo0.OooO00o(cursorOooO.getBlob(iOooO0O08));
                C24880OooOOoo c24880OooOOoo = new C24880OooOOoo(string, string2);
                c24880OooOOoo.f84458OooO0O0 = Oooo0.OooO0o0(cursorOooO.getInt(iOooO0O010));
                c24880OooOOoo.f84460OooO0Oo = cursorOooO.getString(iOooO0O012);
                c24880OooOOoo.f84462OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(iOooO0O013));
                int i8 = i2;
                c24880OooOOoo.f84461OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(i8));
                int i9 = iOooO0O012;
                int i10 = iOooO0O015;
                c24880OooOOoo.f84463OooO0oO = cursorOooO.getLong(i10);
                i2 = i8;
                int i11 = iOooO0O016;
                c24880OooOOoo.f84464OooO0oo = cursorOooO.getLong(i11);
                int i12 = iOooO0O04;
                int i13 = iOooO0O017;
                c24880OooOOoo.f84456OooO = cursorOooO.getLong(i13);
                int i14 = iOooO0O018;
                c24880OooOOoo.f84466OooOO0O = cursorOooO.getInt(i14);
                int i15 = iOooO0O019;
                c24880OooOOoo.f84467OooOO0o = Oooo0.OooO0O0(cursorOooO.getInt(i15));
                iOooO0O017 = i13;
                int i16 = iOooO0O020;
                c24880OooOOoo.f84469OooOOO0 = cursorOooO.getLong(i16);
                int i17 = iOooO0O021;
                c24880OooOOoo.f84468OooOOO = cursorOooO.getLong(i17);
                iOooO0O021 = i17;
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
                iOooO0O020 = i16;
                iOooO0O04 = i12;
                iOooO0O019 = i15;
                iOooO0O025 = i21;
                iOooO0O02 = i6;
                iOooO0O015 = i10;
                iOooO0O016 = i11;
                iOooO0O018 = i14;
                iOooO0O023 = i19;
                iOooO0O011 = i4;
                iOooO0O0 = i5;
                iOooO0O024 = i20;
                iOooO0O022 = i18;
                iOooO0O012 = i9;
                iOooO0O09 = i3;
                iOooO0O03 = i7;
            }
            cursorOooO.close();
            c24681OooOoo0.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorOooO.close();
            c24681OooOoo0.release();
            throw th;
        }
    }

    public final ArrayList OooO0oO() {
        C24681OooOoo0 c24681OooOoo0;
        int iOooO0O0;
        int iOooO0O02;
        int iOooO0O03;
        int iOooO0O04;
        int iOooO0O05;
        int iOooO0O06;
        int iOooO0O07;
        int iOooO0O08;
        int iOooO0O09;
        int iOooO0O010;
        int iOooO0O011;
        int iOooO0O012;
        int iOooO0O013;
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            iOooO0O0 = C24733OooO00o.OooO0O0("required_network_type", cursorOooO);
            iOooO0O02 = C24733OooO00o.OooO0O0("requires_charging", cursorOooO);
            iOooO0O03 = C24733OooO00o.OooO0O0("requires_device_idle", cursorOooO);
            iOooO0O04 = C24733OooO00o.OooO0O0("requires_battery_not_low", cursorOooO);
            iOooO0O05 = C24733OooO00o.OooO0O0("requires_storage_not_low", cursorOooO);
            iOooO0O06 = C24733OooO00o.OooO0O0("trigger_content_update_delay", cursorOooO);
            iOooO0O07 = C24733OooO00o.OooO0O0("trigger_max_content_delay", cursorOooO);
            iOooO0O08 = C24733OooO00o.OooO0O0("content_uri_triggers", cursorOooO);
            iOooO0O09 = C24733OooO00o.OooO0O0("id", cursorOooO);
            iOooO0O010 = C24733OooO00o.OooO0O0("state", cursorOooO);
            iOooO0O011 = C24733OooO00o.OooO0O0("worker_class_name", cursorOooO);
            iOooO0O012 = C24733OooO00o.OooO0O0("input_merger_class_name", cursorOooO);
            iOooO0O013 = C24733OooO00o.OooO0O0("input", cursorOooO);
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
        } catch (Throwable th) {
            th = th;
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
        }
        try {
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
            int i = iOooO0O014;
            ArrayList arrayList = new ArrayList(cursorOooO.getCount());
            while (cursorOooO.moveToNext()) {
                String string = cursorOooO.getString(iOooO0O09);
                int i2 = iOooO0O09;
                String string2 = cursorOooO.getString(iOooO0O011);
                int i3 = iOooO0O011;
                o00O0O0o.OooO0OO oooO0OO = new o00O0O0o.OooO0OO();
                int i4 = iOooO0O0;
                oooO0OO.f84232OooO00o = Oooo0.OooO0OO(cursorOooO.getInt(iOooO0O0));
                oooO0OO.f84233OooO0O0 = cursorOooO.getInt(iOooO0O02) != 0;
                oooO0OO.f84234OooO0OO = cursorOooO.getInt(iOooO0O03) != 0;
                oooO0OO.f84235OooO0Oo = cursorOooO.getInt(iOooO0O04) != 0;
                oooO0OO.f84237OooO0o0 = cursorOooO.getInt(iOooO0O05) != 0;
                int i5 = iOooO0O02;
                int i6 = iOooO0O03;
                oooO0OO.f84236OooO0o = cursorOooO.getLong(iOooO0O06);
                oooO0OO.f84238OooO0oO = cursorOooO.getLong(iOooO0O07);
                oooO0OO.f84239OooO0oo = Oooo0.OooO00o(cursorOooO.getBlob(iOooO0O08));
                C24880OooOOoo c24880OooOOoo = new C24880OooOOoo(string, string2);
                c24880OooOOoo.f84458OooO0O0 = Oooo0.OooO0o0(cursorOooO.getInt(iOooO0O010));
                c24880OooOOoo.f84460OooO0Oo = cursorOooO.getString(iOooO0O012);
                c24880OooOOoo.f84462OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(iOooO0O013));
                int i7 = i;
                c24880OooOOoo.f84461OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(i7));
                int i8 = iOooO0O013;
                int i9 = iOooO0O015;
                c24880OooOOoo.f84463OooO0oO = cursorOooO.getLong(i9);
                i = i7;
                int i10 = iOooO0O016;
                c24880OooOOoo.f84464OooO0oo = cursorOooO.getLong(i10);
                int i11 = iOooO0O04;
                int i12 = iOooO0O017;
                c24880OooOOoo.f84456OooO = cursorOooO.getLong(i12);
                int i13 = iOooO0O018;
                c24880OooOOoo.f84466OooOO0O = cursorOooO.getInt(i13);
                int i14 = iOooO0O019;
                c24880OooOOoo.f84467OooOO0o = Oooo0.OooO0O0(cursorOooO.getInt(i14));
                iOooO0O017 = i12;
                int i15 = iOooO0O020;
                c24880OooOOoo.f84469OooOOO0 = cursorOooO.getLong(i15);
                int i16 = iOooO0O021;
                c24880OooOOoo.f84468OooOOO = cursorOooO.getLong(i16);
                iOooO0O021 = i16;
                int i17 = iOooO0O022;
                c24880OooOOoo.f84470OooOOOO = cursorOooO.getLong(i17);
                int i18 = iOooO0O023;
                c24880OooOOoo.f84471OooOOOo = cursorOooO.getLong(i18);
                int i19 = iOooO0O024;
                c24880OooOOoo.f84473OooOOo0 = cursorOooO.getInt(i19) != 0;
                int i20 = iOooO0O025;
                c24880OooOOoo.f84472OooOOo = Oooo0.OooO0Oo(cursorOooO.getInt(i20));
                c24880OooOOoo.f84465OooOO0 = oooO0OO;
                arrayList.add(c24880OooOOoo);
                iOooO0O020 = i15;
                iOooO0O04 = i11;
                iOooO0O019 = i14;
                iOooO0O025 = i20;
                iOooO0O02 = i5;
                iOooO0O015 = i9;
                iOooO0O016 = i10;
                iOooO0O018 = i13;
                iOooO0O023 = i18;
                iOooO0O011 = i3;
                iOooO0O0 = i4;
                iOooO0O024 = i19;
                iOooO0O022 = i17;
                iOooO0O013 = i8;
                iOooO0O09 = i2;
                iOooO0O03 = i6;
            }
            cursorOooO.close();
            c24681OooOoo0.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorOooO.close();
            c24681OooOoo0.release();
            throw th;
        }
    }

    public final C24841OooOOo0.OooO00o OooO0oo(String str) {
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            c24681OooOoo0OooOOO0.OooO0oO(1);
        } else {
            c24681OooOoo0OooOOO0.OoooOO0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            return cursorOooO.moveToFirst() ? Oooo0.OooO0o0(cursorOooO.getInt(0)) : null;
        } finally {
            cursorOooO.close();
            c24681OooOoo0OooOOO0.release();
        }
    }

    public final C24880OooOOoo OooOO0(String str) {
        C24681OooOoo0 c24681OooOoo0;
        int iOooO0O0;
        int iOooO0O02;
        int iOooO0O03;
        int iOooO0O04;
        int iOooO0O05;
        int iOooO0O06;
        int iOooO0O07;
        int iOooO0O08;
        int iOooO0O09;
        int iOooO0O010;
        int iOooO0O011;
        int iOooO0O012;
        int iOooO0O013;
        C24880OooOOoo c24880OooOOoo;
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            c24681OooOoo0OooOOO0.OooO0oO(1);
        } else {
            c24681OooOoo0OooOOO0.OoooOO0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            iOooO0O0 = C24733OooO00o.OooO0O0("required_network_type", cursorOooO);
            iOooO0O02 = C24733OooO00o.OooO0O0("requires_charging", cursorOooO);
            iOooO0O03 = C24733OooO00o.OooO0O0("requires_device_idle", cursorOooO);
            iOooO0O04 = C24733OooO00o.OooO0O0("requires_battery_not_low", cursorOooO);
            iOooO0O05 = C24733OooO00o.OooO0O0("requires_storage_not_low", cursorOooO);
            iOooO0O06 = C24733OooO00o.OooO0O0("trigger_content_update_delay", cursorOooO);
            iOooO0O07 = C24733OooO00o.OooO0O0("trigger_max_content_delay", cursorOooO);
            iOooO0O08 = C24733OooO00o.OooO0O0("content_uri_triggers", cursorOooO);
            iOooO0O09 = C24733OooO00o.OooO0O0("id", cursorOooO);
            iOooO0O010 = C24733OooO00o.OooO0O0("state", cursorOooO);
            iOooO0O011 = C24733OooO00o.OooO0O0("worker_class_name", cursorOooO);
            iOooO0O012 = C24733OooO00o.OooO0O0("input_merger_class_name", cursorOooO);
            iOooO0O013 = C24733OooO00o.OooO0O0("input", cursorOooO);
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
        } catch (Throwable th) {
            th = th;
            c24681OooOoo0 = c24681OooOoo0OooOOO0;
        }
        try {
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
            if (cursorOooO.moveToFirst()) {
                String string = cursorOooO.getString(iOooO0O09);
                String string2 = cursorOooO.getString(iOooO0O011);
                o00O0O0o.OooO0OO oooO0OO = new o00O0O0o.OooO0OO();
                oooO0OO.f84232OooO00o = Oooo0.OooO0OO(cursorOooO.getInt(iOooO0O0));
                oooO0OO.f84233OooO0O0 = cursorOooO.getInt(iOooO0O02) != 0;
                oooO0OO.f84234OooO0OO = cursorOooO.getInt(iOooO0O03) != 0;
                oooO0OO.f84235OooO0Oo = cursorOooO.getInt(iOooO0O04) != 0;
                oooO0OO.f84237OooO0o0 = cursorOooO.getInt(iOooO0O05) != 0;
                oooO0OO.f84236OooO0o = cursorOooO.getLong(iOooO0O06);
                oooO0OO.f84238OooO0oO = cursorOooO.getLong(iOooO0O07);
                oooO0OO.f84239OooO0oo = Oooo0.OooO00o(cursorOooO.getBlob(iOooO0O08));
                c24880OooOOoo = new C24880OooOOoo(string, string2);
                c24880OooOOoo.f84458OooO0O0 = Oooo0.OooO0o0(cursorOooO.getInt(iOooO0O010));
                c24880OooOOoo.f84460OooO0Oo = cursorOooO.getString(iOooO0O012);
                c24880OooOOoo.f84462OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(iOooO0O013));
                c24880OooOOoo.f84461OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(iOooO0O014));
                c24880OooOOoo.f84463OooO0oO = cursorOooO.getLong(iOooO0O015);
                c24880OooOOoo.f84464OooO0oo = cursorOooO.getLong(iOooO0O016);
                c24880OooOOoo.f84456OooO = cursorOooO.getLong(iOooO0O017);
                c24880OooOOoo.f84466OooOO0O = cursorOooO.getInt(iOooO0O018);
                c24880OooOOoo.f84467OooOO0o = Oooo0.OooO0O0(cursorOooO.getInt(iOooO0O019));
                c24880OooOOoo.f84469OooOOO0 = cursorOooO.getLong(iOooO0O020);
                c24880OooOOoo.f84468OooOOO = cursorOooO.getLong(iOooO0O021);
                c24880OooOOoo.f84470OooOOOO = cursorOooO.getLong(iOooO0O022);
                c24880OooOOoo.f84471OooOOOo = cursorOooO.getLong(iOooO0O023);
                c24880OooOOoo.f84473OooOOo0 = cursorOooO.getInt(iOooO0O024) != 0;
                c24880OooOOoo.f84472OooOOo = Oooo0.OooO0Oo(cursorOooO.getInt(iOooO0O025));
                c24880OooOOoo.f84465OooOO0 = oooO0OO;
            } else {
                c24880OooOOoo = null;
            }
            cursorOooO.close();
            c24681OooOoo0.release();
            return c24880OooOOoo;
        } catch (Throwable th2) {
            th = th2;
            cursorOooO.close();
            c24681OooOoo0.release();
            throw th;
        }
    }

    public final ArrayList OooOO0O(String str) {
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c24681OooOoo0OooOOO0.OooO0oO(1);
        } else {
            c24681OooOoo0OooOOO0.OoooOO0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            int iOooO0O0 = C24733OooO00o.OooO0O0("id", cursorOooO);
            int iOooO0O02 = C24733OooO00o.OooO0O0("state", cursorOooO);
            ArrayList arrayList = new ArrayList(cursorOooO.getCount());
            while (cursorOooO.moveToNext()) {
                C24880OooOOoo.OooO0O0 oooO0O0 = new C24880OooOOoo.OooO0O0();
                oooO0O0.f84474OooO00o = cursorOooO.getString(iOooO0O0);
                oooO0O0.f84475OooO0O0 = Oooo0.OooO0o0(cursorOooO.getInt(iOooO0O02));
                arrayList.add(oooO0O0);
            }
            return arrayList;
        } finally {
            cursorOooO.close();
            c24681OooOoo0OooOOO0.release();
        }
    }

    public final int OooOO0o(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        C24888OooOoo0 c24888OooOoo0 = this.f84492OooO0oo;
        InterfaceC24759OooO0o interfaceC24759OooO0oOooO0oo = c24888OooOoo0.OooO0oo();
        interfaceC24759OooO0oOooO0oo.OooO0o(1, j);
        if (str == null) {
            interfaceC24759OooO0oOooO0oo.OooO0oO(2);
        } else {
            interfaceC24759OooO0oOooO0oo.OoooOO0(2, str);
        }
        workDatabase_Impl.OooO0OO();
        try {
            int iOooOo0 = interfaceC24759OooO0oOooO0oo.OooOo0();
            workDatabase_Impl.OooOOoo();
            return iOooOo0;
        } finally {
            workDatabase_Impl.OooOOOo();
            c24888OooOoo0.OooOO0o(interfaceC24759OooO0oOooO0oo);
        }
    }

    public final void OooOOO(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        C24885OooOoO0 c24885OooOoO0 = this.f84490OooO0o0;
        InterfaceC24759OooO0o interfaceC24759OooO0oOooO0oo = c24885OooOoO0.OooO0oo();
        interfaceC24759OooO0oOooO0oo.OooO0o(1, j);
        if (str == null) {
            interfaceC24759OooO0oOooO0oo.OooO0oO(2);
        } else {
            interfaceC24759OooO0oOooO0oo.OoooOO0(2, str);
        }
        workDatabase_Impl.OooO0OO();
        try {
            interfaceC24759OooO0oOooO0oo.OooOo0();
            workDatabase_Impl.OooOOoo();
        } finally {
            workDatabase_Impl.OooOOOo();
            c24885OooOoO0.OooOO0o(interfaceC24759OooO0oOooO0oo);
        }
    }

    public final void OooOOO0(String str, androidx.work.OooO0O0 oooO0O0) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        OooOo oooOo = this.f84488OooO0Oo;
        InterfaceC24759OooO0o interfaceC24759OooO0oOooO0oo = oooOo.OooO0oo();
        byte[] bArrOooO0OO = androidx.work.OooO0O0.OooO0OO(oooO0O0);
        if (bArrOooO0OO == null) {
            interfaceC24759OooO0oOooO0oo.OooO0oO(1);
        } else {
            interfaceC24759OooO0oOooO0oo.OooooO0(1, bArrOooO0OO);
        }
        if (str == null) {
            interfaceC24759OooO0oOooO0oo.OooO0oO(2);
        } else {
            interfaceC24759OooO0oOooO0oo.OoooOO0(2, str);
        }
        workDatabase_Impl.OooO0OO();
        try {
            interfaceC24759OooO0oOooO0oo.OooOo0();
            workDatabase_Impl.OooOOoo();
        } finally {
            workDatabase_Impl.OooOOOo();
            oooOo.OooOO0o(interfaceC24759OooO0oOooO0oo);
        }
    }

    public final int OooOOOO(C24841OooOOo0.OooO00o oooO00o, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = this.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=? WHERE id IN (");
        C25022OooO0O0.OooO0OO(strArr.length, sb);
        sb.append(")");
        String sql = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0oO(sql, "sql");
        workDatabase_Impl.OooO00o();
        workDatabase_Impl.OooO0O0();
        InterfaceC24759OooO0o interfaceC24759OooO0oO0000Oo = workDatabase_Impl.OooOO0O().OooooOO().o0000Oo(sql);
        interfaceC24759OooO0oO0000Oo.OooO0o(1, Oooo0.OooO0o(oooO00o));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                interfaceC24759OooO0oO0000Oo.OooO0oO(i);
            } else {
                interfaceC24759OooO0oO0000Oo.OoooOO0(i, str);
            }
            i++;
        }
        workDatabase_Impl.OooO0OO();
        try {
            int iOooOo0 = interfaceC24759OooO0oO0000Oo.OooOo0();
            workDatabase_Impl.OooOOoo();
            return iOooOo0;
        } finally {
            workDatabase_Impl.OooOOOo();
        }
    }
}
