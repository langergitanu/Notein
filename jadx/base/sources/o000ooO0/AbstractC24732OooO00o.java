package o000ooO0;

import kotlin.jvm.internal.OooOOO0;
import o000oooO.InterfaceC24756OooO0O0;
import oO00ooO.C32444OooOOO0;

/* JADX INFO: renamed from: o000ooO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24732OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f83864OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f83865OooO0O0;

    public AbstractC24732OooO00o(int i, int i2) {
        this.f83864OooO00o = i;
        this.f83865OooO0O0 = i2;
    }

    public void OooO00o(InterfaceC24756OooO0O0 db) {
        OooOOO0.OooO0oO(db, "db");
        throw new C32444OooOOO0("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
