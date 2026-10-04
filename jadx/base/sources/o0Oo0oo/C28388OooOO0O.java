package o0Oo0oo;

/* JADX INFO: renamed from: o0Oo0oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28388OooOO0O {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o0Oo0oo.OooOO0O$OooO00o */
    public static final class OooO00o<T> extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<T> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f100645OooOo0o = new OooO00o(0);

        @Override // oO0O000o.OooO00o
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T OooO00o(C28387OooOO0 c28387OooOO0, OooOo<T> key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c28387OooOO0, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        OooO00o defaultValue = OooO00o.f100645OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(defaultValue, "defaultValue");
        T t = (T) c28387OooOO0.f100643OooOo0o.get(key);
        if (t == null) {
            return null;
        }
        return t;
    }
}
