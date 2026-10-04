package o00O0oo0;

/* JADX INFO: renamed from: o00O0oo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24968OooO0oo implements InterfaceC24962OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f84680OooO00o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00O0oo0.OooO0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f84681OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f84682OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f84683OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f84684OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f84685OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f84686OooOoo0;

        static {
            OooO00o oooO00o = new OooO00o("MERGE", 0);
            f84682OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("ADD", 1);
            f84681OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("SUBTRACT", 2);
            f84684OooOoO0 = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("INTERSECT", 3);
            f84683OooOoO = oooO00o4;
            OooO00o oooO00o5 = new OooO00o("EXCLUDE_INTERSECTIONS", 4);
            f84685OooOoOO = oooO00o5;
            f84686OooOoo0 = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f84686OooOoo0.clone();
        }
    }

    public C24968OooO0oo(String str, OooO00o oooO00o, boolean z) {
        this.f84680OooO00o = oooO00o;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f84680OooO00o + '}';
    }
}
