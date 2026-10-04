package com.huawei.hms.network.okhttp;

import com.aspose.slides.PatternStyle;
import com.huawei.hms.network.embedded.C18358t1;
import com.huawei.hms.network.embedded.C18381ub;
import com.huawei.hms.network.embedded.C18406wa;
import com.huawei.hms.network.embedded.C18433yb;
import com.huawei.hms.network.embedded.InterfaceC18289nb;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e */
    public static final String f56868e = "publicsuffixes.gz";

    /* JADX INFO: renamed from: i */
    public static final byte f56872i = 33;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f56874a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f56875b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    public byte[] f56876c;

    /* JADX INFO: renamed from: d */
    public byte[] f56877d;

    /* JADX INFO: renamed from: f */
    public static final byte[] f56869f = {PatternStyle.Plaid};

    /* JADX INFO: renamed from: g */
    public static final String[] f56870g = new String[0];

    /* JADX INFO: renamed from: h */
    public static final String[] f56871h = {C18358t1.g.f56183c};

    /* JADX INFO: renamed from: j */
    public static final PublicSuffixDatabase f56873j = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a */
    public static PublicSuffixDatabase m80073a() {
        return f56873j;
    }

    /* JADX INFO: renamed from: b */
    private void m80076b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(f56868e);
        if (resourceAsStream == null) {
            return;
        }
        InterfaceC18289nb interfaceC18289nbM80007a = C18433yb.m80007a(new C18381ub(C18433yb.m80004a(resourceAsStream)));
        try {
            byte[] bArr = new byte[interfaceC18289nbM80007a.readInt()];
            interfaceC18289nbM80007a.readFully(bArr);
            byte[] bArr2 = new byte[interfaceC18289nbM80007a.readInt()];
            interfaceC18289nbM80007a.readFully(bArr2);
            interfaceC18289nbM80007a.close();
            synchronized (this) {
                this.f56876c = bArr;
                this.f56877d = bArr2;
            }
            this.f56875b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (interfaceC18289nbM80007a != null) {
                    try {
                        interfaceC18289nbM80007a.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m80077c() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m80076b();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    C18406wa.m79845f().mo79425a(5, "Failed to read public suffix list", e);
                    if (!z) {
                        return;
                    }
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public String m80078a(String str) {
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] strArrSplit = IDN.toUnicode(str).split("\\.");
        String[] strArrM80075a = m80075a(strArrSplit);
        if (strArrSplit.length == strArrM80075a.length && strArrM80075a[0].charAt(0) != '!') {
            return null;
        }
        char cCharAt = strArrM80075a[0].charAt(0);
        int length = strArrSplit.length;
        int length2 = strArrM80075a.length;
        if (cCharAt != '!') {
            length2++;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit2 = str.split("\\.");
        for (int i = length - length2; i < strArrSplit2.length; i++) {
            sb.append(strArrSplit2[i]);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m80074a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m80079a(byte[] bArr, byte[] bArr2) {
        this.f56876c = bArr;
        this.f56877d = bArr2;
        this.f56874a.set(true);
        this.f56875b.countDown();
    }

    /* JADX INFO: renamed from: a */
    private String[] m80075a(String[] strArr) {
        String str;
        String strM80074a;
        String strM80074a2;
        int i = 0;
        if (this.f56874a.get() || !this.f56874a.compareAndSet(false, true)) {
            try {
                this.f56875b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m80077c();
        }
        synchronized (this) {
            if (this.f56876c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(StandardCharsets.UTF_8);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                strM80074a = null;
                break;
            }
            strM80074a = m80074a(this.f56876c, bArr, i3);
            if (strM80074a != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = f56869f;
                strM80074a2 = m80074a(this.f56876c, bArr2, i4);
                if (strM80074a2 != null) {
                    break;
                }
            }
            strM80074a2 = null;
        } else {
            strM80074a2 = null;
        }
        if (strM80074a2 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String strM80074a3 = m80074a(this.f56877d, bArr, i);
                if (strM80074a3 != null) {
                    str = strM80074a3;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return "!".concat(str).split("\\.");
        }
        if (strM80074a == null && strM80074a2 == null) {
            return f56871h;
        }
        String[] strArrSplit = strM80074a != null ? strM80074a.split("\\.") : f56870g;
        String[] strArrSplit2 = strM80074a2 != null ? strM80074a2.split("\\.") : f56870g;
        return strArrSplit.length > strArrSplit2.length ? strArrSplit : strArrSplit2;
    }
}
