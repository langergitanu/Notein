package o0o000OO;

import com.orion.penkit.models.QuoteInfo;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: renamed from: o0o000OO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$generateQuoteInfoForSaving$1", m80623f = "TextAnnoViewModel.kt", m80624l = {540, 469}, m80625m = "invokeSuspend")
public final class C29758OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends QuoteInfo, ? extends QuoteInfo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooOO0O f105580OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f105581OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105582OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f105583OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29758OooOOo0(Continuation continuation, OooOO0O oooOO0O) {
        super(2, continuation);
        this.f105582OooOoO = oooOO0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29758OooOOo0(continuation, this.f105582OooOoO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends QuoteInfo, ? extends QuoteInfo>> continuation) {
        return ((C29758OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        OooOO0O oooOO0O;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105583OooOoO0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                oooOO0O = this.f105582OooOoO;
                interfaceC33895OooO00o = oooOO0O.f105530OooO;
                this.f105581OooOo0o = interfaceC33895OooO00o;
                this.f105580OooOo = oooOO0O;
                this.f105583OooOoO0 = 1;
                if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = this.f105581OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return c32443OooOOO;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            oooOO0O = this.f105580OooOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f105581OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            this.f105581OooOo0o = interfaceC33895OooO00o;
            this.f105580OooOo = null;
            this.f105583OooOoO0 = 2;
            Serializable serializableOooO0o0 = OooOO0O.OooO0o0(oooOO0O, this);
            if (serializableOooO0o0 != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                obj = serializableOooO0o0;
                C32443OooOOO c32443OooOOO2 = (C32443OooOOO) obj;
                interfaceC33895OooO00o2.OooOOO0(null);
                return c32443OooOOO2;
            }
            return enumC32485OooO00o;
        } catch (Throwable th3) {
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            th = th3;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
