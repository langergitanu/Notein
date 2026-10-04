package OooOOOo;

import android.content.Context;
import android.util.Log;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.ServiceConfigurationError;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0oooO0O.AbstractC31817OooO0oo;
import o0oooO0O.C31811OooO0O0;
import o0oooO0O.C31813OooO0Oo;
import o0oooO0O.C31814OooO0o;
import o0oooO0O.C31818OooOO0;
import o0oooO0O.C31819OooOO0O;
import o0oooO0O.C31820OooOO0o;
import o0oooO0O.C31821OooOOO;
import o0oooO0O.C31822OooOOO0;
import o0oooO0O.C31824OooOOOo;

/* JADX INFO: loaded from: classes.dex */
public class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f58432OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f58433OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f58434OooO0OO = 0;

    public static AbstractC31817OooO0oo OooO00o(C31811OooO0O0 c31811OooO0O0, C31436OooO0Oo c31436OooO0Oo, C31819OooOO0O c31819OooOO0O) {
        C31433OooO00o c31433OooO00o;
        String strOooO0OO = OooO0OO(c31436OooO0Oo);
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112330o000Oo;
        if (c31436OooO0Oo.f112222OooOoO0.containsKey(c31441OooOO0) && (c31433OooO00o = (C31433OooO00o) c31436OooO0Oo.o0000O0O(c31441OooOO0)) != null) {
            ArrayList arrayList = c31433OooO00o.f112214OooOo;
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o.Oooo0OO(i);
                    if ((abstractC31434OooO0O0Oooo0OO instanceof C31436OooO0Oo) && ((C31436OooO0Oo) abstractC31434OooO0O0Oooo0OO).o000OOo0(C31441OooOO0.f112408o00OO0O) != null) {
                        return new C31819OooOO0O(c31811OooO0O0, c31436OooO0Oo, c31819OooOO0O);
                    }
                }
            }
        }
        if ("Ch".equals(strOooO0OO)) {
            return (c31436OooO0Oo.o000O00O(C31441OooOO0.f112292o0000OO, null, 0) & 131072) != 0 ? new C31814OooO0o(c31811OooO0O0, c31436OooO0Oo, c31819OooOO0O) : new C31818OooOO0(c31811OooO0O0, c31436OooO0Oo, c31819OooOO0O);
        }
        if ("Tx".equals(strOooO0OO)) {
            return new C31824OooOOOo(c31811OooO0O0, c31436OooO0Oo, c31819OooOO0O);
        }
        if ("Sig".equals(strOooO0OO)) {
            return new C31821OooOOO(c31811OooO0O0, c31436OooO0Oo, c31819OooOO0O);
        }
        if (!"Btn".equals(strOooO0OO)) {
            return null;
        }
        int iO000O00O = c31436OooO0Oo.o000O00O(C31441OooOO0.f112292o0000OO, null, 0);
        return (32768 & iO000O00O) != 0 ? new C31822OooOOO0(c31811OooO0O0, c31436OooO0Oo, c31819OooOO0O) : (iO000O00O & 65536) != 0 ? new C31820OooOO0o(c31811OooO0O0, c31436OooO0Oo, c31819OooOO0O) : new C31813OooO0Oo(c31811OooO0O0, c31436OooO0Oo, c31819OooOO0O);
    }

    public static Object OooO0O0(Class cls, Class cls2) {
        try {
            return cls.asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new ServiceConfigurationError("Provider " + cls.getName() + " could not be instantiated.", e);
        }
    }

    public static String OooO0OO(C31436OooO0Oo c31436OooO0Oo) {
        String strO000OOO = c31436OooO0Oo.o000OOO(C31441OooOO0.f112331o000Oo0);
        if (strO000OOO == null) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O = c31436OooO0Oo.o0000O(C31441OooOO0.f112376o00O00o, C31441OooOO0.o00O00);
            if (abstractC31434OooO0O0O0000O instanceof C31436OooO0Oo) {
                return OooO0OO((C31436OooO0Oo) abstractC31434OooO0O0O0000O);
            }
        }
        return strO000OOO;
    }

    public static String OooO0Oo(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }
}
