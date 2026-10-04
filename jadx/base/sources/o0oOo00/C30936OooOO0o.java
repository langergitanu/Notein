package o0oOo00;

import com.orion.notein.domain.models.sticker.Sticker;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOO0oo.C27072OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0oOo00.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditViewModel$special$$inlined$flatMapLatest$1", m80623f = "StickerCollectionEditViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C30936OooOO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends Sticker>>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f110543OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110544OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30938OooOOo f110545OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f110546OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30936OooOO0o(Continuation continuation, C30938OooOOo c30938OooOOo) {
        super(3, continuation);
        this.f110545OooOoO = c30938OooOOo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends Sticker>> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C30936OooOO0o c30936OooOO0o = new C30936OooOO0o(continuation, this.f110545OooOoO);
        c30936OooOO0o.f110543OooOo = interfaceC33723OooO0oO;
        c30936OooOO0o.f110546OooOoO0 = str;
        return c30936OooOO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110544OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f110543OooOo;
            C27072OooOO0O c27072OooOO0OOooO00o = this.f110545OooOoO.f110575OooO0o0.OooO00o((String) this.f110546OooOoO0);
            this.f110544OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c27072OooOO0OOooO00o, this) == enumC32485OooO00o) {
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
