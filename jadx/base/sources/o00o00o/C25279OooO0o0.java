package o00o00o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o00Ooo0o.InterfaceC25121OooOO0O;

/* JADX INFO: renamed from: o00o00o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25279OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f86034OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f86035OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: o00o00o.OooO0o0$OooO00o */
    public static class OooO00o<T, R> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f86036OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<R> f86037OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC25121OooOO0O<T, R> f86038OooO0OO;

        public OooO00o(Class<T> cls, Class<R> cls2, InterfaceC25121OooOO0O<T, R> interfaceC25121OooOO0O) {
            this.f86036OooO00o = cls;
            this.f86037OooO0O0 = cls2;
            this.f86038OooO0OO = interfaceC25121OooOO0O;
        }
    }

    public final synchronized List<OooO00o<?, ?>> OooO00o(String str) {
        List<OooO00o<?, ?>> arrayList;
        try {
            if (!this.f86034OooO00o.contains(str)) {
                this.f86034OooO00o.add(str);
            }
            arrayList = (List) this.f86035OooO0O0.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f86035OooO0O0.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList OooO0O0(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f86034OooO00o.iterator();
        while (it.hasNext()) {
            List<OooO00o> list = (List) this.f86035OooO0O0.get((String) it.next());
            if (list != null) {
                for (OooO00o oooO00o : list) {
                    if ((oooO00o.f86036OooO00o.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(oooO00o.f86037OooO0O0)) && !arrayList.contains(oooO00o.f86037OooO0O0)) {
                        arrayList.add(oooO00o.f86037OooO0O0);
                    }
                }
            }
        }
        return arrayList;
    }
}
