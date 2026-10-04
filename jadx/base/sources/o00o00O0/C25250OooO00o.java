package o00o00O0;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import o00Ooo0o.C25111OooO;
import o00OooO.InterfaceC25145OooOo0o;
import o00o000O.C25242OooO0O0;

/* JADX INFO: renamed from: o00o00O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25250OooO00o implements InterfaceC25253OooO0o0<Bitmap, byte[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Bitmap.CompressFormat f85974OooO00o = Bitmap.CompressFormat.JPEG;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f85975OooO0O0 = 100;

    @Override // o00o00O0.InterfaceC25253OooO0o0
    public final InterfaceC25145OooOo0o<byte[]> OooO00o(InterfaceC25145OooOo0o<Bitmap> interfaceC25145OooOo0o, C25111OooO c25111OooO) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC25145OooOo0o.get().compress(this.f85974OooO00o, this.f85975OooO0O0, byteArrayOutputStream);
        interfaceC25145OooOo0o.recycle();
        return new C25242OooO0O0(byteArrayOutputStream.toByteArray());
    }
}
