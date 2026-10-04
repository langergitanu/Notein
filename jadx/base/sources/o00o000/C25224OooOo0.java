package o00o000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00o0O0.C25308OooO00o;

/* JADX INFO: renamed from: o00o000.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25224OooOo0 implements InterfaceC25121OooOO0O<InputStream, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25212OooO0Oo f85918OooO00o = new C25212OooO0Oo();

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(InputStream inputStream, int i, int i2, C25111OooO c25111OooO) throws IOException {
        return this.f85918OooO00o.OooO0OO(ImageDecoder.createSource(C25308OooO00o.OooO0O0(inputStream)), i, i2, c25111OooO);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final /* bridge */ /* synthetic */ boolean OooO0O0(InputStream inputStream, C25111OooO c25111OooO) throws IOException {
        return true;
    }
}
