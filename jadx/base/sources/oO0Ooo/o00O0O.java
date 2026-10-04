package oO0Ooo;

import com.google.android.gms.stats.CodePackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final o00O0O f120625OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final o00O0O f120626OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ o00O0O[] f120627OooOoO0;

    static {
        o00O0O o00o0o2 = new o00O0O("SUPERTYPE", 0);
        f120626OooOo0o = o00o0o2;
        o00O0O o00o0o3 = new o00O0O(CodePackage.COMMON, 1);
        f120625OooOo = o00o0o3;
        f120627OooOoO0 = new o00O0O[]{o00o0o2, o00o0o3};
    }

    public o00O0O() {
        throw null;
    }

    public static o00O0O valueOf(String str) {
        return (o00O0O) Enum.valueOf(o00O0O.class, str);
    }

    public static o00O0O[] values() {
        return (o00O0O[]) f120627OooOoO0.clone();
    }
}
