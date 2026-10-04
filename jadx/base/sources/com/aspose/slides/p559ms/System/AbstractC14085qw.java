package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.NotImplementedException;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.qw */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14085qw extends AbstractC14115yd {
    public static boolean op_Equality(AbstractC14085qw abstractC14085qw, AbstractC14085qw abstractC14085qw2) {
        if (abstractC14085qw == null) {
            return abstractC14085qw2 == null;
        }
        String delegateId = abstractC14085qw.getDelegateId();
        return (delegateId == null || abstractC14085qw2 == null || abstractC14085qw2.getDelegateId() == null) ? abstractC14085qw.equals(abstractC14085qw2) : delegateId.equals(abstractC14085qw2.getDelegateId());
    }

    public static boolean op_Inequality(AbstractC14085qw abstractC14085qw, AbstractC14085qw abstractC14085qw2) {
        if (abstractC14085qw == null) {
            return abstractC14085qw2 != null;
        }
        return (abstractC14085qw.getDelegateId() == null || abstractC14085qw2 == null || abstractC14085qw2.getDelegateId() == null) ? !abstractC14085qw.equals(abstractC14085qw2) : !r1.equals(abstractC14085qw2.getDelegateId());
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14115yd
    public AbstractC14115yd combineImpl(AbstractC14115yd abstractC14115yd) {
        throw new NotImplementedException();
    }

    public String getDelegateId() {
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14115yd
    public final AbstractC14115yd[] getInvocationList() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14115yd
    public final AbstractC14115yd removeImpl(AbstractC14115yd abstractC14115yd) {
        throw new NotImplementedException();
    }
}
