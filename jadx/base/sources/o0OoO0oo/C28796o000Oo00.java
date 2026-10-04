package o0OoO0oo;

import com.orion.notein.domain.models.note.Outline;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOoo0o.C27869OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o000Oo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$deleteOutlines$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {896, 898, 901, 907}, m80625m = "invokeSuspend")
public final class C28796o000Oo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Outline f101966OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f101967OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f101968OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f101969OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f101970OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f101971OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28796o000Oo00(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f101968OooOoO = oooO0OO;
        this.f101970OooOoOO = str;
        this.f101971OooOoo0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28796o000Oo00(this.f101968OooOoO, this.f101970OooOoOO, this.f101971OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28796o000Oo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r6 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
    
        if (r4.OooO0o0(r5, r2, r23) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strOooOO0O;
        Outline outline;
        Object objOooO0O0;
        C27869OooOOO c27869OooOOO;
        String str;
        Outline outline2;
        String parentId;
        Object objOooO0O02;
        Outline outline3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101969OooOoO0;
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f101968OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            strOooOO0O = oooO0OO.OooOO0O();
            String str2 = this.f101970OooOoOO;
            if (str2 == null) {
                outline = null;
                c27869OooOOO = oooO0OO.f73357OooOO0o;
                this.f101967OooOo0o = strOooOO0O;
                this.f101966OooOo = outline;
                this.f101969OooOoO0 = 2;
                if (c27869OooOOO.OooO00o(strOooOO0O, this.f101971OooOoo0, this) != enumC32485OooO00o) {
                    str = strOooOO0O;
                    outline2 = outline;
                    if (outline2 == null) {
                    }
                    if (parentId != null) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            }
            this.f101967OooOo0o = strOooOO0O;
            this.f101969OooOoO0 = 1;
            objOooO0O0 = oooO0OO.f73357OooOO0o.OooO0O0(str2, strOooOO0O, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    outline2 = this.f101966OooOo;
                    str = this.f101967OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    parentId = outline2 == null ? outline2.getParentId() : null;
                    if (parentId != null) {
                        C27869OooOOO c27869OooOOO2 = oooO0OO.f73357OooOO0o;
                        this.f101967OooOo0o = str;
                        this.f101966OooOo = outline2;
                        this.f101969OooOoO0 = 3;
                        objOooO0O02 = c27869OooOOO2.OooO0O0(parentId, str, this);
                        if (objOooO0O02 != enumC32485OooO00o) {
                            outline3 = (Outline) objOooO0O02;
                            if (outline3 != null) {
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                outline2 = this.f101966OooOo;
                String str3 = this.f101967OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str = str3;
                objOooO0O02 = obj;
                outline3 = (Outline) objOooO0O02;
                if (outline3 != null) {
                    List<String> children = outline3.getChildren();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : children) {
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0((String) obj2, outline2.getId())) {
                            arrayList.add(obj2);
                        }
                    }
                    Outline outlineCopy$default = Outline.copy$default(outline3, null, null, null, null, null, null, arrayList, 0L, 0L, 447, null);
                    C27869OooOOO c27869OooOOO3 = oooO0OO.f73357OooOO0o;
                    List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(outlineCopy$default);
                    this.f101967OooOo0o = null;
                    this.f101966OooOo = null;
                    this.f101969OooOoO0 = 4;
                }
                return C32460OooOooO.f116667OooO00o;
            }
            strOooOO0O = this.f101967OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0O0 = obj;
        }
        outline = (Outline) objOooO0O0;
        c27869OooOOO = oooO0OO.f73357OooOO0o;
        this.f101967OooOo0o = strOooOO0O;
        this.f101966OooOo = outline;
        this.f101969OooOoO0 = 2;
        if (c27869OooOOO.OooO00o(strOooOO0O, this.f101971OooOoo0, this) != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
    }
}
