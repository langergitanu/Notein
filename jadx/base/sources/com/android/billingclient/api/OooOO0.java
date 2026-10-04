package com.android.billingclient.api;

import com.orion.notein.p607ui.export.ExportRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0Oo0.C32705Ooooo00;
import oO0O0oo0.C32811OooOooO;
import oO0OOOo.C32982OooO;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33479OooO0o;
import oO0o.C33524OooO0O0;
import oO0o.InterfaceC33531OooO0o0;
import oO0oO00.o000000;
import oOo000Oo.C34428OooOOo;
import oOo0oooO.InterfaceC34588OooO0oO;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f66942OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f66943OooO0O0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList OooO00o(List list, Collection oldValueParameters, InterfaceC32609OooOo0 interfaceC32609OooOo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oldValueParameters, "oldValueParameters");
        list.size();
        oldValueParameters.size();
        ArrayList<C32443OooOOO> arrayListO000OOo = oOo000Oo.OooOo.o000OOo(list, oldValueParameters);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListO000OOo, 10));
        for (C32443OooOOO c32443OooOOO : arrayListO000OOo) {
            AbstractC33320OooOoo abstractC33320OooOoo = (AbstractC33320OooOoo) c32443OooOOO.f116638OooOo0o;
            InterfaceC32641OooooOO interfaceC32641OooooOO = (InterfaceC32641OooooOO) c32443OooOOO.f116637OooOo;
            int index = interfaceC32641OooooOO.getIndex();
            InterfaceC34588OooO0oO annotations = interfaceC32641OooooOO.getAnnotations();
            C33479OooO0o name = interfaceC32641OooooOO.getName();
            kotlin.jvm.internal.OooOOO0.OooO0o(name, "oldParameter.name");
            boolean zOooo0o = interfaceC32641OooooOO.Oooo0o();
            boolean zO00oO0O = interfaceC32641OooooOO.o00oO0O();
            boolean zOo000o = interfaceC32641OooooOO.oo000o();
            AbstractC33320OooOoo abstractC33320OooOooOooO0o = interfaceC32641OooooOO.o0ooOoO() != null ? C33194OooO0O0.OooOO0(interfaceC32609OooOo0).OooOO0O().OooO0o(abstractC33320OooOoo) : null;
            oO0O0OO.o000oOoO source = interfaceC32641OooooOO.getSource();
            kotlin.jvm.internal.OooOOO0.OooO0o(source, "oldParameter.source");
            arrayList.add(new C32705Ooooo00(interfaceC32609OooOo0, null, index, annotations, name, abstractC33320OooOoo, zOooo0o, zO00oO0O, zOo000o, abstractC33320OooOooOooO0o, source));
        }
        return arrayList;
    }

    public static final int OooO0O0(ExportRequest exportRequest) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(exportRequest, "<this>");
        if (exportRequest instanceof ExportRequest.NoteExport) {
            return 0;
        }
        if (exportRequest instanceof ExportRequest.PageExport) {
            return 1;
        }
        throw new C32442OooOO0o();
    }

    public static final InterfaceC34595OooO0Oo OooO0OO(InterfaceC33531OooO0o0 interfaceC33531OooO0o0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33531OooO0o0, "<this>");
        if (interfaceC33531OooO0o0 instanceof C33524OooO0O0) {
            return ((C33524OooO0O0) interfaceC33531OooO0o0).f121101OooO0O0;
        }
        if (interfaceC33531OooO0o0 instanceof o000000) {
            return OooO0OO(((o000000) interfaceC33531OooO0o0).f122224OooO00o);
        }
        return null;
    }

    public static final C32811OooOooO OooO0Oo(InterfaceC32596OooO0o0 interfaceC32596OooO0o0) {
        InterfaceC32596OooO0o0 interfaceC32596OooO0o02;
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32596OooO0o0, "<this>");
        int i = C33194OooO0O0.f120130OooO00o;
        Iterator<AbstractC33320OooOoo> it = interfaceC32596OooO0o0.OooOOO().o00000().OooO0Oo().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC32596OooO0o02 = null;
                break;
            }
            AbstractC33320OooOoo next = it.next();
            if (!oO0O0O0o.OooOO0.OooOo0o(next)) {
                interfaceC32598OooO0ooOooO0OO = next.o00000().OooO0OO();
                if (C32982OooO.OooOOO(interfaceC32598OooO0ooOooO0OO, oO0O0OO.OooO0o.f117230OooOo0o) || C32982OooO.OooOOO(interfaceC32598OooO0ooOooO0OO, oO0O0OO.OooO0o.f117232OooOoO0)) {
                    break;
                }
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC32598OooO0ooOooO0OO, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        interfaceC32596OooO0o02 = (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO;
        if (interfaceC32596OooO0o02 == null) {
            return null;
        }
        oO0Oo0o0.OooOO0 oooOO0O00Ooo = interfaceC32596OooO0o02.o00Ooo();
        C32811OooOooO c32811OooOooO = oooOO0O00Ooo instanceof C32811OooOooO ? (C32811OooOooO) oooOO0O00Ooo : null;
        return c32811OooOooO == null ? OooO0Oo(interfaceC32596OooO0o02) : c32811OooOooO;
    }
}
