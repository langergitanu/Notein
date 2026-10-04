package com.huawei.hms.network.embedded;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.l2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18252l2 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public static final String f55565a = "FileCacheManager";

    /* JADX INFO: renamed from: b */
    public static String f55566b = "restclient_dns.db";

    /* JADX INFO: renamed from: c */
    public static final String f55567c = "restclient_dynamic_dns.db";

    /* JADX INFO: renamed from: d */
    public static final int f55568d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f55569e = 2;

    /* JADX INFO: renamed from: f */
    public static final String f55570f = "httpdns_domain";

    /* JADX INFO: renamed from: j */
    public static final String f55574j = "emergency";

    /* JADX INFO: renamed from: k */
    public static final String f55575k = "dns_domain";

    /* JADX INFO: renamed from: l */
    public static final String f55576l = "domain";

    /* JADX INFO: renamed from: n */
    public static final String f55578n = "ttl";

    /* JADX INFO: renamed from: o */
    public static final String f55579o = "source";

    /* JADX INFO: renamed from: r */
    public static volatile C18252l2 f55582r;

    /* JADX INFO: renamed from: s */
    public static volatile SQLiteDatabase f55583s;

    /* JADX INFO: renamed from: m */
    public static final String f55577m = "ip";

    /* JADX INFO: renamed from: g */
    public static final String f55571g = "createTime";

    /* JADX INFO: renamed from: p */
    public static final String[] f55580p = {"domain", f55577m, "ttl", "source", f55571g};

    /* JADX INFO: renamed from: i */
    public static final String f55573i = "lazyupdate";

    /* JADX INFO: renamed from: h */
    public static final String f55572h = "retryAfter";

    /* JADX INFO: renamed from: q */
    public static final String[] f55581q = {"domain", f55577m, "ttl", "source", f55571g, f55573i, "emergency", f55572h};

    static {
        if (ContextHolder.getKitContext() != null) {
            f55566b = f55567c;
        }
    }

    public C18252l2(Context context) {
        super(context, f55566b, (SQLiteDatabase.CursorFactory) null, 2);
    }

    /* JADX INFO: renamed from: a */
    public static C18238k2 m79024a(String str, C18385v2 c18385v2) {
        C18238k2 c18238k2 = null;
        if (C18196h2.m78675b(c18385v2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = c18385v2.m79686d().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("address", jSONArray);
            C18238k2 c18238k22 = new C18238k2();
            try {
                c18238k22.f55403e = c18385v2.m79687e();
                c18238k22.f55399a = str;
                c18238k22.f55400b = jSONObject.toString();
                c18238k22.f55402d = c18385v2.m79679b();
                return c18238k22;
            } catch (JSONException unused) {
                c18238k2 = c18238k22;
                Logger.m76967w(f55565a, "ConvertAddress Failed:" + c18385v2.toString());
                return c18238k2;
            }
        } catch (JSONException unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C18385v2 m79027b(String str) {
        C18385v2 c18385v2 = new C18385v2();
        if (TextUtils.isEmpty(str)) {
            Logger.m76967w(f55565a, "invalid parameter: domain is null");
            return c18385v2;
        }
        ArrayList<C18238k2> arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m79031t().query(f55575k, f55580p, "domain=?", new String[]{str}, null, null, null);
                if (cursorQuery.getCount() > 0) {
                    while (cursorQuery.moveToNext()) {
                        C18238k2 c18238k2 = new C18238k2();
                        c18238k2.f55399a = cursorQuery.getString(0);
                        c18238k2.f55400b = cursorQuery.getString(1);
                        c18238k2.f55401c = cursorQuery.getLong(2);
                        c18238k2.f55403e = cursorQuery.getInt(3);
                        c18238k2.f55402d = cursorQuery.getLong(4);
                        arrayList.add(c18238k2);
                    }
                }
            } catch (Exception e) {
                Logger.m76967w(f55565a, "query exception:" + e.getClass().getSimpleName());
                if (cursorQuery != null) {
                }
                while (r0.hasNext()) {
                }
                return c18385v2;
            }
            cursorQuery.close();
            for (C18238k2 c18238k22 : arrayList) {
                if (c18238k22.m78962a()) {
                    m79029c(str);
                } else {
                    c18385v2 = m79025a(c18238k22);
                }
            }
            return c18385v2;
        } finally {
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m79029c(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.m76967w(f55565a, "invalid parameter: domain is null");
            return false;
        }
        Logger.m76965v(f55565a, "file cache remove operation:" + str);
        try {
            return m79031t().delete(f55575k, "domain=?", new String[]{str}) >= 0;
        } catch (Exception e) {
            Logger.m76963i(f55565a, "remove exception:".concat(e.getClass().getSimpleName()));
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0061: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:15:0x0061 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap<String, C18385v2> m79030s() throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        C18385v2 c18385v2M79025a;
        HashMap map = new HashMap();
        HashMap<String, C18385v2> map2 = new HashMap<>();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m79031t().query(f55575k, f55580p, null, null, null, null, null);
                try {
                    if (cursorQuery.getCount() > 0) {
                        while (cursorQuery.moveToNext()) {
                            C18238k2 c18238k2 = new C18238k2();
                            c18238k2.f55399a = cursorQuery.getString(0);
                            c18238k2.f55400b = cursorQuery.getString(1);
                            c18238k2.f55401c = cursorQuery.getLong(2);
                            c18238k2.f55403e = cursorQuery.getInt(3);
                            c18238k2.f55402d = cursorQuery.getLong(4);
                            if (!TextUtils.isEmpty(c18238k2.f55399a)) {
                                map.put(c18238k2.f55399a, c18238k2);
                            }
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    Logger.m76967w(f55565a, "getAll exception:" + e.getClass().getSimpleName());
                    if (cursorQuery != null) {
                    }
                    while (r0.hasNext()) {
                    }
                    return map2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        cursorQuery.close();
        for (Map.Entry entry : map.entrySet()) {
            C18238k2 c18238k22 = (C18238k2) entry.getValue();
            Logger.m76966v(f55565a, "Address: %s", c18238k22);
            if (c18238k22.m78962a()) {
                m79029c((String) entry.getKey());
                c18385v2M79025a = null;
            } else {
                c18385v2M79025a = m79025a(c18238k22);
            }
            if (!C18196h2.m78675b(c18385v2M79025a)) {
                map2.put(entry.getKey(), c18385v2M79025a);
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: t */
    public static SQLiteDatabase m79031t() throws SQLiteException {
        if (f55583s == null) {
            if (C18126c2.m78048j().m78053a() == null) {
                throw new SQLiteException("Can't acce ss database");
            }
            synchronized (C18252l2.class) {
                try {
                    if (f55583s == null) {
                        if (f55582r == null) {
                            f55582r = new C18252l2(C18126c2.m78048j().m78053a().createDeviceProtectedStorageContext());
                        }
                        f55583s = f55582r.getWritableDatabase();
                    }
                } finally {
                }
            }
        }
        if (f55583s != null) {
            return f55583s;
        }
        throw new SQLiteException("Can't access database");
    }

    /* JADX INFO: renamed from: u */
    public static boolean m79032u() {
        Logger.m76965v(f55565a, "file cache removeAll operation");
        try {
            m79031t().execSQL("delete from dns_domain");
            return true;
        } catch (Exception e) {
            Logger.m76963i(f55565a, "remove exception:".concat(e.getClass().getSimpleName()));
            return false;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("Create table dns_domain( _id INTEGER PRIMARY KEY AUTOINCREMENT, domain TEXT UNIQUE, ip TEXT, ttl TEXT, source INTEGER, createTime INTEGER);");
        sQLiteDatabase.execSQL("Create table httpdns_domain( _id INTEGER PRIMARY KEY AUTOINCREMENT, domain TEXT UNIQUE, ip TEXT, ttl INTEGER, source INTEGER, createTime INTEGER, lazyupdate INTEGER, emergency TEXT, retryAfter INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1) {
            sQLiteDatabase.execSQL("Alter table dns_domain add column source INTEGER");
            sQLiteDatabase.execSQL("Alter table dns_domain add column createTime INTEGER");
            sQLiteDatabase.execSQL("UPDATE dns_domain SET createTime=ttl");
            sQLiteDatabase.execSQL("UPDATE dns_domain SET ttl=" + C18168f2.m78408a());
            sQLiteDatabase.execSQL("Create table httpdns_domain( _id INTEGER PRIMARY KEY AUTOINCREMENT, domain TEXT UNIQUE, ip TEXT, ttl INTEGER, source INTEGER, createTime INTEGER, lazyupdate INTEGER, emergency TEXT, retryAfter INTEGER);");
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18385v2 m79025a(C18238k2 c18238k2) {
        C18385v2 c18385v2 = new C18385v2();
        try {
            JSONArray jSONArray = new JSONObject(c18238k2.f55400b).getJSONArray("address");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                c18385v2.m79676a(jSONArray.getString(i));
            }
        } catch (JSONException unused) {
            Logger.m76967w(f55565a, "ConvertAddress Failed:" + c18238k2.toString());
        }
        c18385v2.m79681b(c18238k2.f55401c);
        c18385v2.m79675a(c18238k2.f55402d);
        c18385v2.m79680b(c18238k2.f55403e);
        c18385v2.m79674a(1);
        return c18385v2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79028b(String str, C18385v2 c18385v2) {
        if (TextUtils.isEmpty(str)) {
            Logger.m76967w(f55565a, "invalid parameter: domain is null");
            return false;
        }
        Logger.m76966v(f55565a, "insertOrUpdateAddress: %s", str);
        C18238k2 c18238k2M79024a = m79024a(str, c18385v2);
        if (c18238k2M79024a == null) {
            Logger.m76969w(f55565a, "convert address failed, domain:", str);
            return false;
        }
        try {
            SQLiteDatabase sQLiteDatabaseM79031t = m79031t();
            sQLiteDatabaseM79031t.delete(f55575k, "domain=?", new String[]{str});
            return m79026a(sQLiteDatabaseM79031t, c18238k2M79024a);
        } catch (Exception e) {
            Logger.m76967w(f55565a, "insert exception:".concat(e.getClass().getSimpleName()));
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79026a(SQLiteDatabase sQLiteDatabase, C18238k2 c18238k2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("domain", c18238k2.f55399a);
        contentValues.put(f55577m, c18238k2.f55400b);
        contentValues.put("ttl", Long.valueOf(c18238k2.f55401c));
        contentValues.put("source", Integer.valueOf(c18238k2.f55403e));
        contentValues.put(f55571g, Long.valueOf(c18238k2.f55402d));
        return sQLiteDatabase.replace(f55575k, "", contentValues) > 0;
    }
}
