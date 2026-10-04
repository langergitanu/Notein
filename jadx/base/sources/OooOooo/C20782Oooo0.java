package OooOooo;

import Oooo0o0.C21005OooOoO0;
import OoooOoO.InterfaceC21233OooO0o;
import android.text.TextUtils;
import java.util.Random;
import o00OOOo.C25014OooO0o0;
import o0ooOO0.C31604o0ooOoO;
import oO00O.C32161Oooo0O0;
import oO00O.C32162Oooo0OO;
import oO00O.C32163Oooo0o;
import oO00O.C32166Oooo0oo;
import oO00O.C32171OoooOO0;
import oO00O0oo.InterfaceC32225OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OOo.C33706OooOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: OooOooo.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20782Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f59677OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f59678OooO0O0 = 0;

    public static String OooO00o() {
        int i = C25014OooO0o0.f84902OooO00o;
        String strOooO00o = C20790Oooo0oO.OooO00o("ro.aliyun.clouduuid");
        if (TextUtils.isEmpty(strOooO00o)) {
            strOooO00o = C20790Oooo0oO.OooO00o("ro.sys.aliyun.clouduuid");
        }
        if (TextUtils.isEmpty(strOooO00o)) {
            try {
                strOooO00o = (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                strOooO00o = "";
            }
        }
        if (!C25014OooO0o0.OooO0O0(strOooO00o)) {
            return strOooO00o;
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNanoTime = (int) System.nanoTime();
        int iNextInt = new Random().nextInt();
        int iNextInt2 = new Random().nextInt();
        byte[] bArrOooO0O0 = o00OOOo.OooO0OO.OooO0O0(iCurrentTimeMillis);
        byte[] bArrOooO0O02 = o00OOOo.OooO0OO.OooO0O0(iNanoTime);
        byte[] bArrOooO0O03 = o00OOOo.OooO0OO.OooO0O0(iNextInt);
        byte[] bArrOooO0O04 = o00OOOo.OooO0OO.OooO0O0(iNextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bArrOooO0O0, 0, bArr, 0, 4);
        System.arraycopy(bArrOooO0O02, 0, bArr, 4, 4);
        System.arraycopy(bArrOooO0O03, 0, bArr, 8, 4);
        System.arraycopy(bArrOooO0O04, 0, bArr, 12, 4);
        return o00OOOo.OooO0O0.OooO0OO(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(InterfaceC32225OooOOo0 interfaceC32225OooOOo0, io.ktor.utils.p616io.OooO00o oooO00o, io.ktor.utils.p616io.OooO00o oooO00o2, C32163Oooo0o c32163Oooo0o, InterfaceC34415OooO0oo interfaceC34415OooO0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws C32166Oooo0oo {
        C32162Oooo0OO c32162Oooo0OO;
        InterfaceC32225OooOOo0 interfaceC32225OooOOo02;
        C32161Oooo0O0 c32161Oooo0O0;
        if (abstractC32479OooO0OO instanceof C32162Oooo0OO) {
            c32162Oooo0OO = (C32162Oooo0OO) abstractC32479OooO0OO;
            int i = c32162Oooo0OO.f115380OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32162Oooo0OO.f115380OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c32162Oooo0OO = new C32162Oooo0OO(abstractC32479OooO0OO);
            }
        }
        Object obj = c32162Oooo0OO.f115378OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32162Oooo0OO.f115380OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C32161Oooo0O0 c32161Oooo0O02 = new C32161Oooo0O0(oooO00o, oooO00o2, c32163Oooo0o, interfaceC34415OooO0oo);
                c32162Oooo0OO.f115377OooOo0o = interfaceC32225OooOOo0;
                c32162Oooo0OO.f115376OooOo = interfaceC34415OooO0oo;
                c32162Oooo0OO.f115379OooOoO0 = c32161Oooo0O02;
                c32162Oooo0OO.f115380OooOoOO = 1;
                if (c32161Oooo0O02.OooO0o(c32162Oooo0OO) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                interfaceC32225OooOOo02 = interfaceC32225OooOOo0;
                c32161Oooo0O0 = c32161Oooo0O02;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c32161Oooo0O0 = c32162Oooo0OO.f115379OooOoO0;
                interfaceC34415OooO0oo = c32162Oooo0OO.f115376OooOo;
                interfaceC32225OooOOo02 = c32162Oooo0OO.f115377OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            return new C32171OoooOO0(c32161Oooo0O0.f115372OooOoo, c32161Oooo0O0.f115374OooOooO, interfaceC32225OooOOo02, interfaceC34415OooO0oo);
        } catch (C33706OooOOo e) {
            throw new C32166Oooo0oo("Negotiation failed due to EOS", e);
        }
    }

    public static InterfaceC21233OooO0o OooO0OO(InterfaceC21233OooO0o padding, float f, int i) {
        float f2 = C21005OooOoO0.f60812OooO0O0;
        if ((i & 1) != 0) {
            f = 0;
        }
        float f3 = f;
        if ((i & 2) != 0) {
            f2 = 0;
        }
        float f4 = f2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(padding, "$this$padding");
        return padding.o00ooo(new C20786Oooo0O0(f3, f4, f3, f4, C31604o0ooOoO.f112933OooO00o));
    }

    public static InterfaceC21233OooO0o OooO0Oo(InterfaceC21233OooO0o padding, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        float f4 = f;
        if ((i & 2) != 0) {
            f2 = 0;
        }
        float f5 = f2;
        if ((i & 4) != 0) {
            f3 = 0;
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(padding, "$this$padding");
        return padding.o00ooo(new C20786Oooo0O0(f4, f5, f3, 0, C31604o0ooOoO.f112933OooO00o));
    }

    public static final Class OooO0o0(ClassLoader classLoader, String fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
