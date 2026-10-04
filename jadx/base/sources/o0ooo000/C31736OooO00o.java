package o0ooo000;

/* JADX INFO: renamed from: o0ooo000.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31736OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f113364OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f113365OooO0O0 = false;

    public C31736OooO00o(byte[] bArr) {
        this.f113364OooO00o = 0;
        int i = (bArr[0] & 255) << 8;
        this.f113364OooO00o = i;
        int i2 = (i | (bArr[1] & 255)) << 8;
        this.f113364OooO00o = i2;
        int i3 = (i2 | (bArr[2] & 255)) << 8;
        this.f113364OooO00o = i3;
        this.f113364OooO00o = (bArr[3] & 255) | i3;
    }

    public final void OooO00o(int i, boolean z) {
        int i2 = this.f113364OooO00o;
        this.f113364OooO00o = z ? (1 << (i - 1)) | i2 : (~(1 << (i - 1))) & i2;
    }
}
