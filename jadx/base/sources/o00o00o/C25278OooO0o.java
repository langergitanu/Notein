package o00o00o;

import java.util.ArrayList;
import o00Ooo0o.InterfaceC25122OooOO0o;

/* JADX INFO: renamed from: o00o00o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25278OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f86031OooO00o = new ArrayList();

    /* JADX INFO: renamed from: o00o00o.OooO0o$OooO00o */
    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f86032OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC25122OooOO0o<T> f86033OooO0O0;

        public OooO00o(Class<T> cls, InterfaceC25122OooOO0o<T> interfaceC25122OooOO0o) {
            this.f86032OooO00o = cls;
            this.f86033OooO0O0 = interfaceC25122OooOO0o;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized <Z> InterfaceC25122OooOO0o<Z> OooO00o(Class<Z> cls) {
        int size = this.f86031OooO00o.size();
        for (int i = 0; i < size; i++) {
            OooO00o oooO00o = (OooO00o) this.f86031OooO00o.get(i);
            if (oooO00o.f86032OooO00o.isAssignableFrom((Class<?>) cls)) {
                return oooO00o.f86033OooO0O0;
            }
        }
        return null;
    }
}
