package o00Ooo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooOOOO f85129OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooOOOO f85130OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ OooOOOO[] f85131OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooOOOO f85132OooOoO0;

    static {
        OooOOOO oooOOOO = new OooOOOO("Initial", 0);
        f85130OooOo0o = oooOOOO;
        OooOOOO oooOOOO2 = new OooOOOO("Main", 1);
        f85129OooOo = oooOOOO2;
        OooOOOO oooOOOO3 = new OooOOOO("Final", 2);
        f85132OooOoO0 = oooOOOO3;
        f85131OooOoO = new OooOOOO[]{oooOOOO, oooOOOO2, oooOOOO3};
    }

    public OooOOOO() {
        throw null;
    }

    public static OooOOOO valueOf(String str) {
        return (OooOOOO) Enum.valueOf(OooOOOO.class, str);
    }

    public static OooOOOO[] values() {
        return (OooOOOO[]) f85131OooOoO.clone();
    }
}
