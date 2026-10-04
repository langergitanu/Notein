package oO0Ooo0O;

import java.io.IOException;
import oO000oO.C32103OooO00o;
import oO000oO.C32104OooO0O0;
import oO000oo.C32134OooO0o0;
import oO0Ooo0O.C33419OoooO0;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: oO0Ooo0O.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33418OoooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f120808OooO00o = C34354OooO0Oo.OooO0OO("io.ktor.client.plugins.HttpTimeout");

    public static final C32103OooO00o OooO00o(C32134OooO0o0 request, IOException iOException) {
        Object obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
        StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
        sb.append(request.f115215OooO00o);
        sb.append(", connect_timeout=");
        C33419OoooO0.OooO0O0 oooO0O0 = C33419OoooO0.f120809OooO0Oo;
        C33419OoooO0.OooO00o oooO00o = (C33419OoooO0.OooO00o) request.OooO00o();
        if (oooO00o == null || (obj = oooO00o.f120815OooO0O0) == null) {
            obj = "unknown";
        }
        return new C32103OooO00o(androidx.concurrent.futures.OooO0o.OooO0O0(sb, obj, " ms]"), iOException);
    }

    public static final C32104OooO0O0 OooO0O0(C32134OooO0o0 request, Throwable th) {
        Object obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
        StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
        sb.append(request.f115215OooO00o);
        sb.append(", socket_timeout=");
        C33419OoooO0.OooO0O0 oooO0O0 = C33419OoooO0.f120809OooO0Oo;
        C33419OoooO0.OooO00o oooO00o = (C33419OoooO0.OooO00o) request.OooO00o();
        if (oooO00o == null || (obj = oooO00o.f120816OooO0OO) == null) {
            obj = "unknown";
        }
        return new C32104OooO0O0(androidx.concurrent.futures.OooO0o.OooO0O0(sb, obj, "] ms"), th);
    }
}
