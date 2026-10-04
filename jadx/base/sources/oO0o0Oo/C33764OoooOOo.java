package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: oO0o0Oo.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m80623f = "Zip.kt", m80624l = {29, 29}, m80625m = "invokeSuspend")
public final class C33764OoooOOo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<Object>, Object[], Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f121741OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121742OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f121743OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object[] f121744OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33764OoooOOo(InterfaceC32510OooOOo0<Object, Object, ? super Continuation<Object>, ? extends Object> interfaceC32510OooOOo0, Continuation<? super C33764OoooOOo> continuation) {
        super(3, continuation);
        this.f121743OooOoO = interfaceC32510OooOOo0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oO0O000o.OooOOo0] */
    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Object[] objArr, Continuation<? super C32460OooOooO> continuation) {
        C33764OoooOOo c33764OoooOOo = new C33764OoooOOo(this.f121743OooOoO, continuation);
        c33764OoooOOo.f121741OooOo = interfaceC33723OooO0oO;
        c33764OoooOOo.f121744OooOoO0 = objArr;
        return c33764OoooOOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, oO0O000o.OooOOo0] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121742OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f121741OooOo;
            Object[] objArr = this.f121744OooOoO0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.f121741OooOo = interfaceC33723OooO0oO;
            this.f121742OooOo0o = 1;
            obj = this.f121743OooOoO.invoke(obj2, obj3, this);
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
        interfaceC33723OooO0oO = this.f121741OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f121741OooOo = null;
        this.f121742OooOo0o = 2;
    }
}
