package o00000o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0o f81261OooO0O0 = new OooO0o(OooO00o.f81264OooO0O0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f81262OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final float f81263OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final float f81264OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final float f81265OooO0OO;

        static {
            OooO00o(0.0f);
            OooO00o(0.5f);
            f81263OooO00o = 0.5f;
            OooO00o(-1.0f);
            f81264OooO0O0 = -1.0f;
            OooO00o(1.0f);
            f81265OooO0OO = 1.0f;
        }

        public static void OooO00o(float f) {
            if ((0.0f > f || f > 1.0f) && f != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1");
            }
        }
    }

    public OooO0o(float f) {
        this.f81262OooO00o = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        float f = ((OooO0o) obj).f81262OooO00o;
        float f2 = OooO00o.f81263OooO00o;
        return Float.compare(this.f81262OooO00o, f) == 0;
    }

    public final int hashCode() {
        float f = OooO00o.f81263OooO00o;
        return Integer.hashCode(17) + (Float.hashCode(this.f81262OooO00o) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f = this.f81262OooO00o;
        if (f == 0.0f) {
            float f2 = OooO00o.f81263OooO00o;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f == OooO00o.f81263OooO00o) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f == OooO00o.f81264OooO0O0) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f == OooO00o.f81265OooO0OO) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        sb.append((Object) "LineHeightStyle.Trim.Both");
        sb.append(')');
        return sb.toString();
    }
}
