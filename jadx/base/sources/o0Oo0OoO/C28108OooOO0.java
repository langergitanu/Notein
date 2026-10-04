package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import Oooo0oO.C21111o0ooOoO;
import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.domain.mapper.FolderMapper;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.backup.BackupInstance;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o000oo0.C24684Oooo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0Oo.InterfaceC27293OooO0oo;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o.C27387o0000o0;
import o0OOo0o.C27423o000o0Oo;
import o0OOo0o.C27600o0ooOO0;
import o0OOoooO.C28009OooOOOO;
import o0Oo00o.C28028OooO0o;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: o0Oo0OoO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28108OooOO0 extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C28009OooOOOO f99618OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f99619OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC27293OooO0oo f99620OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final FolderMapper f99621OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C27387o0000o0 f99622OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C27600o0ooOO0 f99623OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f99624OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28108OooOO0(C28009OooOOOO c28009OooOOOO, InterfaceC27293OooO0oo backupRepo, InterfaceC27313OooOoo0 noteMetaRepo, FolderMapper folderMapper, C27600o0ooOO0 c27600o0ooOO0, C27387o0000o0 noteInFileUseCase, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(backupRepo, "backupRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(folderMapper, "folderMapper");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteInFileUseCase, "noteInFileUseCase");
        this.f99618OooOo = c28009OooOOOO;
        this.f99620OooOoO0 = backupRepo;
        this.f99619OooOoO = noteMetaRepo;
        this.f99621OooOoOO = folderMapper;
        this.f99623OooOoo0 = c27600o0ooOO0;
        this.f99622OooOoo = noteInFileUseCase;
        this.f99624OooOooO = abstractApplicationC26277OooOoOO;
    }

    public static List o00000o0(String str, LinkedHashMap linkedHashMap) {
        Folder folder = (Folder) linkedHashMap.get(str);
        List listO00000o0 = C34434OooOoO.f123453OooOo0o;
        if (folder == null) {
            return listO00000o0;
        }
        String parentId = folder.getParentId();
        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(folder);
        if (parentId != null && parentId.length() != 0) {
            listO00000o0 = o00000o0(parentId, linkedHashMap);
        }
        return oOo000Oo.OooOo.OooooOO(listOooO0oO, listO00000o0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
    
        if (r13.OooOOO0(r0, false, r1) == r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:14:0x0031, B:55:0x00e4, B:21:0x0047, B:47:0x00ae, B:49:0x00b5, B:52:0x00d3, B:24:0x0050, B:46:0x00a3, B:27:0x0056, B:34:0x006c, B:38:0x0077, B:40:0x008a, B:42:0x0090, B:30:0x005d), top: B:60:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o0000(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28099OooO c28099OooO;
        C28108OooOO0 c28108OooOO0;
        C28108OooOO0 c28108OooOO02;
        Folder folder;
        C28108OooOO0 c28108OooOO03;
        Folder folder2;
        Iterator it;
        if (abstractC32479OooO0OO instanceof C28099OooO) {
            c28099OooO = (C28099OooO) abstractC32479OooO0OO;
            int i = c28099OooO.f99584OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28099OooO.f99584OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c28099OooO = new C28099OooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c28099OooO.f99581OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28099OooO.f99584OooOoo0;
        boolean z = true;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                C28009OooOOOO c28009OooOOOO = this.f99618OooOo;
                c28099OooO.f99580OooOo0o = this;
                c28099OooO.f99584OooOoo0 = 1;
                objOooO0Oo = c28009OooOOOO.OooO0Oo(str);
                if (objOooO0Oo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c28108OooOO0 = this;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        folder = c28099OooO.f99579OooOo;
                        c28108OooOO02 = c28099OooO.f99580OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0Oo);
                        c28108OooOO03 = c28108OooOO02;
                        folder2 = folder;
                        it = ((List) objOooO0Oo).iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(objOooO0Oo);
                        return Boolean.TRUE;
                    }
                    it = c28099OooO.f99582OooOoO0;
                    folder2 = c28099OooO.f99579OooOo;
                    c28108OooOO03 = c28099OooO.f99580OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    while (true) {
                        if (it.hasNext()) {
                            NoteMeta noteMeta = (NoteMeta) it.next();
                            noteMeta.setParentId(null);
                            c28099OooO.f99580OooOo0o = c28108OooOO03;
                            c28099OooO.f99579OooOo = folder2;
                            c28099OooO.f99582OooOoO0 = it;
                            c28099OooO.f99584OooOoo0 = 3;
                            if (c28108OooOO03.f99619OooOoO.OooOo0O(new NoteMeta[]{noteMeta}, c28099OooO) == enumC32485OooO00o) {
                                break;
                            }
                        } else {
                            C27600o0ooOO0 c27600o0ooOO0 = c28108OooOO03.f99623OooOoo0;
                            c28099OooO.f99580OooOo0o = null;
                            c28099OooO.f99579OooOo = null;
                            c28099OooO.f99582OooOoO0 = null;
                            c28099OooO.f99584OooOoo0 = 4;
                        }
                    }
                    return enumC32485OooO00o;
                }
                c28108OooOO0 = c28099OooO.f99580OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
            }
            Folder folder3 = (Folder) objOooO0Oo;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FolderBackupTask");
            if (folder3 == null) {
                z = false;
            }
            c20358OooO00o.OooO00o("recoverFolderById, folder is exist: " + z, new Object[0]);
            if (folder3 != null) {
                if (folder3.getInTrashBin()) {
                    C27600o0ooOO0 c27600o0ooOO02 = c28108OooOO0.f99623OooOoo0;
                    c28099OooO.f99580OooOo0o = c28108OooOO0;
                    c28099OooO.f99579OooOo = folder3;
                    c28099OooO.f99584OooOoo0 = 2;
                    Object objOooO0oo = c27600o0ooOO02.OooO0oo(folder3, c28099OooO);
                    if (objOooO0oo == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    c28108OooOO02 = c28108OooOO0;
                    folder = folder3;
                    objOooO0Oo = objOooO0oo;
                    c28108OooOO03 = c28108OooOO02;
                    folder2 = folder;
                    it = ((List) objOooO0Oo).iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                return Boolean.TRUE;
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o2, "FolderBackupTask", "recoverFolderById failed, error: ", e), new Object[0]);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28103OooO0Oo c28103OooO0Oo;
        C28108OooOO0 c28108OooOO0;
        String str2;
        ArrayList arrayList;
        if (abstractC32479OooO0OO instanceof C28103OooO0Oo) {
            c28103OooO0Oo = (C28103OooO0Oo) abstractC32479OooO0OO;
            int i = c28103OooO0Oo.f99595OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28103OooO0Oo.f99595OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c28103OooO0Oo = new C28103OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28103OooO0Oo.f99592OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28103OooO0Oo.f99595OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.f99621OooOoOO.toEntity((Folder) it.next()));
            }
            File file = new File(str);
            c28103OooO0Oo.f99591OooOo0o = this;
            c28103OooO0Oo.f99590OooOo = str;
            c28103OooO0Oo.f99593OooOoO0 = arrayList2;
            c28103OooO0Oo.f99595OooOoo0 = 1;
            C27387o0000o0 c27387o0000o0 = this.f99622OooOoo;
            c27387o0000o0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27423o000o0Oo(list, c27387o0000o0, file, null), c28103OooO0Oo) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c28108OooOO0 = this;
            str2 = str;
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = c28103OooO0Oo.f99593OooOoO0;
            str2 = c28103OooO0Oo.f99590OooOo;
            c28108OooOO0 = c28103OooO0Oo.f99591OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        c28108OooOO0.getClass();
        String absolutePath = new File(C21111o0ooOoO.OooO0Oo(str2, "/folder_tree.json")).getAbsolutePath();
        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
        return new Integer(c28108OooOO0.o00000O(arrayList, FolderEntity.class, absolutePath));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        if (r13 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00cd -> B:33:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable o00000oO(String str, BackupInstance backupInstance, File file, BackupFile.DiskVendor diskVendor, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28106OooO0oO c28106OooO0oO;
        C28108OooOO0 c28108OooOO0;
        Collection arrayList;
        C28108OooOO0 c28108OooOO02;
        Map map;
        Iterator it;
        if (abstractC32479OooO0OO instanceof C28106OooO0oO) {
            c28106OooO0oO = (C28106OooO0oO) abstractC32479OooO0OO;
            int i = c28106OooO0oO.f99610OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28106OooO0oO.f99610OooOooO = i - Integer.MIN_VALUE;
            } else {
                c28106OooO0oO = new C28106OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objO0000Ooo = c28106OooO0oO.f99609OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28106OooO0oO.f99610OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objO0000Ooo);
            c28106OooO0oO.f99604OooOo0o = this;
            c28106OooO0oO.f99603OooOo = str;
            c28106OooO0oO.f99610OooOooO = 1;
            objO0000Ooo = o0000Ooo(backupInstance, file, diskVendor, c28106OooO0oO);
            if (objO0000Ooo != enumC32485OooO00o) {
                c28108OooOO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = (String) c28106OooO0oO.f99603OooOo;
            c28108OooOO0 = c28106OooO0oO.f99604OooOo0o;
            C32446OooOOOo.OooO0O0(objO0000Ooo);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object next = c28106OooO0oO.f99607OooOoOO;
            it = c28106OooO0oO.f99605OooOoO;
            arrayList = c28106OooO0oO.f99606OooOoO0;
            map = (Map) c28106OooO0oO.f99603OooOo;
            c28108OooOO02 = c28106OooO0oO.f99604OooOo0o;
            C32446OooOOOo.OooO0O0(objO0000Ooo);
            if (objO0000Ooo == null) {
                arrayList.add(next);
            }
            if (it.hasNext()) {
                List list = (List) arrayList;
                int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo >= 16 ? iOooO0Oo : 16);
                for (Object obj : list) {
                    Collection collection = (List) map.get((Folder) obj);
                    if (collection == null) {
                        collection = C34434OooOoO.f123453OooOo0o;
                    }
                    linkedHashMap.put(obj, collection);
                }
                return linkedHashMap;
            }
            next = it.next();
            C28009OooOOOO c28009OooOOOO = c28108OooOO02.f99618OooOo;
            String id = ((Folder) next).getId();
            c28106OooO0oO.f99604OooOo0o = c28108OooOO02;
            c28106OooO0oO.f99603OooOo = map;
            c28106OooO0oO.f99606OooOoO0 = arrayList;
            c28106OooO0oO.f99605OooOoO = it;
            c28106OooO0oO.f99607OooOoOO = next;
            c28106OooO0oO.f99610OooOooO = 2;
            objO0000Ooo = c28009OooOOOO.OooO0Oo(id);
        }
        Map map2 = (Map) objO0000Ooo;
        Set setKeySet = map2.keySet();
        int iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(setKeySet, 10));
        if (iOooO0Oo2 < 16) {
            iOooO0Oo2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo2);
        for (Object obj2 : setKeySet) {
            linkedHashMap2.put(((Folder) obj2).getId(), obj2);
        }
        c28108OooOO0.getClass();
        List listO00000o0 = o00000o0(str, linkedHashMap2);
        arrayList = new ArrayList();
        c28108OooOO02 = c28108OooOO0;
        map = map2;
        it = listO00000o0.iterator();
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:15:0x003c, B:39:0x00e5, B:41:0x00eb, B:45:0x0108, B:47:0x0110, B:54:0x012b, B:22:0x0056, B:25:0x0063, B:32:0x0085, B:33:0x00c5, B:35:0x00cb, B:36:0x00d9, B:38:0x00df, B:28:0x006b), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:15:0x003c, B:39:0x00e5, B:41:0x00eb, B:45:0x0108, B:47:0x0110, B:54:0x012b, B:22:0x0056, B:25:0x0063, B:32:0x0085, B:33:0x00c5, B:35:0x00cb, B:36:0x00d9, B:38:0x00df, B:28:0x006b), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #0 {Exception -> 0x0041, blocks: (B:15:0x003c, B:39:0x00e5, B:41:0x00eb, B:45:0x0108, B:47:0x0110, B:54:0x012b, B:22:0x0056, B:25:0x0063, B:32:0x0085, B:33:0x00c5, B:35:0x00cb, B:36:0x00d9, B:38:0x00df, B:28:0x006b), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0124 -> B:51:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0129 -> B:52:0x0127). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000oo(String str, BackupInstance backupInstance, File file, BackupFile.DiskVendor diskVendor, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28107OooO0oo c28107OooO0oo;
        C28108OooOO0 c28108OooOO0;
        String str2;
        Map map;
        Iterator it;
        C28108OooOO0 c28108OooOO02;
        Iterator it2;
        Folder folder;
        List list;
        if (abstractC32479OooO0OO instanceof C28107OooO0oo) {
            c28107OooO0oo = (C28107OooO0oo) abstractC32479OooO0OO;
            int i = c28107OooO0oo.f99616OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28107OooO0oo.f99616OooOoo = i - Integer.MIN_VALUE;
            } else {
                c28107OooO0oo = new C28107OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        C28107OooO0oo c28107OooO0oo2 = c28107OooO0oo;
        Object objO00000oO = c28107OooO0oo2.f99615OooOoOO;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28107OooO0oo2.f99616OooOoo;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "FolderBackupTask", "recoverFolderById failed, error: ", e), new Object[0]);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objO00000oO);
            c28107OooO0oo2.f99612OooOo0o = this;
            c28107OooO0oo2.f99611OooOo = str;
            c28107OooO0oo2.f99616OooOoo = 1;
            objO00000oO = o00000oO(str, backupInstance, file, diskVendor, c28107OooO0oo2);
            if (objO00000oO == obj) {
                return obj;
            }
            c28108OooOO0 = this;
            str2 = str;
        } else if (i2 == 1) {
            str2 = (String) c28107OooO0oo2.f99611OooOo;
            C28108OooOO0 c28108OooOO03 = c28107OooO0oo2.f99612OooOo0o;
            C32446OooOOOo.OooO0O0(objO00000oO);
            c28108OooOO0 = c28108OooOO03;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c28107OooO0oo2.f99614OooOoO0;
                Map map2 = (Map) c28107OooO0oo2.f99611OooOo;
                c28108OooOO02 = c28107OooO0oo2.f99612OooOo0o;
                C32446OooOOOo.OooO0O0(objO00000oO);
                map = map2;
                c28108OooOO0 = c28108OooOO02;
                if (!it.hasNext()) {
                    Folder folder2 = (Folder) it.next();
                    C28009OooOOOO c28009OooOOOO = c28108OooOO0.f99618OooOo;
                    c28107OooO0oo2.f99612OooOo0o = c28108OooOO0;
                    c28107OooO0oo2.f99611OooOo = map;
                    c28107OooO0oo2.f99614OooOoO0 = it;
                    c28107OooO0oo2.f99613OooOoO = folder2;
                    c28107OooO0oo2.f99616OooOoo = 2;
                    if (c28009OooOOOO.OooO00o(folder2, c28107OooO0oo2) == obj) {
                        return obj;
                    }
                    it2 = it;
                    folder = folder2;
                    c28108OooOO02 = c28108OooOO0;
                    list = (List) map.get(folder);
                    if (list == null) {
                        C27387o0000o0 c27387o0000o0 = c28108OooOO02.f99622OooOoo;
                        c28107OooO0oo2.f99612OooOo0o = c28108OooOO02;
                        c28107OooO0oo2.f99611OooOo = map;
                        c28107OooO0oo2.f99614OooOoO0 = it2;
                        c28107OooO0oo2.f99613OooOoO = null;
                        c28107OooO0oo2.f99616OooOoo = 3;
                        if (c27387o0000o0.OoooOoo(folder, list, c28107OooO0oo2) != obj) {
                            it = it2;
                            map2 = map;
                            map = map2;
                            c28108OooOO0 = c28108OooOO02;
                            if (!it.hasNext()) {
                                return Boolean.TRUE;
                            }
                        }
                        return obj;
                    }
                    it = it2;
                    c28108OooOO0 = c28108OooOO02;
                    if (!it.hasNext()) {
                    }
                }
                return Boolean.FALSE;
            }
            folder = c28107OooO0oo2.f99613OooOoO;
            it2 = c28107OooO0oo2.f99614OooOoO0;
            Map map3 = (Map) c28107OooO0oo2.f99611OooOo;
            C28108OooOO0 c28108OooOO04 = c28107OooO0oo2.f99612OooOo0o;
            C32446OooOOOo.OooO0O0(objO00000oO);
            map = map3;
            c28108OooOO02 = c28108OooOO04;
            list = (List) map.get(folder);
            if (list == null) {
            }
        }
        map = (Map) objO00000oO;
        Set setKeySet = map.keySet();
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("FolderBackupTask");
        c20358OooO00o2.OooO00o("toRecoverFolders: " + oOo000Oo.OooOo.o000oOoO(setKeySet, null, null, null, new C28102OooO0OO(), 31), new Object[0]);
        Set set = setKeySet;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(set, 10));
        Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            arrayList.add(((Folder) it3.next()).getId());
        }
        if (arrayList.contains(str2)) {
            it = setKeySet.iterator();
            if (!it.hasNext()) {
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, oOo000Oo.OooOoOO] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable o0000Ooo(BackupInstance backupInstance, File file, BackupFile.DiskVendor diskVendor, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28105OooO0o0 c28105OooO0o0;
        File file2;
        File file3;
        C28108OooOO0 c28108OooOO0;
        File file4;
        C28108OooOO0 c28108OooOO02;
        File file5;
        ?? arrayList;
        File file6;
        BackupFile.DiskVendor diskVendor2 = diskVendor;
        if (abstractC32479OooO0OO instanceof C28105OooO0o0) {
            c28105OooO0o0 = (C28105OooO0o0) abstractC32479OooO0OO;
            int i = c28105OooO0o0.f99601OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28105OooO0o0.f99601OooOoo = i - Integer.MIN_VALUE;
            } else {
                c28105OooO0o0 = new C28105OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0o = c28105OooO0o0.f99600OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28105OooO0o0.f99601OooOoo;
        boolean zOooO00o = true;
        File file7 = null;
        int i3 = 0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0o);
            File file8 = new File(this.f99624OooOooO.getCacheDir(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("restore-", diskVendor2.name()));
            file8.mkdirs();
            file2 = new File(file8, "folder_tree");
            file2.mkdir();
            File file9 = new File(file2, "zip");
            file9.mkdir();
            file3 = new File(file9.getAbsolutePath(), "folder.tree");
            C31190OooO0oo.OooO0oO(file3);
            if (backupInstance != null) {
                c28105OooO0o0.f99597OooOo0o = this;
                c28105OooO0o0.f99596OooOo = diskVendor2;
                c28105OooO0o0.f99599OooOoO0 = file2;
                c28105OooO0o0.f99598OooOoO = file3;
                c28105OooO0o0.f99601OooOoo = 1;
                objOooOO0o = this.f99620OooOoO0.OooOO0o("folder.tree", backupInstance, diskVendor2, c28105OooO0o0);
                if (objOooOO0o != enumC32485OooO00o) {
                    file4 = file3;
                    c28108OooOO02 = this;
                }
                return enumC32485OooO00o;
            }
            zOooO00o = C31190OooO0oo.OooO00o(file, file3);
            c28108OooOO0 = this;
            ?? r1 = C34436OooOoOO.f123455OooOo0o;
            if (zOooO00o) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file4 = c28105OooO0o0.f99599OooOoO0;
                file5 = (File) c28105OooO0o0.f99596OooOo;
                c28108OooOO0 = c28105OooO0o0.f99597OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0o);
                file3 = file4;
                file2 = file5;
                if (((Number) objOooOO0o).intValue() != 0) {
                    zOooO00o = false;
                }
                ?? r12 = C34436OooOoOO.f123455OooOo0o;
                if (zOooO00o) {
                    C31190OooO0oo.OooO0oo(file2);
                    return r12;
                }
                File file10 = new File(file2, "unzip");
                file10.mkdir();
                C31193OooOOo.OooO0OO(file3, file10);
                File[] fileArrListFiles = file10.listFiles();
                C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                if (fileArrListFiles != null) {
                    int length = fileArrListFiles.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            file6 = null;
                            break;
                        }
                        file6 = fileArrListFiles[i4];
                        C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("file name: ", file6.getName()), new Object[0]);
                        if (file6.getName().equals("folder_tree.json")) {
                            break;
                        }
                        i4++;
                    }
                    if (file6 != null) {
                        String strOooO0oo = C32501OooO0oO.OooO0oo(file6);
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooO00o("json text: ".concat(strOooO0oo), new Object[0]);
                        ArrayList arrayListO000000o = c28108OooOO0.o000000o(file6, FolderEntity.class);
                        c20358OooO00o.OooO00o("entities: " + arrayListO000000o, new Object[0]);
                        arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListO000000o, 10));
                        Iterator it = arrayListO000000o.iterator();
                        while (it.hasNext()) {
                            arrayList.add(c28108OooOO0.f99621OooOoOO.toFolder((FolderEntity) it.next()));
                        }
                    } else {
                        arrayList = c34434OooOoO;
                    }
                }
                if (fileArrListFiles != null) {
                    int length2 = fileArrListFiles.length;
                    while (true) {
                        if (i3 >= length2) {
                            break;
                        }
                        File file11 = fileArrListFiles[i3];
                        if (file11.getName().equals("folder_tree_labels.json")) {
                            file7 = file11;
                            break;
                        }
                        i3++;
                    }
                    if (file7 != null) {
                        Map map = (Map) C28028OooO0o.OooO00o().fromJson(C32501OooO0oO.OooO0oo(file7), new C28104OooO0o().getType());
                        if (map != null) {
                            r12 = map;
                        }
                    }
                }
                Iterable iterable = (Iterable) arrayList;
                int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable, 10));
                if (iOooO0Oo < 16) {
                    iOooO0Oo = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                for (Object obj : iterable) {
                    List list = (List) r12.get(((Folder) obj).getId());
                    if (list == null) {
                        list = c34434OooOoO;
                    }
                    linkedHashMap.put(obj, list);
                }
                return linkedHashMap;
            }
            file4 = c28105OooO0o0.f99598OooOoO;
            File file12 = c28105OooO0o0.f99599OooOoO0;
            BackupFile.DiskVendor diskVendor3 = (BackupFile.DiskVendor) c28105OooO0o0.f99596OooOo;
            c28108OooOO02 = c28105OooO0o0.f99597OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0o);
            file2 = file12;
            diskVendor2 = diskVendor3;
        }
        C32443OooOOO c32443OooOOO = (C32443OooOOO) objOooOO0o;
        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        List list2 = (List) c32443OooOOO.f116637OooOo;
        C34406OooO00o.f123390OooO00o.OooO00o("getFolderList, errCode: " + iIntValue + ", folderTreeFiles: " + list2, new Object[0]);
        if (list2 != null && list2.size() == 1) {
            BackupFile backupFile = (BackupFile) oOo000Oo.OooOo.Oooo0oO(list2);
            InterfaceC27293OooO0oo interfaceC27293OooO0oo = c28108OooOO02.f99620OooOoO0;
            String absolutePath = file4.getAbsolutePath();
            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
            c28105OooO0o0.f99597OooOo0o = c28108OooOO02;
            c28105OooO0o0.f99596OooOo = file2;
            c28105OooO0o0.f99599OooOoO0 = file4;
            c28105OooO0o0.f99598OooOoO = null;
            c28105OooO0o0.f99601OooOoo = 2;
            objOooOO0o = interfaceC27293OooO0oo.OooO0oo(backupFile, absolutePath, diskVendor2, c28105OooO0o0);
            if (objOooOO0o != enumC32485OooO00o) {
                file5 = file2;
                c28108OooOO0 = c28108OooOO02;
                file3 = file4;
                file2 = file5;
                if (((Number) objOooOO0o).intValue() != 0) {
                }
                ?? r122 = C34436OooOoOO.f123455OooOo0o;
                if (zOooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        zOooO00o = false;
        c28108OooOO0 = c28108OooOO02;
        file3 = file4;
        ?? r1222 = C34436OooOoOO.f123455OooOo0o;
        if (zOooO00o) {
        }
    }
}
