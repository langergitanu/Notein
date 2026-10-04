package o00O0oo0;

/* JADX INFO: renamed from: o00O0oo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24967OooO0oO {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00O0oo0.OooO0oO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f84675OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f84676OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f84677OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f84678OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f84679OooOoOO;

        static {
            OooO00o oooO00o = new OooO00o("MASK_MODE_ADD", 0);
            f84676OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("MASK_MODE_SUBTRACT", 1);
            f84675OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("MASK_MODE_INTERSECT", 2);
            f84678OooOoO0 = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("MASK_MODE_NONE", 3);
            f84677OooOoO = oooO00o4;
            f84679OooOoOO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f84679OooOoOO.clone();
        }
    }
}
