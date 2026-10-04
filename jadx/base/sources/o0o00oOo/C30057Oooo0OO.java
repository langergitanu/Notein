package o0o00oOo;

import com.aspose.slides.C22201OooO0oO;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oOo.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$clearSavedDesktopScrollPositionDelayed$1", m80623f = "NoteListViewModel.kt", m80624l = {233}, m80625m = "invokeSuspend")
public final class C30057Oooo0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106920OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f106921OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f106922OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30057Oooo0OO(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, String str, Continuation<? super C30057Oooo0OO> continuation) {
        super(2, continuation);
        this.f106920OooOo = oooO0OO;
        this.f106922OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30057Oooo0OO(this.f106920OooOo, this.f106922OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30057Oooo0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106921OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f106921OooOo0o = 1;
            if (C33644OoooO0.OooO00o(500L, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        LinkedHashMap linkedHashMap = this.f106920OooOo.f77143OooOoOO;
        String str = this.f106922OooOoO0;
        linkedHashMap.remove(str);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO00o(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteListViewModel", "ScrollPos: cleared ", str, " after delay"), new Object[0]);
        return C32460OooOooO.f116667OooO00o;
    }
}
