package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import android.os.Bundle;
import android.util.Log;
import com.orion.notein.data.p602db.entity.NoteEntity;
import com.orion.notein.domain.mapper.NoteMapper;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.backup.BackupInstance;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27585o00ooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0Oo0OoO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28117OooOOoo extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C28122OooOo0o f99668OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C28125OooOoOO f99669OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C28119OooOo0 f99670OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C28108OooOO0 f99671OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C27585o00ooO0 f99672OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C28124OooOoO0 f99673OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C27449o00O0OoO f99674OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final NoteMapper f99675OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28117OooOOoo(C28122OooOo0o c28122OooOo0o, C28119OooOo0 c28119OooOo0, C28125OooOoOO c28125OooOoOO, C28108OooOO0 c28108OooOO0, C28124OooOoO0 c28124OooOoO0, C27585o00ooO0 c27585o00ooO0, C27449o00O0OoO c27449o00O0OoO, NoteMapper noteMapper) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMapper, "noteMapper");
        this.f99668OooOo = c28122OooOo0o;
        this.f99670OooOoO0 = c28119OooOo0;
        this.f99669OooOoO = c28125OooOoOO;
        this.f99671OooOoOO = c28108OooOO0;
        this.f99673OooOoo0 = c28124OooOoO0;
        this.f99672OooOoo = c27585o00ooO0;
        this.f99674OooOooO = c27449o00O0OoO;
        this.f99675OooOooo = noteMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x03c6, code lost:
    
        if (r2.OooO(r0, r4) != r5) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b0 A[Catch: Exception -> 0x003e, PHI: r0 r2 r6 r12 r13 r14 r15
      0x02b0: PHI (r0v17 java.lang.String) = (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:87:0x0259, B:101:0x02ad] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r2v13 java.lang.String) = (r2v9 java.lang.String), (r2v16 java.lang.String) binds: [B:87:0x0259, B:101:0x02ad] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r6v16 com.orion.notein.domain.models.note.Note) = (r6v12 com.orion.notein.domain.models.note.Note), (r6v18 com.orion.notein.domain.models.note.Note) binds: [B:87:0x0259, B:101:0x02ad] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r12v13 android.os.Bundle) = (r12v9 android.os.Bundle), (r12v15 android.os.Bundle) binds: [B:87:0x0259, B:101:0x02ad] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r13v12 java.util.Map) = (r13v8 java.util.Map), (r13v14 java.util.Map) binds: [B:87:0x0259, B:101:0x02ad] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r14v18 java.lang.String) = (r14v14 java.lang.String), (r14v19 java.lang.String) binds: [B:87:0x0259, B:101:0x02ad] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r15v11 o0Oo0OoO.OooOOoo) = (r15v8 o0Oo0OoO.OooOOoo), (r15v12 o0Oo0OoO.OooOOoo) binds: [B:87:0x0259, B:101:0x02ad] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c1 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e9 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f5 A[PHI: r0 r6 r12 r13 r15
      0x02f5: PHI (r0v22 java.lang.String) = (r0v18 java.lang.String), (r0v24 java.lang.String) binds: [B:103:0x02bf, B:112:0x02f1] A[DONT_GENERATE, DONT_INLINE]
      0x02f5: PHI (r6v21 com.orion.notein.domain.models.note.Note) = (r6v16 com.orion.notein.domain.models.note.Note), (r6v23 com.orion.notein.domain.models.note.Note) binds: [B:103:0x02bf, B:112:0x02f1] A[DONT_GENERATE, DONT_INLINE]
      0x02f5: PHI (r12v18 android.os.Bundle) = (r12v13 android.os.Bundle), (r12v20 android.os.Bundle) binds: [B:103:0x02bf, B:112:0x02f1] A[DONT_GENERATE, DONT_INLINE]
      0x02f5: PHI (r13v17 java.util.Map) = (r13v12 java.util.Map), (r13v19 java.util.Map) binds: [B:103:0x02bf, B:112:0x02f1] A[DONT_GENERATE, DONT_INLINE]
      0x02f5: PHI (r15v14 o0Oo0OoO.OooOOoo) = (r15v11 o0Oo0OoO.OooOOoo), (r15v15 o0Oo0OoO.OooOOoo) binds: [B:103:0x02bf, B:112:0x02f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f7 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fe A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018a A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0220 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0228 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025b A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027e A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0286 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:17:0x004b, B:130:0x0388, B:132:0x03ae, B:135:0x03b5, B:20:0x005e, B:120:0x035b, B:122:0x0365, B:126:0x036d, B:23:0x0076, B:108:0x02e1, B:110:0x02e9, B:114:0x02f7, B:116:0x0302, B:115:0x02fe, B:26:0x0091, B:91:0x0276, B:93:0x027e, B:95:0x0286, B:96:0x0295, B:98:0x029b, B:100:0x02a9, B:101:0x02ad, B:102:0x02b0, B:104:0x02c1, B:29:0x00ac, B:78:0x0218, B:80:0x0220, B:82:0x0228, B:83:0x0232, B:85:0x0238, B:86:0x024f, B:88:0x025b, B:32:0x00c7, B:59:0x0182, B:61:0x018a, B:63:0x0190, B:65:0x0196, B:67:0x01a0, B:68:0x01c1, B:69:0x01c4, B:71:0x01d0, B:72:0x01e7, B:74:0x01ed, B:75:0x01fb, B:35:0x00de, B:42:0x0126, B:44:0x012a, B:47:0x0134, B:50:0x013b, B:52:0x0152, B:55:0x015f, B:51:0x0143, B:38:0x00e5), top: B:142:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, LinkedHashMap linkedHashMap, Bundle bundle, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28116OooOOo0 c28116OooOOo0;
        Map map;
        String str2;
        Note note;
        C28117OooOOoo c28117OooOOoo;
        String string;
        String str3;
        Object objO00000Oo;
        C28117OooOOoo c28117OooOOoo2;
        Map map2;
        Note note2;
        String str4;
        String str5;
        Bundle bundle2;
        String str6;
        String str7;
        Note note3;
        Bundle bundle3;
        Map map3;
        C28117OooOOoo c28117OooOOoo3;
        String str8;
        String str9;
        Page page;
        C27449o00O0OoO c27449o00O0OoO;
        String str10;
        Note note4;
        C28117OooOOoo c28117OooOOoo4;
        String tnPath;
        Bundle bundle4 = bundle;
        if (abstractC32479OooO0OO instanceof C28116OooOOo0) {
            c28116OooOOo0 = (C28116OooOOo0) abstractC32479OooO0OO;
            int i = c28116OooOOo0.f99667Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28116OooOOo0.f99667Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c28116OooOOo0 = new C28116OooOOo0(this, abstractC32479OooO0OO);
            }
        }
        Object objO00000Oo2 = c28116OooOOo0.f99665OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        String str11 = "";
        try {
            switch (c28116OooOOo0.f99667Oooo000) {
                case 0:
                    C32446OooOOOo.OooO0O0(objO00000Oo2);
                    Note note5 = this.f99675OooOooo.toNote((NoteEntity) oOo000Oo.OooOo.Oooo0oO(o00000(NoteEntity.class, str + "/note")));
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(note5);
                    c28116OooOOo0.f99659OooOo0o = this;
                    c28116OooOOo0.f99658OooOo = str;
                    map = linkedHashMap;
                    c28116OooOOo0.f99661OooOoO0 = map;
                    c28116OooOOo0.f99660OooOoO = bundle4;
                    c28116OooOOo0.f99662OooOoOO = note5;
                    c28116OooOOo0.f99667Oooo000 = 1;
                    Object objO00000o0 = o00000o0(note5, bundle4, c28116OooOOo0);
                    if (objO00000o0 == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    str2 = str;
                    note = note5;
                    objO00000Oo2 = objO00000o0;
                    c28117OooOOoo = this;
                    String str12 = (String) objO00000Oo2;
                    string = bundle4 == null ? bundle4.getString("note_id") : null;
                    if (string != null || string.length() == 0) {
                        map.put(note.getId(), UUID.randomUUID().toString());
                    } else {
                        map.put(note.getId(), string);
                    }
                    str3 = (String) map.get(note.getId());
                    if (str3 == null) {
                        str3 = "";
                    }
                    C28125OooOoOO c28125OooOoOO = c28117OooOOoo.f99669OooOoO;
                    c28116OooOOo0.f99659OooOo0o = c28117OooOOoo;
                    c28116OooOOo0.f99658OooOo = str2;
                    c28116OooOOo0.f99661OooOoO0 = map;
                    c28116OooOOo0.f99660OooOoO = bundle4;
                    c28116OooOOo0.f99662OooOoOO = note;
                    c28116OooOOo0.f99664OooOoo0 = str12;
                    c28116OooOOo0.f99663OooOoo = str3;
                    c28116OooOOo0.f99667Oooo000 = 2;
                    objO00000Oo = c28125OooOoOO.o00000Oo(str2, map, str3, c28116OooOOo0);
                    if (objO00000Oo != enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    c28117OooOOoo2 = c28117OooOOoo;
                    map2 = map;
                    note2 = note;
                    str4 = str3;
                    str5 = str2;
                    bundle2 = bundle4;
                    str6 = str12;
                    objO00000Oo2 = objO00000Oo;
                    if (((Number) objO00000Oo2).intValue() == 0) {
                        return new Integer(-999);
                    }
                    PdfInfo pdfInfo = note2.getPdfInfo();
                    if (pdfInfo != null) {
                        if (map2.containsKey(pdfInfo.getId())) {
                            Object obj = map2.get(pdfInfo.getId());
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
                            note2.setPdfInfo(PdfInfo.copy$default(pdfInfo, (String) obj, null, null, null, 14, null));
                        } else {
                            note2.setPdfInfo(null);
                        }
                    }
                    if (!note2.getPages().isEmpty()) {
                        C28122OooOo0o c28122OooOo0o = c28117OooOOoo2.f99668OooOo;
                        List<Page> pages = note2.getPages();
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
                        Iterator<T> it = pages.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Page) it.next()).getId());
                        }
                        Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList);
                        c28116OooOOo0.f99659OooOo0o = c28117OooOOoo2;
                        c28116OooOOo0.f99658OooOo = str5;
                        c28116OooOOo0.f99661OooOoO0 = map2;
                        c28116OooOOo0.f99660OooOoO = bundle2;
                        c28116OooOOo0.f99662OooOoOO = note2;
                        c28116OooOOo0.f99664OooOoo0 = str6;
                        c28116OooOOo0.f99663OooOoo = str4;
                        c28116OooOOo0.f99667Oooo000 = 3;
                        objO00000Oo2 = c28122OooOo0o.o00000Oo(str5, map2, setO0OO00O, c28116OooOOo0);
                        if (objO00000Oo2 == enumC32485OooO00o) {
                        }
                        if (((Number) objO00000Oo2).intValue() == 0) {
                            return new Integer(-999);
                        }
                        for (Page page2 : note2.getPages()) {
                            Object obj2 = map2.get(page2.getId());
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj2);
                            page2.setId((String) obj2);
                        }
                        if (note2.getOutlines().isEmpty()) {
                            C28119OooOo0 c28119OooOo0 = c28117OooOOoo2.f99670OooOoO0;
                            c28116OooOOo0.f99659OooOo0o = c28117OooOOoo2;
                            c28116OooOOo0.f99658OooOo = str5;
                            c28116OooOOo0.f99661OooOoO0 = map2;
                            c28116OooOOo0.f99660OooOoO = bundle2;
                            c28116OooOOo0.f99662OooOoOO = note2;
                            c28116OooOOo0.f99664OooOoo0 = str6;
                            c28116OooOOo0.f99663OooOoo = str4;
                            c28116OooOOo0.f99667Oooo000 = 4;
                            objO00000Oo2 = c28119OooOo0.o00000Oo(str5, map2, str4, c28116OooOOo0);
                            if (objO00000Oo2 == enumC32485OooO00o) {
                            }
                            if (((Number) objO00000Oo2).intValue() == 0) {
                                return new Integer(-999);
                            }
                            List<String> outlines = note2.getOutlines();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = outlines.iterator();
                            while (it2.hasNext()) {
                                String str13 = (String) map2.get((String) it2.next());
                                if (str13 != null) {
                                    arrayList2.add(str13);
                                }
                            }
                            note2.setOutlines(arrayList2);
                            String str14 = str6;
                            String str15 = str4;
                            str7 = str14;
                            if (note2.getPageLayerIds().isEmpty()) {
                                C28124OooOoO0 c28124OooOoO0 = c28117OooOOoo2.f99673OooOoo0;
                                c28116OooOOo0.f99659OooOo0o = c28117OooOOoo2;
                                c28116OooOOo0.f99658OooOo = map2;
                                c28116OooOOo0.f99661OooOoO0 = bundle2;
                                c28116OooOOo0.f99660OooOoO = note2;
                                c28116OooOOo0.f99662OooOoOO = str7;
                                c28116OooOOo0.f99664OooOoo0 = null;
                                c28116OooOOo0.f99663OooOoo = null;
                                c28116OooOOo0.f99667Oooo000 = 5;
                                objO00000Oo2 = c28124OooOoO0.o00000Oo(str5, map2, str15, c28116OooOOo0);
                                if (objO00000Oo2 != enumC32485OooO00o) {
                                    note3 = note2;
                                    bundle3 = bundle2;
                                    map3 = map2;
                                    c28117OooOOoo3 = c28117OooOOoo2;
                                    if (((Number) objO00000Oo2).intValue() == 0) {
                                        return new Integer(-999);
                                    }
                                    c28117OooOOoo2 = c28117OooOOoo3;
                                    map2 = map3;
                                    bundle2 = bundle3;
                                    note2 = note3;
                                    long j = bundle2 == null ? bundle2.getLong("creation_time") : System.currentTimeMillis();
                                    Object obj3 = map2.get(note2.getId());
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj3);
                                    note2.setId((String) obj3);
                                    note2.setParentId(str7);
                                    note2.setCreationTime(j);
                                    note2.setLastModificationTime(System.currentTimeMillis());
                                    note2.setSortKey(null);
                                    String id = ((Page) oOo000Oo.OooOo.Oooo0oO(note2.getPages())).getId();
                                    C27585o00ooO0 c27585o00ooO0 = c28117OooOOoo2.f99672OooOoo;
                                    Set setOooOO0 = C34449Oooo0oo.OooOO0(id);
                                    String id2 = note2.getId();
                                    c28116OooOOo0.f99659OooOo0o = c28117OooOOoo2;
                                    c28116OooOOo0.f99658OooOo = note2;
                                    c28116OooOOo0.f99661OooOoO0 = str7;
                                    c28116OooOOo0.f99660OooOoO = id;
                                    c28116OooOOo0.f99662OooOoOO = null;
                                    c28116OooOOo0.f99664OooOoo0 = null;
                                    c28116OooOOo0.f99663OooOoo = null;
                                    c28116OooOOo0.f99667Oooo000 = 6;
                                    objO00000Oo2 = c27585o00ooO0.OooO00o(setOooOO0, id2, true, c28116OooOOo0);
                                    if (objO00000Oo2 == enumC32485OooO00o) {
                                        str8 = str7;
                                        str9 = id;
                                        page = (Page) ((Map) objO00000Oo2).get(str9);
                                        if (page != null && (tnPath = page.getTnPath()) != null) {
                                            str11 = tnPath;
                                        }
                                        note2.setTnPath(str11);
                                        c27449o00O0OoO = c28117OooOOoo2.f99674OooOooO;
                                        c28116OooOOo0.f99659OooOo0o = c28117OooOOoo2;
                                        c28116OooOOo0.f99658OooOo = note2;
                                        c28116OooOOo0.f99661OooOoO0 = str8;
                                        c28116OooOOo0.f99660OooOoO = null;
                                        c28116OooOOo0.f99667Oooo000 = 7;
                                        if (c27449o00O0OoO.OooOO0(note2, c28116OooOOo0) == enumC32485OooO00o) {
                                            str10 = str8;
                                            note4 = note2;
                                            c28117OooOOoo4 = c28117OooOOoo2;
                                            Log.d(BackupFile.FILE_CONTENT_TYPE_NOTE, "title: " + note4.getTitle() + ", " + note4.getId());
                                            if (str10 != null && str10.length() != 0) {
                                                C27585o00ooO0 c27585o00ooO02 = c28117OooOOoo4.f99672OooOoo;
                                                c28116OooOOo0.f99659OooOo0o = null;
                                                c28116OooOOo0.f99658OooOo = null;
                                                c28116OooOOo0.f99661OooOoO0 = null;
                                                c28116OooOOo0.f99667Oooo000 = 8;
                                                break;
                                            }
                                            return new Integer(0);
                                        }
                                    }
                                }
                            } else {
                                if (bundle2 == null) {
                                }
                                Object obj32 = map2.get(note2.getId());
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(obj32);
                                note2.setId((String) obj32);
                                note2.setParentId(str7);
                                note2.setCreationTime(j);
                                note2.setLastModificationTime(System.currentTimeMillis());
                                note2.setSortKey(null);
                                String id3 = ((Page) oOo000Oo.OooOo.Oooo0oO(note2.getPages())).getId();
                                C27585o00ooO0 c27585o00ooO03 = c28117OooOOoo2.f99672OooOoo;
                                Set setOooOO02 = C34449Oooo0oo.OooOO0(id3);
                                String id22 = note2.getId();
                                c28116OooOOo0.f99659OooOo0o = c28117OooOOoo2;
                                c28116OooOOo0.f99658OooOo = note2;
                                c28116OooOOo0.f99661OooOoO0 = str7;
                                c28116OooOOo0.f99660OooOoO = id3;
                                c28116OooOOo0.f99662OooOoOO = null;
                                c28116OooOOo0.f99664OooOoo0 = null;
                                c28116OooOOo0.f99663OooOoo = null;
                                c28116OooOOo0.f99667Oooo000 = 6;
                                objO00000Oo2 = c27585o00ooO03.OooO00o(setOooOO02, id22, true, c28116OooOOo0);
                                if (objO00000Oo2 == enumC32485OooO00o) {
                                }
                            }
                        } else {
                            String str142 = str6;
                            String str152 = str4;
                            str7 = str142;
                            if (note2.getPageLayerIds().isEmpty()) {
                            }
                        }
                    } else if (note2.getOutlines().isEmpty()) {
                    }
                    return enumC32485OooO00o;
                case 1:
                    note = (Note) c28116OooOOo0.f99662OooOoOO;
                    bundle4 = (Bundle) c28116OooOOo0.f99660OooOoO;
                    map = (Map) c28116OooOOo0.f99661OooOoO0;
                    str2 = (String) c28116OooOOo0.f99658OooOo;
                    c28117OooOOoo = c28116OooOOo0.f99659OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo2);
                    String str122 = (String) objO00000Oo2;
                    if (bundle4 == null) {
                    }
                    if (string != null) {
                    }
                    map.put(note.getId(), UUID.randomUUID().toString());
                    str3 = (String) map.get(note.getId());
                    if (str3 == null) {
                    }
                    C28125OooOoOO c28125OooOoOO2 = c28117OooOOoo.f99669OooOoO;
                    c28116OooOOo0.f99659OooOo0o = c28117OooOOoo;
                    c28116OooOOo0.f99658OooOo = str2;
                    c28116OooOOo0.f99661OooOoO0 = map;
                    c28116OooOOo0.f99660OooOoO = bundle4;
                    c28116OooOOo0.f99662OooOoOO = note;
                    c28116OooOOo0.f99664OooOoo0 = str122;
                    c28116OooOOo0.f99663OooOoo = str3;
                    c28116OooOOo0.f99667Oooo000 = 2;
                    objO00000Oo = c28125OooOoOO2.o00000Oo(str2, map, str3, c28116OooOOo0);
                    if (objO00000Oo != enumC32485OooO00o) {
                    }
                    break;
                case 2:
                    str4 = c28116OooOOo0.f99663OooOoo;
                    str6 = c28116OooOOo0.f99664OooOoo0;
                    note2 = (Note) c28116OooOOo0.f99662OooOoOO;
                    bundle2 = (Bundle) c28116OooOOo0.f99660OooOoO;
                    map2 = (Map) c28116OooOOo0.f99661OooOoO0;
                    str5 = (String) c28116OooOOo0.f99658OooOo;
                    c28117OooOOoo2 = c28116OooOOo0.f99659OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo2);
                    if (((Number) objO00000Oo2).intValue() == 0) {
                    }
                    break;
                case 3:
                    str4 = c28116OooOOo0.f99663OooOoo;
                    str6 = c28116OooOOo0.f99664OooOoo0;
                    note2 = (Note) c28116OooOOo0.f99662OooOoOO;
                    bundle2 = (Bundle) c28116OooOOo0.f99660OooOoO;
                    map2 = (Map) c28116OooOOo0.f99661OooOoO0;
                    str5 = (String) c28116OooOOo0.f99658OooOo;
                    c28117OooOOoo2 = c28116OooOOo0.f99659OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo2);
                    if (((Number) objO00000Oo2).intValue() == 0) {
                    }
                    break;
                case 4:
                    str4 = c28116OooOOo0.f99663OooOoo;
                    str6 = c28116OooOOo0.f99664OooOoo0;
                    note2 = (Note) c28116OooOOo0.f99662OooOoOO;
                    bundle2 = (Bundle) c28116OooOOo0.f99660OooOoO;
                    map2 = (Map) c28116OooOOo0.f99661OooOoO0;
                    str5 = (String) c28116OooOOo0.f99658OooOo;
                    c28117OooOOoo2 = c28116OooOOo0.f99659OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo2);
                    if (((Number) objO00000Oo2).intValue() == 0) {
                    }
                    break;
                case 5:
                    str7 = (String) c28116OooOOo0.f99662OooOoOO;
                    note3 = (Note) c28116OooOOo0.f99660OooOoO;
                    bundle3 = (Bundle) c28116OooOOo0.f99661OooOoO0;
                    map3 = (Map) c28116OooOOo0.f99658OooOo;
                    c28117OooOOoo3 = c28116OooOOo0.f99659OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo2);
                    if (((Number) objO00000Oo2).intValue() == 0) {
                    }
                    break;
                case 6:
                    str9 = (String) c28116OooOOo0.f99660OooOoO;
                    str8 = (String) c28116OooOOo0.f99661OooOoO0;
                    note2 = (Note) c28116OooOOo0.f99658OooOo;
                    C28117OooOOoo c28117OooOOoo5 = c28116OooOOo0.f99659OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo2);
                    c28117OooOOoo2 = c28117OooOOoo5;
                    page = (Page) ((Map) objO00000Oo2).get(str9);
                    if (page != null) {
                        str11 = tnPath;
                    }
                    note2.setTnPath(str11);
                    c27449o00O0OoO = c28117OooOOoo2.f99674OooOooO;
                    c28116OooOOo0.f99659OooOo0o = c28117OooOOoo2;
                    c28116OooOOo0.f99658OooOo = note2;
                    c28116OooOOo0.f99661OooOoO0 = str8;
                    c28116OooOOo0.f99660OooOoO = null;
                    c28116OooOOo0.f99667Oooo000 = 7;
                    if (c27449o00O0OoO.OooOO0(note2, c28116OooOOo0) == enumC32485OooO00o) {
                    }
                    break;
                case 7:
                    str10 = (String) c28116OooOOo0.f99661OooOoO0;
                    note4 = (Note) c28116OooOOo0.f99658OooOo;
                    c28117OooOOoo4 = c28116OooOOo0.f99659OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo2);
                    Log.d(BackupFile.FILE_CONTENT_TYPE_NOTE, "title: " + note4.getTitle() + ", " + note4.getId());
                    if (str10 != null) {
                        C27585o00ooO0 c27585o00ooO022 = c28117OooOOoo4.f99672OooOoo;
                        c28116OooOOo0.f99659OooOo0o = null;
                        c28116OooOOo0.f99658OooOo = null;
                        c28116OooOOo0.f99661OooOoO0 = null;
                        c28116OooOOo0.f99667Oooo000 = 8;
                        break;
                    }
                    return new Integer(0);
                case 8:
                    C32446OooOOOo.OooO0O0(objO00000Oo2);
                    return new Integer(0);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(BackupFile.FILE_CONTENT_TYPE_NOTE, "Couldn't restore data. " + C32460OooOooO.f116667OooO00o);
            return new Integer(-999);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000o0(Note note, Bundle bundle, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28115OooOOo c28115OooOOo;
        String parentId;
        C28117OooOOoo c28117OooOOoo;
        String str;
        if (abstractC32479OooO0OO instanceof C28115OooOOo) {
            c28115OooOOo = (C28115OooOOo) abstractC32479OooO0OO;
            int i = c28115OooOOo.f99657OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28115OooOOo.f99657OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c28115OooOOo = new C28115OooOOo(this, abstractC32479OooO0OO);
            }
        }
        C28115OooOOo c28115OooOOo2 = c28115OooOOo;
        Object objO0000 = c28115OooOOo2.f99654OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28115OooOOo2.f99657OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objO0000);
            parentId = note.getParentId();
            if (parentId != null) {
                c28115OooOOo2.f99653OooOo0o = this;
                c28115OooOOo2.f99652OooOo = bundle;
                c28115OooOOo2.f99655OooOoO0 = parentId;
                c28115OooOOo2.f99657OooOoo0 = 1;
                objO0000 = this.f99671OooOoOO.o0000(parentId, c28115OooOOo2);
                if (objO0000 != enumC32485OooO00o) {
                    c28117OooOOoo = this;
                }
                return enumC32485OooO00o;
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c28115OooOOo2.f99653OooOo0o;
            C32446OooOOOo.OooO0O0(objO0000);
            if (((Boolean) objO0000).booleanValue()) {
                return null;
            }
            return str;
        }
        parentId = c28115OooOOo2.f99655OooOoO0;
        bundle = c28115OooOOo2.f99652OooOo;
        c28117OooOOoo = (C28117OooOOoo) c28115OooOOo2.f99653OooOo0o;
        C32446OooOOOo.OooO0O0(objO0000);
        if (((Boolean) objO0000).booleanValue()) {
            return parentId;
        }
        String string = bundle != null ? bundle.getString("disk_vendor") : null;
        BackupFile.DiskVendor diskVendorByName = string != null ? BackupFile.INSTANCE.getDiskVendorByName(string) : null;
        if (diskVendorByName == null || diskVendorByName == BackupFile.DiskVendor.None || diskVendorByName == BackupFile.DiskVendor.Local) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, BackupFile.FILE_CONTENT_TYPE_NOTE, "Unable to restore note parents from remote disk, vendor name: ", string), new Object[0]);
            return null;
        }
        Serializable serializable = bundle.getSerializable("backup_instance");
        BackupInstance backupInstance = serializable instanceof BackupInstance ? (BackupInstance) serializable : null;
        if (backupInstance == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0(BackupFile.FILE_CONTENT_TYPE_NOTE);
            c20358OooO00o2.OooO0o0("Unable to restore note parents from remote disk, backup instance is null", new Object[0]);
            return null;
        }
        C28108OooOO0 c28108OooOO0 = c28117OooOOoo.f99671OooOoOO;
        c28115OooOOo2.f99653OooOo0o = parentId;
        c28115OooOOo2.f99652OooOo = null;
        c28115OooOOo2.f99655OooOoO0 = null;
        c28115OooOOo2.f99657OooOoo0 = 2;
        String str2 = parentId;
        objO0000 = c28108OooOO0.o00000oo(str2, backupInstance, null, diskVendorByName, c28115OooOOo2);
        if (objO0000 != enumC32485OooO00o) {
            str = str2;
            if (((Boolean) objO0000).booleanValue()) {
            }
        }
        return enumC32485OooO00o;
    }
}
