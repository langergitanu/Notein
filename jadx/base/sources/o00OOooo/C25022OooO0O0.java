package o00OOooo;

import OooOooo.C20782Oooo0;
import android.content.Context;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Adler32;
import kotlin.jvm.internal.OooOOO0;
import o00OOOo.C25014OooO0o0;
import oO0O0O0.C32579OoooO0O;
import oO0O0O0.C32585OoooOoo;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.InterfaceC32642OooooOo;
import oO0O0OO.OooOO0;
import oO0O0OO.OooOO0O;
import oO0OOOo.C32992OooOO0O;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.o00Oo0;
import ooOOOoO0.C35100OooO0oo;
import ooOOOoO0.InterfaceC35091OooO0o0;
import ooOOOoO0.OooO0o;

/* JADX INFO: renamed from: o00OOooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25022OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static C25021OooO00o f84958OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f84959OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f84960OooO0OO = 0;

    public static final Class OooO(OooOO0O oooOO0O) {
        if (!(oooOO0O instanceof InterfaceC32596OooO0o0) || !C32992OooOO0O.OooO0O0(oooOO0O)) {
            return null;
        }
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = (InterfaceC32596OooO0o0) oooOO0O;
        Class<?> clsOooOO0 = C32585OoooOoo.OooOO0(interfaceC32596OooO0o0);
        if (clsOooOO0 != null) {
            return clsOooOO0;
        }
        throw new C32579OoooO0O("Class object for the class " + interfaceC32596OooO0o0.getName() + " cannot be found (classId=" + C33194OooO0O0.OooO0o((InterfaceC32598OooO0oo) oooOO0O) + ')');
    }

    public static C25021OooO00o OooO00o(Context context) {
        String strOooO00o;
        if (context == null) {
            return null;
        }
        synchronized (f84959OooO0O0) {
            try {
                if (C25023OooO0OO.f84962OooO0oo == null) {
                    synchronized (C25023OooO0OO.f84961OooO0oO) {
                        try {
                            if (C25023OooO0OO.f84962OooO0oo == null) {
                                C25023OooO0OO c25023OooO0OO = new C25023OooO0OO(context);
                                C25023OooO0OO.f84962OooO0oo = c25023OooO0OO;
                                c25023OooO0OO.OooO0o0();
                            }
                        } finally {
                        }
                    }
                }
                C25023OooO0OO c25023OooO0OO2 = C25023OooO0OO.f84962OooO0oo;
                synchronized (c25023OooO0OO2) {
                    strOooO00o = c25023OooO0OO2.f84963OooO00o;
                    if (strOooO00o == null) {
                        strOooO00o = c25023OooO0OO2.OooO00o();
                    }
                }
                if (C25014OooO0o0.OooO0O0(strOooO00o)) {
                    return null;
                }
                if (strOooO00o.endsWith(IOUtils.LINE_SEPARATOR_UNIX)) {
                    strOooO00o = strOooO00o.substring(0, strOooO00o.length() - 1);
                }
                C25021OooO00o c25021OooO00o = new C25021OooO00o();
                c25021OooO00o.f84953OooO00o = "";
                c25021OooO00o.f84954OooO0O0 = "";
                c25021OooO00o.f84955OooO0OO = "";
                c25021OooO00o.f84956OooO0Oo = "";
                c25021OooO00o.f84957OooO0o0 = 0L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strOooO00o2 = C20782Oooo0.OooO00o();
                c25021OooO00o.f84955OooO0OO = strOooO00o2;
                c25021OooO00o.f84953OooO00o = strOooO00o2;
                c25021OooO00o.f84957OooO0o0 = jCurrentTimeMillis;
                c25021OooO00o.f84954OooO0O0 = "";
                c25021OooO00o.f84956OooO0Oo = strOooO00o;
                OooO0O0(c25021OooO00o);
                return c25021OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void OooO0O0(C25021OooO00o c25021OooO00o) {
        String str = c25021OooO00o.f84956OooO0Oo + c25021OooO00o.f84955OooO0OO + c25021OooO00o.f84957OooO0o0 + c25021OooO00o.f84954OooO0O0 + c25021OooO00o.f84953OooO00o;
        if (C25014OooO0o0.OooO0O0(str)) {
            return;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(str.getBytes());
        adler32.getValue();
    }

    public static final void OooO0OO(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(MsalUtils.QUERY_STRING_SYMBOL);
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final Object OooO0Oo(Object obj, oO0O0OO.OooO0O0 oooO0O0) {
        AbstractC33320OooOoo abstractC33320OooOooOooO0o;
        Class clsOooOO0;
        return (((oooO0O0 instanceof InterfaceC32627Oooo0oo) && C32992OooOO0O.OooO0Oo((InterfaceC32642OooooOo) oooO0O0)) || (abstractC33320OooOooOooO0o = OooO0o(oooO0O0)) == null || (clsOooOO0 = OooOO0(abstractC33320OooOooOooO0o)) == null) ? obj : OooO0oO(clsOooOO0, oooO0O0).invoke(obj, new Object[0]);
    }

    public static final AbstractC33320OooOoo OooO0o(oO0O0OO.OooO0O0 oooO0O0) {
        InterfaceC32629OoooO0 interfaceC32629OoooO0OoooOoo = oooO0O0.OoooOoo();
        InterfaceC32629OoooO0 interfaceC32629OoooO0OoooOo0 = oooO0O0.OoooOo0();
        if (interfaceC32629OoooO0OoooOoo != null) {
            return interfaceC32629OoooO0OoooOoo.getType();
        }
        if (interfaceC32629OoooO0OoooOo0 != null) {
            if (oooO0O0 instanceof OooOO0) {
                return interfaceC32629OoooO0OoooOo0.getType();
            }
            OooOO0O oooOO0OOooO0Oo = oooO0O0.OooO0Oo();
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = oooOO0OOooO0Oo instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) oooOO0OOooO0Oo : null;
            if (interfaceC32596OooO0o0 != null) {
                return interfaceC32596OooO0o0.OooOOO();
            }
        }
        return null;
    }

    public static final OooO0o OooO0o0(InterfaceC32609OooOo0 descriptor, OooO0o oooO0o, boolean z) {
        AbstractC33320OooOoo returnType;
        AbstractC33320OooOoo abstractC33320OooOooOooO0o;
        OooOOO0.OooO0oO(descriptor, "descriptor");
        if (!C32992OooOO0O.OooO00o(descriptor)) {
            List<InterfaceC32641OooooOO> listOooO0o = descriptor.OooO0o();
            OooOOO0.OooO0o(listOooO0o, "descriptor.valueParameters");
            List<InterfaceC32641OooooOO> list = listOooO0o;
            if ((list instanceof Collection) && list.isEmpty()) {
                returnType = descriptor.getReturnType();
                return returnType != null ? oooO0o : oooO0o;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC33320OooOoo type = ((InterfaceC32641OooooOO) it.next()).getType();
                OooOOO0.OooO0o(type, "it.type");
                if (C32992OooOO0O.OooO0OO(type)) {
                    break;
                }
            }
            returnType = descriptor.getReturnType();
            if ((returnType != null || !C32992OooOO0O.OooO0OO(returnType)) && ((oooO0o instanceof InterfaceC35091OooO0o0) || (abstractC33320OooOooOooO0o = OooO0o(descriptor)) == null || !C32992OooOO0O.OooO0OO(abstractC33320OooOooOooO0o))) {
            }
        }
        return new C35100OooO0oo(descriptor, oooO0o, z);
    }

    public static final Method OooO0oO(Class cls, oO0O0OO.OooO0O0 descriptor) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            OooOOO0.OooO0o(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C32579OoooO0O("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final int OooO0oo(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Class OooOO0(AbstractC33320OooOoo abstractC33320OooOoo) {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0o;
        OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        Class clsOooO = OooO(abstractC33320OooOoo.o00000().OooO0OO());
        if (clsOooO == null) {
            return null;
        }
        if (o00Oo0.OooO0o(abstractC33320OooOoo) && ((abstractC33328Oooo0O0OooO0o = C32992OooOO0O.OooO0o(abstractC33320OooOoo)) == null || o00Oo0.OooO0o(abstractC33328Oooo0O0OooO0o) || oO0O0O0o.OooOO0.Oooo000(abstractC33328Oooo0O0OooO0o))) {
            return null;
        }
        return clsOooO;
    }
}
