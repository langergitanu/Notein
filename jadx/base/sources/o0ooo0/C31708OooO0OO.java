package o0ooo0;

import java.io.BufferedInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o0oo0oO.C31327OooO0O0;
import o0oo0oO.C31328OooO0OO;

/* JADX INFO: renamed from: o0ooo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31708OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Map<String, C31327OooO0O0> f113247OooO00o = Collections.synchronizedMap(new HashMap());

    public static C31327OooO0O0 OooO00o(String str) throws Throwable {
        BufferedInputStream bufferedInputStreamOooO0Oo;
        Map<String, C31327OooO0O0> map = f113247OooO00o;
        C31327OooO0O0 c31327OooO0O0 = map.get(str);
        if (c31327OooO0O0 != null) {
            return c31327OooO0O0;
        }
        C31328OooO0OO c31328OooO0OO = new C31328OooO0OO();
        try {
            bufferedInputStreamOooO0Oo = C31328OooO0OO.OooO0Oo(str);
            try {
                c31328OooO0OO.f111871OooO0O0 = false;
                C31327OooO0O0 c31327OooO0O0OooO0oo = c31328OooO0OO.OooO0oo(bufferedInputStreamOooO0Oo);
                bufferedInputStreamOooO0Oo.close();
                map.put(c31327OooO0O0OooO0oo.f111861OooO00o, c31327OooO0O0OooO0oo);
                return c31327OooO0O0OooO0oo;
            } catch (Throwable th) {
                th = th;
                if (bufferedInputStreamOooO0Oo != null) {
                    bufferedInputStreamOooO0Oo.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStreamOooO0Oo = null;
        }
    }
}
