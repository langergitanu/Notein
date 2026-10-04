package o00o000;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25114OooO0OO;
import o00Ooo0o.InterfaceC25122OooOO0o;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.InterfaceC25155OooO0O0;

/* JADX INFO: renamed from: o00o000.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25211OooO0O0 implements InterfaceC25122OooOO0o<BitmapDrawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85860OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f85861OooO0O0;

    public C25211OooO0O0(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, OooO0OO oooO0OO) {
        this.f85860OooO00o = interfaceC25155OooO0O0;
        this.f85861OooO0O0 = oooO0OO;
    }

    @Override // o00Ooo0o.InterfaceC25115OooO0Oo
    public final boolean OooO00o(Object obj, File file, C25111OooO c25111OooO) {
        return this.f85861OooO0O0.OooO00o(new C25213OooO0o0(((BitmapDrawable) ((InterfaceC25145OooOo0o) obj).get()).getBitmap(), this.f85860OooO00o), file, c25111OooO);
    }

    @Override // o00Ooo0o.InterfaceC25122OooOO0o
    public final EnumC25114OooO0OO OooO0O0(C25111OooO c25111OooO) {
        return EnumC25114OooO0OO.f85379OooOo;
    }
}
