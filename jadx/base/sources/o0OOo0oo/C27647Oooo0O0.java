package o0OOo0oo;

import com.aspose.slides.C22201OooO0oO;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtraKt;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMime;
import com.orion.notein.domain.models.folder.Folder;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0o.C27387o0000o0;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27647Oooo0O0 implements InterfaceC27660OoooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27387o0000o0 f97234OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C28009OooOOOO f97235OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27129OoooOOO f97236OooO0OO;

    /* JADX INFO: renamed from: o0OOo0oo.Oooo0O0$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f97237OooO00o;

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
            f97237OooO00o = iArr;
        }
    }

    public C27647Oooo0O0(C27387o0000o0 noteInFileUseCase, C28009OooOOOO c28009OooOOOO, C27129OoooOOO c27129OoooOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteInFileUseCase, "noteInFileUseCase");
        this.f97234OooO00o = noteInFileUseCase;
        this.f97235OooO0O0 = c28009OooOOOO;
        this.f97236OooO0OO = c27129OoooOOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(String str, CloudBundle cloudBundle, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27642Oooo c27642Oooo;
        if (abstractC32479OooO0OO instanceof C27642Oooo) {
            c27642Oooo = (C27642Oooo) abstractC32479OooO0OO;
            int i = c27642Oooo.f97214OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27642Oooo.f97214OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27642Oooo = new C27642Oooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOoooOoO = c27642Oooo.f97213OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27642Oooo.f97214OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOoooOoO);
            File file = cloudBundle.getFile();
            if (file == null) {
                throw new IllegalStateException("Cannot restore folder without bundle file");
            }
            c27642Oooo.f97214OooOoO0 = 1;
            objOoooOoO = this.f97234OooO00o.OoooOoO(file, str, c27642Oooo);
            if (objOoooOoO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOoooOoO);
        }
        if (((Boolean) objOoooOoO).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        throw new IllegalStateException("restoreFolderFromFile() failed");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27651Oooo0oO c27651Oooo0oO;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C27651Oooo0oO) {
            c27651Oooo0oO = (C27651Oooo0oO) abstractC32479OooO0OO;
            int i = c27651Oooo0oO.f97252OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27651Oooo0oO.f97252OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27651Oooo0oO = new C27651Oooo0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c27651Oooo0oO.f97250OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27651Oooo0oO.f97252OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o0);
                C28009OooOOOO c28009OooOOOO = this.f97235OooO0O0;
                c27651Oooo0oO.f97251OooOo0o = str;
                c27651Oooo0oO.f97252OooOoO = 1;
                objOooO0o0 = c28009OooOOOO.OooO0o0(str);
                if (objOooO0o0 == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c27651Oooo0oO.f97251OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o0);
            }
            Folder folder = (Folder) objOooO0o0;
            if (folder == null) {
                objOooO00o = new CloudBundle(null, null, null, null, CloudMime.FOLDER);
            } else {
                CloudMetaExtra cloudMetaExtraFromFolder = CloudMetaExtra.INSTANCE.fromFolder(folder);
                objOooO00o = new CloudBundle(null, null, cloudMetaExtraFromFolder, CloudMetaExtraKt.computeMetaHash(cloudMetaExtraFromFolder), CloudMime.FOLDER);
            }
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "FolderBundleProcessor", "packMetaOnly FOLDER(", str, ") failed"), new Object[0]);
        }
        return objOooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (OooOO0(r8, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, CloudBundle cloudBundle, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27652Oooo0oo c27652Oooo0oo;
        Object objOooO00o;
        Throwable thOooO00o;
        if (abstractC32479OooO0OO instanceof C27652Oooo0oo) {
            c27652Oooo0oo = (C27652Oooo0oo) abstractC32479OooO0OO;
            int i = c27652Oooo0oo.f97256OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27652Oooo0oo.f97256OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27652Oooo0oo = new C27652Oooo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27652Oooo0oo.f97254OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27652Oooo0oo.f97256OooOoO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            int i3 = OooO00o.f97237OooO00o[cloudBundle.getType().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    CloudMetaExtra extra = cloudBundle.getExtra();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(extra);
                    c27652Oooo0oo.f97255OooOo0o = str;
                    c27652Oooo0oo.f97256OooOoO = 1;
                } else {
                    if (i3 != 3) {
                        throw new C32442OooOO0o();
                    }
                    c27652Oooo0oo.f97255OooOo0o = str;
                    c27652Oooo0oo.f97256OooOoO = 2;
                    if (OooO(str, cloudBundle, c27652Oooo0oo) == obj2) {
                        return obj2;
                    }
                }
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "FolderBundleProcessor", "restore FOLDER(", str, ") failed"), new Object[0]);
                }
                if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "FolderBundleProcessor", "restore FOLDER(", str, ") succeeded"), new Object[0]);
                }
                return objOooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("FolderBundleProcessor");
            c20358OooO00o3.OooO0o0("Cloud bundle type NONE; metaId=" + str + " will not be restored", new Object[0]);
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c27652Oooo0oo.f97255OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        objOooO00o = C32460OooOooO.f116667OooO00o;
        thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
        }
        if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
        }
        return objOooO00o;
    }

    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    public final Object OooO0OO(String str, Continuation<? super C32445OooOOOO<String>> continuation) {
        return "";
    }

    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    public final Object OooO0Oo(String str, CloudMetaRemote cloudMetaRemote) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27648Oooo0OO c27648Oooo0OO;
        if (abstractC32479OooO0OO instanceof C27648Oooo0OO) {
            c27648Oooo0OO = (C27648Oooo0OO) abstractC32479OooO0OO;
            int i = c27648Oooo0OO.f97240OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27648Oooo0OO.f97240OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27648Oooo0OO = new C27648Oooo0OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27648Oooo0OO.f97239OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27648Oooo0OO.f97240OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C28009OooOOOO c28009OooOOOO = this.f97235OooO0O0;
                c27648Oooo0OO.f97240OooOoO0 = 1;
                c28009OooOOOO.f99335OooO00o.OooO0O0(str);
                if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:20:0x0044, B:29:0x0061, B:31:0x0065, B:32:0x0071), top: B:53:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:20:0x0044, B:29:0x0061, B:31:0x0065, B:32:0x0071), top: B:53:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:36:0x0084, B:38:0x0089, B:39:0x00a6, B:40:0x00bc), top: B:52:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:36:0x0084, B:38:0x0089, B:39:0x00a6, B:40:0x00bc), top: B:52:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27649Oooo0o c27649Oooo0o;
        String str2;
        Throwable th;
        String str3;
        C27647Oooo0O0 c27647Oooo0O0;
        Folder folder;
        Folder folder2;
        Object cloudBundle;
        File file;
        if (abstractC32479OooO0OO instanceof C27649Oooo0o) {
            c27649Oooo0o = (C27649Oooo0o) abstractC32479OooO0OO;
            int i = c27649Oooo0o.f97245OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27649Oooo0o.f97245OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27649Oooo0o = new C27649Oooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c27649Oooo0o.f97244OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27649Oooo0o.f97245OooOoOO;
        if (i2 != 0) {
            if (i2 == 1) {
                c27647Oooo0O0 = (C27647Oooo0O0) c27649Oooo0o.f97241OooOo;
                str3 = c27649Oooo0o.f97242OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0o0);
                    folder = (Folder) objOooO0o0;
                    if (folder == null) {
                        C27387o0000o0 c27387o0000o0 = c27647Oooo0O0.f97234OooO00o;
                        c27649Oooo0o.f97242OooOo0o = str3;
                        c27649Oooo0o.f97241OooOo = folder;
                        c27649Oooo0o.f97245OooOoOO = 2;
                        Object objOooo0o0 = c27387o0000o0.Oooo0o0(folder, c27649Oooo0o);
                        if (objOooo0o0 != enumC32485OooO00o) {
                            objOooO0o0 = objOooo0o0;
                            folder2 = folder;
                            str2 = str3;
                            file = (File) objOooO0o0;
                            if (file != null) {
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    cloudBundle = new CloudBundle(null, null, null, null, CloudMime.FOLDER);
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str3;
                    cloudBundle = C32446OooOOOo.OooO00o(th);
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                folder2 = (Folder) c27649Oooo0o.f97241OooOo;
                str2 = c27649Oooo0o.f97242OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0o0);
                    file = (File) objOooO0o0;
                } catch (Throwable th3) {
                    th = th3;
                    cloudBundle = C32446OooOOOo.OooO00o(th);
                }
                if (file != null) {
                    throw new IllegalStateException("FolderFile for " + str2 + " build failed");
                }
                CloudMetaExtra cloudMetaExtraFromFolder = CloudMetaExtra.INSTANCE.fromFolder(folder2);
                cloudBundle = new CloudBundle(file, CloudContentTag.INSTANCE.from(file, folder2.getLastModificationTime()), cloudMetaExtraFromFolder, CloudMetaExtraKt.computeMetaHash(cloudMetaExtraFromFolder), CloudMime.FOLDER);
                str3 = str2;
            }
            cloudBundle = C32446OooOOOo.OooO00o(th);
            str3 = str2;
        } else {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            try {
                C28009OooOOOO c28009OooOOOO = this.f97235OooO0O0;
                c27649Oooo0o.f97242OooOo0o = str;
                c27649Oooo0o.f97241OooOo = this;
                c27649Oooo0o.f97245OooOoOO = 1;
                objOooO0o0 = c28009OooOOOO.OooO0o0(str);
                if (objOooO0o0 != enumC32485OooO00o) {
                    str3 = str;
                    c27647Oooo0O0 = this;
                    folder = (Folder) objOooO0o0;
                    if (folder == null) {
                    }
                }
                return enumC32485OooO00o;
            } catch (Throwable th4) {
                str2 = str;
                th = th4;
                cloudBundle = C32446OooOOOo.OooO00o(th);
            }
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(cloudBundle);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "FolderBundleProcessor", "pack FOLDER(", str3, ") failed"), new Object[0]);
        }
        return cloudBundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, CloudMetaExtra cloudMetaExtra, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27655OoooO00 c27655OoooO00;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C27655OoooO00) {
            c27655OoooO00 = (C27655OoooO00) abstractC32479OooO0OO;
            int i = c27655OoooO00.f97270OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27655OoooO00.f97270OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27655OoooO00 = new C27655OoooO00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27655OoooO00.f97268OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27655OoooO00.f97270OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c27655OoooO00.f97269OooOo0o = str;
                c27655OoooO00.f97270OooOoO = 1;
                if (OooOO0(str, cloudMetaExtra, c27655OoooO00) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c27655OoooO00.f97269OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "FolderBundleProcessor", "restoreMetaOnly FOLDER(", str, ") failed"), new Object[0]);
        }
        if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "FolderBundleProcessor", "restoreMetaOnly FOLDER(", str, ") succeeded"), new Object[0]);
        }
        return objOooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27650Oooo0o0 c27650Oooo0o0;
        if (abstractC32479OooO0OO instanceof C27650Oooo0o0) {
            c27650Oooo0o0 = (C27650Oooo0o0) abstractC32479OooO0OO;
            int i = c27650Oooo0o0.f97248OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27650Oooo0o0.f97248OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27650Oooo0o0 = new C27650Oooo0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c27650Oooo0o0.f97246OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27650Oooo0o0.f97248OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o0);
                C28009OooOOOO c28009OooOOOO = this.f97235OooO0O0;
                c27650Oooo0o0.f97247OooOo0o = str;
                c27650Oooo0o0.f97248OooOoO = 1;
                objOooO0o0 = c28009OooOOOO.OooO0o0(str);
                if (objOooO0o0 == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c27650Oooo0o0.f97247OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o0);
            }
            Folder folder = (Folder) objOooO0o0;
            if (folder != null) {
                return CloudContentTag.INSTANCE.fromLastModified(folder.getLastModificationTime());
            }
            throw new IllegalStateException("Folder for " + str + " not found");
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        if (r7.f97235OooO0O0.OooO00o(r1, r3) == r4) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, CloudMetaExtra cloudMetaExtra, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27654OoooO0 c27654OoooO0;
        CloudMetaExtra cloudMetaExtra2;
        Object objOooO0o0;
        C27647Oooo0O0 c27647Oooo0O0;
        String str2 = str;
        if (abstractC32479OooO0OO instanceof C27654OoooO0) {
            c27654OoooO0 = (C27654OoooO0) abstractC32479OooO0OO;
            int i = c27654OoooO0.f97267OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27654OoooO0.f97267OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27654OoooO0 = new C27654OoooO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27654OoooO0.f97264OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27654OoooO0.f97267OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27654OoooO0.f97263OooOo0o = this;
            c27654OoooO0.f97262OooOo = str2;
            cloudMetaExtra2 = cloudMetaExtra;
            c27654OoooO0.f97265OooOoO0 = cloudMetaExtra2;
            c27654OoooO0.f97267OooOoo0 = 1;
            objOooO0o0 = this.f97235OooO0O0.OooO0o0(str2);
            if (objOooO0o0 != enumC32485OooO00o) {
                c27647Oooo0O0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        CloudMetaExtra cloudMetaExtra3 = c27654OoooO0.f97265OooOoO0;
        String str3 = c27654OoooO0.f97262OooOo;
        c27647Oooo0O0 = c27654OoooO0.f97263OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        cloudMetaExtra2 = cloudMetaExtra3;
        str2 = str3;
        objOooO0o0 = obj;
        Folder folder = (Folder) objOooO0o0;
        if (folder == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "FolderBundleProcessor", "Folder for ", str2, " not found; skip meta-only restore"), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        String strOooO0Oo = c27647Oooo0O0.f97236OooO0OO.OooO0Oo();
        String strResolvedParentId = cloudMetaExtra2.resolvedParentId(folder.getParentId());
        String title = cloudMetaExtra2.getTitle();
        if (title == null) {
            title = folder.getTitle();
        }
        String str4 = title;
        Boolean inTrashBin = cloudMetaExtra2.getInTrashBin();
        boolean zBooleanValue = inTrashBin != null ? inTrashBin.booleanValue() : folder.getInTrashBin();
        Boolean favorite = cloudMetaExtra2.getFavorite();
        boolean zBooleanValue2 = favorite != null ? favorite.booleanValue() : folder.getFavorite();
        Long lastModificationTime = cloudMetaExtra2.getLastModificationTime();
        Folder folderCopy = folder.copy((3583 & 1) != 0 ? folder.id : null, (3583 & 2) != 0 ? folder.userId : strOooO0Oo, (3583 & 4) != 0 ? folder.parentId : strResolvedParentId, (3583 & 8) != 0 ? folder.recoverParentId : null, (3583 & 16) != 0 ? folder.title : str4, (3583 & 32) != 0 ? folder.favorite : zBooleanValue2, (3583 & 64) != 0 ? folder.inTrashBin : zBooleanValue, (3583 & 128) != 0 ? folder.creationTime : 0L, (3583 & 256) != 0 ? folder.lastModificationTime : lastModificationTime != null ? lastModificationTime.longValue() : folder.getLastModificationTime(), (3583 & 512) != 0 ? folder.tnPath : null, (3583 & 1024) != 0 ? folder.sortKey : null, (3583 & 2048) != 0 ? folder.coverColor : null);
        c27654OoooO0.f97263OooOo0o = null;
        c27654OoooO0.f97262OooOo = null;
        c27654OoooO0.f97265OooOoO0 = null;
        c27654OoooO0.f97267OooOoo0 = 2;
    }
}
