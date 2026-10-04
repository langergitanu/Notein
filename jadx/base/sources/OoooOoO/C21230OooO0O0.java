package OoooOoO;

import OooOoO.C20505OooO0OO;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24235OooOO0;
import o0000Ooo.EnumC24238OooOOO;

/* JADX INFO: renamed from: OoooOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21230OooO0O0 implements InterfaceC21229OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f61594OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f61595OooO0O0;

    /* JADX INFO: renamed from: OoooOoO.OooO0O0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f61596OooO00o;

        public OooO00o(float f) {
            this.f61596OooO00o = f;
        }

        public final int OooO00o(int i, EnumC24238OooOOO layoutDirection) {
            OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
            float f = i / 2.0f;
            EnumC24238OooOOO enumC24238OooOOO = EnumC24238OooOOO.f81494OooOo0o;
            float f2 = this.f61596OooO00o;
            if (layoutDirection != enumC24238OooOOO) {
                f2 *= -1;
            }
            return oO0O00O.OooO00o.OooO0O0((1 + f2) * f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO00o) && Float.compare(this.f61596OooO00o, ((OooO00o) obj).f61596OooO00o) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f61596OooO00o);
        }

        public final String toString() {
            return C20505OooO0OO.OooO0O0(new StringBuilder("Horizontal(bias="), this.f61596OooO00o, ')');
        }
    }

    /* JADX INFO: renamed from: OoooOoO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C18985OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f61597OooO00o;

        public C18985OooO0O0(float f) {
            this.f61597OooO00o = f;
        }

        public final int OooO00o(int i) {
            return oO0O00O.OooO00o.OooO0O0((1 + this.f61597OooO00o) * (i / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18985OooO0O0) && Float.compare(this.f61597OooO00o, ((C18985OooO0O0) obj).f61597OooO00o) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f61597OooO00o);
        }

        public final String toString() {
            return C20505OooO0OO.OooO0O0(new StringBuilder("Vertical(bias="), this.f61597OooO00o, ')');
        }
    }

    public C21230OooO0O0(float f, float f2) {
        this.f61594OooO00o = f;
        this.f61595OooO0O0 = f2;
    }

    @Override // OoooOoO.InterfaceC21229OooO00o
    public final long OooO00o(long j, long j2, EnumC24238OooOOO layoutDirection) {
        OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        EnumC24238OooOOO enumC24238OooOOO = EnumC24238OooOOO.f81494OooOo0o;
        float f3 = this.f61594OooO00o;
        if (layoutDirection != enumC24238OooOOO) {
            f3 *= -1;
        }
        float f4 = 1;
        return C24235OooOO0.OooO00o(oO0O00O.OooO00o.OooO0O0((f3 + f4) * f), oO0O00O.OooO00o.OooO0O0((f4 + this.f61595OooO0O0) * f2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21230OooO0O0)) {
            return false;
        }
        C21230OooO0O0 c21230OooO0O0 = (C21230OooO0O0) obj;
        return Float.compare(this.f61594OooO00o, c21230OooO0O0.f61594OooO00o) == 0 && Float.compare(this.f61595OooO0O0, c21230OooO0O0.f61595OooO0O0) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f61595OooO0O0) + (Float.hashCode(this.f61594OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f61594OooO00o);
        sb.append(", verticalBias=");
        return C20505OooO0OO.OooO0O0(sb, this.f61595OooO0O0, ')');
    }
}
