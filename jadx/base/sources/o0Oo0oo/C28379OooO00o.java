package o0Oo0oo;

import oO00ooO.InterfaceC32437OooO0o0;

/* JADX INFO: renamed from: o0Oo0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28379OooO00o<T extends InterfaceC32437OooO0o0<? extends Boolean>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100635OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final T f100636OooO0O0;

    public C28379OooO00o(String str, T t) {
        this.f100635OooO00o = str;
        this.f100636OooO0O0 = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28379OooO00o)) {
            return false;
        }
        C28379OooO00o c28379OooO00o = (C28379OooO00o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100635OooO00o, c28379OooO00o.f100635OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100636OooO0O0, c28379OooO00o.f100636OooO0O0);
    }

    public final int hashCode() {
        String str = this.f100635OooO00o;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.f100636OooO0O0;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f100635OooO00o + ", action=" + this.f100636OooO0O0 + ')';
    }
}
