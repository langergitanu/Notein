package o00000;

import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import o00o00Oo.C25256OooO00o;
import o00oO0O.AbstractC25521OoooO;
import oO0o0OO.C33664o00000Oo;
import oo000o.InterfaceC34635OooOOOO;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f81042OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f81043OooO0O0 = 0;

    public static void OooO(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                return;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                oO0OOO0O.OooO00o.OooO0O0(new IllegalStateException(androidx.concurrent.futures.OooO00o.OooO0O0(j3, "More produced than requested: ")));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static C33664o00000Oo OooO00o() {
        return new C33664o00000Oo(null);
    }

    public static long OooO0O0(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
        } while (!atomicLong.compareAndSet(j2, OooO0OO(j2, j)));
        return j2;
    }

    public static long OooO0OO(long j, long j2) {
        long j3 = j + j2;
        return j3 < 0 ? LocationRequestCompat.PASSIVE_INTERVAL : j3;
    }

    public static final C21291OooO0oO OooO0Oo(InterfaceC34635OooOOOO interfaceC34635OooOOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34635OooOOOO, "<this>");
        AbstractC25521OoooO abstractC25521OoooOOooO0oO = interfaceC34635OooOOOO.OooO0oO();
        return abstractC25521OoooOOooO0oO != null ? abstractC25521OoooOOooO0oO.OooO0o(interfaceC34635OooOOOO, true) : new C21291OooO0oO(0.0f, 0.0f, (int) (interfaceC34635OooOOOO.OooO00o() >> 32), (int) (interfaceC34635OooOOOO.OooO00o() & 4294967295L));
    }

    public static final InterfaceC34635OooOOOO OooO0o(InterfaceC34635OooOOOO interfaceC34635OooOOOO) {
        InterfaceC34635OooOOOO interfaceC34635OooOOOO2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34635OooOOOO, "<this>");
        AbstractC25521OoooO abstractC25521OoooOOooO0oO = interfaceC34635OooOOOO.OooO0oO();
        while (true) {
            AbstractC25521OoooO abstractC25521OoooO = abstractC25521OoooOOooO0oO;
            interfaceC34635OooOOOO2 = interfaceC34635OooOOOO;
            interfaceC34635OooOOOO = abstractC25521OoooO;
            if (interfaceC34635OooOOOO == null) {
                break;
            }
            abstractC25521OoooOOooO0oO = interfaceC34635OooOOOO.OooO0oO();
        }
        AbstractC25521OoooO abstractC25521OoooO2 = interfaceC34635OooOOOO2 instanceof AbstractC25521OoooO ? (AbstractC25521OoooO) interfaceC34635OooOOOO2 : null;
        if (abstractC25521OoooO2 == null) {
            return interfaceC34635OooOOOO2;
        }
        AbstractC25521OoooO abstractC25521OoooO3 = abstractC25521OoooO2.f87053OooOooo;
        while (true) {
            AbstractC25521OoooO abstractC25521OoooO4 = abstractC25521OoooO3;
            AbstractC25521OoooO abstractC25521OoooO5 = abstractC25521OoooO2;
            abstractC25521OoooO2 = abstractC25521OoooO4;
            if (abstractC25521OoooO2 == null) {
                return abstractC25521OoooO5;
            }
            abstractC25521OoooO3 = abstractC25521OoooO2.f87053OooOooo;
        }
    }

    public static final C21291OooO0oO OooO0o0(InterfaceC34635OooOOOO interfaceC34635OooOOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34635OooOOOO, "<this>");
        InterfaceC34635OooOOOO interfaceC34635OooOOOOOooO0o = OooO0o(interfaceC34635OooOOOO);
        C21291OooO0oO c21291OooO0oOOooO0o = OooO0o(interfaceC34635OooOOOO).OooO0o(interfaceC34635OooOOOO, true);
        float fOooO00o = (int) (interfaceC34635OooOOOOOooO0o.OooO00o() >> 32);
        float fOooO00o2 = (int) (interfaceC34635OooOOOOOooO0o.OooO00o() & 4294967295L);
        float fOooO0o0 = oO0O00oo.OooOO0.OooO0o0(c21291OooO0oOOooO0o.f61724OooO00o, 0.0f, fOooO00o);
        float fOooO0o02 = oO0O00oo.OooOO0.OooO0o0(c21291OooO0oOOooO0o.f61725OooO0O0, 0.0f, fOooO00o2);
        float fOooO0o03 = oO0O00oo.OooOO0.OooO0o0(c21291OooO0oOOooO0o.f61726OooO0OO, 0.0f, fOooO00o);
        float fOooO0o04 = oO0O00oo.OooOO0.OooO0o0(c21291OooO0oOOooO0o.f61727OooO0Oo, 0.0f, fOooO00o2);
        if (fOooO0o0 == fOooO0o03 || fOooO0o02 == fOooO0o04) {
            return C21291OooO0oO.f61723OooO0o0;
        }
        long jOooO0Oo = interfaceC34635OooOOOOOooO0o.OooO0Oo(C21289OooO0o.OooO00o(fOooO0o0, fOooO0o02));
        long jOooO0Oo2 = interfaceC34635OooOOOOOooO0o.OooO0Oo(C21289OooO0o.OooO00o(fOooO0o03, fOooO0o02));
        long jOooO0Oo3 = interfaceC34635OooOOOOOooO0o.OooO0Oo(C21289OooO0o.OooO00o(fOooO0o03, fOooO0o04));
        long jOooO0Oo4 = interfaceC34635OooOOOOOooO0o.OooO0Oo(C21289OooO0o.OooO00o(fOooO0o0, fOooO0o04));
        float fOooO0OO = C21290OooO0o0.OooO0OO(jOooO0Oo);
        float[] fArr = {C21290OooO0o0.OooO0OO(jOooO0Oo2), C21290OooO0o0.OooO0OO(jOooO0Oo4), C21290OooO0o0.OooO0OO(jOooO0Oo3)};
        for (int i = 0; i < 3; i++) {
            fOooO0OO = Math.min(fOooO0OO, fArr[i]);
        }
        float fOooO0Oo = C21290OooO0o0.OooO0Oo(jOooO0Oo);
        float[] fArr2 = {C21290OooO0o0.OooO0Oo(jOooO0Oo2), C21290OooO0o0.OooO0Oo(jOooO0Oo4), C21290OooO0o0.OooO0Oo(jOooO0Oo3)};
        for (int i2 = 0; i2 < 3; i2++) {
            fOooO0Oo = Math.min(fOooO0Oo, fArr2[i2]);
        }
        float fOooO0OO2 = C21290OooO0o0.OooO0OO(jOooO0Oo);
        float[] fArr3 = {C21290OooO0o0.OooO0OO(jOooO0Oo2), C21290OooO0o0.OooO0OO(jOooO0Oo4), C21290OooO0o0.OooO0OO(jOooO0Oo3)};
        for (int i3 = 0; i3 < 3; i3++) {
            fOooO0OO2 = Math.max(fOooO0OO2, fArr3[i3]);
        }
        float fOooO0Oo2 = C21290OooO0o0.OooO0Oo(jOooO0Oo);
        float[] fArr4 = {C21290OooO0o0.OooO0Oo(jOooO0Oo2), C21290OooO0o0.OooO0Oo(jOooO0Oo4), C21290OooO0o0.OooO0Oo(jOooO0Oo3)};
        float fMax = fOooO0Oo2;
        for (int i4 = 0; i4 < 3; i4++) {
            fMax = Math.max(fMax, fArr4[i4]);
        }
        return new C21291OooO0oO(fOooO0OO, fOooO0Oo, fOooO0OO2, fMax);
    }

    public static Bundle OooO0oO(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            Uri uri = Uri.parse(str);
            for (String str2 : uri.getQueryParameterNames()) {
                bundle.putString(str2, uri.getQueryParameter(str2));
            }
        }
        return bundle;
    }

    public static final long OooO0oo(InterfaceC34635OooOOOO interfaceC34635OooOOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34635OooOOOO, "<this>");
        int i = C21290OooO0o0.f61721OooO0o0;
        return interfaceC34635OooOOOO.OooOOOo(C21290OooO0o0.f61718OooO0O0);
    }

    public static final long OooOO0(long j, long j2) {
        int iOooO0OO;
        int iOooO0Oo;
        int iOooO0Oo2 = C34696OooOOoo.OooO0Oo(j);
        int iOooO0OO2 = C34696OooOOoo.OooO0OO(j);
        if (C34696OooOOoo.OooO0Oo(j2) >= C34696OooOOoo.OooO0OO(j) || C34696OooOOoo.OooO0Oo(j) >= C34696OooOOoo.OooO0OO(j2)) {
            if (iOooO0OO2 > C34696OooOOoo.OooO0Oo(j2)) {
                iOooO0Oo2 -= C34696OooOOoo.OooO0OO(j2) - C34696OooOOoo.OooO0Oo(j2);
                iOooO0OO = C34696OooOOoo.OooO0OO(j2);
                iOooO0Oo = C34696OooOOoo.OooO0Oo(j2);
                iOooO0OO2 -= iOooO0OO - iOooO0Oo;
            }
        } else if (C34696OooOOoo.OooO0Oo(j2) > C34696OooOOoo.OooO0Oo(j) || C34696OooOOoo.OooO0OO(j) > C34696OooOOoo.OooO0OO(j2)) {
            if (C34696OooOOoo.OooO0Oo(j) > C34696OooOOoo.OooO0Oo(j2) || C34696OooOOoo.OooO0OO(j2) > C34696OooOOoo.OooO0OO(j)) {
                int iOooO0Oo3 = C34696OooOOoo.OooO0Oo(j2);
                if (iOooO0Oo2 >= C34696OooOOoo.OooO0OO(j2) || iOooO0Oo3 > iOooO0Oo2) {
                    iOooO0OO2 = C34696OooOOoo.OooO0Oo(j2);
                } else {
                    iOooO0Oo2 = C34696OooOOoo.OooO0Oo(j2);
                    iOooO0OO = C34696OooOOoo.OooO0OO(j2);
                    iOooO0Oo = C34696OooOOoo.OooO0Oo(j2);
                }
            } else {
                iOooO0OO = C34696OooOOoo.OooO0OO(j2);
                iOooO0Oo = C34696OooOOoo.OooO0Oo(j2);
            }
            iOooO0OO2 -= iOooO0OO - iOooO0Oo;
        } else {
            iOooO0Oo2 = C34696OooOOoo.OooO0Oo(j2);
            iOooO0OO2 = iOooO0Oo2;
        }
        return C25256OooO00o.OooO0OO(iOooO0Oo2, iOooO0OO2);
    }
}
