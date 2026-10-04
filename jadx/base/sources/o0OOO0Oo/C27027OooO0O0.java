package o0OOO0Oo;

import com.orion.notein.data.p602db.entity.PageLayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34903o00o0OoO;

/* JADX INFO: renamed from: o0OOO0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.layer.PageLayerLocalDataSource$deletePageLayers$2", m80623f = "PageLayerLocalDataSource.kt", m80624l = {69}, m80625m = "invokeSuspend")
public final class C27027OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34903o00o0OoO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94108OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94109OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f94110OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27027OooO0O0(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f94110OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27027OooO0O0 c27027OooO0O0 = new C27027OooO0O0(this.f94110OooOoO0, continuation);
        c27027OooO0O0.f94108OooOo = obj;
        return c27027OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34903o00o0OoO abstractC34903o00o0OoO, Continuation<? super C32460OooOooO> continuation) {
        return ((C27027OooO0O0) create(abstractC34903o00o0OoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94109OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34903o00o0OoO abstractC34903o00o0OoO = (AbstractC34903o00o0OoO) this.f94108OooOo;
            PageLayerEntity[] pageLayerEntityArr = (PageLayerEntity[]) this.f94110OooOoO0.toArray(new PageLayerEntity[0]);
            PageLayerEntity[] pageLayerEntityArr2 = (PageLayerEntity[]) Arrays.copyOf(pageLayerEntityArr, pageLayerEntityArr.length);
            this.f94109OooOo0o = 1;
            if (abstractC34903o00o0OoO.OooO0O0(pageLayerEntityArr2, this) == enumC32485OooO00o) {
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
