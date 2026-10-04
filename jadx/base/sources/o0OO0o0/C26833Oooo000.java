package o0OO0o0;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.words.StyleIdentifier;
import com.google.gson.Gson;
import com.microsoft.identity.common.internal.net.cache.HttpCache;
import com.orion.notein.data.repo.cloudsync.onedrive.CreateUploadSessionPostRequestBody;
import com.orion.notein.data.repo.cloudsync.onedrive.DriveItemUploadableProperties;
import com.orion.notein.data.repo.cloudsync.onedrive.OneDriveApiService;
import com.orion.notein.data.repo.cloudsync.onedrive.UploadSession;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o0OO0o0.C26800OooO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;

/* JADX INFO: renamed from: o0OO0o0.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$uploadBinaryFile$2", m80623f = "OneDriveCloudService.kt", m80624l = {240, 244, StyleIdentifier.COLORFUL_GRID_ACCENT_6, StyleIdentifier.TABLE_GRID_LIGHT, StyleIdentifier.GRID_TABLE_3_ACCENT_2, StyleIdentifier.GRID_TABLE_3_ACCENT_3}, m80625m = "invokeSuspend")
public final class C26833Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C26804OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f92882OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24034Oooo00O f92883OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92884OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f92885OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ File f92886OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f92887OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f92888OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f92889OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f92890OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26833Oooo000(C26800OooO c26800OooO, File file, String str, String str2, String str3, String str4, Continuation<? super C26833Oooo000> continuation) {
        super(2, continuation);
        this.f92884OooOoO = c26800OooO;
        this.f92886OooOoOO = file;
        this.f92888OooOoo0 = str;
        this.f92887OooOoo = str2;
        this.f92889OooOooO = str3;
        this.f92890OooOooo = str4;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26833Oooo000 c26833Oooo000 = new C26833Oooo000(this.f92884OooOoO, this.f92886OooOoOO, this.f92888OooOoo0, this.f92887OooOoo, this.f92889OooOooO, this.f92890OooOooo, continuation);
        c26833Oooo000.f92885OooOoO0 = obj;
        return c26833Oooo000;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C26804OooO0OO> continuation) {
        return ((C26833Oooo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cd, code lost:
    
        if (r0 == r7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
    
        if (r0 == r7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a0, code lost:
    
        if (r1 != r7) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x002c, B:55:0x0158, B:57:0x015c, B:52:0x013e), top: B:77:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Object, o0OO0o0.OooO0OO] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, o0OO0o0.OooO0OO] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, o0OO0o0.OooO0OO] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO00o;
        String id;
        C24034Oooo00O c24034Oooo00O;
        C24034Oooo00O c24034Oooo00O2;
        String str;
        Object objOooO0o;
        Throwable thOooO00o;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        Object objOooO0o0;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
        RequestBody requestBody$Companion$asRequestBody$1;
        Object objUploadFileContentByName;
        Object objCreateUploadSessionByName;
        String uploadUrl;
        Object objOooO0O0;
        ?? r0;
        Object objOooO0o2;
        ?? r02;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92882OooOo;
        final String str2 = this.f92887OooOoo;
        File file = this.f92886OooOoOO;
        C26800OooO c26800OooO = this.f92884OooOoO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f92885OooOoO0;
                this.f92885OooOoO0 = interfaceC33636Oooo00o;
                this.f92882OooOo = 1;
                Gson gson = C26800OooO.f92718OooO0o0;
                objOooO0o0 = c26800OooO.OooO0o0(this);
                if (objOooO0o0 != enumC32485OooO00o) {
                    interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                    C26800OooO.OooO0OO oooO0OO = (C26800OooO.OooO0OO) objOooO0o0;
                    if (file.length() >= HttpCache.DEFAULT_HTTP_CACHE_CAPACITY_BYTES) {
                        if (file.length() >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                            requestBody$Companion$asRequestBody$1 = new C26800OooO.OooO00o(file, new InterfaceC32510OooOOo0() { // from class: o0OO0o0.OooOooo
                                @Override // oO0O000o.InterfaceC32510OooOOo0
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    Long l = (Long) obj2;
                                    l.getClass();
                                    Long l2 = (Long) obj3;
                                    l2.getClass();
                                    Integer num = (Integer) obj4;
                                    num.getClass();
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("OneDriveCloudService");
                                    c20358OooO00o.OooO0o0("Upload progress for %s: %d%% (%d/%d bytes)", str2, num, l, l2);
                                    return C32460OooOooO.f116667OooO00o;
                                }
                            });
                        } else {
                            RequestBody.INSTANCE.getClass();
                            requestBody$Companion$asRequestBody$1 = new RequestBody$Companion$asRequestBody$1(null, file);
                        }
                        RequestBody requestBody = requestBody$Companion$asRequestBody$1;
                        OneDriveApiService oneDriveApiService = c26800OooO.f92719OooO00o;
                        String str3 = oooO0OO.f92729OooO0OO;
                        this.f92885OooOoO0 = interfaceC33636Oooo00o2;
                        this.f92882OooOo = 4;
                        objUploadFileContentByName = oneDriveApiService.uploadFileContentByName(str3, oooO0OO.f92728OooO0O0, this.f92888OooOoo0, this.f92887OooOoo, requestBody, this);
                    } else {
                        OneDriveApiService oneDriveApiService2 = c26800OooO.f92719OooO00o;
                        String str4 = oooO0OO.f92729OooO0OO;
                        String str5 = this.f92887OooOoo;
                        CreateUploadSessionPostRequestBody createUploadSessionPostRequestBody = new CreateUploadSessionPostRequestBody(new DriveItemUploadableProperties(str5, "rename"));
                        this.f92885OooOoO0 = interfaceC33636Oooo00o2;
                        this.f92882OooOo = 2;
                        objCreateUploadSessionByName = oneDriveApiService2.createUploadSessionByName(str4, oooO0OO.f92728OooO0O0, this.f92888OooOoo0, str5, createUploadSessionPostRequestBody, this);
                        if (objCreateUploadSessionByName != enumC32485OooO00o) {
                            UploadSession uploadSession = (UploadSession) objCreateUploadSessionByName;
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("OneDriveCloudService");
                            c20358OooO00o.OooO0o0("Upload session created for %s, expires: %s", str2, uploadSession.getExpirationDateTime());
                            uploadUrl = uploadSession.getUploadUrl();
                            if (uploadUrl != null) {
                                throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Upload session URL is null for ", str2));
                            }
                            this.f92885OooOoO0 = interfaceC33636Oooo00o2;
                            this.f92882OooOo = 3;
                            objOooO0O0 = C26800OooO.OooO0O0(c26800OooO, uploadUrl, file, str2, this);
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f92885OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o0 = obj;
                interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                C26800OooO.OooO0OO oooO0OO2 = (C26800OooO.OooO0OO) objOooO0o0;
                if (file.length() >= HttpCache.DEFAULT_HTTP_CACHE_CAPACITY_BYTES) {
                }
                return enumC32485OooO00o;
            case 2:
                InterfaceC33636Oooo00o interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) this.f92885OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o2 = interfaceC33636Oooo00o3;
                objCreateUploadSessionByName = obj;
                UploadSession uploadSession2 = (UploadSession) objCreateUploadSessionByName;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("OneDriveCloudService");
                c20358OooO00o2.OooO0o0("Upload session created for %s, expires: %s", str2, uploadSession2.getExpirationDateTime());
                uploadUrl = uploadSession2.getUploadUrl();
                if (uploadUrl != null) {
                }
                break;
            case 3:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0O0 = obj;
                r0 = (C26804OooO0OO) objOooO0O0;
                id = r0.getId();
                if (id == null && id.length() != 0) {
                    c24034Oooo00O = new C24034Oooo00O();
                    c24034Oooo00O.f80942OooOo0o = r0;
                    String str6 = this.f92889OooOooO;
                    if (str6 == null || str6.length() == 0) {
                        c24034Oooo00O2 = c24034Oooo00O;
                        str = this.f92890OooOooo;
                        if (str != null && str.length() != 0) {
                            this.f92885OooOoO0 = c24034Oooo00O2;
                            this.f92883OooOo0o = null;
                            this.f92882OooOo = 6;
                            c26800OooO.getClass();
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26829OooOoo0(str, id, null, c26800OooO), this);
                            break;
                        }
                        return c24034Oooo00O2.f80942OooOo0o;
                    }
                    this.f92885OooOoO0 = id;
                    this.f92883OooOo0o = c24034Oooo00O;
                    this.f92882OooOo = 5;
                    c26800OooO.getClass();
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26827OooOoOO(str6, id, null, c26800OooO), this);
                    if (objOooO0o2 == enumC32485OooO00o) {
                    }
                    r02 = (C26804OooO0OO) objOooO0o2;
                    if (r02 == 0) {
                        c24034Oooo00O.f80942OooOo0o = r02;
                        objOooO00o = C32460OooOooO.f116667OooO00o;
                        break;
                    } else {
                        objOooO00o = null;
                    }
                    thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                    if (thOooO00o != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOO0o(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o3, "OneDriveCloudService", "Failed to update description for ", id, ", ignoring"), new Object[0]);
                    }
                    c24034Oooo00O2 = c24034Oooo00O;
                    str = this.f92890OooOooo;
                    if (str != null) {
                        this.f92885OooOoO0 = c24034Oooo00O2;
                        this.f92883OooOo0o = null;
                        this.f92882OooOo = 6;
                        c26800OooO.getClass();
                        C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26829OooOoo0(str, id, null, c26800OooO), this);
                        break;
                    }
                    return c24034Oooo00O2.f80942OooOo0o;
                    return enumC32485OooO00o;
                }
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                objUploadFileContentByName = obj;
                r0 = (C26804OooO0OO) objUploadFileContentByName;
                id = r0.getId();
                return id == null ? r0 : r0;
            case 5:
                c24034Oooo00O = this.f92883OooOo0o;
                id = (String) this.f92885OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o2 = obj;
                r02 = (C26804OooO0OO) objOooO0o2;
                if (r02 == 0) {
                }
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                }
                c24034Oooo00O2 = c24034Oooo00O;
                str = this.f92890OooOooo;
                if (str != null) {
                }
                return c24034Oooo00O2.f80942OooOo0o;
            case 6:
                c24034Oooo00O2 = (C24034Oooo00O) this.f92885OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                ?? r1 = (C26804OooO0OO) objOooO0o;
                if (r1 != 0) {
                    c24034Oooo00O2.f80942OooOo0o = r1;
                }
                return c24034Oooo00O2.f80942OooOo0o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
