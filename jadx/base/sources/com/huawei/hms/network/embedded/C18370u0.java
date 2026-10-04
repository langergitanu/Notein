package com.huawei.hms.network.embedded;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.inner.api.PolicyNetworkService;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.u0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18370u0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public static final String f56260a = "u0";

    /* JADX INFO: renamed from: b */
    public static String f56261b = "restclient_AI.db";

    /* JADX INFO: renamed from: c */
    public static final String f56262c = "restclient_dynamic_AI.db";

    /* JADX INFO: renamed from: d */
    public static final int f56263d = 3;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.u0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C18370u0 f56264a = new C18370u0();
    }

    public C18370u0() {
        super(ContextHolder.getAppContext().createDeviceProtectedStorageContext(), f56261b, (SQLiteDatabase.CursorFactory) null, 3);
    }

    /* JADX INFO: renamed from: s */
    public static C18370u0 m79589s() {
        return b.f56264a;
    }

    /* JADX INFO: renamed from: a */
    public int m79590a(String str, ContentValues contentValues, String str2, String[] strArr) {
        Logger.m76963i(f56260a, "update");
        return getWritableDatabase().update(str, contentValues, str2, strArr);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C18383v0.m79659a().m79661a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C18383v0.m79659a().m79662a(sQLiteDatabase, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public int m79591a(String str, String str2, String[] strArr) {
        Logger.m76963i(f56260a, RequestParameters.SUBRESOURCE_DELETE);
        return getWritableDatabase().delete(str, str2, strArr);
    }

    /* JADX INFO: renamed from: a */
    public long m79592a(String str, ContentValues contentValues) {
        Logger.m76963i(f56260a, "insert");
        return getWritableDatabase().insert(str, null, contentValues);
    }

    /* JADX INFO: renamed from: a */
    public Cursor m79593a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return m79594a(str, strArr, str2, strArr2, str3, str4, str5, null);
    }

    /* JADX INFO: renamed from: a */
    public Cursor m79594a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        Logger.m76963i(f56260a, "query");
        return getReadableDatabase().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    /* JADX INFO: renamed from: a */
    public static void m79588a(Bundle bundle) {
        if (bundle.getBoolean(PolicyNetworkService.NetworkServiceConstants.IS_DYNAMIC)) {
            f56261b = f56262c;
        }
    }
}
