package o00Ooo0O;

/* JADX INFO: renamed from: o00Ooo0O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25109OooOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C25109OooOO0o f85337OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C25109OooOO0o f85338OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f85339OooO00o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00Ooo0O.OooOO0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f85340OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f85341OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f85342OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f85343OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("CACHE_NONE", 0);
            f85341OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("CACHE_LIMITED", 1);
            OooO00o oooO00o3 = new OooO00o("CACHE_AUTO", 2);
            f85340OooOo = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("CACHE_ALL", 3);
            f85343OooOoO0 = oooO00o4;
            f85342OooOoO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f85342OooOoO.clone();
        }
    }

    static {
        OooO00o oooO00o = OooO00o.f85341OooOo0o;
        C25109OooOO0o c25109OooOO0o = new C25109OooOO0o();
        c25109OooOO0o.f85339OooO00o = oooO00o;
        f85337OooO0O0 = c25109OooOO0o;
        OooO00o oooO00o2 = OooO00o.f85340OooOo;
        C25109OooOO0o c25109OooOO0o2 = new C25109OooOO0o();
        c25109OooOO0o2.f85339OooO00o = oooO00o2;
        f85338OooO0OO = c25109OooOO0o2;
    }
}
