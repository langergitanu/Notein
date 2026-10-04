package o0OO0o0;

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
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: o0OO0o0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$downloadFileWithProgress$2", m80623f = "OneDriveCloudService.kt", m80624l = {197, 198, 201, 204}, m80625m = "invokeSuspend")
public final class C26813OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f92776OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26800OooO.OooO0OO f92777OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f92778OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92779OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f92780OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ long f92781OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ File f92782OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Integer, C32460OooOooO> f92783OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26813OooOOO(C26800OooO c26800OooO, String str, String str2, File file, long j, InterfaceC32507OooOO0o<? super Integer, C32460OooOooO> interfaceC32507OooOO0o, Continuation<? super C26813OooOOO> continuation) {
        super(2, continuation);
        this.f92779OooOoO0 = c26800OooO;
        this.f92778OooOoO = str;
        this.f92780OooOoOO = str2;
        this.f92782OooOoo0 = file;
        this.f92781OooOoo = j;
        this.f92783OooOooO = interfaceC32507OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26813OooOOO(this.f92779OooOoO0, this.f92778OooOoO, this.f92780OooOoOO, this.f92782OooOoo0, this.f92781OooOoo, this.f92783OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Object> continuation) {
        return ((C26813OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r0 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r0 == r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[Catch: all -> 0x00cf, TRY_ENTER, TryCatch #3 {all -> 0x00cf, blocks: (B:34:0x009b, B:36:0x00a7, B:37:0x00ad, B:39:0x00b3, B:41:0x00c5, B:44:0x00d1), top: B:63:0x0099, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7 A[Catch: all -> 0x00cf, TryCatch #3 {all -> 0x00cf, blocks: (B:34:0x009b, B:36:0x00a7, B:37:0x00ad, B:39:0x00b3, B:41:0x00c5, B:44:0x00d1), top: B:63:0x0099, outer: #1 }] */
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
        FileOutputStream fileOutputStream;
        InputStream inputStreamByteStream;
        long j;
        Object l;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92776OooOo;
        C26800OooO c26800OooO = this.f92779OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f92776OooOo = 1;
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
                oooO0OO = this.f92777OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str = this.f92778OooOoO;
                if (str == null) {
                    OneDriveApiService oneDriveApiService = c26800OooO.f92719OooO00o;
                    String str2 = oooO0OO.f92729OooO0OO;
                    this.f92777OooOo0o = null;
                    this.f92776OooOo = 3;
                    objDownloadFileVersionContent = oneDriveApiService.downloadFileVersionContent(str2, oooO0OO.f92728OooO0O0, this.f92780OooOoOO, str, this);
                } else {
                    OneDriveApiService oneDriveApiService2 = c26800OooO.f92719OooO00o;
                    String str3 = oooO0OO.f92729OooO0OO;
                    this.f92777OooOo0o = null;
                    this.f92776OooOo = 4;
                    fileContent = oneDriveApiService2.getFileContent(str3, oooO0OO.f92728OooO0O0, this.f92780OooOoOO, this);
                }
                return enumC32485OooO00o;
            }
            if (i == 3) {
                C32446OooOOOo.OooO0O0(obj);
                objDownloadFileVersionContent = obj;
                responseBody = (ResponseBody) objDownloadFileVersionContent;
                fileOutputStream = new FileOutputStream(this.f92782OooOoo0);
                InterfaceC32507OooOO0o<Integer, C32460OooOooO> interfaceC32507OooOO0o = this.f92783OooOooO;
                inputStreamByteStream = responseBody.byteStream();
                j = this.f92781OooOoo;
                long j2 = 0;
                if (j > 0) {
                }
                oO0O000.OooO00o.OooO00o(inputStreamByteStream, null);
                fileOutputStream.close();
                return l;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            fileContent = obj;
            responseBody = (ResponseBody) fileContent;
            fileOutputStream = new FileOutputStream(this.f92782OooOoo0);
            InterfaceC32507OooOO0o<Integer, C32460OooOooO> interfaceC32507OooOO0o2 = this.f92783OooOooO;
            try {
                inputStreamByteStream = responseBody.byteStream();
                j = this.f92781OooOoo;
                long j22 = 0;
                try {
                    if (j > 0) {
                        l = new Long(C25298OooO0o.OooO00o(inputStreamByteStream, fileOutputStream));
                    } else {
                        byte[] bArr = new byte[8192];
                        int i2 = -1;
                        while (true) {
                            int i3 = inputStreamByteStream.read(bArr);
                            if (i3 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i3);
                            j22 += (long) i3;
                            int iOooO0o = oO0O00oo.OooOO0.OooO0o((int) ((((long) 100) * j22) / j), 0, 100);
                            if (iOooO0o != i2) {
                                interfaceC32507OooOO0o2.invoke(new Integer(iOooO0o));
                                i2 = iOooO0o;
                            }
                        }
                        l = C32460OooOooO.f116667OooO00o;
                    }
                    oO0O000.OooO00o.OooO00o(inputStreamByteStream, null);
                    fileOutputStream.close();
                    return l;
                } finally {
                }
            } finally {
            }
        }
        oooO0OO = (C26800OooO.OooO0OO) objOooO0o0;
        C26800OooO.OooO0O0 oooO0O0 = c26800OooO.f92722OooO0Oo;
        this.f92777OooOo0o = oooO0OO;
        this.f92776OooOo = 2;
        if (oooO0O0.OooO00o(this) != enumC32485OooO00o) {
            str = this.f92778OooOoO;
            if (str == null) {
            }
        }
        return enumC32485OooO00o;
    }
}
