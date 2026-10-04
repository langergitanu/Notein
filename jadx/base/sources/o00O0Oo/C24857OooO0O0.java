package o00O0Oo;

import Oooo0o0.C21009OooOooO;
import Oooo0oO.C21023OooO0Oo;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o00O0O0o.C24836OooO0oO;
import o00O0O0o.OooOO0O;
import o00O0OOo.C24855OooO0Oo;
import o00O0OOo.InterfaceC24854OooO0OO;
import o00O0OoO.C24880OooOOoo;
import o00O0Ooo.RunnableC24909OooOOo;
import o00oOOo.C25591OooO0O0;

/* JADX INFO: renamed from: o00O0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24857OooO0O0 implements InterfaceC24854OooO0OO, o00O0OO0.OooO0O0 {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final String f84411Oooo000 = OooOO0O.OooO0o0("SystemFgDispatcher");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C25591OooO0O0 f84412OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o00O0OO0.OooOO0O f84413OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f84414OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Object f84415OooOoO0 = new Object();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final LinkedHashMap f84416OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final HashSet f84417OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final HashMap f84418OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C24855OooO0Oo f84419OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public SystemForegroundService f84420OooOooo;

    public C24857OooO0O0(Context context) {
        o00O0OO0.OooOO0O oooOO0OOoooooO = o00O0OO0.OooOO0O.OoooooO(context);
        this.f84413OooOo0o = oooOO0OOoooooO;
        C25591OooO0O0 c25591OooO0O0 = oooOO0OOoooooO.f84363OooO0Oo;
        this.f84412OooOo = c25591OooO0O0;
        this.f84414OooOoO = null;
        this.f84416OooOoOO = new LinkedHashMap();
        this.f84417OooOoo = new HashSet();
        this.f84418OooOoo0 = new HashMap();
        this.f84419OooOooO = new C24855OooO0Oo(context, c25591OooO0O0, this);
        oooOO0OOoooooO.f84364OooO0o.OooO00o(this);
    }

    public static Intent OooO00o(Context context, String str, C24836OooO0oO c24836OooO0oO) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c24836OooO0oO.f84250OooO00o);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c24836OooO0oO.f84251OooO0O0);
        intent.putExtra("KEY_NOTIFICATION", c24836OooO0oO.f84252OooO0OO);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent OooO0OO(Context context, String str, C24836OooO0oO c24836OooO0oO) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c24836OooO0oO.f84250OooO00o);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c24836OooO0oO.f84251OooO0O0);
        intent.putExtra("KEY_NOTIFICATION", c24836OooO0oO.f84252OooO0OO);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // o00O0OO0.OooO0O0
    public final void OooO0O0(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.f84415OooOoO0) {
            try {
                C24880OooOOoo c24880OooOOoo = (C24880OooOOoo) this.f84418OooOoo0.remove(str);
                if (c24880OooOOoo != null ? this.f84417OooOoo.remove(c24880OooOOoo) : false) {
                    this.f84419OooOooO.OooO0O0(this.f84417OooOoo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C24836OooO0oO c24836OooO0oO = (C24836OooO0oO) this.f84416OooOoOO.remove(str);
        if (str.equals(this.f84414OooOoO) && this.f84416OooOoOO.size() > 0) {
            Iterator it = this.f84416OooOoOO.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f84414OooOoO = (String) entry.getKey();
            if (this.f84420OooOooo != null) {
                C24836OooO0oO c24836OooO0oO2 = (C24836OooO0oO) entry.getValue();
                SystemForegroundService systemForegroundService = this.f84420OooOooo;
                systemForegroundService.f66732OooOo.post(new RunnableC24858OooO0OO(systemForegroundService, c24836OooO0oO2.f84250OooO00o, c24836OooO0oO2.f84252OooO0OO, c24836OooO0oO2.f84251OooO0O0));
                SystemForegroundService systemForegroundService2 = this.f84420OooOooo;
                systemForegroundService2.f66732OooOo.post(new RunnableC24860OooO0o0(systemForegroundService2, c24836OooO0oO2.f84250OooO00o));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f84420OooOooo;
        if (c24836OooO0oO == null || systemForegroundService3 == null) {
            return;
        }
        OooOO0O.OooO0OO().OooO00o(f84411Oooo000, C21023OooO0Oo.OooO0OO(")", c24836OooO0oO.f84251OooO0O0, C21009OooOooO.OooO0OO(c24836OooO0oO.f84250OooO00o, "Removing Notification (id: ", ", workSpecId: ", str, " ,notificationType: ")), new Throwable[0]);
        systemForegroundService3.f66732OooOo.post(new RunnableC24860OooO0o0(systemForegroundService3, c24836OooO0oO.f84250OooO00o));
    }

    @Override // o00O0OOo.InterfaceC24854OooO0OO
    public final void OooO0Oo(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            OooOO0O.OooO0OO().OooO00o(f84411Oooo000, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            o00O0OO0.OooOO0O oooOO0O = this.f84413OooOo0o;
            oooOO0O.f84363OooO0Oo.OooO00o(new RunnableC24909OooOOo(oooOO0O, str, true));
        }
    }

    @Override // o00O0OOo.InterfaceC24854OooO0OO
    public final void OooO0o(List<String> list) {
    }

    public final void OooO0o0(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        OooOO0O.OooO0OO().OooO00o(f84411Oooo000, C21023OooO0Oo.OooO0OO(")", intExtra2, C21009OooOooO.OooO0OO(intExtra, "Notifying with (id: ", ", workSpecId: ", stringExtra, ", notificationType: ")), new Throwable[0]);
        if (notification == null || this.f84420OooOooo == null) {
            return;
        }
        C24836OooO0oO c24836OooO0oO = new C24836OooO0oO(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f84416OooOoOO;
        linkedHashMap.put(stringExtra, c24836OooO0oO);
        if (TextUtils.isEmpty(this.f84414OooOoO)) {
            this.f84414OooOoO = stringExtra;
            SystemForegroundService systemForegroundService = this.f84420OooOooo;
            systemForegroundService.f66732OooOo.post(new RunnableC24858OooO0OO(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f84420OooOooo;
        systemForegroundService2.f66732OooOo.post(new RunnableC24859OooO0Oo(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((C24836OooO0oO) ((Map.Entry) it.next()).getValue()).f84251OooO0O0;
        }
        C24836OooO0oO c24836OooO0oO2 = (C24836OooO0oO) linkedHashMap.get(this.f84414OooOoO);
        if (c24836OooO0oO2 != null) {
            SystemForegroundService systemForegroundService3 = this.f84420OooOooo;
            systemForegroundService3.f66732OooOo.post(new RunnableC24858OooO0OO(systemForegroundService3, c24836OooO0oO2.f84250OooO00o, c24836OooO0oO2.f84252OooO0OO, i));
        }
    }

    public final void OooO0oO() {
        this.f84420OooOooo = null;
        synchronized (this.f84415OooOoO0) {
            this.f84419OooOooO.OooO0OO();
        }
        this.f84413OooOo0o.f84364OooO0o.OooO0o0(this);
    }
}
