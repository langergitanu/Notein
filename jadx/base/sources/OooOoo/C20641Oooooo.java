package OooOoo;

import OooooO0.C21290OooO0o0;
import o0000Ooo.C24243OooOOo0;
import o00Oo0.InterfaceC25026OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: OooOoo.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20641Oooooo implements InterfaceC25026OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f59125OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f59126OooOo0o;

    public C20641Oooooo(Oooo0oO.o00oO0O o00oo0o, boolean z) {
        this.f59126OooOo0o = o00oo0o;
        this.f59125OooOo = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00Oo0.InterfaceC25026OooO00o
    public final long OooO00o(int i, long j) {
        if (i == 2) {
            o0OoOo0 o0oooo02 = (o0OoOo0) this.f59126OooOo0o.getValue();
            o0oooo02.f59180OooO0oO.setValue(Boolean.TRUE);
        }
        return C21290OooO0o0.f61718OooO0O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00Oo0.InterfaceC25026OooO00o
    public final long OooO0o0(int i, long j, long j2) {
        if (!this.f59125OooOo) {
            return C21290OooO0o0.f61718OooO0O0;
        }
        o0OoOo0 o0oooo02 = (o0OoOo0) this.f59126OooOo0o.getValue();
        InterfaceC20643OoooooO interfaceC20643OoooooO = o0oooo02.f59177OooO0Oo;
        if (interfaceC20643OoooooO.OooO0O0()) {
            return C21290OooO0o0.f61718OooO0O0;
        }
        float fOooO0Oo = o0oooo02.OooO0Oo(j2);
        boolean z = o0oooo02.f59175OooO0O0;
        if (z) {
            fOooO0Oo *= -1;
        }
        float fOooO0Oo2 = interfaceC20643OoooooO.OooO0Oo(fOooO0Oo);
        if (z) {
            fOooO0Oo2 *= -1;
        }
        return o0oooo02.OooO0o0(fOooO0Oo2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o00Oo0.InterfaceC25026OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(long j, long j2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C20642Oooooo0 c20642Oooooo0;
        long jOooO0Oo;
        C20641Oooooo c20641Oooooo;
        if (abstractC32479OooO0OO instanceof C20642Oooooo0) {
            c20642Oooooo0 = (C20642Oooooo0) abstractC32479OooO0OO;
            int i = c20642Oooooo0.f59131OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c20642Oooooo0.f59131OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c20642Oooooo0 = new C20642Oooooo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c20642Oooooo0.f59130OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c20642Oooooo0.f59131OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            if (!this.f59125OooOo) {
                jOooO0Oo = C24243OooOOo0.f81501OooO0O0;
                c20641Oooooo = this;
                C24243OooOOo0 c24243OooOOo0 = new C24243OooOOo0(jOooO0Oo);
                o0OoOo0 o0oooo02 = (o0OoOo0) c20641Oooooo.f59126OooOo0o.getValue();
                o0oooo02.f59180OooO0oO.setValue(Boolean.FALSE);
                return c24243OooOOo0;
            }
            o0OoOo0 o0oooo03 = (o0OoOo0) this.f59126OooOo0o.getValue();
            c20642Oooooo0.f59128OooOo0o = this;
            c20642Oooooo0.f59127OooOo = j2;
            c20642Oooooo0.f59131OooOoOO = 1;
            objOooO0O0 = o0oooo03.OooO0O0(j2, c20642Oooooo0);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c20641Oooooo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = c20642Oooooo0.f59127OooOo;
            c20641Oooooo = c20642Oooooo0.f59128OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        jOooO0Oo = C24243OooOOo0.OooO0Oo(j2, ((C24243OooOOo0) objOooO0O0).f81503OooO00o);
        C24243OooOOo0 c24243OooOOo02 = new C24243OooOOo0(jOooO0Oo);
        o0OoOo0 o0oooo022 = (o0OoOo0) c20641Oooooo.f59126OooOo0o.getValue();
        o0oooo022.f59180OooO0oO.setValue(Boolean.FALSE);
        return c24243OooOOo02;
    }
}
