package o0O0oo00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO0OO f89534OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0OO f89535OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ OooO0OO[] f89536OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO0OO f89537OooOoO0;

    static {
        OooO0OO oooO0OO = new OooO0OO("AUTO", 0);
        f89535OooOo0o = oooO0OO;
        OooO0OO oooO0OO2 = new OooO0OO("FORCE_HARDWARE", 1);
        OooO0OO oooO0OO3 = new OooO0OO("FORCE_SOFTWARE", 2);
        f89534OooOo = oooO0OO3;
        OooO0OO oooO0OO4 = new OooO0OO("PREFER_HARDWARE", 3);
        f89537OooOoO0 = oooO0OO4;
        OooO0OO[] oooO0OOArr = {oooO0OO, oooO0OO2, oooO0OO3, oooO0OO4};
        f89536OooOoO = oooO0OOArr;
        OooO.OooO00o.OooO0O0(oooO0OOArr);
    }

    public OooO0OO() {
        throw null;
    }

    public static OooO0OO valueOf(String str) {
        return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
    }

    public static OooO0OO[] values() {
        return (OooO0OO[]) f89536OooOoO.clone();
    }
}
