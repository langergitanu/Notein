package o0OO0;

import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.InterfaceC27291OooO0o0;
import o0OOo0o.C27327OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26436OooO0Oo implements InterfaceC27291OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0<AbstractC24338OooO0o0> f90814OooO00o;

    public C26436OooO0Oo(OooOO0<AbstractC24338OooO0o0> dataStore) {
        OooOOO0.OooO0oO(dataStore, "dataStore");
        this.f90814OooO00o = dataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27291OooO0o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0O0 oooO0O0;
        if (abstractC32479OooO0OO instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) abstractC32479OooO0OO;
            int i = oooO0O0.f90811OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f90811OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOo00 = oooO0O0.f90810OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f90811OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo00);
            OooO00o oooO00o = new OooO00o(this.f90814OooO00o.getData(), this, str);
            oooO0O0.f90811OooOoO0 = 1;
            objOooOo00 = C25252OooO0Oo.OooOo00(oooO00o, oooO0O0);
            if (objOooOo00 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOo00);
        }
        String str2 = (String) objOooOo00;
        return str2 == null ? "0" : str2;
    }

    @Override // o0OOo0Oo.InterfaceC27291OooO0o0
    public final Object OooO0O0(C27327OooO0O0 c27327OooO0O0) {
        Object objOooO00o = C24332OooO.OooO00o(this.f90814OooO00o, new OooO0OO(this, null), c27327OooO0O0);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }
}
