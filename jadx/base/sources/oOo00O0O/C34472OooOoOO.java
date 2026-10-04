package oOo00O0O;

import java.util.ArrayList;
import java.util.Map;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;
import ooOOoOO0.C35142Oooo0o;

/* JADX INFO: renamed from: oOo00O0O.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C34472OooOoOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f123532OooOo0o;

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f123532OooOo0o) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(entry, "<destruct>");
                String str = (String) entry.getKey();
                OooOO0O oooOO0O = (OooOO0O) entry.getValue();
                StringBuilder sb = new StringBuilder();
                C35142Oooo0o.OooO00o(str, sb);
                sb.append(':');
                sb.append(oooOO0O);
                String string = sb.toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                return string;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT layer_id FROM StrokeEntity");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(0));
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}
