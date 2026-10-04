package okhttp3.internal.publicsuffix;

import com.aspose.slides.PatternStyle;
import com.facebook.soloader.OooOo;
import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34434OooOoO;
import oOo00OoO.C34533OooOOO0;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34542OooOo0O;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicBoolean f124717OooO00o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CountDownLatch f124718OooO0O0 = new CountDownLatch(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public byte[] f124719OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f124720OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Companion f124714OooO0o0 = new Companion(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final byte[] f124713OooO0o = {PatternStyle.Plaid};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final List<String> f124715OooO0oO = OooOo.OooO0oO(C18358t1.g.f56183c);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final PublicSuffixDatabase f124716OooO0oo = new PublicSuffixDatabase();

    @Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m80612d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "<init>", "()V", "", "EXCEPTION_MARKER", "C", "", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "", "WILDCARD_LABEL", "[B", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static final String OooO00o(Companion companion, byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            int i5 = -1;
            companion.getClass();
            int length = bArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = (i6 + length) / 2;
                while (i7 > i5 && bArr[i7] != 10) {
                    i7 += i5;
                }
                int i8 = i7 + 1;
                int i9 = 1;
                while (true) {
                    i2 = i8 + i9;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i9++;
                }
                int i10 = i2 - i8;
                int i11 = i;
                boolean z2 = false;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte b = bArr2[i11][i12];
                        byte[] bArr3 = Util.f124301OooO00o;
                        int i14 = b & 255;
                        z = z2;
                        i3 = i14;
                    }
                    byte b2 = bArr[i8 + i13];
                    byte[] bArr4 = Util.f124301OooO00o;
                    i4 = i3 - (b2 & 255);
                    if (i4 != 0) {
                        break;
                    }
                    i13++;
                    i12++;
                    if (i13 == i10) {
                        break;
                    }
                    if (bArr2[i11].length != i12) {
                        z2 = z;
                    } else {
                        if (i11 == bArr2.length - 1) {
                            break;
                        }
                        i11++;
                        z2 = true;
                        i12 = -1;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i15 = i10 - i13;
                        int length2 = bArr2[i11].length - i12;
                        int length3 = bArr2.length;
                        for (int i16 = i11 + 1; i16 < length3; i16++) {
                            length2 += bArr2[i16].length;
                        }
                        if (length2 >= i15) {
                            if (length2 <= i15) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                OooOOO0.OooO0o(UTF_8, "UTF_8");
                                return new String(bArr, i8, i10, UTF_8);
                            }
                        }
                        length = i7;
                    }
                    i6 = i2 + 1;
                } else {
                    length = i7;
                }
                i5 = -1;
            }
            return null;
        }

        private Companion() {
        }
    }

    public static List OooO0OO(String str) {
        List listO000oOoO = C33599OooOo0O.o000oOoO(str, new char[]{FilenameUtils.EXTENSION_SEPARATOR});
        return OooOOO0.OooO0O0(oOo000Oo.OooOo.OoooOOo(listO000oOoO), "") ? oOo000Oo.OooOo.Oooo0OO(listO000oOoO) : listO000oOoO;
    }

    public final String OooO00o(String str) {
        String strOooO00o;
        String strOooO00o2;
        String strOooO00o3;
        List<String> listO000oOoO;
        String unicodeDomain = IDN.toUnicode(str);
        OooOOO0.OooO0o(unicodeDomain, "unicodeDomain");
        List listOooO0OO = OooO0OO(unicodeDomain);
        if (this.f124717OooO00o.get() || !this.f124717OooO00o.compareAndSet(false, true)) {
            try {
                this.f124718OooO0O0.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        OooO0O0();
                        break;
                    } finally {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Platform.f124683OooO00o.getClass();
                    Platform.f124684OooO0O0.getClass();
                    Platform.OooO("Failed to read public suffix list", 5, e);
                    if (z) {
                    }
                }
            }
        }
        if (this.f124719OooO0OO == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = listOooO0OO.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str2 = (String) listOooO0OO.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            OooOOO0.OooO0o(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            OooOOO0.OooO0o(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                strOooO00o = null;
                break;
            }
            int i3 = i2 + 1;
            Companion companion = f124714OooO0o0;
            byte[] bArr2 = this.f124719OooO0OO;
            if (bArr2 == null) {
                OooOOO0.OooOOOO("publicSuffixListBytes");
                throw null;
            }
            strOooO00o = Companion.OooO00o(companion, bArr2, bArr, i2);
            if (strOooO00o != null) {
                break;
            }
            i2 = i3;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4 + 1;
                bArr3[i4] = f124713OooO0o;
                Companion companion2 = f124714OooO0o0;
                byte[] bArr4 = this.f124719OooO0OO;
                if (bArr4 == null) {
                    OooOOO0.OooOOOO("publicSuffixListBytes");
                    throw null;
                }
                strOooO00o2 = Companion.OooO00o(companion2, bArr4, bArr3, i4);
                if (strOooO00o2 != null) {
                    break;
                }
                i4 = i5;
            }
            strOooO00o2 = null;
        } else {
            strOooO00o2 = null;
        }
        if (strOooO00o2 != null) {
            int i6 = size - 1;
            int i7 = 0;
            while (i7 < i6) {
                int i8 = i7 + 1;
                Companion companion3 = f124714OooO0o0;
                byte[] bArr5 = this.f124720OooO0Oo;
                if (bArr5 == null) {
                    OooOOO0.OooOOOO("publicSuffixExceptionListBytes");
                    throw null;
                }
                strOooO00o3 = Companion.OooO00o(companion3, bArr5, bArr, i7);
                if (strOooO00o3 != null) {
                    break;
                }
                i7 = i8;
            }
            strOooO00o3 = null;
        } else {
            strOooO00o3 = null;
        }
        if (strOooO00o3 != null) {
            listO000oOoO = C33599OooOo0O.o000oOoO(OooOOO0.OooOOO0(strOooO00o3, "!"), new char[]{FilenameUtils.EXTENSION_SEPARATOR});
        } else if (strOooO00o == null && strOooO00o2 == null) {
            listO000oOoO = f124715OooO0oO;
        } else {
            List<String> listO000oOoO2 = strOooO00o == null ? null : C33599OooOo0O.o000oOoO(strOooO00o, new char[]{FilenameUtils.EXTENSION_SEPARATOR});
            List<String> list = C34434OooOoO.f123453OooOo0o;
            if (listO000oOoO2 == null) {
                listO000oOoO2 = list;
            }
            List<String> listO000oOoO3 = strOooO00o2 == null ? null : C33599OooOo0O.o000oOoO(strOooO00o2, new char[]{FilenameUtils.EXTENSION_SEPARATOR});
            if (listO000oOoO3 != null) {
                list = listO000oOoO3;
            }
            listO000oOoO = listO000oOoO2.size() > list.size() ? listO000oOoO2 : list;
        }
        if (listOooO0OO.size() != listO000oOoO.size() || listO000oOoO.get(0).charAt(0) == '!') {
            return C33576OooOOOo.OooOOo0(C33576OooOOOo.OooOO0o(oOo000Oo.OooOo.OooOooo(OooO0OO(str)), listO000oOoO.get(0).charAt(0) == '!' ? listOooO0OO.size() - listO000oOoO.size() : listOooO0OO.size() - (listO000oOoO.size() + 1)), ".");
        }
        return null;
    }

    public final void OooO0O0() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(com.huawei.hms.network.okhttp.PublicSuffixDatabase.f56868e);
        if (resourceAsStream == null) {
            return;
        }
        C34542OooOo0O c34542OooOo0OOooO0O0 = C34535OooOOOo.OooO0O0(new C34533OooOOO0(C34535OooOOOo.OooO0o(resourceAsStream)));
        try {
            byte[] bArrO0000oo = c34542OooOo0OOooO0O0.o0000oo(c34542OooOo0OOooO0O0.readInt());
            byte[] bArrO0000oo2 = c34542OooOo0OOooO0O0.o0000oo(c34542OooOo0OOooO0O0.readInt());
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c34542OooOo0OOooO0O0.close();
            synchronized (this) {
                this.f124719OooO0OO = bArrO0000oo;
                this.f124720OooO0Oo = bArrO0000oo2;
            }
            this.f124718OooO0O0.countDown();
        } finally {
        }
    }
}
