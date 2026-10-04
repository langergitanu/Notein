package com.huawei.hms.drive;

import com.aspose.slides.PatternStyle;
import com.huawei.hms.network.embedded.C18358t1;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import oOo00OoO.C34533OooOOO0;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34542OooOo0O;

/* JADX INFO: renamed from: com.huawei.hms.drive.dp */
/* JADX INFO: loaded from: classes6.dex */
public final class C17860dp {

    /* JADX INFO: renamed from: a */
    private static final byte[] f53387a = {PatternStyle.Plaid};

    /* JADX INFO: renamed from: b */
    private static final String[] f53388b = new String[0];

    /* JADX INFO: renamed from: c */
    private static final String[] f53389c = {C18358t1.g.f56183c};

    /* JADX INFO: renamed from: d */
    private static final C17860dp f53390d = new C17860dp();

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f53391e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    private final CountDownLatch f53392f = new CountDownLatch(1);

    /* JADX INFO: renamed from: g */
    private byte[] f53393g;

    /* JADX INFO: renamed from: h */
    private byte[] f53394h;

    /* JADX INFO: renamed from: a */
    public static C17860dp m76758a() {
        return f53390d;
    }

    /* JADX INFO: renamed from: b */
    private void m76761b() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m76762c();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    C17858dn.m76756e().mo76729a(5, "Failed to read public suffix list", e);
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

    /* JADX INFO: renamed from: c */
    private void m76762c() throws IOException {
        InputStream resourceAsStream = C17860dp.class.getResourceAsStream(PublicSuffixDatabase.f56868e);
        if (resourceAsStream == null) {
            return;
        }
        C34542OooOo0O c34542OooOo0OOooO0O0 = C34535OooOOOo.OooO0O0(new C34533OooOOO0(C34535OooOOOo.OooO0o(resourceAsStream)));
        try {
            byte[] bArr = new byte[c34542OooOo0OOooO0O0.readInt()];
            c34542OooOo0OOooO0O0.readFully(bArr);
            byte[] bArr2 = new byte[c34542OooOo0OOooO0O0.readInt()];
            c34542OooOo0OOooO0O0.readFully(bArr2);
            synchronized (this) {
                this.f53393g = bArr;
                this.f53394h = bArr2;
            }
            this.f53392f.countDown();
        } finally {
            C17806bp.m76338a(c34542OooOo0OOooO0O0);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m76763a(String str) {
        int length;
        int length2;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] strArrSplit = IDN.toUnicode(str).split("\\.");
        String[] strArrM76760a = m76760a(strArrSplit);
        if (strArrSplit.length == strArrM76760a.length && strArrM76760a[0].charAt(0) != '!') {
            return null;
        }
        if (strArrM76760a[0].charAt(0) == '!') {
            length = strArrSplit.length;
            length2 = strArrM76760a.length;
        } else {
            length = strArrSplit.length;
            length2 = strArrM76760a.length + 1;
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
    private String[] m76760a(String[] strArr) {
        String str;
        String strM76759a;
        String strM76759a2;
        String[] strArrSplit;
        String[] strArrSplit2;
        int i = 0;
        if (!this.f53391e.get() && this.f53391e.compareAndSet(false, true)) {
            m76761b();
        } else {
            try {
                this.f53392f.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        synchronized (this) {
            if (this.f53393g == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(C17806bp.f52958e);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                strM76759a = null;
                break;
            }
            strM76759a = m76759a(this.f53393g, bArr, i3);
            if (strM76759a != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = f53387a;
                strM76759a2 = m76759a(this.f53393g, bArr2, i4);
                if (strM76759a2 != null) {
                    break;
                }
            }
            strM76759a2 = null;
        } else {
            strM76759a2 = null;
        }
        if (strM76759a2 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String strM76759a3 = m76759a(this.f53394h, bArr, i);
                if (strM76759a3 != null) {
                    str = strM76759a3;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return "!".concat(str).split("\\.");
        }
        if (strM76759a == null && strM76759a2 == null) {
            return f53389c;
        }
        if (strM76759a != null) {
            strArrSplit = strM76759a.split("\\.");
        } else {
            strArrSplit = f53388b;
        }
        if (strM76759a2 != null) {
            strArrSplit2 = strM76759a2.split("\\.");
        } else {
            strArrSplit2 = f53388b;
        }
        return strArrSplit.length > strArrSplit2.length ? strArrSplit : strArrSplit2;
    }

    /* JADX INFO: renamed from: a */
    private static String m76759a(byte[] bArr, byte[][] bArr2, int i) {
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
                            return new String(bArr, i7, i9, C17806bp.f52958e);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }
}
