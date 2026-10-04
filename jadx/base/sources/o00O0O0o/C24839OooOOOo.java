package o00O0O0o;

import o00O0O0o.AbstractC24840OooOOo;
import o00O0OoO.C24880OooOOoo;

/* JADX INFO: renamed from: o00O0O0o.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24839OooOOOo extends AbstractC24840OooOOo {

    /* JADX INFO: renamed from: o00O0O0o.OooOOOo$OooO00o */
    public static final class OooO00o extends AbstractC24840OooOOo.OooO00o<OooO00o, C24839OooOOOo> {
        @Override // o00O0O0o.AbstractC24840OooOOo.OooO00o
        public final AbstractC24840OooOOo OooO0O0() {
            C24880OooOOoo c24880OooOOoo = this.f84274OooO0O0;
            if (c24880OooOOoo.f84473OooOOo0) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new C24839OooOOOo(this.f84273OooO00o, c24880OooOOoo, this.f84275OooO0OO);
        }
    }
}
