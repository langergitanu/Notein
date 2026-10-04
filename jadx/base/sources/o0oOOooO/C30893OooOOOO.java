package o0oOOooO;

import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOO0oo.C27067OooO0o;
import o0OOo0o.C27525o00o0O0;
import o0OOo0o.C27538o00o0o0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0oOOooO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$special$$inlined$flatMapLatest$1", m80623f = "StickerViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C30893OooOOOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends StickerCollection>>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f110398OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110399OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30898OooOo00 f110400OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f110401OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30893OooOOOO(Continuation continuation, C30898OooOo00 c30898OooOo00) {
        super(3, continuation);
        this.f110400OooOoO = c30898OooOo00;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends StickerCollection>> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C30893OooOOOO c30893OooOOOO = new C30893OooOOOO(continuation, this.f110400OooOoO);
        c30893OooOOOO.f110398OooOo = interfaceC33723OooO0oO;
        c30893OooOOOO.f110401OooOoO0 = str;
        return c30893OooOOOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110399OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f110398OooOo;
            String userId = (String) this.f110401OooOoO0;
            C27538o00o0o0O c27538o00o0o0O = this.f110400OooOoO.f110434OooO0o;
            c27538o00o0o0O.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
            C27067OooO0o c27067OooO0oOooO0oO = c27538o00o0o0O.f96550OooO00o.OooO0oO(userId);
            this.f110399OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objCollect = c27067OooO0oOooO0oO.collect(new C27525o00o0O0(interfaceC33723OooO0oO), this);
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == enumC32485OooO00o) {
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
