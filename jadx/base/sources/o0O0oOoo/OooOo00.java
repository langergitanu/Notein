package o0O0oOoo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooOo00 f89297OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooOo00 f89298OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooOo00 f89299OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooOo00 f89300OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ OooOo00[] f89301OooOoOO;

    static {
        OooOo00 oooOo00 = new OooOo00("Enabled", 0);
        f89298OooOo0o = oooOo00;
        OooOo00 oooOo002 = new OooOo00("Hovered", 1);
        f89297OooOo = oooOo002;
        OooOo00 oooOo003 = new OooOo00("Pressed", 2);
        f89300OooOoO0 = oooOo003;
        OooOo00 oooOo004 = new OooOo00("Disabled", 3);
        f89299OooOoO = oooOo004;
        OooOo00[] oooOo00Arr = {oooOo00, oooOo002, oooOo003, oooOo004};
        f89301OooOoOO = oooOo00Arr;
        OooO.OooO00o.OooO0O0(oooOo00Arr);
    }

    public OooOo00() {
        throw null;
    }

    public static OooOo00 valueOf(String str) {
        return (OooOo00) Enum.valueOf(OooOo00.class, str);
    }

    public static OooOo00[] values() {
        return (OooOo00[]) f89301OooOoOO.clone();
    }
}
