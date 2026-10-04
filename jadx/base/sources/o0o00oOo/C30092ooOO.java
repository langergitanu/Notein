package o0o00oOo;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27600o0ooOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oOo.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$setCurrentFolder$2", m80623f = "NoteListViewModel.kt", m80624l = {883, 892}, m80625m = "invokeSuspend")
public final class C30092ooOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public com.orion.notein.p607ui.notelist.OooO0OO f107154OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteVO f107155OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f107156OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f107157OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f107158OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30092ooOO(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, String str, Continuation continuation) {
        super(2, continuation);
        this.f107156OooOoO = str;
        this.f107158OooOoOO = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30092ooOO(this.f107158OooOoOO, this.f107156OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30092ooOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Folder folder;
        NoteVO noteVOOooO0o0;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO;
        NoteVO noteVOOooO0o02;
        String name;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107157OooOoO0;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO2 = this.f107158OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "NoteListViewModel", "setCurrentFolder: ");
            String str = this.f107156OooOoO;
            sbOooO0O0.append(str);
            c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
            if (str == null) {
                folder = null;
                if (folder != null || folder.getInTrashBin()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("NoteListViewModel");
                    c20358OooO00o2.OooO00o("setCurrentFolder: setting to desktop", new Object[0]);
                    C33781o00o0O c33781o00o0O = oooO0OO2.f77148Oooo;
                    C32443OooOOO c32443OooOOO = new C32443OooOOO(null, null);
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, c32443OooOOO);
                    return C32460OooOooO.f116667OooO00o;
                }
                noteVOOooO0o0 = com.orion.notein.p607ui.notelist.OooO0OO.OooO0o0(oooO0OO2, folder);
                String parentId = folder.getParentId();
                if (parentId != null) {
                    this.f107155OooOo0o = noteVOOooO0o0;
                    this.f107154OooOo = oooO0OO2;
                    this.f107157OooOoO0 = 2;
                    obj = oooO0OO2.f77124OooO0oO.OooO0Oo(parentId, this);
                    if (obj != enumC32485OooO00o) {
                        oooO0OO = oooO0OO2;
                        Folder folder2 = (Folder) obj;
                        if (folder2 == null) {
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("NoteListViewModel");
                        String name2 = noteVOOooO0o0.getName();
                        if (noteVOOooO0o02 == null) {
                            name = "Desktop";
                        }
                        c20358OooO00o3.OooO00o(C22237OooO0o0.OooO00o("setCurrentFolder: ", name2, ", parent: ", name), new Object[0]);
                        C33781o00o0O c33781o00o0O2 = oooO0OO2.f77148Oooo;
                        C32443OooOOO c32443OooOOO2 = new C32443OooOOO(noteVOOooO0o0, noteVOOooO0o02);
                        c33781o00o0O2.getClass();
                        c33781o00o0O2.OooOO0(null, c32443OooOOO2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    return enumC32485OooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("NoteListViewModel");
                String name22 = noteVOOooO0o0.getName();
                if (noteVOOooO0o02 == null) {
                }
                c20358OooO00o32.OooO00o(C22237OooO0o0.OooO00o("setCurrentFolder: ", name22, ", parent: ", name), new Object[0]);
                C33781o00o0O c33781o00o0O22 = oooO0OO2.f77148Oooo;
                C32443OooOOO c32443OooOOO22 = new C32443OooOOO(noteVOOooO0o0, noteVOOooO0o02);
                c33781o00o0O22.getClass();
                c33781o00o0O22.OooOO0(null, c32443OooOOO22);
                return C32460OooOooO.f116667OooO00o;
            }
            C27600o0ooOO0 c27600o0ooOO0 = oooO0OO2.f77124OooO0oO;
            this.f107157OooOoO0 = 1;
            obj = c27600o0ooOO0.OooO0Oo(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO0OO = this.f107154OooOo;
                noteVOOooO0o0 = this.f107155OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Folder folder22 = (Folder) obj;
                noteVOOooO0o02 = folder22 == null ? com.orion.notein.p607ui.notelist.OooO0OO.OooO0o0(oooO0OO, folder22) : null;
                C34406OooO00o.C20358OooO00o c20358OooO00o322 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o322.OooOOO0("NoteListViewModel");
                String name222 = noteVOOooO0o0.getName();
                if (noteVOOooO0o02 == null || (name = noteVOOooO0o02.getName()) == null) {
                    name = "Desktop";
                }
                c20358OooO00o322.OooO00o(C22237OooO0o0.OooO00o("setCurrentFolder: ", name222, ", parent: ", name), new Object[0]);
                C33781o00o0O c33781o00o0O222 = oooO0OO2.f77148Oooo;
                C32443OooOOO c32443OooOOO222 = new C32443OooOOO(noteVOOooO0o0, noteVOOooO0o02);
                c33781o00o0O222.getClass();
                c33781o00o0O222.OooOO0(null, c32443OooOOO222);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        folder = (Folder) obj;
        if (folder != null) {
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o22.OooOOO0("NoteListViewModel");
        c20358OooO00o22.OooO00o("setCurrentFolder: setting to desktop", new Object[0]);
        C33781o00o0O c33781o00o0O3 = oooO0OO2.f77148Oooo;
        C32443OooOOO c32443OooOOO3 = new C32443OooOOO(null, null);
        c33781o00o0O3.getClass();
        c33781o00o0O3.OooOO0(null, c32443OooOOO3);
        return C32460OooOooO.f116667OooO00o;
    }
}
