package o000oo0o;

import androidx.room.C22081OooO0o0;
import java.util.Arrays;
import o000oo0.AbstractC24673OooOo0O;
import o000oo0.C24664OooOO0O;
import o000oo0.C24695OoooO00;
import o000oo0.C24696OoooO0O;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0Oo.C33746OooOooo;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0OoO.C33800OooOO0o;

/* JADX INFO: renamed from: o000oo0o.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24720OooOOO0 {
    public static final C24718OooOO0o OooO00o(AbstractC24673OooOo0O db, String[] strArr, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        int i = 0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(db, "db");
        androidx.room.OooO0OO oooO0OOOooOO0 = db.OooOO0();
        String[] tables = (String[]) Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.OooOOO0.OooO0oO(tables, "tables");
        C24695OoooO00 c24695OoooO00 = oooO0OOOooOO0.f66184OooO0OO;
        C32443OooOOO<String[], int[]> c32443OooOOOOooO0oO = c24695OoooO00.OooO0oO(tables);
        String[] resolvedTableNames = c32443OooOOOOooO0oO.f116638OooOo0o;
        int[] tableIds = c32443OooOOOOooO0oO.f116637OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(resolvedTableNames, "resolvedTableNames");
        kotlin.jvm.internal.OooOOO0.OooO0oO(tableIds, "tableIds");
        InterfaceC33721OooO0o c33770OooooO0 = new C33770OooooO0(new C24696OoooO0O(c24695OoooO00, tableIds, resolvedTableNames, null));
        C22081OooO0o0 c22081OooO0o0 = oooO0OOOooOO0.f66190OooOO0;
        C24664OooOO0O c24664OooOO0O = c22081OooO0o0 != null ? new C24664OooOO0O(c22081OooO0o0.f66209OooO0oo, resolvedTableNames, i) : null;
        if (c24664OooOO0O != null) {
            InterfaceC33721OooO0o[] interfaceC33721OooO0oArr = {c33770OooooO0, c24664OooOO0O};
            int i2 = C33746OooOooo.f121652OooO00o;
            c33770OooooO0 = new C33800OooOO0o(oOo000Oo.OooOOO.OooOo0o(interfaceC33721OooO0oArr), oOo0000O.OooO.f123416OooOo0o, -2, EnumC33692OooO0OO.f121452OooOo0o);
        }
        return new C24718OooOO0o(C25252OooO0Oo.OooO0Oo(c33770OooooO0, -1), db, interfaceC32507OooOO0o);
    }
}
