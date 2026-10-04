package o00o000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;

/* JADX INFO: renamed from: o00o000.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25210OooO00o<DataType> implements InterfaceC25121OooOO0O<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25121OooOO0O<DataType, Bitmap> f85858OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f85859OooO0O0;

    public C25210OooO00o(Resources resources, InterfaceC25121OooOO0O<DataType, Bitmap> interfaceC25121OooOO0O) {
        this.f85859OooO0O0 = resources;
        this.f85858OooO00o = interfaceC25121OooOO0O;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<BitmapDrawable> OooO00o(DataType datatype, int i, int i2, C25111OooO c25111OooO) throws IOException {
        InterfaceC25145OooOo0o<Bitmap> interfaceC25145OooOo0oOooO00o = this.f85858OooO00o.OooO00o(datatype, i, i2, c25111OooO);
        if (interfaceC25145OooOo0oOooO00o == null) {
            return null;
        }
        return new C25225OooOo0O(this.f85859OooO0O0, interfaceC25145OooOo0oOooO00o);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(DataType datatype, C25111OooO c25111OooO) throws IOException {
        return this.f85858OooO00o.OooO0O0(datatype, c25111OooO);
    }
}
