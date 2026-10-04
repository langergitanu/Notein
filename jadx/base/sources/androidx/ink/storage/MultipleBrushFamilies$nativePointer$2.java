package androidx.ink.storage;

import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C24019OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* synthetic */ class MultipleBrushFamilies$nativePointer$2 extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
    public MultipleBrushFamilies$nativePointer$2(Object obj) {
        super(1, obj, MultipleBrushFamiliesNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public /* bridge */ /* synthetic */ C32460OooOooO invoke(Long l) {
        invoke(l.longValue());
        return C32460OooOooO.f116667OooO00o;
    }

    public final void invoke(long j) {
        ((MultipleBrushFamiliesNative) this.receiver).free(j);
    }
}
