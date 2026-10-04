package o000o0O0;

import OooO0Oo.C20398OooO0O0;
import android.os.Bundle;

/* JADX INFO: renamed from: o000o0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24564OooO00o implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f83172OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Bundle f83173OooO0O0 = new Bundle();

    public C24564OooO00o(int i) {
        this.f83172OooO00o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C24564OooO00o.class.equals(obj.getClass()) && this.f83172OooO00o == ((C24564OooO00o) obj).f83172OooO00o;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return this.f83172OooO00o;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        return this.f83173OooO0O0;
    }

    public final int hashCode() {
        return 31 + this.f83172OooO00o;
    }

    public final String toString() {
        return C20398OooO0O0.OooO00o(')', new StringBuilder("ActionOnlyNavDirections(actionId="), this.f83172OooO00o);
    }
}
