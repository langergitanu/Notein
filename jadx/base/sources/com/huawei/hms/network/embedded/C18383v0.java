package com.huawei.hms.network.embedded;

import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.v0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18383v0 {

    /* JADX INFO: renamed from: a */
    public Map<String, InterfaceC18422y0> f56331a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.v0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C18383v0 f56332a = new C18383v0();
    }

    public C18383v0() {
        this.f56331a = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C18383v0 m79659a() {
        return b.f56332a;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC18422y0 m79664b(String str) {
        return this.f56331a.get(str);
    }

    /* JADX INFO: renamed from: a */
    public Object m79660a(String str) {
        return m79664b(str).mo78661a();
    }

    /* JADX INFO: renamed from: a */
    public void m79661a(SQLiteDatabase sQLiteDatabase) {
        Iterator<InterfaceC18422y0> it = this.f56331a.values().iterator();
        while (it.hasNext()) {
            it.next().mo78662a(sQLiteDatabase);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m79662a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Iterator<InterfaceC18422y0> it = this.f56331a.values().iterator();
        while (it.hasNext()) {
            it.next().mo78663a(sQLiteDatabase, i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m79663a(String str, InterfaceC18422y0 interfaceC18422y0) {
        this.f56331a.put(str, interfaceC18422y0);
    }
}
