package oO0o0OO;

import com.aspose.slides.C22200OooO0o0;
import o0Ooo0oO.C29437OooOO0O;
import oO00ooo.AbstractC32479OooO0OO;
import oO0o0O.C33549OooO00o;
import oO0o0O.EnumC33551OooO0OO;
import oO0o0Ooo.C33835OooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000O00<U, T extends U> extends C33835OooOOo<T> implements Runnable {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final long f121363OooOoOO;

    public o0000O00(long j, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO, abstractC32479OooO0OO.getContext());
        this.f121363OooOoOO = j;
    }

    @Override // oO0o0OO.o0ooOOo
    public final String OoooO0O() {
        return super.OoooO0O() + "(timeMillis=" + this.f121363OooOoOO + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String strOooO0O0;
        InterfaceC33645OoooO00 interfaceC33645OoooO00OooO0O0 = C33644OoooO0.OooO0O0(this.f121272OooOoO0);
        InterfaceC33646OoooO0O interfaceC33646OoooO0O = interfaceC33645OoooO00OooO0O0 instanceof InterfaceC33646OoooO0O ? (InterfaceC33646OoooO0O) interfaceC33645OoooO00OooO0O0 : null;
        long j = this.f121363OooOoOO;
        if (interfaceC33646OoooO0O != null) {
            int i = C33549OooO00o.f121147OooOoO;
            C29437OooOO0O.OooO0oO(j, EnumC33551OooO0OO.f121153OooOoO0);
            strOooO0O0 = interfaceC33646OoooO0O.OooOOO0();
            if (strOooO0O0 == null) {
                strOooO0O0 = C22200OooO0o0.OooO0O0(j, "Timed out waiting for ", " ms");
            }
        }
        OooOo0(new o0000(strOooO0O0, this));
    }
}
