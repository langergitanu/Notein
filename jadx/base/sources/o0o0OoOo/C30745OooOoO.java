package o0o0OoOo;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.C21904OooOoo0;
import com.aspose.words.TableStyleOptions;
import com.orion.notein.data.p602db.NoteDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o00o00Oo.C25261OooO0o0;
import o00o00oo.C25298OooO0o;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OoOo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$restoreFromHarmonyBackup$2", m80623f = "DebugViewModel.kt", m80624l = {612, 625, 632, 660, 665, TableStyleOptions.DEFAULT, 677, 679, 680, 690, 695}, m80625m = "invokeSuspend")
public final class C30745OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Serializable f109959OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24034Oooo00O f109960OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f109961OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public File f109962OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109963OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Uri f109964OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30745OooOoO(C30722OooO00o c30722OooO00o, Uri uri, Continuation<? super C30745OooOoO> continuation) {
        super(2, continuation);
        this.f109963OooOoOO = c30722OooO00o;
        this.f109964OooOoo0 = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30745OooOoO(this.f109963OooOoOO, this.f109964OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30745OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x043f, code lost:
    
        if (r3.emit(r4, r24) != r9) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f6 A[Catch: all -> 0x003b, Exception -> 0x01b9, PHI: r0 r2 r4 r19 r20 r21 r22 r23
      0x02f6: PHI (r0v33 java.io.File) = (r0v31 java.io.File), (r0v34 java.io.File) binds: [B:109:0x02f2, B:34:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r2v29 ??) = (r2v57 ??), (r2v30 ??) binds: [B:109:0x02f2, B:34:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r4v17 java.io.File) = (r4v14 java.io.File), (r4v22 java.io.File) binds: [B:109:0x02f2, B:34:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r19v11 o0o0OoOo.OooO00o) = (r19v9 o0o0OoOo.OooO00o), (r19v12 o0o0OoOo.OooO00o) binds: [B:109:0x02f2, B:34:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r20v9 android.content.Context) = (r20v7 android.content.Context), (r20v10 android.content.Context) binds: [B:109:0x02f2, B:34:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r21v9 java.lang.String) = (r21v7 java.lang.String), (r21v10 java.lang.String) binds: [B:109:0x02f2, B:34:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r22v9 java.lang.String) = (r22v7 java.lang.String), (r22v10 java.lang.String) binds: [B:109:0x02f2, B:34:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r23v9 com.orion.notein.data.db.NoteDatabase) = (r23v7 com.orion.notein.data.db.NoteDatabase), (r23v10 com.orion.notein.data.db.NoteDatabase) binds: [B:109:0x02f2, B:34:0x0093] A[DONT_GENERATE, DONT_INLINE], TryCatch #9 {Exception -> 0x01b9, blocks: (B:130:0x03df, B:127:0x03c8, B:126:0x03bb, B:120:0x038d, B:117:0x037d, B:114:0x033b, B:111:0x02f6, B:108:0x02cb, B:95:0x024c, B:97:0x026d, B:99:0x0273, B:105:0x028a, B:100:0x0279, B:102:0x027f, B:104:0x0285, B:135:0x03fc, B:91:0x0207, B:65:0x015b, B:71:0x01b5, B:87:0x01cd, B:85:0x01c9, B:86:0x01cc), top: B:165:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x033b A[Catch: all -> 0x003b, Exception -> 0x01b9, PHI: r0 r2 r19 r20 r22 r23
      0x033b: PHI (r0v35 java.io.File) = (r0v33 java.io.File), (r0v40 java.io.File) binds: [B:112:0x0337, B:27:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x033b: PHI (r2v31 ??) = (r2v56 ??), (r2v34 ??) binds: [B:112:0x0337, B:27:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x033b: PHI (r19v13 o0o0OoOo.OooO00o) = (r19v11 o0o0OoOo.OooO00o), (r19v14 o0o0OoOo.OooO00o) binds: [B:112:0x0337, B:27:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x033b: PHI (r20v11 android.content.Context) = (r20v9 android.content.Context), (r20v12 android.content.Context) binds: [B:112:0x0337, B:27:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x033b: PHI (r22v11 java.lang.String) = (r22v9 java.lang.String), (r22v12 java.lang.String) binds: [B:112:0x0337, B:27:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x033b: PHI (r23v11 com.orion.notein.data.db.NoteDatabase) = (r23v9 com.orion.notein.data.db.NoteDatabase), (r23v12 com.orion.notein.data.db.NoteDatabase) binds: [B:112:0x0337, B:27:0x0076] A[DONT_GENERATE, DONT_INLINE], TryCatch #9 {Exception -> 0x01b9, blocks: (B:130:0x03df, B:127:0x03c8, B:126:0x03bb, B:120:0x038d, B:117:0x037d, B:114:0x033b, B:111:0x02f6, B:108:0x02cb, B:95:0x024c, B:97:0x026d, B:99:0x0273, B:105:0x028a, B:100:0x0279, B:102:0x027f, B:104:0x0285, B:135:0x03fc, B:91:0x0207, B:65:0x015b, B:71:0x01b5, B:87:0x01cd, B:85:0x01c9, B:86:0x01cc), top: B:165:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037d A[Catch: all -> 0x003b, Exception -> 0x01b9, PHI: r2 r19 r23
      0x037d: PHI (r2v35 ??) = (r2v54 ??), (r2v55 ??) binds: [B:115:0x0379, B:24:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x037d: PHI (r19v15 o0o0OoOo.OooO00o) = (r19v13 o0o0OoOo.OooO00o), (r19v16 o0o0OoOo.OooO00o) binds: [B:115:0x0379, B:24:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x037d: PHI (r23v13 com.orion.notein.data.db.NoteDatabase) = (r23v11 com.orion.notein.data.db.NoteDatabase), (r23v14 com.orion.notein.data.db.NoteDatabase) binds: [B:115:0x0379, B:24:0x0067] A[DONT_GENERATE, DONT_INLINE], TryCatch #9 {Exception -> 0x01b9, blocks: (B:130:0x03df, B:127:0x03c8, B:126:0x03bb, B:120:0x038d, B:117:0x037d, B:114:0x033b, B:111:0x02f6, B:108:0x02cb, B:95:0x024c, B:97:0x026d, B:99:0x0273, B:105:0x028a, B:100:0x0279, B:102:0x027f, B:104:0x0285, B:135:0x03fc, B:91:0x0207, B:65:0x015b, B:71:0x01b5, B:87:0x01cd, B:85:0x01c9, B:86:0x01cc), top: B:165:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x038d A[Catch: all -> 0x003b, Exception -> 0x01b9, PHI: r2 r19 r23
      0x038d: PHI (r2v37 ??) = (r2v52 ??), (r2v53 ??) binds: [B:118:0x0389, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x038d: PHI (r19v17 o0o0OoOo.OooO00o) = (r19v15 o0o0OoOo.OooO00o), (r19v18 o0o0OoOo.OooO00o) binds: [B:118:0x0389, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x038d: PHI (r23v15 com.orion.notein.data.db.NoteDatabase) = (r23v13 com.orion.notein.data.db.NoteDatabase), (r23v16 com.orion.notein.data.db.NoteDatabase) binds: [B:118:0x0389, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #9 {Exception -> 0x01b9, blocks: (B:130:0x03df, B:127:0x03c8, B:126:0x03bb, B:120:0x038d, B:117:0x037d, B:114:0x033b, B:111:0x02f6, B:108:0x02cb, B:95:0x024c, B:97:0x026d, B:99:0x0273, B:105:0x028a, B:100:0x0279, B:102:0x027f, B:104:0x0285, B:135:0x03fc, B:91:0x0207, B:65:0x015b, B:71:0x01b5, B:87:0x01cd, B:85:0x01c9, B:86:0x01cc), top: B:165:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a5 A[EXC_TOP_SPLITTER, PHI: r2 r19 r23
      0x03a5: PHI (r2v39 ??) = (r2v50 ??), (r2v51 ??) binds: [B:121:0x03a1, B:18:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x03a5: PHI (r19v19 o0o0OoOo.OooO00o) = (r19v17 o0o0OoOo.OooO00o), (r19v20 o0o0OoOo.OooO00o) binds: [B:121:0x03a1, B:18:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x03a5: PHI (r23v17 com.orion.notein.data.db.NoteDatabase) = (r23v15 com.orion.notein.data.db.NoteDatabase), (r23v18 com.orion.notein.data.db.NoteDatabase) binds: [B:121:0x03a1, B:18:0x0051] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024b  */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.io.File, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v37, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v39, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v41, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.File, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        File file;
        C30722OooO00o c30722OooO00o;
        ?? r2;
        Context context;
        String str;
        String str2;
        NoteDatabase noteDatabase;
        ?? r8;
        InputStream inputStreamOpenInputStream;
        C33781o00o0O c33781o00o0O;
        Integer numOooO0OO;
        File file2;
        ?? r6;
        ?? r22;
        C33781o00o0O c33781o00o0O2;
        Integer numOooO0OO2;
        File file3;
        ?? r23;
        File file4;
        File file5;
        File file6;
        File file7;
        C32449OooOOoo c32449OooOOoo;
        File file8;
        File file9;
        ?? r24;
        C33781o00o0O c33781o00o0O3;
        Integer numOooO0OO3;
        ?? r25;
        C33781o00o0O c33781o00o0O4;
        Integer numOooO0OO4;
        ?? r26;
        C33781o00o0O c33781o00o0O5;
        Integer numOooO0OO5;
        ?? r27;
        ?? r28;
        C33781o00o0O c33781o00o0O6;
        Integer numOooO0OO6;
        ?? r29;
        C33781o00o0O c33781o00o0O7;
        Integer numOooO0OO7;
        ?? r210;
        File file10;
        ?? r211 = "restoreFromHarmonyBackup, Files copied to ";
        C21904OooOoo0.OooO0Oo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r10 = this.f109961OooOoO;
        C30722OooO00o c30722OooO00o2 = this.f109963OooOoOO;
        NoteDatabase noteDatabase2 = c30722OooO00o2.f109877OooOo0O;
        Context context2 = c30722OooO00o2.f109859OooO0Oo;
        try {
            try {
                try {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        r211 = r10;
                    }
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
            r211 = "restoreFromHarmonyBackup, copy zipUri to tempZipFile completed, size: ";
        } catch (Throwable th3) {
            th = th3;
            r211 = "restoreFromHarmonyBackup, copy zipUri to tempZipFile completed, size: ";
        }
        switch (r10) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                c30722OooO00o = c30722OooO00o2;
                try {
                    context = context2;
                    str = "restoreFromHarmonyBackup, Files copied to ";
                    str2 = "restoreFromHarmonyBackup, Database files copied to ";
                    noteDatabase = noteDatabase2;
                    ?? file11 = new File(context.getCacheDir(), "harmony_backup_temp_" + System.currentTimeMillis());
                    C31190OooO0oo.OooO0o(file11);
                    c24034Oooo00O.f80942OooOo0o = file11;
                    C33781o00o0O c33781o00o0O8 = c30722OooO00o.f109878OooOo0o;
                    Integer numOooO0OO8 = C25261OooO0o0.OooO0OO(10);
                    this.f109960OooOo0o = c24034Oooo00O;
                    this.f109959OooOo = file11;
                    this.f109961OooOoO = 1;
                    if (c33781o00o0O8.emit(numOooO0OO8, this) != enumC32485OooO00o) {
                        r8 = file11;
                        r10 = c24034Oooo00O;
                        r211 = r10;
                        try {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("DebugViewModel");
                            c20358OooO00o.OooO0o0("restoreFromHarmonyBackup, tempDir: " + r8.getAbsolutePath(), new Object[0]);
                            File file12 = new File((File) r8, "harmony_backup.zip");
                            c20358OooO00o.OooOOO0("DebugViewModel");
                            c20358OooO00o.OooO0o0("restoreFromHarmonyBackup, tempZipFile: " + file12.getAbsolutePath(), new Object[0]);
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(this.f109964OooOoo0);
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    C31190OooO0oo.OooO0oO(file12);
                                    FileOutputStream fileOutputStream = new FileOutputStream(file12);
                                    try {
                                        long jOooO00o = C25298OooO0o.OooO00o(inputStreamOpenInputStream, fileOutputStream);
                                        oO0O000.OooO00o.OooO00o(fileOutputStream, null);
                                        C25261OooO0o0.OooO0Oo(jOooO00o);
                                        oO0O000.OooO00o.OooO00o(inputStreamOpenInputStream, null);
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            c20358OooO00o.OooOOO0("DebugViewModel");
                            c20358OooO00o.OooO0o0("restoreFromHarmonyBackup, copy zipUri to tempZipFile completed, size: " + C31430OooO00o.OooO0OO(file12.length()), new Object[0]);
                            c33781o00o0O = c30722OooO00o.f109878OooOo0o;
                            numOooO0OO = C25261OooO0o0.OooO0OO(20);
                            this.f109960OooOo0o = r211;
                            this.f109959OooOo = r8;
                            this.f109962OooOoO0 = file12;
                            this.f109961OooOoO = 2;
                            if (c33781o00o0O.emit(numOooO0OO, this) == enumC32485OooO00o) {
                                file2 = file12;
                                r6 = r8;
                                r22 = r211;
                                File file13 = new File((File) r6, "extracted");
                                C31190OooO0oo.OooO0o(file13);
                                C31193OooOOo.OooO0OO(file2, file13);
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0("DebugViewModel");
                                c20358OooO00o2.OooO0o0("restoreFromHarmonyBackup unzipFile completed, extractDir: " + file13.getAbsolutePath(), new Object[0]);
                                c33781o00o0O2 = c30722OooO00o.f109878OooOo0o;
                                numOooO0OO2 = C25261OooO0o0.OooO0OO(30);
                                this.f109960OooOo0o = r22;
                                this.f109959OooOo = file13;
                                this.f109962OooOoO0 = null;
                                this.f109961OooOoO = 3;
                                if (c33781o00o0O2.emit(numOooO0OO2, this) == enumC32485OooO00o) {
                                    file3 = file13;
                                    r23 = r22;
                                    file4 = new File(file3, "databases");
                                    File file14 = new File(file3, "files");
                                    file5 = new File(file3, "ce");
                                    file6 = new File(file5, "databases");
                                    File file15 = new File(file5, "files");
                                    if (!file4.isDirectory() && file14.isDirectory()) {
                                        c32449OooOOoo = new C32449OooOOoo(file3, file4, file14);
                                    } else {
                                        if (file6.isDirectory() || !file15.isDirectory()) {
                                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o3.OooOOO0("DebugViewModel");
                                            c20358OooO00o3.OooO0OO("Invalid harmony backup structure: no databases/files found under %s or %s", file3.getAbsolutePath(), file5.getAbsolutePath());
                                            Boolean boolOooO0O0 = C25261OooO0o0.OooO0O0(false);
                                            file7 = (File) r23.f80942OooOo0o;
                                            if (file7 != null) {
                                                C31190OooO0oo.OooO0oo(file7);
                                            }
                                            return boolOooO0O0;
                                        }
                                        c32449OooOOoo = new C32449OooOOoo(file5, file6, file15);
                                    }
                                    File file16 = (File) c32449OooOOoo.f116648OooOo0o;
                                    file8 = (File) c32449OooOOoo.f116647OooOo;
                                    file9 = (File) c32449OooOOoo.f116649OooOoO0;
                                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o4.OooOOO0("DebugViewModel");
                                    c20358OooO00o4.OooO0o0("restoreFromHarmonyBackup resolved root=%s databasesDir=%s filesDir=%s", file16.getAbsolutePath(), file8.getAbsolutePath(), file9.getAbsolutePath());
                                    C33781o00o0O c33781o00o0O9 = c30722OooO00o.f109878OooOo0o;
                                    Integer numOooO0OO9 = C25261OooO0o0.OooO0OO(40);
                                    this.f109960OooOo0o = r23;
                                    this.f109959OooOo = file8;
                                    this.f109962OooOoO0 = file9;
                                    this.f109961OooOoO = 4;
                                    r24 = r23;
                                    if (c33781o00o0O9.emit(numOooO0OO9, this) != enumC32485OooO00o) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o5.OooOOO0("DebugViewModel");
                                        c20358OooO00o5.OooO0o0("restoreFromHarmonyBackup, Closing database connection before copying files", new Object[0]);
                                        noteDatabase.OooO0Oo();
                                        c33781o00o0O3 = c30722OooO00o.f109878OooOo0o;
                                        numOooO0OO3 = C25261OooO0o0.OooO0OO(50);
                                        this.f109960OooOo0o = r24;
                                        this.f109959OooOo = file8;
                                        this.f109962OooOoO0 = file9;
                                        this.f109961OooOoO = 5;
                                        r25 = r24;
                                        if (c33781o00o0O3.emit(numOooO0OO3, this) == enumC32485OooO00o) {
                                            File file17 = new File(context.getDataDir(), "databases");
                                            C31190OooO0oo.OooO00o(file8, file17);
                                            C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o6.OooOOO0("DebugViewModel");
                                            c20358OooO00o6.OooO0o0(str2 + file17.getAbsolutePath(), new Object[0]);
                                            c33781o00o0O4 = c30722OooO00o.f109878OooOo0o;
                                            numOooO0OO4 = C25261OooO0o0.OooO0OO(60);
                                            this.f109960OooOo0o = r25;
                                            this.f109959OooOo = file9;
                                            this.f109962OooOoO0 = null;
                                            this.f109961OooOoO = 6;
                                            r26 = r25;
                                            if (c33781o00o0O4.emit(numOooO0OO4, this) == enumC32485OooO00o) {
                                                C31190OooO0oo.OooO00o(file9, context.getFilesDir());
                                                C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o7.OooOOO0("DebugViewModel");
                                                c20358OooO00o7.OooO0o0(str + context.getFilesDir().getAbsolutePath(), new Object[0]);
                                                c33781o00o0O5 = c30722OooO00o.f109878OooOo0o;
                                                numOooO0OO5 = C25261OooO0o0.OooO0OO(70);
                                                this.f109960OooOo0o = r26;
                                                this.f109959OooOo = null;
                                                this.f109961OooOoO = 7;
                                                r27 = r26;
                                                if (c33781o00o0O5.emit(numOooO0OO5, this) == enumC32485OooO00o) {
                                                    this.f109960OooOo0o = r27;
                                                    this.f109961OooOoO = 8;
                                                    r28 = r27;
                                                    if (C33644OoooO0.OooO00o(500L, this) == enumC32485OooO00o) {
                                                        c33781o00o0O6 = c30722OooO00o.f109878OooOo0o;
                                                        numOooO0OO6 = C25261OooO0o0.OooO0OO(80);
                                                        this.f109960OooOo0o = r28;
                                                        this.f109961OooOoO = 9;
                                                        r29 = r28;
                                                        if (c33781o00o0O6.emit(numOooO0OO6, this) != enumC32485OooO00o) {
                                                            try {
                                                                noteDatabase.OooOO0O().o0000oOo();
                                                                C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                                                                c20358OooO00o8.OooOOO0("DebugViewModel");
                                                                c20358OooO00o8.OooO0o0("Database reconnected successfully", new Object[0]);
                                                                break;
                                                            } catch (Exception e3) {
                                                                C34406OooO00o.C20358OooO00o c20358OooO00o9 = C34406OooO00o.f123390OooO00o;
                                                                c20358OooO00o9.OooOOO0("DebugViewModel");
                                                                c20358OooO00o9.OooO0Oo(e3, "Failed to reconnect database, will try with queries", new Object[0]);
                                                            }
                                                            c33781o00o0O7 = c30722OooO00o.f109878OooOo0o;
                                                            numOooO0OO7 = C25261OooO0o0.OooO0OO(100);
                                                            this.f109960OooOo0o = r29;
                                                            this.f109961OooOoO = 10;
                                                            r210 = r29;
                                                            if (c33781o00o0O7.emit(numOooO0OO7, this) == enumC32485OooO00o) {
                                                            }
                                                            C34406OooO00o.C20358OooO00o c20358OooO00o10 = C34406OooO00o.f123390OooO00o;
                                                            c20358OooO00o10.OooOOO0("DebugViewModel");
                                                            c20358OooO00o10.OooO0o0("restoreFromHarmonyBackup, Harmony backup restore completed successfully", new Object[0]);
                                                            Boolean boolOooO0O02 = C25261OooO0o0.OooO0O0(true);
                                                            file10 = (File) r210.f80942OooOo0o;
                                                            if (file10 != null) {
                                                                C31190OooO0oo.OooO0oo(file10);
                                                            }
                                                            return boolOooO0O02;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            C33781o00o0O c33781o00o0O10 = c30722OooO00o.f109878OooOo0o;
                            Integer numOooO0OO10 = C25261OooO0o0.OooO0OO(0);
                            this.f109960OooOo0o = r211;
                            this.f109959OooOo = e;
                            this.f109962OooOoO0 = null;
                            this.f109961OooOoO = 11;
                            r2 = r211;
                            break;
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                    r211 = c24034Oooo00O;
                    C33781o00o0O c33781o00o0O102 = c30722OooO00o.f109878OooOo0o;
                    Integer numOooO0OO102 = C25261OooO0o0.OooO0OO(0);
                    this.f109960OooOo0o = r211;
                    this.f109959OooOo = e;
                    this.f109962OooOoO0 = null;
                    this.f109961OooOoO = 11;
                    r2 = r211;
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                File file18 = (File) this.f109959OooOo;
                C24034Oooo00O c24034Oooo00O2 = this.f109960OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    str = "restoreFromHarmonyBackup, Files copied to ";
                    str2 = "restoreFromHarmonyBackup, Database files copied to ";
                    c30722OooO00o = c30722OooO00o2;
                    context = context2;
                    noteDatabase = noteDatabase2;
                    r8 = file18;
                    r10 = c24034Oooo00O2;
                    r211 = r10;
                    C34406OooO00o.C20358OooO00o c20358OooO00o11 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o11.OooOOO0("DebugViewModel");
                    c20358OooO00o11.OooO0o0("restoreFromHarmonyBackup, tempDir: " + r8.getAbsolutePath(), new Object[0]);
                    File file122 = new File((File) r8, "harmony_backup.zip");
                    c20358OooO00o11.OooOOO0("DebugViewModel");
                    c20358OooO00o11.OooO0o0("restoreFromHarmonyBackup, tempZipFile: " + file122.getAbsolutePath(), new Object[0]);
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(this.f109964OooOoo0);
                    if (inputStreamOpenInputStream != null) {
                    }
                    c20358OooO00o11.OooOOO0("DebugViewModel");
                    c20358OooO00o11.OooO0o0("restoreFromHarmonyBackup, copy zipUri to tempZipFile completed, size: " + C31430OooO00o.OooO0OO(file122.length()), new Object[0]);
                    c33781o00o0O = c30722OooO00o.f109878OooOo0o;
                    numOooO0OO = C25261OooO0o0.OooO0OO(20);
                    this.f109960OooOo0o = r211;
                    this.f109959OooOo = r8;
                    this.f109962OooOoO0 = file122;
                    this.f109961OooOoO = 2;
                    if (c33781o00o0O.emit(numOooO0OO, this) == enumC32485OooO00o) {
                    }
                } catch (Exception e6) {
                    e = e6;
                    r211 = c24034Oooo00O2;
                    c30722OooO00o = c30722OooO00o2;
                    C33781o00o0O c33781o00o0O1022 = c30722OooO00o.f109878OooOo0o;
                    Integer numOooO0OO1022 = C25261OooO0o0.OooO0OO(0);
                    this.f109960OooOo0o = r211;
                    this.f109959OooOo = e;
                    this.f109962OooOoO0 = null;
                    this.f109961OooOoO = 11;
                    r2 = r211;
                    break;
                }
                break;
            case 2:
                file2 = this.f109962OooOoO0;
                File file19 = (File) this.f109959OooOo;
                C24034Oooo00O c24034Oooo00O3 = this.f109960OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    str = "restoreFromHarmonyBackup, Files copied to ";
                    str2 = "restoreFromHarmonyBackup, Database files copied to ";
                    r22 = c24034Oooo00O3;
                    c30722OooO00o = c30722OooO00o2;
                    context = context2;
                    noteDatabase = noteDatabase2;
                    r6 = file19;
                    File file132 = new File((File) r6, "extracted");
                    C31190OooO0oo.OooO0o(file132);
                    C31193OooOOo.OooO0OO(file2, file132);
                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22.OooOOO0("DebugViewModel");
                    c20358OooO00o22.OooO0o0("restoreFromHarmonyBackup unzipFile completed, extractDir: " + file132.getAbsolutePath(), new Object[0]);
                    c33781o00o0O2 = c30722OooO00o.f109878OooOo0o;
                    numOooO0OO2 = C25261OooO0o0.OooO0OO(30);
                    this.f109960OooOo0o = r22;
                    this.f109959OooOo = file132;
                    this.f109962OooOoO0 = null;
                    this.f109961OooOoO = 3;
                    if (c33781o00o0O2.emit(numOooO0OO2, this) == enumC32485OooO00o) {
                    }
                } catch (Exception e7) {
                    e = e7;
                    r211 = c24034Oooo00O3;
                    c30722OooO00o = c30722OooO00o2;
                    C33781o00o0O c33781o00o0O10222 = c30722OooO00o.f109878OooOo0o;
                    Integer numOooO0OO10222 = C25261OooO0o0.OooO0OO(0);
                    this.f109960OooOo0o = r211;
                    this.f109959OooOo = e;
                    this.f109962OooOoO0 = null;
                    this.f109961OooOoO = 11;
                    r2 = r211;
                    break;
                } catch (Throwable th4) {
                    th = th4;
                    r211 = c24034Oooo00O3;
                    file = (File) r211.f80942OooOo0o;
                    if (file != null) {
                    }
                    throw th;
                }
                break;
            case 3:
                file3 = (File) this.f109959OooOo;
                C24034Oooo00O c24034Oooo00O4 = this.f109960OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str = "restoreFromHarmonyBackup, Files copied to ";
                str2 = "restoreFromHarmonyBackup, Database files copied to ";
                r23 = c24034Oooo00O4;
                c30722OooO00o = c30722OooO00o2;
                context = context2;
                noteDatabase = noteDatabase2;
                file4 = new File(file3, "databases");
                File file142 = new File(file3, "files");
                file5 = new File(file3, "ce");
                file6 = new File(file5, "databases");
                File file152 = new File(file5, "files");
                if (!file4.isDirectory()) {
                    break;
                }
                if (file6.isDirectory()) {
                    break;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("DebugViewModel");
                c20358OooO00o32.OooO0OO("Invalid harmony backup structure: no databases/files found under %s or %s", file3.getAbsolutePath(), file5.getAbsolutePath());
                Boolean boolOooO0O03 = C25261OooO0o0.OooO0O0(false);
                file7 = (File) r23.f80942OooOo0o;
                if (file7 != null) {
                }
                return boolOooO0O03;
            case 4:
                file9 = this.f109962OooOoO0;
                file8 = (File) this.f109959OooOo;
                C24034Oooo00O c24034Oooo00O5 = this.f109960OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str = "restoreFromHarmonyBackup, Files copied to ";
                str2 = "restoreFromHarmonyBackup, Database files copied to ";
                r24 = c24034Oooo00O5;
                c30722OooO00o = c30722OooO00o2;
                context = context2;
                noteDatabase = noteDatabase2;
                C34406OooO00o.C20358OooO00o c20358OooO00o52 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o52.OooOOO0("DebugViewModel");
                c20358OooO00o52.OooO0o0("restoreFromHarmonyBackup, Closing database connection before copying files", new Object[0]);
                noteDatabase.OooO0Oo();
                c33781o00o0O3 = c30722OooO00o.f109878OooOo0o;
                numOooO0OO3 = C25261OooO0o0.OooO0OO(50);
                this.f109960OooOo0o = r24;
                this.f109959OooOo = file8;
                this.f109962OooOoO0 = file9;
                this.f109961OooOoO = 5;
                r25 = r24;
                if (c33781o00o0O3.emit(numOooO0OO3, this) == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                file9 = this.f109962OooOoO0;
                file8 = (File) this.f109959OooOo;
                C24034Oooo00O c24034Oooo00O6 = this.f109960OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str = "restoreFromHarmonyBackup, Files copied to ";
                str2 = "restoreFromHarmonyBackup, Database files copied to ";
                r25 = c24034Oooo00O6;
                c30722OooO00o = c30722OooO00o2;
                context = context2;
                noteDatabase = noteDatabase2;
                File file172 = new File(context.getDataDir(), "databases");
                C31190OooO0oo.OooO00o(file8, file172);
                C34406OooO00o.C20358OooO00o c20358OooO00o62 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o62.OooOOO0("DebugViewModel");
                c20358OooO00o62.OooO0o0(str2 + file172.getAbsolutePath(), new Object[0]);
                c33781o00o0O4 = c30722OooO00o.f109878OooOo0o;
                numOooO0OO4 = C25261OooO0o0.OooO0OO(60);
                this.f109960OooOo0o = r25;
                this.f109959OooOo = file9;
                this.f109962OooOoO0 = null;
                this.f109961OooOoO = 6;
                r26 = r25;
                if (c33781o00o0O4.emit(numOooO0OO4, this) == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                file9 = (File) this.f109959OooOo;
                C24034Oooo00O c24034Oooo00O7 = this.f109960OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    str = "restoreFromHarmonyBackup, Files copied to ";
                    r26 = c24034Oooo00O7;
                    c30722OooO00o = c30722OooO00o2;
                    context = context2;
                    noteDatabase = noteDatabase2;
                    C31190OooO0oo.OooO00o(file9, context.getFilesDir());
                    C34406OooO00o.C20358OooO00o c20358OooO00o72 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o72.OooOOO0("DebugViewModel");
                    c20358OooO00o72.OooO0o0(str + context.getFilesDir().getAbsolutePath(), new Object[0]);
                    c33781o00o0O5 = c30722OooO00o.f109878OooOo0o;
                    numOooO0OO5 = C25261OooO0o0.OooO0OO(70);
                    this.f109960OooOo0o = r26;
                    this.f109959OooOo = null;
                    this.f109961OooOoO = 7;
                    r27 = r26;
                    if (c33781o00o0O5.emit(numOooO0OO5, this) == enumC32485OooO00o) {
                    }
                } catch (Exception e8) {
                    e = e8;
                    r211 = c24034Oooo00O7;
                    c30722OooO00o = c30722OooO00o2;
                    C33781o00o0O c33781o00o0O102222 = c30722OooO00o.f109878OooOo0o;
                    Integer numOooO0OO102222 = C25261OooO0o0.OooO0OO(0);
                    this.f109960OooOo0o = r211;
                    this.f109959OooOo = e;
                    this.f109962OooOoO0 = null;
                    this.f109961OooOoO = 11;
                    r2 = r211;
                    break;
                } catch (Throwable th5) {
                    th = th5;
                    r211 = c24034Oooo00O7;
                    file = (File) r211.f80942OooOo0o;
                    if (file != null) {
                        C31190OooO0oo.OooO0oo(file);
                    }
                    throw th;
                }
                return enumC32485OooO00o;
            case 7:
                C24034Oooo00O c24034Oooo00O8 = this.f109960OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c30722OooO00o = c30722OooO00o2;
                noteDatabase = noteDatabase2;
                r27 = c24034Oooo00O8;
                this.f109960OooOo0o = r27;
                this.f109961OooOoO = 8;
                r28 = r27;
                if (C33644OoooO0.OooO00o(500L, this) == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 8:
                C24034Oooo00O c24034Oooo00O9 = this.f109960OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c30722OooO00o = c30722OooO00o2;
                noteDatabase = noteDatabase2;
                r28 = c24034Oooo00O9;
                c33781o00o0O6 = c30722OooO00o.f109878OooOo0o;
                numOooO0OO6 = C25261OooO0o0.OooO0OO(80);
                this.f109960OooOo0o = r28;
                this.f109961OooOoO = 9;
                r29 = r28;
                if (c33781o00o0O6.emit(numOooO0OO6, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 9:
                C24034Oooo00O c24034Oooo00O10 = this.f109960OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c30722OooO00o = c30722OooO00o2;
                noteDatabase = noteDatabase2;
                r29 = c24034Oooo00O10;
                noteDatabase.OooOO0O().o0000oOo();
                C34406OooO00o.C20358OooO00o c20358OooO00o82 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o82.OooOOO0("DebugViewModel");
                c20358OooO00o82.OooO0o0("Database reconnected successfully", new Object[0]);
                c33781o00o0O7 = c30722OooO00o.f109878OooOo0o;
                numOooO0OO7 = C25261OooO0o0.OooO0OO(100);
                this.f109960OooOo0o = r29;
                this.f109961OooOoO = 10;
                r210 = r29;
                if (c33781o00o0O7.emit(numOooO0OO7, this) == enumC32485OooO00o) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o102 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o102.OooOOO0("DebugViewModel");
                c20358OooO00o102.OooO0o0("restoreFromHarmonyBackup, Harmony backup restore completed successfully", new Object[0]);
                Boolean boolOooO0O022 = C25261OooO0o0.OooO0O0(true);
                file10 = (File) r210.f80942OooOo0o;
                if (file10 != null) {
                }
                return boolOooO0O022;
            case 10:
                C24034Oooo00O c24034Oooo00O11 = this.f109960OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                r210 = c24034Oooo00O11;
                C34406OooO00o.C20358OooO00o c20358OooO00o1022 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o1022.OooOOO0("DebugViewModel");
                c20358OooO00o1022.OooO0o0("restoreFromHarmonyBackup, Harmony backup restore completed successfully", new Object[0]);
                Boolean boolOooO0O0222 = C25261OooO0o0.OooO0O0(true);
                file10 = (File) r210.f80942OooOo0o;
                if (file10 != null) {
                }
                return boolOooO0O0222;
            case 11:
                e = (Exception) this.f109959OooOo;
                C24034Oooo00O c24034Oooo00O12 = this.f109960OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                r2 = c24034Oooo00O12;
                C34406OooO00o.C20358OooO00o c20358OooO00o12 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o12.OooOOO0("DebugViewModel");
                c20358OooO00o12.OooO0Oo(e, "Failed to restore harmony backup", new Object[0]);
                Boolean boolOooO0O04 = C25261OooO0o0.OooO0O0(false);
                File file20 = (File) r2.f80942OooOo0o;
                if (file20 != null) {
                    C31190OooO0oo.OooO0oo(file20);
                }
                return boolOooO0O04;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
