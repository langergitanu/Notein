package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.TextBoxEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o0O00o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34986o0O00o0o extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        TextBoxEntity textBoxEntity = (TextBoxEntity) obj;
        if (textBoxEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, textBoxEntity.getId());
        }
        if (textBoxEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, textBoxEntity.getPageId());
        }
        if (textBoxEntity.getText() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, textBoxEntity.getText());
        }
        interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getTextSize(), 4);
        interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getBoxWidth(), 5);
        interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getBoxHeight(), 6);
        interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getLineHeight(), 7);
        interfaceC24749OooO0Oo.OooO0o(8, textBoxEntity.getBackgroundColor());
        if (textBoxEntity.getBoundsJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(9);
        } else {
            interfaceC24749OooO0Oo.o000000O(9, textBoxEntity.getBoundsJson());
        }
        interfaceC24749OooO0Oo.OooO0o(10, textBoxEntity.getLayer());
        if (textBoxEntity.getLayerId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(11);
        } else {
            interfaceC24749OooO0Oo.o000000O(11, textBoxEntity.getLayerId());
        }
        interfaceC24749OooO0Oo.OooO0o(12, textBoxEntity.getDefaultTextColor());
        interfaceC24749OooO0Oo.OooO0o(13, textBoxEntity.getCreationTime());
        if (textBoxEntity.getLocalTransformJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(14);
        } else {
            interfaceC24749OooO0Oo.o000000O(14, textBoxEntity.getLocalTransformJson());
        }
        if (textBoxEntity.getLeft() == null) {
            interfaceC24749OooO0Oo.OooO0oO(15);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getLeft().floatValue(), 15);
        }
        if (textBoxEntity.getTop() == null) {
            interfaceC24749OooO0Oo.OooO0oO(16);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getTop().floatValue(), 16);
        }
        if (textBoxEntity.getRight() == null) {
            interfaceC24749OooO0Oo.OooO0oO(17);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getRight().floatValue(), 17);
        }
        if (textBoxEntity.getBottom() == null) {
            interfaceC24749OooO0Oo.OooO0oO(18);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getBottom().floatValue(), 18);
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR IGNORE INTO `TextBoxEntity` (`id`,`page_id`,`text`,`text_size`,`box_width`,`box_height`,`line_height`,`background_color`,`bounds`,`layer`,`layer_id`,`default_text_color`,`creation_time`,`local_transform_json`,`left`,`top`,`right`,`bottom`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
