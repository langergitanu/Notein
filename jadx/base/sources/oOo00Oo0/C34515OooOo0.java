package oOo00Oo0;

/* JADX INFO: renamed from: oOo00Oo0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34515OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f123700OooO00o;

    static {
        String property = System.getProperty("io.ktor.development");
        boolean z = false;
        if (property != null && Boolean.parseBoolean(property)) {
            z = true;
        }
        f123700OooO00o = z;
    }
}
