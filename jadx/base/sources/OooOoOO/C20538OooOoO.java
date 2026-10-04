package OooOoOO;

/* JADX INFO: renamed from: OooOoOO.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20538OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C20534OooOo0 f58665OooO00o = new C20534OooOo0(0.4f);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C20534OooOo0 f58666OooO0O0 = new C20534OooOo0(0.0f);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f58667OooO0OO;

    /* JADX INFO: renamed from: OooOoOO.OooOoO$OooO00o */
    public static final class OooO00o implements InterfaceC20539OooOoO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f58668OooO00o = new OooO00o();

        @Override // OooOoOO.InterfaceC20539OooOoO0
        public final float OooO00o(float f) {
            return f;
        }
    }

    static {
        if (Float.isNaN(0.4f) || Float.isNaN(0.0f) || Float.isNaN(1.0f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.4, 0.0, 1.0, 1.0.".toString());
        }
        f58667OooO0OO = OooO00o.f58668OooO00o;
    }
}
