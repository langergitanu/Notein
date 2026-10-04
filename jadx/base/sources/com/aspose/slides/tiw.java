package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
class tiw extends AbstractC14611u0<IPresetShadow, tiw> {

    /* JADX INFO: renamed from: k4 */
    public static final tiw f49160k4 = new tiw();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IPresetShadow iPresetShadow) {
        return C14042ak.m66409k4(iPresetShadow.getPreset()) + ((((C14044b3.m66429k4(iPresetShadow.getDistance()) + ((C14064he.m66708k4(iPresetShadow.getDirection()) - 324743029) * 486187739)) * 486187739) + C14767x7.f50002k4.m71465x1(iPresetShadow.getShadowColor())) * 486187739);
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IPresetShadow iPresetShadow, IPresetShadow iPresetShadow2) {
        return C3085sv.m13089k4(iPresetShadow.getDirection(), iPresetShadow2.getDirection()) && C3085sv.m13088k4(iPresetShadow.getDistance(), iPresetShadow2.getDistance()) && iPresetShadow.getPreset() == iPresetShadow2.getPreset() && C14767x7.f50002k4.equals(iPresetShadow.getShadowColor(), iPresetShadow2.getShadowColor());
    }
}
