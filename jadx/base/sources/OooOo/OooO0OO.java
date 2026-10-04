package OooOo;

import OooOoO0.C20511OooO00o;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f58465OooO00o = 0;

    public static final void OooO00o(OooO0O0 oooO0O0, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0O0, "<this>");
        oooO0O0.f58462OooOo0o = new int[i];
        oooO0O0.f58461OooOo = new Object[i];
    }

    public static final int OooO0O0(OooO0O0 oooO0O0, Object obj, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0O0, "<this>");
        int i2 = oooO0O0.f58463OooOoO0;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iOooO0O0 = C20511OooO00o.OooO0O0(oooO0O0.f58462OooOo0o, oooO0O0.f58463OooOoO0, i);
            if (iOooO0O0 < 0 || kotlin.jvm.internal.OooOOO0.OooO0O0(obj, oooO0O0.f58461OooOo[iOooO0O0])) {
                return iOooO0O0;
            }
            int i3 = iOooO0O0 + 1;
            while (i3 < i2 && oooO0O0.f58462OooOo0o[i3] == i) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, oooO0O0.f58461OooOo[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iOooO0O0 - 1; i4 >= 0 && oooO0O0.f58462OooOo0o[i4] == i; i4--) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, oooO0O0.f58461OooOo[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
