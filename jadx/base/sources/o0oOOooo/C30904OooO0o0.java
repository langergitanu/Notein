package o0oOOooo;

import com.orion.notein.global.R;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0o.C27522o00o00oO;
import o0OOo0o.C27538o00o0o0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOOooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.creation.StickerCollectionCreationViewModel$createStickerCollection$2", m80623f = "StickerCollectionCreationViewModel.kt", m80624l = {83}, m80625m = "invokeSuspend")
public final class C30904OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30906OooO0oo f110456OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110457OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30904OooO0o0(C30906OooO0oo c30906OooO0oo, Continuation<? super C30904OooO0o0> continuation) {
        super(2, continuation);
        this.f110456OooOo = c30906OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30904OooO0o0(this.f110456OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30904OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110457OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C30906OooO0oo c30906OooO0oo = this.f110456OooOo;
        String string = C33599OooOo0O.Oooooo0((String) c30906OooO0oo.f110471OooO0o.getValue()).toString();
        if (string == null || string.length() == 0) {
            string = c30906OooO0oo.f110472OooO0o0.getString(R.string.sticker_collection_default_title);
        }
        String str = string;
        OooOOO0.OooO0Oo(str);
        List list = (List) c30906OooO0oo.f110473OooO0oO.getValue();
        this.f110457OooOo0o = 1;
        List<String> list2 = C27538o00o0o0O.f96549OooO0oO;
        C27538o00o0o0O c27538o00o0o0O = c30906OooO0oo.f110470OooO0Oo;
        c27538o00o0o0O.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27522o00o00oO(list, null, false, c27538o00o0o0O, str, null), this);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }
}
