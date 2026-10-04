package o0OOo0o;

import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.folder.Folder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO.C26417OooOoO;
import o0OO00o0.C26681o00o0oOO;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27314OooOooO;
import o0OOoooO.C27995OooO;
import o0OOoooO.C27996OooO00o;
import o0OOoooO.C28000OooO0o;
import o0OOoooO.C28001OooO0o0;
import o0OOoooO.C28009OooOOOO;
import o0oOo0o0.C30982OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOo0o.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27600o0ooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C28009OooOOOO f96982OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f96983OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27129OoooOOO f96984OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27309OooOoO f96985OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC27314OooOooO f96986OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C26417OooOoO f96987OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C30982OooO0Oo f96988OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f96989OooO0oo;

    /* JADX INFO: renamed from: o0OOo0o.o0ooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$getFolderByIdSync$2", m80623f = "FolderUseCase.kt", m80624l = {103}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Folder>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f96991OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f96992OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f96992OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C27600o0ooOO0.this.new OooO00o(this.f96992OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Folder> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f96991OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C28009OooOOOO c28009OooOOOO = C27600o0ooOO0.this.f96982OooO00o;
            this.f96991OooOo0o = 1;
            Folder folderOooO0Oo = c28009OooOOOO.OooO0Oo(this.f96992OooOoO0);
            return folderOooO0Oo == enumC32485OooO00o ? enumC32485OooO00o : folderOooO0Oo;
        }
    }

    public C27600o0ooOO0(C28009OooOOOO c28009OooOOOO, InterfaceC27313OooOoo0 noteMetaRepo, C27129OoooOOO c27129OoooOOO, InterfaceC27309OooOoO noteContentRepo, C26417OooOoO c26417OooOoO, InterfaceC27314OooOooO notePlaceholderRepo, C26681o00o0oOO c26681o00o0oOO, C30982OooO0Oo multiWindowHelper, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteContentRepo, "noteContentRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notePlaceholderRepo, "notePlaceholderRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(multiWindowHelper, "multiWindowHelper");
        this.f96982OooO00o = c28009OooOOOO;
        this.f96983OooO0O0 = noteMetaRepo;
        this.f96984OooO0OO = c27129OoooOOO;
        this.f96985OooO0Oo = noteContentRepo;
        this.f96987OooO0o0 = c26417OooOoO;
        this.f96986OooO0o = notePlaceholderRepo;
        this.f96988OooO0oO = multiWindowHelper;
        this.f96989OooO0oo = abstractApplicationC26277OooOoOO;
    }

    public static Object OooO0O0(C27600o0ooOO0 c27600o0ooOO0, String str, String str2, String str3, long j, int i, AbstractC32479OooO0OO abstractC32479OooO0OO, int i2) {
        if ((i2 & 4) != 0) {
            str3 = UUID.randomUUID().toString();
        }
        String str4 = str3;
        if ((i2 & 8) != 0) {
            j = System.currentTimeMillis();
        }
        long j2 = j;
        int i3 = (i2 & 16) != 0 ? C27996OooO00o.f99274OooO00o : i;
        c27600o0ooOO0.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27553o00oO0o(str2, c27600o0ooOO0, str4, str, j2, i3, null), abstractC32479OooO0OO);
    }

    public final C27995OooO OooO(String str) {
        C28009OooOOOO c28009OooOOOO = this.f96982OooO00o;
        String strOooO0Oo = c28009OooOOOO.f99337OooO0OO.OooO0Oo();
        oo0oO0.o00000O0 o00000o02 = c28009OooOOOO.f99335OooO00o;
        return new C27995OooO(str != null ? o00000o02.OooOO0o(str, strOooO0Oo) : o00000o02.OooO0o(strOooO0Oo), c28009OooOOOO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e6, code lost:
    
        if (r1.OooOO0(r4, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo000o oo000oVar;
        String str2;
        C27600o0ooOO0 c27600o0ooOO0;
        if (abstractC32479OooO0OO instanceof oo000o) {
            oo000oVar = (oo000o) abstractC32479OooO0OO;
            int i = oo000oVar.f97016OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo000oVar.f97016OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oo000oVar = new oo000o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oo000oVar.f97015OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo000oVar.f97016OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo000oVar.f97013OooOo0o = this;
            oo000oVar.f97012OooOo = str;
            oo000oVar.f97016OooOoOO = 1;
            Serializable serializableOooO = this.f96982OooO00o.OooO(oo000oVar);
            if (serializableOooO != enumC32485OooO00o) {
                str2 = str;
                obj = serializableOooO;
                c27600o0ooOO0 = this;
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
        String str3 = oo000oVar.f97012OooOo;
        C27600o0ooOO0 c27600o0ooOO02 = oo000oVar.f97013OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        str2 = str3;
        c27600o0ooOO0 = c27600o0ooOO02;
        List list = (List) obj;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "FolderUseCase", "adoptOrphanFolders: ", str2, ", folders: ");
        sbOooO00o.append(list);
        boolean z = false;
        c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
        List<Folder> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (Folder folder : list2) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(folder.copy((3583 & 1) != 0 ? folder.id : null, (3583 & 2) != 0 ? folder.userId : str2, (3583 & 4) != 0 ? folder.parentId : null, (3583 & 8) != 0 ? folder.recoverParentId : null, (3583 & 16) != 0 ? folder.title : null, (3583 & 32) != 0 ? folder.favorite : false, (3583 & 64) != 0 ? folder.inTrashBin : false, (3583 & 128) != 0 ? folder.creationTime : 0L, (3583 & 256) != 0 ? folder.lastModificationTime : 0L, (3583 & 512) != 0 ? folder.tnPath : null, (3583 & 1024) != 0 ? folder.sortKey : null, (3583 & 2048) != 0 ? folder.coverColor : null));
            arrayList = arrayList2;
            z = false;
        }
        C28009OooOOOO c28009OooOOOO = c27600o0ooOO0.f96982OooO00o;
        Folder[] folderArr = (Folder[]) arrayList.toArray(new Folder[0]);
        Folder[] folderArr2 = (Folder[]) Arrays.copyOf(folderArr, folderArr.length);
        oo000oVar.f97013OooOo0o = null;
        oo000oVar.f97012OooOo = null;
        oo000oVar.f97016OooOoOO = 2;
    }

    public final C28001OooO0o0 OooO0OO() {
        C28009OooOOOO c28009OooOOOO = this.f96982OooO00o;
        return new C28001OooO0o0(c28009OooOOOO.f99335OooO00o.OooO(c28009OooOOOO.f99337OooO0OO.OooO0Oo()), c28009OooOOOO);
    }

    public final Object OooO0Oo(String str, Continuation<? super Folder> continuation) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooO00o(str, null), continuation);
    }

    public final Object OooO0o(Folder folder, AbstractC32476OooO abstractC32476OooO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27601o0ooOoO(this, folder, null), abstractC32476OooO);
    }

    public final C28000OooO0o OooO0o0() {
        C28009OooOOOO c28009OooOOOO = this.f96982OooO00o;
        return new C28000OooO0o(c28009OooOOOO.f99335OooO00o.OooO00o(c28009OooOOOO.f99337OooO0OO.OooO0Oo()), c28009OooOOOO);
    }

    public final Object OooO0oO(OooOOO oooOOO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOO0o(this, null), oooOOO);
    }

    public final Object OooO0oo(Folder folder, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OO00O(this, folder, null), abstractC32479OooO0OO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        if (r6.f96982OooO00o.OooOO0(new com.orion.notein.domain.models.folder.Folder[]{r1}, r4) == r5) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(Folder folder, Folder folder2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27404o000OOo c27404o000OOo;
        C27600o0ooOO0 c27600o0ooOO0;
        Folder folder3;
        Folder folder4;
        if (abstractC32479OooO0OO instanceof C27404o000OOo) {
            c27404o000OOo = (C27404o000OOo) abstractC32479OooO0OO;
            int i = c27404o000OOo.f95631OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27404o000OOo.f95631OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27404o000OOo = new C27404o000OOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27404o000OOo.f95628OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27404o000OOo.f95631OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FolderUseCase");
            c20358OooO00o.OooO0o0("moveFolderToFolder: " + folder + ", newParent: " + folder2, new Object[0]);
            String id = folder2 != null ? folder2.getId() : null;
            c27404o000OOo.f95627OooOo0o = this;
            c27404o000OOo.f95626OooOo = folder;
            c27404o000OOo.f95629OooOoO0 = folder2;
            c27404o000OOo.f95631OooOoo0 = 1;
            objOooO00o = this.f96987OooO0o0.OooO00o(id, c27404o000OOo);
            if (objOooO00o != enumC32485OooO00o) {
                c27600o0ooOO0 = this;
                folder3 = folder;
                folder4 = folder2;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
            return C32460OooOooO.f116667OooO00o;
        }
        folder4 = c27404o000OOo.f95629OooOoO0;
        Folder folder5 = c27404o000OOo.f95626OooOo;
        c27600o0ooOO0 = c27404o000OOo.f95627OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        folder3 = folder5;
        Folder folderCopy = folder3.copy((3583 & 1) != 0 ? folder3.id : null, (3583 & 2) != 0 ? folder3.userId : null, (3583 & 4) != 0 ? folder3.parentId : folder4 != null ? folder4.getId() : null, (3583 & 8) != 0 ? folder3.recoverParentId : null, (3583 & 16) != 0 ? folder3.title : null, (3583 & 32) != 0 ? folder3.favorite : false, (3583 & 64) != 0 ? folder3.inTrashBin : false, (3583 & 128) != 0 ? folder3.creationTime : 0L, (3583 & 256) != 0 ? folder3.lastModificationTime : 0L, (3583 & 512) != 0 ? folder3.tnPath : null, (3583 & 1024) != 0 ? folder3.sortKey : new Integer(((Number) objOooO00o).intValue()), (3583 & 2048) != 0 ? folder3.coverColor : null);
        c27404o000OOo.f95627OooOo0o = null;
        c27404o000OOo.f95626OooOo = null;
        c27404o000OOo.f95629OooOoO0 = null;
        c27404o000OOo.f95631OooOoo0 = 2;
    }

    public final Object OooOO0O(Folder folder, String str, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("FolderUseCase");
        c20358OooO00o.OooO0o0("rename: " + folder + ", newName: " + str, new Object[0]);
        Object objOooOO0 = this.f96982OooO00o.OooOO0(new Folder[]{folder.copy((3583 & 1) != 0 ? folder.id : null, (3583 & 2) != 0 ? folder.userId : null, (3583 & 4) != 0 ? folder.parentId : null, (3583 & 8) != 0 ? folder.recoverParentId : null, (3583 & 16) != 0 ? folder.title : str, (3583 & 32) != 0 ? folder.favorite : false, (3583 & 64) != 0 ? folder.inTrashBin : false, (3583 & 128) != 0 ? folder.creationTime : 0L, (3583 & 256) != 0 ? folder.lastModificationTime : 0L, (3583 & 512) != 0 ? folder.tnPath : null, (3583 & 1024) != 0 ? folder.sortKey : null, (3583 & 2048) != 0 ? folder.coverColor : null)}, abstractC32476OooO);
        return objOooOO0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOO0 : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e6, code lost:
    
        if (r1.OooOO0(r4, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000000 o000000Var;
        String str2;
        C27600o0ooOO0 c27600o0ooOO0;
        if (abstractC32479OooO0OO instanceof o000000) {
            o000000Var = (o000000) abstractC32479OooO0OO;
            int i = o000000Var.f95368OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000000Var.f95368OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o000000Var = new o000000(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o000000Var.f95367OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000000Var.f95368OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o000000Var.f95365OooOo0o = this;
            o000000Var.f95364OooOo = str;
            o000000Var.f95368OooOoOO = 1;
            Serializable serializableOooO0O0 = this.f96982OooO00o.OooO0O0(o000000Var);
            if (serializableOooO0O0 != enumC32485OooO00o) {
                str2 = str;
                obj = serializableOooO0O0;
                c27600o0ooOO0 = this;
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
        String str3 = o000000Var.f95364OooOo;
        C27600o0ooOO0 c27600o0ooOO02 = o000000Var.f95365OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        str2 = str3;
        c27600o0ooOO0 = c27600o0ooOO02;
        List list = (List) obj;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "FolderUseCase", "resetAllFolderUserId: ", str2, ", folders: ");
        sbOooO00o.append(list);
        boolean z = false;
        c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
        List<Folder> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (Folder folder : list2) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(folder.copy((3583 & 1) != 0 ? folder.id : null, (3583 & 2) != 0 ? folder.userId : str2, (3583 & 4) != 0 ? folder.parentId : null, (3583 & 8) != 0 ? folder.recoverParentId : null, (3583 & 16) != 0 ? folder.title : null, (3583 & 32) != 0 ? folder.favorite : false, (3583 & 64) != 0 ? folder.inTrashBin : false, (3583 & 128) != 0 ? folder.creationTime : 0L, (3583 & 256) != 0 ? folder.lastModificationTime : 0L, (3583 & 512) != 0 ? folder.tnPath : null, (3583 & 1024) != 0 ? folder.sortKey : null, (3583 & 2048) != 0 ? folder.coverColor : null));
            arrayList = arrayList2;
            z = false;
        }
        C28009OooOOOO c28009OooOOOO = c27600o0ooOO0.f96982OooO00o;
        Folder[] folderArr = (Folder[]) arrayList.toArray(new Folder[0]);
        Folder[] folderArr2 = (Folder[]) Arrays.copyOf(folderArr, folderArr.length);
        o000000Var.f95365OooOo0o = null;
        o000000Var.f95364OooOo = null;
        o000000Var.f95368OooOoOO = 2;
    }

    public final Object OooOOO(Folder folder, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("FolderUseCase");
        c20358OooO00o.OooO0o0("toggleFavorite: " + folder, new Object[0]);
        Object objOooOO0 = this.f96982OooO00o.OooOO0(new Folder[]{folder.copy((3583 & 1) != 0 ? folder.id : null, (3583 & 2) != 0 ? folder.userId : null, (3583 & 4) != 0 ? folder.parentId : null, (3583 & 8) != 0 ? folder.recoverParentId : null, (3583 & 16) != 0 ? folder.title : null, (3583 & 32) != 0 ? folder.favorite : folder.getFavorite() ^ true, (3583 & 64) != 0 ? folder.inTrashBin : false, (3583 & 128) != 0 ? folder.creationTime : 0L, (3583 & 256) != 0 ? folder.lastModificationTime : 0L, (3583 & 512) != 0 ? folder.tnPath : null, (3583 & 1024) != 0 ? folder.sortKey : null, (3583 & 2048) != 0 ? folder.coverColor : null)}, abstractC32479OooO0OO);
        return objOooOO0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOO0 : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooOOO0(Folder folder, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00000(folder, z, this, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }
}
