package p619oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[][] f113650OooO00o;

    public OooOOO(OooOOO0 oooOOO0, byte[][] bArr) {
        if (oooOOO0 == null) {
            throw new NullPointerException("params == null");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                throw new NullPointerException("publicKey byte array == null");
            }
        }
        if (bArr.length != oooOOO0.f113653OooO0OO) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr3 : bArr) {
            if (bArr3.length != oooOOO0.f113651OooO00o) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.f113650OooO00o = C31904OooOoO.OooO0OO(bArr);
    }
}
