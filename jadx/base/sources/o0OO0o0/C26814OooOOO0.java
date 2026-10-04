package o0OO0o0;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.gson.Gson;
import com.orion.notein.data.repo.cloudsync.onedrive.OneDriveApiService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;
import o00o00oo.C25298OooO0o;
import o0OO0o0.C26800OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: o0OO0o0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$downloadFile$2", m80623f = "OneDriveCloudService.kt", m80624l = {135, 136, 139, 143}, m80625m = "invokeSuspend")
public final class C26814OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f92784OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26800OooO.OooO0OO f92785OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f92786OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92787OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f92788OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f92789OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ File f92790OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26814OooOOO0(C26800OooO c26800OooO, String str, String str2, File file, String str3, Continuation<? super C26814OooOOO0> continuation) {
        super(2, continuation);
        this.f92787OooOoO0 = c26800OooO;
        this.f92786OooOoO = str;
        this.f92788OooOoOO = str2;
        this.f92790OooOoo0 = file;
        this.f92789OooOoo = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26814OooOOO0(this.f92787OooOoO0, this.f92786OooOoO, this.f92788OooOoOO, this.f92790OooOoo0, this.f92789OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26814OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r0 == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r0 == r7) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:41:0x00ae, B:46:0x00b6, B:47:0x00ca, B:49:0x00d3, B:51:0x00e2, B:55:0x0108, B:57:0x0124, B:56:0x0121), top: B:73:0x00a2, outer: #0 }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objOooO0o0;
        C26800OooO.OooO0OO oooO0OO;
        String str;
        Object fileContent;
        Object objDownloadFileVersionContent;
        ResponseBody responseBody;
        boolean z;
        FileOutputStream fileOutputStream;
        InputStream inputStreamByteStream;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92784OooOo;
        String str2 = this.f92788OooOoOO;
        C26800OooO c26800OooO = this.f92787OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f92784OooOo = 1;
            Gson gson = C26800OooO.f92718OooO0o0;
            objOooO0o0 = c26800OooO.OooO0o0(this);
            if (objOooO0o0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o0 = obj;
        } else {
            if (i == 2) {
                oooO0OO = this.f92785OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str = this.f92786OooOoO;
                if (str == null) {
                    OneDriveApiService oneDriveApiService = c26800OooO.f92719OooO00o;
                    String str3 = oooO0OO.f92729OooO0OO;
                    this.f92785OooOo0o = null;
                    this.f92784OooOo = 3;
                    objDownloadFileVersionContent = oneDriveApiService.downloadFileVersionContent(str3, oooO0OO.f92728OooO0O0, this.f92788OooOoOO, str, this);
                } else {
                    OneDriveApiService oneDriveApiService2 = c26800OooO.f92719OooO00o;
                    String str4 = oooO0OO.f92729OooO0OO;
                    this.f92785OooOo0o = null;
                    this.f92784OooOo = 4;
                    fileContent = oneDriveApiService2.getFileContent(str4, oooO0OO.f92728OooO0O0, str2, this);
                }
                return enumC32485OooO00o;
            }
            if (i == 3) {
                C32446OooOOOo.OooO0O0(obj);
                objDownloadFileVersionContent = obj;
                responseBody = (ResponseBody) objDownloadFileVersionContent;
                long f124449OooOo = responseBody.getF124449OooOo();
                int i2 = 0;
                if (f124449OooOo >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                }
                fileOutputStream = new FileOutputStream(this.f92790OooOoo0);
                inputStreamByteStream = responseBody.byteStream();
                if (!z) {
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                oO0O000.OooO00o.OooO00o(inputStreamByteStream, null);
                fileOutputStream.close();
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            fileContent = obj;
            responseBody = (ResponseBody) fileContent;
            long f124449OooOo2 = responseBody.getF124449OooOo();
            int i22 = 0;
            z = f124449OooOo2 >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            fileOutputStream = new FileOutputStream(this.f92790OooOoo0);
            try {
                inputStreamByteStream = responseBody.byteStream();
                try {
                    if (!z) {
                        long j = 0;
                        if (f124449OooOo2 <= 0) {
                            C25298OooO0o.OooO00o(inputStreamByteStream, fileOutputStream);
                        } else {
                            byte[] bArr = new byte[8192];
                            String str5 = this.f92789OooOoo;
                            if (str5 != null) {
                                str2 = str5;
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("OneDriveCloudService");
                            c20358OooO00o.OooO0o0("Download progress for %s: 0%% (0/%d bytes)", str2, new Long(f124449OooOo2));
                            int i3 = 0;
                            while (true) {
                                int i4 = inputStreamByteStream.read(bArr);
                                if (i4 == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, i22, i4);
                                j += (long) i4;
                                int i5 = (((int) ((((long) 100) * j) / f124449OooOo2)) / 20) * 20;
                                if (i5 > i3) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o2.OooOOO0("OneDriveCloudService");
                                    c20358OooO00o2.OooO0o0("Download progress for %s: %d%% (%d/%d bytes)", str2, new Integer(i5), new Long(j), new Long(f124449OooOo2));
                                    i3 = i5;
                                    i22 = 0;
                                }
                            }
                            if (i3 < 100) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o3.OooOOO0("OneDriveCloudService");
                                c20358OooO00o3.OooO0o0("Download progress for %s: 100%% (%d/%d bytes)", str2, new Long(j), new Long(f124449OooOo2));
                            }
                        }
                    }
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    oO0O000.OooO00o.OooO00o(inputStreamByteStream, null);
                    fileOutputStream.close();
                    return C32460OooOooO.f116667OooO00o;
                } finally {
                }
            } finally {
            }
        }
        oooO0OO = (C26800OooO.OooO0OO) objOooO0o0;
        C26800OooO.OooO0O0 oooO0O0 = c26800OooO.f92722OooO0Oo;
        this.f92785OooOo0o = oooO0OO;
        this.f92784OooOo = 2;
        if (oooO0O0.OooO00o(this) != enumC32485OooO00o) {
            str = this.f92786OooOoO;
            if (str == null) {
            }
        }
        return enumC32485OooO00o;
    }
}
