package o000oo0;

import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import o000000o.C24099OooOoO0;
import o000oo.C24649OooO00o;
import o000oo0.AbstractC24673OooOo0O;
import o000oo0.AbstractC24678OooOoO0;
import o000oo0O.C24704OooO0O0;
import o000oo0O.C24705OooO0OO;
import o000ooO0.AbstractC24732OooO00o;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24748OooO0OO;
import o000ooo.InterfaceC24749OooO0Oo;
import o000oooO.InterfaceC24756OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32444OooOOO0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: o000oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24655OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f83512OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f83513OooO0O0;

    /* JADX INFO: renamed from: o000oo0.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class C19643OooO00o implements InterfaceC24748OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC24748OooO0OO f83514OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ C24671OooOOoo f83515OooO0O0;

        public C19643OooO00o(C24671OooOOoo c24671OooOOoo, InterfaceC24748OooO0OO actual) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(actual, "actual");
            this.f83515OooO0O0 = c24671OooOOoo;
            this.f83514OooO00o = actual;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #6 {all -> 0x009e, blocks: (B:20:0x0048, B:22:0x004c, B:25:0x005b, B:29:0x0062, B:31:0x006c, B:33:0x0077, B:32:0x0072, B:27:0x005f, B:28:0x0061, B:45:0x0096, B:46:0x009d, B:24:0x0056), top: B:67:0x0048, outer: #0, inners: #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0096 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #6 {all -> 0x009e, blocks: (B:20:0x0048, B:22:0x004c, B:25:0x005b, B:29:0x0062, B:31:0x006c, B:33:0x0077, B:32:0x0072, B:27:0x005f, B:28:0x0061, B:45:0x0096, B:46:0x009d, B:24:0x0056), top: B:67:0x0048, outer: #0, inners: #5 }] */
        @Override // o000ooo.InterfaceC24748OooO0OO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC24747OooO0O0 OooO00o(String fileName) {
            FileChannel fileChannel;
            FileChannel fileChannel2;
            kotlin.jvm.internal.OooOOO0.OooO0oO(fileName, "fileName");
            C24671OooOOoo c24671OooOOoo = this.f83515OooO0O0;
            if (!fileName.equals(":memory:")) {
                fileName = c24671OooOOoo.f83565OooO0OO.f83517OooO00o.getDatabasePath(fileName).getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(fileName);
            }
            boolean z = true;
            C24704OooO0O0 c24704OooO0O0 = new C24704OooO0O0(fileName, (c24671OooOOoo.f83512OooO00o || c24671OooOOoo.f83513OooO0O0 || fileName.equals(":memory:")) ? false : true);
            ReentrantLock reentrantLock = c24704OooO0O0.f83750OooO00o;
            reentrantLock.lock();
            C24705OooO0OO c24705OooO0OO = c24704OooO0O0.f83751OooO0O0;
            if (c24705OooO0OO != null) {
                try {
                    c24705OooO0OO.OooO00o();
                    try {
                        try {
                            if (!c24671OooOOoo.f83513OooO0O0) {
                                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                            }
                            InterfaceC24747OooO0O0 interfaceC24747OooO0O0OooO00o = this.f83514OooO00o.OooO00o(fileName);
                            if (c24671OooOOoo.f83512OooO00o) {
                                if (c24671OooOOoo.OooO0Oo().f83523OooO0oO == AbstractC24673OooOo0O.OooO0OO.f83609OooOoO0) {
                                    C24746OooO00o.OooO0o0(interfaceC24747OooO0O0OooO00o, "PRAGMA synchronous = NORMAL");
                                } else {
                                    C24746OooO00o.OooO0o0(interfaceC24747OooO0O0OooO00o, "PRAGMA synchronous = FULL");
                                }
                                AbstractC24655OooO00o.OooO0O0(interfaceC24747OooO0O0OooO00o);
                                c24671OooOOoo.OooO0o0().OooO0Oo(interfaceC24747OooO0O0OooO00o);
                            } else {
                                try {
                                    c24671OooOOoo.f83513OooO0O0 = true;
                                    AbstractC24655OooO00o.OooO00o(c24671OooOOoo, interfaceC24747OooO0O0OooO00o);
                                    c24671OooOOoo.f83513OooO0O0 = false;
                                } catch (Throwable th) {
                                    c24671OooOOoo.f83513OooO0O0 = false;
                                    throw th;
                                }
                            }
                            if (c24705OooO0OO != null && (fileChannel2 = c24705OooO0OO.f83753OooO0O0) != null) {
                                try {
                                    fileChannel2.close();
                                    c24705OooO0OO.f83753OooO0O0 = null;
                                } finally {
                                }
                            }
                            return interfaceC24747OooO0O0OooO00o;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        if (c24705OooO0OO != null && (fileChannel = c24705OooO0OO.f83753OooO0O0) != null) {
                            try {
                                fileChannel.close();
                                c24705OooO0OO.f83753OooO0O0 = null;
                            } finally {
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z = false;
                }
            } else {
                if (!c24671OooOOoo.f83513OooO0O0) {
                }
            }
            try {
                if (z) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + fileName + "'. Was a proper path / name used in Room's database builder?", th);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final void OooO00o(C24671OooOOoo c24671OooOOoo, InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        Object objOooO00o;
        AbstractC24673OooOo0O.OooO0OO oooO0OO = c24671OooOOoo.f83565OooO0OO.f83523OooO0oO;
        AbstractC24673OooOo0O.OooO0OO oooO0OO2 = AbstractC24673OooOo0O.OooO0OO.f83609OooOoO0;
        if (oooO0OO == oooO0OO2) {
            C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "PRAGMA journal_mode = WAL");
        } else {
            C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "PRAGMA journal_mode = TRUNCATE");
        }
        if (c24671OooOOoo.OooO0Oo().f83523OooO0oO == oooO0OO2) {
            C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "PRAGMA synchronous = NORMAL");
        } else {
            C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "PRAGMA synchronous = FULL");
        }
        OooO0O0(interfaceC24747OooO0O0);
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = interfaceC24747OooO0O0.o0ooOOo("PRAGMA user_version");
        try {
            interfaceC24749OooO0OoO0ooOOo.o00oO0o();
            int i = (int) interfaceC24749OooO0OoO0ooOOo.getLong(0);
            interfaceC24749OooO0OoO0ooOOo.close();
            AbstractC24678OooOoO0 abstractC24678OooOoO0 = c24671OooOOoo.f83566OooO0Oo;
            if (i != abstractC24678OooOoO0.f83620OooO00o) {
                C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        c24671OooOOoo.OooO0o(interfaceC24747OooO0O0);
                    } else {
                        c24671OooOOoo.OooO0oO(interfaceC24747OooO0O0, i, abstractC24678OooOoO0.f83620OooO00o);
                    }
                    C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "PRAGMA user_version = " + abstractC24678OooOoO0.f83620OooO00o);
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
                if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
                    C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "END TRANSACTION");
                }
                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                    C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "ROLLBACK TRANSACTION");
                    throw thOooO00o;
                }
            }
            c24671OooOOoo.OooO0oo(interfaceC24747OooO0O0);
        } finally {
        }
    }

    public static void OooO0O0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = interfaceC24747OooO0O0.o0ooOOo("PRAGMA busy_timeout");
        try {
            interfaceC24749OooO0OoO0ooOOo.o00oO0o();
            long j = interfaceC24749OooO0OoO0ooOOo.getLong(0);
            interfaceC24749OooO0OoO0ooOOo.close();
            if (j < 3000) {
                C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C24099OooOoO0.OooO0o0(interfaceC24749OooO0OoO0ooOOo, th);
                throw th2;
            }
        }
    }

    public final void OooO(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + OooO0o0().f83621OooO0O0 + "')");
    }

    public abstract List<AbstractC24673OooOo0O.OooO0O0> OooO0OO();

    public abstract C24656OooO0O0 OooO0Oo();

    public final void OooO0o(InterfaceC24747OooO0O0 connection) throws Exception {
        kotlin.jvm.internal.OooOOO0.OooO0oO(connection, "connection");
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                if (interfaceC24749OooO0OoO0ooOOo.getLong(0) == 0) {
                    z = true;
                }
            }
            interfaceC24749OooO0OoO0ooOOo.close();
            OooO0o0().OooO00o(connection);
            if (!z) {
                AbstractC24678OooOoO0.OooO00o oooO00oOooO0oO = OooO0o0().OooO0oO(connection);
                if (!oooO00oOooO0oO.f83623OooO00o) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + oooO00oOooO0oO.f83624OooO0O0).toString());
                }
            }
            OooO(connection);
            OooO0o0().OooO0OO(connection);
            Iterator<T> it = OooO0OO().iterator();
            while (it.hasNext()) {
                ((AbstractC24673OooOo0O.OooO0O0) it.next()).getClass();
                if (connection instanceof C24649OooO00o) {
                    InterfaceC24756OooO0O0 db = ((C24649OooO00o) connection).f83490OooOo0o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(db, "db");
                }
            }
        } finally {
        }
    }

    public abstract AbstractC24678OooOoO0 OooO0o0();

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0oO(InterfaceC24747OooO0O0 connection, int i, int i2) throws Exception {
        kotlin.jvm.internal.OooOOO0.OooO0oO(connection, "connection");
        List<AbstractC24732OooO00o> listOooO00o = o000ooOO.OooOO0O.OooO00o(OooO0Oo().f83520OooO0Oo, i, i2);
        if (listOooO00o != null) {
            OooO0o0().OooO0o(connection);
            for (AbstractC24732OooO00o abstractC24732OooO00o : listOooO00o) {
                abstractC24732OooO00o.getClass();
                if (!(connection instanceof C24649OooO00o)) {
                    throw new C32444OooOOO0("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                abstractC24732OooO00o.OooO00o(((C24649OooO00o) connection).f83490OooOo0o);
            }
            AbstractC24678OooOoO0.OooO00o oooO00oOooO0oO = OooO0o0().OooO0oO(connection);
            if (!oooO00oOooO0oO.f83623OooO00o) {
                throw new IllegalStateException(("Migration didn't properly handle: " + oooO00oOooO0oO.f83624OooO0O0).toString());
            }
            OooO0o0().OooO0o0(connection);
            OooO(connection);
            return;
        }
        if (o000ooOO.OooOO0O.OooO0O0(OooO0Oo(), i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (OooO0Oo().f83534OooOOoo) {
            InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                    String strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(0);
                    if (!C33595OooOOo.OooOoO0(strO000OoO, "sqlite_", false) && !strO000OoO.equals("android_metadata")) {
                        c32465OooO0O0OooO0Oo.add(new C32443OooOOO(strO000OoO, Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC24749OooO0OoO0ooOOo.o000OoO(1), "view"))));
                    }
                }
                C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                interfaceC24749OooO0OoO0ooOOo.close();
                ListIterator listIterator = c32465OooO0O0OooO0O0.listIterator(0);
                while (true) {
                    C32465OooO0O0.C20232OooO0O0 c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                    if (!c20232OooO0O0.hasNext()) {
                        break;
                    }
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) c20232OooO0O0.next();
                    String str = (String) c32443OooOOO.f116638OooOo0o;
                    if (((Boolean) c32443OooOOO.f116637OooOo).booleanValue()) {
                        C24746OooO00o.OooO0o0(connection, "DROP VIEW IF EXISTS " + str);
                    } else {
                        C24746OooO00o.OooO0o0(connection, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            OooO0o0().OooO0O0(connection);
        }
        Iterator<T> it = OooO0OO().iterator();
        while (it.hasNext()) {
            ((AbstractC24673OooOo0O.OooO0O0) it.next()).getClass();
            if (connection instanceof C24649OooO00o) {
                InterfaceC24756OooO0O0 db = ((C24649OooO00o) connection).f83490OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(db, "db");
            }
        }
        OooO0o0().OooO00o(connection);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0oo(InterfaceC24747OooO0O0 connection) throws Exception {
        boolean z;
        Object objOooO00o;
        AbstractC24678OooOoO0.OooO00o oooO00oOooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(connection, "connection");
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                z = interfaceC24749OooO0OoO0ooOOo.getLong(0) != 0;
            }
            interfaceC24749OooO0OoO0ooOOo.close();
            if (z) {
                interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strO000OoO = interfaceC24749OooO0OoO0ooOOo.o00oO0o() ? interfaceC24749OooO0OoO0ooOOo.o000OoO(0) : null;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    if (!OooO0o0().f83621OooO0O0.equals(strO000OoO) && !OooO0o0().f83622OooO0OO.equals(strO000OoO)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + OooO0o0().f83621OooO0O0 + ", found: " + strO000OoO).toString());
                    }
                } finally {
                }
            } else {
                C24746OooO00o.OooO0o0(connection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    oooO00oOooO0oO = OooO0o0().OooO0oO(connection);
                } catch (Throwable th) {
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
                if (!oooO00oOooO0oO.f83623OooO00o) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + oooO00oOooO0oO.f83624OooO0O0).toString());
                }
                OooO0o0().OooO0o0(connection);
                OooO(connection);
                objOooO00o = C32460OooOooO.f116667OooO00o;
                if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
                    C24746OooO00o.OooO0o0(connection, "END TRANSACTION");
                }
                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                    C24746OooO00o.OooO0o0(connection, "ROLLBACK TRANSACTION");
                    throw thOooO00o;
                }
            }
            OooO0o0().OooO0Oo(connection);
            for (AbstractC24673OooOo0O.OooO0O0 oooO0O0 : OooO0OO()) {
                oooO0O0.getClass();
                if (connection instanceof C24649OooO00o) {
                    oooO0O0.OooO00o(((C24649OooO00o) connection).f83490OooOo0o);
                }
            }
            this.f83512OooO00o = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
