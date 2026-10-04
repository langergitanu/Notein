package o0OOo0oo;

import com.aspose.slides.C22201OooO0oO;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtraKt;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMime;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0OOOO00.C27095OooOo0O;
import o0OOo0o.C27387o0000o0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.o0000o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27685o0000o0O implements InterfaceC27660OoooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27387o0000o0 f97535OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27095OooOo0O f97536OooO0O0;

    /* JADX INFO: renamed from: o0OOo0oo.o0000o0O$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f97537OooO00o;

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
            f97537OooO00o = iArr;
        }
    }

    public C27685o0000o0O(C27387o0000o0 noteInFileUseCase, C27095OooOo0O c27095OooOo0O) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteInFileUseCase, "noteInFileUseCase");
        this.f97535OooO00o = noteInFileUseCase;
        this.f97536OooO0O0 = c27095OooOo0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(String str, CloudBundle cloudBundle, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27692o0000oo0 c27692o0000oo0;
        if (abstractC32479OooO0OO instanceof C27692o0000oo0) {
            c27692o0000oo0 = (C27692o0000oo0) abstractC32479OooO0OO;
            int i = c27692o0000oo0.f97564OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27692o0000oo0.f97564OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27692o0000oo0 = new C27692o0000oo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOoooo0o = c27692o0000oo0.f97563OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27692o0000oo0.f97564OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOoooo0o);
            File file = cloudBundle.getFile();
            if (file == null) {
                throw new IllegalStateException("Cannot restore template without bundle file");
            }
            c27692o0000oo0.f97564OooOoO0 = 1;
            objOoooo0o = this.f97535OooO00o.Ooooo0o(file, str, c27692o0000oo0);
            if (objOoooo0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOoooo0o);
        }
        if (((Boolean) objOoooo0o).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        throw new IllegalStateException("restoreTemplateByFile() failed");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27689o0000oOO c27689o0000oOO;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C27689o0000oOO) {
            c27689o0000oOO = (C27689o0000oOO) abstractC32479OooO0OO;
            int i = c27689o0000oOO.f97552OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27689o0000oOO.f97552OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27689o0000oOO = new C27689o0000oOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c27689o0000oOO.f97550OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27689o0000oOO.f97552OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooOOO0);
                C27095OooOo0O c27095OooOo0O = this.f97536OooO0O0;
                c27689o0000oOO.f97551OooOo0o = str;
                c27689o0000oOO.f97552OooOoO = 1;
                objOooOOO0 = c27095OooOo0O.OooOOO0(str, c27689o0000oOO);
                if (objOooOOO0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c27689o0000oOO.f97551OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
            }
            MyTemplate myTemplate = (MyTemplate) objOooOOO0;
            if (myTemplate == null) {
                objOooO00o = new CloudBundle(null, null, null, null, CloudMime.TEMPLATE);
            } else {
                CloudMetaExtra cloudMetaExtraFromTemplate = CloudMetaExtra.INSTANCE.fromTemplate(myTemplate);
                objOooO00o = new CloudBundle(null, null, cloudMetaExtraFromTemplate, CloudMetaExtraKt.computeMetaHash(cloudMetaExtraFromTemplate), CloudMime.TEMPLATE);
            }
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "TemplateBundleProcessor", "packMetaOnly TEMPLATE(", str, ") failed"), new Object[0]);
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
        C27690o0000oOo c27690o0000oOo;
        Object objOooO00o;
        Throwable thOooO00o;
        if (abstractC32479OooO0OO instanceof C27690o0000oOo) {
            c27690o0000oOo = (C27690o0000oOo) abstractC32479OooO0OO;
            int i = c27690o0000oOo.f97556OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27690o0000oOo.f97556OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27690o0000oOo = new C27690o0000oOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27690o0000oOo.f97554OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27690o0000oOo.f97556OooOoO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            int i3 = OooO00o.f97537OooO00o[cloudBundle.getType().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    CloudMetaExtra extra = cloudBundle.getExtra();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(extra);
                    c27690o0000oOo.f97555OooOo0o = str;
                    c27690o0000oOo.f97556OooOoO = 1;
                } else {
                    if (i3 != 3) {
                        throw new C32442OooOO0o();
                    }
                    c27690o0000oOo.f97555OooOo0o = str;
                    c27690o0000oOo.f97556OooOoO = 2;
                    if (OooO(str, cloudBundle, c27690o0000oOo) == obj2) {
                        return obj2;
                    }
                }
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "TemplateBundleProcessor", "restore TEMPLATE(", str, ") failed"), new Object[0]);
                }
                if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "TemplateBundleProcessor", "restore TEMPLATE(", str, ") succeeded"), new Object[0]);
                }
                return objOooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("TemplateBundleProcessor");
            c20358OooO00o3.OooO0o0("Cloud bundle type NONE; metaId=" + str + " will not be restored", new Object[0]);
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c27690o0000oOo.f97555OooOo0o;
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
        C27686o0000o0o c27686o0000o0o;
        if (abstractC32479OooO0OO instanceof C27686o0000o0o) {
            c27686o0000o0o = (C27686o0000o0o) abstractC32479OooO0OO;
            int i = c27686o0000o0o.f97540OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27686o0000o0o.f97540OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27686o0000o0o = new C27686o0000o0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27686o0000o0o.f97539OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27686o0000o0o.f97540OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27095OooOo0O c27095OooOo0O = this.f97536OooO0O0;
                c27686o0000o0o.f97540OooOoO0 = 1;
                if (c27095OooOo0O.OooO0O0(str, c27686o0000o0o) == enumC32485OooO00o) {
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:20:0x0048, B:29:0x0064, B:31:0x0068, B:32:0x0074), top: B:52:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:20:0x0048, B:29:0x0064, B:31:0x0068, B:32:0x0074), top: B:52:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27688o0000oO0 c27688o0000oO0;
        String str2;
        Throwable th;
        C27685o0000o0O c27685o0000o0O;
        MyTemplate myTemplate;
        Object obj;
        String str3;
        Object cloudBundle;
        File file;
        if (abstractC32479OooO0OO instanceof C27688o0000oO0) {
            c27688o0000oO0 = (C27688o0000oO0) abstractC32479OooO0OO;
            int i = c27688o0000oO0.f97549OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27688o0000oO0.f97549OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27688o0000oO0 = new C27688o0000oO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c27688o0000oO0.f97548OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27688o0000oO0.f97549OooOoOO;
        if (i2 != 0) {
            if (i2 == 1) {
                c27685o0000o0O = (C27685o0000o0O) c27688o0000oO0.f97545OooOo;
                str2 = c27688o0000oO0.f97546OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooOOO0);
                    myTemplate = (MyTemplate) objOooOOO0;
                    if (myTemplate == null) {
                        C27387o0000o0 c27387o0000o0 = c27685o0000o0O.f97535OooO00o;
                        c27688o0000oO0.f97546OooOo0o = str2;
                        c27688o0000oO0.f97545OooOo = myTemplate;
                        c27688o0000oO0.f97549OooOoOO = 2;
                        Object objOoooO0 = c27387o0000o0.OoooO0(myTemplate, c27688o0000oO0);
                        if (objOoooO0 != enumC32485OooO00o) {
                            obj = objOoooO0;
                            str3 = str2;
                            file = (File) obj;
                            if (file != null) {
                            }
                            throw new IllegalArgumentException(("MyTemplateFile for " + str3 + " build failed").toString());
                        }
                        return enumC32485OooO00o;
                    }
                    cloudBundle = new CloudBundle(null, null, null, null, CloudMime.TEMPLATE);
                } catch (Throwable th2) {
                    th = th2;
                    cloudBundle = C32446OooOOOo.OooO00o(th);
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MyTemplate myTemplate2 = (MyTemplate) c27688o0000oO0.f97545OooOo;
                String str4 = c27688o0000oO0.f97546OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooOOO0);
                    obj = objOooOOO0;
                    myTemplate = myTemplate2;
                    str3 = str4;
                    file = (File) obj;
                    if (file != null || !file.exists()) {
                        throw new IllegalArgumentException(("MyTemplateFile for " + str3 + " build failed").toString());
                    }
                    CloudMetaExtra cloudMetaExtraFromTemplate = CloudMetaExtra.INSTANCE.fromTemplate(myTemplate);
                    CloudBundle cloudBundle2 = new CloudBundle(file, CloudContentTag.INSTANCE.from(file, myTemplate.getLastModificationTime()), cloudMetaExtraFromTemplate, CloudMetaExtraKt.computeMetaHash(cloudMetaExtraFromTemplate), CloudMime.TEMPLATE);
                    str2 = str3;
                    cloudBundle = cloudBundle2;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str4;
                    cloudBundle = C32446OooOOOo.OooO00o(th);
                }
            }
            cloudBundle = C32446OooOOOo.OooO00o(th);
        } else {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            try {
                C27095OooOo0O c27095OooOo0O = this.f97536OooO0O0;
                c27688o0000oO0.f97546OooOo0o = str;
                c27688o0000oO0.f97545OooOo = this;
                c27688o0000oO0.f97549OooOoOO = 1;
                objOooOOO0 = c27095OooOo0O.OooOOO0(str, c27688o0000oO0);
                if (objOooOOO0 != enumC32485OooO00o) {
                    str2 = str;
                    c27685o0000o0O = this;
                    myTemplate = (MyTemplate) objOooOOO0;
                    if (myTemplate == null) {
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
            c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "TemplateBundleProcessor", "pack TEMPLATE(", str2, ") failed"), new Object[0]);
        }
        return cloudBundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, CloudMetaExtra cloudMetaExtra, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27693o0000ooO c27693o0000ooO;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C27693o0000ooO) {
            c27693o0000ooO = (C27693o0000ooO) abstractC32479OooO0OO;
            int i = c27693o0000ooO.f97567OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27693o0000ooO.f97567OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27693o0000ooO = new C27693o0000ooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27693o0000ooO.f97565OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27693o0000ooO.f97567OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c27693o0000ooO.f97566OooOo0o = str;
                c27693o0000ooO.f97567OooOoO = 1;
                if (OooOO0(str, cloudMetaExtra, c27693o0000ooO) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c27693o0000ooO.f97566OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "TemplateBundleProcessor", "restoreMetaOnly TEMPLATE(", str, ") failed"), new Object[0]);
        }
        if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "TemplateBundleProcessor", "restoreMetaOnly TEMPLATE(", str, ") succeeded"), new Object[0]);
        }
        return objOooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27683o0000o c27683o0000o;
        if (abstractC32479OooO0OO instanceof C27683o0000o) {
            c27683o0000o = (C27683o0000o) abstractC32479OooO0OO;
            int i = c27683o0000o.f97530OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27683o0000o.f97530OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27683o0000o = new C27683o0000o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c27683o0000o.f97528OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27683o0000o.f97530OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooOOO0);
                C27095OooOo0O c27095OooOo0O = this.f97536OooO0O0;
                c27683o0000o.f97529OooOo0o = str;
                c27683o0000o.f97530OooOoO = 1;
                objOooOOO0 = c27095OooOo0O.OooOOO0(str, c27683o0000o);
                if (objOooOOO0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c27683o0000o.f97529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
            }
            MyTemplate myTemplate = (MyTemplate) objOooOOO0;
            if (myTemplate != null) {
                return CloudContentTag.INSTANCE.fromLastModified(myTemplate.getLastModificationTime());
            }
            throw new IllegalStateException("MyTemplate for " + str + " not found");
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (r7.f97536OooO0O0.OooO00o(new com.orion.notein.domain.models.papertheme.MyTemplate[]{r1}, r3) == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, CloudMetaExtra cloudMetaExtra, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000 o000Var;
        CloudMetaExtra cloudMetaExtra2;
        Object objOooOOO0;
        C27685o0000o0O c27685o0000o0O;
        String str2 = str;
        if (abstractC32479OooO0OO instanceof o000) {
            o000Var = (o000) abstractC32479OooO0OO;
            int i = o000Var.f97350OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000Var.f97350OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o000Var = new o000(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o000Var.f97347OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000Var.f97350OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o000Var.f97346OooOo0o = this;
            o000Var.f97345OooOo = str2;
            cloudMetaExtra2 = cloudMetaExtra;
            o000Var.f97348OooOoO0 = cloudMetaExtra2;
            o000Var.f97350OooOoo0 = 1;
            objOooOOO0 = this.f97536OooO0O0.OooOOO0(str2, o000Var);
            if (objOooOOO0 != enumC32485OooO00o) {
                c27685o0000o0O = this;
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
        CloudMetaExtra cloudMetaExtra3 = o000Var.f97348OooOoO0;
        String str3 = o000Var.f97345OooOo;
        c27685o0000o0O = o000Var.f97346OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        cloudMetaExtra2 = cloudMetaExtra3;
        str2 = str3;
        objOooOOO0 = obj;
        MyTemplate myTemplate = (MyTemplate) objOooOOO0;
        if (myTemplate == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "TemplateBundleProcessor", "MyTemplate for ", str2, " not found; skip meta-only restore"), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        String title = cloudMetaExtra2.getTitle();
        if (title == null) {
            title = myTemplate.getName();
        }
        String str4 = title;
        Long lastModificationTime = cloudMetaExtra2.getLastModificationTime();
        MyTemplate myTemplateCopy$default = MyTemplate.copy$default(myTemplate, null, null, null, 0L, lastModificationTime != null ? lastModificationTime.longValue() : myTemplate.getLastModificationTime(), str4, 15, null);
        o000Var.f97346OooOo0o = null;
        o000Var.f97345OooOo = null;
        o000Var.f97348OooOoO0 = null;
        o000Var.f97350OooOoo0 = 2;
    }
}
