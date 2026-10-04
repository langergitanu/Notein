package o0O0oooo;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.data.p602db.entity.LabelEntity;
import com.orion.penkit.models.DrawRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33584OooO0o;
import oO0o0O0o.C33587OooO0oo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0O0oooo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26378OooOo0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90499OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90500OooOo0o;

    public /* synthetic */ C26378OooOo0O(Object obj, int i) {
        this.f90500OooOo0o = i;
        this.f90499OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f90500OooOo0o) {
            case 0:
                DrawRecord record = (DrawRecord) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(record, "record");
                ArrayList arrayList = (ArrayList) this.f90499OooOo;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((DrawRecord) it.next()).getId());
                }
                return Boolean.valueOf(arrayList2.contains(record.getId()));
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                C33587OooO0oo c33587OooO0oo = C33587OooO0oo.this;
                Matcher matcher = c33587OooO0oo.f121257OooO00o;
                oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(matcher.start(iIntValue), matcher.end(iIntValue));
                if (OooO2.f116812OooOo0o < 0) {
                    return null;
                }
                String strGroup = c33587OooO0oo.f121257OooO00o.group(iIntValue);
                kotlin.jvm.internal.OooOOO0.OooO0o(strGroup, "group(...)");
                return new C33584OooO0o(strGroup, OooO2);
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM labels WHERE name = ?");
                String str = (String) this.f90499OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "name");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "color");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "createdTime");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "modifiedTime");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, FirebaseAnalytics.Param.INDEX);
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        labelEntity = new LabelEntity(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return labelEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
