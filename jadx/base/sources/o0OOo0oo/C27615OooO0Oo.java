package o0OOo0oo;

import java.io.Serializable;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.EnumC27285OooO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.AboutCloudSyncUseCase$getCloudSyncTypeFlow$1", m80623f = "AboutCloudSyncUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27615OooO0Oo extends AbstractC32476OooO implements oO0O000o.OooOo00<EnumC27285OooO, Boolean, Boolean, Boolean, Boolean, Continuation<? super EnumC27285OooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f97100OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ EnumC27285OooO f97101OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ boolean f97102OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ boolean f97103OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ boolean f97104OooOoOO;

    public C27615OooO0Oo(Continuation<? super C27615OooO0Oo> continuation) {
        super(6, continuation);
    }

    @Override // oO0O000o.OooOo00
    public final Object Oooo0OO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
        C27615OooO0Oo c27615OooO0Oo = new C27615OooO0Oo((Continuation) serializable);
        c27615OooO0Oo.f97101OooOo0o = (EnumC27285OooO) obj;
        c27615OooO0Oo.f97100OooOo = zBooleanValue;
        c27615OooO0Oo.f97103OooOoO0 = zBooleanValue2;
        c27615OooO0Oo.f97102OooOoO = zBooleanValue3;
        c27615OooO0Oo.f97104OooOoOO = zBooleanValue4;
        return c27615OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        EnumC27285OooO enumC27285OooO = this.f97101OooOo0o;
        boolean z = this.f97100OooOo;
        boolean z2 = this.f97103OooOoO0;
        boolean z3 = this.f97102OooOoO;
        boolean z4 = this.f97104OooOoOO;
        int iOrdinal = enumC27285OooO.ordinal();
        if (iOrdinal == 0) {
            return EnumC27285OooO.f95076OooOo0o;
        }
        if (iOrdinal == 1) {
            return z ? EnumC27285OooO.f95075OooOo : EnumC27285OooO.f95076OooOo0o;
        }
        if (iOrdinal == 2) {
            return z2 ? EnumC27285OooO.f95078OooOoO0 : EnumC27285OooO.f95076OooOo0o;
        }
        if (iOrdinal == 3) {
            return z3 ? EnumC27285OooO.f95077OooOoO : EnumC27285OooO.f95076OooOo0o;
        }
        if (iOrdinal == 4) {
            return z4 ? EnumC27285OooO.f95079OooOoOO : EnumC27285OooO.f95076OooOo0o;
        }
        throw new C32442OooOO0o();
    }
}
