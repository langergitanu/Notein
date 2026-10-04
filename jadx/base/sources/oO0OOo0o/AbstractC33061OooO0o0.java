package oO0OOo0o;

/* JADX INFO: renamed from: oO0OOo0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33061OooO0o0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO0OOo0o.OooO0o0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f119543OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f119544OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f119545OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f119546OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f119547OooOoOO;

        static {
            OooO00o oooO00o = new OooO00o("DEBUG", 0);
            f119544OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("INFO", 1);
            f119543OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("WARNING", 2);
            f119546OooOoO0 = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("ERROR", 3);
            f119545OooOoO = oooO00o4;
            f119547OooOoOO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f119547OooOoOO.clone();
        }
    }

    public abstract void OooO00o(OooO00o oooO00o, String str);

    public abstract void OooO0O0(OooO00o oooO00o, String str, Object... objArr);
}
