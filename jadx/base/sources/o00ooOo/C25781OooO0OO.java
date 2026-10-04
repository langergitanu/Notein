package o00ooOo;

import com.facebook.soloader.AbstractC22320OooOoO0;

/* JADX INFO: renamed from: o00ooOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25781OooO0OO implements InterfaceC25783OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25783OooO0o[] f87954OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f87955OooO0O0 = 0;

    public C25781OooO0OO(InterfaceC25783OooO0o... interfaceC25783OooO0oArr) {
        this.f87954OooO00o = interfaceC25783OooO0oArr;
    }

    @Override // o00ooOo.InterfaceC25783OooO0o
    public final boolean OooO0O0(UnsatisfiedLinkError unsatisfiedLinkError, AbstractC22320OooOoO0[] abstractC22320OooOoO0Arr) {
        int i;
        InterfaceC25783OooO0o[] interfaceC25783OooO0oArr;
        do {
            i = this.f87955OooO0O0;
            interfaceC25783OooO0oArr = this.f87954OooO00o;
            if (i >= 6) {
                return false;
            }
            this.f87955OooO0O0 = i + 1;
        } while (!interfaceC25783OooO0oArr[i].OooO0O0(unsatisfiedLinkError, abstractC22320OooOoO0Arr));
        return true;
    }
}
