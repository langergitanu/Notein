package o0Oo0O0O;

import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0o0OOO.o0OOO0o;
import o0oOoOo.C31041OooOOO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ext.kotlinx.FlowCombineExtKt$combine$57", m80623f = "FlowCombineExt.kt", m80624l = {159}, m80625m = "invokeSuspend")
public final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32511OooOOoo<C32449OooOOoo<Object, Object, Object>, C32449OooOOoo<Object, Object, Object>, C32449OooOOoo<Object, Object, Object>, C32443OooOOO<Object, Object>, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ C32449OooOOoo f99469OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99470OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ C32449OooOOoo f99471OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ C32449OooOOoo f99472OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ C32443OooOOO f99473OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f99474OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(o0OOO0o o0ooo0o2, Continuation continuation) {
        super(5, continuation);
        this.f99474OooOoo0 = o0ooo0o2;
    }

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        OooOOO0 oooOOO0 = new OooOOO0(this.f99474OooOoo0, (Continuation) serializable);
        oooOOO0.f99469OooOo = (C32449OooOOoo) obj;
        oooOOO0.f99472OooOoO0 = (C32449OooOOoo) obj2;
        oooOOO0.f99471OooOoO = (C32449OooOOoo) obj3;
        oooOOO0.f99473OooOoOO = (C32443OooOOO) obj4;
        return oooOOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99470OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C32449OooOOoo c32449OooOOoo = this.f99469OooOo;
        C32449OooOOoo c32449OooOOoo2 = this.f99472OooOoO0;
        C32449OooOOoo c32449OooOOoo3 = this.f99471OooOoO;
        C32443OooOOO c32443OooOOO = this.f99473OooOoOO;
        A a = c32449OooOOoo.f116648OooOo0o;
        A a2 = c32449OooOOoo2.f116648OooOo0o;
        A a3 = c32449OooOOoo3.f116648OooOo0o;
        A a4 = c32443OooOOO.f116638OooOo0o;
        this.f99469OooOo = null;
        this.f99472OooOoO0 = null;
        this.f99471OooOoO = null;
        this.f99470OooOo0o = 1;
        o0OOO0o o0ooo0o2 = this.f99474OooOoo0;
        PaperTheme paperTheme = (PaperTheme) c32449OooOOoo.f116647OooOo;
        List list = (List) c32449OooOOoo.f116649OooOoO0;
        boolean zBooleanValue = ((Boolean) a2).booleanValue();
        PaperTheme paperTheme2 = (PaperTheme) c32449OooOOoo2.f116647OooOo;
        PaperOrientation paperOrientation = (PaperOrientation) c32449OooOOoo2.f116649OooOoO0;
        Map map = (Map) c32449OooOOoo3.f116647OooOo;
        Set set = (Set) c32449OooOOoo3.f116649OooOoO0;
        boolean zBooleanValue2 = ((Boolean) a4).booleanValue();
        C31041OooOOO c31041OooOOO = (C31041OooOOO) c32443OooOOO.f116637OooOo;
        o0OOO0o o0ooo0o3 = new o0OOO0o(o0ooo0o2.f109219Oooo00o, o0ooo0o2.f109216Oooo0, this);
        o0ooo0o3.f109208OooOo0o = (List) a;
        o0ooo0o3.f109207OooOo = paperTheme;
        o0ooo0o3.f109210OooOoO0 = list;
        o0ooo0o3.f109209OooOoO = zBooleanValue;
        o0ooo0o3.f109211OooOoOO = paperTheme2;
        o0ooo0o3.f109213OooOoo0 = paperOrientation;
        o0ooo0o3.f109212OooOoo = (String) a3;
        o0ooo0o3.f109214OooOooO = map;
        o0ooo0o3.f109215OooOooo = set;
        o0ooo0o3.f109217Oooo000 = zBooleanValue2;
        o0ooo0o3.f109218Oooo00O = c31041OooOOO;
        Object objInvokeSuspend = o0ooo0o3.invokeSuspend(C32460OooOooO.f116667OooO00o);
        return objInvokeSuspend == enumC32485OooO00o ? enumC32485OooO00o : objInvokeSuspend;
    }
}
