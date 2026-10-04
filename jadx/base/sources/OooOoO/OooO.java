package OooOoO;

import o0000Ooo.InterfaceC24229OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f58561OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC24229OooO0OO f58562OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f58563OooO0OO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f58564OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f58565OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f58566OooO0OO;

        public OooO00o(float f, float f2, long j) {
            this.f58564OooO00o = f;
            this.f58565OooO0O0 = f2;
            this.f58566OooO0OO = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Float.compare(this.f58564OooO00o, oooO00o.f58564OooO00o) == 0 && Float.compare(this.f58565OooO0O0, oooO00o.f58565OooO0O0) == 0 && this.f58566OooO0OO == oooO00o.f58566OooO0OO;
        }

        public final int hashCode() {
            return Long.hashCode(this.f58566OooO0OO) + C20509OooO0oo.OooO0OO(this.f58565OooO0O0, Float.hashCode(this.f58564OooO00o) * 31, 31);
        }

        public final String toString() {
            return "FlingInfo(initialVelocity=" + this.f58564OooO00o + ", distance=" + this.f58565OooO0O0 + ", duration=" + this.f58566OooO0OO + ')';
        }
    }

    public OooO(float f, InterfaceC24229OooO0OO interfaceC24229OooO0OO) {
        this.f58561OooO00o = f;
        this.f58562OooO0O0 = interfaceC24229OooO0OO;
        float density = interfaceC24229OooO0OO.getDensity();
        float f2 = OooOO0.f58576OooO00o;
        this.f58563OooO0OO = density * 386.0878f * 160.0f * 0.84f;
    }

    public final OooO00o OooO00o(float f) {
        double dOooO0O0 = OooO0O0(f);
        double d = OooOO0.f58576OooO00o;
        double d2 = d - 1.0d;
        return new OooO00o(f, (float) (Math.exp((d / d2) * dOooO0O0) * ((double) (this.f58561OooO00o * this.f58563OooO0OO))), (long) (Math.exp(dOooO0O0 / d2) * 1000.0d));
    }

    public final double OooO0O0(float f) {
        float[] fArr = C20506OooO0Oo.f58567OooO00o;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f58561OooO00o * this.f58563OooO0OO)));
    }
}
