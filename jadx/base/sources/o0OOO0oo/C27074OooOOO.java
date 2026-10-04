package o0OOO0oo;

import com.orion.notein.domain.models.sticker.Sticker;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOO0oo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.sticker.StickerRepoImpl$getStickersByIds$2", m80623f = "StickerRepoImpl.kt", m80624l = {49}, m80625m = "invokeSuspend")
public final class C27074OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Sticker>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27076OooOOOO f94250OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94251OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f94252OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f94253OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27074OooOOO(C27076OooOOOO c27076OooOOOO, List<String> list, String str, Continuation<? super C27074OooOOO> continuation) {
        super(2, continuation);
        this.f94250OooOo = c27076OooOOOO;
        this.f94253OooOoO0 = list;
        this.f94252OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27074OooOOO(this.f94250OooOo, this.f94253OooOoO0, this.f94252OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Sticker>> continuation) {
        return ((C27074OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94251OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27073OooOO0o c27073OooOO0o = this.f94250OooOo.f94258OooO00o;
        this.f94251OooOo0o = 1;
        Serializable serializableOooO0o = c27073OooOO0o.OooO0o(this.f94252OooOoO, this.f94253OooOoO0, this);
        return serializableOooO0o == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0o;
    }
}
