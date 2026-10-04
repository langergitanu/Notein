package o0OOO0oo;

import com.orion.notein.data.p602db.entity.StickerCollectionEntity;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOO0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.sticker.StickerLocalDataSource$createStickerCollections$2", m80623f = "StickerLocalDataSource.kt", m80624l = {81}, m80625m = "invokeSuspend")
public final class C27063OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f94206OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94207OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27073OooOO0o f94208OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27063OooO00o(ArrayList arrayList, C27073OooOO0o c27073OooOO0o, Continuation continuation) {
        super(2, continuation);
        this.f94206OooOo = arrayList;
        this.f94208OooOoO0 = c27073OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27063OooO00o(this.f94206OooOo, this.f94208OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27063OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C27073OooOO0o c27073OooOO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94207OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList = this.f94206OooOo;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c27073OooOO0o = this.f94208OooOoO0;
                if (!zHasNext) {
                    break;
                }
                arrayList2.add(c27073OooOO0o.f94247OooO0OO.toStickerCollectionEntity((StickerCollection) it.next()));
            }
            StickerCollectionEntity[] stickerCollectionEntityArr = (StickerCollectionEntity[]) arrayList2.toArray(new StickerCollectionEntity[0]);
            StickerCollectionEntity[] stickerCollectionEntityArr2 = (StickerCollectionEntity[]) Arrays.copyOf(stickerCollectionEntityArr, stickerCollectionEntityArr.length);
            this.f94207OooOo0o = 1;
            if (c27073OooOO0o.f94246OooO0O0.OooO0o0(stickerCollectionEntityArr2, this) == enumC32485OooO00o) {
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
