package oO0OOo0o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooOOO f119552OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooOOO f119553OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooOOO f119554OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooOOO f119555OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooOOO f119556OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ OooOOO[] f119557OooOoo0;

    static {
        OooOOO oooOOO = new OooOOO("CONNECTING", 0);
        f119553OooOo0o = oooOOO;
        OooOOO oooOOO2 = new OooOOO("READY", 1);
        f119552OooOo = oooOOO2;
        OooOOO oooOOO3 = new OooOOO("TRANSIENT_FAILURE", 2);
        f119555OooOoO0 = oooOOO3;
        OooOOO oooOOO4 = new OooOOO("IDLE", 3);
        f119554OooOoO = oooOOO4;
        OooOOO oooOOO5 = new OooOOO("SHUTDOWN", 4);
        f119556OooOoOO = oooOOO5;
        f119557OooOoo0 = new OooOOO[]{oooOOO, oooOOO2, oooOOO3, oooOOO4, oooOOO5};
    }

    public OooOOO() {
        throw null;
    }

    public static OooOOO valueOf(String str) {
        return (OooOOO) Enum.valueOf(OooOOO.class, str);
    }

    public static OooOOO[] values() {
        return (OooOOO[]) f119557OooOoo0.clone();
    }
}
