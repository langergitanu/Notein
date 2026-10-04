package o0O0oOoo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO f89234OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO f89235OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ OooO[] f89236OooOoO0;

    static {
        OooO oooO = new OooO("Standard", 0);
        f89235OooOo0o = oooO;
        OooO oooO2 = new OooO("Outlined", 1);
        f89234OooOo = oooO2;
        OooO[] oooOArr = {oooO, oooO2};
        f89236OooOoO0 = oooOArr;
        OooO.OooO00o.OooO0O0(oooOArr);
    }

    public OooO() {
        throw null;
    }

    public static OooO valueOf(String str) {
        return (OooO) Enum.valueOf(OooO.class, str);
    }

    public static OooO[] values() {
        return (OooO[]) f89236OooOoO0.clone();
    }
}
