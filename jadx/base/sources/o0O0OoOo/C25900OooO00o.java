package o0O0OoOo;

import OooOoo0.o00000;
import android.view.View;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0O0OoOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25900OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f88427OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f88428OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<View, C32460OooOooO> f88429OooO0OO;

    public C25900OooO00o() {
        throw null;
    }

    public C25900OooO00o(int i, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        Integer numValueOf = Integer.valueOf(R.color.notein_accent_blue);
        this.f88427OooO00o = i;
        this.f88428OooO0O0 = numValueOf;
        this.f88429OooO0OO = interfaceC32507OooOO0o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25900OooO00o)) {
            return false;
        }
        C25900OooO00o c25900OooO00o = (C25900OooO00o) obj;
        return this.f88427OooO00o == c25900OooO00o.f88427OooO00o && OooOOO0.OooO0O0(this.f88428OooO0O0, c25900OooO00o.f88428OooO0O0) && OooOOO0.OooO0O0(this.f88429OooO0OO, c25900OooO00o.f88429OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f88427OooO00o) * 31;
        Integer num = this.f88428OooO0O0;
        return this.f88429OooO0OO.hashCode() + o00000.OooO0O0((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        return "ClickableSegment(textRes=" + this.f88427OooO00o + ", colorRes=" + this.f88428OooO0O0 + ", underline=false, onClick=" + this.f88429OooO0OO + ")";
    }
}
