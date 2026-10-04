package o0OOo0o;

import androidx.core.os.BundleKt;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27314OooOooO;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OOo0o.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase$recoverBackupFilesByVendor$2", m80623f = "BackupUseCase.kt", m80624l = {976, 977, 980}, m80625m = "invokeSuspend")
public final class C27344OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Serializable f95199OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f95200OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ List<BackupFile> f95201OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f95202OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95203OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f95204OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27344OooOoo(List<BackupFile> list, C27351Oooo0O0 c27351Oooo0O0, String str, Continuation<? super C27344OooOoo> continuation) {
        super(2, continuation);
        this.f95201OooOoO = list;
        this.f95203OooOoOO = c27351Oooo0O0;
        this.f95204OooOoo0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27344OooOoo(this.f95201OooOoO, this.f95203OooOoOO, this.f95204OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27344OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0222, code lost:
    
        if (r0 == r2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0247, code lost:
    
        if (r9.OooOoO(r3, r35) == r2) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00e0: MOVE (r2 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:40:0x00e0 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f A[Catch: all -> 0x00e3, Exception -> 0x00e5, TryCatch #0 {all -> 0x00e3, blocks: (B:83:0x022b, B:85:0x022f, B:87:0x023a, B:29:0x00a0, B:32:0x00b1, B:33:0x00b8, B:35:0x00be, B:37:0x00d6, B:47:0x00ee, B:49:0x00f2, B:52:0x00fd, B:53:0x0109, B:55:0x010f, B:57:0x0127, B:59:0x012f, B:61:0x0138, B:62:0x013f, B:64:0x0145, B:66:0x014d, B:68:0x0165, B:71:0x01c3, B:70:0x01a2, B:72:0x01ef, B:73:0x01f2, B:74:0x01f3), top: B:94:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145 A[Catch: all -> 0x00e3, Exception -> 0x00e5, TryCatch #0 {all -> 0x00e3, blocks: (B:83:0x022b, B:85:0x022f, B:87:0x023a, B:29:0x00a0, B:32:0x00b1, B:33:0x00b8, B:35:0x00be, B:37:0x00d6, B:47:0x00ee, B:49:0x00f2, B:52:0x00fd, B:53:0x0109, B:55:0x010f, B:57:0x0127, B:59:0x012f, B:61:0x0138, B:62:0x013f, B:64:0x0145, B:66:0x014d, B:68:0x0165, B:71:0x01c3, B:70:0x01a2, B:72:0x01ef, B:73:0x01f2, B:74:0x01f3), top: B:94:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0213  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
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
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r2;
        ?? r10;
        Object obj2;
        ArrayList arrayList;
        long jCurrentTimeMillis;
        BackupFile.DiskVendor diskVendor;
        char c;
        Throwable th;
        Object path;
        Iterator it;
        Iterator it2;
        InterfaceC27314OooOooO interfaceC27314OooOooO;
        NotePlaceHolder[] notePlaceHolderArr;
        File file;
        List list;
        String str;
        BackupFile.DiskVendor diskVendor2;
        NotePlaceHolder notePlaceHolder;
        Object next;
        File file2;
        String str2 = BackupFile.FILE_PROPERTY_LOCAL_BACKUP_INSTANCE_URI;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r3 = this.f95202OooOoO0;
        List<BackupFile> list2 = this.f95201OooOoO;
        C27351Oooo0O0 c27351Oooo0O0 = this.f95203OooOoOO;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                r2 = obj2;
                C31190OooO0oo.OooO0oo(r2);
                throw th;
            }
        } catch (Exception e) {
            e = e;
            r10 = r3;
        } catch (Throwable th3) {
            th = th3;
            r2 = r3;
            C31190OooO0oo.OooO0oo(r2);
            throw th;
        }
        if (r3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (list2.isEmpty()) {
                return C32460OooOooO.f116667OooO00o;
            }
            BackupFile.DiskVendor diskVendor3 = ((BackupFile) oOo000Oo.OooOo.Oooo0oO(list2)).getDiskVendor();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupUseCase");
            c20358OooO00o.OooO0o0("recoverBackupFilesByVendor, vendor = " + diskVendor3 + ", backupFiles: " + oOo000Oo.OooOo.o000oOoO(list2, null, null, null, new com.orion.notein.domain.mapper.OooO00o(1), 31), new Object[0]);
            File fileOooOo0 = c27351Oooo0O0.OooOo0(diskVendor3);
            C31190OooO0oo.OooO0o(fileOooOo0);
            C31190OooO0oo.OooO(fileOooOo0);
            try {
                arrayList = new ArrayList();
                jCurrentTimeMillis = System.currentTimeMillis();
                diskVendor = BackupFile.DiskVendor.Local;
                c = FilenameUtils.EXTENSION_SEPARATOR;
            } catch (Exception e2) {
                e = e2;
                r10 = fileOooOo0;
                if ((e instanceof BackupException) && ((BackupException) e).getErrorCode() == -101) {
                    BackupFile.DiskVendor diskVendor4 = BackupFile.DiskVendor.None;
                    this.f95200OooOo0o = r10;
                    this.f95199OooOo = e;
                    this.f95202OooOoO0 = 3;
                }
                r2 = r10;
                throw e;
            }
            if (diskVendor3 == diskVendor) {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        th = null;
                        next = null;
                        break;
                    }
                    next = it3.next();
                    BackupFile backupFile = (BackupFile) next;
                    th = null;
                    String strOoooOoo = C33599OooOo0O.OoooOoo(FilenameUtils.EXTENSION_SEPARATOR, backupFile.getName(), "");
                    if (!backupFile.isDir() && strOoooOoo.equals(BackupFile.EXTENSION_FOLDER_TREE_FILE)) {
                        break;
                    }
                }
                BackupFile backupFile2 = (BackupFile) next;
                if (backupFile2 != null) {
                    path = backupFile2.getPath();
                }
                ArrayList arrayList2 = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    BackupFile backupFile3 = (BackupFile) next2;
                    Iterator it4 = it;
                    String strOoooOoo2 = C33599OooOo0O.OoooOoo(c, backupFile3.getName(), "");
                    if (!backupFile3.isDir() && strOoooOoo2.equals(BackupFile.EXTENSION_NOTEIN_FILE)) {
                        arrayList2.add(next2);
                    }
                    it = it4;
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                }
                String str3 = this.f95204OooOoo0;
                it2 = arrayList2.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Object next3 = it2.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        C34429OooOOo0.OooOOo();
                        throw th;
                    }
                    BackupFile backupFile4 = (BackupFile) next3;
                    String str4 = str3;
                    String string = UUID.randomUUID().toString();
                    Iterator it5 = it2;
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                    if (diskVendor3 == BackupFile.DiskVendor.Local) {
                        diskVendor2 = diskVendor3;
                        str = str2;
                        notePlaceHolder = new NotePlaceHolder(string, str4, backupFile4.getName(), jCurrentTimeMillis + ((long) i), backupFile4.getPath(), null, 0, BundleKt.bundleOf(new C32443OooOOO(str2, backupFile4.getContentProperties().get(str2)), new C32443OooOOO("local_folder_tree_file_path", path)), 96, null);
                    } else {
                        str = str2;
                        diskVendor2 = diskVendor3;
                        notePlaceHolder = new NotePlaceHolder(string, str4, backupFile4.getName(), jCurrentTimeMillis + ((long) i), backupFile4.getPath(), null, 0, null, 224, null);
                    }
                    NotePlaceHolder notePlaceHolder2 = notePlaceHolder;
                    notePlaceHolder2.getExtras().putString("id", backupFile4.getId());
                    notePlaceHolder2.getExtras().putString("disk_vendor", backupFile4.getDiskVendor().name());
                    arrayList.add(notePlaceHolder2);
                    i = i2;
                    it2 = it5;
                    str3 = str4;
                    diskVendor3 = diskVendor2;
                    str2 = str;
                }
                interfaceC27314OooOooO = c27351Oooo0O0.f95235OooO;
                NotePlaceHolder[] notePlaceHolderArr2 = (NotePlaceHolder[]) arrayList.toArray(new NotePlaceHolder[0]);
                notePlaceHolderArr = (NotePlaceHolder[]) Arrays.copyOf(notePlaceHolderArr2, notePlaceHolderArr2.length);
                this.f95200OooOo0o = fileOooOo0;
                this.f95199OooOo = arrayList;
                this.f95202OooOoO0 = 1;
                if (interfaceC27314OooOooO.OooO00o(notePlaceHolderArr, this) != enumC32485OooO00o) {
                    file = fileOooOo0;
                    list = arrayList;
                }
                return enumC32485OooO00o;
            }
            th = null;
            path = th;
            ArrayList arrayList22 = new ArrayList();
            it = list2.iterator();
            while (it.hasNext()) {
            }
            String str32 = this.f95204OooOoo0;
            it2 = arrayList22.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
            }
            interfaceC27314OooOooO = c27351Oooo0O0.f95235OooO;
            NotePlaceHolder[] notePlaceHolderArr22 = (NotePlaceHolder[]) arrayList.toArray(new NotePlaceHolder[0]);
            notePlaceHolderArr = (NotePlaceHolder[]) Arrays.copyOf(notePlaceHolderArr22, notePlaceHolderArr22.length);
            this.f95200OooOo0o = fileOooOo0;
            this.f95199OooOo = arrayList;
            this.f95202OooOoO0 = 1;
            if (interfaceC27314OooOooO.OooO00o(notePlaceHolderArr, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (r3 != 1) {
            if (r3 == 2) {
                File file3 = this.f95200OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                file2 = file3;
                C31190OooO0oo.OooO0oo(file2);
                return C32460OooOooO.f116667OooO00o;
            }
            if (r3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e = (Exception) this.f95199OooOo;
            r2 = this.f95200OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                r2 = r2;
                throw e;
            } catch (Throwable th4) {
                th = th4;
                C31190OooO0oo.OooO0oo(r2);
                throw th;
            }
        }
        list = (List) this.f95199OooOo;
        File file4 = this.f95200OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        th = null;
        file = file4;
        this.f95200OooOo0o = file;
        this.f95199OooOo = th;
        this.f95202OooOoO0 = 2;
        Object objOooOOoo = c27351Oooo0O0.OooOOoo(list, list2, file, this);
        file2 = file;
    }
}
