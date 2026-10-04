package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.ColorSetEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o000oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34801o000oOoO extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C34738OoooOOo f125221OooOo0o;

    public C34801o000oOoO(C34738OoooOOo c34738OoooOOo) {
        this.f125221OooOo0o = c34738OoooOOo;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        ColorSetEntity colorSetEntity = (ColorSetEntity) obj;
        if (colorSetEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, colorSetEntity.getId());
        }
        if (colorSetEntity.getName() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, colorSetEntity.getName());
        }
        String strColorsToString = this.f125221OooOo0o.f125074OooO0OO.colorsToString(colorSetEntity.getColors());
        if (strColorsToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, strColorsToString);
        }
        interfaceC24749OooO0Oo.OooO0o(4, colorSetEntity.getBackgroundColor());
        interfaceC24749OooO0Oo.OooO0o(5, colorSetEntity.getForegroundColor());
        interfaceC24749OooO0Oo.OooO0o(6, colorSetEntity.getType());
        interfaceC24749OooO0Oo.OooO0o(7, colorSetEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(8, colorSetEntity.getCategory());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `ColorSetEntity` (`id`,`name`,`colors`,`bg_color`,`fg_color`,`type`,`creation_time`,`category`) VALUES (?,?,?,?,?,?,?,?)";
    }
}
