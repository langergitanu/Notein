package o0OO0oO0;

import android.os.Build;
import com.orion.notein.domain.models.note.NoteContent;
import java.util.LinkedHashMap;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f93573OooO00o;

    public OooO00o(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f93573OooO00o = abstractApplicationC26277OooOoOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[PHI: r5
      0x0098: PHI (r5v12 java.lang.String) = (r5v11 java.lang.String), (r5v13 java.lang.String) binds: [B:40:0x009c, B:36:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[Catch: Exception -> 0x009e, TRY_LEAVE, TryCatch #0 {Exception -> 0x009e, blocks: (B:27:0x0086, B:29:0x008a, B:33:0x0090, B:35:0x0093, B:39:0x009a), top: B:48:0x0086 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap OooO00o() {
        String[] strArr;
        String str;
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f93573OooO00o;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String str2 = Build.BRAND;
            String str3 = "unknown";
            if (str2 == null) {
                str2 = "unknown";
            }
            linkedHashMap.put("brand", str2);
            String str4 = Build.MODEL;
            if (str4 == null) {
                str4 = "unknown";
            }
            linkedHashMap.put("model", str4);
            String str5 = Build.MANUFACTURER;
            if (str5 == null) {
                str5 = "unknown";
            }
            linkedHashMap.put("manufacturer", str5);
            linkedHashMap.put("android_version", String.valueOf(Build.VERSION.SDK_INT));
            linkedHashMap.put(NoteContent.EXTRA_APP_VERSION_CODE_STRING, "394");
            linkedHashMap.put("build_flavor", "google_play");
            int i = abstractApplicationC26277OooOoOO.getResources().getConfiguration().screenLayout & 15;
            linkedHashMap.put("screen_size", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "xlarge" : "large" : "normal" : "small");
            linkedHashMap.put("screen_density", String.valueOf(abstractApplicationC26277OooOoOO.getResources().getDisplayMetrics().densityDpi));
            try {
                strArr = Build.SUPPORTED_ABIS;
            } catch (Exception unused) {
            }
            if (strArr == null) {
                str = Build.CPU_ABI;
                if (str != null) {
                    str3 = str;
                }
                linkedHashMap.put("cpu_arch", str3);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("DeviceAttributeCollector");
                c20358OooO00o.OooO00o("Collected device attributes: " + linkedHashMap, new Object[0]);
            } else {
                if (!(strArr.length == 0)) {
                    str = strArr[0];
                    if (str == null) {
                    }
                    linkedHashMap.put("cpu_arch", str3);
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("DeviceAttributeCollector");
                    c20358OooO00o2.OooO00o("Collected device attributes: " + linkedHashMap, new Object[0]);
                }
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("DeviceAttributeCollector");
            c20358OooO00o3.OooO0Oo(e, "Error collecting device attributes", new Object[0]);
        }
        return linkedHashMap;
    }
}
