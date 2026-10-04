package o00000;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOOO f81048OooO0Oo = new OooOOO(0, 1, false);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f81049OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f81050OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f81051OooO0OO;

    public OooOOO(int i, int i2, boolean z) {
        this.f81049OooO00o = z;
        this.f81050OooO0O0 = i;
        this.f81051OooO0OO = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        return this.f81049OooO00o == oooOOO.f81049OooO00o && this.f81050OooO0O0 == oooOOO.f81050OooO0O0 && this.f81051OooO0OO == oooOOO.f81051OooO0OO;
    }

    public final int hashCode() {
        return Integer.hashCode(1) + C20785Oooo00o.OooO00o(this.f81051OooO0OO, o00000.OooO0O0(C20785Oooo00o.OooO00o(this.f81050OooO0O0, Boolean.hashCode(this.f81049OooO00o) * 31, 31), 31, true), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f81049OooO00o);
        sb.append(", capitalization=");
        int i = this.f81050OooO0O0;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=true, keyboardType=");
        sb.append((Object) OooOo00.OooO0Oo(this.f81051OooO0OO));
        sb.append(", imeAction=");
        sb.append((Object) OooOOO0.OooO00o(1));
        sb.append(')');
        return sb.toString();
    }
}
