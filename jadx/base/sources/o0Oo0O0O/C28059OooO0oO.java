package o0Oo0O0O;

import com.orion.notein.p607ui.notelist.C23639OooOO0o;
import java.util.HashSet;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;

/* JADX INFO: renamed from: o0Oo0O0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ext.kotlinx.FlowCombineExtKt$combine$34", m80623f = "FlowCombineExt.kt", m80624l = {95}, m80625m = "invokeSuspend")
public final class C28059OooO0oO extends AbstractC32476OooO implements InterfaceC32509OooOOo<C32449OooOOoo<Object, Object, Object>, C32449OooOOoo<Object, Object, Object>, C32449OooOOoo<Object, Object, Object>, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ C32449OooOOoo f99459OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99460OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ C32449OooOOoo f99461OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ C32449OooOOoo f99462OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C23639OooOO0o f99463OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28059OooO0oO(C23639OooOO0o c23639OooOO0o, Continuation continuation) {
        super(4, continuation);
        this.f99463OooOoOO = c23639OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(C32449OooOOoo<Object, Object, Object> c32449OooOOoo, C32449OooOOoo<Object, Object, Object> c32449OooOOoo2, C32449OooOOoo<Object, Object, Object> c32449OooOOoo3, Continuation<Object> continuation) {
        C28059OooO0oO c28059OooO0oO = new C28059OooO0oO(this.f99463OooOoOO, continuation);
        c28059OooO0oO.f99459OooOo = c32449OooOOoo;
        c28059OooO0oO.f99462OooOoO0 = c32449OooOOoo2;
        c28059OooO0oO.f99461OooOoO = c32449OooOOoo3;
        return c28059OooO0oO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99460OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C32449OooOOoo c32449OooOOoo = this.f99459OooOo;
        C32449OooOOoo c32449OooOOoo2 = this.f99462OooOoO0;
        C32449OooOOoo c32449OooOOoo3 = this.f99461OooOoO;
        A a = c32449OooOOoo.f116648OooOo0o;
        A a2 = c32449OooOOoo2.f116648OooOo0o;
        A a3 = c32449OooOOoo3.f116648OooOo0o;
        this.f99459OooOo = null;
        this.f99462OooOoO0 = null;
        this.f99460OooOo0o = 1;
        C23639OooOO0o c23639OooOO0o = this.f99463OooOoOO;
        B b = c32449OooOOoo3.f116647OooOo;
        C c = c32449OooOOoo3.f116649OooOoO0;
        B b2 = c32449OooOOoo.f116647OooOo;
        C c2 = c32449OooOOoo.f116649OooOoO0;
        B b3 = c32449OooOOoo2.f116647OooOo;
        C c3 = c32449OooOOoo2.f116649OooOoO0;
        c23639OooOO0o.getClass();
        int iIntValue = ((Number) b2).intValue();
        boolean zBooleanValue = ((Boolean) b).booleanValue();
        boolean zBooleanValue2 = ((Boolean) c).booleanValue();
        C23639OooOO0o c23639OooOO0o2 = new C23639OooOO0o(this);
        c23639OooOO0o2.f77279OooOo0o = (com.orion.notein.p607ui.p609vo.OooO00o) a;
        c23639OooOO0o2.f77278OooOo = iIntValue;
        c23639OooOO0o2.f77281OooOoO0 = (HashSet) c2;
        c23639OooOO0o2.f77280OooOoO = (HashSet) a2;
        c23639OooOO0o2.f77282OooOoOO = (String) b3;
        c23639OooOO0o2.f77284OooOoo0 = (String) c3;
        c23639OooOO0o2.f77283OooOoo = (String) a3;
        c23639OooOO0o2.f77285OooOooO = zBooleanValue;
        c23639OooOO0o2.f77286OooOooo = zBooleanValue2;
        Object objInvokeSuspend = c23639OooOO0o2.invokeSuspend(C32460OooOooO.f116667OooO00o);
        return objInvokeSuspend == enumC32485OooO00o ? enumC32485OooO00o : objInvokeSuspend;
    }
}
