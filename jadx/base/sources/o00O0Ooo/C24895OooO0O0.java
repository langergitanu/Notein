package o00O0Ooo;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import o00O0OoO.C24890OooOooo;

/* JADX INFO: renamed from: o00O0Ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24895OooO0O0 extends AbstractRunnableC24896OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00O0OO0.OooOO0O f84506OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f84507OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f84508OooOoO0;

    public C24895OooO0O0(o00O0OO0.OooOO0O oooOO0O, String str, boolean z) {
        this.f84506OooOo = oooOO0O;
        this.f84508OooOoO0 = str;
        this.f84507OooOoO = z;
    }

    @Override // o00O0Ooo.AbstractRunnableC24896OooO0OO
    public final void OooO0O0() {
        o00O0OO0.OooOO0O oooOO0O = this.f84506OooOo;
        WorkDatabase workDatabase = oooOO0O.f84362OooO0OO;
        workDatabase.OooO0OO();
        try {
            Iterator it = ((C24890OooOooo) workDatabase.OooOoO()).OooO(this.f84508OooOoO0).iterator();
            while (it.hasNext()) {
                AbstractRunnableC24896OooO0OO.OooO00o(oooOO0O, (String) it.next());
            }
            workDatabase.OooOOoo();
            workDatabase.OooOOOo();
            if (this.f84507OooOoO) {
                o00O0OO0.OooO0o.OooO00o(oooOO0O.f84361OooO0O0, oooOO0O.f84362OooO0OO, oooOO0O.f84365OooO0o0);
            }
        } catch (Throwable th) {
            workDatabase.OooOOOo();
            throw th;
        }
    }
}
