package o00O0OO;

import OooOoo.C20593OooO0Oo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o00O0O0o.EnumC24838OooOO0o;
import o00O0O0o.OooOO0O;
import o00O0OO.C24844OooO0o0;
import o00O0OOo.C24855OooO0Oo;
import o00O0OoO.C24874OooO0oO;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24890OooOooo;
import o00O0OoO.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements o00O0OO0.OooO0O0 {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final String f84291OooOoO = OooOO0O.OooO0o0("CommandHandler");

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f84293OooOo0o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final HashMap f84292OooOo = new HashMap();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Object f84294OooOoO0 = new Object();

    public OooO0O0(Context context) {
        this.f84293OooOo0o = context;
    }

    public static Intent OooO00o(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent OooO0OO(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // o00O0OO0.OooO0O0
    public final void OooO0O0(String str, boolean z) {
        synchronized (this.f84294OooOoO0) {
            try {
                o00O0OO0.OooO0O0 oooO0O0 = (o00O0OO0.OooO0O0) this.f84292OooOo.remove(str);
                if (oooO0O0 != null) {
                    oooO0O0.OooO0O0(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0Oo(int i, Intent intent, C24844OooO0o0 c24844OooO0o0) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            OooOO0O.OooO0OO().OooO00o(f84291OooOoO, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            OooO0OO oooO0OO = new OooO0OO(this.f84293OooOo0o, i, c24844OooO0o0);
            ArrayList<C24880OooOOoo> arrayListOooO0oO = ((C24890OooOooo) c24844OooO0o0.f84314OooOoOO.f84362OooO0OO.OooOoO()).OooO0oO();
            String str = ConstraintProxy.f66718OooO00o;
            Iterator it = arrayListOooO0oO.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                o00O0O0o.OooO0OO oooO0OO2 = ((C24880OooOOoo) it.next()).f84465OooOO0;
                z |= oooO0OO2.f84235OooO0Oo;
                z2 |= oooO0OO2.f84233OooO0O0;
                z3 |= oooO0OO2.f84237OooO0o0;
                z4 |= oooO0OO2.f84232OooO00o != EnumC24838OooOO0o.f84258OooOo0o;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f66719OooO00o;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = oooO0OO.f84296OooO00o;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            C24855OooO0Oo c24855OooO0Oo = oooO0OO.f84298OooO0OO;
            c24855OooO0Oo.OooO0O0(arrayListOooO0oO);
            ArrayList arrayList = new ArrayList(arrayListOooO0oO.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C24880OooOOoo c24880OooOOoo : arrayListOooO0oO) {
                String str3 = c24880OooOOoo.f84457OooO00o;
                if (jCurrentTimeMillis >= c24880OooOOoo.OooO00o() && (!c24880OooOOoo.OooO0O0() || c24855OooO0Oo.OooO00o(str3))) {
                    arrayList.add(c24880OooOOoo);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = ((C24880OooOOoo) it2.next()).f84457OooO00o;
                Intent intentOooO00o = OooO00o(context, str4);
                OooOO0O.OooO0OO().OooO00o(OooO0OO.f84295OooO0Oo, C20593OooO0Oo.OooO0O0("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                c24844OooO0o0.OooO0o0(new C24844OooO0o0.OooO0O0(oooO0OO.f84297OooO0O0, intentOooO00o, c24844OooO0o0));
            }
            c24855OooO0Oo.OooO0OO();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            OooOO0O.OooO0OO().OooO00o(f84291OooOoO, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            c24844OooO0o0.f84314OooOoOO.ooOO();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            OooOO0O.OooO0OO().OooO0O0(f84291OooOoO, C20593OooO0Oo.OooO0O0("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f84294OooOoO0) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        OooOO0O oooOO0OOooO0OO = OooOO0O.OooO0OO();
                        String str5 = f84291OooOoO;
                        oooOO0OOooO0OO.OooO00o(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f84292OooOo.containsKey(string)) {
                            OooOO0O.OooO0OO().OooO00o(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            C24843OooO0Oo c24843OooO0Oo = new C24843OooO0Oo(this.f84293OooOo0o, i, string, c24844OooO0o0);
                            this.f84292OooOo.put(string, c24843OooO0Oo);
                            c24843OooO0Oo.OooO0o0();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    OooOO0O.OooO0OO().OooO0o(f84291OooOoO, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z5 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                OooOO0O.OooO0OO().OooO00o(f84291OooOoO, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
                OooO0O0(string2, z5);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            OooOO0O.OooO0OO().OooO00o(f84291OooOoO, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Handing stopWork work for ", string3), new Throwable[0]);
            c24844OooO0o0.f84314OooOoOO.o00Oo0(string3);
            String str6 = OooO00o.f84290OooO00o;
            OooOO0 oooOO0OooOo0o = c24844OooO0o0.f84314OooOoOO.f84362OooO0OO.OooOo0o();
            C24874OooO0oO c24874OooO0oOOooO00o = oooOO0OooOo0o.OooO00o(string3);
            if (c24874OooO0oOOooO00o != null) {
                OooO00o.OooO00o(this.f84293OooOo0o, c24874OooO0oOOooO00o.f84443OooO0O0, string3);
                OooOO0O.OooO0OO().OooO00o(OooO00o.f84290OooO00o, C20593OooO0Oo.OooO0O0("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                oooOO0OooOo0o.OooO0OO(string3);
            }
            c24844OooO0o0.OooO0O0(string3, false);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        String str7 = f84291OooOoO;
        OooOO0O.OooO0OO().OooO00o(str7, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Handling schedule work for ", string4), new Throwable[0]);
        WorkDatabase workDatabase = c24844OooO0o0.f84314OooOoOO.f84362OooO0OO;
        workDatabase.OooO0OO();
        try {
            C24880OooOOoo c24880OooOOooOooOO0 = ((C24890OooOooo) workDatabase.OooOoO()).OooOO0(string4);
            if (c24880OooOOooOooOO0 == null) {
                OooOO0O.OooO0OO().OooO0o(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (c24880OooOOooOooOO0.f84458OooO0O0.OooO00o()) {
                OooOO0O.OooO0OO().OooO0o(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
                return;
            }
            long jOooO00o = c24880OooOOooOooOO0.OooO00o();
            boolean zOooO0O0 = c24880OooOOooOooOO0.OooO0O0();
            Context context2 = this.f84293OooOo0o;
            o00O0OO0.OooOO0O oooOO0O = c24844OooO0o0.f84314OooOoOO;
            if (zOooO0O0) {
                OooOO0O.OooO0OO().OooO00o(str7, "Opportunistically setting an alarm for " + string4 + " at " + jOooO00o, new Throwable[0]);
                OooO00o.OooO0O0(context2, oooOO0O, string4, jOooO00o);
                Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                c24844OooO0o0.OooO0o0(new C24844OooO0o0.OooO0O0(i, intent3, c24844OooO0o0));
            } else {
                OooOO0O.OooO0OO().OooO00o(str7, "Setting up Alarms for " + string4 + " at " + jOooO00o, new Throwable[0]);
                OooO00o.OooO0O0(context2, oooOO0O, string4, jOooO00o);
            }
            workDatabase.OooOOoo();
        } finally {
            workDatabase.OooOOOo();
        }
    }
}
