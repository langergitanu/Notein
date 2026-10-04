package oO0oOo0;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.o00oO0O;
import oOO000oO.C34336OooO0o;

/* JADX INFO: renamed from: oO0oOo0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34154OooOOO0 extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34152OooOO0o[] f122724OooOo0o;

    public C34154OooOOO0(AbstractC34039OooOooO abstractC34039OooOooO) {
        this.f122724OooOo0o = new C34152OooOO0o[abstractC34039OooOooO.size()];
        for (int i = 0; i != abstractC34039OooOooO.size(); i++) {
            this.f122724OooOo0o[i] = C34152OooOO0o.OooO0oo(abstractC34039OooOooO.OooOo0(i));
        }
    }

    public static C34154OooOOO0 OooO0oo(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        if (interfaceC34019OooO0oO instanceof C34154OooOOO0) {
            return (C34154OooOOO0) interfaceC34019OooO0oO;
        }
        if (interfaceC34019OooO0oO != null) {
            return new C34154OooOOO0(AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oO));
        }
        return null;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        return new o00oO0O(this.f122724OooOo0o);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("GeneralNames:");
        String str = C34336OooO0o.f123266OooO00o;
        stringBuffer.append(str);
        int i = 0;
        while (true) {
            C34152OooOO0o[] c34152OooOO0oArr = this.f122724OooOo0o;
            if (i == c34152OooOO0oArr.length) {
                return stringBuffer.toString();
            }
            stringBuffer.append("    ");
            stringBuffer.append(c34152OooOO0oArr[i]);
            stringBuffer.append(str);
            i++;
        }
    }

    public C34154OooOOO0(C34152OooOO0o c34152OooOO0o) {
        this.f122724OooOo0o = new C34152OooOO0o[]{c34152OooOO0o};
    }
}
