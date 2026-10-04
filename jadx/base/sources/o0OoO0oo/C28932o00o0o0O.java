package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00o0o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$removeStrokesByIdList$1", m80623f = "NoteEditorViewModel.kt", m80624l = {1502}, m80625m = "invokeSuspend")
public final class C28932o00o0o0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102505OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102506OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f102507OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28932o00o0o0O(C23344OooOOo c23344OooOOo, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f102505OooOo = c23344OooOOo;
        this.f102507OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28932o00o0o0O(this.f102505OooOo, this.f102507OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28932o00o0o0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102506OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23344OooOOo c23344OooOOo = this.f102505OooOo;
            InterfaceC27323Oooo0oO interfaceC27323Oooo0oO = c23344OooOOo.f73555OooOOOO;
            String str = (String) c23344OooOOo.f73589OoooOOo.getValue();
            this.f102506OooOo0o = 1;
            if (interfaceC27323Oooo0oO.OooO0O0(this.f102507OooOoO0, str, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
