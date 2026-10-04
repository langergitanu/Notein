package com.huawei.hms.network.embedded;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.h1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18195h1 implements InterfaceC18422y0 {

    /* JADX INFO: renamed from: c */
    public static final String f55011c = "h1";

    /* JADX INFO: renamed from: d */
    public static final String f55012d = "table_domainrelation";

    /* JADX INFO: renamed from: e */
    public static final String f55013e = "domain";

    /* JADX INFO: renamed from: f */
    public static final String f55014f = "relationdomain";

    /* JADX INFO: renamed from: g */
    public static final String f55015g = "score";

    /* JADX INFO: renamed from: h */
    public static final String f55016h;

    /* JADX INFO: renamed from: a */
    public Map<String, Map<String, Integer>> f55017a;

    /* JADX INFO: renamed from: b */
    public Map<String, List<Map.Entry<String, Integer>>> f55018b;

    static {
        Locale locale = Locale.ENGLISH;
        f55016h = "create table table_domainrelation(domain varchar(128), relationdomain varchar(128), score integer)";
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: a */
    public synchronized Object mo78661a() {
        Cursor cursorM79593a;
        Map<String, Map<String, Integer>> map = this.f55017a;
        if (map != null) {
            return map;
        }
        this.f55017a = new HashMap();
        try {
            cursorM79593a = C18370u0.m79589s().m79593a(f55012d, null, null, null, null, null, null);
            try {
                int columnIndex = cursorM79593a.getColumnIndex("domain");
                int columnIndex2 = cursorM79593a.getColumnIndex(f55014f);
                int columnIndex3 = cursorM79593a.getColumnIndex("score");
                while (cursorM79593a.moveToNext()) {
                    String string = cursorM79593a.getString(columnIndex);
                    String string2 = cursorM79593a.getString(columnIndex2);
                    int i = cursorM79593a.getInt(columnIndex3);
                    if (!this.f55017a.containsKey(string)) {
                        this.f55017a.put(string, new HashMap());
                    }
                    this.f55017a.get(string).put(string2, Integer.valueOf(i));
                }
                IoUtils.close(cursorM79593a);
            } catch (Throwable unused) {
                Cursor cursor = cursorM79593a;
                try {
                    Logger.m76960e(f55011c, "meet exception when getting init model train data");
                } finally {
                    IoUtils.close(cursor);
                }
            }
        } catch (Throwable unused2) {
            cursorM79593a = null;
        }
        return this.f55017a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: b */
    public synchronized Object mo78665b() {
        Map<String, List<Map.Entry<String, Integer>>> map = this.f55018b;
        if (map != null) {
            return map;
        }
        this.f55018b = new HashMap();
        Cursor cursorM79593a = null;
        try {
            for (String str : this.f55017a.keySet()) {
                cursorM79593a = C18370u0.m79589s().m79593a(f55012d, new String[]{"domain", f55014f, "score"}, "domain=?", new String[]{str}, null, null, "score DESC");
                int columnIndex = cursorM79593a.getColumnIndex(f55014f);
                int columnIndex2 = cursorM79593a.getColumnIndex("score");
                while (cursorM79593a.moveToNext()) {
                    if (!this.f55018b.containsKey(str)) {
                        this.f55018b.put(str, new ArrayList());
                    }
                    this.f55018b.get(str).add(new AbstractMap.SimpleEntry(cursorM79593a.getString(columnIndex), Integer.valueOf(cursorM79593a.getInt(columnIndex2))));
                }
            }
            IoUtils.close(cursorM79593a);
        } catch (Throwable unused) {
            Cursor cursor = cursorM79593a;
            try {
                Logger.m76960e(f55011c, "meet exception when getting init model execute data");
            } finally {
                IoUtils.close(cursor);
            }
        }
        return this.f55018b;
    }

    /* JADX INFO: renamed from: b */
    private void m78660b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(f55016h);
        } catch (SQLException unused) {
            Logger.m76960e(f55011c, "execSQL fail on create table");
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: a */
    public void mo78662a(SQLiteDatabase sQLiteDatabase) {
        m78660b(sQLiteDatabase);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: a */
    public void mo78663a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i <= 1) {
            m78660b(sQLiteDatabase);
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
                C18370u0.m79589s().m79591a(f55012d, null, null);
                for (Map.Entry entry : map.entrySet()) {
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("domain", (String) entry.getKey());
                        contentValues.put(f55014f, (String) entry2.getKey());
                        contentValues.put("score", (Integer) entry2.getValue());
                        C18370u0.m79589s().m79592a(f55012d, contentValues);
                    }
                }
                C18370u0.m79589s().getWritableDatabase().setTransactionSuccessful();
            } catch (Throwable unused) {
                Logger.m76967w(f55011c, "Transaction will roll back in update relationModel trainData ");
            }
        } finally {
            C18370u0.m79589s().getWritableDatabase().endTransaction();
        }
    }
}
