package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import android.util.Log;
import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.notein.domain.mapper.NoteMapper;
import com.orion.notein.domain.mapper.PageMapper;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO.C26427Oooo0O0;
import o0OO00o0.C26620o00Oo00o;
import o0OOO0OO.C27020OooOoO0;
import o0OOOO00.C27095OooOo0O;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Oo0OoO.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28122OooOo0o extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f99695OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C27020OooOoO0 f99696OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC27309OooOoO f99697OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C27095OooOo0O f99698OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final PageMapper f99699OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C26427Oooo0O0 f99700OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C28101OooO0O0 f99701OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C28111OooOOO f99702OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C28126OooOoo f99703Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C28132Oooo00O f99704Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C28129OooOooo f99705Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C28130Oooo0 f99706Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C28110OooOO0o f99707Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final File f99708Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final File f99709Oooo0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28122OooOo0o(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, InterfaceC27309OooOoO noteContentRepo, C27020OooOoO0 c27020OooOoO0, C26620o00Oo00o c26620o00Oo00o, C27095OooOo0O c27095OooOo0O, C26427Oooo0O0 c26427Oooo0O0, PageMapper pageMapper, NoteMapper noteMapper, C28124OooOoO0 c28124OooOoO0, C28101OooO0O0 c28101OooO0O0, C28111OooOOO c28111OooOOO, C28132Oooo00O c28132Oooo00O, C28129OooOooo c28129OooOooo, C28130Oooo0 c28130Oooo0, C28126OooOoo c28126OooOoo, C28125OooOoOO c28125OooOoOO, C28119OooOo0 c28119OooOo0, C28110OooOO0o c28110OooOO0o) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteContentRepo, "noteContentRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageMapper, "pageMapper");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMapper, "noteMapper");
        this.f99695OooOo = abstractApplicationC26277OooOoOO;
        this.f99697OooOoO0 = noteContentRepo;
        this.f99696OooOoO = c27020OooOoO0;
        this.f99698OooOoOO = c27095OooOo0O;
        this.f99700OooOoo0 = c26427Oooo0O0;
        this.f99699OooOoo = pageMapper;
        this.f99701OooOooO = c28101OooO0O0;
        this.f99702OooOooo = c28111OooOOO;
        this.f99704Oooo000 = c28132Oooo00O;
        this.f99705Oooo00O = c28129OooOooo;
        this.f99706Oooo00o = c28130Oooo0;
        this.f99703Oooo0 = c28126OooOoo;
        this.f99707Oooo0O0 = c28110OooOO0o;
        new File(abstractApplicationC26277OooOoOO.getFilesDir(), "documents");
        this.f99708Oooo0OO = new File(abstractApplicationC26277OooOoOO.getFilesDir(), "documents");
        this.f99709Oooo0o0 = new File(abstractApplicationC26277OooOoOO.getFilesDir(), "theme");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x04a5, code lost:
    
        if (r0.OooO00o(r8, r12, r4) == r5) goto L145;
     */
    /* JADX WARN: Path cross not found for [B:128:0x0396, B:132:0x03aa], limit reached: 152 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x034a A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ad A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e9 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x041d A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0449 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x048a A[Catch: Exception -> 0x003c, TRY_LEAVE, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0237 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025b A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027f A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a3 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c7 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ed A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0059, B:137:0x03e5, B:139:0x03e9, B:142:0x0456, B:108:0x0344, B:110:0x034a, B:112:0x0357, B:115:0x0365, B:117:0x036d, B:119:0x037d, B:122:0x0383, B:128:0x0396, B:134:0x03ad, B:141:0x0449, B:143:0x048a, B:140:0x041d, B:20:0x0075, B:96:0x02e3, B:148:0x04af, B:99:0x02ed, B:101:0x02fa, B:103:0x02fe, B:105:0x0313, B:106:0x032d, B:107:0x0334, B:23:0x0090, B:91:0x02bf, B:93:0x02c7, B:26:0x00ab, B:86:0x029b, B:88:0x02a3, B:29:0x00c6, B:81:0x0277, B:83:0x027f, B:32:0x00e1, B:76:0x0253, B:78:0x025b, B:35:0x00fc, B:71:0x022f, B:73:0x0237, B:38:0x0117, B:66:0x020b, B:68:0x0213, B:41:0x011f, B:42:0x0145, B:44:0x014b, B:45:0x015b, B:47:0x0161, B:49:0x016c, B:51:0x0179, B:53:0x017d, B:55:0x0190, B:57:0x01b0, B:58:0x01b3, B:59:0x01b7, B:61:0x01bd, B:62:0x01d3), top: B:152:0x002c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x03e1 -> B:137:0x03e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0449 -> B:142:0x0456). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, Map map, Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28121OooOo0O c28121OooOo0O;
        String str2;
        C28122OooOo0o c28122OooOo0o;
        Map map2;
        String str3;
        List list;
        Set set2;
        String str4;
        Set set3;
        C28122OooOo0o c28122OooOo0o2;
        Iterator it;
        Map map3;
        List list2;
        Page page;
        PaperTheme paperTheme;
        boolean z;
        boolean z2;
        PdfInfo pdfInfo;
        if (abstractC32479OooO0OO instanceof C28121OooOo0O) {
            c28121OooOo0O = (C28121OooOo0O) abstractC32479OooO0OO;
            int i = c28121OooOo0O.f99694Oooo00O;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28121OooOo0O.f99694Oooo00O = i - Integer.MIN_VALUE;
            } else {
                c28121OooOo0O = new C28121OooOo0O(this, abstractC32479OooO0OO);
            }
        }
        Object objO00000Oo = c28121OooOo0O.f99692OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        try {
            switch (c28121OooOo0O.f99694Oooo00O) {
                case 0:
                    C32446OooOOOo.OooO0O0(objO00000Oo);
                    ArrayList arrayListO00000 = o00000(PageEntity.class, str + "/page");
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListO00000, 10));
                    Iterator it2 = arrayListO00000.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(this.f99699OooOoo.toPage((PageEntity) it2.next()));
                    }
                    if (arrayList.isEmpty()) {
                        Log.e("page", "Couldn't find the page data.");
                        return new Integer(-999);
                    }
                    File[] fileArrListFiles = new File(str, "imgTheme").listFiles();
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            File file2 = new File(this.f99708Oooo0OO, file.getName());
                            if (!C31190OooO0oo.OooO00o(file, file2)) {
                                Log.e("page", "Couldn't restore img file from " + file + " to " + file2);
                                return new Integer(-999);
                            }
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        map.put(((Page) it3.next()).getId(), UUID.randomUUID().toString());
                    }
                    Object obj = map.get(((Page) oOo000Oo.OooOo.Oooo0oO(arrayList)).getNoteId());
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
                    String str5 = (String) obj;
                    C28101OooO0O0 c28101OooO0O0 = this.f99701OooOooO;
                    c28121OooOo0O.f99685OooOo0o = this;
                    c28121OooOo0O.f99684OooOo = str;
                    c28121OooOo0O.f99687OooOoO0 = map;
                    c28121OooOo0O.f99686OooOoO = set;
                    c28121OooOo0O.f99688OooOoOO = arrayList;
                    c28121OooOo0O.f99690OooOoo0 = str5;
                    c28121OooOo0O.f99694Oooo00O = 1;
                    Object objO00000Oo2 = c28101OooO0O0.o00000Oo(str, map, str5, c28121OooOo0O);
                    if (objO00000Oo2 == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    str2 = str;
                    c28122OooOo0o = this;
                    map2 = map;
                    str3 = str5;
                    list = arrayList;
                    objO00000Oo = objO00000Oo2;
                    set2 = set;
                    if (((Number) objO00000Oo).intValue() == 0) {
                        C28111OooOOO c28111OooOOO = c28122OooOo0o.f99702OooOooo;
                        c28121OooOo0O.f99685OooOo0o = c28122OooOo0o;
                        c28121OooOo0O.f99684OooOo = str2;
                        c28121OooOo0O.f99687OooOoO0 = map2;
                        c28121OooOo0O.f99686OooOoO = set2;
                        c28121OooOo0O.f99688OooOoOO = list;
                        c28121OooOo0O.f99690OooOoo0 = str3;
                        c28121OooOo0O.f99694Oooo00O = 2;
                        objO00000Oo = c28111OooOOO.o00000Oo(str2, map2, str3, c28121OooOo0O);
                        if (objO00000Oo != enumC32485OooO00o) {
                            if (((Number) objO00000Oo).intValue() == 0) {
                                C28132Oooo00O c28132Oooo00O = c28122OooOo0o.f99704Oooo000;
                                c28121OooOo0O.f99685OooOo0o = c28122OooOo0o;
                                c28121OooOo0O.f99684OooOo = str2;
                                c28121OooOo0O.f99687OooOoO0 = map2;
                                c28121OooOo0O.f99686OooOoO = set2;
                                c28121OooOo0O.f99688OooOoOO = list;
                                c28121OooOo0O.f99690OooOoo0 = str3;
                                c28121OooOo0O.f99694Oooo00O = 3;
                                objO00000Oo = c28132Oooo00O.o00000Oo(str2, map2, str3, c28121OooOo0O);
                                if (objO00000Oo != enumC32485OooO00o) {
                                    if (((Number) objO00000Oo).intValue() == 0) {
                                        C28129OooOooo c28129OooOooo = c28122OooOo0o.f99705Oooo00O;
                                        c28121OooOo0O.f99685OooOo0o = c28122OooOo0o;
                                        c28121OooOo0O.f99684OooOo = str2;
                                        c28121OooOo0O.f99687OooOoO0 = map2;
                                        c28121OooOo0O.f99686OooOoO = set2;
                                        c28121OooOo0O.f99688OooOoOO = list;
                                        c28121OooOo0O.f99690OooOoo0 = str3;
                                        c28121OooOo0O.f99694Oooo00O = 4;
                                        objO00000Oo = c28129OooOooo.o00000Oo(str2, map2, str3, c28121OooOo0O);
                                        if (objO00000Oo != enumC32485OooO00o) {
                                            if (((Number) objO00000Oo).intValue() == 0) {
                                                C28130Oooo0 c28130Oooo0 = c28122OooOo0o.f99706Oooo00o;
                                                c28121OooOo0O.f99685OooOo0o = c28122OooOo0o;
                                                c28121OooOo0O.f99684OooOo = str2;
                                                c28121OooOo0O.f99687OooOoO0 = map2;
                                                c28121OooOo0O.f99686OooOoO = set2;
                                                c28121OooOo0O.f99688OooOoOO = list;
                                                c28121OooOo0O.f99690OooOoo0 = str3;
                                                c28121OooOo0O.f99694Oooo00O = 5;
                                                objO00000Oo = c28130Oooo0.o00000Oo(str2, map2, str3, c28121OooOo0O);
                                                if (objO00000Oo != enumC32485OooO00o) {
                                                    if (((Number) objO00000Oo).intValue() == 0) {
                                                        C28126OooOoo c28126OooOoo = c28122OooOo0o.f99703Oooo0;
                                                        c28121OooOo0O.f99685OooOo0o = c28122OooOo0o;
                                                        c28121OooOo0O.f99684OooOo = str2;
                                                        c28121OooOo0O.f99687OooOoO0 = map2;
                                                        c28121OooOo0O.f99686OooOoO = set2;
                                                        c28121OooOo0O.f99688OooOoOO = list;
                                                        c28121OooOo0O.f99690OooOoo0 = str3;
                                                        c28121OooOo0O.f99694Oooo00O = 6;
                                                        objO00000Oo = c28126OooOoo.o00000Oo(str2, map2, str3, c28121OooOo0O);
                                                        if (objO00000Oo != enumC32485OooO00o) {
                                                            if (((Number) objO00000Oo).intValue() == 0) {
                                                                C28110OooOO0o c28110OooOO0o = c28122OooOo0o.f99707Oooo0O0;
                                                                c28121OooOo0O.f99685OooOo0o = c28122OooOo0o;
                                                                c28121OooOo0O.f99684OooOo = str2;
                                                                c28121OooOo0O.f99687OooOoO0 = map2;
                                                                c28121OooOo0O.f99686OooOoO = set2;
                                                                c28121OooOo0O.f99688OooOoOO = list;
                                                                c28121OooOo0O.f99690OooOoo0 = str3;
                                                                c28121OooOo0O.f99694Oooo00O = 7;
                                                                objO00000Oo = c28110OooOO0o.o00000Oo(str2, map2, str3, c28121OooOo0O);
                                                                if (objO00000Oo == enumC32485OooO00o) {
                                                                }
                                                                if (((Number) objO00000Oo).intValue() != 0) {
                                                                    File[] fileArrListFiles2 = new File(str2, "downloadedTheme").listFiles();
                                                                    if (fileArrListFiles2 != null) {
                                                                        int length = fileArrListFiles2.length;
                                                                        int i2 = 0;
                                                                        while (i2 < length) {
                                                                            File file3 = fileArrListFiles2[i2];
                                                                            String str6 = str3;
                                                                            File file4 = new File(c28122OooOo0o.f99709Oooo0o0, file3.getName());
                                                                            if (!C31190OooO0oo.OooO00o(file3, file4)) {
                                                                                Log.e("page", "Couldn't restore theme file from " + file3 + " to " + file4);
                                                                            }
                                                                            i2++;
                                                                            str3 = str6;
                                                                        }
                                                                    }
                                                                    str4 = str3;
                                                                    set3 = set2;
                                                                    c28122OooOo0o2 = c28122OooOo0o;
                                                                    it = list.iterator();
                                                                    map3 = map2;
                                                                    list2 = list;
                                                                    if (!it.hasNext()) {
                                                                        C27020OooOoO0 c27020OooOoO0 = c28122OooOo0o2.f99696OooOoO;
                                                                        c28121OooOo0O.f99685OooOo0o = null;
                                                                        c28121OooOo0O.f99684OooOo = null;
                                                                        c28121OooOo0O.f99687OooOoO0 = null;
                                                                        c28121OooOo0O.f99686OooOoO = null;
                                                                        c28121OooOo0O.f99688OooOoOO = null;
                                                                        c28121OooOo0O.f99690OooOoo0 = null;
                                                                        c28121OooOo0O.f99689OooOoo = null;
                                                                        c28121OooOo0O.f99691OooOooO = null;
                                                                        c28121OooOo0O.f99694Oooo00O = 9;
                                                                        break;
                                                                    } else {
                                                                        page = (Page) it.next();
                                                                        paperTheme = page.getPaperTheme();
                                                                        if ((paperTheme != null ? kotlin.jvm.internal.OooOOO0.OooO0O0(paperTheme.getDownloadable(), Boolean.TRUE) : false) && !paperTheme.availableFromLocal(c28122OooOo0o2.f99695OooOo)) {
                                                                            page.setPaperTheme(c28122OooOo0o2.f99698OooOoOO.OooO0oO(page.getPaperOrientation()));
                                                                        } else if (paperTheme instanceof PdfPaperTheme) {
                                                                            if (set3 != null) {
                                                                                z = true;
                                                                                z2 = set3.contains(page.getId());
                                                                                if ((!z2 || map3.containsKey(((PdfPaperTheme) paperTheme).getPdfInfo().getId())) ? z : false) {
                                                                                    page.setPaperTheme(c28122OooOo0o2.f99698OooOoOO.OooO0oO(page.getPaperOrientation()));
                                                                                } else {
                                                                                    Object obj2 = map3.get(((PdfPaperTheme) paperTheme).getPdfInfo().getId());
                                                                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj2);
                                                                                    C26427Oooo0O0 c26427Oooo0O0 = c28122OooOo0o2.f99700OooOoo0;
                                                                                    c28121OooOo0O.f99685OooOo0o = c28122OooOo0o2;
                                                                                    c28121OooOo0O.f99684OooOo = map3;
                                                                                    c28121OooOo0O.f99687OooOoO0 = set3;
                                                                                    c28121OooOo0O.f99686OooOoO = list2;
                                                                                    c28121OooOo0O.f99688OooOoOO = str4;
                                                                                    c28121OooOo0O.f99690OooOoo0 = it;
                                                                                    c28121OooOo0O.f99689OooOoo = page;
                                                                                    c28121OooOo0O.f99691OooOooO = (PdfPaperTheme) paperTheme;
                                                                                    c28121OooOo0O.f99694Oooo00O = 8;
                                                                                    objO00000Oo = c26427Oooo0O0.OooO0OO((String) obj2, str4, c28121OooOo0O);
                                                                                    if (objO00000Oo == enumC32485OooO00o) {
                                                                                    }
                                                                                    pdfInfo = (PdfInfo) objO00000Oo;
                                                                                    if (pdfInfo != null) {
                                                                                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                                                                        c20358OooO00o.OooOOO0("page");
                                                                                        c20358OooO00o.OooO0OO("Couldn't find the pdf info by id " + ((PdfPaperTheme) paperTheme).getPdfInfo().getId(), new Object[0]);
                                                                                        page.setPaperTheme(c28122OooOo0o2.f99698OooOoOO.OooO0oO(page.getPaperOrientation()));
                                                                                    } else {
                                                                                        ((PdfPaperTheme) paperTheme).getPdfInfo().setId(pdfInfo.getId());
                                                                                        ((PdfPaperTheme) paperTheme).getPdfInfo().setPdfPath(pdfInfo.getPdfPath());
                                                                                        ((PdfPaperTheme) paperTheme).getPdfInfo().setTnPath("");
                                                                                        page.setPaperTheme(paperTheme);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                z = true;
                                                                            }
                                                                            if ((!z2 || map3.containsKey(((PdfPaperTheme) paperTheme).getPdfInfo().getId())) ? z : false) {
                                                                            }
                                                                        }
                                                                        Object obj3 = map3.get(page.getId());
                                                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(obj3);
                                                                        page.setId((String) obj3);
                                                                        Object obj4 = map3.get(page.getNoteId());
                                                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(obj4);
                                                                        page.setNoteId((String) obj4);
                                                                        page.setCreationTime(System.currentTimeMillis());
                                                                        page.setLastModificationTime(System.currentTimeMillis());
                                                                        list2 = list2;
                                                                        if (!it.hasNext()) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    return new Integer(-999);
                case 1:
                    str3 = (String) c28121OooOo0O.f99690OooOoo0;
                    list = (List) c28121OooOo0O.f99688OooOoOO;
                    set2 = (Set) c28121OooOo0O.f99686OooOoO;
                    map2 = (Map) c28121OooOo0O.f99687OooOoO0;
                    str2 = (String) c28121OooOo0O.f99684OooOo;
                    c28122OooOo0o = c28121OooOo0O.f99685OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo);
                    if (((Number) objO00000Oo).intValue() == 0) {
                    }
                    return new Integer(-999);
                case 2:
                    str3 = (String) c28121OooOo0O.f99690OooOoo0;
                    list = (List) c28121OooOo0O.f99688OooOoOO;
                    set2 = (Set) c28121OooOo0O.f99686OooOoO;
                    map2 = (Map) c28121OooOo0O.f99687OooOoO0;
                    str2 = (String) c28121OooOo0O.f99684OooOo;
                    c28122OooOo0o = c28121OooOo0O.f99685OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo);
                    if (((Number) objO00000Oo).intValue() == 0) {
                    }
                    return new Integer(-999);
                case 3:
                    str3 = (String) c28121OooOo0O.f99690OooOoo0;
                    list = (List) c28121OooOo0O.f99688OooOoOO;
                    set2 = (Set) c28121OooOo0O.f99686OooOoO;
                    map2 = (Map) c28121OooOo0O.f99687OooOoO0;
                    str2 = (String) c28121OooOo0O.f99684OooOo;
                    c28122OooOo0o = c28121OooOo0O.f99685OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo);
                    if (((Number) objO00000Oo).intValue() == 0) {
                    }
                    return new Integer(-999);
                case 4:
                    str3 = (String) c28121OooOo0O.f99690OooOoo0;
                    list = (List) c28121OooOo0O.f99688OooOoOO;
                    set2 = (Set) c28121OooOo0O.f99686OooOoO;
                    map2 = (Map) c28121OooOo0O.f99687OooOoO0;
                    str2 = (String) c28121OooOo0O.f99684OooOo;
                    c28122OooOo0o = c28121OooOo0O.f99685OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo);
                    if (((Number) objO00000Oo).intValue() == 0) {
                    }
                    return new Integer(-999);
                case 5:
                    str3 = (String) c28121OooOo0O.f99690OooOoo0;
                    list = (List) c28121OooOo0O.f99688OooOoOO;
                    set2 = (Set) c28121OooOo0O.f99686OooOoO;
                    map2 = (Map) c28121OooOo0O.f99687OooOoO0;
                    str2 = (String) c28121OooOo0O.f99684OooOo;
                    c28122OooOo0o = c28121OooOo0O.f99685OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo);
                    if (((Number) objO00000Oo).intValue() == 0) {
                    }
                    return new Integer(-999);
                case 6:
                    str3 = (String) c28121OooOo0O.f99690OooOoo0;
                    list = (List) c28121OooOo0O.f99688OooOoOO;
                    set2 = (Set) c28121OooOo0O.f99686OooOoO;
                    map2 = (Map) c28121OooOo0O.f99687OooOoO0;
                    str2 = (String) c28121OooOo0O.f99684OooOo;
                    c28122OooOo0o = c28121OooOo0O.f99685OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo);
                    if (((Number) objO00000Oo).intValue() == 0) {
                    }
                    return new Integer(-999);
                case 7:
                    str3 = (String) c28121OooOo0O.f99690OooOoo0;
                    list = (List) c28121OooOo0O.f99688OooOoOO;
                    set2 = (Set) c28121OooOo0O.f99686OooOoO;
                    map2 = (Map) c28121OooOo0O.f99687OooOoO0;
                    str2 = (String) c28121OooOo0O.f99684OooOo;
                    c28122OooOo0o = c28121OooOo0O.f99685OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo);
                    if (((Number) objO00000Oo).intValue() != 0) {
                    }
                    break;
                case 8:
                    paperTheme = c28121OooOo0O.f99691OooOooO;
                    page = c28121OooOo0O.f99689OooOoo;
                    it = (Iterator) c28121OooOo0O.f99690OooOoo0;
                    str4 = (String) c28121OooOo0O.f99688OooOoOO;
                    list2 = (List) c28121OooOo0O.f99686OooOoO;
                    set3 = (Set) c28121OooOo0O.f99687OooOoO0;
                    map3 = (Map) c28121OooOo0O.f99684OooOo;
                    c28122OooOo0o2 = c28121OooOo0O.f99685OooOo0o;
                    C32446OooOOOo.OooO0O0(objO00000Oo);
                    pdfInfo = (PdfInfo) objO00000Oo;
                    if (pdfInfo != null) {
                    }
                    Object obj32 = map3.get(page.getId());
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj32);
                    page.setId((String) obj32);
                    Object obj42 = map3.get(page.getNoteId());
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj42);
                    page.setNoteId((String) obj42);
                    page.setCreationTime(System.currentTimeMillis());
                    page.setLastModificationTime(System.currentTimeMillis());
                    list2 = list2;
                    if (!it.hasNext()) {
                    }
                    return enumC32485OooO00o;
                case 9:
                    C32446OooOOOo.OooO0O0(objO00000Oo);
                    return new Integer(0);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("page", "Couldn't restore data. " + C32460OooOooO.f116667OooO00o);
            return new Integer(-999);
        }
    }
}
