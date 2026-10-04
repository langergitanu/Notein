package OooOoo;

import OooOoo.AbstractC20599OooOO0O;
import OooOooO.C20724OooO00o;
import OooOooO.C20725OooO0O0;
import OooOooO.C20726OooO0OO;
import OooOooO.InterfaceC20736OooOOO0;
import OooooO0.C21290OooO0o0;
import kotlin.coroutines.Continuation;
import o0000Ooo.C24243OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: OooOoo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20608OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32510OooOOo0<InterfaceC33636Oooo00o, C21290OooO0o0, Continuation<? super C32460OooOooO>, Object> f58993OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32510OooOOo0<InterfaceC33636Oooo00o, C24243OooOOo0, Continuation<? super C32460OooOooO>, Object> f58994OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo0oO.o00oO0O<C20725OooO0O0> f58995OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC20736OooOOO0 f58996OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    public C20608OooOo0O(InterfaceC32510OooOOo0<? super InterfaceC33636Oooo00o, ? super C21290OooO0o0, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32510OooOOo0, InterfaceC32510OooOOo0<? super InterfaceC33636Oooo00o, ? super C24243OooOOo0, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32510OooOOo02, Oooo0oO.o00oO0O<C20725OooO0O0> dragStartInteraction, InterfaceC20736OooOOO0 interfaceC20736OooOOO0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dragStartInteraction, "dragStartInteraction");
        this.f58993OooO00o = interfaceC32510OooOOo0;
        this.f58994OooO0O0 = interfaceC32510OooOOo02;
        this.f58995OooO0OO = dragStartInteraction;
        this.f58996OooO0Oo = interfaceC20736OooOOO0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r2.OooO0OO(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r2.f58994OooO0O0.invoke(r9, r10, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(InterfaceC33636Oooo00o interfaceC33636Oooo00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C20606OooOOoo c20606OooOOoo;
        C20608OooOo0O c20608OooOo0O;
        if (abstractC32479OooO0OO instanceof C20606OooOOoo) {
            c20606OooOOoo = (C20606OooOOoo) abstractC32479OooO0OO;
            int i = c20606OooOOoo.f58967OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c20606OooOOoo.f58967OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c20606OooOOoo = new C20606OooOOoo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c20606OooOOoo.f58966OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c20606OooOOoo.f58967OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C20725OooO0O0 value = this.f58995OooO0OO.getValue();
            if (value != null) {
                InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = this.f58996OooO0Oo;
                if (interfaceC20736OooOOO0 != null) {
                    C20724OooO00o c20724OooO00o = new C20724OooO00o(value);
                    c20606OooOOoo.f58964OooOo0o = this;
                    c20606OooOOoo.f58963OooOo = interfaceC33636Oooo00o;
                    c20606OooOOoo.f58967OooOoOO = 1;
                }
                c20608OooOo0O = this;
            } else {
                c20608OooOo0O = this;
                C24243OooOOo0 c24243OooOOo0 = new C24243OooOOo0(C24243OooOOo0.f81501OooO0O0);
                c20606OooOOoo.f58964OooOo0o = null;
                c20606OooOOoo.f58963OooOo = null;
                c20606OooOOoo.f58967OooOoOO = 2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC33636Oooo00o = c20606OooOOoo.f58963OooOo;
            c20608OooOo0O = c20606OooOOoo.f58964OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        c20608OooOo0O.f58995OooO0OO.setValue(null);
        C24243OooOOo0 c24243OooOOo02 = new C24243OooOOo0(C24243OooOOo0.f81501OooO0O0);
        c20606OooOOoo.f58964OooOo0o = null;
        c20606OooOOoo.f58963OooOo = null;
        c20606OooOOoo.f58967OooOoOO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r2.OooO0OO(r6, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (r2.f58993OooO00o.invoke(r8, r4, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(InterfaceC33636Oooo00o interfaceC33636Oooo00o, AbstractC20599OooOO0O.OooO0OO oooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOo00 oooOo00;
        C20608OooOo0O c20608OooOo0O;
        C20725OooO0O0 c20725OooO0O0;
        C20608OooOo0O c20608OooOo0O2;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
        C20725OooO0O0 c20725OooO0O02;
        if (abstractC32479OooO0OO instanceof OooOo00) {
            oooOo00 = (OooOo00) abstractC32479OooO0OO;
            int i = oooOo00.f58991OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f58991OooOoo = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOo00.f58990OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOo00.f58991OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C20725OooO0O0 value = this.f58995OooO0OO.getValue();
            if (value != null && (r2 = this.f58996OooO0Oo) != null) {
                C20724OooO00o c20724OooO00o = new C20724OooO00o(value);
                oooOo00.f58987OooOo0o = this;
                oooOo00.f58986OooOo = interfaceC33636Oooo00o;
                oooOo00.f58989OooOoO0 = oooO0OO;
                oooOo00.f58991OooOoo = 1;
            }
            c20608OooOo0O = this;
        } else if (i2 == 1) {
            oooO0OO = oooOo00.f58989OooOoO0;
            interfaceC33636Oooo00o = oooOo00.f58986OooOo;
            c20608OooOo0O = oooOo00.f58987OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            c20725OooO0O02 = oooOo00.f58988OooOoO;
            oooO0OO = oooOo00.f58989OooOoO0;
            interfaceC33636Oooo00o2 = oooOo00.f58986OooOo;
            c20608OooOo0O2 = oooOo00.f58987OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c20725OooO0O0 = c20725OooO0O02;
            interfaceC33636Oooo00o = interfaceC33636Oooo00o2;
            c20608OooOo0O = c20608OooOo0O2;
            c20608OooOo0O.f58995OooO0OO.setValue(c20725OooO0O0);
            C21290OooO0o0 c21290OooO0o0 = new C21290OooO0o0(oooO0OO.f58916OooO00o);
            oooOo00.f58987OooOo0o = null;
            oooOo00.f58986OooOo = null;
            oooOo00.f58989OooOoO0 = null;
            oooOo00.f58988OooOoO = null;
            oooOo00.f58991OooOoo = 3;
        }
        c20725OooO0O0 = new C20725OooO0O0();
        InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = c20608OooOo0O.f58996OooO0Oo;
        if (interfaceC20736OooOOO0 != null) {
            oooOo00.f58987OooOo0o = c20608OooOo0O;
            oooOo00.f58986OooOo = interfaceC33636Oooo00o;
            oooOo00.f58989OooOoO0 = oooO0OO;
            oooOo00.f58988OooOoO = c20725OooO0O0;
            oooOo00.f58991OooOoo = 2;
            if (interfaceC20736OooOOO0.OooO0OO(c20725OooO0O0, oooOo00) != enumC32485OooO00o) {
                c20608OooOo0O2 = c20608OooOo0O;
                interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                c20725OooO0O02 = c20725OooO0O0;
                c20725OooO0O0 = c20725OooO0O02;
                interfaceC33636Oooo00o = interfaceC33636Oooo00o2;
                c20608OooOo0O = c20608OooOo0O2;
                c20608OooOo0O.f58995OooO0OO.setValue(c20725OooO0O0);
                C21290OooO0o0 c21290OooO0o02 = new C21290OooO0o0(oooO0OO.f58916OooO00o);
                oooOo00.f58987OooOo0o = null;
                oooOo00.f58986OooOo = null;
                oooOo00.f58989OooOoO0 = null;
                oooOo00.f58988OooOoO = null;
                oooOo00.f58991OooOoo = 3;
            }
        } else {
            c20608OooOo0O.f58995OooO0OO.setValue(c20725OooO0O0);
            C21290OooO0o0 c21290OooO0o022 = new C21290OooO0o0(oooO0OO.f58916OooO00o);
            oooOo00.f58987OooOo0o = null;
            oooOo00.f58986OooOo = null;
            oooOo00.f58989OooOoO0 = null;
            oooOo00.f58988OooOoO = null;
            oooOo00.f58991OooOoo = 3;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r2.OooO0OO(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r2.f58994OooO0O0.invoke(r8, r4, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(InterfaceC33636Oooo00o interfaceC33636Oooo00o, AbstractC20599OooOO0O.C20600OooO0Oo c20600OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C20607OooOo0 c20607OooOo0;
        C20608OooOo0O c20608OooOo0O;
        if (abstractC32479OooO0OO instanceof C20607OooOo0) {
            c20607OooOo0 = (C20607OooOo0) abstractC32479OooO0OO;
            int i = c20607OooOo0.f58985OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c20607OooOo0.f58985OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c20607OooOo0 = new C20607OooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c20607OooOo0.f58982OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c20607OooOo0.f58985OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C20725OooO0O0 value = this.f58995OooO0OO.getValue();
            if (value != null) {
                InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = this.f58996OooO0Oo;
                if (interfaceC20736OooOOO0 != null) {
                    C20726OooO0OO c20726OooO0OO = new C20726OooO0OO(value);
                    c20607OooOo0.f58981OooOo0o = this;
                    c20607OooOo0.f58980OooOo = interfaceC33636Oooo00o;
                    c20607OooOo0.f58983OooOoO0 = c20600OooO0Oo;
                    c20607OooOo0.f58985OooOoo0 = 1;
                }
                c20608OooOo0O = this;
            } else {
                c20608OooOo0O = this;
                C24243OooOOo0 c24243OooOOo0 = new C24243OooOOo0(c20600OooO0Oo.f58917OooO00o);
                c20607OooOo0.f58981OooOo0o = null;
                c20607OooOo0.f58980OooOo = null;
                c20607OooOo0.f58983OooOoO0 = null;
                c20607OooOo0.f58985OooOoo0 = 2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            c20600OooO0Oo = c20607OooOo0.f58983OooOoO0;
            interfaceC33636Oooo00o = c20607OooOo0.f58980OooOo;
            c20608OooOo0O = c20607OooOo0.f58981OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        c20608OooOo0O.f58995OooO0OO.setValue(null);
        C24243OooOOo0 c24243OooOOo02 = new C24243OooOOo0(c20600OooO0Oo.f58917OooO00o);
        c20607OooOo0.f58981OooOo0o = null;
        c20607OooOo0.f58980OooOo = null;
        c20607OooOo0.f58983OooOoO0 = null;
        c20607OooOo0.f58985OooOoo0 = 2;
    }
}
