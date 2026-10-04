package oO0O0OO;

import oO00ooOO.C32466OooO0OO;

/* JADX INFO: renamed from: oO0O0OO.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32649OoooooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f117306OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f117307OooO0O0;

    public AbstractC32649OoooooO(String str, boolean z) {
        this.f117306OooO00o = str;
        this.f117307OooO0O0 = z;
    }

    public Integer OooO00o(AbstractC32649OoooooO visibility) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(visibility, "visibility");
        C32466OooO0OO c32466OooO0OO = C32643Oooooo.f117296OooO00o;
        if (this == visibility) {
            return 0;
        }
        C32466OooO0OO c32466OooO0OO2 = C32643Oooooo.f117296OooO00o;
        Integer num = (Integer) c32466OooO0OO2.get(this);
        Integer num2 = (Integer) c32466OooO0OO2.get(visibility);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String OooO0O0() {
        return this.f117306OooO00o;
    }

    public AbstractC32649OoooooO OooO0OO() {
        return this;
    }

    public final String toString() {
        return OooO0O0();
    }
}
