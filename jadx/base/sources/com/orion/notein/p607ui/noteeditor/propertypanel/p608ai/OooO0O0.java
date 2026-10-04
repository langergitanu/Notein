package com.orion.notein.p607ui.noteeditor.propertypanel.p608ai;

import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00Oo.C25256OooO00o;
import o0OoooO.C29629OooOOo0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$postProcessStateChange$1", m80623f = "EditorAiViewModel.kt", m80624l = {635, 641, 666, 667}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f75692OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f75693OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO00o f75694OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO00o.OooO0OO f75695OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f75696OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO00o.OooO0OO oooO0OO, OooO00o oooO00o, String str, Continuation continuation) {
        super(2, continuation);
        this.f75695OooOoO0 = oooO0OO;
        this.f75694OooOoO = oooO00o;
        this.f75696OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f75695OooOoO0, this.f75694OooOoO, this.f75696OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r11 == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0169, code lost:
    
        if (r11 == r0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0167  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        OooO00o oooO00o;
        C32460OooOooO c32460OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f75692OooOo;
        OooO00o oooO00o2 = this.f75694OooOoO;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        oooO00o = this.f75693OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        str = (String) obj;
                        OooO00o.OooO0oo(oooO00o, str);
                        this.f75693OooOo0o = null;
                        this.f75692OooOo = 4;
                        if (oooO00o2.f75600OooOOO == null) {
                            oooO00o2.OooOOO(OooO00o.OooO0O0.C19358OooO0O0.f75643OooO00o, "400001");
                            c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        } else {
                            c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        }
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                oooO00o2.OooOOO(OooO00o.OooO0O0.C23515OooO0Oo.f75645OooO00o, null);
            } else {
                C33781o00o0O c33781o00o0O = oooO00o2.f75613OooOoO0;
                OooO00o.C23517OooO0Oo c23517OooO0Oo = new OooO00o.C23517OooO0Oo(OooO00o.OooO0OO.OooO0Oo.f75651OooO00o, null, null);
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, c23517OooO0Oo);
                OooO00o.OooO0oo(oooO00o2, null);
                this.f75692OooOo = 2;
                o00000OO o00000oo2 = oooO00o2.f75614OooOoOO;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO00o2);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                oooO00o2.f75614OooOoOO = C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO0OO(oooO00o2, null), 2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        OooO00o.OooO0OO.C19359OooO00o c19359OooO00o = OooO00o.OooO0OO.C19359OooO00o.f75648OooO00o;
        OooO00o.OooO0OO oooO0OO = this.f75695OooOoO0;
        if (!oooO0OO.equals(c19359OooO00o)) {
            if (oooO0OO.equals(OooO00o.OooO0OO.OooO0Oo.f75651OooO00o)) {
                C29629OooOOo0 c29629OooOOo0 = oooO00o2.f75600OooOOO;
                if (c29629OooOOo0 != null) {
                    this.f75692OooOo = 1;
                    obj = c29629OooOOo0.OooOO0(this);
                }
            } else {
                OooO00o.OooO0OO.C19360OooO0OO c19360OooO0OO = OooO00o.OooO0OO.C19360OooO0OO.f75650OooO00o;
                boolean zEquals = oooO0OO.equals(c19360OooO0OO);
                String str2 = this.f75696OooOoOO;
                if (zEquals) {
                    OooOOO0.OooO0o0(str2, "null cannot be cast to non-null type kotlin.String");
                    OooO00o.C23517OooO0Oo c23517OooO0Oo2 = new OooO00o.C23517OooO0Oo(c19360OooO0OO, str2, C25256OooO00o.OooO0o(oooO00o2.f75597OooOO0, str2, oooO00o2.OooOO0O()));
                    C33781o00o0O c33781o00o0O2 = oooO00o2.f75613OooOoO0;
                    c33781o00o0O2.getClass();
                    c33781o00o0O2.OooOO0(null, c23517OooO0Oo2);
                    OooO00o.OooO0oo(oooO00o2, null);
                } else {
                    OooO00o.OooO0OO.OooO0o oooO0o = OooO00o.OooO0OO.OooO0o.f75652OooO00o;
                    if (oooO0OO.equals(oooO0o)) {
                        C33781o00o0O c33781o00o0O3 = oooO00o2.f75613OooOoO0;
                        OooO00o.C23517OooO0Oo c23517OooO0Oo3 = new OooO00o.C23517OooO0Oo(oooO0o, null, null);
                        c33781o00o0O3.getClass();
                        c33781o00o0O3.OooOO0(null, c23517OooO0Oo3);
                        o00000OO o00000oo3 = oooO00o2.f75614OooOoOO;
                        if (o00000oo3 != null) {
                            o00000oo3.cancel((CancellationException) null);
                        }
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(oooO00o2);
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        oooO00o2.f75614OooOoOO = C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23521OooO0Oo(oooO00o2, null), 2);
                    } else {
                        OooO00o.OooO0OO.C23516OooO0o0 c23516OooO0o0 = OooO00o.OooO0OO.C23516OooO0o0.f75653OooO00o;
                        if (oooO0OO.equals(c23516OooO0o0)) {
                            OooOOO0.OooO0o0(str2, "null cannot be cast to non-null type kotlin.String");
                            OooO00o.C23517OooO0Oo c23517OooO0Oo4 = new OooO00o.C23517OooO0Oo(c23516OooO0o0, str2, C25256OooO00o.OooO0o(oooO00o2.f75597OooOO0, str2, oooO00o2.OooOO0O()));
                            C33781o00o0O c33781o00o0O4 = oooO00o2.f75613OooOoO0;
                            c33781o00o0O4.getClass();
                            c33781o00o0O4.OooOO0(null, c23517OooO0Oo4);
                            OooO00o.OooO0oo(oooO00o2, null);
                        } else {
                            OooO00o.OooO0OO.OooO0O0 oooO0O0 = OooO00o.OooO0OO.OooO0O0.f75649OooO00o;
                            if (!oooO0OO.equals(oooO0O0)) {
                                throw new C32442OooOO0o();
                            }
                            C33781o00o0O c33781o00o0O5 = oooO00o2.f75613OooOoO0;
                            OooO00o.C23517OooO0Oo c23517OooO0Oo5 = new OooO00o.C23517OooO0Oo(oooO0O0, null, null);
                            c33781o00o0O5.getClass();
                            c33781o00o0O5.OooOO0(null, c23517OooO0Oo5);
                            C29629OooOOo0 c29629OooOOo02 = oooO00o2.f75600OooOOO;
                            if (c29629OooOOo02 != null) {
                                this.f75693OooOo0o = oooO00o2;
                                this.f75692OooOo = 3;
                                obj = c29629OooOOo02.OooO0Oo(this);
                                if (obj != enumC32485OooO00o) {
                                    oooO00o = oooO00o2;
                                    str = (String) obj;
                                    OooO00o.OooO0oo(oooO00o, str);
                                    this.f75693OooOo0o = null;
                                    this.f75692OooOo = 4;
                                    if (oooO00o2.f75600OooOOO == null) {
                                    }
                                }
                            } else {
                                str = null;
                                oooO00o = oooO00o2;
                                OooO00o.OooO0oo(oooO00o, str);
                                this.f75693OooOo0o = null;
                                this.f75692OooOo = 4;
                                if (oooO00o2.f75600OooOOO == null) {
                                }
                            }
                        }
                    }
                }
            }
            return enumC32485OooO00o;
        }
        C33781o00o0O c33781o00o0O6 = oooO00o2.f75613OooOoO0;
        OooO00o.C23517OooO0Oo c23517OooO0Oo6 = new OooO00o.C23517OooO0Oo(c19359OooO00o, null, null);
        c33781o00o0O6.getClass();
        c33781o00o0O6.OooOO0(null, c23517OooO0Oo6);
        OooO00o.OooO0oo(oooO00o2, null);
        return C32460OooOooO.f116667OooO00o;
    }
}
