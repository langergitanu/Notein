package o0oOo00;

import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27535o00o0Ooo;
import o0OOo0o.C27538o00o0o0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOo00.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditViewModel$updateStickerCollection$2", m80623f = "StickerCollectionEditViewModel.kt", m80624l = {164, 165, 172}, m80625m = "invokeSuspend")
public final class C30939OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f110586OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f110587OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30938OooOOo f110588OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30939OooOOo0(Continuation continuation, C30938OooOOo c30938OooOOo) {
        super(2, continuation);
        this.f110588OooOoO0 = c30938OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30939OooOOo0(continuation, this.f110588OooOoO0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30939OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110586OooOo;
        C30938OooOOo c30938OooOOo = this.f110588OooOoO0;
        C33781o00o0O c33781o00o0O = c30938OooOOo.f110576OooO0oO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Boolean bool = Boolean.TRUE;
            this.f110586OooOo = 1;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.f110587OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return obj2;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
            ((Boolean) objOooO0o).getClass();
            Boolean bool2 = Boolean.FALSE;
            this.f110587OooOo0o = objOooO0o;
            this.f110586OooOo = 3;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool2);
            return C32460OooOooO.f116667OooO00o != enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        String str = (String) c30938OooOOo.f110577OooO0oo.getValue();
        String str2 = (String) c30938OooOOo.f110572OooO.getValue();
        List list = (List) c30938OooOOo.f110578OooOO0.getValue();
        List list2 = (List) c30938OooOOo.f110579OooOO0O.getValue();
        List list3 = (List) c30938OooOOo.f110581OooOOO.f121747OooOo0o.getValue();
        this.f110586OooOo = 2;
        C27538o00o0o0O c27538o00o0o0O = c30938OooOOo.f110573OooO0Oo;
        c27538o00o0o0O.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27535o00o0Ooo(c27538o00o0o0O, str, list, list3, str2, list2, null), this);
        if (objOooO0o != enumC32485OooO00o) {
            ((Boolean) objOooO0o).getClass();
            Boolean bool22 = Boolean.FALSE;
            this.f110587OooOo0o = objOooO0o;
            this.f110586OooOo = 3;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool22);
            if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
            }
        }
    }
}
