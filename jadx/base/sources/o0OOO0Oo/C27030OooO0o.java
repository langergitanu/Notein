package o0OOO0Oo;

import com.orion.notein.data.p602db.entity.PageLayerEntity;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oo0oO0.AbstractC34903o00o0OoO;

/* JADX INFO: renamed from: o0OOO0Oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.layer.PageLayerLocalDataSource$getPageLayersByIds$1$1", m80623f = "PageLayerLocalDataSource.kt", m80624l = {91, 93}, m80625m = "invokeSuspend")
public final class C27030OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC34903o00o0OoO f94116OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94117OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94118OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27030OooO0o(AbstractC34903o00o0OoO abstractC34903o00o0OoO, String str, Continuation<? super C27030OooO0o> continuation) {
        super(2, continuation);
        this.f94116OooOo = abstractC34903o00o0OoO;
        this.f94118OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27030OooO0o(this.f94116OooOo, this.f94118OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27030OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r2.OooO00o(r6, r5) == r0) goto L17;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94117OooOo0o;
        AbstractC34903o00o0OoO abstractC34903o00o0OoO = this.f94116OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f94117OooOo0o = 1;
            obj = abstractC34903o00o0OoO.OooOOo(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        if (((Number) obj).intValue() == 0) {
            PageLayerEntity[] pageLayerEntityArr = (PageLayerEntity[]) PageLayerEntity.INSTANCE.getDefaultPageLayers(this.f94118OooOoO0).toArray(new PageLayerEntity[0]);
            PageLayerEntity[] pageLayerEntityArr2 = (PageLayerEntity[]) Arrays.copyOf(pageLayerEntityArr, pageLayerEntityArr.length);
            this.f94117OooOo0o = 2;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
