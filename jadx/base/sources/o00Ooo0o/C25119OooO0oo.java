package o00Ooo0o;

import android.text.TextUtils;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o00Ooo0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25119OooO0oo<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f85385OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f85386OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0<T> f85387OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f85388OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile byte[] f85389OooO0Oo;

    /* JADX INFO: renamed from: o00Ooo0o.OooO0oo$OooO00o */
    public class OooO00o implements OooO0O0<Object> {
        @Override // o00Ooo0o.C25119OooO0oo.OooO0O0
        public final void OooO00o(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* JADX INFO: renamed from: o00Ooo0o.OooO0oo$OooO0O0 */
    public interface OooO0O0<T> {
        void OooO00o(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public C25119OooO0oo(String str, T t, OooO0O0<T> oooO0O0) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f85388OooO0OO = str;
        this.f85386OooO00o = t;
        this.f85387OooO0O0 = oooO0O0;
    }

    public static C25119OooO0oo OooO00o(Object obj, String str) {
        return new C25119OooO0oo(str, obj, f85385OooO0o0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25119OooO0oo) {
            return this.f85388OooO0OO.equals(((C25119OooO0oo) obj).f85388OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f85388OooO0OO.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("Option{key='"), this.f85388OooO0OO, "'}");
    }
}
