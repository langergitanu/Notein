package o0000o0O;

import java.io.File;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32599OooOO0o;
import oO0O0oo0.C32813Oooo000;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo00OOo.C34494OooO0O0;
import oOo00OOo.C34499OooO0oO;
import oOo00OOo.C34500OooO0oo;

/* JADX INFO: renamed from: o0000o0O.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24293OooooOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f81760OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f81761OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24293OooooOO(Object obj, int i) {
        super(1);
        this.f81761OooOo0o = i;
        this.f81760OooOo = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f81761OooOo0o) {
            case 0:
                File it = (File) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return new C24287OoooOo0(((InterfaceC33636Oooo00o) this.f81760OooOo).OooOOO0(), it);
            default:
                oO0O0ooO.OooOo typeParameter = (oO0O0ooO.OooOo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(typeParameter, "typeParameter");
                C34500OooO0oo c34500OooO0oo = (C34500OooO0oo) this.f81760OooOo;
                Integer num = (Integer) c34500OooO0oo.f123647OooO0Oo.get(typeParameter);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                C34499OooO0oO c34499OooO0oO = c34500OooO0oo.f123644OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(c34499OooO0oO, "<this>");
                C34499OooO0oO c34499OooO0oO2 = new C34499OooO0oO(c34499OooO0oO.f123639OooO00o, c34500OooO0oo, c34499OooO0oO.f123641OooO0OO);
                InterfaceC32599OooOO0o interfaceC32599OooOO0o = c34500OooO0oo.f123645OooO0O0;
                return new C32813Oooo000(C34494OooO0O0.OooO0O0(c34499OooO0oO2, interfaceC32599OooOO0o.getAnnotations()), typeParameter, c34500OooO0oo.f123646OooO0OO + iIntValue, interfaceC32599OooOO0o);
        }
    }
}
