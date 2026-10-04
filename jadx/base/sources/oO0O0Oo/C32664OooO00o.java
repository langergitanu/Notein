package oO0O0Oo;

import kotlin.jvm.internal.OooOOO0;
import oO00ooOO.C32466OooO0OO;
import oO0O0OO.AbstractC32649OoooooO;
import oO0O0OO.C32643Oooooo;

/* JADX INFO: renamed from: oO0O0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32664OooO00o extends AbstractC32649OoooooO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C32664OooO00o f117382OooO0OO = new C32664OooO00o("package", false);

    @Override // oO0O0OO.AbstractC32649OoooooO
    public final Integer OooO00o(AbstractC32649OoooooO visibility) {
        OooOOO0.OooO0oO(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        C32466OooO0OO c32466OooO0OO = C32643Oooooo.f117296OooO00o;
        return (visibility == C32643Oooooo.C32645OooO0o0.f117303OooO0OO || visibility == C32643Oooooo.OooO0o.f117302OooO0OO) ? 1 : -1;
    }

    @Override // oO0O0OO.AbstractC32649OoooooO
    public final String OooO0O0() {
        return "public/*package*/";
    }

    @Override // oO0O0OO.AbstractC32649OoooooO
    public final AbstractC32649OoooooO OooO0OO() {
        return C32643Oooooo.C32646OooO0oO.f117304OooO0OO;
    }
}
