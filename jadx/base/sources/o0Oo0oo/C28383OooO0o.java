package o0Oo0oo;

import oO0O00oo.C32517OooO0Oo;

/* JADX INFO: renamed from: o0Oo0oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28383OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C28383OooO0o f100637OooO0O0 = new C28383OooO0o(new C32517OooO0Oo());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32517OooO0Oo f100638OooO00o;

    public C28383OooO0o() {
        throw null;
    }

    public C28383OooO0o(C32517OooO0Oo c32517OooO0Oo) {
        this.f100638OooO00o = c32517OooO0Oo;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28383OooO0o)) {
            return false;
        }
        C28383OooO0o c28383OooO0o = (C28383OooO0o) obj;
        c28383OooO0o.getClass();
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100638OooO00o, c28383OooO0o.f100638OooO00o);
    }

    public final int hashCode() {
        return (this.f100638OooO00o.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f100638OooO00o + ", steps=0)";
    }
}
