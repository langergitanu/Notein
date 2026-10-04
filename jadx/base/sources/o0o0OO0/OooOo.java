package o0o0OO0;

import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$setTextStyle$1", m80623f = "AiOcrViewModel.kt", m80624l = {846, 795}, m80625m = "invokeSuspend")
public final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C30394OooOOOO f108557OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f108558OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f108559OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f108560OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108561OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Object f108562OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(C30394OooOOOO c30394OooOOOO, Map<Integer, ? extends Object> map, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f108561OooOoOO = c30394OooOOOO;
        this.f108562OooOoo0 = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo(this.f108561OooOoOO, this.f108562OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C30394OooOOOO c30394OooOOOO;
        ?? r5;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108559OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30394OooOOOO c30394OooOOOO2 = this.f108561OooOoOO;
                interfaceC33895OooO00o = c30394OooOOOO2.f108522Oooo00O;
                this.f108558OooOo0o = interfaceC33895OooO00o;
                this.f108557OooOo = c30394OooOOOO2;
                Object obj3 = this.f108562OooOoo0;
                this.f108560OooOoO0 = obj3;
                this.f108559OooOoO = 1;
                if (interfaceC33895OooO00o.OooO00o(this) != obj2) {
                    c30394OooOOOO = c30394OooOOOO2;
                    r5 = obj3;
                }
                return obj2;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = this.f108558OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    th = th;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            Map map = (Map) this.f108560OooOoO0;
            c30394OooOOOO = this.f108557OooOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f108558OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            r5 = map;
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            this.f108558OooOo0o = interfaceC33895OooO00o;
            this.f108557OooOo = null;
            this.f108560OooOoO0 = null;
            this.f108559OooOoO = 2;
            c30394OooOOOO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30406OooOoO0(c30394OooOOOO, r5, null), this);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o != obj2) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
