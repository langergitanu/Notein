package o000OoOO;

/* JADX INFO: renamed from: o000OoOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24537OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f82990OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile C24537OooO00o f82991OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f82993OooO0O0 = C24539OooO0OO.OooO0O0("debug.input.androidx_prefer_library_prediction");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f82994OooO0OO = C24539OooO0OO.OooO0Oo("debug.input.androidx_prediction_offset");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f82992OooO00o = C24539OooO0OO.OooO0O0("debug.input.androidx_predict_lift");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f82995OooO0Oo = C24539OooO0OO.OooO0Oo("debug.input.androidx_prediction_strategy");

    public static C24537OooO00o OooO00o() {
        if (f82991OooO0o0 == null) {
            synchronized (f82990OooO0o) {
                try {
                    if (f82991OooO0o0 == null) {
                        f82991OooO0o0 = new C24537OooO00o();
                    }
                } finally {
                }
            }
        }
        return f82991OooO0o0;
    }
}
