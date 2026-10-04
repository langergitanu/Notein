package com.aspose.slides.internal.p097e0;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.kk */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3523kk implements InterfaceC1870up<Character>, InterfaceC14059g8, Cloneable {
    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        return m14307h4();
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public final Character mo9760kk() {
        return Character.valueOf(mo14069to());
    }

    /* JADX INFO: renamed from: h4 */
    public Object m14307h4() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: k4 */
    public void mo9758k4() {
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: to */
    public abstract char mo14069to();

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo9764x1();

    /* JADX INFO: renamed from: k4 */
    public void mo14067k4(char c) {
    }
}
