package com.huawei.hms.network.embedded;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.m1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18265m1 implements InterfaceC18422y0 {

    /* JADX INFO: renamed from: d */
    public static final String f55643d = "m1";

    /* JADX INFO: renamed from: e */
    public static final String f55644e = "table_init";

    /* JADX INFO: renamed from: f */
    public static final String f55645f = "domain";

    /* JADX INFO: renamed from: g */
    public static final String f55646g = "score";

    /* JADX INFO: renamed from: h */
    public static final String f55647h = "conticnt";

    /* JADX INFO: renamed from: i */
    public static final String f55648i;

    /* JADX INFO: renamed from: a */
    public int f55649a = 20;

    /* JADX INFO: renamed from: b */
    public ArrayList<String> f55650b = null;

    /* JADX INFO: renamed from: c */
    public HashMap<String, int[]> f55651c = new HashMap<>();

    static {
        Locale locale = Locale.ENGLISH;
        f55648i = "create table table_init(domain varchar(128), score integer, conticnt integer, primary key (domain))";
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: a */
    public Object mo78661a() {
        Cursor cursorM79593a;
        try {
            cursorM79593a = C18370u0.m79589s().m79593a(f55644e, null, null, null, null, null, null);
            try {
                int columnIndex = cursorM79593a.getColumnIndex("domain");
                int columnIndex2 = cursorM79593a.getColumnIndex("score");
                int columnIndex3 = cursorM79593a.getColumnIndex(f55647h);
                while (cursorM79593a.moveToNext()) {
                    this.f55651c.put(cursorM79593a.getString(columnIndex), new int[]{cursorM79593a.getInt(columnIndex2), cursorM79593a.getInt(columnIndex3)});
                }
                IoUtils.close(cursorM79593a);
            } catch (Throwable unused) {
                Cursor cursor = cursorM79593a;
                try {
                    Logger.m76960e(f55643d, "meet exception when getting init model train data");
                } finally {
                    IoUtils.close(cursor);
                }
            }
        } catch (Throwable unused2) {
            cursorM79593a = null;
        }
        return this.f55651c;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: b */
    public Object mo78665b() {
        Cursor cursorM79594a;
        ArrayList<String> arrayList = this.f55650b;
        if (arrayList != null) {
            return arrayList;
        }
        this.f55650b = new ArrayList<>();
        try {
            cursorM79594a = C18370u0.m79589s().m79594a(f55644e, new String[]{"domain"}, null, null, null, null, "score DESC", Integer.toString(this.f55649a));
        } catch (Throwable unused) {
            cursorM79594a = null;
        }
        try {
            int columnIndex = cursorM79594a.getColumnIndex("domain");
            while (cursorM79594a.moveToNext()) {
                this.f55650b.add(cursorM79594a.getString(columnIndex));
            }
        } catch (Throwable unused2) {
            try {
                Logger.m76960e(f55643d, "meet exception when getting init model execute data");
            } finally {
                IoUtils.close(cursorM79594a);
            }
        }
        return this.f55650b;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: a */
    public void mo78662a(SQLiteDatabase sQLiteDatabase) {
        try {
            Logger.m76963i(f55643d, "InitModel create table");
            sQLiteDatabase.execSQL(f55648i);
        } catch (SQLException unused) {
            Logger.m76960e(f55643d, "execSQL fail on create table");
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: a */
    public void mo78663a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18422y0
    /* JADX INFO: renamed from: a */
    public void mo78664a(Object obj) {
        HashMap map = (HashMap) obj;
        ContentValues contentValues = new ContentValues();
        C18370u0.m79589s().getWritableDatabase().beginTransaction();
        try {
            try {
                C18370u0.m79589s().m79591a(f55644e, null, null);
                for (Map.Entry entry : map.entrySet()) {
                    int i = ((int[]) entry.getValue())[0];
                    int i2 = ((int[]) entry.getValue())[1];
                    contentValues.put("domain", (String) entry.getKey());
                    contentValues.put("score", Integer.valueOf(i));
                    contentValues.put(f55647h, Integer.valueOf(i2));
                    C18370u0.m79589s().m79592a(f55644e, contentValues);
                }
                C18370u0.m79589s().getWritableDatabase().setTransactionSuccessful();
            } catch (Throwable unused) {
                Logger.m76967w(f55643d, "Transaction will roll back in update initModel trainData ");
            }
        } finally {
            C18370u0.m79589s().getWritableDatabase().endTransaction();
        }
    }
}
