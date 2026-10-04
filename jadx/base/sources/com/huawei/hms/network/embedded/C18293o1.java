package com.huawei.hms.network.embedded;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.o1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18293o1 implements InterfaceC18422y0 {

    /* JADX INFO: renamed from: b */
    public static final String f55799b = "o1";

    /* JADX INFO: renamed from: c */
    public static final String f55800c = "table_ipsort";

    /* JADX INFO: renamed from: d */
    public static final String f55801d = "address";

    /* JADX INFO: renamed from: e */
    public static final String f55802e = "score";

    /* JADX INFO: renamed from: f */
    public static final String f55803f = "count";

    /* JADX INFO: renamed from: g */
    public static final String f55804g;

    /* JADX INFO: renamed from: h */
    public static final int f55805h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f55806i = 1;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, int[]> f55807a = new ConcurrentHashMap<>();

    static {
        Locale locale = Locale.ENGLISH;
        f55804g = "create table table_ipsort(address varchar(128), score integer, count integer, primary key (address))";
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: a */
    public Object mo78661a() {
        Cursor cursorM79593a;
        try {
            cursorM79593a = C18370u0.m79589s().m79593a(f55800c, null, null, null, null, null, null);
            try {
                int columnIndex = cursorM79593a.getColumnIndex("address");
                int columnIndex2 = cursorM79593a.getColumnIndex("score");
                int columnIndex3 = cursorM79593a.getColumnIndex(f55803f);
                while (cursorM79593a.moveToNext()) {
                    this.f55807a.put(cursorM79593a.getString(columnIndex), new int[]{cursorM79593a.getInt(columnIndex2), cursorM79593a.getInt(columnIndex3)});
                }
                IoUtils.close(cursorM79593a);
            } catch (Throwable unused) {
                Cursor cursor = cursorM79593a;
                try {
                    Logger.m76960e(f55799b, "meet exception when getting ip sort model train data");
                } finally {
                    IoUtils.close(cursor);
                }
            }
        } catch (Throwable unused2) {
            cursorM79593a = null;
        }
        return this.f55807a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: b */
    public Object mo78665b() {
        return null;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: a */
    public void mo78662a(SQLiteDatabase sQLiteDatabase) {
        m79262b(sQLiteDatabase);
    }

    /* JADX INFO: renamed from: b */
    public void m79262b(SQLiteDatabase sQLiteDatabase) {
        try {
            Logger.m76963i(f55799b, "Ipsort Model create table");
            sQLiteDatabase.execSQL(f55804g);
        } catch (SQLException unused) {
            Logger.m76960e(f55799b, "execSQL fail on create ipsort model table");
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: a */
    public void mo78663a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i <= 2) {
            m79262b(sQLiteDatabase);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: a */
    public void mo78664a(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        C18370u0.m79589s().getWritableDatabase().beginTransaction();
        try {
            try {
                C18370u0.m79589s().m79591a(f55800c, null, null);
                for (Map.Entry entry : map.entrySet()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("address", (String) entry.getKey());
                    contentValues.put("score", Integer.valueOf(((int[]) entry.getValue())[0]));
                    contentValues.put(f55803f, Integer.valueOf(((int[]) entry.getValue())[1]));
                    C18370u0.m79589s().m79592a(f55800c, contentValues);
                }
                C18370u0.m79589s().getWritableDatabase().setTransactionSuccessful();
            } catch (Throwable unused) {
                Logger.m76967w(f55799b, "Transaction will roll back in update ipModel trainData ");
            }
        } finally {
            C18370u0.m79589s().getWritableDatabase().endTransaction();
        }
    }
}
