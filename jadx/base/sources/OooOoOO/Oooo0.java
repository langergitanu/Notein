package OooOoOO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ Oooo0[] f58680OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final Oooo0 f58681OooOo0o;

    static {
        Oooo0 oooo0 = new Oooo0("Default", 0);
        f58681OooOo0o = oooo0;
        f58680OooOo = new Oooo0[]{oooo0, new Oooo0("UserInput", 1), new Oooo0("PreventUserInput", 2)};
    }

    public Oooo0() {
        throw null;
    }

    public static Oooo0 valueOf(String str) {
        return (Oooo0) Enum.valueOf(Oooo0.class, str);
    }

    public static Oooo0[] values() {
        return (Oooo0[]) f58680OooOo.clone();
    }
}
