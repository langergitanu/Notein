package o00OooOO;

/* JADX INFO: renamed from: o00OooOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25157OooO0Oo implements InterfaceC25154OooO00o<byte[]> {
    @Override // o00OooOO.InterfaceC25154OooO00o
    public final int OooO00o(byte[] bArr) {
        return bArr.length;
    }

    @Override // o00OooOO.InterfaceC25154OooO00o
    public final int OooO0O0() {
        return 1;
    }

    @Override // o00OooOO.InterfaceC25154OooO00o
    public final String getTag() {
        return "ByteArrayPool";
    }

    @Override // o00OooOO.InterfaceC25154OooO00o
    public final byte[] newArray(int i) {
        return new byte[i];
    }
}
