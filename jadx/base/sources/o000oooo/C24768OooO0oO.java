package o000oooo;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o000oooO.InterfaceC24756OooO0O0;
import o000oooO.InterfaceC24757OooO0OO;
import o000oooo.C24768OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: o000oooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24768OooO0oO implements InterfaceC24757OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f83975OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f83976OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f83977OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC24757OooO0OO.OooO00o f83978OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C32447OooOOo f83979OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f83980OooOoo0;

    /* JADX INFO: renamed from: o000oooo.OooO0oO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C24767OooO0o0 f83981OooO00o = null;
    }

    /* JADX INFO: renamed from: o000oooo.OooO0oO$OooO0O0 */
    public static final class OooO0O0 extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final /* synthetic */ int f83982OooOoo = 0;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO00o f83983OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Context f83984OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f83985OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final InterfaceC24757OooO0OO.OooO00o f83986OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final o00.OooO00o f83987OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public boolean f83988OooOoo0;

        /* JADX INFO: renamed from: o000oooo.OooO0oO$OooO0O0$OooO00o */
        public static final class OooO00o extends RuntimeException {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final Throwable f83989OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final EnumC19652OooO0O0 f83990OooOo0o;

            public OooO00o(EnumC19652OooO0O0 enumC19652OooO0O0, Throwable th) {
                super(th);
                this.f83990OooOo0o = enumC19652OooO0O0;
                this.f83989OooOo = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f83989OooOo;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o000oooo.OooO0oO$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class EnumC19652OooO0O0 {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final EnumC19652OooO0O0 f83991OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final EnumC19652OooO0O0 f83992OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public static final EnumC19652OooO0O0 f83993OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final EnumC19652OooO0O0 f83994OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public static final EnumC19652OooO0O0 f83995OooOoOO;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public static final /* synthetic */ EnumC19652OooO0O0[] f83996OooOoo0;

            static {
                EnumC19652OooO0O0 enumC19652OooO0O0 = new EnumC19652OooO0O0("ON_CONFIGURE", 0);
                f83992OooOo0o = enumC19652OooO0O0;
                EnumC19652OooO0O0 enumC19652OooO0O02 = new EnumC19652OooO0O0("ON_CREATE", 1);
                f83991OooOo = enumC19652OooO0O02;
                EnumC19652OooO0O0 enumC19652OooO0O03 = new EnumC19652OooO0O0("ON_UPGRADE", 2);
                f83994OooOoO0 = enumC19652OooO0O03;
                EnumC19652OooO0O0 enumC19652OooO0O04 = new EnumC19652OooO0O0("ON_DOWNGRADE", 3);
                f83993OooOoO = enumC19652OooO0O04;
                EnumC19652OooO0O0 enumC19652OooO0O05 = new EnumC19652OooO0O0("ON_OPEN", 4);
                f83995OooOoOO = enumC19652OooO0O05;
                EnumC19652OooO0O0[] enumC19652OooO0O0Arr = {enumC19652OooO0O0, enumC19652OooO0O02, enumC19652OooO0O03, enumC19652OooO0O04, enumC19652OooO0O05};
                f83996OooOoo0 = enumC19652OooO0O0Arr;
                OooO.OooO00o.OooO0O0(enumC19652OooO0O0Arr);
            }

            public EnumC19652OooO0O0() {
                throw null;
            }

            public static EnumC19652OooO0O0 valueOf(String str) {
                return (EnumC19652OooO0O0) Enum.valueOf(EnumC19652OooO0O0.class, str);
            }

            public static EnumC19652OooO0O0[] values() {
                return (EnumC19652OooO0O0[]) f83996OooOoo0.clone();
            }
        }

        /* JADX INFO: renamed from: o000oooo.OooO0oO$OooO0O0$OooO0OO */
        public static final class OooO0OO {
            public static C24767OooO0o0 OooO00o(OooO00o refHolder, SQLiteDatabase sQLiteDatabase) {
                OooOOO0.OooO0oO(refHolder, "refHolder");
                C24767OooO0o0 c24767OooO0o0 = refHolder.f83981OooO00o;
                if (c24767OooO0o0 != null && c24767OooO0o0.f83974OooOo0o.equals(sQLiteDatabase)) {
                    return c24767OooO0o0;
                }
                C24767OooO0o0 c24767OooO0o02 = new C24767OooO0o0(sQLiteDatabase);
                refHolder.f83981OooO00o = c24767OooO0o02;
                return c24767OooO0o02;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, String str, final OooO00o oooO00o, final InterfaceC24757OooO0OO.OooO00o callback) {
            super(context, str, null, callback.f83962OooO00o, new DatabaseErrorHandler() { // from class: o000oooo.OooO0oo
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    int i = C24768OooO0oO.OooO0O0.f83982OooOoo;
                    OooOOO0.OooO0Oo(sQLiteDatabase);
                    C24767OooO0o0 c24767OooO0o0OooO00o = C24768OooO0oO.OooO0O0.OooO0OO.OooO00o(oooO00o, sQLiteDatabase);
                    callback.getClass();
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c24767OooO0o0OooO00o + ".path");
                    SQLiteDatabase sQLiteDatabase2 = c24767OooO0o0OooO00o.f83974OooOo0o;
                    if (!sQLiteDatabase2.isOpen()) {
                        String path = sQLiteDatabase2.getPath();
                        if (path != null) {
                            InterfaceC24757OooO0OO.OooO00o.OooO00o(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
                            attachedDbs = sQLiteDatabase2.getAttachedDbs();
                        } finally {
                            if (attachedDbs != null) {
                                Iterator<T> it = attachedDbs.iterator();
                                while (it.hasNext()) {
                                    Object second = ((Pair) it.next()).second;
                                    OooOOO0.OooO0o(second, "second");
                                    InterfaceC24757OooO0OO.OooO00o.OooO00o((String) second);
                                }
                            } else {
                                String path2 = sQLiteDatabase2.getPath();
                                if (path2 != null) {
                                    InterfaceC24757OooO0OO.OooO00o.OooO00o(path2);
                                }
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        c24767OooO0o0OooO00o.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                }
            });
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(callback, "callback");
            this.f83984OooOo0o = context;
            this.f83983OooOo = oooO00o;
            this.f83986OooOoO0 = callback;
            this.f83987OooOoOO = new o00.OooO00o(str == null ? C24761OooO.OooO00o("toString(...)") : str, context.getCacheDir(), false);
        }

        public final InterfaceC24756OooO0O0 OooO00o(boolean z) {
            o00.OooO00o oooO00o = this.f83987OooOoOO;
            try {
                oooO00o.OooO00o((this.f83988OooOoo0 || getDatabaseName() == null) ? false : true);
                this.f83985OooOoO = false;
                SQLiteDatabase sQLiteDatabaseOooO0OO = OooO0OO(z);
                if (!this.f83985OooOoO) {
                    C24767OooO0o0 c24767OooO0o0OooO00o = OooO0OO.OooO00o(this.f83983OooOo, sQLiteDatabaseOooO0OO);
                    oooO00o.OooO0O0();
                    return c24767OooO0o0OooO00o;
                }
                close();
                InterfaceC24756OooO0O0 interfaceC24756OooO0O0OooO00o = OooO00o(z);
                oooO00o.OooO0O0();
                return interfaceC24756OooO0O0OooO00o;
            } catch (Throwable th) {
                oooO00o.OooO0O0();
                throw th;
            }
        }

        public final SQLiteDatabase OooO0OO(boolean z) throws Throwable {
            SQLiteDatabase readableDatabase;
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.f83988OooOoo0;
            if (databaseName != null && !z2 && (parentFile = this.f83984OooOo0o.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                if (z) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    OooOOO0.OooO0Oo(writableDatabase);
                    return writableDatabase;
                }
                SQLiteDatabase readableDatabase2 = getReadableDatabase();
                OooOOO0.OooO0Oo(readableDatabase2);
                return readableDatabase2;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        OooOOO0.OooO0Oo(readableDatabase);
                    } else {
                        readableDatabase = getReadableDatabase();
                        OooOOO0.OooO0Oo(readableDatabase);
                    }
                    return readableDatabase;
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof OooO00o) {
                        OooO00o oooO00o = (OooO00o) th;
                        int iOrdinal = oooO00o.f83990OooOo0o.ordinal();
                        th = oooO00o.f83989OooOo;
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                            throw th;
                        }
                        if (iOrdinal != 4) {
                            throw new C32442OooOO0o();
                        }
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                    }
                    boolean z3 = th instanceof SQLiteException;
                    throw th;
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            o00.OooO00o oooO00o = this.f83987OooOoOO;
            try {
                oooO00o.OooO00o(oooO00o.f80960OooO00o);
                super.close();
                this.f83983OooOo.f83981OooO00o = null;
                this.f83988OooOoo0 = false;
            } finally {
                oooO00o.OooO0O0();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase db) {
            OooOOO0.OooO0oO(db, "db");
            boolean z = this.f83985OooOoO;
            InterfaceC24757OooO0OO.OooO00o oooO00o = this.f83986OooOoO0;
            if (!z && oooO00o.f83962OooO00o != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                oooO00o.OooO0O0(OooO0OO.OooO00o(this.f83983OooOo, db));
            } catch (Throwable th) {
                throw new OooO00o(EnumC19652OooO0O0.f83992OooOo0o, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sqLiteDatabase) {
            OooOOO0.OooO0oO(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f83986OooOoO0.OooO0OO(OooO0OO.OooO00o(this.f83983OooOo, sqLiteDatabase));
            } catch (Throwable th) {
                throw new OooO00o(EnumC19652OooO0O0.f83991OooOo, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase db, int i, int i2) {
            OooOOO0.OooO0oO(db, "db");
            this.f83985OooOoO = true;
            try {
                this.f83986OooOoO0.OooO0Oo(OooO0OO.OooO00o(this.f83983OooOo, db), i, i2);
            } catch (Throwable th) {
                throw new OooO00o(EnumC19652OooO0O0.f83993OooOoO, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase db) {
            OooOOO0.OooO0oO(db, "db");
            if (!this.f83985OooOoO) {
                try {
                    this.f83986OooOoO0.OooO0o0(OooO0OO.OooO00o(this.f83983OooOo, db));
                } catch (Throwable th) {
                    throw new OooO00o(EnumC19652OooO0O0.f83995OooOoOO, th);
                }
            }
            this.f83988OooOoo0 = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
            OooOOO0.OooO0oO(sqLiteDatabase, "sqLiteDatabase");
            this.f83985OooOoO = true;
            try {
                this.f83986OooOoO0.OooO0o(OooO0OO.OooO00o(this.f83983OooOo, sqLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new OooO00o(EnumC19652OooO0O0.f83994OooOoO0, th);
            }
        }
    }

    public C24768OooO0oO(Context context, String str, InterfaceC24757OooO0OO.OooO00o callback, boolean z) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(callback, "callback");
        this.f83976OooOo0o = context;
        this.f83975OooOo = str;
        this.f83978OooOoO0 = callback;
        this.f83977OooOoO = z;
        this.f83979OooOoOO = C20519OooO0Oo.OooO0OO(new C24766OooO0o(this, 0));
    }

    @Override // o000oooO.InterfaceC24757OooO0OO
    public final InterfaceC24756OooO0O0 OooooOO() {
        return ((OooO0O0) this.f83979OooOoOO.getValue()).OooO00o(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C32447OooOOo c32447OooOOo = this.f83979OooOoOO;
        if (c32447OooOOo.isInitialized()) {
            ((OooO0O0) c32447OooOOo.getValue()).close();
        }
    }

    @Override // o000oooO.InterfaceC24757OooO0OO
    public final String getDatabaseName() {
        return this.f83975OooOo;
    }

    @Override // o000oooO.InterfaceC24757OooO0OO
    public final InterfaceC24756OooO0O0 o0000oOo() {
        return ((OooO0O0) this.f83979OooOoOO.getValue()).OooO00o(false);
    }

    @Override // o000oooO.InterfaceC24757OooO0OO
    public final void setWriteAheadLoggingEnabled(boolean z) {
        C32447OooOOo c32447OooOOo = this.f83979OooOoOO;
        if (c32447OooOOo.isInitialized()) {
            ((OooO0O0) c32447OooOOo.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.f83980OooOoo0 = z;
    }
}
