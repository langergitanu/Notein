package o0OO00o0;

import com.orion.notein.data.p602db.entity.ImageEntity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34767o0000oOO;

/* JADX INFO: renamed from: o0OO00o0.o00O00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageLocalDataSource$updateImage$2", m80623f = "ImageLocalDataSource.kt", m80624l = {41}, m80625m = "invokeSuspend")
public final class C26587o00O00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34767o0000oOO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91665OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91666OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91667OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26587o00O00o(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f91667OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26587o00O00o c26587o00O00o = new C26587o00O00o(this.f91667OooOoO0, continuation);
        c26587o00O00o.f91665OooOo = obj;
        return c26587o00O00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34767o0000oOO abstractC34767o0000oOO, Continuation<? super C32460OooOooO> continuation) {
        return ((C26587o00O00o) create(abstractC34767o0000oOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91666OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34767o0000oOO abstractC34767o0000oOO = (AbstractC34767o0000oOO) this.f91665OooOo;
            ImageEntity[] imageEntityArr = (ImageEntity[]) this.f91667OooOoO0.toArray(new ImageEntity[0]);
            ImageEntity[] imageEntityArr2 = (ImageEntity[]) Arrays.copyOf(imageEntityArr, imageEntityArr.length);
            this.f91666OooOo0o = 1;
            if (abstractC34767o0000oOO.OooOOO0(imageEntityArr2, this) == enumC32485OooO00o) {
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
