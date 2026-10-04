package oO0O0O0;

import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: oO0O0O0.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32580OoooOO0 {

    /* JADX INFO: renamed from: oO0O0O0.OoooOO0$OooO00o */
    public static class OooO00o<T> extends OooO0OO<T> implements oO0O000o.OooO00o<T> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final kotlin.jvm.internal.OooOOOO f117081OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public volatile SoftReference<Object> f117082OooOoO0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(oO0O0OO.OooO0O0 oooO0O0, oO0O000o.OooO00o oooO00o) {
            if (oooO00o == 0) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            }
            this.f117082OooOoO0 = null;
            this.f117081OooOo = (kotlin.jvm.internal.OooOOOO) oooO00o;
            if (oooO0O0 != null) {
                this.f117082OooOoO0 = new SoftReference<>(oooO0O0);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
        @Override // oO0O000o.OooO00o
        public final T invoke() {
            T t;
            SoftReference<Object> softReference = this.f117082OooOoO0;
            Object obj = OooO0OO.f117085OooOo0o;
            if (softReference != null && (t = (T) softReference.get()) != null) {
                if (t == obj) {
                    return null;
                }
                return t;
            }
            T t2 = (T) this.f117081OooOo.invoke();
            if (t2 != null) {
                obj = t2;
            }
            this.f117082OooOoO0 = new SoftReference<>(obj);
            return t2;
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OoooOO0$OooO0O0 */
    public static class OooO0O0<T> extends OooO0OO<T> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final kotlin.jvm.internal.OooOOOO f117083OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public volatile Object f117084OooOoO0 = null;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(oO0O000o.OooO00o<T> oooO00o) {
            this.f117083OooOo = (kotlin.jvm.internal.OooOOOO) oooO00o;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
        public final T invoke() {
            T t = (T) this.f117084OooOoO0;
            Object obj = OooO0OO.f117085OooOo0o;
            if (t != null) {
                if (t == obj) {
                    return null;
                }
                return t;
            }
            T t2 = (T) this.f117083OooOo.invoke();
            if (t2 != null) {
                obj = t2;
            }
            this.f117084OooOoO0 = obj;
            return t2;
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OoooOO0$OooO0OO */
    public static abstract class OooO0OO<T> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f117085OooOo0o = new OooO00o();

        /* JADX INFO: renamed from: oO0O0O0.OoooOO0$OooO0OO$OooO00o */
        public static class OooO00o {
        }
    }

    public static OooO00o OooO00o(oO0O0OO.OooO0O0 oooO0O0, oO0O000o.OooO00o oooO00o) {
        if (oooO00o != null) {
            return new OooO00o(oooO0O0, oooO00o);
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }
}
