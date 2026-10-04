package o0OOO0Oo;

import com.orion.notein.data.p602db.entity.PageLayerEntity;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34903o00o0OoO;

/* JADX INFO: renamed from: o0OOO0Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.layer.PageLayerLocalDataSource$getPageLayersByIdsSync$2", m80623f = "PageLayerLocalDataSource.kt", m80624l = {107, 109, 113}, m80625m = "invokeSuspend")
public final class C27032OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34903o00o0OoO, Continuation<? super List<? extends PageLayerEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94122OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94123OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ List<String> f94124OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94125OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27032OooO0oO(String str, List<String> list, Continuation<? super C27032OooO0oO> continuation) {
        super(2, continuation);
        this.f94125OooOoO0 = str;
        this.f94124OooOoO = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27032OooO0oO c27032OooO0oO = new C27032OooO0oO(this.f94125OooOoO0, this.f94124OooOoO, continuation);
        c27032OooO0oO.f94122OooOo = obj;
        return c27032OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34903o00o0OoO abstractC34903o00o0OoO, Continuation<? super List<? extends PageLayerEntity>> continuation) {
        return ((C27032OooO0oO) create(abstractC34903o00o0OoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[PHI: r1
      0x006d: PHI (r1v4 oo0oO0.o00o0OoO) = (r1v3 oo0oO0.o00o0OoO), (r1v3 oo0oO0.o00o0OoO), (r1v8 oo0oO0.o00o0OoO) binds: [B:18:0x0046, B:20:0x006a, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC34903o00o0OoO abstractC34903o00o0OoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94123OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34903o00o0OoO abstractC34903o00o0OoO2 = (AbstractC34903o00o0OoO) this.f94122OooOo;
            this.f94122OooOo = abstractC34903o00o0OoO2;
            this.f94123OooOo0o = 1;
            Object objOooOOo = abstractC34903o00o0OoO2.OooOOo(this);
            if (objOooOOo != enumC32485OooO00o) {
                abstractC34903o00o0OoO = abstractC34903o00o0OoO2;
                obj = objOooOOo;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            abstractC34903o00o0OoO = (AbstractC34903o00o0OoO) this.f94122OooOo;
            C32446OooOOOo.OooO0O0(obj);
            this.f94122OooOo = null;
            this.f94123OooOo0o = 3;
            Object objOooOOO = abstractC34903o00o0OoO.OooOOO(this.f94124OooOoO, this);
            return objOooOOO != enumC32485OooO00o ? enumC32485OooO00o : objOooOOO;
        }
        abstractC34903o00o0OoO = (AbstractC34903o00o0OoO) this.f94122OooOo;
        C32446OooOOOo.OooO0O0(obj);
        if (((Number) obj).intValue() == 0) {
            PageLayerEntity[] pageLayerEntityArr = (PageLayerEntity[]) PageLayerEntity.INSTANCE.getDefaultPageLayers(this.f94125OooOoO0).toArray(new PageLayerEntity[0]);
            PageLayerEntity[] pageLayerEntityArr2 = (PageLayerEntity[]) Arrays.copyOf(pageLayerEntityArr, pageLayerEntityArr.length);
            this.f94122OooOo = abstractC34903o00o0OoO;
            this.f94123OooOo0o = 2;
            if (abstractC34903o00o0OoO.OooO00o(pageLayerEntityArr2, this) != enumC32485OooO00o) {
                this.f94122OooOo = null;
                this.f94123OooOo0o = 3;
                Object objOooOOO2 = abstractC34903o00o0OoO.OooOOO(this.f94124OooOoO, this);
                if (objOooOOO2 != enumC32485OooO00o) {
                }
            }
        }
    }
}
