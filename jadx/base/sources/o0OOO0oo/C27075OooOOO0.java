package o0OOO0oo;

import com.orion.notein.domain.models.sticker.Sticker;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOO0oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.sticker.StickerRepoImpl$getStickerById$2", m80623f = "StickerRepoImpl.kt", m80624l = {43}, m80625m = "invokeSuspend")
public final class C27075OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Sticker>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27076OooOOOO f94254OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94255OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f94256OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94257OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27075OooOOO0(C27076OooOOOO c27076OooOOOO, String str, String str2, Continuation<? super C27075OooOOO0> continuation) {
        super(2, continuation);
        this.f94254OooOo = c27076OooOOOO;
        this.f94257OooOoO0 = str;
        this.f94256OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27075OooOOO0(this.f94254OooOo, this.f94257OooOoO0, this.f94256OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Sticker> continuation) {
        return ((C27075OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94255OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27073OooOO0o c27073OooOO0o = this.f94254OooOo.f94258OooO00o;
        this.f94255OooOo0o = 1;
        Object objOooO0OO = c27073OooOO0o.OooO0OO(this.f94257OooOoO0, this.f94256OooOoO, this);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
