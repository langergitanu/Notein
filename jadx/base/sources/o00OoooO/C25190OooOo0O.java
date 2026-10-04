package o00OoooO;

import com.bumptech.glide.OooO;
import java.util.ArrayList;
import java.util.HashSet;
import o00Ooo0o.C25111OooO;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0O0O.C25321OooO00o;

/* JADX INFO: renamed from: o00OoooO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25190OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f85754OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f85755OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashSet f85756OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25321OooO00o.OooO0OO f85757OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0OO f85753OooO0o0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f85752OooO0o = new OooO00o();

    /* JADX INFO: renamed from: o00OoooO.OooOo0O$OooO00o */
    public static class OooO00o implements InterfaceC25186OooOOo<Object, Object> {
        @Override // o00OoooO.InterfaceC25186OooOOo
        public final InterfaceC25186OooOOo.OooO00o<Object> OooO00o(Object obj, int i, int i2, C25111OooO c25111OooO) {
            return null;
        }

        @Override // o00OoooO.InterfaceC25186OooOOo
        public final boolean OooO0O0(Object obj) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooOo0O$OooO0O0 */
    public static class OooO0O0<Model, Data> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<Model> f85758OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<Data> f85759OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC25188OooOOoo<? extends Model, ? extends Data> f85760OooO0OO;

        public OooO0O0(Class<Model> cls, Class<Data> cls2, InterfaceC25188OooOOoo<? extends Model, ? extends Data> interfaceC25188OooOOoo) {
            this.f85758OooO00o = cls;
            this.f85759OooO0O0 = cls2;
            this.f85760OooO0OO = interfaceC25188OooOOoo;
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooOo0O$OooO0OO */
    public static class OooO0OO {
    }

    public C25190OooOo0O(C25321OooO00o.OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = f85753OooO0o0;
        this.f85754OooO00o = new ArrayList();
        this.f85756OooO0OO = new HashSet();
        this.f85757OooO0Oo = oooO0OO;
        this.f85755OooO0O0 = oooO0OO2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList OooO00o(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (OooO0O0 oooO0O0 : this.f85754OooO00o) {
                if (!this.f85756OooO0OO.contains(oooO0O0) && oooO0O0.f85758OooO00o.isAssignableFrom((Class<?>) cls)) {
                    this.f85756OooO0OO.add(oooO0O0);
                    arrayList.add(oooO0O0.f85760OooO0OO.OooO0OO(this));
                    this.f85756OooO0OO.remove(oooO0O0);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized <Model, Data> InterfaceC25186OooOOo<Model, Data> OooO0O0(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (OooO0O0 oooO0O0 : this.f85754OooO00o) {
                if (this.f85756OooO0OO.contains(oooO0O0)) {
                    z = true;
                } else if (oooO0O0.f85758OooO00o.isAssignableFrom(cls) && oooO0O0.f85759OooO0O0.isAssignableFrom(cls2)) {
                    this.f85756OooO0OO.add(oooO0O0);
                    arrayList.add(oooO0O0.f85760OooO0OO.OooO0OO(this));
                    this.f85756OooO0OO.remove(oooO0O0);
                }
            }
            if (arrayList.size() > 1) {
                OooO0OO oooO0OO = this.f85755OooO0O0;
                C25321OooO00o.OooO0OO oooO0OO2 = this.f85757OooO0Oo;
                oooO0OO.getClass();
                return new C25189OooOo0(arrayList, oooO0OO2);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC25186OooOOo) arrayList.get(0);
            }
            if (z) {
                return f85752OooO0o;
            }
            throw new OooO.OooO0OO("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f85756OooO0OO.clear();
            throw th;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList OooO0OO(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (OooO0O0 oooO0O0 : this.f85754OooO00o) {
            if (!arrayList.contains(oooO0O0.f85759OooO0O0) && oooO0O0.f85758OooO00o.isAssignableFrom((Class<?>) cls)) {
                arrayList.add(oooO0O0.f85759OooO0O0);
            }
        }
        return arrayList;
    }
}
