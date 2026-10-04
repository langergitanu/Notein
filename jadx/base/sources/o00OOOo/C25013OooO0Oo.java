package o00OOOo;

/* JADX INFO: renamed from: o00OOOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25013OooO0Oo {

    /* JADX INFO: renamed from: o00OOOo.OooO0Oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f84899OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f84900OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f84901OooO0OO;
    }

    public static byte[] OooO00o(byte[] bArr) {
        OooO00o oooO00o = new OooO00o();
        oooO00o.f84899OooO00o = new int[256];
        for (int i = 0; i < 256; i++) {
            oooO00o.f84899OooO00o[i] = i;
        }
        oooO00o.f84900OooO0O0 = 0;
        oooO00o.f84901OooO0OO = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            try {
                char cCharAt = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK".charAt(i2);
                int[] iArr = oooO00o.f84899OooO00o;
                int i5 = iArr[i4];
                i3 = ((cCharAt + i5) + i3) % 256;
                iArr[i4] = iArr[i3];
                iArr[i3] = i5;
                i2 = (i2 + 1) % 256;
            } catch (Exception unused) {
                oooO00o = null;
            }
        }
        if (oooO00o == null) {
            return null;
        }
        int i6 = oooO00o.f84900OooO0O0;
        int i7 = oooO00o.f84901OooO0OO;
        for (int i8 = 0; i8 < bArr.length; i8++) {
            i6 = (i6 + 1) % 256;
            int[] iArr2 = oooO00o.f84899OooO00o;
            int i9 = iArr2[i6];
            i7 = (i7 + i9) % 256;
            iArr2[i6] = iArr2[i7];
            iArr2[i7] = i9;
            bArr[i8] = (byte) (iArr2[(iArr2[i6] + i9) % 256] ^ bArr[i8]);
        }
        oooO00o.f84900OooO0O0 = i6;
        oooO00o.f84901OooO0OO = i7;
        return bArr;
    }
}
