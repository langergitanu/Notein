package o0OoO0oo;

import com.orion.notein.domain.models.page.Image;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26596o00O0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoO0oo.o00o0o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$resetImagesLayerId$1", m80623f = "NoteEditorViewModel.kt", m80624l = {1755, 1763}, m80625m = "invokeSuspend")
public final class C28933o00o0o0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102508OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102509OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f102510OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28933o00o0o0o(C23344OooOOo c23344OooOOo, String str, Continuation<? super C28933o00o0o0o> continuation) {
        super(2, continuation);
        this.f102508OooOo = c23344OooOOo;
        this.f102510OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28933o00o0o0o(this.f102508OooOo, this.f102510OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28933o00o0o0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
    
        if (r3.OooOOoo(r4, r6, r22) == r1) goto L36;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102509OooOo0o;
        C23344OooOOo c23344OooOOo = this.f102508OooOo;
        String str = this.f102510OooOoO0;
        C26596o00O0o0 c26596o00O0o0 = c23344OooOOo.f73554OooOOO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f102509OooOo0o = 1;
            objOooOO0o = c26596o00O0o0.OooOO0o(str, this);
            if (objOooOO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOO0o = obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objOooOO0o) {
            if (!"link_ref".equals(((Image) obj2).getPageId())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if ("none".equals(((Image) obj3).layerId)) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorViewModel");
            c20358OooO00o.OooO0o0("resetImagesLayerId, images size:" + arrayList2.size() + ", " + arrayList2, new Object[0]);
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Image.copy$default((Image) it.next(), null, null, null, "default", null, 0.0f, 0L, 0L, false, 503, null));
            }
            this.f102509OooOo0o = 2;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
