package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.common.base.Ascii;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6763k4 extends AbstractC6747ar {

    /* JADX INFO: renamed from: k4 */
    public static final k4 f18677k4 = new k4();

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.k4$k4 */
    public static final class k4 extends C6763k4 {
    }

    public C6763k4() {
        super(20127);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26620k4(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("charCount", "Non-negative number required.");
        }
        long jMo26737x1 = ((long) i) + 1;
        if (m26654ck().mo26737x1() > 1) {
            jMo26737x1 *= (long) m26654ck().mo26737x1();
        }
        if (jMo26737x1 <= 2147483647L) {
            return (int) jMo26737x1;
        }
        throw new ArgumentOutOfRangeException("charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: kk */
    public AbstractC6766ks mo26626kk() {
        return new C6780uz(this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public int mo26627x1(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("byteCount", "Non-negative number required.");
        }
        long jMo26735x1 = i;
        if (m26656fa().mo26735x1() > 1) {
            jMo26735x1 *= (long) m26656fa().mo26735x1();
        }
        if (jMo26735x1 <= 2147483647L) {
            return (int) jMo26735x1;
        }
        throw new ArgumentOutOfRangeException("byteCount", "Too many bytes. The resulting number of chars is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26658k4(String str) {
        if (str != null) {
            return mo26623k4(C14113y2.m67365dy(str), 0, str.length(), (C6780uz) null);
        }
        throw new ArgumentNullException("chars");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public AbstractC6760h4 mo26628x1() {
        return new C6753ck(this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26659k4(String str, int i, int i2, byte[] bArr, int i3) {
        if (str == null || bArr == null) {
            throw new ArgumentNullException(str != null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "charIndex" : "charCount", "Non-negative number required.");
        }
        if (str.length() - i < i2) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the string.");
        }
        if (i3 < 0 || i3 > bArr.length) {
            throw new ArgumentOutOfRangeException("byteIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        return mo26624k4(C14113y2.m67365dy(str), i, i2, bArr, i3, bArr.length - i3, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public String mo26682x1(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
        }
        if (bArr.length - i >= i2) {
            return i2 == 0 ? C14113y2.f47374k4 : m26676to(bArr, i, i2);
        }
        throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26660k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes", "Array cannot be null.");
        }
        String str = C18293o1.f55803f;
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
        if (i < 0 || i2 < 0) {
            if (i < 0) {
                str = FirebaseAnalytics.Param.INDEX;
            }
            throw new ArgumentOutOfRangeException(str, "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26621k4(bArr, i, i2, (C6753ck) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26621k4(byte[] bArr, int i, int i2, C6753ck c6753ck) {
        C6758fa c6758fa = (C6758fa) C7019kk.m27452k4((Object) (c6753ck == null ? m26656fa() : c6753ck.m26752kk()), C6758fa.class);
        if (c6758fa != null && c6758fa.mo26735x1() == 1) {
            return i2;
        }
        int i3 = i + i2;
        AbstractC6762jd abstractC6762jdMo26734k4 = null;
        int iMo26770x1 = i2;
        while (i < i3) {
            byte b = bArr[i];
            i++;
            if ((b & 255) >= 128) {
                if (abstractC6762jdMo26734k4 == null) {
                    abstractC6762jdMo26734k4 = c6753ck == null ? m26656fa().mo26734k4() : c6753ck.m26753to();
                    abstractC6762jdMo26734k4.m26765k4(i3 - i2, 0);
                }
                iMo26770x1 = (iMo26770x1 - 1) + abstractC6762jdMo26734k4.mo26770x1(new byte[]{b}, i);
            }
        }
        return iMo26770x1;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26661k4(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr != null ? "chars" : "bytes", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
        }
        if (i3 < 0 || i3 > cArr.length) {
            throw new ArgumentOutOfRangeException("charIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26622k4(bArr, i, i2, cArr, i3, cArr.length - i3, (C6753ck) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26662k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr == null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i4 < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i4 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
        }
        return mo26622k4(bArr, i, i2, cArr, i3, i4, (C6753ck) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[PHI: r12
      0x009d: PHI (r12v7 int) = (r12v1 int), (r12v9 int) binds: [B:43:0x00a4, B:39:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26622k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, C6753ck c6753ck) {
        int i5 = i + i2;
        C6758fa c6758fa = (C6758fa) C7019kk.m27452k4((Object) (c6753ck == null ? m26656fa() : c6753ck.m26752kk()), C6758fa.class);
        if (c6758fa != null && c6758fa.mo26735x1() == 1) {
            char cCharAt = c6758fa.m26747du().charAt(0);
            if (i4 < i2) {
                m26668k4(c6753ck, i4 < 1);
                i5 = i + i4;
            }
            int i6 = i;
            int i7 = i3;
            while (i6 < i5) {
                int i8 = i6 + 1;
                int i9 = bArr[i6] & 255;
                if (i9 >= 128) {
                    cArr[i7] = cCharAt;
                    i7++;
                } else {
                    cArr[i7] = (char) i9;
                    i7++;
                }
                i6 = i8;
            }
            if (c6753ck != null) {
                c6753ck.f18640du = i6 - i;
            }
            return i7 - i3;
        }
        int i10 = i4 + i3;
        AbstractC6762jd abstractC6762jdMo26734k4 = null;
        int i11 = i;
        int i12 = i3;
        while (i11 < i5) {
            byte b = bArr[i11];
            int i13 = i11 + 1;
            int i14 = b & 255;
            if (i14 >= 128) {
                if (abstractC6762jdMo26734k4 == null) {
                    abstractC6762jdMo26734k4 = c6753ck == null ? m26656fa().mo26734k4() : c6753ck.m26753to();
                    abstractC6762jdMo26734k4.m26765k4(i5 - i2, i10);
                }
                int[] iArr = {i12};
                boolean zM26767k4 = abstractC6762jdMo26734k4.m26767k4(new byte[]{b}, i13, cArr, iArr);
                i12 = iArr[0];
                if (zM26767k4) {
                    i11 = i13;
                } else {
                    abstractC6762jdMo26734k4.m26769to();
                    if (i12 == i3) {
                        z = true;
                    }
                    m26668k4(c6753ck, z);
                }
            } else if (i12 >= i10) {
                if (i12 == i3) {
                }
                m26668k4(c6753ck, z);
            } else {
                cArr[i12] = (char) i14;
                i12++;
                i11 = i13;
            }
            if (c6753ck != null) {
                c6753ck.f18640du = i11 - i;
            }
            return i12 - i3;
        }
        if (c6753ck != null) {
        }
        return i12 - i3;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26663k4(char[] cArr, int i, int i2) {
        if (cArr == null) {
            throw new ArgumentNullException("chars", "Array cannot be null.");
        }
        String str = C18293o1.f55803f;
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
        if (i < 0 || i2 < 0) {
            if (i < 0) {
                str = FirebaseAnalytics.Param.INDEX;
            }
            throw new ArgumentOutOfRangeException(str, "Non-negative number required.");
        }
        if (cArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26623k4(cArr, i, i2, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26623k4(char[] cArr, int i, int i2, C6780uz c6780uz) {
        C6782wl c6782wl;
        char c;
        int i3 = i + i2;
        int[] iArr = new int[1];
        AbstractC6761ix abstractC6761ixMo26736k4 = null;
        if (c6780uz != null) {
            c = c6780uz.f18747kk;
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) c6780uz.m26811k4(), C6782wl.class);
            if (c6780uz.m26813kk()) {
                abstractC6761ixMo26736k4 = c6780uz.m26814x1();
                if (abstractC6761ixMo26736k4.mo26762kk() > 0 && c6780uz.f18749to) {
                    throw new ArgumentException(C6770qm.m26824k4("Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.", mo26653c5(), C14067j2.m66727k4(c6780uz.m26811k4())));
                }
                abstractC6761ixMo26736k4.m26758k4(i, i3, c6780uz, false);
            }
        } else {
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) m26654ck(), C6782wl.class);
            c = 0;
        }
        if (c6782wl != null && c6782wl.mo26737x1() == 1) {
            return c > 0 ? i2 + 1 : i2;
        }
        if (c > 0) {
            abstractC6761ixMo26736k4 = c6780uz.m26814x1();
            abstractC6761ixMo26736k4.m26758k4(i, i3, c6780uz, false);
            iArr[0] = i;
            abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
            i = iArr[0];
        }
        int i4 = 0;
        while (true) {
            char cM26755h4 = abstractC6761ixMo26736k4 == null ? (char) 0 : abstractC6761ixMo26736k4.m26755h4();
            if (cM26755h4 == 0 && i >= i3) {
                return i4;
            }
            if (cM26755h4 == 0) {
                cM26755h4 = cArr[i];
                i++;
            }
            if (cM26755h4 > 127) {
                if (abstractC6761ixMo26736k4 == null) {
                    abstractC6761ixMo26736k4 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                    abstractC6761ixMo26736k4.m26758k4(i3 - i2, i3, c6780uz, false);
                }
                iArr[0] = i;
                abstractC6761ixMo26736k4.m26761k4(cM26755h4, cArr, iArr);
                i = iArr[0];
            } else {
                i4++;
            }
        }
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26664k4(char[] cArr, int i, int i2, byte[] bArr, int i3) {
        if (cArr == null || bArr == null) {
            throw new ArgumentNullException(cArr != null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "charIndex" : "charCount", "Non-negative number required.");
        }
        if (cArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
        }
        if (i3 < 0 || i3 > bArr.length) {
            throw new ArgumentOutOfRangeException("byteIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26624k4(cArr, i, i2, bArr, i3, bArr.length - i3, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26665k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr == null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
        }
        return mo26624k4(cArr, i, i2, bArr, i3, i4, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26624k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, C6780uz c6780uz) {
        C6782wl c6782wl;
        char c;
        int i5;
        char cCharAt;
        int i6;
        int i7;
        int[] iArr = new int[1];
        int i8 = i + i2;
        AbstractC6761ix abstractC6761ixMo26736k4 = null;
        if (c6780uz != null) {
            c = c6780uz.f18747kk;
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) c6780uz.m26811k4(), C6782wl.class);
            if (c6780uz.m26813kk()) {
                abstractC6761ixMo26736k4 = c6780uz.m26814x1();
                if (abstractC6761ixMo26736k4.mo26762kk() > 0 && c6780uz.f18749to) {
                    throw new ArgumentException(C6770qm.m26824k4("Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.", mo26653c5(), C14067j2.m66727k4(c6780uz.m26811k4())));
                }
                abstractC6761ixMo26736k4.m26758k4(i, i8, c6780uz, true);
            }
        } else {
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) m26654ck(), C6782wl.class);
            c = 0;
        }
        char c2 = Ascii.MAX;
        if (c6782wl != null && c6782wl.mo26737x1() == 1 && (cCharAt = c6782wl.m26843du().charAt(0)) <= 127) {
            if (c > 0) {
                if (i4 == 0) {
                    m26670k4(c6780uz, true);
                }
                i7 = i3 + 1;
                bArr[i3] = (byte) cCharAt;
                i6 = i4 - 1;
            } else {
                i6 = i4;
                i7 = i3;
            }
            if (i6 < i2) {
                m26670k4(c6780uz, i6 < 1);
                i8 = i + i6;
            }
            int i9 = i;
            while (i9 < i8) {
                int i10 = i9 + 1;
                char c3 = cArr[i9];
                if (c3 >= 128) {
                    bArr[i7] = (byte) cCharAt;
                    i7++;
                } else {
                    bArr[i7] = (byte) c3;
                    i7++;
                }
                i9 = i10;
            }
            if (c6780uz != null) {
                c6780uz.f18747kk = (char) 0;
                c6780uz.f18745du = i9 - i;
            }
            return i7 - i3;
        }
        int i11 = i3 + i4;
        if (c > 0) {
            abstractC6761ixMo26736k4 = c6780uz.m26814x1();
            abstractC6761ixMo26736k4.m26758k4(i, i8, c6780uz, true);
            iArr[0] = i;
            abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
            i5 = iArr[0];
        } else {
            i5 = i;
        }
        int i12 = i3;
        while (true) {
            char cM26755h4 = abstractC6761ixMo26736k4 == null ? (char) 0 : abstractC6761ixMo26736k4.m26755h4();
            if (cM26755h4 == 0 && i5 >= i8) {
                break;
            }
            if (cM26755h4 == 0) {
                cM26755h4 = cArr[i5];
                i5++;
            }
            if (cM26755h4 > c2) {
                if (abstractC6761ixMo26736k4 == null) {
                    abstractC6761ixMo26736k4 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                    abstractC6761ixMo26736k4.m26758k4(i8 - i2, i8, c6780uz, true);
                }
                iArr[0] = i5;
                abstractC6761ixMo26736k4.m26761k4(cM26755h4, cArr, iArr);
                i5 = iArr[0];
            } else if (i12 >= i11) {
                if (abstractC6761ixMo26736k4 == null || !abstractC6761ixMo26736k4.f18669h4) {
                    i5--;
                } else {
                    abstractC6761ixMo26736k4.mo26764x1();
                }
                m26670k4(c6780uz, i12 == i3);
            } else {
                bArr[i12] = (byte) cM26755h4;
                i12++;
            }
            c2 = Ascii.MAX;
        }
        if (c6780uz != null) {
            if (abstractC6761ixMo26736k4 != null && !abstractC6761ixMo26736k4.f18668du) {
                c6780uz.f18747kk = (char) 0;
            }
            c6780uz.f18745du = i5 - i;
        }
        return i12 - i3;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public void mo26666k4() {
        this.f18591ks = AbstractC6769ne.m26820kk();
        this.f18592rv = AbstractC6751c5.m26732kk();
    }
}
