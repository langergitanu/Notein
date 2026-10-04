package o0o00oOo;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.MimeTypeFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.file.ImportFileResult;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOOo0.C27174OooO0O0;
import o0OOo0o.C27346OooOooO;
import o0OOo0o.C27351Oooo0O0;
import o0OOo0o.C27387o0000o0;
import o0OOo0o.C27419o000o00o;
import o0OOo0o.C27499o00Ooo0;
import o0OOo0o.C27533o00o0Oo0;
import o0OOo0o.C27538o00o0o0O;
import o0OoO0oo.C28692OooO0oo;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oOo.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$importFileSync$2", m80623f = "NoteListViewModel.kt", m80624l = {1242, 1256, 1260, 1265, 1271, 1276, 1278, 1292, 1294, 1302, 1314, 1315, 1320, 1322, 1324, 1337, 1339, 1341, 1351, 1362}, m80625m = "invokeSuspend")
public final class C30069OoooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f106963OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f106964OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f106965OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f106966OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f106967OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106968OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f106969OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ Uri f106970OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30069OoooOo0(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, Uri uri, Continuation<? super C30069OoooOo0> continuation) {
        super(2, continuation);
        this.f106968OooOoo = oooO0OO;
        this.f106970OooOooO = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30069OoooOo0(this.f106968OooOoo, this.f106970OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30069OoooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x025d, code lost:
    
        if (r0.emit(r3, r20) == r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a5, code lost:
    
        if (r0.emit(r8, r20) == r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02df, code lost:
    
        if (r0.emit(r3, r20) == r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02f9, code lost:
    
        if (r0.emit(r3, r20) == r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x034b, code lost:
    
        if (r0.emit(r14, r20) == r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x034f, code lost:
    
        r4 = r9;
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0371, code lost:
    
        if (r0.emit(r14, r20) == r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0405, code lost:
    
        if (r0.emit(r3, r20) != r2) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0424, code lost:
    
        if (r0.emit(r8, r20) != r2) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010b, code lost:
    
        if (r0.OooO0O0(r0.f95609OooOOo, r9, r3, r20) == r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018b, code lost:
    
        if (r0.emit(r8, r20) == r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
    
        if (com.orion.notein.p607ui.notelist.OooO0OO.OooO0o(r13, r0, r9, r20) == r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c8, code lost:
    
        if (com.orion.notein.p607ui.notelist.OooO0OO.OooO0o(r13, r0, r9, r20) == r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0233, code lost:
    
        if (r0.emit(r3, r20) == r2) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ac A[PHI: r0 r9 r10 r11
      0x02ac: PHI (r0v76 boolean) = (r0v57 boolean), (r0v83 boolean) binds: [B:110:0x026a, B:115:0x0288] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r9v11 java.lang.String) = (r9v10 java.lang.String), (r9v16 java.lang.String) binds: [B:110:0x026a, B:115:0x0288] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r10v11 java.lang.String) = (r10v9 java.lang.String), (r10v12 java.lang.String) binds: [B:110:0x026a, B:115:0x0288] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r11v18 java.lang.String) = (r11v15 java.lang.String), (r11v19 java.lang.String) binds: [B:110:0x026a, B:115:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d4 A[PHI: r0
      0x03d4: PHI (r0v123 java.lang.Object) = (r0v114 java.lang.Object), (r0v129 java.lang.Object) binds: [B:172:0x03d1, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192 A[PHI: r0 r9 r10
      0x0192: PHI (r0v33 int) = (r0v20 int), (r0v43 int) binds: [B:55:0x0156, B:60:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0192: PHI (r9v5 java.lang.String) = (r9v3 java.lang.String), (r9v6 java.lang.String) binds: [B:55:0x0156, B:60:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0192: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v5 java.lang.String) binds: [B:55:0x0156, B:60:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0237  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String mimeTypeFromExtension;
        String str;
        String id;
        int i;
        Object objOooO0o;
        Object objOooO0Oo;
        String str2;
        String str3;
        String strOoooo00;
        boolean zEquals;
        Object objOooO0O0;
        Object objOooO0o2;
        C27174OooO0O0 c27174OooO0O0;
        Object objOooO0o3;
        String str4;
        Object objOooOo;
        File file;
        Object objOooO0o4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f106969OooOoo0;
        int i3 = 0;
        Uri uri = this.f106970OooOooO;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106968OooOoo;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteListViewModel");
            c20358OooO00o.OooO0OO("importFileSync. ImageFile: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
        }
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                oooO0OO.getClass();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(uri.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
                    mimeTypeFromExtension = oooO0OO.f77137OooOo0.getContentResolver().getType(uri);
                } else {
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(fileExtensionFromUrl);
                    Locale locale = Locale.getDefault();
                    kotlin.jvm.internal.OooOOO0.OooO0o(locale, "getDefault(...)");
                    String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
                    kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                    mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
                }
                str = mimeTypeFromExtension;
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) oooO0OO.f77161OoooO00.getValue()).f116638OooOo0o;
                id = noteVO != null ? noteVO.getId() : null;
                if (MimeTypeFilter.matches(str, "image/*")) {
                    o0OOo0o.o000OO o000oo2 = oooO0OO.f77123OooO0o0;
                    List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(uri);
                    this.f106969OooOoo0 = 1;
                    break;
                } else {
                    if (str != null) {
                        C27499o00Ooo0 c27499o00Ooo0 = oooO0OO.f77130OooOOO0;
                        c27499o00Ooo0.getClass();
                        if (!str.equals("application/msword") && !str.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                            c27499o00Ooo0.getClass();
                            if (str.equals("application/vnd.ms-powerpoint") || str.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                            }
                            if (i != 0) {
                                this.f106964OooOo0o = str;
                                this.f106963OooOo = id;
                                this.f106965OooOoO = i;
                                this.f106969OooOoo0 = 2;
                                objOooO0o = oooO0OO.f77120OooO.OooO0o(17, this);
                                if (objOooO0o != enumC32485OooO00o) {
                                    if (((Number) objOooO0o).intValue() == 0) {
                                        C33772OooooOo c33772OooooOo = oooO0OO.f77168OoooOoo;
                                        ImportFileResult importFileResult = new ImportFileResult(-4, "Vip limited", null, 4, null);
                                        this.f106964OooOo0o = null;
                                        this.f106963OooOo = null;
                                        this.f106969OooOoo0 = 3;
                                    } else if (i != 0) {
                                        List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(uri);
                                        this.f106964OooOo0o = null;
                                        this.f106963OooOo = null;
                                        this.f106969OooOoo0 = 4;
                                    } else {
                                        if (str != null) {
                                            oooO0OO.f77130OooOOO0.getClass();
                                            if (str.equals("application/pdf")) {
                                                List listOooO0oO3 = com.facebook.soloader.OooOo.OooO0oO(uri);
                                                this.f106964OooOo0o = null;
                                                this.f106963OooOo = null;
                                                this.f106969OooOoo0 = 5;
                                            }
                                        }
                                        C28692OooO0oo c28692OooO0oo = C28692OooO0oo.f101652OooO00o;
                                        Context context = oooO0OO.f77137OooOo0;
                                        this.f106964OooOo0o = id;
                                        this.f106963OooOo = null;
                                        this.f106969OooOoo0 = 6;
                                        objOooO0Oo = c28692OooO0oo.OooO0Oo(context, uri, this);
                                        if (objOooO0Oo != enumC32485OooO00o) {
                                            str2 = id;
                                            str3 = (String) objOooO0Oo;
                                            if (str3 != null || str3.length() == 0) {
                                                C33772OooooOo c33772OooooOo2 = oooO0OO.f77168OoooOoo;
                                                ImportFileResult importFileResult2 = new ImportFileResult(-2, "Unable to get file path", null, 4, null);
                                                this.f106964OooOo0o = null;
                                                this.f106969OooOoo0 = 7;
                                                break;
                                            } else {
                                                strOoooo00 = C33599OooOo0O.Ooooo00(str3, ".");
                                                if (strOoooo00.equals(BackupFile.EXTENSION_NOTEIN_FILE)) {
                                                    C27351Oooo0O0 c27351Oooo0O0 = oooO0OO.f77125OooO0oo;
                                                    this.f106964OooOo0o = null;
                                                    this.f106969OooOoo0 = 8;
                                                    c27351Oooo0O0.getClass();
                                                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                                    objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27346OooOooO(str3, str2, c27351Oooo0O0, null), this);
                                                    if (objOooO0o2 != enumC32485OooO00o) {
                                                        c27174OooO0O0 = (C27174OooO0O0) objOooO0o2;
                                                        if (!c27174OooO0O0.f94862OooO00o) {
                                                            C33772OooooOo c33772OooooOo3 = oooO0OO.f77168OoooOoo;
                                                            ImportFileResult importFileResult3 = new ImportFileResult(0, "mark_import_note_in_file_success", null, 4, null);
                                                            this.f106969OooOoo0 = 9;
                                                        } else {
                                                            int i4 = kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "-111") ? -7 : -999;
                                                            C33772OooooOo c33772OooooOo4 = oooO0OO.f77168OoooOoo;
                                                            ImportFileResult importFileResult4 = new ImportFileResult(i4, "File imported failed.", null, 4, null);
                                                            this.f106969OooOoo0 = 10;
                                                        }
                                                    }
                                                    break;
                                                } else {
                                                    zEquals = strOoooo00.equals("template");
                                                    if (zEquals) {
                                                        this.f106964OooOo0o = str2;
                                                        this.f106963OooOo = str3;
                                                        this.f106966OooOoO0 = strOoooo00;
                                                        this.f106967OooOoOO = zEquals;
                                                        this.f106969OooOoo0 = 11;
                                                        objOooO0O0 = oooO0OO.f77122OooO0o.OooO0O0(1, this);
                                                        if (objOooO0O0 != enumC32485OooO00o) {
                                                            if (((Boolean) objOooO0O0).booleanValue()) {
                                                                C33772OooooOo c33772OooooOo5 = oooO0OO.f77168OoooOoo;
                                                                ImportFileResult importFileResult5 = new ImportFileResult(-5, "Template limit reached", null, 4, null);
                                                                this.f106964OooOo0o = null;
                                                                this.f106963OooOo = null;
                                                                this.f106966OooOoO0 = null;
                                                                this.f106969OooOoo0 = 12;
                                                                break;
                                                            } else if (zEquals) {
                                                                C27351Oooo0O0 c27351Oooo0O02 = oooO0OO.f77125OooO0oo;
                                                                this.f106964OooOo0o = null;
                                                                this.f106963OooOo = null;
                                                                this.f106966OooOoO0 = null;
                                                                this.f106969OooOoo0 = 13;
                                                                objOooOo = c27351Oooo0O02.OooOo(str3, this);
                                                                if (objOooOo != enumC32485OooO00o) {
                                                                    if (!((Boolean) objOooOo).booleanValue()) {
                                                                        C33772OooooOo c33772OooooOo6 = oooO0OO.f77168OoooOoo;
                                                                        ImportFileResult importFileResult6 = new ImportFileResult(0, "Result Ok", null, 4, null);
                                                                        this.f106969OooOoo0 = 14;
                                                                    } else {
                                                                        C33772OooooOo c33772OooooOo7 = oooO0OO.f77168OoooOoo;
                                                                        ImportFileResult importFileResult7 = new ImportFileResult(-999, "File imported failed.", null, 4, null);
                                                                        this.f106969OooOoo0 = 15;
                                                                    }
                                                                }
                                                                break;
                                                            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(strOoooo00, "stickers")) {
                                                                C27538o00o0o0O c27538o00o0o0O = oooO0OO.f77129OooOOO;
                                                                this.f106964OooOo0o = str2;
                                                                this.f106963OooOo = str3;
                                                                this.f106966OooOoO0 = null;
                                                                this.f106969OooOoo0 = 16;
                                                                c27538o00o0o0O.getClass();
                                                                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                                                objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27533o00o0Oo0(c27538o00o0o0O, uri, null), this);
                                                                if (objOooO0o3 != enumC32485OooO00o) {
                                                                    str4 = str2;
                                                                    if (!((Boolean) objOooO0o3).booleanValue()) {
                                                                        C33772OooooOo c33772OooooOo8 = oooO0OO.f77168OoooOoo;
                                                                        ImportFileResult importFileResult8 = new ImportFileResult(0, "Result Ok", null, 4, null);
                                                                        this.f106964OooOo0o = str4;
                                                                        this.f106963OooOo = str3;
                                                                        this.f106969OooOoo0 = 17;
                                                                    } else {
                                                                        C33772OooooOo c33772OooooOo9 = oooO0OO.f77168OoooOoo;
                                                                        ImportFileResult importFileResult9 = new ImportFileResult(-999, "File imported failed.", null, 4, null);
                                                                        this.f106964OooOo0o = str4;
                                                                        this.f106963OooOo = str3;
                                                                        this.f106969OooOoo0 = 18;
                                                                    }
                                                                    str3 = str;
                                                                    str2 = str;
                                                                    file = new File(str3);
                                                                    try {
                                                                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                                                                        try {
                                                                            i3 = randomAccessFile.readInt();
                                                                            randomAccessFile.close();
                                                                        } finally {
                                                                        }
                                                                    } catch (IOException unused) {
                                                                    }
                                                                    if ((i3 == 1347093252 && i3 != 1347093766 && i3 != 1347094280) || C32501OooO0oO.OooO0o0(file).equals(BackupFile.EXTENSION_NOTEIN_FILE)) {
                                                                        return C32460OooOooO.f116667OooO00o;
                                                                    }
                                                                    String strOooO00o = C24761OooO.OooO00o("toString(...)");
                                                                    String str5 = str2;
                                                                    C27387o0000o0 c27387o0000o0 = oooO0OO.f77135OooOOoo;
                                                                    this.f106964OooOo0o = null;
                                                                    this.f106963OooOo = null;
                                                                    this.f106966OooOoO0 = null;
                                                                    this.f106969OooOoo0 = 19;
                                                                    c27387o0000o0.getClass();
                                                                    C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                                                                    objOooO0o4 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27419o000o00o(uri, strOooO00o, str5, c27387o0000o0, null), this);
                                                                    if (objOooO0o4 != enumC32485OooO00o) {
                                                                        NoteMeta noteMeta = (NoteMeta) ((C27174OooO0O0) objOooO0o4).OooO0O0();
                                                                        ImportFileResult importFileResult10 = noteMeta == null ? new ImportFileResult(1, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Result Ok. ", noteMeta.getId()), noteMeta) : new ImportFileResult(-999, "File imported failed.", null, 4, null);
                                                                        C33772OooooOo c33772OooooOo10 = oooO0OO.f77168OoooOoo;
                                                                        this.f106969OooOoo0 = 20;
                                                                    }
                                                                }
                                                                break;
                                                            } else {
                                                                file = new File(str3);
                                                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                                                                i3 = randomAccessFile2.readInt();
                                                                randomAccessFile2.close();
                                                                if (i3 == 1347093252) {
                                                                }
                                                                String strOooO00o2 = C24761OooO.OooO00o("toString(...)");
                                                                String str52 = str2;
                                                                C27387o0000o0 c27387o0000o02 = oooO0OO.f77135OooOOoo;
                                                                this.f106964OooOo0o = null;
                                                                this.f106963OooOo = null;
                                                                this.f106966OooOoO0 = null;
                                                                this.f106969OooOoo0 = 19;
                                                                c27387o0000o02.getClass();
                                                                C33874OooO0OO c33874OooO0OO32 = C33649OoooOOo.f121328OooO00o;
                                                                objOooO0o4 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27419o000o00o(uri, strOooO00o2, str52, c27387o0000o02, null), this);
                                                                if (objOooO0o4 != enumC32485OooO00o) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        i = 1;
                        if (i != 0) {
                        }
                    }
                    i = 0;
                    if (i != 0) {
                    }
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 2:
                i = this.f106965OooOoO;
                id = this.f106963OooOo;
                str = this.f106964OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                if (((Number) objOooO0o).intValue() == 0) {
                }
                return enumC32485OooO00o;
            case 3:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 5:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 6:
                String str6 = this.f106964OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str2 = str6;
                objOooO0Oo = obj;
                str3 = (String) objOooO0Oo;
                if (str3 != null) {
                }
                C33772OooooOo c33772OooooOo22 = oooO0OO.f77168OoooOoo;
                ImportFileResult importFileResult22 = new ImportFileResult(-2, "Unable to get file path", null, 4, null);
                this.f106964OooOo0o = null;
                this.f106969OooOoo0 = 7;
                break;
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 8:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o2 = obj;
                c27174OooO0O0 = (C27174OooO0O0) objOooO0o2;
                if (!c27174OooO0O0.f94862OooO00o) {
                }
                break;
            case 9:
            case 10:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 11:
                zEquals = this.f106967OooOoOO;
                strOoooo00 = this.f106966OooOoO0;
                str3 = this.f106963OooOo;
                str2 = this.f106964OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0O0 = obj;
                if (((Boolean) objOooO0O0).booleanValue()) {
                }
                return enumC32485OooO00o;
            case 12:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 13:
                C32446OooOOOo.OooO0O0(obj);
                objOooOo = obj;
                if (!((Boolean) objOooOo).booleanValue()) {
                }
                break;
            case 14:
            case 15:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 16:
                String str7 = this.f106963OooOo;
                str4 = this.f106964OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str3 = str7;
                objOooO0o3 = obj;
                if (!((Boolean) objOooO0o3).booleanValue()) {
                }
                str3 = str;
                str2 = str;
                file = new File(str3);
                RandomAccessFile randomAccessFile22 = new RandomAccessFile(file, "r");
                i3 = randomAccessFile22.readInt();
                randomAccessFile22.close();
                if (i3 == 1347093252) {
                }
                String strOooO00o22 = C24761OooO.OooO00o("toString(...)");
                String str522 = str2;
                C27387o0000o0 c27387o0000o022 = oooO0OO.f77135OooOOoo;
                this.f106964OooOo0o = null;
                this.f106963OooOo = null;
                this.f106966OooOoO0 = null;
                this.f106969OooOoo0 = 19;
                c27387o0000o022.getClass();
                C33874OooO0OO c33874OooO0OO322 = C33649OoooOOo.f121328OooO00o;
                objOooO0o4 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27419o000o00o(uri, strOooO00o22, str522, c27387o0000o022, null), this);
                if (objOooO0o4 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 17:
            case 18:
                String str8 = this.f106963OooOo;
                String str9 = this.f106964OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str3 = str8;
                str2 = str9;
                file = new File(str3);
                RandomAccessFile randomAccessFile222 = new RandomAccessFile(file, "r");
                i3 = randomAccessFile222.readInt();
                randomAccessFile222.close();
                if (i3 == 1347093252) {
                }
                String strOooO00o222 = C24761OooO.OooO00o("toString(...)");
                String str5222 = str2;
                C27387o0000o0 c27387o0000o0222 = oooO0OO.f77135OooOOoo;
                this.f106964OooOo0o = null;
                this.f106963OooOo = null;
                this.f106966OooOoO0 = null;
                this.f106969OooOoo0 = 19;
                c27387o0000o0222.getClass();
                C33874OooO0OO c33874OooO0OO3222 = C33649OoooOOo.f121328OooO00o;
                objOooO0o4 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27419o000o00o(uri, strOooO00o222, str5222, c27387o0000o0222, null), this);
                if (objOooO0o4 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 19:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o4 = obj;
                NoteMeta noteMeta2 = (NoteMeta) ((C27174OooO0O0) objOooO0o4).OooO0O0();
                if (noteMeta2 == null) {
                }
                C33772OooooOo c33772OooooOo102 = oooO0OO.f77168OoooOoo;
                this.f106969OooOoo0 = 20;
                break;
            case 20:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
