package oo0oO0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.data.p602db.entity.LatestOpenedNoteEntity;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o000OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34787o000OooO implements InterfaceC32507OooOO0o {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM LatestOpenedNoteEntity");
        try {
            int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
            int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, FirebaseAnalytics.Param.INDEX);
            ArrayList arrayList = new ArrayList();
            while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                arrayList.add(new LatestOpenedNoteEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2)));
            }
            return arrayList;
        } finally {
            interfaceC24749OooO0OoO0ooOOo.close();
        }
    }
}
