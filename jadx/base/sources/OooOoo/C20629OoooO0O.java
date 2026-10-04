package OooOoo;

import o0000Ooo.InterfaceC24229OooO0OO;
import o00Ooo.InterfaceC25088OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0oOo.C33898OooO0Oo;

/* JADX INFO: renamed from: OooOoo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20629OoooO0O implements InterfaceC20617Oooo, InterfaceC24229OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f59085OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25088OooOoO f59086OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33898OooO0Oo f59087OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f59088OooOoO0;

    public C20629OoooO0O(InterfaceC25088OooOoO density) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(density, "density");
        this.f59086OooOo0o = density;
        this.f59087OooOoO = new C33898OooO0Oo(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C20628OoooO00 c20628OoooO00;
        C20629OoooO0O c20629OoooO0O;
        if (abstractC32479OooO0OO instanceof C20628OoooO00) {
            c20628OoooO00 = (C20628OoooO00) abstractC32479OooO0OO;
            int i = c20628OoooO00.f59083OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c20628OoooO00.f59083OooOoO = i - Integer.MIN_VALUE;
            } else {
                c20628OoooO00 = new C20628OoooO00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c20628OoooO00.f59081OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c20628OoooO00.f59083OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c20628OoooO00.f59082OooOo0o = this;
            c20628OoooO00.f59083OooOoO = 1;
            if (this.f59087OooOoO.OooO00o(c20628OoooO00) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c20629OoooO0O = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20629OoooO0O = c20628OoooO00.f59082OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        c20629OoooO0O.f59085OooOo = false;
        c20629OoooO0O.f59088OooOoO0 = false;
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final long OooOoo0(long j) {
        return this.f59086OooOo0o.OooOoo0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // OooOoo.InterfaceC20617Oooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOooo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C20627OoooO0 c20627OoooO0;
        C20629OoooO0O c20629OoooO0O;
        if (abstractC32479OooO0OO instanceof C20627OoooO0) {
            c20627OoooO0 = (C20627OoooO0) abstractC32479OooO0OO;
            int i = c20627OoooO0.f59079OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c20627OoooO0.f59079OooOoO = i - Integer.MIN_VALUE;
            } else {
                c20627OoooO0 = new C20627OoooO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c20627OoooO0.f59077OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c20627OoooO0.f59079OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (this.f59085OooOo || this.f59088OooOoO0) {
                c20629OoooO0O = this;
                return Boolean.valueOf(c20629OoooO0O.f59085OooOo);
            }
            c20627OoooO0.f59078OooOo0o = this;
            c20627OoooO0.f59079OooOoO = 1;
            if (this.f59087OooOoO.OooO00o(c20627OoooO0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c20629OoooO0O = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20629OoooO0O = c20627OoooO0.f59078OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        c20629OoooO0O.f59087OooOoO.OooOOO0(null);
        return Boolean.valueOf(c20629OoooO0O.f59085OooOo);
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final float OoooOOO(int i) {
        return this.f59086OooOo0o.OoooOOO(i);
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final float OoooOOo(float f) {
        return this.f59086OooOo0o.OoooOOo(f);
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final long Ooooo00(long j) {
        return this.f59086OooOo0o.Ooooo00(j);
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final float getDensity() {
        return this.f59086OooOo0o.getDensity();
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final float o00Oo0(long j) {
        return this.f59086OooOo0o.o00Oo0(j);
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final float o0OOO0o(float f) {
        return this.f59086OooOo0o.o0OOO0o(f);
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final int o0OoOo0(float f) {
        return this.f59086OooOo0o.o0OoOo0(f);
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final float o0ooOoO() {
        return this.f59086OooOo0o.o0ooOoO();
    }
}
