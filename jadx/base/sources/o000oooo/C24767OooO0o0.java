package o000oooo;

import OooOoOO.C20519OooO0Oo;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.OooOOO0;
import o000oooO.InterfaceC24756OooO0O0;
import o000oooO.InterfaceC24759OooO0o;
import o000oooO.InterfaceC24760OooO0o0;
import oO00ooO.EnumC32441OooOO0O;

/* JADX INFO: renamed from: o000oooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24767OooO0o0 implements InterfaceC24756OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final String[] f83971OooOo = new String[0];

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final Object f83972OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final Object f83973OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final SQLiteDatabase f83974OooOo0o;

    /* JADX INFO: renamed from: o000oooo.OooO0o0$OooO00o */
    public static final class OooO00o {
    }

    static {
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        f83973OooOoO0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C24764OooO0OO());
        f83972OooOoO = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C24765OooO0Oo());
    }

    public C24767OooO0o0(SQLiteDatabase sQLiteDatabase) {
        this.f83974OooOo0o = sQLiteDatabase;
    }

    @Override // o000oooO.InterfaceC24756OooO0O0
    public final void OooOOo() {
        this.f83974OooOo0o.beginTransaction();
    }

    @Override // o000oooO.InterfaceC24756OooO0O0
    public final void OooOoo() {
        this.f83974OooOo0o.beginTransactionNonExclusive();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // o000oooO.InterfaceC24756OooO0O0
    public final void OoooOOO() throws IllegalAccessException, InvocationTargetException {
        ?? r0 = f83972OooOoO;
        if (((Method) r0.getValue()) != null) {
            ?? r1 = f83973OooOoO0;
            if (((Method) r1.getValue()) != null) {
                Method method = (Method) r0.getValue();
                OooOOO0.OooO0Oo(method);
                Method method2 = (Method) r1.getValue();
                OooOOO0.OooO0Oo(method2);
                Object objInvoke = method2.invoke(this.f83974OooOo0o, new Object[0]);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        OooOOo();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f83974OooOo0o.close();
    }

    @Override // o000oooO.InterfaceC24756OooO0O0
    public final boolean isOpen() {
        return this.f83974OooOo0o.isOpen();
    }

    @Override // o000oooO.InterfaceC24756OooO0O0
    public final void o00000O0() {
        this.f83974OooOo0o.setTransactionSuccessful();
    }

    @Override // o000oooO.InterfaceC24756OooO0O0
    public final InterfaceC24759OooO0o o0000Oo(String sql) {
        OooOOO0.OooO0oO(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f83974OooOo0o.compileStatement(sql);
        OooOOO0.OooO0o(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new C24772OooOO0o(sQLiteStatementCompileStatement);
    }

    @Override // o000oooO.InterfaceC24756OooO0O0
    public final void o0000Ooo() {
        this.f83974OooOo0o.endTransaction();
    }

    @Override // o000oooO.InterfaceC24756OooO0O0
    public final void o0000oOO(Object[] objArr) throws SQLException {
        this.f83974OooOo0o.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // o000oooO.InterfaceC24756OooO0O0
    public final boolean o000O00() {
        return this.f83974OooOo0o.inTransaction();
    }

    @Override // o000oooO.InterfaceC24756OooO0O0
    public final boolean o000O0Oo() {
        return this.f83974OooOo0o.isWriteAheadLoggingEnabled();
    }

    @Override // o000oooO.InterfaceC24756OooO0O0
    public final Cursor o0ooOoO(InterfaceC24760OooO0o0 interfaceC24760OooO0o0) {
        final C24762OooO00o c24762OooO00o = new C24762OooO00o(interfaceC24760OooO0o0);
        Cursor cursorRawQueryWithFactory = this.f83974OooOo0o.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: o000oooo.OooO0O0
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) c24762OooO00o.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, interfaceC24760OooO0o0.OooO00o(), f83971OooOo, null);
        OooOOO0.OooO0o(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // o000oooO.InterfaceC24756OooO0O0
    public final void oo0o0Oo(String sql) throws SQLException {
        OooOOO0.OooO0oO(sql, "sql");
        this.f83974OooOo0o.execSQL(sql);
    }
}
