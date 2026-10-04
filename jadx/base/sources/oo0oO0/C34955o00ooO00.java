package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.orion.notein.data.p602db.PlayFlavorDatabase_Impl;
import com.orion.notein.data.p602db.entity.PlayPurchaseServerEntity;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o00OOooo.C25022OooO0O0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00ooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34955o00ooO00 implements InterfaceC34952o00oo0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PlayFlavorDatabase_Impl f125558OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34942o00oo f125559OooO0O0 = new C34942o00oo();

    public C34955o00ooO00(PlayFlavorDatabase_Impl playFlavorDatabase_Impl) {
        this.f125558OooO00o = playFlavorDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34952o00oo0oO
    public final int OooO00o(ArrayList arrayList) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("SELECT COUNT(*) FROM PlayPurchaseServerEntity WHERE purchase_token in (");
        C25022OooO0O0.OooO0OO(arrayList.size(), sbOooO0OO);
        sbOooO0OO.append(")");
        return ((Integer) C24734OooO0O0.OooO0o(this.f125558OooO00o, true, false, new C34799o000o0oO(1, sbOooO0OO.toString(), arrayList))).intValue();
    }

    @Override // oo0oO0.InterfaceC34952o00oo0oO
    public final List<PlayPurchaseServerEntity> OooO0O0(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125558OooO00o, true, false, new C34805o000oo00(str, 1));
    }

    @Override // oo0oO0.InterfaceC34952o00oo0oO
    public final C24718OooOO0o OooO0OO(String str) {
        o0OoO000.o00oO0O o00oo0o = new o0OoO000.o00oO0O(str, 1);
        return C24720OooOOO0.OooO00o(this.f125558OooO00o, new String[]{"PlayPurchaseServerEntity"}, o00oo0o);
    }

    @Override // oo0oO0.InterfaceC34952o00oo0oO
    public final Object OooO0Oo(final PlayPurchaseServerEntity[] playPurchaseServerEntityArr, AbstractC32476OooO abstractC32476OooO) {
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125558OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0O0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125634OooOo0o.f125559OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, playPurchaseServerEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }
}
