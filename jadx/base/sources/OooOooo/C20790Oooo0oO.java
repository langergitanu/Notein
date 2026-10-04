package OooOooo;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import oO00O.C32163Oooo0o;
import oO00O.C32164Oooo0o0;
import oO00O.C32165Oooo0oO;
import oO00O0oo.InterfaceC32225OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32511OooOOoo;
import oOo0000O.InterfaceC34415OooO0oo;
import oo000o.InterfaceC34630OooOO0;

/* JADX INFO: renamed from: OooOooo.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20790Oooo0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f59709OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f59710OooO0O0 = 0;

    public static String OooO00o(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static final int OooO0O0(List list, InterfaceC32508OooOOOo interfaceC32508OooOOOo, InterfaceC32508OooOOOo interfaceC32508OooOOOo2, int i, int i2, EnumC20779OooOooO enumC20779OooOooO, EnumC20779OooOooO enumC20779OooOooO2) {
        int i3 = 0;
        if (enumC20779OooOooO == enumC20779OooOooO2) {
            int size = list.size();
            float f = 0.0f;
            int iMax = 0;
            int i4 = 0;
            while (i3 < size) {
                InterfaceC34630OooOO0 interfaceC34630OooOO0 = (InterfaceC34630OooOO0) list.get(i3);
                float fOooO0Oo = OooO0Oo(OooO0OO(interfaceC34630OooOO0));
                int iIntValue = ((Number) interfaceC32508OooOOOo.invoke(interfaceC34630OooOO0, Integer.valueOf(i))).intValue();
                if (fOooO0Oo == 0.0f) {
                    i4 += iIntValue;
                } else if (fOooO0Oo > 0.0f) {
                    f += fOooO0Oo;
                    iMax = Math.max(iMax, oO0O00O.OooO00o.OooO0O0(iIntValue / fOooO0Oo));
                }
                i3++;
            }
            return ((list.size() - 1) * i2) + oO0O00O.OooO00o.OooO0O0(iMax * f) + i4;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size2 = list.size();
        float f2 = 0.0f;
        int iMax2 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            InterfaceC34630OooOO0 interfaceC34630OooOO02 = (InterfaceC34630OooOO0) list.get(i5);
            float fOooO0Oo2 = OooO0Oo(OooO0OO(interfaceC34630OooOO02));
            if (fOooO0Oo2 == 0.0f) {
                int iMin2 = Math.min(((Number) interfaceC32508OooOOOo2.invoke(interfaceC34630OooOO02, Integer.MAX_VALUE)).intValue(), i - iMin);
                iMin += iMin2;
                iMax2 = Math.max(iMax2, ((Number) interfaceC32508OooOOOo.invoke(interfaceC34630OooOO02, Integer.valueOf(iMin2))).intValue());
            } else if (fOooO0Oo2 > 0.0f) {
                f2 += fOooO0Oo2;
            }
        }
        int iOooO0O0 = f2 == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : oO0O00O.OooO00o.OooO0O0(Math.max(i - iMin, 0) / f2);
        int size3 = list.size();
        while (i3 < size3) {
            InterfaceC34630OooOO0 interfaceC34630OooOO03 = (InterfaceC34630OooOO0) list.get(i3);
            float fOooO0Oo3 = OooO0Oo(OooO0OO(interfaceC34630OooOO03));
            if (fOooO0Oo3 > 0.0f) {
                iMax2 = Math.max(iMax2, ((Number) interfaceC32508OooOOOo.invoke(interfaceC34630OooOO03, Integer.valueOf(iOooO0O0 != Integer.MAX_VALUE ? oO0O00O.OooO00o.OooO0O0(iOooO0O0 * fOooO0Oo3) : Integer.MAX_VALUE))).intValue());
            }
            i3++;
        }
        return iMax2;
    }

    public static final C20794OoooO00 OooO0OO(InterfaceC34630OooOO0 interfaceC34630OooOO0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34630OooOO0, "<this>");
        Object objOooO0OO = interfaceC34630OooOO0.OooO0OO();
        if (objOooO0OO instanceof C20794OoooO00) {
            return (C20794OoooO00) objOooO0OO;
        }
        return null;
    }

    public static final float OooO0Oo(C20794OoooO00 c20794OoooO00) {
        if (c20794OoooO00 != null) {
            return c20794OoooO00.f59716OooO00o;
        }
        return 0.0f;
    }

    public static final Object OooO0o(oO00O0oo.OooOO0O oooOO0O, InterfaceC34415OooO0oo interfaceC34415OooO0oo, io.ktor.client.engine.cio.OooOO0O oooOO0O2, io.ktor.client.engine.cio.OooO oooO) throws NoSuchAlgorithmException, KeyStoreException {
        C32165Oooo0oO c32165Oooo0oO = new C32165Oooo0oO();
        oooOO0O2.invoke(c32165Oooo0oO);
        SecureRandom secureRandom = new SecureRandom();
        ArrayList arrayList = c32165Oooo0oO.f115389OooO00o;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        kotlin.jvm.internal.OooOOO0.OooO0Oo(trustManagerFactory);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(trustManagers);
        ArrayList arrayList2 = new ArrayList();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                arrayList2.add(trustManager);
            }
        }
        return OooO0oO(oooOO0O, interfaceC34415OooO0oo, new C32163Oooo0o(secureRandom, arrayList, (X509TrustManager) oOo000Oo.OooOo.Oooo0oO(arrayList2), c32165Oooo0oO.f115390OooO0O0, c32165Oooo0oO.f115391OooO0OO), oooO);
    }

    public static final C20788Oooo0o OooO0o0(EnumC20779OooOooO enumC20779OooOooO, InterfaceC32511OooOOoo arrangement, float f, AbstractC20742OooO abstractC20742OooO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(arrangement, "arrangement");
        return new C20788Oooo0o(enumC20779OooOooO, arrangement, f, abstractC20742OooO);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0oO(oO00O0oo.OooOO0O oooOO0O, InterfaceC34415OooO0oo interfaceC34415OooO0oo, C32163Oooo0o c32163Oooo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IOException {
        C32164Oooo0o0 c32164Oooo0o0;
        if (abstractC32479OooO0OO instanceof C32164Oooo0o0) {
            c32164Oooo0o0 = (C32164Oooo0o0) abstractC32479OooO0OO;
            int i = c32164Oooo0o0.f115388OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32164Oooo0o0.f115388OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c32164Oooo0o0 = new C32164Oooo0o0(abstractC32479OooO0OO);
            }
        }
        C32164Oooo0o0 c32164Oooo0o02 = c32164Oooo0o0;
        Object objOooO0O0 = c32164Oooo0o02.f115386OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32164Oooo0o02.f115388OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                InterfaceC32225OooOOo0 interfaceC32225OooOOo0 = oooOO0O.f115660OooO00o;
                io.ktor.utils.p616io.OooO00o oooO00o = oooOO0O.f115661OooO0O0;
                io.ktor.utils.p616io.OooO00o oooO00o2 = oooOO0O.f115662OooO0OO;
                c32164Oooo0o02.f115387OooOo0o = oooOO0O;
                c32164Oooo0o02.f115388OooOoO0 = 1;
                objOooO0O0 = C20782Oooo0.OooO0O0(interfaceC32225OooOOo0, oooO00o, oooO00o2, c32163Oooo0o, interfaceC34415OooO0oo, c32164Oooo0o02);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOO0O = c32164Oooo0o02.f115387OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
            }
            return (InterfaceC32225OooOOo0) objOooO0O0;
        } catch (Throwable th) {
            oooOO0O.f115661OooO0O0.OooO0Oo(th);
            oooOO0O.f115662OooO0OO.OooO0Oo(th);
            oooOO0O.f115660OooO00o.close();
            throw th;
        }
    }
}
