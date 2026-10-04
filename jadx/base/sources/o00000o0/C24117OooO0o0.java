package o00000o0;

/* JADX INFO: renamed from: o00000o0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24117OooO0o0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f81266OooO0O0 = 66305;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81267OooO00o;

    /* JADX INFO: renamed from: o00000o0.OooO0o0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f81268OooO00o;

        public final boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                return this.f81268OooO00o == ((OooO00o) obj).f81268OooO00o;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f81268OooO00o);
        }

        public final String toString() {
            int i = this.f81268OooO00o;
            return i == 1 ? "Strategy.Simple" : i == 2 ? "Strategy.HighQuality" : i == 3 ? "Strategy.Balanced" : "Invalid";
        }
    }

    /* JADX INFO: renamed from: o00000o0.OooO0o0$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f81269OooO00o;

        public final boolean equals(Object obj) {
            if (obj instanceof OooO0O0) {
                return this.f81269OooO00o == ((OooO0O0) obj).f81269OooO00o;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f81269OooO00o);
        }

        public final String toString() {
            int i = this.f81269OooO00o;
            return i == 1 ? "Strictness.None" : i == 2 ? "Strictness.Loose" : i == 3 ? "Strictness.Normal" : i == 4 ? "Strictness.Strict" : "Invalid";
        }
    }

    /* JADX INFO: renamed from: o00000o0.OooO0o0$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f81270OooO00o;

        public final boolean equals(Object obj) {
            if (obj instanceof OooO0OO) {
                return this.f81270OooO00o == ((OooO0OO) obj).f81270OooO00o;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f81270OooO00o);
        }

        public final String toString() {
            int i = this.f81270OooO00o;
            return i == 1 ? "WordBreak.None" : i == 2 ? "WordBreak.Phrase" : "Invalid";
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24117OooO0o0) {
            return this.f81267OooO00o == ((C24117OooO0o0) obj).f81267OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81267OooO00o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i = this.f81267OooO00o;
        int i2 = i & 255;
        String str = "Invalid";
        sb.append((Object) (i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : "Invalid"));
        sb.append(", strictness=");
        int i3 = (i >> 8) & 255;
        sb.append((Object) (i3 == 1 ? "Strictness.None" : i3 == 2 ? "Strictness.Loose" : i3 == 3 ? "Strictness.Normal" : i3 == 4 ? "Strictness.Strict" : "Invalid"));
        sb.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str = "WordBreak.None";
        } else if (i4 == 2) {
            str = "WordBreak.Phrase";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
