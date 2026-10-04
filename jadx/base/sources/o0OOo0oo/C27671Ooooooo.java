package o0OOo0oo;

import android.net.Uri;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtraKt;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMime;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.note.NoteFile;
import com.orion.notein.domain.models.note.NoteInFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import java.io.File;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o.C27387o0000o0;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27604oooo00o;
import o0OOo0o.o00O000o;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27671Ooooooo implements InterfaceC27660OoooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27387o0000o0 f97331OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27449o00O0OoO f97332OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f97333OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27309OooOoO f97334OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27129OoooOOO f97335OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97336OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f97337OooO0oO;

    /* JADX INFO: renamed from: o0OOo0oo.Ooooooo$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f97338OooO00o;

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
            f97338OooO00o = iArr;
        }
    }

    /* JADX INFO: renamed from: o0OOo0oo.Ooooooo$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.NoteBundleProcessor", m80623f = "CloudBundleProcessor.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT, StyleIdentifier.GRID_TABLE_7_COLORFUL, StyleIdentifier.GRID_TABLE_4_ACCENT_1}, m80625m = "duplicate-gIAlu-s")
    public static final class OooO0O0 extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Object f97339OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public String f97340OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Object f97341OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public String f97342OooOoO0;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f97344OooOoo0;

        public OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
            super(abstractC32479OooO0OO);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f97341OooOoO = obj;
            this.f97344OooOoo0 |= Integer.MIN_VALUE;
            Object objOooO0OO = C27671Ooooooo.this.OooO0OO(null, this);
            return objOooO0OO == EnumC32485OooO00o.f116726OooOo0o ? objOooO0OO : new C32445OooOOOO(objOooO0OO);
        }
    }

    public C27671Ooooooo(C27387o0000o0 noteInFileUseCase, C27449o00O0OoO c27449o00O0OoO, InterfaceC27313OooOoo0 noteMetaRepo, InterfaceC27309OooOoO noteContent, InterfaceC27605OooO00o cloudSyncRepo, C27129OoooOOO c27129OoooOOO, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteInFileUseCase, "noteInFileUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteContent, "noteContent");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        this.f97331OooO00o = noteInFileUseCase;
        this.f97332OooO0O0 = c27449o00O0OoO;
        this.f97333OooO0OO = noteMetaRepo;
        this.f97334OooO0Oo = noteContent;
        this.f97336OooO0o0 = cloudSyncRepo;
        this.f97335OooO0o = c27129OoooOOO;
        this.f97337OooO0oO = abstractApplicationC26277OooOoOO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
    
        if (r2 == r4) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(String str, CloudBundle cloudBundle, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27697o00o0O c27697o00o0O;
        File file;
        CloudBundle cloudBundle2;
        String str2;
        boolean z2;
        CloudMetaExtra cloudMetaExtra;
        C27671Ooooooo c27671Ooooooo;
        if (abstractC32479OooO0OO instanceof C27697o00o0O) {
            c27697o00o0O = (C27697o00o0O) abstractC32479OooO0OO;
            int i = c27697o00o0O.f97633OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27697o00o0O.f97633OooOooo = i - Integer.MIN_VALUE;
            } else {
                c27697o00o0O = new C27697o00o0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27697o00o0O.f97630OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27697o00o0O.f97633OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            CloudMetaExtra extra = cloudBundle.getExtra();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(extra);
            file = cloudBundle.getFile();
            if (file == null) {
                throw new IllegalStateException("Cannot restore note without bundle file");
            }
            c27697o00o0O.f97626OooOo0o = this;
            c27697o00o0O.f97625OooOo = str;
            cloudBundle2 = cloudBundle;
            c27697o00o0O.f97628OooOoO0 = cloudBundle2;
            c27697o00o0O.f97627OooOoO = extra;
            c27697o00o0O.f97629OooOoOO = file;
            c27697o00o0O.f97631OooOoo0 = z;
            c27697o00o0O.f97633OooOooo = 1;
            Object objOooOO0O = this.f97334OooO0Oo.OooOO0O(str, c27697o00o0O);
            if (objOooOO0O != enumC32485OooO00o) {
                str2 = str;
                z2 = z;
                cloudMetaExtra = extra;
                objOooO0o = objOooOO0O;
                c27671Ooooooo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (((NoteMeta) objOooO0o) != null) {
                return C32460OooOooO.f116667OooO00o;
            }
            throw new IllegalStateException("restoreNoteByNoteFile() returned null");
        }
        z2 = c27697o00o0O.f97631OooOoo0;
        file = c27697o00o0O.f97629OooOoOO;
        cloudMetaExtra = c27697o00o0O.f97627OooOoO;
        cloudBundle2 = c27697o00o0O.f97628OooOoO0;
        str2 = c27697o00o0O.f97625OooOo;
        c27671Ooooooo = c27697o00o0O.f97626OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        Long l = (Long) objOooO0o;
        long jLongValue = l != null ? l.longValue() : 0L;
        CloudContentTag contentTag = cloudBundle2.getContentTag();
        if (!z2 && contentTag != null && contentTag.isLastModifiedOldThan(jLongValue)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteBundleProcessor", "Local note ", str2, " is newer than cloud bundle; skipping restore to avoid data loss"), new Object[0]);
            throw new CloudSyncError.MetaVersionMismatch(new IllegalStateException("Local note is newer than cloud bundle; restore aborted to avoid data loss"));
        }
        C27671Ooooooo c27671Ooooooo2 = c27671Ooooooo;
        String noteId = cloudMetaExtra.getNoteId();
        String templateId = cloudMetaExtra.getTemplateId();
        String folderId = cloudMetaExtra.getFolderId();
        Long lastModificationTime = cloudMetaExtra.getLastModificationTime();
        long jLongValue2 = lastModificationTime != null ? lastModificationTime.longValue() : 0L;
        String strResolvedParentId = cloudMetaExtra.resolvedParentId(null);
        Boolean favorite = cloudMetaExtra.getFavorite();
        boolean zBooleanValue = favorite != null ? favorite.booleanValue() : false;
        long jLongValue3 = 0;
        String title = cloudMetaExtra.getTitle();
        Boolean inTrashBin = cloudMetaExtra.getInTrashBin();
        boolean zBooleanValue2 = inTrashBin != null ? inTrashBin.booleanValue() : false;
        Long createdTime = cloudMetaExtra.getCreatedTime();
        long jLongValue4 = createdTime != null ? createdTime.longValue() : 0L;
        Long lastModificationTime2 = cloudMetaExtra.getLastModificationTime();
        if (lastModificationTime2 != null) {
            jLongValue3 = lastModificationTime2.longValue();
        }
        long j = jLongValue3;
        Boolean usingOwnPdf = cloudMetaExtra.getUsingOwnPdf();
        boolean zBooleanValue3 = usingOwnPdf != null ? usingOwnPdf.booleanValue() : false;
        Boolean lockAdded = cloudMetaExtra.getLockAdded();
        boolean zBooleanValue4 = lockAdded != null ? lockAdded.booleanValue() : false;
        Integer noteContentVersion = cloudMetaExtra.getNoteContentVersion();
        NoteFile noteFile = new NoteFile(str2, noteId, templateId, folderId, jLongValue2, strResolvedParentId, zBooleanValue, title, zBooleanValue2, null, null, false, false, 0L, jLongValue4, j, 0L, noteContentVersion != null ? noteContentVersion.intValue() : 0, cloudMetaExtra.getSortKey(), zBooleanValue3, zBooleanValue4, null, 2178560, null);
        C27387o0000o0 c27387o0000o0 = c27671Ooooooo2.f97331OooO00o;
        Uri uriFromFile = Uri.fromFile(file);
        c27697o00o0O.f97626OooOo0o = null;
        c27697o00o0O.f97625OooOo = null;
        c27697o00o0O.f97628OooOoO0 = null;
        c27697o00o0O.f97627OooOoO = null;
        c27697o00o0O.f97629OooOoOO = null;
        c27697o00o0O.f97633OooOooo = 2;
        c27387o0000o0.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27604oooo00o(noteFile, uriFromFile, c27387o0000o0, null), c27697o00o0O);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00Oo0 o00oo02;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof o00Oo0) {
            o00oo02 = (o00Oo0) abstractC32479OooO0OO;
            int i = o00oo02.f97619OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo02.f97619OooOoO = i - Integer.MIN_VALUE;
            } else {
                o00oo02 = new o00Oo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = o00oo02.f97617OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00oo02.f97619OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooOOo);
                InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = this.f97333OooO0OO;
                o00oo02.f97618OooOo0o = str;
                o00oo02.f97619OooOoO = 1;
                objOooOOo = interfaceC27313OooOoo0.OooOOo(str, o00oo02);
                if (objOooOOo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = o00oo02.f97618OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOo);
            }
            NoteMeta noteMeta = (NoteMeta) objOooOOo;
            if (noteMeta == null) {
                objOooO00o = new CloudBundle(null, null, null, null, CloudMime.NOTE);
            } else {
                CloudMetaExtra cloudMetaExtraFromNoteMeta = CloudMetaExtra.INSTANCE.fromNoteMeta(noteMeta);
                objOooO00o = new CloudBundle(null, null, cloudMetaExtraFromNoteMeta, CloudMetaExtraKt.computeMetaHash(cloudMetaExtraFromNoteMeta), CloudMime.NOTE);
            }
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteBundleProcessor", "packMetaOnly(", str, ") failed"), new Object[0]);
        }
        if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "NoteBundleProcessor", "packMetaOnly(", str, ") succeeded"), new Object[0]);
        }
        return objOooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (OooOO0(r9, r10, r1) == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, CloudBundle cloudBundle, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00Ooo o00ooo2;
        Object objOooO00o;
        Throwable thOooO00o;
        if (abstractC32479OooO0OO instanceof o00Ooo) {
            o00ooo2 = (o00Ooo) abstractC32479OooO0OO;
            int i = o00ooo2.f97623OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00ooo2.f97623OooOoO = i - Integer.MIN_VALUE;
            } else {
                o00ooo2 = new o00Ooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o00ooo2.f97621OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00ooo2.f97623OooOoO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            int i3 = OooO00o.f97338OooO00o[cloudBundle.getType().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    CloudMetaExtra extra = cloudBundle.getExtra();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(extra);
                    o00ooo2.f97622OooOo0o = str;
                    o00ooo2.f97623OooOoO = 1;
                } else {
                    if (i3 != 3) {
                        throw new C32442OooOO0o();
                    }
                    o00ooo2.f97622OooOo0o = str;
                    o00ooo2.f97623OooOoO = 2;
                    if (OooO(str, cloudBundle, z, o00ooo2) == obj2) {
                        return obj2;
                    }
                }
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteBundleProcessor", "restore NOTE(", str, ") failed"), new Object[0]);
                }
                if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "NoteBundleProcessor", "restore NOTE(", str, ") succeeded"), new Object[0]);
                }
                return objOooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("NoteBundleProcessor");
            c20358OooO00o3.OooO0o0("Cloud bundle type NONE; metaId=" + str + " will not be restored", new Object[0]);
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = o00ooo2.f97622OooOo0o;
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

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        if (r1.Oooo0oo(r10, r0, r2) == r3) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:26:0x005d, B:35:0x008b, B:37:0x0093, B:48:0x00f3, B:49:0x0104), top: B:62:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:21:0x004e, B:41:0x00a6, B:43:0x00aa, B:46:0x00d8, B:47:0x00f2), top: B:63:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:21:0x004e, B:41:0x00a6, B:43:0x00aa, B:46:0x00d8, B:47:0x00f2), top: B:63:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3 A[Catch: all -> 0x0061, TRY_ENTER, TryCatch #0 {all -> 0x0061, blocks: (B:26:0x005d, B:35:0x008b, B:37:0x0093, B:48:0x00f3, B:49:0x0104), top: B:62:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, Continuation<? super C32445OooOOOO<String>> continuation) {
        OooO0O0 oooO0O0;
        String str2;
        Throwable th;
        String str3;
        String str4;
        C27671Ooooooo c27671Ooooooo;
        C27671Ooooooo c27671Ooooooo2;
        String str5;
        NoteMeta noteMeta;
        Object objOooO00o;
        String str6;
        Object obj;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f97344OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f97344OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0((AbstractC32479OooO0OO) continuation);
            }
        }
        Object objOooOOo = oooO0O0.f97341OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f97344OooOoo0;
        if (i2 != 0) {
            if (i2 == 1) {
                String str7 = oooO0O0.f97342OooOoO0;
                c27671Ooooooo = (C27671Ooooooo) oooO0O0.f97339OooOo;
                str3 = oooO0O0.f97340OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooOOo);
                    str4 = str7;
                    if (((Boolean) objOooOOo).booleanValue()) {
                        throw new IllegalStateException("duplicateNote() failed for " + str3);
                    }
                    InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27671Ooooooo.f97333OooO0OO;
                    oooO0O0.f97340OooOo0o = str3;
                    oooO0O0.f97339OooOo = c27671Ooooooo;
                    oooO0O0.f97342OooOoO0 = str4;
                    oooO0O0.f97344OooOoo0 = 2;
                    objOooOOo = interfaceC27313OooOoo0.OooOOo(str4, oooO0O0);
                    if (objOooOOo != enumC32485OooO00o) {
                        c27671Ooooooo2 = c27671Ooooooo;
                        str2 = str3;
                        str5 = str4;
                        noteMeta = (NoteMeta) objOooOOo;
                        if (noteMeta != null) {
                        }
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str3;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
            } else if (i2 == 2) {
                String str8 = oooO0O0.f97342OooOoO0;
                c27671Ooooooo2 = (C27671Ooooooo) oooO0O0.f97339OooOo;
                str2 = oooO0O0.f97340OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooOOo);
                    str5 = str8;
                    noteMeta = (NoteMeta) objOooOOo;
                    if (noteMeta != null) {
                        throw new IllegalArgumentException(("NoteMeta for " + str5 + " not found").toString());
                    }
                    String str9 = noteMeta.getTitle() + c27671Ooooooo2.f97337OooO0oO.getString(R.string.cloud_conflict_backup);
                    C27449o00O0OoO c27449o00O0OoO = c27671Ooooooo2.f97332OooO0O0;
                    oooO0O0.f97340OooOo0o = str2;
                    oooO0O0.f97339OooOo = str5;
                    oooO0O0.f97342OooOoO0 = null;
                    oooO0O0.f97344OooOoo0 = 3;
                    objOooO00o = str5;
                } catch (Throwable th3) {
                    th = th3;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str10 = (String) oooO0O0.f97339OooOo;
                str6 = oooO0O0.f97340OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooOOo);
                    obj = str10;
                } catch (Throwable th4) {
                    th = th4;
                    str2 = str6;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    str6 = str2;
                    obj = objOooO00o;
                }
            }
            objOooO00o = C32446OooOOOo.OooO00o(th);
            str6 = str2;
            obj = objOooO00o;
        } else {
            C32446OooOOOo.OooO0O0(objOooOOo);
            try {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                C27449o00O0OoO c27449o00O0OoO2 = this.f97332OooO0O0;
                oooO0O0.f97340OooOo0o = str;
                oooO0O0.f97339OooOo = this;
                oooO0O0.f97342OooOoO0 = string;
                oooO0O0.f97344OooOoo0 = 1;
                Object objOooOOo0 = c27449o00O0OoO2.OooOOo0(str, string, oooO0O0);
                if (objOooOOo0 != enumC32485OooO00o) {
                    str3 = str;
                    str4 = string;
                    objOooOOo = objOooOOo0;
                    c27671Ooooooo = this;
                    if (((Boolean) objOooOOo).booleanValue()) {
                    }
                }
                return enumC32485OooO00o;
            } catch (Throwable th5) {
                str2 = str;
                th = th5;
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteBundleProcessor", "duplicate NOTE(", str6, ") failed"), new Object[0]);
        }
        if (!(obj instanceof C32445OooOOOO.OooO00o)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "NoteBundleProcessor", "duplicate NOTE(", str6, ") succeeded"), new Object[0]);
        }
        return obj;
    }

    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    public final Object OooO0Oo(String str, CloudMetaRemote cloudMetaRemote) {
        try {
            File file = new File(str);
            boolean z = file.exists() && file.length() > 0;
            Integer noteContentVersion = cloudMetaRemote.getExtra().getNoteContentVersion();
            int iIntValue = noteContentVersion != null ? noteContentVersion.intValue() : -1;
            if (iIntValue <= 0) {
                if (z) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteBundleProcessor");
                    c20358OooO00o.OooO0OO("Bundle meta " + cloudMetaRemote.getId() + " missing content version with local bundle ready", new Object[0]);
                    c20358OooO00o.OooOOO0("NoteBundleProcessor");
                    c20358OooO00o.OooO0OO("Bundle file path: " + str + ", cloudMetaExtra: " + cloudMetaRemote.getExtra(), new Object[0]);
                    throw new CloudSyncError.VersionUnknown(new IllegalStateException("Bundle version metadata missing; please re-upload or update"));
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteBundleProcessor");
                c20358OooO00o2.OooO0o0("Bundle meta " + cloudMetaRemote.getId() + " missing version but bundle not ready yet", new Object[0]);
            } else if (iIntValue > 25) {
                throw new CloudSyncError.VersionIncompatible(new IllegalStateException("Bundle version=" + iIntValue + " is newer than app supports (25)"));
            }
            return Boolean.TRUE;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o0OoOo0 o0oooo02;
        if (abstractC32479OooO0OO instanceof o0OoOo0) {
            o0oooo02 = (o0OoOo0) abstractC32479OooO0OO;
            int i = o0oooo02.f97660OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oooo02.f97660OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                o0oooo02 = new o0OoOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o0oooo02.f97659OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0oooo02.f97660OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0oooo02.f97660OooOoO0 = 1;
            C27449o00O0OoO c27449o00O0OoO = this.f97332OooO0O0;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O000o(str, null, c27449o00O0OoO, true), o0oooo02);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:63:0x011d, B:56:0x00e2, B:58:0x00e6, B:60:0x00f0, B:67:0x013a, B:64:0x0124, B:65:0x0138, B:39:0x009b, B:48:0x00c2, B:50:0x00c6, B:52:0x00cc, B:84:0x01bd), top: B:95:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:63:0x011d, B:56:0x00e2, B:58:0x00e6, B:60:0x00f0, B:67:0x013a, B:64:0x0124, B:65:0x0138, B:39:0x009b, B:48:0x00c2, B:50:0x00c6, B:52:0x00cc, B:84:0x01bd), top: B:95:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:77:0x0171, B:79:0x0175, B:81:0x0188, B:23:0x0063, B:71:0x0152, B:73:0x0156, B:82:0x01a8, B:83:0x01bc), top: B:96:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0175 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:77:0x0171, B:79:0x0175, B:81:0x0188, B:23:0x0063, B:71:0x0152, B:73:0x0156, B:82:0x01a8, B:83:0x01bc), top: B:96:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:77:0x0171, B:79:0x0175, B:81:0x0188, B:23:0x0063, B:71:0x0152, B:73:0x0156, B:82:0x01a8, B:83:0x01bc), top: B:96:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:77:0x0171, B:79:0x0175, B:81:0x0188, B:23:0x0063, B:71:0x0152, B:73:0x0156, B:82:0x01a8, B:83:0x01bc), top: B:96:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00O0O o00o0o2;
        String str2;
        Object objOooO00o;
        Throwable thOooO00o;
        int i;
        boolean z2;
        C27671Ooooooo c27671Ooooooo;
        long jLongValue;
        C27671Ooooooo c27671Ooooooo2;
        long j;
        String str3;
        CloudMetaLocal cloudMetaLocal;
        Object objOooO00o2;
        NoteInFile noteInFile;
        NoteInFile noteInFile2;
        long j2;
        NoteMeta noteMeta;
        CloudBundle cloudBundle;
        String str4 = str;
        if (abstractC32479OooO0OO instanceof o00O0O) {
            o00o0o2 = (o00O0O) abstractC32479OooO0OO;
            int i2 = o00o0o2.f97616OooOooO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o00o0o2.f97616OooOooO = i2 - Integer.MIN_VALUE;
            } else {
                o00o0o2 = new o00O0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0O = o00o0o2.f97615OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = o00o0o2.f97616OooOooO;
        try {
        } catch (Throwable th) {
            th = th;
            str2 = str4;
        }
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            InterfaceC27309OooOoO interfaceC27309OooOoO = this.f97334OooO0Oo;
            o00o0o2.f97610OooOo0o = str4;
            o00o0o2.f97609OooOo = this;
            o00o0o2.f97612OooOoO0 = str4;
            z2 = z;
            o00o0o2.f97611OooOoO = z2;
            o00o0o2.f97616OooOooO = 1;
            objOooOO0O = interfaceC27309OooOoO.OooOO0O(str4, o00o0o2);
            if (objOooOO0O != enumC32485OooO00o) {
                c27671Ooooooo = this;
                str2 = str4;
            }
            return enumC32485OooO00o;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                long j3 = o00o0o2.f97613OooOoOO;
                str4 = o00o0o2.f97612OooOoO0;
                c27671Ooooooo2 = (C27671Ooooooo) o00o0o2.f97609OooOo;
                String str5 = o00o0o2.f97610OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooOO0O);
                    jLongValue = j3;
                    str2 = str5;
                    cloudMetaLocal = (CloudMetaLocal) objOooOO0O;
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str5;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
                if (cloudMetaLocal != null) {
                    throw new IllegalStateException("CloudMeta for " + str2 + " not found; ensure note is registered first");
                }
                if (!cloudMetaLocal.getContentTag().isLastModifiedOldThan(jLongValue)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteBundleProcessor");
                    c20358OooO00o.OooO0o0("Note " + str2 + " content not changed; packing meta-only", new Object[0]);
                    o00o0o2.f97610OooOo0o = str2;
                    o00o0o2.f97609OooOo = null;
                    o00o0o2.f97612OooOoO0 = null;
                    o00o0o2.f97616OooOooO = 3;
                    objOooO00o2 = c27671Ooooooo2.OooO00o(str2, o00o0o2);
                    if (objOooO00o2 == enumC32485OooO00o) {
                    }
                    C32446OooOOOo.OooO0O0(objOooO00o2);
                    objOooO00o = (CloudBundle) objOooO00o2;
                    thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                    if (thOooO00o == null) {
                    }
                    if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
                    }
                    return objOooO00o;
                }
                C27387o0000o0 c27387o0000o0 = c27671Ooooooo2.f97331OooO00o;
                o00o0o2.f97610OooOo0o = str2;
                o00o0o2.f97609OooOo = c27671Ooooooo2;
                o00o0o2.f97612OooOoO0 = str4;
                o00o0o2.f97613OooOoOO = jLongValue;
                o00o0o2.f97616OooOooO = 4;
                objOooOO0O = C27387o0000o0.Oooo0oO(c27387o0000o0, str2, null, o00o0o2, 6);
                if (objOooOO0O != enumC32485OooO00o) {
                    j = jLongValue;
                    str3 = str2;
                    noteInFile = (NoteInFile) objOooOO0O;
                    if (noteInFile != null) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i3 == 3) {
                String str6 = o00o0o2.f97610OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0O);
                objOooO00o2 = ((C32445OooOOOO) objOooOO0O).f116639OooOo0o;
                str2 = str6;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                objOooO00o = (CloudBundle) objOooO00o2;
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o == null) {
                }
                if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
                }
                return objOooO00o;
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = o00o0o2.f97613OooOoOO;
                noteInFile2 = (NoteInFile) o00o0o2.f97609OooOo;
                String str7 = o00o0o2.f97610OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooOO0O);
                    str3 = str7;
                    noteMeta = (NoteMeta) objOooOO0O;
                    if (noteMeta != null) {
                        cloudBundle = new CloudBundle(null, null, null, null, CloudMime.NOTE);
                    } else {
                        CloudMetaExtra cloudMetaExtraFromNoteMeta = CloudMetaExtra.INSTANCE.fromNoteMeta(noteMeta);
                        cloudBundle = new CloudBundle(noteInFile2.getFile(), CloudContentTag.INSTANCE.from(noteInFile2.getFile(), j2), cloudMetaExtraFromNoteMeta, CloudMetaExtraKt.computeMetaHash(cloudMetaExtraFromNoteMeta), CloudMime.NOTE);
                    }
                    str2 = str3;
                    objOooO00o = cloudBundle;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str7;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    i = 0;
                    c20358OooO00o2.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o2, "NoteBundleProcessor", "pack(", str2, ") failed"), new Object[0]);
                } else {
                    i = 0;
                }
                if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o3, "NoteBundleProcessor", "pack(", str2, ") succeeded"), new Object[i]);
                }
                return objOooO00o;
            }
            j = o00o0o2.f97613OooOoOO;
            str4 = o00o0o2.f97612OooOoO0;
            c27671Ooooooo2 = (C27671Ooooooo) o00o0o2.f97609OooOo;
            str3 = o00o0o2.f97610OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooOO0O);
                noteInFile = (NoteInFile) objOooOO0O;
            } catch (Throwable th4) {
                th = th4;
                str2 = str3;
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            if (noteInFile != null) {
                throw new IllegalStateException("NoteInFile for " + str3 + " not found; ensure note is registered first");
            }
            InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27671Ooooooo2.f97333OooO0OO;
            o00o0o2.f97610OooOo0o = str3;
            o00o0o2.f97609OooOo = noteInFile;
            o00o0o2.f97612OooOoO0 = null;
            o00o0o2.f97613OooOoOO = j;
            o00o0o2.f97616OooOooO = 5;
            Object objOooOOo = interfaceC27313OooOoo0.OooOOo(str4, o00o0o2);
            if (objOooOOo != enumC32485OooO00o) {
                long j4 = j;
                noteInFile2 = noteInFile;
                objOooOO0O = objOooOOo;
                j2 = j4;
                noteMeta = (NoteMeta) objOooOO0O;
                if (noteMeta != null) {
                }
                str2 = str3;
                objOooO00o = cloudBundle;
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o == null) {
                }
                if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
                }
                return objOooO00o;
            }
            return enumC32485OooO00o;
        }
        boolean z3 = o00o0o2.f97611OooOoO;
        String str8 = o00o0o2.f97612OooOoO0;
        c27671Ooooooo = (C27671Ooooooo) o00o0o2.f97609OooOo;
        str2 = o00o0o2.f97610OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            z2 = z3;
            str4 = str8;
        } catch (Throwable th5) {
            th = th5;
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        objOooO00o = C32446OooOOOo.OooO00o(th);
        thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o == null) {
        }
        if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
        }
        return objOooO00o;
        Long l = (Long) objOooOO0O;
        if (l == null) {
            objOooO00o = new CloudBundle(null, null, null, null, CloudMime.NOTE);
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o == null) {
            }
            if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
            }
            return objOooO00o;
        }
        jLongValue = l.longValue();
        if (!z2) {
            c27671Ooooooo2 = c27671Ooooooo;
            C27387o0000o0 c27387o0000o02 = c27671Ooooooo2.f97331OooO00o;
            o00o0o2.f97610OooOo0o = str2;
            o00o0o2.f97609OooOo = c27671Ooooooo2;
            o00o0o2.f97612OooOoO0 = str4;
            o00o0o2.f97613OooOoOO = jLongValue;
            o00o0o2.f97616OooOooO = 4;
            objOooOO0O = C27387o0000o0.Oooo0oO(c27387o0000o02, str2, null, o00o0o2, 6);
            if (objOooOO0O != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        InterfaceC27605OooO00o interfaceC27605OooO00o = c27671Ooooooo.f97336OooO0o0;
        o00o0o2.f97610OooOo0o = str2;
        o00o0o2.f97609OooOo = c27671Ooooooo;
        o00o0o2.f97612OooOoO0 = str4;
        o00o0o2.f97613OooOoOO = jLongValue;
        o00o0o2.f97616OooOooO = 2;
        objOooOO0O = interfaceC27605OooO00o.OooOO0O(str2, null, o00o0o2);
        if (objOooOO0O == enumC32485OooO00o) {
            return enumC32485OooO00o;
        }
        c27671Ooooooo2 = c27671Ooooooo;
        cloudMetaLocal = (CloudMetaLocal) objOooOO0O;
        if (cloudMetaLocal != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, CloudMetaExtra cloudMetaExtra, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27699o00ooo c27699o00ooo;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C27699o00ooo) {
            c27699o00ooo = (C27699o00ooo) abstractC32479OooO0OO;
            int i = c27699o00ooo.f97644OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27699o00ooo.f97644OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27699o00ooo = new C27699o00ooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27699o00ooo.f97642OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27699o00ooo.f97644OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c27699o00ooo.f97643OooOo0o = str;
                c27699o00ooo.f97644OooOoO = 1;
                if (OooOO0(str, cloudMetaExtra, c27699o00ooo) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c27699o00ooo.f97643OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteBundleProcessor", "restoreMetaOnly NOTE(", str, ") failed"), new Object[0]);
        }
        if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "NoteBundleProcessor", "restoreMetaOnly NOTE(", str, ") succeeded"), new Object[0]);
        }
        return objOooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0oo.InterfaceC27660OoooOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27702ooOO c27702ooOO;
        if (abstractC32479OooO0OO instanceof C27702ooOO) {
            c27702ooOO = (C27702ooOO) abstractC32479OooO0OO;
            int i = c27702ooOO.f97684OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27702ooOO.f97684OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27702ooOO = new C27702ooOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0O = c27702ooOO.f97682OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27702ooOO.f97684OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooOO0O);
                InterfaceC27309OooOoO interfaceC27309OooOoO = this.f97334OooO0Oo;
                c27702ooOO.f97683OooOo0o = str;
                c27702ooOO.f97684OooOoO = 1;
                objOooOO0O = interfaceC27309OooOoO.OooOO0O(str, c27702ooOO);
                if (objOooOO0O == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c27702ooOO.f97683OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0O);
            }
            Long l = (Long) objOooOO0O;
            if (l != null) {
                return CloudContentTag.INSTANCE.fromLastModified(l.longValue());
            }
            throw new IllegalStateException("NoteContent for " + str + " not found");
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        if (r7.f97333OooO0OO.OooOOO0(r1, r3) == r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, CloudMetaExtra cloudMetaExtra, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo000o oo000oVar;
        CloudMetaExtra cloudMetaExtra2;
        Object objOooOOo;
        C27671Ooooooo c27671Ooooooo;
        String str2 = str;
        if (abstractC32479OooO0OO instanceof oo000o) {
            oo000oVar = (oo000o) abstractC32479OooO0OO;
            int i = oo000oVar.f97676OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo000oVar.f97676OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oo000oVar = new oo000o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oo000oVar.f97673OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo000oVar.f97676OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo000oVar.f97672OooOo0o = this;
            oo000oVar.f97671OooOo = str2;
            cloudMetaExtra2 = cloudMetaExtra;
            oo000oVar.f97674OooOoO0 = cloudMetaExtra2;
            oo000oVar.f97676OooOoo0 = 1;
            objOooOOo = this.f97333OooO0OO.OooOOo(str2, oo000oVar);
            if (objOooOOo != enumC32485OooO00o) {
                c27671Ooooooo = this;
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
        CloudMetaExtra cloudMetaExtra3 = oo000oVar.f97674OooOoO0;
        String str3 = oo000oVar.f97671OooOo;
        c27671Ooooooo = oo000oVar.f97672OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        cloudMetaExtra2 = cloudMetaExtra3;
        str2 = str3;
        objOooOOo = obj;
        NoteMeta noteMeta = (NoteMeta) objOooOOo;
        if (noteMeta == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteBundleProcessor", "NoteMeta for ", str2, " not found; skip meta-only restore"), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        String strOooO0Oo = c27671Ooooooo.f97335OooO0o.OooO0Oo();
        String strResolvedParentId = cloudMetaExtra2.resolvedParentId(noteMeta.getParentId());
        Boolean favorite = cloudMetaExtra2.getFavorite();
        boolean zBooleanValue = favorite != null ? favorite.booleanValue() : noteMeta.getFavorite();
        String title = cloudMetaExtra2.getTitle();
        if (title == null) {
            title = noteMeta.getTitle();
        }
        String str4 = title;
        Boolean inTrashBin = cloudMetaExtra2.getInTrashBin();
        boolean zBooleanValue2 = inTrashBin != null ? inTrashBin.booleanValue() : noteMeta.getInTrashBin();
        Integer sortKey = cloudMetaExtra2.getSortKey();
        if (sortKey == null) {
            sortKey = noteMeta.getSortKey();
        }
        Integer num = sortKey;
        Long lastModificationTime = cloudMetaExtra2.getLastModificationTime();
        NoteMeta noteMetaCopy$default = NoteMeta.copy$default(noteMeta, null, strOooO0Oo, str4, strResolvedParentId, null, zBooleanValue, null, 0, 0, zBooleanValue2, null, 0, 0L, lastModificationTime != null ? lastModificationTime.longValue() : noteMeta.getLastModificationTime(), num, false, false, false, 0L, 499153, null);
        oo000oVar.f97672OooOo0o = null;
        oo000oVar.f97671OooOo = null;
        oo000oVar.f97674OooOoO0 = null;
        oo000oVar.f97676OooOoo0 = 2;
    }
}
