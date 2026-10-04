package oO00ooO;

import java.io.Serializable;

/* JADX INFO: renamed from: oO00ooO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32445OooOOOO<T> implements Serializable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object f116639OooOo0o;

    /* JADX INFO: renamed from: oO00ooO.OooOOOO$OooO00o */
    public static final class OooO00o implements Serializable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Throwable f116640OooOo0o;

        public OooO00o(Throwable exception) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(exception, "exception");
            this.f116640OooOo0o = exception;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f116640OooOo0o, ((OooO00o) obj).f116640OooOo0o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f116640OooOo0o.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f116640OooOo0o + ')';
        }
    }

    public static final Throwable OooO00o(Object obj) {
        if (obj instanceof OooO00o) {
            return ((OooO00o) obj).f116640OooOo0o;
        }
        return null;
    }

    public static String OooO0O0(Object obj) {
        if (obj instanceof OooO00o) {
            return ((OooO00o) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32445OooOOOO) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f116639OooOo0o, ((C32445OooOOOO) obj).f116639OooOo0o);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f116639OooOo0o;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return OooO0O0(this.f116639OooOo0o);
    }
}
