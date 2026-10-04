package oO00Ooo;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public abstract class OooOOO extends AbstractC32299OooO0oo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f116195OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f116196OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f116197OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("SENT", 0);
            f116196OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("RECV", 1);
            f116195OooOo = oooO00o2;
            f116197OooOoO0 = new OooO00o[]{oooO00o, oooO00o2};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f116197OooOoO0.clone();
        }
    }

    public abstract long OooO00o();

    public abstract long OooO0O0();

    public abstract OooO00o OooO0OO();

    public abstract long OooO0Oo();
}
