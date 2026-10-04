package oO0OOOO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooOOO f119037OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooOOO f119038OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ OooOOO[] f119039OooOoO0;

    static {
        OooOOO oooOOO = new OooOOO("RENDER_OVERRIDE", 0);
        f119038OooOo0o = oooOOO;
        OooOOO oooOOO2 = new OooOOO("RENDER_OPEN", 1);
        f119037OooOo = oooOOO2;
        f119039OooOoO0 = new OooOOO[]{oooOOO, oooOOO2, new OooOOO("RENDER_OPEN_OVERRIDE", 2)};
    }

    public OooOOO() {
        throw null;
    }

    public static OooOOO valueOf(String str) {
        return (OooOOO) Enum.valueOf(OooOOO.class, str);
    }

    public static OooOOO[] values() {
        return (OooOOO[]) f119039OooOoO0.clone();
    }
}
