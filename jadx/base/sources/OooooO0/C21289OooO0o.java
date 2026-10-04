package OooooO0;

import OoooOoO.InterfaceC21233OooO0o;
import androidx.compose.p002ui.input.key.OnKeyEventElement;
import androidx.core.location.LocationRequestCompat;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.io.Serializable;
import kotlin.jvm.internal.OooOOO0;
import o00OooO0.C25150OooO00o;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0O.C32271OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33662Ooooooo;
import oOo00Oo0.C34504OooO0OO;
import oOo00Oo0.C34505OooO0Oo;
import oOo00Oo0.C34506OooO0o;

/* JADX INFO: renamed from: OooooO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21289OooO0o {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable OooO(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C34506OooO0o c34506OooO0o;
        if (abstractC32479OooO0OO instanceof C34506OooO0o) {
            c34506OooO0o = (C34506OooO0o) abstractC32479OooO0OO;
            int i = c34506OooO0o.f123664OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34506OooO0o.f123664OooOo = i - Integer.MIN_VALUE;
            } else {
                c34506OooO0o = new C34506OooO0o(abstractC32479OooO0OO);
            }
        }
        Object objOooOo0O = c34506OooO0o.f123665OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c34506OooO0o.f123664OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo0O);
            c34506OooO0o.f123664OooOo = 1;
            objOooOo0O = interfaceC23986Ooooo0o.OooOo0O(LocationRequestCompat.PASSIVE_INTERVAL, c34506OooO0o);
            if (objOooOo0O == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOo0O);
        }
        return C25150OooO00o.OooO0oO((C32266OooO0Oo) objOooOo0O);
    }

    public static final long OooO00o(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = C21290OooO0o0.f61721OooO0o0;
        return jFloatToIntBits;
    }

    public static int OooO0O0(float f) {
        return ((int) (((double) f) + 16384.999999999996d)) - 16384;
    }

    public static final void OooO0OO(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, io.ktor.utils.p616io.OooO00o first, io.ktor.utils.p616io.OooO00o oooO00o) {
        OooOOO0.OooO0oO(interfaceC23986Ooooo0o, "<this>");
        OooOOO0.OooO0oO(first, "first");
        C33609OooO0oo.OooO0OO(C33662Ooooooo.f121350OooOo0o, C33649OoooOOo.f121329OooO0O0, null, new C34504OooO0OO(interfaceC23986Ooooo0o, first, oooO00o, null), 2).invokeOnCompletion(new C34505OooO0Oo(first, oooO00o));
    }

    public static final C32271OooO00o OooO0Oo(C32271OooO00o c32271OooO00o) {
        OooOOO0.OooO0oO(c32271OooO00o, "<this>");
        while (true) {
            C32271OooO00o c32271OooO00oOooO0oo = c32271OooO00o.OooO0oo();
            if (c32271OooO00oOooO0oo == null) {
                return c32271OooO00o;
            }
            c32271OooO00o = c32271OooO00oOooO0oo;
        }
    }

    public static final boolean OooO0o(long j) {
        int i = C21290OooO0o0.f61721OooO0o0;
        return j != C21290OooO0o0.f61720OooO0Oo;
    }

    public static int OooO0o0(float f) {
        return ((int) (((double) f) + 16384.0d)) - 16384;
    }

    public static final InterfaceC21233OooO0o OooO0oO(InterfaceC21233OooO0o interfaceC21233OooO0o, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        OooOOO0.OooO0oO(interfaceC21233OooO0o, "<this>");
        return interfaceC21233OooO0o.o00ooo(new OnKeyEventElement(interfaceC32507OooOO0o));
    }

    public static final long OooO0oo(C32271OooO00o c32271OooO00o) {
        OooOOO0.OooO0oO(c32271OooO00o, "<this>");
        long j = 0;
        do {
            j += (long) (c32271OooO00o.f115946OooO0OO - c32271OooO00o.f115945OooO0O0);
            c32271OooO00o = c32271OooO00o.OooO0oo();
        } while (c32271OooO00o != null);
        return j;
    }
}
