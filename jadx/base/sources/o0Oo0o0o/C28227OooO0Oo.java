package o0Oo0o0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.export.AddWaterMarkFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0o0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.AddWaterMarkFragment$navigatePayFragment$1", m80623f = "AddWaterMarkFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1}, m80625m = "invokeSuspend")
public final class C28227OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AddWaterMarkFragment f100061OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100062OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28227OooO0Oo(AddWaterMarkFragment addWaterMarkFragment, Continuation<? super C28227OooO0Oo> continuation) {
        super(2, continuation);
        this.f100061OooOo = addWaterMarkFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28227OooO0Oo(this.f100061OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28227OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100062OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f100062OooOo0o = 1;
            if (AddWaterMarkFragment.OooOoo0(this.f100061OooOo, 15, this) == enumC32485OooO00o) {
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
