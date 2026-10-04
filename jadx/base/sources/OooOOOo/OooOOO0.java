package OooOOOo;

import Oooo0.o0OoOo0;
import androidx.fragment.app.FragmentManager;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import oO00Ooo.C32303OooOOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements ObjectConstructor {
    public static final C32303OooOOo OooO00o(int i) {
        return C32303OooOOo.f116208OooO0O0.get(o0OoOo0.OooO00o(i));
    }

    public static int OooO0O0(int i, int i2, int i3) {
        return zzlm.zzz(i) + i2 + i3;
    }

    public static androidx.fragment.app.OooO00o OooO0OO(FragmentManager fragmentManager, FragmentManager fragmentManager2) {
        fragmentManager.getClass();
        return new androidx.fragment.app.OooO00o(fragmentManager2);
    }

    public static void OooO0Oo(int i, Dictionary dictionary, Integer num, int i2, Integer num2) {
        dictionary.addItem(Integer.valueOf(i), num);
        dictionary.addItem(Integer.valueOf(i2), num2);
    }

    public static /* synthetic */ String OooO0o0(int i) {
        switch (i) {
            case 1:
                return "OK";
            case 2:
                return "CANCELLED";
            case 3:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            case 4:
                return "INVALID_ARGUMENT";
            case 5:
                return "DEADLINE_EXCEEDED";
            case 6:
                return "NOT_FOUND";
            case 7:
                return "ALREADY_EXISTS";
            case 8:
                return "PERMISSION_DENIED";
            case 9:
                return "RESOURCE_EXHAUSTED";
            case 10:
                return "FAILED_PRECONDITION";
            case 11:
                return "ABORTED";
            case 12:
                return "OUT_OF_RANGE";
            case 13:
                return "UNIMPLEMENTED";
            case 14:
                return "INTERNAL";
            case 15:
                return "UNAVAILABLE";
            case 16:
                return "DATA_LOSS";
            case 17:
                return "UNAUTHENTICATED";
            default:
                throw null;
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newDefaultImplementationConstructor$13();
    }
}
