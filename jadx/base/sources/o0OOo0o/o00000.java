package o0OOo0o;

import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO.C26417OooOoO;
import o0OOo0Oo.InterfaceC27314OooOooO;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$setFolderInTrashBin$2", m80623f = "FolderUseCase.kt", m80624l = {150, 162, 165, 185, 186, 193, 198, 201, 203}, m80625m = "invokeSuspend")
public final class o00000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f95356OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f95357OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f95358OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f95359OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Folder f95360OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f95361OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ boolean f95362OooOoo0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$setFolderInTrashBin$2$toUpdateMetas$1$1", m80623f = "FolderUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C27600o0ooOO0 f95363OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C27600o0ooOO0 c27600o0ooOO0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f95363OooOo0o = c27600o0ooOO0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f95363OooOo0o, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f95363OooOo0o.f96989OooO0oo;
            String string = abstractApplicationC26277OooOoOO.getString(R.string.folder_cannot_be_discarded_because_note_editing);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(abstractApplicationC26277OooOoOO, string);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(Folder folder, boolean z, C27600o0ooOO0 c27600o0ooOO0, Continuation<? super o00000> continuation) {
        super(2, continuation);
        this.f95360OooOoOO = folder;
        this.f95362OooOoo0 = z;
        this.f95361OooOoo = c27600o0ooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00000(this.f95360OooOoOO, this.f95362OooOoo0, this.f95361OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x018e, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o(r1, r3, r38) == r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0267, code lost:
    
        if (r6 == r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0291, code lost:
    
        if (r6 != r2) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d3  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Folder folderCopy;
        Object objOooO0o;
        Object objOooO0oo;
        Folder folder;
        List list;
        ArrayList arrayList;
        Iterator it;
        Object objOooO0o2;
        List list2;
        List list3;
        Folder folder2;
        NoteMeta noteMeta;
        List list4;
        List list5;
        Folder folder3;
        Object objOooO0Oo;
        List list6;
        Folder folder4;
        List list7;
        Object objOooO00o;
        List list8;
        Iterator it2;
        C27600o0ooOO0 c27600o0ooOO0;
        Iterator it3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95358OooOoO;
        boolean z = this.f95362OooOoo0;
        C27600o0ooOO0 c27600o0ooOO02 = this.f95361OooOoo;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "FolderUseCase", "setFolderInTrashBin: ");
                sbOooO0O0.append(this.f95360OooOoOO);
                sbOooO0O0.append(", isInTrashBin: ");
                sbOooO0O0.append(z);
                c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                Folder folder5 = this.f95360OooOoOO;
                folderCopy = folder5.copy((3583 & 1) != 0 ? folder5.id : null, (3583 & 2) != 0 ? folder5.userId : null, (3583 & 4) != 0 ? folder5.parentId : null, (3583 & 8) != 0 ? folder5.recoverParentId : null, (3583 & 16) != 0 ? folder5.title : null, (3583 & 32) != 0 ? folder5.favorite : false, (3583 & 64) != 0 ? folder5.inTrashBin : false, (3583 & 128) != 0 ? folder5.creationTime : 0L, (3583 & 256) != 0 ? folder5.lastModificationTime : 0L, (3583 & 512) != 0 ? folder5.tnPath : null, (3583 & 1024) != 0 ? folder5.sortKey : null, (3583 & 2048) != 0 ? folder5.coverColor : null);
                this.f95357OooOo0o = folderCopy;
                this.f95358OooOoO = 1;
                objOooO0o = c27600o0ooOO02.OooO0o(folderCopy, this);
                if (objOooO0o != enumC32485OooO00o) {
                    List list9 = (List) objOooO0o;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("FolderUseCase");
                    List<Folder> list10 = list9;
                    c20358OooO00o2.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("setFolderInTrashBin, folders: ", oOo000Oo.OooOo.o000oOoO(list10, null, null, null, new C27376o000000o(0), 31)), new Object[0]);
                    for (Folder folder6 : list10) {
                        if (z) {
                            folder6.setRecoverParentId(folder6.getParentId());
                        } else {
                            folder6.setParentId(folder6.getRecoverParentId());
                            folder6.setRecoverParentId(null);
                        }
                        folder6.setInTrashBin(z);
                    }
                    this.f95357OooOo0o = folderCopy;
                    this.f95356OooOo = list9;
                    this.f95358OooOoO = 2;
                    objOooO0oo = c27600o0ooOO02.OooO0oo(folderCopy, this);
                    if (objOooO0oo != enumC32485OooO00o) {
                        folder = folderCopy;
                        list = list9;
                        List list11 = (List) objOooO0oo;
                        arrayList = new ArrayList(C34428OooOOo.OooOOoo(list11, 10));
                        it = list11.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                this.f95357OooOo0o = folder;
                                this.f95356OooOo = list;
                                this.f95359OooOoO0 = arrayList;
                                this.f95358OooOoO = 4;
                                c27600o0ooOO02.getClass();
                                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new oo0o0Oo(c27600o0ooOO02, folder, null), this);
                                if (objOooO0o2 != enumC32485OooO00o) {
                                    Folder folder7 = folder;
                                    list2 = list;
                                    list3 = arrayList;
                                    folder2 = folder7;
                                }
                            } else {
                                noteMeta = (NoteMeta) it.next();
                                if (c27600o0ooOO02.f96988OooO0oO.OooO0O0(noteMeta.getId())) {
                                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                    AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
                                    OooO00o oooO00o = new OooO00o(c27600o0ooOO02, null);
                                    this.f95357OooOo0o = null;
                                    this.f95356OooOo = null;
                                    this.f95358OooOoO = 3;
                                } else {
                                    boolean z2 = this.f95362OooOoo0;
                                    arrayList.add(NoteMeta.copy$default(noteMeta, null, null, null, z2 ? noteMeta.getParentId() : noteMeta.getRecoverParentId(), z2 ? noteMeta.getParentId() : null, false, null, 0, 0, z2, null, 0, 0L, 0L, null, false, false, false, 0L, 523751, null));
                                }
                            }
                            break;
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                return enumC32485OooO00o;
            case 1:
                folderCopy = (Folder) this.f95357OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                List list92 = (List) objOooO0o;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("FolderUseCase");
                List<Folder> list102 = list92;
                c20358OooO00o22.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("setFolderInTrashBin, folders: ", oOo000Oo.OooOo.o000oOoO(list102, null, null, null, new C27376o000000o(0), 31)), new Object[0]);
                while (r6.hasNext()) {
                }
                this.f95357OooOo0o = folderCopy;
                this.f95356OooOo = list92;
                this.f95358OooOoO = 2;
                objOooO0oo = c27600o0ooOO02.OooO0oo(folderCopy, this);
                if (objOooO0oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                list = (List) this.f95356OooOo;
                Folder folder8 = (Folder) this.f95357OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                folder = folder8;
                objOooO0oo = obj;
                List list112 = (List) objOooO0oo;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list112, 10));
                it = list112.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                    arrayList.add(NoteMeta.copy$default(noteMeta, null, null, null, z2 ? noteMeta.getParentId() : noteMeta.getRecoverParentId(), z2 ? noteMeta.getParentId() : null, false, null, 0, 0, z2, null, 0, 0L, 0L, null, false, false, false, 0L, 523751, null));
                }
                return C32460OooOooO.f116667OooO00o;
            case 3:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 4:
                list3 = (List) this.f95359OooOoO0;
                List list12 = (List) this.f95356OooOo;
                Folder folder9 = (Folder) this.f95357OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                folder2 = folder9;
                list2 = list12;
                objOooO0o2 = obj;
                InterfaceC27314OooOooO interfaceC27314OooOooO = c27600o0ooOO02.f96986OooO0o;
                List list13 = (List) objOooO0o2;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list13, 10));
                Iterator it4 = list13.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((NotePlaceHolder) it4.next()).getId());
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                this.f95357OooOo0o = folder2;
                this.f95356OooOo = list2;
                this.f95359OooOoO0 = list3;
                this.f95358OooOoO = 5;
                if (interfaceC27314OooOooO.OooO0o(strArr2, this) != enumC32485OooO00o) {
                    list4 = list3;
                    list5 = list2;
                    folder3 = folder2;
                    if (!z) {
                        folder3.setParentId(null);
                        folder3.setSortKey(null);
                        list8 = list4;
                        it2 = list5.iterator();
                        c27600o0ooOO0 = c27600o0ooOO02;
                        while (it2.hasNext()) {
                            Folder folder10 = (Folder) it2.next();
                            this.f95357OooOo0o = list8;
                            this.f95356OooOo = c27600o0ooOO0;
                            this.f95359OooOoO0 = it2;
                            this.f95358OooOoO = 8;
                            if (c27600o0ooOO0.f96982OooO00o.OooOO0(new Folder[]{folder10}, this) == enumC32485OooO00o) {
                            }
                        }
                        it3 = list8.iterator();
                        while (it3.hasNext()) {
                            NoteMeta noteMeta2 = (NoteMeta) it3.next();
                            this.f95357OooOo0o = c27600o0ooOO02;
                            this.f95356OooOo = it3;
                            this.f95359OooOoO0 = null;
                            this.f95358OooOoO = 9;
                            if (c27600o0ooOO02.f96983OooO0O0.OooOo0O(new NoteMeta[]{noteMeta2}, this) == enumC32485OooO00o) {
                            }
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    String parentId = folder3.getParentId();
                    if (parentId != null) {
                        C28009OooOOOO c28009OooOOOO = c27600o0ooOO02.f96982OooO00o;
                        this.f95357OooOo0o = folder3;
                        this.f95356OooOo = list5;
                        this.f95359OooOoO0 = list4;
                        this.f95358OooOoO = 6;
                        objOooO0Oo = c28009OooOOOO.OooO0Oo(parentId);
                    } else {
                        List list14 = list5;
                        list6 = list4;
                        folder4 = folder3;
                        list7 = list14;
                        C26417OooOoO c26417OooOoO = c27600o0ooOO02.f96987OooO0o0;
                        String parentId2 = folder4.getParentId();
                        this.f95357OooOo0o = list7;
                        this.f95356OooOo = list6;
                        this.f95359OooOoO0 = folder4;
                        this.f95358OooOoO = 7;
                        objOooO00o = c26417OooOoO.OooO00o(parentId2, this);
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 5:
                list4 = (List) this.f95359OooOoO0;
                list5 = (List) this.f95356OooOo;
                folder3 = (Folder) this.f95357OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (!z) {
                }
                break;
            case 6:
                list4 = (List) this.f95359OooOoO0;
                list5 = (List) this.f95356OooOo;
                folder3 = (Folder) this.f95357OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo = obj;
                Folder folder11 = (Folder) objOooO0Oo;
                if (folder11 == null || folder11.getInTrashBin()) {
                    folder3.setParentId(null);
                }
                List list142 = list5;
                list6 = list4;
                folder4 = folder3;
                list7 = list142;
                C26417OooOoO c26417OooOoO2 = c27600o0ooOO02.f96987OooO0o0;
                String parentId22 = folder4.getParentId();
                this.f95357OooOo0o = list7;
                this.f95356OooOo = list6;
                this.f95359OooOoO0 = folder4;
                this.f95358OooOoO = 7;
                objOooO00o = c26417OooOoO2.OooO00o(parentId22, this);
                break;
            case 7:
                folder4 = (Folder) this.f95359OooOoO0;
                list6 = (List) this.f95356OooOo;
                list7 = (List) this.f95357OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO00o = obj;
                folder4.setSortKey((Integer) objOooO00o);
                list4 = list6;
                list5 = list7;
                list8 = list4;
                it2 = list5.iterator();
                c27600o0ooOO0 = c27600o0ooOO02;
                while (it2.hasNext()) {
                }
                it3 = list8.iterator();
                while (it3.hasNext()) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 8:
                it2 = (Iterator) this.f95359OooOoO0;
                c27600o0ooOO0 = (C27600o0ooOO0) this.f95356OooOo;
                list8 = (List) this.f95357OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                while (it2.hasNext()) {
                }
                it3 = list8.iterator();
                while (it3.hasNext()) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 9:
                it3 = (Iterator) this.f95356OooOo;
                C27600o0ooOO0 c27600o0ooOO03 = (C27600o0ooOO0) this.f95357OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27600o0ooOO02 = c27600o0ooOO03;
                while (it3.hasNext()) {
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
