package Oooo0oO;

import android.view.View;
import com.hihonor.cloudservice.support.account.request.SignInOptions;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.orion.editor.p600ui.zoom.DefaultZoomHandle;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24035Oooo00o;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0oOo0O0.InterfaceC30952OooO00o;
import oO00ooO.C32443OooOOO;
import oO0O0O0.C32567Oooo;
import oO0O0O0.C32579OoooO0O;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOO0O.InterfaceC34105OooO00o;
import oO0oOOO.InterfaceC34107OooO00o;
import oO0oOo0.C34142OooO00o;
import oO0oOoOo.InterfaceC34201OooO0Oo;
import oO0oOoo0.C34212OooO0o;
import oO0oOoo0.C34213OooO0o0;
import oO0oOoo0.C34214OooO0oO;
import oO0oOoo0.C34215OooO0oo;
import oO0oOoo0.C34216OooOO0;
import oO0oo0O.C34237OooO00o;
import oOO00o0.C34370OooO0o0;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34597OooO0o0;
import oOoo0.InterfaceC34606OooOOOo;
import oOoo0.InterfaceC34608OooOOo0;

/* JADX INFO: renamed from: Oooo0oO.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21053Oooo00o implements InterfaceC30952OooO00o {
    public static C34142OooO00o OooO0O0(String str) {
        if (str.equals(IDevicePopManager.SHA_1)) {
            return new C34142OooO00o(InterfaceC34107OooO00o.f122558OooO0O0, oO0oO0Oo.o00Oo0.f122442OooOo);
        }
        if (str.equals("SHA-224")) {
            return new C34142OooO00o(InterfaceC34105OooO00o.f122526OooO0Oo);
        }
        if (str.equals(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
            return new C34142OooO00o(InterfaceC34105OooO00o.f122523OooO00o);
        }
        if (str.equals("SHA-384")) {
            return new C34142OooO00o(InterfaceC34105OooO00o.f122524OooO0O0);
        }
        if (str.equals("SHA-512")) {
            return new C34142OooO00o(InterfaceC34105OooO00o.f122525OooO0OO);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: ".concat(str));
    }

    public static InterfaceC34201OooO0Oo OooO0OO(C34142OooO00o c34142OooO00o) {
        if (c34142OooO00o.f122685OooOo0o.OooOO0o(InterfaceC34107OooO00o.f122558OooO0O0)) {
            int i = C34237OooO00o.f122982OooO00o;
            C34213OooO0o0 c34213OooO0o0 = new C34213OooO0o0();
            c34213OooO0o0.f122908OooO = new int[80];
            c34213OooO0o0.OooO0oo();
            return c34213OooO0o0;
        }
        C34032OooOo0O c34032OooOo0O = InterfaceC34105OooO00o.f122526OooO0Oo;
        C34032OooOo0O c34032OooOo0O2 = c34142OooO00o.f122685OooOo0o;
        if (c34032OooOo0O2.OooOO0o(c34032OooOo0O)) {
            int i2 = C34237OooO00o.f122982OooO00o;
            C34212OooO0o c34212OooO0o = new C34212OooO0o();
            c34212OooO0o.f122906OooOO0o = new int[64];
            c34212OooO0o.OooO0oo();
            return c34212OooO0o;
        }
        if (c34032OooOo0O2.OooOO0o(InterfaceC34105OooO00o.f122523OooO00o)) {
            int i3 = C34237OooO00o.f122982OooO00o;
            return new C34214OooO0oO();
        }
        if (c34032OooOo0O2.OooOO0o(InterfaceC34105OooO00o.f122524OooO0O0)) {
            int i4 = C34237OooO00o.f122982OooO00o;
            return new C34215OooO0oo();
        }
        if (c34032OooOo0O2.OooOO0o(InterfaceC34105OooO00o.f122525OooO0OO)) {
            int i5 = C34237OooO00o.f122982OooO00o;
            return new C34216OooOO0();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + c34032OooOo0O2);
    }

    public static final InterfaceC34595OooO0Oo OooO0Oo(InterfaceC34597OooO0o0 interfaceC34597OooO0o0) {
        Object obj;
        if (interfaceC34597OooO0o0 instanceof InterfaceC34595OooO0Oo) {
            return (InterfaceC34595OooO0Oo) interfaceC34597OooO0o0;
        }
        if (!(interfaceC34597OooO0o0 instanceof InterfaceC34608OooOOo0)) {
            throw new C32579OoooO0O("Cannot calculate JVM erasure for type: " + interfaceC34597OooO0o0);
        }
        List<InterfaceC34606OooOOOo> upperBounds = ((InterfaceC34608OooOOo0) interfaceC34597OooO0o0).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC34606OooOOOo interfaceC34606OooOOOo = (InterfaceC34606OooOOOo) next;
            kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC34606OooOOOo, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = ((C32567Oooo) interfaceC34606OooOOOo).f117034OooOo0o.o00000().OooO0OO();
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO : null;
            if (interfaceC32596OooO0o0 != null && interfaceC32596OooO0o0.getKind() != oO0O0OO.OooO0o.f117229OooOo && interfaceC32596OooO0o0.getKind() != oO0O0OO.OooO0o.f117233OooOoOO) {
                obj = next;
                break;
            }
        }
        InterfaceC34606OooOOOo interfaceC34606OooOOOo2 = (InterfaceC34606OooOOOo) obj;
        if (interfaceC34606OooOOOo2 == null) {
            interfaceC34606OooOOOo2 = (InterfaceC34606OooOOOo) oOo000Oo.OooOo.Oooo(upperBounds);
        }
        return interfaceC34606OooOOOo2 != null ? OooO0o0(interfaceC34606OooOOOo2) : C24035Oooo00o.f80943OooO00o.OooO0O0(Object.class);
    }

    public static o0O000o0.OooO00o OooO0o(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, SignInOptions signInOptions) {
        if (abstractApplicationC26277OooOoOO == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        o0O000o0.OooO00o oooO00o = new o0O000o0.OooO00o();
        oooO00o.f88134OooO0O0 = abstractApplicationC26277OooOoOO.getApplicationContext();
        oooO00o.f88133OooO00o = signInOptions;
        C34370OooO0o0.OooO0O0(abstractApplicationC26277OooOoOO);
        o0O000oo.OooO00o OooO00o2 = o0O000oo.OooO00o.OooO00o();
        OooO00o2.getClass();
        OooO00o2.f88136OooO00o = new WeakReference<>(abstractApplicationC26277OooOoOO);
        return oooO00o;
    }

    public static final InterfaceC34595OooO0Oo OooO0o0(InterfaceC34606OooOOOo interfaceC34606OooOOOo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34606OooOOOo, "<this>");
        InterfaceC34597OooO0o0 interfaceC34597OooO0o0OooO0O0 = interfaceC34606OooOOOo.OooO0O0();
        if (interfaceC34597OooO0o0OooO0O0 != null) {
            return OooO0Oo(interfaceC34597OooO0o0OooO0O0);
        }
        throw new C32579OoooO0O("Cannot calculate JVM erasure for type: " + interfaceC34606OooOOOo);
    }

    @Override // o0oOo0O0.InterfaceC30952OooO00o
    public C32443OooOOO OooO00o(DefaultZoomHandle host, View view, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(host, "host");
        int width = (view.getWidth() - i) - host.getWidth();
        int height = (view.getHeight() - i2) - host.getHeight();
        int height2 = 0;
        int width2 = (i <= 48 || width <= 48) ? i <= width ? 0 : view.getWidth() - host.getWidth() : i;
        if (i2 > 48 && height > 48) {
            height2 = i2;
        } else if (i2 > height) {
            height2 = view.getHeight() - host.getHeight();
        }
        if (width2 == i && height2 == i2) {
            return null;
        }
        return new C32443OooOOO(Integer.valueOf(width2), Integer.valueOf(height2));
    }
}
