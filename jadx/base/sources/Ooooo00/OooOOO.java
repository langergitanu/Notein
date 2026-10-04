package Ooooo00;

import Oooo00o.AbstractC20903OooO00o;
import OoooOoO.InterfaceC21233OooO0o;
import OooooOO.C21353Oooooo0;
import android.content.res.Resources;
import com.microsoft.identity.common.java.marker.PerfConstants;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOO0.C31604o0ooOoO;
import o0ooo0oo.AbstractC31768OooO00o;
import o0ooo0oo.C31767OooO;
import o0ooo0oo.C31769OooO0O0;
import o0ooo0oo.C31770OooO0OO;
import o0ooo0oo.C31771OooO0Oo;
import o0ooo0oo.C31772OooO0o;
import o0ooo0oo.C31773OooO0o0;
import o0ooo0oo.C31774OooO0oO;
import o0ooo0oo.C31775OooO0oo;
import o0ooo0oo.C31776OooOO0;
import o0ooo0oo.C31777OooOO0O;
import o0ooo0oo.C31778OooOO0o;
import o0ooo0oo.C31779OooOOO;
import o0ooo0oo.C31780OooOOO0;
import o0ooo0oo.C31781OooOOOO;
import oO0O0oo0.C32813Oooo000;
import oO0Ooo.o00O0O;
import oOo000Oo.C34449Oooo0oo;
import oOo00OOO.C34484OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {
    public static io.ktor.utils.p616io.OooO00o OooO00o() {
        return new io.ktor.utils.p616io.OooO00o(false);
    }

    public static AbstractC31768OooO00o OooO0O0(C31436OooO0Oo c31436OooO0Oo) {
        if (c31436OooO0Oo == null) {
            return null;
        }
        String strO000OOO = c31436OooO0Oo.o000OOO(C31441OooOO0.f112393o00O0o0);
        if ("JavaScript".equals(strO000OOO)) {
            return new C31772OooO0o(c31436OooO0Oo);
        }
        if ("GoTo".equals(strO000OOO)) {
            return new C31770OooO0OO(c31436OooO0Oo);
        }
        if ("Launch".equals(strO000OOO)) {
            return new C31774OooO0oO(c31436OooO0Oo);
        }
        if ("GoToR".equals(strO000OOO)) {
            return new C31776OooOO0(c31436OooO0Oo);
        }
        if ("URI".equals(strO000OOO)) {
            return new C31781OooOOOO(c31436OooO0Oo);
        }
        if ("Named".equals(strO000OOO)) {
            return new C31767OooO(c31436OooO0Oo);
        }
        if ("Sound".equals(strO000OOO)) {
            return new C31778OooOO0o(c31436OooO0Oo);
        }
        if ("Movie".equals(strO000OOO)) {
            return new C31775OooO0oo(c31436OooO0Oo);
        }
        if ("ImportData".equals(strO000OOO)) {
            return new C31773OooO0o0(c31436OooO0Oo);
        }
        if ("ResetForm".equals(strO000OOO)) {
            return new C31777OooOO0O(c31436OooO0Oo);
        }
        if ("Hide".equals(strO000OOO)) {
            return new C31771OooO0Oo(c31436OooO0Oo);
        }
        if ("SubmitForm".equals(strO000OOO)) {
            return new C31780OooOOO0(c31436OooO0Oo);
        }
        if (PerfConstants.CodeMarkerParameters.THREAD.equals(strO000OOO)) {
            return new C31779OooOOO(c31436OooO0Oo);
        }
        if ("GoToE".equals(strO000OOO)) {
            return new C31769OooO0O0(c31436OooO0Oo);
        }
        return null;
    }

    public static final int OooO0OO(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static InterfaceC21233OooO0o OooO0Oo(InterfaceC21233OooO0o shadow, float f, AbstractC20903OooO00o shape) {
        long j = C21353Oooooo0.f61772OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(shadow, "$this$shadow");
        kotlin.jvm.internal.OooOOO0.OooO0oO(shape, "shape");
        return Float.compare(f, (float) 0) <= 0 ? shadow : C31604o0ooOoO.OooO00o(shadow, C31604o0ooOoO.f112933OooO00o, androidx.compose.p002ui.graphics.OooO00o.OooO00o(new OooOOO0(f, shape, j, j)));
    }

    public static C34484OooO00o OooO0o0(o00O0O o00o0o2, boolean z, C32813Oooo000 c32813Oooo000, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            c32813Oooo000 = null;
        }
        return new C34484OooO00o(o00o0o2, z3, z2, c32813Oooo000 != null ? C34449Oooo0oo.OooOO0(c32813Oooo000) : null, 34);
    }
}
