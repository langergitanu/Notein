package o0o000OO;

import android.graphics.RectF;
import com.orion.notein.domain.models.page.Quote;
import java.util.Comparator;
import java.util.Map;
import o0o00ooo.C30171OooOooO;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooOOO0 implements Comparator {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f105566OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105567OooOo0o;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f105567OooOo0o = i;
        this.f105566OooOo = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f105567OooOo0o) {
            case 0:
                Quote quote = (Quote) obj;
                Quote quote2 = (Quote) obj2;
                String pageId = quote.getPageId();
                Map map = (Map) this.f105566OooOo;
                Integer num = (Integer) map.get(pageId);
                int iIntValue = num != null ? num.intValue() : -1;
                Integer num2 = (Integer) map.get(quote2.getPageId());
                int iIntValue2 = num2 != null ? num2.intValue() : -1;
                if (iIntValue != iIntValue2) {
                    return kotlin.jvm.internal.OooOOO0.OooO(iIntValue, iIntValue2);
                }
                RectF boundingBox = quote.getBoundingBox(1.0f);
                RectF boundingBox2 = quote2.getBoundingBox(1.0f);
                float f = boundingBox.top;
                float f2 = boundingBox2.top;
                if (f != f2) {
                    return Float.compare(f, f2);
                }
                float f3 = boundingBox.left;
                float f4 = boundingBox2.left;
                return f3 == f4 ? kotlin.jvm.internal.OooOOO0.OooOO0(quote2.creationTime, quote.creationTime) : Float.compare(f3, f4);
            default:
                return ((Number) ((C30171OooOooO) this.f105566OooOo).invoke(obj, obj2)).intValue();
        }
    }
}
