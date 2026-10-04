package com.aspose.slides.internal.p368qq;

import com.aspose.slides.internal.p489x1.InterfaceC12359fa;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.qq.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9919h4 {

    /* JADX INFO: renamed from: k4 */
    private static final long[] f35802k4 = {0, 0, 2281701374L, 134217726};

    /* JADX INFO: renamed from: x1 */
    private static final long[] f35803x1 = {0, 67051520, 2281701374L, 134217726};

    /* JADX INFO: renamed from: du */
    public static C9930to m48822du(String str) {
        return new C9930to(C14113y2.m67402k4("Malformed function '{0}'.", str));
    }

    /* JADX INFO: renamed from: k4 */
    public static C9930to m48823k4(int i, String str) {
        return new C9930to(C14113y2.m67402k4("Invalid token '{0}'.", str));
    }

    /* JADX INFO: renamed from: kk */
    public static C9930to m48829kk(String str) {
        return new C9930to(C14113y2.m67402k4("Invalid property value '{0}'.", str));
    }

    /* JADX INFO: renamed from: to */
    public static C9930to m48830to(String str) {
        return new C9930to(C14113y2.m67402k4("Invalid property values '{0}'.", str));
    }

    /* JADX INFO: renamed from: x1 */
    public static int m48831x1(char c) {
        return (c < '0' || c > '9') ? c - 'W' : c - '0';
    }

    /* JADX INFO: renamed from: k4 */
    public static C9930to m48824k4(InterfaceC12359fa interfaceC12359fa) {
        return new C9930to(C14113y2.m67402k4("Invalid color '{0}' at line {1}:{2}", interfaceC12359fa.mo57918ck(), Integer.valueOf(interfaceC12359fa.mo57921dy()), Integer.valueOf(interfaceC12359fa.mo57917c5())));
    }

    /* JADX INFO: renamed from: x1 */
    public static C9930to m48832x1(InterfaceC12359fa interfaceC12359fa) {
        return m48823k4(interfaceC12359fa.mo57924jd(), interfaceC12359fa.mo57918ck());
    }

    /* JADX INFO: renamed from: k4 */
    public static C9930to m48825k4(String str) {
        return new C9930to(str);
    }

    /* JADX INFO: renamed from: x1 */
    public static C9930to m48833x1(String str) {
        return new C9930to(C14113y2.m67402k4("Invalid identifier '{0}'.", str));
    }

    /* JADX INFO: renamed from: k4 */
    public static C9930to m48826k4(Throwable th) {
        return new C9930to(th.getMessage());
    }

    /* JADX INFO: renamed from: k4 */
    public static C9930to m48827k4(short s) {
        return new C9930to(C14113y2.m67402k4("Lexical unit '{0}' is not supported.", Short.valueOf(s)));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m48828k4(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 'a' || c > 'f') {
            return c >= 'A' && c <= 'F';
        }
        return true;
    }
}
