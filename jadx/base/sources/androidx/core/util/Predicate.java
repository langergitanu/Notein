package androidx.core.util;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface Predicate<T> {
    static <T> Predicate<T> isEqual(final Object obj) {
        return obj == null ? new OooO0O0() : new Predicate() { // from class: androidx.core.util.OooO0OO
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$0(Predicate predicate, Object obj) {
        return test(obj) && predicate.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$1(Object obj) {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$2(Predicate predicate, Object obj) {
        return test(obj) || predicate.test(obj);
    }

    static <T> Predicate<T> not(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }

    default Predicate<T> and(final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: androidx.core.util.OooO0Oo
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f64274OooO00o.lambda$and$0(predicate, obj);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate() { // from class: androidx.core.util.OooO0o0
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f64276OooO00o.lambda$negate$1(obj);
            }
        };
    }

    /* JADX INFO: renamed from: or */
    default Predicate<T> m10or(final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: androidx.core.util.OooO00o
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f64271OooO00o.lambda$or$2(predicate, obj);
            }
        };
    }

    boolean test(T t);
}
