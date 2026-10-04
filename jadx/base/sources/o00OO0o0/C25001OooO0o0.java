package o00OO0o0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;

/* JADX INFO: renamed from: o00OO0o0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25001OooO0o0 {
    public static void OooO00o(Context context, String str, HashMap map) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        if (editorEdit != null) {
            for (String str2 : map.keySet()) {
                editorEdit.putString(str2, (String) map.get(str2));
            }
            editorEdit.commit();
        }
    }
}
