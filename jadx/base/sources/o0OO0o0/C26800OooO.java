package o0OO0o0;

import Oooo0.C20855OooooOO;
import android.net.Uri;
import android.os.SystemClock;
import com.google.gson.Gson;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import com.orion.notein.data.repo.cloudsync.onedrive.OneDriveApiService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;
import oOo00OoO.InterfaceC34526OooO0o0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import ooooOOo0.C35219OooOO0O;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OO0o0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26800OooO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Gson f92718OooO0o0 = new Gson();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OneDriveApiService f92719OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33898OooO0Oo f92720OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0OO f92721OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f92722OooO0Oo;

    /* JADX INFO: renamed from: o0OO0o0.OooO$OooO00o */
    public static final class OooO00o extends RequestBody {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final File f92723OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC32510OooOOo0<Long, Long, Integer, C32460OooOooO> f92724OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(File file, InterfaceC32510OooOOo0<? super Long, ? super Long, ? super Integer, C32460OooOooO> interfaceC32510OooOOo0) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(file, "file");
            this.f92723OooO00o = file;
            this.f92724OooO0O0 = interfaceC32510OooOOo0;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return this.f92723OooO00o.length();
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getF124162OooO0OO() {
            return null;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(InterfaceC34526OooO0o0 sink) throws IOException {
            kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
            File file = this.f92723OooO00o;
            long length = file.length();
            long j = 0;
            Long lValueOf = Long.valueOf(length);
            InterfaceC32510OooOOo0<Long, Long, Integer, C32460OooOooO> interfaceC32510OooOOo0 = this.f92724OooO0O0;
            interfaceC32510OooOOo0.invoke(0L, lValueOf, 0);
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    sink.o000O0o0(0, i2, bArr);
                    j += (long) i2;
                    int i3 = (((int) ((((long) 100) * j) / length)) / 20) * 20;
                    if (i3 > i) {
                        interfaceC32510OooOOo0.invoke(Long.valueOf(j), Long.valueOf(length), Integer.valueOf(i3));
                        i = i3;
                    }
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                fileInputStream.close();
                if (i < 100) {
                    interfaceC32510OooOOo0.invoke(Long.valueOf(j), Long.valueOf(length), 100);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    oO0O000.OooO00o.OooO00o(fileInputStream, th);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o0OO0o0.OooO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C33898OooO0Oo f92725OooO00o = C33900OooO0o0.OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f92726OooO0O0;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
            C26810OooOO0 c26810OooOO0;
            InterfaceC33895OooO00o interfaceC33895OooO00o;
            OooO0O0 oooO0O0;
            InterfaceC33895OooO00o interfaceC33895OooO00o2;
            Throwable th;
            OooO0O0 oooO0O02;
            if (abstractC32479OooO0OO instanceof C26810OooOO0) {
                c26810OooOO0 = (C26810OooOO0) abstractC32479OooO0OO;
                int i = c26810OooOO0.f92766OooOoOO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c26810OooOO0.f92766OooOoOO = i - Integer.MIN_VALUE;
                } else {
                    c26810OooOO0 = new C26810OooOO0(this, abstractC32479OooO0OO);
                }
            }
            Object obj = c26810OooOO0.f92765OooOoO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c26810OooOO0.f92766OooOoOO;
            try {
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    c26810OooOO0.f92763OooOo0o = this;
                    interfaceC33895OooO00o = this.f92725OooO00o;
                    c26810OooOO0.f92762OooOo = interfaceC33895OooO00o;
                    c26810OooOO0.f92766OooOoOO = 1;
                    if (interfaceC33895OooO00o.OooO00o(c26810OooOO0) != enumC32485OooO00o) {
                        oooO0O0 = this;
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33895OooO00o2 = c26810OooOO0.f92762OooOo;
                    oooO0O02 = c26810OooOO0.f92763OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        oooO0O0 = oooO0O02;
                        oooO0O0.f92726OooO0O0 = Math.max(SystemClock.elapsedRealtime(), oooO0O0.f92726OooO0O0 + 1000);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        return C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                }
                InterfaceC33895OooO00o interfaceC33895OooO00o3 = c26810OooOO0.f92762OooOo;
                oooO0O0 = c26810OooOO0.f92763OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o = interfaceC33895OooO00o3;
                oooO0O0.getClass();
                long jElapsedRealtime = (oooO0O0.f92726OooO0O0 + 1000) - SystemClock.elapsedRealtime();
                if (jElapsedRealtime <= 0) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    oooO0O0.f92726OooO0O0 = Math.max(SystemClock.elapsedRealtime(), oooO0O0.f92726OooO0O0 + 1000);
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                }
                c26810OooOO0.f92763OooOo0o = oooO0O0;
                c26810OooOO0.f92762OooOo = interfaceC33895OooO00o;
                c26810OooOO0.f92766OooOoOO = 2;
                if (C33644OoooO0.OooO00o(jElapsedRealtime, c26810OooOO0) != enumC32485OooO00o) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    oooO0O02 = oooO0O0;
                    oooO0O0 = oooO0O02;
                    oooO0O0.f92726OooO0O0 = Math.max(SystemClock.elapsedRealtime(), oooO0O0.f92726OooO0O0 + 1000);
                    C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            } catch (Throwable th3) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                th = th3;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o0OO0o0.OooO$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f92727OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f92728OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f92729OooO0OO;

        public OooO0OO(String accessToken, String driveId) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(accessToken, "accessToken");
            kotlin.jvm.internal.OooOOO0.OooO0oO(driveId, "driveId");
            this.f92727OooO00o = accessToken;
            this.f92728OooO0O0 = driveId;
            this.f92729OooO0OO = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Bearer ", accessToken);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f92727OooO00o, oooO0OO.f92727OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f92728OooO0O0, oooO0OO.f92728OooO0O0);
        }

        public final int hashCode() {
            return this.f92728OooO0O0.hashCode() + (this.f92727OooO00o.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Session(accessToken=");
            sb.append(this.f92727OooO00o);
            sb.append(", driveId=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f92728OooO0O0, ")");
        }
    }

    /* JADX INFO: renamed from: o0OO0o0.OooO$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService", m80623f = "OneDriveCloudService.kt", m80624l = {731}, m80625m = "requireSession")
    public static final class C26801OooO0Oo extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public C33898OooO0Oo f92730OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C26800OooO f92731OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f92733OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f92734OooOoOO;

        public C26801OooO0Oo(Continuation<? super C26801OooO0Oo> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f92733OooOoO0 = obj;
            this.f92734OooOoOO |= Integer.MIN_VALUE;
            Gson gson = C26800OooO.f92718OooO0o0;
            return C26800OooO.this.OooO0o0(this);
        }
    }

    public C26800OooO(OneDriveApiService oneDriveApiService) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oneDriveApiService, "oneDriveApiService");
        this.f92719OooO00o = oneDriveApiService;
        this.f92720OooO0O0 = C33900OooO0o0.OooO00o();
        this.f92722OooO0Oo = new OooO0O0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:38|39|69|40|41|42|(2:53|(1:71))(1:57)|56|58|21|(1:(1:73)(2:61|62))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:65|23|24|67|25|(1:72)(5:28|29|(11:38|39|69|40|41|42|(2:53|(1:71))(1:57)|56|58|21|(1:(1:73)(2:61|62))(0))|45|55)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fe, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        r20 = r13;
        r13 = r11;
        r10 = r20;
        r14 = r2;
        r2 = r4;
        r4 = r12;
        r12 = r1;
        r1 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Exception, okhttp3.MediaType] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x014d -> B:56:0x0150). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x015a -> B:56:0x0150). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C26800OooO c26800OooO, String str, byte[] bArr, String str2, long j, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C26834Oooo00O c26834Oooo00O;
        C26800OooO c26800OooO2;
        String str3;
        String str4;
        long j2;
        C26834Oooo00O c26834Oooo00O2;
        int i;
        Exception exc;
        byte[] bArr2;
        C26800OooO c26800OooO3;
        String str5;
        byte[] bArr3;
        long j3;
        String str6;
        int i2;
        int i3;
        String str7;
        String str8;
        Exception exc2;
        byte[] bArr4;
        long j4;
        C26800OooO c26800OooO4;
        C35238OooOoO c35238OooOoO;
        Response response;
        int i4;
        C26834Oooo00O c26834Oooo00O3;
        int i5;
        c26800OooO.getClass();
        if (abstractC32479OooO0OO instanceof C26834Oooo00O) {
            c26834Oooo00O = (C26834Oooo00O) abstractC32479OooO0OO;
            int i6 = c26834Oooo00O.f92900Oooo000;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c26834Oooo00O.f92900Oooo000 = i6 - Integer.MIN_VALUE;
                c26800OooO2 = c26800OooO;
            } else {
                c26800OooO2 = c26800OooO;
                c26834Oooo00O = new C26834Oooo00O(c26800OooO2, abstractC32479OooO0OO);
            }
        }
        Object objUploadFileChunk = c26834Oooo00O.f92898OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i7 = c26834Oooo00O.f92900Oooo000;
        int i8 = 0;
        ?? r6 = 0;
        int i9 = 1;
        if (i7 == 0) {
            C32446OooOOOo.OooO0O0(objUploadFileChunk);
            str3 = str;
            str4 = str2;
            j2 = j;
            c26834Oooo00O2 = c26834Oooo00O;
            i = 0;
            exc = null;
            bArr2 = bArr;
            if (i < 3) {
            }
        } else {
            if (i7 == 1) {
                i2 = c26834Oooo00O.f92896OooOoo;
                j3 = c26834Oooo00O.f92897OooOoo0;
                str6 = c26834Oooo00O.f92893OooOoO;
                bArr3 = c26834Oooo00O.f92894OooOoO0;
                str5 = c26834Oooo00O.f92891OooOo;
                c26800OooO3 = c26834Oooo00O.f92892OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objUploadFileChunk);
                } catch (IOException e) {
                    e = e;
                    i3 = i9;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("OneDriveCloudService");
                    c20358OooO00o.OooOO0o(e, Oooo0oO.o0Oo0oo.OooO0O0(i2 + 1, "Chunk upload attempt ", " failed with IOException, retrying..."), new Object[0]);
                    str7 = str5;
                    str8 = str6;
                    exc2 = e;
                    C26800OooO c26800OooO5 = c26800OooO3;
                    bArr4 = bArr3;
                    j4 = j3;
                    c26800OooO4 = c26800OooO5;
                    if (i2 < 2) {
                    }
                    exc = exc2;
                    c26834Oooo00O2 = c26834Oooo00O;
                    bArr2 = bArr4;
                    str4 = str8;
                    j2 = j4;
                    str3 = str7;
                    C26800OooO c26800OooO6 = c26800OooO4;
                    i = i2 + 1;
                    c26800OooO2 = c26800OooO6;
                    i9 = i3;
                    i8 = 0;
                    r6 = 0;
                    if (i < 3) {
                    }
                }
                c35238OooOoO = (C35238OooOoO) objUploadFileChunk;
                response = c35238OooOoO.f126541OooO00o;
                i4 = response.f124259OooOoO;
                if (!response.OooO0OO()) {
                    C35219OooOO0O c35219OooOO0O = new C35219OooOO0O(c35238OooOoO);
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("OneDriveCloudService");
                    i3 = i9;
                    c20358OooO00o2.OooOO0O("Chunk upload attempt " + (i2 + 1) + " failed with HTTP " + i4 + ", retrying...", new Object[0]);
                    String str9 = str5;
                    str8 = str6;
                    exc2 = c35219OooOO0O;
                    str7 = str9;
                    C26800OooO c26800OooO52 = c26800OooO3;
                    bArr4 = bArr3;
                    j4 = j3;
                    c26800OooO4 = c26800OooO52;
                    if (i2 < 2) {
                    }
                    exc = exc2;
                    c26834Oooo00O2 = c26834Oooo00O;
                    bArr2 = bArr4;
                    str4 = str8;
                    j2 = j4;
                    str3 = str7;
                    C26800OooO c26800OooO62 = c26800OooO4;
                    i = i2 + 1;
                    c26800OooO2 = c26800OooO62;
                    i9 = i3;
                    i8 = 0;
                    r6 = 0;
                    if (i < 3) {
                    }
                }
                return c35238OooOoO;
            }
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c26834Oooo00O.f92896OooOoo;
            j4 = c26834Oooo00O.f92897OooOoo0;
            exc2 = c26834Oooo00O.f92895OooOoOO;
            str8 = c26834Oooo00O.f92893OooOoO;
            bArr4 = c26834Oooo00O.f92894OooOoO0;
            str7 = c26834Oooo00O.f92891OooOo;
            c26800OooO4 = c26834Oooo00O.f92892OooOo0o;
            C32446OooOOOo.OooO0O0(objUploadFileChunk);
            i3 = 1;
            exc = exc2;
            c26834Oooo00O2 = c26834Oooo00O;
            bArr2 = bArr4;
            str4 = str8;
            j2 = j4;
            str3 = str7;
            C26800OooO c26800OooO622 = c26800OooO4;
            i = i2 + 1;
            c26800OooO2 = c26800OooO622;
            i9 = i3;
            i8 = 0;
            r6 = 0;
            if (i < 3) {
                try {
                } catch (IOException e2) {
                    e = e2;
                    c26834Oooo00O3 = c26834Oooo00O2;
                    i3 = i9;
                    i5 = i;
                }
                RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2OooO0OO = RequestBody.Companion.OooO0OO(RequestBody.INSTANCE, r6, bArr2, i8, 12);
                OneDriveApiService oneDriveApiService = c26800OooO2.f92719OooO00o;
                c26834Oooo00O2.f92892OooOo0o = c26800OooO2;
                c26834Oooo00O2.f92891OooOo = str3;
                c26834Oooo00O2.f92894OooOoO0 = bArr2;
                c26834Oooo00O2.f92893OooOoO = str4;
                c26834Oooo00O2.f92895OooOoOO = r6;
                c26834Oooo00O2.f92897OooOoo0 = j2;
                c26834Oooo00O2.f92896OooOoo = i;
                c26834Oooo00O2.f92900Oooo000 = i9;
                c26834Oooo00O3 = c26834Oooo00O2;
                i5 = i;
                objUploadFileChunk = oneDriveApiService.uploadFileChunk(str3, str4, j2, requestBody$Companion$toRequestBody$2OooO0OO, c26834Oooo00O3);
                if (objUploadFileChunk == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                long j5 = j2;
                str5 = str3;
                j3 = j5;
                c26800OooO3 = c26800OooO2;
                i2 = i5;
                str6 = str4;
                bArr3 = bArr2;
                c26834Oooo00O = c26834Oooo00O3;
                c35238OooOoO = (C35238OooOoO) objUploadFileChunk;
                response = c35238OooOoO.f126541OooO00o;
                i4 = response.f124259OooOoO;
                if (!response.OooO0OO() && (400 > i4 || i4 >= 500 || i4 == 429)) {
                    C35219OooOO0O c35219OooOO0O2 = new C35219OooOO0O(c35238OooOoO);
                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22.OooOOO0("OneDriveCloudService");
                    i3 = i9;
                    c20358OooO00o22.OooOO0O("Chunk upload attempt " + (i2 + 1) + " failed with HTTP " + i4 + ", retrying...", new Object[0]);
                    String str92 = str5;
                    str8 = str6;
                    exc2 = c35219OooOO0O2;
                    str7 = str92;
                    C26800OooO c26800OooO522 = c26800OooO3;
                    bArr4 = bArr3;
                    j4 = j3;
                    c26800OooO4 = c26800OooO522;
                    if (i2 < 2) {
                        c26834Oooo00O.f92892OooOo0o = c26800OooO4;
                        c26834Oooo00O.f92891OooOo = str7;
                        c26834Oooo00O.f92894OooOoO0 = bArr4;
                        c26834Oooo00O.f92893OooOoO = str8;
                        c26834Oooo00O.f92895OooOoOO = exc2;
                        c26834Oooo00O.f92897OooOoo0 = j4;
                        c26834Oooo00O.f92896OooOoo = i2;
                        c26834Oooo00O.f92900Oooo000 = 2;
                        if (C33644OoooO0.OooO00o((1 << i2) * 1000, c26834Oooo00O) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                    exc = exc2;
                    c26834Oooo00O2 = c26834Oooo00O;
                    bArr2 = bArr4;
                    str4 = str8;
                    j2 = j4;
                    str3 = str7;
                    C26800OooO c26800OooO6222 = c26800OooO4;
                    i = i2 + 1;
                    c26800OooO2 = c26800OooO6222;
                    i9 = i3;
                    i8 = 0;
                    r6 = 0;
                    if (i < 3) {
                        if (exc != null) {
                            throw exc;
                        }
                        throw new IOException("Chunk upload failed after 3 attempts");
                    }
                }
                return c35238OooOoO;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C26800OooO c26800OooO, String str, File file, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26835Oooo00o c26835Oooo00o;
        c26800OooO.getClass();
        if (abstractC32479OooO0OO instanceof C26835Oooo00o) {
            c26835Oooo00o = (C26835Oooo00o) abstractC32479OooO0OO;
            int i = c26835Oooo00o.f92903OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26835Oooo00o.f92903OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26835Oooo00o = new C26835Oooo00o(c26800OooO, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26835Oooo00o.f92902OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26835Oooo00o.f92903OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            Oooo0 oooo0 = new Oooo0(file, str2, c26800OooO, str, null);
            c26835Oooo00o.f92903OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooo0, c26835Oooo00o);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26815OooOOOO c26815OooOOOO;
        C33898OooO0Oo c33898OooO0Oo;
        C26800OooO c26800OooO;
        if (abstractC32479OooO0OO instanceof C26815OooOOOO) {
            c26815OooOOOO = (C26815OooOOOO) abstractC32479OooO0OO;
            int i = c26815OooOOOO.f92796OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26815OooOOOO.f92796OooOoo = i - Integer.MIN_VALUE;
            } else {
                c26815OooOOOO = new C26815OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26815OooOOOO.f92795OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26815OooOOOO.f92796OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26815OooOOOO.f92792OooOo0o = this;
            c26815OooOOOO.f92791OooOo = str;
            c26815OooOOOO.f92794OooOoO0 = str2;
            c33898OooO0Oo = this.f92720OooO0O0;
            c26815OooOOOO.f92793OooOoO = c33898OooO0Oo;
            c26815OooOOOO.f92796OooOoo = 1;
            if (c33898OooO0Oo.OooO00o(c26815OooOOOO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26800OooO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C33898OooO0Oo c33898OooO0Oo2 = c26815OooOOOO.f92793OooOoO;
            str2 = c26815OooOOOO.f92794OooOoO0;
            String str3 = c26815OooOOOO.f92791OooOo;
            c26800OooO = c26815OooOOOO.f92792OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c33898OooO0Oo = c33898OooO0Oo2;
            str = str3;
        }
        try {
            OooO0OO oooO0OO = c26800OooO.f92721OooO0OO;
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0OO != null ? oooO0OO.f92727OooO00o : null, str) || !kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0OO.f92728OooO0O0, str2)) {
                c26800OooO.f92721OooO0OO = new OooO0OO(str, str2);
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            c33898OooO0Oo.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Path cross not found for [B:27:0x00af, B:30:0x00ba], limit reached: 39 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0083 -> B:25:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26821OooOo0 c26821OooOo0;
        String str2;
        Object objOooO0o0;
        C26800OooO c26800OooO;
        String str3;
        String str4;
        C26800OooO c26800OooO2;
        OooO0OO oooO0OO;
        int i;
        Object fileChanges;
        Uri uri;
        Uri uri2;
        if (abstractC32479OooO0OO instanceof C26821OooOo0) {
            c26821OooOo0 = (C26821OooOo0) abstractC32479OooO0OO;
            int i2 = c26821OooOo0.f92821OooOoo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c26821OooOo0.f92821OooOoo = i2 - Integer.MIN_VALUE;
            } else {
                c26821OooOo0 = new C26821OooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26821OooOo0.f92820OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c26821OooOo0.f92821OooOoo;
        int i4 = 2;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26821OooOo0.f92817OooOo0o = this;
            str2 = str;
            c26821OooOo0.f92816OooOo = str2;
            c26821OooOo0.f92821OooOoo = 1;
            objOooO0o0 = OooO0o0(c26821OooOo0);
            if (objOooO0o0 != enumC32485OooO00o) {
                c26800OooO = this;
            }
            return enumC32485OooO00o;
        }
        if (i3 == 1) {
            String str5 = c26821OooOo0.f92816OooOo;
            c26800OooO = c26821OooOo0.f92817OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o0 = obj;
            str2 = str5;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c26821OooOo0.f92818OooOoO;
            oooO0OO = c26821OooOo0.f92819OooOoO0;
            String str6 = c26821OooOo0.f92816OooOo;
            C26800OooO c26800OooO3 = c26821OooOo0.f92817OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str3 = str6;
            C26803OooO0O0 c26803OooO0O0 = (C26803OooO0O0) obj;
            i++;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("OneDriveCloudService");
            c20358OooO00o.OooO00o(C20855OooooOO.OooO0OO(i, c26803OooO0O0.OooO0OO().size(), "fetchStartCursorUnsafe: page ", ", items="), new Object[0]);
            String odataNextLink = c26803OooO0O0.getOdataNextLink();
            String queryParameter = (odataNextLink != null || (uri2 = Uri.parse(odataNextLink)) == null) ? null : uri2.getQueryParameter(ResponseType.TOKEN);
            if (queryParameter == null) {
                str4 = queryParameter;
                c26800OooO2 = c26800OooO3;
                i4 = 2;
                OneDriveApiService oneDriveApiService = c26800OooO2.f92719OooO00o;
                String str7 = oooO0OO.f92729OooO0OO;
                c26821OooOo0.f92817OooOo0o = c26800OooO2;
                c26821OooOo0.f92816OooOo = str3;
                c26821OooOo0.f92819OooOoO0 = oooO0OO;
                c26821OooOo0.f92818OooOoO = i;
                c26821OooOo0.f92821OooOoo = i4;
                C26821OooOo0 c26821OooOo02 = c26821OooOo0;
                fileChanges = oneDriveApiService.getFileChanges(str7, oooO0OO.f92728OooO0O0, str3, str4, 200, c26821OooOo02);
                if (fileChanges != enumC32485OooO00o) {
                    c26800OooO3 = c26800OooO2;
                    obj = fileChanges;
                    c26821OooOo0 = c26821OooOo02;
                    C26803OooO0O0 c26803OooO0O02 = (C26803OooO0O0) obj;
                    i++;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("OneDriveCloudService");
                    c20358OooO00o2.OooO00o(C20855OooooOO.OooO0OO(i, c26803OooO0O02.OooO0OO().size(), "fetchStartCursorUnsafe: page ", ", items="), new Object[0]);
                    String odataNextLink2 = c26803OooO0O02.getOdataNextLink();
                    if (odataNextLink2 != null) {
                    }
                    if (queryParameter == null) {
                        c20358OooO00o2.OooOOO0("OneDriveCloudService");
                        c20358OooO00o2.OooO0o0("fetchStartCursorUnsafe: completed after " + i + " pages", new Object[0]);
                        String odataDeltaLink = c26803OooO0O02.getOdataDeltaLink();
                        if (odataDeltaLink == null || (uri = Uri.parse(odataDeltaLink)) == null) {
                            return null;
                        }
                        return uri.getQueryParameter(ResponseType.TOKEN);
                    }
                }
                return enumC32485OooO00o;
            }
        }
        str3 = str2;
        str4 = null;
        c26800OooO2 = c26800OooO;
        oooO0OO = (OooO0OO) objOooO0o0;
        i = 0;
        OneDriveApiService oneDriveApiService2 = c26800OooO2.f92719OooO00o;
        String str72 = oooO0OO.f92729OooO0OO;
        c26821OooOo0.f92817OooOo0o = c26800OooO2;
        c26821OooOo0.f92816OooOo = str3;
        c26821OooOo0.f92819OooOoO0 = oooO0OO;
        c26821OooOo0.f92818OooOoO = i;
        c26821OooOo0.f92821OooOoo = i4;
        C26821OooOo0 c26821OooOo022 = c26821OooOo0;
        fileChanges = oneDriveApiService2.getFileChanges(str72, oooO0OO.f92728OooO0O0, str3, str4, 200, c26821OooOo022);
        if (fileChanges != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26820OooOo c26820OooOo;
        C26800OooO c26800OooO;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof C26820OooOo) {
            c26820OooOo = (C26820OooOo) abstractC32479OooO0OO;
            int i = c26820OooOo.f92815OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26820OooOo.f92815OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26820OooOo = new C26820OooOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26820OooOo.f92814OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26820OooOo.f92815OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26820OooOo.f92812OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f92720OooO0O0;
            c26820OooOo.f92811OooOo = c33898OooO0Oo2;
            c26820OooOo.f92815OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(c26820OooOo) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26800OooO = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c26820OooOo.f92811OooOo;
            c26800OooO = c26820OooOo.f92812OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            c26800OooO.f92721OooO0OO = null;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            c33898OooO0Oo.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(Continuation<? super OooO0OO> continuation) {
        C26801OooO0Oo c26801OooO0Oo;
        C26800OooO c26800OooO;
        C33898OooO0Oo c33898OooO0Oo;
        if (continuation instanceof C26801OooO0Oo) {
            c26801OooO0Oo = (C26801OooO0Oo) continuation;
            int i = c26801OooO0Oo.f92734OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26801OooO0Oo.f92734OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26801OooO0Oo = new C26801OooO0Oo(continuation);
            }
        }
        Object obj = c26801OooO0Oo.f92733OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26801OooO0Oo.f92734OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26801OooO0Oo.f92731OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f92720OooO0O0;
            c26801OooO0Oo.f92730OooOo = c33898OooO0Oo2;
            c26801OooO0Oo.f92734OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(c26801OooO0Oo) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26800OooO = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c26801OooO0Oo.f92730OooOo;
            c26800OooO = c26801OooO0Oo.f92731OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            OooO0OO oooO0OO = c26800OooO.f92721OooO0OO;
            if (oooO0OO != null) {
                return oooO0OO;
            }
            throw new IllegalStateException("OneDrive session not initialized");
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }
}
