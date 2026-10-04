package o000oooO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.OooOOO0;
import o000oooo.C24767OooO0o0;

/* JADX INFO: renamed from: o000oooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC24757OooO0OO extends Closeable {

    /* JADX INFO: renamed from: o000oooO.OooO0OO$OooO00o */
    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f83962OooO00o;

        public OooO00o(int i) {
            this.f83962OooO00o = i;
        }

        public static void OooO00o(String str) {
            if (str.equalsIgnoreCase(":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = OooOOO0.OooO(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        public void OooO0O0(C24767OooO0o0 c24767OooO0o0) {
        }

        public abstract void OooO0OO(C24767OooO0o0 c24767OooO0o0);

        public abstract void OooO0Oo(C24767OooO0o0 c24767OooO0o0, int i, int i2);

        public abstract void OooO0o(C24767OooO0o0 c24767OooO0o0, int i, int i2);

        public abstract void OooO0o0(C24767OooO0o0 c24767OooO0o0);
    }

    /* JADX INFO: renamed from: o000oooO.OooO0OO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f83963OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f83964OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f83965OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f83966OooO0Oo;

        public OooO0O0(Context context, String str, OooO00o callback, boolean z) {
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(callback, "callback");
            this.f83963OooO00o = context;
            this.f83964OooO0O0 = str;
            this.f83965OooO0OO = callback;
            this.f83966OooO0Oo = z;
        }
    }

    /* JADX INFO: renamed from: o000oooO.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public interface InterfaceC19651OooO0OO {
        InterfaceC24757OooO0OO OooO00o(OooO0O0 oooO0O0);
    }

    InterfaceC24756OooO0O0 OooooOO();

    String getDatabaseName();

    InterfaceC24756OooO0O0 o0000oOo();

    void setWriteAheadLoggingEnabled(boolean z);
}
