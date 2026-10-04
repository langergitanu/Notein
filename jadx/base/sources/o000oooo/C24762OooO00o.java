package o000oooo;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.internal.OooOOO0;
import o000oooO.InterfaceC24760OooO0o0;
import oO0O000o.InterfaceC32509OooOOo;

/* JADX INFO: renamed from: o000oooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24762OooO00o implements InterfaceC32509OooOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC24760OooO0o0 f83967OooOo0o;

    public /* synthetic */ C24762OooO00o(InterfaceC24760OooO0o0 interfaceC24760OooO0o0) {
        this.f83967OooOo0o = interfaceC24760OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        OooOOO0.OooO0Oo(sQLiteQuery);
        this.f83967OooOo0o.OooO0OO(new C24771OooOO0O(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
