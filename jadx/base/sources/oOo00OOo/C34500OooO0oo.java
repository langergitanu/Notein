package oOo00OOo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.C24293OooooOO;
import oO0O0OO.InterfaceC32599OooOO0o;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0oo0.C32813Oooo000;
import oO0O0ooO.InterfaceC32837OooOoO0;
import oO0O0ooO.OooOo;
import oO0Ooo0.InterfaceC33357OooO;

/* JADX INFO: renamed from: oOo00OOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34500OooO0oo implements InterfaceC34501OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34499OooO0oO f123644OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32599OooOO0o f123645OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f123646OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f123647OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC33357OooO<OooOo, C32813Oooo000> f123648OooO0o0;

    public C34500OooO0oo(C34499OooO0oO c, InterfaceC32599OooOO0o interfaceC32599OooOO0o, InterfaceC32837OooOoO0 typeParameterOwner, int i) {
        OooOOO0.OooO0oO(c, "c");
        OooOOO0.OooO0oO(typeParameterOwner, "typeParameterOwner");
        this.f123644OooO00o = c;
        this.f123645OooO0O0 = interfaceC32599OooOO0o;
        this.f123646OooO0OO = i;
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.f123647OooO0Oo = linkedHashMap;
        this.f123648OooO0o0 = this.f123644OooO00o.f123639OooO00o.f123606OooO00o.OooO0o0(new C24293OooooOO(this, 1));
    }

    @Override // oOo00OOo.InterfaceC34501OooOO0
    public final InterfaceC32637OoooOoo OooO00o(OooOo javaTypeParameter) {
        OooOOO0.OooO0oO(javaTypeParameter, "javaTypeParameter");
        C32813Oooo000 c32813Oooo000Invoke = this.f123648OooO0o0.invoke(javaTypeParameter);
        return c32813Oooo000Invoke != null ? c32813Oooo000Invoke : this.f123644OooO00o.f123640OooO0O0.OooO00o(javaTypeParameter);
    }
}
