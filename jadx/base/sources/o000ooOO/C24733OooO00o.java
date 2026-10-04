package o000ooOO;

import android.database.Cursor;
import android.util.Log;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;

/* JADX INFO: renamed from: o000ooOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24733OooO00o {
    public static final int OooO00o(String str, Cursor c) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c, "c");
        int columnIndex = c.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int OooO0O0(String str, Cursor c) {
        String strOooo0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c, "c");
        int iOooO00o = OooO00o(str, c);
        if (iOooO00o >= 0) {
            return iOooO00o;
        }
        try {
            String[] columnNames = c.getColumnNames();
            kotlin.jvm.internal.OooOOO0.OooO0o(columnNames, "getColumnNames(...)");
            strOooo0O0 = oOo000Oo.OooOOO.Oooo0O0(columnNames, null, null, null, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            strOooo0O0 = "unknown";
        }
        throw new IllegalArgumentException(C22237OooO0o0.OooO00o("column '", str, "' does not exist. Available columns: ", strOooo0O0));
    }
}
