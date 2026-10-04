package o00o00O0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f85980OooO00o = new ArrayList();

    public static final class OooO00o<Z, R> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<Z> f85981OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<R> f85982OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC25253OooO0o0<Z, R> f85983OooO0OO;

        public OooO00o(Class<Z> cls, Class<R> cls2, InterfaceC25253OooO0o0<Z, R> interfaceC25253OooO0o0) {
            this.f85981OooO00o = cls;
            this.f85982OooO0O0 = cls2;
            this.f85983OooO0OO = interfaceC25253OooO0o0;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList OooO00o(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (OooO00o oooO00o : this.f85980OooO00o) {
            if ((oooO00o.f85981OooO00o.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(oooO00o.f85982OooO0O0)) && !arrayList.contains(oooO00o.f85982OooO0O0)) {
                arrayList.add(oooO00o.f85982OooO0O0);
            }
        }
        return arrayList;
    }
}
