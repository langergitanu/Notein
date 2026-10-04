package oO0O0ooo;

import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0Ooo.AbstractC33320OooOoo;

/* JADX INFO: renamed from: oO0O0ooo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32870OooOOo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<oO0O0OO.OooO0O0, AbstractC33320OooOoo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32641OooooOO f117957OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32870OooOOo(InterfaceC32641OooooOO interfaceC32641OooooOO) {
        super(1);
        this.f117957OooOo0o = interfaceC32641OooooOO;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final AbstractC33320OooOoo invoke(oO0O0OO.OooO0O0 oooO0O0) {
        oO0O0OO.OooO0O0 it = oooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        AbstractC33320OooOoo type = it.OooO0o().get(this.f117957OooOo0o.getIndex()).getType();
        kotlin.jvm.internal.OooOOO0.OooO0o(type, "it.valueParameters[p.index].type");
        return type;
    }
}
