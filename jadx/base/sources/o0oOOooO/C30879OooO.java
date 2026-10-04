package o0oOOooO;

import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0oOOooO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$_stickerCollections$2", m80623f = "StickerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30879OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends StickerCollection>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30898OooOo00 f110360OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f110361OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30879OooO(Continuation continuation, C30898OooOo00 c30898OooOo00) {
        super(2, continuation);
        this.f110360OooOo = c30898OooOo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30879OooO c30879OooO = new C30879OooO(continuation, this.f110360OooOo);
        c30879OooO.f110361OooOo0o = obj;
        return c30879OooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(List<? extends StickerCollection> list, Continuation<? super C32460OooOooO> continuation) {
        return ((C30879OooO) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = (List) this.f110361OooOo0o;
        C30898OooOo00 c30898OooOo00 = this.f110360OooOo;
        String str = (String) c30898OooOo00.f110436OooO0oO.getValue();
        if (str.length() > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((StickerCollection) next).getId(), str)) {
                    break;
                }
            }
            if (next == null) {
                c30898OooOo00.OooO0o0("");
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
