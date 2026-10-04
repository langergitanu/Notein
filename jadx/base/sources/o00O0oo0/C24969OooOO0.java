package o00O0oo0;

import android.graphics.Color;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33479OooO0o;
import oO0o0Ooo.AbstractC33837OooOOoo;
import oO0o0Ooo.C33820OooO00o;

/* JADX INFO: renamed from: o00O0oo0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24969OooOO0 implements InterfaceC24962OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84687OooO00o = 0;

    public static final C33476OooO0O0 OooO00o(InterfaceC32918OooO0OO interfaceC32918OooO0OO, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32918OooO0OO, "<this>");
        return C33476OooO0O0.OooO0o0(interfaceC32918OooO0OO.OooO00o(i), interfaceC32918OooO0OO.OooO0O0(i));
    }

    public static final C33479OooO0o OooO0O0(InterfaceC32918OooO0OO interfaceC32918OooO0OO, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32918OooO0OO, "<this>");
        return C33479OooO0o.OooO0Oo(interfaceC32918OooO0OO.getString(i));
    }

    public static final int OooO0OO(int i) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        float fAlpha = Color.alpha(i) / 255.0f;
        float f = (1.0f - fAlpha) * 255.0f;
        return Color.argb(255, oO0O00O.OooO00o.OooO0O0((iRed * fAlpha) + oO0O00O.OooO00o.OooO0O0(f)), oO0O00O.OooO00o.OooO0O0((iGreen * fAlpha) + oO0O00O.OooO00o.OooO0O0(f)), oO0O00O.OooO00o.OooO0O0((iBlue * fAlpha) + oO0O00O.OooO00o.OooO0O0(f)));
    }

    public static final AbstractC33837OooOOoo OooO0Oo(Object obj) {
        if (obj != C33820OooO00o.f121913OooO00o) {
            return (AbstractC33837OooOOoo) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static void OooO0o(Throwable th) {
        if (Error.class.isInstance(th)) {
            throw ((Throwable) Error.class.cast(th));
        }
        if (!RuntimeException.class.isInstance(th)) {
            throw new RuntimeException(th);
        }
        throw ((Throwable) RuntimeException.class.cast(th));
    }

    public static final boolean OooO0o0(Object obj) {
        return obj == C33820OooO00o.f121913OooO00o;
    }
}
