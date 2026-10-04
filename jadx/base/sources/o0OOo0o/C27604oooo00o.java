package o0OOo0o;

import android.net.Uri;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.login.LoginErrorCode;
import com.orion.notein.domain.models.note.NoteFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o.C27387o0000o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$restoreNoteByNoteFile$2", m80623f = "NoteInFileUseCase.kt", m80624l = {1335, 1342, 1345, 1347, 1359, 1363, 1367, 1375}, m80625m = "invokeSuspend")
public final class C27604oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super NoteMeta>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f97056OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24034Oooo00O f97057OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f97058OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f97059OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f97060OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f97061OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f97062OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ NoteFile f97063OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ Uri f97064OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f97065Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27604oooo00o(NoteFile noteFile, Uri uri, C27387o0000o0 c27387o0000o0, Continuation<? super C27604oooo00o> continuation) {
        super(2, continuation);
        this.f97063OooOooO = noteFile;
        this.f97064OooOooo = uri;
        this.f97065Oooo000 = c27387o0000o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27604oooo00o(this.f97063OooOooO, this.f97064OooOooo, this.f97065Oooo000, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super NoteMeta> continuation) {
        return ((C27604oooo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0342, code lost:
    
        if (r6.OooOOO0(r3, r25) == r7) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030b A[Catch: all -> 0x0315, Exception -> 0x0319, TryCatch #34 {Exception -> 0x0319, all -> 0x0315, blocks: (B:124:0x0307, B:126:0x030b, B:128:0x0311), top: B:239:0x0307 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104 A[PHI: r0 r2 r3 r6 r8 r10 r16 r17 r19 r20 r21 r22
      0x0104: PHI (r0v38 long) = (r0v36 long), (r0v39 long) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r2v23 java.lang.Object) = (r2v22 java.lang.Object), (r2v26 java.lang.Object) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r3v22 ??) = (r3v66 ??), (r3v24 ??) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r6v12 java.io.File[]) = (r6v9 java.io.File[]), (r6v17 java.io.File[]) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r8v10 long) = (r8v6 long), (r8v13 long) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r10v11 java.lang.String) = (r10v9 java.lang.String), (r10v12 java.lang.String) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r16v5 java.lang.String) = (r16v3 java.lang.String), (r16v6 java.lang.String) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r17v6 com.orion.notein.domain.models.note.NoteFile) = (r17v4 com.orion.notein.domain.models.note.NoteFile), (r17v7 com.orion.notein.domain.models.note.NoteFile) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r19v5 java.lang.String) = (r19v3 java.lang.String), (r19v6 java.lang.String) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r20v3 java.lang.String) = (r20v1 java.lang.String), (r20v4 java.lang.String) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r21v15 android.net.Uri) = (r21v13 android.net.Uri), (r21v16 android.net.Uri) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r22v3 java.lang.String) = (r22v1 java.lang.String), (r22v4 java.lang.String) binds: [B:80:0x01fc, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025e A[Catch: all -> 0x0272, Exception -> 0x0279, TryCatch #9 {all -> 0x0272, blocks: (B:117:0x02c6, B:118:0x02e5, B:120:0x02fb, B:86:0x0221, B:88:0x025e, B:99:0x0285, B:101:0x028b, B:91:0x026d, B:82:0x0200, B:79:0x01eb), top: B:213:0x01eb }] */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.jvm.internal.Oooo00O] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        NoteFile noteFile;
        String str;
        String str2;
        Uri uri;
        NoteFile noteFile2;
        ?? r3;
        Object obj3;
        File file;
        File file2;
        String str3;
        String str4;
        Object objOooo0;
        ?? r6;
        String str5;
        long j;
        File[] fileArr;
        ArrayList arrayList;
        long jCurrentTimeMillis;
        String str6;
        String str7;
        String str8;
        long j2;
        long j3;
        File[] fileArr2;
        Object objOooOooo;
        ?? r32;
        File[] fileArr3;
        boolean zBooleanValue;
        String str9;
        NoteMeta noteMetaOooOoO;
        int length;
        int i;
        File file3;
        boolean z;
        String str10;
        NoteMeta noteMeta;
        String str11;
        ?? r62;
        boolean z2;
        long j4;
        ?? r63;
        ?? r64;
        ?? r65;
        Object objOooO00o;
        NoteMeta noteMeta2;
        ?? r4;
        NoteMeta noteMeta3;
        Object objOooO0o;
        ?? r42;
        long j5;
        Page page;
        ?? r33 = "restoreNoteByNoteFile, unzipAndValidateSource cost: ";
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f97061OooOoo;
        NoteFile noteFile3 = this.f97063OooOooO;
        Uri uri2 = this.f97064OooOooo;
        C27387o0000o0 c27387o0000o0 = this.f97065Oooo000;
        try {
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                    r33 = "noteId is null, noteFile: ";
                }
            } catch (Exception e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
            obj2 = noteFile3;
        } catch (Throwable th3) {
            th = th3;
            r33 = noteFile3;
        }
        switch (i2) {
            case 0:
                str3 = "restoreNoteByNoteFile, srcNoteMeta: ";
                noteFile = noteFile3;
                C32446OooOOOo.OooO0O0(obj);
                C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    String noteId = noteFile.getNoteId();
                    if (noteId != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("NoteInFileUseCase");
                        str4 = ", result: ";
                        try {
                            try {
                                c20358OooO00o.OooO0o0("restoreNoteByNoteFile, srcUri: " + uri2 + ", noteFileId: " + noteId, new Object[0]);
                                try {
                                    this.f97057OooOo0o = c24034Oooo00O;
                                    this.f97056OooOo = noteId;
                                    this.f97058OooOoO = jCurrentTimeMillis2;
                                    this.f97061OooOoo = 1;
                                    objOooo0 = C27387o0000o0.Oooo0(c27387o0000o0, uri2, noteId, this);
                                    if (objOooo0 != enumC32485OooO00o) {
                                        r6 = c24034Oooo00O;
                                        str5 = noteId;
                                        j = jCurrentTimeMillis2;
                                        try {
                                            try {
                                                C27387o0000o0.OooO0o oooO0o = (C27387o0000o0.OooO0o) objOooo0;
                                            } catch (Exception e3) {
                                                e = e3;
                                                str2 = "restoreNoteByNoteFile, delete import dir: ";
                                                uri = uri2;
                                                noteFile2 = noteFile;
                                                str = str4;
                                                r64 = r6;
                                            }
                                            try {
                                                File file4 = oooO0o.f95463OooO00o;
                                                fileArr = oooO0o.f95464OooO0O0;
                                                arrayList = oooO0o.f95465OooO0OO;
                                                r6.f80942OooOo0o = file4.getParentFile();
                                                String str12 = str5;
                                                jCurrentTimeMillis = System.currentTimeMillis();
                                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o2.OooOOO0("NoteInFileUseCase");
                                                str6 = "restoreNoteByNoteFile, delete import dir: ";
                                                uri = uri2;
                                                str7 = "restoreNoteByNoteFile, restore files cost: ";
                                            } catch (Exception e4) {
                                                e = e4;
                                                str2 = "restoreNoteByNoteFile, delete import dir: ";
                                                uri = uri2;
                                                noteFile2 = noteFile;
                                                str = str4;
                                                r64 = r6;
                                                obj3 = null;
                                                r63 = r64;
                                                r33 = r63;
                                                try {
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o3.OooOOO0("NoteInFileUseCase");
                                                    c20358OooO00o3.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                                                    file2 = (File) r33.f80942OooOo0o;
                                                    if (file2 != null) {
                                                    }
                                                    return obj3;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            }
                                            try {
                                                try {
                                                    c20358OooO00o2.OooO0o0("restoreNoteByNoteFile, unzipAndValidateSource cost: " + (jCurrentTimeMillis - j), new Object[0]);
                                                    try {
                                                        this.f97057OooOo0o = r6;
                                                        str8 = str12;
                                                        this.f97056OooOo = str8;
                                                        this.f97059OooOoO0 = fileArr;
                                                        this.f97058OooOoO = j;
                                                        this.f97060OooOoOO = jCurrentTimeMillis;
                                                        this.f97061OooOoo = 2;
                                                        if (C27387o0000o0.OooOoo0(c27387o0000o0, arrayList, str8, this) != enumC32485OooO00o) {
                                                            j2 = j;
                                                            j3 = jCurrentTimeMillis;
                                                            r33 = r6;
                                                            fileArr2 = fileArr;
                                                            try {
                                                                try {
                                                                    this.f97057OooOo0o = r33;
                                                                    this.f97056OooOo = str8;
                                                                    this.f97059OooOoO0 = fileArr2;
                                                                    this.f97058OooOoO = j2;
                                                                    this.f97060OooOoOO = j3;
                                                                    this.f97061OooOoo = 3;
                                                                    objOooOooo = C27387o0000o0.OooOooo(c27387o0000o0, fileArr2, str8, this);
                                                                    r32 = r33;
                                                                    if (objOooOooo == enumC32485OooO00o) {
                                                                        fileArr3 = fileArr2;
                                                                        zBooleanValue = ((Boolean) objOooOooo).booleanValue();
                                                                        C27387o0000o0.Oooo000(c27387o0000o0, fileArr3);
                                                                        this.f97057OooOo0o = r32;
                                                                        this.f97056OooOo = str8;
                                                                        this.f97059OooOoO0 = fileArr3;
                                                                        this.f97058OooOoO = j2;
                                                                        this.f97060OooOoOO = j3;
                                                                        this.f97062OooOoo0 = zBooleanValue;
                                                                        this.f97061OooOoo = 4;
                                                                        if (C27387o0000o0.OooOooO(c27387o0000o0, fileArr3, str8, this) == enumC32485OooO00o) {
                                                                            str9 = str8;
                                                                            r33 = r32;
                                                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                                                            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                                                            c20358OooO00o4.OooOOO0("NoteInFileUseCase");
                                                                            c20358OooO00o4.OooO0o0(str7 + (jCurrentTimeMillis3 - j3), new Object[0]);
                                                                            noteMetaOooOoO = C27387o0000o0.OooOoO(c27387o0000o0, fileArr3);
                                                                            c20358OooO00o4.OooOOO0("NoteInFileUseCase");
                                                                            c20358OooO00o4.OooO00o(str3 + noteMetaOooOoO, new Object[0]);
                                                                            length = fileArr3.length;
                                                                            i = 0;
                                                                            while (true) {
                                                                                if (i >= length) {
                                                                                    file3 = fileArr3[i];
                                                                                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(file3.getName(), "note_label.json")) {
                                                                                        i++;
                                                                                    }
                                                                                } else {
                                                                                    file3 = null;
                                                                                }
                                                                            }
                                                                            if (file3 != null || !file3.exists()) {
                                                                                z = zBooleanValue;
                                                                                str10 = str9;
                                                                                r6 = r33;
                                                                                noteMeta = noteMetaOooOoO;
                                                                                C27387o0000o0 c27387o0000o02 = this.f97065Oooo000;
                                                                                this.f97057OooOo0o = r6;
                                                                                try {
                                                                                    this.f97056OooOo = null;
                                                                                    this.f97059OooOoO0 = null;
                                                                                    this.f97058OooOoO = j2;
                                                                                    this.f97061OooOoo = 6;
                                                                                    noteFile2 = noteFile;
                                                                                    try {
                                                                                        objOooO00o = C27387o0000o0.OooO00o(c27387o0000o02, str10, noteFile2, noteMeta, z, this);
                                                                                        if (objOooO00o != enumC32485OooO00o) {
                                                                                            r33 = r6;
                                                                                            try {
                                                                                                noteMeta2 = (NoteMeta) objOooO00o;
                                                                                                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                                                                                c20358OooO00o5.OooOOO0("NoteInFileUseCase");
                                                                                                c20358OooO00o5.OooO00o("restoreNoteByNoteFile, restored noteMeta: " + noteMeta2, new Object[0]);
                                                                                                try {
                                                                                                    C27585o00ooO0 c27585o00ooO0 = c27387o0000o0.f95445OooOo0;
                                                                                                    String id = noteMeta2.getId();
                                                                                                    this.f97057OooOo0o = r33;
                                                                                                    this.f97056OooOo = noteMeta2;
                                                                                                    this.f97058OooOoO = j2;
                                                                                                    this.f97061OooOoo = 7;
                                                                                                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                                                                                    obj3 = null;
                                                                                                    try {
                                                                                                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27576o00oo00O(c27585o00ooO0, id, null), this);
                                                                                                    } catch (Exception e5) {
                                                                                                        e = e5;
                                                                                                        r4 = r33;
                                                                                                        noteMeta3 = noteMeta2;
                                                                                                        try {
                                                                                                            C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                                                                                            c20358OooO00o6.OooOOO0("NoteInFileUseCase");
                                                                                                            c20358OooO00o6.OooO0Oo(e, "createNoteCoverTn error.", new Object[0]);
                                                                                                            r42 = r4;
                                                                                                            j5 = j2;
                                                                                                            InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27387o0000o0.f95427OooO0O0;
                                                                                                            this.f97057OooOo0o = r42;
                                                                                                            this.f97056OooOo = noteMeta3;
                                                                                                            this.f97058OooOoO = j5;
                                                                                                            this.f97061OooOoo = 8;
                                                                                                            r4 = r42;
                                                                                                        } catch (Exception e6) {
                                                                                                            e = e6;
                                                                                                            str = str4;
                                                                                                            str2 = str6;
                                                                                                            r33 = r4;
                                                                                                            C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                                                                                                            c20358OooO00o32.OooOOO0("NoteInFileUseCase");
                                                                                                            c20358OooO00o32.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                                                                                                            file2 = (File) r33.f80942OooOo0o;
                                                                                                            if (file2 != null) {
                                                                                                            }
                                                                                                            return obj3;
                                                                                                        } catch (Throwable th5) {
                                                                                                            th = th5;
                                                                                                            str = str4;
                                                                                                            str2 = str6;
                                                                                                            r33 = r4;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Exception e7) {
                                                                                                    e = e7;
                                                                                                    obj3 = null;
                                                                                                }
                                                                                                if (objOooO0o != enumC32485OooO00o) {
                                                                                                    r4 = r33;
                                                                                                    noteMeta3 = noteMeta2;
                                                                                                    try {
                                                                                                        page = (Page) objOooO0o;
                                                                                                        r42 = r4;
                                                                                                        if (page != null) {
                                                                                                            String tnPath = page.getTnPath();
                                                                                                            r42 = r4;
                                                                                                            if (tnPath != null) {
                                                                                                                noteMeta3.setTnPath(tnPath);
                                                                                                                r42 = r4;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Exception e8) {
                                                                                                        e = e8;
                                                                                                        C34406OooO00o.C20358OooO00o c20358OooO00o62 = C34406OooO00o.f123390OooO00o;
                                                                                                        c20358OooO00o62.OooOOO0("NoteInFileUseCase");
                                                                                                        c20358OooO00o62.OooO0Oo(e, "createNoteCoverTn error.", new Object[0]);
                                                                                                        r42 = r4;
                                                                                                    } catch (Throwable th6) {
                                                                                                        th = th6;
                                                                                                        r33 = r4;
                                                                                                        str = str4;
                                                                                                        str2 = str6;
                                                                                                        file = (File) r33.f80942OooOo0o;
                                                                                                        if (file != null) {
                                                                                                        }
                                                                                                        throw th;
                                                                                                    }
                                                                                                    j5 = j2;
                                                                                                    InterfaceC27313OooOoo0 interfaceC27313OooOoo02 = c27387o0000o0.f95427OooO0O0;
                                                                                                    this.f97057OooOo0o = r42;
                                                                                                    this.f97056OooOo = noteMeta3;
                                                                                                    this.f97058OooOoO = j5;
                                                                                                    this.f97061OooOoo = 8;
                                                                                                    r4 = r42;
                                                                                                }
                                                                                            } catch (Exception e9) {
                                                                                                e = e9;
                                                                                                str = str4;
                                                                                                str2 = str6;
                                                                                                r3 = r33;
                                                                                                obj3 = null;
                                                                                                r33 = r3;
                                                                                                C34406OooO00o.C20358OooO00o c20358OooO00o322 = C34406OooO00o.f123390OooO00o;
                                                                                                c20358OooO00o322.OooOOO0("NoteInFileUseCase");
                                                                                                c20358OooO00o322.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                                                                                                file2 = (File) r33.f80942OooOo0o;
                                                                                                if (file2 != null) {
                                                                                                }
                                                                                                return obj3;
                                                                                            }
                                                                                        }
                                                                                    } catch (Exception e10) {
                                                                                        e = e10;
                                                                                        str = str4;
                                                                                        str2 = str6;
                                                                                        r64 = r6;
                                                                                        obj3 = null;
                                                                                        r63 = r64;
                                                                                        r33 = r63;
                                                                                        C34406OooO00o.C20358OooO00o c20358OooO00o3222 = C34406OooO00o.f123390OooO00o;
                                                                                        c20358OooO00o3222.OooOOO0("NoteInFileUseCase");
                                                                                        c20358OooO00o3222.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                                                                                        file2 = (File) r33.f80942OooOo0o;
                                                                                        if (file2 != null) {
                                                                                            boolean zOooO0Oo = C32501OooO0oO.OooO0Oo(file2);
                                                                                            c20358OooO00o3222.OooOOO0("NoteInFileUseCase");
                                                                                            c20358OooO00o3222.OooO0o0(str2 + r33.f80942OooOo0o + str + zOooO0Oo, new Object[0]);
                                                                                        }
                                                                                        return obj3;
                                                                                    }
                                                                                } catch (Exception e11) {
                                                                                    e = e11;
                                                                                    obj3 = null;
                                                                                    noteFile2 = noteFile;
                                                                                    str = str4;
                                                                                    str2 = str6;
                                                                                    r63 = r6;
                                                                                    r33 = r63;
                                                                                    C34406OooO00o.C20358OooO00o c20358OooO00o32222 = C34406OooO00o.f123390OooO00o;
                                                                                    c20358OooO00o32222.OooOOO0("NoteInFileUseCase");
                                                                                    c20358OooO00o32222.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                                                                                    file2 = (File) r33.f80942OooOo0o;
                                                                                    if (file2 != null) {
                                                                                    }
                                                                                    return obj3;
                                                                                }
                                                                                break;
                                                                            } else {
                                                                                this.f97057OooOo0o = r33;
                                                                                this.f97056OooOo = str9;
                                                                                this.f97059OooOoO0 = noteMetaOooOoO;
                                                                                this.f97058OooOoO = j2;
                                                                                this.f97062OooOoo0 = zBooleanValue;
                                                                                this.f97061OooOoo = 5;
                                                                                if (C27387o0000o0.OooOoo(c27387o0000o0, file3, str9, this) != enumC32485OooO00o) {
                                                                                    str11 = str9;
                                                                                    r62 = r33;
                                                                                    noteMeta = noteMetaOooOoO;
                                                                                    z2 = zBooleanValue;
                                                                                    j4 = j2;
                                                                                    j2 = j4;
                                                                                    str10 = str11;
                                                                                    z = z2;
                                                                                    r6 = r62;
                                                                                    C27387o0000o0 c27387o0000o022 = this.f97065Oooo000;
                                                                                    this.f97057OooOo0o = r6;
                                                                                    this.f97056OooOo = null;
                                                                                    this.f97059OooOoO0 = null;
                                                                                    this.f97058OooOoO = j2;
                                                                                    this.f97061OooOoo = 6;
                                                                                    noteFile2 = noteFile;
                                                                                    objOooO00o = C27387o0000o0.OooO00o(c27387o0000o022, str10, noteFile2, noteMeta, z, this);
                                                                                    if (objOooO00o != enumC32485OooO00o) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    str = str4;
                                                                    str2 = str6;
                                                                    file = (File) r33.f80942OooOo0o;
                                                                    if (file != null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                                noteFile2 = noteFile;
                                                                str = str4;
                                                                str2 = str6;
                                                                r3 = r33;
                                                                obj3 = null;
                                                                r33 = r3;
                                                                C34406OooO00o.C20358OooO00o c20358OooO00o322222 = C34406OooO00o.f123390OooO00o;
                                                                c20358OooO00o322222.OooOOO0("NoteInFileUseCase");
                                                                c20358OooO00o322222.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                                                                file2 = (File) r33.f80942OooOo0o;
                                                                if (file2 != null) {
                                                                }
                                                                return obj3;
                                                            }
                                                        }
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        noteFile2 = noteFile;
                                                        str = str4;
                                                        str2 = str6;
                                                        r64 = r6;
                                                        obj3 = null;
                                                        r63 = r64;
                                                        r33 = r63;
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o3222222 = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o3222222.OooOOO0("NoteInFileUseCase");
                                                        c20358OooO00o3222222.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                                                        file2 = (File) r33.f80942OooOo0o;
                                                        if (file2 != null) {
                                                        }
                                                        return obj3;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    str = str4;
                                                    str2 = str6;
                                                    r65 = r6;
                                                    r33 = r65;
                                                    file = (File) r33.f80942OooOo0o;
                                                    if (file != null) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                noteFile2 = noteFile;
                                                str = str4;
                                                str2 = str6;
                                                r64 = r6;
                                                obj3 = null;
                                                r63 = r64;
                                                r33 = r63;
                                                C34406OooO00o.C20358OooO00o c20358OooO00o32222222 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o32222222.OooOOO0("NoteInFileUseCase");
                                                c20358OooO00o32222222.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                                                file2 = (File) r33.f80942OooOo0o;
                                                if (file2 != null) {
                                                }
                                                return obj3;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            str2 = "restoreNoteByNoteFile, delete import dir: ";
                                            str = str4;
                                            r65 = r6;
                                            r33 = r65;
                                            file = (File) r33.f80942OooOo0o;
                                            if (file != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    return enumC32485OooO00o;
                                } catch (Exception e15) {
                                    e = e15;
                                    str2 = "restoreNoteByNoteFile, delete import dir: ";
                                    uri = uri2;
                                    noteFile2 = noteFile;
                                    str = str4;
                                    obj3 = null;
                                    r33 = c24034Oooo00O;
                                    C34406OooO00o.C20358OooO00o c20358OooO00o322222222 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o322222222.OooOOO0("NoteInFileUseCase");
                                    c20358OooO00o322222222.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                                    file2 = (File) r33.f80942OooOo0o;
                                    if (file2 != null) {
                                    }
                                    return obj3;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                str2 = "restoreNoteByNoteFile, delete import dir: ";
                                str = str4;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            str2 = "restoreNoteByNoteFile, delete import dir: ";
                            uri = uri2;
                            noteFile2 = noteFile;
                            str = str4;
                        }
                    } else {
                        str = ", result: ";
                        str2 = "restoreNoteByNoteFile, delete import dir: ";
                        uri = uri2;
                        noteFile2 = noteFile;
                        obj3 = null;
                        try {
                            throw new C27387o0000o0.OooO0O0(LoginErrorCode.ERROR_CODE_USER_HAS_BIND_ANOTHER_ACCOUNT, "noteId is null, noteFile: " + noteFile2);
                        } catch (Exception e17) {
                            e = e17;
                            r33 = c24034Oooo00O;
                            C34406OooO00o.C20358OooO00o c20358OooO00o3222222222 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3222222222.OooOOO0("NoteInFileUseCase");
                            c20358OooO00o3222222222.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                            file2 = (File) r33.f80942OooOo0o;
                            if (file2 != null) {
                            }
                            return obj3;
                        } catch (Throwable th11) {
                            th = th11;
                        }
                    }
                } catch (Exception e18) {
                    e = e18;
                    str = ", result: ";
                    str2 = "restoreNoteByNoteFile, delete import dir: ";
                    uri = uri2;
                    noteFile2 = noteFile;
                } catch (Throwable th12) {
                    th = th12;
                    str = ", result: ";
                    str2 = "restoreNoteByNoteFile, delete import dir: ";
                }
                r33 = c24034Oooo00O;
                file = (File) r33.f80942OooOo0o;
                if (file != null) {
                    boolean zOooO0Oo2 = C32501OooO0oO.OooO0Oo(file);
                    C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o7.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o7.OooO0o0(str2 + r33.f80942OooOo0o + str + zOooO0Oo2, new Object[0]);
                }
                throw th;
            case 1:
                str3 = "restoreNoteByNoteFile, srcNoteMeta: ";
                noteFile = noteFile3;
                j = this.f97058OooOoO;
                String str13 = (String) this.f97056OooOo;
                C24034Oooo00O c24034Oooo00O2 = this.f97057OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    str5 = str13;
                    str4 = ", result: ";
                    objOooo0 = obj;
                    r6 = c24034Oooo00O2;
                    C27387o0000o0.OooO0o oooO0o2 = (C27387o0000o0.OooO0o) objOooo0;
                    File file42 = oooO0o2.f95463OooO00o;
                    fileArr = oooO0o2.f95464OooO0O0;
                    arrayList = oooO0o2.f95465OooO0OO;
                    r6.f80942OooOo0o = file42.getParentFile();
                    String str122 = str5;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22.OooOOO0("NoteInFileUseCase");
                    str6 = "restoreNoteByNoteFile, delete import dir: ";
                    uri = uri2;
                    str7 = "restoreNoteByNoteFile, restore files cost: ";
                    c20358OooO00o22.OooO0o0("restoreNoteByNoteFile, unzipAndValidateSource cost: " + (jCurrentTimeMillis - j), new Object[0]);
                    this.f97057OooOo0o = r6;
                    str8 = str122;
                    this.f97056OooOo = str8;
                    this.f97059OooOoO0 = fileArr;
                    this.f97058OooOoO = j;
                    this.f97060OooOoOO = jCurrentTimeMillis;
                    this.f97061OooOoo = 2;
                    if (C27387o0000o0.OooOoo0(c27387o0000o0, arrayList, str8, this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                } catch (Exception e19) {
                    e = e19;
                    obj2 = c24034Oooo00O2;
                    str = ", result: ";
                    str2 = "restoreNoteByNoteFile, delete import dir: ";
                    uri = uri2;
                    noteFile2 = noteFile;
                    r3 = obj2;
                    obj3 = null;
                    r33 = r3;
                    C34406OooO00o.C20358OooO00o c20358OooO00o32222222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o32222222222.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o32222222222.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                    file2 = (File) r33.f80942OooOo0o;
                    if (file2 != null) {
                    }
                    return obj3;
                }
            case 2:
                str3 = "restoreNoteByNoteFile, srcNoteMeta: ";
                noteFile = noteFile3;
                j3 = this.f97060OooOoOO;
                long j6 = this.f97058OooOoO;
                fileArr2 = (File[]) this.f97059OooOoO0;
                String str14 = (String) this.f97056OooOo;
                C24034Oooo00O c24034Oooo00O3 = this.f97057OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str7 = "restoreNoteByNoteFile, restore files cost: ";
                str8 = str14;
                str4 = ", result: ";
                str6 = "restoreNoteByNoteFile, delete import dir: ";
                uri = uri2;
                r33 = c24034Oooo00O3;
                j2 = j6;
                this.f97057OooOo0o = r33;
                this.f97056OooOo = str8;
                this.f97059OooOoO0 = fileArr2;
                this.f97058OooOoO = j2;
                this.f97060OooOoOO = j3;
                this.f97061OooOoo = 3;
                objOooOooo = C27387o0000o0.OooOooo(c27387o0000o0, fileArr2, str8, this);
                r32 = r33;
                if (objOooOooo == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                str3 = "restoreNoteByNoteFile, srcNoteMeta: ";
                noteFile = noteFile3;
                j3 = this.f97060OooOoOO;
                long j7 = this.f97058OooOoO;
                fileArr2 = (File[]) this.f97059OooOoO0;
                String str15 = (String) this.f97056OooOo;
                C24034Oooo00O c24034Oooo00O4 = this.f97057OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str7 = "restoreNoteByNoteFile, restore files cost: ";
                str8 = str15;
                str4 = ", result: ";
                str6 = "restoreNoteByNoteFile, delete import dir: ";
                uri = uri2;
                objOooOooo = obj;
                r32 = c24034Oooo00O4;
                j2 = j7;
                fileArr3 = fileArr2;
                zBooleanValue = ((Boolean) objOooOooo).booleanValue();
                C27387o0000o0.Oooo000(c27387o0000o0, fileArr3);
                this.f97057OooOo0o = r32;
                this.f97056OooOo = str8;
                this.f97059OooOoO0 = fileArr3;
                this.f97058OooOoO = j2;
                this.f97060OooOoOO = j3;
                this.f97062OooOoo0 = zBooleanValue;
                this.f97061OooOoo = 4;
                if (C27387o0000o0.OooOooO(c27387o0000o0, fileArr3, str8, this) == enumC32485OooO00o) {
                }
                break;
            case 4:
                boolean z3 = this.f97062OooOoo0;
                str3 = "restoreNoteByNoteFile, srcNoteMeta: ";
                j3 = this.f97060OooOoOO;
                noteFile = noteFile3;
                j2 = this.f97058OooOoO;
                fileArr3 = (File[]) this.f97059OooOoO0;
                str9 = (String) this.f97056OooOo;
                C24034Oooo00O c24034Oooo00O5 = this.f97057OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    str7 = "restoreNoteByNoteFile, restore files cost: ";
                    zBooleanValue = z3;
                    r33 = c24034Oooo00O5;
                    str4 = ", result: ";
                    str6 = "restoreNoteByNoteFile, delete import dir: ";
                    uri = uri2;
                    long jCurrentTimeMillis32 = System.currentTimeMillis();
                    C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o42.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o42.OooO0o0(str7 + (jCurrentTimeMillis32 - j3), new Object[0]);
                    noteMetaOooOoO = C27387o0000o0.OooOoO(c27387o0000o0, fileArr3);
                    c20358OooO00o42.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o42.OooO00o(str3 + noteMetaOooOoO, new Object[0]);
                    length = fileArr3.length;
                    i = 0;
                    while (true) {
                        if (i >= length) {
                        }
                        i++;
                    }
                    if (file3 != null) {
                        break;
                    }
                    z = zBooleanValue;
                    str10 = str9;
                    r6 = r33;
                    noteMeta = noteMetaOooOoO;
                    C27387o0000o0 c27387o0000o0222 = this.f97065Oooo000;
                    this.f97057OooOo0o = r6;
                    this.f97056OooOo = null;
                    this.f97059OooOoO0 = null;
                    this.f97058OooOoO = j2;
                    this.f97061OooOoo = 6;
                    noteFile2 = noteFile;
                    objOooO00o = C27387o0000o0.OooO00o(c27387o0000o0222, str10, noteFile2, noteMeta, z, this);
                    if (objOooO00o != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                } catch (Exception e20) {
                    e = e20;
                    obj2 = c24034Oooo00O5;
                    str = ", result: ";
                    str2 = "restoreNoteByNoteFile, delete import dir: ";
                    uri = uri2;
                    noteFile2 = noteFile;
                    r3 = obj2;
                    obj3 = null;
                    r33 = r3;
                    C34406OooO00o.C20358OooO00o c20358OooO00o322222222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o322222222222.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o322222222222.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                    file2 = (File) r33.f80942OooOo0o;
                    if (file2 != null) {
                    }
                    return obj3;
                } catch (Throwable th13) {
                    th = th13;
                    r33 = c24034Oooo00O5;
                    str = ", result: ";
                    str2 = "restoreNoteByNoteFile, delete import dir: ";
                    file = (File) r33.f80942OooOo0o;
                    if (file != null) {
                    }
                    throw th;
                }
            case 5:
                z2 = this.f97062OooOoo0;
                j4 = this.f97058OooOoO;
                noteMeta = (NoteMeta) this.f97059OooOoO0;
                str11 = (String) this.f97056OooOo;
                C24034Oooo00O c24034Oooo00O6 = this.f97057OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    noteFile = noteFile3;
                    str4 = ", result: ";
                    str6 = "restoreNoteByNoteFile, delete import dir: ";
                    uri = uri2;
                    r62 = c24034Oooo00O6;
                    j2 = j4;
                    str10 = str11;
                    z = z2;
                    r6 = r62;
                    C27387o0000o0 c27387o0000o02222 = this.f97065Oooo000;
                    this.f97057OooOo0o = r6;
                    this.f97056OooOo = null;
                    this.f97059OooOoO0 = null;
                    this.f97058OooOoO = j2;
                    this.f97061OooOoo = 6;
                    noteFile2 = noteFile;
                    objOooO00o = C27387o0000o0.OooO00o(c27387o0000o02222, str10, noteFile2, noteMeta, z, this);
                    if (objOooO00o != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                } catch (Exception e21) {
                    e = e21;
                    r33 = c24034Oooo00O6;
                    noteFile2 = noteFile3;
                    str = ", result: ";
                    str2 = "restoreNoteByNoteFile, delete import dir: ";
                    uri = uri2;
                    r3 = r33;
                    obj3 = null;
                    r33 = r3;
                    C34406OooO00o.C20358OooO00o c20358OooO00o3222222222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3222222222222.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o3222222222222.OooO0Oo(e, "restoreNoteByNoteFile error, srcUri: " + uri + ", noteFile: " + noteFile2, new Object[0]);
                    file2 = (File) r33.f80942OooOo0o;
                    if (file2 != null) {
                    }
                    return obj3;
                }
            case 6:
                long j8 = this.f97058OooOoO;
                C24034Oooo00O c24034Oooo00O7 = this.f97057OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteFile2 = noteFile3;
                str4 = ", result: ";
                str6 = "restoreNoteByNoteFile, delete import dir: ";
                uri = uri2;
                j2 = j8;
                objOooO00o = obj;
                r33 = c24034Oooo00O7;
                noteMeta2 = (NoteMeta) objOooO00o;
                C34406OooO00o.C20358OooO00o c20358OooO00o52 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o52.OooOOO0("NoteInFileUseCase");
                c20358OooO00o52.OooO00o("restoreNoteByNoteFile, restored noteMeta: " + noteMeta2, new Object[0]);
                C27585o00ooO0 c27585o00ooO02 = c27387o0000o0.f95445OooOo0;
                String id2 = noteMeta2.getId();
                this.f97057OooOo0o = r33;
                this.f97056OooOo = noteMeta2;
                this.f97058OooOoO = j2;
                this.f97061OooOoo = 7;
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                obj3 = null;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27576o00oo00O(c27585o00ooO02, id2, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                long j9 = this.f97058OooOoO;
                noteMeta3 = (NoteMeta) this.f97056OooOo;
                r4 = this.f97057OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    noteFile2 = noteFile3;
                    j2 = j9;
                    objOooO0o = obj;
                    str4 = ", result: ";
                    str6 = "restoreNoteByNoteFile, delete import dir: ";
                    uri = uri2;
                    obj3 = null;
                    r4 = r4;
                    page = (Page) objOooO0o;
                    r42 = r4;
                    if (page != null) {
                    }
                } catch (Exception e22) {
                    e = e22;
                    noteFile2 = noteFile3;
                    j2 = j9;
                    str4 = ", result: ";
                    str6 = "restoreNoteByNoteFile, delete import dir: ";
                    uri = uri2;
                    obj3 = null;
                    C34406OooO00o.C20358OooO00o c20358OooO00o622 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o622.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o622.OooO0Oo(e, "createNoteCoverTn error.", new Object[0]);
                    r42 = r4;
                    j5 = j2;
                    InterfaceC27313OooOoo0 interfaceC27313OooOoo022 = c27387o0000o0.f95427OooO0O0;
                    this.f97057OooOo0o = r42;
                    this.f97056OooOo = noteMeta3;
                    this.f97058OooOoO = j5;
                    this.f97061OooOoo = 8;
                    r4 = r42;
                    break;
                } catch (Throwable th14) {
                    th = th14;
                    r33 = r4;
                    str = ", result: ";
                    str2 = "restoreNoteByNoteFile, delete import dir: ";
                    file = (File) r33.f80942OooOo0o;
                    if (file != null) {
                    }
                    throw th;
                }
                j5 = j2;
                InterfaceC27313OooOoo0 interfaceC27313OooOoo0222 = c27387o0000o0.f95427OooO0O0;
                this.f97057OooOo0o = r42;
                this.f97056OooOo = noteMeta3;
                this.f97058OooOoO = j5;
                this.f97061OooOoo = 8;
                r4 = r42;
                break;
            case 8:
                j5 = this.f97058OooOoO;
                NoteMeta noteMeta4 = (NoteMeta) this.f97056OooOo;
                C24034Oooo00O c24034Oooo00O8 = this.f97057OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                r4 = c24034Oooo00O8;
                str4 = ", result: ";
                str6 = "restoreNoteByNoteFile, delete import dir: ";
                uri = uri2;
                obj3 = null;
                noteMeta3 = noteMeta4;
                noteFile2 = noteFile3;
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o8.OooOOO0("NoteInFileUseCase");
                c20358OooO00o8.OooO0o0("restoreNoteByNoteFile done, total cost: " + (jCurrentTimeMillis4 - j5) + TranslateLanguage.MALAY, new Object[0]);
                File file5 = (File) r4.f80942OooOo0o;
                if (file5 != null) {
                    boolean zOooO0Oo3 = C32501OooO0oO.OooO0Oo(file5);
                    c20358OooO00o8.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o8.OooO0o0(str6 + r4.f80942OooOo0o + str4 + zOooO0Oo3, new Object[0]);
                }
                return noteMeta3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
