package o00ooOo;

import android.util.Log;
import com.facebook.soloader.AbstractC22320OooOoO0;
import com.facebook.soloader.AbstractC22322OooOoo0;
import com.facebook.soloader.C22307OooO0Oo;
import com.facebook.soloader.C22317OooOo0O;
import com.facebook.soloader.C22318OooOo0o;
import java.util.concurrent.ConcurrentHashMap;
import oO0Ooo0.C33361OooO0Oo;

/* JADX INFO: renamed from: o00ooOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C25785OooO0oO implements InterfaceC25783OooO0o {
    public C25785OooO0oO(C33361OooO0Oo c33361OooO0Oo) {
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    @Override // o00ooOo.InterfaceC25783OooO0o
    public boolean OooO0O0(UnsatisfiedLinkError unsatisfiedLinkError, AbstractC22320OooOoO0[] abstractC22320OooOoO0Arr) {
        if ((unsatisfiedLinkError instanceof C22318OooOo0o) && !(unsatisfiedLinkError instanceof C22317OooOo0O)) {
            String str = ((C22318OooOo0o) unsatisfiedLinkError).f67512OooOo0o;
            StringBuilder sb = new StringBuilder("Reunpacking NonApk UnpackingSoSources due to ");
            sb.append(unsatisfiedLinkError);
            sb.append(str == null ? "" : ", retrying for specific library ".concat(str));
            Log.e("SoLoader", sb.toString());
            for (AbstractC22320OooOoO0 abstractC22320OooOoO0 : abstractC22320OooOoO0Arr) {
                if (abstractC22320OooOoO0 instanceof AbstractC22322OooOoo0) {
                    AbstractC22322OooOoo0 abstractC22322OooOoo0 = (AbstractC22322OooOoo0) abstractC22320OooOoO0;
                    if (abstractC22322OooOoo0 instanceof C22307OooO0Oo) {
                        continue;
                    } else {
                        try {
                            Log.e("SoLoader", "Runpacking " + abstractC22322OooOoo0.OooO0OO());
                            abstractC22322OooOoo0.OooO0o0(2);
                        } catch (Exception e) {
                            Log.e("SoLoader", "Encountered an exception while reunpacking " + abstractC22322OooOoo0.OooO0OO() + " for library " + str + ": ", e);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
