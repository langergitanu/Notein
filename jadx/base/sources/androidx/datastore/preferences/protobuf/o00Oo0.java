package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00Oo0<T, B> {
    public abstract int OooO(T t);

    public abstract void OooO00o(B b, int i, int i2);

    public abstract void OooO0O0(B b, int i, long j);

    public abstract void OooO0OO(B b, int i, T t);

    public abstract void OooO0Oo(B b, int i, OooO oooO);

    public abstract o00Ooo OooO0o(Object obj);

    public abstract void OooO0o0(B b, int i, long j);

    public abstract o00Ooo OooO0oO(Object obj);

    public abstract int OooO0oo(T t);

    public abstract void OooOO0(Object obj);

    public abstract o00Ooo OooOO0O(Object obj, Object obj2);

    public final boolean OooOO0o(int i, OooOO0O oooOO0O, Object obj) throws IOException {
        int i2 = oooOO0O.f64437OooO0O0;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            oooOO0O.OooOo0o(0);
            OooO0o0(obj, i3, oooOO0O.f64436OooO00o.OooOOO());
            return true;
        }
        if (i4 == 1) {
            oooOO0O.OooOo0o(1);
            OooO0O0(obj, i3, oooOO0O.f64436OooO00o.OooOO0O());
            return true;
        }
        if (i4 == 2) {
            OooO0Oo(obj, i3, oooOO0O.OooO0o0());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw C21807OooOoOO.OooO0O0();
            }
            oooOO0O.OooOo0o(5);
            OooO00o(obj, i3, oooOO0O.f64436OooO00o.OooOO0());
            return true;
        }
        o00Ooo o00oooOooOOO0 = OooOOO0();
        int i5 = (i3 << 3) | 4;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new C21807OooOoOO("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (oooOO0O.OooO00o() != Integer.MAX_VALUE && OooOO0o(i6, oooOO0O, o00oooOooOOO0)) {
        }
        if (i5 != oooOO0O.f64437OooO0O0) {
            throw new C21807OooOoOO("Protocol message end-group tag did not match expected tag.");
        }
        OooO0OO(obj, i3, OooOOOo(o00oooOooOOO0));
        return true;
    }

    public abstract void OooOOO(Object obj, B b);

    public abstract o00Ooo OooOOO0();

    public abstract void OooOOOO(Object obj, T t);

    public abstract o00Ooo OooOOOo(Object obj);

    public abstract void OooOOo(T t, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0) throws IOException;

    public abstract void OooOOo0(T t, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0) throws IOException;
}
