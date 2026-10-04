package oO0O0OOO;

import Oooo0.o0OoOo0;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.internal.C22245OooO0oO;
import java.util.Iterator;
import java.util.List;
import oO00O.C32166Oooo0oo;
import oO00O.OooO;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<OooO00o> f117324OooO00o = C34429OooOOo0.OooOO0o(new OooO00o(6, 4, OooO.f115237OooO0O0), new OooO00o(5, 4, OooO.f115238OooO0OO), new OooO00o(7, 2, OooO.f115239OooO0Oo), new OooO00o(6, 2, OooO.f115241OooO0o0), new OooO00o(5, 2, OooO.f115240OooO0o), new OooO00o(3, 2, OooO.f115242OooO0oO));

    public static final OooO00o OooO00o(byte b, byte b2) throws C32166Oooo0oo {
        Object next;
        int i;
        if (b2 == 0) {
            throw new IllegalStateException("Anonymous signature not allowed.");
        }
        Iterator<T> it = f117324OooO00o.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            OooO00o oooO00o = (OooO00o) next;
            if (C22245OooO0oO.OooO00o(oooO00o.f117309OooO00o) == b && androidx.concurrent.futures.OooO0o.OooO00o(oooO00o.f117310OooO0O0) == b2) {
                break;
            }
        }
        OooO00o oooO00o2 = (OooO00o) next;
        if (oooO00o2 != null) {
            return oooO00o2;
        }
        int[] iArrOooO0O0 = o0OoOo0.OooO0O0(8);
        int length = iArrOooO0O0.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i = 0;
                break;
            }
            i = iArrOooO0O0[i3];
            if (C22245OooO0oO.OooO00o(i) == b) {
                break;
            }
            i3++;
        }
        if (i == 0) {
            throw new C32166Oooo0oo(C21532OooOOo.OooO0OO(b, "Unknown hash algorithm: "), 0);
        }
        int[] iArrOooO0O02 = o0OoOo0.OooO0O0(6);
        int length2 = iArrOooO0O02.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            int i5 = iArrOooO0O02[i4];
            if (androidx.concurrent.futures.OooO0o.OooO00o(i5) == b2) {
                i2 = i5;
                break;
            }
            i4++;
        }
        if (i2 == 0) {
            return null;
        }
        return new OooO00o(i, i2, null);
    }
}
