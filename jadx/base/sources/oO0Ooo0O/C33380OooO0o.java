package oO0Ooo0O;

import kotlin.coroutines.Continuation;
import o00OO0o0.C24999OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0Oo0Oo.C33204OooO0oO;
import oO0o0O0o.C33580OooO00o;

/* JADX INFO: renamed from: oO0Ooo0O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", m80623f = "DefaultResponseValidation.kt", m80624l = {42, 48}, m80625m = "invokeSuspend")
public final class C33380OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC33200OooO0OO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f120685OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC33200OooO0OO f120686OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f120687OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f120688OooOoO0;

    public C33380OooO0o() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33380OooO0o c33380OooO0o = new C33380OooO0o(2, continuation);
        c33380OooO0o.f120687OooOoO = obj;
        return c33380OooO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC33200OooO0OO abstractC33200OooO0OO, Continuation<? super C32460OooOooO> continuation) {
        return ((C33380OooO0o) create(abstractC33200OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(8:6|54|7|30|34|(2:39|(1:(1:48)(1:47))(1:43))(1:38)|49|50)(2:9|10))(1:11))(2:12|(2:14|15)(2:16|(2:51|52)(3:21|(1:24)|28)))|25|56|26|(6:29|30|34|(2:39|(1:(2:45|48)(0))(0))(0)|49|50)|28) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        r0 = r1;
        r3 = r4;
        r1 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        AbstractC33200OooO0OO abstractC33200OooO0OO;
        int i2;
        AbstractC33200OooO0OO abstractC33200OooO0OO2;
        AbstractC33200OooO0OO abstractC33200OooO0OO3;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f120688OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC33200OooO0OO abstractC33200OooO0OO4 = (AbstractC33200OooO0OO) this.f120687OooOoO;
            if (!((Boolean) abstractC33200OooO0OO4.OooO00o().getAttributes().OooO0o(C33398OooOo0o.f120748OooO0O0)).booleanValue()) {
                C33383OooO0oo.f120691OooO0O0.OooO0oo("Skipping default response validation for " + abstractC33200OooO0OO4.OooO00o().OooO0Oo().getUrl());
                return C32460OooOooO.f116667OooO00o;
            }
            i = abstractC33200OooO0OO4.OooO0o().f115566OooOo0o;
            ooOOOOOo.OooO0OO oooO0OOOooO00o = abstractC33200OooO0OO4.OooO00o();
            if (i < 300 || oooO0OOOooO00o.getAttributes().OooO0O0(C33383OooO0oo.f120690OooO00o)) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f120687OooOoO = abstractC33200OooO0OO4;
            this.f120685OooOo = i;
            this.f120688OooOoO0 = 1;
            Object objOooO0Oo = C24999OooO0OO.OooO0Oo(oooO0OOOooO00o, this);
            if (objOooO0Oo != enumC32485OooO00o) {
                abstractC33200OooO0OO = abstractC33200OooO0OO4;
                obj = objOooO0Oo;
            }
            return enumC32485OooO00o;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.f120685OooOo;
            abstractC33200OooO0OO3 = this.f120686OooOo0o;
            abstractC33200OooO0OO2 = (AbstractC33200OooO0OO) this.f120687OooOoO;
            try {
                C32446OooOOOo.OooO0O0(obj);
                str = (String) obj;
            } catch (oO00Oo00.OooO0O0 unused) {
                str = "<body failed decoding>";
            }
            Throwable c33423OoooOOO = (300 <= i2 || i2 >= 400) ? (400 <= i2 || i2 >= 500) ? (500 <= i2 || i2 >= 600) ? new C33423OoooOOO(abstractC33200OooO0OO3, str) : new C33426OoooOoO(abstractC33200OooO0OO3, str) : new C33381OooO0o0(abstractC33200OooO0OO3, str) : new C33422OoooOO0(abstractC33200OooO0OO3, str);
            C33383OooO0oo.f120691OooO0O0.OooO0oo("Default response validation for " + abstractC33200OooO0OO2.OooO00o().OooO0Oo().getUrl() + " failed with " + c33423OoooOOO);
            throw c33423OoooOOO;
        }
        i = this.f120685OooOo;
        abstractC33200OooO0OO = (AbstractC33200OooO0OO) this.f120687OooOoO;
        C32446OooOOOo.OooO0O0(obj);
        ooOOOOOo.OooO0OO oooO0OO = (ooOOOOOo.OooO0OO) obj;
        oooO0OO.getAttributes().OooO0o0(C33383OooO0oo.f120690OooO00o, C32460OooOooO.f116667OooO00o);
        AbstractC33200OooO0OO abstractC33200OooO0OOOooO0o0 = oooO0OO.OooO0o0();
        this.f120687OooOoO = abstractC33200OooO0OO;
        this.f120686OooOo0o = abstractC33200OooO0OOOooO0o0;
        this.f120685OooOo = i;
        this.f120688OooOoO0 = 2;
        Object objOooO0O0 = C33204OooO0oO.OooO0O0(abstractC33200OooO0OOOooO0o0, C33580OooO00o.f121231OooO0O0, this);
        if (objOooO0O0 != enumC32485OooO00o) {
            i2 = i;
            abstractC33200OooO0OO3 = abstractC33200OooO0OOOooO0o0;
            obj = objOooO0O0;
            abstractC33200OooO0OO2 = abstractC33200OooO0OO;
            str = (String) obj;
            if (300 <= i2) {
            }
            C33383OooO0oo.f120691OooO0O0.OooO0oo("Default response validation for " + abstractC33200OooO0OO2.OooO00o().OooO0Oo().getUrl() + " failed with " + c33423OoooOOO);
            throw c33423OoooOOO;
        }
        return enumC32485OooO00o;
    }
}
