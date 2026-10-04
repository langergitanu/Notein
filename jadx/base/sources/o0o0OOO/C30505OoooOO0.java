package o0o0OOO;

import com.orion.notein.domain.models.papertheme.PaperColors;
import java.util.Map;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0o0OOO.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30505OoooOO0 implements InterfaceC32508OooOOOo {
    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        num.intValue();
        Map categoryIdToPageColorMap = (Map) obj2;
        Object obj3 = C30520o000000o.f108997ooOO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(categoryIdToPageColorMap, "categoryIdToPageColorMap");
        Integer num2 = (Integer) categoryIdToPageColorMap.get(num);
        return Integer.valueOf(num2 != null ? num2.intValue() : PaperColors.INSTANCE.getCOLOR_01());
    }
}
