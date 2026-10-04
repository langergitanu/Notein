package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class jqo extends AbstractC14611u0<ISlidesPicture, jqo> {

    /* JADX INFO: renamed from: k4 */
    public static final jqo f45543k4 = new jqo();

    /* JADX INFO: renamed from: k4 */
    private int m63495k4(IImageTransformOperationCollection iImageTransformOperationCollection) {
        if (iImageTransformOperationCollection == null) {
            return 0;
        }
        int iHashCode = 17;
        for (int i = 0; i < iImageTransformOperationCollection.size(); i++) {
            iHashCode = (iHashCode * 486187739) + iImageTransformOperationCollection.get_Item(i).hashCode();
        }
        return iHashCode;
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(ISlidesPicture iSlidesPicture) {
        return ((((AbstractC14611u0.m71464kk(iSlidesPicture.getImage()) - 324743029) * 486187739) + AbstractC14611u0.m71464kk(iSlidesPicture.getLinkPathLong())) * 486187739) + m63495k4(iSlidesPicture.getImageTransform());
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m63496k4(IImageTransformOperationCollection iImageTransformOperationCollection, IImageTransformOperationCollection iImageTransformOperationCollection2) {
        if (iImageTransformOperationCollection == null && iImageTransformOperationCollection2 == null) {
            return true;
        }
        if (((iImageTransformOperationCollection == null) || (iImageTransformOperationCollection2 == null)) || iImageTransformOperationCollection.size() != iImageTransformOperationCollection2.size()) {
            return false;
        }
        for (int i = 0; i < iImageTransformOperationCollection.size(); i++) {
            if (!C3085sv.m13090k4(iImageTransformOperationCollection.get_Item(i), iImageTransformOperationCollection2.get_Item(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(ISlidesPicture iSlidesPicture, ISlidesPicture iSlidesPicture2) {
        return C14067j2.m66729x1(iSlidesPicture.getImage(), iSlidesPicture2.getImage()) && C14113y2.m67363du(iSlidesPicture.getLinkPathLong(), iSlidesPicture2.getLinkPathLong()) && m63496k4(iSlidesPicture.getImageTransform(), iSlidesPicture2.getImageTransform());
    }
}
