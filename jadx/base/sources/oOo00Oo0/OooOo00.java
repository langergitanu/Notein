package oOo00Oo0;

import OoooOOo.C21197OooOO0O;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33662Ooooooo;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0OO.o000OOo;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33703OooOOO0;
import oO0o0OOo.InterfaceC33699OooOO0;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00OOo.C34354OooO0Oo;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<String> f123701OooO00o = C34429OooOOo0.OooOO0o("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33695OooO0o0 f123702OooO0O0 = C33703OooOOO0.OooO00o(1024, 6, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00000OO f123703OooO0OO;

    @InterfaceC32482OooO0o0(m80622c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", m80623f = "Nonce.kt", m80624l = {76}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public ArrayList f123704OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public InterfaceC33699OooOO0 f123705OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public SecureRandom f123706OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public SecureRandom f123707OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public byte[] f123708OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public List f123709OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public byte[] f123710OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public long f123711OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public int f123712OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public int f123713Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public int f123714Oooo00O;

        public OooO00o() {
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(2, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00c4 A[Catch: all -> 0x0034, LOOP:1: B:27:0x00c2->B:28:0x00c4, LOOP_END, TryCatch #1 {all -> 0x0034, blocks: (B:6:0x0024, B:55:0x019e, B:52:0x0178, B:56:0x01a2, B:58:0x01b1, B:26:0x00ba, B:28:0x00c4, B:29:0x00cc, B:31:0x00d8, B:33:0x00eb, B:35:0x00fd, B:36:0x011b, B:40:0x0133, B:43:0x013e, B:49:0x0148, B:50:0x015e, B:32:0x00e8), top: B:71:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d8 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:6:0x0024, B:55:0x019e, B:52:0x0178, B:56:0x01a2, B:58:0x01b1, B:26:0x00ba, B:28:0x00c4, B:29:0x00cc, B:31:0x00d8, B:33:0x00eb, B:35:0x00fd, B:36:0x011b, B:40:0x0133, B:43:0x013e, B:49:0x0148, B:50:0x015e, B:32:0x00e8), top: B:71:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e8 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:6:0x0024, B:55:0x019e, B:52:0x0178, B:56:0x01a2, B:58:0x01b1, B:26:0x00ba, B:28:0x00c4, B:29:0x00cc, B:31:0x00d8, B:33:0x00eb, B:35:0x00fd, B:36:0x011b, B:40:0x0133, B:43:0x013e, B:49:0x0148, B:50:0x015e, B:32:0x00e8), top: B:71:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00fd A[Catch: all -> 0x0034, LOOP:2: B:34:0x00fb->B:35:0x00fd, LOOP_END, TryCatch #1 {all -> 0x0034, blocks: (B:6:0x0024, B:55:0x019e, B:52:0x0178, B:56:0x01a2, B:58:0x01b1, B:26:0x00ba, B:28:0x00c4, B:29:0x00cc, B:31:0x00d8, B:33:0x00eb, B:35:0x00fd, B:36:0x011b, B:40:0x0133, B:43:0x013e, B:49:0x0148, B:50:0x015e, B:32:0x00e8), top: B:71:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0178 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:6:0x0024, B:55:0x019e, B:52:0x0178, B:56:0x01a2, B:58:0x01b1, B:26:0x00ba, B:28:0x00c4, B:29:0x00cc, B:31:0x00d8, B:33:0x00eb, B:35:0x00fd, B:36:0x011b, B:40:0x0133, B:43:0x013e, B:49:0x0148, B:50:0x015e, B:32:0x00e8), top: B:71:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01a2 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:6:0x0024, B:55:0x019e, B:52:0x0178, B:56:0x01a2, B:58:0x01b1, B:26:0x00ba, B:28:0x00c4, B:29:0x00cc, B:31:0x00d8, B:33:0x00eb, B:35:0x00fd, B:36:0x011b, B:40:0x0133, B:43:0x013e, B:49:0x0148, B:50:0x015e, B:32:0x00e8), top: B:71:0x0024 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x019b -> B:55:0x019e). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException {
            ArrayList arrayList;
            SecureRandom secureRandomOooO00o;
            SecureRandom secureRandom;
            byte[] bArr;
            byte[] bytes;
            long j;
            InterfaceC33699OooOO0 interfaceC33699OooOO0;
            int length;
            int i;
            long jCurrentTimeMillis;
            int length2;
            int i2;
            int i3;
            String str;
            int length3;
            ArrayList arrayList2;
            int i4;
            List list;
            int size;
            ArrayList arrayList3;
            int i5;
            int i6 = 16;
            int i7 = 1;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i8 = this.f123714Oooo00O;
            if (i8 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33695OooO0o0 c33695OooO0o0 = OooOo00.f123702OooO0O0;
                arrayList = new ArrayList();
                String property = System.getProperty("io.ktor.random.secure.random.provider");
                if (property == null || (secureRandomOooO00o = OooOo00.OooO00o(property)) == null) {
                    List<String> list2 = OooOo00.f123701OooO00o;
                    Iterator<String> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            SecureRandom secureRandomOooO00o2 = OooOo00.OooO00o(it.next());
                            if (secureRandomOooO00o2 != null) {
                                secureRandomOooO00o = secureRandomOooO00o2;
                                break;
                            }
                        } else {
                            C34354OooO0Oo.OooO0OO("io.ktor.util.random").OooOOoo("None of the " + oOo000Oo.OooOo.o000oOoO(list2, ", ", null, null, null, 62) + " found, fallback to default");
                            secureRandomOooO00o = OooOo00.OooO00o(null);
                            if (secureRandomOooO00o == null) {
                                throw new IllegalStateException("No SecureRandom implementation found");
                            }
                        }
                    }
                }
                secureRandom = SecureRandom.getInstance("SHA1PRNG");
                bArr = new byte[128];
                bytes = new byte[512];
                secureRandom.setSeed(secureRandomOooO00o.generateSeed(128));
                j = 0;
                interfaceC33699OooOO0 = c33695OooO0o0;
                secureRandomOooO00o.nextBytes(bArr);
                secureRandom.nextBytes(bytes);
                length = bArr.length;
                while (i < length) {
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - j <= 30000) {
                }
                char[] cArr = C34511OooOOOo.f123686OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(bytes, "bytes");
                char[] cArr2 = new char[bytes.length * 2];
                length2 = bytes.length;
                i2 = 0;
                int i9 = 0;
                while (i2 < length2) {
                }
                i3 = i7;
                str = new String(cArr2);
                C21197OooOO0O.OooO0O0(i6, i6);
                length3 = str.length();
                arrayList2 = new ArrayList((length3 / 16) + (length3 % 16 != 0 ? 0 : i3));
                i4 = 0;
                while (true) {
                    if (i4 >= 0) {
                        List listO0OOO0o = oOo000Oo.OooOo.o0OOO0o(oOo000Oo.OooOo.OooooOO(arrayList2, arrayList));
                        Collections.shuffle(listO0OOO0o, secureRandom);
                        list = listO0OOO0o;
                        size = ((ArrayList) listO0OOO0o).size() / 2;
                        arrayList3 = arrayList;
                        i5 = 0;
                        break;
                    }
                    int i10 = i4 + 16;
                    CharSequence it2 = str.subSequence(i4, (i10 >= 0 || i10 > length3) ? length3 : i10);
                    kotlin.jvm.internal.OooOOO0.OooO0oO(it2, "it");
                    arrayList2.add(it2.toString());
                    i4 = i10;
                }
                if (i5 >= size) {
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                size = this.f123713Oooo000;
                i5 = this.f123712OooOooo;
                long j2 = this.f123711OooOooO;
                list = this.f123709OooOoo;
                byte[] bArr2 = this.f123710OooOoo0;
                byte[] bArr3 = this.f123708OooOoOO;
                SecureRandom secureRandom2 = this.f123706OooOoO;
                SecureRandom secureRandom3 = this.f123707OooOoO0;
                ArrayList arrayList4 = this.f123704OooOo;
                interfaceC33699OooOO0 = this.f123705OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    bytes = bArr2;
                    bArr = bArr3;
                    int i11 = 1;
                    arrayList3 = arrayList4;
                    secureRandom = secureRandom2;
                    secureRandomOooO00o = secureRandom3;
                    j = j2;
                    i5 += i11;
                    i3 = i11;
                    if (i5 >= size) {
                        Object obj2 = list.get(i5);
                        this.f123705OooOo0o = interfaceC33699OooOO0;
                        this.f123704OooOo = arrayList3;
                        this.f123707OooOoO0 = secureRandomOooO00o;
                        this.f123706OooOoO = secureRandom;
                        this.f123708OooOoOO = bArr;
                        this.f123710OooOoo0 = bytes;
                        this.f123709OooOoo = list;
                        this.f123711OooOooO = j;
                        this.f123712OooOooo = i5;
                        this.f123713Oooo000 = size;
                        i11 = i3;
                        this.f123714Oooo00O = i11;
                        if (interfaceC33699OooOO0.OooOOO(obj2, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        i5 += i11;
                        i3 = i11;
                        if (i5 >= size) {
                            arrayList3.clear();
                            int size2 = list.size();
                            for (int size3 = list.size() / 2; size3 < size2; size3++) {
                                arrayList3.add(list.get(size3));
                            }
                            arrayList = arrayList3;
                            i7 = 1;
                            i6 = 16;
                            secureRandomOooO00o.nextBytes(bArr);
                            secureRandom.nextBytes(bytes);
                            length = bArr.length;
                            for (i = 0; i < length; i += i7) {
                                bytes[i * 4] = bArr[i];
                            }
                            jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - j <= 30000) {
                                secureRandom.setSeed(j - jCurrentTimeMillis);
                                secureRandom.setSeed(secureRandomOooO00o.generateSeed(bArr.length));
                                j = jCurrentTimeMillis;
                            } else {
                                secureRandom.setSeed(bArr);
                            }
                            char[] cArr3 = C34511OooOOOo.f123686OooO00o;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(bytes, "bytes");
                            char[] cArr22 = new char[bytes.length * 2];
                            length2 = bytes.length;
                            i2 = 0;
                            int i92 = 0;
                            while (i2 < length2) {
                                byte b = bytes[i2];
                                int i12 = i92 + 1;
                                char[] cArr4 = C34511OooOOOo.f123686OooO00o;
                                cArr22[i92] = cArr4[(b & 255) >> 4];
                                i92 += 2;
                                cArr22[i12] = cArr4[b & 15];
                                i2++;
                                i7 = i7;
                            }
                            i3 = i7;
                            str = new String(cArr22);
                            C21197OooOO0O.OooO0O0(i6, i6);
                            length3 = str.length();
                            arrayList2 = new ArrayList((length3 / 16) + (length3 % 16 != 0 ? 0 : i3));
                            i4 = 0;
                            while (true) {
                                if (i4 >= 0 || i4 >= length3) {
                                    List listO0OOO0o2 = oOo000Oo.OooOo.o0OOO0o(oOo000Oo.OooOo.OooooOO(arrayList2, arrayList));
                                    Collections.shuffle(listO0OOO0o2, secureRandom);
                                    list = listO0OOO0o2;
                                    size = ((ArrayList) listO0OOO0o2).size() / 2;
                                    arrayList3 = arrayList;
                                    i5 = 0;
                                    break;
                                }
                                int i102 = i4 + 16;
                                CharSequence it22 = str.subSequence(i4, (i102 >= 0 || i102 > length3) ? length3 : i102);
                                kotlin.jvm.internal.OooOOO0.OooO0oO(it22, "it");
                                arrayList2.add(it22.toString());
                                i4 = i102;
                            }
                            if (i5 >= size) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        interfaceC33699OooOO0.OooO0Oo(th);
                        interfaceC33699OooOO0.OooO0Oo(null);
                        return C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th2) {
                        interfaceC33699OooOO0.OooO0Oo(null);
                        throw th2;
                    }
                }
            }
        }
    }

    static {
        C33635Oooo00O c33635Oooo00O = new C33635Oooo00O("nonce-generator");
        C33662Ooooooo c33662Ooooooo = C33662Ooooooo.f121350OooOo0o;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        o000OOo o000ooo2 = o000OOo.f121371OooOo;
        executorC33873OooO0O0.getClass();
        f123703OooO0OO = C33609OooO0oo.OooO0O0(c33662Ooooooo, InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(executorC33873OooO0O0, o000ooo2).plus(c33635Oooo00O), EnumC33637Oooo0O0.f121316OooOo, new OooO00o(2, null));
    }

    public static final SecureRandom OooO00o(String str) {
        try {
            return str != null ? SecureRandom.getInstance(str) : new SecureRandom();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
