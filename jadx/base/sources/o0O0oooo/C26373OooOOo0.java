package o0O0oooo;

import com.orion.penkit.models.InkStrokeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0oO00.C34001o0ooOO0;
import oOo000Oo.C34428OooOOo;
import oo0oO0.AbstractC34903o00o0OoO;
import oo0oO0.C34923o00oOO;

/* JADX INFO: renamed from: o0O0oooo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26373OooOOo0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90493OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90494OooOo0o;

    public /* synthetic */ C26373OooOOo0(Object obj, int i) {
        this.f90494OooOo0o = i;
        this.f90493OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f90494OooOo0o) {
            case 0:
                InkStrokeInfo record = (InkStrokeInfo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(record, "record");
                ArrayList arrayList = (ArrayList) this.f90493OooOo;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((InkStrokeInfo) it.next()).getId());
                }
                return Boolean.valueOf(arrayList2.contains(record.getId()));
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                C34001o0ooOO0 c34001o0ooOO0 = (C34001o0ooOO0) this.f90493OooOo;
                sb.append(c34001o0ooOO0.f122285OooO0o0[iIntValue]);
                sb.append(": ");
                sb.append(c34001o0ooOO0.OooO0Oo(iIntValue).OooO0oo());
                return sb.toString();
            case 2:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM ImageEntity WHERE page_id = ?");
                String str = (String) this.f90493OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            default:
                C34923o00oOO c34923o00oOO = (C34923o00oOO) this.f90493OooOo;
                c34923o00oOO.getClass();
                return AbstractC34903o00o0OoO.OooO(c34923o00oOO, (Continuation) obj);
        }
    }
}
