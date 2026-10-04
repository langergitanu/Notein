package oO0OOo0o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class o00oO0O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final o00oO0O f119757OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final o00oO0O f119758OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ o00oO0O[] f119759OooOoO0;

    /* JADX INFO: Fake field, exist only in values array */
    o00oO0O EF0;

    static {
        o00oO0O o00oo0o = new o00oO0O("FAKE", 0);
        o00oO0O o00oo0o2 = new o00oO0O("MTLS", 1);
        f119758OooOo0o = o00oo0o2;
        o00oO0O o00oo0o3 = new o00oO0O("CUSTOM_MANAGERS", 2);
        f119757OooOo = o00oo0o3;
        f119759OooOoO0 = new o00oO0O[]{o00oo0o, o00oo0o2, o00oo0o3};
    }

    public o00oO0O() {
        throw null;
    }

    public static o00oO0O valueOf(String str) {
        return (o00oO0O) Enum.valueOf(o00oO0O.class, str);
    }

    public static o00oO0O[] values() {
        return (o00oO0O[]) f119759OooOoO0.clone();
    }
}
