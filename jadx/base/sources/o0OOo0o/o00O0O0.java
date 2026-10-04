package o0OOo0o;

import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
import com.orion.notein.domain.models.page.INoteinDisplayItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26515OooooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getDualLinkRefsByPageId$2", m80623f = "NoteUseCase.kt", m80624l = {586, 592, 592, 596, 596}, m80625m = "invokeSuspend")
public final class o00O0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends DualLinkRef>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f95962OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27449o00O0OoO f95963OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f95964OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f95965OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public INoteinDisplayItem f95966OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f95967OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public DualLinkRef f95968OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95969OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f95970OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ String f95971Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f95969OooOooO = c27449o00O0OoO;
        this.f95970OooOooo = str;
        this.f95971Oooo000 = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O0O0(this.f95970OooOooo, this.f95971Oooo000, continuation, this.f95969OooOooO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends DualLinkRef>> continuation) {
        return ((o00O0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        if (r2 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0103, code lost:
    
        if (r2 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0103 -> B:34:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0141 -> B:62:0x01a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x018d -> B:56:0x018e). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOO0O;
        Collection arrayList;
        Iterator it;
        C27449o00O0OoO c27449o00O0OoO;
        C27449o00O0OoO c27449o00O0OoO2;
        Collection collection;
        Iterator it2;
        Object obj2;
        Object next;
        boolean z;
        Object objOooO0oo;
        DualLinkRef dualLinkRef;
        Collection arrayList2;
        Iterator it3;
        C27449o00O0OoO c27449o00O0OoO3;
        Object objOooO0oo2;
        Iterator it4;
        Collection collection2;
        DualLinkRef dualLinkRef2;
        DualLinkSource dualLinkSource;
        DualLinkRef dualLinkRef3;
        boolean z2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95967OooOoo;
        C27449o00O0OoO c27449o00O0OoO4 = this.f95969OooOooO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26515OooooO0 c26515OooooO0 = c27449o00O0OoO4.f96052OooOOoo;
            this.f95967OooOoo = 1;
            objOooOO0O = c26515OooooO0.OooOO0O(this.f95970OooOooo, this.f95971Oooo000, this);
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooOO0O = obj;
        } else if (i == 2) {
            dualLinkRef = (DualLinkRef) this.f95966OooOoOO;
            obj2 = this.f95964OooOoO;
            it2 = this.f95965OooOoO0;
            collection = this.f95962OooOo;
            c27449o00O0OoO2 = this.f95963OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0oo = obj;
            if (((Boolean) objOooO0oo).booleanValue()) {
            }
            it = it2;
            c27449o00O0OoO = c27449o00O0OoO2;
            Collection collection3 = collection;
            next = obj2;
            arrayList = collection3;
            z = false;
            if (z) {
            }
            if (it.hasNext()) {
            }
        } else if (i == 3) {
            Object obj3 = this.f95964OooOoO;
            Iterator it5 = this.f95965OooOoO0;
            Collection collection4 = this.f95962OooOo;
            C27449o00O0OoO c27449o00O0OoO5 = this.f95963OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c27449o00O0OoO2 = c27449o00O0OoO5;
            collection = collection4;
            it2 = it5;
            obj2 = obj3;
            Object objOooO = obj;
            if (((Boolean) objOooO).booleanValue()) {
                Collection collection5 = collection;
                next = obj2;
                arrayList = collection5;
                z = true;
                it = it2;
                c27449o00O0OoO = c27449o00O0OoO2;
            } else {
                it = it2;
                c27449o00O0OoO = c27449o00O0OoO2;
                Collection collection32 = collection;
                next = obj2;
                arrayList = collection32;
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
            if (it.hasNext()) {
                next = it.next();
                DualLinkRef dualLinkRef4 = (DualLinkRef) next;
                if (dualLinkRef4.getSource() != null) {
                    String noteId = dualLinkRef4.getNoteId();
                    this.f95963OooOo0o = c27449o00O0OoO;
                    this.f95962OooOo = arrayList;
                    this.f95965OooOoO0 = it;
                    this.f95964OooOoO = next;
                    this.f95966OooOoOO = dualLinkRef4;
                    this.f95967OooOoo = 2;
                    objOooO0oo = c27449o00O0OoO.OooO0oo(noteId, this);
                    if (objOooO0oo != enumC32485OooO00o) {
                        C27449o00O0OoO c27449o00O0OoO6 = c27449o00O0OoO;
                        it2 = it;
                        dualLinkRef = dualLinkRef4;
                        c27449o00O0OoO2 = c27449o00O0OoO6;
                        collection = arrayList;
                        obj2 = next;
                        if (((Boolean) objOooO0oo).booleanValue()) {
                            String pageId = dualLinkRef.getPageId();
                            String noteId2 = dualLinkRef.getNoteId();
                            this.f95963OooOo0o = c27449o00O0OoO2;
                            this.f95962OooOo = collection;
                            this.f95965OooOoO0 = it2;
                            this.f95964OooOoO = obj2;
                            this.f95966OooOoOO = null;
                            this.f95967OooOoo = 3;
                            objOooO = c27449o00O0OoO2.OooO(pageId, noteId2, this);
                        }
                        it = it2;
                        c27449o00O0OoO = c27449o00O0OoO2;
                        Collection collection322 = collection;
                        next = obj2;
                        arrayList = collection322;
                        z = false;
                        if (z) {
                        }
                        if (it.hasNext()) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                z = false;
                if (z) {
                }
                if (it.hasNext()) {
                    arrayList2 = new ArrayList();
                    it3 = ((List) arrayList).iterator();
                    if (!it3.hasNext()) {
                    }
                }
            }
        } else if (i == 4) {
            dualLinkRef3 = this.f95968OooOoo0;
            dualLinkSource = (DualLinkSource) this.f95966OooOoOO;
            dualLinkRef2 = (DualLinkRef) this.f95964OooOoO;
            it4 = this.f95965OooOoO0;
            Collection collection6 = this.f95962OooOo;
            c27449o00O0OoO3 = this.f95963OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            collection2 = collection6;
            objOooO0oo2 = obj;
            if (((Boolean) objOooO0oo2).booleanValue()) {
            }
        } else {
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dualLinkRef3 = (DualLinkRef) this.f95966OooOoOO;
            DualLinkRef dualLinkRef5 = (DualLinkRef) this.f95964OooOoO;
            Iterator it6 = this.f95965OooOoO0;
            Collection collection7 = this.f95962OooOo;
            C27449o00O0OoO c27449o00O0OoO7 = this.f95963OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            collection2 = collection7;
            it4 = it6;
            dualLinkRef2 = dualLinkRef5;
            Object objOooO2 = obj;
            if (((Boolean) objOooO2).booleanValue()) {
                c27449o00O0OoO7 = c27449o00O0OoO7;
                z2 = false;
            } else {
                z2 = true;
            }
            dualLinkRef3.setValidation(z2);
            arrayList2 = collection2;
            it3 = it4;
            c27449o00O0OoO4 = c27449o00O0OoO7;
            if (dualLinkRef2 != null) {
                arrayList2.add(dualLinkRef2);
            }
            if (!it3.hasNext()) {
                return (List) arrayList2;
            }
            dualLinkRef2 = (DualLinkRef) it3.next();
            DualLinkSource source = dualLinkRef2.getSource();
            if (source != null) {
                String noteId3 = source.getNoteId();
                this.f95963OooOo0o = c27449o00O0OoO4;
                this.f95962OooOo = arrayList2;
                this.f95965OooOoO0 = it3;
                this.f95964OooOoO = dualLinkRef2;
                this.f95966OooOoOO = source;
                this.f95968OooOoo0 = dualLinkRef2;
                this.f95967OooOoo = 4;
                objOooO0oo2 = c27449o00O0OoO4.OooO0oo(noteId3, this);
                if (objOooO0oo2 != enumC32485OooO00o) {
                    c27449o00O0OoO3 = c27449o00O0OoO4;
                    it4 = it3;
                    dualLinkSource = source;
                    collection2 = arrayList2;
                    dualLinkRef3 = dualLinkRef2;
                    if (((Boolean) objOooO0oo2).booleanValue()) {
                        c27449o00O0OoO7 = c27449o00O0OoO3;
                        z2 = false;
                        dualLinkRef3.setValidation(z2);
                        arrayList2 = collection2;
                        it3 = it4;
                        c27449o00O0OoO4 = c27449o00O0OoO7;
                        if (dualLinkRef2 != null) {
                        }
                        if (!it3.hasNext()) {
                        }
                    } else {
                        String pageId2 = dualLinkSource.getPageId();
                        String noteId4 = dualLinkSource.getNoteId();
                        this.f95963OooOo0o = c27449o00O0OoO3;
                        this.f95962OooOo = collection2;
                        this.f95965OooOoO0 = it4;
                        this.f95964OooOoO = dualLinkRef2;
                        this.f95966OooOoOO = dualLinkRef3;
                        this.f95968OooOoo0 = null;
                        this.f95967OooOoo = 5;
                        objOooO2 = c27449o00O0OoO3.OooO(pageId2, noteId4, this);
                        if (objOooO2 != enumC32485OooO00o) {
                            c27449o00O0OoO7 = c27449o00O0OoO3;
                            if (((Boolean) objOooO2).booleanValue()) {
                            }
                            dualLinkRef3.setValidation(z2);
                            arrayList2 = collection2;
                            it3 = it4;
                            c27449o00O0OoO4 = c27449o00O0OoO7;
                            if (dualLinkRef2 != null) {
                            }
                            if (!it3.hasNext()) {
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            }
            dualLinkRef2 = null;
            if (dualLinkRef2 != null) {
            }
            if (!it3.hasNext()) {
            }
        }
        arrayList = new ArrayList();
        it = ((Iterable) objOooOO0O).iterator();
        c27449o00O0OoO = c27449o00O0OoO4;
        if (it.hasNext()) {
        }
    }
}
