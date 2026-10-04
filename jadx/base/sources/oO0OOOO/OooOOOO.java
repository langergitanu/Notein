package oO0OOOO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooOOOO f119041OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooOOOO f119042OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ OooOOOO[] f119043OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooOOOO f119044OooOoO0;

    static {
        OooOOOO oooOOOO = new OooOOOO("ALL", 0);
        f119042OooOo0o = oooOOOO;
        OooOOOO oooOOOO2 = new OooOOOO("ONLY_NON_SYNTHESIZED", 1);
        f119041OooOo = oooOOOO2;
        OooOOOO oooOOOO3 = new OooOOOO("NONE", 2);
        f119044OooOoO0 = oooOOOO3;
        f119043OooOoO = new OooOOOO[]{oooOOOO, oooOOOO2, oooOOOO3};
    }

    public OooOOOO() {
        throw null;
    }

    public static OooOOOO valueOf(String str) {
        return (OooOOOO) Enum.valueOf(OooOOOO.class, str);
    }

    public static OooOOOO[] values() {
        return (OooOOOO[]) f119043OooOoO.clone();
    }
}
