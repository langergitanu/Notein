package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.sticker.StickerCollection;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00o0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$getStickerCollectionName$2", m80623f = "StickerUseCase.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2}, m80625m = "invokeSuspend")
public final class C27528o00o0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96494OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96495OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96496OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27528o00o0OO(C27538o00o0o0O c27538o00o0o0O, String str, Continuation<? super C27528o00o0OO> continuation) {
        super(2, continuation);
        this.f96494OooOo = c27538o00o0o0O;
        this.f96496OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27528o00o0OO(this.f96494OooOo, this.f96496OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27528o00o0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String strOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96495OooOo0o;
        C27538o00o0o0O c27538o00o0o0O = this.f96494OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27321Oooo0o interfaceC27321Oooo0o = c27538o00o0o0O.f96550OooO00o;
            String strOooO0Oo = c27538o00o0o0O.f96551OooO0O0.OooO0Oo();
            this.f96495OooOo0o = 1;
            obj = interfaceC27321Oooo0o.OooO(this.f96496OooOoO0, strOooO0Oo, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        StickerCollection stickerCollection = (StickerCollection) obj;
        return (stickerCollection == null || (strOooO0o = c27538o00o0o0O.OooO0o(stickerCollection)) == null) ? "" : strOooO0o;
    }
}
