package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.PenInfoConverter;
import com.orion.notein.data.p602db.entity.PenInfoEntity;
import java.util.List;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00oo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34951o00oo0o0 extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C34950o00oo0o f125555OooOo0o;

    public C34951o00oo0o0(C34950o00oo0o c34950o00oo0o) {
        this.f125555OooOo0o = c34950o00oo0o;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        PenInfoEntity penInfoEntity = (PenInfoEntity) obj;
        if (penInfoEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, penInfoEntity.getId());
        }
        interfaceC24749OooO0Oo.OooO0o(2, penInfoEntity.getType());
        interfaceC24749OooO0Oo.OooO0o(3, penInfoEntity.getColorIndex());
        interfaceC24749OooO0Oo.OooO0o(4, penInfoEntity.getWidthIndex());
        C34950o00oo0o c34950o00oo0o = this.f125555OooOo0o;
        String strColorListToString = c34950o00oo0o.f125554OooO0OO.colorListToString(penInfoEntity.getColorList());
        if (strColorListToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, strColorListToString);
        }
        List<Float> widthList = penInfoEntity.getWidthList();
        PenInfoConverter penInfoConverter = c34950o00oo0o.f125554OooO0OO;
        String strWidthListToString = penInfoConverter.widthListToString(widthList);
        if (strWidthListToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, strWidthListToString);
        }
        if (penInfoEntity.getNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, penInfoEntity.getNoteId());
        }
        interfaceC24749OooO0Oo.OooO0o(8, penInfoEntity.getSelected() ? 1L : 0L);
        String strExtraToString = penInfoConverter.extraToString(penInfoEntity.getExtra());
        if (strExtraToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(9);
        } else {
            interfaceC24749OooO0Oo.o000000O(9, strExtraToString);
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `PenInfoEntity` (`id`,`type`,`color_index`,`width_index`,`color_list`,`width_list`,`note_id`,`selected`,`extra`) VALUES (?,?,?,?,?,?,?,?,?)";
    }
}
