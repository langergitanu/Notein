package o00O0o;

import java.util.Locale;
import oO000O0.EnumC31935OooO0Oo;

/* JADX INFO: renamed from: o00O0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24918OooO0O0 extends ArithmeticException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO000O0.OooO0O0 f84561OooOo0o;

    public C24918OooO0O0(Object... objArr) {
        EnumC31935OooO0Oo enumC31935OooO0Oo = EnumC31935OooO0Oo.ZERO_NORM;
        oO000O0.OooO0O0 oooO0O0 = new oO000O0.OooO0O0();
        this.f84561OooOo0o = oooO0O0;
        oooO0O0.OooO00o(enumC31935OooO0Oo, objArr);
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        oO000O0.OooO0O0 oooO0O0 = this.f84561OooOo0o;
        oooO0O0.getClass();
        return oooO0O0.OooO0O0(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        oO000O0.OooO0O0 oooO0O0 = this.f84561OooOo0o;
        oooO0O0.getClass();
        return oooO0O0.OooO0O0(Locale.US);
    }
}
