package o0OO00o0;

import com.orion.notein.data.p602db.entity.ImageEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34767o0000oOO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageLocalDataSource$getImagesByPageIdSync$2", m80623f = "ImageLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class oOO00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34767o0000oOO, Continuation<? super List<? extends ImageEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f92156OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f92157OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(String str, Continuation<? super oOO00O> continuation) {
        super(2, continuation);
        this.f92156OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        oOO00O ooo00o = new oOO00O(this.f92156OooOo, continuation);
        ooo00o.f92157OooOo0o = obj;
        return ooo00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34767o0000oOO abstractC34767o0000oOO, Continuation<? super List<? extends ImageEntity>> continuation) {
        return ((oOO00O) create(abstractC34767o0000oOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return ((AbstractC34767o0000oOO) this.f92157OooOo0o).OooO0oo(this.f92156OooOo);
    }
}
