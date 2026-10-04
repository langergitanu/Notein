package com.aspose.slides.internal.p474wg;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.google.android.gms.fido.u2f.api.common.ClientData;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C11948k4 {

    /* JADX INFO: renamed from: k4 */
    static ArrayList f40271k4;

    /* JADX INFO: renamed from: kk */
    static InterfaceC11989xk f40272kk;

    /* JADX INFO: renamed from: x1 */
    static final Object f40273x1 = new Object();

    /* JADX INFO: renamed from: k4 */
    public static C11986x1 m55995k4(AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        if (abstractC11994yg == null) {
            throw new ArgumentNullException("request");
        }
        if (interfaceC11926c6 == null) {
            return null;
        }
        m55997k4();
        synchronized (f40271k4) {
            try {
                for (InterfaceC11918ak interfaceC11918ak : f40271k4) {
                    C11986x1 c11986x1Mo15102x1 = interfaceC11918ak.mo15102x1(abstractC11994yg, interfaceC11926c6);
                    if (c11986x1Mo15102x1 != null) {
                        c11986x1Mo15102x1.m56268k4(interfaceC11918ak);
                        return c11986x1Mo15102x1;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static C11986x1 m55998x1(String str, AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        m55997k4();
        synchronized (f40271k4) {
            try {
                for (InterfaceC11918ak interfaceC11918ak : f40271k4) {
                    C11986x1 c11986x1Mo15100k4 = interfaceC11918ak.mo15100k4(str, abstractC11994yg, interfaceC11926c6);
                    if (c11986x1Mo15100k4 != null) {
                        c11986x1Mo15100k4.m56268k4(interfaceC11918ak);
                        return c11986x1Mo15100k4;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C11986x1 m55996k4(String str, AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        if (abstractC11994yg == null) {
            throw new ArgumentNullException("request");
        }
        if (interfaceC11926c6 == null) {
            throw new ArgumentNullException("credentials");
        }
        if (str != null) {
            return m55998x1(str, abstractC11994yg, interfaceC11926c6);
        }
        throw new ArgumentNullException(ClientData.KEY_CHALLENGE);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55997k4() {
        synchronized (f40273x1) {
            try {
                if (f40271k4 == null) {
                    ArrayList arrayList = new ArrayList();
                    f40271k4 = arrayList;
                    arrayList.add(new C11938gi());
                    f40271k4.add(new C11995yj());
                    f40271k4.add(new C11949kk());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
