package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
class wb5 extends AbstractC14611u0<IPictureFillFormat, wb5> {

    /* JADX INFO: renamed from: k4 */
    public static final wb5 f49783k4 = new wb5();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IPictureFillFormat iPictureFillFormat) {
        return C14064he.m66708k4(iPictureFillFormat.getStretchOffsetBottom()) + ((C14064he.m66708k4(iPictureFillFormat.getStretchOffsetRight()) + ((C14064he.m66708k4(iPictureFillFormat.getStretchOffsetTop()) + ((C14064he.m66708k4(iPictureFillFormat.getStretchOffsetLeft()) + ((C14064he.m66708k4(iPictureFillFormat.getCropBottom()) + ((C14064he.m66708k4(iPictureFillFormat.getCropRight()) + ((C14064he.m66708k4(iPictureFillFormat.getCropTop()) + ((C14064he.m66708k4(iPictureFillFormat.getCropLeft()) + ((((C14042ak.m66409k4(iPictureFillFormat.getPictureFillMode()) - 324743029) * 486187739) + jqo.f45543k4.m71465x1(iPictureFillFormat.getPicture())) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739);
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IPictureFillFormat iPictureFillFormat, IPictureFillFormat iPictureFillFormat2) {
        return iPictureFillFormat.getDpi() == iPictureFillFormat2.getDpi() && iPictureFillFormat.getPictureFillMode() == iPictureFillFormat2.getPictureFillMode() && C3085sv.m13089k4(iPictureFillFormat.getCropLeft(), iPictureFillFormat2.getCropLeft()) && C3085sv.m13089k4(iPictureFillFormat.getCropTop(), iPictureFillFormat2.getCropTop()) && C3085sv.m13089k4(iPictureFillFormat.getCropRight(), iPictureFillFormat2.getCropRight()) && C3085sv.m13089k4(iPictureFillFormat.getCropBottom(), iPictureFillFormat2.getCropBottom()) && C3085sv.m13089k4(iPictureFillFormat.getStretchOffsetLeft(), iPictureFillFormat2.getStretchOffsetLeft()) && C3085sv.m13089k4(iPictureFillFormat.getStretchOffsetTop(), iPictureFillFormat2.getStretchOffsetTop()) && C3085sv.m13089k4(iPictureFillFormat.getStretchOffsetRight(), iPictureFillFormat2.getStretchOffsetRight()) && C3085sv.m13089k4(iPictureFillFormat.getStretchOffsetBottom(), iPictureFillFormat2.getStretchOffsetBottom()) && jqo.f45543k4.equals(iPictureFillFormat.getPicture(), iPictureFillFormat2.getPicture());
    }
}
