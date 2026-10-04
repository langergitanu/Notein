package o00O0O0o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooOOOO f84267OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooOOOO f84268OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ OooOOOO[] f84269OooOoO0;

    static {
        OooOOOO oooOOOO = new OooOOOO("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f84268OooOo0o = oooOOOO;
        OooOOOO oooOOOO2 = new OooOOOO("DROP_WORK_REQUEST", 1);
        f84267OooOo = oooOOOO2;
        f84269OooOoO0 = new OooOOOO[]{oooOOOO, oooOOOO2};
    }

    public OooOOOO() {
        throw null;
    }

    public static OooOOOO valueOf(String str) {
        return (OooOOOO) Enum.valueOf(OooOOOO.class, str);
    }

    public static OooOOOO[] values() {
        return (OooOOOO[]) f84269OooOoO0.clone();
    }
}
