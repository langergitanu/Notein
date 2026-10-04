package o00Ooo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o00Ooo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1", m80623f = "SuspendingPointerInputFilter.kt", m80624l = {244}, m80625m = "invokeSuspend")
public final class C25094OooOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f85189OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f85190OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f85191OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C25093OooOooO f85192OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25094OooOooo(C25093OooOooO c25093OooOooO, InterfaceC32508OooOOOo<? super InterfaceC25088OooOoO, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C25094OooOooo> continuation) {
        super(2, continuation);
        this.f85192OooOoO0 = c25093OooOooO;
        this.f85191OooOoO = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C25094OooOooo c25094OooOooo = new C25094OooOooo(this.f85192OooOoO0, this.f85191OooOoO, continuation);
        c25094OooOooo.f85189OooOo = obj;
        return c25094OooOooo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C25094OooOooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f85190OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f85189OooOo;
            C25093OooOooO c25093OooOooO = this.f85192OooOoO0;
            c25093OooOooO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33636Oooo00o, "<set-?>");
            c25093OooOooO.f85182OooOooo = interfaceC33636Oooo00o;
            this.f85190OooOo0o = 1;
            if (this.f85191OooOoO.invoke(c25093OooOooO, this) == enumC32485OooO00o) {
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
