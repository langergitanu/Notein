package io.ktor.utils.p616io;

import kotlin.coroutines.Continuation;
import oO00Oo0.AbstractC32268OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: io.ktor.utils.io.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteChannelSequentialBase$readUTF8LineTo$2", m80623f = "ByteChannelSequential.kt", m80624l = {721}, m80625m = "invokeSuspend")
public final class C23975OoooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super AbstractC32268OooO0oO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int f80723OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80724OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC23985Ooooo00 f80725OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23975OoooO(AbstractC23985Ooooo00 abstractC23985Ooooo00, Continuation<? super C23975OoooO> continuation) {
        super(2, continuation);
        this.f80725OooOoO0 = abstractC23985Ooooo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C23975OoooO c23975OoooO = new C23975OoooO(this.f80725OooOoO0, continuation);
        c23975OoooO.f80723OooOo = ((Number) obj).intValue();
        return c23975OoooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Integer num, Continuation<? super AbstractC32268OooO0oO> continuation) {
        return ((C23975OoooO) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80724OooOo0o;
        AbstractC23985Ooooo00 abstractC23985Ooooo00 = this.f80725OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            int i2 = this.f80723OooOo;
            this.f80724OooOo0o = 1;
            obj = abstractC23985Ooooo00.OooOo00(i2, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            abstractC23985Ooooo00.getClass();
        }
        return null;
    }
}
