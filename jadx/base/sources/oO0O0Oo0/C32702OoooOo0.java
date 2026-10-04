package oO0O0Oo0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32595OooO0Oo;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.OooO0O0;
import oO0OoOO.C33279OooOOOo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.C33356ooOO;
import oO0Ooo0.C33361OooO0Oo;
import oOo000Oo.C34428OooOOo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32702OoooOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32701OoooOOo> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32595OooO0Oo f117580OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32701OoooOOo f117581OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32702OoooOo0(C32701OoooOOo c32701OoooOOo, InterfaceC32595OooO0Oo interfaceC32595OooO0Oo) {
        super(0);
        this.f117581OooOo0o = c32701OoooOOo;
        this.f117580OooOo = interfaceC32595OooO0Oo;
    }

    @Override // oO0O000o.OooO00o
    public final C32701OoooOOo invoke() {
        C32701OoooOOo c32701OoooOOo = this.f117581OooOo0o;
        C33361OooO0Oo c33361OooO0Oo = c32701OoooOOo.f117576OoooOoo;
        InterfaceC32595OooO0Oo interfaceC32595OooO0Oo = this.f117580OooOo;
        InterfaceC34588OooO0oO annotations = interfaceC32595OooO0Oo.getAnnotations();
        OooO0O0.OooO00o kind = interfaceC32595OooO0Oo.getKind();
        kotlin.jvm.internal.OooOOO0.OooO0o(kind, "underlyingConstructorDescriptor.kind");
        C33279OooOOOo c33279OooOOOo = c32701OoooOOo.f117577Ooooo00;
        oO0O0OO.o000oOoO source = c33279OooOOOo.getSource();
        kotlin.jvm.internal.OooOOO0.OooO0o(source, "typeAliasDescriptor.source");
        C32701OoooOOo c32701OoooOOo2 = new C32701OoooOOo(c33361OooO0Oo, c32701OoooOOo.f117577Ooooo00, interfaceC32595OooO0Oo, c32701OoooOOo, annotations, kind, source);
        C32701OoooOOo.f117574OooooOO.getClass();
        C33356ooOO c33356ooOOOooO0Oo = c33279OooOOOo.OooO0oo() == null ? null : C33356ooOO.OooO0Oo(c33279OooOOOo.o000oOoO());
        if (c33356ooOOOooO0Oo == null) {
            return null;
        }
        InterfaceC32629OoooO0 interfaceC32629OoooO0OoooOo0 = interfaceC32595OooO0Oo.OoooOo0();
        OooO0o oooO0oOooO0O0 = interfaceC32629OoooO0OoooOo0 != null ? interfaceC32629OoooO0OoooOo0.OooO0O0(c33356ooOOOooO0Oo) : null;
        List<InterfaceC32629OoooO0> listO0OOO0o = interfaceC32595OooO0Oo.o0OOO0o();
        kotlin.jvm.internal.OooOOO0.OooO0o(listO0OOO0o, "underlyingConstructorDes…contextReceiverParameters");
        List<InterfaceC32629OoooO0> list = listO0OOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC32629OoooO0) it.next()).OooO0O0(c33356ooOOOooO0Oo));
        }
        List<InterfaceC32637OoooOoo> listOooOOOO = c33279OooOOOo.OooOOOO();
        List<InterfaceC32641OooooOO> listOooO0o = c32701OoooOOo.OooO0o();
        AbstractC33320OooOoo abstractC33320OooOoo = c32701OoooOOo.f117441OooOoo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC33320OooOoo);
        c32701OoooOOo2.o00000O(null, oooO0oOooO0O0, arrayList, listOooOOOO, listOooO0o, abstractC33320OooOoo, EnumC32614OooOoOO.f117261OooOo0o, c33279OooOOOo.f117394OooOoOO);
        return c32701OoooOOo2;
    }
}
