package o0oo0oO;

/* JADX INFO: renamed from: o0oo0oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31329OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f111874OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f111875OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f111876OooO0OO;

    public C31329OooO0Oo(byte[] bArr, byte[] bArr2) {
        this.f111876OooO0OO = 0;
        if (bArr.length != bArr2.length && bArr.length == 1 && bArr[0] == 0) {
            bArr = new byte[bArr2.length];
        } else if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("The start and the end values must not have different lengths.");
        }
        this.f111874OooO00o = new int[bArr.length];
        this.f111875OooO0O0 = new int[bArr2.length];
        for (int i = 0; i < bArr.length; i++) {
            this.f111874OooO00o[i] = bArr[i] & 255;
            this.f111875OooO0O0[i] = bArr2[i] & 255;
        }
        this.f111876OooO0OO = bArr2.length;
    }

    public C31329OooO0Oo() {
        this.f111876OooO0OO = 0;
    }
}
