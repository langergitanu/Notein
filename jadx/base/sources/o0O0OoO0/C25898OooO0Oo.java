package o0O0OoO0;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32442OooOO0o;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.C33345Ooooo00;
import oO0Ooo.C33351Oooooo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0Ooo.o00Oo0;
import oO0o0O0o.C33587OooO0oo;
import oOo00OOO.C34484OooO00o;
import oOo00OOO.EnumC34485OooO0O0;

/* JADX INFO: renamed from: o0O0OoO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25898OooO0Oo {
    public static final C33587OooO0oo OooO00o(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C33587OooO0oo(matcher, charSequence);
        }
        return null;
    }

    public static void OooO0O0(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static C25899OooO0o0 OooO0Oo(Context context) {
        ArrayList arrayList = C25899OooO0o0.f88422OooO0OO;
        synchronized (C25899OooO0o0.class) {
            C25899OooO0o0 c25899OooO0o0 = C25899OooO0o0.f88424OooO0o0;
            if (c25899OooO0o0 != null) {
                c25899OooO0o0.addThis2Cache();
                return C25899OooO0o0.f88424OooO0o0;
            }
            try {
                try {
                    C25899OooO0o0.f88424OooO0o0 = new C25899OooO0o0(context);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Error e2) {
                e2.printStackTrace();
            }
            return C25899OooO0o0.f88424OooO0o0;
        }
    }

    public InterfaceC33348OooooOO OooO0OO(InterfaceC32637OoooOoo interfaceC32637OoooOoo, C34484OooO00o typeAttr, C33345Ooooo00 typeParameterUpperBoundEraser, AbstractC33320OooOoo abstractC33320OooOoo) {
        OooOOO0.OooO0oO(typeAttr, "typeAttr");
        OooOOO0.OooO0oO(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        if (!(typeAttr instanceof C34484OooO00o)) {
            OooOOO0.OooO0oO(typeAttr, "typeAttr");
            OooOOO0.OooO0oO(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
            return new C33351Oooooo0(3, abstractC33320OooOoo);
        }
        if (!typeAttr.f123575OooO0Oo) {
            typeAttr = C34484OooO00o.OooO00o(typeAttr, EnumC34485OooO0O0.f123580OooOo0o, false, null, null, 61);
        }
        int iOrdinal = typeAttr.f123574OooO0OO.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new C33351Oooooo0(1, abstractC33320OooOoo);
            }
            throw new C32442OooOO0o();
        }
        int iOooOo0 = interfaceC32637OoooOoo.OooOo0();
        boolean z = true;
        if (iOooOo0 != 1) {
            if (iOooOo0 == 2) {
                z = false;
            } else if (iOooOo0 != 3) {
                throw null;
            }
        }
        if (!z) {
            return new C33351Oooooo0(1, C33194OooO0O0.OooO0o0(interfaceC32637OoooOoo).OooOOO0());
        }
        List<InterfaceC32637OoooOoo> parameters = abstractC33320OooOoo.o00000().getParameters();
        OooOOO0.OooO0o(parameters, "erasedUpperBound.constructor.parameters");
        return !parameters.isEmpty() ? new C33351Oooooo0(3, abstractC33320OooOoo) : o00Oo0.OooOO0o(interfaceC32637OoooOoo, typeAttr);
    }
}
