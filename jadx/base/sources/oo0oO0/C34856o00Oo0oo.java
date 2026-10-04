package oo0oO0;

import com.orion.notein.data.p602db.PlayFlavorDatabase_Impl;
import com.orion.notein.data.p602db.entity.NoteinGoogleDeveloperOfferEntity;
import com.orion.notein.data.p602db.entity.UpdateOfferStatusEntity;
import java.util.List;
import o000ooOO.C24734OooO0O0;
import o0ooOOO0.C31622OooO0O0;

/* JADX INFO: renamed from: oo0oO0.o00Oo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34856o00Oo0oo implements InterfaceC34854o00Oo0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PlayFlavorDatabase_Impl f125358OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34853o00Oo0o f125359OooO0O0 = new C34853o00Oo0o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34855o00Oo0oO f125360OooO0OO = new C34855o00Oo0oO();

    public C34856o00Oo0oo(PlayFlavorDatabase_Impl playFlavorDatabase_Impl) {
        this.f125358OooO00o = playFlavorDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34854o00Oo0o0
    public final Object OooO00o(NoteinGoogleDeveloperOfferEntity[] noteinGoogleDeveloperOfferEntityArr, com.orion.notein.data.repo.transactions.o0OoOo0 o0oooo02) {
        noteinGoogleDeveloperOfferEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(o0oooo02, this.f125358OooO00o, new C34741OoooOoo(this, noteinGoogleDeveloperOfferEntityArr, 1), false, true);
    }

    @Override // oo0oO0.InterfaceC34854o00Oo0o0
    public final List<NoteinGoogleDeveloperOfferEntity> OooO0O0(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125358OooO00o, true, false, new C31622OooO0O0(str, 1));
    }

    @Override // oo0oO0.InterfaceC34854o00Oo0o0
    public final Object OooO0OO(UpdateOfferStatusEntity updateOfferStatusEntity, com.orion.notein.data.repo.transactions.o00O0O o00o0o2) {
        return C24734OooO0O0.OooO0oo(o00o0o2, this.f125358OooO00o, new C34740OoooOoO(1, this, updateOfferStatusEntity), false, true);
    }
}
