package o00000o0;

import com.android.billingclient.api.C22189OoooO0;
import o0000Ooo.C24240OooOOOO;
import o0000Ooo.C24241OooOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooOOO0 f81286OooO0OO = new OooOOO0(C22189OoooO0.OooO0OO(0), C22189OoooO0.OooO0OO(0));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f81287OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f81288OooO0O0;

    public OooOOO0(long j, long j2) {
        this.f81287OooO00o = j;
        this.f81288OooO0O0 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        return C24240OooOOOO.OooO00o(this.f81287OooO00o, oooOOO0.f81287OooO00o) && C24240OooOOOO.OooO00o(this.f81288OooO0O0, oooOOO0.f81288OooO0O0);
    }

    public final int hashCode() {
        C24241OooOOOo[] c24241OooOOOoArr = C24240OooOOOO.f81496OooO00o;
        return Long.hashCode(this.f81288OooO0O0) + (Long.hashCode(this.f81287OooO00o) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C24240OooOOOO.OooO0Oo(this.f81287OooO00o)) + ", restLine=" + ((Object) C24240OooOOOO.OooO0Oo(this.f81288OooO0O0)) + ')';
    }
}
