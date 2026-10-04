package OooO0oO;

import OooO0oO.AbstractC20431OooO00o;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: OooO0oO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20435OooO0o extends AbstractC20431OooO00o<String[], Map<String, Boolean>> {
    @Override // OooO0oO.AbstractC20431OooO00o
    public final Intent OooO00o(Context context, String[] strArr) {
        String[] input = strArr;
        OooOOO0.OooO0oO(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        OooOOO0.OooO0o(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final AbstractC20431OooO00o.C18958OooO00o<Map<String, Boolean>> OooO0O0(Context context, String[] strArr) {
        String[] input = strArr;
        OooOOO0.OooO0oO(input, "input");
        if (input.length == 0) {
            return new AbstractC20431OooO00o.C18958OooO00o<>(C34436OooOoOO.f123455OooOo0o);
        }
        for (String str : input) {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        int iOooO0Oo = Oooo0.OooO0Oo(input.length);
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (String str2 : input) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new AbstractC20431OooO00o.C18958OooO00o<>(linkedHashMap);
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final Map<String, Boolean> OooO0OO(int i, Intent intent) {
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                return C34444Oooo0O0.OooOO0o(OooOo.o000OOo(OooOOO.OooOoO(stringArrayExtra), arrayList));
            }
        }
        return c34436OooOoOO;
    }
}
