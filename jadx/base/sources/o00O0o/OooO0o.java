package o00O0o;

import java.util.Locale;
import oO000O0.EnumC31935OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends IllegalStateException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO000O0.OooO0O0 f84563OooOo0o;

    public OooO0o(Number number, Object... objArr) {
        EnumC31935OooO0Oo enumC31935OooO0Oo = EnumC31935OooO0Oo.CONVERGENCE_FAILED;
        oO000O0.OooO0O0 oooO0O0 = new oO000O0.OooO0O0();
        this.f84563OooOo0o = oooO0O0;
        oooO0O0.OooO00o(EnumC31935OooO0Oo.ILLEGAL_STATE, new Object[0]);
        oooO0O0.OooO00o(enumC31935OooO0Oo, number, objArr);
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        oO000O0.OooO0O0 oooO0O0 = this.f84563OooOo0o;
        oooO0O0.getClass();
        return oooO0O0.OooO0O0(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        oO000O0.OooO0O0 oooO0O0 = this.f84563OooOo0o;
        oooO0O0.getClass();
        return oooO0O0.OooO0O0(Locale.US);
    }
}
