package o00Oo0O;

import Oooo0.o0OoOo0;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import o00Oo0o.C25046OooO00o;
import o00Oo0o0.C25048OooO0O0;
import org.json.JSONObject;

/* JADX INFO: renamed from: o00Oo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25042OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f85016OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String[] f85017OooO0O0;

    public static ArrayList OooO00o(JSONObject jSONObject) {
        int i;
        String str;
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("name", "");
            String[] strArrSplit = !TextUtils.isEmpty(strOptString) ? strOptString.split(";") : null;
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                String str2 = strArrSplit[i2];
                if (TextUtils.isEmpty(str2)) {
                    i = 1;
                } else {
                    int[] iArrOooO0O0 = o0OoOo0.OooO0O0(6);
                    int length = iArrOooO0O0.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        i = iArrOooO0O0[i3];
                        switch (i) {
                            case 1:
                                str = "none";
                                break;
                            case 2:
                                str = "js://wappay";
                                break;
                            case 3:
                                str = "js://update";
                                break;
                            case 4:
                                str = "loc:openweb";
                                break;
                            case 5:
                                str = "loc:setResult";
                                break;
                            case 6:
                                str = "loc:exit";
                                break;
                            default:
                                throw null;
                        }
                        if (!str2.startsWith(str)) {
                        }
                    }
                    i = 1;
                }
                if (i != 1) {
                    String str3 = strArrSplit[i2];
                    C25042OooO00o c25042OooO00o = new C25042OooO00o();
                    c25042OooO00o.f85016OooO00o = i;
                    ArrayList arrayList2 = new ArrayList();
                    int iIndexOf = str3.indexOf(40);
                    int iLastIndexOf = str3.lastIndexOf(41);
                    if (iIndexOf == -1 || iLastIndexOf == -1 || iLastIndexOf <= iIndexOf) {
                        strArr = null;
                    } else {
                        String[] strArrSplit2 = str3.substring(iIndexOf + 1, iLastIndexOf).split("' *, *'", -1);
                        for (String str4 : strArrSplit2) {
                            arrayList2.add(str4.trim().replaceAll("'", "").replaceAll("\"", ""));
                        }
                        strArr = (String[]) arrayList2.toArray(new String[0]);
                    }
                    c25042OooO00o.f85017OooO0O0 = strArr;
                    arrayList.add(c25042OooO00o);
                }
            }
        }
        return arrayList;
    }

    public static void OooO0O0(C25042OooO00o c25042OooO00o) {
        String[] strArr = c25042OooO00o.f85017OooO0O0;
        if (strArr.length == 3 && TextUtils.equals("tid", strArr[0])) {
            C25046OooO00o c25046OooO00oOooO00o = C25046OooO00o.OooO00o((Context) C25048OooO0O0.OooO0O0().f85047OooO00o);
            if (TextUtils.isEmpty(strArr[1]) || TextUtils.isEmpty(strArr[2])) {
                return;
            }
            c25046OooO00oOooO00o.OooO0O0(strArr[1], strArr[2]);
        }
    }
}
