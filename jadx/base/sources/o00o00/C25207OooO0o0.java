package o00o00;

import android.graphics.Bitmap;
import com.bumptech.glide.OooOOO0;
import o00Ooo0.C25099OooO0o0;
import o00Ooo0.InterfaceC25097OooO00o;
import o00OooOO.C25159OooO0oO;
import o00o00.C25208OooO0oO;

/* JADX INFO: renamed from: o00o00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25207OooO0o0 extends o00o000o.OooO0o<OooO0OO> {
    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Class<OooO0OO> OooO00o() {
        return OooO0OO.class;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final int getSize() {
        C25208OooO0oO c25208OooO0oO = ((OooO0OO) this.f85970OooOo0o).f85820OooOo0o.f85829OooO00o;
        C25099OooO0o0 c25099OooO0o0 = c25208OooO0oO.f85832OooO00o;
        return (c25099OooO0o0.f85244OooOO0.length * 4) + c25099OooO0o0.f85239OooO0Oo.limit() + c25099OooO0o0.f85235OooO.length + c25208OooO0oO.f85845OooOOOO;
    }

    @Override // o00o000o.OooO0o, o00OooO.InterfaceC25142OooOOoo
    public final void initialize() {
        ((OooO0OO) this.f85970OooOo0o).f85820OooOo0o.f85829OooO00o.f85842OooOO0o.prepareToDraw();
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final void recycle() {
        C25159OooO0oO c25159OooO0oO;
        C25159OooO0oO c25159OooO0oO2;
        C25159OooO0oO c25159OooO0oO3;
        OooO0OO oooO0OO = (OooO0OO) this.f85970OooOo0o;
        oooO0OO.stop();
        oooO0OO.f85821OooOoO = true;
        C25208OooO0oO c25208OooO0oO = oooO0OO.f85820OooOo0o.f85829OooO00o;
        c25208OooO0oO.f85834OooO0OO.clear();
        Bitmap bitmap = c25208OooO0oO.f85842OooOO0o;
        if (bitmap != null) {
            c25208OooO0oO.f85837OooO0o0.OooO00o(bitmap);
            c25208OooO0oO.f85842OooOO0o = null;
        }
        c25208OooO0oO.f85836OooO0o = false;
        C25208OooO0oO.OooO00o oooO00o = c25208OooO0oO.f85831OooO;
        OooOOO0 oooOOO0 = c25208OooO0oO.f85835OooO0Oo;
        if (oooO00o != null) {
            oooOOO0.OooO0Oo(oooO00o);
            c25208OooO0oO.f85831OooO = null;
        }
        C25208OooO0oO.OooO00o oooO00o2 = c25208OooO0oO.f85841OooOO0O;
        if (oooO00o2 != null) {
            oooOOO0.OooO0Oo(oooO00o2);
            c25208OooO0oO.f85841OooOO0O = null;
        }
        C25208OooO0oO.OooO00o oooO00o3 = c25208OooO0oO.f85843OooOOO;
        if (oooO00o3 != null) {
            oooOOO0.OooO0Oo(oooO00o3);
            c25208OooO0oO.f85843OooOOO = null;
        }
        C25099OooO0o0 c25099OooO0o0 = c25208OooO0oO.f85832OooO00o;
        c25099OooO0o0.f85246OooOO0o = null;
        byte[] bArr = c25099OooO0o0.f85235OooO;
        InterfaceC25097OooO00o.InterfaceC19675OooO00o interfaceC19675OooO00o = c25099OooO0o0.f85238OooO0OO;
        if (bArr != null && (c25159OooO0oO3 = ((OooO0O0) interfaceC19675OooO00o).f85818OooO0O0) != null) {
            c25159OooO0oO3.OooO0oo(bArr);
        }
        int[] iArr = c25099OooO0o0.f85244OooOO0;
        if (iArr != null && (c25159OooO0oO2 = ((OooO0O0) interfaceC19675OooO00o).f85818OooO0O0) != null) {
            c25159OooO0oO2.OooO0oo(iArr);
        }
        Bitmap bitmap2 = c25099OooO0o0.f85248OooOOO0;
        if (bitmap2 != null) {
            ((OooO0O0) interfaceC19675OooO00o).f85817OooO00o.OooO00o(bitmap2);
        }
        c25099OooO0o0.f85248OooOOO0 = null;
        c25099OooO0o0.f85239OooO0Oo = null;
        c25099OooO0o0.f85253OooOOoo = null;
        byte[] bArr2 = c25099OooO0o0.f85241OooO0o0;
        if (bArr2 != null && (c25159OooO0oO = ((OooO0O0) interfaceC19675OooO00o).f85818OooO0O0) != null) {
            c25159OooO0oO.OooO0oo(bArr2);
        }
        c25208OooO0oO.f85840OooOO0 = true;
    }
}
