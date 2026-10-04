package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.um */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6778um extends AbstractC6747ar {
    public AbstractC6778um(int i) {
        super(i);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26658k4(String str) {
        if (str != null) {
            return mo26623k4(C14113y2.m67365dy(str), 0, str.length(), (C6780uz) null);
        }
        throw new ArgumentNullException("s");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: kk */
    public AbstractC6766ks mo26626kk() {
        return new C6780uz(this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public AbstractC6760h4 mo26628x1() {
        return new C6753ck(this);
    }

    public AbstractC6778um(int i, AbstractC6769ne abstractC6769ne, AbstractC6751c5 abstractC6751c5) {
        super(i, abstractC6769ne, abstractC6751c5);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26659k4(String str, int i, int i2, byte[] bArr, int i3) {
        if (str == null || bArr == null) {
            throw new ArgumentNullException(str != null ? "bytes" : "s", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "charIndex" : "charCount", "Non-negative number required.");
        }
        if (str.length() - i < i2) {
            throw new ArgumentOutOfRangeException("s", "Index and count must refer to a location within the string.");
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
            throw new ArgumentOutOfRangeException(i < 0 ? FirebaseAnalytics.Param.INDEX : C18293o1.f55803f, "Non-negative number required.");
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
}
