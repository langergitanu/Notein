package o0o00o;

import kotlin.coroutines.Continuation;
import o0o00oO0.C29999OooOo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o00o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbox.popup.listener.InkOrBallPointPenSettingListener$limitedToUsingPencil$1", m80623f = "InkOrBallPointPenSettingListener.kt", m80624l = {34}, m80625m = "invokeSuspend")
public final class C29923OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29924OooO0Oo f106198OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f106199OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C29999OooOo0o f106200OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29923OooO0OO(C29924OooO0Oo c29924OooO0Oo, C29999OooOo0o c29999OooOo0o, Continuation continuation) {
        super(2, continuation);
        this.f106198OooOo = c29924OooO0Oo;
        this.f106200OooOoO0 = c29999OooOo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29923OooO0OO(this.f106198OooOo, this.f106200OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29923OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.internal.OooOO0o, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106199OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ?? r5 = this.f106198OooOo.f106203OooO0OO;
            Integer num = new Integer(16);
            this.f106199OooOo0o = 1;
            obj = r5.invoke(num, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        this.f106200OooOoO0.invoke(Boolean.valueOf(!((Boolean) obj).booleanValue()));
        return C32460OooOooO.f116667OooO00o;
    }
}
