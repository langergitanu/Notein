package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzei extends SQLiteOpenHelper {
    public static final zzeg zza = new zzeg(null);
    private static final int zzb = zzeg.zzc("18.6.1");
    private static final String zzc = zzeg.zzd("18.6.1");
    private static zzei zzd;

    public /* synthetic */ zzei(Context context, C24018OooO0oo c24018OooO0oo) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(OooOo.o000oOoO(list, ", ", "(", ")", zzeh.zza, 24))), null);
    }

    public final int zzb() {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i = -1;
        try {
            if (cursorRawQuery.moveToNext()) {
                i = cursorRawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
        cursorRawQuery.close();
        return i;
    }

    public final List zzd() {
        Cursor cursorQuery = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        List arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("id"));
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("ss"));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("ts"));
                    OooOOO0.OooO0Oo(string);
                    arrayList.add(new zzej(string, j, i));
                } catch (Exception unused) {
                    arrayList = C34434OooOoO.f123453OooOo0o;
                }
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(zzej zzejVar) {
        return zza(com.facebook.soloader.OooOo.OooO0oO(zzejVar)) == 1;
    }
}
