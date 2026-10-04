package o00Oo0;

import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import OooooO0.C21290OooO0o0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000Ooo.C24243OooOOo0;
import o00oO0o.C25570OooO;
import o00oO0o.InterfaceC25574OooO0Oo;
import o00oO0o.InterfaceC25577OooO0oO;
import o00oO0o.InterfaceC25578OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Ooo.C33822OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements InterfaceC25574OooO0Oo, InterfaceC25577OooO0oO<OooO0o>, InterfaceC25026OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC25026OooO00o f84982OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C25027OooO0O0 f84983OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f84984OooOoO0;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC33636Oooo00o> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC33636Oooo00o invoke() {
            return OooO0o.this.OooOO0();
        }
    }

    public OooO0o(C25027OooO0O0 c25027OooO0O0, InterfaceC25026OooO00o interfaceC25026OooO00o) {
        this.f84983OooOo0o = c25027OooO0O0;
        this.f84982OooOo = interfaceC25026OooO00o;
        c25027OooO0O0.f84972OooO00o = new OooO00o();
        this.f84984OooOoO0 = C21105o000OoO.OooO0OO(null, o000O0O0.f61218OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o00Oo0.InterfaceC25026OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(long j, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C25032OooO0oo c25032OooO0oo;
        long j2;
        OooO0o oooO0o;
        long j3;
        if (abstractC32479OooO0OO instanceof C25032OooO0oo) {
            c25032OooO0oo = (C25032OooO0oo) abstractC32479OooO0OO;
            int i = c25032OooO0oo.f84998OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c25032OooO0oo.f84998OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c25032OooO0oo = new C25032OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO = c25032OooO0oo.f84997OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c25032OooO0oo.f84998OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO);
            OooO0o oooO0oOooOO0O = OooOO0O();
            if (oooO0oOooOO0O != null) {
                c25032OooO0oo.f84995OooOo0o = this;
                c25032OooO0oo.f84994OooOo = j;
                c25032OooO0oo.f84998OooOoOO = 1;
                objOooO = oooO0oOooOO0O.OooO(j, c25032OooO0oo);
                if (objOooO != enumC32485OooO00o) {
                    oooO0o = this;
                }
                return enumC32485OooO00o;
            }
            j2 = C24243OooOOo0.f81501OooO0O0;
            oooO0o = this;
            long j4 = j2;
            long j5 = j;
            j3 = j4;
            InterfaceC25026OooO00o interfaceC25026OooO00o = oooO0o.f84982OooOo;
            long jOooO0Oo = C24243OooOOo0.OooO0Oo(j5, j3);
            c25032OooO0oo.f84995OooOo0o = null;
            c25032OooO0oo.f84994OooOo = j3;
            c25032OooO0oo.f84998OooOoOO = 2;
            objOooO = interfaceC25026OooO00o.OooO(jOooO0Oo, c25032OooO0oo);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = c25032OooO0oo.f84994OooOo;
                C32446OooOOOo.OooO0O0(objOooO);
                return new C24243OooOOo0(C24243OooOOo0.OooO0o0(j3, ((C24243OooOOo0) objOooO).f81503OooO00o));
            }
            j = c25032OooO0oo.f84994OooOo;
            oooO0o = c25032OooO0oo.f84995OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO);
        }
        j2 = ((C24243OooOOo0) objOooO).f81503OooO00o;
        long j42 = j2;
        long j52 = j;
        j3 = j42;
        InterfaceC25026OooO00o interfaceC25026OooO00o2 = oooO0o.f84982OooOo;
        long jOooO0Oo2 = C24243OooOOo0.OooO0Oo(j52, j3);
        c25032OooO0oo.f84995OooOo0o = null;
        c25032OooO0oo.f84994OooOo = j3;
        c25032OooO0oo.f84998OooOoOO = 2;
        objOooO = interfaceC25026OooO00o2.OooO(jOooO0Oo2, c25032OooO0oo);
    }

    @Override // o00Oo0.InterfaceC25026OooO00o
    public final long OooO00o(int i, long j) {
        OooO0o oooO0oOooOO0O = OooOO0O();
        long jOooO00o = oooO0oOooOO0O != null ? oooO0oOooOO0O.OooO00o(i, j) : C21290OooO0o0.f61718OooO0O0;
        return C21290OooO0o0.OooO0o(jOooO00o, this.f84982OooOo.OooO00o(i, C21290OooO0o0.OooO0o0(j, jOooO00o)));
    }

    @Override // o00Oo0.InterfaceC25026OooO00o
    public final long OooO0o0(int i, long j, long j2) {
        long jOooO0o0 = this.f84982OooOo.OooO0o0(i, j, j2);
        OooO0o oooO0oOooOO0O = OooOO0O();
        return C21290OooO0o0.OooO0o(jOooO0o0, oooO0oOooOO0O != null ? oooO0oOooOO0O.OooO0o0(i, C21290OooO0o0.OooO0o(j, jOooO0o0), C21290OooO0o0.OooO0o0(j2, jOooO0o0)) : C21290OooO0o0.f61718OooO0O0);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // o00Oo0.InterfaceC25026OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(long j, long j2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C25031OooO0oO c25031OooO0oO;
        OooO0o oooO0o;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (abstractC32479OooO0OO instanceof C25031OooO0oO) {
            c25031OooO0oO = (C25031OooO0oO) abstractC32479OooO0OO;
            int i = c25031OooO0oO.f84993OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c25031OooO0oO.f84993OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c25031OooO0oO = new C25031OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        C25031OooO0oO c25031OooO0oO2 = c25031OooO0oO;
        Object objOooO0oo = c25031OooO0oO2.f84990OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c25031OooO0oO2.f84993OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            c25031OooO0oO2.f84989OooOo0o = this;
            c25031OooO0oO2.f84988OooOo = j;
            c25031OooO0oO2.f84991OooOoO0 = j2;
            c25031OooO0oO2.f84993OooOoo0 = 1;
            objOooO0oo = this.f84982OooOo.OooO0oo(j, j2, c25031OooO0oO2);
            if (objOooO0oo != enumC32485OooO00o) {
                oooO0o = this;
                j3 = j;
                j4 = j2;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = c25031OooO0oO2.f84988OooOo;
            C32446OooOOOo.OooO0O0(objOooO0oo);
            j6 = ((C24243OooOOo0) objOooO0oo).f81503OooO00o;
            j5 = j7;
            return new C24243OooOOo0(C24243OooOOo0.OooO0o0(j5, j6));
        }
        j4 = c25031OooO0oO2.f84991OooOoO0;
        j3 = c25031OooO0oO2.f84988OooOo;
        oooO0o = c25031OooO0oO2.f84989OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0oo);
        j5 = ((C24243OooOOo0) objOooO0oo).f81503OooO00o;
        OooO0o oooO0oOooOO0O = oooO0o.OooOO0O();
        if (oooO0oOooOO0O == null) {
            j6 = C24243OooOOo0.f81501OooO0O0;
            return new C24243OooOOo0(C24243OooOOo0.OooO0o0(j5, j6));
        }
        long jOooO0o0 = C24243OooOOo0.OooO0o0(j3, j5);
        long jOooO0Oo = C24243OooOOo0.OooO0Oo(j4, j5);
        c25031OooO0oO2.f84989OooOo0o = null;
        c25031OooO0oO2.f84988OooOo = j5;
        c25031OooO0oO2.f84993OooOoo0 = 2;
        objOooO0oo = oooO0oOooOO0O.OooO0oo(jOooO0o0, jOooO0Oo, c25031OooO0oO2);
        if (objOooO0oo != enumC32485OooO00o) {
            j7 = j5;
            j6 = ((C24243OooOOo0) objOooO0oo).f81503OooO00o;
            j5 = j7;
            return new C24243OooOOo0(C24243OooOOo0.OooO0o0(j5, j6));
        }
        return enumC32485OooO00o;
    }

    public final InterfaceC33636Oooo00o OooOO0() {
        OooO0o oooO0oOooOO0O = OooOO0O();
        if (oooO0oOooOO0O != null) {
            return oooO0oOooOO0O.OooOO0();
        }
        C33822OooO0OO c33822OooO0OO = this.f84983OooOo0o.f84973OooO0O0;
        if (c33822OooO0OO != null) {
            return c33822OooO0OO;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooO0o OooOO0O() {
        return (OooO0o) this.f84984OooOoO0.getValue();
    }

    @Override // o00oO0o.InterfaceC25574OooO0Oo
    public final void OooooOO(InterfaceC25578OooO0oo scope) {
        OooOOO0.OooO0oO(scope, "scope");
        this.f84984OooOoO0.setValue((OooO0o) scope.OooO00o(OooO.f84970OooO00o));
        this.f84983OooOo0o.f84974OooO0OO = OooOO0O();
    }

    @Override // o00oO0o.InterfaceC25577OooO0oO
    public final C25570OooO<OooO0o> getKey() {
        return OooO.f84970OooO00o;
    }

    @Override // o00oO0o.InterfaceC25577OooO0oO
    public final OooO0o getValue() {
        return this;
    }
}
