package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.ColorSetEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34737OoooOOO extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C34738OoooOOo f125071OooO00o;

    public C34737OoooOOO(C34738OoooOOo c34738OoooOOo) {
        this.f125071OooO00o = c34738OoooOOo;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `ColorSetEntity` SET `id` = ?,`name` = ?,`colors` = ?,`bg_color` = ?,`fg_color` = ?,`type` = ?,`creation_time` = ?,`category` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
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
        String strColorsToString = this.f125071OooO00o.f125074OooO0OO.colorsToString(colorSetEntity.getColors());
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
        if (colorSetEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(9);
        } else {
            interfaceC24749OooO0Oo.o000000O(9, colorSetEntity.getId());
        }
    }
}
