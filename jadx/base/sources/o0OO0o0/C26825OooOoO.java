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

/* JADX INFO: renamed from: o0OO0o0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$updateBinaryFileById$2", m80623f = "OneDriveCloudService.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6, StyleIdentifier.LIST_TABLE_3, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_3, StyleIdentifier.LIST_TABLE_2_ACCENT_6, StyleIdentifier.HASHTAG}, m80625m = "invokeSuspend")
public final class C26825OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C26804OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f92835OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24034Oooo00O f92836OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92837OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f92838OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ File f92839OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f92840OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f92841OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f92842OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f92843OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26825OooOoO(C26800OooO c26800OooO, File file, String str, String str2, String str3, String str4, Continuation<? super C26825OooOoO> continuation) {
        super(2, continuation);
        this.f92837OooOoO = c26800OooO;
        this.f92839OooOoOO = file;
        this.f92841OooOoo0 = str;
        this.f92840OooOoo = str2;
        this.f92842OooOooO = str3;
        this.f92843OooOooo = str4;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26825OooOoO c26825OooOoO = new C26825OooOoO(this.f92837OooOoO, this.f92839OooOoOO, this.f92841OooOoo0, this.f92840OooOoo, this.f92842OooOooO, this.f92843OooOooo, continuation);
        c26825OooOoO.f92838OooOoO0 = obj;
        return c26825OooOoO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C26804OooO0OO> continuation) {
        return ((C26825OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r0 == r6) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011b, code lost:
    
        if (r0 == r6) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b5, code lost:
    
        if (r1 == r6) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:8:0x002f, B:59:0x015b, B:61:0x015f, B:56:0x0141), top: B:85:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Object, o0OO0o0.OooO0OO] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, o0OO0o0.OooO0OO] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, o0OO0o0.OooO0OO] */
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
        String str2;
        Object objOooO0o;
        Throwable thOooO00o;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        Object objOooO0o0;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
        RequestBody requestBody$Companion$asRequestBody$1;
        Object objUploadFileContentById;
        Object objCreateUploadSessionById;
        String uploadUrl;
        Object objOooO0O0;
        ?? r0;
        Object objOooO0o2;
        ?? r02;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92835OooOo;
        String str3 = this.f92840OooOoo;
        final String str4 = this.f92841OooOoo0;
        File file = this.f92839OooOoOO;
        C26800OooO c26800OooO = this.f92837OooOoO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f92838OooOoO0;
                this.f92838OooOoO0 = interfaceC33636Oooo00o;
                this.f92835OooOo = 1;
                Gson gson = C26800OooO.f92718OooO0o0;
                objOooO0o0 = c26800OooO.OooO0o0(this);
                if (objOooO0o0 != enumC32485OooO00o) {
                    interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                    C26800OooO.OooO0OO oooO0OO = (C26800OooO.OooO0OO) objOooO0o0;
                    if (file.length() >= HttpCache.DEFAULT_HTTP_CACHE_CAPACITY_BYTES) {
                        if (file.length() >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                            requestBody$Companion$asRequestBody$1 = new C26800OooO.OooO00o(file, new InterfaceC32510OooOOo0() { // from class: o0OO0o0.OooOoO0
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
                                    c20358OooO00o.OooO0o0("Upload progress for %s: %d%% (%d/%d bytes)", str4, num, l, l2);
                                    return C32460OooOooO.f116667OooO00o;
                                }
                            });
                        } else {
                            RequestBody.INSTANCE.getClass();
                            requestBody$Companion$asRequestBody$1 = new RequestBody$Companion$asRequestBody$1(null, file);
                        }
                        RequestBody requestBody = requestBody$Companion$asRequestBody$1;
                        OneDriveApiService oneDriveApiService = c26800OooO.f92719OooO00o;
                        String str5 = oooO0OO.f92729OooO0OO;
                        this.f92838OooOoO0 = interfaceC33636Oooo00o2;
                        this.f92835OooOo = 4;
                        objUploadFileContentById = oneDriveApiService.uploadFileContentById(str5, oooO0OO.f92728OooO0O0, this.f92841OooOoo0, requestBody, this);
                    } else {
                        OneDriveApiService oneDriveApiService2 = c26800OooO.f92719OooO00o;
                        String str6 = oooO0OO.f92729OooO0OO;
                        CreateUploadSessionPostRequestBody createUploadSessionPostRequestBody = new CreateUploadSessionPostRequestBody(new DriveItemUploadableProperties(null, null, 3, null));
                        this.f92838OooOoO0 = interfaceC33636Oooo00o2;
                        this.f92835OooOo = 2;
                        objCreateUploadSessionById = oneDriveApiService2.createUploadSessionById(str6, oooO0OO.f92728OooO0O0, this.f92841OooOoo0, createUploadSessionPostRequestBody, this);
                        if (objCreateUploadSessionById != enumC32485OooO00o) {
                            UploadSession uploadSession = (UploadSession) objCreateUploadSessionById;
                            String str7 = str3 != null ? str4 : str3;
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("OneDriveCloudService");
                            c20358OooO00o.OooO0o0("Upload session created for %s (id=%s), expires: %s", str7, str4, uploadSession.getExpirationDateTime());
                            uploadUrl = uploadSession.getUploadUrl();
                            if (uploadUrl != null) {
                                throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Upload session URL is null for ", str4));
                            }
                            this.f92838OooOoO0 = interfaceC33636Oooo00o2;
                            this.f92835OooOo = 3;
                            objOooO0O0 = C26800OooO.OooO0O0(c26800OooO, uploadUrl, file, str7, this);
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f92838OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o0 = obj;
                interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                C26800OooO.OooO0OO oooO0OO2 = (C26800OooO.OooO0OO) objOooO0o0;
                if (file.length() >= HttpCache.DEFAULT_HTTP_CACHE_CAPACITY_BYTES) {
                }
                return enumC32485OooO00o;
            case 2:
                InterfaceC33636Oooo00o interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) this.f92838OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o2 = interfaceC33636Oooo00o3;
                objCreateUploadSessionById = obj;
                UploadSession uploadSession2 = (UploadSession) objCreateUploadSessionById;
                if (str3 != null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("OneDriveCloudService");
                c20358OooO00o2.OooO0o0("Upload session created for %s (id=%s), expires: %s", str7, str4, uploadSession2.getExpirationDateTime());
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
                    String str8 = this.f92842OooOooO;
                    if (str8 == null || str8.length() == 0) {
                        c24034Oooo00O2 = c24034Oooo00O;
                        str = id;
                        if ((str3 != null && str3.length() != 0) || ((str2 = this.f92843OooOooo) != null && str2.length() != 0)) {
                            this.f92838OooOoO0 = c24034Oooo00O2;
                            this.f92836OooOo0o = null;
                            this.f92835OooOo = 6;
                            c26800OooO.getClass();
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26828OooOoo(this.f92840OooOoo, this.f92843OooOooo, str, null, c26800OooO), this);
                            break;
                        }
                        return c24034Oooo00O2.f80942OooOo0o;
                    }
                    this.f92838OooOoO0 = id;
                    this.f92836OooOo0o = c24034Oooo00O;
                    this.f92835OooOo = 5;
                    c26800OooO.getClass();
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26827OooOoOO(str8, id, null, c26800OooO), this);
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
                    str = id;
                    if (str3 != null) {
                        this.f92838OooOoO0 = c24034Oooo00O2;
                        this.f92836OooOo0o = null;
                        this.f92835OooOo = 6;
                        c26800OooO.getClass();
                        C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26828OooOoo(this.f92840OooOoo, this.f92843OooOooo, str, null, c26800OooO), this);
                        break;
                    } else {
                        this.f92838OooOoO0 = c24034Oooo00O2;
                        this.f92836OooOo0o = null;
                        this.f92835OooOo = 6;
                        c26800OooO.getClass();
                        C33874OooO0OO c33874OooO0OO32 = C33649OoooOOo.f121328OooO00o;
                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26828OooOoo(this.f92840OooOoo, this.f92843OooOooo, str, null, c26800OooO), this);
                        break;
                    }
                    return c24034Oooo00O2.f80942OooOo0o;
                    return enumC32485OooO00o;
                }
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                objUploadFileContentById = obj;
                r0 = (C26804OooO0OO) objUploadFileContentById;
                id = r0.getId();
                return id == null ? r0 : r0;
            case 5:
                c24034Oooo00O = this.f92836OooOo0o;
                id = (String) this.f92838OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o2 = obj;
                r02 = (C26804OooO0OO) objOooO0o2;
                if (r02 == 0) {
                }
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                }
                c24034Oooo00O2 = c24034Oooo00O;
                str = id;
                if (str3 != null) {
                }
                return c24034Oooo00O2.f80942OooOo0o;
            case 6:
                c24034Oooo00O2 = (C24034Oooo00O) this.f92838OooOoO0;
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
