package o0OOO0oo;

import com.orion.notein.data.p602db.entity.StickerCollectionEntity;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOO0oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.sticker.StickerLocalDataSource$getStickerCollectionSync$2", m80623f = "StickerLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27070OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends StickerCollection>>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27073OooOO0o f94233OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27070OooO0oo(C27073OooOO0o c27073OooOO0o, Continuation continuation) {
        super(2, continuation);
        this.f94233OooOo0o = c27073OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27070OooO0oo(this.f94233OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends StickerCollection>> continuation) {
        return ((C27070OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C27073OooOO0o c27073OooOO0o = this.f94233OooOo0o;
        List listOooO0Oo = c27073OooOO0o.f94246OooO0O0.OooO0Oo();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO0Oo, 10));
        Iterator it = listOooO0Oo.iterator();
        while (it.hasNext()) {
            arrayList.add(c27073OooOO0o.f94247OooO0OO.toStickerCollection((StickerCollectionEntity) it.next()));
        }
        return arrayList;
    }
}
