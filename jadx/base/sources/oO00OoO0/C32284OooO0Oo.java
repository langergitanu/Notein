package oO00OoO0;

/* JADX INFO: renamed from: oO00OoO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32284OooO0Oo extends Exception {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f116044OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f116045OooOo0o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO00OoO0.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f116046OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f116047OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f116048OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f116049OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f116050OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f116051OooOoo0;

        static {
            OooO00o oooO00o = new OooO00o("INVALID_COUNTRY_CODE", 0);
            f116047OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("NOT_A_NUMBER", 1);
            f116046OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("TOO_SHORT_AFTER_IDD", 2);
            f116049OooOoO0 = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("TOO_SHORT_NSN", 3);
            f116048OooOoO = oooO00o4;
            OooO00o oooO00o5 = new OooO00o("TOO_LONG", 4);
            f116050OooOoOO = oooO00o5;
            f116051OooOoo0 = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f116051OooOoo0.clone();
        }
    }

    public C32284OooO0Oo(OooO00o oooO00o, String str) {
        super(str);
        this.f116044OooOo = str;
        this.f116045OooOo0o = oooO00o;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + this.f116045OooOo0o + ". " + this.f116044OooOo;
    }
}
