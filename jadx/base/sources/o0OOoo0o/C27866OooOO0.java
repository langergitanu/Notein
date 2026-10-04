package o0OOoo0o;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOoo0o.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.outline.OutlineUseCase$updateNoteLastModificationTime$2", m80623f = "OutlineUseCase.kt", m80624l = {StyleIdentifier.COLORFUL_LIST_ACCENT_6, StyleIdentifier.INTENSE_EMPHASIS}, m80625m = "invokeSuspend")
public final class C27866OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27869OooOOO f98472OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98473OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98474OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27866OooOO0(C27869OooOOO c27869OooOOO, String str, Continuation<? super C27866OooOO0> continuation) {
        super(2, continuation);
        this.f98472OooOo = c27869OooOOO;
        this.f98474OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27866OooOO0(this.f98472OooOo, this.f98474OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27866OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r5.f98488OooO0O0.OooOOO(r2, r7, r6) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98473OooOo0o;
        String str = this.f98474OooOoO0;
        C27869OooOOO c27869OooOOO = this.f98472OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27869OooOOO.f98489OooO0OO;
            this.f98473OooOo0o = 1;
            if (interfaceC27309OooOoO.OooO0o(str, this) != enumC32485OooO00o) {
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
        String strOooO0Oo = c27869OooOOO.f98490OooO0Oo.OooO0Oo();
        this.f98473OooOo0o = 2;
    }
}
