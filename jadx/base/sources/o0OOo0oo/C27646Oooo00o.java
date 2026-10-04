package o0OOo0oo;

import OooOoo.C20593OooO0Oo;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtraKt;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.FetchCloudBundleUseCase$invoke$2", m80623f = "FetchCloudBundleUseCase.kt", m80624l = {53, 74, 75, 89}, m80625m = "invokeSuspend")
public final class C27646Oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends CloudBundle>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public CloudMetaRemote f97226OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27643Oooo0 f97227OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public CloudContentTag f97228OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f97229OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97230OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ CloudMetaRemote f97231OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f97232OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C27643Oooo0 f97233OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27646Oooo00o(CloudMetaRemote cloudMetaRemote, C27643Oooo0 c27643Oooo0, Continuation<? super C27646Oooo00o> continuation) {
        super(2, continuation);
        this.f97231OooOoo = cloudMetaRemote;
        this.f97233OooOooO = c27643Oooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27646Oooo00o c27646Oooo00o = new C27646Oooo00o(this.f97231OooOoo, this.f97233OooOooO, continuation);
        c27646Oooo00o.f97232OooOoo0 = obj;
        return c27646Oooo00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends CloudBundle>> continuation) {
        return ((C27646Oooo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185 A[Catch: all -> 0x0236, PHI: r6 r8 r9 r10 r11
      0x0185: PHI (r6v15 com.orion.notein.domain.models.cloudsync.CloudMetaRemote) = 
      (r6v13 com.orion.notein.domain.models.cloudsync.CloudMetaRemote)
      (r6v26 com.orion.notein.domain.models.cloudsync.CloudMetaRemote)
     binds: [B:57:0x0182, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r8v3 kotlin.jvm.internal.Oooo00O) = (r8v2 kotlin.jvm.internal.Oooo00O), (r8v7 kotlin.jvm.internal.Oooo00O) binds: [B:57:0x0182, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r9v14 java.lang.String) = (r9v13 java.lang.String), (r9v21 java.lang.String) binds: [B:57:0x0182, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r10v10 o0OOo0oo.Oooo0) = (r10v9 o0OOo0oo.Oooo0), (r10v12 o0OOo0oo.Oooo0) binds: [B:57:0x0182, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r11v6 java.lang.Object) = (r11v5 java.lang.Object), (r11v10 java.lang.Object) binds: [B:57:0x0182, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0236, blocks: (B:59:0x0185, B:61:0x0193, B:63:0x019d, B:65:0x01b1, B:77:0x0239, B:78:0x0252, B:79:0x0253, B:80:0x0276, B:81:0x0277, B:82:0x028c, B:56:0x0171), top: B:91:0x0171 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0193 A[Catch: all -> 0x0236, TryCatch #0 {all -> 0x0236, blocks: (B:59:0x0185, B:61:0x0193, B:63:0x019d, B:65:0x01b1, B:77:0x0239, B:78:0x0252, B:79:0x0253, B:80:0x0276, B:81:0x0277, B:82:0x028c, B:56:0x0171), top: B:91:0x0171 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fd A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:9:0x0032, B:69:0x01cb, B:71:0x01fd, B:73:0x0218, B:74:0x0235, B:52:0x0158), top: B:96:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0218 A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:9:0x0032, B:69:0x01cb, B:71:0x01fd, B:73:0x0218, B:74:0x0235, B:52:0x0158), top: B:96:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0277 A[Catch: all -> 0x0236, TryCatch #0 {all -> 0x0236, blocks: (B:59:0x0185, B:61:0x0193, B:63:0x019d, B:65:0x01b1, B:77:0x0239, B:78:0x0252, B:79:0x0253, B:80:0x0276, B:81:0x0277, B:82:0x028c, B:56:0x0171), top: B:91:0x0171 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0298  */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v25 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        C24034Oooo00O c24034Oooo00O;
        Throwable thOooO00o;
        Object objOooOO0O;
        Object objOooOo0o;
        C27643Oooo0 c27643Oooo0;
        C24034Oooo00O c24034Oooo00O2;
        CloudMetaRemote cloudMetaRemote;
        CloudContentTag stagedContentTag;
        String str;
        Object objOooO00o2;
        File file;
        Object objOooO0Oo;
        CloudContentTag cloudContentTag;
        CloudMetaRemote cloudMetaRemote2;
        C24034Oooo00O c24034Oooo00O3;
        C27643Oooo0 c27643Oooo02;
        File file2;
        String strOooOOO;
        String strOooOOO2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r6 = this.f97230OooOoOO;
        C27643Oooo0 c27643Oooo03 = this.f97233OooOooO;
        CloudMetaRemote cloudMetaRemote3 = this.f97231OooOoo;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (r6 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f97232OooOoo0;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FetchCloudBundleUseCase");
            c20358OooO00o.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Fetching cloud bundle for ", cloudMetaRemote3.getId()), new Object[0]);
            if (cloudMetaRemote3.getDeleted()) {
                c20358OooO00o.OooOOO0("FetchCloudBundleUseCase");
                c20358OooO00o.OooO0o0(C20593OooO0Oo.OooO0O0("Cloud meta is marked deleted for ", cloudMetaRemote3.getId(), ", skipping fetch"), new Object[0]);
                return new C32445OooOOOO(new CloudBundle(null, null, cloudMetaRemote3.getExtra(), CloudMetaExtraKt.computeMetaHash(cloudMetaRemote3.getExtra()), cloudMetaRemote3.getMimeType()));
            }
            InterfaceC27605OooO00o interfaceC27605OooO00o = c27643Oooo03.f97216OooO0O0;
            String id = cloudMetaRemote3.getId();
            this.f97232OooOoo0 = interfaceC33636Oooo00o;
            this.f97230OooOoOO = 1;
            objOooOO0O = interfaceC27605OooO00o.OooOO0O(id, null, this);
            if (objOooOO0O != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (r6 != 1) {
            if (r6 == 2) {
                cloudMetaRemote = this.f97226OooOo;
                C27643Oooo0 c27643Oooo04 = this.f97227OooOo0o;
                C24034Oooo00O c24034Oooo00O4 = (C24034Oooo00O) this.f97232OooOoo0;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    c27643Oooo0 = c27643Oooo04;
                    c24034Oooo00O2 = c24034Oooo00O4;
                    objOooOo0o = obj;
                    try {
                        str = (String) objOooOo0o;
                        this.f97232OooOoo0 = c24034Oooo00O2;
                        this.f97227OooOo0o = c27643Oooo0;
                        this.f97226OooOo = cloudMetaRemote;
                        this.f97229OooOoO0 = str;
                        this.f97230OooOoOO = 3;
                        objOooO00o2 = C27643Oooo0.OooO00o(c27643Oooo0, cloudMetaRemote, str, this);
                        if (objOooO00o2 == enumC32485OooO00o) {
                            C32446OooOOOo.OooO0O0(objOooO00o2);
                            file = new File(str);
                            if (file.exists()) {
                            }
                        }
                        return enumC32485OooO00o;
                    } catch (Throwable th2) {
                        th = th2;
                        r6 = c24034Oooo00O2;
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                        c24034Oooo00O = r6;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r6 = c24034Oooo00O4;
                }
            } else {
                if (r6 != 3) {
                    if (r6 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CloudContentTag cloudContentTag2 = this.f97228OooOoO;
                    file2 = (File) this.f97229OooOoO0;
                    cloudMetaRemote2 = this.f97226OooOo;
                    c27643Oooo02 = this.f97227OooOo0o;
                    C24034Oooo00O c24034Oooo00O5 = (C24034Oooo00O) this.f97232OooOoo0;
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO0Oo = ((C32445OooOOOO) obj).f116639OooOo0o;
                    cloudContentTag = cloudContentTag2;
                    c24034Oooo00O3 = c24034Oooo00O5;
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    File file3 = new File(c27643Oooo02.f97215OooO00o.getFilesDir(), "cloud_cache_dir");
                    file3.mkdirs();
                    ?? file4 = new File(file3, file2.getName());
                    c24034Oooo00O3.f80942OooOo0o = file4;
                    strOooOOO = C31190OooO0oo.OooOOO(file2);
                    C32501OooO0oO.OooO0OO(file2, file4);
                    file2.delete();
                    strOooOOO2 = C31190OooO0oo.OooOOO(file4);
                    if (strOooOOO2.equalsIgnoreCase(strOooOOO)) {
                        throw new IllegalArgumentException(("MD5 mismatch after copy: src=" + strOooOOO + " dst=" + strOooOOO2).toString());
                    }
                    objOooO00o = new CloudBundle(file4, cloudContentTag, cloudMetaRemote2.getExtra(), CloudMetaExtraKt.computeMetaHash(cloudMetaRemote2.getExtra()), cloudMetaRemote2.getMimeType());
                    c24034Oooo00O = c24034Oooo00O3;
                    Object obj2 = objOooO00o;
                    thOooO00o = C32445OooOOOO.OooO00o(obj2);
                    if (thOooO00o != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("FetchCloudBundleUseCase");
                        c20358OooO00o2.OooO0Oo(thOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Fetch bundle failed for ", cloudMetaRemote3.getId()), new Object[0]);
                        File file5 = (File) c24034Oooo00O.f80942OooOo0o;
                        if (file5 != null) {
                            file5.delete();
                        }
                    }
                    return new C32445OooOOOO(obj2);
                }
                String str2 = (String) this.f97229OooOoO0;
                CloudMetaRemote cloudMetaRemote4 = this.f97226OooOo;
                c27643Oooo0 = this.f97227OooOo0o;
                C24034Oooo00O c24034Oooo00O6 = (C24034Oooo00O) this.f97232OooOoo0;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    str = str2;
                    cloudMetaRemote = cloudMetaRemote4;
                    c24034Oooo00O2 = c24034Oooo00O6;
                    objOooO00o2 = ((C32445OooOOOO) obj).f116639OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO00o2);
                    file = new File(str);
                    if (file.exists()) {
                        throw new IllegalArgumentException(("Source file not found: " + str).toString());
                    }
                    CloudContentTag contentTag = cloudMetaRemote.getContentTag();
                    if (!contentTag.matchesForFile(file)) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("FetchCloudBundleUseCase");
                        c20358OooO00o3.OooO0OO("Checksum mismatch before copy: expect=" + contentTag + ", file=" + file, new Object[0]);
                        throw new CloudSyncError.ChecksumMismatch(null, 1, null);
                    }
                    InterfaceC27660OoooOo0 interfaceC27660OoooOo0 = c27643Oooo0.f97217OooO0OO.get(CloudMetaType.INSTANCE.fromMime(cloudMetaRemote.getMimeType()));
                    if (interfaceC27660OoooOo0 == null) {
                        throw new IllegalStateException(("No processor for " + cloudMetaRemote.getMimeType()).toString());
                    }
                    this.f97232OooOoo0 = c24034Oooo00O2;
                    this.f97227OooOo0o = c27643Oooo0;
                    this.f97226OooOo = cloudMetaRemote;
                    this.f97229OooOoO0 = file;
                    this.f97228OooOoO = contentTag;
                    this.f97230OooOoOO = 4;
                    objOooO0Oo = interfaceC27660OoooOo0.OooO0Oo(str, cloudMetaRemote);
                    if (objOooO0Oo != enumC32485OooO00o) {
                        cloudContentTag = contentTag;
                        cloudMetaRemote2 = cloudMetaRemote;
                        c24034Oooo00O3 = c24034Oooo00O2;
                        c27643Oooo02 = c27643Oooo0;
                        file2 = file;
                        C32446OooOOOo.OooO0O0(objOooO0Oo);
                        File file32 = new File(c27643Oooo02.f97215OooO00o.getFilesDir(), "cloud_cache_dir");
                        file32.mkdirs();
                        ?? file42 = new File(file32, file2.getName());
                        c24034Oooo00O3.f80942OooOo0o = file42;
                        strOooOOO = C31190OooO0oo.OooOOO(file2);
                        C32501OooO0oO.OooO0OO(file2, file42);
                        file2.delete();
                        strOooOOO2 = C31190OooO0oo.OooOOO(file42);
                        if (strOooOOO2.equalsIgnoreCase(strOooOOO)) {
                        }
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th4) {
                    th = th4;
                    r6 = c24034Oooo00O6;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    c24034Oooo00O = r6;
                }
            }
            objOooO00o = C32446OooOOOo.OooO00o(th);
            c24034Oooo00O = r6;
            Object obj22 = objOooO00o;
            thOooO00o = C32445OooOOOO.OooO00o(obj22);
            if (thOooO00o != null) {
            }
            return new C32445OooOOOO(obj22);
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOO0O = obj;
        CloudMetaLocal cloudMetaLocal = (CloudMetaLocal) objOooOO0O;
        boolean z = cloudMetaLocal != null && (((stagedContentTag = cloudMetaLocal.getStagedContentTag()) != null && stagedContentTag.matches(cloudMetaRemote3.getContentTag())) || cloudMetaLocal.getContentTag().matches(cloudMetaRemote3.getContentTag()));
        if (cloudMetaLocal != null && !cloudMetaLocal.getDeleted() && z) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("FetchCloudBundleUseCase");
            c20358OooO00o4.OooO0o0(C20593OooO0Oo.OooO0O0("Content unchanged for ", cloudMetaRemote3.getId(), ", meta-only update"), new Object[0]);
            return new C32445OooOOOO(new CloudBundle(null, null, cloudMetaRemote3.getExtra(), CloudMetaExtraKt.computeMetaHash(cloudMetaRemote3.getExtra()), cloudMetaRemote3.getMimeType()));
        }
        C24034Oooo00O c24034Oooo00O7 = new C24034Oooo00O();
        InterfaceC27605OooO00o interfaceC27605OooO00o2 = c27643Oooo03.f97216OooO0O0;
        String id2 = cloudMetaRemote3.getId();
        this.f97232OooOoo0 = c24034Oooo00O7;
        this.f97227OooOo0o = c27643Oooo03;
        this.f97226OooOo = cloudMetaRemote3;
        this.f97230OooOoOO = 2;
        objOooOo0o = interfaceC27605OooO00o2.OooOo0o(id2, this);
        if (objOooOo0o != enumC32485OooO00o) {
            c27643Oooo0 = c27643Oooo03;
            c24034Oooo00O2 = c24034Oooo00O7;
            cloudMetaRemote = cloudMetaRemote3;
            str = (String) objOooOo0o;
            this.f97232OooOoo0 = c24034Oooo00O2;
            this.f97227OooOo0o = c27643Oooo0;
            this.f97226OooOo = cloudMetaRemote;
            this.f97229OooOoO0 = str;
            this.f97230OooOoOO = 3;
            objOooO00o2 = C27643Oooo0.OooO00o(c27643Oooo0, cloudMetaRemote, str, this);
            if (objOooO00o2 == enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
