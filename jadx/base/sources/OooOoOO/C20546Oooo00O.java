package OooOoOO;

import OooOoOO.C20538OooOoO;
import java.util.LinkedHashMap;
import java.util.Map;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OooOoOO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20546Oooo00O<T> implements InterfaceC20540OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0<T> f58685OooO00o;

    /* JADX INFO: renamed from: OooOoOO.Oooo00O$OooO00o */
    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Float f58686OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC20539OooOoO0 f58687OooO0O0;

        public OooO00o() {
            throw null;
        }

        public OooO00o(Float f) {
            C20538OooOoO.OooO00o easing = C20538OooOoO.f58667OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(easing, "easing");
            this.f58686OooO00o = f;
            this.f58687OooO0O0 = easing;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o.f58686OooO00o, this.f58686OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o.f58687OooO0O0, this.f58687OooO0O0);
        }

        public final int hashCode() {
            Float f = this.f58686OooO00o;
            return this.f58687OooO0O0.hashCode() + ((f != null ? f.hashCode() : 0) * 31);
        }
    }

    /* JADX INFO: renamed from: OooOoOO.Oooo00O$OooO0O0 */
    public static final class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f58688OooO00o = 300;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final LinkedHashMap f58689OooO0O0 = new LinkedHashMap();

        public final void OooO00o(int i, Float f) {
            OooO00o oooO00o = new OooO00o(f);
            this.f58689OooO0O0.put(Integer.valueOf(i), oooO00o);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            oooO0O0.getClass();
            return this.f58688OooO00o == oooO0O0.f58688OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f58689OooO0O0, oooO0O0.f58689OooO0O0);
        }

        public final int hashCode() {
            return this.f58689OooO0O0.hashCode() + (this.f58688OooO00o * 961);
        }
    }

    public C20546Oooo00O(OooO0O0<T> oooO0O0) {
        this.f58685OooO00o = oooO0O0;
    }

    @Override // OooOoOO.InterfaceC20526OooOO0o
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final <V extends AbstractC20531OooOOo> C20578o0ooOO0<V> OooO00o(InterfaceC20574Ooooooo<T, V> converter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(converter, "converter");
        OooO0O0<T> oooO0O0 = this.f58685OooO00o;
        LinkedHashMap linkedHashMap = oooO0O0.f58689OooO0O0;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            OooO00o oooO00o = (OooO00o) entry.getValue();
            InterfaceC32507OooOO0o<T, V> convertToVector = converter.OooO00o();
            oooO00o.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(convertToVector, "convertToVector");
            linkedHashMap2.put(key, new C32443OooOOO(convertToVector.invoke(oooO00o.f58686OooO00o), oooO00o.f58687OooO0O0));
        }
        return new C20578o0ooOO0<>(oooO0O0.f58688OooO00o, linkedHashMap2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20546Oooo00O) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f58685OooO00o, ((C20546Oooo00O) obj).f58685OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f58685OooO00o.hashCode();
    }
}
