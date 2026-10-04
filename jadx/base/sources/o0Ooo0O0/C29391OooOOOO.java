package o0Ooo0O0;

import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import kotlin.coroutines.Continuation;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0O0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$scheduleUpdateLayerTn$1$1", m80623f = "PageLayerEditor.kt", m80624l = {232}, m80625m = "invokeSuspend")
public final class C29391OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PageLayerEditor f104221OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104222OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30837OooO00o f104223OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f104224OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29391OooOOOO(PageLayerEditor pageLayerEditor, int i, C30837OooO00o c30837OooO00o, Continuation<? super C29391OooOOOO> continuation) {
        super(2, continuation);
        this.f104221OooOo = pageLayerEditor;
        this.f104224OooOoO0 = i;
        this.f104223OooOoO = c30837OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29391OooOOOO(this.f104221OooOo, this.f104224OooOoO0, this.f104223OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29391OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104222OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f104222OooOo0o = 1;
            if (PageLayerEditor.OooO00o(this.f104221OooOo, this.f104224OooOoO0, this.f104223OooOoO) == enumC32485OooO00o) {
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
