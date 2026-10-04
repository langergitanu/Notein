package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import java.io.File;
import java.util.Map;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33595OooOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f97578OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<CloudMetaType, InterfaceC27660OoooOo0> f97579OooO0O0;

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f97580OooO00o;

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
            f97580OooO00o = iArr;
        }
    }

    public o000OO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, Map map) {
        this.f97578OooO00o = abstractApplicationC26277OooOoOO;
        this.f97579OooO0O0 = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [com.orion.notein.domain.models.cloudsync.CloudMetaLocal] */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.orion.notein.domain.models.cloudsync.CloudMetaLocal] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.orion.notein.domain.models.cloudsync.CloudMetaLocal] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r33v0, types: [o0OOo0oo.o000OO] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.orion.notein.domain.models.cloudsync.CloudBundle] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.orion.notein.domain.models.cloudsync.CloudBundle] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.orion.notein.domain.models.cloudsync.CloudBundle] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, o0OOo0oo.o000OO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(CloudMetaLocal cloudMetaLocal, CloudBundle cloudBundle, CloudMetaRemote cloudMetaRemote, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0000O o0000o2;
        Object objOooO00o;
        ?? r16;
        ?? r5;
        ?? r3;
        Throwable thOooO00o;
        File file;
        Object objOooO0O0;
        ?? r32;
        ?? r2;
        Object objOooO0OO;
        ?? r33;
        ?? r22;
        ?? r52;
        ?? r162;
        ?? r53;
        ?? r23 = cloudMetaLocal;
        ?? r34 = cloudBundle;
        CloudMetaRemote cloudMetaRemote2 = cloudMetaRemote;
        ?? r54 = "Cannot restore NONE bundle for non-deleted meta ";
        if (abstractC32479OooO0OO instanceof o0000O) {
            o0000o2 = (o0000O) abstractC32479OooO0OO;
            int i = o0000o2.f97432OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0000o2.f97432OooOoo = i - Integer.MIN_VALUE;
            } else {
                o0000o2 = new o0000O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o0000o2.f97431OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0000o2.f97432OooOoo;
        try {
            if (i2 != 0) {
                try {
                    if (i2 == 1) {
                        cloudMetaRemote2 = o0000o2.f97429OooOoO;
                        CloudBundle cloudBundle2 = o0000o2.f97430OooOoO0;
                        CloudMetaLocal cloudMetaLocal2 = o0000o2.f97427OooOo;
                        o000OO o000oo2 = o0000o2.f97428OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
                        r32 = cloudBundle2;
                        r2 = cloudMetaLocal2;
                        r52 = o000oo2;
                        C32446OooOOOo.OooO0O0(objOooO0O0);
                        r23 = r2;
                        r34 = r32;
                        r54 = r52;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cloudMetaRemote2 = o0000o2.f97429OooOoO;
                        CloudBundle cloudBundle3 = o0000o2.f97430OooOoO0;
                        CloudMetaLocal cloudMetaLocal3 = o0000o2.f97427OooOo;
                        o000OO o000oo3 = o0000o2.f97428OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        objOooO0OO = ((C32445OooOOOO) obj).f116639OooOo0o;
                        r33 = cloudBundle3;
                        r22 = cloudMetaLocal3;
                        r53 = o000oo3;
                        C32446OooOOOo.OooO0O0(objOooO0OO);
                        r23 = r22;
                        r34 = r33;
                        r54 = r53;
                    }
                } catch (Throwable th) {
                    th = th;
                    r34 = r23;
                    r23 = r34;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    r16 = r23;
                    r3 = r34;
                    r5 = r54;
                    Object obj2 = objOooO00o;
                    thOooO00o = C32445OooOOOO.OooO00o(obj2);
                    if (thOooO00o != null) {
                    }
                    file = r3.getFile();
                    if (file != null) {
                    }
                    return obj2;
                }
            } else {
                C32446OooOOOo.OooO0O0(obj);
                try {
                    String id = r23.getId();
                    int i3 = OooO00o.f97580OooO00o[r34.getType().ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("RestoreBundleUseCase");
                            c20358OooO00o.OooO0o0("Meta-only restore for " + id, new Object[0]);
                            o0000o2.f97428OooOo0o = this;
                            o0000o2.f97427OooOo = r23;
                            o0000o2.f97430OooOoO0 = r34;
                            o0000o2.f97429OooOoO = cloudMetaRemote2;
                            o0000o2.f97432OooOoo = 1;
                            objOooO0O0 = OooO0O0(r23, r34, o0000o2);
                            if (objOooO0O0 != enumC32485OooO00o) {
                                r52 = this;
                                r2 = r23;
                                r32 = r34;
                                C32446OooOOOo.OooO0O0(objOooO0O0);
                                r23 = r2;
                                r34 = r32;
                                r54 = r52;
                            }
                        } else {
                            if (i3 != 3) {
                                throw new C32442OooOO0o();
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("RestoreBundleUseCase");
                            c20358OooO00o2.OooO0o0("Full restore for " + id, new Object[0]);
                            o0000o2.f97428OooOo0o = this;
                            o0000o2.f97427OooOo = r23;
                            o0000o2.f97430OooOoO0 = r34;
                            o0000o2.f97429OooOoO = cloudMetaRemote2;
                            o0000o2.f97432OooOoo = 2;
                            objOooO0OO = OooO0OO(r23, r34, false, o0000o2);
                            if (objOooO0OO != enumC32485OooO00o) {
                                r53 = this;
                                r22 = r23;
                                r33 = r34;
                                C32446OooOOOo.OooO0O0(objOooO0OO);
                                r23 = r22;
                                r34 = r33;
                                r54 = r53;
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("RestoreBundleUseCase");
                    c20358OooO00o3.OooO0o0("Restore NONE bundle for " + id + ": marking local meta as deleted", new Object[0]);
                    if (!cloudMetaRemote2.getDeleted()) {
                        throw new IllegalStateException("Cannot restore NONE bundle for non-deleted meta " + id);
                    }
                    r54 = this;
                } catch (Throwable th2) {
                    th = th2;
                    r54 = this;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    r16 = r23;
                    r3 = r34;
                    r5 = r54;
                    Object obj22 = objOooO00o;
                    thOooO00o = C32445OooOOOO.OooO00o(obj22);
                    if (thOooO00o != null) {
                    }
                    file = r3.getFile();
                    if (file != null) {
                    }
                    return obj22;
                }
            }
            r162 = r23;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            objOooO00o = CloudMetaLocal.copy$default(r162, null, null, null, cloudMetaRemote2.getMetaVersion(), cloudMetaRemote2.getContentTag(), cloudMetaRemote2.getMetaHash(), null, null, (cloudMetaRemote2.getDeleted() || r34.getType() != CloudBundle.BundleType.CONTENT_AND_META) ? r162.getDeleted() : false, cloudMetaRemote2.getDeleted(), Math.max(cloudMetaRemote2.getLastSyncTime(), r162.getLastModificationTime()), null, 135, null);
            r3 = r34;
            r5 = r54;
            r16 = r162;
        } catch (Throwable th4) {
            th = th4;
            r23 = r162;
            objOooO00o = C32446OooOOOo.OooO00o(th);
            r16 = r23;
            r3 = r34;
            r5 = r54;
        }
        Object obj222 = objOooO00o;
        thOooO00o = C32445OooOOOO.OooO00o(obj222);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("RestoreBundleUseCase");
            c20358OooO00o4.OooO0Oo(thOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("RestoreBundleUseCase failed for ", r16.getId()), new Object[0]);
        }
        file = r3.getFile();
        if (file != null) {
            r5.getClass();
            try {
                String canonicalPath = new File(r5.f97578OooO00o.getFilesDir(), "cloud_cache_dir").getCanonicalPath();
                String canonicalPath2 = file.getCanonicalPath();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(canonicalPath2);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(canonicalPath);
                if (C33595OooOOo.OooOoO0(canonicalPath2, canonicalPath, false)) {
                    file.delete();
                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5.OooOOO0("RestoreBundleUseCase");
                    c20358OooO00o5.OooO00o("cache file deleted: ".concat(canonicalPath2), new Object[0]);
                }
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o6.OooOOO0("RestoreBundleUseCase");
                c20358OooO00o6.OooOO0o(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("failed to delete cache file: ", file.getPath()), new Object[0]);
            }
        }
        return obj222;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(CloudMetaLocal cloudMetaLocal, CloudBundle cloudBundle, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0000OO0 o0000oo02;
        Object objOooO0oO;
        if (abstractC32479OooO0OO instanceof o0000OO0) {
            o0000oo02 = (o0000OO0) abstractC32479OooO0OO;
            int i = o0000oo02.f97455OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0000oo02.f97455OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                o0000oo02 = new o0000OO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o0000oo02.f97454OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0000oo02.f97455OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String id = cloudMetaLocal.getId();
                if (cloudMetaLocal.getDeleted()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("RestoreBundleUseCase");
                    c20358OooO00o.OooO0o0("Local meta is deleted for " + id + ", skipping meta-only restore", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(cloudBundle.getMimeType());
                kotlin.jvm.internal.OooOOO0.OooO0Oo(cloudMetaTypeFromMime);
                InterfaceC27660OoooOo0 interfaceC27660OoooOo0 = this.f97579OooO0O0.get(cloudMetaTypeFromMime);
                if (interfaceC27660OoooOo0 == null) {
                    throw new IllegalStateException("No bundle processor registered for " + cloudMetaTypeFromMime);
                }
                if (OooO00o.f97580OooO00o[cloudBundle.getType().ordinal()] != 2) {
                    throw new IllegalStateException("restoreMetaOnly called with non META_ONLY bundle for " + id);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("RestoreBundleUseCase");
                c20358OooO00o2.OooO0o0("Meta-only restore for " + id, new Object[0]);
                CloudMetaExtra extra = cloudBundle.getExtra();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(extra);
                o0000oo02.f97455OooOoO0 = 1;
                objOooO0oO = interfaceC27660OoooOo0.OooO0oO(id, extra, o0000oo02);
                if (objOooO0oO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooO0oO = ((C32445OooOOOO) obj).f116639OooOo0o;
            }
            C32446OooOOOo.OooO0O0(objOooO0oO);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(CloudMetaLocal cloudMetaLocal, CloudBundle cloudBundle, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0000OO o0000oo2;
        Object objOooO0O0;
        if (abstractC32479OooO0OO instanceof o0000OO) {
            o0000oo2 = (o0000OO) abstractC32479OooO0OO;
            int i = o0000oo2.f97452OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0000oo2.f97452OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                o0000oo2 = new o0000OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o0000oo2.f97451OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0000oo2.f97452OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String id = cloudMetaLocal.getId();
                CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(cloudBundle.getMimeType());
                kotlin.jvm.internal.OooOOO0.OooO0Oo(cloudMetaTypeFromMime);
                InterfaceC27660OoooOo0 interfaceC27660OoooOo0 = this.f97579OooO0O0.get(cloudMetaTypeFromMime);
                if (interfaceC27660OoooOo0 == null) {
                    throw new IllegalStateException("No bundle processor registered for " + cloudMetaTypeFromMime);
                }
                if (OooO00o.f97580OooO00o[cloudBundle.getType().ordinal()] != 3) {
                    throw new IllegalStateException("restoreMetaAndContent called with non CONTENT_AND_META bundle for " + id);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("RestoreBundleUseCase");
                c20358OooO00o.OooO0o0("- Full restore for " + id, new Object[0]);
                o0000oo2.f97452OooOoO0 = 1;
                objOooO0O0 = interfaceC27660OoooOo0.OooO0O0(id, cloudBundle, z, o0000oo2);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }
}
