package o0OOo0oo;

import OooOoo.C20593OooO0Oo;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import java.io.File;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.o000Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27696o000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97602OooO00o;

    /* JADX INFO: renamed from: o0OOo0oo.o000Ooo$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f97603OooO00o;

        static {
            int[] iArr = new int[CloudBundle.BundleType.values().length];
            try {
                iArr[CloudBundle.BundleType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CloudBundle.BundleType.META_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CloudBundle.BundleType.CONTENT_AND_META.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97603OooO00o = iArr;
        }
    }

    public C27696o000Ooo(InterfaceC27605OooO00o repo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(repo, "repo");
        this.f97602OooO00o = repo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(CloudMetaLocal cloudMetaLocal, CloudBundle cloudBundle, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000O0O o000o0o2;
        Object objOooO0O0;
        CloudMetaLocal cloudMetaLocal2;
        CloudBundle cloudBundle2;
        if (abstractC32479OooO0OO instanceof o000O0O) {
            o000o0o2 = (o000O0O) abstractC32479OooO0OO;
            int i = o000o0o2.f97576OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000o0o2.f97576OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o000o0o2 = new o000O0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o000o0o2.f97575OooOoO0;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000o0o2.f97576OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o000o0o2.f97573OooOo0o = cloudMetaLocal;
            o000o0o2.f97572OooOo = cloudBundle;
            o000o0o2.f97576OooOoOO = 1;
            objOooO0O0 = OooO0O0(cloudMetaLocal, cloudBundle, z, o000o0o2);
            if (objOooO0O0 == obj2) {
                return obj2;
            }
            cloudMetaLocal2 = cloudMetaLocal;
            cloudBundle2 = cloudBundle;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cloudBundle2 = o000o0o2.f97572OooOo;
            CloudMetaLocal cloudMetaLocal3 = o000o0o2.f97573OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
            cloudMetaLocal2 = cloudMetaLocal3;
        }
        try {
            File file = cloudBundle2.getFile();
            if (file != null && file.exists() && file.delete()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("UploadBundleUseCase");
                c20358OooO00o.OooO00o("Temp bundle " + file.getName() + " deleted", new Object[0]);
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
            CloudMetaRemote cloudMetaRemote = (CloudMetaRemote) objOooO0O0;
            return CloudMetaLocal.copy$default(cloudMetaLocal2, null, null, null, cloudMetaRemote.getMetaVersion(), cloudMetaRemote.getContentTag(), cloudMetaRemote.getMetaHash(), null, null, false, cloudMetaRemote.getDeleted(), Math.max(cloudMetaRemote.getLastSyncTime(), cloudMetaLocal2.getLastModificationTime()), null, 391, null);
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x024e, code lost:
    
        if (r7 != r5) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0298 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [com.orion.notein.domain.models.cloudsync.CloudBundle, java.lang.String, o0OOo0oo.o000Ooo] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(CloudMetaLocal cloudMetaLocal, CloudBundle cloudBundle, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000Oo0 o000oo02;
        String id;
        C27696o000Ooo c27696o000Ooo;
        String str;
        File file;
        CloudContentTag contentTag;
        CloudBundle cloudBundle2;
        boolean z2;
        String str2;
        C27696o000Ooo c27696o000Ooo2;
        String str3;
        CloudContentTag cloudContentTag;
        C27696o000Ooo c27696o000Ooo3;
        CloudMetaRemote cloudMetaRemote;
        Object objOooOO0O;
        Object objOooOooo;
        InterfaceC27605OooO00o interfaceC27605OooO00o;
        ?? r8;
        CloudBundle cloudBundle3;
        CloudMetaRemote cloudMetaRemote2;
        CloudContentTag cloudContentTag2;
        Object objOooOooO;
        CloudBundle cloudBundle4 = cloudBundle;
        boolean z3 = z;
        if (abstractC32479OooO0OO instanceof o000Oo0) {
            o000oo02 = (o000Oo0) abstractC32479OooO0OO;
            int i = o000oo02.f97597OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oo02.f97597OooOooo = i - Integer.MIN_VALUE;
            } else {
                o000oo02 = new o000Oo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o000oo02.f97594OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (o000oo02.f97597OooOooo) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                id = cloudMetaLocal.getId();
                boolean deleted = cloudMetaLocal.getDeleted();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("UploadBundleUseCase");
                c20358OooO00o.OooO0o0("pushBundle called for " + id + ", contentTag=" + cloudBundle4.getContentTag() + ", metaHash=" + cloudBundle4.getMetaHash(), new Object[0]);
                int i2 = OooO00o.f97603OooO00o[cloudBundle4.getType().ordinal()];
                InterfaceC27605OooO00o interfaceC27605OooO00o2 = this.f97602OooO00o;
                if (i2 == 1) {
                    if (!deleted) {
                        return C32446OooOOOo.OooO00o(new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Cannot upload NONE bundle for non-deleted meta ", id)));
                    }
                    o000oo02.f97597OooOooo = 1;
                    Object objOooOO0 = interfaceC27605OooO00o2.OooOO0(id, o000oo02);
                    if (objOooOO0 != enumC32485OooO00o) {
                        return objOooOO0;
                    }
                } else if (i2 == 2) {
                    StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "UploadBundleUseCase", "Uploading meta-only for ", id, ", force=");
                    sbOooO00o.append(z3);
                    c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                    if (!z3) {
                        o000oo02.f97590OooOo0o = this;
                        o000oo02.f97589OooOo = cloudBundle4;
                        o000oo02.f97592OooOoO0 = id;
                        o000oo02.f97595OooOoo0 = z3;
                        o000oo02.f97597OooOooo = 2;
                        Object objOooo0 = interfaceC27605OooO00o2.Oooo0(id, o000oo02);
                        if (objOooo0 != enumC32485OooO00o) {
                            str = id;
                            obj = objOooo0;
                            c27696o000Ooo = this;
                            cloudMetaRemote = (CloudMetaRemote) obj;
                            InterfaceC27605OooO00o interfaceC27605OooO00o3 = c27696o000Ooo.f97602OooO00o;
                            o000oo02.f97590OooOo0o = c27696o000Ooo;
                            o000oo02.f97589OooOo = cloudBundle4;
                            o000oo02.f97592OooOoO0 = str;
                            o000oo02.f97591OooOoO = cloudMetaRemote;
                            o000oo02.f97595OooOoo0 = z3;
                            o000oo02.f97597OooOooo = 3;
                            objOooOO0O = interfaceC27605OooO00o3.OooOO0O(str, null, o000oo02);
                        }
                    } else {
                        c27696o000Ooo = this;
                        InterfaceC27605OooO00o interfaceC27605OooO00o4 = c27696o000Ooo.f97602OooO00o;
                        o000oo02.f97590OooOo0o = null;
                        o000oo02.f97589OooOo = null;
                        o000oo02.f97592OooOoO0 = null;
                        o000oo02.f97591OooOoO = null;
                        o000oo02.f97597OooOooo = 4;
                        objOooOooo = interfaceC27605OooO00o4.OooOooo(id, cloudBundle4, z3, o000oo02);
                        if (objOooOooo != enumC32485OooO00o) {
                            return objOooOooo;
                        }
                    }
                    break;
                } else {
                    if (i2 != 3) {
                        return C32446OooOOOo.OooO00o(new IllegalStateException("Invalid CloudBundle state: neither meta-only nor has content"));
                    }
                    file = cloudBundle4.getFile();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(file);
                    contentTag = cloudBundle4.getContentTag();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(contentTag);
                    if (!file.exists()) {
                        return C32446OooOOOo.OooO00o(new IllegalStateException(C20593OooO0Oo.OooO0O0("Bundle file ", file.getAbsolutePath(), " not found")));
                    }
                    if (z3) {
                        cloudBundle2 = cloudBundle4;
                        z2 = z3;
                        str2 = id;
                        c27696o000Ooo2 = this;
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("UploadBundleUseCase");
                        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Uploading content for ", str2, ", file=", file.getName(), ", force=");
                        sbOooO0O0.append(z2);
                        c20358OooO00o2.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                        interfaceC27605OooO00o = c27696o000Ooo2.f97602OooO00o;
                        o000oo02.f97590OooOo0o = c27696o000Ooo2;
                        o000oo02.f97589OooOo = cloudBundle2;
                        o000oo02.f97592OooOoO0 = str2;
                        r8 = 0;
                        o000oo02.f97591OooOoO = null;
                        o000oo02.f97593OooOoOO = null;
                        o000oo02.f97595OooOoo0 = z2;
                        o000oo02.f97597OooOooo = 7;
                        if (interfaceC27605OooO00o.Oooo00O(str2, contentTag, o000oo02) != enumC32485OooO00o) {
                        }
                    } else {
                        o000oo02.f97590OooOo0o = this;
                        o000oo02.f97589OooOo = cloudBundle4;
                        o000oo02.f97592OooOoO0 = id;
                        o000oo02.f97591OooOoO = file;
                        o000oo02.f97593OooOoOO = contentTag;
                        o000oo02.f97595OooOoo0 = z3;
                        o000oo02.f97597OooOooo = 5;
                        Object objOooo02 = interfaceC27605OooO00o2.Oooo0(id, o000oo02);
                        if (objOooo02 != enumC32485OooO00o) {
                            str3 = id;
                            obj = objOooo02;
                            cloudBundle2 = cloudBundle4;
                            z2 = z3;
                            cloudContentTag = contentTag;
                            c27696o000Ooo3 = this;
                            cloudMetaRemote2 = (CloudMetaRemote) obj;
                            if (cloudMetaRemote2 == null) {
                                cloudContentTag2 = cloudContentTag;
                                if (cloudMetaRemote2.getContentTag().matches(cloudBundle2.getContentTag()) && kotlin.jvm.internal.OooOOO0.OooO0O0(cloudMetaRemote2.getMetaHash(), cloudBundle2.getMetaHash())) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o3.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o3, "UploadBundleUseCase", "Skipping upload for ", str3, ", content and meta unchanged."), new Object[0]);
                                    return cloudMetaRemote2;
                                }
                                if (cloudMetaRemote2.getContentTag().matches(cloudBundle2.getContentTag())) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o4.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o4, "UploadBundleUseCase", "Uploading meta-only for ", str3, ", content unchanged"), new Object[0]);
                                    InterfaceC27605OooO00o interfaceC27605OooO00o5 = c27696o000Ooo3.f97602OooO00o;
                                    o000oo02.f97590OooOo0o = null;
                                    o000oo02.f97589OooOo = null;
                                    o000oo02.f97592OooOoO0 = null;
                                    o000oo02.f97591OooOoO = null;
                                    o000oo02.f97593OooOoOO = null;
                                    o000oo02.f97597OooOooo = 6;
                                    Object objOooOooo2 = interfaceC27605OooO00o5.OooOooo(str3, cloudBundle2, z2, o000oo02);
                                    if (objOooOooo2 != enumC32485OooO00o) {
                                        return objOooOooo2;
                                    }
                                }
                            } else {
                                cloudContentTag2 = cloudContentTag;
                            }
                            c27696o000Ooo2 = c27696o000Ooo3;
                            str2 = str3;
                            contentTag = cloudContentTag2;
                            C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o22.OooOOO0("UploadBundleUseCase");
                            StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Uploading content for ", str2, ", file=", file.getName(), ", force=");
                            sbOooO0O02.append(z2);
                            c20358OooO00o22.OooO0o0(sbOooO0O02.toString(), new Object[0]);
                            interfaceC27605OooO00o = c27696o000Ooo2.f97602OooO00o;
                            o000oo02.f97590OooOo0o = c27696o000Ooo2;
                            o000oo02.f97589OooOo = cloudBundle2;
                            o000oo02.f97592OooOoO0 = str2;
                            r8 = 0;
                            o000oo02.f97591OooOoO = null;
                            o000oo02.f97593OooOoOO = null;
                            o000oo02.f97595OooOoo0 = z2;
                            o000oo02.f97597OooOooo = 7;
                            if (interfaceC27605OooO00o.Oooo00O(str2, contentTag, o000oo02) != enumC32485OooO00o) {
                                cloudBundle3 = cloudBundle2;
                                InterfaceC27605OooO00o interfaceC27605OooO00o6 = c27696o000Ooo2.f97602OooO00o;
                                o000oo02.f97590OooOo0o = r8;
                                o000oo02.f97589OooOo = r8;
                                o000oo02.f97592OooOoO0 = r8;
                                o000oo02.f97597OooOooo = 8;
                                objOooOooO = interfaceC27605OooO00o6.OooOooO(str2, cloudBundle3, z2, o000oo02);
                                if (objOooOooO == enumC32485OooO00o) {
                                    return objOooOooO;
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                return ((C32445OooOOOO) obj).f116639OooOo0o;
            case 2:
                boolean z4 = o000oo02.f97595OooOoo0;
                String str4 = o000oo02.f97592OooOoO0;
                CloudBundle cloudBundle5 = o000oo02.f97589OooOo;
                C27696o000Ooo c27696o000Ooo4 = o000oo02.f97590OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                z3 = z4;
                cloudBundle4 = cloudBundle5;
                str = str4;
                c27696o000Ooo = c27696o000Ooo4;
                cloudMetaRemote = (CloudMetaRemote) obj;
                InterfaceC27605OooO00o interfaceC27605OooO00o32 = c27696o000Ooo.f97602OooO00o;
                o000oo02.f97590OooOo0o = c27696o000Ooo;
                o000oo02.f97589OooOo = cloudBundle4;
                o000oo02.f97592OooOoO0 = str;
                o000oo02.f97591OooOoO = cloudMetaRemote;
                o000oo02.f97595OooOoo0 = z3;
                o000oo02.f97597OooOooo = 3;
                objOooOO0O = interfaceC27605OooO00o32.OooOO0O(str, null, o000oo02);
                break;
            case 3:
                boolean z5 = o000oo02.f97595OooOoo0;
                CloudMetaRemote cloudMetaRemote3 = (CloudMetaRemote) o000oo02.f97591OooOoO;
                str = o000oo02.f97592OooOoO0;
                CloudBundle cloudBundle6 = o000oo02.f97589OooOo;
                c27696o000Ooo = o000oo02.f97590OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                z3 = z5;
                cloudBundle4 = cloudBundle6;
                objOooOO0O = obj;
                cloudMetaRemote = cloudMetaRemote3;
                CloudMetaLocal cloudMetaLocal2 = (CloudMetaLocal) objOooOO0O;
                if (cloudMetaRemote != null && cloudMetaLocal2 != null && kotlin.jvm.internal.OooOOO0.OooO0O0(cloudMetaRemote.getMetaHash(), cloudBundle4.getMetaHash()) && cloudMetaRemote.getContentTag().matches(cloudMetaLocal2.getContentTag())) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o5, "UploadBundleUseCase", "Skipping upload for ", str, ", content and meta unchanged."), new Object[0]);
                    return cloudMetaRemote;
                }
                id = str;
                InterfaceC27605OooO00o interfaceC27605OooO00o42 = c27696o000Ooo.f97602OooO00o;
                o000oo02.f97590OooOo0o = null;
                o000oo02.f97589OooOo = null;
                o000oo02.f97592OooOoO0 = null;
                o000oo02.f97591OooOoO = null;
                o000oo02.f97597OooOooo = 4;
                objOooOooo = interfaceC27605OooO00o42.OooOooo(id, cloudBundle4, z3, o000oo02);
                if (objOooOooo != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                break;
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                return ((C32445OooOOOO) obj).f116639OooOo0o;
            case 5:
                z2 = o000oo02.f97595OooOoo0;
                cloudContentTag = o000oo02.f97593OooOoOO;
                file = (File) o000oo02.f97591OooOoO;
                str3 = o000oo02.f97592OooOoO0;
                cloudBundle2 = o000oo02.f97589OooOo;
                c27696o000Ooo3 = o000oo02.f97590OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                cloudMetaRemote2 = (CloudMetaRemote) obj;
                if (cloudMetaRemote2 == null) {
                }
                c27696o000Ooo2 = c27696o000Ooo3;
                str2 = str3;
                contentTag = cloudContentTag2;
                C34406OooO00o.C20358OooO00o c20358OooO00o222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o222.OooOOO0("UploadBundleUseCase");
                StringBuilder sbOooO0O022 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Uploading content for ", str2, ", file=", file.getName(), ", force=");
                sbOooO0O022.append(z2);
                c20358OooO00o222.OooO0o0(sbOooO0O022.toString(), new Object[0]);
                interfaceC27605OooO00o = c27696o000Ooo2.f97602OooO00o;
                o000oo02.f97590OooOo0o = c27696o000Ooo2;
                o000oo02.f97589OooOo = cloudBundle2;
                o000oo02.f97592OooOoO0 = str2;
                r8 = 0;
                o000oo02.f97591OooOoO = null;
                o000oo02.f97593OooOoOO = null;
                o000oo02.f97595OooOoo0 = z2;
                o000oo02.f97597OooOooo = 7;
                if (interfaceC27605OooO00o.Oooo00O(str2, contentTag, o000oo02) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                C32446OooOOOo.OooO0O0(obj);
                return ((C32445OooOOOO) obj).f116639OooOo0o;
            case 7:
                z2 = o000oo02.f97595OooOoo0;
                str2 = o000oo02.f97592OooOoO0;
                cloudBundle3 = o000oo02.f97589OooOo;
                C27696o000Ooo c27696o000Ooo5 = o000oo02.f97590OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27696o000Ooo2 = c27696o000Ooo5;
                r8 = 0;
                InterfaceC27605OooO00o interfaceC27605OooO00o62 = c27696o000Ooo2.f97602OooO00o;
                o000oo02.f97590OooOo0o = r8;
                o000oo02.f97589OooOo = r8;
                o000oo02.f97592OooOoO0 = r8;
                o000oo02.f97597OooOooo = 8;
                objOooOooO = interfaceC27605OooO00o62.OooOooO(str2, cloudBundle3, z2, o000oo02);
                if (objOooOooO == enumC32485OooO00o) {
                }
                break;
            case 8:
                C32446OooOOOo.OooO0O0(obj);
                return ((C32445OooOOOO) obj).f116639OooOo0o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
