package o000oo0;

import Oooo0.C20856OooooOo;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o000oo.C24649OooO00o;
import o000oo0.AbstractC24673OooOo0O;
import o000ooO0.AbstractC24732OooO00o;
import o000ooOO.C24734OooO0O0;
import o000oooO.C24755OooO00o;
import o000oooO.InterfaceC24757OooO0OO;
import o000oooo.C24767OooO0o0;
import oO00ooO.C32443OooOOO;
import oO00ooOO.C32465OooO0O0;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: o000oo0.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24679OooOoOO extends InterfaceC24757OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C24656OooO0O0 f83625OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<AbstractC24673OooOo0O.OooO0O0> f83626OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WorkDatabase_Impl.OooO00o f83627OooO0Oo;

    /* JADX INFO: renamed from: o000oo0.OooOoOO$OooO00o */
    public static abstract class OooO00o {
    }

    /* JADX INFO: renamed from: o000oo0.OooOoOO$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f83628OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f83629OooO0O0;

        public OooO0O0(boolean z, String str) {
            this.f83628OooO00o = z;
            this.f83629OooO0O0 = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24679OooOoOO(C24656OooO0O0 configuration, WorkDatabase_Impl.OooO00o oooO00o) {
        super(12);
        kotlin.jvm.internal.OooOOO0.OooO0oO(configuration, "configuration");
        this.f83626OooO0OO = configuration.f83522OooO0o0;
        this.f83625OooO0O0 = configuration;
        this.f83627OooO0Oo = oooO00o;
    }

    @Override // o000oooO.InterfaceC24757OooO0OO.OooO00o
    public final void OooO0O0(C24767OooO0o0 c24767OooO0o0) {
    }

    @Override // o000oooO.InterfaceC24757OooO0OO.OooO00o
    public final void OooO0OO(C24767OooO0o0 c24767OooO0o0) throws IOException {
        Cursor cursorO0ooOoO = c24767OooO0o0.o0ooOoO(new C24755OooO00o("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            Cursor cursor = cursorO0ooOoO;
            boolean z = false;
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) == 0) {
                    z = true;
                }
            }
            cursorO0ooOoO.close();
            WorkDatabase_Impl.OooO00o oooO00o = this.f83627OooO0Oo;
            oooO00o.OooO00o(c24767OooO0o0);
            if (!z) {
                OooO0O0 OooO0O02 = oooO00o.OooO0O0(c24767OooO0o0);
                if (!OooO0O02.f83628OooO00o) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + OooO0O02.f83629OooO0O0);
                }
            }
            c24767OooO0o0.oo0o0Oo("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c24767OooO0o0.oo0o0Oo("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            int i = WorkDatabase_Impl.f66709OooOo0;
            WorkDatabase_Impl.this.getClass();
            List<AbstractC24673OooOo0O.OooO0O0> list = this.f83626OooO0OO;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((AbstractC24673OooOo0O.OooO0O0) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                oO0O000.OooO00o.OooO00o(cursorO0ooOoO, th);
                throw th2;
            }
        }
    }

    @Override // o000oooO.InterfaceC24757OooO0OO.OooO00o
    public final void OooO0Oo(C24767OooO0o0 c24767OooO0o0, int i, int i2) throws Exception {
        OooO0o(c24767OooO0o0, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o000oooO.InterfaceC24757OooO0OO.OooO00o
    public final void OooO0o(C24767OooO0o0 c24767OooO0o0, int i, int i2) throws Exception {
        C24656OooO0O0 c24656OooO0O0 = this.f83625OooO0O0;
        WorkDatabase_Impl.OooO00o oooO00o = this.f83627OooO0Oo;
        if (c24656OooO0O0 != null) {
            AbstractC24673OooOo0O.C24674OooO0Oo c24674OooO0Oo = c24656OooO0O0.f83520OooO0Oo;
            c24674OooO0Oo.getClass();
            List<AbstractC24732OooO00o> listOooO00o = o000ooOO.OooOO0O.OooO00o(c24674OooO0Oo, i, i2);
            if (listOooO00o != null) {
                C24734OooO0O0.OooO0O0(new C24649OooO00o(c24767OooO0o0));
                for (AbstractC24732OooO00o abstractC24732OooO00o : listOooO00o) {
                    abstractC24732OooO00o.getClass();
                    abstractC24732OooO00o.OooO00o(c24767OooO0o0);
                }
                OooO0O0 OooO0O02 = oooO00o.OooO0O0(c24767OooO0o0);
                if (!OooO0O02.f83628OooO00o) {
                    throw new IllegalStateException("Migration didn't properly handle: " + OooO0O02.f83629OooO0O0);
                }
                c24767OooO0o0.oo0o0Oo("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c24767OooO0o0.oo0o0Oo("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
                return;
            }
        }
        C24656OooO0O0 c24656OooO0O02 = this.f83625OooO0O0;
        if (c24656OooO0O02 == null || o000ooOO.OooOO0O.OooO0O0(c24656OooO0O02, i, i2)) {
            throw new IllegalStateException(C20856OooooOo.OooO0O0("A migration from ", i, " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.", i2));
        }
        if (c24656OooO0O02.f83534OooOOoo) {
            Cursor cursorO0ooOoO = c24767OooO0o0.o0ooOoO(new C24755OooO00o("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                Cursor cursor = cursorO0ooOoO;
                C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
                    if (!C33595OooOOo.OooOoO0(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        c32465OooO0O0OooO0Oo.add(new C32443OooOOO(string, Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0(cursor.getString(1), "view"))));
                    }
                }
                C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                cursorO0ooOoO.close();
                ListIterator listIterator = c32465OooO0O0OooO0O0.listIterator(0);
                while (true) {
                    C32465OooO0O0.C20232OooO0O0 c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                    if (!c20232OooO0O0.hasNext()) {
                        break;
                    }
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) c20232OooO0O0.next();
                    String str = (String) c32443OooOOO.f116638OooOo0o;
                    if (((Boolean) c32443OooOOO.f116637OooOo).booleanValue()) {
                        c24767OooO0o0.oo0o0Oo("DROP VIEW IF EXISTS " + str);
                    } else {
                        c24767OooO0o0.oo0o0Oo("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            c24767OooO0o0.oo0o0Oo("DROP TABLE IF EXISTS `Dependency`");
            c24767OooO0o0.oo0o0Oo("DROP TABLE IF EXISTS `WorkSpec`");
            c24767OooO0o0.oo0o0Oo("DROP TABLE IF EXISTS `WorkTag`");
            c24767OooO0o0.oo0o0Oo("DROP TABLE IF EXISTS `SystemIdInfo`");
            c24767OooO0o0.oo0o0Oo("DROP TABLE IF EXISTS `WorkName`");
            c24767OooO0o0.oo0o0Oo("DROP TABLE IF EXISTS `WorkProgress`");
            c24767OooO0o0.oo0o0Oo("DROP TABLE IF EXISTS `Preference`");
            int i3 = WorkDatabase_Impl.f66709OooOo0;
            WorkDatabase_Impl.this.getClass();
        }
        List<AbstractC24673OooOo0O.OooO0O0> list = this.f83626OooO0OO;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((AbstractC24673OooOo0O.OooO0O0) it.next()).getClass();
            }
        }
        oooO00o.OooO00o(c24767OooO0o0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @Override // o000oooO.InterfaceC24757OooO0OO.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0o0(C24767OooO0o0 c24767OooO0o0) throws Exception {
        boolean z;
        WorkDatabase_Impl.OooO00o oooO00o = this.f83627OooO0Oo;
        Cursor cursorO0ooOoO = c24767OooO0o0.o0ooOoO(new C24755OooO00o("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
        try {
            Cursor cursor = cursorO0ooOoO;
            if (cursor.moveToFirst()) {
                z = cursor.getInt(0) != 0;
            }
            cursorO0ooOoO.close();
            if (z) {
                cursorO0ooOoO = c24767OooO0o0.o0ooOoO(new C24755OooO00o("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    Cursor cursor2 = cursorO0ooOoO;
                    String string = cursor2.moveToFirst() ? cursor2.getString(0) : null;
                    cursorO0ooOoO.close();
                    if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                        throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: c103703e120ae8cc73c9248622f3cd1e, found: ", string));
                    }
                } finally {
                }
            } else {
                OooO0O0 OooO0O02 = oooO00o.OooO0O0(c24767OooO0o0);
                if (!OooO0O02.f83628OooO00o) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + OooO0O02.f83629OooO0O0);
                }
                c24767OooO0o0.oo0o0Oo("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c24767OooO0o0.oo0o0Oo("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            }
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f66709OooOo0;
            workDatabase_Impl.getClass();
            c24767OooO0o0.oo0o0Oo("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl2 = WorkDatabase_Impl.this;
            workDatabase_Impl2.getClass();
            workDatabase_Impl2.OooOOo0(new C24649OooO00o(c24767OooO0o0));
            WorkDatabase_Impl.this.getClass();
            List<AbstractC24673OooOo0O.OooO0O0> list = this.f83626OooO0OO;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((AbstractC24673OooOo0O.OooO0O0) it.next()).OooO00o(c24767OooO0o0);
                }
            }
            this.f83625OooO0O0 = null;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
