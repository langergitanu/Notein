package o0Oo0OO0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO f99479OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO f99480OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooO f99481OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO f99482OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ OooO[] f99483OooOoOO;

    static {
        OooO oooO = new OooO("SERVER_STATUS_INITIALIZING", 0);
        f99480OooOo0o = oooO;
        OooO oooO2 = new OooO("SERVER_STATUS_REACHABLE", 1);
        f99479OooOo = oooO2;
        OooO oooO3 = new OooO("SERVER_STATUS_UNREACHABLE", 2);
        f99482OooOoO0 = oooO3;
        OooO oooO4 = new OooO("SERVER_STATUS_FAILED_TO_GET_TOKEN", 3);
        f99481OooOoO = oooO4;
        OooO[] oooOArr = {oooO, oooO2, oooO3, oooO4, new OooO("SERVER_STATUS_INVALID_VERDICT", 4), new OooO("SERVER_STATUS_WORKING", 5), new OooO("SERVER_STATUS_DISABLED", 6)};
        f99483OooOoOO = oooOArr;
        OooO.OooO00o.OooO0O0(oooOArr);
    }

    public OooO() {
        throw null;
    }

    public static OooO valueOf(String str) {
        return (OooO) Enum.valueOf(OooO.class, str);
    }

    public static OooO[] values() {
        return (OooO[]) f99483OooOoOO.clone();
    }
}
