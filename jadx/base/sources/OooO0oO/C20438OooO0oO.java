package OooO0oO;

import OooO0oO.AbstractC20431OooO00o;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: OooO0oO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20438OooO0oO extends AbstractC20431OooO00o<String, Boolean> {
    @Override // OooO0oO.AbstractC20431OooO00o
    public final Intent OooO00o(Context context, String str) {
        String input = str;
        OooOOO0.OooO0oO(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input});
        OooOOO0.OooO0o(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final AbstractC20431OooO00o.C18958OooO00o<Boolean> OooO0O0(Context context, String str) {
        String input = str;
        OooOOO0.OooO0oO(input, "input");
        if (ContextCompat.checkSelfPermission(context, input) == 0) {
            return new AbstractC20431OooO00o.C18958OooO00o<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final Boolean OooO0OO(int i, Intent intent) {
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }
}
