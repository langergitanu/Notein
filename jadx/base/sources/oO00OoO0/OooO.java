package oO00OoO0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f116008OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f116009OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f116010OooOoo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f116006OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f116005OooOo = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f116007OooOoO = "";

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f116011OooOoo0 = false;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f116012OooOooO = 1;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final String f116013OooOooo = "";

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final String f116015Oooo00O = "";

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final OooO00o f116014Oooo000 = OooO00o.f116018OooOoO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f116016OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f116017OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f116018OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f116019OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f116020OooOoOO;

        static {
            OooO00o oooO00o = new OooO00o("FROM_NUMBER_WITH_PLUS_SIGN", 0);
            f116017OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("FROM_NUMBER_WITH_IDD", 1);
            f116016OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
            OooO00o oooO00o4 = new OooO00o("FROM_DEFAULT_COUNTRY", 3);
            f116019OooOoO0 = oooO00o4;
            OooO00o oooO00o5 = new OooO00o("UNSPECIFIED", 4);
            f116018OooOoO = oooO00o5;
            f116020OooOoOO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f116020OooOoOO.clone();
        }
    }

    public final boolean equals(Object obj) {
        OooO oooO;
        if (!(obj instanceof OooO) || (oooO = (OooO) obj) == null) {
            return false;
        }
        if (this == oooO) {
            return true;
        }
        return this.f116006OooOo0o == oooO.f116006OooOo0o && this.f116005OooOo == oooO.f116005OooOo && this.f116007OooOoO.equals(oooO.f116007OooOoO) && this.f116011OooOoo0 == oooO.f116011OooOoo0 && this.f116012OooOooO == oooO.f116012OooOooO && this.f116013OooOooo.equals(oooO.f116013OooOooo) && this.f116014Oooo000 == oooO.f116014Oooo000 && this.f116015Oooo00O.equals(oooO.f116015Oooo00O);
    }

    public final int hashCode() {
        return ((this.f116015Oooo00O.hashCode() + ((this.f116014Oooo000.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((((com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((Long.valueOf(this.f116005OooOo).hashCode() + ((2173 + this.f116006OooOo0o) * 53)) * 53, 53, this.f116007OooOoO) + (this.f116011OooOoo0 ? 1231 : 1237)) * 53) + this.f116012OooOooO) * 53, 53, this.f116013OooOooo)) * 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.f116006OooOo0o);
        sb.append(" National Number: ");
        sb.append(this.f116005OooOo);
        if (this.f116009OooOoOO && this.f116011OooOoo0) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.f116010OooOoo) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.f116012OooOooO);
        }
        if (this.f116008OooOoO0) {
            sb.append(" Extension: ");
            sb.append(this.f116007OooOoO);
        }
        return sb.toString();
    }
}
