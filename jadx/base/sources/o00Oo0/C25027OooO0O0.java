package o00Oo0;

import kotlin.jvm.internal.OooOOOO;
import o0000Ooo.C24243OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Ooo.C33822OooO0OO;

/* JADX INFO: renamed from: o00Oo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25027OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooOOOO f84972OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C33822OooO0OO f84973OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0o f84974OooO0OO;

    /* JADX INFO: renamed from: o00Oo0.OooO0O0$OooO00o */
    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC33636Oooo00o> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC33636Oooo00o invoke() {
            return C25027OooO0O0.this.f84973OooO0O0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(long j, long j2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C25028OooO0OO c25028OooO0OO;
        long j3;
        if (abstractC32479OooO0OO instanceof C25028OooO0OO) {
            c25028OooO0OO = (C25028OooO0OO) abstractC32479OooO0OO;
            int i = c25028OooO0OO.f84978OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c25028OooO0OO.f84978OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c25028OooO0OO = new C25028OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        C25028OooO0OO c25028OooO0OO2 = c25028OooO0OO;
        Object objOooO0oo = c25028OooO0OO2.f84977OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c25028OooO0OO2.f84978OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            OooO0o oooO0o = this.f84974OooO0OO;
            if (oooO0o == null) {
                j3 = C24243OooOOo0.f81501OooO0O0;
                return new C24243OooOOo0(j3);
            }
            c25028OooO0OO2.f84978OooOoO0 = 1;
            objOooO0oo = oooO0o.OooO0oo(j, j2, c25028OooO0OO2);
            if (objOooO0oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0oo);
        }
        j3 = ((C24243OooOOo0) objOooO0oo).f81503OooO00o;
        return new C24243OooOOo0(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(long j, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C25029OooO0Oo c25029OooO0Oo;
        long j2;
        if (abstractC32479OooO0OO instanceof C25029OooO0Oo) {
            c25029OooO0Oo = (C25029OooO0Oo) abstractC32479OooO0OO;
            int i = c25029OooO0Oo.f84981OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c25029OooO0Oo.f84981OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c25029OooO0Oo = new C25029OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO = c25029OooO0Oo.f84980OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c25029OooO0Oo.f84981OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO);
            OooO0o oooO0o = this.f84974OooO0OO;
            if (oooO0o == null) {
                j2 = C24243OooOOo0.f81501OooO0O0;
                return new C24243OooOOo0(j2);
            }
            c25029OooO0Oo.f84981OooOoO0 = 1;
            objOooO = oooO0o.OooO(j, c25029OooO0Oo);
            if (objOooO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO);
        }
        j2 = ((C24243OooOOo0) objOooO).f81503OooO00o;
        return new C24243OooOOo0(j2);
    }
}
