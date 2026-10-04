package o0OO00O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f90935OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO00o f90936OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ OooO00o[] f90937OooOoO0;

    static {
        OooO00o oooO00o = new OooO00o("On", 0);
        f90936OooOo0o = oooO00o;
        OooO00o oooO00o2 = new OooO00o("Off", 1);
        f90935OooOo = oooO00o2;
        f90937OooOoO0 = new OooO00o[]{oooO00o, oooO00o2, new OooO00o("Indeterminate", 2)};
    }

    public OooO00o() {
        throw null;
    }

    public static OooO00o valueOf(String str) {
        return (OooO00o) Enum.valueOf(OooO00o.class, str);
    }

    public static OooO00o[] values() {
        return (OooO00o[]) f90937OooOoO0.clone();
    }
}
