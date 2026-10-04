package o00o000;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00o000.OooOo00;

/* JADX INFO: renamed from: o00o000.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25226OooOo0o implements InterfaceC25121OooOO0O<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f85930OooO00o;

    public C25226OooOo0o(OooOOO oooOOO) {
        this.f85930OooO00o = oooOOO;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C25111OooO c25111OooO) throws IOException {
        OooOOO oooOOO = this.f85930OooO00o;
        return oooOOO.OooO00o(new OooOo00.OooO0OO(parcelFileDescriptor, oooOOO.f85888OooO0Oo, oooOOO.f85887OooO0OO), i, i2, c25111OooO, OooOOO.f85882OooOO0o);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(ParcelFileDescriptor parcelFileDescriptor, C25111OooO c25111OooO) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
    }
}
