package o0oOo0;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.global.R;
import java.util.Locale;
import java.util.Map;
import o000o0O0.AbstractC24590OooOooo;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o0O0oooO.C26320o0000OoO;
import o0Oo00o.C28026OooO0OO;
import o0oOoOoO.C31097OooO0Oo;
import o0oOoOoO.C31099OooO0o0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33596OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0oOo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30921OooOO0o {
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OooO00o(Fragment fragment, Uri uri, C26320o0000OoO c26320o0000OoO) {
        Object objOooO00o;
        C24583OooOo0o c24583OooOo0oOooOO0;
        Object objOooO00o2;
        Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        try {
            objOooO00o = C21030OooOO0o.OooO0OO(fragment);
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            objOooO00o = null;
        }
        C24572OooOO0o c24572OooOO0o = (C24572OooOO0o) objOooO00o;
        if (c24572OooOO0o == null) {
            return;
        }
        int identifier = context.getResources().getIdentifier(uri.getHost(), "id", context.getPackageName());
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(uri.getHost(), "privacyFragment")) {
            String queryParameter = uri.getQueryParameter(FirebaseAnalytics.Param.INDEX);
            if ((queryParameter != null ? Integer.parseInt(queryParameter) : 0) == 0) {
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(context, null), 3);
                return;
            } else {
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(context, null), 3);
                return;
            }
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(uri.getHost(), "userCouponsDialogFragment")) {
            C28026OooO0OO.OooO00o(c24572OooOO0o, R.id.user_coupons_dialog, null);
            return;
        }
        if (identifier == 0 || (c24583OooOo0oOooOO0 = c24572OooOO0o.OooO().OooOO0(identifier, true)) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : C34444Oooo0O0.OooOOO0(c24583OooOo0oOooOO0.f83300OooOoo).entrySet()) {
            String str = (String) entry.getKey();
            o000o0O0.OooO oooO = (o000o0O0.OooO) entry.getValue();
            AbstractC24590OooOooo<Object> abstractC24590OooOooo = oooO.f83168OooO00o;
            Object queryParameter2 = uri.getQueryParameter(str);
            boolean z = oooO.f83169OooO0O0;
            if (queryParameter2 != null) {
                if (abstractC24590OooOooo.equals(AbstractC24590OooOooo.f83349OooOO0O)) {
                    queryParameter2 = queryParameter2.toString();
                } else if (abstractC24590OooOooo.equals(AbstractC24590OooOooo.f83340OooO)) {
                    String lowerCase = C33599OooOo0O.Oooooo0(queryParameter2.toString()).toString().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                    int iHashCode = lowerCase.hashCode();
                    if (iHashCode != 48) {
                        if (iHashCode != 49) {
                            if (iHashCode != 3569038) {
                                if (iHashCode == 97196323 && lowerCase.equals(TelemetryEventStrings.Value.FALSE)) {
                                    queryParameter2 = Boolean.FALSE;
                                }
                            } else if (lowerCase.equals(TelemetryEventStrings.Value.TRUE)) {
                                queryParameter2 = Boolean.TRUE;
                            }
                            queryParameter2 = null;
                        } else if (!lowerCase.equals("1")) {
                            queryParameter2 = null;
                        }
                    } else if (!lowerCase.equals("0")) {
                    }
                } else if (abstractC24590OooOooo.equals(AbstractC24590OooOooo.f83341OooO0O0) || abstractC24590OooOooo.equals(AbstractC24590OooOooo.f83342OooO0OO)) {
                    queryParameter2 = C33596OooOOo0.OooOOO0(queryParameter2.toString());
                } else if (abstractC24590OooOooo.equals(AbstractC24590OooOooo.f83345OooO0o0)) {
                    queryParameter2 = C33596OooOOo0.OooOOO(queryParameter2.toString());
                } else if (abstractC24590OooOooo.equals(AbstractC24590OooOooo.f83346OooO0oO)) {
                    String string = queryParameter2.toString();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(string, "<this>");
                    try {
                        if (C33596OooOOo0.OooOO0(string)) {
                            queryParameter2 = Float.valueOf(Float.parseFloat(string));
                        }
                    } catch (NumberFormatException unused) {
                    }
                } else if (abstractC24590OooOooo instanceof AbstractC24590OooOooo.OooOOO) {
                    if (queryParameter2 instanceof Parcelable) {
                        queryParameter2 = (Parcelable) queryParameter2;
                    } else {
                        try {
                            objOooO00o2 = Uri.parse(queryParameter2.toString());
                        } catch (Throwable th2) {
                            objOooO00o2 = C32446OooOOOo.OooO00o(th2);
                        }
                        if (objOooO00o2 instanceof C32445OooOOOO.OooO00o) {
                            objOooO00o2 = null;
                        }
                        queryParameter2 = (Parcelable) objOooO00o2;
                    }
                } else if (abstractC24590OooOooo instanceof AbstractC24590OooOooo.C24595OooOO0o) {
                    try {
                        queryParameter2 = ((AbstractC24590OooOooo.C24595OooOO0o) abstractC24590OooOooo).OooO0OO(queryParameter2.toString());
                    } catch (Throwable th3) {
                        queryParameter2 = C32446OooOOOo.OooO00o(th3);
                    }
                    if (queryParameter2 instanceof C32445OooOOOO.OooO00o) {
                    }
                } else if (!(abstractC24590OooOooo instanceof AbstractC24590OooOooo.C24596OooOOOo)) {
                    try {
                        queryParameter2 = abstractC24590OooOooo.OooO0o0(queryParameter2.toString());
                    } catch (Throwable th4) {
                        queryParameter2 = C32446OooOOOo.OooO00o(th4);
                    }
                    if (queryParameter2 instanceof C32445OooOOOO.OooO00o) {
                    }
                }
                if (queryParameter2 != null) {
                    abstractC24590OooOooo.OooO0Oo(bundle, str, queryParameter2);
                } else if (z) {
                    bundle.putString(str, null);
                }
            } else if (z) {
                bundle.putString(str, null);
            }
        }
        try {
            c24572OooOO0o.OooOOO0(identifier, bundle, null);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th5) {
            C32446OooOOOo.OooO00o(th5);
        }
    }
}
