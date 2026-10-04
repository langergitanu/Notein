package o00O00oO;

import android.graphics.Rect;
import o00O00o.C24807OooO0O0;
import o00O00oO.InterfaceC24815OooO0OO;

/* JADX INFO: renamed from: o00O00oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24816OooO0Oo implements InterfaceC24815OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24807OooO0O0 f84163OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f84164OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC24815OooO0OO.OooO0O0 f84165OooO0OO;

    /* JADX INFO: renamed from: o00O00oO.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f84166OooO0O0 = new OooO00o("FOLD");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO00o f84167OooO0OO = new OooO00o("HINGE");

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f84168OooO00o;

        public OooO00o(String str) {
            this.f84168OooO00o = str;
        }

        public final String toString() {
            return this.f84168OooO00o;
        }
    }

    public C24816OooO0Oo(C24807OooO0O0 c24807OooO0O0, OooO00o oooO00o, InterfaceC24815OooO0OO.OooO0O0 oooO0O0) {
        this.f84163OooO00o = c24807OooO0O0;
        this.f84164OooO0O0 = oooO00o;
        this.f84165OooO0OO = oooO0O0;
        int i = c24807OooO0O0.f84131OooO0OO;
        int i2 = c24807OooO0O0.f84129OooO00o;
        int i3 = i - i2;
        int i4 = c24807OooO0O0.f84130OooO0O0;
        if (i3 == 0 && c24807OooO0O0.f84132OooO0Oo - i4 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i2 != 0 && i4 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    @Override // o00O00oO.InterfaceC24815OooO0OO
    public final boolean OooO00o() {
        OooO00o oooO00o = OooO00o.f84167OooO0OO;
        OooO00o oooO00o2 = this.f84164OooO0O0;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o2, oooO00o)) {
            return true;
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o2, OooO00o.f84166OooO0O0)) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f84165OooO0OO, InterfaceC24815OooO0OO.OooO0O0.f84161OooO0OO);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C24816OooO0Oo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C24816OooO0Oo c24816OooO0Oo = (C24816OooO0Oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f84163OooO00o, c24816OooO0Oo.f84163OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f84164OooO0O0, c24816OooO0Oo.f84164OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f84165OooO0OO, c24816OooO0Oo.f84165OooO0OO);
    }

    @Override // o00O00oO.InterfaceC24813OooO00o
    public final Rect getBounds() {
        C24807OooO0O0 c24807OooO0O0 = this.f84163OooO00o;
        return new Rect(c24807OooO0O0.f84129OooO00o, c24807OooO0O0.f84130OooO0O0, c24807OooO0O0.f84131OooO0OO, c24807OooO0O0.f84132OooO0Oo);
    }

    @Override // o00O00oO.InterfaceC24815OooO0OO
    public final InterfaceC24815OooO0OO.OooO00o getOrientation() {
        C24807OooO0O0 c24807OooO0O0 = this.f84163OooO00o;
        return c24807OooO0O0.f84131OooO0OO - c24807OooO0O0.f84129OooO00o > c24807OooO0O0.f84132OooO0Oo - c24807OooO0O0.f84130OooO0O0 ? InterfaceC24815OooO0OO.OooO00o.f84158OooO0OO : InterfaceC24815OooO0OO.OooO00o.f84157OooO0O0;
    }

    public final int hashCode() {
        return this.f84165OooO0OO.hashCode() + ((this.f84164OooO0O0.hashCode() + (this.f84163OooO00o.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C24816OooO0Oo.class.getSimpleName() + " { " + this.f84163OooO00o + ", type=" + this.f84164OooO0O0 + ", state=" + this.f84165OooO0OO + " }";
    }
}
