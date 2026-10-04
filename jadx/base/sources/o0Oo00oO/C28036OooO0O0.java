package o0Oo00oO;

import Oooo0oO.C21111o0ooOoO;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: o0Oo00oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28036OooO0O0 {
    public static final Activity OooO00o(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final String OooO0O0(Context context) {
        return C21111o0ooOoO.OooO0Oo(context.getApplicationContext().getPackageName(), ".fileProvider");
    }

    public static final String OooO0OO(String str) {
        OooOOO0.OooO0oO(str, "<this>");
        return C33595OooOOo.OooOo0O(str, "+", "");
    }
}
