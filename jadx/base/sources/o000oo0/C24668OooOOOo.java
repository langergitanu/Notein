package o000oo0;

import android.content.Context;
import o000oo0.AbstractC24673OooOo0O;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: o000oo0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24668OooOOOo {
    public static final AbstractC24673OooOo0O.OooO00o OooO00o(Context context, String str, Class cls) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        if (str == null || C33599OooOo0O.Oooo0o0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new AbstractC24673OooOo0O.OooO00o(context, str, cls);
    }
}
