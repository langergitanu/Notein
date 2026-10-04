package o0o00oOo;

import android.net.Uri;
import android.os.Bundle;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.file.ImportFileResult;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import java.io.File;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27351Oooo0O0;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27492o00OoOOO;
import o0OOo0o.C27493o00OoOOo;
import o0OOo0o.C27494o00OoOo;
import o0OOo0o.C27495o00OoOo0;
import o0OOo0o.C27497o00OoOoo;
import o0OOo0o.C27499o00Ooo0;
import o0OOo0o.C27500o00Ooo00;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oOo.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$onPlaceholderClickRetryImport$2", m80623f = "NoteListViewModel.kt", m80624l = {1483, 1488, 1489, 1490, 1491, 1492, 1493, 1501, 1506, 1525, 1535}, m80625m = "invokeSuspend")
public final class C30078Oooooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f107006OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NotePlaceHolder f107007OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f107008OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f107009OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f107010OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f107011OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f107012OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ Bundle f107013OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30078Oooooo0(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, String str, Bundle bundle, Continuation<? super C30078Oooooo0> continuation) {
        super(2, continuation);
        this.f107012OooOoo0 = oooO0OO;
        this.f107011OooOoo = str;
        this.f107013OooOooO = bundle;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30078Oooooo0(this.f107012OooOoo0, this.f107011OooOoo, this.f107013OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30078Oooooo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a9, code lost:
    
        if (r0 == r2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0208, code lost:
    
        if (r0.OooO0o(r4, null, r22) == r2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x026a, code lost:
    
        if (r0.OooOOoo(r4, r5, null, r22) == r2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0296, code lost:
    
        if (r0.emit(r4, r22) == r2) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b7 A[PHI: r4 r8 r9
      0x01b7: PHI (r4v4 int) = (r4v0 int), (r4v0 int), (r4v0 int), (r4v0 int), (r4v0 int), (r4v0 int), (r4v6 int) binds: [B:36:0x00f0, B:41:0x0117, B:46:0x013e, B:51:0x0165, B:56:0x018c, B:61:0x01b3, B:63:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r8v13 java.lang.String) = 
      (r8v3 java.lang.String)
      (r8v5 java.lang.String)
      (r8v7 java.lang.String)
      (r8v9 java.lang.String)
      (r8v11 java.lang.String)
      (r8v15 java.lang.String)
      (r8v15 java.lang.String)
     binds: [B:36:0x00f0, B:41:0x0117, B:46:0x013e, B:51:0x0165, B:56:0x018c, B:61:0x01b3, B:63:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r9v17 com.orion.notein.domain.models.note.NotePlaceHolder) = 
      (r9v7 com.orion.notein.domain.models.note.NotePlaceHolder)
      (r9v9 com.orion.notein.domain.models.note.NotePlaceHolder)
      (r9v11 com.orion.notein.domain.models.note.NotePlaceHolder)
      (r9v13 com.orion.notein.domain.models.note.NotePlaceHolder)
      (r9v15 com.orion.notein.domain.models.note.NotePlaceHolder)
      (r9v18 com.orion.notein.domain.models.note.NotePlaceHolder)
      (r9v18 com.orion.notein.domain.models.note.NotePlaceHolder)
     binds: [B:36:0x00f0, B:41:0x0117, B:46:0x013e, B:51:0x0165, B:56:0x018c, B:61:0x01b3, B:63:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020c  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0Oo;
        NotePlaceHolder notePlaceHolder;
        String string;
        Object objOooO0o;
        NotePlaceHolder notePlaceHolder2;
        Uri uri;
        Object objOooO0o2;
        Object objOooO0o3;
        Object objOooO0o4;
        Object objOooO0o5;
        Object objOooO0o6;
        Object objOooO0oO;
        NotePlaceHolder notePlaceHolder3;
        int i;
        String str;
        NotePlaceHolder notePlaceHolder4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f107010OooOoOO;
        int i3 = 1;
        String str2 = this.f107011OooOoo;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f107012OooOoo0;
        try {
        } catch (Exception e) {
            if ((e instanceof BackupException ? ((BackupException) e).getErrorCode() : 0) == -111) {
                C33772OooooOo c33772OooooOo = oooO0OO.f77168OoooOoo;
                ImportFileResult importFileResult = new ImportFileResult(-7, "File imported failed.", null, 4, null);
                this.f107007OooOo0o = null;
                this.f107006OooOo = null;
                this.f107009OooOoO0 = null;
                this.f107010OooOoOO = 11;
            }
        }
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C27449o00O0OoO c27449o00O0OoO = oooO0OO.f77121OooO0Oo;
                this.f107010OooOoOO = 1;
                objOooO0Oo = c27449o00O0OoO.f96049OooOOOo.OooO0Oo(str2);
                if (objOooO0Oo != enumC32485OooO00o) {
                    notePlaceHolder = (NotePlaceHolder) objOooO0Oo;
                    if (notePlaceHolder != null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    string = notePlaceHolder.getExtras().getString("disk_vendor");
                    String filePath = notePlaceHolder.getFilePath();
                    Uri uriFromFile = filePath != null ? Uri.fromFile(new File(filePath)) : null;
                    if (uriFromFile == null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("NoteListViewModel");
                        c20358OooO00o.OooOO0O("onPlaceholderClickRetryImport, placeholderUri is null, " + notePlaceHolder, new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C27499o00Ooo0 c27499o00Ooo0 = oooO0OO.f77130OooOOO0;
                    this.f107007OooOo0o = notePlaceHolder;
                    this.f107006OooOo = string;
                    this.f107009OooOoO0 = uriFromFile;
                    this.f107010OooOoOO = 2;
                    c27499o00Ooo0.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27494o00OoOo(uriFromFile, null, c27499o00Ooo0), this);
                    if (objOooO0o != enumC32485OooO00o) {
                        Uri uri2 = uriFromFile;
                        notePlaceHolder2 = notePlaceHolder;
                        uri = uri2;
                        if (((Boolean) objOooO0o).booleanValue()) {
                            C27499o00Ooo0 c27499o00Ooo02 = oooO0OO.f77130OooOOO0;
                            this.f107007OooOo0o = notePlaceHolder2;
                            this.f107006OooOo = string;
                            this.f107009OooOoO0 = uri;
                            this.f107010OooOoOO = 3;
                            c27499o00Ooo02.getClass();
                            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                            objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27497o00OoOoo(uri, null, c27499o00Ooo02), this);
                            if (objOooO0o2 != enumC32485OooO00o) {
                                if (((Boolean) objOooO0o2).booleanValue()) {
                                    C27499o00Ooo0 c27499o00Ooo03 = oooO0OO.f77130OooOOO0;
                                    this.f107007OooOo0o = notePlaceHolder2;
                                    this.f107006OooOo = string;
                                    this.f107009OooOoO0 = uri;
                                    this.f107010OooOoOO = 4;
                                    c27499o00Ooo03.getClass();
                                    C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                                    objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27493o00OoOOo(uri, null, c27499o00Ooo03), this);
                                    if (objOooO0o3 != enumC32485OooO00o) {
                                        if (((Boolean) objOooO0o3).booleanValue()) {
                                            C27499o00Ooo0 c27499o00Ooo04 = oooO0OO.f77130OooOOO0;
                                            this.f107007OooOo0o = notePlaceHolder2;
                                            this.f107006OooOo = string;
                                            this.f107009OooOoO0 = uri;
                                            this.f107010OooOoOO = 5;
                                            c27499o00Ooo04.getClass();
                                            C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
                                            objOooO0o4 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27492o00OoOOO(uri, null, c27499o00Ooo04), this);
                                            if (objOooO0o4 != enumC32485OooO00o) {
                                                if (((Boolean) objOooO0o4).booleanValue()) {
                                                    C27499o00Ooo0 c27499o00Ooo05 = oooO0OO.f77130OooOOO0;
                                                    this.f107007OooOo0o = notePlaceHolder2;
                                                    this.f107006OooOo = string;
                                                    this.f107009OooOoO0 = uri;
                                                    this.f107010OooOoOO = 6;
                                                    c27499o00Ooo05.getClass();
                                                    C33874OooO0OO c33874OooO0OO5 = C33649OoooOOo.f121328OooO00o;
                                                    objOooO0o5 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27495o00OoOo0(uri, null, c27499o00Ooo05), this);
                                                    if (objOooO0o5 != enumC32485OooO00o) {
                                                        if (((Boolean) objOooO0o5).booleanValue()) {
                                                            C27499o00Ooo0 c27499o00Ooo06 = oooO0OO.f77130OooOOO0;
                                                            this.f107007OooOo0o = notePlaceHolder2;
                                                            this.f107006OooOo = string;
                                                            this.f107009OooOoO0 = null;
                                                            this.f107010OooOoOO = 7;
                                                            c27499o00Ooo06.getClass();
                                                            C33874OooO0OO c33874OooO0OO6 = C33649OoooOOo.f121328OooO00o;
                                                            objOooO0o6 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27500o00Ooo00(uri, null, c27499o00Ooo06), this);
                                                        } else {
                                                            NotePlaceHolder notePlaceHolderCopy$default = NotePlaceHolder.copy$default(notePlaceHolder2, null, null, null, 0L, null, null, 0, null, 191, null);
                                                            notePlaceHolderCopy$default.getExtras().putAll(this.f107013OooOooO);
                                                            C27449o00O0OoO c27449o00O0OoO2 = oooO0OO.f77121OooO0Oo;
                                                            this.f107007OooOo0o = notePlaceHolder2;
                                                            this.f107006OooOo = string;
                                                            this.f107009OooOoO0 = notePlaceHolderCopy$default;
                                                            this.f107008OooOoO = i3;
                                                            this.f107010OooOoOO = 8;
                                                            objOooO0oO = c27449o00O0OoO2.f96049OooOOOo.OooO0oO(0, str2, this);
                                                            if (objOooO0oO != enumC32485OooO00o) {
                                                                objOooO0oO = C32460OooOooO.f116667OooO00o;
                                                            }
                                                            if (objOooO0oO != enumC32485OooO00o) {
                                                                int i4 = i3;
                                                                notePlaceHolder3 = notePlaceHolderCopy$default;
                                                                i = i4;
                                                                str = string;
                                                                notePlaceHolder4 = notePlaceHolder2;
                                                                if (i != 0) {
                                                                    if (str != null) {
                                                                        BackupFile.DiskVendor diskVendorValueOf = BackupFile.DiskVendor.valueOf(str);
                                                                        String string2 = notePlaceHolder4.getExtras().getString("id", "");
                                                                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                                                                        String title = notePlaceHolder4.getTitle();
                                                                        String filePath2 = notePlaceHolder4.getFilePath();
                                                                        BackupFile backupFile = new BackupFile(string2, diskVendorValueOf, title, filePath2 == null ? "" : filePath2, false, notePlaceHolder4.getCreationTime(), 0L, oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(BackupFile.FILE_PROPERTY_LOCAL_BACKUP_INSTANCE_URI, notePlaceHolder4.getExtras().getString(BackupFile.FILE_PROPERTY_LOCAL_BACKUP_INSTANCE_URI, ""))), null);
                                                                        C27351Oooo0O0 c27351Oooo0O0 = oooO0OO.f77125OooO0oo;
                                                                        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(notePlaceHolder3);
                                                                        List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(backupFile);
                                                                        this.f107007OooOo0o = null;
                                                                        this.f107006OooOo = null;
                                                                        this.f107009OooOoO0 = null;
                                                                        this.f107010OooOoOO = 10;
                                                                        break;
                                                                    }
                                                                    return C32460OooOooO.f116667OooO00o;
                                                                }
                                                                o0OOo0o.o000OO o000oo2 = oooO0OO.f77123OooO0o0;
                                                                this.f107007OooOo0o = null;
                                                                this.f107006OooOo = null;
                                                                this.f107009OooOoO0 = null;
                                                                this.f107010OooOoOO = 9;
                                                            }
                                                        }
                                                    }
                                                    break;
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
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo = obj;
                notePlaceHolder = (NotePlaceHolder) objOooO0Oo;
                if (notePlaceHolder != null) {
                }
                break;
            case 2:
                uri = (Uri) this.f107009OooOoO0;
                string = this.f107006OooOo;
                notePlaceHolder2 = this.f107007OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                if (((Boolean) objOooO0o).booleanValue()) {
                }
                return enumC32485OooO00o;
            case 3:
                uri = (Uri) this.f107009OooOoO0;
                string = this.f107006OooOo;
                notePlaceHolder2 = this.f107007OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o2 = obj;
                if (((Boolean) objOooO0o2).booleanValue()) {
                }
                return enumC32485OooO00o;
            case 4:
                uri = (Uri) this.f107009OooOoO0;
                string = this.f107006OooOo;
                notePlaceHolder2 = this.f107007OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o3 = obj;
                if (((Boolean) objOooO0o3).booleanValue()) {
                }
                return enumC32485OooO00o;
            case 5:
                uri = (Uri) this.f107009OooOoO0;
                string = this.f107006OooOo;
                notePlaceHolder2 = this.f107007OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o4 = obj;
                if (((Boolean) objOooO0o4).booleanValue()) {
                }
                return enumC32485OooO00o;
            case 6:
                uri = (Uri) this.f107009OooOoO0;
                string = this.f107006OooOo;
                notePlaceHolder2 = this.f107007OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o5 = obj;
                if (((Boolean) objOooO0o5).booleanValue()) {
                }
                return enumC32485OooO00o;
            case 7:
                String str3 = this.f107006OooOo;
                NotePlaceHolder notePlaceHolder5 = this.f107007OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                notePlaceHolder2 = notePlaceHolder5;
                string = str3;
                objOooO0o6 = obj;
                if (!((Boolean) objOooO0o6).booleanValue()) {
                    i3 = 0;
                }
                NotePlaceHolder notePlaceHolderCopy$default2 = NotePlaceHolder.copy$default(notePlaceHolder2, null, null, null, 0L, null, null, 0, null, 191, null);
                notePlaceHolderCopy$default2.getExtras().putAll(this.f107013OooOooO);
                C27449o00O0OoO c27449o00O0OoO22 = oooO0OO.f77121OooO0Oo;
                this.f107007OooOo0o = notePlaceHolder2;
                this.f107006OooOo = string;
                this.f107009OooOoO0 = notePlaceHolderCopy$default2;
                this.f107008OooOoO = i3;
                this.f107010OooOoOO = 8;
                objOooO0oO = c27449o00O0OoO22.f96049OooOOOo.OooO0oO(0, str2, this);
                if (objOooO0oO != enumC32485OooO00o) {
                }
                if (objOooO0oO != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 8:
                i = this.f107008OooOoO;
                notePlaceHolder3 = (NotePlaceHolder) this.f107009OooOoO0;
                str = this.f107006OooOo;
                notePlaceHolder4 = this.f107007OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (i != 0) {
                }
                break;
            case 9:
            case 11:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 10:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
