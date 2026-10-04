package o0O0oooO;

import OooO0Oo.C20398OooO0O0;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27597o00ooo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0oooO.o0000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$getFeatureLimited$2", m80623f = "UserViewModel.kt", m80624l = {730, 733}, m80625m = "invokeSuspend")
public final class C26330o0000oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f90297OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90298OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f90299OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90300OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26330o0000oo(int i, C26320o0000OoO c26320o0000OoO, int i2, Continuation<? super C26330o0000oo> continuation) {
        super(2, continuation);
        this.f90297OooOo = i;
        this.f90300OooOoO0 = c26320o0000OoO;
        this.f90299OooOoO = i2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26330o0000oo(this.f90297OooOo, this.f90300OooOoO0, this.f90299OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((C26330o0000oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90298OooOo0o;
        C26320o0000OoO c26320o0000OoO = this.f90300OooOoO0;
        int i2 = this.f90297OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (i2 == 37) {
                this.f90298OooOo0o = 1;
                Object objOooO0o0 = c26320o0000OoO.OooO0o0(this.f90299OooOoO, this);
                if (objOooO0o0 != enumC32485OooO00o) {
                    return objOooO0o0;
                }
            } else {
                this.f90298OooOo0o = 2;
                obj = c26320o0000OoO.OooOOO0(i2, this);
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        int iIntValue = ((Number) obj).intValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("UserViewModel");
        Object value = c26320o0000OoO.f90227OooOoOO.f121747OooOo0o.getValue();
        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("feature: ", i2, ", featureStatus: ", ", user: ", iIntValue);
        sbOooO0O0.append(value);
        c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
        if (iIntValue == 3) {
            c26320o0000OoO.f90207OooO0o0.getClass();
            if (!C27597o00ooo00.f96915OooO0o.contains(Integer.valueOf(i2))) {
                iIntValue = 4;
            }
        }
        return new Integer(iIntValue);
    }
}
