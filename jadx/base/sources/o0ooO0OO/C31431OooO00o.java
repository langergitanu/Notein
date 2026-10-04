package o0ooO0OO;

import OooOoo.C20593OooO0Oo;
import java.util.concurrent.ConcurrentHashMap;
import o0ooO0Oo.C31436OooO0Oo;

/* JADX INFO: renamed from: o0ooO0OO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31431OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ConcurrentHashMap f112204OooO0Oo = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f112205OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public byte[] f112206OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C31436OooO0Oo f112207OooO0OO;

    public C31431OooO00o(String str) {
        this.f112205OooO00o = str;
        if (str.startsWith("/")) {
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Operators are not allowed to start with / '", str, "'"));
        }
    }

    public static C31431OooO00o OooO00o(String str) {
        if (str.equals("ID") || "BI".equals(str)) {
            return new C31431OooO00o(str);
        }
        ConcurrentHashMap concurrentHashMap = f112204OooO0Oo;
        C31431OooO00o c31431OooO00o = (C31431OooO00o) concurrentHashMap.get(str);
        return (c31431OooO00o == null && (c31431OooO00o = (C31431OooO00o) concurrentHashMap.putIfAbsent(str, new C31431OooO00o(str))) == null) ? (C31431OooO00o) concurrentHashMap.get(str) : c31431OooO00o;
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("PDFOperator{"), this.f112205OooO00o, "}");
    }
}
