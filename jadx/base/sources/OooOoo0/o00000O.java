package OooOoo0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final o00000O f59432OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final o00000O f59433OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ o00000O[] f59434OooOoO0;

    static {
        o00000O o00000o = new o00000O("Default", 0);
        f59433OooOo0o = o00000o;
        o00000O o00000o2 = new o00000O("UserInput", 1);
        f59432OooOo = o00000o2;
        f59434OooOoO0 = new o00000O[]{o00000o, o00000o2, new o00000O("PreventUserInput", 2)};
    }

    public o00000O() {
        throw null;
    }

    public static o00000O valueOf(String str) {
        return (o00000O) Enum.valueOf(o00000O.class, str);
    }

    public static o00000O[] values() {
        return (o00000O[]) f59434OooOoO0.clone();
    }
}
