package o00o0o;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: o00o0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25437OooO0Oo<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final IdentityHashMap f86716OooO0Oo = new IdentityHashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public T f86717OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f86718OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25436OooO0OO<T> f86719OooO0OO;

    /* JADX INFO: renamed from: o00o0o.OooO0Oo$OooO00o */
    public static class OooO00o extends RuntimeException {
    }

    public C25437OooO0Oo(T t, InterfaceC25436OooO0OO<T> interfaceC25436OooO0OO, boolean z) {
        t.getClass();
        this.f86717OooO00o = t;
        this.f86719OooO0OO = interfaceC25436OooO0OO;
        this.f86718OooO0O0 = 1;
        if (z) {
            IdentityHashMap identityHashMap = f86716OooO0Oo;
            synchronized (identityHashMap) {
                try {
                    Integer num = (Integer) identityHashMap.get(t);
                    if (num == null) {
                        identityHashMap.put(t, 1);
                    } else {
                        identityHashMap.put(t, Integer.valueOf(num.intValue() + 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized T OooO00o() {
        return this.f86717OooO00o;
    }
}
