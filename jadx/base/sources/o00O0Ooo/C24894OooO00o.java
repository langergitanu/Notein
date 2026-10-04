package o00O0Ooo;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: renamed from: o00O0Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24894OooO00o extends AbstractRunnableC24896OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00O0OO0.OooOO0O f84504OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ UUID f84505OooOoO0;

    public C24894OooO00o(o00O0OO0.OooOO0O oooOO0O, UUID uuid) {
        this.f84504OooOo = oooOO0O;
        this.f84505OooOoO0 = uuid;
    }

    @Override // o00O0Ooo.AbstractRunnableC24896OooO0OO
    public final void OooO0O0() {
        o00O0OO0.OooOO0O oooOO0O = this.f84504OooOo;
        WorkDatabase workDatabase = oooOO0O.f84362OooO0OO;
        workDatabase.OooO0OO();
        try {
            AbstractRunnableC24896OooO0OO.OooO00o(oooOO0O, this.f84505OooOoO0.toString());
            workDatabase.OooOOoo();
            workDatabase.OooOOOo();
            o00O0OO0.OooO0o.OooO00o(oooOO0O.f84361OooO0O0, oooOO0O.f84362OooO0OO, oooOO0O.f84365OooO0o0);
        } catch (Throwable th) {
            workDatabase.OooOOOo();
            throw th;
        }
    }
}
