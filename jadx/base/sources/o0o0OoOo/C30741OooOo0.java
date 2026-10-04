package o0o0OoOo;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.PageLayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0OoOo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$recoverLayer$2", m80623f = "DebugViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_1, StyleIdentifier.LIST_TABLE_2_ACCENT_2, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
public final class C30741OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f109942OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f109943OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f109944OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109945OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30741OooOo0(C30722OooO00o c30722OooO00o, String str, Continuation<? super C30741OooOo0> continuation) {
        super(2, continuation);
        this.f109945OooOoO0 = c30722OooO00o;
        this.f109944OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30741OooOo0(this.f109945OooOoO0, this.f109944OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30741OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
    
        if (r10.f109867OooOOO.OooO0O0(r1, r4, r15, r14) == r0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<String> pageLayerIds;
        List list;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109942OooOo;
        String str = this.f109944OooOoO;
        C30722OooO00o c30722OooO00o = this.f109945OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f109942OooOo = 1;
            obj = c30722OooO00o.f109866OooOO0o.OooOoO0(str, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return Boolean.TRUE;
            }
            pageLayerIds = this.f109943OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list = (List) obj;
            if (!list.isEmpty()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("DebugViewModel");
                c20358OooO00o.OooO0OO("pageLayerIdsOfDisplayItems is empty", new Object[0]);
                return Boolean.FALSE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!pageLayerIds.contains((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("DebugViewModel");
                c20358OooO00o2.OooO0OO("toRecoverLayerId is empty", new Object[0]);
                return Boolean.FALSE;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("DebugViewModel");
            c20358OooO00o3.OooO0o0("toRecoverLayerId: " + arrayList, new Object[0]);
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new PageLayer((String) it.next(), str, true, null, null, 16, null));
            }
            int size = pageLayerIds.size();
            this.f109943OooOo0o = null;
            this.f109942OooOo = 3;
        }
        NoteContent noteContent = (NoteContent) obj;
        pageLayerIds = noteContent != null ? noteContent.getPageLayerIds() : null;
        if (pageLayerIds == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("DebugViewModel");
            c20358OooO00o4.OooO0OO("pageLayerIds is null", new Object[0]);
            return Boolean.FALSE;
        }
        this.f109943OooOo0o = pageLayerIds;
        this.f109942OooOo = 2;
        obj = c30722OooO00o.f109868OooOOO0.OooO0Oo(str, this);
        if (obj != enumC32485OooO00o) {
            list = (List) obj;
            if (!list.isEmpty()) {
            }
        }
        return enumC32485OooO00o;
    }
}
