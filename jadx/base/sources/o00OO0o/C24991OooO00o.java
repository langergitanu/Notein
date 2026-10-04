package o00OO0o;

import Oooo0oO.C21081o00000o0;
import Oooo0oO.o000000O;
import android.os.Build;
import android.text.TextUtils;
import com.orion.notein.domain.models.cloudsync.CloudSyncCredentialType;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import oO0O0OO.InterfaceC32621Oooo00o;
import oO0O0OO.InterfaceC32622Oooo0O0;
import oO0OooO0.C33477OooO0OO;

/* JADX INFO: renamed from: o00OO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24991OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84796OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f84797OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f84798OooO0OO = 0;

    public static String OooO00o(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static o00OO0OO.OooO00o OooO0O0() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(CloudSyncCredentialType.HUAWEI) || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new C24992OooO0O0();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new C24996OooO0oO();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new C21081o00000o0();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            C24995OooO0o0 c24995OooO0o0 = new C24995OooO0o0();
            c24995OooO0o0.f84808OooO00o = false;
            return c24995OooO0o0;
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            C24993OooO0OO c24993OooO0OO = new C24993OooO0OO();
            c24993OooO0OO.f84802OooO0O0 = false;
            c24993OooO0OO.f84803OooO0OO = false;
            return c24993OooO0OO;
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new C24994OooO0Oo();
        }
        if (str.equalsIgnoreCase("samsung")) {
            return new OooO0o();
        }
        String strOooO00o = OooO00o("ro.build.version.emui");
        String strOooO00o2 = OooO00o("hw_sc.build.platform.version");
        if (!TextUtils.isEmpty(strOooO00o) || !TextUtils.isEmpty(strOooO00o2)) {
            return new C24992OooO0O0();
        }
        if (str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("mblu")) {
            return new o000000O();
        }
        return null;
    }

    public static final void OooO0OO(InterfaceC32621Oooo00o interfaceC32621Oooo00o, C33477OooO0OO fqName, ArrayList arrayList) {
        OooOOO0.OooO0oO(interfaceC32621Oooo00o, "<this>");
        OooOOO0.OooO0oO(fqName, "fqName");
        if (interfaceC32621Oooo00o instanceof InterfaceC32622Oooo0O0) {
            ((InterfaceC32622Oooo0O0) interfaceC32621Oooo00o).OooO00o(fqName, arrayList);
        } else {
            arrayList.addAll(interfaceC32621Oooo00o.OooO0O0(fqName));
        }
    }

    public static final boolean OooO0Oo(InterfaceC32621Oooo00o interfaceC32621Oooo00o, C33477OooO0OO fqName) {
        OooOOO0.OooO0oO(interfaceC32621Oooo00o, "<this>");
        OooOOO0.OooO0oO(fqName, "fqName");
        return interfaceC32621Oooo00o instanceof InterfaceC32622Oooo0O0 ? ((InterfaceC32622Oooo0O0) interfaceC32621Oooo00o).OooO0OO(fqName) : OooO0o0(interfaceC32621Oooo00o, fqName).isEmpty();
    }

    public static final ArrayList OooO0o0(InterfaceC32621Oooo00o interfaceC32621Oooo00o, C33477OooO0OO fqName) {
        OooOOO0.OooO0oO(interfaceC32621Oooo00o, "<this>");
        OooOOO0.OooO0oO(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        OooO0OO(interfaceC32621Oooo00o, fqName, arrayList);
        return arrayList;
    }

    public void OooO0o(boolean z) {
        throw null;
    }
}
