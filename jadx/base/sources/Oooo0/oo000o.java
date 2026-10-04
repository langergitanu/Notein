package Oooo0;

import OooOooo.C20785Oooo00o;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f60246OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f60247OooO0O0;

    public oo000o(int i, int i2) {
        int i3 = (i2 & 1) != 0 ? 0 : 2;
        i = (i2 & 4) != 0 ? 1 : i;
        this.f60246OooO00o = i3;
        this.f60247OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo000o)) {
            return false;
        }
        oo000o oo000oVar = (oo000o) obj;
        return this.f60246OooO00o == oo000oVar.f60246OooO00o && this.f60247OooO0O0 == oo000oVar.f60247OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(1) + C20785Oooo00o.OooO00o(this.f60247OooO0O0, OooOoo0.o00000.OooO0O0(Integer.hashCode(this.f60246OooO00o) * 31, 31, true), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        int i = this.f60246OooO00o;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=true, keyboardType=");
        sb.append((Object) o00000.OooOo00.OooO0Oo(this.f60247OooO0O0));
        sb.append(", imeAction=");
        sb.append((Object) o00000.OooOOO0.OooO00o(1));
        sb.append(')');
        return sb.toString();
    }
}
