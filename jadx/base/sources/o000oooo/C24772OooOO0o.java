package o000oooo;

import android.database.sqlite.SQLiteStatement;
import o000oooO.InterfaceC24759OooO0o;

/* JADX INFO: renamed from: o000oooo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24772OooOO0o extends C24771OooOO0O implements InterfaceC24759OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final SQLiteStatement f84000OooOo;

    public C24772OooOO0o(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f84000OooOo = sQLiteStatement;
    }

    @Override // o000oooO.InterfaceC24759OooO0o
    public final int OooOo0() {
        return this.f84000OooOo.executeUpdateDelete();
    }

    @Override // o000oooO.InterfaceC24759OooO0o
    public final void execute() {
        this.f84000OooOo.execute();
    }

    @Override // o000oooO.InterfaceC24759OooO0o
    public final long o0000OOo() {
        return this.f84000OooOo.executeInsert();
    }
}
