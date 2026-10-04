package o0OO0o0;

import com.microsoft.identity.common.internal.net.cache.HttpCache;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24033OooOooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import okhttp3.ResponseBody;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$uploadFileViaSession$2", m80623f = "OneDriveCloudService.kt", m80624l = {569}, m80625m = "invokeSuspend")
public final class Oooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C26804OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f92867OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f92868OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public kotlin.jvm.internal.Oooo000 f92869OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f92870OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C24033OooOooo f92871OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f92872OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Closeable f92873OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C26800OooO f92874OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public String f92875OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final /* synthetic */ String f92876Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public FileInputStream f92877Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f92878Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ File f92879Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92880Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final /* synthetic */ String f92881Oooo0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(File file, String str, C26800OooO c26800OooO, String str2, Continuation<? super Oooo0> continuation) {
        super(2, continuation);
        this.f92879Oooo00o = file;
        this.f92876Oooo0 = str;
        this.f92880Oooo0O0 = c26800OooO;
        this.f92881Oooo0OO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new Oooo0(this.f92879Oooo00o, this.f92876Oooo0, this.f92880Oooo0O0, this.f92881Oooo0OO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C26804OooO0OO> continuation) {
        return ((Oooo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016a A[Catch: all -> 0x0193, TryCatch #2 {all -> 0x0193, blocks: (B:37:0x0161, B:38:0x0167, B:39:0x016a, B:40:0x0192, B:43:0x0198, B:33:0x014f, B:55:0x0210, B:56:0x0239, B:57:0x023a, B:44:0x01cc, B:46:0x01d2, B:48:0x01d8, B:51:0x01f5, B:52:0x020b), top: B:72:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198 A[Catch: all -> 0x0193, TryCatch #2 {all -> 0x0193, blocks: (B:37:0x0161, B:38:0x0167, B:39:0x016a, B:40:0x0192, B:43:0x0198, B:33:0x014f, B:55:0x0210, B:56:0x0239, B:57:0x023a, B:44:0x01cc, B:46:0x01d2, B:48:0x01d8, B:51:0x01f5, B:52:0x020b), top: B:72:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cc A[Catch: all -> 0x0193, TryCatch #2 {all -> 0x0193, blocks: (B:37:0x0161, B:38:0x0167, B:39:0x016a, B:40:0x0192, B:43:0x0198, B:33:0x014f, B:55:0x0210, B:56:0x0239, B:57:0x023a, B:44:0x01cc, B:46:0x01d2, B:48:0x01d8, B:51:0x01f5, B:52:0x020b), top: B:72:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023a A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #2 {all -> 0x0193, blocks: (B:37:0x0161, B:38:0x0167, B:39:0x016a, B:40:0x0192, B:43:0x0198, B:33:0x014f, B:55:0x0210, B:56:0x0239, B:57:0x023a, B:44:0x01cc, B:46:0x01d2, B:48:0x01d8, B:51:0x01f5, B:52:0x020b), top: B:72:0x0161 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0158 -> B:72:0x0161). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        long j;
        C26800OooO c26800OooO;
        long j2;
        kotlin.jvm.internal.Oooo000 oooo000;
        C24033OooOooo c24033OooOooo;
        EnumC32485OooO00o enumC32485OooO00o;
        String str;
        String str2;
        String str3;
        FileInputStream fileInputStream;
        int i2;
        Closeable closeable;
        Throwable th;
        Throwable th2;
        Throwable th3;
        long j3;
        byte[] bArr;
        String strString;
        Oooo0 oooo0 = this;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooo0.f92878Oooo00O;
        String str4 = oooo0.f92876Oooo0;
        if (i3 == 0) {
            i = 1;
            j = HttpCache.DEFAULT_HTTP_CACHE_CAPACITY_BYTES;
            C32446OooOOOo.OooO0O0(obj);
            File file = oooo0.f92879Oooo00o;
            long length = file.length();
            if (length <= 0) {
                throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Cannot upload empty file via session: ", str4).toString());
            }
            int i4 = (int) ((10485759 + length) / HttpCache.DEFAULT_HTTP_CACHE_CAPACITY_BYTES);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("OneDriveCloudService");
            c20358OooO00o.OooO0o0("Starting chunked upload for %s: %d bytes, %d chunks", str4, new Long(length), new Integer(i4));
            kotlin.jvm.internal.Oooo000 oooo0002 = new kotlin.jvm.internal.Oooo000();
            C24033OooOooo c24033OooOooo2 = new C24033OooOooo();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            c26800OooO = oooo0.f92880Oooo0O0;
            j2 = length;
            oooo000 = oooo0002;
            c24033OooOooo = c24033OooOooo2;
            enumC32485OooO00o = enumC32485OooO00o2;
            str = " of ";
            str2 = oooo0.f92881Oooo0OO;
            str3 = str4;
            fileInputStream = fileInputStream2;
            i2 = i4;
            closeable = fileInputStream;
            j3 = oooo000.f80941OooOo0o;
            if (j3 < j2) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = oooo0.f92870OooOoO0;
            int i6 = oooo0.f92867OooOo;
            long j4 = oooo0.f92868OooOo0o;
            FileInputStream fileInputStream3 = oooo0.f92877Oooo000;
            String str5 = oooo0.f92875OooOooo;
            C26800OooO c26800OooO2 = oooo0.f92874OooOooO;
            String str6 = oooo0.f92872OooOoo;
            i = 1;
            Closeable closeable2 = oooo0.f92873OooOoo0;
            j = HttpCache.DEFAULT_HTTP_CACHE_CAPACITY_BYTES;
            C24033OooOooo c24033OooOooo3 = oooo0.f92871OooOoOO;
            kotlin.jvm.internal.Oooo000 oooo0003 = oooo0.f92869OooOoO;
            try {
                C32446OooOOOo.OooO0O0(obj);
                str = " of ";
                C24033OooOooo c24033OooOooo4 = c24033OooOooo3;
                Closeable closeable3 = closeable2;
                i2 = i6;
                oooo000 = oooo0003;
                fileInputStream = fileInputStream3;
                str3 = str6;
                j2 = j4;
                EnumC32485OooO00o enumC32485OooO00o3 = enumC32485OooO00o2;
                Object objOooO00o = obj;
                try {
                    try {
                        C35238OooOoO c35238OooOoO = (C35238OooOoO) objOooO00o;
                        int i7 = c35238OooOoO.f126541OooO00o.f124259OooOoO;
                        switch (i7) {
                            case 200:
                            case 201:
                                ResponseBody responseBody = (ResponseBody) c35238OooOoO.f126542OooO0O0;
                                if (responseBody == null || (strString = responseBody.string()) == null) {
                                    throw new IllegalStateException("Final chunk response body is null for " + str3);
                                }
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0("OneDriveCloudService");
                                c20358OooO00o2.OooO0o0("Chunked upload completed for %s", str3);
                                C26804OooO0OO c26804OooO0OO = (C26804OooO0OO) C26800OooO.f92718OooO0o0.fromJson(strString, C26804OooO0OO.class);
                                oO0O000.OooO00o.OooO00o(closeable3, null);
                                return c26804OooO0OO;
                            case 202:
                                String str7 = str;
                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o3.OooOOO0("OneDriveCloudService");
                                enumC32485OooO00o = enumC32485OooO00o3;
                                C24033OooOooo c24033OooOooo5 = c24033OooOooo4;
                                c20358OooO00o3.OooO00o("Chunk %d/%d accepted for %s", new Integer(c24033OooOooo4.f80940OooOo0o), new Integer(i2), str3);
                                oooo000.f80941OooOo0o += (long) i5;
                                oooo0 = this;
                                str2 = str5;
                                closeable = closeable3;
                                c26800OooO = c26800OooO2;
                                c24033OooOooo = c24033OooOooo5;
                                str = str7;
                                break;
                            default:
                                throw new IOException("Unexpected response code " + i7 + " for chunk " + c24033OooOooo4.f80940OooOo0o + str + str3);
                        }
                        j3 = oooo000.f80941OooOo0o;
                        if (j3 < j2) {
                            String str8 = str2;
                            Closeable closeable4 = closeable;
                            long j5 = j;
                            try {
                                int iMin = (int) Math.min(j5, j2 - j3);
                                j = j5;
                                byte[] bArr2 = new byte[iMin];
                                int i8 = 0;
                                while (true) {
                                    if (i8 < iMin) {
                                        try {
                                            int i9 = fileInputStream.read(bArr2, i8, iMin - i8);
                                            bArr = bArr2;
                                            if (i9 != -1) {
                                                i8 += i9;
                                                bArr2 = bArr;
                                            }
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                            closeable2 = closeable4;
                                            th2 = th3;
                                            try {
                                                throw th2;
                                            } catch (Throwable th5) {
                                                oO0O000.OooO00o.OooO00o(closeable2, th2);
                                                throw th5;
                                            }
                                        }
                                    } else {
                                        bArr = bArr2;
                                    }
                                }
                                if (i8 < iMin) {
                                    throw new IOException("Unexpected EOF: read " + i8 + str + iMin + " bytes for " + str3);
                                }
                                long j6 = oooo000.f80941OooOo0o;
                                C26800OooO c26800OooO3 = c26800OooO;
                                kotlin.jvm.internal.Oooo000 oooo0004 = oooo000;
                                long j7 = iMin;
                                String str9 = "bytes " + j6 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + ((j6 + j7) - 1) + "/" + j2;
                                c24033OooOooo.f80940OooOo0o++;
                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o4.OooOOO0("OneDriveCloudService");
                                c20358OooO00o4.OooO0o0("Uploading chunk %d/%d for %s: %s", new Integer(c24033OooOooo.f80940OooOo0o), new Integer(i2), str3, str9);
                                oooo0.f92869OooOoO = oooo0004;
                                oooo0.f92871OooOoOO = c24033OooOooo;
                                oooo0.f92873OooOoo0 = closeable4;
                                oooo0.f92872OooOoo = str3;
                                oooo0.f92874OooOooO = c26800OooO3;
                                oooo0.f92875OooOooo = str8;
                                oooo0.f92877Oooo000 = fileInputStream;
                                oooo0.f92868OooOo0o = j2;
                                oooo0.f92867OooOo = i2;
                                oooo0.f92870OooOoO0 = iMin;
                                int i10 = i;
                                oooo0.f92878Oooo00O = i10;
                                i = i10;
                                byte[] bArr3 = bArr;
                                closeable3 = closeable4;
                                int i11 = i2;
                                String str10 = str3;
                                objOooO00o = C26800OooO.OooO00o(c26800OooO3, str8, bArr3, str9, j7, oooo0);
                                enumC32485OooO00o3 = enumC32485OooO00o;
                                if (objOooO00o == enumC32485OooO00o3) {
                                    return enumC32485OooO00o3;
                                }
                                str5 = str8;
                                str3 = str10;
                                c24033OooOooo4 = c24033OooOooo;
                                i2 = i11;
                                oooo000 = oooo0004;
                                c26800OooO2 = c26800OooO3;
                                i5 = iMin;
                                C35238OooOoO c35238OooOoO2 = (C35238OooOoO) objOooO00o;
                                int i72 = c35238OooOoO2.f126541OooO00o.f124259OooOoO;
                                switch (i72) {
                                }
                                j3 = oooo000.f80941OooOo0o;
                                if (j3 < j2) {
                                    Closeable closeable5 = closeable;
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    oO0O000.OooO00o.OooO00o(closeable5, null);
                                    throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Chunked upload ended without final response for ", str4));
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                closeable3 = closeable4;
                                th2 = th;
                                closeable2 = closeable3;
                                throw th2;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        th2 = th;
                        closeable2 = closeable3;
                        throw th2;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable3 = closeable;
                }
            } catch (Throwable th9) {
                th3 = th9;
                th2 = th3;
                throw th2;
            }
        }
    }
}
