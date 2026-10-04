package o0OO00o0;

import com.google.gson.reflect.TypeToken;
import com.orion.notein.App;
import com.orion.notein.domain.models.customoperate.CustomOperate;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o00o00O0.C25252OooO0Oo;
import o0Oo00o.C28028OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.CustomOperateRepoImpl$removeUnusedOperateType$1", m80623f = "CustomOperateRepoImpl.kt", m80624l = {39, 48}, m80625m = "invokeSuspend")
public final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26490OooOoo f91038OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91039OooOo0o;

    @Metadata(m80611d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m80612d2 = {"o0OO00o0/OooOo$OooO00o", "Lcom/google/gson/reflect/TypeToken;", "", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class OooO00o extends TypeToken<List<? extends Integer>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(C26490OooOoo c26490OooOoo, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f91038OooOo = c26490OooOoo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo(this.f91038OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r10 == r0) goto L33;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91039OooOo0o;
        C26490OooOoo c26490OooOoo = this.f91038OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = c26490OooOoo.f91060OooO00o.getData();
            this.f91039OooOo0o = 1;
            obj = C25252OooO0Oo.OooOo00(data, this);
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
        AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) obj;
        if (abstractC24338OooO0o0 == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        String str = (String) abstractC24338OooO0o0.OooO0OO(App.f69596o0OOO0o);
        Type type = new OooO00o().getType();
        kotlin.jvm.internal.OooOOO0.OooO0o(type, "getType(...)");
        Iterable iterable = (List) C28028OooO0o.OooO00o().fromJson(str, type);
        if (iterable == null) {
            iterable = C34434OooOoO.f123453OooOo0o;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable2) {
            if (!CustomOperate.INSTANCE.getListOfOperateType().contains(new Integer(((Number) obj2).intValue()))) {
                arrayList.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            List listOoooo00 = oOo000Oo.OooOo.Ooooo00(iterable2, oOo000Oo.OooOo.o0OO00O(arrayList));
            this.f91039OooOo0o = 2;
            c26490OooOoo.getClass();
            Object objOooO00o = C24332OooO.OooO00o(c26490OooOoo.f91060OooO00o, new C26488OooOoO0(C28028OooO0o.OooO00o().toJson(listOoooo00), null), this);
            if (objOooO00o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
